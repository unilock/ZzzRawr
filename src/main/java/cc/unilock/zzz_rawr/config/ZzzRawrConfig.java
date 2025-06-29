package cc.unilock.zzz_rawr.config;

import folk.sisby.kaleido.api.ReflectiveConfig;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Comment;
import folk.sisby.kaleido.lib.quiltconfig.api.values.TrackedValue;
import folk.sisby.kaleido.lib.quiltconfig.api.values.ValueList;

public class ZzzRawrConfig extends ReflectiveConfig {
	@Comment("List of messages to send (one will be chosen at random)")
	public final TrackedValue<ValueList<String>> messages = value(ValueList.create("",
			"Wakey, wakey, rise and shine... Good Morning everyone!",
			"zzz... rrr... Rawr?"
	));
}
