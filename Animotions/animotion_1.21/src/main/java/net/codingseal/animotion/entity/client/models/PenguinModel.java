package net.codingseal.animotion.entity.client.models;
import net.codingseal.animotion.Animotion;

import net.codingseal.animotion.entity.client.animations.PenguinAnimations;
import net.codingseal.animotion.entity.custom.PenguinEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class PenguinModel<T extends PenguinEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer PENGUIN = new EntityModelLayer(Identifier.of(Animotion.MOD_ID, "penguin"), "main");

    private final ModelPart root;
    private final ModelPart penguin;
    private final ModelPart upperbody;
    private final ModelPart head;

    public PenguinModel(ModelPart root) {


        this.root = root.getChild("root");
        this.penguin = this.root.getChild("penguin");
        this.upperbody = this.penguin.getChild("upperbody");
        this.head = this.upperbody.getChild("head");

    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 3.1416F, 0.0F, -3.1416F));
        ModelPartData penguin = root.addChild("penguin", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, -6.0F, -2.0F));

        ModelPartData upperbody = penguin.addChild("upperbody", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0018F, -7.0867F, -4.0F, 6.0F, 11.0F, 6.0F, new Dilation(0.0F))
                .uv(24, 13).cuboid(-1.0018F, 0.9133F, -4.0F, 2.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, 1.0F));

        ModelPartData arms = upperbody.addChild("arms", ModelPartBuilder.create(), ModelTransform.pivot(-0.0018F, -6.0867F, -2.0F));

        ModelPartData arm_right = arms.addChild("arm_right", ModelPartBuilder.create().uv(24, 0).cuboid(5.0F, -12.0F, -5.0F, 1.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 11.0F, 3.0F));

        ModelPartData arm_left = arms.addChild("arm_left", ModelPartBuilder.create().uv(20, 17).cuboid(-2.0F, -12.0F, -5.0F, 1.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 11.0F, 3.0F));

        ModelPartData head = upperbody.addChild("head", ModelPartBuilder.create().uv(0, 17).cuboid(-2.5F, -2.1207F, -2.9372F, 5.0F, 4.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.0018F, -8.8367F, -0.25F, 0.0436F, 0.0F, 0.0F));

        ModelPartData beak_r1 = head.addChild("beak_r1", ModelPartBuilder.create().uv(0, 26).cuboid(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 1.8793F, 2.3128F, -0.2182F, 0.0F, 0.0F));

        ModelPartData feet = upperbody.addChild("feet", ModelPartBuilder.create(), ModelTransform.pivot(-0.0018F, 3.9133F, 1.0F));

        ModelPartData feet_right = feet.addChild("feet_right", ModelPartBuilder.create().uv(30, 13).cuboid(-1.0F, 0.1631F, -0.0306F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 0.0F, -2.0F));

        ModelPartData feet_left = feet.addChild("feet_left", ModelPartBuilder.create().uv(12, 30).cuboid(-1.0F, 0.0298F, -0.1063F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 0.0F, -2.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(PenguinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(PenguinAnimations.IDLE,  limbSwing, limbSwingAmount, 2f, 2.5f );
        this.updateAnimation(entity.walkAnimationState, PenguinAnimations.WALK, ageInTicks);
        this.updateAnimation(entity.idleAnimationState, PenguinAnimations.IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        root.render(matrices, vertexConsumer, light, overlay, color);


    }

    @Override
    public ModelPart getPart() {
        return root;
    }
}