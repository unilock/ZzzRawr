package cc.unilock.zzz_rawr;

import cc.unilock.zzz_rawr.config.ZzzRawrConfig;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.config.v2.QuiltConfig;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ZzzRawr implements ModInitializer {
	//public static final Logger LOGGER = LoggerFactory.getLogger("zzz... rrr... Rawr?");
	public static final ZzzRawrConfig CONFIG = QuiltConfig.create("zzz_rawr", "config", ZzzRawrConfig.class);

	@Override
	public void onInitialize(ModContainer mod) {
		//LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}
}
