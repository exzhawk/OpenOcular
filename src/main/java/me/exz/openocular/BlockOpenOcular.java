package me.exz.openocular;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockOpenOcular extends BlockContainer {
    public BlockOpenOcular() {
        super(Material.iron);
        setHardness(5F);
        setResistance(30F);
        setBlockName("openocular");
        setBlockTextureName("openocular:openocular");
    }

    @Override
    public TileEntity createNewTileEntity(World par1, int par2) {
        return new TileOpenOcular();
    }
}
