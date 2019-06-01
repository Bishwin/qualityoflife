package in.bishw.qualityoflife.common;

import in.bishw.qualityoflife.common.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = QualityOfLife.MODID, name = QualityOfLife.NAME, version = QualityOfLife.VERSION)
public class QualityOfLife {
    public static final String MODID = "qol";
    public static final String NAME = "Quality of Life";
    public static final String VERSION = "0.0.1";

    private static Logger logger;

    @SidedProxy(clientSide = "in.bishw.qualityoflife.common.proxy.ClientProxy", serverSide = "in.bishw.qualityoflife.common.proxy.ServerSide")
    public static CommonProxy proxy;

    public static QualityOfLife instance;

    public static CreativeTabs creativeTab = new CreativeTabs(0, "Quality of Life") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlock.blockFastFurnace);
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
