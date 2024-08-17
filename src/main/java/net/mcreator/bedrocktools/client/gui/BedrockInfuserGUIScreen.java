package net.mcreator.bedrocktools.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.bedrocktools.world.inventory.BedrockInfuserGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BedrockInfuserGUIScreen extends AbstractContainerScreen<BedrockInfuserGUIMenu> {
	private final static HashMap<String, Object> guistate = BedrockInfuserGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BedrockInfuserGUIScreen(BedrockInfuserGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("bedrock_tools_and_armor:textures/screens/bedrock_infuser_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("bedrock_tools_and_armor:textures/screens/curved_arrow_top_right.png"), this.leftPos + 45, this.topPos + 24, 0, 0, 32, 18, 32, 18);

		guiGraphics.blit(new ResourceLocation("bedrock_tools_and_armor:textures/screens/curved_arrow_down_right.png"), this.leftPos + 45, this.topPos + 44, 0, 0, 32, 18, 32, 18);

		guiGraphics.blit(new ResourceLocation("bedrock_tools_and_armor:textures/screens/curved_arrow_top_left.png"), this.leftPos + 99, this.topPos + 24, 0, 0, 32, 18, 32, 18);

		guiGraphics.blit(new ResourceLocation("bedrock_tools_and_armor:textures/screens/curved_arrow_down_left.png"), this.leftPos + 99, this.topPos + 44, 0, 0, 32, 18, 32, 18);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.bedrock_tools_and_armor.bedrock_infuser_gui.label_bedrock_infuser"), 8, 5, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
