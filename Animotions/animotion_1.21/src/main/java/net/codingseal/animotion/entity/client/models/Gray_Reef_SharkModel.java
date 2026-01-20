package net.codingseal.animotion.entity.client.models;

import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.client.animations.Gray_Reef_SharkAnimations;
import net.codingseal.animotion.entity.custom.Gray_Reef_SharkEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class Gray_Reef_SharkModel<T extends Gray_Reef_SharkEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer GRAY_REEF_SHARK = new EntityModelLayer(Identifier.of(Animotion.MOD_ID, "gray_reef_shark"), "main");



    private final ModelPart root;
    private final ModelPart shark;
    private final ModelPart head;

    public Gray_Reef_SharkModel(ModelPart root) {
        this.root = root.getChild("root");
        this.shark = this.root.getChild("shark");
        this.head = this.shark.getChild("head");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 19.0F, 25.0F));

        ModelPartData shark = root.addChild("shark", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData body = shark.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-9.0F, -8.0F, -46.0F, 17.0F, 15.0F, 44.0F, new Dilation(0.0F))
                .uv(118, 99).cuboid(-9.0F, -11.0F, -26.0F, 17.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -4.0F, 1.0F));

        ModelPartData cube_r1 = body.addChild("cube_r1", ModelPartBuilder.create().uv(0, 158).cuboid(-9.0F, -2.0F, -10.0F, 17.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, -9.0F, -0.3229F, 0.0F, 0.0F));

        ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(148, 71).cuboid(-10.0F, -2.0F, -21.0F, 17.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -9.0F, -17.0F, 0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(118, 85).cuboid(-9.0F, -2.0F, -15.5F, 17.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.0F, -16.5F, 0.0262F, 0.0F, 0.0F));

        ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(0, 123).cuboid(-9.0F, -2.0F, -18.0F, 17.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.0F, -28.0F, 0.1309F, 0.0F, 0.0F));

        ModelPartData cube_r5 = body.addChild("cube_r5", ModelPartBuilder.create().uv(0, 85).cuboid(-9.0F, -2.0F, -10.0F, 17.0F, 4.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, -7.0F, -0.1745F, 0.0F, 0.0F));

        ModelPartData pectoral_fin_1 = body.addChild("pectoral_fin_1", ModelPartBuilder.create().uv(164, 32).cuboid(-1.0F, 0.0F, -4.0F, 12.0F, 1.0F, 6.0F, new Dilation(0.0F))
                .uv(148, 80).cuboid(-2.0F, 0.0F, 0.0F, 15.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, 2.0F, -34.0F, 0.0F, 0.0F, 0.3054F));

        ModelPartData cube_r6 = pectoral_fin_1.addChild("cube_r6", ModelPartBuilder.create().uv(58, 178).cuboid(-5.0F, -2.0F, -3.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 2.0F, 1.0F, 0.0F, -2.138F, 0.0F));

        ModelPartData cube_r7 = pectoral_fin_1.addChild("cube_r7", ModelPartBuilder.create().uv(122, 52).cuboid(-5.0F, -2.0F, -3.0F, 7.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 2.0F, -2.0F, 0.0F, 2.2689F, 0.0F));

        ModelPartData pectoral_fin_2 = body.addChild("pectoral_fin_2", ModelPartBuilder.create().uv(164, 39).cuboid(-16.0F, -2.0F, -4.0F, 15.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(164, 44).cuboid(-13.0F, -2.0F, -8.0F, 12.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 3.0F, -30.0F, 0.0F, 0.0F, -0.3054F));

        ModelPartData cube_r8 = pectoral_fin_2.addChild("cube_r8", ModelPartBuilder.create().uv(170, 105).cuboid(-5.0F, -2.0F, -3.0F, 7.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-13.0F, 0.0F, -4.0F, 0.0F, 0.6981F, 0.0F));

        ModelPartData cube_r9 = pectoral_fin_2.addChild("cube_r9", ModelPartBuilder.create().uv(0, 180).cuboid(-5.0F, -2.0F, -3.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

        ModelPartData dorsal_fin_1 = body.addChild("dorsal_fin_1", ModelPartBuilder.create().uv(174, 168).cuboid(-2.0F, -10.0F, 2.0F, 4.0F, 10.0F, 5.0F, new Dilation(0.0F))
                .uv(174, 85).cuboid(-2.0F, -8.0F, -1.0F, 4.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -7.0F, -25.0F));

        ModelPartData cube_r10 = dorsal_fin_1.addChild("cube_r10", ModelPartBuilder.create().uv(26, 166).cuboid(-2.0F, -9.0F, -2.0F, 4.0F, 15.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.0F, -1.0F, -0.7418F, 0.0F, 0.0F));

        ModelPartData head = shark.addChild("head", ModelPartBuilder.create().uv(112, 113).cuboid(-10.1125F, -6.9662F, -11.5578F, 13.0F, 9.0F, 13.0F, new Dilation(0.0F))
                .uv(148, 52).cuboid(-10.1125F, -7.9662F, -4.5578F, 13.0F, 13.0F, 6.0F, new Dilation(0.0F))
                .uv(58, 113).cuboid(-10.1125F, -4.9662F, -19.5578F, 13.0F, 6.0F, 14.0F, new Dilation(0.0F))
                .uv(0, 104).cuboid(-10.1125F, -2.9662F, -25.5578F, 13.0F, 3.0F, 16.0F, new Dilation(0.0F))
                .uv(170, 99).cuboid(-10.1125F, -3.9662F, -25.5578F, 13.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -3.0F, -43.0F));

        ModelPartData cube_r11 = head.addChild("cube_r11", ModelPartBuilder.create().uv(74, 59).cuboid(-7.0F, -2.0F, -23.0F, 13.0F, 2.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(-3.1125F, -6.9662F, -2.5578F, 0.2182F, 0.0F, 0.0F));

        ModelPartData cube_r12 = head.addChild("cube_r12", ModelPartBuilder.create().uv(0, 59).cuboid(-7.0F, -2.0F, -23.0F, 13.0F, 2.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(-3.1125F, 4.0338F, -2.5578F, -0.1309F, 0.0F, 0.0F));

        ModelPartData jaw = head.addChild("jaw", ModelPartBuilder.create(), ModelTransform.pivot(-8.1125F, 6.0338F, -5.5578F));

        ModelPartData cube_r13 = jaw.addChild("cube_r13", ModelPartBuilder.create().uv(136, 135).cuboid(-2.0F, -2.1736F, -14.9848F, 13.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 9.0F, -0.1309F, 0.0F, 0.0F));

        ModelPartData mouth = jaw.addChild("mouth", ModelPartBuilder.create().uv(0, 147).cuboid(-2.0F, -3.1736F, -14.9848F, 13.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r14 = mouth.addChild("cube_r14", ModelPartBuilder.create().uv(136, 147).cuboid(-2.0F, -2.1736F, -14.9848F, 13.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        ModelPartData tail = shark.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, -4.0F, -4.0F));

        ModelPartData tail_part_1 = tail.addChild("tail_part_1", ModelPartBuilder.create().uv(50, 133).cuboid(-7.0F, -6.0F, 2.0F, 12.0F, 11.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

        ModelPartData cube_r15 = tail_part_1.addChild("cube_r15", ModelPartBuilder.create().uv(100, 165).cuboid(-1.0F, -11.0F, -1.0F, 2.0F, 13.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 4.0F, 3.0F, 0.0F, -0.1309F, 0.0F));

        ModelPartData cube_r16 = tail_part_1.addChild("cube_r16", ModelPartBuilder.create().uv(80, 165).cuboid(-1.0F, -11.0F, -1.0F, 2.0F, 13.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 4.0F, 3.0F, 0.0F, 0.1309F, 0.0F));

        ModelPartData cube_r17 = tail_part_1.addChild("cube_r17", ModelPartBuilder.create().uv(90, 135).cuboid(-7.0F, -2.0F, -9.0F, 12.0F, 2.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.0F, 9.0F, -0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r18 = tail_part_1.addChild("cube_r18", ModelPartBuilder.create().uv(0, 134).cuboid(-7.0F, -2.0F, -9.0F, 12.0F, 2.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 9.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData tail_part_2 = tail.addChild("tail_part_2", ModelPartBuilder.create().uv(90, 148).cuboid(-6.0F, -6.0F, -1.0F, 10.0F, 10.0F, 7.0F, new Dilation(0.0F))
                .uv(46, 152).cuboid(-6.0F, -6.0F, -1.0F, 10.0F, 10.0F, 7.0F, new Dilation(0.0F))
                .uv(164, 111).cuboid(-3.0F, -4.0F, -1.0F, 7.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 11.0F));

        ModelPartData cube_r19 = tail_part_2.addChild("cube_r19", ModelPartBuilder.create().uv(134, 176).cuboid(0.0F, -10.0F, -1.0F, 1.0F, 11.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 4.0F, 1.0F, 0.0F, -0.1309F, 0.0F));

        ModelPartData cube_r20 = tail_part_2.addChild("cube_r20", ModelPartBuilder.create().uv(120, 176).cuboid(0.0F, -10.0F, -1.0F, 1.0F, 11.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 4.0F, 1.0F, 0.0F, 0.1309F, 0.0F));

        ModelPartData cube_r21 = tail_part_2.addChild("cube_r21", ModelPartBuilder.create().uv(158, 158).cuboid(-6.0F, -2.0F, -8.0F, 10.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.0F, 7.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r22 = tail_part_2.addChild("cube_r22", ModelPartBuilder.create().uv(124, 158).cuboid(-6.0F, -2.0F, -8.0F, 10.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, 7.0F, -0.0873F, 0.0F, 0.0F));

        ModelPartData pelvic_fin = tail_part_2.addChild("pelvic_fin", ModelPartBuilder.create(), ModelTransform.of(0.0F, 4.0F, 10.0F, 3.1416F, 3.1416F, 0.0F));

        ModelPartData cube_r23 = pelvic_fin.addChild("cube_r23", ModelPartBuilder.create().uv(68, 169).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

        ModelPartData cube_r24 = pelvic_fin.addChild("cube_r24", ModelPartBuilder.create().uv(124, 148).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

        ModelPartData cube_r25 = pelvic_fin.addChild("cube_r25", ModelPartBuilder.create().uv(50, 123).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -4.0F, -0.3491F, 0.0F, 0.0F));

        ModelPartData tail_part_3 = tail.addChild("tail_part_3", ModelPartBuilder.create().uv(64, 85).cuboid(-4.0F, -3.0F, 0.0F, 6.0F, 7.0F, 21.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 15.0F));

        ModelPartData cube_r26 = tail_part_3.addChild("cube_r26", ModelPartBuilder.create().uv(122, 26).cuboid(0.0F, -8.0F, -2.0F, 2.0F, 7.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, 5.0F, 4.0F, 0.0F, 0.0873F, 0.0F));

        ModelPartData cube_r27 = tail_part_3.addChild("cube_r27", ModelPartBuilder.create().uv(122, 0).cuboid(-1.0F, -8.0F, -2.0F, 2.0F, 7.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 5.0F, 4.0F, 0.0F, -0.0873F, 0.0F));

        ModelPartData cube_r28 = tail_part_3.addChild("cube_r28", ModelPartBuilder.create().uv(120, 168).cuboid(-5.0F, -3.0F, 9.0F, 8.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 8.0F, -7.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData cube_r29 = tail_part_3.addChild("cube_r29", ModelPartBuilder.create().uv(164, 125).cuboid(-5.0F, -2.0F, 9.0F, 8.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, -7.0F, -0.1745F, 0.0F, 0.0F));

        ModelPartData dorsal_fin_2 = tail_part_3.addChild("dorsal_fin_2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.0F, 19.0F));

        ModelPartData cube_r30 = dorsal_fin_2.addChild("cube_r30", ModelPartBuilder.create().uv(182, 145).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

        ModelPartData cube_r31 = dorsal_fin_2.addChild("cube_r31", ModelPartBuilder.create().uv(66, 182).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

        ModelPartData cube_r32 = dorsal_fin_2.addChild("cube_r32", ModelPartBuilder.create().uv(58, 182).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -4.0F, -0.3491F, 0.0F, 0.0F));

        ModelPartData anal_fin = tail_part_3.addChild("anal_fin", ModelPartBuilder.create(), ModelTransform.of(0.0F, 4.0F, 19.0F, 3.1416F, 3.1416F, 0.0F));

        ModelPartData cube_r33 = anal_fin.addChild("cube_r33", ModelPartBuilder.create().uv(182, 150).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

        ModelPartData cube_r34 = anal_fin.addChild("cube_r34", ModelPartBuilder.create().uv(182, 139).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

        ModelPartData cube_r35 = anal_fin.addChild("cube_r35", ModelPartBuilder.create().uv(182, 133).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -4.0F, -0.3491F, 0.0F, 0.0F));

        ModelPartData tail_part_4 = tail.addChild("tail_part_4", ModelPartBuilder.create().uv(0, 166).cuboid(-3.0F, -4.0F, 2.0F, 6.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, 34.0F));

        ModelPartData cube_r36 = tail_part_4.addChild("cube_r36", ModelPartBuilder.create().uv(42, 178).cuboid(0.0F, -8.0F, -1.0F, 1.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 4.0F, 3.0F, 0.0F, -0.1309F, 0.0F));

        ModelPartData cube_r37 = tail_part_4.addChild("cube_r37", ModelPartBuilder.create().uv(148, 177).cuboid(0.0F, -8.0F, -1.0F, 1.0F, 8.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 4.0F, 3.0F, 0.0F, 0.1309F, 0.0F));

        ModelPartData cube_r38 = tail_part_4.addChild("cube_r38", ModelPartBuilder.create().uv(42, 169).cuboid(-4.0F, -2.0F, -8.0F, 6.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 4.0F, 10.0F, 0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r39 = tail_part_4.addChild("cube_r39", ModelPartBuilder.create().uv(148, 168).cuboid(-4.0F, -2.0F, -8.0F, 6.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -3.0F, 10.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData caudal_fin_1 = tail_part_4.addChild("caudal_fin_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 8.0F));

        ModelPartData cube_r40 = caudal_fin_1.addChild("cube_r40", ModelPartBuilder.create().uv(164, 16).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, -2.0F, 1.1781F, 0.0F, 0.0F));

        ModelPartData cube_r41 = caudal_fin_1.addChild("cube_r41", ModelPartBuilder.create().uv(164, 0).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.3526F, 0.0F, 0.0F));

        ModelPartData caudal_fin_2 = tail_part_4.addChild("caudal_fin_2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 10.0F, 9.0F));

        ModelPartData cube_r42 = caudal_fin_2.addChild("cube_r42", ModelPartBuilder.create().uv(164, 177).cuboid(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2717F, 0.0F, 0.0276F));

        ModelPartData cube_r43 = caudal_fin_2.addChild("cube_r43", ModelPartBuilder.create().uv(80, 152).cuboid(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 256, 256);
    }
    @Override
    public void setAngles(Gray_Reef_SharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(Gray_Reef_SharkAnimations.IDLE,  limbSwing, limbSwingAmount, 2f, 2.5f );
        this.updateAnimation(entity.idleAnimationState, Gray_Reef_SharkAnimations.IDLE, ageInTicks, 1f);
        // V0.0.4
        this.updateAnimation(entity.swimAnimationState, Gray_Reef_SharkAnimations.SWIM, ageInTicks);

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