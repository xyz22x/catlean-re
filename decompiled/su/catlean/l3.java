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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

public final class l3 implements jr {
@NotNull
public static final l3 l;
private static boolean p;
private static float u;
private static float g;
private static final long a = yz.a(-6609135483615907518L, -6898001304243865689L, MethodHandles.lookup().lookupClass()).a(68990957462844L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map h;

private l3() {
}

public final boolean I() {
return p;
}

public final void a(boolean <set-?>) {
p = <set-?>;
}

public final float H() {
return u;
}

public final void Z(float <set-?>) {
u = <set-?>;
}

public final float Y() {
return g;
}

public final void h(float <set-?>) {
g = <set-?>;
}

@Override
public void w(long a, @NotNull PreSyncEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 108052155071832
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 102830384802247
// 00c: lxor
// 00d: dup2
// 00e: bipush 32
// 010: lushr
// 011: l2i
// 012: istore 6
// 014: dup2
// 015: bipush 32
// 017: lshl
// 018: bipush 40
// 01a: lushr
// 01b: l2i
// 01c: istore 7
// 01e: dup2
// 01f: bipush 56
// 021: lshl
// 022: bipush 56
// 024: lushr
// 025: l2i
// 026: istore 8
// 028: pop2
// 029: dup2
// 02a: ldc2_w 93229743192781
// 02d: lxor
// 02e: lstore 9
// 030: dup2
// 031: ldc2_w 95510200616042
// 034: lxor
// 035: lstore 11
// 037: pop2
// 038: ldc2_w 6232619157977255585
// 03b: lload 1
// 03c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: aload 3
// 042: ldc "e"
// 044: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 047: astore 13
// 049: lload 11
// 04b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 04e: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 051: invokevirtual net/minecraft/class_746.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
// 054: dup
// 055: sipush 26333
// 058: ldc2_w 8282726951227717498
// 05b: lload 1
// 05c: lxor
// 05d: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/l3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 065: astore 14
// 067: aload 14
// 069: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 06c: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
// 06f: aload 13
// 071: ifnonnull 0a1
// 074: ifeq 191
// 077: goto 084
// 07a: ldc2_w 6248407887165653850
// 07d: lload 1
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: lload 11
// 086: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 089: getstatic su/catlean/l3.g F
// 08c: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 08f: aload 14
// 091: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 094: goto 0a1
// 097: ldc2_w 6248407887165653850
// 09a: lload 1
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: sipush 32587
// 0a4: ldc2_w 8647855540605369714
// 0a7: lload 1
// 0a8: lxor
// 0a9: invokedynamic q (IJ)I bsm=su/catlean/l3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: lload 1
// 0af: lconst_0
// 0b0: lcmp
// 0b1: ifle 0fd
// 0b4: aload 13
// 0b6: ifnonnull 0fd
// 0b9: if_icmple 191
// 0bc: goto 0c9
// 0bf: ldc2_w 6248407887165653850
// 0c2: lload 1
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: lload 11
// 0cb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ce: aload 13
// 0d0: ifnonnull 161
// 0d3: goto 0e0
// 0d6: ldc2_w 6248407887165653850
// 0d9: lload 1
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: getfield net/minecraft/class_746.field_6012 I
// 0e3: sipush 17930
// 0e6: ldc2_w 7619995418506593328
// 0e9: lload 1
// 0ea: lxor
// 0eb: invokedynamic q (IJ)I bsm=su/catlean/l3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: goto 0fd
// 0f3: ldc2_w 6248407887165653850
// 0f6: lload 1
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: irem
// 0fe: lload 1
// 0ff: lconst_0
// 100: lcmp
// 101: iflt 109
// 104: ifne 191
// 107: iload 6
// 109: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 10c: sipush 10499
// 10f: ldc2_w 1754459037131618469
// 112: lload 1
// 113: lxor
// 114: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/l3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 11c: sipush 16652
// 11f: ldc2_w 7890837409732415662
// 122: lload 1
// 123: lxor
// 124: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/l3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: bipush 0
// 12a: anewarray 529
// 12d: lload 4
// 12f: dup2_x1
// 130: pop2
// 131: invokevirtual su/catlean/ut.J (Ljava/lang/String;J[Ljava/lang/Object;)Ljava/lang/String;
// 134: iload 7
// 136: iload 8
// 138: i2b
// 139: bipush 2
// 13a: getstatic su/catlean/ys.WARNING Lsu/catlean/ys;
// 13d: aconst_null
// 13e: sipush 19630
// 141: ldc2_w 1267695224912154262
// 144: lload 1
// 145: lxor
// 146: invokedynamic q (IJ)I bsm=su/catlean/l3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: aconst_null
// 14c: invokestatic su/catlean/sg.J (ILsu/catlean/sg;Ljava/lang/String;Ljava/lang/String;IBILsu/catlean/ys;Lnet/minecraft/class_1799;ILjava/lang/Object;)V
// 14f: lload 11
// 151: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 154: goto 161
// 157: ldc2_w 6248407887165653850
// 15a: lload 1
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: astore 15
// 163: bipush 0
// 164: istore 16
// 166: lload 9
// 168: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 16b: aload 15
// 16d: checkcast net/minecraft/class_1297
// 170: aload 15
// 172: invokevirtual net/minecraft/class_746.method_23317 ()D
// 175: aload 15
// 177: invokevirtual net/minecraft/class_746.method_23318 ()D
// 17a: aload 15
// 17c: invokevirtual net/minecraft/class_746.method_23321 ()D
// 17f: getstatic net/minecraft/class_3417.field_15152 Lnet/minecraft/class_6880$class_6883;
// 182: checkcast net/minecraft/class_6880
// 185: getstatic net/minecraft/class_3419.field_15256 Lnet/minecraft/class_3419;
// 188: ldc 10.0
// 18a: fconst_1
// 18b: lconst_0
// 18c: invokevirtual net/minecraft/class_638.method_8465 (Lnet/minecraft/class_1297;DDDLnet/minecraft/class_6880;Lnet/minecraft/class_3419;FFJ)V
// 18f: nop
// 190: nop
// 191: return
}

@Override
public void y(@NotNull PreElytraEvent e, long a) {
long var4 = ax ^ 79805115683167L;
Intrinsics.checkNotNullParameter(ex, "e");
ut.D.Y(zf.v(var4).method_36455());
zf.v(var4).method_36457(g);
}

@Override
public void b(long a, @NotNull AfterElytraEvent e) {
long var4 = ax ^ 18213801518595L;
Intrinsics.checkNotNullParameter(ex, "e");
zf.v(var4).method_36457(ut.D.i());
}

@Override
public void h(@NotNull MoveEvent e, long a) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void j(long a, @NotNull AfterSendPacket event) {
Intrinsics.checkNotNullParameter(event, a<"c">(10800, 6810330209990679228L ^ ax));
}

@Override
public void A(@NotNull ReceivePacket e, long a, char a) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void P(int a, @NotNull PlayerUpdateEvent e, char a, char a) {
long var5 = (long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48;
long var10001 = var5 ^ 73283691515063L;
int var7 = (int)((var5 ^ 73283691515063L) >>> 48);
int var8 = (int)((var5 ^ 73283691515063L) << 16 >>> 48);
int var9 = (int)(var10001 << 32 >>> 32);
Intrinsics.checkNotNullParameter(ex, "e");
g = this.A((char)var7, (short)var8, var9);
}

@Override
public void m(char param1, int param2, short param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 3
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: lstore 4
// 19: lload 4
// 1b: dup2
// 1c: ldc2_w 16238893981878
// 1f: lxor
// 20: lstore 6
// 22: dup2
// 23: ldc2_w 99743207150509
// 26: lxor
// 27: lstore 8
// 29: dup2
// 2a: ldc2_w 96087070894725
// 2d: lxor
// 2e: lstore 10
// 30: pop2
// 31: ldc2_w -5147130986191282098
// 34: lload 4
// 36: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: astore 12
// 3d: lload 10
// 3f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 42: invokevirtual net/minecraft/class_746.method_23318 ()D
// 45: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 48: lload 6
// 4a: invokevirtual su/catlean/ut.F9 (J)I
// 4d: i2d
// 4e: dcmpg
// 4f: aload 12
// 51: ifnonnull 7c
// 54: ifge 7b
// 57: goto 65
// 5a: ldc2_w -5162870752391926347
// 5d: lload 4
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 68: lload 8
// 6a: invokevirtual su/catlean/ut.F3 (J)V
// 6d: goto 7b
// 70: ldc2_w -5162870752391926347
// 73: lload 4
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: bipush 0
// 7c: putstatic su/catlean/l3.p Z
// 7f: return
}

@Override
public void b(long var1) {
}

@Override
public void U(long a, @NotNull FireWorkVelocityEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void s(@NotNull SetPoseEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void k(long a, @NotNull ReceivePacket e) {
Intrinsics.checkNotNullParameter(ex, "e");
}

private final float A(char param1, short param2, int param3) {
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
// 017: getstatic su/catlean/l3.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 36414356013787
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 95800890809199
// 02a: lxor
// 02b: dup2
// 02c: bipush 48
// 02e: lushr
// 02f: l2i
// 030: istore 8
// 032: dup2
// 033: bipush 16
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 9
// 03c: dup2
// 03d: bipush 32
// 03f: lshl
// 040: bipush 32
// 042: lushr
// 043: l2i
// 044: istore 10
// 046: pop2
// 047: dup2
// 048: ldc2_w 134868496807503
// 04b: lxor
// 04c: lstore 11
// 04e: dup2
// 04f: ldc2_w 132759770810600
// 052: lxor
// 053: lstore 13
// 055: pop2
// 056: ldc2_w 1944596784758719011
// 059: lload 4
// 05b: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: astore 15
// 062: lload 13
// 064: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 067: invokevirtual net/minecraft/class_746.method_23318 ()D
// 06a: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 06d: lload 6
// 06f: invokevirtual su/catlean/ut.F9 (J)I
// 072: i2d
// 073: dcmpg
// 074: aload 15
// 076: ifnonnull 16a
// 079: ifge 15b
// 07c: goto 08a
// 07f: ldc2_w 1888384545052184536
// 082: lload 4
// 084: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: athrow
// 08a: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 08d: invokevirtual su/catlean/dm.r ()F
// 090: ldc 72.0
// 092: fmul
// 093: ldc 25.0
// 095: fcmpg
// 096: aload 15
// 098: ifnonnull 103
// 09b: goto 0a9
// 09e: ldc2_w 1888384545052184536
// 0a1: lload 4
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: ifge 0f7
// 0ac: goto 0ba
// 0af: ldc2_w 1888384545052184536
// 0b2: lload 4
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: getstatic su/catlean/l3.p Z
// 0bd: aload 15
// 0bf: iload 2
// 0c0: iflt 105
// 0c3: ifnonnull 103
// 0c6: goto 0d4
// 0c9: ldc2_w 1888384545052184536
// 0cc: lload 4
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: ifne 0f7
// 0d7: goto 0e5
// 0da: ldc2_w 1888384545052184536
// 0dd: lload 4
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: bipush 1
// 0e6: putstatic su/catlean/l3.p Z
// 0e9: goto 0f7
// 0ec: ldc2_w 1888384545052184536
// 0ef: lload 4
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0fa: invokevirtual su/catlean/dm.r ()F
// 0fd: ldc 72.0
// 0ff: fmul
// 100: ldc 150.0
// 102: fcmpl
// 103: aload 15
// 105: ifnonnull 170
// 108: ifle 16d
// 10b: goto 119
// 10e: ldc2_w 1888384545052184536
// 111: lload 4
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: getstatic su/catlean/l3.p Z
// 11c: iload 1
// 11d: iflt 170
// 120: aload 15
// 122: ifnonnull 170
// 125: goto 133
// 128: ldc2_w 1888384545052184536
// 12b: lload 4
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: ifeq 16d
// 136: goto 144
// 139: ldc2_w 1888384545052184536
// 13c: lload 4
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: bipush 0
// 145: putstatic su/catlean/l3.p Z
// 148: aload 15
// 14a: ifnull 16d
// 14d: goto 15b
// 150: ldc2_w 1888384545052184536
// 153: lload 4
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: bipush 1
// 15c: goto 16a
// 15f: ldc2_w 1888384545052184536
// 162: lload 4
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: putstatic su/catlean/l3.p Z
// 16d: getstatic su/catlean/l3.p Z
// 170: ifeq 18f
// 173: getstatic su/catlean/l3.u F
// 176: ldc 3.0
// 178: fadd
// 179: putstatic su/catlean/l3.u F
// 17c: aload 15
// 17e: ifnull 1a6
// 181: goto 18f
// 184: ldc2_w 1888384545052184536
// 187: lload 4
// 189: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: athrow
// 18f: getstatic su/catlean/l3.u F
// 192: ldc 3.0
// 194: fsub
// 195: putstatic su/catlean/l3.u F
// 198: goto 1a6
// 19b: ldc2_w 1888384545052184536
// 19e: lload 4
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: lload 11
// 1a8: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1ab: new net/minecraft/class_3959
// 1ae: dup
// 1af: lload 13
// 1b1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b4: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 1b7: lload 13
// 1b9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1bc: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 1bf: lload 13
// 1c1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c4: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 1c7: getfield net/minecraft/class_243.field_1352 D
// 1ca: ldc2_w 10.0
// 1cd: dmul
// 1ce: lload 13
// 1d0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d3: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 1d6: getfield net/minecraft/class_243.field_1351 D
// 1d9: ldc2_w 10.0
// 1dc: dmul
// 1dd: lload 13
// 1df: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1e2: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 1e5: getfield net/minecraft/class_243.field_1350 D
// 1e8: ldc2_w 10.0
// 1eb: dmul
// 1ec: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 1ef: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
// 1f2: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 1f5: lload 13
// 1f7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1fa: checkcast net/minecraft/class_1297
// 1fd: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 200: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
// 203: dup
// 204: sipush 6527
// 207: ldc2_w 824150117240128601
// 20a: lload 4
// 20c: lxor
// 20d: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/l3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 215: astore 16
// 217: aload 15
// 219: ifnonnull 26b
// 21c: aload 16
// 21e: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 221: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
// 224: if_acmpne 25e
// 227: goto 235
// 22a: ldc2_w 1888384545052184536
// 22d: lload 4
// 22f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 234: athrow
// 235: lload 13
// 237: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23a: ldc -33.0
// 23c: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 23f: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 242: iload 8
// 244: i2s
// 245: aconst_null
// 246: bipush 1
// 247: iload 9
// 249: i2c
// 24a: aconst_null
// 24b: iload 10
// 24d: invokestatic su/catlean/ut.M (Lsu/catlean/ut;SLjava/lang/String;ICLjava/lang/Object;I)V
// 250: goto 25e
// 253: ldc2_w 1888384545052184536
// 256: lload 4
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: getstatic su/catlean/l3.u F
// 261: ldc -40.0
// 263: ldc 40.0
// 265: invokestatic java/lang/Math.clamp (FFF)F
// 268: putstatic su/catlean/l3.u F
// 26b: getstatic su/catlean/l3.u F
// 26e: freturn
}

static {
long var11 = a ^ 61962917455985L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[5];
int var18 = 0;
String var17 = "G(\u000bjPµ\u0098[\u0013«\u0099oF°¨!(ËxVª\\Xèî\u001fÿ¸qxôÅE\\p\u0010\u0000,Û\"ÕVÙÞ7\u0000ëæzÇ\u0088ú\u0014L×¢g ÙÇór*\u0001Î|p¼ë*¥t.Ø}P,à\t_õ\ra\u0094\u009eøÈ\u0097\u009e\u0010";
int var19 = "G(\u000bjPµ\u0098[\u0013«\u0099oF°¨!(ËxVª\\Xèî\u001fÿ¸qxôÅE\\p\u0010\u0000,Û\"ÕVÙÞ7\u0000ëæzÇ\u0088ú\u0014L×¢g ÙÇór*\u0001Î|p¼ë*¥t.Ø}P,à\t_õ\ra\u0094\u009eøÈ\u0097\u009e\u0010"
.length();
char var16 = 16;
int var23 = -1;

label45:
while (true) {
String var24 = var17.substring(++var23, var23 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var33;
if ((var23 += var16) >= var19) {
b = var20;
c = new String[5];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "\u001eÀ6\u0000\u0004sTS\u0000\u0088`Ð\u0083WxI7] Ó>\u0085§=";
int var5 = "\u001eÀ6\u0000\u0004sTS\u0000\u0088`Ð\u0083WxI7] Ó>\u0085§=".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
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
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[3];
l = new l3();
return;
}

var16 = var17.charAt(var23);
break;
default:
var20[var18++] = var33;
if ((var23 += var16) < var19) {
var16 = var17.charAt(var23);
continue label45;
}

var17 = "ÚZ\u000f\u0082\u009b\u001e2CIX\u0001«<6;ð0¸M;\u0015Ò\u0098ÈÔ\u0087Ò(p\u000b$©f\u001a³ë\u00ad\u009b1»~$+\u0019p\u0019ë}ý\u008a<\"Ï öhßÌ\u001e\u0084\u009f[B\u0092D";
var19 = "ÚZ\u000f\u0082\u009b\u001e2CIX\u0001«<6;ð0¸M;\u0015Ò\u0098ÈÔ\u0087Ò(p\u000b$©f\u001a³ë\u00ad\u009b1»~$+\u0019p\u0019ë}ý\u008a<\"Ï öhßÌ\u001e\u0084\u009f[B\u0092D"
.length();
var16 = 16;
var23 = -1;
}

var24 = var17.substring(++var23, var23 + var16);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18083;
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
throw new RuntimeException("su/catlean/l3", var10);
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
throw new RuntimeException("su/catlean/l3" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5437;
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
throw new RuntimeException("su/catlean/l3", var14);
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
throw new RuntimeException("su/catlean/l3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
