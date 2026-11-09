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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pe {
@NotNull
private final class_2338 T;
@NotNull
private final Color E;
@NotNull
private final Color j;
@NotNull
private final og K;
@NotNull
private final lr g;
private static final long a = yz.a(-5221071468899027616L, -2331140290922047323L, MethodHandles.lookup().lookupClass()).a(49924280964594L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map h;
private static final long[] i;
private static final Long[] k;
private static final Map l;

public pe(
@NotNull class_2338 pos, @NotNull Color lineColor, @NotNull Color fillColor, @NotNull og animationMode, int a, @NotNull lr renderMode, char a, short a
) {
long var9 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(pos, a<"u">(17441, 4378221259167113922L ^ var9));
Intrinsics.checkNotNullParameter(lineColor, a<"u">(15431, 3794416187798575797L ^ var9));
Intrinsics.checkNotNullParameter(fillColor, a<"u">(1740, 1561396750824562722L ^ var9));
Intrinsics.checkNotNullParameter(animationMode, a<"u">(4521, 1226332974288041798L ^ var9));
Intrinsics.checkNotNullParameter(renderMode, a<"u">(17559, 1235123922065662588L ^ var9));
super();
this.T = pos;
this.E = lineColor;
this.j = fillColor;
this.K = animationMode;
this.g = renderMode;
}

@NotNull
public final class_2338 i() {
return this.T;
}

@NotNull
public final Color b() {
return this.E;
}

@NotNull
public final Color l() {
return this.j;
}

@NotNull
public final og e() {
return this.K;
}

@NotNull
public final lr D() {
return this.g;
}

public final void J(long time, @NotNull class_4587 stack, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/pe.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 541793854527
// 00e: lxor
// 00f: dup2
// 010: bipush 16
// 012: lushr
// 013: lstore 6
// 015: dup2
// 016: bipush 48
// 018: lshl
// 019: bipush 48
// 01b: lushr
// 01c: l2i
// 01d: istore 8
// 01f: pop2
// 020: pop2
// 021: ldc2_w 6992029135301611965
// 024: lload 4
// 026: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02b: aload 3
// 02c: sipush 24783
// 02f: ldc2_w 4966998794311175191
// 032: lload 4
// 034: lxor
// 035: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/pe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03d: istore 9
// 03f: new net/minecraft/class_238
// 042: dup
// 043: aload 0
// 044: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 047: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 04a: astore 10
// 04c: fconst_1
// 04d: fstore 11
// 04f: aload 0
// 050: getfield su/catlean/pe.K Lsu/catlean/og;
// 053: getstatic su/catlean/mu.T [I
// 056: swap
// 057: invokevirtual su/catlean/og.ordinal ()I
// 05a: iaload
// 05b: tableswitch 1284 1 9 49 68 213 247 389 647 731 946 1141
// 08c: iload 9
// 08e: ifne 572
// 091: goto 09f
// 094: ldc2_w 7041206347518712781
// 097: lload 4
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: bipush 1
// 0a0: i2f
// 0a1: lload 1
// 0a2: l2f
// 0a3: ldc 300.0
// 0a5: fdiv
// 0a6: fsub
// 0a7: fstore 11
// 0a9: new net/minecraft/class_238
// 0ac: dup
// 0ad: aload 0
// 0ae: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 0b1: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 0b4: i2d
// 0b5: aload 0
// 0b6: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 0b9: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0bc: i2d
// 0bd: aload 0
// 0be: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 0c1: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0c4: i2d
// 0c5: aload 0
// 0c6: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 0c9: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 0cc: i2d
// 0cd: aload 0
// 0ce: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 0d1: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0d4: i2d
// 0d5: aload 0
// 0d6: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 0d9: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0dc: i2d
// 0dd: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 0e0: fload 11
// 0e2: f2d
// 0e3: fload 11
// 0e5: f2d
// 0e6: fload 11
// 0e8: f2d
// 0e9: invokevirtual net/minecraft/class_238.method_1002 (DDD)Lnet/minecraft/class_238;
// 0ec: ldc2_w 0.5
// 0ef: fload 11
// 0f1: f2d
// 0f2: ldc2_w 0.5
// 0f5: dmul
// 0f6: dadd
// 0f7: ldc2_w 0.5
// 0fa: fload 11
// 0fc: f2d
// 0fd: ldc2_w 0.5
// 100: dmul
// 101: dadd
// 102: ldc2_w 0.5
// 105: fload 11
// 107: f2d
// 108: ldc2_w 0.5
// 10b: dmul
// 10c: dadd
// 10d: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 110: dup
// 111: sipush 7162
// 114: ldc2_w 6837047219533870884
// 117: lload 4
// 119: lxor
// 11a: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/pe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 122: astore 10
// 124: lload 4
// 126: lconst_0
// 127: lcmp
// 128: iflt 58b
// 12b: iload 9
// 12d: ifne 572
// 130: fconst_1
// 131: lload 1
// 132: l2f
// 133: ldc 300.0
// 135: fdiv
// 136: fsub
// 137: fstore 11
// 139: new net/minecraft/class_238
// 13c: dup
// 13d: aload 0
// 13e: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 141: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 144: astore 10
// 146: lload 4
// 148: lconst_0
// 149: lcmp
// 14a: ifle 58b
// 14d: iload 9
// 14f: ifne 572
// 152: lload 1
// 153: l2f
// 154: ldc 300.0
// 156: fdiv
// 157: fstore 11
// 159: new net/minecraft/class_238
// 15c: dup
// 15d: aload 0
// 15e: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 161: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 164: i2d
// 165: aload 0
// 166: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 169: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 16c: i2d
// 16d: aload 0
// 16e: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 171: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 174: i2d
// 175: aload 0
// 176: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 179: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 17c: i2d
// 17d: aload 0
// 17e: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 181: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 184: i2d
// 185: aload 0
// 186: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 189: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 18c: i2d
// 18d: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 190: fload 11
// 192: f2d
// 193: fload 11
// 195: f2d
// 196: fload 11
// 198: f2d
// 199: invokevirtual net/minecraft/class_238.method_1002 (DDD)Lnet/minecraft/class_238;
// 19c: ldc2_w 0.5
// 19f: fload 11
// 1a1: f2d
// 1a2: ldc2_w 0.5
// 1a5: dmul
// 1a6: dadd
// 1a7: ldc2_w 0.5
// 1aa: fload 11
// 1ac: f2d
// 1ad: ldc2_w 0.5
// 1b0: dmul
// 1b1: dadd
// 1b2: ldc2_w 0.5
// 1b5: fload 11
// 1b7: f2d
// 1b8: ldc2_w 0.5
// 1bb: dmul
// 1bc: dadd
// 1bd: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 1c0: dup
// 1c1: sipush 15752
// 1c4: ldc2_w 8121657288784695643
// 1c7: lload 4
// 1c9: lxor
// 1ca: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/pe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1d2: astore 10
// 1d4: lload 4
// 1d6: lconst_0
// 1d7: lcmp
// 1d8: ifle 58b
// 1db: iload 9
// 1dd: ifne 572
// 1e0: lload 1
// 1e1: iload 9
// 1e3: ifeq 248
// 1e6: goto 1f4
// 1e9: ldc2_w 7041206347518712781
// 1ec: lload 4
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: sipush 6524
// 1f7: ldc2_w 897711646466699879
// 1fa: lload 4
// 1fc: lxor
// 1fd: invokedynamic o (IJ)J bsm=su/catlean/pe.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 202: lcmp
// 203: ifle 247
// 206: goto 214
// 209: ldc2_w 7041206347518712781
// 20c: lload 4
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: bipush 1
// 215: i2f
// 216: lload 1
// 217: sipush 5902
// 21a: ldc2_w 1200719402965146958
// 21d: lload 4
// 21f: lxor
// 220: invokedynamic u (IJ)I bsm=su/catlean/pe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: i2l
// 226: lsub
// 227: l2f
// 228: sipush 6881
// 22b: ldc2_w 1065442319079805093
// 22e: lload 4
// 230: lxor
// 231: invokedynamic u (IJ)I bsm=su/catlean/pe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: i2f
// 237: fdiv
// 238: fsub
// 239: goto 259
// 23c: ldc2_w 7041206347518712781
// 23f: lload 4
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: lload 1
// 248: l2f
// 249: sipush 9657
// 24c: ldc2_w 1621857155558191102
// 24f: lload 4
// 251: lxor
// 252: invokedynamic u (IJ)I bsm=su/catlean/pe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 257: i2f
// 258: fdiv
// 259: fstore 11
// 25b: new net/minecraft/class_238
// 25e: dup
// 25f: aload 0
// 260: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 263: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 266: i2d
// 267: aload 0
// 268: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 26b: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 26e: i2d
// 26f: aload 0
// 270: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 273: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 276: i2d
// 277: aload 0
// 278: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 27b: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 27e: i2d
// 27f: aload 0
// 280: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 283: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 286: i2d
// 287: aload 0
// 288: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 28b: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 28e: i2d
// 28f: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 292: fload 11
// 294: f2d
// 295: fload 11
// 297: f2d
// 298: fload 11
// 29a: f2d
// 29b: invokevirtual net/minecraft/class_238.method_1002 (DDD)Lnet/minecraft/class_238;
// 29e: ldc2_w 0.5
// 2a1: fload 11
// 2a3: f2d
// 2a4: ldc2_w 0.5
// 2a7: dmul
// 2a8: dadd
// 2a9: ldc2_w 0.5
// 2ac: fload 11
// 2ae: f2d
// 2af: ldc2_w 0.5
// 2b2: dmul
// 2b3: dadd
// 2b4: ldc2_w 0.5
// 2b7: fload 11
// 2b9: f2d
// 2ba: ldc2_w 0.5
// 2bd: dmul
// 2be: dadd
// 2bf: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 2c2: dup
// 2c3: sipush 15752
// 2c6: ldc2_w 8121657288784695643
// 2c9: lload 4
// 2cb: lxor
// 2cc: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/pe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2d4: astore 10
// 2d6: lload 4
// 2d8: lconst_0
// 2d9: lcmp
// 2da: iflt 58b
// 2dd: iload 9
// 2df: ifne 572
// 2e2: lload 1
// 2e3: l2f
// 2e4: ldc 300.0
// 2e6: fdiv
// 2e7: fstore 11
// 2e9: new net/minecraft/class_238
// 2ec: dup
// 2ed: aload 0
// 2ee: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 2f1: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 2f4: i2d
// 2f5: aload 0
// 2f6: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 2f9: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 2fc: i2f
// 2fd: fload 11
// 2ff: fadd
// 300: f2d
// 301: aload 0
// 302: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 305: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 308: i2d
// 309: aload 0
// 30a: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 30d: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 310: bipush 1
// 311: iadd
// 312: i2d
// 313: aload 0
// 314: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 317: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 31a: i2d
// 31b: aload 0
// 31c: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 31f: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 322: bipush 1
// 323: iadd
// 324: i2d
// 325: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 328: astore 10
// 32a: lload 4
// 32c: lconst_0
// 32d: lcmp
// 32e: ifle 58b
// 331: iload 9
// 333: ifne 572
// 336: lload 1
// 337: sipush 22096
// 33a: ldc2_w 5245464765943332170
// 33d: lload 4
// 33f: lxor
// 340: invokedynamic o (IJ)J bsm=su/catlean/pe.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 345: lcmp
// 346: iload 9
// 348: ifeq 37a
// 34b: goto 359
// 34e: ldc2_w 7041206347518712781
// 351: lload 4
// 353: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 358: athrow
// 359: ifge 379
// 35c: goto 36a
// 35f: ldc2_w 7041206347518712781
// 362: lload 4
// 364: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 369: athrow
// 36a: fconst_1
// 36b: goto 384
// 36e: ldc2_w 7041206347518712781
// 371: lload 4
// 373: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 378: athrow
// 379: bipush 1
// 37a: i2f
// 37b: lload 1
// 37c: l2f
// 37d: ldc 200.0
// 37f: fsub
// 380: ldc 400.0
// 382: fdiv
// 383: fadd
// 384: fstore 11
// 386: new net/minecraft/class_238
// 389: dup
// 38a: aload 0
// 38b: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 38e: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 391: i2d
// 392: aload 0
// 393: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 396: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 399: i2d
// 39a: aload 0
// 39b: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 39e: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 3a1: i2d
// 3a2: aload 0
// 3a3: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 3a6: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 3a9: i2d
// 3aa: aload 0
// 3ab: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 3ae: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 3b1: i2d
// 3b2: aload 0
// 3b3: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 3b6: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 3b9: i2d
// 3ba: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 3bd: fload 11
// 3bf: f2d
// 3c0: fload 11
// 3c2: f2d
// 3c3: fload 11
// 3c5: f2d
// 3c6: invokevirtual net/minecraft/class_238.method_1002 (DDD)Lnet/minecraft/class_238;
// 3c9: ldc2_w 0.5
// 3cc: fload 11
// 3ce: f2d
// 3cf: ldc2_w 0.5
// 3d2: dmul
// 3d3: dadd
// 3d4: ldc2_w 0.5
// 3d7: fload 11
// 3d9: f2d
// 3da: ldc2_w 0.5
// 3dd: dmul
// 3de: dadd
// 3df: ldc2_w 0.5
// 3e2: fload 11
// 3e4: f2d
// 3e5: ldc2_w 0.5
// 3e8: dmul
// 3e9: dadd
// 3ea: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 3ed: dup
// 3ee: sipush 15752
// 3f1: ldc2_w 8121657288784695643
// 3f4: lload 4
// 3f6: lxor
// 3f7: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/pe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3ff: astore 10
// 401: lload 4
// 403: lconst_0
// 404: lcmp
// 405: ifle 58b
// 408: iload 9
// 40a: ifne 572
// 40d: lload 1
// 40e: sipush 18240
// 411: ldc2_w 5400998957228502105
// 414: lload 4
// 416: lxor
// 417: invokedynamic o (IJ)J bsm=su/catlean/pe.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41c: lcmp
// 41d: ifge 447
// 420: goto 42e
// 423: ldc2_w 7041206347518712781
// 426: lload 4
// 428: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42d: athrow
// 42e: ldc 1.5
// 430: lload 1
// 431: l2f
// 432: ldc 200.0
// 434: fdiv
// 435: ldc 0.5
// 437: fmul
// 438: fsub
// 439: goto 448
// 43c: ldc2_w 7041206347518712781
// 43f: lload 4
// 441: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 446: athrow
// 447: fconst_1
// 448: fstore 11
// 44a: new net/minecraft/class_238
// 44d: dup
// 44e: aload 0
// 44f: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 452: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 455: i2d
// 456: aload 0
// 457: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 45a: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 45d: i2d
// 45e: aload 0
// 45f: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 462: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 465: i2d
// 466: aload 0
// 467: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 46a: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 46d: i2d
// 46e: aload 0
// 46f: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 472: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 475: i2d
// 476: aload 0
// 477: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 47a: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 47d: i2d
// 47e: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 481: fload 11
// 483: f2d
// 484: fload 11
// 486: f2d
// 487: fload 11
// 489: f2d
// 48a: invokevirtual net/minecraft/class_238.method_1002 (DDD)Lnet/minecraft/class_238;
// 48d: ldc2_w 0.5
// 490: fload 11
// 492: ldc 0.5
// 494: fmul
// 495: f2d
// 496: dadd
// 497: ldc2_w 0.5
// 49a: fload 11
// 49c: f2d
// 49d: ldc2_w 0.5
// 4a0: dmul
// 4a1: dadd
// 4a2: ldc2_w 0.5
// 4a5: fload 11
// 4a7: f2d
// 4a8: ldc2_w 0.5
// 4ab: dmul
// 4ac: dadd
// 4ad: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 4b0: dup
// 4b1: sipush 15752
// 4b4: ldc2_w 8121657288784695643
// 4b7: lload 4
// 4b9: lxor
// 4ba: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/pe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4c2: astore 10
// 4c4: lload 4
// 4c6: lconst_0
// 4c7: lcmp
// 4c8: ifle 58b
// 4cb: iload 9
// 4cd: ifne 572
// 4d0: fconst_1
// 4d1: lload 1
// 4d2: l2f
// 4d3: ldc 1500.0
// 4d5: fdiv
// 4d6: fadd
// 4d7: fstore 11
// 4d9: new net/minecraft/class_238
// 4dc: dup
// 4dd: aload 0
// 4de: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 4e1: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 4e4: i2d
// 4e5: aload 0
// 4e6: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 4e9: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 4ec: i2d
// 4ed: aload 0
// 4ee: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 4f1: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 4f4: i2d
// 4f5: aload 0
// 4f6: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 4f9: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 4fc: i2d
// 4fd: aload 0
// 4fe: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 501: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 504: i2d
// 505: aload 0
// 506: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 509: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 50c: i2d
// 50d: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 510: fload 11
// 512: f2d
// 513: fload 11
// 515: f2d
// 516: fload 11
// 518: f2d
// 519: invokevirtual net/minecraft/class_238.method_1002 (DDD)Lnet/minecraft/class_238;
// 51c: ldc2_w 0.5
// 51f: fload 11
// 521: ldc 0.5
// 523: fmul
// 524: f2d
// 525: dadd
// 526: ldc 0.5
// 528: f2d
// 529: fload 11
// 52b: f2d
// 52c: ldc2_w 0.5
// 52f: dmul
// 530: dadd
// 531: ldc2_w 0.5
// 534: fload 11
// 536: f2d
// 537: ldc2_w 0.5
// 53a: dmul
// 53b: dadd
// 53c: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 53f: dup
// 540: sipush 15752
// 543: ldc2_w 8121657288784695643
// 546: lload 4
// 548: lxor
// 549: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/pe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 551: astore 10
// 553: lload 4
// 555: lconst_0
// 556: lcmp
// 557: ifle 58b
// 55a: iload 9
// 55c: ifne 572
// 55f: new kotlin/NoWhenBranchMatchedException
// 562: dup
// 563: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 566: athrow
// 567: ldc2_w 7041206347518712781
// 56a: lload 4
// 56c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 571: athrow
// 572: aload 0
// 573: fload 11
// 575: lload 6
// 577: iload 8
// 579: i2c
// 57a: aload 10
// 57c: aload 0
// 57d: getfield su/catlean/pe.g Lsu/catlean/lr;
// 580: aload 0
// 581: getfield su/catlean/pe.E Ljava/awt/Color;
// 584: aload 0
// 585: getfield su/catlean/pe.j Ljava/awt/Color;
// 588: invokespecial su/catlean/pe.e (FJCLnet/minecraft/class_238;Lsu/catlean/lr;Ljava/awt/Color;Ljava/awt/Color;)V
// 58b: return
}

private final void e(float param1, long param2, char param4, class_238 param5, lr param6, Color param7, Color param8) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: bipush 16
// 003: lshl
// 004: iload 4
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 48
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/pe.a J
// 011: lxor
// 012: lstore 9
// 014: lload 9
// 016: dup2
// 017: ldc2_w 134398669040682
// 01a: lxor
// 01b: lstore 11
// 01d: dup2
// 01e: ldc2_w 71410512224163
// 021: lxor
// 022: lstore 13
// 024: dup2
// 025: ldc2_w 33301802477661
// 028: lxor
// 029: dup2
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 15
// 030: dup2
// 031: bipush 16
// 033: lshl
// 034: bipush 32
// 036: lushr
// 037: l2i
// 038: istore 16
// 03a: dup2
// 03b: bipush 48
// 03d: lshl
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 17
// 044: pop2
// 045: dup2
// 046: ldc2_w 89635772698607
// 049: lxor
// 04a: lstore 18
// 04c: dup2
// 04d: ldc2_w 12764631394976
// 050: lxor
// 051: dup2
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 20
// 058: dup2
// 059: bipush 16
// 05b: lshl
// 05c: bipush 48
// 05e: lushr
// 05f: l2i
// 060: istore 21
// 062: dup2
// 063: bipush 32
// 065: lshl
// 066: bipush 32
// 068: lushr
// 069: l2i
// 06a: istore 22
// 06c: pop2
// 06d: pop2
// 06e: ldc2_w -8441623771954615069
// 071: lload 9
// 073: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: istore 23
// 07a: aload 6
// 07c: getstatic su/catlean/lr.BOTH Lsu/catlean/lr;
// 07f: iload 23
// 081: ifne 0a8
// 084: if_acmpeq 0c4
// 087: goto 095
// 08a: ldc2_w -8421956607743364763
// 08d: lload 9
// 08f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: athrow
// 095: aload 6
// 097: getstatic su/catlean/lr.LINE Lsu/catlean/lr;
// 09a: goto 0a8
// 09d: ldc2_w -8421956607743364763
// 0a0: lload 9
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: iload 23
// 0aa: lload 2
// 0ab: lconst_0
// 0ac: lcmp
// 0ad: ifle 105
// 0b0: ifne 103
// 0b3: if_acmpne 0fe
// 0b6: goto 0c4
// 0b9: ldc2_w -8421956607743364763
// 0bc: lload 9
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0c7: lload 18
// 0c9: aload 5
// 0cb: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0ce: aload 7
// 0d0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0d3: lload 11
// 0d5: aload 7
// 0d7: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 0da: fload 1
// 0db: fmul
// 0dc: iload 15
// 0de: i2c
// 0df: swap
// 0e0: iload 16
// 0e2: swap
// 0e3: iload 17
// 0e5: i2s
// 0e6: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 0e9: aconst_null
// 0ea: bipush 4
// 0eb: aconst_null
// 0ec: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 0ef: pop
// 0f0: goto 0fe
// 0f3: ldc2_w -8421956607743364763
// 0f6: lload 9
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: aload 6
// 100: getstatic su/catlean/lr.BOTH Lsu/catlean/lr;
// 103: iload 23
// 105: lload 2
// 106: lconst_0
// 107: lcmp
// 108: iflt 13a
// 10b: ifne 132
// 10e: if_acmpeq 14e
// 111: goto 11f
// 114: ldc2_w -8421956607743364763
// 117: lload 9
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: aload 6
// 121: getstatic su/catlean/lr.FILL Lsu/catlean/lr;
// 124: goto 132
// 127: ldc2_w -8421956607743364763
// 12a: lload 9
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: lload 2
// 133: lconst_0
// 134: lcmp
// 135: iflt 18d
// 138: iload 23
// 13a: ifne 18d
// 13d: if_acmpne 188
// 140: goto 14e
// 143: ldc2_w -8421956607743364763
// 146: lload 9
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: lload 13
// 150: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 153: aload 5
// 155: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 158: aload 8
// 15a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 15d: lload 11
// 15f: aload 8
// 161: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 164: fload 1
// 165: fmul
// 166: iload 15
// 168: i2c
// 169: swap
// 16a: iload 16
// 16c: swap
// 16d: iload 17
// 16f: i2s
// 170: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 173: aconst_null
// 174: bipush 4
// 175: aconst_null
// 176: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 179: pop
// 17a: goto 188
// 17d: ldc2_w -8421956607743364763
// 180: lload 9
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: aload 6
// 18a: getstatic su/catlean/lr.SHADER Lsu/catlean/lr;
// 18d: if_acmpne 1ec
// 190: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 193: iload 20
// 195: i2s
// 196: iload 21
// 198: i2c
// 199: aload 5
// 19b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 19e: aload 8
// 1a0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1a3: lload 11
// 1a5: aload 8
// 1a7: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 1aa: fload 1
// 1ab: fmul
// 1ac: iload 15
// 1ae: i2c
// 1af: swap
// 1b0: iload 16
// 1b2: swap
// 1b3: iload 17
// 1b5: i2s
// 1b6: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1b9: iload 22
// 1bb: swap
// 1bc: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1bf: aload 7
// 1c1: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1c4: lload 11
// 1c6: aload 7
// 1c8: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 1cb: fload 1
// 1cc: fmul
// 1cd: iload 15
// 1cf: i2c
// 1d0: swap
// 1d1: iload 16
// 1d3: swap
// 1d4: iload 17
// 1d6: i2s
// 1d7: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1da: invokevirtual su/catlean/zi.Q (SCLnet/minecraft/class_238;ILjava/awt/Color;Ljava/awt/Color;)Z
// 1dd: pop
// 1de: goto 1ec
// 1e1: ldc2_w -8421956607743364763
// 1e4: lload 9
// 1e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1eb: athrow
// 1ec: return
}

@NotNull
public final class_2338 R() {
return this.T;
}

@NotNull
public final Color U() {
return this.E;
}

@NotNull
public final Color g() {
return this.j;
}

@NotNull
public final og P() {
return this.K;
}

@NotNull
public final lr J() {
return this.g;
}

@NotNull
public final pe j(@NotNull class_2338 pos, @NotNull Color lineColor, long a, @NotNull Color fillColor, @NotNull og animationMode, @NotNull lr renderMode) {
ax = a ^ ax;
long var10001 = ax ^ 32637653304288L;
int var8 = (int)((ax ^ 32637653304288L) >>> 32);
int var9 = (int)((ax ^ 32637653304288L) << 32 >>> 48);
int var10 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(pos, a<"u">(29272, 384959707348146630L ^ ax));
Intrinsics.checkNotNullParameter(lineColor, a<"u">(5626, 5019491535671426664L ^ ax));
Intrinsics.checkNotNullParameter(fillColor, a<"u">(7168, 4431587674247755675L ^ ax));
Intrinsics.checkNotNullParameter(animationMode, a<"u">(20484, 988124161656765331L ^ ax));
Intrinsics.checkNotNullParameter(renderMode, a<"u">(14317, 1373421571060325496L ^ ax));
return new pe(pos, lineColor, fillColor, animationMode, var8, renderMode, (char)var9, (short)var10);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static pe v(pe var0, class_2338 var1, Color var2, Color var3, og var4, lr var5, int var6, Object var7, long var8) {
var8 = a ^ var8;
long var10 = var8 ^ 121936181831131L;
int var12 = vm.a<"Å">(939786001384799679L, var8);

int var10000;
label89: {
label88: {
try {
var10000 = var6 & 1;
if (var12 == 0) {
break label89;
}

if (var10000 == 0) {
break label88;
}
} catch (NoWhenBranchMatchedException var18) {
throw vm.a<"Å">(var18, 987700960579909583L, var8);
}

var1 = var0.T;
}

var10000 = var6 & 2;
}

int var10001;
label80: {
label79: {
label78: {
try {
var10001 = var12;
if (var8 < 0L) {
break label80;
}

if (var12 == 0) {
break label79;
}

if (var10000 == 0) {
break label78;
}
} catch (NoWhenBranchMatchedException var17) {
throw vm.a<"Å">(var17, 987700960579909583L, var8);
}

var2 = var0.E;
}

var10000 = var6 & 4;
}

try {
var10001 = var12;
} catch (NoWhenBranchMatchedException var14) {
throw vm.a<"Å">(var14, 987700960579909583L, var8);
}
}

label67: {
label66: {
label65: {
try {
if (var8 <= 0L) {
break label67;
}

if (var10001 == 0) {
break label66;
}

if (var10000 == 0) {
break label65;
}
} catch (NoWhenBranchMatchedException var16) {
throw vm.a<"Å">(var16, 987700960579909583L, var8);
}

var3 = var0.j;
}

var10000 = var6 & b<"u">(25130, 449002438215894125L ^ var8);
}

try {
var10001 = var12;
} catch (NoWhenBranchMatchedException var13) {
throw vm.a<"Å">(var13, 987700960579909583L, var8);
}
}

label54: {
label53: {
try {
if (var10001 == 0) {
break label54;
}

if (var10000 == 0) {
break label53;
}
} catch (NoWhenBranchMatchedException var15) {
throw vm.a<"Å">(var15, 987700960579909583L, var8);
}

var4 = var0.K;
}

var10000 = var6 & b<"u">(27102, 3711047304231358367L ^ var8);
}

if (var10000 != 0) {
var5 = var0.g;
}

return var0.j(var1, var2, var10, var3, var4, var5);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 112716733451201L;
lr var3 = this.g;
og var4 = this.K;
Color var5 = this.j;
Color var6 = this.E;
class_2338 var7 = this.T;
return a<"u">(8398, 1328899385140931016L ^ var1)
+ var7
+ a<"u">(20954, 3170828523617392841L ^ var1)
+ var6
+ a<"u">(9678, 8160109977345879238L ^ var1)
+ var5
+ a<"u">(16638, 6565170833605855731L ^ var1)
+ var4
+ a<"u">(4966, 3715619841618106978L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 122589562747616L;
int var3 = this.T.hashCode();
var3 = var3 * b<"u">(4913, 9133834745309597071L ^ var1) + this.E.hashCode();
var3 = var3 * b<"u">(31747, 483782188762358457L ^ var1) + this.j.hashCode();
var3 = var3 * b<"u">(31747, 483782188762358457L ^ var1) + this.K.hashCode();
return var3 * b<"u">(31747, 483782188762358457L ^ var1) + this.g.hashCode();
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/pe.a J
// 003: ldc2_w 112063019157509
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -4148804105217138602
// 00b: lload 2
// 00c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: istore 4
// 013: aload 0
// 014: iload 4
// 016: ifne 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -4059400965788484144
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -4059400965788484144
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: iload 4
// 039: ifne 05c
// 03c: instanceof su/catlean/pe
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -4059400965788484144
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -4059400965788484144
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/pe
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 065: aload 5
// 067: getfield su/catlean/pe.T Lnet/minecraft/class_2338;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: iload 4
// 06f: ifne 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -4059400965788484144
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -4059400965788484144
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/pe.E Ljava/awt/Color;
// 092: aload 5
// 094: getfield su/catlean/pe.E Ljava/awt/Color;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: iload 4
// 09c: ifne 0d9
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w -4059400965788484144
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w -4059400965788484144
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: iload 4
// 0be: ifne 0e9
// 0c1: getfield su/catlean/pe.j Ljava/awt/Color;
// 0c4: aload 5
// 0c6: getfield su/catlean/pe.j Ljava/awt/Color;
// 0c9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0cc: goto 0d9
// 0cf: ldc2_w -4059400965788484144
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: ifne 0e8
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w -4059400965788484144
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: iload 4
// 0eb: ifne 113
// 0ee: getfield su/catlean/pe.K Lsu/catlean/og;
// 0f1: aload 5
// 0f3: getfield su/catlean/pe.K Lsu/catlean/og;
// 0f6: if_acmpeq 112
// 0f9: goto 106
// 0fc: ldc2_w -4059400965788484144
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 0
// 107: ireturn
// 108: ldc2_w -4059400965788484144
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: aload 0
// 113: getfield su/catlean/pe.g Lsu/catlean/lr;
// 116: aload 5
// 118: getfield su/catlean/pe.g Lsu/catlean/lr;
// 11b: if_acmpeq 12a
// 11e: bipush 0
// 11f: ireturn
// 120: ldc2_w -4059400965788484144
// 123: lload 2
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: bipush 1
// 12b: ireturn
}

static {
long var22 = a ^ 134412840457823L;
Cipher var24;
Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var25 = 1; var25 < 8; var25++) {
var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var31 = new String[18];
int var29 = 0;
String var28 = "ï(4é«~[·Ì'Û.~Ê\u0014|\u0018\u0098½`/\u008c4»¾å¯m\u0087|\u0080ê¶¡s\u0093êl³ Ñ\u0010,\u0082;õöâ\u00964\u0094ÔI\u0085 \u000f\u00ad´\u0018:ö\u009d\u008c\u0016l\u0005\u0003tïv\u0004M{µ©§ìÎ\u0012¶\u000e¼O ]\u00853\u000bëMU\\\u0097\b\u0084¤\u0002~ôÖ\u0083J\fy`\u0081=£iÁ\u008b\u007f0äú.(òÖ`è\u001e\u001c\u001c!!Q\u0012º\u009c¼\u008f2Õ_\u009bÒf®÷¿U¬\u0007æWæ\u0013\u000f\u0099'ÞYÔ\u0088\u0002\u008d J\u009dÕ\u0085®kÀÝ=\u00881D*<µvúTéxs\"Ø-9\u0081[àõ\u001aj/\u0018<\u0005²7Ï\u0000:ÔHü±5¨\u0011+[Uì÷P»w4× L±î\u0001\u000f¾0\u0010g*ZBÏÞ'Û¤iäç\u0002±\u0089a¼\u0007\nø,¡@\t\u0018¦£^\u001f\fÝjNË\u008a\u0011´(G\u0095E\u008c\u008c \u008fT2ÏH\u0010\u0018\u0006âù\u0080â®Mÿx\"L-S%²\u0018D?\rÊ£í\u009c\"ü\u0000øñ¡\u008aô\u0085\u0098oÒj&Û;Ø\u0018\u0084|n\u0097®3T¢\u001bÅ\u0087F#\u0016cÜ{ÜG\u0003ÀS\u0096K\u0018\u009c:~w\u0007ÃK±(}G\u0083É»ºÆ,nm?\u0012 \u0087C(ÿ\u008c6ß\u0006\u0087ndðNÇÇ¨[\u0090µ\bÃ\tæ¥\u008cösWz\u000e+\\à\u0019Q\u0018iç¼U\u008dè\u0094 .ífÍxÌðã*\rî\u008fÚÄ]ËÉDi\u001aL\u0001ÙmÏí£%\u0083\u008d¸¸";
int var30 = "ï(4é«~[·Ì'Û.~Ê\u0014|\u0018\u0098½`/\u008c4»¾å¯m\u0087|\u0080ê¶¡s\u0093êl³ Ñ\u0010,\u0082;õöâ\u00964\u0094ÔI\u0085 \u000f\u00ad´\u0018:ö\u009d\u008c\u0016l\u0005\u0003tïv\u0004M{µ©§ìÎ\u0012¶\u000e¼O ]\u00853\u000bëMU\\\u0097\b\u0084¤\u0002~ôÖ\u0083J\fy`\u0081=£iÁ\u008b\u007f0äú.(òÖ`è\u001e\u001c\u001c!!Q\u0012º\u009c¼\u008f2Õ_\u009bÒf®÷¿U¬\u0007æWæ\u0013\u000f\u0099'ÞYÔ\u0088\u0002\u008d J\u009dÕ\u0085®kÀÝ=\u00881D*<µvúTéxs\"Ø-9\u0081[àõ\u001aj/\u0018<\u0005²7Ï\u0000:ÔHü±5¨\u0011+[Uì÷P»w4× L±î\u0001\u000f¾0\u0010g*ZBÏÞ'Û¤iäç\u0002±\u0089a¼\u0007\nø,¡@\t\u0018¦£^\u001f\fÝjNË\u008a\u0011´(G\u0095E\u008c\u008c \u008fT2ÏH\u0010\u0018\u0006âù\u0080â®Mÿx\"L-S%²\u0018D?\rÊ£í\u009c\"ü\u0000øñ¡\u008aô\u0085\u0098oÒj&Û;Ø\u0018\u0084|n\u0097®3T¢\u001bÅ\u0087F#\u0016cÜ{ÜG\u0003ÀS\u0096K\u0018\u009c:~w\u0007ÃK±(}G\u0083É»ºÆ,nm?\u0012 \u0087C(ÿ\u008c6ß\u0006\u0087ndðNÇÇ¨[\u0090µ\bÃ\tæ¥\u008cösWz\u000e+\\à\u0019Q\u0018iç¼U\u008dè\u0094 .ífÍxÌðã*\rî\u008fÚÄ]ËÉDi\u001aL\u0001ÙmÏí£%\u0083\u008d¸¸"
.length();
char var27 = 16;
int var35 = -1;

label72:
while (true) {
String var36 = var28.substring(++var35, var35 + var27);
int var10001 = -1;

while (true) {
byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
String var50 = a(var32).intern();
switch (var10001) {
case 0:
var31[var29++] = var50;
if ((var35 += var27) >= var30) {
b = var31;
c = new String[18];
h = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[7];
int var14 = 0;
String var15 = "\u0012î\u0089\u0012dÎ?]\u0095þS¼QÃÜªÅ½\u009fzó\u0015\u0019\u0094\u0093Ýomq\u009b\u008f=oÉ[\u0003\u008aëbÿ";
int var16 = "\u0012î\u0089\u0012dÎ?]\u0095þS¼QÃÜªÅ½\u009fzó\u0015\u0019\u0094\u0093Ýomq\u009b\u008f=oÉ[\u0003\u008aëbÿ".length();
byte var13 = 0;

label54:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var39 = var17;
var10001 = var14++;
long var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var58 = -1;

while (true) {
long var19 = var54;
byte[] var21 = var11.doFinal(
new byte[]{
(byte)(var19 >>> 56),
(byte)(var19 >>> 48),
(byte)(var19 >>> 40),
(byte)(var19 >>> 32),
(byte)(var19 >>> 24),
(byte)(var19 >>> 16),
(byte)(var19 >>> 8),
(byte)var19
}
);
long var62 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var58) {
case 0:
var39[var10001] = var62;
if (var13 >= var16) {
e = var17;
f = new Integer[7];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "¼ý¥>\u008eô«LÕ÷y´1ûcÿ¸Üx¼\u0091\u0092(d";
int var5 = "¼ý¥>\u008eô«LÕ÷y´1ûcÿ¸Üx¼\u0091\u0092(d".length();
byte var2 = 0;

do {
int var47 = var2;
var2 += 8;
byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var47 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
var62 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var61 = -1;
var6[var47] = var62;
} while (var2 < var5);

i = var6;
k = new Long[3];
return;
}
break;
default:
var39[var10001] = var62;
if (var13 < var16) {
continue label54;
}

var15 = "0âr^Ç¡\tûAöµo\u0019;¥Ô";
var16 = "0âr^Ç¡\tûAöµo\u0019;¥Ô".length();
var13 = 0;
}

byte var46 = var13;
var13 += 8;
var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
var39 = var17;
var10001 = var14++;
var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var58 = 0;
}
}
}

var27 = var28.charAt(var35);
break;
default:
var31[var29++] = var50;
if ((var35 += var27) < var30) {
var27 = var28.charAt(var35);
continue label72;
}

var28 = "/ÂfàÙD\\2É`@îy)KîäÊ6ð\u001b¶\u000b¨ @}¨ÞÇåC/diÿk\u0003·PB\u000eã\u0006©\u001fN@\u0006ð\u009aÙ\u001eKÔHÊ";
var30 = "/ÂfàÙD\\2É`@îy)KîäÊ6ð\u001b¶\u000b¨ @}¨ÞÇåC/diÿk\u0003·PB\u000eã\u0006©\u001fN@\u0006ð\u009aÙ\u001eKÔHÊ".length();
var27 = 24;
var35 = -1;
}

var36 = var28.substring(++var35, var35 + var27);
var10001 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3157;
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
throw new RuntimeException("su/catlean/pe", var10);
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
throw new RuntimeException("su/catlean/pe" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27337;
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
throw new RuntimeException("su/catlean/pe", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/pe" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 2964;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/pe", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
k[var3] = var15;
}

return k[var3];
}

private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = c(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
throw new RuntimeException("su/catlean/pe" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
