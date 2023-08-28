package name.test_mod.registry;

import name.test_mod.TestMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CITRINE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID,"citrine"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.citrine"))
                    .icon(()->new ItemStack(ModItems.CITRINE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CITRINE);
                        entries.add(ModItems.RAW_CITRINE);
                        entries.add(ModBlocks.CITRINE_BLOCK);
                        entries.add(ModBlocks.CITRINE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_CITRINE_ORE);
                    }).build());
    public static void registerItemGroups(){
        TestMod.LOGGER.info("Registering Items Groups for " +TestMod.MOD_ID);
    }
}
