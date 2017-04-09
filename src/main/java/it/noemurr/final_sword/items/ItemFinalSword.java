package it.noemurr.final_sword.items;

import it.noemurr.final_sword.Names;
import it.noemurr.final_sword.References;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author <a href="mailto:noe.murr@outlook.com">Noè Murr</a>
 *         <p>
 *         insert a description.
 */
public class ItemFinalSword extends ItemSword {

    public ItemFinalSword() {
        //noinspection ConstantConditions
        super(EnumHelper.addToolMaterial(
                "tutorial_material", 3, Integer.MAX_VALUE, 8.0f,
                2.8f, 0));
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + References.RESOURCE_PREFIX + Names.FINAL_SWORD; // name
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        return false; // no damage to the item
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        return false; // no damage when a block is destroyed.
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    public void addRecepies(){
        GameRegistry.addShapedRecipe(new ItemStack(this, 1, 0),
                "   ", " b "," h ",
                'b', it.noemurr.final_sword.init.Items.finalSwordBlade,
                'h', it.noemurr.final_sword.init.Items.finalSwordHilt);
    }

    public void register(){
        setRegistryName(new ResourceLocation(References.MOD_ID, Names.FINAL_SWORD));
        GameRegistry.register(this);
    }

    public void registerRender(ItemModelMesher mesher){
        // first generate the model
        ModelResourceLocation model = new ModelResourceLocation(References.RESOURCE_PREFIX + Names.FINAL_SWORD,
                "inventory");
        // register in the model loader (tell him to load the model when it is time)
        ModelLoader.registerItemVariants(this, model);
        // mesher
        mesher.register(this, 0, model);
    }

}
