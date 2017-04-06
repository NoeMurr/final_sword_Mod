package it.noemurr.final_sword.init;

import it.noemurr.final_sword.items.ItemFinalSword;
import it.noemurr.final_sword.items.ItemFinalSwordBlade;
import it.noemurr.final_sword.items.ItemFinalSwordHilt;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author <a href="mailto:noe.murr@outlook.com">Noè Murr</a>
 *         <p>
 *         insert a description.
 */
public class Items {

    public static ItemFinalSwordHilt finalSwordHilt;
    public static ItemFinalSwordBlade finalSwordBlade;
    public static ItemFinalSword finalSword;

    /**
     this function will register all items of the mod
     */
    public static void init(){
        finalSword = new ItemFinalSword();
        finalSwordHilt = new ItemFinalSwordHilt();
        finalSwordBlade = new ItemFinalSwordBlade();

        finalSwordBlade.register();
        finalSwordHilt.register();
        finalSword.register();
    }

    /**
     * this function will register all the renders of the items
     * @param mesher
     */
    @SideOnly(Side.CLIENT)
    public static void initClient(ItemModelMesher mesher){
        finalSwordBlade.registerRender(mesher);
        finalSwordHilt.registerRender(mesher);
        finalSword.registerRender(mesher);
        finalSwordHilt.setCreativeTab();
        finalSwordBlade.setCreativeTab();
        finalSword.setCreativeTab();

    }

    public static void initRecepies(){
        finalSwordHilt.addRecepies();
        finalSwordBlade.addRecepies();
        finalSword.addRecepies();
    }
}
