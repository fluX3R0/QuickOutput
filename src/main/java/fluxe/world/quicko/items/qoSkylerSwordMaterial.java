package fluxe.world.quicko.items;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class qoSkylerSwordMaterial implements ToolMaterial {

    public static final qoSkylerSwordMaterial INSTANCE = new qoSkylerSwordMaterial();

    @Override
    public int getDurability() {
        return 1337;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0.0F;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.PUFFERFISH);
    }

}
