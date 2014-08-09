package tppitweaks.recipetweaks.modTweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import tppitweaks.config.ConfigurationHandler;
import tterrag.rtc.RecipeAddition;
import tterrag.rtc.RecipeRemoval;
import tterrag.rtc.TweakingRegistry;
import tterrag.rtc.TweakingRegistry.TweakingAction;
import cpw.mods.fml.common.registry.GameRegistry;
import crazypants.enderio.Config;
import crazypants.enderio.EnderIO;

public class EnderIOTweaks
{
	@RecipeRemoval(requiredModids="EnderIO")
	public static void init()
	{
		if (ConfigurationHandler.makeEIOHardModeEasier && Config.useHardRecipes)
		{
			TweakingRegistry.markItemForRecipeRemoval(EnderIO.blockReservoir.blockID, -1, TweakingAction.CHANGED, "Easy 'hardmode' recipe");
			TweakingRegistry.markItemForRecipeRemoval(EnderIO.itemBasicCapacitor.itemID, 0, TweakingAction.CHANGED, "Easy 'hardmode' recipe");
		}
		
	}

	@RecipeAddition(requiredModids="EnderIO")
	public static void addRecipes()
	{
		if (ConfigurationHandler.makeEIOHardModeEasier && Config.useHardRecipes)
		{
			GameRegistry.addRecipe(new ItemStack(EnderIO.blockReservoir), 
					"GGG",
					"QcQ",
					"GGG",
					
					'G', new ItemStack(EnderIO.blockFusedQuartz, 1, 1),
					'Q', new ItemStack(EnderIO.blockFusedQuartz),
					'c', Item.cauldron
			);
			
			GameRegistry.addRecipe(new ShapedOreRecipe(EnderIO.itemBasicCapacitor,
					" CR",
					"CGC",
					"RC ",
					
					'C', "ingotCopper",
					'R', "dustRedstone",
					'G', "ingotGold"
			));
		}
	}
}
