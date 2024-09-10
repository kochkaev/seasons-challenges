package ru.kochkaev.seasons.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.kochkaev.api.seasons.provider.Challenge;
import ru.kochkaev.seasons.challenge.Devastation;

import java.util.Collections;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(method = "heal", at = @At("HEAD"), cancellable = true)
    public void heal(float amount, CallbackInfo ci)  {
        LivingEntity entity = (LivingEntity) (Object) this;
        Devastation challenge = (Devastation)Challenge.getChallengeByID("Devastation");
        if (!challenge.onHeal(entity)) ci.cancel();
    }
}
