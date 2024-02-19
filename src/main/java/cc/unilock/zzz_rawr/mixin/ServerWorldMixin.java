package cc.unilock.zzz_rawr.mixin;

import cc.unilock.zzz_rawr.config.ZzzRawrConfig;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.BooleanSupplier;

@Mixin(ServerWorld.class)
public class ServerWorldMixin {
	@Inject(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/world/ServerWorld;wakeSleepingPlayers()V"))
	public void onWakeSleepingPlayers(BooleanSupplier shouldKeepTicking, CallbackInfo ci) {
		((ServerWorld) (Object) this).getServer().getPlayerManager().broadcast(Text.literal(ZzzRawrConfig.INSTANCE.messages.value().get(((ServerWorld) (Object) this).getRandom().nextInt(ZzzRawrConfig.INSTANCE.messages.value().size()))).formatted(Formatting.GOLD), false);
	}
}
