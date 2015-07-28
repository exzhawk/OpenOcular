package me.exz.openocular;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import li.cil.oc.api.CreativeTab;
import net.minecraft.block.Block;

@SuppressWarnings("unused")
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class OpenOcular {
    public static Block Alarm;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        BlockOpenOcular blockOpenOcular=new BlockOpenOcular();
        GameRegistry.registerBlock(blockOpenOcular,"openocular");
        blockOpenOcular.setCreativeTab(CreativeTab.instance);
        GameRegistry.registerTileEntity(TileOpenOcular.class,"OpenOcularTE");
    }

}
