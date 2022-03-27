package fluxe.world.quicko.items;

import fluxe.world.quicko.Quicko;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


import static net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder.build;

public class qoGroups {
        public static final ItemGroup QUICKO_APM = build(
                Quicko.locate("QUICKO_APM"),
                () -> new ItemStack(qoList.HONING_SUGAR));

       /* public static final ItemGroup QUICKO_HOOKS = build(
                Quicko.locate("QUICKO_HOOKS:"),
                () -> new ItemStack(qoList.OUTPUT_HOOK));*/
}

