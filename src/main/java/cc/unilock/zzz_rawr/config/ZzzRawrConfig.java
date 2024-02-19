package cc.unilock.zzz_rawr.config;

import folk.sisby.kaleido.api.ReflectiveConfig;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Comment;
import folk.sisby.kaleido.lib.quiltconfig.api.values.TrackedValue;
import folk.sisby.kaleido.lib.quiltconfig.api.values.ValueList;
import net.fabricmc.loader.api.FabricLoader;

public class ZzzRawrConfig extends ReflectiveConfig {
	public static final ZzzRawrConfig INSTANCE = ZzzRawrConfig.createToml(FabricLoader.getInstance().getConfigDir(), "zzz_rawr", "config", ZzzRawrConfig.class);

	@Comment("List of messages to send (one will be chosen at random)")
	public final TrackedValue<ValueList<String>> messages = value(ValueList.create("",
			"Wakey, wakey, rise and shine... Good Morning everyone!",
			"zzz... rrr... Rawr?"
	));
}
