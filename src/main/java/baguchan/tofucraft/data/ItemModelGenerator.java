package baguchan.tofucraft.data;

import baguchan.tofucraft.TofuCraftReload;
import baguchan.tofucraft.registry.TofuBlocks;
import baguchan.tofucraft.registry.TofuItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;

import static baguchan.tofucraft.TofuCraftReload.prefix;

public class ItemModelGenerator extends ItemModelProvider {
	public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, TofuCraftReload.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		toBlock(TofuBlocks.KINUTOFU);
		toBlock(TofuBlocks.MOMENTOFU);
		toBlock(TofuBlocks.ISHITOFU);
		toBlock(TofuBlocks.METALTOFU);


		singleTex(TofuItems.TOFUKINU);
		singleTex(TofuItems.TOFUMOMEN);
		singleTex(TofuItems.TOFUISHI);
		singleTex(TofuItems.TOFUMETAL);
		singleTex(TofuItems.TOFUDIAMOND);
		singleTex(TofuItems.TOFUDIAMOND_NUGGET);

		singleTex(TofuItems.TOFUHELL);
		singleTex(TofuItems.TOFUSOUL);

		singleTex(TofuItems.TOFUGRILLED);
		singleTex(TofuItems.TOFUZUNDA);

		singleTex(TofuItems.BITTERN);
		singleTex(TofuItems.SALT);

		singleTex(TofuItems.SEEDS_SOYBEANS);
		singleTex(TofuItems.SEEDS_SOYBEANS_NETHER);
		singleTex(TofuItems.SEEDS_SOYBEANS_SOUL);
		singleTex(TofuItems.SOYBEAN_PARCHED);
		singleTex(TofuItems.KINAKO);
		singleTex(TofuItems.EDAMAME);
		singleTex(TofuItems.BOILED_EDAMAME);

		singleTex(TofuItems.LEEK);
		singleTex(TofuItems.ZUNDA);
		singleTex(TofuItems.ZUNDAMA);
		singleTex(TofuItems.ZUNDARUBY);

		singleTex(TofuItems.TOFU_HAMBURG_RAW);
		singleTex(TofuItems.TOFU_HAMBURG);
		singleTex(TofuItems.RAW_TOFU_FISH);
		singleTex(TofuItems.COOKED_TOFU_FISH);

		singleTex(TofuItems.TOFUCOOKIE);
		singleTex(TofuItems.SOYSTICK);
		singleTex(TofuItems.SALTYMELON);

		singleTex(TofuItems.SOYMILK);
		singleTex(TofuItems.SOYMILK_APPLE);
		singleTex(TofuItems.SOYMILK_COCOA);
		singleTex(TofuItems.SOYMILK_KINAKO);
		singleTex(TofuItems.SOYMILK_PUDDING);
		singleTex(TofuItems.SOYMILK_PUMPKIN);
		singleTex(TofuItems.KINAKO_MANJU);
		singleTex(TofuItems.ZUNDA_MANJU);
		singleTex(TofuItems.NETHER_MANJU);
		singleTex(TofuItems.SOUL_MANJU);

		singleTex(TofuItems.SOY_CHOCOLATE);
		singleTex(TofuItems.TOFUNIAN_SOY_CHOCOLATE);

		singleTex(TofuItems.BUCKET_SOYMILK);
		singleTex(TofuItems.BUCKET_SOYMILK_NETHER);
		singleTex(TofuItems.BUCKET_SOYMILK_SOUL);
		singleTex(TofuItems.BUCKET_BITTERN);

		singleTexTool(TofuItems.TOFUSCOOP);
		singleTexTool(TofuItems.BUGLE);

		singleTexTool(TofuItems.KINUSWORD);
		singleTexTool(TofuItems.KINUPICKAXE);
		singleTexTool(TofuItems.KINUAXE);
		singleTexTool(TofuItems.KINUSHOVEL);

		singleTexTool(TofuItems.MOMENSWORD);
		singleTexTool(TofuItems.MOMENPICKAXE);
		singleTexTool(TofuItems.MOMENAXE);
		singleTexTool(TofuItems.MOMENSHOVEL);

		singleTexTool(TofuItems.SOLIDSWORD);
		singleTexTool(TofuItems.SOLIDPICKAXE);
		singleTexTool(TofuItems.SOLIDAXE);
		singleTexTool(TofuItems.SOLIDSHOVEL);

		singleTexTool(TofuItems.METALSWORD);
		singleTexTool(TofuItems.METALPICKAXE);
		singleTexTool(TofuItems.METALAXE);
		singleTexTool(TofuItems.METALSHOVEL);

		singleTexTool(TofuItems.TOFUDIAMONDSWORD);
		singleTexTool(TofuItems.TOFUDIAMONDPICKAXE);
		singleTexTool(TofuItems.TOFUDIAMONDAXE);
		singleTexTool(TofuItems.TOFUDIAMONDSHOVEL);

		singleTex(TofuItems.ARMOR_TOFU_KINUHELMET);
		singleTex(TofuItems.ARMOR_TOFU_KINUCHESTPLATE);
		singleTex(TofuItems.ARMOR_TOFU_KINULEGGINGS);
		singleTex(TofuItems.ARMOR_TOFU_KINUBOOTS);

		singleTex(TofuItems.ARMOR_TOFU_MOMENHELMET);
		singleTex(TofuItems.ARMOR_TOFU_MOMENCHESTPLATE);
		singleTex(TofuItems.ARMOR_TOFU_MOMENLEGGINGS);
		singleTex(TofuItems.ARMOR_TOFU_MOMENBOOTS);

		singleTex(TofuItems.ARMOR_TOFU_SOLIDHELMET);
		singleTex(TofuItems.ARMOR_TOFU_SOLIDCHESTPLATE);
		singleTex(TofuItems.ARMOR_TOFU_SOLIDLEGGINGS);
		singleTex(TofuItems.ARMOR_TOFU_SOLIDBOOTS);

		singleTex(TofuItems.ARMOR_TOFU_METALHELMET);
		singleTex(TofuItems.ARMOR_TOFU_METALCHESTPLATE);
		singleTex(TofuItems.ARMOR_TOFU_METALLEGGINGS);
		singleTex(TofuItems.ARMOR_TOFU_METALBOOTS);

		singleTex(TofuItems.ARMOR_TOFU_DIAMONDHELMET);
		singleTex(TofuItems.ARMOR_TOFU_DIAMONDCHESTPLATE);
		singleTex(TofuItems.ARMOR_TOFU_DIAMONDLEGGINGS);
		singleTex(TofuItems.ARMOR_TOFU_DIAMONDBOOTS);
	}

	private ItemModelBuilder generated(String name, ResourceLocation... layers) {
		ItemModelBuilder builder = withExistingParent(name, "item/generated");
		for (int i = 0; i < layers.length; i++) {
			builder = builder.texture("layer" + i, layers[i]);
		}
		return builder;
	}

	private ItemModelBuilder singleTexTool(Item item) {
		return tool(item.getRegistryName().getPath(), prefix("items/" + item.getRegistryName().getPath()));
	}

	private ItemModelBuilder tool(String name, ResourceLocation... layers) {
		ItemModelBuilder builder = withExistingParent(name, "item/handheld");
		for (int i = 0; i < layers.length; i++) {
			builder = builder.texture("layer" + i, layers[i]);
		}
		return builder;
	}

	private ItemModelBuilder singleTex(Item item) {
		return generated(item.getRegistryName().getPath(), prefix("items/" + item.getRegistryName().getPath()));
	}

	private ItemModelBuilder bowItem(String name, ResourceLocation... layers) {
		ItemModelBuilder builder = withExistingParent(name, "item/bow");
		for (int i = 0; i < layers.length; i++) {
			builder = builder.texture("layer" + i, layers[i]);
		}
		return builder;
	}

	private ItemModelBuilder bowTex(RegistryObject<Item> item, ModelFile pull0, ModelFile pull1, ModelFile pull2) {
		return bowItem(item.getId().getPath(), prefix("items/" + item.getId().getPath()))
				.override().predicate(new ResourceLocation("pulling"), 1).model(pull0).end()
				.override().predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), (float) 0.65).model(pull1).end()
				.override().predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), (float) 0.9).model(pull2).end();
	}

	private void woodenButton(Block button, String variant) {
		getBuilder(button.getRegistryName().getPath())
				.parent(getExistingFile(mcLoc("block/button_inventory")))
				.texture("texture", "block/wood/planks_" + variant + "_0");
	}

	private void woodenFence(Block fence, String variant) {
		getBuilder(fence.getRegistryName().getPath())
				.parent(getExistingFile(mcLoc("block/fence_inventory")))
				.texture("texture", "block/wood/planks_" + variant + "_0");
	}

	private void toBlock(Block b) {
		toBlockModel(b, b.getRegistryName().getPath());
	}

	private void toBlockModel(Block b, String model) {
		toBlockModel(b, prefix("block/" + model));
	}

	private void toBlockModel(Block b, ResourceLocation model) {
		withExistingParent(b.getRegistryName().getPath(), model);
	}

	@Override
	public String getName() {
		return "TofuCraftReload item and itemblock models";
	}
}