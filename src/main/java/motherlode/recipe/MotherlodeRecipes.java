package motherlode.recipe;

import motherlode.Motherlode;
import motherlode.recipe.ingredient.IRecipeIngredient;
import motherlode.recipe.ingredient.ItemIngredient;
import motherlode.recipe.ingredient.OreIngredient;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;

public class MotherlodeRecipes {

	public static HashMap<ResourceLocation, IMotherlodeRecipe> CRAFTING_RECIPES = new HashMap<>();

	public static void addRecipes() {
		addCraftingRecipes();
		addSmeltingRecipes();
	}

	public static void addCraftingRecipes() {
		CRAFTING_RECIPES.clear();
		addBasicRecipe("crafting_table", new ItemStack(Blocks.CRAFTING_TABLE), new ItemIngredient(Blocks.PLANKS, 4, 0));
		addBasicRecipe("oak_planks", new ItemStack(Blocks.PLANKS, 4, 0), new ItemIngredient(Blocks.LOG, 1, 0));
		addBasicRecipe("sticks", new ItemStack(Items.STICK, 4), new OreIngredient("plankWood", 2));
		addBasicRecipe("golden_sword", new ItemStack(Items.GOLDEN_SWORD), new OreIngredient("ingotGold", 2), new OreIngredient("stickWood"));
	}

	public static void addSmeltingRecipes() {

	}

	private static void addBasicRecipe(String registryName, ItemStack output, IRecipeIngredient... inputs) {
		addBasicRecipe(new ResourceLocation(Motherlode.MOD_ID, registryName), output, inputs);
	}

	private static void addCraftingRecipe(String registryName, ItemStack output, IRecipeIngredient... inputs) {
		addCraftingRecipe(new ResourceLocation(Motherlode.MOD_ID, registryName), output, inputs);
	}

	private static void addFurnaceRecipe(String registryName, ItemStack output, IRecipeIngredient input) {
		addFurnaceRecipe(new ResourceLocation(Motherlode.MOD_ID, registryName), output, input);
	}

	public static void addBasicRecipe(ResourceLocation registryName, ItemStack output, IRecipeIngredient... inputs) {
		addTableRecipe(RecipeTable.NONE, registryName, output, inputs);
	}

	public static void addCraftingRecipe(ResourceLocation registryName, ItemStack output, IRecipeIngredient... inputs) {
		addTableRecipe(RecipeTable.CRAFTING_TABLE, registryName, output, inputs);
	}

	public static void addFurnaceRecipe(ResourceLocation registryName, ItemStack output, IRecipeIngredient input) {
		addRecipe(new SmeltingRecipe(RecipeTable.FURNACE, registryName, output, input));
	}

	public static void addTableRecipe(IRecipeTable table, ResourceLocation registryName, ItemStack output, IRecipeIngredient... inputs) {
		addRecipe(new TableRecipe(table, registryName, output, inputs));
	}

	public static void addRecipe(IMotherlodeRecipe recipe) {
		CRAFTING_RECIPES.put(recipe.getRegistryName(), recipe);
	}
}