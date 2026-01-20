package net.codingseal.animotion.entity.custom;

import net.codingseal.animotion.entity.ModEntities;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.control.AquaticMoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.ai.pathing.SwimNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class Hammerhead_SharkEntity extends PathAwareEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public final AnimationState swimAnimationState = new AnimationState();
    private int swimAnimationTimeout = 0;


    private static final TrackedData<Integer> DATA_ID_TYPE_VARIANT =
            DataTracker.registerData(Hammerhead_SharkEntity.class, TrackedDataHandlerRegistry.INTEGER);


    public Hammerhead_SharkEntity(EntityType<? extends Hammerhead_SharkEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new AquaticMoveControl(this, 85, 10, 0.02F, 0.1F, false);
        this.setPathfindingPenalty(PathNodeType.WATER, 0.0F);
        this.setPathfindingPenalty(PathNodeType.WATER_BORDER, 0.0F);
    }
    @Override
    protected EntityNavigation createNavigation(World world) {
        return new SwimNavigation(this, world);
    }


    @Override
    public boolean isPushedByFluids() {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_COD_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_COD_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_COD_HURT;
    }


    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new MeleeAttackGoal(this, 1.2, true));
        this.goalSelector.add(2, new SwimAroundGoal(this, 1.0, 40));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 10.0F));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<>(
                this,
                PlayerEntity.class,
                10,
                true,
                false,
                player -> player != null
                        && player.isAlive()
                        && !player.isSpectator()
                        && !player.isInCreativeMode()
                        && player.isTouchingWater()
                        && player.getHealth() < player.getMaxHealth() * 0.6f
        ));
    }


    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 18)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.9)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8.0);

    }


// V0.04
private void setupAnimationStates() {

    boolean moving = this.getVelocity().horizontalLengthSquared() > 1.0E-6;

    if (moving) {
        this.idleAnimationState.stop();

        if (this.swimAnimationTimeout <= 0) {
            this.swimAnimationTimeout = 10;
            this.swimAnimationState.start(this.age);
        } else {
            --this.swimAnimationTimeout;
        }
    } else {
        this.swimAnimationState.stop();
        this.swimAnimationTimeout = 0;

        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 100;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }
}


    @Override
    public void travel(Vec3d movementInput) {
        if (this.isTouchingWater()) {
            super.travel(movementInput);
            this.setVelocity(this.getVelocity().multiply(0.9D));
            return;
        }
        super.travel(movementInput);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.isTouchingWater()) this.setAir(this.getMaxAir());
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(DATA_ID_TYPE_VARIANT, 0);
    }

    public Hammerhead_SharkVariant getVariant() {
        return Hammerhead_SharkVariant.byId(this.getTypeVariant() & 255);
    }
    private int getTypeVariant() {
        return this.dataTracker.get(DATA_ID_TYPE_VARIANT);
    }
    private void setVariant(Hammerhead_SharkVariant variant) {
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Variant", this.getTypeVariant());
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, nbt.getInt("Variant"));
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason,
                                 @Nullable EntityData entityData) {
        Hammerhead_SharkVariant variant = Util.getRandom(Hammerhead_SharkVariant.values(), this.random);
        setVariant(variant);
        return super.initialize(world, difficulty, spawnReason, entityData);
    }
}
