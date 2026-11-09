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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class u1 extends _g {
@NotNull
public static final u1 A;
static final KProperty[] D;
@NotNull
private static final cq z;
@NotNull
private static final c8 G;
private static final long a = yz.a(-2615564319668834958L, -4734896442773522434L, MethodHandles.lookup().lookupClass()).a(200238509996904L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private u1(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 43104534884836L;
super(b<"b">(13544, 6033454626048300502L ^ var1), jt.Q(), null, 4, null, var3);
}

private final boolean B(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 118785365155404L;
return (Boolean)z.E(this, var3, D[0]);
}

private final void I(long var1, boolean var3) {
var1 = a ^ var1;
long var4 = var1 ^ 12100954599856L;
z.b(this, var4, D[0], var3);
}

private final int I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 47628864529889L;
return ((Number)G.E(this, var3, D[1])).intValue();
}

private final void C(int var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 73072291130599L;
G.b(this, var4, D[1], var1);
}

@Flow
private final void f(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u1.a J
// 003: ldc2_w 8038342916472
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 47862898076464
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 133225540676897
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 31067855200191
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 42408780730145
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 31987657348439
// 043: lxor
// 044: dup2
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 13
// 04b: dup2
// 04c: bipush 16
// 04e: lshl
// 04f: bipush 48
// 051: lushr
// 052: l2i
// 053: istore 14
// 055: dup2
// 056: bipush 32
// 058: lshl
// 059: bipush 32
// 05b: lushr
// 05c: l2i
// 05d: istore 15
// 05f: pop2
// 060: dup2
// 061: ldc2_w 119702248099997
// 064: lxor
// 065: lstore 16
// 067: dup2
// 068: ldc2_w 25424499668017
// 06b: lxor
// 06c: lstore 18
// 06e: dup2
// 06f: ldc2_w 10071524836338
// 072: lxor
// 073: lstore 20
// 075: dup2
// 076: ldc2_w 25620894367860
// 079: lxor
// 07a: lstore 22
// 07c: pop2
// 07d: ldc2_w 1314694016688170326
// 080: lload 2
// 081: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: aload 1
// 087: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 08a: astore 25
// 08c: astore 24
// 08e: aload 25
// 090: instanceof net/minecraft/class_2824
// 093: ifne 0a1
// 096: return
// 097: ldc2_w 1334290347166622826
// 09a: lload 2
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 0a4: lload 11
// 0a6: aload 25
// 0a8: checkcast net/minecraft/class_2824
// 0ab: invokevirtual su/catlean/u2.G (JLnet/minecraft/class_2824;)Lnet/minecraft/class_1297;
// 0ae: astore 26
// 0b0: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0b3: lload 9
// 0b5: invokevirtual su/catlean/dm.Y (J)Z
// 0b8: aload 24
// 0ba: ifnonnull 0e0
// 0bd: ifeq 0e3
// 0c0: goto 0cd
// 0c3: ldc2_w 1334290347166622826
// 0c6: lload 2
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: aload 0
// 0ce: lload 4
// 0d0: invokespecial su/catlean/u1.B (J)Z
// 0d3: goto 0e0
// 0d6: ldc2_w 1334290347166622826
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: ifeq 252
// 0e3: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 0e6: iload 13
// 0e8: i2s
// 0e9: iload 14
// 0eb: i2s
// 0ec: iload 15
// 0ee: aload 25
// 0f0: checkcast net/minecraft/class_2824
// 0f3: invokevirtual su/catlean/u2.V (SSILnet/minecraft/class_2824;)Lnet/minecraft/class_2824$class_5907;
// 0f6: getstatic net/minecraft/class_2824$class_5907.field_29172 Lnet/minecraft/class_2824$class_5907;
// 0f9: if_acmpne 252
// 0fc: goto 109
// 0ff: ldc2_w 1334290347166622826
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: aload 26
// 10b: instanceof net/minecraft/class_1511
// 10e: aload 24
// 110: ifnonnull 142
// 113: goto 120
// 116: ldc2_w 1334290347166622826
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: ifne 252
// 123: goto 130
// 126: ldc2_w 1334290347166622826
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: aload 26
// 132: instanceof net/minecraft/class_1309
// 135: goto 142
// 138: ldc2_w 1334290347166622826
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 24
// 144: ifnonnull 17a
// 147: ifeq 252
// 14a: goto 157
// 14d: ldc2_w 1334290347166622826
// 150: lload 2
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: bipush 0
// 158: sipush 18701
// 15b: ldc2_w 8224692990883339027
// 15e: lload 2
// 15f: lxor
// 160: invokedynamic r (IJ)I bsm=su/catlean/u1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: bipush 0
// 166: lload 20
// 168: bipush 4
// 169: aconst_null
// 16a: invokestatic su/catlean/mf.P (IIZJILjava/lang/Object;)I
// 16d: goto 17a
// 170: ldc2_w 1334290347166622826
// 173: lload 2
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: aload 24
// 17c: ifnonnull 1bc
// 17f: sipush 18701
// 182: ldc2_w 8224692990883339027
// 185: lload 2
// 186: lxor
// 187: invokedynamic r (IJ)I bsm=su/catlean/u1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: aload 0
// 18d: lload 16
// 18f: invokespecial su/catlean/u1.I (J)I
// 192: isub
// 193: if_icmplt 252
// 196: goto 1a3
// 199: ldc2_w 1334290347166622826
// 19c: lload 2
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 0
// 1a4: iload 6
// 1a6: iload 7
// 1a8: i2s
// 1a9: iload 8
// 1ab: i2s
// 1ac: invokespecial su/catlean/u1.n (ISS)Z
// 1af: goto 1bc
// 1b2: ldc2_w 1334290347166622826
// 1b5: lload 2
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: aload 24
// 1be: ifnonnull 1f8
// 1c1: ifne 252
// 1c4: goto 1d1
// 1c7: ldc2_w 1334290347166622826
// 1ca: lload 2
// 1cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: athrow
// 1d1: lload 22
// 1d3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d6: aload 24
// 1d8: ifnonnull 24e
// 1db: goto 1e8
// 1de: ldc2_w 1334290347166622826
// 1e1: lload 2
// 1e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: athrow
// 1e8: invokevirtual net/minecraft/class_746.method_5624 ()Z
// 1eb: goto 1f8
// 1ee: ldc2_w 1334290347166622826
// 1f1: lload 2
// 1f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: athrow
// 1f8: ifeq 224
// 1fb: new net/minecraft/class_2848
// 1fe: dup
// 1ff: lload 22
// 201: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 204: checkcast net/minecraft/class_1297
// 207: getstatic net/minecraft/class_2848$class_2849.field_12985 Lnet/minecraft/class_2848$class_2849;
// 20a: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 20d: checkcast net/minecraft/class_2596
// 210: lload 18
// 212: dup2_x1
// 213: pop2
// 214: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 217: goto 224
// 21a: ldc2_w 1334290347166622826
// 21d: lload 2
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: new net/minecraft/class_2848
// 227: dup
// 228: lload 22
// 22a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22d: checkcast net/minecraft/class_1297
// 230: getstatic net/minecraft/class_2848$class_2849.field_12981 Lnet/minecraft/class_2848$class_2849;
// 233: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 236: checkcast net/minecraft/class_2596
// 239: lload 18
// 23b: dup2_x1
// 23c: pop2
// 23d: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 240: lload 22
// 242: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 245: bipush 1
// 246: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 249: lload 22
// 24b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 24e: bipush 1
// 24f: putfield net/minecraft/class_746.field_3919 Z
// 252: return
}

private final boolean n(int param1, short param2, short param3) {
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
// 002: bipush 32
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/u1.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 35579885799223
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
// 036: ldc2_w 71495689173393
// 039: lxor
// 03a: lstore 9
// 03c: dup2
// 03d: ldc2_w 73742122927926
// 040: lxor
// 041: lstore 11
// 043: pop2
// 044: ldc2_w 1548375576702853652
// 047: lload 4
// 049: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: astore 13
// 050: lload 11
// 052: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 055: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 058: getfield net/minecraft/class_1656.field_7479 Z
// 05b: aload 13
// 05d: ifnonnull 174
// 060: ifne 173
// 063: goto 071
// 066: ldc2_w 1568957310152041256
// 069: lload 4
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: lload 11
// 073: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 076: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 079: aload 13
// 07b: ifnonnull 174
// 07e: goto 08c
// 081: ldc2_w 1568957310152041256
// 084: lload 4
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: ifne 173
// 08f: goto 09d
// 092: ldc2_w 1568957310152041256
// 095: lload 4
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: lload 11
// 09f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a2: getstatic net/minecraft/class_1294.field_5919 Lnet/minecraft/class_6880;
// 0a5: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 0a8: aload 13
// 0aa: ifnonnull 174
// 0ad: goto 0bb
// 0b0: ldc2_w 1568957310152041256
// 0b3: lload 4
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: ifne 173
// 0be: goto 0cc
// 0c1: ldc2_w 1568957310152041256
// 0c4: lload 4
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: lload 9
// 0ce: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0d1: aload 0
// 0d2: lload 11
// 0d4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d7: iload 6
// 0d9: i2b
// 0da: swap
// 0db: lload 7
// 0dd: dup2_x1
// 0de: pop2
// 0df: checkcast net/minecraft/class_1297
// 0e2: invokevirtual su/catlean/u1.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0e5: checkcast net/minecraft/class_2374
// 0e8: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0eb: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0ee: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0f1: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
// 0f4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f7: aload 13
// 0f9: ifnonnull 174
// 0fc: goto 10a
// 0ff: ldc2_w 1568957310152041256
// 102: lload 4
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: ifne 173
// 10d: goto 11b
// 110: ldc2_w 1568957310152041256
// 113: lload 4
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: lload 11
// 11d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 120: invokevirtual net/minecraft/class_746.method_5771 ()Z
// 123: aload 13
// 125: ifnonnull 174
// 128: goto 136
// 12b: ldc2_w 1568957310152041256
// 12e: lload 4
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: ifne 173
// 139: goto 147
// 13c: ldc2_w 1568957310152041256
// 13f: lload 4
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: lload 11
// 149: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14c: invokevirtual net/minecraft/class_746.method_5869 ()Z
// 14f: aload 13
// 151: ifnonnull 174
// 154: goto 162
// 157: ldc2_w 1568957310152041256
// 15a: lload 4
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: ifeq 177
// 165: goto 173
// 168: ldc2_w 1568957310152041256
// 16b: lload 4
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: bipush 1
// 174: goto 178
// 177: bipush 0
// 178: istore 14
// 17a: lload 11
// 17c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 17f: ldc 0.5
// 181: invokevirtual net/minecraft/class_746.method_7261 (F)F
// 184: ldc 0.9
// 186: fcmpg
// 187: aload 13
// 189: iload 1
// 18a: ifle 1b2
// 18d: ifnonnull 1b0
// 190: ifge 1ae
// 193: goto 1a1
// 196: ldc2_w 1568957310152041256
// 199: lload 4
// 19b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: athrow
// 1a1: bipush 0
// 1a2: ireturn
// 1a3: ldc2_w 1568957310152041256
// 1a6: lload 4
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: iload 14
// 1b0: aload 13
// 1b2: ifnonnull 22b
// 1b5: ifne 22a
// 1b8: goto 1c6
// 1bb: ldc2_w 1568957310152041256
// 1be: lload 4
// 1c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: athrow
// 1c6: lload 11
// 1c8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1cb: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 1ce: aload 13
// 1d0: iload 2
// 1d1: ifgt 210
// 1d4: ifnonnull 20e
// 1d7: goto 1e5
// 1da: ldc2_w 1568957310152041256
// 1dd: lload 4
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: ifne 228
// 1e8: goto 1f6
// 1eb: ldc2_w 1568957310152041256
// 1ee: lload 4
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: lload 11
// 1f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1fb: getfield net/minecraft/class_746.field_6017 D
// 1fe: dconst_0
// 1ff: dcmpl
// 200: goto 20e
// 203: ldc2_w 1568957310152041256
// 206: lload 4
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: aload 13
// 210: ifnonnull 225
// 213: ifle 228
// 216: goto 224
// 219: ldc2_w 1568957310152041256
// 21c: lload 4
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: bipush 1
// 225: goto 229
// 228: bipush 0
// 229: ireturn
// 22a: bipush 0
// 22b: ireturn
}

static {
long var20 = a ^ 91287303540175L;
long var22 = var20 ^ 75414259196286L;
long var24 = var20 ^ 117860060490776L;
long var26 = var20 ^ 93488553258226L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[7];
int var16 = 0;
String var15 = "OaD\u0088¦Ät7¯\u001e[:\u0099ðv\u0084(¬åcô\u000f\u0096ÿ\u0093©o÷\u009cVÉkH«\u000bÔ\u009e\u009aôí\u0013¼¨Ø}\u001d0úOVtJ5;:\\\u008a ¡!%\u0093ØPG\u001dn\u0000\u008e âÝì\n\u0092E;\u000ePz\u0088¼V\u0092(ªÃk\u0013¾ T\u0098\u0080wrg©vÁ+6â¡¿;\u0000¥\u0016)+\u0001a\u001dzZÙ\u0090\u009c\u0080ìÆm\u0010U|öa\u0012\u009c\u009b\u0097¤ÜûËÎ%Úu";
int var17 = "OaD\u0088¦Ät7¯\u001e[:\u0099ðv\u0084(¬åcô\u000f\u0096ÿ\u0093©o÷\u009cVÉkH«\u000bÔ\u009e\u009aôí\u0013¼¨Ø}\u001d0úOVtJ5;:\\\u008a ¡!%\u0093ØPG\u001dn\u0000\u008e âÝì\n\u0092E;\u000ePz\u0088¼V\u0092(ªÃk\u0013¾ T\u0098\u0080wrg©vÁ+6â¡¿;\u0000¥\u0016)+\u0001a\u001dzZÙ\u0090\u009c\u0080ìÆm\u0010U|öa\u0012\u009c\u009b\u0097¤ÜûËÎ%Úu"
.length();
char var14 = 16;
int var31 = -1;

label54:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var43 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var43;
if ((var31 += var14) >= var17) {
b = var18;
c = new String[7];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "\"ÌÛ\u0098Â\u0096áßÅô\u0004#ªWô\u0099";
int var5 = "\"ÌÛ\u0098Â\u0096áßÅô\u0004#ªWô\u0099".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var35 = var6;
var10001 = var3++;
long var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var50 = -1;

while (true) {
long var8 = var47;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var52 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var50) {
case 0:
var35[var10001] = var52;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
KProperty[] var28 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u1.class, b<"b">(9244, 405511328708051889L ^ var20), b<"b">(13002, 5677436656201028961L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u1.class, b<"b">(27072, 2708638238558555753L ^ var20), b<"b">(16361, 8928080137163364419L ^ var20), 0)
)
};
D = var28;
A = new u1(var26);
z = yp.t(A, b<"b">(31829, 2464863485765786621L ^ var20), true, var22, null, null, c<"r">(24833, 6791404285340059562L ^ var20), null);
G = yp.L(
A,
b<"b">(10790, 8547035986569907594L ^ var20),
c<"r">(5996, 6408047144360473030L ^ var20),
new IntRange(0, c<"r">(18701, 8224609737667325860L ^ var20)),
var24,
null,
null,
c<"r">(21869, 2756577501263246277L ^ var20),
null
);
return;
}
break;
default:
var35[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "8\u0006ÏB\u0001VlIw\u0015H:ñ\u0006\u009dB";
var5 = "8\u0006ÏB\u0001VlIw\u0015H:ñ\u0006\u009dB".length();
var2 = 0;
}

byte var41 = var2;
var2 += 8;
var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
var35 = var6;
var10001 = var3++;
var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var50 = 0;
}
}
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var43;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label54;
}

var15 = "+\u0088ø\u0088$\u000eû3»\u00ad\fù\u0000\u009b¥^\u0018\u0016\u00142\u0004Ñ:\u0087ê\u008c\u0085l\u0085=z·¼¸µ\u00100TÖ\u0081ã";
var17 = "+\u0088ø\u0088$\u000eû3»\u00ad\fù\u0000\u009b¥^\u0018\u0016\u00142\u0004Ñ:\u0087ê\u008c\u0085l\u0085=z·¼¸µ\u00100TÖ\u0081ã".length();
var14 = 16;
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
var10001 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16389;
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
throw new RuntimeException("su/catlean/u1", var10);
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
throw new RuntimeException("su/catlean/u1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16644;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/u1", var14);
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
throw new RuntimeException("su/catlean/u1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
