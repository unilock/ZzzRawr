package cc.unilock.zzz_rawr;

import cc.unilock.zzz_rawr.config.ZzzRawrConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZzzRawr implements ModInitializer {
	public static final String ID = "zzz_rawr";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);
	public static final ZzzRawrConfig CONFIG = ZzzRawrConfig.createToml(FabricLoader.getInstance().getConfigDir(), "zzz_rawr", "config", ZzzRawrConfig.class);

	@Override
	public void onInitialize() {
		LOGGER.info("zzz... rrr... Rawr?");
	}
}
