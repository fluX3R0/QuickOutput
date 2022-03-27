package fluxe.world.quicko.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class qoPickaxeMaterial implements ToolMaterial {

    public static final qoPickaxeMaterial INSTANCE = new qoPickaxeMaterial();

        @Override
        public int getDurability() {
            return 5000;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 0;
        }

        @Override
        public float getAttackDamage() {
            return 0;
        }

        @Override
        public int getMiningLevel() {
            return 5;
        }

        @Override
        public int getEnchantability() {
            return 22;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.LAVA_BUCKET);
        }

}
