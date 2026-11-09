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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class u0 extends _g {
@NotNull
public static final u0 a;
static final KProperty[] U;
@NotNull
private static final cq l;
@NotNull
private static final cq B;
@NotNull
private static final cq P;
@NotNull
private static final cq k;
@NotNull
private static final cq u;
@NotNull
private static final av j;
@NotNull
private static final cq D;
@NotNull
private static final cq b;
@NotNull
private static final cp O;
@NotNull
private static final cq L;
@NotNull
private static final cq w;
@NotNull
private static final cq o;
@NotNull
private static final i9 t;
@NotNull
private static List E;
private static final long c = yz.a(4505002095066251631L, -8975444313398476768L, MethodHandles.lookup().lookupClass()).a(114886712624630L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private u0(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 5549277935506L;
super(b<"x">(23341, 1461384721188198630L ^ var1), jt.Q(), null, 4, null, var3);
}

private final boolean F(char var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 65940060843680L;
return (Boolean)l.E(this, var6, U[0]);
}

private final boolean P(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 14665730627272L;
return (Boolean)B.E(this, var3, U[1]);
}

private final boolean V(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 48232609983859L;
return (Boolean)P.E(this, var3, U[2]);
}

private final boolean L(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 105749667984440L;
return (Boolean)k.E(this, var3, U[3]);
}

private final boolean t(short var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ c;
long var6 = var4 ^ 40750576816278L;
return (Boolean)u.E(this, var6, U[4]);
}

private final lj a(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 34254114326158L;
return (lj)j.E(this, var3, U[5]);
}

private final boolean z(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 21661533088427L;
return (Boolean)D.E(this, var3, U[c<"b">(1593, 1817428160199415596L ^ var1)]);
}

private final boolean Z(char var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 68613048340125L;
return (Boolean)b.E(this, var6, U[c<"b">(13913, 6044315079986627445L ^ var4)]);
}

private final h s(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 63098942127758L;
return (h)O.E(this, var3, U[c<"b">(26622, 5866581688131642058L ^ var1)]);
}

private final boolean E(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 114999257275809L;
return (Boolean)L.E(this, var3, U[c<"b">(17690, 1829809583856919298L ^ var1)]);
}

private final boolean l(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 99625094791946L;
return (Boolean)w.E(this, var3, U[c<"b">(4571, 9065924112147163495L ^ var1)]);
}

private final boolean Q(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 55845927747987L;
return (Boolean)o.E(this, var3, U[c<"b">(21346, 6414606823052257624L ^ var1)]);
}

@Flow
private final void B(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 0000: getstatic su/catlean/u0.c J
// 0003: ldc2_w 2380451361047
// 0006: lxor
// 0007: lstore 2
// 0008: lload 2
// 0009: dup2
// 000a: ldc2_w 70239927239534
// 000d: lxor
// 000e: dup2
// 000f: bipush 56
// 0011: lushr
// 0012: l2i
// 0013: istore 4
// 0015: dup2
// 0016: bipush 8
// 0018: lshl
// 0019: bipush 8
// 001b: lushr
// 001c: lstore 5
// 001e: pop2
// 001f: dup2
// 0020: ldc2_w 114235270442373
// 0023: lxor
// 0024: dup2
// 0025: bipush 48
// 0027: lushr
// 0028: l2i
// 0029: istore 7
// 002b: dup2
// 002c: bipush 16
// 002e: lshl
// 002f: bipush 16
// 0031: lushr
// 0032: lstore 8
// 0034: pop2
// 0035: dup2
// 0036: ldc2_w 126226359542888
// 0039: lxor
// 003a: dup2
// 003b: bipush 48
// 003d: lushr
// 003e: l2i
// 003f: istore 10
// 0041: dup2
// 0042: bipush 16
// 0044: lshl
// 0045: bipush 48
// 0047: lushr
// 0048: l2i
// 0049: istore 11
// 004b: dup2
// 004c: bipush 32
// 004e: lshl
// 004f: bipush 32
// 0051: lushr
// 0052: l2i
// 0053: istore 12
// 0055: pop2
// 0056: dup2
// 0057: ldc2_w 103138996648861
// 005a: lxor
// 005b: lstore 13
// 005d: dup2
// 005e: ldc2_w 115674282545248
// 0061: lxor
// 0062: lstore 15
// 0064: dup2
// 0065: ldc2_w 113572606059686
// 0068: lxor
// 0069: lstore 17
// 006b: dup2
// 006c: ldc2_w 11909678081043
// 006f: lxor
// 0070: dup2
// 0071: bipush 32
// 0073: lushr
// 0074: l2i
// 0075: istore 19
// 0077: dup2
// 0078: bipush 32
// 007a: lshl
// 007b: bipush 48
// 007d: lushr
// 007e: l2i
// 007f: istore 20
// 0081: dup2
// 0082: bipush 48
// 0084: lshl
// 0085: bipush 48
// 0087: lushr
// 0088: l2i
// 0089: istore 21
// 008b: pop2
// 008c: dup2
// 008d: ldc2_w 121298794238819
// 0090: lxor
// 0091: dup2
// 0092: bipush 48
// 0094: lushr
// 0095: l2i
// 0096: istore 22
// 0098: dup2
// 0099: bipush 16
// 009b: lshl
// 009c: bipush 32
// 009e: lushr
// 009f: l2i
// 00a0: istore 23
// 00a2: dup2
// 00a3: bipush 48
// 00a5: lshl
// 00a6: bipush 48
// 00a8: lushr
// 00a9: l2i
// 00aa: istore 24
// 00ac: pop2
// 00ad: dup2
// 00ae: ldc2_w 101908745749359
// 00b1: lxor
// 00b2: lstore 25
// 00b4: dup2
// 00b5: ldc2_w 69949593163313
// 00b8: lxor
// 00b9: lstore 27
// 00bb: dup2
// 00bc: ldc2_w 137973514126285
// 00bf: lxor
// 00c0: lstore 29
// 00c2: dup2
// 00c3: ldc2_w 10847380976379
// 00c6: lxor
// 00c7: lstore 31
// 00c9: dup2
// 00ca: ldc2_w 48689492089693
// 00cd: lxor
// 00ce: dup2
// 00cf: bipush 48
// 00d1: lushr
// 00d2: l2i
// 00d3: istore 33
// 00d5: dup2
// 00d6: bipush 16
// 00d8: lshl
// 00d9: bipush 32
// 00db: lushr
// 00dc: l2i
// 00dd: istore 34
// 00df: dup2
// 00e0: bipush 48
// 00e2: lshl
// 00e3: bipush 48
// 00e5: lushr
// 00e6: l2i
// 00e7: istore 35
// 00e9: pop2
// 00ea: dup2
// 00eb: ldc2_w 87669455121371
// 00ee: lxor
// 00ef: lstore 36
// 00f1: dup2
// 00f2: ldc2_w 58549131429773
// 00f5: lxor
// 00f6: lstore 38
// 00f8: dup2
// 00f9: ldc2_w 73703225859680
// 00fc: lxor
// 00fd: dup2
// 00fe: bipush 32
// 0100: lushr
// 0101: l2i
// 0102: istore 40
// 0104: dup2
// 0105: bipush 32
// 0107: lshl
// 0108: bipush 48
// 010a: lushr
// 010b: l2i
// 010c: istore 41
// 010e: dup2
// 010f: bipush 48
// 0111: lshl
// 0112: bipush 48
// 0114: lushr
// 0115: l2i
// 0116: istore 42
// 0118: pop2
// 0119: dup2
// 011a: ldc2_w 30855960481468
// 011d: lxor
// 011e: dup2
// 011f: bipush 48
// 0121: lushr
// 0122: l2i
// 0123: istore 43
// 0125: dup2
// 0126: bipush 16
// 0128: lshl
// 0129: bipush 32
// 012b: lushr
// 012c: l2i
// 012d: istore 44
// 012f: dup2
// 0130: bipush 48
// 0132: lshl
// 0133: bipush 48
// 0135: lushr
// 0136: l2i
// 0137: istore 45
// 0139: pop2
// 013a: dup2
// 013b: ldc2_w 103610454602976
// 013e: lxor
// 013f: dup2
// 0140: bipush 32
// 0142: lushr
// 0143: l2i
// 0144: istore 46
// 0146: dup2
// 0147: bipush 32
// 0149: lshl
// 014a: bipush 48
// 014c: lushr
// 014d: l2i
// 014e: istore 47
// 0150: dup2
// 0151: bipush 48
// 0153: lshl
// 0154: bipush 48
// 0156: lushr
// 0157: l2i
// 0158: istore 48
// 015a: pop2
// 015b: dup2
// 015c: ldc2_w 65964384403692
// 015f: lxor
// 0160: dup2
// 0161: bipush 32
// 0163: lushr
// 0164: l2i
// 0165: istore 49
// 0167: dup2
// 0168: bipush 32
// 016a: lshl
// 016b: bipush 48
// 016d: lushr
// 016e: l2i
// 016f: istore 50
// 0171: dup2
// 0172: bipush 48
// 0174: lshl
// 0175: bipush 48
// 0177: lushr
// 0178: l2i
// 0179: istore 51
// 017b: pop2
// 017c: dup2
// 017d: ldc2_w 66802495860666
// 0180: lxor
// 0181: lstore 52
// 0183: pop2
// 0184: getstatic su/catlean/u0.E Ljava/util/List;
// 0187: invokeinterface java/util/List.clear ()V 1
// 018c: ldc2_w -3348752357614084723
// 018f: lload 2
// 0190: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0195: aload 0
// 0196: lload 25
// 0198: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 019b: iload 4
// 019d: i2b
// 019e: swap
// 019f: lload 5
// 01a1: dup2_x1
// 01a2: pop2
// 01a3: checkcast net/minecraft/class_1297
// 01a6: invokevirtual su/catlean/u0.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 01a9: checkcast net/minecraft/class_2374
// 01ac: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 01af: dup
// 01b0: sipush 11467
// 01b3: ldc2_w 7558136253450524739
// 01b6: lload 2
// 01b7: lxor
// 01b8: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01bd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 01c0: astore 62
// 01c2: astore 61
// 01c4: aload 0
// 01c5: iload 7
// 01c7: i2s
// 01c8: lload 8
// 01ca: invokespecial su/catlean/u0.t (SJ)Z
// 01cd: aload 61
// 01cf: ifnonnull 0217
// 01d2: ifeq 0211
// 01d5: goto 01e2
// 01d8: ldc2_w -3328331410203967497
// 01db: lload 2
// 01dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e1: athrow
// 01e2: aload 0
// 01e3: iload 10
// 01e5: i2c
// 01e6: iload 11
// 01e8: i2s
// 01e9: iload 12
// 01eb: invokespecial su/catlean/u0.w (CSI)Z
// 01ee: aload 61
// 01f0: ifnonnull 0217
// 01f3: goto 0200
// 01f6: ldc2_w -3328331410203967497
// 01f9: lload 2
// 01fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01ff: athrow
// 0200: ifeq 0211
// 0203: goto 0210
// 0206: ldc2_w -3328331410203967497
// 0209: lload 2
// 020a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 020f: athrow
// 0210: return
// 0211: aload 0
// 0212: lload 15
// 0214: invokespecial su/catlean/u0.V (J)Z
// 0217: aload 61
// 0219: ifnonnull 0283
// 021c: ifeq 025a
// 021f: goto 022c
// 0222: ldc2_w -3328331410203967497
// 0225: lload 2
// 0226: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 022b: athrow
// 022c: aload 0
// 022d: iload 40
// 022f: iload 41
// 0231: iload 42
// 0233: i2s
// 0234: invokespecial su/catlean/u0.i (IIS)Z
// 0237: aload 61
// 0239: ifnonnull 0283
// 023c: goto 0249
// 023f: ldc2_w -3328331410203967497
// 0242: lload 2
// 0243: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0248: athrow
// 0249: ifeq 025a
// 024c: goto 0259
// 024f: ldc2_w -3328331410203967497
// 0252: lload 2
// 0253: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0258: athrow
// 0259: return
// 025a: aload 0
// 025b: aload 61
// 025d: ifnonnull 0287
// 0260: lload 13
// 0262: invokespecial su/catlean/u0.a (J)Lsu/catlean/lj;
// 0265: invokevirtual su/catlean/lj.X ()I
// 0268: iload 22
// 026a: i2s
// 026b: swap
// 026c: iload 23
// 026e: swap
// 026f: iload 24
// 0271: i2c
// 0272: swap
// 0273: invokestatic su/catlean/bx.k (SICI)Z
// 0276: goto 0283
// 0279: ldc2_w -3328331410203967497
// 027c: lload 2
// 027d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0282: athrow
// 0283: ifeq 0295
// 0286: aload 0
// 0287: aload 62
// 0289: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 028c: lload 29
// 028e: dup2_x1
// 028f: pop2
// 0290: bipush 1
// 0291: invokespecial su/catlean/u0.Z (JLnet/minecraft/class_2338;Z)V
// 0294: return
// 0295: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 0298: aload 61
// 029a: ifnonnull 02ea
// 029d: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 02a0: ifnonnull 02e7
// 02a3: goto 02b0
// 02a6: ldc2_w -3328331410203967497
// 02a9: lload 2
// 02aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02af: athrow
// 02b0: iload 33
// 02b2: i2c
// 02b3: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 02b6: lload 25
// 02b8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 02bb: invokevirtual net/minecraft/class_746.method_55754 ()D
// 02be: d2f
// 02bf: getstatic su/catlean/w2.FOV Lsu/catlean/w2;
// 02c2: bipush 0
// 02c3: bipush 0
// 02c4: sipush 13192
// 02c7: ldc2_w 1100365208830399524
// 02ca: lload 2
// 02cb: lxor
// 02cc: invokedynamic b (IJ)I bsm=su/catlean/u0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d1: iload 34
// 02d3: iload 35
// 02d5: i2c
// 02d6: aconst_null
// 02d7: invokestatic su/catlean/dx.Y (CLsu/catlean/dx;FLsu/catlean/w2;ZZIICLjava/lang/Object;)Lnet/minecraft/class_1657;
// 02da: goto 02ed
// 02dd: ldc2_w -3328331410203967497
// 02e0: lload 2
// 02e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e6: athrow
// 02e7: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 02ea: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 02ed: astore 63
// 02ef: aload 63
// 02f1: ifnull 0331
// 02f4: getstatic su/catlean/u0.t Lsu/catlean/i9;
// 02f7: iload 43
// 02f9: i2s
// 02fa: iload 44
// 02fc: iload 45
// 02fe: i2s
// 02ff: sipush 29280
// 0302: ldc2_w 3928718243530053072
// 0305: lload 2
// 0306: lxor
// 0307: invokedynamic b (IJ)I bsm=su/catlean/u0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 030c: invokevirtual su/catlean/i9.g (SISI)Z
// 030f: aload 61
// 0311: ifnonnull 034a
// 0314: goto 0321
// 0317: ldc2_w -3328331410203967497
// 031a: lload 2
// 031b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0320: athrow
// 0321: ifne 0332
// 0324: goto 0331
// 0327: ldc2_w -3328331410203967497
// 032a: lload 2
// 032b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0330: athrow
// 0331: return
// 0332: aload 0
// 0333: aload 61
// 0335: ifnonnull 0383
// 0338: lload 36
// 033a: invokespecial su/catlean/u0.P (J)Z
// 033d: goto 034a
// 0340: ldc2_w -3328331410203967497
// 0343: lload 2
// 0344: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0349: athrow
// 034a: ifeq 0382
// 034d: aload 0
// 034e: aload 63
// 0350: aload 61
// 0352: ifnonnull 0388
// 0355: goto 0362
// 0358: ldc2_w -3328331410203967497
// 035b: lload 2
// 035c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0361: athrow
// 0362: lload 31
// 0364: invokespecial su/catlean/u0.l (Lnet/minecraft/class_1657;J)Z
// 0367: ifeq 0382
// 036a: goto 0377
// 036d: ldc2_w -3328331410203967497
// 0370: lload 2
// 0371: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0376: athrow
// 0377: return
// 0378: ldc2_w -3328331410203967497
// 037b: lload 2
// 037c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0381: athrow
// 0382: aload 0
// 0383: aload 63
// 0385: checkcast net/minecraft/class_1297
// 0388: astore 54
// 038a: iload 4
// 038c: i2b
// 038d: lload 5
// 038f: aload 54
// 0391: invokevirtual su/catlean/u0.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0394: checkcast net/minecraft/class_2374
// 0397: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 039a: dup
// 039b: sipush 11467
// 039e: ldc2_w 7558136253450524739
// 03a1: lload 2
// 03a2: lxor
// 03a3: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 03ab: astore 64
// 03ad: new java/util/ArrayList
// 03b0: dup
// 03b1: invokespecial java/util/ArrayList.<init> ()V
// 03b4: checkcast java/util/List
// 03b7: astore 65
// 03b9: new java/util/ArrayList
// 03bc: dup
// 03bd: invokespecial java/util/ArrayList.<init> ()V
// 03c0: checkcast java/util/List
// 03c3: astore 66
// 03c5: aload 63
// 03c7: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 03ca: dup
// 03cb: sipush 8105
// 03ce: ldc2_w 177092281390803723
// 03d1: lload 2
// 03d2: lxor
// 03d3: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 03db: astore 67
// 03dd: aload 66
// 03df: aload 67
// 03e1: getfield net/minecraft/class_238.field_1323 D
// 03e4: ldc2_w 0.001
// 03e7: dadd
// 03e8: aload 67
// 03ea: getfield net/minecraft/class_238.field_1322 D
// 03ed: aload 67
// 03ef: getfield net/minecraft/class_238.field_1321 D
// 03f2: ldc2_w 0.001
// 03f5: dadd
// 03f6: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 03f9: dup
// 03fa: sipush 11467
// 03fd: ldc2_w 7558136253450524739
// 0400: lload 2
// 0401: lxor
// 0402: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0407: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 040a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 040f: pop
// 0410: aload 66
// 0412: aload 67
// 0414: getfield net/minecraft/class_238.field_1323 D
// 0417: ldc2_w 0.001
// 041a: dadd
// 041b: aload 67
// 041d: getfield net/minecraft/class_238.field_1322 D
// 0420: aload 67
// 0422: getfield net/minecraft/class_238.field_1324 D
// 0425: ldc2_w 0.001
// 0428: dsub
// 0429: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 042c: dup
// 042d: sipush 11467
// 0430: ldc2_w 7558136253450524739
// 0433: lload 2
// 0434: lxor
// 0435: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 043d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0442: pop
// 0443: aload 66
// 0445: aload 67
// 0447: getfield net/minecraft/class_238.field_1320 D
// 044a: ldc2_w 0.001
// 044d: dsub
// 044e: aload 67
// 0450: getfield net/minecraft/class_238.field_1322 D
// 0453: aload 67
// 0455: getfield net/minecraft/class_238.field_1324 D
// 0458: ldc2_w 0.001
// 045b: dsub
// 045c: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 045f: dup
// 0460: sipush 11467
// 0463: ldc2_w 7558136253450524739
// 0466: lload 2
// 0467: lxor
// 0468: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0470: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0475: pop
// 0476: aload 66
// 0478: aload 67
// 047a: getfield net/minecraft/class_238.field_1320 D
// 047d: ldc2_w 0.001
// 0480: dsub
// 0481: aload 67
// 0483: getfield net/minecraft/class_238.field_1322 D
// 0486: aload 67
// 0488: getfield net/minecraft/class_238.field_1321 D
// 048b: ldc2_w 0.001
// 048e: dadd
// 048f: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 0492: dup
// 0493: sipush 11467
// 0496: ldc2_w 7558136253450524739
// 0499: lload 2
// 049a: lxor
// 049b: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04a0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 04a3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 04a8: pop
// 04a9: aload 66
// 04ab: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 04b0: astore 68
// 04b2: aload 68
// 04b4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 04b9: ifeq 0585
// 04bc: aload 68
// 04be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 04c3: checkcast net/minecraft/class_2338
// 04c6: astore 69
// 04c8: lload 25
// 04ca: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 04cd: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 04d0: aload 69
// 04d2: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 04d5: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 04d8: lload 25
// 04da: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 04dd: invokevirtual net/minecraft/class_746.method_55754 ()D
// 04e0: dcmpl
// 04e1: aload 61
// 04e3: ifnonnull 050a
// 04e6: ifgt 050d
// 04e9: goto 04f6
// 04ec: ldc2_w -3328331410203967497
// 04ef: lload 2
// 04f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f5: athrow
// 04f6: aload 69
// 04f8: aload 62
// 04fa: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 04fd: goto 050a
// 0500: ldc2_w -3328331410203967497
// 0503: lload 2
// 0504: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0509: athrow
// 050a: ifeq 051f
// 050d: aload 61
// 050f: ifnull 04b2
// 0512: goto 051f
// 0515: ldc2_w -3328331410203967497
// 0518: lload 2
// 0519: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051e: athrow
// 051f: aload 0
// 0520: lload 38
// 0522: aload 69
// 0524: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0527: astore 70
// 0529: aload 70
// 052b: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 052e: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 0531: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0534: aload 61
// 0536: ifnonnull 057f
// 0539: ifne 0576
// 053c: goto 0549
// 053f: ldc2_w -3328331410203967497
// 0542: lload 2
// 0543: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0548: athrow
// 0549: aload 70
// 054b: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 054e: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
// 0551: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0554: aload 61
// 0556: ifnonnull 057f
// 0559: goto 0566
// 055c: ldc2_w -3328331410203967497
// 055f: lload 2
// 0560: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0565: athrow
// 0566: ifeq 04b2
// 0569: goto 0576
// 056c: ldc2_w -3328331410203967497
// 056f: lload 2
// 0570: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0575: athrow
// 0576: aload 65
// 0578: aload 69
// 057a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 057f: pop
// 0580: aload 61
// 0582: ifnull 04b2
// 0585: aload 0
// 0586: lload 38
// 0588: aload 64
// 058a: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 058d: astore 68
// 058f: new java/util/ArrayList
// 0592: dup
// 0593: invokespecial java/util/ArrayList.<init> ()V
// 0596: astore 69
// 0598: bipush 0
// 0599: istore 70
// 059b: aload 68
// 059d: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 05a0: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 05a3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 05a6: aload 61
// 05a8: ifnonnull 1219
// 05ab: ifne 1217
// 05ae: goto 05bb
// 05b1: ldc2_w -3328331410203967497
// 05b4: lload 2
// 05b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05ba: athrow
// 05bb: aload 0
// 05bc: aload 63
// 05be: aload 66
// 05c0: aload 61
// 05c2: ifnonnull 05f3
// 05c5: goto 05d2
// 05c8: ldc2_w -3328331410203967497
// 05cb: lload 2
// 05cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d1: athrow
// 05d2: astore 54
// 05d4: iload 46
// 05d6: aload 54
// 05d8: iload 47
// 05da: i2c
// 05db: iload 48
// 05dd: invokespecial su/catlean/u0.O (Lnet/minecraft/class_1657;ILjava/util/List;CI)Z
// 05e0: ifeq 05ee
// 05e3: return
// 05e4: ldc2_w -3328331410203967497
// 05e7: lload 2
// 05e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05ed: athrow
// 05ee: aload 0
// 05ef: aload 63
// 05f1: aload 66
// 05f3: aload 69
// 05f5: checkcast java/util/List
// 05f8: bipush 0
// 05f9: sipush 26622
// 05fc: ldc2_w 5866590039278747712
// 05ff: lload 2
// 0600: lxor
// 0601: invokedynamic b (IJ)I bsm=su/catlean/u0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0606: aconst_null
// 0607: astore 54
// 0609: istore 55
// 060b: istore 56
// 060d: astore 57
// 060f: astore 58
// 0611: astore 59
// 0613: astore 60
// 0615: iload 19
// 0617: aload 60
// 0619: aload 59
// 061b: aload 58
// 061d: iload 20
// 061f: i2s
// 0620: aload 57
// 0622: iload 56
// 0624: iload 21
// 0626: i2s
// 0627: iload 55
// 0629: aload 54
// 062b: invokestatic su/catlean/u0.U (ILsu/catlean/u0;Lnet/minecraft/class_1657;Ljava/util/List;SLjava/util/List;ZSILjava/lang/Object;)V
// 062e: getstatic su/catlean/gj.Y Lkotlin/enums/EnumEntries;
// 0631: checkcast java/lang/Iterable
// 0634: astore 72
// 0636: bipush 0
// 0637: istore 73
// 0639: aload 72
// 063b: astore 74
// 063d: new java/util/ArrayList
// 0640: dup
// 0641: invokespecial java/util/ArrayList.<init> ()V
// 0644: checkcast java/util/Collection
// 0647: astore 75
// 0649: bipush 0
// 064a: istore 76
// 064c: aload 74
// 064e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0653: astore 77
// 0655: aload 77
// 0657: invokeinterface java/util/Iterator.hasNext ()Z 1
// 065c: ifeq 06d4
// 065f: aload 77
// 0661: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0666: astore 78
// 0668: aload 78
// 066a: checkcast net/minecraft/class_2350
// 066d: astore 79
// 066f: bipush 0
// 0670: istore 80
// 0672: aload 61
// 0674: ifnonnull 1217
// 0677: aload 79
// 0679: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 067c: aload 61
// 067e: ifnonnull 06b0
// 0681: goto 068e
// 0684: ldc2_w -3328331410203967497
// 0687: lload 2
// 0688: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068d: athrow
// 068e: if_acmpeq 06c1
// 0691: goto 069e
// 0694: ldc2_w -3328331410203967497
// 0697: lload 2
// 0698: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069d: athrow
// 069e: aload 79
// 06a0: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 06a3: goto 06b0
// 06a6: ldc2_w -3328331410203967497
// 06a9: lload 2
// 06aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06af: athrow
// 06b0: if_acmpeq 06c1
// 06b3: bipush 1
// 06b4: goto 06c2
// 06b7: ldc2_w -3328331410203967497
// 06ba: lload 2
// 06bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c0: athrow
// 06c1: bipush 0
// 06c2: ifeq 0655
// 06c5: aload 75
// 06c7: aload 78
// 06c9: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 06ce: pop
// 06cf: aload 61
// 06d1: ifnull 0655
// 06d4: aload 75
// 06d6: checkcast java/util/List
// 06d9: nop
// 06da: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 06df: astore 71
// 06e1: aload 71
// 06e3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 06e8: ifeq 1217
// 06eb: aload 71
// 06ed: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 06f2: checkcast net/minecraft/class_2350
// 06f5: astore 72
// 06f7: fconst_0
// 06f8: fstore 73
// 06fa: aload 64
// 06fc: aload 72
// 06fe: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 0701: dup
// 0702: sipush 625
// 0705: ldc2_w 5983450901024126707
// 0708: lload 2
// 0709: lxor
// 070a: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0712: astore 74
// 0714: aload 0
// 0715: lload 38
// 0717: aload 74
// 0719: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 071c: astore 75
// 071e: aload 75
// 0720: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0723: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 0726: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0729: aload 61
// 072b: ifnonnull 1219
// 072e: aload 61
// 0730: ifnonnull 076e
// 0733: goto 0740
// 0736: ldc2_w -3328331410203967497
// 0739: lload 2
// 073a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073f: athrow
// 0740: ifeq 0763
// 0743: goto 0750
// 0746: ldc2_w -3328331410203967497
// 0749: lload 2
// 074a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074f: athrow
// 0750: iload 70
// 0752: iinc 70 1
// 0755: pop
// 0756: goto 0763
// 0759: ldc2_w -3328331410203967497
// 075c: lload 2
// 075d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0762: athrow
// 0763: aload 75
// 0765: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0768: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 076b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 076e: aload 61
// 0770: ifnonnull 07d6
// 0773: ifne 07b0
// 0776: goto 0783
// 0779: ldc2_w -3328331410203967497
// 077c: lload 2
// 077d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0782: athrow
// 0783: aload 75
// 0785: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0788: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
// 078b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 078e: aload 61
// 0790: ifnonnull 07d6
// 0793: goto 07a0
// 0796: ldc2_w -3328331410203967497
// 0799: lload 2
// 079a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079f: athrow
// 07a0: ifeq 0802
// 07a3: goto 07b0
// 07a6: ldc2_w -3328331410203967497
// 07a9: lload 2
// 07aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07af: athrow
// 07b0: aload 74
// 07b2: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 07b5: lload 25
// 07b7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07ba: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 07bd: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 07c0: lload 25
// 07c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07c5: invokevirtual net/minecraft/class_746.method_55754 ()D
// 07c8: dcmpl
// 07c9: goto 07d6
// 07cc: ldc2_w -3328331410203967497
// 07cf: lload 2
// 07d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d5: athrow
// 07d6: aload 61
// 07d8: ifnonnull 07ff
// 07db: ifgt 0802
// 07de: goto 07eb
// 07e1: ldc2_w -3328331410203967497
// 07e4: lload 2
// 07e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07ea: athrow
// 07eb: aload 74
// 07ed: aload 62
// 07ef: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 07f2: goto 07ff
// 07f5: ldc2_w -3328331410203967497
// 07f8: lload 2
// 07f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07fe: athrow
// 07ff: ifeq 0814
// 0802: aload 61
// 0804: ifnull 06e1
// 0807: goto 0814
// 080a: ldc2_w -3328331410203967497
// 080d: lload 2
// 080e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0813: athrow
// 0814: aload 0
// 0815: aload 74
// 0817: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 081a: dup
// 081b: sipush 6417
// 081e: ldc2_w 5793176944837635487
// 0821: lload 2
// 0822: lxor
// 0823: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0828: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 082b: lload 38
// 082d: dup2_x1
// 082e: pop2
// 082f: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0832: astore 76
// 0834: aload 76
// 0836: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0839: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 083c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 083f: aload 61
// 0841: ifnonnull 086c
// 0844: ifne 0881
// 0847: goto 0854
// 084a: ldc2_w -3328331410203967497
// 084d: lload 2
// 084e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0853: athrow
// 0854: aload 76
// 0856: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0859: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 085c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 085f: goto 086c
// 0862: ldc2_w -3328331410203967497
// 0865: lload 2
// 0866: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086b: athrow
// 086c: aload 61
// 086e: ifnonnull 0889
// 0871: ifeq 0888
// 0874: goto 0881
// 0877: ldc2_w -3328331410203967497
// 087a: lload 2
// 087b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0880: athrow
// 0881: fload 73
// 0883: ldc 6.0
// 0885: fadd
// 0886: fstore 73
// 0888: bipush 1
// 0889: istore 77
// 088b: iload 77
// 088d: bipush 3
// 088e: if_icmpge 095f
// 0891: aload 0
// 0892: aload 74
// 0894: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 0897: aload 72
// 0899: iload 77
// 089b: invokevirtual net/minecraft/class_2338.method_10079 (Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2338;
// 089e: dup
// 089f: sipush 625
// 08a2: ldc2_w 5983450901024126707
// 08a5: lload 2
// 08a6: lxor
// 08a7: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08af: lload 38
// 08b1: dup2_x1
// 08b2: pop2
// 08b3: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 08b6: astore 78
// 08b8: aload 0
// 08b9: aload 74
// 08bb: aload 72
// 08bd: iload 77
// 08bf: invokevirtual net/minecraft/class_2338.method_10079 (Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2338;
// 08c2: dup
// 08c3: sipush 625
// 08c6: ldc2_w 5983450901024126707
// 08c9: lload 2
// 08ca: lxor
// 08cb: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08d3: lload 38
// 08d5: dup2_x1
// 08d6: pop2
// 08d7: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 08da: astore 79
// 08dc: aload 78
// 08de: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 08e1: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 08e4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 08e7: aload 61
// 08e9: ifnonnull 1219
// 08ec: aload 61
// 08ee: ifnonnull 094d
// 08f1: goto 08fe
// 08f4: ldc2_w -3328331410203967497
// 08f7: lload 2
// 08f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08fd: athrow
// 08fe: ifne 093b
// 0901: goto 090e
// 0904: ldc2_w -3328331410203967497
// 0907: lload 2
// 0908: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090d: athrow
// 090e: aload 78
// 0910: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0913: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 0916: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0919: aload 61
// 091b: ifnonnull 094d
// 091e: goto 092b
// 0921: ldc2_w -3328331410203967497
// 0924: lload 2
// 0925: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092a: athrow
// 092b: ifeq 0957
// 092e: goto 093b
// 0931: ldc2_w -3328331410203967497
// 0934: lload 2
// 0935: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093a: athrow
// 093b: aload 79
// 093d: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 0940: goto 094d
// 0943: ldc2_w -3328331410203967497
// 0946: lload 2
// 0947: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094c: athrow
// 094d: ifeq 0957
// 0950: fload 73
// 0952: ldc 7.5
// 0954: fadd
// 0955: fstore 73
// 0957: iinc 77 1
// 095a: aload 61
// 095c: ifnull 088b
// 095f: getstatic su/catlean/gj.Y Lkotlin/enums/EnumEntries;
// 0962: checkcast java/lang/Iterable
// 0965: astore 78
// 0967: bipush 0
// 0968: istore 79
// 096a: aload 78
// 096c: astore 80
// 096e: new java/util/ArrayList
// 0971: dup
// 0972: invokespecial java/util/ArrayList.<init> ()V
// 0975: checkcast java/util/Collection
// 0978: astore 81
// 097a: bipush 0
// 097b: istore 82
// 097d: aload 80
// 097f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0984: astore 83
// 0986: aload 83
// 0988: invokeinterface java/util/Iterator.hasNext ()Z 1
// 098d: ifeq 0a2b
// 0990: aload 83
// 0992: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0997: astore 84
// 0999: aload 84
// 099b: checkcast net/minecraft/class_2350
// 099e: astore 85
// 09a0: bipush 0
// 09a1: istore 86
// 09a3: aload 85
// 09a5: aload 61
// 09a7: ifnonnull 1249
// 09aa: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 09ad: aload 61
// 09af: ifnonnull 09e1
// 09b2: goto 09bf
// 09b5: ldc2_w -3328331410203967497
// 09b8: lload 2
// 09b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09be: athrow
// 09bf: if_acmpeq 0a18
// 09c2: goto 09cf
// 09c5: ldc2_w -3328331410203967497
// 09c8: lload 2
// 09c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09ce: athrow
// 09cf: aload 85
// 09d1: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 09d4: goto 09e1
// 09d7: ldc2_w -3328331410203967497
// 09da: lload 2
// 09db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e0: athrow
// 09e1: aload 61
// 09e3: ifnonnull 0a07
// 09e6: if_acmpeq 0a18
// 09e9: goto 09f6
// 09ec: ldc2_w -3328331410203967497
// 09ef: lload 2
// 09f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f5: athrow
// 09f6: aload 85
// 09f8: aload 72
// 09fa: goto 0a07
// 09fd: ldc2_w -3328331410203967497
// 0a00: lload 2
// 0a01: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a06: athrow
// 0a07: if_acmpeq 0a18
// 0a0a: bipush 1
// 0a0b: goto 0a19
// 0a0e: ldc2_w -3328331410203967497
// 0a11: lload 2
// 0a12: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a17: athrow
// 0a18: bipush 0
// 0a19: ifeq 0986
// 0a1c: aload 81
// 0a1e: aload 84
// 0a20: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0a25: pop
// 0a26: aload 61
// 0a28: ifnull 0986
// 0a2b: aload 81
// 0a2d: checkcast java/util/List
// 0a30: nop
// 0a31: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0a36: astore 77
// 0a38: aload 77
// 0a3a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0a3f: ifeq 0b90
// 0a42: aload 77
// 0a44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0a49: checkcast net/minecraft/class_2350
// 0a4c: astore 78
// 0a4e: aload 74
// 0a50: aload 72
// 0a52: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 0a55: aload 78
// 0a57: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 0a5a: dup
// 0a5b: sipush 625
// 0a5e: ldc2_w 5983450901024126707
// 0a61: lload 2
// 0a62: lxor
// 0a63: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a68: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a6b: astore 79
// 0a6d: aload 0
// 0a6e: lload 38
// 0a70: aload 79
// 0a72: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0a75: astore 80
// 0a77: aload 0
// 0a78: aload 79
// 0a7a: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 0a7d: dup
// 0a7e: sipush 6417
// 0a81: ldc2_w 5793176944837635487
// 0a84: lload 2
// 0a85: lxor
// 0a86: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a8e: lload 38
// 0a90: dup2_x1
// 0a91: pop2
// 0a92: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0a95: astore 81
// 0a97: aload 0
// 0a98: aload 74
// 0a9a: aload 78
// 0a9c: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 0a9f: dup
// 0aa0: sipush 625
// 0aa3: ldc2_w 5983450901024126707
// 0aa6: lload 2
// 0aa7: lxor
// 0aa8: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ab0: lload 38
// 0ab2: dup2_x1
// 0ab3: pop2
// 0ab4: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0ab7: astore 82
// 0ab9: aload 82
// 0abb: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0abe: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 0ac1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ac4: aload 61
// 0ac6: ifnonnull 0c23
// 0ac9: aload 61
// 0acb: ifnonnull 0b03
// 0ace: goto 0adb
// 0ad1: ldc2_w -3328331410203967497
// 0ad4: lload 2
// 0ad5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ada: athrow
// 0adb: ifne 0b18
// 0ade: goto 0aeb
// 0ae1: ldc2_w -3328331410203967497
// 0ae4: lload 2
// 0ae5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aea: athrow
// 0aeb: aload 82
// 0aed: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0af0: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 0af3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0af6: goto 0b03
// 0af9: ldc2_w -3328331410203967497
// 0afc: lload 2
// 0afd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b02: athrow
// 0b03: aload 61
// 0b05: ifnonnull 0b35
// 0b08: ifeq 0b2a
// 0b0b: goto 0b18
// 0b0e: ldc2_w -3328331410203967497
// 0b11: lload 2
// 0b12: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b17: athrow
// 0b18: aload 61
// 0b1a: ifnull 0a38
// 0b1d: goto 0b2a
// 0b20: ldc2_w -3328331410203967497
// 0b23: lload 2
// 0b24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b29: athrow
// 0b2a: aload 81
// 0b2c: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0b2f: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 0b32: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b35: aload 61
// 0b37: ifnonnull 0b7c
// 0b3a: ifne 0b77
// 0b3d: goto 0b4a
// 0b40: ldc2_w -3328331410203967497
// 0b43: lload 2
// 0b44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b49: athrow
// 0b4a: aload 81
// 0b4c: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0b4f: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 0b52: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b55: aload 61
// 0b57: ifnonnull 0b7c
// 0b5a: goto 0b67
// 0b5d: ldc2_w -3328331410203967497
// 0b60: lload 2
// 0b61: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b66: athrow
// 0b67: ifeq 0a38
// 0b6a: goto 0b77
// 0b6d: ldc2_w -3328331410203967497
// 0b70: lload 2
// 0b71: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b76: athrow
// 0b77: aload 80
// 0b79: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 0b7c: aload 61
// 0b7e: ifnonnull 0a3f
// 0b81: ifeq 0a38
// 0b84: fload 73
// 0b86: ldc 9.0
// 0b88: fadd
// 0b89: fstore 73
// 0b8b: aload 61
// 0b8d: ifnull 0a38
// 0b90: getstatic su/catlean/gj.Y Lkotlin/enums/EnumEntries;
// 0b93: checkcast java/lang/Iterable
// 0b96: astore 78
// 0b98: bipush 0
// 0b99: istore 79
// 0b9b: aload 78
// 0b9d: astore 80
// 0b9f: new java/util/ArrayList
// 0ba2: dup
// 0ba3: invokespecial java/util/ArrayList.<init> ()V
// 0ba6: checkcast java/util/Collection
// 0ba9: astore 81
// 0bab: bipush 0
// 0bac: istore 82
// 0bae: aload 80
// 0bb0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0bb5: astore 83
// 0bb7: aload 83
// 0bb9: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0bbe: ifeq 0c0f
// 0bc1: aload 83
// 0bc3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0bc8: astore 84
// 0bca: aload 84
// 0bcc: checkcast net/minecraft/class_2350
// 0bcf: astore 85
// 0bd1: bipush 0
// 0bd2: istore 86
// 0bd4: aload 85
// 0bd6: aload 61
// 0bd8: ifnonnull 1249
// 0bdb: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 0bde: if_acmpeq 0bfc
// 0be1: goto 0bee
// 0be4: ldc2_w -3328331410203967497
// 0be7: lload 2
// 0be8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bed: athrow
// 0bee: bipush 1
// 0bef: goto 0bfd
// 0bf2: ldc2_w -3328331410203967497
// 0bf5: lload 2
// 0bf6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bfb: athrow
// 0bfc: bipush 0
// 0bfd: ifeq 0bb7
// 0c00: aload 81
// 0c02: aload 84
// 0c04: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0c09: pop
// 0c0a: aload 61
// 0c0c: ifnull 0bb7
// 0c0f: aload 81
// 0c11: checkcast java/util/List
// 0c14: nop
// 0c15: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0c1a: astore 77
// 0c1c: aload 77
// 0c1e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c23: ifeq 11ff
// 0c26: aload 77
// 0c28: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c2d: checkcast net/minecraft/class_2350
// 0c30: astore 78
// 0c32: aload 74
// 0c34: aload 78
// 0c36: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 0c39: dup
// 0c3a: sipush 625
// 0c3d: ldc2_w 5983450901024126707
// 0c40: lload 2
// 0c41: lxor
// 0c42: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c47: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c4a: astore 79
// 0c4c: aload 79
// 0c4e: aload 64
// 0c50: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c53: aload 61
// 0c55: ifnonnull 1211
// 0c58: aload 61
// 0c5a: ifnonnull 0c8e
// 0c5d: goto 0c6a
// 0c60: ldc2_w -3328331410203967497
// 0c63: lload 2
// 0c64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c69: athrow
// 0c6a: ifne 0ccc
// 0c6d: goto 0c7a
// 0c70: ldc2_w -3328331410203967497
// 0c73: lload 2
// 0c74: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c79: athrow
// 0c7a: aload 79
// 0c7c: aload 62
// 0c7e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c81: goto 0c8e
// 0c84: ldc2_w -3328331410203967497
// 0c87: lload 2
// 0c88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8d: athrow
// 0c8e: aload 61
// 0c90: ifnonnull 0cc9
// 0c93: ifne 0ccc
// 0c96: goto 0ca3
// 0c99: ldc2_w -3328331410203967497
// 0c9c: lload 2
// 0c9d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca2: athrow
// 0ca3: aload 79
// 0ca5: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0ca8: lload 25
// 0caa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cad: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0cb0: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 0cb3: lload 25
// 0cb5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cb8: invokevirtual net/minecraft/class_746.method_55754 ()D
// 0cbb: dcmpl
// 0cbc: goto 0cc9
// 0cbf: ldc2_w -3328331410203967497
// 0cc2: lload 2
// 0cc3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc8: athrow
// 0cc9: ifle 0cde
// 0ccc: aload 61
// 0cce: ifnull 0c1c
// 0cd1: goto 0cde
// 0cd4: ldc2_w -3328331410203967497
// 0cd7: lload 2
// 0cd8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cdd: athrow
// 0cde: aload 0
// 0cdf: lload 38
// 0ce1: aload 79
// 0ce3: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0ce6: astore 80
// 0ce8: aload 80
// 0cea: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 0ced: aload 61
// 0cef: ifnonnull 0de4
// 0cf2: ifeq 0dd9
// 0cf5: goto 0d02
// 0cf8: ldc2_w -3328331410203967497
// 0cfb: lload 2
// 0cfc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d01: athrow
// 0d02: aload 0
// 0d03: aload 79
// 0d05: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 0d08: dup
// 0d09: sipush 6417
// 0d0c: ldc2_w 5793176944837635487
// 0d0f: lload 2
// 0d10: lxor
// 0d11: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d16: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d19: lload 38
// 0d1b: dup2_x1
// 0d1c: pop2
// 0d1d: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0d20: astore 81
// 0d22: aload 0
// 0d23: aload 79
// 0d25: bipush 2
// 0d26: invokevirtual net/minecraft/class_2338.method_10087 (I)Lnet/minecraft/class_2338;
// 0d29: dup
// 0d2a: sipush 6417
// 0d2d: ldc2_w 5793176944837635487
// 0d30: lload 2
// 0d31: lxor
// 0d32: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d37: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d3a: lload 38
// 0d3c: dup2_x1
// 0d3d: pop2
// 0d3e: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0d41: astore 82
// 0d43: aload 81
// 0d45: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0d48: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 0d4b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d4e: aload 61
// 0d50: ifnonnull 0d7b
// 0d53: ifne 0d83
// 0d56: goto 0d63
// 0d59: ldc2_w -3328331410203967497
// 0d5c: lload 2
// 0d5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d62: athrow
// 0d63: aload 81
// 0d65: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0d68: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 0d6b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d6e: goto 0d7b
// 0d71: ldc2_w -3328331410203967497
// 0d74: lload 2
// 0d75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7a: athrow
// 0d7b: aload 61
// 0d7d: ifnonnull 0c23
// 0d80: ifeq 0c1c
// 0d83: fload 73
// 0d85: aload 82
// 0d87: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0d8a: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 0d8d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d90: aload 61
// 0d92: ifnonnull 0dbd
// 0d95: ifne 0dc0
// 0d98: goto 0da5
// 0d9b: ldc2_w -3328331410203967497
// 0d9e: lload 2
// 0d9f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da4: athrow
// 0da5: aload 82
// 0da7: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0daa: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 0dad: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0db0: goto 0dbd
// 0db3: ldc2_w -3328331410203967497
// 0db6: lload 2
// 0db7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dbc: athrow
// 0dbd: ifeq 0dcf
// 0dc0: ldc 10.0
// 0dc2: goto 0dd1
// 0dc5: ldc2_w -3328331410203967497
// 0dc8: lload 2
// 0dc9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dce: athrow
// 0dcf: ldc 9.0
// 0dd1: fadd
// 0dd2: fstore 73
// 0dd4: aload 61
// 0dd6: ifnull 0c1c
// 0dd9: aload 80
// 0ddb: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0dde: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 0de1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0de4: aload 61
// 0de6: ifnonnull 0e27
// 0de9: ifne 0e26
// 0dec: goto 0df9
// 0def: ldc2_w -3328331410203967497
// 0df2: lload 2
// 0df3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df8: athrow
// 0df9: aload 80
// 0dfb: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0dfe: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
// 0e01: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e04: aload 61
// 0e06: ifnonnull 0e27
// 0e09: goto 0e16
// 0e0c: ldc2_w -3328331410203967497
// 0e0f: lload 2
// 0e10: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e15: athrow
// 0e16: ifeq 0c1c
// 0e19: goto 0e26
// 0e1c: ldc2_w -3328331410203967497
// 0e1f: lload 2
// 0e20: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e25: athrow
// 0e26: bipush 1
// 0e27: istore 81
// 0e29: getstatic su/catlean/gj.Y Lkotlin/enums/EnumEntries;
// 0e2c: checkcast java/lang/Iterable
// 0e2f: astore 83
// 0e31: bipush 0
// 0e32: istore 84
// 0e34: aload 83
// 0e36: astore 85
// 0e38: new java/util/ArrayList
// 0e3b: dup
// 0e3c: invokespecial java/util/ArrayList.<init> ()V
// 0e3f: checkcast java/util/Collection
// 0e42: astore 86
// 0e44: bipush 0
// 0e45: istore 87
// 0e47: aload 85
// 0e49: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0e4e: astore 88
// 0e50: aload 88
// 0e52: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0e57: ifeq 0ea8
// 0e5a: aload 88
// 0e5c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0e61: astore 89
// 0e63: aload 89
// 0e65: checkcast net/minecraft/class_2350
// 0e68: astore 90
// 0e6a: bipush 0
// 0e6b: istore 91
// 0e6d: aload 90
// 0e6f: aload 61
// 0e71: ifnonnull 1249
// 0e74: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 0e77: if_acmpeq 0e95
// 0e7a: goto 0e87
// 0e7d: ldc2_w -3328331410203967497
// 0e80: lload 2
// 0e81: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e86: athrow
// 0e87: bipush 1
// 0e88: goto 0e96
// 0e8b: ldc2_w -3328331410203967497
// 0e8e: lload 2
// 0e8f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e94: athrow
// 0e95: bipush 0
// 0e96: ifeq 0e50
// 0e99: aload 86
// 0e9b: aload 89
// 0e9d: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0ea2: pop
// 0ea3: aload 61
// 0ea5: ifnull 0e50
// 0ea8: aload 86
// 0eaa: checkcast java/util/List
// 0ead: nop
// 0eae: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0eb3: astore 82
// 0eb5: aload 82
// 0eb7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ebc: ifeq 0c1c
// 0ebf: aload 82
// 0ec1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0ec6: checkcast net/minecraft/class_2350
// 0ec9: astore 83
// 0ecb: aload 79
// 0ecd: aload 83
// 0ecf: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 0ed2: dup
// 0ed3: sipush 625
// 0ed6: ldc2_w 5983450901024126707
// 0ed9: lload 2
// 0eda: lxor
// 0edb: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ee3: astore 84
// 0ee5: aload 84
// 0ee7: aload 64
// 0ee9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0eec: aload 61
// 0eee: ifnonnull 0c23
// 0ef1: aload 61
// 0ef3: ifnonnull 0f1a
// 0ef6: ifne 0fbc
// 0ef9: goto 0f06
// 0efc: ldc2_w -3328331410203967497
// 0eff: lload 2
// 0f00: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f05: athrow
// 0f06: aload 84
// 0f08: aload 79
// 0f0a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f0d: goto 0f1a
// 0f10: ldc2_w -3328331410203967497
// 0f13: lload 2
// 0f14: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f19: athrow
// 0f1a: aload 61
// 0f1c: ifnonnull 0f43
// 0f1f: ifne 0fbc
// 0f22: goto 0f2f
// 0f25: ldc2_w -3328331410203967497
// 0f28: lload 2
// 0f29: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2e: athrow
// 0f2f: aload 84
// 0f31: aload 74
// 0f33: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f36: goto 0f43
// 0f39: ldc2_w -3328331410203967497
// 0f3c: lload 2
// 0f3d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f42: athrow
// 0f43: aload 61
// 0f45: ifnonnull 0f6c
// 0f48: ifne 0fbc
// 0f4b: goto 0f58
// 0f4e: ldc2_w -3328331410203967497
// 0f51: lload 2
// 0f52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f57: athrow
// 0f58: aload 84
// 0f5a: aload 62
// 0f5c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f5f: goto 0f6c
// 0f62: ldc2_w -3328331410203967497
// 0f65: lload 2
// 0f66: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6b: athrow
// 0f6c: aload 61
// 0f6e: ifnonnull 0fa7
// 0f71: ifne 0fbc
// 0f74: goto 0f81
// 0f77: ldc2_w -3328331410203967497
// 0f7a: lload 2
// 0f7b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f80: athrow
// 0f81: aload 84
// 0f83: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0f86: lload 25
// 0f88: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f8b: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0f8e: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 0f91: lload 25
// 0f93: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f96: invokevirtual net/minecraft/class_746.method_55754 ()D
// 0f99: dcmpl
// 0f9a: goto 0fa7
// 0f9d: ldc2_w -3328331410203967497
// 0fa0: lload 2
// 0fa1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa6: athrow
// 0fa7: aload 61
// 0fa9: ifnonnull 0feb
// 0fac: ifle 0fce
// 0faf: goto 0fbc
// 0fb2: ldc2_w -3328331410203967497
// 0fb5: lload 2
// 0fb6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fbb: athrow
// 0fbc: aload 61
// 0fbe: ifnull 0eb5
// 0fc1: goto 0fce
// 0fc4: ldc2_w -3328331410203967497
// 0fc7: lload 2
// 0fc8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fcd: athrow
// 0fce: aload 0
// 0fcf: lload 38
// 0fd1: aload 84
// 0fd3: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0fd6: aload 61
// 0fd8: ifnonnull 100c
// 0fdb: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 0fde: goto 0feb
// 0fe1: ldc2_w -3328331410203967497
// 0fe4: lload 2
// 0fe5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fea: athrow
// 0feb: ifeq 0eb5
// 0fee: aload 0
// 0fef: aload 84
// 0ff1: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 0ff4: dup
// 0ff5: sipush 6417
// 0ff8: ldc2_w 5793176944837635487
// 0ffb: lload 2
// 0ffc: lxor
// 0ffd: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1002: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1005: lload 38
// 1007: dup2_x1
// 1008: pop2
// 1009: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 100c: astore 85
// 100e: aload 85
// 1010: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1013: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 1016: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1019: aload 61
// 101b: ifnonnull 1063
// 101e: ifne 105b
// 1021: goto 102e
// 1024: ldc2_w -3328331410203967497
// 1027: lload 2
// 1028: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102d: athrow
// 102e: aload 85
// 1030: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1033: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 1036: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1039: aload 61
// 103b: ifnonnull 1063
// 103e: goto 104b
// 1041: ldc2_w -3328331410203967497
// 1044: lload 2
// 1045: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104a: athrow
// 104b: ifeq 0eb5
// 104e: goto 105b
// 1051: ldc2_w -3328331410203967497
// 1054: lload 2
// 1055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105a: athrow
// 105b: fload 73
// 105d: fconst_1
// 105e: fadd
// 105f: fstore 73
// 1061: iload 81
// 1063: aload 61
// 1065: ifnonnull 1079
// 1068: ifeq 0eb5
// 106b: goto 1078
// 106e: ldc2_w -3328331410203967497
// 1071: lload 2
// 1072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1077: athrow
// 1078: bipush 4
// 1079: anewarray 422
// 107c: astore 87
// 107e: aload 87
// 1080: bipush 0
// 1081: getstatic net/minecraft/class_2350.field_11039 Lnet/minecraft/class_2350;
// 1084: aastore
// 1085: aload 87
// 1087: bipush 1
// 1088: getstatic net/minecraft/class_2350.field_11034 Lnet/minecraft/class_2350;
// 108b: aastore
// 108c: aload 87
// 108e: bipush 2
// 108f: getstatic net/minecraft/class_2350.field_11043 Lnet/minecraft/class_2350;
// 1092: aastore
// 1093: aload 87
// 1095: bipush 3
// 1096: getstatic net/minecraft/class_2350.field_11035 Lnet/minecraft/class_2350;
// 1099: aastore
// 109a: aload 87
// 109c: invokestatic kotlin/collections/CollectionsKt.mutableListOf ([Ljava/lang/Object;)Ljava/util/List;
// 109f: astore 86
// 10a1: aload 86
// 10a3: aload 78
// 10a5: invokevirtual net/minecraft/class_2350.method_10153 ()Lnet/minecraft/class_2350;
// 10a8: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
// 10ad: pop
// 10ae: aload 69
// 10b0: aload 79
// 10b2: aload 78
// 10b4: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 10b7: if_acmpne 10c9
// 10ba: ldc 11.0
// 10bc: goto 11e2
// 10bf: ldc2_w -3328331410203967497
// 10c2: lload 2
// 10c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c8: athrow
// 10c9: aload 86
// 10cb: checkcast java/lang/Iterable
// 10ce: astore 87
// 10d0: astore 98
// 10d2: astore 97
// 10d4: bipush 0
// 10d5: istore 88
// 10d7: aload 87
// 10d9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 10de: astore 89
// 10e0: aload 89
// 10e2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 10e7: ifeq 11c5
// 10ea: aload 89
// 10ec: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 10f1: astore 90
// 10f3: aload 90
// 10f5: checkcast net/minecraft/class_2350
// 10f8: astore 91
// 10fa: bipush 0
// 10fb: istore 92
// 10fd: aload 79
// 10ff: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 1102: aload 91
// 1104: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 1107: dup
// 1108: sipush 625
// 110b: ldc2_w 5983450901024126707
// 110e: lload 2
// 110f: lxor
// 1110: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1115: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1118: astore 93
// 111a: getstatic su/catlean/u0.a Lsu/catlean/u0;
// 111d: lload 38
// 111f: aload 93
// 1121: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 1124: astore 94
// 1126: aload 79
// 1128: aload 91
// 112a: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 112d: dup
// 112e: sipush 625
// 1131: ldc2_w 5983450901024126707
// 1134: lload 2
// 1135: lxor
// 1136: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 113e: astore 95
// 1140: getstatic su/catlean/u0.a Lsu/catlean/u0;
// 1143: lload 38
// 1145: aload 95
// 1147: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 114a: astore 96
// 114c: aload 94
// 114e: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1151: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 1154: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1157: aload 61
// 1159: ifnonnull 119e
// 115c: ifne 118c
// 115f: aload 94
// 1161: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1164: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 1167: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 116a: aload 61
// 116c: ifnonnull 119e
// 116f: goto 117c
// 1172: ldc2_w -3328331410203967497
// 1175: lload 2
// 1176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117b: athrow
// 117c: ifeq 11b7
// 117f: goto 118c
// 1182: ldc2_w -3328331410203967497
// 1185: lload 2
// 1186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118b: athrow
// 118c: aload 96
// 118e: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 1191: goto 119e
// 1194: ldc2_w -3328331410203967497
// 1197: lload 2
// 1198: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119d: athrow
// 119e: aload 61
// 11a0: ifnonnull 11b4
// 11a3: ifeq 11b7
// 11a6: goto 11b3
// 11a9: ldc2_w -3328331410203967497
// 11ac: lload 2
// 11ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b2: athrow
// 11b3: bipush 1
// 11b4: goto 11b8
// 11b7: bipush 0
// 11b8: ifeq 10e0
// 11bb: aload 90
// 11bd: aload 61
// 11bf: ifnonnull 10f5
// 11c2: goto 11c6
// 11c5: aconst_null
// 11c6: astore 99
// 11c8: aload 97
// 11ca: aload 98
// 11cc: aload 99
// 11ce: ifnull 11e0
// 11d1: ldc 16.0
// 11d3: goto 11e2
// 11d6: ldc2_w -3328331410203967497
// 11d9: lload 2
// 11da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11df: athrow
// 11e0: ldc 11.0
// 11e2: fstore 100
// 11e4: astore 101
// 11e6: new su/catlean/n3
// 11e9: dup
// 11ea: aload 101
// 11ec: fload 100
// 11ee: lload 17
// 11f0: invokespecial su/catlean/n3.<init> (Lnet/minecraft/class_2338;FJ)V
// 11f3: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 11f6: pop
// 11f7: bipush 0
// 11f8: istore 81
// 11fa: aload 61
// 11fc: ifnull 0eb5
// 11ff: aload 69
// 1201: new su/catlean/n3
// 1204: dup
// 1205: aload 74
// 1207: fload 73
// 1209: lload 17
// 120b: invokespecial su/catlean/n3.<init> (Lnet/minecraft/class_2338;FJ)V
// 120e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 1211: pop
// 1212: aload 61
// 1214: ifnull 06e1
// 1217: iload 70
// 1219: bipush 1
// 121a: if_icmple 122f
// 121d: aload 69
// 121f: invokevirtual java/util/ArrayList.clear ()V
// 1222: goto 122f
// 1225: ldc2_w -3328331410203967497
// 1228: lload 2
// 1229: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122e: athrow
// 122f: aload 65
// 1231: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 1236: astore 71
// 1238: aload 71
// 123a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 123f: ifeq 1278
// 1242: aload 71
// 1244: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1249: checkcast net/minecraft/class_2338
// 124c: astore 72
// 124e: aload 69
// 1250: new su/catlean/n3
// 1253: dup
// 1254: aload 72
// 1256: ldc 300.0
// 1258: lload 17
// 125a: invokespecial su/catlean/n3.<init> (Lnet/minecraft/class_2338;FJ)V
// 125d: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 1260: pop
// 1261: aload 61
// 1263: ifnonnull 1292
// 1266: aload 61
// 1268: ifnull 1238
// 126b: goto 1278
// 126e: ldc2_w -3328331410203967497
// 1271: lload 2
// 1272: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1277: athrow
// 1278: aload 69
// 127a: checkcast java/util/List
// 127d: aload 61
// 127f: ifnonnull 1759
// 1282: putstatic su/catlean/u0.E Ljava/util/List;
// 1285: goto 1292
// 1288: ldc2_w -3328331410203967497
// 128b: lload 2
// 128c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1291: athrow
// 1292: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 1295: lload 27
// 1297: invokevirtual su/catlean/ex.f (J)Z
// 129a: ifeq 1754
// 129d: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 12a0: lload 52
// 12a2: invokevirtual su/catlean/ex.x (J)Z
// 12a5: ifeq 1754
// 12a8: goto 12b5
// 12ab: ldc2_w -3328331410203967497
// 12ae: lload 2
// 12af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b4: athrow
// 12b5: aload 69
// 12b7: checkcast java/lang/Iterable
// 12ba: astore 72
// 12bc: bipush 0
// 12bd: istore 73
// 12bf: aload 72
// 12c1: aload 61
// 12c3: ifnonnull 1315
// 12c6: instanceof java/util/Collection
// 12c9: ifeq 1313
// 12cc: goto 12d9
// 12cf: ldc2_w -3328331410203967497
// 12d2: lload 2
// 12d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d8: athrow
// 12d9: aload 72
// 12db: checkcast java/util/Collection
// 12de: aload 61
// 12e0: ifnonnull 1315
// 12e3: goto 12f0
// 12e6: ldc2_w -3328331410203967497
// 12e9: lload 2
// 12ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12ef: athrow
// 12f0: invokeinterface java/util/Collection.isEmpty ()Z 1
// 12f5: ifeq 1313
// 12f8: goto 1305
// 12fb: ldc2_w -3328331410203967497
// 12fe: lload 2
// 12ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1304: athrow
// 1305: bipush 0
// 1306: goto 135b
// 1309: ldc2_w -3328331410203967497
// 130c: lload 2
// 130d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1312: athrow
// 1313: aload 72
// 1315: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 131a: astore 74
// 131c: aload 74
// 131e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1323: ifeq 135a
// 1326: aload 74
// 1328: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 132d: astore 75
// 132f: aload 75
// 1331: checkcast su/catlean/n3
// 1334: astore 76
// 1336: bipush 0
// 1337: istore 77
// 1339: aload 76
// 133b: invokevirtual su/catlean/n3.D ()F
// 133e: ldc 100.0
// 1340: fcmpg
// 1341: aload 61
// 1343: ifnonnull 134a
// 1346: ifne 134d
// 1349: bipush 1
// 134a: goto 134e
// 134d: bipush 0
// 134e: ifeq 131c
// 1351: bipush 1
// 1352: aload 61
// 1354: ifnonnull 1341
// 1357: goto 135b
// 135a: bipush 0
// 135b: istore 71
// 135d: iload 71
// 135f: ifeq 14c7
// 1362: aload 69
// 1364: checkcast java/lang/Iterable
// 1367: astore 73
// 1369: bipush 0
// 136a: istore 74
// 136c: aload 73
// 136e: astore 75
// 1370: new java/util/ArrayList
// 1373: dup
// 1374: invokespecial java/util/ArrayList.<init> ()V
// 1377: checkcast java/util/Collection
// 137a: astore 76
// 137c: bipush 0
// 137d: istore 77
// 137f: aload 75
// 1381: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1386: astore 78
// 1388: aload 78
// 138a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 138f: ifeq 13fd
// 1392: aload 78
// 1394: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1399: astore 79
// 139b: aload 79
// 139d: checkcast su/catlean/n3
// 13a0: astore 80
// 13a2: bipush 0
// 13a3: istore 81
// 13a5: aload 80
// 13a7: invokevirtual su/catlean/n3.D ()F
// 13aa: ldc 100.0
// 13ac: fcmpg
// 13ad: aload 61
// 13af: ifnonnull 140a
// 13b2: aload 61
// 13b4: ifnonnull 13d5
// 13b7: goto 13c4
// 13ba: ldc2_w -3328331410203967497
// 13bd: lload 2
// 13be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c3: athrow
// 13c4: ifne 13d8
// 13c7: goto 13d4
// 13ca: ldc2_w -3328331410203967497
// 13cd: lload 2
// 13ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d3: athrow
// 13d4: bipush 1
// 13d5: goto 13d9
// 13d8: bipush 0
// 13d9: ifne 13ea
// 13dc: bipush 1
// 13dd: goto 13eb
// 13e0: ldc2_w -3328331410203967497
// 13e3: lload 2
// 13e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e9: athrow
// 13ea: bipush 0
// 13eb: ifeq 1388
// 13ee: aload 76
// 13f0: aload 79
// 13f2: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 13f7: pop
// 13f8: aload 61
// 13fa: ifnull 1388
// 13fd: aload 76
// 13ff: checkcast java/util/List
// 1402: nop
// 1403: checkcast java/lang/Iterable
// 1406: astore 73
// 1408: nop
// 1409: bipush 0
// 140a: istore 74
// 140c: aload 73
// 140e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1413: astore 75
// 1415: aload 75
// 1417: invokeinterface java/util/Iterator.hasNext ()Z 1
// 141c: aload 61
// 141e: ifnonnull 1461
// 1421: ifne 143f
// 1424: goto 1431
// 1427: ldc2_w -3328331410203967497
// 142a: lload 2
// 142b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1430: athrow
// 1431: aconst_null
// 1432: goto 14c1
// 1435: ldc2_w -3328331410203967497
// 1438: lload 2
// 1439: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143e: athrow
// 143f: aload 75
// 1441: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1446: astore 76
// 1448: aload 75
// 144a: aload 61
// 144c: ifnonnull 1475
// 144f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1454: goto 1461
// 1457: ldc2_w -3328331410203967497
// 145a: lload 2
// 145b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1460: athrow
// 1461: ifne 1473
// 1464: aload 76
// 1466: goto 14c1
// 1469: ldc2_w -3328331410203967497
// 146c: lload 2
// 146d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1472: athrow
// 1473: aload 76
// 1475: checkcast su/catlean/n3
// 1478: astore 77
// 147a: bipush 0
// 147b: istore 78
// 147d: aload 77
// 147f: invokevirtual su/catlean/n3.D ()F
// 1482: fstore 77
// 1484: aload 75
// 1486: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 148b: astore 78
// 148d: aload 78
// 148f: checkcast su/catlean/n3
// 1492: astore 79
// 1494: bipush 0
// 1495: istore 80
// 1497: aload 79
// 1499: invokevirtual su/catlean/n3.D ()F
// 149c: fstore 79
// 149e: fload 77
// 14a0: fload 79
// 14a2: invokestatic java/lang/Float.compare (FF)I
// 14a5: ifge 14b0
// 14a8: aload 78
// 14aa: astore 76
// 14ac: fload 79
// 14ae: fstore 77
// 14b0: aload 75
// 14b2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 14b7: ifne 1484
// 14ba: aload 61
// 14bc: ifnonnull 14ac
// 14bf: aload 76
// 14c1: checkcast su/catlean/n3
// 14c4: goto 1589
// 14c7: aload 69
// 14c9: checkcast java/lang/Iterable
// 14cc: astore 73
// 14ce: bipush 0
// 14cf: istore 74
// 14d1: aload 73
// 14d3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 14d8: astore 75
// 14da: aload 75
// 14dc: aload 61
// 14de: ifnonnull 150b
// 14e1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 14e6: ifne 1504
// 14e9: goto 14f6
// 14ec: ldc2_w -3328331410203967497
// 14ef: lload 2
// 14f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f5: athrow
// 14f6: aconst_null
// 14f7: goto 1586
// 14fa: ldc2_w -3328331410203967497
// 14fd: lload 2
// 14fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1503: athrow
// 1504: aload 75
// 1506: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 150b: astore 76
// 150d: aload 75
// 150f: aload 61
// 1511: ifnonnull 153a
// 1514: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1519: ifne 1538
// 151c: goto 1529
// 151f: ldc2_w -3328331410203967497
// 1522: lload 2
// 1523: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1528: athrow
// 1529: aload 76
// 152b: goto 1586
// 152e: ldc2_w -3328331410203967497
// 1531: lload 2
// 1532: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1537: athrow
// 1538: aload 76
// 153a: checkcast su/catlean/n3
// 153d: astore 77
// 153f: bipush 0
// 1540: istore 78
// 1542: aload 77
// 1544: invokevirtual su/catlean/n3.D ()F
// 1547: fstore 77
// 1549: aload 75
// 154b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1550: astore 78
// 1552: aload 78
// 1554: checkcast su/catlean/n3
// 1557: astore 79
// 1559: bipush 0
// 155a: istore 80
// 155c: aload 79
// 155e: invokevirtual su/catlean/n3.D ()F
// 1561: fstore 79
// 1563: fload 77
// 1565: fload 79
// 1567: invokestatic java/lang/Float.compare (FF)I
// 156a: ifge 1575
// 156d: aload 78
// 156f: astore 76
// 1571: fload 79
// 1573: fstore 77
// 1575: aload 75
// 1577: invokeinterface java/util/Iterator.hasNext ()Z 1
// 157c: ifne 1549
// 157f: aload 61
// 1581: ifnonnull 1571
// 1584: aload 76
// 1586: checkcast su/catlean/n3
// 1589: astore 72
// 158b: aload 69
// 158d: checkcast java/lang/Iterable
// 1590: astore 74
// 1592: bipush 0
// 1593: istore 75
// 1595: aload 74
// 1597: astore 76
// 1599: new java/util/ArrayList
// 159c: dup
// 159d: invokespecial java/util/ArrayList.<init> ()V
// 15a0: checkcast java/util/Collection
// 15a3: astore 77
// 15a5: bipush 0
// 15a6: istore 78
// 15a8: aload 76
// 15aa: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 15af: astore 79
// 15b1: aload 79
// 15b3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 15b8: ifeq 162a
// 15bb: aload 79
// 15bd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 15c2: astore 80
// 15c4: aload 80
// 15c6: checkcast su/catlean/n3
// 15c9: astore 81
// 15cb: bipush 0
// 15cc: istore 82
// 15ce: aload 61
// 15d0: ifnonnull 1639
// 15d3: aload 72
// 15d5: aload 61
// 15d7: ifnonnull 15f9
// 15da: goto 15e7
// 15dd: ldc2_w -3328331410203967497
// 15e0: lload 2
// 15e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e6: athrow
// 15e7: ifnull 1617
// 15ea: goto 15f7
// 15ed: ldc2_w -3328331410203967497
// 15f0: lload 2
// 15f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f6: athrow
// 15f7: aload 81
// 15f9: aload 72
// 15fb: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 15fe: aload 61
// 1600: ifnonnull 1614
// 1603: ifne 1617
// 1606: goto 1613
// 1609: ldc2_w -3328331410203967497
// 160c: lload 2
// 160d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1612: athrow
// 1613: bipush 1
// 1614: goto 1618
// 1617: bipush 0
// 1618: ifeq 15b1
// 161b: aload 77
// 161d: aload 80
// 161f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1624: pop
// 1625: aload 61
// 1627: ifnull 15b1
// 162a: aload 77
// 162c: checkcast java/util/List
// 162f: nop
// 1630: checkcast java/lang/Iterable
// 1633: astore 74
// 1635: nop
// 1636: bipush 0
// 1637: istore 75
// 1639: aload 74
// 163b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1640: astore 76
// 1642: aload 76
// 1644: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1649: aload 61
// 164b: ifnonnull 168e
// 164e: ifne 166c
// 1651: goto 165e
// 1654: ldc2_w -3328331410203967497
// 1657: lload 2
// 1658: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165d: athrow
// 165e: aconst_null
// 165f: goto 16ee
// 1662: ldc2_w -3328331410203967497
// 1665: lload 2
// 1666: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166b: athrow
// 166c: aload 76
// 166e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1673: astore 77
// 1675: aload 76
// 1677: aload 61
// 1679: ifnonnull 16a2
// 167c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1681: goto 168e
// 1684: ldc2_w -3328331410203967497
// 1687: lload 2
// 1688: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168d: athrow
// 168e: ifne 16a0
// 1691: aload 77
// 1693: goto 16ee
// 1696: ldc2_w -3328331410203967497
// 1699: lload 2
// 169a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169f: athrow
// 16a0: aload 77
// 16a2: checkcast su/catlean/n3
// 16a5: astore 78
// 16a7: bipush 0
// 16a8: istore 79
// 16aa: aload 78
// 16ac: invokevirtual su/catlean/n3.D ()F
// 16af: fstore 78
// 16b1: aload 76
// 16b3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 16b8: astore 79
// 16ba: aload 79
// 16bc: checkcast su/catlean/n3
// 16bf: astore 80
// 16c1: bipush 0
// 16c2: istore 81
// 16c4: aload 80
// 16c6: invokevirtual su/catlean/n3.D ()F
// 16c9: fstore 80
// 16cb: fload 78
// 16cd: fload 80
// 16cf: invokestatic java/lang/Float.compare (FF)I
// 16d2: ifge 16dd
// 16d5: aload 79
// 16d7: astore 77
// 16d9: fload 80
// 16db: fstore 78
// 16dd: aload 76
// 16df: invokeinterface java/util/Iterator.hasNext ()Z 1
// 16e4: ifne 16b1
// 16e7: aload 61
// 16e9: ifnonnull 16d9
// 16ec: aload 77
// 16ee: checkcast su/catlean/n3
// 16f1: astore 73
// 16f3: aload 72
// 16f5: ifnonnull 1703
// 16f8: return
// 16f9: ldc2_w -3328331410203967497
// 16fc: lload 2
// 16fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1702: athrow
// 1703: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 1706: aload 72
// 1708: invokevirtual su/catlean/n3.b ()Lnet/minecraft/class_2338;
// 170b: iload 49
// 170d: swap
// 170e: iload 50
// 1710: i2c
// 1711: swap
// 1712: iload 51
// 1714: i2s
// 1715: invokevirtual su/catlean/ex.Z (ICLnet/minecraft/class_2338;S)Z
// 1718: ifeq 173c
// 171b: aload 73
// 171d: dup
// 171e: ifnonnull 173e
// 1721: goto 172e
// 1724: ldc2_w -3328331410203967497
// 1727: lload 2
// 1728: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172d: athrow
// 172e: pop
// 172f: goto 173c
// 1732: ldc2_w -3328331410203967497
// 1735: lload 2
// 1736: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173b: athrow
// 173c: aload 72
// 173e: astore 74
// 1740: aload 0
// 1741: aload 74
// 1743: invokevirtual su/catlean/n3.b ()Lnet/minecraft/class_2338;
// 1746: lload 29
// 1748: dup2_x1
// 1749: pop2
// 174a: bipush 0
// 174b: invokespecial su/catlean/u0.Z (JLnet/minecraft/class_2338;Z)V
// 174e: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 1751: goto 183c
// 1754: aload 69
// 1756: checkcast java/lang/Iterable
// 1759: astore 72
// 175b: bipush 0
// 175c: istore 73
// 175e: aload 72
// 1760: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1765: astore 74
// 1767: aload 74
// 1769: aload 61
// 176b: ifnonnull 1798
// 176e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1773: ifne 1791
// 1776: goto 1783
// 1779: ldc2_w -3328331410203967497
// 177c: lload 2
// 177d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1782: athrow
// 1783: aconst_null
// 1784: goto 1813
// 1787: ldc2_w -3328331410203967497
// 178a: lload 2
// 178b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1790: athrow
// 1791: aload 74
// 1793: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1798: astore 75
// 179a: aload 74
// 179c: aload 61
// 179e: ifnonnull 17c7
// 17a1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 17a6: ifne 17c5
// 17a9: goto 17b6
// 17ac: ldc2_w -3328331410203967497
// 17af: lload 2
// 17b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b5: athrow
// 17b6: aload 75
// 17b8: goto 1813
// 17bb: ldc2_w -3328331410203967497
// 17be: lload 2
// 17bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c4: athrow
// 17c5: aload 75
// 17c7: checkcast su/catlean/n3
// 17ca: astore 76
// 17cc: bipush 0
// 17cd: istore 77
// 17cf: aload 76
// 17d1: invokevirtual su/catlean/n3.D ()F
// 17d4: fstore 76
// 17d6: aload 74
// 17d8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 17dd: astore 77
// 17df: aload 77
// 17e1: checkcast su/catlean/n3
// 17e4: astore 78
// 17e6: bipush 0
// 17e7: istore 79
// 17e9: aload 78
// 17eb: invokevirtual su/catlean/n3.D ()F
// 17ee: fstore 78
// 17f0: fload 76
// 17f2: fload 78
// 17f4: invokestatic java/lang/Float.compare (FF)I
// 17f7: ifge 1802
// 17fa: aload 77
// 17fc: astore 75
// 17fe: fload 78
// 1800: fstore 76
// 1802: aload 74
// 1804: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1809: ifne 17d6
// 180c: aload 61
// 180e: ifnonnull 17fe
// 1811: aload 75
// 1813: checkcast su/catlean/n3
// 1816: dup
// 1817: ifnull 183a
// 181a: astore 73
// 181c: bipush 0
// 181d: istore 74
// 181f: getstatic su/catlean/u0.a Lsu/catlean/u0;
// 1822: aload 73
// 1824: invokevirtual su/catlean/n3.b ()Lnet/minecraft/class_2338;
// 1827: lload 29
// 1829: dup2_x1
// 182a: pop2
// 182b: bipush 0
// 182c: invokespecial su/catlean/u0.Z (JLnet/minecraft/class_2338;Z)V
// 182f: nop
// 1830: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 1833: pop
// 1834: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 1837: goto 183c
// 183a: pop
// 183b: aconst_null
// 183c: pop
// 183d: return
}

private final void P(class_1657 param1, List param2, List param3, long param4, boolean param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u0.c J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 15360008205790
// 00e: lxor
// 00f: lstore 7
// 011: dup2
// 012: ldc2_w 105498911987445
// 015: lxor
// 016: lstore 9
// 018: dup2
// 019: ldc2_w 72198686286304
// 01c: lxor
// 01d: dup2
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 11
// 024: dup2
// 025: bipush 16
// 027: lshl
// 028: bipush 32
// 02a: lushr
// 02b: l2i
// 02c: istore 12
// 02e: dup2
// 02f: bipush 48
// 031: lshl
// 032: bipush 48
// 034: lushr
// 035: l2i
// 036: istore 13
// 038: pop2
// 039: dup2
// 03a: ldc2_w 116418227447275
// 03d: lxor
// 03e: lstore 14
// 040: dup2
// 041: ldc2_w 110050843324732
// 044: lxor
// 045: lstore 16
// 047: dup2
// 048: ldc2_w 7860450518114
// 04b: lxor
// 04c: lstore 18
// 04e: dup2
// 04f: ldc2_w 4921578642921
// 052: lxor
// 053: lstore 20
// 055: pop2
// 056: ldc2_w -6641138461462859810
// 059: lload 4
// 05b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: astore 22
// 062: aload 1
// 063: invokevirtual net/minecraft/class_1657.method_20448 ()Z
// 066: aload 22
// 068: ifnonnull 090
// 06b: ifeq 093
// 06e: goto 07c
// 071: ldc2_w -6657344378970894940
// 074: lload 4
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: aload 0
// 07d: lload 14
// 07f: invokespecial su/catlean/u0.z (J)Z
// 082: goto 090
// 085: ldc2_w -6657344378970894940
// 088: lload 4
// 08a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: athrow
// 090: ifeq 33a
// 093: aload 2
// 094: checkcast java/lang/Iterable
// 097: astore 24
// 099: bipush 0
// 09a: istore 25
// 09c: aload 24
// 09e: new su/catlean/_7
// 0a1: dup
// 0a2: aload 1
// 0a3: invokespecial su/catlean/_7.<init> (Lnet/minecraft/class_1657;)V
// 0a6: checkcast java/util/Comparator
// 0a9: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 0ac: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0b1: astore 23
// 0b3: aload 23
// 0b5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ba: ifeq 33a
// 0bd: aload 23
// 0bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c4: checkcast net/minecraft/class_2338
// 0c7: astore 24
// 0c9: aload 24
// 0cb: bipush 2
// 0cc: invokevirtual net/minecraft/class_2338.method_10086 (I)Lnet/minecraft/class_2338;
// 0cf: dup
// 0d0: sipush 163
// 0d3: ldc2_w 8313941311812355708
// 0d6: lload 4
// 0d8: lxor
// 0d9: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e1: astore 25
// 0e3: bipush 0
// 0e4: istore 26
// 0e6: iload 26
// 0e8: bipush 4
// 0e9: if_icmpge 0b3
// 0ec: aload 25
// 0ee: iload 26
// 0f0: invokevirtual net/minecraft/class_2338.method_10086 (I)Lnet/minecraft/class_2338;
// 0f3: dup
// 0f4: sipush 21657
// 0f7: ldc2_w 8653603886557991502
// 0fa: lload 4
// 0fc: lxor
// 0fd: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 105: astore 27
// 107: aload 22
// 109: lload 4
// 10b: lconst_0
// 10c: lcmp
// 10d: ifle 337
// 110: ifnonnull 335
// 113: lload 16
// 115: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 118: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 11b: aload 27
// 11d: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 120: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 123: lload 16
// 125: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 128: invokevirtual net/minecraft/class_746.method_55754 ()D
// 12b: dcmpg
// 12c: aload 22
// 12e: ifnonnull 0ba
// 131: lload 4
// 133: lconst_0
// 134: lcmp
// 135: ifle 0e4
// 138: goto 146
// 13b: ldc2_w -6657344378970894940
// 13e: lload 4
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: lload 4
// 148: lconst_0
// 149: lcmp
// 14a: ifle 152
// 14d: ifgt 332
// 150: iload 6
// 152: aload 22
// 154: ifnonnull 1e2
// 157: goto 165
// 15a: ldc2_w -6657344378970894940
// 15d: lload 4
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: lload 4
// 167: lconst_0
// 168: lcmp
// 169: ifle 1d4
// 16c: ifne 1b2
// 16f: goto 17d
// 172: ldc2_w -6657344378970894940
// 175: lload 4
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: aload 0
// 17e: lload 7
// 180: aload 27
// 182: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 185: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 188: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 18b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 18e: aload 22
// 190: ifnonnull 1e2
// 193: goto 1a1
// 196: ldc2_w -6657344378970894940
// 199: lload 4
// 19b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: athrow
// 1a1: ifeq 332
// 1a4: goto 1b2
// 1a7: ldc2_w -6657344378970894940
// 1aa: lload 4
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: aload 0
// 1b3: aload 27
// 1b5: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 1b8: dup
// 1b9: sipush 21657
// 1bc: ldc2_w 8653603886557991502
// 1bf: lload 4
// 1c1: lxor
// 1c2: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ca: lload 7
// 1cc: dup2_x1
// 1cd: pop2
// 1ce: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 1d1: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 1d4: goto 1e2
// 1d7: ldc2_w -6657344378970894940
// 1da: lload 4
// 1dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: athrow
// 1e2: istore 28
// 1e4: aload 0
// 1e5: aload 27
// 1e7: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 1ea: dup
// 1eb: sipush 4411
// 1ee: ldc2_w 7755289514152777688
// 1f1: lload 4
// 1f3: lxor
// 1f4: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1fc: lload 7
// 1fe: dup2_x1
// 1ff: pop2
// 200: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 203: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 206: istore 29
// 208: iload 28
// 20a: aload 22
// 20c: ifnonnull 270
// 20f: ifne 268
// 212: goto 220
// 215: ldc2_w -6657344378970894940
// 218: lload 4
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: iload 26
// 222: aload 22
// 224: lload 4
// 226: lconst_0
// 227: lcmp
// 228: iflt 272
// 22b: ifnonnull 270
// 22e: goto 23c
// 231: ldc2_w -6657344378970894940
// 234: lload 4
// 236: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23b: athrow
// 23c: bipush 3
// 23d: if_icmpne 268
// 240: goto 24e
// 243: ldc2_w -6657344378970894940
// 246: lload 4
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: aload 22
// 250: ifnull 0b3
// 253: lload 4
// 255: lconst_0
// 256: lcmp
// 257: ifle 33a
// 25a: goto 268
// 25d: ldc2_w -6657344378970894940
// 260: lload 4
// 262: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 267: athrow
// 268: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 26b: lload 18
// 26d: invokevirtual su/catlean/ex.f (J)Z
// 270: aload 22
// 272: lload 4
// 274: lconst_0
// 275: lcmp
// 276: ifle 2a5
// 279: ifnonnull 2a3
// 27c: ifeq 2bd
// 27f: goto 28d
// 282: ldc2_w -6657344378970894940
// 285: lload 4
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 290: lload 20
// 292: invokevirtual su/catlean/ex.x (J)Z
// 295: goto 2a3
// 298: ldc2_w -6657344378970894940
// 29b: lload 4
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: aload 22
// 2a5: ifnonnull 2ba
// 2a8: ifeq 2bd
// 2ab: goto 2b9
// 2ae: ldc2_w -6657344378970894940
// 2b1: lload 4
// 2b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b8: athrow
// 2b9: bipush 1
// 2ba: goto 2be
// 2bd: bipush 0
// 2be: istore 30
// 2c0: iload 30
// 2c2: ifeq 2d5
// 2c5: ldc 100.0
// 2c7: goto 2d7
// 2ca: ldc2_w -6657344378970894940
// 2cd: lload 4
// 2cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d4: athrow
// 2d5: ldc 99.0
// 2d7: fstore 31
// 2d9: iload 30
// 2db: ifeq 2ee
// 2de: ldc 99.0
// 2e0: goto 2f0
// 2e3: ldc2_w -6657344378970894940
// 2e6: lload 4
// 2e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: athrow
// 2ee: ldc 100.0
// 2f0: fstore 32
// 2f2: aload 3
// 2f3: new su/catlean/n3
// 2f6: dup
// 2f7: aload 27
// 2f9: aload 0
// 2fa: iload 11
// 2fc: i2c
// 2fd: iload 12
// 2ff: iload 13
// 301: i2s
// 302: invokespecial su/catlean/u0.F (CIS)Z
// 305: ifeq 325
// 308: iload 29
// 30a: ifeq 320
// 30d: goto 31b
// 310: ldc2_w -6657344378970894940
// 313: lload 4
// 315: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31a: athrow
// 31b: fload 31
// 31d: goto 327
// 320: fload 32
// 322: goto 327
// 325: ldc 0.5
// 327: lload 9
// 329: invokespecial su/catlean/n3.<init> (Lnet/minecraft/class_2338;FJ)V
// 32c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 331: pop
// 332: iinc 26 1
// 335: aload 22
// 337: ifnull 0e6
// 33a: return
}

static void U(int var0, u0 var1, class_1657 var2, List var3, short var4, List var5, boolean var6, short var7, int var8, Object var9) {
long var10 = ((long)var0 << 32 | (long)var4 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ c;
long var12 = var10 ^ 55442656646720L;
_g[] var14 = vm.a<"Å">(-7745419104253355895L, var10);

label21: {
int var10000;
label20: {
try {
var10000 = var8 & c<"b">(22179, 4595535686312031262L ^ var10);
if (var14 != null) {
break label20;
}

if (var10000 == 0) {
break label21;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -7725066361409815821L, var10);
}

var10000 = 0;
}

var6 = var10000;
}

var1.P(var2, var3, var5, var12, (boolean)var6);
}

private final class_2680 p(long var1, class_2338 var3) {
var1 = c ^ var1;
long var4 = var1 ^ 8835710884690L;
class_2680 var10000 = zf.z(var4).method_8320(var3);
Intrinsics.checkNotNullExpressionValue(var10000, b<"x">(10760, 2584857144334432289L ^ var1));
return var10000;
}

private final boolean O(class_1657 param1, int param2, List param3, char param4, int param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 4
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 32
// 00d: lushr
// 00e: lor
// 00f: iload 5
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/u0.c J
// 01c: lxor
// 01d: lstore 6
// 01f: lload 6
// 021: dup2
// 022: ldc2_w 112717116212915
// 025: lxor
// 026: lstore 8
// 028: dup2
// 029: ldc2_w 85670942271863
// 02c: lxor
// 02d: lstore 10
// 02f: dup2
// 030: ldc2_w 41488056167406
// 033: lxor
// 034: lstore 12
// 036: dup2
// 037: ldc2_w 71774522107513
// 03a: lxor
// 03b: dup2
// 03c: bipush 48
// 03e: lushr
// 03f: l2i
// 040: istore 14
// 042: dup2
// 043: bipush 16
// 045: lshl
// 046: bipush 32
// 048: lushr
// 049: l2i
// 04a: istore 15
// 04c: dup2
// 04d: bipush 48
// 04f: lshl
// 050: bipush 48
// 052: lushr
// 053: l2i
// 054: istore 16
// 056: pop2
// 057: dup2
// 058: ldc2_w 79539447288501
// 05b: lxor
// 05c: lstore 17
// 05e: dup2
// 05f: ldc2_w 9393051914874
// 062: lxor
// 063: lstore 19
// 065: dup2
// 066: ldc2_w 109343442839615
// 069: lxor
// 06a: lstore 21
// 06c: dup2
// 06d: ldc2_w 26075540911429
// 070: lxor
// 071: lstore 23
// 073: dup2
// 074: ldc2_w 2562435351494
// 077: lxor
// 078: lstore 25
// 07a: pop2
// 07b: ldc2_w 4931981125057939578
// 07e: lload 6
// 080: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: astore 27
// 087: aload 0
// 088: iload 14
// 08a: i2c
// 08b: iload 15
// 08d: iload 16
// 08f: invokespecial su/catlean/u0.Z (CII)Z
// 092: aload 27
// 094: ifnonnull 117
// 097: ifeq 108
// 09a: goto 0a8
// 09d: ldc2_w 4915777938813610496
// 0a0: lload 6
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0ab: lload 25
// 0ad: invokevirtual su/catlean/ex.f (J)Z
// 0b0: aload 27
// 0b2: ifnonnull 117
// 0b5: goto 0c3
// 0b8: ldc2_w 4915777938813610496
// 0bb: lload 6
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: iload 5
// 0c5: ifle 109
// 0c8: ifeq 108
// 0cb: goto 0d9
// 0ce: ldc2_w 4915777938813610496
// 0d1: lload 6
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0dc: aload 27
// 0de: ifnonnull 11b
// 0e1: goto 0ef
// 0e4: ldc2_w 4915777938813610496
// 0e7: lload 6
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: lload 17
// 0f1: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 0f4: getstatic su/catlean/d0.OFF Lsu/catlean/d0;
// 0f7: if_acmpne 118
// 0fa: goto 108
// 0fd: ldc2_w 4915777938813610496
// 100: lload 6
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: bipush 0
// 109: goto 117
// 10c: ldc2_w 4915777938813610496
// 10f: lload 6
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: ireturn
// 118: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 11b: invokevirtual su/catlean/ex.Fn ()Ljava/util/LinkedList;
// 11e: checkcast java/lang/Iterable
// 121: astore 30
// 123: bipush 0
// 124: istore 31
// 126: aload 30
// 128: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 12d: astore 32
// 12f: aload 32
// 131: invokeinterface java/util/Iterator.hasNext ()Z 1
// 136: ifeq 1a0
// 139: aload 32
// 13b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 140: astore 33
// 142: aload 33
// 144: checkcast su/catlean/sy
// 147: astore 34
// 149: bipush 0
// 14a: istore 35
// 14c: lload 21
// 14e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 151: aload 34
// 153: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 156: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 159: aload 27
// 15b: ifnonnull 18b
// 15e: ifne 18a
// 161: aload 34
// 163: invokevirtual su/catlean/sy.u ()I
// 166: aload 27
// 168: ifnonnull 18b
// 16b: goto 179
// 16e: ldc2_w 4915777938813610496
// 171: lload 6
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: ifle 18e
// 17c: goto 18a
// 17f: ldc2_w 4915777938813610496
// 182: lload 6
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: bipush 1
// 18b: goto 18f
// 18e: bipush 0
// 18f: ifeq 12f
// 192: aload 33
// 194: iload 2
// 195: ifle 140
// 198: aload 27
// 19a: ifnonnull 144
// 19d: goto 1a1
// 1a0: aconst_null
// 1a1: checkcast su/catlean/sy
// 1a4: dup
// 1a5: ifnull 1bd
// 1a8: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 1ab: dup
// 1ac: ifnonnull 1cb
// 1af: goto 1bd
// 1b2: ldc2_w 4915777938813610496
// 1b5: lload 6
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: pop
// 1be: bipush 0
// 1bf: ireturn
// 1c0: ldc2_w 4915777938813610496
// 1c3: lload 6
// 1c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ca: athrow
// 1cb: astore 28
// 1cd: aload 0
// 1ce: lload 12
// 1d0: invokespecial su/catlean/u0.l (J)Z
// 1d3: ifeq 303
// 1d6: new java/util/ArrayList
// 1d9: dup
// 1da: invokespecial java/util/ArrayList.<init> ()V
// 1dd: checkcast java/util/List
// 1e0: astore 29
// 1e2: aload 0
// 1e3: aload 1
// 1e4: aload 3
// 1e5: aload 29
// 1e7: lload 8
// 1e9: bipush 1
// 1ea: invokespecial su/catlean/u0.P (Lnet/minecraft/class_1657;Ljava/util/List;Ljava/util/List;JZ)V
// 1ed: aload 29
// 1ef: checkcast java/lang/Iterable
// 1f2: astore 30
// 1f4: bipush 0
// 1f5: iload 4
// 1f7: ifle 206
// 1fa: istore 31
// 1fc: aload 30
// 1fe: aload 27
// 200: ifnonnull 256
// 203: instanceof java/util/Collection
// 206: ifeq 254
// 209: goto 217
// 20c: ldc2_w 4915777938813610496
// 20f: lload 6
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: aload 30
// 219: checkcast java/util/Collection
// 21c: aload 27
// 21e: ifnonnull 256
// 221: goto 22f
// 224: ldc2_w 4915777938813610496
// 227: lload 6
// 229: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: athrow
// 22f: invokeinterface java/util/Collection.isEmpty ()Z 1
// 234: ifeq 254
// 237: goto 245
// 23a: ldc2_w 4915777938813610496
// 23d: lload 6
// 23f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 244: athrow
// 245: bipush 0
// 246: goto 2ee
// 249: ldc2_w 4915777938813610496
// 24c: lload 6
// 24e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: athrow
// 254: aload 30
// 256: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 25b: astore 32
// 25d: aload 32
// 25f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 264: ifeq 2ed
// 267: aload 32
// 269: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 26e: astore 33
// 270: aload 33
// 272: checkcast su/catlean/n3
// 275: astore 34
// 277: bipush 0
// 278: istore 35
// 27a: getstatic su/catlean/u0.a Lsu/catlean/u0;
// 27d: aload 34
// 27f: invokevirtual su/catlean/n3.b ()Lnet/minecraft/class_2338;
// 282: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 285: dup
// 286: sipush 6417
// 289: ldc2_w 5793109570988292200
// 28c: lload 6
// 28e: lxor
// 28f: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 294: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 297: lload 19
// 299: dup2_x1
// 29a: pop2
// 29b: invokespecial su/catlean/u0.p (JLnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 29e: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 2a1: aload 27
// 2a3: ifnonnull 2c1
// 2a6: ifeq 2db
// 2a9: aload 34
// 2ab: invokevirtual su/catlean/n3.b ()Lnet/minecraft/class_2338;
// 2ae: aload 28
// 2b0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2b3: goto 2c1
// 2b6: ldc2_w 4915777938813610496
// 2b9: lload 6
// 2bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c0: athrow
// 2c1: aload 27
// 2c3: ifnonnull 2d8
// 2c6: ifeq 2db
// 2c9: goto 2d7
// 2cc: ldc2_w 4915777938813610496
// 2cf: lload 6
// 2d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d6: athrow
// 2d7: bipush 1
// 2d8: goto 2dc
// 2db: bipush 0
// 2dc: ifeq 25d
// 2df: bipush 1
// 2e0: aload 27
// 2e2: iload 5
// 2e4: ifle 2a3
// 2e7: ifnonnull 2a1
// 2ea: goto 2ee
// 2ed: bipush 0
// 2ee: iload 5
// 2f0: ifle 2f7
// 2f3: ifeq 303
// 2f6: bipush 1
// 2f7: ireturn
// 2f8: ldc2_w 4915777938813610496
// 2fb: lload 6
// 2fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: athrow
// 303: aload 3
// 304: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 309: astore 29
// 30b: aload 29
// 30d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 312: ifeq 4f7
// 315: aload 29
// 317: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 31c: checkcast net/minecraft/class_2338
// 31f: astore 30
// 321: getstatic su/catlean/gj.Y Lkotlin/enums/EnumEntries;
// 324: checkcast java/lang/Iterable
// 327: astore 32
// 329: bipush 0
// 32a: istore 33
// 32c: aload 32
// 32e: astore 34
// 330: new java/util/ArrayList
// 333: dup
// 334: invokespecial java/util/ArrayList.<init> ()V
// 337: checkcast java/util/Collection
// 33a: astore 35
// 33c: bipush 0
// 33d: istore 36
// 33f: aload 34
// 341: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 346: astore 37
// 348: aload 37
// 34a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 34f: ifeq 3c6
// 352: aload 37
// 354: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 359: astore 38
// 35b: aload 38
// 35d: checkcast net/minecraft/class_2350
// 360: astore 39
// 362: bipush 0
// 363: istore 40
// 365: aload 39
// 367: aload 27
// 369: ifnonnull 31c
// 36c: iload 5
// 36e: ifle 31c
// 371: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 374: iload 2
// 375: ifle 3a1
// 378: aload 27
// 37a: ifnonnull 3a1
// 37d: if_acmpeq 3b3
// 380: goto 38e
// 383: ldc2_w 4915777938813610496
// 386: lload 6
// 388: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38d: athrow
// 38e: aload 39
// 390: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 393: goto 3a1
// 396: ldc2_w 4915777938813610496
// 399: lload 6
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: if_acmpeq 3b3
// 3a4: bipush 1
// 3a5: goto 3b4
// 3a8: ldc2_w 4915777938813610496
// 3ab: lload 6
// 3ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b2: athrow
// 3b3: bipush 0
// 3b4: ifeq 348
// 3b7: aload 35
// 3b9: aload 38
// 3bb: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 3c0: pop
// 3c1: aload 27
// 3c3: ifnull 348
// 3c6: aload 35
// 3c8: checkcast java/util/List
// 3cb: nop
// 3cc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 3d1: iload 4
// 3d3: iflt 359
// 3d6: astore 31
// 3d8: aload 31
// 3da: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3df: ifeq 30b
// 3e2: aload 31
// 3e4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3e9: checkcast net/minecraft/class_2350
// 3ec: astore 32
// 3ee: aload 30
// 3f0: aload 32
// 3f2: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 3f5: dup
// 3f6: sipush 24558
// 3f9: ldc2_w 217788896268189327
// 3fc: lload 6
// 3fe: lxor
// 3ff: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 404: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 407: astore 33
// 409: aload 3
// 40a: aload 33
// 40c: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 411: iload 2
// 412: iflt 4f8
// 415: aload 27
// 417: ifnonnull 3df
// 41a: aload 27
// 41c: iload 5
// 41e: ifle 417
// 421: ifnonnull 312
// 424: aload 27
// 426: iload 2
// 427: ifle 417
// 42a: iload 2
// 42b: iflt 45d
// 42e: ifnonnull 45b
// 431: ifeq 455
// 434: goto 442
// 437: ldc2_w 4915777938813610496
// 43a: lload 6
// 43c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 441: athrow
// 442: aload 27
// 444: ifnull 3d8
// 447: goto 455
// 44a: ldc2_w 4915777938813610496
// 44d: lload 6
// 44f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 454: athrow
// 455: aload 0
// 456: lload 10
// 458: invokespecial su/catlean/u0.Q (J)Z
// 45b: aload 27
// 45d: iload 4
// 45f: iflt 4b7
// 462: ifnonnull 4b5
// 465: ifeq 4a1
// 468: goto 476
// 46b: ldc2_w 4915777938813610496
// 46e: lload 6
// 470: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 475: athrow
// 476: aload 28
// 478: aload 33
// 47a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 47d: aload 27
// 47f: ifnonnull 4f6
// 482: goto 490
// 485: ldc2_w 4915777938813610496
// 488: lload 6
// 48a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48f: athrow
// 490: ifne 4f5
// 493: goto 4a1
// 496: ldc2_w 4915777938813610496
// 499: lload 6
// 49b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a0: athrow
// 4a1: aload 0
// 4a2: lload 23
// 4a4: invokespecial su/catlean/u0.E (J)Z
// 4a7: goto 4b5
// 4aa: ldc2_w 4915777938813610496
// 4ad: lload 6
// 4af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b4: athrow
// 4b5: aload 27
// 4b7: iload 5
// 4b9: iflt 4dc
// 4bc: ifnonnull 4da
// 4bf: ifeq 3d8
// 4c2: goto 4d0
// 4c5: ldc2_w 4915777938813610496
// 4c8: lload 6
// 4ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4cf: athrow
// 4d0: aload 28
// 4d2: aload 33
// 4d4: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 4d7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 4da: aload 27
// 4dc: ifnonnull 4f6
// 4df: ifeq 3d8
// 4e2: iload 5
// 4e4: ifle 30b
// 4e7: goto 4f5
// 4ea: ldc2_w 4915777938813610496
// 4ed: lload 6
// 4ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f4: athrow
// 4f5: bipush 1
// 4f6: ireturn
// 4f7: bipush 0
// 4f8: ireturn
}

@Flow
private final void O(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u0.c J
// 003: ldc2_w 3928837241401
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 98635110356026
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 39031546200581
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 64662334072183
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 110183314405716
// 022: lxor
// 023: dup2
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 10
// 02a: dup2
// 02b: bipush 16
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 11
// 034: dup2
// 035: bipush 48
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 12
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 48354204573414
// 043: lxor
// 044: lstore 13
// 046: pop2
// 047: ldc2_w 6532707387653920419
// 04a: lload 2
// 04b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: astore 20
// 052: aload 0
// 053: lload 6
// 055: invokespecial su/catlean/u0.L (J)Z
// 058: ifeq 18c
// 05b: getstatic su/catlean/u0.E Ljava/util/List;
// 05e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 063: astore 21
// 065: aload 21
// 067: invokeinterface java/util/Iterator.hasNext ()Z 1
// 06c: ifeq 18c
// 06f: aload 21
// 071: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 076: checkcast su/catlean/n3
// 079: astore 22
// 07b: invokestatic su/catlean/zf.A ()J
// 07e: l2d
// 07f: ldc2_w 2.0
// 082: ddiv
// 083: sipush 10950
// 086: ldc2_w 3760273212070446675
// 089: lload 2
// 08a: lxor
// 08b: invokedynamic b (IJ)I bsm=su/catlean/u0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: i2d
// 091: drem
// 092: d2i
// 093: istore 23
// 095: iload 23
// 097: sipush 18570
// 09a: ldc2_w 3149255962832610323
// 09d: lload 2
// 09e: lxor
// 09f: invokedynamic b (IJ)I bsm=su/catlean/u0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: aload 20
// 0a6: ifnonnull 0d5
// 0a9: if_icmplt 0d9
// 0ac: goto 0b9
// 0af: ldc2_w 6548627000259769561
// 0b2: lload 2
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: sipush 12174
// 0bc: ldc2_w 8118217747400508177
// 0bf: lload 2
// 0c0: lxor
// 0c1: invokedynamic b (IJ)I bsm=su/catlean/u0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: iload 23
// 0c8: goto 0d5
// 0cb: ldc2_w 6548627000259769561
// 0ce: lload 2
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: isub
// 0d6: goto 0db
// 0d9: iload 23
// 0db: istore 23
// 0dd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0e0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0e3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0e6: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 0e9: iload 10
// 0eb: i2c
// 0ec: iload 11
// 0ee: ldc 0.5
// 0f0: iload 12
// 0f2: i2s
// 0f3: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 0f6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0f9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0fc: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 0ff: iload 10
// 101: i2c
// 102: iload 11
// 104: fconst_0
// 105: iload 12
// 107: i2s
// 108: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 10b: lload 4
// 10d: dup2_x1
// 10e: pop2
// 10f: iload 23
// 111: i2f
// 112: ldc 360.0
// 114: fdiv
// 115: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 118: astore 24
// 11a: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 11d: new net/minecraft/class_238
// 120: dup
// 121: aload 22
// 123: invokevirtual su/catlean/n3.b ()Lnet/minecraft/class_2338;
// 126: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 129: aload 24
// 12b: aconst_null
// 12c: bipush 4
// 12d: aconst_null
// 12e: astore 15
// 130: istore 16
// 132: astore 17
// 134: astore 18
// 136: astore 19
// 138: lload 13
// 13a: aload 19
// 13c: aload 18
// 13e: aload 17
// 140: iload 16
// 142: aload 15
// 144: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 147: pop
// 148: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 14b: aload 22
// 14d: invokevirtual su/catlean/n3.D ()F
// 150: invokestatic java/lang/String.valueOf (F)Ljava/lang/String;
// 153: lload 8
// 155: dup2_x1
// 156: pop2
// 157: aload 22
// 159: invokevirtual su/catlean/n3.b ()Lnet/minecraft/class_2338;
// 15c: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 15f: dup
// 160: sipush 3025
// 163: ldc2_w 5757510447655040122
// 166: lload 2
// 167: lxor
// 168: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 170: aload 24
// 172: fconst_0
// 173: fconst_0
// 174: bipush 0
// 175: aconst_null
// 176: sipush 4168
// 179: ldc2_w 3899635463152991432
// 17c: lload 2
// 17d: lxor
// 17e: invokedynamic b (IJ)I bsm=su/catlean/u0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: aconst_null
// 184: invokestatic su/catlean/zi.h (Lsu/catlean/zi;JLjava/lang/String;Lnet/minecraft/class_243;Ljava/awt/Color;FFZLsu/catlean/c6;ILjava/lang/Object;)V
// 187: aload 20
// 189: ifnull 065
// 18c: return
}

private final boolean w(char param1, short param2, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
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
// 017: getstatic su/catlean/u0.c J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 51531441702417
// 023: lxor
// 024: dup2
// 025: bipush 56
// 027: lushr
// 028: l2i
// 029: istore 6
// 02b: dup2
// 02c: bipush 8
// 02e: lshl
// 02f: bipush 8
// 031: lushr
// 032: lstore 7
// 034: pop2
// 035: dup2
// 036: ldc2_w 119023994062514
// 039: lxor
// 03a: lstore 9
// 03c: dup2
// 03d: ldc2_w 87430167574711
// 040: lxor
// 041: lstore 11
// 043: dup2
// 044: ldc2_w 85295403468304
// 047: lxor
// 048: lstore 13
// 04a: pop2
// 04b: ldc2_w 6123143169032296690
// 04e: lload 4
// 050: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: aload 0
// 056: lload 13
// 058: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05b: iload 6
// 05d: i2b
// 05e: swap
// 05f: lload 7
// 061: dup2_x1
// 062: pop2
// 063: checkcast net/minecraft/class_1297
// 066: invokevirtual su/catlean/u0.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 069: checkcast net/minecraft/class_2374
// 06c: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 06f: dup
// 070: sipush 29267
// 073: ldc2_w 264764806023365510
// 076: lload 4
// 078: lxor
// 079: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 081: astore 16
// 083: astore 15
// 085: lload 13
// 087: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 08a: aload 15
// 08c: ifnonnull 0b9
// 08f: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 092: getstatic net/minecraft/class_4050.field_18079 Lnet/minecraft/class_4050;
// 095: if_acmpne 356
// 098: goto 0a6
// 09b: ldc2_w 6102506186813930120
// 09e: lload 4
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: lload 13
// 0a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ab: goto 0b9
// 0ae: ldc2_w 6102506186813930120
// 0b1: lload 4
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 0bc: aload 15
// 0be: ifnonnull 357
// 0c1: ifne 356
// 0c4: goto 0d2
// 0c7: ldc2_w 6102506186813930120
// 0ca: lload 4
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: lload 13
// 0d4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d7: invokevirtual net/minecraft/class_746.method_5869 ()Z
// 0da: aload 15
// 0dc: ifnonnull 357
// 0df: goto 0ed
// 0e2: ldc2_w 6102506186813930120
// 0e5: lload 4
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: ifne 356
// 0f0: goto 0fe
// 0f3: ldc2_w 6102506186813930120
// 0f6: lload 4
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: aload 16
// 100: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 103: dup
// 104: sipush 21657
// 107: ldc2_w 8653648432569738594
// 10a: lload 4
// 10c: lxor
// 10d: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 115: astore 17
// 117: lload 11
// 119: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 11c: aload 17
// 11e: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 121: dup
// 122: sipush 1926
// 125: ldc2_w 2062167043331995214
// 128: lload 4
// 12a: lxor
// 12b: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 133: astore 18
// 135: aload 16
// 137: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 13a: dup
// 13b: sipush 6417
// 13e: ldc2_w 5793157995049855200
// 141: lload 4
// 143: lxor
// 144: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 14c: astore 19
// 14e: lload 11
// 150: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 153: aload 19
// 155: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 158: dup
// 159: sipush 1926
// 15c: ldc2_w 2062167043331995214
// 15f: lload 4
// 161: lxor
// 162: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/u0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 16a: astore 20
// 16c: aload 18
// 16e: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 171: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 174: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 177: aload 15
// 179: ifnonnull 26e
// 17c: ifne 263
// 17f: goto 18d
// 182: ldc2_w 6102506186813930120
// 185: lload 4
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: aload 18
// 18f: lload 11
// 191: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 194: checkcast net/minecraft/class_1922
// 197: aload 17
// 199: invokevirtual net/minecraft/class_2680.method_26214 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)F
// 19c: fconst_0
// 19d: fcmpl
// 19e: aload 15
// 1a0: ifnonnull 26e
// 1a3: goto 1b1
// 1a6: ldc2_w 6102506186813930120
// 1a9: lload 4
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: ifle 263
// 1b4: goto 1c2
// 1b7: ldc2_w 6102506186813930120
// 1ba: lload 4
// 1bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c1: athrow
// 1c2: aload 18
// 1c4: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1c7: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 1ca: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1cd: aload 15
// 1cf: ifnonnull 26e
// 1d2: goto 1e0
// 1d5: ldc2_w 6102506186813930120
// 1d8: lload 4
// 1da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1df: athrow
// 1e0: ifne 263
// 1e3: goto 1f1
// 1e6: ldc2_w 6102506186813930120
// 1e9: lload 4
// 1eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f0: athrow
// 1f1: aload 18
// 1f3: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1f6: getstatic net/minecraft/class_2246.field_10543 Lnet/minecraft/class_2248;
// 1f9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1fc: aload 15
// 1fe: ifnonnull 26e
// 201: goto 20f
// 204: ldc2_w 6102506186813930120
// 207: lload 4
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: ifne 263
// 212: goto 220
// 215: ldc2_w 6102506186813930120
// 218: lload 4
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: aload 18
// 222: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 225: aload 15
// 227: iload 3
// 228: iflt 270
// 22b: ifnonnull 26e
// 22e: goto 23c
// 231: ldc2_w 6102506186813930120
// 234: lload 4
// 236: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23b: athrow
// 23c: ifne 263
// 23f: goto 24d
// 242: ldc2_w 6102506186813930120
// 245: lload 4
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: aload 0
// 24e: lload 9
// 250: aload 17
// 252: bipush 1
// 253: invokespecial su/catlean/u0.Z (JLnet/minecraft/class_2338;Z)V
// 256: bipush 1
// 257: ireturn
// 258: ldc2_w 6102506186813930120
// 25b: lload 4
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: aload 20
// 265: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 268: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 26b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 26e: aload 15
// 270: ifnonnull 357
// 273: ifne 356
// 276: goto 284
// 279: ldc2_w 6102506186813930120
// 27c: lload 4
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: aload 20
// 286: lload 11
// 288: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 28b: checkcast net/minecraft/class_1922
// 28e: aload 19
// 290: invokevirtual net/minecraft/class_2680.method_26214 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)F
// 293: fconst_0
// 294: fcmpl
// 295: aload 15
// 297: ifnonnull 357
// 29a: goto 2a8
// 29d: ldc2_w 6102506186813930120
// 2a0: lload 4
// 2a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a7: athrow
// 2a8: ifle 356
// 2ab: goto 2b9
// 2ae: ldc2_w 6102506186813930120
// 2b1: lload 4
// 2b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b8: athrow
// 2b9: aload 20
// 2bb: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 2be: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 2c1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2c4: aload 15
// 2c6: ifnonnull 357
// 2c9: goto 2d7
// 2cc: ldc2_w 6102506186813930120
// 2cf: lload 4
// 2d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d6: athrow
// 2d7: ifne 356
// 2da: goto 2e8
// 2dd: ldc2_w 6102506186813930120
// 2e0: lload 4
// 2e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e7: athrow
// 2e8: aload 20
// 2ea: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 2ed: getstatic net/minecraft/class_2246.field_10543 Lnet/minecraft/class_2248;
// 2f0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2f3: aload 15
// 2f5: ifnonnull 357
// 2f8: goto 306
// 2fb: ldc2_w 6102506186813930120
// 2fe: lload 4
// 300: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 305: athrow
// 306: ifne 356
// 309: goto 317
// 30c: ldc2_w 6102506186813930120
// 30f: lload 4
// 311: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: athrow
// 317: aload 20
// 319: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 31c: aload 15
// 31e: ifnonnull 357
// 321: goto 32f
// 324: ldc2_w 6102506186813930120
// 327: lload 4
// 329: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32e: athrow
// 32f: ifne 356
// 332: goto 340
// 335: ldc2_w 6102506186813930120
// 338: lload 4
// 33a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33f: athrow
// 340: aload 0
// 341: lload 9
// 343: aload 19
// 345: bipush 1
// 346: invokespecial su/catlean/u0.Z (JLnet/minecraft/class_2338;Z)V
// 349: bipush 1
// 34a: ireturn
// 34b: ldc2_w 6102506186813930120
// 34e: lload 4
// 350: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 355: athrow
// 356: bipush 0
// 357: ireturn
}

private final boolean i(int param1, int param2, short param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: iload 3
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: getstatic su/catlean/u0.c J
// 1a: lxor
// 1b: lstore 4
// 1d: lload 4
// 1f: dup2
// 20: ldc2_w 102827643387066
// 23: lxor
// 24: lstore 6
// 26: dup2
// 27: ldc2_w 136710452378648
// 2a: lxor
// 2b: lstore 8
// 2d: pop2
// 2e: ldc2_w -5840615111641963782
// 31: lload 4
// 33: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 3b: invokevirtual su/catlean/nf.V ()Ljava/util/List;
// 3e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 43: astore 11
// 45: astore 10
// 47: aload 11
// 49: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4e: ifeq e0
// 51: aload 11
// 53: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 58: checkcast net/minecraft/class_2586
// 5b: astore 12
// 5d: lload 8
// 5f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 62: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 65: aload 12
// 67: invokevirtual net/minecraft/class_2586.method_11016 ()Lnet/minecraft/class_2338;
// 6a: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 6d: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 70: ldc2_w 2.2
// 73: dcmpl
// 74: aload 10
// 76: iload 1
// 77: ifle 7f
// 7a: ifnonnull e1
// 7d: aload 10
// 7f: ifnonnull b4
// 82: goto 90
// 85: ldc2_w -5856855662174142336
// 88: lload 4
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: ifgt b7
// 93: goto a1
// 96: ldc2_w -5856855662174142336
// 99: lload 4
// 9b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: athrow
// a1: aload 12
// a3: instanceof net/minecraft/class_2611
// a6: goto b4
// a9: ldc2_w -5856855662174142336
// ac: lload 4
// ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: athrow
// b4: ifne ce
// b7: aload 10
// b9: ifnull 47
// bc: iload 1
// bd: ifle 5d
// c0: goto ce
// c3: ldc2_w -5856855662174142336
// c6: lload 4
// c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cd: athrow
// ce: aload 0
// cf: aload 12
// d1: checkcast net/minecraft/class_2611
// d4: invokevirtual net/minecraft/class_2611.method_11016 ()Lnet/minecraft/class_2338;
// d7: lload 6
// d9: dup2_x1
// da: pop2
// db: bipush 0
// dc: invokespecial su/catlean/u0.Z (JLnet/minecraft/class_2338;Z)V
// df: nop
// e0: bipush 0
// e1: ireturn
}

private final boolean l(class_1657 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u0.c J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 25635216592929
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 174159712606998113
// 12: lload 2
// 13: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 1b: invokevirtual su/catlean/nf.V ()Ljava/util/List;
// 1e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 23: astore 7
// 25: astore 6
// 27: aload 7
// 29: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2e: ifeq bc
// 31: aload 7
// 33: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 38: checkcast net/minecraft/class_2586
// 3b: astore 8
// 3d: aload 1
// 3e: invokevirtual net/minecraft/class_1657.method_33571 ()Lnet/minecraft/class_243;
// 41: aload 8
// 43: invokevirtual net/minecraft/class_2586.method_11016 ()Lnet/minecraft/class_2338;
// 46: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 49: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 4c: ldc2_w 2.2
// 4f: dcmpl
// 50: aload 6
// 52: lload 2
// 53: lconst_0
// 54: lcmp
// 55: iflt 5d
// 58: ifnonnull bd
// 5b: aload 6
// 5d: ifnonnull 8f
// 60: goto 6d
// 63: ldc2_w 153982324201139227
// 66: lload 2
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: ifgt 92
// 70: goto 7d
// 73: ldc2_w 153982324201139227
// 76: lload 2
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: aload 8
// 7f: instanceof net/minecraft/class_2627
// 82: goto 8f
// 85: ldc2_w 153982324201139227
// 88: lload 2
// 89: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e: athrow
// 8f: ifne aa
// 92: aload 6
// 94: ifnull 27
// 97: lload 2
// 98: lconst_0
// 99: lcmp
// 9a: ifle 3d
// 9d: goto aa
// a0: ldc2_w 153982324201139227
// a3: lload 2
// a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: athrow
// aa: aload 0
// ab: aload 8
// ad: checkcast net/minecraft/class_2627
// b0: invokevirtual net/minecraft/class_2627.method_11016 ()Lnet/minecraft/class_2338;
// b3: lload 4
// b5: dup2_x1
// b6: pop2
// b7: bipush 1
// b8: invokespecial su/catlean/u0.Z (JLnet/minecraft/class_2338;Z)V
// bb: nop
// bc: bipush 0
// bd: ireturn
}

private final void Z(long param1, class_2338 param3, boolean param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u0.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 105274352357562
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: lstore 6
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 90271486720486
// 021: lxor
// 022: lstore 8
// 024: dup2
// 025: ldc2_w 12200287384681
// 028: lxor
// 029: lstore 10
// 02b: dup2
// 02c: ldc2_w 69149672290522
// 02f: lxor
// 030: lstore 12
// 032: dup2
// 033: ldc2_w 36367016375531
// 036: lxor
// 037: lstore 14
// 039: dup2
// 03a: ldc2_w 37712375156064
// 03d: lxor
// 03e: lstore 16
// 040: dup2
// 041: ldc2_w 72715023655349
// 044: lxor
// 045: lstore 18
// 047: pop2
// 048: ldc2_w 8312741062298419031
// 04b: lload 1
// 04c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: astore 20
// 053: aload 3
// 054: ifnonnull 062
// 057: return
// 058: ldc2_w 8292669229425286445
// 05b: lload 1
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 065: lload 12
// 067: invokevirtual su/catlean/ex.l (J)Z
// 06a: aload 20
// 06c: ifnonnull 0b2
// 06f: ifeq 0aa
// 072: goto 07f
// 075: ldc2_w 8292669229425286445
// 078: lload 1
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: iload 4
// 081: aload 20
// 083: lload 1
// 084: lconst_0
// 085: lcmp
// 086: ifle 0b4
// 089: ifnonnull 0b2
// 08c: goto 099
// 08f: ldc2_w 8292669229425286445
// 092: lload 1
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: ifne 0aa
// 09c: goto 0a9
// 09f: ldc2_w 8292669229425286445
// 0a2: lload 1
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: return
// 0aa: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0ad: lload 14
// 0af: invokevirtual su/catlean/ex.f (J)Z
// 0b2: aload 20
// 0b4: ifnonnull 168
// 0b7: ifeq 14d
// 0ba: goto 0c7
// 0bd: ldc2_w 8292669229425286445
// 0c0: lload 1
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0ca: lload 16
// 0cc: invokevirtual su/catlean/ex.x (J)Z
// 0cf: lload 1
// 0d0: lconst_0
// 0d1: lcmp
// 0d2: ifle 125
// 0d5: aload 20
// 0d7: ifnonnull 125
// 0da: goto 0e7
// 0dd: ldc2_w 8292669229425286445
// 0e0: lload 1
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: ifeq 129
// 0ea: goto 0f7
// 0ed: ldc2_w 8292669229425286445
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0fa: lload 1
// 0fb: lconst_0
// 0fc: lcmp
// 0fd: iflt 13f
// 100: aload 20
// 102: ifnonnull 13f
// 105: goto 112
// 108: ldc2_w 8292669229425286445
// 10b: lload 1
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: invokevirtual su/catlean/ex.Fn ()Ljava/util/LinkedList;
// 115: invokevirtual java/util/LinkedList.size ()I
// 118: goto 125
// 11b: ldc2_w 8292669229425286445
// 11e: lload 1
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: bipush 1
// 126: if_icmpne 13c
// 129: aload 0
// 12a: lload 8
// 12c: invokevirtual su/catlean/u0.g (J)V
// 12f: goto 13c
// 132: ldc2_w 8292669229425286445
// 135: lload 1
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 13f: aload 3
// 140: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 143: lload 10
// 145: invokevirtual su/catlean/ex.k (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;J)V
// 148: aload 20
// 14a: ifnull 174
// 14d: iload 5
// 14f: lload 6
// 151: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 154: aload 3
// 155: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 158: invokevirtual net/minecraft/class_636.method_2902 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// 15b: goto 168
// 15e: ldc2_w 8292669229425286445
// 161: lload 1
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: pop
// 169: lload 18
// 16b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16e: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 171: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 174: return
}

public final void g(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 63834805147979L;
t.X(var3);
}

private static final boolean H() {
long var0 = c ^ 128363496187116L;
long var10001 = var0 ^ 11104406070901L;
int var2 = (int)((var0 ^ 11104406070901L) >>> 48);
int var3 = (int)((var0 ^ 11104406070901L) << 16 >>> 32);
int var4 = (int)(var10001 << 48 >>> 48);
return a.Z((char)var2, var3, var4);
}

private static final boolean C() {
long var0 = c ^ 33450426091639L;
long var10001 = var0 ^ 106428458699502L;
int var2 = (int)((var0 ^ 106428458699502L) >>> 48);
int var3 = (int)((var0 ^ 106428458699502L) << 16 >>> 32);
int var4 = (int)(var10001 << 48 >>> 48);
return a.Z((char)var2, var3, var4);
}

private static final boolean I() {
long var0 = c ^ 68401348714526L;
long var10001 = var0 ^ 70997565629063L;
int var2 = (int)((var0 ^ 70997565629063L) >>> 48);
int var3 = (int)((var0 ^ 70997565629063L) << 16 >>> 32);
int var4 = (int)(var10001 << 48 >>> 48);
return a.Z((char)var2, var3, var4);
}

private static final boolean n() {
long var0 = c ^ 86542905939499L;
long var10001 = var0 ^ 52855235990706L;
int var2 = (int)((var0 ^ 52855235990706L) >>> 48);
int var3 = (int)((var0 ^ 52855235990706L) << 16 >>> 32);
int var4 = (int)(var10001 << 48 >>> 48);
return a.Z((char)var2, var3, var4);
}

static {
long var20 = c ^ 87137208818909L;
long var22 = var20 ^ 4730319530958L;
long var24 = var20 ^ 60352184381015L;
long var26 = var20 ^ 24563131054872L;
long var28 = var20 ^ 72595768876842L;
long var30 = var20 ^ 116166300874150L;
long var10001 = var20 ^ 113499149237305L;
int var32 = (int)((var20 ^ 113499149237305L) >>> 32);
int var33 = (int)((var20 ^ 113499149237305L) << 32 >>> 48);
int var34 = (int)(var10001 << 48 >>> 48);
long var35 = var20 ^ 36381799553166L;
long var37 = var20 ^ 118168675548054L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[49];
int var16 = 0;
String var15 = "Ñ}¼ðá]%\u0000?\u0094¶É`ÛÜ\u0082Ê¹à1JÎ2\u001dñ\u001a\u0010M¥¥Ön\u0010\u008eÑÆ¥\u0000î#\u0004;\u000fo\u0083r8\u0092\u0094 \u000bìô l\u008aYHH=*cÂ2@£\u0019\u0097{ï}/ñ\u0018C¬ÃþÖä³ó\u0018ñ6í¨3dº%\u0084¿ b]\r\u0013±þh:ê4\u000bÏ\u0017(}¨\u000f\u0018Xª\u008ba\u007fm\u009b{|\u0006©¶ýôç\u0011\u0010Ã¢Ù*ÍT°.\u0084ü\\¹\u0011ÊÌCaf\u0014 Í'o\u0006&\u009bk\rôôÞºàóÄ\u007f°o\u009e\u0003ª\u0090\t[ò,½4÷\u0086\u008b\u008a ®1|Ìñ.wuáw;\t|¢\u0093i\u0000rr£¯uW\u009b-H\u008c½u%Ô¹\u0018¯\u0013\u009c3\u009eÊAF,mîå\u0010\u009b»uî\u001c!\u0088B\u009b\b 0EF«\u0016ðDôuÄ\u0089Ùñ\\½X\u008eÆ|}½\tÒjA¬\u009e}DJâ]¢Î\u0082Ë1QsÎ1\u008c\u0089¡³\u008aCzG ö÷ÑA\u0094Õ\u0085\u0010\\²sk§?¨\u00835d\u000e\u0096½ç%¾?>ÇÊ\u0095±}c(H\u001b=\u0087\u0097\u001e\u001b^Øw{Z\u001f\u009er\u0092[»×,¾h? ¾ À\u0002\u000e^\u0010²DÎ.Û\u0001\u0098R\u0087 i/m½Ø@°¸\u00828§FzNw³J\u009f=\u000e¡Fñ\u0092Ë\u0098½¹@\u001cX\u0080 *×}\u0001À\u001eas\u001e e=0i /ä®OM^\u001côIQ\u0001A\b\u0098\"\u0089\u0083\u0018wç°`ó\u007fÇNQ\u0096#\u00876\u0099·\u001d\u0012Ó\u000f#ó:\u0013G \u0081*Jÿ¿£Qõ¤\t¶Ú^ruM\u000f£@¸ùÇS@Ääþ\u0011\u0092\u0093\u0018w(\fàú\u009fèzkõïù'¯Q:Ø÷l®Ï\rì\u0018\u008a²:Ù\u0006æ¯h%NºÄEo\u0098v\u001dæ c\u0011ßhz§\u009f\u0087ÐO\u0090ÇÁ\u0014\u0011ÞÒ\u0011}û\b¨k\u001fk©i\u0098ÁA:\u0013(_;}\u008eL¥\u0005@ë\u009eò\u001f·)¯_á\u0095¾{2ð\u0080Ò½<³ÑP\u0005J\u0088ÒEO¿ßXÍM\u0018õ-»ë\u0017¡¶á]Ì\u0086ýËÁZD+r¹\u0092\u0019t¡Þ Öf×[\u0091ú¯çºÀ\u000f%\u000f6ØûWËÇ\u000e\u0013+Ü¼\u0099^TiNÒ)ò(/OÈ\u0016\u0095rµ\u0007fçø¿\u0086áuûy\u0083û\u001cÅpq\u000e+-¯\u0094^Z\u000e\b8\u0093òY\u0015¨\u0019g(\u001d,\u008dv\u0002&¾\u008c\u0086Ó\u0081ª>ñª\u0080Ôî\u0096ËÎt\u0012Í\u0007\u001fU\u0004 (D×rÀH\u008b[A7Ò \u008f;ÉHÖÇp]¨ëû²q)¡\u0083Ï)ß\u0080\u008f÷v&m=ÔÙBýÕ\n ¾Á¯«Ý¬t,c\nr\u009cnÀ\u008ek \u0004&:ý\u0012/Gí\u001aõ_&ñE¦\u0018z\u0090Ç\u008e-g\u0019*plP\u0002§\fWÄuhîS¡åF\u0003 (\u001bÌ¼{?9\u008edÕÂ\u0080/ÐÝ;X\u0018ùú!Óg8n\u0087í\u0092Ø¾ÊF \u0090yhý\u0004V®Ãqä\u009b¥Ñe\u0010YÐ\"\u000efçt\u0093\u0086«\u001bf\b\u0002\u009b\u001d\u0001Xãn©sw#4ð§\u0004²æ\u0084ë\u0000ýÌ4\u0016µÃÁí\u009eDp³¸¯uxÃ¸ª\u0010\u008fÚ\u009cOX\u0080¹ßòºQ}ìûIS(Ðíz/.|Ú/\f\u008euµ\u0014A\u001dþÂT\u001dGé\f©Ö\u00144°{rCé}¿Õ+õ ý\u00022\u0016S»ô³ôY\u0093[E\u0095>¸Ê`qß¹wÛºÚü\u0089\u0000ÐR\u0014W Ê\u0016½!¬¯¡Ì\u00ad\u0006Ìû\u0097%PW\u0003LãÙÐÖÅ'@\u008dB\u000fQå#\u0015\u0018¼ä\u000e¢Bü(!UõíkX\u0082´\\{J\u0091\u009djuÇç C\u0011`Ç\u0012\u0004\u0013\u008f\u008f¬<q¸íÖv²µy¬x[]~9 \fí\u001beVU 7\u0010<)£~ëÆ«î\u0085\u008b£\tz\u000e,-Ü(Å¾\u0015\u0083¼\u0099f7\"m\u0083ð\u0018\u0093\u0019ÞIÉ5Æu8N>\u0082\u0006ñ\u0096\u0002\u0084T&¯0\u008e\"\u0086 K¨v\u009b\u0087Á\b±Ðw@×H\u008eÂ\b#àm\u008b\u0015áÔyÔÇj\u0093Ú\u00129ó 1\u0080Ì3ÃÓpÎFÝfQ\u009b6±êQ=üKð-Ó¹\u0087H(½\u009e\u0014\u008ff \n\u0014.®]¡\u0098\u0005\u008c\t\u0080÷(\u0014þ\u0093\u001b\u0086©¤\u0001ö\u000f\u0018ÉZª}\u0082gT\u008c\u0010FÇ\u000f¦ð`ÔE}3\u001e«¹çäÇ q\u008c±-x40÷ÌÇûV}{tÌ\u0004\u0095{ì/SkÐ=¬p\u0095ùQ\nî(\u0003\u0097Ü\u009dóÒ'§\u0010áø!\u0000$sD\u0095ÚÈx\u000e\u0091lmÔ^?\u0006z\r5÷\u008eP/!ü8\u0016\u0085\u0018y&h\u0018úHJ×îwñ\u0013O7së£óÒÎÝëk·\u0010´f\u0090x\u0088\u008c(\u0018ãEÖ¼î\u0082ÆÛ Eþ\u0015d\u001cJÂtÖ\u0013ÁÖJ\r$çÆêa\u0019¿ê\u0081D´\u009bà\u009f<æ\u0085,(u`þÄÙT\u0000i\u0015\u0007¡Ñ§S¢\u000br-}Ö\u008cæ÷W\u0003É\u0014LäQ\u0089Tx\u001f¥þß&\u0085° UÁÌ\u0012CÜ\u0086×Þ0\u000b5]eÞ\u0080³¾\u0000_\u0015/\u001aÓàHÄ«\u008e.¹®\u0010d}6ä\u001ajúX\u0089²?½ÒÎ5@\u0018ßÿ|Ùðì\u0016\u0011Ùp\u008bs\u009a¬U·nÛ©xX¼\u0014F";
int var17 = "Ñ}¼ðá]%\u0000?\u0094¶É`ÛÜ\u0082Ê¹à1JÎ2\u001dñ\u001a\u0010M¥¥Ön\u0010\u008eÑÆ¥\u0000î#\u0004;\u000fo\u0083r8\u0092\u0094 \u000bìô l\u008aYHH=*cÂ2@£\u0019\u0097{ï}/ñ\u0018C¬ÃþÖä³ó\u0018ñ6í¨3dº%\u0084¿ b]\r\u0013±þh:ê4\u000bÏ\u0017(}¨\u000f\u0018Xª\u008ba\u007fm\u009b{|\u0006©¶ýôç\u0011\u0010Ã¢Ù*ÍT°.\u0084ü\\¹\u0011ÊÌCaf\u0014 Í'o\u0006&\u009bk\rôôÞºàóÄ\u007f°o\u009e\u0003ª\u0090\t[ò,½4÷\u0086\u008b\u008a ®1|Ìñ.wuáw;\t|¢\u0093i\u0000rr£¯uW\u009b-H\u008c½u%Ô¹\u0018¯\u0013\u009c3\u009eÊAF,mîå\u0010\u009b»uî\u001c!\u0088B\u009b\b 0EF«\u0016ðDôuÄ\u0089Ùñ\\½X\u008eÆ|}½\tÒjA¬\u009e}DJâ]¢Î\u0082Ë1QsÎ1\u008c\u0089¡³\u008aCzG ö÷ÑA\u0094Õ\u0085\u0010\\²sk§?¨\u00835d\u000e\u0096½ç%¾?>ÇÊ\u0095±}c(H\u001b=\u0087\u0097\u001e\u001b^Øw{Z\u001f\u009er\u0092[»×,¾h? ¾ À\u0002\u000e^\u0010²DÎ.Û\u0001\u0098R\u0087 i/m½Ø@°¸\u00828§FzNw³J\u009f=\u000e¡Fñ\u0092Ë\u0098½¹@\u001cX\u0080 *×}\u0001À\u001eas\u001e e=0i /ä®OM^\u001côIQ\u0001A\b\u0098\"\u0089\u0083\u0018wç°`ó\u007fÇNQ\u0096#\u00876\u0099·\u001d\u0012Ó\u000f#ó:\u0013G \u0081*Jÿ¿£Qõ¤\t¶Ú^ruM\u000f£@¸ùÇS@Ääþ\u0011\u0092\u0093\u0018w(\fàú\u009fèzkõïù'¯Q:Ø÷l®Ï\rì\u0018\u008a²:Ù\u0006æ¯h%NºÄEo\u0098v\u001dæ c\u0011ßhz§\u009f\u0087ÐO\u0090ÇÁ\u0014\u0011ÞÒ\u0011}û\b¨k\u001fk©i\u0098ÁA:\u0013(_;}\u008eL¥\u0005@ë\u009eò\u001f·)¯_á\u0095¾{2ð\u0080Ò½<³ÑP\u0005J\u0088ÒEO¿ßXÍM\u0018õ-»ë\u0017¡¶á]Ì\u0086ýËÁZD+r¹\u0092\u0019t¡Þ Öf×[\u0091ú¯çºÀ\u000f%\u000f6ØûWËÇ\u000e\u0013+Ü¼\u0099^TiNÒ)ò(/OÈ\u0016\u0095rµ\u0007fçø¿\u0086áuûy\u0083û\u001cÅpq\u000e+-¯\u0094^Z\u000e\b8\u0093òY\u0015¨\u0019g(\u001d,\u008dv\u0002&¾\u008c\u0086Ó\u0081ª>ñª\u0080Ôî\u0096ËÎt\u0012Í\u0007\u001fU\u0004 (D×rÀH\u008b[A7Ò \u008f;ÉHÖÇp]¨ëû²q)¡\u0083Ï)ß\u0080\u008f÷v&m=ÔÙBýÕ\n ¾Á¯«Ý¬t,c\nr\u009cnÀ\u008ek \u0004&:ý\u0012/Gí\u001aõ_&ñE¦\u0018z\u0090Ç\u008e-g\u0019*plP\u0002§\fWÄuhîS¡åF\u0003 (\u001bÌ¼{?9\u008edÕÂ\u0080/ÐÝ;X\u0018ùú!Óg8n\u0087í\u0092Ø¾ÊF \u0090yhý\u0004V®Ãqä\u009b¥Ñe\u0010YÐ\"\u000efçt\u0093\u0086«\u001bf\b\u0002\u009b\u001d\u0001Xãn©sw#4ð§\u0004²æ\u0084ë\u0000ýÌ4\u0016µÃÁí\u009eDp³¸¯uxÃ¸ª\u0010\u008fÚ\u009cOX\u0080¹ßòºQ}ìûIS(Ðíz/.|Ú/\f\u008euµ\u0014A\u001dþÂT\u001dGé\f©Ö\u00144°{rCé}¿Õ+õ ý\u00022\u0016S»ô³ôY\u0093[E\u0095>¸Ê`qß¹wÛºÚü\u0089\u0000ÐR\u0014W Ê\u0016½!¬¯¡Ì\u00ad\u0006Ìû\u0097%PW\u0003LãÙÐÖÅ'@\u008dB\u000fQå#\u0015\u0018¼ä\u000e¢Bü(!UõíkX\u0082´\\{J\u0091\u009djuÇç C\u0011`Ç\u0012\u0004\u0013\u008f\u008f¬<q¸íÖv²µy¬x[]~9 \fí\u001beVU 7\u0010<)£~ëÆ«î\u0085\u008b£\tz\u000e,-Ü(Å¾\u0015\u0083¼\u0099f7\"m\u0083ð\u0018\u0093\u0019ÞIÉ5Æu8N>\u0082\u0006ñ\u0096\u0002\u0084T&¯0\u008e\"\u0086 K¨v\u009b\u0087Á\b±Ðw@×H\u008eÂ\b#àm\u008b\u0015áÔyÔÇj\u0093Ú\u00129ó 1\u0080Ì3ÃÓpÎFÝfQ\u009b6±êQ=üKð-Ó¹\u0087H(½\u009e\u0014\u008ff \n\u0014.®]¡\u0098\u0005\u008c\t\u0080÷(\u0014þ\u0093\u001b\u0086©¤\u0001ö\u000f\u0018ÉZª}\u0082gT\u008c\u0010FÇ\u000f¦ð`ÔE}3\u001e«¹çäÇ q\u008c±-x40÷ÌÇûV}{tÌ\u0004\u0095{ì/SkÐ=¬p\u0095ùQ\nî(\u0003\u0097Ü\u009dóÒ'§\u0010áø!\u0000$sD\u0095ÚÈx\u000e\u0091lmÔ^?\u0006z\r5÷\u008eP/!ü8\u0016\u0085\u0018y&h\u0018úHJ×îwñ\u0013O7së£óÒÎÝëk·\u0010´f\u0090x\u0088\u008c(\u0018ãEÖ¼î\u0082ÆÛ Eþ\u0015d\u001cJÂtÖ\u0013ÁÖJ\r$çÆêa\u0019¿ê\u0081D´\u009bà\u009f<æ\u0085,(u`þÄÙT\u0000i\u0015\u0007¡Ñ§S¢\u000br-}Ö\u008cæ÷W\u0003É\u0014LäQ\u0089Tx\u001f¥þß&\u0085° UÁÌ\u0012CÜ\u0086×Þ0\u000b5]eÞ\u0080³¾\u0000_\u0015/\u001aÓàHÄ«\u008e.¹®\u0010d}6ä\u001ajúX\u0089²?½ÒÎ5@\u0018ßÿ|Ùðì\u0016\u0011Ùp\u008bs\u009a¬U·nÛ©xX¼\u0014F"
.length();
char var14 = ' ';
int var42 = -1;

label54:
while (true) {
String var43 = var15.substring(++var42, var42 + var14);
byte var47 = -1;

while (true) {
byte[] var19 = var11.doFinal(var43.getBytes("ISO-8859-1"));
String var55 = b(var19).intern();
switch (var47) {
case 0:
var18[var16++] = var55;
if ((var42 += var14) >= var17) {
d = var18;
e = new String[49];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[19];
int var3 = 0;
String var4 = "\u0006\u0089NM$\u0014\u008f ´\u0005ÎÄ@:\u000f\u007f\u007f\u0000\u000e\f£\u0007¨V^\u0004\fÊ¾ª¥äã\f\u001c\u0096Þ¸ÉÄ#\u0001X\u001d\u0000³\\S/\u000fVÔ\f\u009d® \u0001mñçy\f:£õ\t#\u0099¤éÈ\u0088\u008bP\u0016DK\r[|À\u0011P'ß\u001aÎ\u0010´ÄÚÿ§§ß\u000eb\u0086\u0081\u009dÞÓ\"G\u0018lé\u008e\u0090\n±úeX\b¿\u0017¡¼\u001e\u0006\u008cÑQÂÃ{YggS\u0086P7\u0001\u000e";
int var5 = "\u0006\u0089NM$\u0014\u008f ´\u0005ÎÄ@:\u000f\u007f\u007f\u0000\u000e\f£\u0007¨V^\u0004\fÊ¾ª¥äã\f\u001c\u0096Þ¸ÉÄ#\u0001X\u001d\u0000³\\S/\u000fVÔ\f\u009d® \u0001mñçy\f:£õ\t#\u0099¤éÈ\u0088\u008bP\u0016DK\r[|À\u0011P'ß\u001aÎ\u0010´ÄÚÿ§§ß\u000eb\u0086\u0081\u009dÞÓ\"G\u0018lé\u008e\u0090\n±úeX\b¿\u0017¡¼\u001e\u0006\u008cÑQÂÃ{YggS\u0086P7\u0001\u000e"
.length();
byte var2 = 0;

label36:
while (true) {
byte var51 = var2;
var2 += 8;
byte[] var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
long[] var46 = var6;
int var52 = var3++;
long var59 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var62 = -1;

while (true) {
long var8 = var59;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var64 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var62) {
case 0:
var46[var52] = var64;
if (var2 >= var5) {
g = var6;
h = new Integer[19];
KProperty[] var39 = new KProperty[c<"b">(18154, 9059342528264850582L ^ var20)];
var39[0] = Reflection.property1(new PropertyReference1Impl(u0.class, b<"x">(9053, 725963076812438059L ^ var20), b<"x">(31521, 1278856019583378009L ^ var20), 0));
var39[1] = Reflection.property1(new PropertyReference1Impl(u0.class, b<"x">(11192, 392776745338794713L ^ var20), b<"x">(3775, 3298506252926932956L ^ var20), 0));
var39[2] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(24102, 4600449134625687398L ^ var20), b<"x">(2404, 1584465733547937827L ^ var20), 0)
);
var39[3] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(17423, 6010031148457467214L ^ var20), b<"x">(28323, 5061584151030020047L ^ var20), 0)
);
var39[4] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(29564, 9218127323950557711L ^ var20), b<"x">(30240, 5449003102243204956L ^ var20), 0)
);
var39[5] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(15453, 8099027107354699063L ^ var20), b<"x">(28230, 3797560408282183473L ^ var20), 0)
);
var39[c<"b">(22281, 1079588473890332023L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(6582, 1092964485174476998L ^ var20), b<"x">(13833, 3158290026828066634L ^ var20), 0)
);
var39[c<"b">(20878, 2383157711666109432L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(18189, 1965349051506433654L ^ var20), b<"x">(26427, 3595762782255398493L ^ var20), 0)
);
var39[c<"b">(26622, 5866534333679660426L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(30438, 1444557495290507159L ^ var20), b<"x">(26623, 6803373687241686683L ^ var20), 0)
);
var39[c<"b">(30334, 1139183854582299659L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(4234, 1301231563100277199L ^ var20), b<"x">(5212, 7496814112737250622L ^ var20), 0)
);
var39[c<"b">(7016, 3979031556224192785L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(31117, 613104627142467780L ^ var20), b<"x">(13418, 1317629725997624615L ^ var20), 0)
);
var39[c<"b">(17391, 8986442288217737629L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u0.class, b<"x">(8725, 245090065463507801L ^ var20), b<"x">(29154, 2054155227321378966L ^ var20), 0)
);
U = var39;
a = new u0(var37);
l = yp.t(a, b<"x">(28389, 4224382234903558028L ^ var20), true, var26, null, null, c<"b">(13192, 1100291429959023086L ^ var20), null);
B = yp.t(a, b<"x">(24659, 5775582188631111988L ^ var20), true, var26, null, null, c<"b">(13192, 1100291429959023086L ^ var20), null);
P = yp.t(a, b<"x">(31012, 5624192967264608342L ^ var20), true, var26, null, null, c<"b">(13192, 1100291429959023086L ^ var20), null);
k = yp.t(a, b<"x">(31365, 2208114592135062504L ^ var20), false, var26, null, null, c<"b">(13192, 1100291429959023086L ^ var20), null);
u = yp.t(a, b<"x">(1014, 7435428796208274077L ^ var20), true, var26, null, null, c<"b">(13192, 1100291429959023086L ^ var20), null);
j = yp.J(
a,
b<"x">(3199, 7368101867656467729L ^ var20),
new lj(0, false, var28, false, c<"b">(20878, 2383157711666109432L ^ var20), null),
null,
var32,
null,
var33,
(char)var34,
c<"b">(13192, 1100291429959023086L ^ var20),
null
);
D = yp.t(a, b<"x">(8441, 3126388138088200583L ^ var20), false, var26, null, null, c<"b">(13192, 1100291429959023086L ^ var20), null);
b = yp.t(a, b<"x">(13957, 635905767792537550L ^ var20), true, var26, null, null, c<"b">(13192, 1100291429959023086L ^ var20), null);
O = yp.h(a, b<"x">(2341, 4082020830062727248L ^ var20), var35, w7.BOOLS, u0::H);
L = yp.l(var30, a, b<"x">(24305, 5172766730038675358L ^ var20), true, a.s(var24), u0::C);
w = yp.l(var30, a, b<"x">(27977, 1582361363339883564L ^ var20), true, a.s(var24), u0::I);
o = yp.l(var30, a, b<"x">(13344, 3278978605089025375L ^ var20), true, a.s(var24), u0::n);
t = new i9(var22);
E = new ArrayList();
return;
}
break;
default:
var46[var52] = var64;
if (var2 < var5) {
continue label36;
}

var4 = "j\u001a¤×>\u0006\u00138!#\u0012ÀZtÖf";
var5 = "j\u001a¤×>\u0006\u00138!#\u0012ÀZtÖf".length();
var2 = 0;
}

byte var53 = var2;
var2 += 8;
var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
var46 = var6;
var52 = var3++;
var59 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var62 = 0;
}
}
}

var14 = var15.charAt(var42);
break;
default:
var18[var16++] = var55;
if ((var42 += var14) < var17) {
var14 = var15.charAt(var42);
continue label54;
}

var15 = "éçÊèÍ ÕN\u000b?\u0013eç\u00910\u0092\u007fBrH2¿\u008a¾É\u0089\u0094êÊÜF8äQö\u009d\u000eõÀ\u0018\u00182¬ÚÀ2á*¦Õ(\u0090\u008b½/\u0019~*\u0085\"\u0094æ\u0004{Â";
var17 = "éçÊèÍ ÕN\u000b?\u0013eç\u00910\u0092\u007fBrH2¿\u008a¾É\u0089\u0094êÊÜF8äQö\u009d\u000eõÀ\u0018\u00182¬ÚÀ2á*¦Õ(\u0090\u008b½/\u0019~*\u0085\"\u0094æ\u0004{Â"
.length();
var14 = '(';
var42 = -1;
}

var43 = var15.substring(++var42, var42 + var14);
var47 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25766;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/u0", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/u0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 14268;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/u0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/u0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
