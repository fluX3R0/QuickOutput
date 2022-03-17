package fluxe.world.quicko;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Quicko implements ModInitializer {

    //ItemGroups
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("tutorial", "general"),
            () -> new ItemStack(Blocks.COBBLESTONE));
    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("tutorial", "other"))
            .icon(() -> new ItemStack(Items.BOWL))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Blocks.BONE_BLOCK));
                stacks.add(new ItemStack(Items.APPLE));
                stacks.add(PotionUtil.setPotion(new ItemStack(Items.POTION), Potions.WATER));
                stacks.add(ItemStack.EMPTY);
                stacks.add(ItemStack.EMPTY);
                stacks.add(new ItemStack(Items.IRON_SHOVEL));
            })
            .build();


    //TODO
    //  - add custom item
    //  - add custom texture
    //  - add custom itemGroups
    //  - display custom itemGroup via Creative mode ItemGroups


    //Item
    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Item HONING_SUGAR = new Item(new FabricItemSettings().group(ItemGroup.MISC));


    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), FABRIC_ITEM);
        Registry.register(Registry.ITEM, new Identifier("quicko", "honing_sugar"), HONING_SUGAR);
    }
}
