package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

public final class qx extends _g {
@NotNull
public static final qx o;
static final KProperty[] c;
@NotNull
private static final File F;
@NotNull
private static final File U;
@NotNull
private static final cb E;
@NotNull
private static final a6 V;
@NotNull
private static final a6 i;
@NotNull
private static final cw X;
@NotNull
private static final cl D;
@NotNull
private static final bg S;
private static long A;
private static long n;
@NotNull
private static List N;
@NotNull
private static List u;
private static final long a = yz.a(-2121401685907135450L, -8491782006441770304L, MethodHandles.lookup().lookupClass()).a(69608118360521L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private qx(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 66163699035341L;
super(b<"t">(7672, 3968576183208762789L ^ var1), jt.d(), null, 4, null, var3);
}

private final oi A(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 58086504253247L;
return (oi)E.E(this, var3, c[0]);
}

private final void f(long var1, oi var3) {
var1 = a ^ var1;
long var4 = var1 ^ 45355395706284L;
E.b(this, var4, c[0], var3);
}

private final id E(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 99479626826090L;
return (id)V.E(this, var6, c[1]);
}

private final void N(long var1, short var3, id var4) {
long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
long var7 = var5 ^ 50662808992046L;
V.b(this, var7, c[1], var4);
}

private final id T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 17978435729023L;
return (id)i.E(this, var3, c[2]);
}

private final void F(id var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 47362234501138L;
i.b(this, var4, c[2], var1);
}

private final ak K(long var1, int var3) {
long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 62582419542818L;
return (ak)X.E(this, var6, c[3]);
}

private final void z(long var1, ak var3) {
var1 = a ^ var1;
long var4 = var1 ^ 58404332788212L;
X.b(this, var4, c[3], var3);
}

private final String g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 104962877561663L;
return (String)D.E(this, var3, c[4]);
}

private final void B(long var1, String var3) {
var1 = a ^ var1;
long var4 = var1 ^ 11185737211085L;
D.b(this, var4, c[4], var3);
}

@Override
public void O(long var1) {
long var3 = var1 ^ 49075368866138L;
String[] var10000 = vm.a<"Å">(2660793024346998566L, var1);
u = this.E(F, var3);
String[] var5 = var10000;

try {
N = this.E(U, var3);
if (var5 != null) {
vm.a<"Å">(new _g[3], 2605814174822968852L, var1);
}
} catch (NoWhenBranchMatchedException var6) {
throw vm.a<"Å">(var6, 2632185436848151266L, var1);
}
}

@Flow
private final void w(TickEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qx.a J
// 003: ldc2_w 86806074670572
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 115665876827860
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 97950473928062
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 82441995240674
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 87503936270659
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 80178650446405
// 029: lxor
// 02a: lstore 12
// 02c: pop2
// 02d: ldc2_w -6284354780029269246
// 030: lload 2
// 031: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: astore 14
// 038: aload 0
// 039: lload 4
// 03b: invokevirtual su/catlean/qx.S (J)Z
// 03e: aload 14
// 040: ifnonnull 06a
// 043: ifne 054
// 046: goto 053
// 049: ldc2_w -6295166952229579066
// 04c: lload 2
// 04d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: athrow
// 053: return
// 054: lload 12
// 056: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 059: getfield net/minecraft/class_746.field_6012 I
// 05c: sipush 31868
// 05f: ldc2_w 1339285528799940942
// 062: lload 2
// 063: lxor
// 064: invokedynamic c (IJ)I bsm=su/catlean/qx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: irem
// 06a: aload 14
// 06c: ifnonnull 10b
// 06f: ifne 0f5
// 072: goto 07f
// 075: ldc2_w -6295166952229579066
// 078: lload 2
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: getstatic su/catlean/qx.F Ljava/io/File;
// 082: invokevirtual java/io/File.exists ()Z
// 085: aload 14
// 087: ifnonnull 10b
// 08a: goto 097
// 08d: ldc2_w -6295166952229579066
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: ifeq 0f5
// 09a: goto 0a7
// 09d: ldc2_w -6295166952229579066
// 0a0: lload 2
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: getstatic su/catlean/qx.F Ljava/io/File;
// 0aa: invokevirtual java/io/File.lastModified ()J
// 0ad: getstatic su/catlean/qx.A J
// 0b0: lcmp
// 0b1: aload 14
// 0b3: ifnonnull 10b
// 0b6: goto 0c3
// 0b9: ldc2_w -6295166952229579066
// 0bc: lload 2
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: ifle 0f5
// 0c6: goto 0d3
// 0c9: ldc2_w -6295166952229579066
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: aload 0
// 0d4: getstatic su/catlean/qx.F Ljava/io/File;
// 0d7: lload 6
// 0d9: invokespecial su/catlean/qx.E (Ljava/io/File;J)Ljava/util/List;
// 0dc: putstatic su/catlean/qx.u Ljava/util/List;
// 0df: getstatic su/catlean/qx.F Ljava/io/File;
// 0e2: invokevirtual java/io/File.lastModified ()J
// 0e5: putstatic su/catlean/qx.A J
// 0e8: goto 0f5
// 0eb: ldc2_w -6295166952229579066
// 0ee: lload 2
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: lload 12
// 0f7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fa: getfield net/minecraft/class_746.field_6012 I
// 0fd: sipush 31868
// 100: ldc2_w 1339285528799940942
// 103: lload 2
// 104: lxor
// 105: invokedynamic c (IJ)I bsm=su/catlean/qx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: irem
// 10b: aload 14
// 10d: ifnonnull 133
// 110: ifne 196
// 113: goto 120
// 116: ldc2_w -6295166952229579066
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: getstatic su/catlean/qx.U Ljava/io/File;
// 123: invokevirtual java/io/File.exists ()Z
// 126: goto 133
// 129: ldc2_w -6295166952229579066
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: aload 14
// 135: ifnonnull 171
// 138: ifeq 196
// 13b: goto 148
// 13e: ldc2_w -6295166952229579066
// 141: lload 2
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: getstatic su/catlean/qx.U Ljava/io/File;
// 14b: invokevirtual java/io/File.lastModified ()J
// 14e: aload 14
// 150: ifnonnull 193
// 153: goto 160
// 156: ldc2_w -6295166952229579066
// 159: lload 2
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: getstatic su/catlean/qx.n J
// 163: lcmp
// 164: goto 171
// 167: ldc2_w -6295166952229579066
// 16a: lload 2
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: ifle 196
// 174: aload 0
// 175: getstatic su/catlean/qx.U Ljava/io/File;
// 178: lload 6
// 17a: invokespecial su/catlean/qx.E (Ljava/io/File;J)Ljava/util/List;
// 17d: putstatic su/catlean/qx.N Ljava/util/List;
// 180: getstatic su/catlean/qx.U Ljava/io/File;
// 183: invokevirtual java/io/File.lastModified ()J
// 186: goto 193
// 189: ldc2_w -6295166952229579066
// 18c: lload 2
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: putstatic su/catlean/qx.n J
// 196: lload 8
// 198: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 19b: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 19e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 1a3: astore 15
// 1a5: aload 15
// 1a7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1ac: ifeq 267
// 1af: aload 15
// 1b1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1b6: checkcast net/minecraft/class_742
// 1b9: astore 16
// 1bb: aload 16
// 1bd: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 1c0: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 1c3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1c6: aload 14
// 1c8: ifnonnull 20d
// 1cb: ifne 208
// 1ce: goto 1db
// 1d1: ldc2_w -6295166952229579066
// 1d4: lload 2
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: aload 16
// 1dd: getstatic su/catlean/um.E Lsu/catlean/um;
// 1e0: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 1e3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1e6: aload 14
// 1e8: ifnonnull 20d
// 1eb: goto 1f8
// 1ee: ldc2_w -6295166952229579066
// 1f1: lload 2
// 1f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: athrow
// 1f8: ifeq 1a5
// 1fb: goto 208
// 1fe: ldc2_w -6295166952229579066
// 201: lload 2
// 202: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 207: athrow
// 208: aload 16
// 20a: invokevirtual net/minecraft/class_742.method_29504 ()Z
// 20d: aload 14
// 20f: ifnonnull 236
// 212: ifne 23e
// 215: goto 222
// 218: ldc2_w -6295166952229579066
// 21b: lload 2
// 21c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: athrow
// 222: aload 16
// 224: invokevirtual net/minecraft/class_742.method_6032 ()F
// 227: fconst_0
// 228: fcmpg
// 229: goto 236
// 22c: ldc2_w -6295166952229579066
// 22f: lload 2
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: aload 14
// 238: ifnonnull 1ac
// 23b: ifgt 1a5
// 23e: aload 0
// 23f: aload 16
// 241: invokevirtual net/minecraft/class_742.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 244: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 247: dup
// 248: sipush 28623
// 24b: ldc2_w 1047660053222488762
// 24e: lload 2
// 24f: lxor
// 250: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/qx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 255: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 258: getstatic su/catlean/qx.u Ljava/util/List;
// 25b: lload 10
// 25d: dup2_x2
// 25e: pop2
// 25f: invokespecial su/catlean/qx.k (JLjava/lang/String;Ljava/util/List;)V
// 262: aload 14
// 264: ifnull 1a5
// 267: return
}

@Flow
private final void K(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qx.a J
// 003: ldc2_w 30416380263735
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 66418703138319
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 34779661829177
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 29477866140056
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w 7499102257177627609
// 022: lload 2
// 023: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: astore 10
// 02a: aload 1
// 02b: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 02e: instanceof net/minecraft/class_2663
// 031: aload 10
// 033: ifnonnull 059
// 036: ifeq 24a
// 039: goto 046
// 03c: ldc2_w 7527844122433361437
// 03f: lload 2
// 040: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: athrow
// 046: aload 0
// 047: lload 4
// 049: invokevirtual su/catlean/qx.S (J)Z
// 04c: goto 059
// 04f: ldc2_w 7527844122433361437
// 052: lload 2
// 053: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: athrow
// 059: aload 10
// 05b: ifnonnull 097
// 05e: ifeq 24a
// 061: goto 06e
// 064: ldc2_w 7527844122433361437
// 067: lload 2
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: aload 1
// 06f: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 072: checkcast net/minecraft/class_2663
// 075: aload 10
// 077: ifnonnull 0e8
// 07a: goto 087
// 07d: ldc2_w 7527844122433361437
// 080: lload 2
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: invokevirtual net/minecraft/class_2663.method_11470 ()B
// 08a: goto 097
// 08d: ldc2_w 7527844122433361437
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: bipush 3
// 098: if_icmpeq 0d4
// 09b: aload 1
// 09c: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 09f: checkcast net/minecraft/class_2663
// 0a2: invokevirtual net/minecraft/class_2663.method_11470 ()B
// 0a5: sipush 27619
// 0a8: ldc2_w 1122737318226445833
// 0ab: lload 2
// 0ac: lxor
// 0ad: invokedynamic c (IJ)I bsm=su/catlean/qx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: aload 10
// 0b4: ifnonnull 1b7
// 0b7: goto 0c4
// 0ba: ldc2_w 7527844122433361437
// 0bd: lload 2
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: if_icmpne 18e
// 0c7: goto 0d4
// 0ca: ldc2_w 7527844122433361437
// 0cd: lload 2
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: aload 1
// 0d5: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0d8: checkcast net/minecraft/class_2663
// 0db: goto 0e8
// 0de: ldc2_w 7527844122433361437
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: lload 6
// 0ea: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0ed: checkcast net/minecraft/class_1937
// 0f0: invokevirtual net/minecraft/class_2663.method_11469 (Lnet/minecraft/class_1937;)Lnet/minecraft/class_1297;
// 0f3: dup
// 0f4: ifnull 18c
// 0f7: astore 11
// 0f9: bipush 0
// 0fa: istore 12
// 0fc: aload 11
// 0fe: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 101: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 104: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 107: aload 10
// 109: ifnonnull 15b
// 10c: ifne 149
// 10f: goto 11c
// 112: ldc2_w 7527844122433361437
// 115: lload 2
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: aload 11
// 11e: getstatic su/catlean/um.E Lsu/catlean/um;
// 121: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 124: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 127: aload 10
// 129: ifnonnull 15b
// 12c: goto 139
// 12f: ldc2_w 7527844122433361437
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: ifeq 188
// 13c: goto 149
// 13f: ldc2_w 7527844122433361437
// 142: lload 2
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: aload 11
// 14b: instanceof net/minecraft/class_1657
// 14e: goto 15b
// 151: ldc2_w 7527844122433361437
// 154: lload 2
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: ifeq 188
// 15e: getstatic su/catlean/qx.o Lsu/catlean/qx;
// 161: aload 11
// 163: checkcast net/minecraft/class_1657
// 166: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 169: invokeinterface net/minecraft/class_2561.method_54160 ()Ljava/lang/String; 1
// 16e: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
// 171: lload 8
// 173: dup2_x1
// 174: pop2
// 175: getstatic su/catlean/qx.u Ljava/util/List;
// 178: invokespecial su/catlean/qx.k (JLjava/lang/String;Ljava/util/List;)V
// 17b: goto 188
// 17e: ldc2_w 7527844122433361437
// 181: lload 2
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: nop
// 189: goto 18e
// 18c: pop
// 18d: nop
// 18e: aload 1
// 18f: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 192: checkcast net/minecraft/class_2663
// 195: aload 10
// 197: ifnonnull 1ce
// 19a: invokevirtual net/minecraft/class_2663.method_11470 ()B
// 19d: sipush 21372
// 1a0: ldc2_w 8783670485291925137
// 1a3: lload 2
// 1a4: lxor
// 1a5: invokedynamic c (IJ)I bsm=su/catlean/qx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: goto 1b7
// 1ad: ldc2_w 7527844122433361437
// 1b0: lload 2
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: if_icmpne 24a
// 1ba: aload 1
// 1bb: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 1be: checkcast net/minecraft/class_2663
// 1c1: goto 1ce
// 1c4: ldc2_w 7527844122433361437
// 1c7: lload 2
// 1c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: athrow
// 1ce: lload 6
// 1d0: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1d3: checkcast net/minecraft/class_1937
// 1d6: invokevirtual net/minecraft/class_2663.method_11469 (Lnet/minecraft/class_1937;)Lnet/minecraft/class_1297;
// 1d9: dup
// 1da: ifnull 248
// 1dd: astore 11
// 1df: bipush 0
// 1e0: istore 12
// 1e2: aload 11
// 1e4: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 1e7: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 1ea: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1ed: aload 10
// 1ef: ifnonnull 21a
// 1f2: ifne 21d
// 1f5: goto 202
// 1f8: ldc2_w 7527844122433361437
// 1fb: lload 2
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: aload 11
// 204: getstatic su/catlean/um.E Lsu/catlean/um;
// 207: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 20a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 20d: goto 21a
// 210: ldc2_w 7527844122433361437
// 213: lload 2
// 214: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: athrow
// 21a: ifeq 244
// 21d: getstatic su/catlean/qx.o Lsu/catlean/qx;
// 220: aload 11
// 222: invokevirtual net/minecraft/class_1297.method_5477 ()Lnet/minecraft/class_2561;
// 225: invokeinterface net/minecraft/class_2561.method_54160 ()Ljava/lang/String; 1
// 22a: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
// 22d: lload 8
// 22f: dup2_x1
// 230: pop2
// 231: getstatic su/catlean/qx.N Ljava/util/List;
// 234: invokespecial su/catlean/qx.k (JLjava/lang/String;Ljava/util/List;)V
// 237: goto 244
// 23a: ldc2_w 7527844122433361437
// 23d: lload 2
// 23e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 243: athrow
// 244: nop
// 245: goto 24a
// 248: pop
// 249: nop
// 24a: return
}

private final void k(long param1, String param3, List param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qx.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 104521413851060
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 72731855554383
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: lstore 7
// 019: dup2
// 01a: bipush 32
// 01c: lshl
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 9
// 023: pop2
// 024: dup2
// 025: ldc2_w 29643674264239
// 028: lxor
// 029: lstore 10
// 02b: dup2
// 02c: ldc2_w 96376363659731
// 02f: lxor
// 030: dup2
// 031: bipush 32
// 033: lushr
// 034: l2i
// 035: istore 12
// 037: dup2
// 038: bipush 32
// 03a: lshl
// 03b: bipush 48
// 03d: lushr
// 03e: l2i
// 03f: istore 13
// 041: dup2
// 042: bipush 48
// 044: lshl
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 14
// 04b: pop2
// 04c: dup2
// 04d: ldc2_w 134076402686052
// 050: lxor
// 051: lstore 15
// 053: dup2
// 054: ldc2_w 84668657280528
// 057: lxor
// 058: lstore 17
// 05a: dup2
// 05b: ldc2_w 41488268447570
// 05e: lxor
// 05f: lstore 19
// 061: pop2
// 062: ldc2_w 958150033704775303
// 065: lload 1
// 066: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: getstatic su/catlean/es.y Lsu/catlean/es;
// 06e: invokevirtual su/catlean/es.W ()Ljava/util/concurrent/atomic/AtomicBoolean;
// 071: bipush 1
// 072: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 075: astore 21
// 077: getstatic su/catlean/qx.S Lsu/catlean/bg;
// 07a: sipush 23987
// 07d: ldc2_w 583610398212986114
// 080: lload 1
// 081: lxor
// 082: invokedynamic c (IJ)I bsm=su/catlean/qx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: lload 17
// 089: invokevirtual su/catlean/bg.c (IJ)Z
// 08c: aload 21
// 08e: ifnonnull 280
// 091: ifeq 26c
// 094: goto 0a1
// 097: ldc2_w 947559104035976003
// 09a: lload 1
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: aload 4
// 0a3: checkcast java/util/Collection
// 0a6: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0ab: aload 21
// 0ad: ifnonnull 0ce
// 0b0: goto 0bd
// 0b3: ldc2_w 947559104035976003
// 0b6: lload 1
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: ifne 0d1
// 0c0: goto 0cd
// 0c3: ldc2_w 947559104035976003
// 0c6: lload 1
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: bipush 1
// 0ce: goto 0d2
// 0d1: bipush 0
// 0d2: ifeq 26c
// 0d5: aload 4
// 0d7: checkcast java/util/Collection
// 0da: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 0dd: checkcast kotlin/random/Random
// 0e0: invokestatic kotlin/collections/CollectionsKt.random (Ljava/util/Collection;Lkotlin/random/Random;)Ljava/lang/Object;
// 0e3: checkcast java/lang/String
// 0e6: sipush 15000
// 0e9: ldc2_w 2387178771418679929
// 0ec: lload 1
// 0ed: lxor
// 0ee: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/qx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: aload 3
// 0f4: bipush 0
// 0f5: bipush 4
// 0f6: aconst_null
// 0f7: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 0fa: sipush 25700
// 0fd: ldc2_w 765518115475051679
// 100: lload 1
// 101: lxor
// 102: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/qx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 10a: aload 3
// 10b: lload 5
// 10d: invokevirtual su/catlean/dx.B (Ljava/lang/String;J)I
// 110: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 113: bipush 0
// 114: bipush 4
// 115: aconst_null
// 116: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 119: astore 22
// 11b: aload 22
// 11d: ldc "/"
// 11f: bipush 0
// 120: bipush 2
// 121: aconst_null
// 122: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
// 125: lload 1
// 126: lconst_0
// 127: lcmp
// 128: iflt 18d
// 12b: aload 21
// 12d: ifnonnull 18d
// 130: ifeq 170
// 133: goto 140
// 136: ldc2_w 947559104035976003
// 139: lload 1
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: aload 22
// 142: astore 23
// 144: bipush 0
// 145: istore 24
// 147: bipush 1
// 148: istore 25
// 14a: aload 23
// 14c: checkcast java/lang/CharSequence
// 14f: iload 24
// 151: iload 25
// 153: invokestatic kotlin/text/StringsKt.removeRange (Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;
// 156: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 159: astore 22
// 15b: lload 15
// 15d: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 160: aload 22
// 162: invokevirtual net/minecraft/class_634.method_45730 (Ljava/lang/String;)V
// 165: aload 21
// 167: lload 1
// 168: lconst_0
// 169: lcmp
// 16a: ifle 269
// 16d: ifnull 25b
// 170: aload 0
// 171: lload 7
// 173: iload 9
// 175: invokespecial su/catlean/qx.K (JI)Lsu/catlean/ak;
// 178: getstatic su/catlean/m4.A [I
// 17b: swap
// 17c: invokevirtual su/catlean/ak.ordinal ()I
// 17f: iaload
// 180: goto 18d
// 183: ldc2_w 947559104035976003
// 186: lload 1
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: tableswitch 188 1 4 31 70 104 150
// 1ac: lload 15
// 1ae: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 1b1: aload 22
// 1b3: invokedynamic makeConcatWithConstants (Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "!\u0001" ]
// 1b8: invokevirtual net/minecraft/class_634.method_45729 (Ljava/lang/String;)V
// 1bb: aload 21
// 1bd: lload 1
// 1be: lconst_0
// 1bf: lcmp
// 1c0: ifle 269
// 1c3: ifnull 25b
// 1c6: goto 1d3
// 1c9: ldc2_w 947559104035976003
// 1cc: lload 1
// 1cd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: athrow
// 1d3: lload 15
// 1d5: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 1d8: aload 22
// 1da: invokevirtual net/minecraft/class_634.method_45729 (Ljava/lang/String;)V
// 1dd: aload 21
// 1df: lload 1
// 1e0: lconst_0
// 1e1: lcmp
// 1e2: iflt 269
// 1e5: ifnull 25b
// 1e8: goto 1f5
// 1eb: ldc2_w 947559104035976003
// 1ee: lload 1
// 1ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: athrow
// 1f5: lload 15
// 1f7: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 1fa: aload 0
// 1fb: lload 19
// 1fd: invokespecial su/catlean/qx.g (J)Ljava/lang/String;
// 200: aload 3
// 201: aload 22
// 203: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001 \u0001 \u0001" ]
// 208: invokevirtual net/minecraft/class_634.method_45730 (Ljava/lang/String;)V
// 20b: aload 21
// 20d: lload 1
// 20e: lconst_0
// 20f: lcmp
// 210: iflt 269
// 213: ifnull 25b
// 216: goto 223
// 219: ldc2_w 947559104035976003
// 21c: lload 1
// 21d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 222: athrow
// 223: aload 0
// 224: checkcast su/catlean/_g
// 227: aload 22
// 229: bipush 0
// 22a: bipush 2
// 22b: aconst_null
// 22c: lload 10
// 22e: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 231: aload 21
// 233: lload 1
// 234: lconst_0
// 235: lcmp
// 236: ifle 269
// 239: ifnull 25b
// 23c: goto 249
// 23f: ldc2_w 947559104035976003
// 242: lload 1
// 243: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 248: athrow
// 249: new kotlin/NoWhenBranchMatchedException
// 24c: dup
// 24d: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 250: athrow
// 251: ldc2_w 947559104035976003
// 254: lload 1
// 255: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25a: athrow
// 25b: getstatic su/catlean/qx.S Lsu/catlean/bg;
// 25e: invokevirtual su/catlean/bg.l ()V
// 261: lload 1
// 262: lconst_0
// 263: lcmp
// 264: ifle 2c9
// 267: aload 21
// 269: ifnull 2bf
// 26c: aload 4
// 26e: invokeinterface java/util/List.isEmpty ()Z 1
// 273: goto 280
// 276: ldc2_w 947559104035976003
// 279: lload 1
// 27a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: athrow
// 280: ifeq 2bf
// 283: aload 0
// 284: checkcast su/catlean/_g
// 287: iload 12
// 289: aload 0
// 28a: checkcast su/catlean/_g
// 28d: sipush 264
// 290: ldc2_w 4117177393212666365
// 293: lload 1
// 294: lxor
// 295: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/qx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29a: bipush 0
// 29b: anewarray 520
// 29e: iload 13
// 2a0: i2c
// 2a1: bipush 0
// 2a2: bipush 4
// 2a3: aconst_null
// 2a4: iload 14
// 2a6: i2s
// 2a7: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 2aa: bipush 0
// 2ab: bipush 2
// 2ac: aconst_null
// 2ad: lload 10
// 2af: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 2b2: goto 2bf
// 2b5: ldc2_w 947559104035976003
// 2b8: lload 1
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: getstatic su/catlean/es.y Lsu/catlean/es;
// 2c2: invokevirtual su/catlean/es.W ()Ljava/util/concurrent/atomic/AtomicBoolean;
// 2c5: bipush 0
// 2c6: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 2c9: return
}

private final List E(File param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qx.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: ldc2_w -9119473817276783942
// 009: lload 2
// 00a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: astore 4
// 011: aload 1
// 012: aload 4
// 014: ifnonnull 039
// 017: invokevirtual java/io/File.createNewFile ()Z
// 01a: ifeq 038
// 01d: goto 02a
// 020: ldc2_w -9143589839680176258
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 02d: areturn
// 02e: ldc2_w -9143589839680176258
// 031: lload 2
// 032: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: athrow
// 038: aload 1
// 039: astore 5
// 03b: aload 5
// 03d: astore 6
// 03f: bipush 0
// 040: istore 7
// 042: aload 6
// 044: aload 4
// 046: ifnonnull 071
// 049: invokevirtual java/io/File.exists ()Z
// 04c: ifne 06f
// 04f: goto 05c
// 052: ldc2_w -9143589839680176258
// 055: lload 2
// 056: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: athrow
// 05c: aload 6
// 05e: invokevirtual java/io/File.createNewFile ()Z
// 061: pop
// 062: goto 06f
// 065: ldc2_w -9143589839680176258
// 068: lload 2
// 069: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: athrow
// 06f: aload 5
// 071: aconst_null
// 072: bipush 1
// 073: aconst_null
// 074: invokestatic kotlin/io/FilesKt.readLines$default (Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/util/List;
// 077: checkcast java/lang/Iterable
// 07a: astore 5
// 07c: nop
// 07d: bipush 0
// 07e: istore 6
// 080: aload 5
// 082: astore 7
// 084: new java/util/ArrayList
// 087: dup
// 088: aload 5
// 08a: sipush 21664
// 08d: ldc2_w 6304927450530615341
// 090: lload 2
// 091: lxor
// 092: invokedynamic c (IJ)I bsm=su/catlean/qx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 09a: invokespecial java/util/ArrayList.<init> (I)V
// 09d: checkcast java/util/Collection
// 0a0: astore 8
// 0a2: bipush 0
// 0a3: istore 9
// 0a5: aload 7
// 0a7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0ac: astore 10
// 0ae: aload 10
// 0b0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0b5: ifeq 107
// 0b8: aload 10
// 0ba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0bf: astore 11
// 0c1: aload 8
// 0c3: aload 11
// 0c5: checkcast java/lang/String
// 0c8: astore 12
// 0ca: lload 2
// 0cb: lconst_0
// 0cc: lcmp
// 0cd: ifle 12b
// 0d0: astore 14
// 0d2: bipush 0
// 0d3: istore 13
// 0d5: aload 12
// 0d7: checkcast java/lang/CharSequence
// 0da: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 0dd: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 0e0: nop
// 0e1: aload 14
// 0e3: swap
// 0e4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0e9: pop
// 0ea: aload 4
// 0ec: ifnonnull 129
// 0ef: aload 4
// 0f1: ifnull 0ae
// 0f4: lload 2
// 0f5: lconst_0
// 0f6: lcmp
// 0f7: ifle 0ea
// 0fa: goto 107
// 0fd: ldc2_w -9143589839680176258
// 100: lload 2
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: aload 8
// 109: checkcast java/util/List
// 10c: nop
// 10d: checkcast java/lang/Iterable
// 110: astore 5
// 112: nop
// 113: bipush 0
// 114: istore 6
// 116: aload 5
// 118: astore 7
// 11a: new java/util/ArrayList
// 11d: dup
// 11e: invokespecial java/util/ArrayList.<init> ()V
// 121: checkcast java/util/Collection
// 124: astore 8
// 126: bipush 0
// 127: istore 9
// 129: aload 7
// 12b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 130: astore 10
// 132: aload 10
// 134: invokeinterface java/util/Iterator.hasNext ()Z 1
// 139: ifeq 196
// 13c: aload 10
// 13e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 143: astore 11
// 145: aload 11
// 147: checkcast java/lang/String
// 14a: astore 12
// 14c: bipush 0
// 14d: istore 13
// 14f: aload 12
// 151: checkcast java/lang/CharSequence
// 154: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
// 157: aload 4
// 159: ifnonnull 16d
// 15c: ifne 170
// 15f: goto 16c
// 162: ldc2_w -9143589839680176258
// 165: lload 2
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: bipush 1
// 16d: goto 171
// 170: bipush 0
// 171: nop
// 172: aload 4
// 174: ifnonnull 190
// 177: ifeq 132
// 17a: goto 187
// 17d: ldc2_w -9143589839680176258
// 180: lload 2
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: aload 8
// 189: aload 11
// 18b: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 190: pop
// 191: aload 4
// 193: ifnull 132
// 196: aload 8
// 198: checkcast java/util/List
// 19b: nop
// 19c: lload 2
// 19d: lconst_0
// 19e: lcmp
// 19f: iflt 143
// 1a2: areturn
}

private static final Unit V() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qx.a J
// 03: ldc2_w 19182278254433
// 06: lxor
// 07: lstore 0
// 08: invokestatic net/minecraft/class_156.method_668 ()Lnet/minecraft/class_156$class_158;
// 0b: getstatic su/catlean/qx.F Ljava/io/File;
// 0e: astore 3
// 0f: aload 3
// 10: astore 4
// 12: astore 6
// 14: ldc2_w -8483617183215326833
// 17: lload 0
// 18: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: bipush 0
// 1e: istore 5
// 20: astore 2
// 21: aload 2
// 22: ifnonnull 53
// 25: aload 4
// 27: invokevirtual java/io/File.exists ()Z
// 2a: ifne 4d
// 2d: goto 3a
// 30: ldc2_w -8489764118812887989
// 33: lload 0
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: aload 4
// 3c: invokevirtual java/io/File.createNewFile ()Z
// 3f: pop
// 40: goto 4d
// 43: ldc2_w -8489764118812887989
// 46: lload 0
// 47: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: athrow
// 4d: aload 6
// 4f: aload 3
// 50: invokevirtual net/minecraft/class_156$class_158.method_672 (Ljava/io/File;)V
// 53: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 56: areturn
}

private static final Unit n() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qx.a J
// 03: ldc2_w 35516818105472
// 06: lxor
// 07: lstore 0
// 08: invokestatic net/minecraft/class_156.method_668 ()Lnet/minecraft/class_156$class_158;
// 0b: getstatic su/catlean/qx.U Ljava/io/File;
// 0e: astore 3
// 0f: aload 3
// 10: astore 4
// 12: astore 6
// 14: ldc2_w -5646086621007785362
// 17: lload 0
// 18: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: bipush 0
// 1e: istore 5
// 20: astore 2
// 21: aload 2
// 22: ifnonnull 53
// 25: aload 4
// 27: invokevirtual java/io/File.exists ()Z
// 2a: ifne 4d
// 2d: goto 3a
// 30: ldc2_w -5634146358635081814
// 33: lload 0
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: aload 4
// 3c: invokevirtual java/io/File.createNewFile ()Z
// 3f: pop
// 40: goto 4d
// 43: ldc2_w -5634146358635081814
// 46: lload 0
// 47: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: athrow
// 4d: aload 6
// 4f: aload 3
// 50: invokevirtual net/minecraft/class_156$class_158.method_672 (Ljava/io/File;)V
// 53: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 56: areturn
}

private static final boolean w() {
long var0 = a ^ 79939996725990L;
long var2 = (var0 ^ 53463201131968L) >>> 32;
int var4 = (int)((var0 ^ 53463201131968L) << 32 >>> 32);

try {
if (o.K(var2, var4) == ak.WHISPERS) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, -6365533207974716980L, var0);
}

return false;
}

static {
long var20 = a ^ 90648174625199L;
long var22 = var20 ^ 87309014334907L;
long var24 = var20 ^ 91405314702139L;
long var26 = var20 ^ 48238287835387L;
long var28 = var20 ^ 20347306371343L;
long var30 = var20 ^ 81591431554174L;
long var32 = var20 ^ 66632662234421L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[24];
int var16 = 0;
String var15 = "+\u0090ê\u000eùS\u008d>_-\u008c¿j6AA\u0006ÔÑLÖ\u009fßo%4Ê)È+êN\u00adë\u0082/ZGÑ\u0019« Y&\u0098[4nÁoÖ^«\u008c\u0094ímß*dQ|\u001bÉû\u009bàÆOe,R\u0018\u008aLê Ä¾Ë\u009d\t\u0004Ç9ºH+\u0097\u0089º\u001bÓ\u0018\u0084Gª\u0010S¦\u0015\u009eÃÎ4U\u0098\u001d;¶\u0010m\u0086q@©\u000eK\u0014\u0013VÚÞ\nx*\b»jP\u007f¥\u009fëYQCÏS|Ô+ÅU\u000eZ=¯\u0080\u0093ùÇÛÜèÀIk\u009a>^]ði\u0006ðÌØµrØÚ\u0091èÇ4½\tD8Â>ýOp>B*\u0006\u008bÙvH=0â\u001cÃâ\u0012²æÏÑ@\bßøb\u0091\u0007\u009c¹,,^\u001eüÁ(1\u0089þä*ª|h¤)ý-Ï\u0081_¤8 Í\u008c\u0087\u009d\u0089ëûôAî°øq\u0096\u0005\u0085Â¢7%É+U\u001cc!Á\u001aY\u001c4ô\u008eÍ\bJ\u0097î\u009fá¶Ñ\u0006\n\u00931p\u0090²Åè;$ç;\u0010\u0014±Iu-?Ûø×\u0085îp6cÝO\u0018Õ\u0084ËÛM¯õ7mÅÃ\u009e-¤H\u009c*\"\u0088o\u0013té~\u0010Rº\u009cð@[h\u0016\u0010¸>È<w¡\u0010\u0010¼W;Ô;\u000ef\u0004`\u0093k{ÕA\u0082\u0084\u00181§¿#cÐ#\b\u0091MF#mU¿W\t ?\u0013Då^C(\u0005V#ü\u0095\u0080ù:¿Ou\u0093vÛoÂL\u0095Dþs\u009cUÖ_\u0092£¿\u0084=ª§\u0088úvoÜ\u001e¸\u0093\u0010~òÈ\u0084ã\u001f+\u0007ëGhE¢\u0007óÜ \fI£6ª\u0093ç»üA\u0082k~:|¡<ªÂØ¹\bÌUt]ÚØ\u0003á/}\u0018x\u009a÷\u009fQDO²\u0080³®\u0003d\u0005{pp?v\u0007è°b\u0093\u0010¡í\u0007ÛÃÎÖ\u000et0/÷þ\u0081=¾ 7V\u008b\u0010u\u0096`rµ°\u009e(\u0006\u00817Ì\u00156\b\u0086_Ó¯rdî\u0099p(\u0002¥\u0085\u0010ô>Q\u0085L4Q'MÜ\"\u0091Õ\b7\n Zé\u0015GÄÜ\u008bäË\u0003QæÖÙ¯rx\u001fg\u009bÞéï;Ûµ\u009b!Íz®à@í¥lÀ7\u0010Fý\u009dE\u000fzéÎ3âh¨÷ m^\r#;i:ÓÂ\u0010OßL?3¦K\u0097\u0091> \nP{U÷1ã6\u0089qü\u0005oþ·âO#ÖnáQX GÙÅ\u0018\u0014}¸\u0006Úk\u0017;Ve±¯\u0001\u009a\u008d\u0082\u008eñ¤\u000bÄIÂ¡àãÖ°\u0018\u0089\u0089Ö\u000f£\u0019Â~õ\u0004c~®wzº\n\u0002¦CW;¬1";
int var17 = "+\u0090ê\u000eùS\u008d>_-\u008c¿j6AA\u0006ÔÑLÖ\u009fßo%4Ê)È+êN\u00adë\u0082/ZGÑ\u0019« Y&\u0098[4nÁoÖ^«\u008c\u0094ímß*dQ|\u001bÉû\u009bàÆOe,R\u0018\u008aLê Ä¾Ë\u009d\t\u0004Ç9ºH+\u0097\u0089º\u001bÓ\u0018\u0084Gª\u0010S¦\u0015\u009eÃÎ4U\u0098\u001d;¶\u0010m\u0086q@©\u000eK\u0014\u0013VÚÞ\nx*\b»jP\u007f¥\u009fëYQCÏS|Ô+ÅU\u000eZ=¯\u0080\u0093ùÇÛÜèÀIk\u009a>^]ði\u0006ðÌØµrØÚ\u0091èÇ4½\tD8Â>ýOp>B*\u0006\u008bÙvH=0â\u001cÃâ\u0012²æÏÑ@\bßøb\u0091\u0007\u009c¹,,^\u001eüÁ(1\u0089þä*ª|h¤)ý-Ï\u0081_¤8 Í\u008c\u0087\u009d\u0089ëûôAî°øq\u0096\u0005\u0085Â¢7%É+U\u001cc!Á\u001aY\u001c4ô\u008eÍ\bJ\u0097î\u009fá¶Ñ\u0006\n\u00931p\u0090²Åè;$ç;\u0010\u0014±Iu-?Ûø×\u0085îp6cÝO\u0018Õ\u0084ËÛM¯õ7mÅÃ\u009e-¤H\u009c*\"\u0088o\u0013té~\u0010Rº\u009cð@[h\u0016\u0010¸>È<w¡\u0010\u0010¼W;Ô;\u000ef\u0004`\u0093k{ÕA\u0082\u0084\u00181§¿#cÐ#\b\u0091MF#mU¿W\t ?\u0013Då^C(\u0005V#ü\u0095\u0080ù:¿Ou\u0093vÛoÂL\u0095Dþs\u009cUÖ_\u0092£¿\u0084=ª§\u0088úvoÜ\u001e¸\u0093\u0010~òÈ\u0084ã\u001f+\u0007ëGhE¢\u0007óÜ \fI£6ª\u0093ç»üA\u0082k~:|¡<ªÂØ¹\bÌUt]ÚØ\u0003á/}\u0018x\u009a÷\u009fQDO²\u0080³®\u0003d\u0005{pp?v\u0007è°b\u0093\u0010¡í\u0007ÛÃÎÖ\u000et0/÷þ\u0081=¾ 7V\u008b\u0010u\u0096`rµ°\u009e(\u0006\u00817Ì\u00156\b\u0086_Ó¯rdî\u0099p(\u0002¥\u0085\u0010ô>Q\u0085L4Q'MÜ\"\u0091Õ\b7\n Zé\u0015GÄÜ\u008bäË\u0003QæÖÙ¯rx\u001fg\u009bÞéï;Ûµ\u009b!Íz®à@í¥lÀ7\u0010Fý\u009dE\u000fzéÎ3âh¨÷ m^\r#;i:ÓÂ\u0010OßL?3¦K\u0097\u0091> \nP{U÷1ã6\u0089qü\u0005oþ·âO#ÖnáQX GÙÅ\u0018\u0014}¸\u0006Úk\u0017;Ve±¯\u0001\u009a\u008d\u0082\u008eñ¤\u000bÄIÂ¡àãÖ°\u0018\u0089\u0089Ö\u000f£\u0019Â~õ\u0004c~®wzº\n\u0002¦CW;¬1"
.length();
char var14 = 'H';
int var42 = -1;

label54:
while (true) {
String var43 = var15.substring(++var42, var42 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var43.getBytes("ISO-8859-1"));
String var56 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var56;
if ((var42 += var14) >= var17) {
b = var18;
d = new String[24];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = " µ\u0099)ÿ\u000e´E6Â\"ù\u0016\u001b·è^\"l2G¡ÚR\u0001Ì\u000bnÚÒ±üetí2ÝØ ù";
int var5 = " µ\u0099)ÿ\u000e´E6Â\"ù\u0016\u001b·è^\"l2G¡ÚR\u0001Ì\u000bnÚÒ±üetí2ÝØ ù".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var46 = var6;
var10001 = var3++;
long var60 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var64 = -1;

while (true) {
long var8 = var60;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var66 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var64) {
case 0:
var46[var10001] = var66;
if (var2 >= var5) {
f = var6;
g = new Integer[7];
KProperty[] var39 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(qx.class, b<"t">(20577, 8901297857426225498L ^ var20), b<"t">(7377, 2185829744989943268L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(qx.class, b<"t">(6071, 807667114826317462L ^ var20), b<"t">(17112, 7250406361955560446L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(qx.class, b<"t">(7536, 4108844951815730261L ^ var20), b<"t">(24180, 2698048334638708550L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(qx.class, b<"t">(11572, 3155535639719937027L ^ var20), b<"t">(19971, 651835815295838007L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(qx.class, b<"t">(11110, 6697286040576164421L ^ var20), b<"t">(21279, 7870870788394449469L ^ var20), 0)
)
};
c = var39;
o = new qx(var22);
F = new File(mj.v(), b<"t">(32375, 885659069569718099L ^ var20));
U = new File(mj.v(), b<"t">(23916, 3301812834446210134L ^ var20));
jk var47 = o;
String var54 = b<"t">(21410, 5897741176689916573L ^ var20);
oi var62 = new oi(var26, b<"t">(18990, 8110510215954031391L ^ var20));
int var10005 = c<"c">(20556, 690644335615869247L ^ var20);
Object var34 = null;
int var35 = var10005;
Object var36 = null;
Object var37 = null;
oi var38 = var62;
E = yp.X(var47, var54, var24, var38, (h)var37, (Function0)var36, var35, var34);
V = yp.y(o, b<"t">(12866, 6773943557506800510L ^ var20), qx::V, var32, null, null, c<"c">(8158, 6919048267299802798L ^ var20), null);
i = yp.y(o, b<"t">(5989, 2820676580791828053L ^ var20), qx::n, var32, null, null, c<"c">(8158, 6919048267299802798L ^ var20), null);
X = yp.L(o, b<"t">(15793, 2521568702274606223L ^ var20), ak.GLOBAL, null, null, c<"c">(8158, 6919048267299802798L ^ var20), null, var28);
D = yp.x(o, b<"t">(32269, 822744595107927861L ^ var20), b<"t">(25842, 8715684294380342731L ^ var20), null, qx::w, 4, var30, null);
S = new bg();
N = CollectionsKt.emptyList();
u = CollectionsKt.emptyList();
return;
}
break;
default:
var46[var10001] = var66;
if (var2 < var5) {
continue label36;
}

var4 = "ICÌ\u000b&dõâ\u0019\u009da\u0010\u008e:|\u00ad";
var5 = "ICÌ\u000b&dõâ\u0019\u009da\u0010\u008e:|\u00ad".length();
var2 = 0;
}

byte var53 = var2;
var2 += 8;
var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
var46 = var6;
var10001 = var3++;
var60 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var64 = 0;
}
}
}

var14 = var15.charAt(var42);
break;
default:
var18[var16++] = var56;
if ((var42 += var14) < var17) {
var14 = var15.charAt(var42);
continue label54;
}

var15 = "\u001b\r\u0098\u001f\u000bJ'\u0016ª}ã8T£\u0000\u009b8F\u001a7JJo!ûúlà\u007fV8\u008eËª<ø ªÈ\u0002\u0098¼\u0095¡\u0080\u0013B9ÖZ\u001e\t\u009fÃ\u001b'\u0092¦õ8(5BÃ\u0019¦\u00883f\u0084¨Rr";
var17 = "\u001b\r\u0098\u001f\u000bJ'\u0016ª}ã8T£\u0000\u009b8F\u001a7JJo!ûúlà\u007fV8\u008eËª<ø ªÈ\u0002\u0098¼\u0095¡\u0080\u0013B9ÖZ\u001e\t\u009fÃ\u001b'\u0092¦õ8(5BÃ\u0019¦\u00883f\u0084¨Rr"
.length();
var14 = 16;
var42 = -1;
}

var43 = var15.substring(++var42, var42 + var14);
var10001 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15448;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/qx", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/qx" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17434;
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
throw new RuntimeException("su/catlean/qx", var14);
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
throw new RuntimeException("su/catlean/qx" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
