package net.codingseal.animotion.entity.client.models;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.client.animations.CrabAnimations;
import net.codingseal.animotion.entity.custom.CrabEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class CrabModel<T extends CrabEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer CRAB = new EntityModelLayer(Identifier.of(Animotion.MOD_ID, "crab"), "main");


        private final ModelPart root;
        private final ModelPart crab;

        public CrabModel(ModelPart root) {
            this.root = root.getChild("root");
            this.crab = this.root.getChild("crab");


        }

        public static TexturedModelData getTexturedModelData() {
            ModelData modelData = new ModelData();
            ModelPartData modelPartData = modelData.getRoot();
            ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

            ModelPartData crab = root.addChild("crab", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData body = crab.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-10.0F, 0.0F, -2.0F, 12.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -6.0F, 1.0F));

            ModelPartData eye_right = crab.addChild("eye_right", ModelPartBuilder.create().uv(24, 22).cuboid(-1.0474F, -3.0F, -1.1735F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -6.0F, 1.0F));

            ModelPartData eye_left = crab.addChild("eye_left", ModelPartBuilder.create().uv(24, 16).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -7.0F, 1.0F));

            ModelPartData arm_left = crab.addChild("arm_left", ModelPartBuilder.create().uv(0, 16).cuboid(-0.4241F, -5.3914F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -5.0F, 0.0F, 0.0436F, 0.3491F, 0.3491F));

            ModelPartData cube_r1 = arm_left.addChild("cube_r1", ModelPartBuilder.create().uv(16, 16).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.5759F, -4.3914F, 0.0F, 0.0F, 0.0F, 0.3491F));

            ModelPartData cube_r2 = arm_left.addChild("cube_r2", ModelPartBuilder.create().uv(0, 24).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.4241F, -4.3914F, 0.0F, 0.0F, 0.0F, -0.3491F));

            ModelPartData arm_right = crab.addChild("arm_right", ModelPartBuilder.create().uv(8, 16).cuboid(-0.4241F, -5.3914F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -5.0F, 0.0F, -0.0436F, -0.3491F, -0.3491F));

            ModelPartData cube_r3 = arm_right.addChild("cube_r3", ModelPartBuilder.create().uv(16, 22).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.5759F, -4.3914F, 0.0F, 0.0F, 0.0F, 0.3491F));

            ModelPartData cube_r4 = arm_right.addChild("cube_r4", ModelPartBuilder.create().uv(8, 24).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.4241F, -4.3914F, 0.0F, 0.0F, 0.0F, -0.3491F));

            ModelPartData foots_right = crab.addChild("foots_right", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F, -2.0F, 7.0F));

            ModelPartData foot_right_4_r1 = foots_right.addChild("foot_right_4_r1", ModelPartBuilder.create().uv(16, 34).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                    .uv(32, 28).cuboid(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                    .uv(16, 28).cuboid(-1.0F, -4.0F, -7.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                    .uv(24, 28).cuboid(-1.0F, -4.0F, -10.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.2182F));

            ModelPartData foots_left = crab.addChild("foots_left", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData foot_left_4_r1 = foots_left.addChild("foot_left_4_r1", ModelPartBuilder.create().uv(32, 22).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                    .uv(32, 16).cuboid(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                    .uv(8, 30).cuboid(-1.0F, -4.0F, -7.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                    .uv(0, 30).cuboid(-1.0F, -4.0F, -10.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 10.0F, 0.0F, 0.0F, -0.2182F));
            return TexturedModelData.of(modelData, 64, 64);
        }

        @Override
        public void setAngles(CrabEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.getPart().traverse().forEach(ModelPart::resetTransform);


            this.animateMovement(CrabAnimations.IDLE, limbSwing, limbSwingAmount, 2f, 2.5f);
            this.updateAnimation(entity.walkAnimationState, CrabAnimations.WALK, ageInTicks);
            this.updateAnimation(entity.idleAnimationState, CrabAnimations.IDLE, ageInTicks, 1f);
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
