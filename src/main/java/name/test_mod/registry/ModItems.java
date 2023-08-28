package name.test_mod.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import name.test_mod.TestMod;


public class ModItems {
    public static final Item CITRINE = registerItem("citrine",new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine",new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,new Identifier(TestMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        TestMod.LOGGER.info("Registering Mod Items for "+ TestMod.MOD_ID);

    }
}
