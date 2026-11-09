package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class iv {
@Nullable
private class_6364 U;
@Nullable
private class_6364 O;
private boolean I;
private static final long a = yz.a(-6069123381226583021L, -4246976263572382941L, MethodHandles.lookup().lookupClass()).a(263357040169584L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@Nullable
public final class_6364 d() {
return this.U;
}

public final void q(@Nullable class_6364 <set-?>) {
this.U = <set-?>;
}

@Nullable
public final class_6364 w() {
return this.O;
}

public final void A(@Nullable class_6364 <set-?>) {
this.O = <set-?>;
}

public final boolean C() {
return this.I;
}

public final void V(boolean <set-?>) {
this.I = <set-?>;
}

public final void V(@NotNull class_4587 stack, boolean crystals, long a, int vDistance, int hDistance) {
ax = a ^ ax;
long var10001 = ax ^ 113367984972499L;
int var7 = (int)((ax ^ 113367984972499L) >>> 48);
int var8 = (int)((ax ^ 113367984972499L) << 16 >>> 48);
int var9 = (int)(var10001 << 32 >>> 32);
long var10 = ax ^ 118888592761640L;
Intrinsics.checkNotNullParameter(stack, a<"y">(25157, 8129070980662351188L ^ ax));
this.I = true;
this.E((char)var7, (short)var8, var9);
this.m(stack, crystals, var10, vDistance, hDistance);
this.I = false;
}

public final void O(
@NotNull rw mode,
@NotNull Color color,
boolean glass,
boolean borders,
float radiusValue,
float distanceValue,
int a,
float glowAlphaValue,
float lineWidthValue,
int colorModev,
@NotNull Color color1v,
@NotNull Color color2v,
int glowQualityV,
short a,
float glowRadiusV,
float glowAlphaMultV,
float fillAlphaMultV,
float saturationV,
char a,
float brightnessV,
float alpha
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 7
// 002: i2l
// 003: bipush 32
// 005: lshl
// 006: iload 14
// 008: i2l
// 009: bipush 48
// 00b: lshl
// 00c: bipush 32
// 00e: lushr
// 00f: lor
// 010: iload 19
// 012: i2l
// 013: bipush 48
// 015: lshl
// 016: bipush 48
// 018: lushr
// 019: lor
// 01a: getstatic su/catlean/iv.a J
// 01d: lxor
// 01e: lstore 22
// 020: lload 22
// 022: dup2
// 023: ldc2_w 124763248849556
// 026: lxor
// 027: lstore 24
// 029: pop2
// 02a: aload 1
// 02b: sipush 16971
// 02e: ldc2_w 1692443746975413438
// 031: lload 22
// 033: lxor
// 034: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03c: ldc2_w 600413366321122106
// 03f: lload 22
// 041: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: aload 2
// 047: sipush 17588
// 04a: ldc2_w 7487823146745655878
// 04d: lload 22
// 04f: lxor
// 050: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 058: istore 26
// 05a: aload 11
// 05c: sipush 27507
// 05f: ldc2_w 4307660606747499918
// 062: lload 22
// 064: lxor
// 065: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06d: aload 12
// 06f: sipush 14543
// 072: ldc2_w 5516840773046341175
// 075: lload 22
// 077: lxor
// 078: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 080: aload 0
// 081: getfield su/catlean/iv.U Lnet/minecraft/class_6364;
// 084: iload 26
// 086: ifne 0c4
// 089: ifnull 0c7
// 08c: goto 09a
// 08f: ldc2_w 636574080626451843
// 092: lload 22
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: aload 0
// 09b: iload 26
// 09d: iload 14
// 09f: ifge 108
// 0a2: ifne 107
// 0a5: goto 0b3
// 0a8: ldc2_w 636574080626451843
// 0ab: lload 22
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: getfield su/catlean/iv.O Lnet/minecraft/class_6364;
// 0b6: goto 0c4
// 0b9: ldc2_w 636574080626451843
// 0bc: lload 22
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: ifnonnull 0c8
// 0c7: return
// 0c8: aload 0
// 0c9: bipush 1
// 0ca: putfield su/catlean/iv.I Z
// 0cd: getstatic su/catlean/kg.W Lsu/catlean/kg;
// 0d0: aload 1
// 0d1: aload 2
// 0d2: aload 0
// 0d3: getfield su/catlean/iv.U Lnet/minecraft/class_6364;
// 0d6: dup
// 0d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0da: aload 0
// 0db: getfield su/catlean/iv.O Lnet/minecraft/class_6364;
// 0de: dup
// 0df: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0e2: iload 3
// 0e3: iload 4
// 0e5: fload 5
// 0e7: fload 6
// 0e9: fload 8
// 0eb: fload 9
// 0ed: iload 10
// 0ef: aload 11
// 0f1: aload 12
// 0f3: iload 13
// 0f5: lload 24
// 0f7: fload 15
// 0f9: fload 16
// 0fb: fload 17
// 0fd: fload 18
// 0ff: fload 20
// 101: fload 21
// 103: invokevirtual su/catlean/kg.d (Lsu/catlean/rw;Ljava/awt/Color;Lnet/minecraft/class_6364;Lnet/minecraft/class_6364;ZZFFFFILjava/awt/Color;Ljava/awt/Color;IJFFFFFF)V
// 106: aload 0
// 107: bipush 0
// 108: putfield su/catlean/iv.I Z
// 10b: return
}

private final void E(char param1, short param2, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 32
// 012: lshl
// 013: bipush 32
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/iv.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 124083408185243
// 023: lxor
// 024: lstore 6
// 026: pop2
// 027: ldc2_w 8923969018190035127
// 02a: lload 4
// 02c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 031: istore 8
// 033: aload 0
// 034: getfield su/catlean/iv.U Lnet/minecraft/class_6364;
// 037: iload 8
// 039: ifne 084
// 03c: ifnonnull 07c
// 03f: goto 04d
// 042: ldc2_w 8888072169595901454
// 045: lload 4
// 047: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: athrow
// 04d: aload 0
// 04e: new net/minecraft/class_6364
// 051: dup
// 052: lload 6
// 054: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 057: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 05a: getfield net/minecraft/class_276.field_1482 I
// 05d: lload 6
// 05f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 062: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 065: getfield net/minecraft/class_276.field_1481 I
// 068: invokespecial net/minecraft/class_6364.<init> (II)V
// 06b: putfield su/catlean/iv.U Lnet/minecraft/class_6364;
// 06e: goto 07c
// 071: ldc2_w 8888072169595901454
// 074: lload 4
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: lload 6
// 07e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 081: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 084: getfield net/minecraft/class_276.field_1482 I
// 087: aload 0
// 088: getfield su/catlean/iv.U Lnet/minecraft/class_6364;
// 08b: dup
// 08c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 08f: getfield net/minecraft/class_6364.field_1482 I
// 092: iload 2
// 093: iflt 0d0
// 096: iload 8
// 098: ifne 0d0
// 09b: if_icmpne 0d3
// 09e: goto 0ac
// 0a1: ldc2_w 8888072169595901454
// 0a4: lload 4
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: lload 6
// 0ae: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b1: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0b4: getfield net/minecraft/class_276.field_1481 I
// 0b7: aload 0
// 0b8: getfield su/catlean/iv.U Lnet/minecraft/class_6364;
// 0bb: dup
// 0bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0bf: getfield net/minecraft/class_6364.field_1481 I
// 0c2: goto 0d0
// 0c5: ldc2_w 8888072169595901454
// 0c8: lload 4
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: if_icmpeq 102
// 0d3: aload 0
// 0d4: getfield su/catlean/iv.U Lnet/minecraft/class_6364;
// 0d7: dup
// 0d8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0db: lload 6
// 0dd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0e0: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0e3: getfield net/minecraft/class_276.field_1482 I
// 0e6: lload 6
// 0e8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0eb: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0ee: getfield net/minecraft/class_276.field_1481 I
// 0f1: invokevirtual net/minecraft/class_6364.method_1234 (II)V
// 0f4: goto 102
// 0f7: ldc2_w 8888072169595901454
// 0fa: lload 4
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
// 105: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
// 10a: aload 0
// 10b: getfield su/catlean/iv.U Lnet/minecraft/class_6364;
// 10e: dup
// 10f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 112: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 115: dup
// 116: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 119: bipush 0
// 11a: aload 0
// 11b: getfield su/catlean/iv.U Lnet/minecraft/class_6364;
// 11e: dup
// 11f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 122: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 125: dup
// 126: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 129: dconst_1
// 12a: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 12f: aload 0
// 130: getfield su/catlean/iv.O Lnet/minecraft/class_6364;
// 133: iload 1
// 134: iflt 184
// 137: iload 8
// 139: ifne 184
// 13c: ifnonnull 17c
// 13f: goto 14d
// 142: ldc2_w 8888072169595901454
// 145: lload 4
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: aload 0
// 14e: new net/minecraft/class_6364
// 151: dup
// 152: lload 6
// 154: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 157: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 15a: getfield net/minecraft/class_276.field_1482 I
// 15d: lload 6
// 15f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 162: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 165: getfield net/minecraft/class_276.field_1481 I
// 168: invokespecial net/minecraft/class_6364.<init> (II)V
// 16b: putfield su/catlean/iv.O Lnet/minecraft/class_6364;
// 16e: goto 17c
// 171: ldc2_w 8888072169595901454
// 174: lload 4
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: lload 6
// 17e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 181: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 184: getfield net/minecraft/class_276.field_1482 I
// 187: aload 0
// 188: getfield su/catlean/iv.O Lnet/minecraft/class_6364;
// 18b: dup
// 18c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 18f: getfield net/minecraft/class_6364.field_1482 I
// 192: iload 1
// 193: iflt 1d0
// 196: iload 8
// 198: ifne 1d0
// 19b: if_icmpne 1d3
// 19e: goto 1ac
// 1a1: ldc2_w 8888072169595901454
// 1a4: lload 4
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: lload 6
// 1ae: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b1: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 1b4: getfield net/minecraft/class_276.field_1481 I
// 1b7: aload 0
// 1b8: getfield su/catlean/iv.O Lnet/minecraft/class_6364;
// 1bb: dup
// 1bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1bf: getfield net/minecraft/class_6364.field_1481 I
// 1c2: goto 1d0
// 1c5: ldc2_w 8888072169595901454
// 1c8: lload 4
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: if_icmpeq 202
// 1d3: aload 0
// 1d4: getfield su/catlean/iv.O Lnet/minecraft/class_6364;
// 1d7: dup
// 1d8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1db: lload 6
// 1dd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e0: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 1e3: getfield net/minecraft/class_276.field_1482 I
// 1e6: lload 6
// 1e8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1eb: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 1ee: getfield net/minecraft/class_276.field_1481 I
// 1f1: invokevirtual net/minecraft/class_6364.method_1234 (II)V
// 1f4: goto 202
// 1f7: ldc2_w 8888072169595901454
// 1fa: lload 4
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
// 205: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
// 20a: aload 0
// 20b: getfield su/catlean/iv.O Lnet/minecraft/class_6364;
// 20e: dup
// 20f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 212: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 215: dup
// 216: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 219: bipush 0
// 21a: aload 0
// 21b: getfield su/catlean/iv.O Lnet/minecraft/class_6364;
// 21e: dup
// 21f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 222: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 225: dup
// 226: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 229: dconst_1
// 22a: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 22f: return
}

private final void m(class_4587 param1, boolean param2, long param3, int param5, int param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/iv.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 136206454646368
// 00b: lxor
// 00c: lstore 7
// 00e: dup2
// 00f: ldc2_w 121538987064883
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 9
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 10
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 11
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 98215412324065
// 033: lxor
// 034: lstore 12
// 036: pop2
// 037: lload 7
// 039: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 03c: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 03f: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 042: dup
// 043: sipush 21256
// 046: ldc2_w 290989298377250690
// 049: lload 3
// 04a: lxor
// 04b: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 053: astore 15
// 055: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 058: iload 9
// 05a: iload 10
// 05c: i2c
// 05d: iload 11
// 05f: invokevirtual su/catlean/zi.n (ICI)F
// 062: f2d
// 063: dstore 16
// 065: lload 7
// 067: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 06d: invokevirtual net/minecraft/class_315.method_42435 ()Lnet/minecraft/class_7172;
// 070: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
// 073: dup
// 074: sipush 7450
// 077: ldc2_w 954768260996602266
// 07a: lload 3
// 07b: lxor
// 07c: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 084: checkcast java/lang/Boolean
// 087: invokevirtual java/lang/Boolean.booleanValue ()Z
// 08a: istore 18
// 08c: lload 7
// 08e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 091: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 094: invokevirtual net/minecraft/class_315.method_42435 ()Lnet/minecraft/class_7172;
// 097: bipush 0
// 098: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 09b: invokevirtual net/minecraft/class_7172.method_41748 (Ljava/lang/Object;)V
// 09e: ldc2_w -5012040372569010459
// 0a1: lload 3
// 0a2: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 0aa: bipush 1
// 0ab: invokevirtual su/catlean/api/event/GofraState.setModifyBuffer (Z)V
// 0ae: invokestatic com/mojang/blaze3d/systems/RenderSystem.backupProjectionMatrix ()V
// 0b1: lload 7
// 0b3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b6: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 0b9: dup
// 0ba: sipush 1211
// 0bd: ldc2_w 5444420462086848567
// 0c0: lload 3
// 0c1: lxor
// 0c2: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0ca: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 0cd: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.getLevelProjectionMatrixBuffer ()Lnet/minecraft/class_11286; 1
// 0d2: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0d5: invokevirtual su/catlean/zi.s ()Lorg/joml/Matrix4f;
// 0d8: invokevirtual net/minecraft/class_11286.method_71123 (Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
// 0db: invokestatic com/mojang/blaze3d/systems/RenderSystem.getProjectionType ()Lnet/minecraft/class_10366;
// 0de: invokestatic com/mojang/blaze3d/systems/RenderSystem.setProjectionMatrix (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lnet/minecraft/class_10366;)V
// 0e1: lload 12
// 0e3: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0e6: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 0e9: dup
// 0ea: sipush 2922
// 0ed: ldc2_w 3749754919419383778
// 0f0: lload 3
// 0f1: lxor
// 0f2: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0fa: astore 20
// 0fc: nop
// 0fd: bipush 0
// 0fe: istore 21
// 100: aload 20
// 102: astore 22
// 104: new java/util/ArrayList
// 107: dup
// 108: invokespecial java/util/ArrayList.<init> ()V
// 10b: checkcast java/util/Collection
// 10e: astore 23
// 110: istore 14
// 112: bipush 0
// 113: istore 24
// 115: aload 22
// 117: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 11c: astore 25
// 11e: aload 25
// 120: invokeinterface java/util/Iterator.hasNext ()Z 1
// 125: ifeq 1d2
// 128: aload 25
// 12a: lload 3
// 12b: lconst_0
// 12c: lcmp
// 12d: ifle 13a
// 130: iload 14
// 132: ifeq 1e3
// 135: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 13a: astore 26
// 13c: aload 26
// 13e: checkcast net/minecraft/class_1297
// 141: astore 27
// 143: bipush 0
// 144: istore 28
// 146: aload 15
// 148: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 14b: getfield net/minecraft/class_243.field_1352 D
// 14e: aload 27
// 150: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 153: dsub
// 154: aload 15
// 156: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 159: getfield net/minecraft/class_243.field_1350 D
// 15c: aload 27
// 15e: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 161: dsub
// 162: invokestatic java/lang/Math.hypot (DD)D
// 165: iload 6
// 167: i2d
// 168: dcmpg
// 169: iload 14
// 16b: lload 3
// 16c: lconst_0
// 16d: lcmp
// 16e: ifle 1a8
// 171: ifeq 1a6
// 174: ifge 1bf
// 177: goto 184
// 17a: ldc2_w -4997924973627353099
// 17d: lload 3
// 17e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: athrow
// 184: aload 15
// 186: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 189: getfield net/minecraft/class_243.field_1351 D
// 18c: aload 27
// 18e: invokevirtual net/minecraft/class_1297.method_23318 ()D
// 191: dsub
// 192: invokestatic java/lang/Math.abs (D)D
// 195: iload 5
// 197: i2d
// 198: dcmpg
// 199: goto 1a6
// 19c: ldc2_w -4997924973627353099
// 19f: lload 3
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: iload 14
// 1a8: ifeq 1bc
// 1ab: ifge 1bf
// 1ae: goto 1bb
// 1b1: ldc2_w -4997924973627353099
// 1b4: lload 3
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: bipush 1
// 1bc: goto 1c0
// 1bf: bipush 0
// 1c0: ifeq 11e
// 1c3: aload 23
// 1c5: aload 26
// 1c7: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1cc: pop
// 1cd: iload 14
// 1cf: ifne 11e
// 1d2: aload 23
// 1d4: checkcast java/util/List
// 1d7: nop
// 1d8: lload 3
// 1d9: lconst_0
// 1da: lcmp
// 1db: iflt 13a
// 1de: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 1e3: astore 19
// 1e5: aload 19
// 1e7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1ec: ifeq 454
// 1ef: aload 19
// 1f1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1f6: dup
// 1f7: sipush 30189
// 1fa: ldc2_w 1128704362611143020
// 1fd: lload 3
// 1fe: lxor
// 1ff: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 207: checkcast net/minecraft/class_1297
// 20a: astore 20
// 20c: lload 3
// 20d: lconst_0
// 20e: lcmp
// 20f: ifle 4a1
// 212: lload 7
// 214: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 217: iload 14
// 219: ifeq 490
// 21c: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 21f: aload 20
// 221: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 224: invokevirtual su/catlean/zi.K ()Lnet/minecraft/class_4604;
// 227: aload 15
// 229: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 22c: getfield net/minecraft/class_243.field_1352 D
// 22f: aload 15
// 231: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 234: getfield net/minecraft/class_243.field_1351 D
// 237: aload 15
// 239: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 23c: getfield net/minecraft/class_243.field_1350 D
// 23f: invokevirtual net/minecraft/class_898.method_3950 (Lnet/minecraft/class_1297;Lnet/minecraft/class_4604;DDD)Z
// 242: iload 14
// 244: lload 3
// 245: lconst_0
// 246: lcmp
// 247: iflt 28b
// 24a: ifeq 289
// 24d: goto 25a
// 250: ldc2_w -4997924973627353099
// 253: lload 3
// 254: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 259: athrow
// 25a: ifne 27c
// 25d: goto 26a
// 260: ldc2_w -4997924973627353099
// 263: lload 3
// 264: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: athrow
// 26a: iload 14
// 26c: ifne 1e5
// 26f: goto 27c
// 272: ldc2_w -4997924973627353099
// 275: lload 3
// 276: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: athrow
// 27c: aload 20
// 27e: lload 7
// 280: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 283: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 286: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 289: iload 14
// 28b: ifeq 2d9
// 28e: ifeq 2d4
// 291: goto 29e
// 294: ldc2_w -4997924973627353099
// 297: lload 3
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: lload 7
// 2a0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2a3: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 2a6: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 2a9: invokevirtual net/minecraft/class_5498.method_31034 ()Z
// 2ac: iload 14
// 2ae: lload 3
// 2af: lconst_0
// 2b0: lcmp
// 2b1: ifle 2db
// 2b4: ifeq 2d9
// 2b7: goto 2c4
// 2ba: ldc2_w -4997924973627353099
// 2bd: lload 3
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: ifne 1e5
// 2c7: goto 2d4
// 2ca: ldc2_w -4997924973627353099
// 2cd: lload 3
// 2ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d3: athrow
// 2d4: aload 20
// 2d6: instanceof net/minecraft/class_1657
// 2d9: iload 14
// 2db: ifeq 31c
// 2de: ifne 317
// 2e1: goto 2ee
// 2e4: ldc2_w -4997924973627353099
// 2e7: lload 3
// 2e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: athrow
// 2ee: iload 2
// 2ef: iload 14
// 2f1: lload 3
// 2f2: lconst_0
// 2f3: lcmp
// 2f4: ifle 31e
// 2f7: ifeq 31c
// 2fa: goto 307
// 2fd: ldc2_w -4997924973627353099
// 300: lload 3
// 301: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: athrow
// 307: ifeq 1e5
// 30a: goto 317
// 30d: ldc2_w -4997924973627353099
// 310: lload 3
// 311: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: athrow
// 317: aload 20
// 319: instanceof net/minecraft/class_1511
// 31c: iload 14
// 31e: lload 3
// 31f: lconst_0
// 320: lcmp
// 321: iflt 33a
// 324: ifeq 338
// 327: ifne 340
// 32a: goto 337
// 32d: ldc2_w -4997924973627353099
// 330: lload 3
// 331: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 336: athrow
// 337: iload 2
// 338: iload 14
// 33a: ifeq 1ec
// 33d: ifne 1e5
// 340: dload 16
// 342: aload 20
// 344: getfield net/minecraft/class_1297.field_6038 D
// 347: aload 20
// 349: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 34c: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 34f: aload 15
// 351: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 354: getfield net/minecraft/class_243.field_1352 D
// 357: dsub
// 358: dstore 21
// 35a: dload 16
// 35c: aload 20
// 35e: getfield net/minecraft/class_1297.field_5971 D
// 361: aload 20
// 363: invokevirtual net/minecraft/class_1297.method_23318 ()D
// 366: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 369: aload 15
// 36b: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 36e: getfield net/minecraft/class_243.field_1351 D
// 371: dsub
// 372: dstore 23
// 374: dload 16
// 376: aload 20
// 378: getfield net/minecraft/class_1297.field_5989 D
// 37b: aload 20
// 37d: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 380: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
// 383: aload 15
// 385: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 388: getfield net/minecraft/class_243.field_1350 D
// 38b: dsub
// 38c: dstore 25
// 38e: aload 20
// 390: invokevirtual net/minecraft/class_1297.method_5767 ()Z
// 393: istore 27
// 395: aload 20
// 397: invokevirtual net/minecraft/class_1297.method_36361 ()Z
// 39a: istore 28
// 39c: aload 20
// 39e: bipush 0
// 39f: invokevirtual net/minecraft/class_1297.method_5648 (Z)V
// 3a2: aload 20
// 3a4: bipush 0
// 3a5: invokevirtual net/minecraft/class_1297.method_5834 (Z)V
// 3a8: nop
// 3a9: lload 7
// 3ab: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3ae: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 3b1: aload 20
// 3b3: invokevirtual net/minecraft/class_898.method_3953 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_897;
// 3b6: aload 20
// 3b8: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 3bb: iload 9
// 3bd: iload 10
// 3bf: i2c
// 3c0: iload 11
// 3c2: invokevirtual su/catlean/zi.n (ICI)F
// 3c5: invokevirtual net/minecraft/class_897.method_62425 (Lnet/minecraft/class_1297;F)Lnet/minecraft/class_10017;
// 3c8: dup
// 3c9: sipush 2933
// 3cc: ldc2_w 1125136963220180983
// 3cf: lload 3
// 3d0: lxor
// 3d1: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3d9: astore 29
// 3db: aload 29
// 3dd: bipush 0
// 3de: putfield net/minecraft/class_10017.field_61821 I
// 3e1: lload 7
// 3e3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3e6: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 3e9: dup
// 3ea: sipush 10553
// 3ed: ldc2_w 7792290836291497392
// 3f0: lload 3
// 3f1: lxor
// 3f2: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 3fa: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 3fd: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.getLevelRenderState ()Lnet/minecraft/class_11658; 1
// 402: getfield net/minecraft/class_11658.field_63082 Lnet/minecraft/class_12075;
// 405: dup
// 406: sipush 22855
// 409: ldc2_w 1143494840762097098
// 40c: lload 3
// 40d: lxor
// 40e: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/iv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 413: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 416: astore 30
// 418: lload 7
// 41a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 41d: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 420: aload 29
// 422: aload 30
// 424: dload 21
// 426: dload 23
// 428: dload 25
// 42a: aload 1
// 42b: lload 7
// 42d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 430: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 433: invokevirtual net/minecraft/class_757.method_72910 ()Lnet/minecraft/class_11661;
// 436: checkcast net/minecraft/class_11659
// 439: invokevirtual net/minecraft/class_898.method_72976 (Lnet/minecraft/class_10017;Lnet/minecraft/class_12075;DDDLnet/minecraft/class_4587;Lnet/minecraft/class_11659;)V
// 43c: goto 441
// 43f: astore 29
// 441: aload 20
// 443: iload 27
// 445: invokevirtual net/minecraft/class_1297.method_5648 (Z)V
// 448: aload 20
// 44a: iload 28
// 44c: invokevirtual net/minecraft/class_1297.method_5834 (Z)V
// 44f: iload 14
// 451: ifne 1e5
// 454: lload 7
// 456: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 459: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 45c: invokevirtual net/minecraft/class_757.method_72911 ()Lnet/minecraft/class_11684;
// 45f: invokevirtual net/minecraft/class_11684.method_73002 ()V
// 462: lload 7
// 464: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 467: invokevirtual net/minecraft/class_310.method_22940 ()Lnet/minecraft/class_4599;
// 46a: invokevirtual net/minecraft/class_4599.method_23000 ()Lnet/minecraft/class_4597$class_4598;
// 46d: invokevirtual net/minecraft/class_4597$class_4598.method_22993 ()V
// 470: lload 7
// 472: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 475: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 478: invokevirtual net/minecraft/class_757.method_72910 ()Lnet/minecraft/class_11661;
// 47b: invokevirtual net/minecraft/class_11661.method_72953 ()V
// 47e: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 481: bipush 0
// 482: invokevirtual su/catlean/api/event/GofraState.setModifyBuffer (Z)V
// 485: lload 3
// 486: lconst_0
// 487: lcmp
// 488: ifle 4a1
// 48b: lload 7
// 48d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 490: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 493: invokevirtual net/minecraft/class_315.method_42435 ()Lnet/minecraft/class_7172;
// 496: iload 18
// 498: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 49b: invokevirtual net/minecraft/class_7172.method_41748 (Ljava/lang/Object;)V
// 49e: invokestatic com/mojang/blaze3d/systems/RenderSystem.restoreProjectionMatrix ()V
// 4a1: return
}

static {
long var0 = a ^ 29976398159775L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[13];
int var7 = 0;
String var6 = "U·BÀ}ÛÒ\u0098\u0002wíÒà¡Ø;ÚÂD/m$gb_E\u0015\u0013×½\u0096µw\u008cðµW\u0095\u000eù&2P$Á\u009eå¼\u0088¬}ñgNI´¼\u000bÒrd\u00ady\u0096îk\u0018Q1ÀQÆÙcKh\u007ffîüx\u000e+ÚÝ¶l)¤\u0083Ø\u00861\u0085µ\u0014Þ©Î\u009fSdÃB\u0084Pé¯tÑ->\u000bFÏz\u0097jª ÍÆ1/\u0005 d\u0089ËÄ\u009dT\u0080¼\u0091þuf7Z\u008e\u001a^.±ã¾ l\u0099Î^´d\u000b\u001eNç\u0011èa\u0082\u0099éüØ-Ì\u00850®(&*wwìÍ¥Ø\u0017¶©»Ñ(\u009b½\u00890ÿ\u0094\u0094}ÅÉÁ\u009cµ\u000b[ëË:V-ÜZ\n{ÿLÄ\u009aÀhÌf®$ê=\u001cO×Ò\u0010\u0093M÷Ë\u0090\u0085Ùò!]pê\fy¬\u008a\u0088JäMOs\u0019\u0015Û\u0016Ä\r\u009b\u001cñØU$9û\u0098Oô>Ác\u00171\u0089Ï\u008bÕ\u009dBÒQÚ\\\u0017\u0018nÜ`\u0097¨\u0092îg\u008e¸\u0098é$Î×k6TkÉO&\u009aM{Ö[F*W!£w)\n¯+ß\u008b¿ä«\u009a}(¿¶\u0080vb\u0081®\u0090fÖÝÈÃ±\u0094ìÓ\u008a«\u0016þü°§»®\u00850uð.0;\u001f[Õ·>ÀÂ\u008a\u0005T\u001d©o8Ha\u0018[6(T¼¶ãå\u0005¹¶d³rï£\u0019\u009c\u0092\r\u0011\u0019-$\u0018í\u0017cuý \u008dëÇÆg\u0003Éèä1S×\u0010®\u0006ÿéÎ\\°`ä\u0086bÐ\u0097è\u001e%\u0010¯¢\u0001¯ñÃçÝ**µ@Á¡O\u0007 \\\u0090Ãéëà\u0095DÎ¹Æ#\u00951ÀÁ\u0092\u009cîuú\u007fcÂ±'±e\u0096Â÷© ð\u001cö\u001e%\b9\u0099)µPÞ¡éö°YHí«ô\u0007\u008f\t\u001b§a\r!+\t\u0001(èb\u009a\u0096\u0017pÌ \u0006HÜ§õØ\u008dûÒ\u001f\u0093ä¶&\u0081Û\nA¤©I÷õ\u0085µ\"ÊÎ\u009am\rÊ";
int var8 = "U·BÀ}ÛÒ\u0098\u0002wíÒà¡Ø;ÚÂD/m$gb_E\u0015\u0013×½\u0096µw\u008cðµW\u0095\u000eù&2P$Á\u009eå¼\u0088¬}ñgNI´¼\u000bÒrd\u00ady\u0096îk\u0018Q1ÀQÆÙcKh\u007ffîüx\u000e+ÚÝ¶l)¤\u0083Ø\u00861\u0085µ\u0014Þ©Î\u009fSdÃB\u0084Pé¯tÑ->\u000bFÏz\u0097jª ÍÆ1/\u0005 d\u0089ËÄ\u009dT\u0080¼\u0091þuf7Z\u008e\u001a^.±ã¾ l\u0099Î^´d\u000b\u001eNç\u0011èa\u0082\u0099éüØ-Ì\u00850®(&*wwìÍ¥Ø\u0017¶©»Ñ(\u009b½\u00890ÿ\u0094\u0094}ÅÉÁ\u009cµ\u000b[ëË:V-ÜZ\n{ÿLÄ\u009aÀhÌf®$ê=\u001cO×Ò\u0010\u0093M÷Ë\u0090\u0085Ùò!]pê\fy¬\u008a\u0088JäMOs\u0019\u0015Û\u0016Ä\r\u009b\u001cñØU$9û\u0098Oô>Ác\u00171\u0089Ï\u008bÕ\u009dBÒQÚ\\\u0017\u0018nÜ`\u0097¨\u0092îg\u008e¸\u0098é$Î×k6TkÉO&\u009aM{Ö[F*W!£w)\n¯+ß\u008b¿ä«\u009a}(¿¶\u0080vb\u0081®\u0090fÖÝÈÃ±\u0094ìÓ\u008a«\u0016þü°§»®\u00850uð.0;\u001f[Õ·>ÀÂ\u008a\u0005T\u001d©o8Ha\u0018[6(T¼¶ãå\u0005¹¶d³rï£\u0019\u009c\u0092\r\u0011\u0019-$\u0018í\u0017cuý \u008dëÇÆg\u0003Éèä1S×\u0010®\u0006ÿéÎ\\°`ä\u0086bÐ\u0097è\u001e%\u0010¯¢\u0001¯ñÃçÝ**µ@Á¡O\u0007 \\\u0090Ãéëà\u0095DÎ¹Æ#\u00951ÀÁ\u0092\u009cîuú\u007fcÂ±'±e\u0096Â÷© ð\u001cö\u001e%\b9\u0099)µPÞ¡éö°YHí«ô\u0007\u008f\t\u001b§a\r!+\t\u0001(èb\u009a\u0096\u0017pÌ \u0006HÜ§õØ\u008dûÒ\u001f\u0093ä¶&\u0081Û\nA¤©I÷õ\u0085µ\"ÊÎ\u009am\rÊ"
.length();
char var5 = '0';
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[13];
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "\u0090äNp¢\u0085$\u0089\f¥@èóV/Ñ\u0010÷¾{\u001eGgA;\u0001\u0013\u009a\u0084UÁu·";
var8 = "\u0090äNp¢\u0085$\u0089\f¥@èóV/Ñ\u0010÷¾{\u001eGgA;\u0001\u0013\u009a\u0084UÁu·".length();
var5 = 16;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
return var0;
}

private static String a(byte[] var0) {
int var1 = 0;
int var2;
char[] var3 = new char[var2 = var0.length];

for (int var4 = 0; var4 < var2; var4++) {
int var5;
if ((var5 = 255 & var0[var4]) < 192) {
var3[var1++] = (char)var5;
} else if (var5 < 224) {
char var6 = (char)((char)(var5 & 31) << 6);
byte var8 = var0[++var4];
var6 = (char)(var6 | (char)(var8 & 63));
var3[var1++] = var6;
} else if (var4 < var2 - 2) {
char var12 = (char)((char)(var5 & 15) << '\f');
byte var9 = var0[++var4];
var12 = (char)(var12 | (char)(var9 & 63) << 6);
var9 = var0[++var4];
var12 = (char)(var12 | (char)(var9 & 63));
var3[var1++] = var12;
}
}

return new String(var3, 0, var1);
}

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16289;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])d.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/iv", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = b[var5].getBytes("ISO-8859-1");
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite a(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/iv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
