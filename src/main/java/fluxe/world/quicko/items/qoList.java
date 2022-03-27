package fluxe.world.quicko.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.registry.Registry;

import static fluxe.world.quicko.items.qoGroups.QUICKO_APM;

public class qoList {


        /* private static FabricItemSettings Apm() {
            return new FabricItemSettings().group(qoGroups.QUICKO_APM);
        } */
        // Material options
        public static final ArmorMaterial QO_ARMOR_MATERIAL = new qoArmorMaterial();




        // private static final Settings Apm = Apm();
        // Consumables
        public static final Item HONING_SUGAR = new Item(new FabricItemSettings().group(ItemGroup.MISC));

        // Tools
        //public static final Item OUTPUT_HOOK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
        public static final ToolItem THIMBLE_SWORD = new SwordItem(qoSkylerSwordMaterial.INSTANCE, 3000, -1.0F, new Item.Settings().group(ItemGroup.COMBAT));
        public static final ToolItem SKYLER_PICKAXE = new qoPickAxe(qoPickaxeMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));

        // Armor
        public static final Item RAINBOW_LEGS = new ArmorItem(QO_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));



    //public static final Item OUTPUT_HOOK = new Item(new FabricItemSettings().group(QUICKO_APM));
        public static void init() {
            registerItem("honing_sugar", HONING_SUGAR);
            // registerItem("output_hook", OUTPUT_HOOK);
            registerItem("thimble_sword", THIMBLE_SWORD);
            registerItem("skyler_pickaxe", SKYLER_PICKAXE);
            registerItem("rainbow_legs", RAINBOW_LEGS);

        }
        public static Item registerItem(String iid,Item itn) {
            Registry.register(Registry.ITEM, new Identifier("quicko", iid), itn);
            return itn;
        }
}
