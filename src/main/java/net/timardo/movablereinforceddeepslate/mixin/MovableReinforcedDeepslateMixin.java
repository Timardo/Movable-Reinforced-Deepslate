package net.timardo.movablereinforceddeepslate.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PistonBlock;

import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;

@Mixin(PistonBlock.class)
public abstract class MovableReinforcedDeepslateMixin {
    
    private static final String TARGET_DESC = "Lnet/minecraft/block/Blocks;REINFORCED_DEEPSLATE:Lnet/minecraft/block/Block;";
    
    @ModifyExpressionValue(method = "isMovable", at = @At(value = "FIELD", target = TARGET_DESC, opcode = Opcodes.GETSTATIC))
    private static Block replaceReinforcedDeepslate(Block original) {
        return Blocks.AIR;
    }
}
