package it.noemurr.final_sword.items;

import it.noemurr.final_sword.Names;
import it.noemurr.final_sword.References;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author <a href="mailto:noe.murr@outlook.com">Noè Murr</a>
 *         <p>
 *         insert a description.
 */
public class ItemFinalSwordBlade extends Item {

    public void setCreativeTab(){
        setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + References.RESOURCE_PREFIX + Names.FINAL_SWORD_BLADE;
    }

    public void register(){
        setRegistryName(new ResourceLocation(References.MOD_ID, Names.FINAL_SWORD_BLADE));
        GameRegistry.register(this);
    }

    public void registerRender(ItemModelMesher mesher){
        // first generate the model
        ModelResourceLocation model = new ModelResourceLocation(References.RESOURCE_PREFIX + Names.FINAL_SWORD_BLADE,
                "inventory");
        // register in the model loader (tell him to load the model when it is time)
        ModelLoader.registerItemVariants(this, model);
        // mesher
        mesher.register(this, 0, model);
    }

    public void addRecepies() {
        GameRegistry.addShapedRecipe(new ItemStack(this, 1, 0),
                " o ", "obo","obo",
                'b', new ItemStack(Items.BLAZE_ROD, 1, 0),
                'o', new ItemStack(Blocks.OBSIDIAN, 1, 0));
    }
}
