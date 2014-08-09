package tppitweaks.recipetweaks.modTweaks;

import net.minecraft.block.Block;
import tppitweaks.config.ConfigurationHandler;
import tterrag.rtc.RecipeRemoval;
import tterrag.rtc.TweakingRegistry;
import tterrag.rtc.TweakingRegistry.TweakingAction;

import com.advGenetics.AdvGenetics;

public class AdvancedGeneticsTweaks {

	@RecipeRemoval(requiredModids="advancedgenetics")
	public static void init() 
	{
		if(ConfigurationHandler.disableAGAutoOutputter) 
		{
			TweakingRegistry.markItemForRecipeRemoval(com.advGenetics.AdvGenetics.autoOutputUpgrade.itemID, -1, TweakingAction.REMOVED, "Crashes the game");
		}
		
		if (ConfigurationHandler.disableAGHealCrystal)
		{
			TweakingRegistry.markItemForRecipeRemoval(AdvGenetics.healCrystal.itemID, -1, TweakingAction.REMOVED, "It's a crashaholic");
		}
	
		TweakingRegistry.addTweakedTooltip(((Block) AdvGenetics.dnaAnalyser).blockID, -1, TweakingAction.NOTE, "Removed genes:", " - Flight", " - Extra Health");
		TweakingRegistry.addTweakedTooltip(((Block) AdvGenetics.dnaEncoder).blockID, -1, TweakingAction.NOTE, "Removed genes:", " - Flight", " - Extra Health");
		TweakingRegistry.addTweakedTooltip(((Block) AdvGenetics.dnaExtractor).blockID, -1, TweakingAction.NOTE, "Removed genes:", " - Flight", " - Extra Health");
		TweakingRegistry.addTweakedTooltip(((Block) AdvGenetics.dnaSplitter).blockID, -1, TweakingAction.NOTE, "Removed genes:", " - Flight", " - Extra Health");
	}	
}