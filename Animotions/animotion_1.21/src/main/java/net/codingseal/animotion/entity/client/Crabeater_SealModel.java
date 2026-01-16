package net.codingseal.animotion.entity.client;

import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.custom.Crabeater_SealEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;



public class Crabeater_SealModel<T extends Crabeater_SealEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer CRABEATER_SEAL = new EntityModelLayer(Identifier.of(Animotion.MOD_ID, "crabeater_seal"), "main");


    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart seal;

    public Crabeater_SealModel(ModelPart root) {
        this.root = root.getChild("root");
        this.seal = this.root.getChild("seal");
        this.head = this.seal.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 3.1416F, 0.0F, -3.1416F));
        ModelPartData seal = root.addChild("seal", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData head = seal.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, -8.0F, 10.0F));

        ModelPartData skull2 = head.addChild("skull2", ModelPartBuilder.create().uv(40, 52).cuboid(-4.0F, -6.0F, -3.0F, 7.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(54, 64).cuboid(-2.0F, -3.0F, 3.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData neck = head.addChild("neck", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData neck_r1 = neck.addChild("neck_r1", ModelPartBuilder.create().uv(42, 32).cuboid(-4.0F, -2.0F, -3.0F, 7.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -1.0F, -0.4363F, 0.0F, 0.0F));

        ModelPartData flippers = seal.addChild("flippers", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData front_flipper_right = flippers.addChild("front_flipper_right", ModelPartBuilder.create(), ModelTransform.of(3.0F, -6.0F, 0.0F, -0.1484F, -0.2007F, 0.4206F));

        ModelPartData front_flipper_right_base_1 = front_flipper_right.addChild("front_flipper_right_base_1", ModelPartBuilder.create(), ModelTransform.pivot(1.3586F, 3.0014F, -0.4647F));

        ModelPartData front_flipper_right_2_r1 = front_flipper_right_base_1.addChild("front_flipper_right_2_r1", ModelPartBuilder.create().uv(64, 32).cuboid(-3.0F, -1.0F, -1.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.9522F, -2.1674F, 0.2718F, 0.0873F, 0.0F, -0.4363F));

        ModelPartData front_flipper_right_base_2 = front_flipper_right.addChild("front_flipper_right_base_2", ModelPartBuilder.create(), ModelTransform.pivot(8.3587F, 2.0014F, 0.5353F));

        ModelPartData front_flipper_right_1_r1 = front_flipper_right_base_2.addChild("front_flipper_right_1_r1", ModelPartBuilder.create().uv(20, 64).cuboid(-5.0F, -1.0F, -2.0F, 6.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.0478F, -0.1674F, 0.2718F, 0.0865F, -0.0114F, 0.1304F));

        ModelPartData front_flipper_left = flippers.addChild("front_flipper_left", ModelPartBuilder.create(), ModelTransform.of(-3.0F, -6.0F, 3.0F, -0.1484F, 0.2007F, -0.3943F));

        ModelPartData front_flipper_left_base_1 = front_flipper_left.addChild("front_flipper_left_base_1", ModelPartBuilder.create(), ModelTransform.pivot(-4.6265F, 2.5606F, -2.4865F));

        ModelPartData front_flipper_left_r1 = front_flipper_left_base_1.addChild("front_flipper_left_r1", ModelPartBuilder.create().uv(0, 64).cuboid(-6.0F, -1.0F, -1.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(1.3741F, -0.4499F, 0.4526F, 0.0645F, 0.0039F, -0.0753F));

        ModelPartData front_flipper_left_base_2 = front_flipper_left.addChild("front_flipper_left_base_2", ModelPartBuilder.create(), ModelTransform.pivot(-8.6265F, 2.5606F, -1.4865F));

        ModelPartData front_flipper_left_2_r1 = front_flipper_left_base_2.addChild("front_flipper_left_2_r1", ModelPartBuilder.create().uv(38, 64).cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.6259F, -0.4499F, -0.5474F, 0.0436F, 0.0F, 0.3927F));

        ModelPartData rear_flipper_left = flippers.addChild("rear_flipper_left", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rearflipper_left_r1 = rear_flipper_left.addChild("rearflipper_left_r1", ModelPartBuilder.create().uv(0, 56).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -1.0F, -23.0F, 0.0F, -0.5236F, 0.0F));

        ModelPartData rear_flipper_right = flippers.addChild("rear_flipper_right", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rear_flipper_right_r1 = rear_flipper_right.addChild("rear_flipper_right_r1", ModelPartBuilder.create().uv(18, 56).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -1.0F, -23.0F, 0.0F, 0.5236F, 0.0F));

        ModelPartData lower_body = seal.addChild("lower_body", ModelPartBuilder.create().uv(0, 39).cuboid(-7.5671F, -2.2877F, -14.8624F, 7.0F, 4.0F, 13.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -2.0F, -5.0F));

        ModelPartData lower_body_base_1_r1 = lower_body.addChild("lower_body_base_1_r1", ModelPartBuilder.create().uv(0, 20).cuboid(-3.0F, -3.0F, -11.0F, 7.0F, 5.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-4.5671F, -2.2877F, -3.8624F, 0.2182F, 0.0F, 0.0F));

        ModelPartData upper_body = seal.addChild("upper_body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData upper_body_base_2 = upper_body.addChild("upper_body_base_2", ModelPartBuilder.create(), ModelTransform.pivot(15.0F, 2.0F, -18.0F));

        ModelPartData upper_body_base_2_v1 = upper_body_base_2.addChild("upper_body_base_2_v1", ModelPartBuilder.create().uv(54, 0).cuboid(-6.0F, -7.0F, 2.0F, 11.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-14.0F, -1.0F, 17.0F));

        ModelPartData upper_body_base_2_v2 = upper_body_base_2.addChild("upper_body_base_2_v2", ModelPartBuilder.create().uv(42, 20).cuboid(-6.0F, -7.0F, -4.0F, 11.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-14.0F, -1.0F, 17.0F));

        ModelPartData upper_body_base_2_v3 = upper_body_base_2.addChild("upper_body_base_2_v3", ModelPartBuilder.create().uv(54, 9).cuboid(-6.0F, -7.0F, -7.0F, 11.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-14.0F, -1.0F, 17.0F));

        ModelPartData upper_body_base_3 = upper_body.addChild("upper_body_base_3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData upper_body_base_3_r1 = upper_body_base_3.addChild("upper_body_base_3_r1", ModelPartBuilder.create().uv(40, 39).cuboid(-6.0F, -4.0F, -3.0F, 11.0F, 4.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -3.0F, 6.0F, 0.7854F, 0.0F, 0.0F));

        ModelPartData upper_body_base_1 = upper_body.addChild("upper_body_base_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData upper_body_base_1_r1 = upper_body_base_1.addChild("upper_body_base_1_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -2.0F, -16.0F, 11.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -8.0F, 8.0F, 0.0873F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }
    @Override
    public void setAngles(Crabeater_SealEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(Crabeater_SealAnimations.IDLE,  limbSwing, limbSwingAmount, 2f, 2.5f );
        this.updateAnimation(entity.idleAnimationState, Crabeater_SealAnimations.IDLE, ageInTicks, 1f);
        this.updateAnimation(entity.walkAnimationState, Crabeater_SealAnimations.GALLOPING, ageInTicks);
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