package su.catlean;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _u extends _3 {
@NotNull
public static final _u n;
static final KProperty[] I;
@NotNull
private static final cw w;
@NotNull
private static final cw O;
private static final long c = yz.a(-4224850375420772444L, -5886361660559173948L, MethodHandles.lookup().lookupClass()).a(71599147379572L);
private static final String[] h;
private static final String[] i;
private static final Map l = new HashMap(13);
private static final long[] m;
private static final Integer[] o;
private static final Map t;

private _u(long var1) {
var1 = c ^ var1;
long var10001 = var1 ^ 115359212973272L;
int var3 = (int)((var1 ^ 115359212973272L) >>> 48);
int var4 = (int)((var1 ^ 115359212973272L) << 16 >>> 48);
int var5 = (int)(var10001 << 32 >>> 32);
super(
c<"u">(13159, 3435456317780875642L ^ var1),
(short)var3,
jt.Q(),
f<"o">(23190, 8914042575916170939L ^ var1),
false,
f<"o">(13668, 7167738555906363724L ^ var1),
(short)var4,
var5,
null
);
}

private final wa L(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 12788106445476L;
return (wa)w.E(this, var3, I[0]);
}

private final void o(wa var1, long var2) {
var2 = c ^ var2;
long var4 = var2 ^ 1965226284374L;
w.b(this, var4, I[0], var1);
}

private final i V(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 8181000798817L;
return (i)O.E(this, var3, I[1]);
}

private final void U(long var1, i var3) {
var1 = c ^ var1;
long var4 = var1 ^ 103643756545190L;
O.b(this, var4, I[1], var3);
}

@Flow
public final void g(@NotNull PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_u.c J
// 003: ldc2_w 110592628698009
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 77112200052956
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 52727471547705
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 62693780241100
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 24603746014920
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
// 040: ldc2_w 38642577401340
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 43230241889892
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 110572101300317
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 137776695775434
// 058: lxor
// 059: lstore 19
// 05b: dup2
// 05c: ldc2_w 114106290196568
// 05f: lxor
// 060: lstore 21
// 062: dup2
// 063: ldc2_w 6281637976996
// 066: lxor
// 067: lstore 23
// 069: pop2
// 06a: aload 1
// 06b: ldc "e"
// 06d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 070: ldc2_w 2055620944150949834
// 073: lload 2
// 074: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: iload 10
// 07b: i2c
// 07c: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 07f: aload 0
// 080: lload 15
// 082: invokevirtual su/catlean/_u.Y (J)F
// 085: getstatic su/catlean/w2.FOV Lsu/catlean/w2;
// 088: bipush 0
// 089: bipush 0
// 08a: sipush 410
// 08d: ldc2_w 2124810707152197334
// 090: lload 2
// 091: lxor
// 092: invokedynamic o (IJ)I bsm=su/catlean/_u.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: iload 11
// 099: iload 12
// 09b: i2c
// 09c: aconst_null
// 09d: invokestatic su/catlean/dx.Y (CLsu/catlean/dx;FLsu/catlean/w2;ZZIICLjava/lang/Object;)Lnet/minecraft/class_1657;
// 0a0: astore 26
// 0a2: istore 25
// 0a4: aload 0
// 0a5: lload 6
// 0a7: invokespecial su/catlean/_u.L (J)Lsu/catlean/wa;
// 0aa: getstatic su/catlean/wa.AUTO Lsu/catlean/wa;
// 0ad: if_acmpne 1fb
// 0b0: getstatic su/catlean/um.E Lsu/catlean/um;
// 0b3: lload 23
// 0b5: invokevirtual su/catlean/um.f (J)Z
// 0b8: iload 25
// 0ba: ifeq 163
// 0bd: goto 0ca
// 0c0: ldc2_w 2073663236884973304
// 0c3: lload 2
// 0c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: athrow
// 0ca: ifeq 149
// 0cd: goto 0da
// 0d0: ldc2_w 2073663236884973304
// 0d3: lload 2
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: getstatic su/catlean/um.E Lsu/catlean/um;
// 0dd: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 0e0: iload 25
// 0e2: ifeq 115
// 0e5: goto 0f2
// 0e8: ldc2_w 2073663236884973304
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: ifnull 149
// 0f5: goto 102
// 0f8: ldc2_w 2073663236884973304
// 0fb: lload 2
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: getstatic su/catlean/um.E Lsu/catlean/um;
// 105: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 108: goto 115
// 10b: ldc2_w 2073663236884973304
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: instanceof net/minecraft/class_1657
// 118: iload 25
// 11a: ifeq 163
// 11d: ifeq 149
// 120: goto 12d
// 123: ldc2_w 2073663236884973304
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: getstatic su/catlean/um.E Lsu/catlean/um;
// 130: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 133: dup
// 134: sipush 24284
// 137: ldc2_w 2795458744871503783
// 13a: lload 2
// 13b: lxor
// 13c: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/_u.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 144: checkcast net/minecraft/class_1657
// 147: astore 26
// 149: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 14c: iload 25
// 14e: ifeq 169
// 151: lload 23
// 153: invokevirtual su/catlean/ux.f (J)Z
// 156: goto 163
// 159: ldc2_w 2073663236884973304
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: ifeq 18d
// 166: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 169: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 16c: iload 25
// 16e: ifeq 18f
// 171: ifnull 18d
// 174: goto 181
// 177: ldc2_w 2073663236884973304
// 17a: lload 2
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 184: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 187: dup
// 188: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 18b: astore 26
// 18d: aload 26
// 18f: ifnull 1c9
// 192: getstatic su/catlean/bi.x Lsu/catlean/bi;
// 195: aload 26
// 197: aload 0
// 198: lload 13
// 19a: invokespecial su/catlean/_u.V (J)Lsu/catlean/i;
// 19d: getstatic su/catlean/i.OFF Lsu/catlean/i;
// 1a0: if_acmpeq 1be
// 1a3: goto 1b0
// 1a6: ldc2_w 2073663236884973304
// 1a9: lload 2
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: bipush 1
// 1b1: goto 1bf
// 1b4: ldc2_w 2073663236884973304
// 1b7: lload 2
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: bipush 0
// 1bf: lload 8
// 1c1: dup2_x2
// 1c2: pop2
// 1c3: invokevirtual su/catlean/bi.L (JLnet/minecraft/class_1657;Z)Z
// 1c6: ifeq 1d4
// 1c9: return
// 1ca: ldc2_w 2073663236884973304
// 1cd: lload 2
// 1ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: athrow
// 1d4: aload 0
// 1d5: lload 19
// 1d7: aload 26
// 1d9: invokespecial su/catlean/_u.M (JLnet/minecraft/class_1657;)V
// 1dc: iload 25
// 1de: ifne 2fa
// 1e1: bipush 2
// 1e2: anewarray 453
// 1e5: ldc2_w 2067976810722694799
// 1e8: lload 2
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: goto 1fb
// 1f1: ldc2_w 2073663236884973304
// 1f4: lload 2
// 1f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: athrow
// 1fb: lload 17
// 1fd: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 200: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 203: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 208: astore 27
// 20a: aload 27
// 20c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 211: ifeq 2fa
// 214: aload 27
// 216: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 21b: checkcast net/minecraft/class_742
// 21e: astore 28
// 220: aload 28
// 222: lload 4
// 224: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 227: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 22a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 22d: iload 25
// 22f: ifeq 25e
// 232: ifne 2d8
// 235: goto 242
// 238: ldc2_w 2073663236884973304
// 23b: lload 2
// 23c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 241: athrow
// 242: aload 28
// 244: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 247: aload 28
// 249: checkcast net/minecraft/class_1657
// 24c: lload 21
// 24e: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 251: goto 25e
// 254: ldc2_w 2073663236884973304
// 257: lload 2
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: iload 25
// 260: ifeq 29b
// 263: ifne 2d8
// 266: goto 273
// 269: ldc2_w 2073663236884973304
// 26c: lload 2
// 26d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 272: athrow
// 273: aload 28
// 275: lload 4
// 277: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 27a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 27d: dup
// 27e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 281: checkcast net/minecraft/class_1297
// 284: invokevirtual net/minecraft/class_742.method_5739 (Lnet/minecraft/class_1297;)F
// 287: aload 0
// 288: lload 15
// 28a: invokevirtual su/catlean/_u.Y (J)F
// 28d: fcmpl
// 28e: goto 29b
// 291: ldc2_w 2073663236884973304
// 294: lload 2
// 295: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29a: athrow
// 29b: ifgt 2d8
// 29e: getstatic su/catlean/bi.x Lsu/catlean/bi;
// 2a1: aload 28
// 2a3: checkcast net/minecraft/class_1657
// 2a6: aload 0
// 2a7: lload 13
// 2a9: invokespecial su/catlean/_u.V (J)Lsu/catlean/i;
// 2ac: getstatic su/catlean/i.OFF Lsu/catlean/i;
// 2af: if_acmpeq 2cd
// 2b2: goto 2bf
// 2b5: ldc2_w 2073663236884973304
// 2b8: lload 2
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: bipush 1
// 2c0: goto 2ce
// 2c3: ldc2_w 2073663236884973304
// 2c6: lload 2
// 2c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cc: athrow
// 2cd: bipush 0
// 2ce: lload 8
// 2d0: dup2_x2
// 2d1: pop2
// 2d2: invokevirtual su/catlean/bi.L (JLnet/minecraft/class_1657;Z)Z
// 2d5: ifeq 2ea
// 2d8: iload 25
// 2da: ifne 20a
// 2dd: goto 2ea
// 2e0: ldc2_w 2073663236884973304
// 2e3: lload 2
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: aload 0
// 2eb: lload 19
// 2ed: aload 28
// 2ef: checkcast net/minecraft/class_1657
// 2f2: invokespecial su/catlean/_u.M (JLnet/minecraft/class_1657;)V
// 2f5: iload 25
// 2f7: ifne 20a
// 2fa: return
}

private final void M(long param1, class_1657 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_u.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 4442916349466
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 79038147979325
// 012: lxor
// 013: dup2
// 014: bipush 56
// 016: lushr
// 017: l2i
// 018: istore 6
// 01a: dup2
// 01b: bipush 8
// 01d: lshl
// 01e: bipush 8
// 020: lushr
// 021: lstore 7
// 023: pop2
// 024: dup2
// 025: ldc2_w 128782253157195
// 028: lxor
// 029: dup2
// 02a: bipush 56
// 02c: lushr
// 02d: l2i
// 02e: istore 9
// 030: dup2
// 031: bipush 8
// 033: lshl
// 034: bipush 32
// 036: lushr
// 037: l2i
// 038: istore 10
// 03a: dup2
// 03b: bipush 40
// 03d: lshl
// 03e: bipush 40
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: pop2
// 045: dup2
// 046: ldc2_w 106709706130234
// 049: lxor
// 04a: lstore 12
// 04c: dup2
// 04d: ldc2_w 42575841482395
// 050: lxor
// 051: lstore 14
// 053: dup2
// 054: ldc2_w 77349371163195
// 057: lxor
// 058: lstore 16
// 05a: dup2
// 05b: ldc2_w 116232549170542
// 05e: lxor
// 05f: lstore 18
// 061: pop2
// 062: new java/util/ArrayList
// 065: dup
// 066: invokespecial java/util/ArrayList.<init> ()V
// 069: astore 22
// 06b: ldc2_w -4925470328280015953
// 06e: lload 1
// 06f: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: getstatic su/catlean/lo.k Lsu/catlean/lo;
// 077: iload 9
// 079: i2b
// 07a: aload 3
// 07b: getstatic su/catlean/bi.x Lsu/catlean/bi;
// 07e: aload 3
// 07f: lload 16
// 081: invokevirtual su/catlean/bi.m (Lnet/minecraft/class_1657;J)I
// 084: iload 10
// 086: iload 11
// 088: invokevirtual su/catlean/lo.c (BLnet/minecraft/class_1657;III)Lnet/minecraft/class_243;
// 08b: checkcast net/minecraft/class_2374
// 08e: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 091: dup
// 092: sipush 21758
// 095: ldc2_w 785810639378082631
// 098: lload 1
// 099: lxor
// 09a: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/_u.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a2: astore 23
// 0a4: istore 21
// 0a6: aload 0
// 0a7: lload 12
// 0a9: invokespecial su/catlean/_u.V (J)Lsu/catlean/i;
// 0ac: getstatic su/catlean/i.ONLY Lsu/catlean/i;
// 0af: iload 21
// 0b1: ifne 168
// 0b4: if_acmpeq 14d
// 0b7: goto 0c4
// 0ba: ldc2_w -5043640627663118274
// 0bd: lload 1
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: lload 14
// 0c6: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0c9: aload 23
// 0cb: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0ce: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0d1: instanceof net/minecraft/class_2404
// 0d4: iload 21
// 0d6: lload 1
// 0d7: lconst_0
// 0d8: lcmp
// 0d9: ifle 125
// 0dc: ifne 123
// 0df: goto 0ec
// 0e2: ldc2_w -5043640627663118274
// 0e5: lload 1
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: ifne 14d
// 0ef: goto 0fc
// 0f2: ldc2_w -5043640627663118274
// 0f5: lload 1
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: aload 23
// 0fe: aload 0
// 0ff: lload 4
// 101: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 104: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 107: dup
// 108: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 10b: checkcast net/minecraft/class_1297
// 10e: astore 20
// 110: iload 6
// 112: i2b
// 113: lload 7
// 115: aload 20
// 117: invokevirtual su/catlean/_u.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 11a: checkcast net/minecraft/class_2374
// 11d: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 120: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 123: iload 21
// 125: ifne 14c
// 128: ifne 14d
// 12b: goto 138
// 12e: ldc2_w -5043640627663118274
// 131: lload 1
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: aload 22
// 13a: aload 23
// 13c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 13f: goto 14c
// 142: ldc2_w -5043640627663118274
// 145: lload 1
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: pop
// 14d: aload 0
// 14e: iload 21
// 150: ifne 201
// 153: lload 12
// 155: invokespecial su/catlean/_u.V (J)Lsu/catlean/i;
// 158: getstatic su/catlean/i.OFF Lsu/catlean/i;
// 15b: goto 168
// 15e: ldc2_w -5043640627663118274
// 161: lload 1
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: if_acmpeq 1fd
// 16b: lload 14
// 16d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 170: aload 23
// 172: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 175: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 178: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 17b: instanceof net/minecraft/class_2404
// 17e: iload 21
// 180: ifne 21d
// 183: goto 190
// 186: ldc2_w -5043640627663118274
// 189: lload 1
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: ifne 1fd
// 193: goto 1a0
// 196: ldc2_w -5043640627663118274
// 199: lload 1
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: lload 1
// 1a1: lconst_0
// 1a2: lcmp
// 1a3: iflt 21e
// 1a6: aload 23
// 1a8: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 1ab: lload 4
// 1ad: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 1b3: dup
// 1b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1b7: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 1ba: checkcast net/minecraft/class_2374
// 1bd: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 1c0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1c3: iload 21
// 1c5: ifne 21d
// 1c8: goto 1d5
// 1cb: ldc2_w -5043640627663118274
// 1ce: lload 1
// 1cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d4: athrow
// 1d5: ifne 1fd
// 1d8: goto 1e5
// 1db: ldc2_w -5043640627663118274
// 1de: lload 1
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: aload 22
// 1e7: aload 23
// 1e9: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 1ec: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 1ef: pop
// 1f0: goto 1fd
// 1f3: ldc2_w -5043640627663118274
// 1f6: lload 1
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: aload 0
// 1fe: checkcast su/catlean/_3
// 201: aload 22
// 203: checkcast java/util/List
// 206: bipush 0
// 207: bipush 0
// 208: aconst_null
// 209: bipush 0
// 20a: sipush 5419
// 20d: ldc2_w 1744289332981425314
// 210: lload 1
// 211: lxor
// 212: invokedynamic o (IJ)I bsm=su/catlean/_u.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 217: lload 18
// 219: aconst_null
// 21a: invokestatic su/catlean/_3.s (Lsu/catlean/_3;Ljava/util/List;ZZLjava/util/List;ZIJLjava/lang/Object;)Z
// 21d: pop
// 21e: return
}

@NotNull
@Override
protected List R(long var1) {
return CollectionsKt.listOf(class_2246.field_10343);
}

@NotNull
@Override
protected y4 s() {
return y4.NONE;
}

static {
long var20 = c ^ 50200778028891L;
long var22 = var20 ^ 112588291725741L;
long var24 = var20 ^ 115814902791473L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[9];
int var16 = 0;
String var15 = "|ÿ½&ëÌ\u009cC\t>\u0096÷L\u0082¡UjI¢4\u0093\u009eé<\u0081gë\u0099À¦K\u0081)C8è\u008bìÀ\u00128'\u0086±ºK(A\u0082\u0090\u0005¬~²îüb[\u0089'ß\u001aj1\r\u0092^ÚÖæÿ?'\u0089\u009d\u009aD§+\u0012èºóçæBÝãsÆ\u0003\u0098V\u009e\b\u00ad\r \u00054KFYå+Hìí´XËåx\u0085\u008cÞß\u0093x¡\u0013é¸;\u0011¶\"\u0091xñ\u0080\u009a±¬A\fßi^ÎÈ\u0019P\u001b¦>v\u0096mÇ\u0086=ú*j°CZHHæ\u0093\u0019°ãûqì=øñÇ«dZ\u008d]fÛ¼º=ÿ\u0085\u0080Ã\u0080\u0094\u008aèèëÍ.~]ª¯,ÕáU3«\u0013ñpî\u0006A\u007fY\u000f\u0014\u008cé\u0084\u0091ôç¡ÖOÑ°\u00990öëÔ\u009ew×/P\u0081gpn><¦N\u0099\n\u0081¿Ùø\u007fãì\u0084¬Ó iÒ\t\u0010*¤¯ø\u000eÎh¨Úb\u0095 \u0012uF\u009a\u0010Ä-þ§\u0002y¿?\u0004ª¶ÜJ>ÃÇ O\u0013\u001f\u0000ÝO`V\u008e3\u0089Æ^\u00906\u008d{.OjG\r\u001cÕ\u0003 ¬\u0006*§\u008a\u009d";
int var17 = "|ÿ½&ëÌ\u009cC\t>\u0096÷L\u0082¡UjI¢4\u0093\u009eé<\u0081gë\u0099À¦K\u0081)C8è\u008bìÀ\u00128'\u0086±ºK(A\u0082\u0090\u0005¬~²îüb[\u0089'ß\u001aj1\r\u0092^ÚÖæÿ?'\u0089\u009d\u009aD§+\u0012èºóçæBÝãsÆ\u0003\u0098V\u009e\b\u00ad\r \u00054KFYå+Hìí´XËåx\u0085\u008cÞß\u0093x¡\u0013é¸;\u0011¶\"\u0091xñ\u0080\u009a±¬A\fßi^ÎÈ\u0019P\u001b¦>v\u0096mÇ\u0086=ú*j°CZHHæ\u0093\u0019°ãûqì=øñÇ«dZ\u008d]fÛ¼º=ÿ\u0085\u0080Ã\u0080\u0094\u008aèèëÍ.~]ª¯,ÕáU3«\u0013ñpî\u0006A\u007fY\u000f\u0014\u008cé\u0084\u0091ôç¡ÖOÑ°\u00990öëÔ\u009ew×/P\u0081gpn><¦N\u0099\n\u0081¿Ùø\u007fãì\u0084¬Ó iÒ\t\u0010*¤¯ø\u000eÎh¨Úb\u0095 \u0012uF\u009a\u0010Ä-þ§\u0002y¿?\u0004ª¶ÜJ>ÃÇ O\u0013\u001f\u0000ÝO`V\u008e3\u0089Æ^\u00906\u008d{.OjG\r\u001cÕ\u0003 ¬\u0006*§\u008a\u009d"
.length();
char var14 = '(';
int var29 = -1;

label54:
while (true) {
String var30 = var15.substring(++var29, var29 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
String var41 = c(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var41;
if ((var29 += var14) >= var17) {
h = var18;
i = new String[9];
t = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "Ü}Â!¶\u001bÊ'Ü\u0091Ïñl\u0098â$é\u0015\u0089\\\u0085¯\u008d\u009e";
int var5 = "Ü}Â!¶\u001bÊ'Ü\u0091Ïñl\u0098â$é\u0015\u0089\\\u0085¯\u008d\u009e".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var33 = var6;
var10001 = var3++;
long var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var48 = -1;

while (true) {
long var8 = var45;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var50 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var48) {
case 0:
var33[var10001] = var50;
if (var2 >= var5) {
m = var6;
o = new Integer[5];
KProperty[] var26 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_u.class, c<"u">(27798, 5359113152988735780L ^ var20), c<"u">(20210, 2016509889497713481L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_u.class, c<"u">(32484, 808764814664727387L ^ var20), c<"u">(6119, 937957581762105949L ^ var20), 0)
)
};
I = var26;
n = new _u(var22);
w = yp.L(n, c<"u">(1262, 353955082945986902L ^ var20), wa.AUTO, null, null, f<"o">(16532, 3193970655616666395L ^ var20), null, var24);
O = yp.L(n, c<"u">(19846, 3405825996643354680L ^ var20), su.catlean.i.ON, null, null, f<"o">(16532, 3193970655616666395L ^ var20), null, var24);
return;
}
break;
default:
var33[var10001] = var50;
if (var2 < var5) {
continue label36;
}

var4 = "öM\u0007yHÆ\u0095ÌÑ³_© Áç\u0084";
var5 = "öM\u0007yHÆ\u0095ÌÑ³_© Áç\u0084".length();
var2 = 0;
}

byte var39 = var2;
var2 += 8;
var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
var33 = var6;
var10001 = var3++;
var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var48 = 0;
}
}
}

var14 = var15.charAt(var29);
break;
default:
var18[var16++] = var41;
if ((var29 += var14) < var17) {
var14 = var15.charAt(var29);
continue label54;
}

var15 = "\u0018Ú,E¾2éÙ¶\u008b×\u001c\u008c\u0088x5²sí£÷O\u0088ËÜË\u0087çÏ%ûB\u0018Ï=E\u0001\u007fÂ2\u0003&\u0007=¼Ê\u0089\u0088\u008dñC´\b\u008f\u007f×f";
var17 = "\u0018Ú,E¾2éÙ¶\u008b×\u001c\u008c\u0088x5²sí£÷O\u0088ËÜË\u0087çÏ%ûB\u0018Ï=E\u0001\u007fÂ2\u0003&\u0007=¼Ê\u0089\u0088\u008dñC´\b\u008f\u007f×f"
.length();
var14 = ' ';
var29 = -1;
}

var30 = var15.substring(++var29, var29 + var14);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String c(byte[] var0) {
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

private static String c(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1261;
if (i[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])l.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_u", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = h[var5].getBytes("ISO-8859-1");
i[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return i[var5];
}

private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/_u" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int f(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 19162;
if (o[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = m[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])t.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
t.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_u", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
o[var3] = var15;
}

return o[var3];
}

private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = f(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite f(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/_u" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
