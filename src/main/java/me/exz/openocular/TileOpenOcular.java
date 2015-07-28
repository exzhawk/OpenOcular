package me.exz.openocular;

import cpw.mods.fml.common.Optional;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.SimpleComponent;
import net.minecraft.tileentity.TileEntity;

@Optional.Interface(iface = "li.cil.oc.api.network.SimpleComponent", modid = "OpenComputers")
public class TileOpenOcular extends TileEntity implements SimpleComponent {
    @Override
    public String getComponentName() {
        return "open_ocular";
    }


    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] test(Context context, Arguments arguments) {
        return new Object[]{String.format("Hello, %s!", arguments.checkString(0))};

    }
}
