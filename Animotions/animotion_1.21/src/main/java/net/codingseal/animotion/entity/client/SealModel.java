package net.codingseal.animotion.entity.client;

import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.custom.SealEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class SealModel<T extends  SealEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer SEAL = new EntityModelLayer(Identifier.of(Animotion.MOD_ID, "seal"), "main");

    private final ModelPart root;
    private final ModelPart seal;
    private final ModelPart head;

    public SealModel(ModelPart root) {
        this.root = root.getChild("root");
        this.seal = this.root.getChild("seal");
        this.head = this.seal.getChild("head");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 3.1416F, 0.0F, -3.1416F));

        ModelPartData seal = root.addChild("seal", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head = seal.addChild("head", ModelPartBuilder.create().uv(58, 0).cuboid(-4.0F, -6.0F, -3.0F, 7.0F, 6.0F, 6.0F, new Dilation(0.0F))
                .uv(58, 41).cuboid(-2.0F, -3.0F, 3.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -8.0F, 10.0F));

        ModelPartData neck_r1 = head.addChild("neck_r1", ModelPartBuilder.create().uv(58, 20).cuboid(-4.0F, -2.0F, -3.0F, 7.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -1.0F, -0.4363F, 0.0F, 0.0F));

        ModelPartData upper_body = seal.addChild("upper_body", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -7.0F, -8.0F, 11.0F, 6.0F, 18.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData upper_body_r1 = upper_body.addChild("upper_body_r1", ModelPartBuilder.create().uv(0, 24).cuboid(-6.0F, -2.0F, -16.0F, 11.0F, 4.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -8.0F, 8.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData lower_body = seal.addChild("lower_body", ModelPartBuilder.create().uv(42, 46).cuboid(-7.0F, -1.0F, -28.0F, 7.0F, 4.0F, 13.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -4.0F, 8.0F));

        ModelPartData lower_body_r1 = lower_body.addChild("lower_body_r1", ModelPartBuilder.create().uv(0, 46).cuboid(-3.0F, -2.0F, -11.0F, 7.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -2.0F, -17.0F, 0.2182F, 0.0F, 0.0F));

        ModelPartData flippers = seal.addChild("flippers", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData front_flipper_right = flippers.addChild("front_flipper_right", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData front_flipper_right_r1 = front_flipper_right.addChild("front_flipper_right_r1", ModelPartBuilder.create().uv(58, 16).cuboid(-8.0F, -2.0F, -2.0F, 9.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -4.0F, 6.0F, -2.712F, 0.625F, -2.4773F));

        ModelPartData front_flipper_left = flippers.addChild("front_flipper_left", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, -2.0F, 12.0F));

        ModelPartData front_flipper_left_r1 = front_flipper_left.addChild("front_flipper_left_r1", ModelPartBuilder.create().uv(58, 12).cuboid(-8.0F, -2.0F, -1.0F, 11.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -2.0F, -6.0F, -0.3663F, 0.5553F, -0.6291F));

        ModelPartData rear_flipper_left = flippers.addChild("rear_flipper_left", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rear_flipper_left_r1 = rear_flipper_left.addChild("rear_flipper_left_r1", ModelPartBuilder.create().uv(58, 25).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -1.0F, -22.0F, 0.0085F, -0.4798F, -0.0469F));

        ModelPartData rear_flipper_right = flippers.addChild("rear_flipper_right", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rear_flipper_right_r1 = rear_flipper_right.addChild("rear_flipper_right_r1", ModelPartBuilder.create().uv(58, 33).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -1.0F, -22.0F, 0.0F, 0.5236F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }



    @Override
    public void setAngles(SealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(SealAnimations.IDLE,  limbSwing, limbSwingAmount, 2f, 2.5f );
        this.updateAnimation(entity.idleAnimationState, SealAnimations.IDLE, ageInTicks, 1f);
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
