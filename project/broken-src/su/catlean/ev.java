package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2846.class_2847;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.AttackBlockEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.world.BlockStateEvent;
import su.catlean.gofra.Flow;

public final class ev extends _g {
@NotNull
public static final ev N;
static final KProperty[] B;
@NotNull
private static final cw g;
@NotNull
private static final cw Y;
@NotNull
private static final az O;
@NotNull
private static final c8 V;
@NotNull
private static final ct f;
@NotNull
private static final c8 o;
@NotNull
private static final cq E;
@NotNull
private static final cq n;
@NotNull
private static final cq d;
@NotNull
private static final cq J;
@Nullable
private static class_2248 D;
@Nullable
private static s P;
@NotNull
private static final bg k;
private static boolean y;
private static String A;
private static final long a = yz.a(-2066120293456293034L, 8718585026777844002L, MethodHandles.lookup().lookupClass()).a(273418987614513L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map j;

private ev(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 131259284696760L;
super(b<"g">(16125, 5297045482333773140L ^ var1), jt.y(), null, 4, null, var3);
}

private final xb q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 97131319556012L;
return (xb)g.E(this, var3, B[0]);
}

private final bm H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 93237146143842L;
return (bm)Y.E(this, var3, B[1]);
}

private final dg z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 82544446800284L;
return (dg)O.E(this, var3, B[2]);
}

private final void l(dg var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 88928594338034L;
O.b(this, var4, B[2], var1);
}

private final int v(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 95299466923670L;
return ((Number)V.E(this, var6, B[3])).intValue();
}

private final float L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 62718082240298L;
return ((Number)f.E(this, var3, B[4])).floatValue();
}

private final int A(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 110110949308014L;
return ((Number)o.E(this, var3, B[5])).intValue();
}

private final boolean D(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 58288897276899L;
return (Boolean)E.E(this, var3, B[c<"x">(19948, 5348176193436807633L ^ var1)]);
}

private final boolean e(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 87536554836247L;
return (Boolean)n.E(this, var6, B[c<"x">(30074, 877079687738094523L ^ var4)]);
}

private final boolean C(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 22781168132184L;
return (Boolean)d.E(this, var3, B[c<"x">(30511, 122709185846726828L ^ var1)]);
}

private final boolean G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 101719887150792L;
return (Boolean)J.E(this, var3, B[c<"x">(29485, 2742636483439692348L ^ var1)]);
}

@Flow
public final void T(@NotNull AttackBlockEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ev.a J
// 03: ldc2_w 105467127687044
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 114708971652453
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 78599537810476
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -1617876059146723371
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: aload 1
// 22: ldc "e"
// 24: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 27: astore 8
// 29: lload 4
// 2b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2e: aload 1
// 2f: invokevirtual su/catlean/api/event/events/player/AttackBlockEvent.getPos ()Lnet/minecraft/class_2338;
// 32: aload 8
// 34: ifnonnull 5e
// 37: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 3a: ifeq 55
// 3d: goto 4a
// 40: ldc2_w -1589105454769469823
// 43: lload 2
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: return
// 4b: ldc2_w -1589105454769469823
// 4e: lload 2
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: lload 4
// 57: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 5a: aload 1
// 5b: invokevirtual su/catlean/api/event/events/player/AttackBlockEvent.getPos ()Lnet/minecraft/class_2338;
// 5e: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 61: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 64: dup
// 65: sipush 32038
// 68: ldc2_w 5605516745057519680
// 6b: lload 2
// 6c: lxor
// 6d: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 75: astore 9
// 77: aload 0
// 78: lload 6
// 7a: invokespecial su/catlean/ev.q (J)Lsu/catlean/xb;
// 7d: getstatic su/catlean/xb.Select Lsu/catlean/xb;
// 80: if_acmpne bf
// 83: getstatic su/catlean/ev.D Lnet/minecraft/class_2248;
// 86: aload 8
// 88: ifnonnull bc
// 8b: goto 98
// 8e: ldc2_w -1589105454769469823
// 91: lload 2
// 92: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: athrow
// 98: aload 9
// 9a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9d: ifne bf
// a0: goto ad
// a3: ldc2_w -1589105454769469823
// a6: lload 2
// a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac: athrow
// ad: aload 9
// af: goto bc
// b2: ldc2_w -1589105454769469823
// b5: lload 2
// b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bb: athrow
// bc: putstatic su/catlean/ev.D Lnet/minecraft/class_2248;
// bf: return
}

@Flow
public final void n(@NotNull BlockStateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ev.a J
// 03: ldc2_w 96168932459064
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 3365283311204
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 110198616651137
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 5489939447293409897
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: aload 1
// 22: ldc "e"
// 24: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 27: astore 8
// 29: aload 8
// 2b: ifnonnull 53
// 2e: getstatic su/catlean/ev.P Lsu/catlean/s;
// 31: dup
// 32: ifnull 52
// 35: goto 42
// 38: ldc2_w 5498426335522202429
// 3b: lload 2
// 3c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: athrow
// 42: invokevirtual su/catlean/s.E ()Lnet/minecraft/class_2338;
// 45: goto 54
// 48: ldc2_w 5498426335522202429
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: pop
// 53: aconst_null
// 54: aload 1
// 55: invokevirtual su/catlean/api/event/events/world/BlockStateEvent.getPos ()Lnet/minecraft/class_2338;
// 58: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5b: ifeq f0
// 5e: aload 1
// 5f: invokevirtual su/catlean/api/event/events/world/BlockStateEvent.getState ()Lnet/minecraft/class_2680;
// 62: aload 8
// 64: ifnonnull 99
// 67: goto 74
// 6a: ldc2_w 5498426335522202429
// 6d: lload 2
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: ifnull f0
// 77: goto 84
// 7a: ldc2_w 5498426335522202429
// 7d: lload 2
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: aload 1
// 85: invokevirtual su/catlean/api/event/events/world/BlockStateEvent.getState ()Lnet/minecraft/class_2680;
// 88: dup
// 89: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 8c: goto 99
// 8f: ldc2_w 5498426335522202429
// 92: lload 2
// 93: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98: athrow
// 99: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 9c: aload 8
// 9e: ifnonnull d6
// a1: ifeq f0
// a4: goto b1
// a7: ldc2_w 5498426335522202429
// aa: lload 2
// ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b0: athrow
// b1: aload 0
// b2: aload 8
// b4: ifnonnull eb
// b7: goto c4
// ba: ldc2_w 5498426335522202429
// bd: lload 2
// be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c3: athrow
// c4: lload 4
// c6: invokespecial su/catlean/ev.C (J)Z
// c9: goto d6
// cc: ldc2_w 5498426335522202429
// cf: lload 2
// d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d5: athrow
// d6: ifne f0
// d9: aconst_null
// da: putstatic su/catlean/ev.P Lsu/catlean/s;
// dd: aload 0
// de: goto eb
// e1: ldc2_w 5498426335522202429
// e4: lload 2
// e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ea: athrow
// eb: lload 6
// ed: invokespecial su/catlean/ev.V (J)V
// f0: return
}

@Flow
public final void C(@Nullable PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ev.a J
// 003: ldc2_w 69853520208910
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 46740870100590
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 115905165916233
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 8
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 46059606271644
// 02a: lxor
// 02b: dup2
// 02c: bipush 48
// 02e: lushr
// 02f: l2i
// 030: istore 9
// 032: dup2
// 033: bipush 16
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 10
// 03c: dup2
// 03d: bipush 32
// 03f: lshl
// 040: bipush 32
// 042: lushr
// 043: l2i
// 044: istore 11
// 046: pop2
// 047: dup2
// 048: ldc2_w 77249376462624
// 04b: lxor
// 04c: lstore 12
// 04e: dup2
// 04f: ldc2_w 5357838494619
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 118681015732306
// 059: lxor
// 05a: lstore 16
// 05c: dup2
// 05d: ldc2_w 53693632637213
// 060: lxor
// 061: dup2
// 062: bipush 32
// 064: lushr
// 065: l2i
// 066: istore 18
// 068: dup2
// 069: bipush 32
// 06b: lshl
// 06c: bipush 48
// 06e: lushr
// 06f: l2i
// 070: istore 19
// 072: dup2
// 073: bipush 48
// 075: lshl
// 076: bipush 48
// 078: lushr
// 079: l2i
// 07a: istore 20
// 07c: pop2
// 07d: dup2
// 07e: ldc2_w 87115857419311
// 081: lxor
// 082: dup2
// 083: bipush 32
// 085: lushr
// 086: l2i
// 087: istore 21
// 089: dup2
// 08a: bipush 32
// 08c: lshl
// 08d: bipush 32
// 08f: lushr
// 090: l2i
// 091: istore 22
// 093: pop2
// 094: dup2
// 095: ldc2_w 14046760440759
// 098: lxor
// 099: lstore 23
// 09b: dup2
// 09c: ldc2_w 116671304459766
// 09f: lxor
// 0a0: lstore 25
// 0a2: dup2
// 0a3: ldc2_w 40679157289888
// 0a6: lxor
// 0a7: lstore 27
// 0a9: dup2
// 0aa: ldc2_w 30157123559012
// 0ad: lxor
// 0ae: lstore 29
// 0b0: dup2
// 0b1: ldc2_w 9003114317551
// 0b4: lxor
// 0b5: lstore 31
// 0b7: dup2
// 0b8: ldc2_w 136723841910616
// 0bb: lxor
// 0bc: lstore 33
// 0be: dup2
// 0bf: ldc2_w 11163647834184
// 0c2: lxor
// 0c3: lstore 35
// 0c5: dup2
// 0c6: ldc2_w 39355676268226
// 0c9: lxor
// 0ca: lstore 37
// 0cc: dup2
// 0cd: ldc2_w 15921228196587
// 0d0: lxor
// 0d1: lstore 39
// 0d3: dup2
// 0d4: ldc2_w 92072236059221
// 0d7: lxor
// 0d8: dup2
// 0d9: bipush 48
// 0db: lushr
// 0dc: l2i
// 0dd: istore 41
// 0df: dup2
// 0e0: bipush 16
// 0e2: lshl
// 0e3: bipush 48
// 0e5: lushr
// 0e6: l2i
// 0e7: istore 42
// 0e9: dup2
// 0ea: bipush 32
// 0ec: lshl
// 0ed: bipush 32
// 0ef: lushr
// 0f0: l2i
// 0f1: istore 43
// 0f3: pop2
// 0f4: dup2
// 0f5: ldc2_w 120488905433640
// 0f8: lxor
// 0f9: lstore 44
// 0fb: dup2
// 0fc: ldc2_w 46421192025360
// 0ff: lxor
// 100: dup2
// 101: bipush 48
// 103: lushr
// 104: l2i
// 105: istore 46
// 107: dup2
// 108: bipush 16
// 10a: lshl
// 10b: bipush 48
// 10d: lushr
// 10e: l2i
// 10f: istore 47
// 111: dup2
// 112: bipush 32
// 114: lshl
// 115: bipush 32
// 117: lushr
// 118: l2i
// 119: istore 48
// 11b: pop2
// 11c: dup2
// 11d: ldc2_w 102002570773531
// 120: lxor
// 121: lstore 49
// 123: dup2
// 124: ldc2_w 43016537218982
// 127: lxor
// 128: lstore 51
// 12a: dup2
// 12b: ldc2_w 3946852375695
// 12e: lxor
// 12f: lstore 53
// 131: pop2
// 132: ldc2_w -6195187098797007777
// 135: lload 2
// 136: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: aload 0
// 13c: lload 23
// 13e: invokespecial su/catlean/ev.V (J)V
// 141: astore 56
// 143: getstatic su/catlean/ev.P Lsu/catlean/s;
// 146: ifnull 252
// 149: lload 31
// 14b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 14e: getstatic su/catlean/ev.P Lsu/catlean/s;
// 151: dup
// 152: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 155: invokevirtual su/catlean/s.E ()Lnet/minecraft/class_2338;
// 158: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 15b: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 15e: dup
// 15f: sipush 27074
// 162: ldc2_w 4225516280094170894
// 165: lload 2
// 166: lxor
// 167: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 16f: astore 57
// 171: aload 57
// 173: getstatic su/catlean/ev.D Lnet/minecraft/class_2248;
// 176: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 179: aload 56
// 17b: ifnonnull 1fc
// 17e: ifne 1b9
// 181: goto 18e
// 184: ldc2_w -6163108599725243125
// 187: lload 2
// 188: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18d: athrow
// 18e: aload 0
// 18f: aload 56
// 191: ifnonnull 24d
// 194: goto 1a1
// 197: ldc2_w -6163108599725243125
// 19a: lload 2
// 19b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: athrow
// 1a1: lload 51
// 1a3: invokespecial su/catlean/ev.q (J)Lsu/catlean/xb;
// 1a6: getstatic su/catlean/xb.Select Lsu/catlean/xb;
// 1a9: if_acmpeq 23b
// 1ac: goto 1b9
// 1af: ldc2_w -6163108599725243125
// 1b2: lload 2
// 1b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: athrow
// 1b9: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1bc: getstatic su/catlean/ev.P Lsu/catlean/s;
// 1bf: dup
// 1c0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1c3: invokevirtual su/catlean/s.E ()Lnet/minecraft/class_2338;
// 1c6: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 1c9: dup
// 1ca: sipush 21114
// 1cd: ldc2_w 8883802843343201422
// 1d0: lload 2
// 1d1: lxor
// 1d2: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1da: lload 33
// 1dc: dup2_x1
// 1dd: pop2
// 1de: invokevirtual su/catlean/dm.R (JLnet/minecraft/class_243;)F
// 1e1: aload 0
// 1e2: lload 12
// 1e4: invokespecial su/catlean/ev.L (J)F
// 1e7: aload 0
// 1e8: lload 12
// 1ea: invokespecial su/catlean/ev.L (J)F
// 1ed: fmul
// 1ee: fcmpl
// 1ef: goto 1fc
// 1f2: ldc2_w -6163108599725243125
// 1f5: lload 2
// 1f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: athrow
// 1fc: aload 56
// 1fe: ifnonnull 226
// 201: ifgt 23b
// 204: goto 211
// 207: ldc2_w -6163108599725243125
// 20a: lload 2
// 20b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: athrow
// 211: aload 57
// 213: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 216: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 219: goto 226
// 21c: ldc2_w -6163108599725243125
// 21f: lload 2
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: aload 56
// 228: ifnonnull 260
// 22b: ifeq 252
// 22e: goto 23b
// 231: ldc2_w -6163108599725243125
// 234: lload 2
// 235: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23a: athrow
// 23b: aconst_null
// 23c: putstatic su/catlean/ev.P Lsu/catlean/s;
// 23f: aload 0
// 240: goto 24d
// 243: ldc2_w -6163108599725243125
// 246: lload 2
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: lload 23
// 24f: invokespecial su/catlean/ev.V (J)V
// 252: lload 4
// 254: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 257: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 25a: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
// 25d: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 260: ifne 288
// 263: getstatic su/catlean/ev.P Lsu/catlean/s;
// 266: aload 56
// 268: ifnonnull 290
// 26b: goto 278
// 26e: ldc2_w -6163108599725243125
// 271: lload 2
// 272: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: athrow
// 278: ifnonnull 289
// 27b: goto 288
// 27e: ldc2_w -6163108599725243125
// 281: lload 2
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: return
// 289: getstatic su/catlean/ev.P Lsu/catlean/s;
// 28c: dup
// 28d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 290: invokevirtual su/catlean/s.C ()Lnet/minecraft/class_243;
// 293: astore 57
// 295: aload 0
// 296: lload 16
// 298: invokespecial su/catlean/ev.C (J)Z
// 29b: aload 56
// 29d: ifnonnull 405
// 2a0: ifne 3ff
// 2a3: goto 2b0
// 2a6: ldc2_w -6163108599725243125
// 2a9: lload 2
// 2aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2af: athrow
// 2b0: aload 57
// 2b2: getfield net/minecraft/class_243.field_1350 D
// 2b5: lload 35
// 2b7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2ba: invokevirtual net/minecraft/class_746.method_23321 ()D
// 2bd: dsub
// 2be: aload 57
// 2c0: getfield net/minecraft/class_243.field_1352 D
// 2c3: lload 35
// 2c5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c8: invokevirtual net/minecraft/class_746.method_23317 ()D
// 2cb: dsub
// 2cc: invokestatic java/lang/Math.atan2 (DD)D
// 2cf: invokestatic java/lang/Math.toDegrees (D)D
// 2d2: ldc 90.0
// 2d4: f2d
// 2d5: dsub
// 2d6: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2d9: lload 14
// 2db: invokevirtual su/catlean/dm.U (J)F
// 2de: f2d
// 2df: dsub
// 2e0: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 2e3: dstore 58
// 2e5: nop
// 2e6: aload 57
// 2e8: getfield net/minecraft/class_243.field_1351 D
// 2eb: lload 35
// 2ed: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2f0: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 2f3: getfield net/minecraft/class_243.field_1351 D
// 2f6: dsub
// 2f7: aload 57
// 2f9: getfield net/minecraft/class_243.field_1352 D
// 2fc: lload 35
// 2fe: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 301: invokevirtual net/minecraft/class_746.method_23317 ()D
// 304: dsub
// 305: ldc2_w 2.0
// 308: invokestatic java/lang/Math.pow (DD)D
// 30b: aload 57
// 30d: getfield net/minecraft/class_243.field_1350 D
// 310: lload 35
// 312: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 315: invokevirtual net/minecraft/class_746.method_23321 ()D
// 318: dsub
// 319: ldc2_w 2.0
// 31c: invokestatic java/lang/Math.pow (DD)D
// 31f: dadd
// 320: invokestatic java/lang/Math.sqrt (D)D
// 323: invokestatic java/lang/Math.atan2 (DD)D
// 326: invokestatic java/lang/Math.toDegrees (D)D
// 329: dneg
// 32a: d2f
// 32b: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 32e: lload 25
// 330: invokevirtual su/catlean/dm.w (J)F
// 333: fsub
// 334: fstore 60
// 336: dload 58
// 338: d2f
// 339: invokestatic net/minecraft/class_3532.method_15379 (F)F
// 33c: aload 0
// 33d: lload 29
// 33f: invokespecial su/catlean/ev.A (J)I
// 342: i2f
// 343: fneg
// 344: aload 0
// 345: lload 29
// 347: invokespecial su/catlean/ev.A (J)I
// 34a: i2f
// 34b: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
// 34e: fstore 61
// 350: fload 60
// 352: aload 0
// 353: lload 29
// 355: invokespecial su/catlean/ev.A (J)I
// 358: i2f
// 359: fneg
// 35a: aload 0
// 35b: lload 29
// 35d: invokespecial su/catlean/ev.A (J)I
// 360: i2f
// 361: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
// 364: fstore 62
// 366: dload 58
// 368: d2f
// 369: invokestatic net/minecraft/class_3532.method_15379 (F)F
// 36c: aload 0
// 36d: lload 29
// 36f: invokespecial su/catlean/ev.A (J)I
// 372: i2f
// 373: fcmpg
// 374: aload 56
// 376: ifnonnull 38a
// 379: ifgt 38d
// 37c: goto 389
// 37f: ldc2_w -6163108599725243125
// 382: lload 2
// 383: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 388: athrow
// 389: bipush 1
// 38a: goto 38e
// 38d: bipush 0
// 38e: putstatic su/catlean/ev.y Z
// 391: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 394: lload 14
// 396: invokevirtual su/catlean/dm.U (J)F
// 399: dload 58
// 39b: dconst_0
// 39c: dcmpl
// 39d: ifle 3af
// 3a0: fload 61
// 3a2: goto 3b2
// 3a5: ldc2_w -6163108599725243125
// 3a8: lload 2
// 3a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ae: athrow
// 3af: fload 61
// 3b1: fneg
// 3b2: fadd
// 3b3: fstore 63
// 3b5: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 3b8: lload 25
// 3ba: invokevirtual su/catlean/dm.w (J)F
// 3bd: fload 62
// 3bf: fadd
// 3c0: ldc -90.0
// 3c2: ldc 90.0
// 3c4: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
// 3c7: fstore 64
// 3c9: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 3cc: new su/catlean/t5
// 3cf: dup
// 3d0: new su/catlean/_w
// 3d3: dup
// 3d4: fload 63
// 3d6: lload 39
// 3d8: fload 64
// 3da: bipush 0
// 3db: aconst_null
// 3dc: sipush 27491
// 3df: ldc2_w 7421543594067331994
// 3e2: lload 2
// 3e3: lxor
// 3e4: invokedynamic x (IJ)I bsm=su/catlean/ev.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e9: aconst_null
// 3ea: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 3ed: lload 53
// 3ef: bipush 0
// 3f0: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/ev.Z ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 3f5: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// 3f8: lload 27
// 3fa: dup2_x1
// 3fb: pop2
// 3fc: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 3ff: aload 0
// 400: lload 16
// 402: invokespecial su/catlean/ev.C (J)Z
// 405: aload 56
// 407: ifnonnull 741
// 40a: ifeq 73b
// 40d: goto 41a
// 410: ldc2_w -6163108599725243125
// 413: lload 2
// 414: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 419: athrow
// 41a: getstatic su/catlean/ev.k Lsu/catlean/bg;
// 41d: aload 0
// 41e: iload 9
// 420: i2c
// 421: iload 10
// 423: i2c
// 424: iload 11
// 426: invokespecial su/catlean/ev.v (CCI)I
// 429: lload 44
// 42b: invokevirtual su/catlean/bg.q (IJ)Z
// 42e: aload 56
// 430: ifnonnull 741
// 433: goto 440
// 436: ldc2_w -6163108599725243125
// 439: lload 2
// 43a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43f: athrow
// 440: ifeq 73b
// 443: goto 450
// 446: ldc2_w -6163108599725243125
// 449: lload 2
// 44a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44f: athrow
// 450: aload 0
// 451: lload 12
// 453: invokespecial su/catlean/ev.L (J)F
// 456: f2d
// 457: invokestatic java/lang/Math.floor (D)D
// 45a: d2f
// 45b: bipush 1
// 45c: i2f
// 45d: fadd
// 45e: f2i
// 45f: istore 58
// 461: new java/util/ArrayList
// 464: dup
// 465: invokespecial java/util/ArrayList.<init> ()V
// 468: checkcast java/util/List
// 46b: astore 59
// 46d: aload 0
// 46e: lload 35
// 470: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 473: iload 6
// 475: i2b
// 476: swap
// 477: lload 7
// 479: dup2_x1
// 47a: pop2
// 47b: checkcast net/minecraft/class_1297
// 47e: invokevirtual su/catlean/ev.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 481: checkcast net/minecraft/class_2374
// 484: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 487: dup
// 488: sipush 15118
// 48b: ldc2_w 3242614467670429182
// 48e: lload 2
// 48f: lxor
// 490: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 495: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 498: astore 60
// 49a: iload 58
// 49c: ineg
// 49d: istore 61
// 49f: iload 61
// 4a1: aload 56
// 4a3: ifnonnull 4c8
// 4a6: iload 58
// 4a8: if_icmpgt 590
// 4ab: goto 4b8
// 4ae: ldc2_w -6163108599725243125
// 4b1: lload 2
// 4b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b7: athrow
// 4b8: iload 58
// 4ba: ineg
// 4bb: goto 4c8
// 4be: ldc2_w -6163108599725243125
// 4c1: lload 2
// 4c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c7: athrow
// 4c8: istore 62
// 4ca: iload 62
// 4cc: iload 58
// 4ce: if_icmpgt 574
// 4d1: iload 58
// 4d3: ineg
// 4d4: istore 63
// 4d6: iload 63
// 4d8: iload 58
// 4da: aload 56
// 4dc: ifnonnull 578
// 4df: if_icmpgt 546
// 4e2: aload 59
// 4e4: aload 60
// 4e6: iload 61
// 4e8: iload 62
// 4ea: iload 63
// 4ec: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
// 4ef: dup
// 4f0: sipush 11567
// 4f3: ldc2_w 765222134475217869
// 4f6: lload 2
// 4f7: lxor
// 4f8: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 500: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 505: pop
// 506: iload 63
// 508: iload 58
// 50a: aload 56
// 50c: ifnonnull 54a
// 50f: goto 51c
// 512: ldc2_w -6163108599725243125
// 515: lload 2
// 516: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51b: athrow
// 51c: if_icmpeq 546
// 51f: iinc 63 1
// 522: aload 56
// 524: ifnonnull 574
// 527: goto 534
// 52a: ldc2_w -6163108599725243125
// 52d: lload 2
// 52e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 533: athrow
// 534: aload 56
// 536: ifnull 4e2
// 539: goto 546
// 53c: ldc2_w -6163108599725243125
// 53f: lload 2
// 540: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 545: athrow
// 546: iload 62
// 548: iload 58
// 54a: aload 56
// 54c: ifnonnull 578
// 54f: if_icmpeq 574
// 552: goto 55f
// 555: ldc2_w -6163108599725243125
// 558: lload 2
// 559: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55e: athrow
// 55f: iinc 62 1
// 562: aload 56
// 564: ifnull 4d1
// 567: goto 574
// 56a: ldc2_w -6163108599725243125
// 56d: lload 2
// 56e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 573: athrow
// 574: iload 61
// 576: iload 58
// 578: if_icmpeq 590
// 57b: iinc 61 1
// 57e: aload 56
// 580: ifnull 4b8
// 583: goto 590
// 586: ldc2_w -6163108599725243125
// 589: lload 2
// 58a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58f: athrow
// 590: aload 59
// 592: checkcast java/lang/Iterable
// 595: astore 62
// 597: bipush 0
// 598: istore 63
// 59a: aload 62
// 59c: new su/catlean/de
// 59f: dup
// 5a0: invokespecial su/catlean/de.<init> ()V
// 5a3: checkcast java/util/Comparator
// 5a6: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 5a9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 5ae: astore 61
// 5b0: aload 61
// 5b2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5b7: ifeq 73b
// 5ba: aload 61
// 5bc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5c1: checkcast net/minecraft/class_2338
// 5c4: astore 62
// 5c6: aload 0
// 5c7: iload 18
// 5c9: iload 19
// 5cb: i2c
// 5cc: iload 20
// 5ce: invokespecial su/catlean/ev.e (ICI)Z
// 5d1: aload 56
// 5d3: ifnonnull 741
// 5d6: aload 56
// 5d8: ifnonnull 62f
// 5db: goto 5e8
// 5de: ldc2_w -6163108599725243125
// 5e1: lload 2
// 5e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e7: athrow
// 5e8: ifeq 629
// 5eb: goto 5f8
// 5ee: ldc2_w -6163108599725243125
// 5f1: lload 2
// 5f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f7: athrow
// 5f8: aload 62
// 5fa: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 5fd: i2d
// 5fe: lload 35
// 600: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 603: invokevirtual net/minecraft/class_746.method_23318 ()D
// 606: dcmpg
// 607: aload 56
// 609: ifnonnull 62f
// 60c: goto 619
// 60f: ldc2_w -6163108599725243125
// 612: lload 2
// 613: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 618: athrow
// 619: iflt 5b0
// 61c: goto 629
// 61f: ldc2_w -6163108599725243125
// 622: lload 2
// 623: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 628: athrow
// 629: aload 0
// 62a: lload 37
// 62c: invokespecial su/catlean/ev.G (J)Z
// 62f: aload 56
// 631: ifnonnull 65b
// 634: ifeq 663
// 637: goto 644
// 63a: ldc2_w -6163108599725243125
// 63d: lload 2
// 63e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 643: athrow
// 644: aload 0
// 645: iload 21
// 647: iload 22
// 649: aload 62
// 64b: invokespecial su/catlean/ev.f (IILnet/minecraft/class_2338;)Z
// 64e: goto 65b
// 651: ldc2_w -6163108599725243125
// 654: lload 2
// 655: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65a: athrow
// 65b: aload 56
// 65d: ifnonnull 5b7
// 660: ifne 5b0
// 663: lload 31
// 665: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 668: aload 62
// 66a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 66d: dup
// 66e: sipush 32224
// 671: ldc2_w 9219466933801192202
// 674: lload 2
// 675: lxor
// 676: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 67e: astore 63
// 680: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 683: aload 62
// 685: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 688: dup
// 689: sipush 5142
// 68c: ldc2_w 5260511392260055783
// 68f: lload 2
// 690: lxor
// 691: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 696: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 699: lload 33
// 69b: dup2_x1
// 69c: pop2
// 69d: invokevirtual su/catlean/dm.R (JLnet/minecraft/class_243;)F
// 6a0: aload 0
// 6a1: lload 12
// 6a3: invokespecial su/catlean/ev.L (J)F
// 6a6: aload 0
// 6a7: lload 12
// 6a9: invokespecial su/catlean/ev.L (J)F
// 6ac: fmul
// 6ad: fcmpg
// 6ae: aload 56
// 6b0: ifnonnull 6e9
// 6b3: ifgt 5b0
// 6b6: goto 6c3
// 6b9: ldc2_w -6163108599725243125
// 6bc: lload 2
// 6bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c2: athrow
// 6c3: aload 0
// 6c4: aload 63
// 6c6: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 6c9: dup
// 6ca: sipush 32038
// 6cd: ldc2_w 5605481407939087306
// 6d0: lload 2
// 6d1: lxor
// 6d2: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6da: astore 55
// 6dc: iload 41
// 6de: i2s
// 6df: iload 42
// 6e1: i2c
// 6e2: aload 55
// 6e4: iload 43
// 6e6: invokespecial su/catlean/ev.L (SCLnet/minecraft/class_2248;I)Z
// 6e9: aload 56
// 6eb: ifnonnull 72a
// 6ee: ifeq 5b0
// 6f1: goto 6fe
// 6f4: ldc2_w -6163108599725243125
// 6f7: lload 2
// 6f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fd: athrow
// 6fe: aload 62
// 700: invokedynamic predict (Lnet/minecraft/class_2338;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/ev.H (Lnet/minecraft/class_2338;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 705: lload 49
// 707: dup2_x1
// 708: pop2
// 709: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 70c: aload 62
// 70e: invokedynamic predict (Lnet/minecraft/class_2338;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/ev.O (Lnet/minecraft/class_2338;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 713: lload 49
// 715: dup2_x1
// 716: pop2
// 717: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 71a: lload 31
// 71c: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 71f: aload 62
// 721: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 724: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 727: invokevirtual net/minecraft/class_638.method_8501 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)Z
// 72a: pop
// 72b: lload 35
// 72d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 730: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 733: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 736: aload 56
// 738: ifnull 5b0
// 73b: aload 0
// 73c: lload 16
// 73e: invokespecial su/catlean/ev.C (J)Z
// 741: aload 56
// 743: ifnonnull 759
// 746: ifne 7ab
// 749: goto 756
// 74c: ldc2_w -6163108599725243125
// 74f: lload 2
// 750: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 755: athrow
// 756: getstatic su/catlean/ev.y Z
// 759: aload 56
// 75b: ifnonnull 78f
// 75e: ifeq 7ab
// 761: goto 76e
// 764: ldc2_w -6163108599725243125
// 767: lload 2
// 768: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76d: athrow
// 76e: getstatic su/catlean/ev.k Lsu/catlean/bg;
// 771: aload 0
// 772: iload 9
// 774: i2c
// 775: iload 10
// 777: i2c
// 778: iload 11
// 77a: invokespecial su/catlean/ev.v (CCI)I
// 77d: lload 44
// 77f: invokevirtual su/catlean/bg.q (IJ)Z
// 782: goto 78f
// 785: ldc2_w -6163108599725243125
// 788: lload 2
// 789: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78e: athrow
// 78f: ifeq 7ab
// 792: aload 0
// 793: iload 46
// 795: i2c
// 796: iload 47
// 798: i2s
// 799: iload 48
// 79b: invokevirtual su/catlean/ev.x (CSI)V
// 79e: goto 7ab
// 7a1: ldc2_w -6163108599725243125
// 7a4: lload 2
// 7a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7aa: athrow
// 7ab: return
}

public final synchronized void x(char param1, short param2, int param3) {
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
// 017: getstatic su/catlean/ev.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 9216056351831
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 58656891741054
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 8
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 32
// 038: lushr
// 039: lstore 9
// 03b: pop2
// 03c: dup2
// 03d: ldc2_w 107746210465709
// 040: lxor
// 041: lstore 11
// 043: dup2
// 044: ldc2_w 11419623228159
// 047: lxor
// 048: dup2
// 049: bipush 8
// 04b: lushr
// 04c: lstore 13
// 04e: dup2
// 04f: bipush 56
// 051: lshl
// 052: bipush 56
// 054: lushr
// 055: l2i
// 056: istore 15
// 058: pop2
// 059: dup2
// 05a: ldc2_w 92368354495262
// 05d: lxor
// 05e: lstore 16
// 060: dup2
// 061: ldc2_w 83517187147567
// 064: lxor
// 065: lstore 18
// 067: dup2
// 068: ldc2_w 44823595045489
// 06b: lxor
// 06c: lstore 20
// 06e: pop2
// 06f: ldc2_w 17843747784603238
// 072: lload 4
// 074: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: astore 22
// 07b: getstatic su/catlean/ev.P Lsu/catlean/s;
// 07e: ifnull 0b7
// 081: lload 6
// 083: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 086: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 089: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
// 08c: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 08f: iload 1
// 090: iflt 0be
// 093: aload 22
// 095: ifnonnull 0be
// 098: goto 0a6
// 09b: ldc2_w 18330519411257138
// 09e: lload 4
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: ifeq 0b8
// 0a9: goto 0b7
// 0ac: ldc2_w 18330519411257138
// 0af: lload 4
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: return
// 0b8: aload 0
// 0b9: lload 18
// 0bb: invokevirtual su/catlean/ev.f (J)Z
// 0be: iload 3
// 0bf: iflt 158
// 0c2: ifeq 156
// 0c5: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0c8: aload 22
// 0ca: iload 1
// 0cb: iflt 10e
// 0ce: ifnonnull 10c
// 0d1: goto 0df
// 0d4: ldc2_w 18330519411257138
// 0d7: lload 4
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: lload 13
// 0e1: iload 15
// 0e3: i2b
// 0e4: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 0e7: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 0ea: if_acmpeq 156
// 0ed: goto 0fb
// 0f0: ldc2_w 18330519411257138
// 0f3: lload 4
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0fe: goto 10c
// 101: ldc2_w 18330519411257138
// 104: lload 4
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: aload 22
// 10e: ifnonnull 13c
// 111: lload 16
// 113: invokevirtual su/catlean/ex.l (J)Z
// 116: iload 2
// 117: iflt 158
// 11a: ifne 156
// 11d: goto 12b
// 120: ldc2_w 18330519411257138
// 123: lload 4
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 12e: goto 13c
// 131: ldc2_w 18330519411257138
// 134: lload 4
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: getstatic su/catlean/ev.P Lsu/catlean/s;
// 13f: dup
// 140: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 143: invokevirtual su/catlean/s.E ()Lnet/minecraft/class_2338;
// 146: getstatic su/catlean/ev.P Lsu/catlean/s;
// 149: dup
// 14a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 14d: invokevirtual su/catlean/s.B ()Lnet/minecraft/class_2350;
// 150: lload 11
// 152: invokevirtual su/catlean/ex.k (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;J)V
// 155: return
// 156: iload 8
// 158: lload 9
// 15a: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 15d: aload 22
// 15f: ifnonnull 1ac
// 162: invokevirtual net/minecraft/class_636.method_2920 ()Lnet/minecraft/class_1934;
// 165: getstatic net/minecraft/class_1934.field_9220 Lnet/minecraft/class_1934;
// 168: if_acmpne 1a5
// 16b: goto 179
// 16e: ldc2_w 18330519411257138
// 171: lload 4
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: iload 8
// 17b: lload 9
// 17d: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 180: getstatic su/catlean/ev.P Lsu/catlean/s;
// 183: dup
// 184: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 187: invokevirtual su/catlean/s.E ()Lnet/minecraft/class_2338;
// 18a: getstatic su/catlean/ev.P Lsu/catlean/s;
// 18d: dup
// 18e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 191: invokevirtual su/catlean/s.B ()Lnet/minecraft/class_2350;
// 194: invokevirtual net/minecraft/class_636.method_2910 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// 197: goto 1c3
// 19a: ldc2_w 18330519411257138
// 19d: lload 4
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: iload 8
// 1a7: lload 9
// 1a9: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 1ac: getstatic su/catlean/ev.P Lsu/catlean/s;
// 1af: dup
// 1b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1b3: invokevirtual su/catlean/s.E ()Lnet/minecraft/class_2338;
// 1b6: getstatic su/catlean/ev.P Lsu/catlean/s;
// 1b9: dup
// 1ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1bd: invokevirtual su/catlean/s.B ()Lnet/minecraft/class_2350;
// 1c0: invokevirtual net/minecraft/class_636.method_2902 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// 1c3: pop
// 1c4: lload 20
// 1c6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c9: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1cc: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 1cf: return
}

@Flow
public final void o(@NotNull Render3DEvent event) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ev.a J
// 003: ldc2_w 68856322851795
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 119478495402366
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 117541529776015
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 55050230263424
// 01b: lxor
// 01c: dup2
// 01d: bipush 48
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 16
// 026: lshl
// 027: bipush 32
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 138389132413234
// 03c: lxor
// 03d: lstore 11
// 03f: pop2
// 040: ldc2_w -8224901954561164414
// 043: lload 2
// 044: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 049: aload 1
// 04a: sipush 20310
// 04d: ldc2_w 7447234811771166278
// 050: lload 2
// 051: lxor
// 052: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 05a: aconst_null
// 05b: astore 19
// 05d: astore 18
// 05f: aload 0
// 060: lload 6
// 062: invokespecial su/catlean/ev.C (J)Z
// 065: ifne 0a6
// 068: getstatic su/catlean/ev.P Lsu/catlean/s;
// 06b: aload 18
// 06d: ifnonnull 0a1
// 070: goto 07d
// 073: ldc2_w -8240113465569516842
// 076: lload 2
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: ifnull 0a6
// 080: goto 08d
// 083: ldc2_w -8240113465569516842
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: getstatic su/catlean/ev.P Lsu/catlean/s;
// 090: dup
// 091: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 094: goto 0a1
// 097: ldc2_w -8240113465569516842
// 09a: lload 2
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: invokevirtual su/catlean/s.E ()Lnet/minecraft/class_2338;
// 0a4: astore 19
// 0a6: aload 19
// 0a8: ifnull 114
// 0ab: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0ae: new net/minecraft/class_238
// 0b1: dup
// 0b2: aload 19
// 0b4: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 0b7: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0ba: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0bd: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 0c0: iload 8
// 0c2: i2c
// 0c3: iload 9
// 0c5: fconst_1
// 0c6: iload 10
// 0c8: i2s
// 0c9: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 0cc: aconst_null
// 0cd: bipush 4
// 0ce: aconst_null
// 0cf: astore 13
// 0d1: istore 14
// 0d3: astore 15
// 0d5: astore 16
// 0d7: astore 17
// 0d9: lload 11
// 0db: aload 17
// 0dd: aload 16
// 0df: aload 15
// 0e1: iload 14
// 0e3: aload 13
// 0e5: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 0e8: pop
// 0e9: lload 4
// 0eb: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0ee: new net/minecraft/class_238
// 0f1: dup
// 0f2: aload 19
// 0f4: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 0f7: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0fa: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0fd: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 100: iload 8
// 102: i2c
// 103: iload 9
// 105: ldc 0.5
// 107: iload 10
// 109: i2s
// 10a: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 10d: aconst_null
// 10e: bipush 4
// 10f: aconst_null
// 110: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 113: pop
// 114: return
}

private final s n(short param1, short param2, int param3) {
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
// 017: getstatic su/catlean/ev.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 122684489826326
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
// 036: ldc2_w 71180341403519
// 039: lxor
// 03a: lstore 9
// 03c: dup2
// 03d: ldc2_w 59560303006018
// 040: lxor
// 041: dup2
// 042: bipush 32
// 044: lushr
// 045: l2i
// 046: istore 11
// 048: dup2
// 049: bipush 32
// 04b: lshl
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 12
// 052: dup2
// 053: bipush 48
// 055: lshl
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 13
// 05c: pop2
// 05d: dup2
// 05e: ldc2_w 81113929098352
// 061: lxor
// 062: dup2
// 063: bipush 32
// 065: lushr
// 066: l2i
// 067: istore 14
// 069: dup2
// 06a: bipush 32
// 06c: lshl
// 06d: bipush 32
// 06f: lushr
// 070: l2i
// 071: istore 15
// 073: pop2
// 074: dup2
// 075: ldc2_w 16281151225520
// 078: lxor
// 079: lstore 16
// 07b: dup2
// 07c: ldc2_w 134859613142791
// 07f: lxor
// 080: lstore 18
// 082: dup2
// 083: ldc2_w 14129604657175
// 086: lxor
// 087: lstore 20
// 089: dup2
// 08a: ldc2_w 123045916251465
// 08d: lxor
// 08e: lstore 22
// 090: dup2
// 091: ldc2_w 40912890162845
// 094: lxor
// 095: lstore 24
// 097: dup2
// 098: ldc2_w 93749736567306
// 09b: lxor
// 09c: dup2
// 09d: bipush 48
// 09f: lushr
// 0a0: l2i
// 0a1: istore 26
// 0a3: dup2
// 0a4: bipush 16
// 0a6: lshl
// 0a7: bipush 48
// 0a9: lushr
// 0aa: l2i
// 0ab: istore 27
// 0ad: dup2
// 0ae: bipush 32
// 0b0: lshl
// 0b1: bipush 32
// 0b3: lushr
// 0b4: l2i
// 0b5: istore 28
// 0b7: pop2
// 0b8: dup2
// 0b9: ldc2_w 120346137289782
// 0bc: lxor
// 0bd: lstore 29
// 0bf: dup2
// 0c0: ldc2_w 118232718853012
// 0c3: lxor
// 0c4: dup2
// 0c5: bipush 32
// 0c7: lushr
// 0c8: l2i
// 0c9: istore 31
// 0cb: dup2
// 0cc: bipush 32
// 0ce: lshl
// 0cf: bipush 48
// 0d1: lushr
// 0d2: l2i
// 0d3: istore 32
// 0d5: dup2
// 0d6: bipush 48
// 0d8: lshl
// 0d9: bipush 48
// 0db: lushr
// 0dc: l2i
// 0dd: istore 33
// 0df: pop2
// 0e0: dup2
// 0e1: ldc2_w 84341194599350
// 0e4: lxor
// 0e5: lstore 34
// 0e7: dup2
// 0e8: ldc2_w 97905136344323
// 0eb: lxor
// 0ec: lstore 36
// 0ee: pop2
// 0ef: aload 0
// 0f0: lload 9
// 0f2: invokespecial su/catlean/ev.L (J)F
// 0f5: f2d
// 0f6: invokestatic java/lang/Math.floor (D)D
// 0f9: d2f
// 0fa: bipush 1
// 0fb: i2f
// 0fc: fadd
// 0fd: f2i
// 0fe: istore 40
// 100: new java/util/ArrayList
// 103: dup
// 104: invokespecial java/util/ArrayList.<init> ()V
// 107: checkcast java/util/List
// 10a: astore 41
// 10c: ldc2_w -3289526761589742592
// 10f: lload 4
// 111: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: aload 0
// 117: lload 20
// 119: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 11c: iload 6
// 11e: i2b
// 11f: swap
// 120: lload 7
// 122: dup2_x1
// 123: pop2
// 124: checkcast net/minecraft/class_1297
// 127: invokevirtual su/catlean/ev.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 12a: checkcast net/minecraft/class_2374
// 12d: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 130: dup
// 131: sipush 31165
// 134: ldc2_w 9104098418849551
// 137: lload 4
// 139: lxor
// 13a: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 142: astore 42
// 144: astore 39
// 146: iload 40
// 148: ineg
// 149: istore 43
// 14b: iload 43
// 14d: aload 39
// 14f: ifnonnull 176
// 152: iload 40
// 154: if_icmpgt 259
// 157: goto 165
// 15a: ldc2_w -3303606246989709996
// 15d: lload 4
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: iload 40
// 167: ineg
// 168: goto 176
// 16b: ldc2_w -3303606246989709996
// 16e: lload 4
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: istore 44
// 178: iload 44
// 17a: iload 2
// 17b: ifle 186
// 17e: iload 40
// 180: if_icmpgt 238
// 183: iload 40
// 185: ineg
// 186: istore 45
// 188: iload 45
// 18a: iload 40
// 18c: aload 39
// 18e: ifnonnull 23c
// 191: if_icmpgt 200
// 194: aload 41
// 196: aload 42
// 198: iload 43
// 19a: iload 44
// 19c: iload 45
// 19e: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
// 1a1: dup
// 1a2: sipush 27050
// 1a5: ldc2_w 1203081064449074962
// 1a8: lload 4
// 1aa: lxor
// 1ab: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1b8: pop
// 1b9: iload 45
// 1bb: iload 40
// 1bd: aload 39
// 1bf: ifnonnull 204
// 1c2: goto 1d0
// 1c5: ldc2_w -3303606246989709996
// 1c8: lload 4
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: if_icmpeq 200
// 1d3: iinc 45 1
// 1d6: aload 39
// 1d8: ifnonnull 238
// 1db: goto 1e9
// 1de: ldc2_w -3303606246989709996
// 1e1: lload 4
// 1e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: athrow
// 1e9: aload 39
// 1eb: ifnull 194
// 1ee: iload 1
// 1ef: iflt 200
// 1f2: goto 200
// 1f5: ldc2_w -3303606246989709996
// 1f8: lload 4
// 1fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ff: athrow
// 200: iload 44
// 202: iload 40
// 204: iload 3
// 205: ifge 23c
// 208: aload 39
// 20a: ifnonnull 23c
// 20d: if_icmpeq 238
// 210: goto 21e
// 213: ldc2_w -3303606246989709996
// 216: lload 4
// 218: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: athrow
// 21e: iinc 44 1
// 221: aload 39
// 223: ifnull 183
// 226: iload 1
// 227: iflt 200
// 22a: goto 238
// 22d: ldc2_w -3303606246989709996
// 230: lload 4
// 232: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: athrow
// 238: iload 43
// 23a: iload 40
// 23c: if_icmpeq 259
// 23f: iinc 43 1
// 242: aload 39
// 244: ifnull 165
// 247: iload 3
// 248: ifgt 178
// 24b: goto 259
// 24e: ldc2_w -3303606246989709996
// 251: lload 4
// 253: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: athrow
// 259: aload 41
// 25b: checkcast java/lang/Iterable
// 25e: astore 44
// 260: bipush 0
// 261: istore 45
// 263: aload 44
// 265: new su/catlean/n4
// 268: dup
// 269: invokespecial su/catlean/n4.<init> ()V
// 26c: checkcast java/util/Comparator
// 26f: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 272: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 277: astore 43
// 279: aload 43
// 27b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 280: ifeq 5d8
// 283: aload 43
// 285: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 28a: checkcast net/minecraft/class_2338
// 28d: astore 44
// 28f: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 292: lload 22
// 294: invokevirtual su/catlean/ex.f (J)Z
// 297: aload 39
// 299: ifnonnull 2e2
// 29c: ifeq 2d7
// 29f: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 2a2: iload 31
// 2a4: iload 32
// 2a6: i2c
// 2a7: aload 44
// 2a9: iload 33
// 2ab: i2s
// 2ac: invokevirtual su/catlean/ex.Z (ICLnet/minecraft/class_2338;S)Z
// 2af: aload 39
// 2b1: iload 1
// 2b2: iflt 2e4
// 2b5: ifnonnull 2e2
// 2b8: goto 2c6
// 2bb: ldc2_w -3303606246989709996
// 2be: lload 4
// 2c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: athrow
// 2c6: ifne 279
// 2c9: goto 2d7
// 2cc: ldc2_w -3303606246989709996
// 2cf: lload 4
// 2d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d6: athrow
// 2d7: aload 0
// 2d8: iload 11
// 2da: iload 12
// 2dc: i2c
// 2dd: iload 13
// 2df: invokespecial su/catlean/ev.e (ICI)Z
// 2e2: aload 39
// 2e4: ifnonnull 35e
// 2e7: ifeq 32f
// 2ea: goto 2f8
// 2ed: ldc2_w -3303606246989709996
// 2f0: lload 4
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: aload 44
// 2fa: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 2fd: i2d
// 2fe: lload 20
// 300: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 303: invokevirtual net/minecraft/class_746.method_23318 ()D
// 306: dcmpg
// 307: aload 39
// 309: iload 3
// 30a: ifgt 360
// 30d: ifnonnull 35e
// 310: goto 31e
// 313: ldc2_w -3303606246989709996
// 316: lload 4
// 318: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31d: athrow
// 31e: iflt 279
// 321: goto 32f
// 324: ldc2_w -3303606246989709996
// 327: lload 4
// 329: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32e: athrow
// 32f: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 332: aload 44
// 334: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 337: dup
// 338: sipush 5142
// 33b: ldc2_w 5260505371576638136
// 33e: lload 4
// 340: lxor
// 341: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 346: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 349: lload 18
// 34b: dup2_x1
// 34c: pop2
// 34d: invokevirtual su/catlean/dm.R (JLnet/minecraft/class_243;)F
// 350: aload 0
// 351: lload 9
// 353: invokespecial su/catlean/ev.L (J)F
// 356: aload 0
// 357: lload 9
// 359: invokespecial su/catlean/ev.L (J)F
// 35c: fmul
// 35d: fcmpl
// 35e: aload 39
// 360: iload 2
// 361: ifle 380
// 364: ifnonnull 37e
// 367: ifgt 279
// 36a: goto 378
// 36d: ldc2_w -3303606246989709996
// 370: lload 4
// 372: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 377: athrow
// 378: aload 0
// 379: lload 24
// 37b: invokespecial su/catlean/ev.G (J)Z
// 37e: aload 39
// 380: iload 3
// 381: ifgt 3b2
// 384: ifnonnull 3b0
// 387: ifeq 3b8
// 38a: goto 398
// 38d: ldc2_w -3303606246989709996
// 390: lload 4
// 392: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 397: athrow
// 398: aload 0
// 399: iload 14
// 39b: iload 15
// 39d: aload 44
// 39f: invokespecial su/catlean/ev.f (IILnet/minecraft/class_2338;)Z
// 3a2: goto 3b0
// 3a5: ldc2_w -3303606246989709996
// 3a8: lload 4
// 3aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3af: athrow
// 3b0: aload 39
// 3b2: ifnonnull 280
// 3b5: ifne 279
// 3b8: lload 16
// 3ba: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 3bd: aload 44
// 3bf: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 3c2: dup
// 3c3: sipush 8647
// 3c6: ldc2_w 1921181973945266022
// 3c9: lload 4
// 3cb: lxor
// 3cc: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3d4: astore 45
// 3d6: aload 0
// 3d7: aload 45
// 3d9: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 3dc: dup
// 3dd: sipush 32038
// 3e0: ldc2_w 5605483291497362325
// 3e3: lload 4
// 3e5: lxor
// 3e6: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3ee: astore 38
// 3f0: iload 26
// 3f2: i2s
// 3f3: iload 27
// 3f5: i2c
// 3f6: aload 38
// 3f8: iload 28
// 3fa: invokespecial su/catlean/ev.L (SCLnet/minecraft/class_2248;I)Z
// 3fd: aload 39
// 3ff: iload 2
// 400: iflt 41f
// 403: ifnonnull 41d
// 406: ifeq 279
// 409: goto 417
// 40c: ldc2_w -3303606246989709996
// 40f: lload 4
// 411: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 416: athrow
// 417: aload 0
// 418: lload 34
// 41a: invokespecial su/catlean/ev.D (J)Z
// 41d: aload 39
// 41f: ifnonnull 49f
// 422: ifeq 49e
// 425: goto 433
// 428: ldc2_w -3303606246989709996
// 42b: lload 4
// 42d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 432: athrow
// 433: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 436: new net/minecraft/class_3959
// 439: dup
// 43a: lload 20
// 43c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 43f: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 442: aload 44
// 444: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 447: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
// 44a: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 44d: lload 20
// 44f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 452: checkcast net/minecraft/class_1297
// 455: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 458: aload 44
// 45a: aconst_null
// 45b: bipush 4
// 45c: lload 36
// 45e: aconst_null
// 45f: invokestatic su/catlean/gw.q (Lsu/catlean/gw;Lnet/minecraft/class_3959;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;IJLjava/lang/Object;)Lnet/minecraft/class_3965;
// 462: astore 46
// 464: new su/catlean/s
// 467: dup
// 468: lload 29
// 46a: aload 44
// 46c: aload 46
// 46e: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 471: dup
// 472: sipush 27242
// 475: ldc2_w 5743601389922149595
// 478: lload 4
// 47a: lxor
// 47b: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 480: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 483: aload 46
// 485: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
// 488: dup
// 489: sipush 8957
// 48c: ldc2_w 7409127626111233115
// 48f: lload 4
// 491: lxor
// 492: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 497: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 49a: invokespecial su/catlean/s.<init> (JLnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_2350;)V
// 49d: areturn
// 49e: bipush 0
// 49f: istore 46
// 4a1: iload 46
// 4a3: bipush 5
// 4a4: if_icmpge 279
// 4a7: bipush 0
// 4a8: aload 39
// 4aa: iload 3
// 4ab: ifgt 299
// 4ae: ifnonnull 297
// 4b1: aload 39
// 4b3: iload 2
// 4b4: iflt 2e4
// 4b7: ifnonnull 280
// 4ba: istore 47
// 4bc: iload 47
// 4be: bipush 5
// 4bf: if_icmpge 5cc
// 4c2: bipush 0
// 4c3: aload 39
// 4c5: ifnonnull 4a3
// 4c8: istore 48
// 4ca: iload 48
// 4cc: bipush 5
// 4cd: if_icmpge 5c0
// 4d0: ldc 0.25
// 4d2: fstore 49
// 4d4: new net/minecraft/class_243
// 4d7: dup
// 4d8: aload 44
// 4da: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 4dd: i2f
// 4de: iload 46
// 4e0: i2f
// 4e1: fload 49
// 4e3: fmul
// 4e4: fadd
// 4e5: f2d
// 4e6: aload 44
// 4e8: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 4eb: i2f
// 4ec: iload 47
// 4ee: i2f
// 4ef: fload 49
// 4f1: fmul
// 4f2: fadd
// 4f3: f2d
// 4f4: aload 44
// 4f6: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 4f9: i2f
// 4fa: iload 48
// 4fc: i2f
// 4fd: fload 49
// 4ff: fmul
// 500: fadd
// 501: f2d
// 502: invokespecial net/minecraft/class_243.<init> (DDD)V
// 505: astore 50
// 507: lload 16
// 509: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 50c: new net/minecraft/class_3959
// 50f: dup
// 510: lload 20
// 512: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 515: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 518: aload 50
// 51a: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
// 51d: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 520: lload 20
// 522: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 525: checkcast net/minecraft/class_1297
// 528: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 52b: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
// 52e: dup
// 52f: sipush 23042
// 532: ldc2_w 6732479966580364435
// 535: lload 4
// 537: lxor
// 538: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 540: astore 51
// 542: aload 39
// 544: iload 1
// 545: iflt 5bd
// 548: ifnonnull 5bb
// 54b: aload 51
// 54d: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 550: aload 39
// 552: ifnonnull 28a
// 555: iload 3
// 556: ifge 28a
// 559: goto 567
// 55c: ldc2_w -3303606246989709996
// 55f: lload 4
// 561: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 566: athrow
// 567: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
// 56a: if_acmpne 5b8
// 56d: aload 51
// 56f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 572: aload 44
// 574: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 577: ifeq 5b8
// 57a: goto 588
// 57d: ldc2_w -3303606246989709996
// 580: lload 4
// 582: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 587: athrow
// 588: new su/catlean/s
// 58b: dup
// 58c: lload 29
// 58e: aload 44
// 590: aload 50
// 592: aload 51
// 594: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
// 597: dup
// 598: sipush 22458
// 59b: ldc2_w 6586451768128461075
// 59e: lload 4
// 5a0: lxor
// 5a1: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ev.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5a9: invokespecial su/catlean/s.<init> (JLnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_2350;)V
// 5ac: areturn
// 5ad: ldc2_w -3303606246989709996
// 5b0: lload 4
// 5b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b7: athrow
// 5b8: iinc 48 1
// 5bb: aload 39
// 5bd: ifnull 4ca
// 5c0: iinc 47 1
// 5c3: aload 39
// 5c5: iload 1
// 5c6: iflt 28a
// 5c9: ifnull 4bc
// 5cc: iinc 46 1
// 5cf: aload 39
// 5d1: iload 2
// 5d2: iflt 28a
// 5d5: ifnull 4a1
// 5d8: iload 1
// 5d9: iflt 279
// 5dc: aconst_null
// 5dd: areturn
}

private final boolean f(int var1, int var2, class_2338 var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
long var6 = var4 ^ 87755766732265L;
int[] var10000 = vm.a<"Å">(8718970837953990489L, var4);
Iterator var9 = fp.X.iterator();
int[] var8 = var10000;

while (var9.hasNext()) {
class_2350 var10 = (class_2350)var9.next();
boolean var11 = Intrinsics.areEqual(zf.z(var6).method_8320(var3.method_10093(var10)).method_26204(), class_2246.field_10164);

while (var11) {
var11 = true;
if (var2 > 0 && var8 == null) {
return true;
}
}
}

return false;
}

private final void V(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ev.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 51260522785520
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 11237638859752
// 11: lxor
// 12: dup2
// 13: bipush 48
// 15: lushr
// 16: l2i
// 17: istore 5
// 19: dup2
// 1a: bipush 16
// 1c: lshl
// 1d: bipush 48
// 1f: lushr
// 20: l2i
// 21: istore 6
// 23: dup2
// 24: bipush 32
// 26: lshl
// 27: bipush 32
// 29: lushr
// 2a: l2i
// 2b: istore 7
// 2d: pop2
// 2e: dup2
// 2f: ldc2_w 38492048360248
// 32: lxor
// 33: lstore 8
// 35: pop2
// 36: ldc2_w -5289404964619550527
// 39: lload 1
// 3a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: astore 10
// 41: getstatic su/catlean/ev.D Lnet/minecraft/class_2248;
// 44: ifnonnull 60
// 47: aload 0
// 48: lload 8
// 4a: invokespecial su/catlean/ev.q (J)Lsu/catlean/xb;
// 4d: getstatic su/catlean/xb.Select Lsu/catlean/xb;
// 50: if_acmpeq be
// 53: goto 60
// 56: ldc2_w -5267459507804579435
// 59: lload 1
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: lload 3
// 61: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 64: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 67: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
// 6a: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 6d: ifne be
// 70: goto 7d
// 73: ldc2_w -5267459507804579435
// 76: lload 1
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: getstatic su/catlean/ev.P Lsu/catlean/s;
// 80: aload 10
// 82: ifnonnull bb
// 85: goto 92
// 88: ldc2_w -5267459507804579435
// 8b: lload 1
// 8c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91: athrow
// 92: ifnonnull be
// 95: goto a2
// 98: ldc2_w -5267459507804579435
// 9b: lload 1
// 9c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1: athrow
// a2: aload 0
// a3: iload 5
// a5: i2s
// a6: iload 6
// a8: i2s
// a9: iload 7
// ab: invokespecial su/catlean/ev.n (SSI)Lsu/catlean/s;
// ae: goto bb
// b1: ldc2_w -5267459507804579435
// b4: lload 1
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: putstatic su/catlean/ev.P Lsu/catlean/s;
// be: return
}

private final boolean L(short param1, char param2, class_2248 param3, int param4) {
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
// 00e: iload 4
// 010: i2l
// 011: bipush 32
// 013: lshl
// 014: bipush 32
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/ev.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 122305061252330
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 136861684636378
// 02b: lxor
// 02c: lstore 9
// 02e: pop2
// 02f: ldc2_w -5802292948222863069
// 032: lload 5
// 034: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039: aload 0
// 03a: lload 7
// 03c: invokespecial su/catlean/ev.z (J)Lsu/catlean/dg;
// 03f: invokevirtual su/catlean/dg.e ()Ljava/util/List;
// 042: aload 3
// 043: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 048: istore 12
// 04a: astore 11
// 04c: aload 0
// 04d: lload 9
// 04f: invokespecial su/catlean/ev.q (J)Lsu/catlean/xb;
// 052: getstatic su/catlean/r8.P [I
// 055: swap
// 056: invokevirtual su/catlean/xb.ordinal ()I
// 059: iaload
// 05a: aload 11
// 05c: ifnonnull 150
// 05f: tableswitch 239 1 3 36 224 234
// 078: ldc2_w -5835427033285672841
// 07b: lload 5
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: aload 3
// 084: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 087: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 08a: aload 11
// 08c: ifnonnull 13c
// 08f: goto 09d
// 092: ldc2_w -5835427033285672841
// 095: lload 5
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: ifne 13b
// 0a0: goto 0ae
// 0a3: ldc2_w -5835427033285672841
// 0a6: lload 5
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: aload 3
// 0af: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 0b2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b5: aload 11
// 0b7: ifnonnull 13c
// 0ba: goto 0c8
// 0bd: ldc2_w -5835427033285672841
// 0c0: lload 5
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: ifne 13b
// 0cb: goto 0d9
// 0ce: ldc2_w -5835427033285672841
// 0d1: lload 5
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 3
// 0da: getstatic net/minecraft/class_2246.field_10543 Lnet/minecraft/class_2248;
// 0dd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e0: aload 11
// 0e2: ifnonnull 13c
// 0e5: goto 0f3
// 0e8: ldc2_w -5835427033285672841
// 0eb: lload 5
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: ifne 13b
// 0f6: goto 104
// 0f9: ldc2_w -5835427033285672841
// 0fc: lload 5
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: aload 3
// 105: instanceof net/minecraft/class_2404
// 108: aload 11
// 10a: ifnonnull 13c
// 10d: goto 11b
// 110: ldc2_w -5835427033285672841
// 113: lload 5
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: ifne 13b
// 11e: goto 12c
// 121: ldc2_w -5835427033285672841
// 124: lload 5
// 126: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: athrow
// 12c: bipush 1
// 12d: goto 226
// 130: ldc2_w -5835427033285672841
// 133: lload 5
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: bipush 0
// 13c: goto 226
// 13f: aload 3
// 140: getstatic su/catlean/ev.D Lnet/minecraft/class_2248;
// 143: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 146: goto 226
// 149: iload 12
// 14b: goto 226
// 14e: iload 12
// 150: aload 11
// 152: iload 1
// 153: iflt 181
// 156: ifnonnull 17f
// 159: ifne 225
// 15c: goto 16a
// 15f: ldc2_w -5835427033285672841
// 162: lload 5
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: aload 3
// 16b: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 16e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 171: goto 17f
// 174: ldc2_w -5835427033285672841
// 177: lload 5
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: aload 11
// 181: iload 2
// 182: ifle 1b0
// 185: ifnonnull 1ae
// 188: ifne 225
// 18b: goto 199
// 18e: ldc2_w -5835427033285672841
// 191: lload 5
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 3
// 19a: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 19d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1a0: goto 1ae
// 1a3: ldc2_w -5835427033285672841
// 1a6: lload 5
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: aload 11
// 1b0: iload 4
// 1b2: ifle 1e0
// 1b5: ifnonnull 1de
// 1b8: ifne 225
// 1bb: goto 1c9
// 1be: ldc2_w -5835427033285672841
// 1c1: lload 5
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: aload 3
// 1ca: getstatic net/minecraft/class_2246.field_10543 Lnet/minecraft/class_2248;
// 1cd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1d0: goto 1de
// 1d3: ldc2_w -5835427033285672841
// 1d6: lload 5
// 1d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: athrow
// 1de: aload 11
// 1e0: iload 4
// 1e2: iflt 20d
// 1e5: ifnonnull 20b
// 1e8: ifne 225
// 1eb: goto 1f9
// 1ee: ldc2_w -5835427033285672841
// 1f1: lload 5
// 1f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f8: athrow
// 1f9: aload 3
// 1fa: instanceof net/minecraft/class_2404
// 1fd: goto 20b
// 200: ldc2_w -5835427033285672841
// 203: lload 5
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: aload 11
// 20d: ifnonnull 222
// 210: ifne 225
// 213: goto 221
// 216: ldc2_w -5835427033285672841
// 219: lload 5
// 21b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: athrow
// 221: bipush 1
// 222: goto 226
// 225: bipush 0
// 226: ireturn
}

private static final Unit Z() {
return Unit.INSTANCE;
}

private static final class_2596 H(class_2338 var0, int var1) {
return (class_2596)(new class_2846(class_2847.field_12968, var0, class_2350.field_11036, var1));
}

private static final class_2596 O(class_2338 var0, int var1) {
return (class_2596)(new class_2846(class_2847.field_12973, var0, class_2350.field_11036, var1));
}

public static final bm j(long a, ev $this) {
ax = a ^ ax;
long var3 = ax ^ 111255089830423L;
return $this.H(var3);
}

static {
long var20 = a ^ 98241256938656L;
long var22 = var20 ^ 16551881286337L;
long var24 = (var20 ^ 40599115805193L) >>> 8;
int var26 = (int)((var20 ^ 40599115805193L) << 56 >>> 56);
long var27 = var20 ^ 100534381648661L;
long var29 = var20 ^ 75606299547709L;
long var31 = var20 ^ 118080890475867L;
long var33 = var20 ^ 15296529509162L;
long var35 = var20 ^ 46288594087919L;
vm.a<"Å">(null, 5916764597148248869L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[46];
int var16 = 0;
String var15 = "\u0090:\f\f<(\u00906]<\\>\u001d.\tW(ÞÜ¾'\u009e#3\u0001Z\n¾f\u0004¬\u0098\u0000p\u0016b\u000fÂ®cY]\u0098}j\u009fÌ*d´\bNâ*¹^\u0018 \u0092£d\u0091\\\u007fñ\u00123)WÍ·EfK&ó|ô\u0085\n\u0081\u0016!\u0086Ë\u001bº\u0087g\u0004\u0018Uëðÿ\rG\u008bóA)ª]W\u008c}\u0014àj\n&\u0004îÒ!\u0018ó\\VÅ\u0082E3\u008fsó)\r¨¸\u0093\u0088uo\u001b£þ!q¾(n[Ø\u0084ÃQ]\u008cÄ¡\u009bAþ<÷ã>©\u0000\u0086\u009e+\u0082&ÃO\u0010A®VÇìð3Bogëéc\u0010\u0004J\u008d4Oµ@2\u0094Ç\u0015É\"«q\u0019\u0010úãñ³¾có\u0016¬a\u0084\u0013\u0011\u0085rW  Þ\u0088H^\u0013«rÐÉL\u0087WÖ§7Èâ\u007f\u0015¬&êwÿåp\u0092] x70\u008c\u001d2\u0007\u0092^Ô¼U²k\u0097\u0003é\"\fÇ=\u001a\u0010¥ã*¥Ló!T\u0092wÈ\u0080v\u0095yÝ\u0098\u0090³¨[bl2+r ´ FÐê\u0086å\u007f\u0010kôÁQ\u008fNúø$\u0080\u009c×\u008e\u0010Ãàa\fí¦øì\\Dò\u0010ºÒ\u009e]\u0089\u0019\u0012kA\"\u0088!2¤Eå B#,s1* ¢\u0007àSB£ý.1ò\u009dÎ\u0010{]¹z\u009c$¢¾\u0097bv\u001a \n¼å*ä\u009c]Ì#Üá\u0090Áù\u00048þB\u00978\u0085Fé9\u0095/Ó\u0015\u008d\u0019Å¹\u0018øV¾@'ìÈz×OÝ<é\u008c}[ã/¨@>r~=\u0018Â\u0093Õ=\u0088G\rÁ½\u000fÙz?ßoÄ¼N¯ÓIìn¶@\u0098¿ÒÄFjØÀ÷,àqßÖàØÓâS®Î\u0093T_?:\u001e\u001f[\u000e\u001e³>C\u0014\u009a\u001bôLÛn=é\u009aÅº\u00ad;]û´ø\u001dBÖ\u0080j\u0084ÈTÜ?H\u001e .&ð;-¬Ù\u0088=\u0004N,zd4\u0096 i\u0010$8¡;\u0095ti¨·,\u0099UÑ y\u0084³¯ZÝIm\u0094\u0089çôÕN×YnîÉÑñZ¹ý\b\u0096´ß)\u0011æü\u0010}o\u008eUbA\u0080Í\u001b6\në²àÀ\u0095 çÆò_°, Ë~É2\u0092/xt?µz\u008c¬\u009b\u0014t\u0001ØMÛ\u0005Kâì»\u0018Ô@]\u000eBÕ7kª'\u0013vÇM\u0098\"\u0090¶\u0082M\u0016\u0082\u0013k(l$\n\u000b\u001ez¾ÿl|Å;\u0017é\u0011ã\fµð}³Ü´\u0004éh\u0018àÅòýÜ\u0014\\Öêâ$¬À\u0018àuR\"\u0012M¥´z\u0081h%7v\u0082dãU^ýý\u0088Õ\u0085\u0018þ\u0099Ûí\u0097uï·ªkPmF&Ý1\u008aé*ÕZOÅ&(¢Gß¬\u001er\u008au÷ÉMÞõ\u000eº\u008dF¥Õà\u0000º\u001a[pZ \u001f;¬QØP\u008a\u008dfª~êI\u0010G÷\u000e\u0007\u0093¶_³a\u0096Ü¸·\u008aà\u008c\u0018çïËðÕÜC_s\u0087U³\u001aWN\u0006²þäy\u009d×\u008e\u0081 ÷)\\g½DZ>\u0087\"YÍMñJZ%Fw\u0097z\u0080\f\u008cÏI7\u0099$plæ\u0010uùw\u0093\u0093>\u0013\fa\u0083\n4öy\u0005\u0085 £\u0004\u001cÁq©\u0010Za\u008a¾ÝuãÑ\u0006\u009d\u000e\u001cHÿÎº¢ß\u001cê\u0092¹7Ör\u0018ÌØ¡Ìå~;ó IRöMÜC\u0092ÎE\u008dg¸ðåË\u0010,ï\u0087³A2\u000f7Áª½\u0016ë(\u0091j k\u0003ZËKØ\u0002M\u0091ïh\u009a#\u009eMk±÷A=\u0011é@¶ÂNP\u0086\u0089òvV\u0010\u008b)Ú\u007f§\u0081f\u000bNß¤©\u0096\u009d(Ì º\u0089þC8=ÎXêC¦&\u0088Î\u0095äEî«5ºf<\u0082Z\u008f\u001e (`9å(¿¨×<\u0013\nù»Ä»Ö\u0017\u0086]Á\u0084¶p»,\u0011·)~u\u0095ð¯~W°\u0013ð\u0013#¢B\u0099v%\u0018J8Þ-z!N\nã'óyÓÄêÄ´§Çãä\u0005ö1\u0018\u00969ÎEÄ¹\u008b\u000bwVÂìâù¹ûQ\u0006xc\u001e×Ïç0ç\u0013Ùõq[ºI!Í&Ü\u0089ú\u009bâ\u001a\u000e)dÿ\u0089Þ~Ve\u0097° ×'Ç\u000b\u0019¿ì?Ueõ·Ü¤6\u000eË;\u0084 º<(S\u0011MG¥5+\u0005Äû*øhtÍiV\u008f¿±\u0007µK\u009e£$\u0007#ª\u0010xô¡/4fð\u0089§ÚÁéÒÎ\u0000ã\u0010ð¾\u001c\u009fýÛ_¶W·ô\u0017\"×é] \u0080l\u0091?^[\u0003\u008c!é\u0091\r\u0006YÄGVÉd°Ã34\u0094º\f7CÅT/ê";
int var17 = "\u0090:\f\f<(\u00906]<\\>\u001d.\tW(ÞÜ¾'\u009e#3\u0001Z\n¾f\u0004¬\u0098\u0000p\u0016b\u000fÂ®cY]\u0098}j\u009fÌ*d´\bNâ*¹^\u0018 \u0092£d\u0091\\\u007fñ\u00123)WÍ·EfK&ó|ô\u0085\n\u0081\u0016!\u0086Ë\u001bº\u0087g\u0004\u0018Uëðÿ\rG\u008bóA)ª]W\u008c}\u0014àj\n&\u0004îÒ!\u0018ó\\VÅ\u0082E3\u008fsó)\r¨¸\u0093\u0088uo\u001b£þ!q¾(n[Ø\u0084ÃQ]\u008cÄ¡\u009bAþ<÷ã>©\u0000\u0086\u009e+\u0082&ÃO\u0010A®VÇìð3Bogëéc\u0010\u0004J\u008d4Oµ@2\u0094Ç\u0015É\"«q\u0019\u0010úãñ³¾có\u0016¬a\u0084\u0013\u0011\u0085rW  Þ\u0088H^\u0013«rÐÉL\u0087WÖ§7Èâ\u007f\u0015¬&êwÿåp\u0092] x70\u008c\u001d2\u0007\u0092^Ô¼U²k\u0097\u0003é\"\fÇ=\u001a\u0010¥ã*¥Ló!T\u0092wÈ\u0080v\u0095yÝ\u0098\u0090³¨[bl2+r ´ FÐê\u0086å\u007f\u0010kôÁQ\u008fNúø$\u0080\u009c×\u008e\u0010Ãàa\fí¦øì\\Dò\u0010ºÒ\u009e]\u0089\u0019\u0012kA\"\u0088!2¤Eå B#,s1* ¢\u0007àSB£ý.1ò\u009dÎ\u0010{]¹z\u009c$¢¾\u0097bv\u001a \n¼å*ä\u009c]Ì#Üá\u0090Áù\u00048þB\u00978\u0085Fé9\u0095/Ó\u0015\u008d\u0019Å¹\u0018øV¾@'ìÈz×OÝ<é\u008c}[ã/¨@>r~=\u0018Â\u0093Õ=\u0088G\rÁ½\u000fÙz?ßoÄ¼N¯ÓIìn¶@\u0098¿ÒÄFjØÀ÷,àqßÖàØÓâS®Î\u0093T_?:\u001e\u001f[\u000e\u001e³>C\u0014\u009a\u001bôLÛn=é\u009aÅº\u00ad;]û´ø\u001dBÖ\u0080j\u0084ÈTÜ?H\u001e .&ð;-¬Ù\u0088=\u0004N,zd4\u0096 i\u0010$8¡;\u0095ti¨·,\u0099UÑ y\u0084³¯ZÝIm\u0094\u0089çôÕN×YnîÉÑñZ¹ý\b\u0096´ß)\u0011æü\u0010}o\u008eUbA\u0080Í\u001b6\në²àÀ\u0095 çÆò_°, Ë~É2\u0092/xt?µz\u008c¬\u009b\u0014t\u0001ØMÛ\u0005Kâì»\u0018Ô@]\u000eBÕ7kª'\u0013vÇM\u0098\"\u0090¶\u0082M\u0016\u0082\u0013k(l$\n\u000b\u001ez¾ÿl|Å;\u0017é\u0011ã\fµð}³Ü´\u0004éh\u0018àÅòýÜ\u0014\\Öêâ$¬À\u0018àuR\"\u0012M¥´z\u0081h%7v\u0082dãU^ýý\u0088Õ\u0085\u0018þ\u0099Ûí\u0097uï·ªkPmF&Ý1\u008aé*ÕZOÅ&(¢Gß¬\u001er\u008au÷ÉMÞõ\u000eº\u008dF¥Õà\u0000º\u001a[pZ \u001f;¬QØP\u008a\u008dfª~êI\u0010G÷\u000e\u0007\u0093¶_³a\u0096Ü¸·\u008aà\u008c\u0018çïËðÕÜC_s\u0087U³\u001aWN\u0006²þäy\u009d×\u008e\u0081 ÷)\\g½DZ>\u0087\"YÍMñJZ%Fw\u0097z\u0080\f\u008cÏI7\u0099$plæ\u0010uùw\u0093\u0093>\u0013\fa\u0083\n4öy\u0005\u0085 £\u0004\u001cÁq©\u0010Za\u008a¾ÝuãÑ\u0006\u009d\u000e\u001cHÿÎº¢ß\u001cê\u0092¹7Ör\u0018ÌØ¡Ìå~;ó IRöMÜC\u0092ÎE\u008dg¸ðåË\u0010,ï\u0087³A2\u000f7Áª½\u0016ë(\u0091j k\u0003ZËKØ\u0002M\u0091ïh\u009a#\u009eMk±÷A=\u0011é@¶ÂNP\u0086\u0089òvV\u0010\u008b)Ú\u007f§\u0081f\u000bNß¤©\u0096\u009d(Ì º\u0089þC8=ÎXêC¦&\u0088Î\u0095äEî«5ºf<\u0082Z\u008f\u001e (`9å(¿¨×<\u0013\nù»Ä»Ö\u0017\u0086]Á\u0084¶p»,\u0011·)~u\u0095ð¯~W°\u0013ð\u0013#¢B\u0099v%\u0018J8Þ-z!N\nã'óyÓÄêÄ´§Çãä\u0005ö1\u0018\u00969ÎEÄ¹\u008b\u000bwVÂìâù¹ûQ\u0006xc\u001e×Ïç0ç\u0013Ùõq[ºI!Í&Ü\u0089ú\u009bâ\u001a\u000e)dÿ\u0089Þ~Ve\u0097° ×'Ç\u000b\u0019¿ì?Ueõ·Ü¤6\u000eË;\u0084 º<(S\u0011MG¥5+\u0005Äû*øhtÍiV\u008f¿±\u0007µK\u009e£$\u0007#ª\u0010xô¡/4fð\u0089§ÚÁéÒÎ\u0000ã\u0010ð¾\u001c\u009fýÛ_¶W·ô\u0017\"×é] \u0080l\u0091?^[\u0003\u008c!é\u0091\r\u0006YÄGVÉd°Ã34\u0094º\f7CÅT/ê"
.length();
char var14 = 16;
int var45 = -1;

label54:
while (true) {
String var46 = var15.substring(++var45, var45 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var46.getBytes("ISO-8859-1"));
String var59 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var59;
if ((var45 += var14) >= var17) {
b = var18;
c = new String[46];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[17];
int var3 = 0;
String var4 = "±}\u009e\u0014\u0002\u0001¶¥M\u0014í\\pæ6\u0011Úv k]\u0011¦ú\rØ$Rè\u000b\u0016æ8\u0085DW&\u0016YÔßI§\u001eÃRÌ\u0004b\u0092ôºS\u007f(»_U\u0096*\u0014ß\u000f~\u000e\u000eÓ\u0099\u000eH\u000e\u0081üî(Lu(\u0003Ù?ü\u0015\u0080á,,Þf\u0012ÿD\u008dfWYD?\\\u001a\u0087K\f\u0003Üüv¢l<4\u009d·Û\u0086ç¦b\u00adb";
int var5 = "±}\u009e\u0014\u0002\u0001¶¥M\u0014í\\pæ6\u0011Úv k]\u0011¦ú\rØ$Rè\u000b\u0016æ8\u0085DW&\u0016YÔßI§\u001eÃRÌ\u0004b\u0092ôºS\u007f(»_U\u0096*\u0014ß\u000f~\u000e\u000eÓ\u0099\u000eH\u000e\u0081üî(Lu(\u0003Ù?ü\u0015\u0080á,,Þf\u0012ÿD\u008dfWYD?\\\u001a\u0087K\f\u0003Üüv¢l<4\u009d·Û\u0086ç¦b\u00adb"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var49 = var6;
var10001 = var3++;
long var63 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var67 = -1;

while (true) {
long var8 = var63;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var69 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var67) {
case 0:
var49[var10001] = var69;
if (var2 >= var5) {
h = var6;
i = new Integer[17];
KProperty[] var42 = new KProperty[c<"x">(7922, 291438488591730338L ^ var20)];
var42[0] = Reflection.property1(
new PropertyReference1Impl(ev.class, b<"g">(1962, 5094303643327662564L ^ var20), b<"g">(20535, 2092229640315559505L ^ var20), 0)
);
var42[1] = Reflection.property1(
new PropertyReference1Impl(ev.class, b<"g">(16875, 2961041167149092746L ^ var20), b<"g">(26780, 7878462938178512596L ^ var20), 0)
);
var42[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(ev.class, b<"g">(28799, 3788437484101008944L ^ var20), b<"g">(29597, 4744061043673759180L ^ var20), 0)
);
var42[3] = Reflection.property1(
new PropertyReference1Impl(ev.class, b<"g">(30695, 1979116424527641005L ^ var20), b<"g">(16297, 1187955432547168764L ^ var20), 0)
);
var42[4] = Reflection.property1(
new PropertyReference1Impl(ev.class, b<"g">(15149, 3457736847600104831L ^ var20), b<"g">(31850, 6406614060983218691L ^ var20), 0)
);
var42[5] = Reflection.property1(new PropertyReference1Impl(ev.class, b<"g">(13684, 77721454568258320L ^ var20), b<"g">(3046, 3128000907825251724L ^ var20), 0));
var42[c<"x">(32681, 647985017927886844L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ev.class, b<"g">(113, 1740918144713100852L ^ var20), b<"g">(6823, 5465886513073755386L ^ var20), 0)
);
var42[c<"x">(443, 5028459241162742246L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ev.class, b<"g">(13449, 3157846573334379215L ^ var20), b<"g">(25360, 2672431730847903049L ^ var20), 0)
);
var42[c<"x">(23043, 5027943601910530641L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ev.class, b<"g">(13079, 7478655347317882179L ^ var20), b<"g">(24012, 7428425729721291674L ^ var20), 0)
);
var42[c<"x">(743, 7497732875364342461L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ev.class, b<"g">(7784, 6507190283094495236L ^ var20), b<"g">(4507, 8454592161630953468L ^ var20), 0)
);
B = var42;
N = new ev(var22);
g = yp.L(N, b<"g">(30204, 4752747666598460311L ^ var20), xb.Select, null, null, c<"x">(20268, 4928962549988480884L ^ var20), null, var35);
Y = yp.L(N, b<"g">(13964, 7899408865050736848L ^ var20), bm.FOV, null, null, c<"x">(20268, 4928962549988480884L ^ var20), null, var35);
jk var50 = N;
String var57 = b<"g">(28086, 8775471054504616926L ^ var20);
dg var65 = new dg(var24, null, 1, null, (byte)var26);
int var10005 = c<"x">(20268, 4928962549988480884L ^ var20);
Object var37 = null;
int var38 = var10005;
Object var39 = null;
Object var40 = null;
dg var41 = var65;
O = yp.y(var50, var57, var33, var41, (h)var40, (Function0)var39, var38, var37);
V = yp.L(
N,
b<"g">(19993, 4518102867654623348L ^ var20),
c<"x">(6741, 4394740794181452297L ^ var20),
new IntRange(0, c<"x">(10635, 5813431168918172116L ^ var20)),
var29,
null,
null,
c<"x">(19666, 1837789635487519883L ^ var20),
null
);
f = yp.k(
N, b<"g">(26735, 7797824096257926708L ^ var20), 4.2F, var27, RangesKt.rangeTo(3.0F, 7.0F), null, null, c<"x">(24498, 1112979482164840428L ^ var20), null
);
o = yp.L(
N,
b<"g">(19062, 6278671151254324243L ^ var20),
c<"x">(5958, 1480838916526444293L ^ var20),
new IntRange(5, c<"x">(21609, 4916883685487397944L ^ var20)),
var29,
null,
null,
c<"x">(24498, 1112979482164840428L ^ var20),
null
);
E = yp.t(N, b<"g">(29777, 1059917293908130330L ^ var20), false, var31, null, null, c<"x">(20268, 4928962549988480884L ^ var20), null);
n = yp.t(N, b<"g">(16452, 2791582328729521667L ^ var20), false, var31, null, null, c<"x">(20268, 4928962549988480884L ^ var20), null);
d = yp.t(N, b<"g">(21504, 8604197308540312147L ^ var20), false, var31, null, null, c<"x">(20268, 4928962549988480884L ^ var20), null);
J = yp.t(N, b<"g">(24171, 6005082163740692518L ^ var20), false, var31, null, null, c<"x">(20268, 4928962549988480884L ^ var20), null);
k = new bg();
return;
}
break;
default:
var49[var10001] = var69;
if (var2 < var5) {
continue label36;
}

var4 = "\u001aòÿ\u0097M\u0001xk\u0093\u0095þ\u000b=\u007f¿\u0004";
var5 = "\u001aòÿ\u0097M\u0001xk\u0093\u0095þ\u000b=\u007f¿\u0004".length();
var2 = 0;
}

byte var56 = var2;
var2 += 8;
var7 = var4.substring(var56, var2).getBytes("ISO-8859-1");
var49 = var6;
var10001 = var3++;
var63 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var67 = 0;
}
}
}

var14 = var15.charAt(var45);
break;
default:
var18[var16++] = var59;
if ((var45 += var14) < var17) {
var14 = var15.charAt(var45);
continue label54;
}

var15 = "ï¡OH°:4m<¢\u009e\u0017\u009f³Ä4 \u0082J½\u0095êÙhêôA\u000b\u0092\u008a\u008f\n\u0084ì8F\u008et\u0087¨\u0098ï\u0019¼\u0096a\u001d'þ";
var17 = "ï¡OH°:4m<¢\u009e\u0017\u009f³Ä4 \u0082J½\u0095êÙhêôA\u000b\u0092\u008a\u008f\n\u0084ì8F\u008et\u0087¨\u0098ï\u0019¼\u0096a\u001d'þ".length();
var14 = 16;
var45 = -1;
}

var46 = var15.substring(++var45, var45 + var14);
var10001 = 0;
}
}
}

public static void B(String var0) {
A = var0;
}

public static String M() {
return A;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24008;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ev", var10);
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
throw new RuntimeException("su/catlean/ev" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 19418;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])j.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ev", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/ev" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
