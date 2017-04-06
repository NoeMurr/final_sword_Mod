package it.noemurr.final_sword.common;

import it.noemurr.final_sword.init.Items;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author <a href="mailto:noe.murr@outlook.com">Noè Murr</a>
 *         <p>
 *         insert a description.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        Items.init();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {
        Items.initRecepies();
    }
}
