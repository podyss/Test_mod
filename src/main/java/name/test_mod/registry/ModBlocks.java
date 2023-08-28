package name.test_mod.registry;

import name.test_mod.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.create().strength(4.0f).requiresTool()));
    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().strength(4.0f).requiresTool(),UniformIntProvider.create(2,6)));
    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().strength(4.0f).requiresTool(),UniformIntProvider.create(2,6)));
    public static Block registerBlock(String name, Block block){

        ModItems.registerItem(name,new BlockItem(block,new FabricItemSettings()));
        return Registry.register(Registries.BLOCK,new Identifier(TestMod.MOD_ID,name),block);
    }
    public static void registerModBlocks(){
        TestMod.LOGGER.info("Registering Mod Blocks for "+ TestMod.MOD_ID);
    }
}
