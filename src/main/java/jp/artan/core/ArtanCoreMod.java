package jp.artan.core;

import jp.artan.core.event.clock.RightClickHarvesting;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ArtanCoreMod.MODID, name = ArtanCoreMod.NAME, version = ArtanCoreMod.VERSION, dependencies = ArtanCoreMod.DEPENDENCIES)
public class ArtanCoreMod {
    public static final String MODID = "artancoremod";
    public static final String NAME = "Artan Core Mod";
    public static final String VERSION = "1.0";
    public static final String DEPENDENCIES = "required:forge@[14.23.5.2838,);";

    @Mod.Instance(ArtanCoreMod.MODID)
    public static ArtanCoreMod instance;

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        RightClickHarvesting.instance.register();
    }
}
