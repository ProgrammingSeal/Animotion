package net.codingseal.animotion.entity.client;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.custom.Tiger_SharkEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;


public class Tiger_SharkModel<T extends Tiger_SharkEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer TIGER_SHARK = new EntityModelLayer(Identifier.of(Animotion.MOD_ID, "tiger_shark"), "main");


    private final ModelPart root;
	private final ModelPart shark;
	private final ModelPart head;
	public Tiger_SharkModel(ModelPart root) {
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
		.uv(118, 95).cuboid(-9.0F, -11.0F, -26.0F, 17.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -4.0F, 1.0F));

		ModelPartData cube_r1 = body.addChild("cube_r1", ModelPartBuilder.create().uv(0, 148).cuboid(-9.0F, -2.0F, -10.0F, 17.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, -9.0F, -0.3229F, 0.0F, 0.0F));

		ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(88, 142).cuboid(-10.0F, -2.0F, -21.0F, 17.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -9.0F, -17.0F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(118, 81).cuboid(-9.0F, -2.0F, -15.5F, 17.0F, 3.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.0F, -16.5F, 0.0262F, 0.0F, 0.0F));

		ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(109, 112).cuboid(-9.0F, -2.0F, -18.0F, 17.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.0F, -28.0F, 0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r5 = body.addChild("cube_r5", ModelPartBuilder.create().uv(0, 81).cuboid(-9.0F, -2.0F, -10.0F, 17.0F, 4.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, -7.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData pectoral_fin_1 = body.addChild("pectoral_fin_1", ModelPartBuilder.create().uv(162, 107).cuboid(-1.0F, 0.0F, -4.0F, 12.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(162, 114).cuboid(-2.0F, 0.0F, 0.0F, 15.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, 2.0F, -34.0F, 0.0F, 0.0F, 0.3054F));

		ModelPartData cube_r6 = pectoral_fin_1.addChild("cube_r6", ModelPartBuilder.create().uv(152, 77).cuboid(-5.0F, -2.0F, -3.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 2.0F, 1.0F, 0.0F, -2.138F, 0.0F));

		ModelPartData cube_r7 = pectoral_fin_1.addChild("cube_r7", ModelPartBuilder.create().uv(118, 175).cuboid(-5.0F, -2.0F, -3.0F, 7.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 2.0F, -2.0F, 0.0F, 2.2689F, 0.0F));

		ModelPartData pectoral_fin_2 = body.addChild("pectoral_fin_2", ModelPartBuilder.create().uv(74, 161).cuboid(-16.0F, -2.0F, -4.0F, 15.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(150, 159).cuboid(-13.0F, -2.0F, -8.0F, 12.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 3.0F, -30.0F, 0.0F, 0.0F, -0.3054F));

		ModelPartData cube_r8 = pectoral_fin_2.addChild("cube_r8", ModelPartBuilder.create().uv(168, 49).cuboid(-5.0F, -2.0F, -3.0F, 7.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-13.0F, 0.0F, -4.0F, 0.0F, 0.6981F, 0.0F));

		ModelPartData cube_r9 = pectoral_fin_2.addChild("cube_r9", ModelPartBuilder.create().uv(132, 77).cuboid(-5.0F, -2.0F, -3.0F, 7.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

		ModelPartData dorsal_fin_1 = body.addChild("dorsal_fin_1", ModelPartBuilder.create().uv(0, 172).cuboid(-2.0F, -10.0F, 2.0F, 4.0F, 10.0F, 5.0F, new Dilation(0.0F))
		.uv(88, 129).cuboid(-2.0F, -8.0F, -1.0F, 4.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -7.0F, -25.0F));

		ModelPartData cube_r10 = dorsal_fin_1.addChild("cube_r10", ModelPartBuilder.create().uv(102, 166).cuboid(-2.0F, -9.0F, -2.0F, 4.0F, 15.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.0F, -1.0F, -0.7418F, 0.0F, 0.0F));

		ModelPartData head = shark.addChild("head", ModelPartBuilder.create().uv(0, 100).cuboid(-10.1125F, -6.9662F, -11.5578F, 13.0F, 9.0F, 13.0F, new Dilation(0.0F))
		.uv(7, 107).cuboid(-10.1125F, -7.9662F, -4.5578F, 13.0F, 13.0F, 6.0F, new Dilation(0.0F))
		.uv(52, 109).cuboid(-10.1125F, -4.9662F, -19.5578F, 13.0F, 6.0F, 14.0F, new Dilation(0.0F))
		.uv(118, 22).cuboid(-10.1125F, -2.9662F, -25.5578F, 13.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(168, 140).cuboid(-10.1125F, -3.9662F, -25.5578F, 13.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -3.0F, -43.0F));

		ModelPartData cube_r11 = head.addChild("cube_r11", ModelPartBuilder.create().uv(-4, 55).cuboid(-7.0F, -2.0F, -23.0F, 13.0F, 2.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(-3.1125F, -6.9662F, -2.5578F, 0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r12 = head.addChild("cube_r12", ModelPartBuilder.create().uv(62, 55).cuboid(-7.0F, -2.0F, -23.0F, 13.0F, 2.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(-3.1125F, 4.0338F, -2.5578F, -0.1309F, 0.0F, 0.0F));

		ModelPartData jaw = head.addChild("jaw", ModelPartBuilder.create(), ModelTransform.pivot(-8.1125F, 6.0338F, -5.5578F));

		ModelPartData cube_r13 = jaw.addChild("cube_r13", ModelPartBuilder.create().uv(132, 54).cuboid(-2.0F, -2.1736F, -14.9848F, 13.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 9.0F, -0.1309F, 0.0F, 0.0F));

		ModelPartData mouth = jaw.addChild("mouth", ModelPartBuilder.create().uv(132, 66).cuboid(-2.0F, -3.1736F, -14.9848F, 13.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r14 = mouth.addChild("cube_r14", ModelPartBuilder.create().uv(42, 142).cuboid(-2.0F, -2.1736F, -14.9848F, 13.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		ModelPartData tail = shark.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, -4.0F, -4.0F));

		ModelPartData tail_part_1 = tail.addChild("tail_part_1", ModelPartBuilder.create().uv(106, 123).cuboid(-7.0F, -6.0F, 2.0F, 12.0F, 11.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

		ModelPartData cube_r15 = tail_part_1.addChild("cube_r15", ModelPartBuilder.create().uv(164, 0).cuboid(-1.0F, -11.0F, -1.0F, 2.0F, 13.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 4.0F, 3.0F, 0.0F, -0.1309F, 0.0F));

		ModelPartData cube_r16 = tail_part_1.addChild("cube_r16", ModelPartBuilder.create().uv(56, 166).cuboid(-1.0F, -11.0F, -1.0F, 2.0F, 13.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 4.0F, 3.0F, 0.0F, 0.1309F, 0.0F));

		ModelPartData cube_r17 = tail_part_1.addChild("cube_r17", ModelPartBuilder.create().uv(42, 129).cuboid(-7.0F, -2.0F, -9.0F, 12.0F, 2.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.0F, 9.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r18 = tail_part_1.addChild("cube_r18", ModelPartBuilder.create().uv(122, 41).cuboid(-7.0F, -2.0F, -9.0F, 12.0F, 2.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 9.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData tail_part_2 = tail.addChild("tail_part_2", ModelPartBuilder.create().uv(134, 142).cuboid(-6.0F, -6.0F, -1.0F, 10.0F, 10.0F, 7.0F, new Dilation(0.0F))
		.uv(146, 123).cuboid(-6.0F, -6.0F, -1.0F, 10.0F, 10.0F, 7.0F, new Dilation(0.0F))
		.uv(28, 163).cuboid(-3.0F, -4.0F, -1.0F, 7.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 11.0F));

		ModelPartData cube_r19 = tail_part_2.addChild("cube_r19", ModelPartBuilder.create().uv(174, 77).cuboid(0.0F, -10.0F, -1.0F, 1.0F, 11.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 4.0F, 1.0F, 0.0F, -0.1309F, 0.0F));

		ModelPartData cube_r20 = tail_part_2.addChild("cube_r20", ModelPartBuilder.create().uv(172, 21).cuboid(0.0F, -10.0F, -1.0F, 1.0F, 11.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 4.0F, 1.0F, 0.0F, 0.1309F, 0.0F));

		ModelPartData cube_r21 = tail_part_2.addChild("cube_r21", ModelPartBuilder.create().uv(40, 153).cuboid(-6.0F, -2.0F, -8.0F, 10.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.0F, 7.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r22 = tail_part_2.addChild("cube_r22", ModelPartBuilder.create().uv(88, 151).cuboid(-6.0F, -2.0F, -8.0F, 10.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, 7.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData pelvic_fin = tail_part_2.addChild("pelvic_fin", ModelPartBuilder.create(), ModelTransform.of(0.0F, 4.0F, 10.0F, 3.1416F, 3.1416F, 0.0F));

		ModelPartData cube_r23 = pelvic_fin.addChild("cube_r23", ModelPartBuilder.create().uv(42, 122).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r24 = pelvic_fin.addChild("cube_r24", ModelPartBuilder.create().uv(52, 100).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r25 = pelvic_fin.addChild("cube_r25", ModelPartBuilder.create().uv(122, 151).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -4.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData tail_part_3 = tail.addChild("tail_part_3", ModelPartBuilder.create().uv(64, 81).cuboid(-4.0F, -3.0F, 0.0F, 6.0F, 7.0F, 21.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 15.0F));

		ModelPartData cube_r26 = tail_part_3.addChild("cube_r26", ModelPartBuilder.create().uv(122, 0).cuboid(0.0F, -8.0F, -2.0F, 2.0F, 7.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, 5.0F, 4.0F, 0.0F, 0.0873F, 0.0F));

		ModelPartData cube_r27 = tail_part_3.addChild("cube_r27", ModelPartBuilder.create().uv(0, 122).cuboid(-1.0F, -8.0F, -2.0F, 2.0F, 7.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 5.0F, 4.0F, 0.0F, -0.0873F, 0.0F));

		ModelPartData cube_r28 = tail_part_3.addChild("cube_r28", ModelPartBuilder.create().uv(168, 41).cuboid(-5.0F, -3.0F, 9.0F, 8.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 8.0F, -7.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r29 = tail_part_3.addChild("cube_r29", ModelPartBuilder.create().uv(150, 166).cuboid(-5.0F, -2.0F, 9.0F, 8.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, -7.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData dorsal_fin_2 = tail_part_3.addChild("dorsal_fin_2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.0F, 19.0F));

		ModelPartData cube_r30 = dorsal_fin_2.addChild("cube_r30", ModelPartBuilder.create().uv(122, 54).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r31 = dorsal_fin_2.addChild("cube_r31", ModelPartBuilder.create().uv(28, 156).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r32 = dorsal_fin_2.addChild("cube_r32", ModelPartBuilder.create().uv(74, 153).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -4.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData anal_fin = tail_part_3.addChild("anal_fin", ModelPartBuilder.create(), ModelTransform.of(0.0F, 4.0F, 19.0F, 3.1416F, 3.1416F, 0.0F));

		ModelPartData cube_r33 = anal_fin.addChild("cube_r33", ModelPartBuilder.create().uv(112, 161).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r34 = anal_fin.addChild("cube_r34", ModelPartBuilder.create().uv(36, 177).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r35 = anal_fin.addChild("cube_r35", ModelPartBuilder.create().uv(28, 177).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -4.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData tail_part_4 = tail.addChild("tail_part_4", ModelPartBuilder.create().uv(76, 166).cuboid(-3.0F, -4.0F, 2.0F, 6.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, 34.0F));

		ModelPartData cube_r36 = tail_part_4.addChild("cube_r36", ModelPartBuilder.create().uv(166, 174).cuboid(0.0F, -8.0F, -1.0F, 1.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 4.0F, 3.0F, 0.0F, -0.1309F, 0.0F));

		ModelPartData cube_r37 = tail_part_4.addChild("cube_r37", ModelPartBuilder.create().uv(150, 174).cuboid(0.0F, -8.0F, -1.0F, 1.0F, 8.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 4.0F, 3.0F, 0.0F, 0.1309F, 0.0F));

		ModelPartData cube_r38 = tail_part_4.addChild("cube_r38", ModelPartBuilder.create().uv(170, 95).cuboid(-4.0F, -2.0F, -8.0F, 6.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 4.0F, 10.0F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r39 = tail_part_4.addChild("cube_r39", ModelPartBuilder.create().uv(168, 147).cuboid(-4.0F, -2.0F, -8.0F, 6.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -3.0F, 10.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData caudal_fin_1 = tail_part_4.addChild("caudal_fin_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 8.0F));

		ModelPartData cube_r40 = caudal_fin_1.addChild("cube_r40", ModelPartBuilder.create().uv(122, 159).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, -2.0F, 1.1781F, 0.0F, 0.0F));

		ModelPartData cube_r41 = caudal_fin_1.addChild("cube_r41", ModelPartBuilder.create().uv(0, 156).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.3526F, 0.0F, 0.0F));

		ModelPartData caudal_fin_2 = tail_part_4.addChild("caudal_fin_2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 10.0F, 9.0F));

		ModelPartData cube_r42 = caudal_fin_2.addChild("cube_r42", ModelPartBuilder.create().uv(140, 175).cuboid(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2717F, 0.0F, 0.0276F));

		ModelPartData cube_r43 = caudal_fin_2.addChild("cube_r43", ModelPartBuilder.create().uv(18, 172).cuboid(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
    @Override
    public void setAngles(Tiger_SharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(Tiger_SharkAnimations.IDLE,  limbSwing, limbSwingAmount, 2f, 2.5f );
        this.updateAnimation(entity.idleAnimationState, Tiger_SharkAnimations.IDLE, ageInTicks, 1f);
        this.updateAnimation(entity.swimAnimationState, Tiger_SharkAnimations.SWIM, ageInTicks);

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