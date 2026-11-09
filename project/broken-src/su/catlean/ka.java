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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.gofra.Flow;

public final class ka extends _g {
@NotNull
public static final ka F;
static final KProperty[] m;
@NotNull
private static final cp y;
@NotNull
private static final cq z;
@NotNull
private static final cq e;
@NotNull
private static final cq X;
@NotNull
private static final cq N;
@NotNull
private static final cq U;
@NotNull
private static final cq P;
@NotNull
private static final cq w;
@NotNull
private static final cq I;
@NotNull
private static final cq D;
@NotNull
private static final cq u;
@NotNull
private static final cq J;
@NotNull
private static final cw E;
private static final long a = yz.a(-6278799848982746941L, -927332521761449636L, MethodHandles.lookup().lookupClass()).a(266574597023335L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private ka(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 6790689040642L;
super(b<"a">(4130, 4436466254171102477L ^ var1), jt.z(), null, 4, null, var3);
}

private final h I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 22599114374420L;
return (h)y.E(this, var3, m[0]);
}

private final boolean F(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 120475890040779L;
return (Boolean)z.E(this, var6, m[1]);
}

private final boolean C(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 33449127154359L;
return (Boolean)e.E(this, var3, m[2]);
}

private final boolean l(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 48195041042239L;
return (Boolean)X.E(this, var3, m[3]);
}

private final boolean L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 23487325995376L;
return (Boolean)N.E(this, var3, m[4]);
}

private final boolean M(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 29083746881010L;
return (Boolean)U.E(this, var3, m[5]);
}

private final boolean s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 106806265729561L;
return (Boolean)P.E(this, var3, m[c<"l">(24761, 6158852202459971983L ^ var1)]);
}

private final boolean g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 76278337353995L;
return (Boolean)w.E(this, var3, m[c<"l">(15003, 4583222365520294067L ^ var1)]);
}

private final boolean H(short var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 58727443758306L;
return (Boolean)I.E(this, var6, m[c<"l">(24684, 3032842452667461536L ^ var4)]);
}

private final boolean z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114831469873251L;
return (Boolean)D.E(this, var3, m[c<"l">(23178, 2259383152507691474L ^ var1)]);
}

private final boolean T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 96266406026825L;
return (Boolean)u.E(this, var3, m[c<"l">(74, 4461115191791103294L ^ var1)]);
}

private final boolean t(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 76343213551806L;
return (Boolean)J.E(this, var3, m[c<"l">(22605, 4327953523331488727L ^ var1)]);
}

private final wk E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 21678869524307L;
return (wk)E.E(this, var3, m[c<"l">(13092, 8780207544482623326L ^ var1)]);
}

@Flow
private final void E(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ka.a J
// 003: ldc2_w 13916702158828
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 105411443313851
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 70860295661897
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 114064847961303
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 108580889647560
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 90174879232351
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 31545119520314
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 49801344594417
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 98080196813464
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 10133669206755
// 045: lxor
// 046: lstore 20
// 048: dup2
// 049: ldc2_w 39688887593867
// 04c: lxor
// 04d: lstore 22
// 04f: dup2
// 050: ldc2_w 81628957368919
// 053: lxor
// 054: lstore 24
// 056: dup2
// 057: ldc2_w 94674309459482
// 05a: lxor
// 05b: lstore 26
// 05d: dup2
// 05e: ldc2_w 21028922308203
// 061: lxor
// 062: dup2
// 063: bipush 56
// 065: lushr
// 066: l2i
// 067: istore 28
// 069: dup2
// 06a: bipush 8
// 06c: lshl
// 06d: bipush 8
// 06f: lushr
// 070: lstore 29
// 072: pop2
// 073: dup2
// 074: ldc2_w 37361791687715
// 077: lxor
// 078: dup2
// 079: bipush 48
// 07b: lushr
// 07c: l2i
// 07d: istore 31
// 07f: dup2
// 080: bipush 16
// 082: lshl
// 083: bipush 48
// 085: lushr
// 086: l2i
// 087: istore 32
// 089: dup2
// 08a: bipush 32
// 08c: lshl
// 08d: bipush 32
// 08f: lushr
// 090: l2i
// 091: istore 33
// 093: pop2
// 094: pop2
// 095: ldc2_w -5355583573150848690
// 098: lload 2
// 099: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: aload 1
// 09f: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 0a2: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 0a5: lload 10
// 0a7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0aa: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 0ad: dup
// 0ae: sipush 32174
// 0b1: ldc2_w 840174924187139408
// 0b4: lload 2
// 0b5: lxor
// 0b6: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0be: astore 45
// 0c0: istore 43
// 0c2: bipush 0
// 0c3: istore 46
// 0c5: aload 45
// 0c7: astore 47
// 0c9: new java/util/ArrayList
// 0cc: dup
// 0cd: invokespecial java/util/ArrayList.<init> ()V
// 0d0: checkcast java/util/Collection
// 0d3: astore 48
// 0d5: bipush 0
// 0d6: istore 49
// 0d8: aload 47
// 0da: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0df: astore 50
// 0e1: aload 50
// 0e3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0e8: ifeq 411
// 0eb: aload 50
// 0ed: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0f2: astore 51
// 0f4: aload 51
// 0f6: checkcast net/minecraft/class_1297
// 0f9: astore 52
// 0fb: bipush 0
// 0fc: istore 53
// 0fe: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 101: iload 31
// 103: i2s
// 104: iload 32
// 106: i2c
// 107: iload 33
// 109: invokespecial su/catlean/ka.F (SCI)Z
// 10c: iload 43
// 10e: ifne 15d
// 111: ifeq 148
// 114: goto 121
// 117: ldc2_w -5409982638199016702
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: aload 52
// 123: instanceof net/minecraft/class_1684
// 126: iload 43
// 128: ifne 3e5
// 12b: goto 138
// 12e: ldc2_w -5409982638199016702
// 131: lload 2
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: ifne 3d3
// 13b: goto 148
// 13e: ldc2_w -5409982638199016702
// 141: lload 2
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 14b: lload 12
// 14d: invokespecial su/catlean/ka.C (J)Z
// 150: goto 15d
// 153: ldc2_w -5409982638199016702
// 156: lload 2
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: iload 43
// 15f: ifne 1d8
// 162: ifeq 1c3
// 165: goto 172
// 168: ldc2_w -5409982638199016702
// 16b: lload 2
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: aload 52
// 174: instanceof net/minecraft/class_1665
// 177: iload 43
// 179: ifne 1d8
// 17c: goto 189
// 17f: ldc2_w -5409982638199016702
// 182: lload 2
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: ifeq 1c3
// 18c: goto 199
// 18f: ldc2_w -5409982638199016702
// 192: lload 2
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 52
// 19b: checkcast net/minecraft/class_1665
// 19e: invokevirtual net/minecraft/class_1665.method_5675 ()Z
// 1a1: iload 43
// 1a3: ifne 3e5
// 1a6: goto 1b3
// 1a9: ldc2_w -5409982638199016702
// 1ac: lload 2
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: athrow
// 1b3: ifne 3d3
// 1b6: goto 1c3
// 1b9: ldc2_w -5409982638199016702
// 1bc: lload 2
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 1c6: lload 8
// 1c8: invokespecial su/catlean/ka.l (J)Z
// 1cb: goto 1d8
// 1ce: ldc2_w -5409982638199016702
// 1d1: lload 2
// 1d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: athrow
// 1d8: iload 43
// 1da: ifne 253
// 1dd: ifeq 23e
// 1e0: goto 1ed
// 1e3: ldc2_w -5409982638199016702
// 1e6: lload 2
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: aload 52
// 1ef: instanceof net/minecraft/class_1685
// 1f2: iload 43
// 1f4: ifne 253
// 1f7: goto 204
// 1fa: ldc2_w -5409982638199016702
// 1fd: lload 2
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: ifeq 23e
// 207: goto 214
// 20a: ldc2_w -5409982638199016702
// 20d: lload 2
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: aload 52
// 216: checkcast net/minecraft/class_1685
// 219: invokevirtual net/minecraft/class_1685.method_5675 ()Z
// 21c: iload 43
// 21e: ifne 3e5
// 221: goto 22e
// 224: ldc2_w -5409982638199016702
// 227: lload 2
// 228: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: athrow
// 22e: ifne 3d3
// 231: goto 23e
// 234: ldc2_w -5409982638199016702
// 237: lload 2
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 241: lload 26
// 243: invokespecial su/catlean/ka.M (J)Z
// 246: goto 253
// 249: ldc2_w -5409982638199016702
// 24c: lload 2
// 24d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: athrow
// 253: iload 43
// 255: ifne 2a4
// 258: ifeq 28f
// 25b: goto 268
// 25e: ldc2_w -5409982638199016702
// 261: lload 2
// 262: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 267: athrow
// 268: aload 52
// 26a: instanceof net/minecraft/class_8956
// 26d: iload 43
// 26f: ifne 3e5
// 272: goto 27f
// 275: ldc2_w -5409982638199016702
// 278: lload 2
// 279: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27e: athrow
// 27f: ifne 3d3
// 282: goto 28f
// 285: ldc2_w -5409982638199016702
// 288: lload 2
// 289: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28e: athrow
// 28f: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 292: lload 18
// 294: invokespecial su/catlean/ka.L (J)Z
// 297: goto 2a4
// 29a: ldc2_w -5409982638199016702
// 29d: lload 2
// 29e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a3: athrow
// 2a4: iload 43
// 2a6: ifne 2f5
// 2a9: ifeq 2e0
// 2ac: goto 2b9
// 2af: ldc2_w -5409982638199016702
// 2b2: lload 2
// 2b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b8: athrow
// 2b9: aload 52
// 2bb: instanceof net/minecraft/class_1681
// 2be: iload 43
// 2c0: ifne 3e5
// 2c3: goto 2d0
// 2c6: ldc2_w -5409982638199016702
// 2c9: lload 2
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: ifne 3d3
// 2d3: goto 2e0
// 2d6: ldc2_w -5409982638199016702
// 2d9: lload 2
// 2da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2df: athrow
// 2e0: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 2e3: lload 16
// 2e5: invokespecial su/catlean/ka.s (J)Z
// 2e8: goto 2f5
// 2eb: ldc2_w -5409982638199016702
// 2ee: lload 2
// 2ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f4: athrow
// 2f5: iload 43
// 2f7: ifne 346
// 2fa: ifeq 331
// 2fd: goto 30a
// 300: ldc2_w -5409982638199016702
// 303: lload 2
// 304: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 309: athrow
// 30a: aload 52
// 30c: instanceof net/minecraft/class_1680
// 30f: iload 43
// 311: ifne 3e5
// 314: goto 321
// 317: ldc2_w -5409982638199016702
// 31a: lload 2
// 31b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 320: athrow
// 321: ifne 3d3
// 324: goto 331
// 327: ldc2_w -5409982638199016702
// 32a: lload 2
// 32b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 330: athrow
// 331: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 334: lload 20
// 336: invokespecial su/catlean/ka.g (J)Z
// 339: goto 346
// 33c: ldc2_w -5409982638199016702
// 33f: lload 2
// 340: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 345: athrow
// 346: iload 43
// 348: ifne 397
// 34b: ifeq 382
// 34e: goto 35b
// 351: ldc2_w -5409982638199016702
// 354: lload 2
// 355: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35a: athrow
// 35b: aload 52
// 35d: instanceof net/minecraft/class_1686
// 360: iload 43
// 362: ifne 3e5
// 365: goto 372
// 368: ldc2_w -5409982638199016702
// 36b: lload 2
// 36c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 371: athrow
// 372: ifne 3d3
// 375: goto 382
// 378: ldc2_w -5409982638199016702
// 37b: lload 2
// 37c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 381: athrow
// 382: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 385: lload 22
// 387: invokespecial su/catlean/ka.z (J)Z
// 38a: goto 397
// 38d: ldc2_w -5409982638199016702
// 390: lload 2
// 391: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: athrow
// 397: iload 43
// 399: ifne 3be
// 39c: ifeq 3fe
// 39f: goto 3ac
// 3a2: ldc2_w -5409982638199016702
// 3a5: lload 2
// 3a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ab: athrow
// 3ac: aload 52
// 3ae: instanceof net/minecraft/class_1542
// 3b1: goto 3be
// 3b4: ldc2_w -5409982638199016702
// 3b7: lload 2
// 3b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bd: athrow
// 3be: iload 43
// 3c0: ifne 3e5
// 3c3: ifeq 3fe
// 3c6: goto 3d3
// 3c9: ldc2_w -5409982638199016702
// 3cc: lload 2
// 3cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d2: athrow
// 3d3: aload 52
// 3d5: invokevirtual net/minecraft/class_1297.method_24828 ()Z
// 3d8: goto 3e5
// 3db: ldc2_w -5409982638199016702
// 3de: lload 2
// 3df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: athrow
// 3e5: iload 43
// 3e7: ifne 3fb
// 3ea: ifne 3fe
// 3ed: goto 3fa
// 3f0: ldc2_w -5409982638199016702
// 3f3: lload 2
// 3f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f9: athrow
// 3fa: bipush 1
// 3fb: goto 3ff
// 3fe: bipush 0
// 3ff: ifeq 0e1
// 402: aload 48
// 404: aload 51
// 406: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 40b: pop
// 40c: iload 43
// 40e: ifeq 0e1
// 411: aload 48
// 413: checkcast java/util/List
// 416: nop
// 417: astore 44
// 419: aload 0
// 41a: lload 4
// 41c: invokespecial su/catlean/ka.E (J)Lsu/catlean/wk;
// 41f: getstatic su/catlean/wk.DEFAULT Lsu/catlean/wk;
// 422: if_acmpne 433
// 425: aconst_null
// 426: goto 47c
// 429: ldc2_w -5409982638199016702
// 42c: lload 2
// 42d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 432: athrow
// 433: new su/catlean/g7
// 436: dup
// 437: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 43a: dup
// 43b: sipush 29289
// 43e: ldc2_w 6032053207306760875
// 441: lload 2
// 442: lxor
// 443: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 448: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 44b: aload 44
// 44d: invokeinterface java/util/List.size ()I 1
// 452: sipush 28767
// 455: ldc2_w 3915648062196546416
// 458: lload 2
// 459: lxor
// 45a: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45f: imul
// 460: bipush 0
// 461: bipush 4
// 462: aconst_null
// 463: astore 34
// 465: istore 35
// 467: istore 36
// 469: istore 37
// 46b: astore 38
// 46d: lload 14
// 46f: aload 38
// 471: iload 37
// 473: iload 36
// 475: iload 35
// 477: aload 34
// 479: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 47c: astore 45
// 47e: aload 44
// 480: checkcast java/lang/Iterable
// 483: astore 46
// 485: bipush 0
// 486: istore 47
// 488: aload 46
// 48a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 48f: astore 48
// 491: aload 48
// 493: invokeinterface java/util/Iterator.hasNext ()Z 1
// 498: ifeq 4de
// 49b: aload 48
// 49d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4a2: astore 49
// 4a4: aload 49
// 4a6: checkcast net/minecraft/class_1297
// 4a9: astore 50
// 4ab: bipush 0
// 4ac: istore 51
// 4ae: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 4b1: aload 1
// 4b2: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 4b5: aload 50
// 4b7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 4ba: aload 50
// 4bc: aload 45
// 4be: iload 28
// 4c0: i2b
// 4c1: lload 29
// 4c3: invokespecial su/catlean/ka.H (Lnet/minecraft/class_4587;Lnet/minecraft/class_1297;Lsu/catlean/g7;BJ)V
// 4c6: nop
// 4c7: iload 43
// 4c9: ifne 4df
// 4cc: iload 43
// 4ce: ifeq 491
// 4d1: goto 4de
// 4d4: ldc2_w -5409982638199016702
// 4d7: lload 2
// 4d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4dd: athrow
// 4de: nop
// 4df: lload 6
// 4e1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4e4: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 4e7: invokestatic su/catlean/n1.o ()Lnet/minecraft/class_2960;
// 4ea: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 4ed: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 4f0: dup
// 4f1: sipush 2307
// 4f4: ldc2_w 2063293922290108870
// 4f7: lload 2
// 4f8: lxor
// 4f9: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 501: astore 46
// 503: lload 6
// 505: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 508: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 50b: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 50e: dup
// 50f: sipush 32114
// 512: ldc2_w 8228904618274192773
// 515: lload 2
// 516: lxor
// 517: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 51f: astore 47
// 521: aload 1
// 522: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 525: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 528: aload 47
// 52a: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 52d: fneg
// 52e: ldc 180.0
// 530: fadd
// 531: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 536: checkcast org/joml/Quaternionfc
// 539: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 53c: aload 1
// 53d: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 540: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 543: aload 47
// 545: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 548: fneg
// 549: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 54e: checkcast org/joml/Quaternionfc
// 551: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 554: iload 43
// 556: ifne 607
// 559: aload 0
// 55a: lload 4
// 55c: invokespecial su/catlean/ka.E (J)Lsu/catlean/wk;
// 55f: getstatic su/catlean/wk.DOT Lsu/catlean/wk;
// 562: if_acmpne 600
// 565: goto 572
// 568: ldc2_w -5409982638199016702
// 56b: lload 2
// 56c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 571: athrow
// 572: aload 45
// 574: dup
// 575: ifnull 5ff
// 578: goto 585
// 57b: ldc2_w -5409982638199016702
// 57e: lload 2
// 57f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 584: athrow
// 585: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 588: invokevirtual su/catlean/b6.S ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 58b: lload 6
// 58d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 590: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 593: dup
// 594: sipush 663
// 597: ldc2_w 8136940809147187790
// 59a: lload 2
// 59b: lxor
// 59c: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5a4: aconst_null
// 5a5: aload 1
// 5a6: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 5a9: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 5ac: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 5af: aconst_null
// 5b0: sipush 27060
// 5b3: ldc2_w 1971823190501779797
// 5b6: lload 2
// 5b7: lxor
// 5b8: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5bd: aload 46
// 5bf: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 5c2: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 5c5: sipush 3202
// 5c8: ldc2_w 7789415038475044771
// 5cb: lload 2
// 5cc: lxor
// 5cd: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d2: aconst_null
// 5d3: astore 34
// 5d5: istore 35
// 5d7: astore 36
// 5d9: astore 37
// 5db: astore 38
// 5dd: astore 39
// 5df: astore 40
// 5e1: astore 41
// 5e3: astore 42
// 5e5: lload 24
// 5e7: aload 42
// 5e9: aload 41
// 5eb: aload 40
// 5ed: aload 39
// 5ef: aload 38
// 5f1: aload 37
// 5f3: aload 36
// 5f5: iload 35
// 5f7: aload 34
// 5f9: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 5fc: goto 600
// 5ff: pop
// 600: aload 1
// 601: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 604: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 607: return
}

@Flow
private final void X(EntityRemove param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ka.a J
// 003: ldc2_w 76121351747804
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 81406243844190
// 00d: lxor
// 00e: dup2
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 8
// 018: lshl
// 019: bipush 8
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 99778121687261
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 71008004031590
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 40801475501621
// 031: lxor
// 032: lstore 11
// 034: pop2
// 035: ldc2_w 7104625407726497229
// 038: lload 2
// 039: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: istore 14
// 040: aload 0
// 041: lload 9
// 043: invokespecial su/catlean/ka.t (J)Z
// 046: iload 14
// 048: ifeq 06f
// 04b: ifeq 134
// 04e: goto 05b
// 051: ldc2_w 7195530541610443826
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 05f: instanceof net/minecraft/class_1684
// 062: goto 06f
// 065: ldc2_w 7195530541610443826
// 068: lload 2
// 069: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: athrow
// 06f: iload 14
// 071: ifeq 091
// 074: ifeq 134
// 077: goto 084
// 07a: ldc2_w 7195530541610443826
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: sipush 13805
// 087: ldc2_w 1443707971693963750
// 08a: lload 2
// 08b: lxor
// 08c: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: istore 15
// 093: bipush 0
// 094: istore 16
// 096: iload 16
// 098: iload 15
// 09a: if_icmpge 134
// 09d: iload 16
// 09f: istore 17
// 0a1: bipush 0
// 0a2: istore 18
// 0a4: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 0a7: new su/catlean/bk
// 0aa: dup
// 0ab: getstatic su/catlean/gi.FIREFLY Lsu/catlean/gi;
// 0ae: getstatic su/catlean/ka.F Lsu/catlean/ka;
// 0b1: aload 1
// 0b2: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 0b5: dup
// 0b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0b9: astore 13
// 0bb: iload 4
// 0bd: i2b
// 0be: lload 5
// 0c0: aload 13
// 0c2: invokevirtual su/catlean/ka.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0c5: fconst_0
// 0c6: lload 11
// 0c8: ldc 0.25
// 0ca: sipush 6526
// 0cd: ldc2_w 4600146126394475888
// 0d0: lload 2
// 0d1: lxor
// 0d2: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: new net/minecraft/class_243
// 0da: dup
// 0db: invokestatic java/lang/Math.random ()D
// 0de: fconst_2
// 0df: f2d
// 0e0: ddiv
// 0e1: ldc 0.25
// 0e3: f2d
// 0e4: dsub
// 0e5: invokestatic java/lang/Math.random ()D
// 0e8: ldc 4.0
// 0ea: f2d
// 0eb: ddiv
// 0ec: invokestatic java/lang/Math.random ()D
// 0ef: fconst_2
// 0f0: f2d
// 0f1: ddiv
// 0f2: ldc 0.25
// 0f4: f2d
// 0f5: dsub
// 0f6: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0f9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0fc: iload 17
// 0fe: sipush 19154
// 101: ldc2_w 4806224176292763339
// 104: lload 2
// 105: lxor
// 106: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: imul
// 10c: lload 7
// 10e: dup2_x1
// 10f: pop2
// 110: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 113: fconst_0
// 114: fconst_0
// 115: bipush 0
// 116: sipush 21777
// 119: ldc2_w 8797343154815928604
// 11c: lload 2
// 11d: lxor
// 11e: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: aconst_null
// 124: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 127: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 12a: pop
// 12b: nop
// 12c: iinc 16 1
// 12f: iload 14
// 131: ifne 096
// 134: return
}

private final void H(class_4587 param1, class_1297 param2, g7 param3, byte param4, long param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 4
// 002: i2l
// 003: bipush 56
// 005: lshl
// 006: lload 5
// 008: bipush 8
// 00a: lshl
// 00b: bipush 8
// 00d: lushr
// 00e: lor
// 00f: getstatic su/catlean/ka.a J
// 012: lxor
// 013: lstore 7
// 015: lload 7
// 017: dup2
// 018: ldc2_w 32937754878268
// 01b: lxor
// 01c: lstore 9
// 01e: dup2
// 01f: ldc2_w 100247869833722
// 022: lxor
// 023: dup2
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 11
// 02a: dup2
// 02b: bipush 16
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 12
// 034: dup2
// 035: bipush 48
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 13
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 72230218713833
// 043: lxor
// 044: dup2
// 045: bipush 56
// 047: lushr
// 048: l2i
// 049: istore 14
// 04b: dup2
// 04c: bipush 8
// 04e: lshl
// 04f: bipush 8
// 051: lushr
// 052: lstore 15
// 054: pop2
// 055: dup2
// 056: ldc2_w 25505985322141
// 059: lxor
// 05a: dup2
// 05b: bipush 32
// 05d: lushr
// 05e: l2i
// 05f: istore 17
// 061: dup2
// 062: bipush 32
// 064: lshl
// 065: bipush 48
// 067: lushr
// 068: l2i
// 069: istore 18
// 06b: dup2
// 06c: bipush 48
// 06e: lshl
// 06f: bipush 48
// 071: lushr
// 072: l2i
// 073: istore 19
// 075: pop2
// 076: dup2
// 077: ldc2_w 65055434519181
// 07a: lxor
// 07b: dup2
// 07c: bipush 48
// 07e: lushr
// 07f: l2i
// 080: istore 20
// 082: dup2
// 083: bipush 16
// 085: lshl
// 086: bipush 16
// 088: lushr
// 089: lstore 21
// 08b: pop2
// 08c: dup2
// 08d: ldc2_w 90779596422897
// 090: lxor
// 091: lstore 23
// 093: dup2
// 094: ldc2_w 89094026140266
// 097: lxor
// 098: lstore 25
// 09a: dup2
// 09b: ldc2_w 36194189898831
// 09e: lxor
// 09f: lstore 27
// 0a1: dup2
// 0a2: ldc2_w 76755819845942
// 0a5: lxor
// 0a6: lstore 29
// 0a8: dup2
// 0a9: ldc2_w 98744227041318
// 0ac: lxor
// 0ad: lstore 31
// 0af: dup2
// 0b0: ldc2_w 30638572436477
// 0b3: lxor
// 0b4: dup2
// 0b5: bipush 48
// 0b7: lushr
// 0b8: l2i
// 0b9: istore 33
// 0bb: dup2
// 0bc: bipush 16
// 0be: lshl
// 0bf: bipush 32
// 0c1: lushr
// 0c2: l2i
// 0c3: istore 34
// 0c5: dup2
// 0c6: bipush 48
// 0c8: lshl
// 0c9: bipush 48
// 0cb: lushr
// 0cc: l2i
// 0cd: istore 35
// 0cf: pop2
// 0d0: dup2
// 0d1: ldc2_w 38466062240488
// 0d4: lxor
// 0d5: lstore 36
// 0d7: pop2
// 0d8: ldc2_w 1742814518816855930
// 0db: lload 7
// 0dd: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: aload 2
// 0e3: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 0e6: dup
// 0e7: sipush 20559
// 0ea: ldc2_w 6480046007020911933
// 0ed: lload 7
// 0ef: lxor
// 0f0: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f8: astore 42
// 0fa: aload 0
// 0fb: iload 14
// 0fd: i2b
// 0fe: lload 15
// 100: aload 2
// 101: invokevirtual su/catlean/ka.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 104: astore 43
// 106: bipush 0
// 107: istore 44
// 109: aconst_null
// 10a: astore 45
// 10c: bipush 0
// 10d: istore 46
// 10f: istore 41
// 111: iload 46
// 113: sipush 10951
// 116: ldc2_w 6390317297825320038
// 119: lload 7
// 11b: lxor
// 11c: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: if_icmpge 75c
// 124: aload 43
// 126: astore 45
// 128: lload 27
// 12a: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 12d: aload 43
// 12f: checkcast net/minecraft/class_2374
// 132: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 135: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 138: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 13b: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
// 13e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 141: iload 41
// 143: lload 5
// 145: lconst_0
// 146: lcmp
// 147: ifle 179
// 14a: ifeq 170
// 14d: ifeq 1bc
// 150: goto 15e
// 153: ldc2_w 1832018780500418181
// 156: lload 7
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: aload 2
// 15f: instanceof net/minecraft/class_1685
// 162: goto 170
// 165: ldc2_w 1832018780500418181
// 168: lload 7
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: lload 5
// 172: lconst_0
// 173: lcmp
// 174: iflt 1a2
// 177: iload 41
// 179: ifeq 1a2
// 17c: ifeq 19e
// 17f: goto 18d
// 182: ldc2_w 1832018780500418181
// 185: lload 7
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: ldc2_w 0.99
// 190: goto 1bf
// 193: ldc2_w 1832018780500418181
// 196: lload 7
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: aload 2
// 19f: instanceof net/minecraft/class_1684
// 1a2: ifeq 1b6
// 1a5: ldc2_w 0.8
// 1a8: goto 1bf
// 1ab: ldc2_w 1832018780500418181
// 1ae: lload 7
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: ldc2_w 0.6
// 1b9: goto 1bf
// 1bc: ldc2_w 0.99
// 1bf: dstore 47
// 1c1: aload 42
// 1c3: dconst_0
// 1c4: aload 2
// 1c5: invokevirtual net/minecraft/class_1297.method_56989 ()D
// 1c8: dneg
// 1c9: dconst_0
// 1ca: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 1cd: dup
// 1ce: sipush 7866
// 1d1: ldc2_w 2999026310803895267
// 1d4: lload 7
// 1d6: lxor
// 1d7: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1df: astore 42
// 1e1: aload 42
// 1e3: dload 47
// 1e5: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 1e8: dup
// 1e9: sipush 32395
// 1ec: ldc2_w 7793390565057156062
// 1ef: lload 7
// 1f1: lxor
// 1f2: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1fa: astore 42
// 1fc: aload 43
// 1fe: aload 42
// 200: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 203: dup
// 204: sipush 5740
// 207: ldc2_w 7659736122598570806
// 20a: lload 7
// 20c: lxor
// 20d: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 215: astore 43
// 217: lload 27
// 219: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 21c: new net/minecraft/class_3959
// 21f: dup
// 220: aload 45
// 222: aload 43
// 224: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
// 227: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 22a: lload 36
// 22c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22f: checkcast net/minecraft/class_1297
// 232: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 235: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
// 238: dup
// 239: sipush 21164
// 23c: ldc2_w 2884319936607322070
// 23f: lload 7
// 241: lxor
// 242: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 247: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 24a: astore 49
// 24c: aload 49
// 24e: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 251: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
// 254: iload 4
// 256: iflt 285
// 259: iload 41
// 25b: ifeq 285
// 25e: if_acmpeq 288
// 261: goto 26f
// 264: ldc2_w 1832018780500418181
// 267: lload 7
// 269: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: athrow
// 26f: aload 49
// 271: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 274: getstatic net/minecraft/class_239$class_240.field_1331 Lnet/minecraft/class_239$class_240;
// 277: goto 285
// 27a: ldc2_w 1832018780500418181
// 27d: lload 7
// 27f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: athrow
// 285: if_acmpne 50d
// 288: aload 0
// 289: iload 41
// 28b: iload 4
// 28d: iflt 2cc
// 290: ifeq 2c9
// 293: goto 2a1
// 296: ldc2_w 1832018780500418181
// 299: lload 7
// 29b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a0: athrow
// 2a1: lload 9
// 2a3: invokespecial su/catlean/ka.E (J)Lsu/catlean/wk;
// 2a6: getstatic su/catlean/wk.DOT Lsu/catlean/wk;
// 2a9: if_acmpne 3a2
// 2ac: goto 2ba
// 2af: ldc2_w 1832018780500418181
// 2b2: lload 7
// 2b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: athrow
// 2ba: aload 0
// 2bb: goto 2c9
// 2be: ldc2_w 1832018780500418181
// 2c1: lload 7
// 2c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c8: athrow
// 2c9: iload 20
// 2cb: i2s
// 2cc: lload 21
// 2ce: invokespecial su/catlean/ka.H (SJ)Z
// 2d1: iload 41
// 2d3: ifeq 411
// 2d6: ifeq 40b
// 2d9: goto 2e7
// 2dc: ldc2_w 1832018780500418181
// 2df: lload 7
// 2e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: athrow
// 2e7: aload 2
// 2e8: invokevirtual net/minecraft/class_1297.method_24828 ()Z
// 2eb: iload 41
// 2ed: lload 5
// 2ef: lconst_0
// 2f0: lcmp
// 2f1: iflt 418
// 2f4: ifeq 411
// 2f7: goto 305
// 2fa: ldc2_w 1832018780500418181
// 2fd: lload 7
// 2ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 304: athrow
// 305: ifne 40b
// 308: goto 316
// 30b: ldc2_w 1832018780500418181
// 30e: lload 7
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 319: astore 50
// 31b: invokestatic su/catlean/n1.o ()Lnet/minecraft/class_2960;
// 31e: astore 51
// 320: aload 49
// 322: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 325: dconst_0
// 326: ldc2_w 0.01
// 329: dconst_0
// 32a: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 32d: dup
// 32e: sipush 5740
// 331: ldc2_w 7659736122598570806
// 334: lload 7
// 336: lxor
// 337: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 33f: astore 52
// 341: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 344: lload 25
// 346: bipush 0
// 347: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 34a: astore 53
// 34c: getstatic su/catlean/gi.CIRCLE Lsu/catlean/gi;
// 34f: invokevirtual su/catlean/gi.o ()F
// 352: fstore 54
// 354: getstatic su/catlean/gi.CIRCLE Lsu/catlean/gi;
// 357: invokevirtual su/catlean/gi.L ()F
// 35a: fstore 55
// 35c: getstatic su/catlean/gi.CIRCLE Lsu/catlean/gi;
// 35f: invokevirtual su/catlean/gi.v ()F
// 362: fstore 56
// 364: getstatic su/catlean/gi.CIRCLE Lsu/catlean/gi;
// 367: invokevirtual su/catlean/gi.w ()F
// 36a: fstore 57
// 36c: aload 50
// 36e: aload 51
// 370: aload 52
// 372: fconst_0
// 373: ldc 90.0
// 375: fconst_0
// 376: fconst_1
// 377: lload 29
// 379: aload 53
// 37b: bipush 0
// 37c: aconst_null
// 37d: fload 54
// 37f: fload 56
// 381: fload 55
// 383: fload 57
// 385: bipush 0
// 386: sipush 8294
// 389: ldc2_w 7752969872709158621
// 38c: lload 7
// 38e: lxor
// 38f: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 394: aconst_null
// 395: invokestatic su/catlean/zi.e (Lsu/catlean/zi;Lnet/minecraft/class_2960;Lnet/minecraft/class_243;FFFFJLjava/awt/Color;ZLsu/catlean/g7;FFFFZILjava/lang/Object;)V
// 398: iload 41
// 39a: iload 4
// 39c: iflt 3fc
// 39f: ifne 40b
// 3a2: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 3a5: iload 11
// 3a7: i2s
// 3a8: aload 45
// 3aa: aload 49
// 3ac: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 3af: dconst_0
// 3b0: ldc2_w 0.01
// 3b3: dconst_0
// 3b4: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 3b7: dup
// 3b8: sipush 5740
// 3bb: ldc2_w 7659736122598570806
// 3be: lload 7
// 3c0: lxor
// 3c1: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3c9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3cc: iload 46
// 3ce: bipush 74
// 3d0: ldc2_w 4461123727683430132
// 3d3: lload 7
// 3d5: lxor
// 3d6: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3db: imul
// 3dc: lload 25
// 3de: dup2_x1
// 3df: pop2
// 3e0: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 3e3: aconst_null
// 3e4: bipush 0
// 3e5: iload 12
// 3e7: iload 13
// 3e9: i2c
// 3ea: sipush 306
// 3ed: ldc2_w 8932871966595426199
// 3f0: lload 7
// 3f2: lxor
// 3f3: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f8: aconst_null
// 3f9: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// 3fc: pop
// 3fd: goto 40b
// 400: ldc2_w 1832018780500418181
// 403: lload 7
// 405: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40a: athrow
// 40b: aload 0
// 40c: lload 31
// 40e: invokespecial su/catlean/ka.T (J)Z
// 411: iload 4
// 413: iflt 458
// 416: iload 41
// 418: ifeq 458
// 41b: ifeq 501
// 41e: goto 42c
// 421: ldc2_w 1832018780500418181
// 424: lload 7
// 426: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42b: athrow
// 42c: aload 2
// 42d: iload 41
// 42f: lload 5
// 431: lconst_0
// 432: lcmp
// 433: iflt 479
// 436: ifeq 477
// 439: goto 447
// 43c: ldc2_w 1832018780500418181
// 43f: lload 7
// 441: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 446: athrow
// 447: instanceof net/minecraft/class_1684
// 44a: goto 458
// 44d: ldc2_w 1832018780500418181
// 450: lload 7
// 452: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 457: athrow
// 458: lload 5
// 45a: lconst_0
// 45b: lcmp
// 45c: iflt 503
// 45f: ifeq 501
// 462: aload 2
// 463: checkcast net/minecraft/class_1684
// 466: invokevirtual net/minecraft/class_1684.method_24921 ()Lnet/minecraft/class_1297;
// 469: goto 477
// 46c: ldc2_w 1832018780500418181
// 46f: lload 7
// 471: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 476: athrow
// 477: iload 41
// 479: ifeq 4a2
// 47c: ifnull 501
// 47f: goto 48d
// 482: ldc2_w 1832018780500418181
// 485: lload 7
// 487: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48c: athrow
// 48d: aload 2
// 48e: checkcast net/minecraft/class_1684
// 491: invokevirtual net/minecraft/class_1684.method_24921 ()Lnet/minecraft/class_1297;
// 494: goto 4a2
// 497: ldc2_w 1832018780500418181
// 49a: lload 7
// 49c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a1: athrow
// 4a2: instanceof net/minecraft/class_1657
// 4a5: iload 4
// 4a7: iflt 503
// 4aa: ifeq 501
// 4ad: aload 0
// 4ae: aload 1
// 4af: aload 49
// 4b1: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 4b4: dup
// 4b5: sipush 13863
// 4b8: ldc2_w 57348756204395377
// 4bb: lload 7
// 4bd: lxor
// 4be: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4c6: aload 2
// 4c7: checkcast net/minecraft/class_1684
// 4ca: invokevirtual net/minecraft/class_1684.method_24921 ()Lnet/minecraft/class_1297;
// 4cd: dup
// 4ce: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 4d1: checkcast net/minecraft/class_1657
// 4d4: aload 2
// 4d5: getfield net/minecraft/class_1297.field_6012 I
// 4d8: i2f
// 4d9: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 4dc: iload 17
// 4de: iload 18
// 4e0: i2c
// 4e1: iload 19
// 4e3: invokevirtual su/catlean/zi.n (ICI)F
// 4e6: fadd
// 4e7: aload 2
// 4e8: getfield net/minecraft/class_1297.field_6012 I
// 4eb: iload 44
// 4ed: iadd
// 4ee: i2f
// 4ef: fdiv
// 4f0: fstore 38
// 4f2: astore 39
// 4f4: astore 40
// 4f6: lload 23
// 4f8: aload 40
// 4fa: aload 39
// 4fc: fload 38
// 4fe: invokespecial su/catlean/ka.Q (Lnet/minecraft/class_4587;JLnet/minecraft/class_243;Lnet/minecraft/class_1657;F)V
// 501: iload 41
// 503: lload 5
// 505: lconst_0
// 506: lcmp
// 507: iflt 516
// 50a: ifne 75c
// 50d: aload 43
// 50f: getfield net/minecraft/class_243.field_1351 D
// 512: ldc2_w -65.0
// 515: dcmpg
// 516: iload 41
// 518: iload 4
// 51a: iflt 558
// 51d: ifeq 556
// 520: goto 52e
// 523: ldc2_w 1832018780500418181
// 526: lload 7
// 528: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52d: athrow
// 52e: ifle 75c
// 531: goto 53f
// 534: ldc2_w 1832018780500418181
// 537: lload 7
// 539: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53e: athrow
// 53f: aload 2
// 540: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 543: getfield net/minecraft/class_243.field_1352 D
// 546: dconst_0
// 547: dcmpg
// 548: goto 556
// 54b: ldc2_w 1832018780500418181
// 54e: lload 7
// 550: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 555: athrow
// 556: iload 41
// 558: ifeq 56d
// 55b: ifne 570
// 55e: goto 56c
// 561: ldc2_w 1832018780500418181
// 564: lload 7
// 566: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56b: athrow
// 56c: bipush 1
// 56d: goto 571
// 570: bipush 0
// 571: lload 5
// 573: lconst_0
// 574: lcmp
// 575: iflt 5f1
// 578: ifeq 5ec
// 57b: aload 2
// 57c: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 57f: getfield net/minecraft/class_243.field_1351 D
// 582: dconst_0
// 583: dcmpg
// 584: iload 41
// 586: ifeq 5a9
// 589: goto 597
// 58c: ldc2_w 1832018780500418181
// 58f: lload 7
// 591: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 596: athrow
// 597: ifne 5ac
// 59a: goto 5a8
// 59d: ldc2_w 1832018780500418181
// 5a0: lload 7
// 5a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a7: athrow
// 5a8: bipush 1
// 5a9: goto 5ad
// 5ac: bipush 0
// 5ad: lload 5
// 5af: lconst_0
// 5b0: lcmp
// 5b1: ifle 5f1
// 5b4: ifeq 5ec
// 5b7: aload 2
// 5b8: invokevirtual net/minecraft/class_1297.method_18798 ()Lnet/minecraft/class_243;
// 5bb: getfield net/minecraft/class_243.field_1350 D
// 5be: dconst_0
// 5bf: dcmpg
// 5c0: iload 41
// 5c2: ifeq 5e5
// 5c5: goto 5d3
// 5c8: ldc2_w 1832018780500418181
// 5cb: lload 7
// 5cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d2: athrow
// 5d3: ifne 5e8
// 5d6: goto 5e4
// 5d9: ldc2_w 1832018780500418181
// 5dc: lload 7
// 5de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e3: athrow
// 5e4: bipush 1
// 5e5: goto 5e9
// 5e8: bipush 0
// 5e9: ifne 754
// 5ec: iinc 44 1
// 5ef: iload 46
// 5f1: i2f
// 5f2: ldc 8.0
// 5f4: fdiv
// 5f5: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 5f8: checkcast java/lang/Comparable
// 5fb: fconst_0
// 5fc: fconst_1
// 5fd: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 600: invokestatic kotlin/ranges/RangesKt.coerceIn (Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;
// 603: checkcast java/lang/Number
// 606: invokevirtual java/lang/Number.floatValue ()F
// 609: fstore 50
// 60b: iload 46
// 60d: bipush 1
// 60e: iadd
// 60f: i2f
// 610: ldc 8.0
// 612: fdiv
// 613: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 616: checkcast java/lang/Comparable
// 619: fconst_0
// 61a: fconst_1
// 61b: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 61e: invokestatic kotlin/ranges/RangesKt.coerceIn (Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;
// 621: checkcast java/lang/Number
// 624: invokevirtual java/lang/Number.floatValue ()F
// 627: fstore 51
// 629: iload 41
// 62b: iload 4
// 62d: iflt 6c5
// 630: ifeq 6c3
// 633: aload 0
// 634: lload 9
// 636: invokespecial su/catlean/ka.E (J)Lsu/catlean/wk;
// 639: getstatic su/catlean/wk.DOT Lsu/catlean/wk;
// 63c: if_acmpne 6cf
// 63f: goto 64d
// 642: ldc2_w 1832018780500418181
// 645: lload 7
// 647: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64c: athrow
// 64d: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 650: invokestatic su/catlean/n1.o ()Lnet/minecraft/class_2960;
// 653: aload 43
// 655: fconst_0
// 656: fconst_0
// 657: fconst_0
// 658: ldc 0.3
// 65a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 65d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 660: iload 46
// 662: bipush 74
// 664: ldc2_w 4461123727683430132
// 667: lload 7
// 669: lxor
// 66a: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66f: imul
// 670: lload 25
// 672: dup2_x1
// 673: pop2
// 674: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 677: iload 33
// 679: i2c
// 67a: iload 34
// 67c: fload 50
// 67e: iload 35
// 680: i2s
// 681: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 684: lload 29
// 686: dup2_x1
// 687: pop2
// 688: bipush 0
// 689: aload 3
// 68a: getstatic su/catlean/gi.FIREFLY Lsu/catlean/gi;
// 68d: invokevirtual su/catlean/gi.o ()F
// 690: getstatic su/catlean/gi.FIREFLY Lsu/catlean/gi;
// 693: invokevirtual su/catlean/gi.v ()F
// 696: getstatic su/catlean/gi.FIREFLY Lsu/catlean/gi;
// 699: invokevirtual su/catlean/gi.L ()F
// 69c: getstatic su/catlean/gi.FIREFLY Lsu/catlean/gi;
// 69f: invokevirtual su/catlean/gi.w ()F
// 6a2: bipush 0
// 6a3: sipush 27762
// 6a6: ldc2_w 8243365288272382660
// 6a9: lload 7
// 6ab: lxor
// 6ac: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b1: aconst_null
// 6b2: invokestatic su/catlean/zi.e (Lsu/catlean/zi;Lnet/minecraft/class_2960;Lnet/minecraft/class_243;FFFFJLjava/awt/Color;ZLsu/catlean/g7;FFFFZILjava/lang/Object;)V
// 6b5: goto 6c3
// 6b8: ldc2_w 1832018780500418181
// 6bb: lload 7
// 6bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c2: athrow
// 6c3: iload 41
// 6c5: lload 5
// 6c7: lconst_0
// 6c8: lcmp
// 6c9: ifle 759
// 6cc: ifne 754
// 6cf: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 6d2: iload 11
// 6d4: i2s
// 6d5: aload 45
// 6d7: aload 43
// 6d9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6dc: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 6df: iload 46
// 6e1: bipush 74
// 6e3: ldc2_w 4461123727683430132
// 6e6: lload 7
// 6e8: lxor
// 6e9: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ee: imul
// 6ef: lload 25
// 6f1: dup2_x1
// 6f2: pop2
// 6f3: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 6f6: iload 33
// 6f8: i2c
// 6f9: iload 34
// 6fb: fload 50
// 6fd: iload 35
// 6ff: i2s
// 700: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 703: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 706: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 709: iload 46
// 70b: bipush 74
// 70d: ldc2_w 4461123727683430132
// 710: lload 7
// 712: lxor
// 713: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 718: imul
// 719: lload 25
// 71b: dup2_x1
// 71c: pop2
// 71d: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 720: iload 33
// 722: i2c
// 723: iload 34
// 725: fload 51
// 727: iload 35
// 729: i2s
// 72a: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 72d: bipush 0
// 72e: iload 12
// 730: iload 13
// 732: i2c
// 733: sipush 30587
// 736: ldc2_w 3787893269842022860
// 739: lload 7
// 73b: lxor
// 73c: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 741: aconst_null
// 742: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// 745: pop
// 746: goto 754
// 749: ldc2_w 1832018780500418181
// 74c: lload 7
// 74e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 753: athrow
// 754: iinc 46 1
// 757: iload 41
// 759: ifne 111
// 75c: lload 5
// 75e: lconst_0
// 75f: lcmp
// 760: ifle 128
// 763: return
}

private final void Q(class_4587 param1, long param2, class_243 param4, class_1657 param5, float param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ka.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 102257858051744
// 00b: lxor
// 00c: lstore 7
// 00e: dup2
// 00f: ldc2_w 74800812929
// 012: lxor
// 013: lstore 9
// 015: dup2
// 016: ldc2_w 25125237962101
// 019: lxor
// 01a: lstore 11
// 01c: dup2
// 01d: ldc2_w 12703739980493
// 020: lxor
// 021: lstore 13
// 023: dup2
// 024: ldc2_w 36655608577811
// 027: lxor
// 028: lstore 15
// 02a: dup2
// 02b: ldc2_w 36728742031349
// 02e: lxor
// 02f: lstore 17
// 031: pop2
// 032: ldc2_w -201893383011159449
// 035: lload 2
// 036: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03b: istore 24
// 03d: iload 24
// 03f: ifeq 087
// 042: lload 17
// 044: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 047: aload 4
// 049: invokevirtual net/minecraft/class_746.method_5707 (Lnet/minecraft/class_243;)D
// 04c: dconst_1
// 04d: dcmpg
// 04e: ifge 069
// 051: goto 05e
// 054: ldc2_w -256246938600162408
// 057: lload 2
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: return
// 05f: ldc2_w -256246938600162408
// 062: lload 2
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 06c: aload 1
// 06d: aload 4
// 06f: aload 5
// 071: ldc 0.45
// 073: bipush 0
// 074: sipush 23775
// 077: ldc2_w 4382760294491135841
// 07a: lload 2
// 07b: lxor
// 07c: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: aconst_null
// 082: lload 15
// 084: invokestatic su/catlean/zi.Q (Lsu/catlean/zi;Lnet/minecraft/class_4587;Lnet/minecraft/class_243;Lnet/minecraft/class_1657;FZILjava/lang/Object;J)V
// 087: new su/catlean/g7
// 08a: dup
// 08b: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 08e: dup
// 08f: sipush 26427
// 092: ldc2_w 5501978762576637763
// 095: lload 2
// 096: lxor
// 097: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 09f: sipush 5269
// 0a2: ldc2_w 1166393149552187189
// 0a5: lload 2
// 0a6: lxor
// 0a7: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: bipush 0
// 0ad: bipush 4
// 0ae: aconst_null
// 0af: astore 19
// 0b1: istore 20
// 0b3: istore 21
// 0b5: istore 22
// 0b7: astore 23
// 0b9: lload 7
// 0bb: aload 23
// 0bd: iload 22
// 0bf: iload 21
// 0c1: iload 20
// 0c3: aload 19
// 0c5: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 0c8: astore 25
// 0ca: ldc 1.8
// 0cc: fstore 26
// 0ce: fload 6
// 0d0: fload 26
// 0d2: fmul
// 0d3: fstore 27
// 0d5: new net/minecraft/class_238
// 0d8: dup
// 0d9: aload 4
// 0db: getfield net/minecraft/class_243.field_1352 D
// 0de: ldc 0.6
// 0e0: f2d
// 0e1: dsub
// 0e2: aload 4
// 0e4: getfield net/minecraft/class_243.field_1351 D
// 0e7: fload 27
// 0e9: f2d
// 0ea: dadd
// 0eb: aload 4
// 0ed: getfield net/minecraft/class_243.field_1350 D
// 0f0: ldc 0.6
// 0f2: f2d
// 0f3: dsub
// 0f4: aload 4
// 0f6: getfield net/minecraft/class_243.field_1352 D
// 0f9: ldc 0.6
// 0fb: f2d
// 0fc: dadd
// 0fd: aload 4
// 0ff: getfield net/minecraft/class_243.field_1351 D
// 102: fload 26
// 104: f2d
// 105: dadd
// 106: ldc 0.5
// 108: f2d
// 109: dadd
// 10a: aload 4
// 10c: getfield net/minecraft/class_243.field_1350 D
// 10f: ldc 0.6
// 111: f2d
// 112: dadd
// 113: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 116: astore 28
// 118: getstatic su/catlean/cz.H Lsu/catlean/cz;
// 11b: lload 11
// 11d: aload 25
// 11f: aload 28
// 121: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 124: dup
// 125: sipush 23146
// 128: ldc2_w 4777050677961822728
// 12b: lload 2
// 12c: lxor
// 12d: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 135: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 138: dup
// 139: sipush 1445
// 13c: ldc2_w 1667217302081162715
// 13f: lload 2
// 140: lxor
// 141: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ka.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 149: invokevirtual su/catlean/cz.a (JLsu/catlean/g7;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;)V
// 14c: lload 13
// 14e: aload 25
// 150: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 153: invokevirtual su/catlean/b6.C ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 156: aconst_null
// 157: aconst_null
// 158: aload 1
// 159: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 15c: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 15f: aconst_null
// 160: aconst_null
// 161: sipush 3283
// 164: ldc2_w 7320135062297595761
// 167: lload 2
// 168: lxor
// 169: invokedynamic l (IJ)I bsm=su/catlean/ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: aconst_null
// 16f: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 172: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 175: aload 1
// 176: aload 4
// 178: aload 5
// 17a: lload 9
// 17c: fconst_1
// 17d: bipush 1
// 17e: invokevirtual su/catlean/zi.D (Lnet/minecraft/class_4587;Lnet/minecraft/class_243;Lnet/minecraft/class_1657;JFZ)V
// 181: return
}

private static final boolean h() {
long var0 = a ^ 45085683419129L;
long var10001 = var0 ^ 4756951135286L;
int var2 = (int)((var0 ^ 4756951135286L) >>> 48);
int var3 = (int)((var0 ^ 4756951135286L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);
return F.F((short)var2, (char)var3, var4);
}

private static final boolean j() {
long var0 = a ^ 123264264075078L;
long var10001 = var0 ^ 102570108945545L;
int var2 = (int)((var0 ^ 102570108945545L) >>> 48);
int var3 = (int)((var0 ^ 102570108945545L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);
return F.F((short)var2, (char)var3, var4);
}

static {
long var20 = a ^ 40830073068044L;
long var22 = var20 ^ 2448662701015L;
long var24 = var20 ^ 86654267230002L;
long var10001 = var20 ^ 79567342572032L;
int var26 = (int)((var20 ^ 79567342572032L) >>> 48);
int var27 = (int)((var20 ^ 79567342572032L) << 16 >>> 32);
int var28 = (int)(var10001 << 48 >>> 48);
long var29 = var20 ^ 124721635699484L;
long var31 = var20 ^ 17259232509318L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[55];
int var16 = 0;
String var15 = "+%])~\u001fÍ\fmX\u0081\u0003qæ^«:déH\u0017RUu\u009a\u001b\u0086á¦@\u0019\u008fJ®ß |éÐè\u0010×qí\u0082\u00025aZpµòÄÆ\nÉS Ò\u0011%F<Z&Ö¥±\u009fÔtáýÒsaû]ëÊi}\u0007R?OF¶\fÒ ©\u008cÝ\u009f4XÍ\u001b\u000fèS\u009eë}Í|\u001bn¯¶P ¢õ¦¿\u0080QGÞõ\u0011 M\t5Ñ©\u001dÚ9¥d5u$]\u009bèÐÌ0é\u008aY\u0007\u0019§¤!JôÛ\u00adF \tÆî3kã·?\u009f<\u00ad2¡åªA ²\u0002\u009c).Ëg=:'Ç\u000f\u0092Ä\u0099\u0010ü¯Íÿ¤!s°Ö)¿fÈ¶ Ø ×æB¹Iã% Üb\u0093-¢mRp\u009e\u001fß\u008cuj@\u0007x£©+´\u00ad\u0099¢8RåT\te\u0090A¦{\u00112\u0015s¼ç¨\u00ad\u0013ÖÖ\u001e¼åØ\u009aê¾\u0000E\"ûaÁïA?ÕÚ©\u0086¿3y¨ü]ûU>\u0018ï\u001e®%Å?\u0018\u0002]\\\u0080g\u0083ÌR1½¥¸Í\u0083¿åÐ\u0097õéå\u0085j_\u0010:Á¤hW\u0096Ký_\rP\u0089;&\u008d[\u0010\u009e\u008bæúó\u008bÎB\u008dåº¼®$¬F\u0018\u008a\u001drF\u009fe/À\u0098Û©Q\u0010CÍaaÿ\u0092\bµ´\u001b\u0006 \u0001À É\t!\u0093\u009eó®ë\u0095\u0005Õ\u000e,\u008eÂ»¸\u0005\u009eVÝØ-9¼\u009e}0\u0092\u0010Ã\u001càÆ=7\u001dLl\\ÿÑê\u0081sb\u0018\u008b8Õ~\u0082Dð\u001b³®ÐD\fh!·\u00ad\u0096Æ\f\u0004\rÂÇ\u0018uEøçíE\u0085\u0014\u0019\u0006\u0010ý®í\u0091úÈ÷i\u000f\u001e\u000e\u0092£\u0010¯W\u008630\u008c}58É¨\u000bµ\u0007W\u0090\u0018cA§\u00967ÙÂ\u000bÕ2U\u0084\u0093\u0088\u008aW¯AÙ\u0080iexs(\u001fT\u001f¸°ÿóUS!ov|ButÉ¸GÞ\u0017K,è .ùÞúÙ_oïðNÌ¸Ö¢ô(ç4$|\u0086@\u00ad\u008a;\u0083áG\u001cPz\u001cx=\u008f`éÐV»¥.zý\u0097{\u009c>î\u0007?;Ø\u0095ûú8!¸Õ²àÊÖ¤¹K\u009f\u0084râ«Õ\u0085lç7#æ&þÍ×ÖD\u0093íj»Ñø7Ø¬¤\u0019\t\u000eÙÉzÿé\u0097~9\u0096«¢·\u0007\u001a\u0015\u0010\u0097\u0001óã0À\u0080\"Gd©ïÈd1H \u0080\u0010Ç\u001c\u0018iOë\\ù©ÏA®:é¯\u0010\u0097\u0087£¦ù\u001c\u0002þó¸±\u0007\\# \u0012\u001f\u008bEAå%ªúü2Z\u0086S\u008bµ\u0012\u00adORZ\u009d4Ø\fQ}£Ñ¢\u0091ß\u0018\u0086Ì\u001e\u0095Ì;|_\u00845¯¡`å)îB.Ô2\u008dÈCG(Á,\u0005n\u0011³\nbrÍ\u0007\u009e\u0003Çí¿lM0\u0086yT°[Ö÷É\bæH':\u009c\u0004\u001få·x:¬\u0010-ý\u0084ª.Â\u0007üg4Z'Ä\u0004é\u0096 \r2Xø¼\u009f)Å\u0091YKÅ8\rK0÷yQÉ\u000fm~\u000e\u0095¤Û\u008a\\R\u0091Å\u0010U)\u0019 9ãAô0âTÐþ\fb\b\u0018ë\\Gí¶îÀUËý\u000fÝ¢\u0001Ç\u0018HÌ\u0013ª\u001aÁ\u0088\u0000\u0018\u000bÞx\u0099-\u001d\u0000j\u0004)\u0099YQ\u00ads+M¤n=·¥£\u0095(\u0092ÃF¯^w\u008b¤×ÈWS\u0087Ì Ê\u0018þ¦ò}è\u0000\u00ad¥\u0094x\u0017\u009e´Ð7Ln\u009a\u0019ÿi\u008d\u008a ÍÒ\u000e z-PVâ¿[òÞ\u0080ÿü<¥ t\u0010.f\u0080ð9Y±ë¸3f \u0007\u0007ÓÈØY2Dè\u0003\u001b/7©\u0013\u001cWc¢{Áëô½¿¢g\u0006\u0004º\u0085>Ô£ÁäÖ\u0085¨ý~êqx6\u0083ý\u0014î±@m\u001eêñ\u0007X¸bMi\u00adqæÆ\u0015Û@À\u0098\u0095_[\u001aQW5öî\\fÃUfd4u\u0088½-g~\u009c¡\u001bò\u0095SDÙÆ8³£m\u0017\u0003÷\u0006êP\u0098\u0019\fQãmõ\u0000!¿¡ÑÖl\u0012ÖáG%þÂ\u0014\u0088åû*\u0013$©\u0095ø\u009eº)\u0095`\u000e\u000b\u0088\u001c\u001fAwqß \u0096\u009cþ\u0010m¢kúV2,p\u008dy#SFN³#(\u001d¸\u0005F\u008d\tø\u00adCA¡ã\u009eû÷\u0014ä¬À0iÍÛ\u0082ñ.\u0084>\u0086\u0090¡¼.Öf\u000ekRnh(¤Ø×I¶\u00017ß\u001c\r±imê\té\u009c÷n`6ÝÈ\u0089=àOÂ\u008d|ØÖ«à79¡\u00057ñ(ôz5\u0081$ðF¼»q¨ÊkHf\u0010\u0091\tþCNÐ#;\u0001¨\u0002*ªX\u0083µ\u001fÄä\u0093ð_»\u0096\u0010\bÀE+ú\u0090jÅ»7\u0082\u008cÿZ\"3\u0010\u00133Æ\u008cÈk' b¡sZòÈ*n\u0010\u008f0Þ¨»\u001b\u0004%^h©hçP\u0087» \u0091©\u000e¸¶ß\u007f\u0000Í%1\u0096>óeÐ$\u008eÀ®×rU\u0018'Ù*\u007fsÙGÑ\u0018\u000f1\fCÌêãØÁ8\u009eù¦¨\u0089\t§AÀ©\u0087%\u001eí /ÙQ\u0004\u008f\u0099\u000eÇ\u0001¡ø\u0015¢F\u008aË²0ÃèVÇäÈð\u0018îôVj¥Ö\u0018\t\u0001@¢Ý\u0099D\u0002)¦[è!44¯\u009f\u00856Vêêg\u0081 \u008fz\u0089w\u0084Ð\u008aW±\f\u0087\u008d\u0093õPñÀ\u0010'Å%ß:ß\u009atÂ\u0018(ò8³8êK+û\u0003\u0017pàyB,bXlwÚhÌ\u0088\u0098Íç?§½\u0087Ðl¶\u0092©\u0082\u0088\u0002H¸w\u0014É~\u008e¯V¢C ÚHðÈwÅ\u0014\u001eh´ ¼qÆü<ßMjaâ¹îI\býÔJpµ\u0016ÇÕø`BX\u001fàB\u0084¯³ Ç\u0012¢½\u0097\\hRAÿ\u0080\u0018ºË,ïõË\u0018¥±;ßú^ô¢ü°\u0002\u0080Î(zxGòønNïx²\u00adä\u0091øP÷\u0094§ñßïÜ\u0016_g\u0086¨\u0001©s'\u0098b\u0096WóùÌu\u0012\u0018ÈÔrÂBa<\u0006\u0092)2¢\u0010ÒÅ\u0003Sñ9\u0015×cV^ ,\u0092¦\u001bYó!ç,(¤î5\u0014\u001a\u0099>\u008c\u0017\u0014ûÇ²B\u001776\fûè9Á";
int var17 = "+%])~\u001fÍ\fmX\u0081\u0003qæ^«:déH\u0017RUu\u009a\u001b\u0086á¦@\u0019\u008fJ®ß |éÐè\u0010×qí\u0082\u00025aZpµòÄÆ\nÉS Ò\u0011%F<Z&Ö¥±\u009fÔtáýÒsaû]ëÊi}\u0007R?OF¶\fÒ ©\u008cÝ\u009f4XÍ\u001b\u000fèS\u009eë}Í|\u001bn¯¶P ¢õ¦¿\u0080QGÞõ\u0011 M\t5Ñ©\u001dÚ9¥d5u$]\u009bèÐÌ0é\u008aY\u0007\u0019§¤!JôÛ\u00adF \tÆî3kã·?\u009f<\u00ad2¡åªA ²\u0002\u009c).Ëg=:'Ç\u000f\u0092Ä\u0099\u0010ü¯Íÿ¤!s°Ö)¿fÈ¶ Ø ×æB¹Iã% Üb\u0093-¢mRp\u009e\u001fß\u008cuj@\u0007x£©+´\u00ad\u0099¢8RåT\te\u0090A¦{\u00112\u0015s¼ç¨\u00ad\u0013ÖÖ\u001e¼åØ\u009aê¾\u0000E\"ûaÁïA?ÕÚ©\u0086¿3y¨ü]ûU>\u0018ï\u001e®%Å?\u0018\u0002]\\\u0080g\u0083ÌR1½¥¸Í\u0083¿åÐ\u0097õéå\u0085j_\u0010:Á¤hW\u0096Ký_\rP\u0089;&\u008d[\u0010\u009e\u008bæúó\u008bÎB\u008dåº¼®$¬F\u0018\u008a\u001drF\u009fe/À\u0098Û©Q\u0010CÍaaÿ\u0092\bµ´\u001b\u0006 \u0001À É\t!\u0093\u009eó®ë\u0095\u0005Õ\u000e,\u008eÂ»¸\u0005\u009eVÝØ-9¼\u009e}0\u0092\u0010Ã\u001càÆ=7\u001dLl\\ÿÑê\u0081sb\u0018\u008b8Õ~\u0082Dð\u001b³®ÐD\fh!·\u00ad\u0096Æ\f\u0004\rÂÇ\u0018uEøçíE\u0085\u0014\u0019\u0006\u0010ý®í\u0091úÈ÷i\u000f\u001e\u000e\u0092£\u0010¯W\u008630\u008c}58É¨\u000bµ\u0007W\u0090\u0018cA§\u00967ÙÂ\u000bÕ2U\u0084\u0093\u0088\u008aW¯AÙ\u0080iexs(\u001fT\u001f¸°ÿóUS!ov|ButÉ¸GÞ\u0017K,è .ùÞúÙ_oïðNÌ¸Ö¢ô(ç4$|\u0086@\u00ad\u008a;\u0083áG\u001cPz\u001cx=\u008f`éÐV»¥.zý\u0097{\u009c>î\u0007?;Ø\u0095ûú8!¸Õ²àÊÖ¤¹K\u009f\u0084râ«Õ\u0085lç7#æ&þÍ×ÖD\u0093íj»Ñø7Ø¬¤\u0019\t\u000eÙÉzÿé\u0097~9\u0096«¢·\u0007\u001a\u0015\u0010\u0097\u0001óã0À\u0080\"Gd©ïÈd1H \u0080\u0010Ç\u001c\u0018iOë\\ù©ÏA®:é¯\u0010\u0097\u0087£¦ù\u001c\u0002þó¸±\u0007\\# \u0012\u001f\u008bEAå%ªúü2Z\u0086S\u008bµ\u0012\u00adORZ\u009d4Ø\fQ}£Ñ¢\u0091ß\u0018\u0086Ì\u001e\u0095Ì;|_\u00845¯¡`å)îB.Ô2\u008dÈCG(Á,\u0005n\u0011³\nbrÍ\u0007\u009e\u0003Çí¿lM0\u0086yT°[Ö÷É\bæH':\u009c\u0004\u001få·x:¬\u0010-ý\u0084ª.Â\u0007üg4Z'Ä\u0004é\u0096 \r2Xø¼\u009f)Å\u0091YKÅ8\rK0÷yQÉ\u000fm~\u000e\u0095¤Û\u008a\\R\u0091Å\u0010U)\u0019 9ãAô0âTÐþ\fb\b\u0018ë\\Gí¶îÀUËý\u000fÝ¢\u0001Ç\u0018HÌ\u0013ª\u001aÁ\u0088\u0000\u0018\u000bÞx\u0099-\u001d\u0000j\u0004)\u0099YQ\u00ads+M¤n=·¥£\u0095(\u0092ÃF¯^w\u008b¤×ÈWS\u0087Ì Ê\u0018þ¦ò}è\u0000\u00ad¥\u0094x\u0017\u009e´Ð7Ln\u009a\u0019ÿi\u008d\u008a ÍÒ\u000e z-PVâ¿[òÞ\u0080ÿü<¥ t\u0010.f\u0080ð9Y±ë¸3f \u0007\u0007ÓÈØY2Dè\u0003\u001b/7©\u0013\u001cWc¢{Áëô½¿¢g\u0006\u0004º\u0085>Ô£ÁäÖ\u0085¨ý~êqx6\u0083ý\u0014î±@m\u001eêñ\u0007X¸bMi\u00adqæÆ\u0015Û@À\u0098\u0095_[\u001aQW5öî\\fÃUfd4u\u0088½-g~\u009c¡\u001bò\u0095SDÙÆ8³£m\u0017\u0003÷\u0006êP\u0098\u0019\fQãmõ\u0000!¿¡ÑÖl\u0012ÖáG%þÂ\u0014\u0088åû*\u0013$©\u0095ø\u009eº)\u0095`\u000e\u000b\u0088\u001c\u001fAwqß \u0096\u009cþ\u0010m¢kúV2,p\u008dy#SFN³#(\u001d¸\u0005F\u008d\tø\u00adCA¡ã\u009eû÷\u0014ä¬À0iÍÛ\u0082ñ.\u0084>\u0086\u0090¡¼.Öf\u000ekRnh(¤Ø×I¶\u00017ß\u001c\r±imê\té\u009c÷n`6ÝÈ\u0089=àOÂ\u008d|ØÖ«à79¡\u00057ñ(ôz5\u0081$ðF¼»q¨ÊkHf\u0010\u0091\tþCNÐ#;\u0001¨\u0002*ªX\u0083µ\u001fÄä\u0093ð_»\u0096\u0010\bÀE+ú\u0090jÅ»7\u0082\u008cÿZ\"3\u0010\u00133Æ\u008cÈk' b¡sZòÈ*n\u0010\u008f0Þ¨»\u001b\u0004%^h©hçP\u0087» \u0091©\u000e¸¶ß\u007f\u0000Í%1\u0096>óeÐ$\u008eÀ®×rU\u0018'Ù*\u007fsÙGÑ\u0018\u000f1\fCÌêãØÁ8\u009eù¦¨\u0089\t§AÀ©\u0087%\u001eí /ÙQ\u0004\u008f\u0099\u000eÇ\u0001¡ø\u0015¢F\u008aË²0ÃèVÇäÈð\u0018îôVj¥Ö\u0018\t\u0001@¢Ý\u0099D\u0002)¦[è!44¯\u009f\u00856Vêêg\u0081 \u008fz\u0089w\u0084Ð\u008aW±\f\u0087\u008d\u0093õPñÀ\u0010'Å%ß:ß\u009atÂ\u0018(ò8³8êK+û\u0003\u0017pàyB,bXlwÚhÌ\u0088\u0098Íç?§½\u0087Ðl¶\u0092©\u0082\u0088\u0002H¸w\u0014É~\u008e¯V¢C ÚHðÈwÅ\u0014\u001eh´ ¼qÆü<ßMjaâ¹îI\býÔJpµ\u0016ÇÕø`BX\u001fàB\u0084¯³ Ç\u0012¢½\u0097\\hRAÿ\u0080\u0018ºË,ïõË\u0018¥±;ßú^ô¢ü°\u0002\u0080Î(zxGòønNïx²\u00adä\u0091øP÷\u0094§ñßïÜ\u0016_g\u0086¨\u0001©s'\u0098b\u0096WóùÌu\u0012\u0018ÈÔrÂBa<\u0006\u0092)2¢\u0010ÒÅ\u0003Sñ9\u0015×cV^ ,\u0092¦\u001bYó!ç,(¤î5\u0014\u001a\u0099>\u008c\u0017\u0014ûÇ²B\u001776\fûè9Á"
.length();
char var14 = '(';
int var36 = -1;

label54:
while (true) {
String var37 = var15.substring(++var36, var36 + var14);
byte var41 = -1;

while (true) {
byte[] var19 = var11.doFinal(var37.getBytes("ISO-8859-1"));
String var49 = b(var19).intern();
switch (var41) {
case 0:
var18[var16++] = var49;
if ((var36 += var14) >= var17) {
b = var18;
c = new String[55];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[26];
int var3 = 0;
String var4 = "XU$C©Ïµ¬\u0002§\u000b\u008feÒ\u0091\u0007¢\u009b9 \u00ad\u001f³V}Ø\u008d\u0087Ã¢¡\u000f\u008aùÍWÓUe¦\f%\u0012l\u009a\u0012\u0001D§Kïúh°\b/\u0095e\u0019\u0017Ý\u000f×\u0010\u000bp6\u008f\tu\u009d°K\u008byK\u0003\u0081\u0094\u0015Ôlû¤¬í3\u0097îV-\u008e5ÿ\u00001{Ö¸\u009b\u001fÀéäy\u0095\u008eÃü1Ó\u00073¥\u0082\u00979T¶\u0092ñh+ËZd\u0085f»\u0014\u009d\n\u0085@\u0098nÌ©\u008fäêºÏA\u000fù(\u0010ÚóJ}Ñ@Àåk/\u0089\u0082\u009cÛ¿\u0018\u008fû×\u0082\b¤gÍ\u00adpp\u0093Ïó\u0014\u009d\u0001ÜôÉeW\u008eIÞèÝ\f";
int var5 = "XU$C©Ïµ¬\u0002§\u000b\u008feÒ\u0091\u0007¢\u009b9 \u00ad\u001f³V}Ø\u008d\u0087Ã¢¡\u000f\u008aùÍWÓUe¦\f%\u0012l\u009a\u0012\u0001D§Kïúh°\b/\u0095e\u0019\u0017Ý\u000f×\u0010\u000bp6\u008f\tu\u009d°K\u008byK\u0003\u0081\u0094\u0015Ôlû¤¬í3\u0097îV-\u008e5ÿ\u00001{Ö¸\u009b\u001fÀéäy\u0095\u008eÃü1Ó\u00073¥\u0082\u00979T¶\u0092ñh+ËZd\u0085f»\u0014\u009d\n\u0085@\u0098nÌ©\u008fäêºÏA\u000fù(\u0010ÚóJ}Ñ@Àåk/\u0089\u0082\u009cÛ¿\u0018\u008fû×\u0082\b¤gÍ\u00adpp\u0093Ïó\u0014\u009d\u0001ÜôÉeW\u008eIÞèÝ\f"
.length();
byte var2 = 0;

label36:
while (true) {
byte var45 = var2;
var2 += 8;
byte[] var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
long[] var40 = var6;
int var46 = var3++;
long var53 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var56 = -1;

while (true) {
long var8 = var53;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var58 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var56) {
case 0:
var40[var46] = var58;
if (var2 >= var5) {
f = var6;
g = new Integer[26];
KProperty[] var33 = new KProperty[c<"l">(28686, 8086530108248788674L ^ var20)];
var33[0] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(7216, 3511799035993680166L ^ var20), b<"a">(29854, 3202328229933121978L ^ var20), 0)
);
var33[1] = Reflection.property1(new PropertyReference1Impl(ka.class, b<"a">(4408, 3272307608947188767L ^ var20), b<"a">(6984, 5683655938165829216L ^ var20), 0));
var33[2] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(21862, 1224869556253597789L ^ var20), b<"a">(25747, 3088051151007093157L ^ var20), 0)
);
var33[3] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(17644, 5873268570085667277L ^ var20), b<"a">(32307, 4597161878370388776L ^ var20), 0)
);
var33[4] = Reflection.property1(new PropertyReference1Impl(ka.class, b<"a">(7063, 7915322807597133445L ^ var20), b<"a">(913, 2290051023587407489L ^ var20), 0));
var33[5] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(31127, 3634257519098268843L ^ var20), b<"a">(20545, 2917260058163455298L ^ var20), 0)
);
var33[c<"l">(5269, 1166349126774712911L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(13358, 5370972391187071284L ^ var20), b<"a">(29918, 2711700939816042971L ^ var20), 0)
);
var33[c<"l">(4881, 4291956017935248863L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(6741, 465048595822178154L ^ var20), b<"a">(4066, 7587472864140032717L ^ var20), 0)
);
var33[c<"l">(20101, 6102157193785716813L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(68, 2986599219959952746L ^ var20), b<"a">(593, 5361797144170690426L ^ var20), 0)
);
var33[c<"l">(16104, 2110863566256881709L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(10167, 1206609244086325895L ^ var20), b<"a">(16199, 7563770147116173915L ^ var20), 0)
);
var33[c<"l">(74, 4461224196994399891L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(29481, 4167147672690656794L ^ var20), b<"a">(11665, 2378426140587284608L ^ var20), 0)
);
var33[c<"l">(15387, 638336053302510296L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(31463, 6878934457004134349L ^ var20), b<"a">(5565, 5492178412659892382L ^ var20), 0)
);
var33[c<"l">(13092, 8780250586434883049L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ka.class, b<"a">(12153, 1635820679105403472L ^ var20), b<"a">(16991, 6622461815552128844L ^ var20), 0)
);
m = var33;
F = new ka(var22);
y = yp.B(F, b<"a">(31687, 130220792783310578L ^ var20), (short)var26, w7.BOOLS, null, 4, var27, null, (char)var28);
z = yp.t(F, b<"a">(829, 1653958625762145809L ^ var20), true, var24, F.I(var29), null, c<"l">(20101, 6102157193785716813L ^ var20), null);
e = yp.t(F, b<"a">(9155, 5301649959666177785L ^ var20), true, var24, F.I(var29), null, c<"l">(20101, 6102157193785716813L ^ var20), null);
X = yp.t(F, b<"a">(8543, 2892205493247399019L ^ var20), true, var24, F.I(var29), null, c<"l">(20101, 6102157193785716813L ^ var20), null);
N = yp.t(F, b<"a">(14010, 5968246910700077987L ^ var20), true, var24, F.I(var29), null, c<"l">(20101, 6102157193785716813L ^ var20), null);
U = yp.t(F, b<"a">(25009, 5959361944856106158L ^ var20), true, var24, F.I(var29), null, c<"l">(20101, 6102157193785716813L ^ var20), null);
P = yp.t(F, b<"a">(13283, 2761641682877531875L ^ var20), true, var24, F.I(var29), null, c<"l">(20101, 6102157193785716813L ^ var20), null);
w = yp.t(F, b<"a">(10797, 1222500904399757069L ^ var20), true, var24, F.I(var29), null, c<"l">(20101, 6102157193785716813L ^ var20), null);
I = yp.t(F, b<"a">(4618, 6745333645722838834L ^ var20), true, var24, F.I(var29), null, c<"l">(20101, 6102157193785716813L ^ var20), null);
D = yp.t(F, b<"a">(24081, 2980771621138869030L ^ var20), true, var24, F.I(var29), null, c<"l">(20101, 6102157193785716813L ^ var20), null);
u = yp.t(F, b<"a">(9415, 5943464087347614186L ^ var20), true, var24, null, ka::h, 4, null);
J = yp.t(F, b<"a">(15940, 3015764120040459106L ^ var20), true, var24, null, ka::j, 4, null);
E = yp.L(F, b<"a">(19445, 7097533967416016626L ^ var20), wk.DOT, null, null, c<"l">(13092, 8780250586434883049L ^ var20), null, var31);
return;
}
break;
default:
var40[var46] = var58;
if (var2 < var5) {
continue label36;
}

var4 = "yMó¤§ã\u0002}\u0016«Ãª*\u0081\u001f]";
var5 = "yMó¤§ã\u0002}\u0016«Ãª*\u0081\u001f]".length();
var2 = 0;
}

byte var47 = var2;
var2 += 8;
var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var40 = var6;
var46 = var3++;
var53 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var56 = 0;
}
}
}

var14 = var15.charAt(var36);
break;
default:
var18[var16++] = var49;
if ((var36 += var14) < var17) {
var14 = var15.charAt(var36);
continue label54;
}

var15 = "5\tÅB\\\u008dr\u007f\u0090\u0002CþÈ'\u0081\u001e k\u0080pqôª\u000b³Ôå\u009arcu<\"¬\u008dX`\u0016x0ö·¤\u001er\\Ù\u0085\u0088";
var17 = "5\tÅB\\\u008dr\u007f\u0090\u0002CþÈ'\u0081\u001e k\u0080pqôª\u000b³Ôå\u009arcu<\"¬\u008dX`\u0016x0ö·¤\u001er\\Ù\u0085\u0088".length();
var14 = 16;
var36 = -1;
}

var37 = var15.substring(++var36, var36 + var14);
var41 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13521;
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
throw new RuntimeException("su/catlean/ka", var10);
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
throw new RuntimeException("su/catlean/ka" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16168;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/ka", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/ka" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
