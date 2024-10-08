package ru.kochkaev.seasons.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Implements;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.kochkaev.api.seasons.provider.Challenge;
import ru.kochkaev.seasons.challenge.WarmingStew;

import java.util.Collections;

@Mixin(ServerPlayerEntity.class)
public abstract class ServerPlayerEntityMixin extends PlayerEntity {


    public ServerPlayerEntityMixin(World world, BlockPos pos, float yaw, GameProfile gameProfile) {
        super(world, pos, yaw, gameProfile);
    }

    @Inject(method = "consumeItem", at = @At("HEAD"), cancellable = true)
    protected void consumeItem(CallbackInfo ci){
        if (!this.activeItemStack.isEmpty() && this.isUsingItem()) {
            WarmingStew challenge = (WarmingStew) Challenge.getChallengeByID("WarmingStew");
            if (!challenge.onConsume((PlayerEntity) this)) ci.cancel();
        }
    }

//    @Shadow(prefix="seasonsChallenges$")
//    public abstract boolean seasonsChallenges$isSpectator();
//    public boolean isSpectator() {
//        return false;
//    }
//    @Shadow(prefix="seasonsChallenges$")
//    public abstract boolean seasonsChallenges$isCreative();
//    public boolean isCreative() {
//        return false;
//    }
}
