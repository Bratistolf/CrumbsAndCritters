package bagel.crumbsandcritters.common.entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import bagel.crumbsandcritters.setup.CrumbsAndCritters;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FrogRenderer extends MobRenderer<FrogEntity, FrogModel> {

	private static final ResourceLocation resourceLocation = new ResourceLocation(CrumbsAndCritters.modid,
		"textures/entity/frog.png");

	public FrogRenderer(EntityRendererManager rendererManager) {
		super(rendererManager, new FrogModel(), 0.4F);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(@Nonnull FrogEntity entity) {
		return resourceLocation;
	}
}
