package motherlode.client.render;

import motherlode.entity.item.EntityBomb;
import motherlode.entity.item.EntityDynamite;
import motherlode.entity.monster.EntityGrizzlyBear;
import motherlode.entity.monster.EntitySmallSpider;
import motherlode.entity.passive.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MotherlodeRenders {

	@SideOnly(Side.CLIENT)
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityBomb.class, RenderBomb.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, RenderDynamite.Factory.INSTANCE);

		RenderingRegistry.registerEntityRenderingHandler(EntityFirefly.class, RenderFirefly.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityFireflyBlue.class, RenderFirefly.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityFireflyGreen.class, RenderFirefly.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityFireflyYellow.class, RenderFirefly.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityFireflyInferno.class, RenderFirefly.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityButterfly.class, RenderButterfly.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityButterflyExotic.class, RenderButterflyExotic.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityMoth.class, RenderMoth.Factory.INSTANCE);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLizard.class, RenderLizard.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntitySmallSpider.class, RenderSmallSpider.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityClam.class, RenderClam.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityMole.class, RenderMole.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityChipmunk.class, RenderChipmunk.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityAntlion.class, RenderAntlion.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityArmadillo.class, RenderArmadillo.Factory.INSTANCE);
		RenderingRegistry.registerEntityRenderingHandler(EntityGrizzlyBear.class, RenderGrizzlyBear.Factory.INSTANCE);
	}
}
