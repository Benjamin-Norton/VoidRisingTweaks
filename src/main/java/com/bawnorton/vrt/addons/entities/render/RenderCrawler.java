package com.bawnorton.vrt.addons.entities.render;

import com.bawnorton.vrt.Global;
import com.bawnorton.vrt.addons.entities.EntityCrawler;
import com.bawnorton.vrt.addons.entities.bosses.BossBase;
import com.bawnorton.vrt.addons.entities.models.ModelCrawler;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.Nullable;

@SideOnly(Side.CLIENT)
public class RenderCrawler extends RenderLiving<EntityCrawler> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Global.MOD_ID + ":textures/entity/crawler.png");

    public RenderCrawler(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCrawler(), 0.5F);
    }

    @Override
    protected void preRenderCallback(EntityCrawler entitylivingbaseIn, float partialTickTime) {
        GlStateManager.scale(entitylivingbaseIn.getScale(), entitylivingbaseIn.getScale(), entitylivingbaseIn.getScale());
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityCrawler entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityCrawler entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}
