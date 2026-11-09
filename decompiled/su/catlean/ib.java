package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class ib extends i8 {
@NotNull
public static final ib I;
@NotNull
private static final bj L;
@NotNull
private static final List m;
private static boolean c;
@NotNull
private static fd J;
@NotNull
private static fd B;
private static float H;
private static final long b = yz.a(3419684410584018462L, -4289339138080883700L, MethodHandles.lookup().lookupClass()).a(165092007176461L);
private static final String[] e;
private static final String[] i;
private static final Map j = new HashMap(13);
private static final long[] n;
private static final Integer[] q;
private static final Map r;

private ib(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 137677493640718L;
super(b<"m">(11228, 6663511907116762542L ^ var1), 0.0F, var3, 0.0F, 0.0F, 0.0F, d<"h">(22748, 6130190075920967036L ^ var1), null);
}

@NotNull
public final bj q() {
return L;
}

@Override
public void Y(long var1) {
long var3 = var1 ^ 120126245374909L;
long var5 = var1 ^ 84193765869375L;
m.clear();
Iterable var7 = yl.g.g().P(var3);
boolean var8 = false;

for (Object var10 : var7) {
String var11 = (String)var10;
boolean var12 = false;
m.add(new xs(var11, var5));
if (var1 > 0L && var1 >= 0L) {
continue;
}
break;
}
}

@Override
public void p(@NotNull class_332 context, int mouseX, int mouseY, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 4
// 002: dup2
// 003: ldc2_w 136208856317167
// 006: lxor
// 007: lstore 6
// 009: dup2
// 00a: ldc2_w 22135879901675
// 00d: lxor
// 00e: dup2
// 00f: bipush 48
// 011: lushr
// 012: l2i
// 013: istore 8
// 015: dup2
// 016: bipush 16
// 018: lshl
// 019: bipush 48
// 01b: lushr
// 01c: l2i
// 01d: istore 9
// 01f: dup2
// 020: bipush 32
// 022: lshl
// 023: bipush 32
// 025: lushr
// 026: l2i
// 027: istore 10
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 27182768661316
// 02e: lxor
// 02f: lstore 11
// 031: dup2
// 032: ldc2_w 38443269427772
// 035: lxor
// 036: lstore 13
// 038: dup2
// 039: ldc2_w 0
// 03c: lxor
// 03d: lstore 15
// 03f: dup2
// 040: ldc2_w 129382754651428
// 043: lxor
// 044: lstore 17
// 046: dup2
// 047: ldc2_w 55127167163707
// 04a: lxor
// 04b: lstore 19
// 04d: dup2
// 04e: ldc2_w 2881734234662
// 051: lxor
// 052: lstore 21
// 054: dup2
// 055: ldc2_w 55531218400380
// 058: lxor
// 059: lstore 23
// 05b: pop2
// 05c: aload 1
// 05d: sipush 2679
// 060: ldc2_w 7656951390293556217
// 063: lload 4
// 065: lxor
// 066: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/ib.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06e: ldc2_w -9095946699502124684
// 071: lload 4
// 073: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: aload 0
// 079: ldc 110.0
// 07b: invokevirtual su/catlean/ib.v (F)V
// 07e: aload 0
// 07f: aload 1
// 080: iload 2
// 081: iload 3
// 082: lload 15
// 084: invokespecial su/catlean/i8.p (Lnet/minecraft/class_332;IIJ)V
// 087: aload 0
// 088: invokevirtual su/catlean/ib.e ()F
// 08b: ldc 3.0
// 08d: fadd
// 08e: fstore 41
// 090: astore 40
// 092: aload 0
// 093: invokevirtual su/catlean/ib.e ()F
// 096: ldc 27.0
// 098: fadd
// 099: fstore 42
// 09b: iload 2
// 09c: i2f
// 09d: fstore 43
// 09f: fload 41
// 0a1: fload 43
// 0a3: fcmpg
// 0a4: aload 40
// 0a6: ifnull 0cd
// 0a9: ifgt 0f6
// 0ac: goto 0ba
// 0af: ldc2_w -9127222406751553623
// 0b2: lload 4
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: fload 43
// 0bc: fload 42
// 0be: fcmpg
// 0bf: goto 0cd
// 0c2: ldc2_w -9127222406751553623
// 0c5: lload 4
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: aload 40
// 0cf: ifnull 0f3
// 0d2: ifgt 0f2
// 0d5: goto 0e3
// 0d8: ldc2_w -9127222406751553623
// 0db: lload 4
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: bipush 1
// 0e4: goto 0f7
// 0e7: ldc2_w -9127222406751553623
// 0ea: lload 4
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: bipush 0
// 0f3: goto 0f7
// 0f6: bipush 0
// 0f7: ifeq 188
// 0fa: aload 0
// 0fb: invokevirtual su/catlean/ib.T ()F
// 0fe: ldc 5.0
// 100: fadd
// 101: fstore 41
// 103: aload 0
// 104: invokevirtual su/catlean/ib.T ()F
// 107: ldc 13.0
// 109: fadd
// 10a: fstore 42
// 10c: iload 3
// 10d: i2f
// 10e: fstore 43
// 110: fload 41
// 112: fload 43
// 114: fcmpg
// 115: aload 40
// 117: lload 4
// 119: lconst_0
// 11a: lcmp
// 11b: ifle 147
// 11e: ifnull 145
// 121: ifgt 16e
// 124: goto 132
// 127: ldc2_w -9127222406751553623
// 12a: lload 4
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: fload 43
// 134: fload 42
// 136: fcmpg
// 137: goto 145
// 13a: ldc2_w -9127222406751553623
// 13d: lload 4
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: aload 40
// 147: ifnull 16b
// 14a: ifgt 16a
// 14d: goto 15b
// 150: ldc2_w -9127222406751553623
// 153: lload 4
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: bipush 1
// 15c: goto 16f
// 15f: ldc2_w -9127222406751553623
// 162: lload 4
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: bipush 0
// 16b: goto 16f
// 16e: bipush 0
// 16f: lload 4
// 171: lconst_0
// 172: lcmp
// 173: iflt 17a
// 176: ifeq 188
// 179: bipush 1
// 17a: goto 189
// 17d: ldc2_w -9127222406751553623
// 180: lload 4
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: bipush 0
// 189: putstatic su/catlean/ib.c Z
// 18c: getstatic su/catlean/ib.J Lsu/catlean/fd;
// 18f: lload 4
// 191: lconst_0
// 192: lcmp
// 193: ifle 1a8
// 196: getstatic su/catlean/ib.H F
// 199: aload 40
// 19b: ifnull 1cd
// 19e: lload 13
// 1a0: dup2_x1
// 1a1: pop2
// 1a2: invokevirtual su/catlean/fd.B (JF)V
// 1a5: getstatic su/catlean/ib.B Lsu/catlean/fd;
// 1a8: aload 0
// 1a9: invokevirtual su/catlean/ib.W ()Lsu/catlean/cu;
// 1ac: ifnull 1d0
// 1af: goto 1bd
// 1b2: ldc2_w -9127222406751553623
// 1b5: lload 4
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: ldc 0.5
// 1bf: goto 1cd
// 1c2: ldc2_w -9127222406751553623
// 1c5: lload 4
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: goto 1d1
// 1d0: fconst_0
// 1d1: lload 13
// 1d3: dup2_x1
// 1d4: pop2
// 1d5: invokevirtual su/catlean/fd.B (JF)V
// 1d8: aload 1
// 1d9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1dc: dup
// 1dd: sipush 27478
// 1e0: ldc2_w 6524238666867743455
// 1e3: lload 4
// 1e5: lxor
// 1e6: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/ib.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ee: aload 0
// 1ef: invokevirtual su/catlean/ib.e ()F
// 1f2: ldc 5.0
// 1f4: fadd
// 1f5: aload 0
// 1f6: invokevirtual su/catlean/ib.T ()F
// 1f9: ldc 3.0
// 1fb: fadd
// 1fc: ldc 22.0
// 1fe: ldc 8.0
// 200: fconst_2
// 201: getstatic su/catlean/ib.c Z
// 204: ifeq 217
// 207: ldc 2.5
// 209: goto 218
// 20c: ldc2_w -9127222406751553623
// 20f: lload 4
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: fconst_2
// 218: getstatic su/catlean/ib.c Z
// 21b: ifeq 22e
// 21e: ldc 0.1
// 220: goto 22f
// 223: ldc2_w -9127222406751553623
// 226: lload 4
// 228: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: athrow
// 22e: fconst_0
// 22f: fconst_1
// 230: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 233: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 236: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 239: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 23c: fconst_0
// 23d: fconst_0
// 23e: fconst_0
// 23f: sipush 23730
// 242: ldc2_w 4937196087462493930
// 245: lload 4
// 247: lxor
// 248: invokedynamic h (IJ)I bsm=su/catlean/ib.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: aconst_null
// 24e: astore 25
// 250: istore 26
// 252: fstore 27
// 254: fstore 28
// 256: fstore 29
// 258: astore 30
// 25a: astore 31
// 25c: fstore 32
// 25e: fstore 33
// 260: fstore 34
// 262: fstore 35
// 264: fstore 36
// 266: fstore 37
// 268: fstore 38
// 26a: fstore 39
// 26c: iload 8
// 26e: i2c
// 26f: fload 39
// 271: fload 38
// 273: fload 37
// 275: fload 36
// 277: fload 35
// 279: fload 34
// 27b: fload 33
// 27d: fload 32
// 27f: aload 31
// 281: aload 30
// 283: fload 29
// 285: iload 9
// 287: i2s
// 288: fload 28
// 28a: iload 10
// 28c: fload 27
// 28e: iload 26
// 290: aload 25
// 292: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 295: lload 19
// 297: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 29a: aload 1
// 29b: ldc "+"
// 29d: aload 0
// 29e: invokevirtual su/catlean/ib.e ()F
// 2a1: ldc 13.5
// 2a3: fadd
// 2a4: lload 17
// 2a6: dup2_x1
// 2a7: pop2
// 2a8: aload 0
// 2a9: invokevirtual su/catlean/ib.T ()F
// 2ac: fconst_1
// 2ad: fadd
// 2ae: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 2b1: dup
// 2b2: sipush 27842
// 2b5: ldc2_w 166042514266987853
// 2b8: lload 4
// 2ba: lxor
// 2bb: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/ib.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c3: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 2c6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2c9: lload 21
// 2cb: aload 1
// 2cc: new su/catlean/o7
// 2cf: dup
// 2d0: aload 0
// 2d1: invokevirtual su/catlean/ib.e ()F
// 2d4: aload 0
// 2d5: invokevirtual su/catlean/ib.T ()F
// 2d8: ldc 14.0
// 2da: fadd
// 2db: aload 0
// 2dc: invokevirtual su/catlean/ib.e ()F
// 2df: aload 0
// 2e0: invokevirtual su/catlean/ib.y ()F
// 2e3: fadd
// 2e4: ldc 4.0
// 2e6: fsub
// 2e7: aload 0
// 2e8: invokevirtual su/catlean/ib.T ()F
// 2eb: aload 0
// 2ec: invokevirtual su/catlean/ib.j ()F
// 2ef: fadd
// 2f0: ldc 3.0
// 2f2: fsub
// 2f3: invokespecial su/catlean/o7.<init> (FFFF)V
// 2f6: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 2f9: fconst_0
// 2fa: fstore 41
// 2fc: ldc 17.0
// 2fe: getstatic su/catlean/ib.J Lsu/catlean/fd;
// 301: invokevirtual su/catlean/fd.a ()F
// 304: fadd
// 305: fstore 41
// 307: getstatic su/catlean/ib.m Ljava/util/List;
// 30a: checkcast java/lang/Iterable
// 30d: astore 42
// 30f: bipush 0
// 310: istore 43
// 312: aload 42
// 314: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 319: astore 44
// 31b: aload 44
// 31d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 322: ifeq 390
// 325: aload 44
// 327: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 32c: astore 45
// 32e: aload 45
// 330: checkcast su/catlean/xs
// 333: astore 46
// 335: bipush 0
// 336: istore 47
// 338: aload 46
// 33a: lload 6
// 33c: aload 1
// 33d: getstatic su/catlean/ib.I Lsu/catlean/ib;
// 340: invokevirtual su/catlean/ib.e ()F
// 343: getstatic su/catlean/ib.I Lsu/catlean/ib;
// 346: invokevirtual su/catlean/ib.T ()F
// 349: fload 41
// 34b: fadd
// 34c: iload 2
// 34d: i2f
// 34e: iload 3
// 34f: i2f
// 350: invokevirtual su/catlean/xs.o (JLnet/minecraft/class_332;FFFF)V
// 353: fload 41
// 355: ldc 29.0
// 357: fadd
// 358: fstore 41
// 35a: nop
// 35b: nop
// 35c: aload 40
// 35e: lload 4
// 360: lconst_0
// 361: lcmp
// 362: iflt 39c
// 365: ifnull 39a
// 368: aload 40
// 36a: ifnonnull 31b
// 36d: lload 4
// 36f: lconst_0
// 370: lcmp
// 371: iflt 35c
// 374: goto 382
// 377: ldc2_w -9127222406751553623
// 37a: lload 4
// 37c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 381: athrow
// 382: bipush 2
// 383: anewarray 511
// 386: ldc2_w -9137944270738650350
// 389: lload 4
// 38b: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 390: nop
// 391: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 394: lload 23
// 396: aload 1
// 397: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 39a: aload 40
// 39c: ifnull 3ee
// 39f: aload 0
// 3a0: invokevirtual su/catlean/ib.W ()Lsu/catlean/cu;
// 3a3: dup
// 3a4: ifnull 3f1
// 3a7: goto 3b5
// 3aa: ldc2_w -9127222406751553623
// 3ad: lload 4
// 3af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b4: athrow
// 3b5: aload 1
// 3b6: aload 0
// 3b7: invokevirtual su/catlean/ib.e ()F
// 3ba: aload 0
// 3bb: invokevirtual su/catlean/ib.y ()F
// 3be: fconst_2
// 3bf: fdiv
// 3c0: fadd
// 3c1: ldc 60.0
// 3c3: fsub
// 3c4: aload 0
// 3c5: invokevirtual su/catlean/ib.T ()F
// 3c8: aload 0
// 3c9: invokevirtual su/catlean/ib.j ()F
// 3cc: bipush 2
// 3cd: i2f
// 3ce: fdiv
// 3cf: fadd
// 3d0: ldc 35.0
// 3d2: fsub
// 3d3: iload 2
// 3d4: i2f
// 3d5: lload 11
// 3d7: dup2_x1
// 3d8: pop2
// 3d9: iload 3
// 3da: i2f
// 3db: invokeinterface su/catlean/cu.Y (Lnet/minecraft/class_332;FFJFF)V 8
// 3e0: goto 3ee
// 3e3: ldc2_w -9127222406751553623
// 3e6: lload 4
// 3e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ed: athrow
// 3ee: goto 3f2
// 3f1: pop
// 3f2: return
}

@Override
public void c(float mX, float mY, short a, int button, int a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 3
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 5
// 007: i2l
// 008: bipush 32
// 00a: lshl
// 00b: bipush 16
// 00d: lushr
// 00e: lor
// 00f: iload 6
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: lstore 7
// 01b: lload 7
// 01d: dup2
// 01e: ldc2_w 0
// 021: lxor
// 022: dup2
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 9
// 029: dup2
// 02a: bipush 16
// 02c: lshl
// 02d: bipush 32
// 02f: lushr
// 030: l2i
// 031: istore 10
// 033: dup2
// 034: bipush 48
// 036: lshl
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 11
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 38836403100948
// 042: lxor
// 043: lstore 12
// 045: dup2
// 046: ldc2_w 89123186698759
// 049: lxor
// 04a: lstore 14
// 04c: dup2
// 04d: ldc2_w 20382250252594
// 050: lxor
// 051: lstore 16
// 053: dup2
// 054: ldc2_w 20362906346987
// 057: lxor
// 058: lstore 18
// 05a: pop2
// 05b: ldc2_w -2807768596496098888
// 05e: lload 7
// 060: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: aload 0
// 066: fload 1
// 067: fload 2
// 068: iload 9
// 06a: i2s
// 06b: iload 4
// 06d: iload 10
// 06f: iload 11
// 071: i2c
// 072: invokespecial su/catlean/i8.c (FFSIIC)V
// 075: astore 20
// 077: aload 20
// 079: ifnull 0d6
// 07c: aload 0
// 07d: invokevirtual su/catlean/ib.W ()Lsu/catlean/cu;
// 080: dup
// 081: ifnull 0d5
// 084: goto 092
// 087: ldc2_w -2766918359667298459
// 08a: lload 7
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: lload 12
// 094: fload 1
// 095: fload 2
// 096: iload 4
// 098: invokeinterface su/catlean/cu.y (JFFI)Z 6
// 09d: aload 20
// 09f: ifnull 0d2
// 0a2: goto 0b0
// 0a5: ldc2_w -2766918359667298459
// 0a8: lload 7
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: bipush 1
// 0b1: if_icmpne 0d1
// 0b4: goto 0c2
// 0b7: ldc2_w -2766918359667298459
// 0ba: lload 7
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: bipush 1
// 0c3: goto 0d7
// 0c6: ldc2_w -2766918359667298459
// 0c9: lload 7
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: bipush 0
// 0d2: goto 0d7
// 0d5: pop
// 0d6: bipush 0
// 0d7: ifeq 0db
// 0da: return
// 0db: getstatic su/catlean/ib.c Z
// 0de: aload 20
// 0e0: ifnull 11d
// 0e3: ifeq 11c
// 0e6: goto 0f4
// 0e9: ldc2_w -2766918359667298459
// 0ec: lload 7
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: getstatic su/catlean/fz.I Lsu/catlean/b;
// 0f7: aconst_null
// 0f8: invokevirtual su/catlean/b.A (Lsu/catlean/fz;)V
// 0fb: aload 0
// 0fc: new su/catlean/rd
// 0ff: dup
// 100: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/ib.f (Ljava/lang/String;)Lkotlin/Unit;, (Ljava/lang/String;)Lkotlin/Unit; ]
// 105: lload 14
// 107: invokespecial su/catlean/rd.<init> (Lkotlin/jvm/functions/Function1;J)V
// 10a: checkcast su/catlean/cu
// 10d: invokevirtual su/catlean/ib.l (Lsu/catlean/cu;)V
// 110: return
// 111: ldc2_w -2766918359667298459
// 114: lload 7
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: bipush 0
// 11d: istore 21
// 11f: getstatic su/catlean/ib.m Ljava/util/List;
// 122: checkcast java/lang/Iterable
// 125: astore 22
// 127: bipush 0
// 128: istore 23
// 12a: aload 22
// 12c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 131: astore 24
// 133: aload 24
// 135: invokeinterface java/util/Iterator.hasNext ()Z 1
// 13a: ifeq 198
// 13d: aload 24
// 13f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 144: astore 25
// 146: aload 25
// 148: checkcast su/catlean/xs
// 14b: astore 26
// 14d: bipush 0
// 14e: istore 27
// 150: aload 20
// 152: iload 5
// 154: ifle 195
// 157: ifnull 193
// 15a: aload 26
// 15c: fload 1
// 15d: fload 2
// 15e: iload 4
// 160: lload 18
// 162: invokevirtual su/catlean/xs.P (FFIJ)Z
// 165: iload 6
// 167: ifle 1b2
// 16a: aload 20
// 16c: ifnull 1b2
// 16f: goto 17d
// 172: ldc2_w -2766918359667298459
// 175: lload 7
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: ifeq 191
// 180: goto 18e
// 183: ldc2_w -2766918359667298459
// 186: lload 7
// 188: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18d: athrow
// 18e: bipush 1
// 18f: istore 21
// 191: nop
// 192: nop
// 193: aload 20
// 195: ifnonnull 133
// 198: nop
// 199: aload 20
// 19b: iload 3
// 19c: iflt 144
// 19f: ifnull 1ce
// 1a2: iload 21
// 1a4: goto 1b2
// 1a7: ldc2_w -2766918359667298459
// 1aa: lload 7
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: ifeq 1c9
// 1b5: aload 0
// 1b6: lload 16
// 1b8: invokevirtual su/catlean/ib.Y (J)V
// 1bb: goto 1c9
// 1be: ldc2_w -2766918359667298459
// 1c1: lload 7
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: aload 0
// 1ca: aconst_null
// 1cb: invokevirtual su/catlean/ib.l (Lsu/catlean/cu;)V
// 1ce: return
}

@Override
public void a(double mouseX, long a, double mouseY, double amount) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: ldc2_w -966364225546980826
// 003: lload 3
// 004: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 009: aload 0
// 00a: invokevirtual su/catlean/ib.e ()F
// 00d: fstore 10
// 00f: astore 9
// 011: dload 1
// 012: aload 0
// 013: invokevirtual su/catlean/ib.e ()F
// 016: ldc 76.0
// 018: fadd
// 019: f2d
// 01a: dcmpg
// 01b: aload 9
// 01d: lload 3
// 01e: lconst_0
// 01f: lcmp
// 020: ifle 04a
// 023: ifnull 048
// 026: ifgt 06f
// 029: goto 036
// 02c: ldc2_w -1006576625875417861
// 02f: lload 3
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: fload 10
// 038: f2d
// 039: dload 1
// 03a: dcmpg
// 03b: goto 048
// 03e: ldc2_w -1006576625875417861
// 041: lload 3
// 042: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: athrow
// 048: aload 9
// 04a: ifnull 06c
// 04d: ifgt 06b
// 050: goto 05d
// 053: ldc2_w -1006576625875417861
// 056: lload 3
// 057: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: athrow
// 05d: bipush 1
// 05e: goto 070
// 061: ldc2_w -1006576625875417861
// 064: lload 3
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: bipush 0
// 06c: goto 070
// 06f: bipush 0
// 070: ifeq 111
// 073: aload 0
// 074: invokevirtual su/catlean/ib.T ()F
// 077: fstore 10
// 079: dload 5
// 07b: aload 0
// 07c: invokevirtual su/catlean/ib.T ()F
// 07f: aload 0
// 080: invokevirtual su/catlean/ib.j ()F
// 083: fadd
// 084: fconst_2
// 085: fsub
// 086: f2d
// 087: dcmpg
// 088: aload 9
// 08a: lload 3
// 08b: lconst_0
// 08c: lcmp
// 08d: iflt 0b8
// 090: ifnull 0b6
// 093: ifgt 0dd
// 096: goto 0a3
// 099: ldc2_w -1006576625875417861
// 09c: lload 3
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: fload 10
// 0a5: f2d
// 0a6: dload 5
// 0a8: dcmpg
// 0a9: goto 0b6
// 0ac: ldc2_w -1006576625875417861
// 0af: lload 3
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: aload 9
// 0b8: ifnull 0da
// 0bb: ifgt 0d9
// 0be: goto 0cb
// 0c1: ldc2_w -1006576625875417861
// 0c4: lload 3
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: bipush 1
// 0cc: goto 0de
// 0cf: ldc2_w -1006576625875417861
// 0d2: lload 3
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: goto 0de
// 0dd: bipush 0
// 0de: ifeq 111
// 0e1: getstatic su/catlean/ib.H F
// 0e4: dload 7
// 0e6: d2f
// 0e7: ldc 7.0
// 0e9: fmul
// 0ea: fadd
// 0eb: putstatic su/catlean/ib.H F
// 0ee: getstatic su/catlean/ib.H F
// 0f1: getstatic su/catlean/ib.m Ljava/util/List;
// 0f4: invokeinterface java/util/List.size ()I 1
// 0f9: i2f
// 0fa: ldc -29.0
// 0fc: fmul
// 0fd: fconst_0
// 0fe: invokestatic java/lang/Math.clamp (FFF)F
// 101: putstatic su/catlean/ib.H F
// 104: goto 111
// 107: ldc2_w -1006576625875417861
// 10a: lload 3
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: return
}

private static final Unit f(String var0) {
long var1 = b ^ 139409165981278L;
long var3 = var1 ^ 135403466604893L;
long var10001 = var1 ^ 7076747791837L;
int var5 = (int)((var1 ^ 7076747791837L) >>> 48);
int var6 = (int)((var1 ^ 7076747791837L) << 16 >>> 32);
int var7 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(var0, b<"m">(13979, 7155186363720558514L ^ var1));
c7.b.h((char)var5, var6, (short)var7, var0);
I.Y(var3);
I.l(null);
return Unit.INSTANCE;
}

static {
long var31 = b ^ 80980243709989L;
long var33 = var31 ^ 119782504013780L;
long var35 = var31 ^ 59976206362643L;
long var37 = var31 ^ 118659880981780L;
long var39 = var31 ^ 83880795133734L;
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[6];
int var27 = 0;
String var26 = "\u0006r6q\u0006\u0087\b\u009f^¬æ\u001c\u0091nù\u0098 ]»ö8éçIÅÛu\u0006íw\u0017\u001dM$ýmªkGp\u009d\u009c7nÞç\u0007\u0019Å\u0018#@\u0085T&g3\u0091\u008f`\u0089@5Q\u0004\u0084úXÐãs\u008d\u009fõ \u0099KV\u0085få\u008d\u0000r£ùnø\u0098óÀû\u0089½\u0086\u0089\u008bjø\u0014\u001bí@ÆQ\u000fG";
int var28 = "\u0006r6q\u0006\u0087\b\u009f^¬æ\u001c\u0091nù\u0098 ]»ö8éçIÅÛu\u0006íw\u0017\u001dM$ýmªkGp\u009d\u009c7nÞç\u0007\u0019Å\u0018#@\u0085T&g3\u0091\u008f`\u0089@5Q\u0004\u0084úXÐãs\u008d\u009fõ \u0099KV\u0085få\u008d\u0000r£ùnø\u0098óÀû\u0089½\u0086\u0089\u008bjø\u0014\u001bí@ÆQ\u000fG"
.length();
char var25 = 16;
int var43 = -1;

label74:
while (true) {
String var44 = var26.substring(++var43, var43 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var44.getBytes("ISO-8859-1"));
String var58 = b(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var58;
if ((var43 += var25) >= var28) {
e = var29;
i = new String[6];
r = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[4];
int var14 = 0;
String var15 = "ölO6lþ\u008b3ÜSEI¨ñÅ\u000b";
int var16 = "ölO6lþ\u008b3ÜSEI¨ñÅ\u000b".length();
byte var13 = 0;

label56:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var47 = var17;
var10001 = var14++;
long var62 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var66 = -1;

while (true) {
long var19 = var62;
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
long var70 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var66) {
case 0:
var47[var10001] = var70;
if (var13 >= var16) {
n = var17;
q = new Integer[4];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var31 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[2];
int var4 = 0;
String var5 = "]`}ÐæwÓ÷\u001f¢!¼\u00177¿ª";
int var6 = "]`}ÐæwÓ÷\u001f¢!¼\u00177¿ª".length();
byte var3 = 0;

do {
int var55 = var3;
var3 += 8;
byte[] var7 = var5.substring(var55, var3).getBytes("ISO-8859-1");
var55 = var4++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
var70 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var69 = -1;
var0[var55] = var70;
} while (var3 < var6);

I = new ib(var33);
L = new bj(b<"m">(29300, 2957522417847743780L ^ var31), d<"h">(20239, 8184080396376824717L ^ var31), d<"h">(10957, 1494839948645088846L ^ var31), var35);
m = new ArrayList();
J = new fd(_s.OUT_QUINT, var0[0], var37);
B = new fd(_s.OUT_QUINT, var0[1], var37);
I.q(240.0F);
I.Y(290.0F);
I.v(110.0F);
I.Y(var39);
return;
}
break;
default:
var47[var10001] = var70;
if (var13 < var16) {
continue label56;
}

var15 = "ß\u009b.\u0093@!O°R\u008fY\u0091J\u0092 ú";
var16 = "ß\u009b.\u0093@!O°R\u008fY\u0091J\u0092 ú".length();
var13 = 0;
}

byte var54 = var13;
var13 += 8;
var18 = var15.substring(var54, var13).getBytes("ISO-8859-1");
var47 = var17;
var10001 = var14++;
var62 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var66 = 0;
}
}
}

var25 = var26.charAt(var43);
break;
default:
var29[var27++] = var58;
if ((var43 += var25) < var28) {
var25 = var26.charAt(var43);
continue label74;
}

var26 = "Ë\u000b±9PÒµ¸Ì\u0090\u008e\u008e\tòÍ\u008e\u0010Ì[ÅäÃñÏSKT¶0ÎY\u0085ö";
var28 = "Ë\u000b±9PÒµ¸Ì\u0090\u008e\u008e\tòÍ\u008e\u0010Ì[ÅäÃñÏSKT¶0ÎY\u0085ö".length();
var25 = 16;
var43 = -1;
}

var44 = var26.substring(++var43, var43 + var25);
var10001 = 0;
}
}
}

private static NumberFormatException b(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29058;
if (i[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])j.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ib", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = e[var5].getBytes("ISO-8859-1");
i[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return i[var5];
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
throw new RuntimeException("su/catlean/ib" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 8784;
if (q[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = n[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])r.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
r.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ib", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
q[var3] = var15;
}

return q[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ib" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
