package cc.unilock.zzz_rawr.config;

import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueList;
import org.quiltmc.loader.api.config.v2.QuiltConfig;

public class ZzzRawrConfig extends ReflectiveConfig {
	public static final ZzzRawrConfig INSTANCE = QuiltConfig.create("zzz_rawr", "config", ZzzRawrConfig.class);

	@Comment("List of messages to send (one will be chosen at random)")
	public final TrackedValue<ValueList<String>> messages = this.list("",
			"Wakey, wakey, rise and shine... Good Morning everyone!",
			"zzz... rrr... Rawr?"
	);
}
