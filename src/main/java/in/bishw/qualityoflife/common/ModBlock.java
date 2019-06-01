package in.bishw.qualityoflife.common;

import in.bishw.qualityoflife.common.furnace.BlockFastFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlock {

    @GameRegistry.ObjectHolder("qualityoflife:fast_furnace")
    public static BlockFastFurnace blockFastFurnace;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        blockFastFurnace.initModel();
    }
}
