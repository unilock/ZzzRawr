package cc.unilock.zzz_rawr.config;

import folk.sisby.kaleido.api.WrappedConfig;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Comment;
import folk.sisby.kaleido.lib.quiltconfig.api.values.ValueList;

import java.util.List;

public class ZzzRawrConfig extends WrappedConfig {
	@Comment("List of messages to send (one will be chosen at random)")
	public final List<String> messages = ValueList.create("",
			"Wakey, wakey, rise and shine... Good Morning everyone!",
			"zzz... rrr... Rawr?"
	);
}
