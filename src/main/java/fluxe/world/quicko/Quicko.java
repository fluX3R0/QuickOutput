package fluxe.world.quicko;

import fluxe.world.quicko.items.qoGroups;
import fluxe.world.quicko.items.qoList;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quicko implements ModInitializer {
    public static final String MOD_ID = "quicko";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);
    /**
     * Creates a new {@link Identifier} based on the passed location.
     * <p>
     * If the location contains a collin `:` it will be split and handled like normal, otherwise it will use the default
     * namespace contained in {@link #MOD_ID} instead of the default "minecraft" namespace.
     *
     * @param location The location to use
     * @return The new {@link Identifier} instance
     */
    public static Identifier locate(String location) {
        if (location.contains(":")) {
            return new Identifier(location);
        } else {
            return new Identifier(MOD_ID, location);
        }
    }

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
            }).build();

    //TODO
    //  - add custom item
    //  - add custom texture
    //  - add custom itemGroups
    //  - display custom itemGroup via Creative mode ItemGroups



    //Item


    @Override
    public void onInitialize() {
        qoList.init();
    }
}
