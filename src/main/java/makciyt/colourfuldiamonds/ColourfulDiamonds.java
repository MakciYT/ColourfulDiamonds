package makciyt.colourfuldiamonds;

import makciyt.colourfuldiamonds.init.ModBlocks;
import makciyt.colourfuldiamonds.init.ModItems;
import makciyt.colourfuldiamonds.world.OreGeneration;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ColourfulDiamonds.MOD_ID)
public class ColourfulDiamonds
{
    public static  final String MOD_ID = "colourfuldiamonds";
    public static final Logger LOGGER = LogManager.getLogger();
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public ColourfulDiamonds() {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}