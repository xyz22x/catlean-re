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
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.api.event.events.player.EventPostPlayerTravel;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.UpdateCrosshairTarget;
import su.catlean.gofra.Flow;

public final class kl extends _g {
@NotNull
public static final kl x;
@NotNull
private static _w F;
@NotNull
private static _w X;
private static final long a = yz.a(2960989270622517210L, 1313841314002512854L, MethodHandles.lookup().lookupClass()).a(74626525402603L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private kl(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 138750821620682L;
super(b<"g">(1596, 664954470889524566L ^ var1), jt.F(), null, 4, null, var3);
}

@NotNull
public final _w q() {
return F;
}

public final void U(@NotNull _w <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"g">(3476, 1808898596503322552L ^ ax));
F = <set-?>;
}

@Override
public void O(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 32978412894279
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 62698557940930
// 0b: lxor
// 0c: lstore 5
// 0e: dup2
// 0f: ldc2_w 20975573779856
// 12: lxor
// 13: lstore 7
// 15: dup2
// 16: ldc2_w 67464996320865
// 19: lxor
// 1a: lstore 9
// 1c: pop2
// 1d: ldc2_w 2647519096612819775
// 20: lload 1
// 21: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: astore 11
// 28: aload 11
// 2a: ifnonnull 86
// 2d: lload 3
// 2e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 31: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 34: ifnull 73
// 37: goto 44
// 3a: ldc2_w 2639135725822684203
// 3d: lload 1
// 3e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43: athrow
// 44: lload 1
// 45: lconst_0
// 46: lcmp
// 47: iflt c2
// 4a: lload 3
// 4b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4e: aload 11
// 50: ifnonnull b9
// 53: goto 60
// 56: ldc2_w 2639135725822684203
// 59: lload 1
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 63: ifnonnull 87
// 66: goto 73
// 69: ldc2_w 2639135725822684203
// 6c: lload 1
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: aload 0
// 74: lload 7
// 76: invokevirtual su/catlean/kl.d (J)V
// 79: goto 86
// 7c: ldc2_w 2639135725822684203
// 7f: lload 1
// 80: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85: athrow
// 86: return
// 87: new su/catlean/_w
// 8a: dup
// 8b: lload 9
// 8d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 90: invokevirtual net/minecraft/class_746.method_36454 ()F
// 93: lload 9
// 95: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 98: invokevirtual net/minecraft/class_746.method_36455 ()F
// 9b: lload 5
// 9d: dup2_x1
// 9e: pop2
// 9f: bipush 0
// a0: aconst_null
// a1: sipush 16807
// a4: ldc2_w 1878122989148213126
// a7: lload 1
// a8: lxor
// a9: invokedynamic j (IJ)I bsm=su/catlean/kl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: aconst_null
// af: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// b2: putstatic su/catlean/kl.F Lsu/catlean/_w;
// b5: lload 3
// b6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// b9: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// bc: getstatic net/minecraft/class_5498.field_26665 Lnet/minecraft/class_5498;
// bf: invokevirtual net/minecraft/class_315.method_31043 (Lnet/minecraft/class_5498;)V
// c2: return
}

@Override
public void b(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 64129331416845
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 29647348875563
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w 1438837659991188597
// 12: lload 1
// 13: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 7
// 1a: lload 3
// 1b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e: aload 7
// 20: ifnonnull 47
// 23: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 26: ifnull 5f
// 29: goto 36
// 2c: ldc2_w 1435012588456188769
// 2f: lload 1
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: lload 3
// 37: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3a: goto 47
// 3d: ldc2_w 1435012588456188769
// 40: lload 1
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: aload 7
// 49: ifnonnull 6e
// 4c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 4f: ifnonnull 6a
// 52: goto 5f
// 55: ldc2_w 1435012588456188769
// 58: lload 1
// 59: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: athrow
// 5f: return
// 60: ldc2_w 1435012588456188769
// 63: lload 1
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: lload 3
// 6b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 6e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 71: getstatic net/minecraft/class_5498.field_26664 Lnet/minecraft/class_5498;
// 74: invokevirtual net/minecraft/class_315.method_31043 (Lnet/minecraft/class_5498;)V
// 77: lload 5
// 79: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7c: getstatic su/catlean/kl.F Lsu/catlean/_w;
// 7f: invokevirtual su/catlean/_w.q ()F
// 82: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 85: lload 5
// 87: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8a: getstatic su/catlean/kl.F Lsu/catlean/_w;
// 8d: invokevirtual su/catlean/_w.N ()F
// 90: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 93: return
}

@Flow
private final void l(PlayerUpdateEvent var1) {
long var2 = a ^ 95425527779638L;
long var4 = var2 ^ 120617582454196L;
_8.P.O(var4, F, 0);
}

@Flow
private final void W(JumpEvent var1) {
var1.setYaw(F.q());
var1.cancel();
}

@Flow
public final void c(@NotNull EventPlayerTravel e) {
long var2 = a ^ 37242444341911L;
long var4 = var2 ^ 131844405595420L;
long var6 = var2 ^ 127219692462015L;
Intrinsics.checkNotNullParameter(ex, "e");
_g[] var10000 = vm.a<"Å">(964806575977642721L, var2);
X = new _w(zf.v(var6).method_36454(), var4, zf.v(var6).method_36455(), false, null, c<"j">(6955, 683471183657139413L ^ var2), null);
zf.v(var6).method_36456(F.q());
_g[] var8 = var10000;

try {
zf.v(var6).method_36457(F.N());
if (var8 != null) {
vm.a<"Å">(new _g[3], 1006546548994082762L, var2);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 972312541856531957L, var2);
}
}

@Flow
public final void B(@NotNull EventPostPlayerTravel e) {
long var2 = a ^ 83780635484491L;
long var4 = var2 ^ 33368561278051L;
Intrinsics.checkNotNullParameter(ex, "e");
vm.a<"Å">(1062783084144212285L, var2);
zf.v(var4).method_36456(X.q());

try {
zf.v(var4).method_36457(X.N());
if (vm.a<"Å">(1035180949016416460L, var2) != null) {
vm.a<"Å">(new _g[2], 1065790082999911392L, var2);
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 1054463499992434217L, var2);
}
}

@Flow
private final void F(UpdateCrosshairTarget param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kl.a J
// 003: ldc2_w 56698758167829
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 71877197909531
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 18393275300842
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 107729581457469
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: invokestatic net/minecraft/class_10209.method_64146 ()Lnet/minecraft/class_3695;
// 022: invokeinterface net/minecraft/class_3695.method_15407 ()V 1
// 027: ldc2_w -7862796534064667293
// 02a: lload 2
// 02b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 030: aload 1
// 031: invokevirtual su/catlean/api/event/events/player/UpdateCrosshairTarget.cancel ()V
// 034: astore 10
// 036: lload 4
// 038: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 03b: aload 10
// 03d: ifnonnull 065
// 040: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 043: ifnull 102
// 046: goto 053
// 049: ldc2_w -7855320821865604489
// 04c: lload 2
// 04d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: athrow
// 053: lload 4
// 055: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 058: goto 065
// 05b: ldc2_w -7855320821865604489
// 05e: lload 2
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: aload 10
// 067: ifnonnull 08f
// 06a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 06d: ifnull 102
// 070: goto 07d
// 073: ldc2_w -7855320821865604489
// 076: lload 2
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: lload 4
// 07f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 082: goto 08f
// 085: ldc2_w -7855320821865604489
// 088: lload 2
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 092: ifnull 102
// 095: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 098: lload 8
// 09a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09d: invokevirtual net/minecraft/class_746.method_55754 ()D
// 0a0: lload 8
// 0a2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a5: invokevirtual net/minecraft/class_746.method_55755 ()D
// 0a8: getstatic su/catlean/kl.F Lsu/catlean/_w;
// 0ab: invokevirtual su/catlean/_w.q ()F
// 0ae: getstatic su/catlean/kl.F Lsu/catlean/_w;
// 0b1: invokevirtual su/catlean/_w.N ()F
// 0b4: lload 6
// 0b6: dup2_x1
// 0b7: pop2
// 0b8: invokevirtual su/catlean/dm.l (DDFJF)Lnet/minecraft/class_239;
// 0bb: astore 11
// 0bd: lload 4
// 0bf: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c2: aload 11
// 0c4: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 0c7: lload 4
// 0c9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0cc: aload 11
// 0ce: aload 10
// 0d0: ifnonnull 0f5
// 0d3: instanceof net/minecraft/class_3966
// 0d6: ifeq 0fe
// 0d9: goto 0e6
// 0dc: ldc2_w -7855320821865604489
// 0df: lload 2
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: aload 11
// 0e8: goto 0f5
// 0eb: ldc2_w -7855320821865604489
// 0ee: lload 2
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: checkcast net/minecraft/class_3966
// 0f8: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 0fb: goto 0ff
// 0fe: aconst_null
// 0ff: putfield net/minecraft/class_310.field_1692 Lnet/minecraft/class_1297;
// 102: return
}

static {
long var20 = a ^ 110466170160225L;
long var22 = var20 ^ 65369075748722L;
long var24 = var20 ^ 55257648950250L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[2];
int var16 = 0;
String var15 = "%\u009c÷Èa\u0080âê2\u0003ßâ¢¢J\u009b\u009eZ\\upP0\u0005\u0010]ø´\u0097¶$¯\u001a0ÞÅTï2ê\u007f";
int var17 = "%\u009c÷Èa\u0080âê2\u0003ßâ¢¢J\u009b\u009eZ\\upP0\u0005\u0010]ø´\u0097¶$¯\u001a0ÞÅTï2ê\u007f".length();
char var14 = 24;
int var13 = -1;

while (true) {
byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
String var31 = b(var19).intern();
int var10001 = -1;
var18[var16++] = var31;
if ((var13 += var14) >= var17) {
b = var18;
c = new String[2];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "éÝ¬\u0086÷>0pM\u0011\u000bE\u001cgäÄ";
int var5 = "éÝ¬\u0086÷>0pM\u0011\u000bE\u001cgäÄ".length();
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
byte var35 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
x = new kl(var22);
F = new _w(0.0F, var24, 0.0F, false, null, c<"j">(6955, 683536431698024995L ^ var20), null);
X = new _w(0.0F, var24, 0.0F, false, null, c<"j">(6955, 683536431698024995L ^ var20), null);
return;
}

var14 = var15.charAt(var13);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 121;
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
throw new RuntimeException("su/catlean/kl", var10);
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
throw new RuntimeException("su/catlean/kl" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27439;
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
throw new RuntimeException("su/catlean/kl", var14);
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
throw new RuntimeException("su/catlean/kl" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
