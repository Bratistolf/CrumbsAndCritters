/*package bagel.crumbsandcritters.common.entity;

//Paste this code into your mod.

import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;

public class FrogModel extends EntityModel<FrogEntity> {
	private final ModelRenderer eyeleft;
	private final ModelRenderer shape13;
	private final ModelRenderer field_178704_h;
	private final ModelRenderer field_178704_h_1;
	private final ModelRenderer field_178698_a;
	private final ModelRenderer field_178697_c;
	private final ModelRenderer field_178695_e;
	private final ModelRenderer field_178693_g;
	private final ModelRenderer field_178696_b;
	private final ModelRenderer field_178694_d;
	private final ModelRenderer field_178692_f;

	public FrogModel() {
		textureWidth = 64;
		textureHeight = 64;

		eyeleft = new ModelRenderer(this);
		eyeleft.setRotationPoint(1.5F, 15.0F, -4.0F);
		setRotationAngle(eyeleft, -0.1531F, 0.0F, 0.0F);
		eyeleft.cubeList.add(new ModelBox(eyeleft, 0, 0, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		shape13 = new ModelRenderer(this);
		shape13.setRotationPoint(-3.5F, 15.0F, -4.0F);
		setRotationAngle(shape13, -0.1531F, 0.0F, 0.0F);
		shape13.cubeList.add(new ModelBox(shape13, 0, 22, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		field_178704_h = new ModelRenderer(this);
		field_178704_h.setRotationPoint(0.0F, 20.0F, -2.0F);
		setRotationAngle(field_178704_h, -0.1531F, 0.0F, 0.0F);
		field_178704_h.cubeList.add(new ModelBox(field_178704_h, 32, 0, -2.5F, -4.0F, -5.0F, 5, 2, 5, 0.0F, false));

		field_178704_h_1 = new ModelRenderer(this);
		field_178704_h_1.setRotationPoint(0.0F, 20.0F, -2.0F);
		setRotationAngle(field_178704_h_1, -0.1531F, 0.0F, 0.0F);
		field_178704_h_1.cubeList.add(new ModelBox(field_178704_h_1, 32, 7, -2.5F, -2.0F, -5.0F, 5, 1, 5, 0.0F, false));

		field_178698_a = new ModelRenderer(this);
		field_178698_a.setRotationPoint(3.0F, 17.5F, 3.7F);
		field_178698_a.cubeList.add(new ModelBox(field_178698_a, 26, 24, -1.0F, 5.5F, -3.7F, 2, 1, 7, 0.0F, false));

		field_178697_c = new ModelRenderer(this);
		field_178697_c.setRotationPoint(3.0F, 19.5F, 2.7F);
		setRotationAngle(field_178697_c, -0.2349F, 0.0F, 0.0F);
		field_178697_c.cubeList.add(new ModelBox(field_178697_c, 30, 15, -1.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F, false));

		field_178695_e = new ModelRenderer(this);
		field_178695_e.setRotationPoint(0.0F, 19.9F, 7.3F);
		setRotationAngle(field_178695_e, -0.1812F, 0.0F, 0.0F);
		field_178695_e.cubeList.add(new ModelBox(field_178695_e, 0, 0, -3.0F, -2.0F, -10.0F, 6, 5, 10, 0.0F, false));

		field_178693_g = new ModelRenderer(this);
		field_178693_g.setRotationPoint(-3.0F, 19.0F, -1.0F);
		setRotationAngle(field_178693_g, -0.192F, 0.0F, 0.0F);
		field_178693_g.cubeList.add(new ModelBox(field_178693_g, 0, 15, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

		field_178696_b = new ModelRenderer(this);
		field_178696_b.setRotationPoint(-3.0F, 17.5F, 3.7F);
		field_178696_b.cubeList.add(new ModelBox(field_178696_b, 8, 24, -1.0F, 5.5F, -3.7F, 2, 1, 7, 0.0F, false));

		field_178694_d = new ModelRenderer(this);
		field_178694_d.setRotationPoint(-3.0F, 19.5F, 2.7F);
		setRotationAngle(field_178694_d, -0.2349F, 0.0F, 0.0F);
		field_178694_d.cubeList.add(new ModelBox(field_178694_d, 16, 15, -1.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F, false));

		field_178692_f = new ModelRenderer(this);
		field_178692_f.setRotationPoint(3.0F, 19.0F, -1.0F);
		setRotationAngle(field_178692_f, -0.192F, 0.0F, 0.0F);
		field_178692_f.cubeList.add(new ModelBox(field_178692_f, 8, 15, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));
	}

	@Override
	public void render(FrogEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		eyeleft.render(f5);
		shape13.render(f5);
		field_178704_h.render(f5);
		field_178704_h_1.render(f5);
		field_178698_a.render(f5);
		field_178697_c.render(f5);
		field_178695_e.render(f5);
		field_178693_g.render(f5);
		field_178696_b.render(f5);
		field_178694_d.render(f5);
		field_178692_f.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}*/