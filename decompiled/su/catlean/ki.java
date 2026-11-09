package su.catlean;

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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_4597;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.ItemCommandEvent;
import su.catlean.api.event.events.render.RenderFloatingItemEvent;
import su.catlean.api.event.events.render.ShowFloatingItemEvent;
import su.catlean.gofra.Flow;

public final class ki extends _g {
@NotNull
public static final ki I;
static final KProperty[] U;
@NotNull
private static final cw g;
@NotNull
private static final c8 j;
@Nullable
private static class_1799 V;
private static int G;
@Nullable
private static class_4597 l;
private static final long a = yz.a(4589183338756116592L, -88129097220505376L, MethodHandles.lookup().lookupClass()).a(39078240765253L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map h;

private ki(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 64922900937045L;
super(b<"b">(16284, 7674363821613690627L ^ var4), jt.F(), null, 4, null, var6);
}

private final ok E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 13808655134915L;
return (ok)g.E(this, var3, U[0]);
}

private final int Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 79502554742459L;
return ((Number)j.E(this, var3, U[1])).intValue();
}

@Flow
private final void D(ShowFloatingItemEvent var1) {
long var2 = a ^ 75872045983029L;
long var4 = var2 ^ 90102202555995L;
V = var1.getItem();
G = this.t(var4);
var1.cancel();
}

@Flow
private final void k(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ki.a J
// 03: ldc2_w 5815000851908
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -5558637116452582212
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: getstatic su/catlean/ki.G I
// 16: aload 4
// 18: ifnonnull 47
// 1b: ifle 5b
// 1e: goto 2b
// 21: ldc2_w -5598425328817356433
// 24: lload 2
// 25: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: athrow
// 2b: getstatic su/catlean/ki.G I
// 2e: bipush -1
// 2f: iadd
// 30: putstatic su/catlean/ki.G I
// 33: getstatic su/catlean/ki.G I
// 36: pop
// 37: getstatic su/catlean/ki.G I
// 3a: goto 47
// 3d: ldc2_w -5598425328817356433
// 40: lload 2
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: ifne 5b
// 4a: aconst_null
// 4b: putstatic su/catlean/ki.V Lnet/minecraft/class_1799;
// 4e: goto 5b
// 51: ldc2_w -5598425328817356433
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: return
}

@Flow
private final void x(RenderFloatingItemEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ki.a J
// 003: ldc2_w 91729698866862
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 124639497473376
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 50136186884627
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 78746740751808
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 94772257468820
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 135326621845118
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 92261859982817
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 36232878430581
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 34234396047977
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 115310871900755
// 045: lxor
// 046: dup2
// 047: bipush 48
// 049: lushr
// 04a: l2i
// 04b: istore 20
// 04d: dup2
// 04e: bipush 16
// 050: lshl
// 051: bipush 32
// 053: lushr
// 054: l2i
// 055: istore 21
// 057: dup2
// 058: bipush 48
// 05a: lshl
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 22
// 061: pop2
// 062: dup2
// 063: ldc2_w 96980197135258
// 066: lxor
// 067: dup2
// 068: bipush 8
// 06a: lushr
// 06b: lstore 23
// 06d: dup2
// 06e: bipush 56
// 070: lshl
// 071: bipush 56
// 073: lushr
// 074: l2i
// 075: istore 25
// 077: pop2
// 078: pop2
// 079: ldc2_w 1274966035851145174
// 07c: lload 2
// 07d: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: astore 31
// 084: getstatic su/catlean/ki.V Lnet/minecraft/class_1799;
// 087: ifnull 692
// 08a: getstatic su/catlean/ki.G I
// 08d: ifle 692
// 090: goto 09d
// 093: ldc2_w 1235169336630993413
// 096: lload 2
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: aload 0
// 09e: lload 18
// 0a0: invokespecial su/catlean/ki.E (J)Lsu/catlean/ok;
// 0a3: getstatic su/catlean/ok.Off Lsu/catlean/ok;
// 0a6: if_acmpeq 692
// 0a9: goto 0b6
// 0ac: ldc2_w 1235169336630993413
// 0af: lload 2
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: lload 4
// 0b8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0bb: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 0be: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 0c1: istore 32
// 0c3: lload 4
// 0c5: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c8: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 0cb: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 0ce: istore 33
// 0d0: aload 0
// 0d1: lload 8
// 0d3: invokespecial su/catlean/ki.t (J)I
// 0d6: getstatic su/catlean/ki.G I
// 0d9: isub
// 0da: istore 34
// 0dc: iload 34
// 0de: i2f
// 0df: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0e2: lload 16
// 0e4: invokevirtual su/catlean/jl.K (J)F
// 0e7: fadd
// 0e8: aload 0
// 0e9: lload 8
// 0eb: invokespecial su/catlean/ki.t (J)I
// 0ee: i2f
// 0ef: fdiv
// 0f0: fstore 35
// 0f2: fload 35
// 0f4: fload 35
// 0f6: fmul
// 0f7: fstore 36
// 0f9: fload 35
// 0fb: fload 36
// 0fd: fmul
// 0fe: fstore 37
// 100: ldc 10.25
// 102: fload 37
// 104: fmul
// 105: fload 36
// 107: fmul
// 108: ldc 24.95
// 10a: fload 36
// 10c: fmul
// 10d: fload 36
// 10f: fmul
// 110: fsub
// 111: ldc 25.5
// 113: fload 37
// 115: fmul
// 116: fadd
// 117: ldc 13.8
// 119: fload 36
// 11b: fmul
// 11c: fsub
// 11d: ldc 4.0
// 11f: fload 35
// 121: fmul
// 122: fadd
// 123: fstore 38
// 125: fload 38
// 127: ldc 3.1415927
// 129: fmul
// 12a: fstore 39
// 12c: new net/minecraft/class_4587
// 12f: dup
// 130: invokespecial net/minecraft/class_4587.<init> ()V
// 133: astore 40
// 135: aload 40
// 137: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 13a: iload 34
// 13c: i2f
// 13d: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 140: lload 16
// 142: invokevirtual su/catlean/jl.K (J)F
// 145: fadd
// 146: fstore 41
// 148: ldc 50.0
// 14a: ldc 175.0
// 14c: fload 39
// 14e: f2d
// 14f: invokestatic java/lang/Math.sin (D)D
// 152: d2f
// 153: fmul
// 154: fadd
// 155: fstore 42
// 157: aload 0
// 158: lload 18
// 15a: invokespecial su/catlean/ki.E (J)Lsu/catlean/ok;
// 15d: getstatic su/catlean/c5.g [I
// 160: swap
// 161: invokevirtual su/catlean/ok.ordinal ()I
// 164: iaload
// 165: tableswitch 912 1 8 47 171 218 360 481 608 755 894
// 194: fload 41
// 196: sipush 19331
// 199: ldc2_w 3610031225533652943
// 19c: lload 2
// 19d: lxor
// 19e: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: i2f
// 1a4: fmul
// 1a5: ldc 180.0
// 1a7: fdiv
// 1a8: f2d
// 1a9: invokestatic java/lang/Math.sin (D)D
// 1ac: sipush 11790
// 1af: ldc2_w 9107154368324221514
// 1b2: lload 2
// 1b3: lxor
// 1b4: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: i2d
// 1ba: dmul
// 1bb: d2f
// 1bc: fstore 45
// 1be: fload 41
// 1c0: sipush 10577
// 1c3: ldc2_w 1594824938538482945
// 1c6: lload 2
// 1c7: lxor
// 1c8: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: i2f
// 1ce: fmul
// 1cf: ldc 180.0
// 1d1: fdiv
// 1d2: f2d
// 1d3: invokestatic java/lang/Math.cos (D)D
// 1d6: sipush 1978
// 1d9: ldc2_w 5912888651577594879
// 1dc: lload 2
// 1dd: lxor
// 1de: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: i2d
// 1e4: dmul
// 1e5: d2f
// 1e6: fstore 46
// 1e8: aload 40
// 1ea: iload 32
// 1ec: bipush 2
// 1ed: idiv
// 1ee: i2f
// 1ef: fload 45
// 1f1: fadd
// 1f2: iload 33
// 1f4: bipush 2
// 1f5: idiv
// 1f6: i2f
// 1f7: fload 46
// 1f9: fadd
// 1fa: ldc -50.0
// 1fc: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 1ff: aload 40
// 201: fload 42
// 203: fload 42
// 205: fneg
// 206: fload 42
// 208: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 20b: aload 31
// 20d: ifnull 507
// 210: aload 40
// 212: iload 32
// 214: bipush 2
// 215: idiv
// 216: i2f
// 217: iload 33
// 219: bipush 2
// 21a: idiv
// 21b: i2f
// 21c: ldc -50.0
// 21e: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 221: aload 40
// 223: fload 42
// 225: fload 42
// 227: fneg
// 228: fload 42
// 22a: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 22d: aload 31
// 22f: ifnull 507
// 232: goto 23f
// 235: ldc2_w 1235169336630993413
// 238: lload 2
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: aload 40
// 241: iload 32
// 243: bipush 2
// 244: idiv
// 245: i2f
// 246: iload 33
// 248: bipush 2
// 249: idiv
// 24a: i2f
// 24b: ldc -50.0
// 24d: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 250: aload 40
// 252: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 255: fload 41
// 257: bipush 2
// 258: i2f
// 259: fmul
// 25a: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 25f: checkcast org/joml/Quaternionfc
// 262: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 265: aload 40
// 267: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 26a: fload 41
// 26c: bipush 2
// 26d: i2f
// 26e: fmul
// 26f: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 274: checkcast org/joml/Quaternionfc
// 277: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 27a: aload 40
// 27c: sipush 7199
// 27f: ldc2_w 5342741395474745422
// 282: lload 2
// 283: lxor
// 284: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: i2f
// 28a: fload 41
// 28c: ldc 1.5
// 28e: fmul
// 28f: fsub
// 290: sipush 23107
// 293: ldc2_w 8698235820695670284
// 296: lload 2
// 297: lxor
// 298: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: i2f
// 29e: fload 41
// 2a0: ldc 1.5
// 2a2: fmul
// 2a3: fadd
// 2a4: sipush 15638
// 2a7: ldc2_w 8348529922887985496
// 2aa: lload 2
// 2ab: lxor
// 2ac: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b1: i2f
// 2b2: fload 41
// 2b4: ldc 1.5
// 2b6: fmul
// 2b7: fsub
// 2b8: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 2bb: aload 31
// 2bd: ifnull 507
// 2c0: goto 2cd
// 2c3: ldc2_w 1235169336630993413
// 2c6: lload 2
// 2c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cc: athrow
// 2cd: aload 40
// 2cf: iload 32
// 2d1: bipush 2
// 2d2: idiv
// 2d3: i2f
// 2d4: iload 33
// 2d6: bipush 2
// 2d7: idiv
// 2d8: i2f
// 2d9: ldc -50.0
// 2db: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 2de: aload 40
// 2e0: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 2e3: fload 41
// 2e5: bipush 3
// 2e6: i2f
// 2e7: fmul
// 2e8: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 2ed: checkcast org/joml/Quaternionfc
// 2f0: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 2f3: aload 40
// 2f5: sipush 15638
// 2f8: ldc2_w 8348529922887985496
// 2fb: lload 2
// 2fc: lxor
// 2fd: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: i2f
// 303: fload 41
// 305: ldc 1.5
// 307: fmul
// 308: fsub
// 309: sipush 23666
// 30c: ldc2_w 7426210407008061499
// 30f: lload 2
// 310: lxor
// 311: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: i2f
// 317: fload 41
// 319: ldc 1.5
// 31b: fmul
// 31c: fadd
// 31d: sipush 15638
// 320: ldc2_w 8348529922887985496
// 323: lload 2
// 324: lxor
// 325: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32a: i2f
// 32b: fload 41
// 32d: ldc 1.5
// 32f: fmul
// 330: fsub
// 331: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 334: aload 31
// 336: ifnull 507
// 339: goto 346
// 33c: ldc2_w 1235169336630993413
// 33f: lload 2
// 340: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 345: athrow
// 346: fload 41
// 348: f2d
// 349: ldc2_w 3.0
// 34c: invokestatic java/lang/Math.pow (DD)D
// 34f: ldc 0.2
// 351: f2d
// 352: dmul
// 353: d2f
// 354: fstore 45
// 356: aload 40
// 358: iload 32
// 35a: bipush 2
// 35b: idiv
// 35c: i2f
// 35d: iload 33
// 35f: bipush 2
// 360: idiv
// 361: i2f
// 362: fload 45
// 364: fadd
// 365: ldc -50.0
// 367: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 36a: aload 40
// 36c: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 36f: fload 41
// 371: bipush 5
// 372: i2f
// 373: fmul
// 374: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 379: checkcast org/joml/Quaternionfc
// 37c: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 37f: aload 40
// 381: sipush 15638
// 384: ldc2_w 8348529922887985496
// 387: lload 2
// 388: lxor
// 389: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38e: i2f
// 38f: fload 41
// 391: ldc 1.5
// 393: fmul
// 394: fsub
// 395: sipush 23666
// 398: ldc2_w 7426210407008061499
// 39b: lload 2
// 39c: lxor
// 39d: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a2: i2f
// 3a3: fload 41
// 3a5: ldc 1.5
// 3a7: fmul
// 3a8: fadd
// 3a9: sipush 15638
// 3ac: ldc2_w 8348529922887985496
// 3af: lload 2
// 3b0: lxor
// 3b1: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b6: i2f
// 3b7: fload 41
// 3b9: ldc 1.5
// 3bb: fmul
// 3bc: fsub
// 3bd: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 3c0: aload 31
// 3c2: ifnull 507
// 3c5: fload 41
// 3c7: f2d
// 3c8: ldc2_w 3.0
// 3cb: invokestatic java/lang/Math.pow (DD)D
// 3ce: ldc 0.2
// 3d0: f2d
// 3d1: dmul
// 3d2: d2f
// 3d3: sipush 15523
// 3d6: ldc2_w 5326013954695014626
// 3d9: lload 2
// 3da: lxor
// 3db: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e0: i2f
// 3e1: fsub
// 3e2: fstore 45
// 3e4: aload 40
// 3e6: iload 32
// 3e8: bipush 2
// 3e9: idiv
// 3ea: i2f
// 3eb: iload 33
// 3ed: bipush 2
// 3ee: idiv
// 3ef: i2f
// 3f0: fload 45
// 3f2: fsub
// 3f3: ldc -50.0
// 3f5: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 3f8: aload 40
// 3fa: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 3fd: fload 41
// 3ff: getstatic su/catlean/ki.G I
// 402: i2f
// 403: fmul
// 404: bipush 2
// 405: i2f
// 406: fmul
// 407: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 40c: checkcast org/joml/Quaternionfc
// 40f: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 412: aload 40
// 414: sipush 15638
// 417: ldc2_w 8348529922887985496
// 41a: lload 2
// 41b: lxor
// 41c: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 421: i2f
// 422: fload 41
// 424: ldc 1.5
// 426: fmul
// 427: fsub
// 428: sipush 23666
// 42b: ldc2_w 7426210407008061499
// 42e: lload 2
// 42f: lxor
// 430: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 435: i2f
// 436: fload 41
// 438: ldc 1.5
// 43a: fmul
// 43b: fadd
// 43c: sipush 15638
// 43f: ldc2_w 8348529922887985496
// 442: lload 2
// 443: lxor
// 444: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 449: i2f
// 44a: fload 41
// 44c: ldc 1.5
// 44e: fmul
// 44f: fsub
// 450: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 453: aload 31
// 455: ifnull 507
// 458: fload 41
// 45a: f2d
// 45b: ldc2_w 2.0
// 45e: invokestatic java/lang/Math.pow (DD)D
// 461: ldc 4.5
// 463: f2d
// 464: dmul
// 465: d2f
// 466: fstore 45
// 468: aload 40
// 46a: iload 32
// 46c: bipush 2
// 46d: idiv
// 46e: i2f
// 46f: fload 45
// 471: fadd
// 472: iload 33
// 474: bipush 2
// 475: idiv
// 476: i2f
// 477: ldc -50.0
// 479: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 47c: aload 40
// 47e: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 481: fload 41
// 483: sipush 31418
// 486: ldc2_w 7923997260602928882
// 489: lload 2
// 48a: lxor
// 48b: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 490: i2f
// 491: fmul
// 492: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 497: checkcast org/joml/Quaternionfc
// 49a: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 49d: aload 40
// 49f: sipush 15638
// 4a2: ldc2_w 8348529922887985496
// 4a5: lload 2
// 4a6: lxor
// 4a7: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ac: i2f
// 4ad: fload 41
// 4af: ldc 1.5
// 4b1: fmul
// 4b2: fsub
// 4b3: sipush 23666
// 4b6: ldc2_w 7426210407008061499
// 4b9: lload 2
// 4ba: lxor
// 4bb: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c0: i2f
// 4c1: fload 41
// 4c3: ldc 1.5
// 4c5: fmul
// 4c6: fadd
// 4c7: sipush 15638
// 4ca: ldc2_w 8348529922887985496
// 4cd: lload 2
// 4ce: lxor
// 4cf: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d4: i2f
// 4d5: fload 41
// 4d7: ldc 1.5
// 4d9: fmul
// 4da: fsub
// 4db: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 4de: aload 31
// 4e0: ifnull 507
// 4e3: aload 31
// 4e5: ifnull 507
// 4e8: goto 4f5
// 4eb: ldc2_w 1235169336630993413
// 4ee: lload 2
// 4ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f4: athrow
// 4f5: new kotlin/NoWhenBranchMatchedException
// 4f8: dup
// 4f9: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 4fc: athrow
// 4fd: ldc2_w 1235169336630993413
// 500: lload 2
// 501: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 506: athrow
// 507: new su/catlean/g7
// 50a: dup
// 50b: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 50e: dup
// 50f: sipush 5653
// 512: ldc2_w 8064673714124226341
// 515: lload 2
// 516: lxor
// 517: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/ki.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 51f: sipush 22354
// 522: ldc2_w 3244522469997298452
// 525: lload 2
// 526: lxor
// 527: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52c: bipush 0
// 52d: bipush 4
// 52e: aconst_null
// 52f: astore 26
// 531: istore 27
// 533: istore 28
// 535: istore 29
// 537: astore 30
// 539: lload 6
// 53b: aload 30
// 53d: iload 29
// 53f: iload 28
// 541: iload 27
// 543: aload 26
// 545: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 548: astore 43
// 54a: new su/catlean/wf
// 54d: dup
// 54e: lload 23
// 550: iload 25
// 552: i2b
// 553: aload 43
// 555: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 558: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 55b: dup
// 55c: sipush 15028
// 55f: ldc2_w 8179180239660733318
// 562: lload 2
// 563: lxor
// 564: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/ki.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 569: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 56c: fconst_1
// 56d: fload 35
// 56f: fsub
// 570: iload 20
// 572: i2c
// 573: swap
// 574: iload 21
// 576: swap
// 577: iload 22
// 579: i2s
// 57a: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 57d: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 580: dup
// 581: sipush 2580
// 584: ldc2_w 5505253872041878319
// 587: lload 2
// 588: lxor
// 589: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/ki.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 591: invokespecial su/catlean/wf.<init> (JBLsu/catlean/g7;Ljava/awt/Color;)V
// 594: astore 44
// 596: new su/catlean/j7
// 599: dup
// 59a: aload 44
// 59c: checkcast net/minecraft/class_4588
// 59f: lload 10
// 5a1: invokespecial su/catlean/j7.<init> (Lnet/minecraft/class_4588;J)V
// 5a4: checkcast net/minecraft/class_4597
// 5a7: putstatic su/catlean/ki.l Lnet/minecraft/class_4597;
// 5aa: new net/minecraft/class_10444
// 5ad: dup
// 5ae: invokespecial net/minecraft/class_10444.<init> ()V
// 5b1: astore 45
// 5b3: lload 4
// 5b5: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 5b8: invokevirtual net/minecraft/class_310.method_65386 ()Lnet/minecraft/class_10442;
// 5bb: aload 45
// 5bd: getstatic su/catlean/ki.V Lnet/minecraft/class_1799;
// 5c0: dup
// 5c1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5c4: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 5c7: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 5ca: getstatic net/minecraft/class_811.field_4319 Lnet/minecraft/class_811;
// 5cd: lload 14
// 5cf: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 5d2: checkcast net/minecraft/class_1937
// 5d5: aconst_null
// 5d6: bipush 0
// 5d7: invokevirtual net/minecraft/class_10442.method_65598 (Lnet/minecraft/class_10444;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_1937;Lnet/minecraft/class_11566;I)V
// 5da: aload 45
// 5dc: aload 40
// 5de: lload 4
// 5e0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 5e3: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 5e6: invokevirtual net/minecraft/class_757.method_72910 ()Lnet/minecraft/class_11661;
// 5e9: checkcast net/minecraft/class_11659
// 5ec: sipush 13997
// 5ef: ldc2_w 2182395064085684973
// 5f2: lload 2
// 5f3: lxor
// 5f4: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f9: getstatic net/minecraft/class_4608.field_21444 I
// 5fc: bipush 0
// 5fd: invokevirtual net/minecraft/class_10444.method_65604 (Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;III)V
// 600: lload 4
// 602: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 605: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 608: invokevirtual net/minecraft/class_757.method_72911 ()Lnet/minecraft/class_11684;
// 60b: invokevirtual net/minecraft/class_11684.method_73002 ()V
// 60e: lload 4
// 610: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 613: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 616: invokevirtual net/minecraft/class_757.method_72910 ()Lnet/minecraft/class_11661;
// 619: invokevirtual net/minecraft/class_11661.method_72953 ()V
// 61c: lload 4
// 61e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 621: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 624: getstatic net/minecraft/class_1059.field_64467 Lnet/minecraft/class_2960;
// 627: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 62a: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 62d: dup
// 62e: sipush 4205
// 631: ldc2_w 3745449767210809692
// 634: lload 2
// 635: lxor
// 636: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/ki.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 63e: astore 46
// 640: lload 12
// 642: aload 43
// 644: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 647: invokevirtual su/catlean/b6.O ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 64a: aconst_null
// 64b: aconst_null
// 64c: new net/minecraft/class_4587
// 64f: dup
// 650: invokespecial net/minecraft/class_4587.<init> ()V
// 653: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 656: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 659: new org/joml/Matrix3x2fStack
// 65c: dup
// 65d: invokespecial org/joml/Matrix3x2fStack.<init> ()V
// 660: checkcast org/joml/Matrix3x2f
// 663: sipush 27515
// 666: ldc2_w 4066915953542693452
// 669: lload 2
// 66a: lxor
// 66b: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/ki.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 670: aload 46
// 672: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 675: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 678: sipush 1269
// 67b: ldc2_w 2217814937011589310
// 67e: lload 2
// 67f: lxor
// 680: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 685: aconst_null
// 686: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 689: aconst_null
// 68a: putstatic su/catlean/ki.l Lnet/minecraft/class_4597;
// 68d: aload 40
// 68f: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 692: return
}

@Flow
private final void M(ItemCommandEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ki.a J
// 03: ldc2_w 23687492799509
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -2663087271051418259
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 4
// 15: ifnonnull 3f
// 18: getstatic su/catlean/ki.l Lnet/minecraft/class_4597;
// 1b: ifnull 43
// 1e: goto 2b
// 21: ldc2_w -2621247738005837634
// 24: lload 2
// 25: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: athrow
// 2b: aload 1
// 2c: getstatic su/catlean/ki.l Lnet/minecraft/class_4597;
// 2f: invokevirtual su/catlean/api/event/events/render/ItemCommandEvent.setProvider (Lnet/minecraft/class_4597;)V
// 32: goto 3f
// 35: ldc2_w -2621247738005837634
// 38: lload 2
// 39: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: athrow
// 3f: aload 1
// 40: invokevirtual su/catlean/api/event/events/render/ItemCommandEvent.cancel ()V
// 43: return
}

private final int t(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ki.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 113642239185198
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 39147943173974
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w -4974526352526424943
// 18: lload 1
// 19: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: sipush 4522
// 21: ldc2_w 7398148195583241903
// 24: lload 1
// 25: lxor
// 26: invokedynamic l (IJ)I bsm=su/catlean/ki.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b: aload 0
// 2c: lload 5
// 2e: invokespecial su/catlean/ki.Q (J)I
// 31: isub
// 32: istore 8
// 34: astore 7
// 36: aload 0
// 37: lload 3
// 38: invokespecial su/catlean/ki.E (J)Lsu/catlean/ok;
// 3b: getstatic su/catlean/ok.FadeOut Lsu/catlean/ok;
// 3e: aload 7
// 40: ifnonnull 6a
// 43: if_acmpne 62
// 46: goto 53
// 49: ldc2_w -5016082486181508798
// 4c: lload 1
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: iload 8
// 55: bipush 4
// 56: idiv
// 57: ireturn
// 58: ldc2_w -5016082486181508798
// 5b: lload 1
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: aload 0
// 63: lload 3
// 64: invokespecial su/catlean/ki.E (J)Lsu/catlean/ok;
// 67: getstatic su/catlean/ok.Insert Lsu/catlean/ok;
// 6a: if_acmpne 7c
// 6d: iload 8
// 6f: bipush 2
// 70: idiv
// 71: ireturn
// 72: ldc2_w -5016082486181508798
// 75: lload 1
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: iload 8
// 7e: ireturn
}

static {
long var20 = a ^ 120499116154764L;
long var10001 = var20 ^ 131591829550592L;
int var22 = (int)((var20 ^ 131591829550592L) >>> 32);
int var23 = (int)((var20 ^ 131591829550592L) << 32 >>> 48);
int var24 = (int)(var10001 << 48 >>> 48);
long var25 = var20 ^ 78276329046719L;
long var27 = var20 ^ 46090122179949L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[12];
int var16 = 0;
String var15 = "\u00adfmDI&W&ðé/\u001dÿ\u001e\u0081#0äÍ\u0081j\u0082tå\"\u0090 AW4gbÐ-ë\u0089~×!6(4ì\u0095}b$¯ö*Ó/\u008e¼³kÀjKNa«\u0085Ñ¬tÑé§O\u009b©ÝÛC\u0012¾*\u0099¦¸\u0010àO®\u0098ÝÍÁXIøË)=òZ\u00980\bÓ?\u008c\u0090n\u0097\u009c`\u009cO\u0089Í3ñ¯KD*{ÍG£@\u0080?5ÕÊýP\n¹/Y±\u008c0\u008cÈ÷WXÓÉ)g÷ ÉÝ\u0095»Ç\u007fÙîôý\"åõ\u0095J\u0013n§~.>\u001f\u0090{X\u0010ÇõÿÕöT\u0010\u000eº6µ\u008aÏ\u0012ã?Í\u0095Q\u0003éÇ(\u0010\u001fqË¦fñ\u0093÷\u008eEü\u000b\u0093ú'÷\u0018¡¨V·Z,WÆìÅÜgXsqiÝ©ª#*\bE\\\u0010;-â\\Þ[>»(\u0015K\u0086\t¢Ì\u0019\u0010É \u008c\u0014eYé\u0080\u008f\u0004qG;cQD";
int var17 = "\u00adfmDI&W&ðé/\u001dÿ\u001e\u0081#0äÍ\u0081j\u0082tå\"\u0090 AW4gbÐ-ë\u0089~×!6(4ì\u0095}b$¯ö*Ó/\u008e¼³kÀjKNa«\u0085Ñ¬tÑé§O\u009b©ÝÛC\u0012¾*\u0099¦¸\u0010àO®\u0098ÝÍÁXIøË)=òZ\u00980\bÓ?\u008c\u0090n\u0097\u009c`\u009cO\u0089Í3ñ¯KD*{ÍG£@\u0080?5ÕÊýP\n¹/Y±\u008c0\u008cÈ÷WXÓÉ)g÷ ÉÝ\u0095»Ç\u007fÙîôý\"åõ\u0095J\u0013n§~.>\u001f\u0090{X\u0010ÇõÿÕöT\u0010\u000eº6µ\u008aÏ\u0012ã?Í\u0095Q\u0003éÇ(\u0010\u001fqË¦fñ\u0093÷\u008eEü\u000b\u0093ú'÷\u0018¡¨V·Z,WÆìÅÜgXsqiÝ©ª#*\bE\\\u0010;-â\\Þ[>»(\u0015K\u0086\t¢Ì\u0019\u0010É \u008c\u0014eYé\u0080\u008f\u0004qG;cQD"
.length();
char var14 = '(';
int var32 = -1;

label54:
while (true) {
String var33 = var15.substring(++var32, var32 + var14);
byte var37 = -1;

while (true) {
byte[] var19 = var11.doFinal(var33.getBytes("ISO-8859-1"));
String var45 = b(var19).intern();
switch (var37) {
case 0:
var18[var16++] = var45;
if ((var32 += var14) >= var17) {
b = var18;
c = new String[12];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[18];
int var3 = 0;
String var4 = "ó\u009d³\u0007d°\u008aá\u0091×\b-)\u001då`|Ö\u0094[|Ë¼Ééõñ~þ\u001a\u0096a6¼\u009dY\u0093\nÈ\u000f\u001a\u0092«\u0010½rlç¦ñ\u0019\u0090=\t\fè¦Áû²ûÞð£Ì\u001c\u0003\u008d£\u0092ã\u001dL\u000f\u0005¾_ÛýVZ6^\u0094¥\u001e.\u0013:\u008f ÏQõäûÂÜ#\u009b\u008ejÐ$\u008bMâï\u008c\u0090ú\u0011&ÓTíS4Q\u008dM<ùq_¼êk";
int var5 = "ó\u009d³\u0007d°\u008aá\u0091×\b-)\u001då`|Ö\u0094[|Ë¼Ééõñ~þ\u001a\u0096a6¼\u009dY\u0093\nÈ\u000f\u001a\u0092«\u0010½rlç¦ñ\u0019\u0090=\t\fè¦Áû²ûÞð£Ì\u001c\u0003\u008d£\u0092ã\u001dL\u000f\u0005¾_ÛýVZ6^\u0094¥\u001e.\u0013:\u008f ÏQõäûÂÜ#\u009b\u008ejÐ$\u008bMâï\u008c\u0090ú\u0011&ÓTíS4Q\u008dM<ùq_¼êk"
.length();
byte var2 = 0;

label36:
while (true) {
byte var41 = var2;
var2 += 8;
byte[] var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
long[] var36 = var6;
int var42 = var3++;
long var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var52 = -1;

while (true) {
long var8 = var49;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var54 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var52) {
case 0:
var36[var42] = var54;
if (var2 >= var5) {
e = var6;
f = new Integer[18];
KProperty[] var29 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ki.class, b<"b">(22089, 3013850781785122397L ^ var20), b<"b">(10488, 8869284516620376297L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ki.class, b<"b">(6520, 4382134524244175203L ^ var20), b<"b">(26890, 411904142409980188L ^ var20), 0))
};
U = var29;
I = new ki(var22, (short)var23, (char)var24);
g = yp.L(I, b<"b">(5901, 8799336774643001111L ^ var20), ok.FadeOut, null, null, c<"l">(29155, 7488326978682993803L ^ var20), null, var27);
j = yp.L(
I,
b<"b">(8863, 5636345740677681800L ^ var20),
c<"l">(24610, 2588822703448862029L ^ var20),
new IntRange(1, c<"l">(29837, 5591367744798964204L ^ var20)),
var25,
null,
null,
c<"l">(15408, 1207740252423647573L ^ var20),
null
);
return;
}
break;
default:
var36[var42] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "\u0018`~\u00adðrí\u0005qÂ\u009föåO~¬";
var5 = "\u0018`~\u00adðrí\u0005qÂ\u009föåO~¬".length();
var2 = 0;
}

byte var43 = var2;
var2 += 8;
var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
var36 = var6;
var42 = var3++;
var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var52 = 0;
}
}
}

var14 = var15.charAt(var32);
break;
default:
var18[var16++] = var45;
if ((var32 += var14) < var17) {
var14 = var15.charAt(var32);
continue label54;
}

var15 = "î\u0093$N¦Ú\u000fë\u008aSÂ\u0099\u0088¡-OÖ§Ñp\u009cðàó \u0018\u0088.f8â\u0081+\r\u0015õM\u0011\u0089«°\u0013\u0014°}\u0004\u0001s\u0097Zl}·àªN\b";
var17 = "î\u0093$N¦Ú\u000fë\u008aSÂ\u0099\u0088¡-OÖ§Ñp\u009cðàó \u0018\u0088.f8â\u0081+\r\u0015õM\u0011\u0089«°\u0013\u0014°}\u0004\u0001s\u0097Zl}·àªN\b"
.length();
var14 = 24;
var32 = -1;
}

var33 = var15.substring(++var32, var32 + var14);
var37 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
return var0;
}

private static String b(byte[] var0) {
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31001;
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
throw new RuntimeException("su/catlean/ki", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite b(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ki" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 1129;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ki", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ki" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
