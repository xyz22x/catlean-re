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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class qr extends _g {
@NotNull
public static final qr T;
@NotNull
private static final ct N;
@NotNull
private static final cq J;
@NotNull
private static final bg I;
private static final long a = yz.a(1768374664013116053L, 8942642889528131806L, MethodHandles.lookup().lookupClass()).a(232414957703300L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private qr(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 4806097362914L;
super(b<"m">(15226, 16604834270144547L ^ var1), jt.n(), null, 4, null, var3);
}

private final float T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 99489336554435L;
return ((Number)N.E(this, var3, C[0])).floatValue();
}

private final boolean w(char var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 126520847437648L;
return (Boolean)J.E(this, var6, C[1]);
}

@Flow
private final void n(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qr.a J
// 03: ldc2_w 19008609808557
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 78265217674215
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 75804259056873
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 13148456931178
// 1b: lxor
// 1c: lstore 8
// 1e: dup2
// 1f: ldc2_w 65949577010394
// 22: lxor
// 23: lstore 10
// 25: dup2
// 26: ldc2_w 48064110683258
// 29: lxor
// 2a: lstore 12
// 2c: dup2
// 2d: ldc2_w 99665784217002
// 30: lxor
// 31: lstore 14
// 33: pop2
// 34: ldc2_w -3504533763306917815
// 37: lload 2
// 38: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: istore 16
// 3f: aload 0
// 40: lload 4
// 42: invokespecial su/catlean/qr.A (J)F
// 45: aload 0
// 46: lload 8
// 48: invokespecial su/catlean/qr.T (J)F
// 4b: fcmpg
// 4c: iload 16
// 4e: ifeq 83
// 51: ifgt d1
// 54: goto 61
// 57: ldc2_w -3492311349387718351
// 5a: lload 2
// 5b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: athrow
// 61: getstatic su/catlean/qr.I Lsu/catlean/bg;
// 64: sipush 9466
// 67: ldc2_w 6725353433912808784
// 6a: lload 2
// 6b: lxor
// 6c: invokedynamic i (IJ)I bsm=su/catlean/qr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: lload 12
// 73: invokevirtual su/catlean/bg.c (IJ)Z
// 76: goto 83
// 79: ldc2_w -3492311349387718351
// 7c: lload 2
// 7d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82: athrow
// 83: iload 16
// 85: ifeq ad
// 88: ifeq d1
// 8b: goto 98
// 8e: ldc2_w -3492311349387718351
// 91: lload 2
// 92: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: athrow
// 98: lload 14
// 9a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9d: invokevirtual net/minecraft/class_746.method_6115 ()Z
// a0: goto ad
// a3: ldc2_w -3492311349387718351
// a6: lload 2
// a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac: athrow
// ad: ifne d1
// b0: aload 0
// b1: aload 0
// b2: lload 6
// b4: invokespecial su/catlean/qr.n (J)I
// b7: lload 10
// b9: dup2_x1
// ba: pop2
// bb: invokespecial su/catlean/qr.F (JI)V
// be: getstatic su/catlean/qr.I Lsu/catlean/bg;
// c1: invokevirtual su/catlean/bg.l ()V
// c4: goto d1
// c7: ldc2_w -3492311349387718351
// ca: lload 2
// cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d0: athrow
// d1: return
}

@Flow
public final void w(@NotNull ReceivePacket e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qr.a J
// 003: ldc2_w 79509282284294
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 33223477753932
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 32884249816898
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 91176366726337
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 38891895858327
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 108726811217777
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 1837347287206
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 92841006086819
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 4109281496577
// 03e: lxor
// 03f: lstore 18
// 041: pop2
// 042: ldc2_w 6698607491511739362
// 045: lload 2
// 046: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: aload 1
// 04c: ldc "e"
// 04e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 051: istore 20
// 053: aload 1
// 054: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 057: astore 21
// 059: getstatic su/catlean/bo.S Lsu/catlean/bo;
// 05c: lload 10
// 05e: invokevirtual su/catlean/bo.R (J)Z
// 061: iload 20
// 063: ifeq 07c
// 066: ifeq 26e
// 069: goto 076
// 06c: ldc2_w 6639300141398852250
// 06f: lload 2
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: nop
// 077: aload 21
// 079: instanceof net/minecraft/class_2604
// 07c: iload 20
// 07e: ifeq 152
// 081: ifeq 14d
// 084: goto 091
// 087: ldc2_w 6639300141398852250
// 08a: lload 2
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: aload 21
// 093: checkcast net/minecraft/class_2604
// 096: invokevirtual net/minecraft/class_2604.method_11169 ()Lnet/minecraft/class_1299;
// 099: getstatic net/minecraft/class_1299.field_6110 Lnet/minecraft/class_1299;
// 09c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09f: iload 20
// 0a1: ifeq 152
// 0a4: goto 0b1
// 0a7: ldc2_w 6639300141398852250
// 0aa: lload 2
// 0ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: athrow
// 0b1: ifeq 14d
// 0b4: goto 0c1
// 0b7: ldc2_w 6639300141398852250
// 0ba: lload 2
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: aload 0
// 0c2: lload 4
// 0c4: invokespecial su/catlean/qr.A (J)F
// 0c7: getstatic su/catlean/la.l Lsu/catlean/la;
// 0ca: new net/minecraft/class_243
// 0cd: dup
// 0ce: aload 21
// 0d0: checkcast net/minecraft/class_2604
// 0d3: invokevirtual net/minecraft/class_2604.method_11175 ()D
// 0d6: aload 21
// 0d8: checkcast net/minecraft/class_2604
// 0db: invokevirtual net/minecraft/class_2604.method_11174 ()D
// 0de: aload 21
// 0e0: checkcast net/minecraft/class_2604
// 0e3: invokevirtual net/minecraft/class_2604.method_11176 ()D
// 0e6: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0e9: lload 18
// 0eb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ee: checkcast net/minecraft/class_1657
// 0f1: bipush 3
// 0f2: bipush 0
// 0f3: aconst_null
// 0f4: bipush 0
// 0f5: sipush 4350
// 0f8: ldc2_w 7184764340542911225
// 0fb: lload 2
// 0fc: lxor
// 0fd: invokedynamic i (IJ)I bsm=su/catlean/qr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: aconst_null
// 103: lload 16
// 105: invokestatic su/catlean/la.K (Lsu/catlean/la;Lnet/minecraft/class_243;Lnet/minecraft/class_1657;IZLjava/util/List;ZILjava/lang/Object;J)F
// 108: fsub
// 109: aload 0
// 10a: lload 8
// 10c: invokespecial su/catlean/qr.T (J)F
// 10f: fcmpg
// 110: iload 20
// 112: ifeq 152
// 115: goto 122
// 118: ldc2_w 6639300141398852250
// 11b: lload 2
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: ifgt 14d
// 125: goto 132
// 128: ldc2_w 6639300141398852250
// 12b: lload 2
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: aload 0
// 133: aload 0
// 134: lload 6
// 136: invokespecial su/catlean/qr.n (J)I
// 139: lload 12
// 13b: dup2_x1
// 13c: pop2
// 13d: invokespecial su/catlean/qr.F (JI)V
// 140: goto 14d
// 143: ldc2_w 6639300141398852250
// 146: lload 2
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: aload 21
// 14f: instanceof net/minecraft/class_2663
// 152: iload 20
// 154: ifeq 1f8
// 157: ifeq 1f3
// 15a: goto 167
// 15d: ldc2_w 6639300141398852250
// 160: lload 2
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: aload 21
// 169: checkcast net/minecraft/class_2663
// 16c: invokevirtual net/minecraft/class_2663.method_11470 ()B
// 16f: iload 20
// 171: ifeq 1f8
// 174: goto 181
// 177: ldc2_w 6639300141398852250
// 17a: lload 2
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: sipush 9602
// 184: ldc2_w 2490427009067681671
// 187: lload 2
// 188: lxor
// 189: invokedynamic i (IJ)I bsm=su/catlean/qr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: if_icmpne 1f3
// 191: goto 19e
// 194: ldc2_w 6639300141398852250
// 197: lload 2
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: aload 21
// 1a0: checkcast net/minecraft/class_2663
// 1a3: lload 14
// 1a5: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1a8: checkcast net/minecraft/class_1937
// 1ab: invokevirtual net/minecraft/class_2663.method_11469 (Lnet/minecraft/class_1937;)Lnet/minecraft/class_1297;
// 1ae: lload 18
// 1b0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1b6: iload 20
// 1b8: ifeq 1f8
// 1bb: goto 1c8
// 1be: ldc2_w 6639300141398852250
// 1c1: lload 2
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: athrow
// 1c8: ifeq 1f3
// 1cb: goto 1d8
// 1ce: ldc2_w 6639300141398852250
// 1d1: lload 2
// 1d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: athrow
// 1d8: aload 0
// 1d9: aload 0
// 1da: lload 6
// 1dc: invokespecial su/catlean/qr.n (J)I
// 1df: lload 12
// 1e1: dup2_x1
// 1e2: pop2
// 1e3: invokespecial su/catlean/qr.F (JI)V
// 1e6: goto 1f3
// 1e9: ldc2_w 6639300141398852250
// 1ec: lload 2
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: aload 21
// 1f5: instanceof net/minecraft/class_2749
// 1f8: iload 20
// 1fa: ifeq 239
// 1fd: ifeq 26e
// 200: goto 20d
// 203: ldc2_w 6639300141398852250
// 206: lload 2
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: aload 0
// 20e: iload 20
// 210: ifeq 23d
// 213: goto 220
// 216: ldc2_w 6639300141398852250
// 219: lload 2
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: lload 4
// 222: invokespecial su/catlean/qr.A (J)F
// 225: aload 0
// 226: lload 8
// 228: invokespecial su/catlean/qr.T (J)F
// 22b: fcmpg
// 22c: goto 239
// 22f: ldc2_w 6639300141398852250
// 232: lload 2
// 233: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 238: athrow
// 239: ifgt 26e
// 23c: aload 0
// 23d: aload 0
// 23e: lload 6
// 240: invokespecial su/catlean/qr.n (J)I
// 243: lload 12
// 245: dup2_x1
// 246: pop2
// 247: invokespecial su/catlean/qr.F (JI)V
// 24a: goto 26e
// 24d: astore 22
// 24f: aload 22
// 251: invokevirtual java/lang/Exception.getLocalizedMessage ()Ljava/lang/String;
// 254: sipush 29780
// 257: ldc2_w 4246075459078911322
// 25a: lload 2
// 25b: lxor
// 25c: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 261: swap
// 262: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 267: getstatic java/lang/System.out Ljava/io/PrintStream;
// 26a: swap
// 26b: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
// 26e: iload 20
// 270: ifne 28d
// 273: bipush 1
// 274: anewarray 590
// 277: ldc2_w 6649996720558069364
// 27a: lload 2
// 27b: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 280: goto 28d
// 283: ldc2_w 6639300141398852250
// 286: lload 2
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: return
}

private final void F(long param1, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qr.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 133174475363266
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 16
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: dup2
// 01e: bipush 48
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 6
// 027: pop2
// 028: dup2
// 029: ldc2_w 133343440562834
// 02c: lxor
// 02d: lstore 7
// 02f: dup2
// 030: ldc2_w 123125855834443
// 033: lxor
// 034: dup2
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 9
// 03b: dup2
// 03c: bipush 16
// 03e: lshl
// 03f: bipush 16
// 041: lushr
// 042: lstore 10
// 044: pop2
// 045: dup2
// 046: ldc2_w 26142911102744
// 049: lxor
// 04a: lstore 12
// 04c: dup2
// 04d: ldc2_w 128607642839622
// 050: lxor
// 051: lstore 14
// 053: pop2
// 054: ldc2_w 3244399154941857167
// 057: lload 1
// 058: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: istore 17
// 05f: iload 3
// 060: iload 17
// 062: ifne 089
// 065: bipush -1
// 066: if_icmpne 081
// 069: goto 076
// 06c: ldc2_w 3259089041733841795
// 06f: lload 1
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: return
// 077: ldc2_w 3259089041733841795
// 07a: lload 1
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: lload 12
// 083: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 086: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 089: iload 17
// 08b: ifne 101
// 08e: ifeq 0d0
// 091: goto 09e
// 094: ldc2_w 3259089041733841795
// 097: lload 1
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: aload 0
// 09f: iload 9
// 0a1: i2c
// 0a2: lload 10
// 0a4: invokespecial su/catlean/qr.w (CJ)Z
// 0a7: iload 17
// 0a9: lload 1
// 0aa: lconst_0
// 0ab: lcmp
// 0ac: iflt 108
// 0af: ifne 101
// 0b2: goto 0bf
// 0b5: ldc2_w 3259089041733841795
// 0b8: lload 1
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: ifeq 0d0
// 0c2: goto 0cf
// 0c5: ldc2_w 3259089041733841795
// 0c8: lload 1
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: return
// 0d0: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0d3: iload 17
// 0d5: lload 1
// 0d6: lconst_0
// 0d7: lcmp
// 0d8: ifle 132
// 0db: ifne 131
// 0de: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
// 0e1: dup
// 0e2: sipush 25978
// 0e5: ldc2_w 1243051633312732522
// 0e8: lload 1
// 0e9: lxor
// 0ea: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f2: astore 16
// 0f4: iload 4
// 0f6: i2s
// 0f7: aload 16
// 0f9: iload 5
// 0fb: iload 6
// 0fd: i2c
// 0fe: invokevirtual su/catlean/gg.g (SLnet/minecraft/class_1792;IC)I
// 101: lload 1
// 102: lconst_0
// 103: lcmp
// 104: iflt 113
// 107: bipush 1
// 108: if_icmpgt 12e
// 10b: getstatic su/catlean/qb.a Lsu/catlean/qb;
// 10e: lload 14
// 110: invokevirtual su/catlean/qb.f (J)Z
// 113: ifeq 12e
// 116: goto 123
// 119: ldc2_w 3259089041733841795
// 11c: lload 1
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: return
// 124: ldc2_w 3259089041733841795
// 127: lload 1
// 128: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: athrow
// 12e: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 131: iload 3
// 132: lload 7
// 134: invokevirtual su/catlean/gg.f (IJ)V
// 137: return
}

private final int n(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/qr.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 37616042496830
// 0b: lxor
// 0c: dup2
// 0d: bipush 32
// 0f: lushr
// 10: l2i
// 11: istore 3
// 12: dup2
// 13: bipush 32
// 15: lshl
// 16: bipush 48
// 18: lushr
// 19: l2i
// 1a: istore 4
// 1c: dup2
// 1d: bipush 48
// 1f: lshl
// 20: bipush 48
// 22: lushr
// 23: l2i
// 24: istore 5
// 26: pop2
// 27: dup2
// 28: ldc2_w 115226559078187
// 2b: lxor
// 2c: lstore 6
// 2e: pop2
// 2f: ldc2_w -8271682200721576516
// 32: lload 1
// 33: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 3b: bipush 1
// 3c: anewarray 156
// 3f: astore 10
// 41: aload 10
// 43: bipush 0
// 44: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
// 47: dup
// 48: sipush 26291
// 4b: ldc2_w 4793949779898939026
// 4e: lload 1
// 4f: lxor
// 50: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/qr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 58: aastore
// 59: iload 3
// 5a: aload 10
// 5c: iload 4
// 5e: iload 5
// 60: i2c
// 61: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 64: astore 9
// 66: istore 8
// 68: aload 9
// 6a: invokevirtual su/catlean/fg.R ()Z
// 6d: iload 8
// 6f: ifne c2
// 72: ifeq b4
// 75: goto 82
// 78: ldc2_w -8283840184829914192
// 7b: lload 1
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: aload 9
// 84: iload 8
// 86: ifne c7
// 89: goto 96
// 8c: ldc2_w -8283840184829914192
// 8f: lload 1
// 90: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95: athrow
// 96: invokevirtual su/catlean/fg.a ()I
// 99: lload 6
// 9b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// a1: invokevirtual net/minecraft/class_1661.method_67532 ()I
// a4: if_icmpne c5
// a7: goto b4
// aa: ldc2_w -8283840184829914192
// ad: lload 1
// ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: athrow
// b4: bipush -1
// b5: goto c2
// b8: ldc2_w -8283840184829914192
// bb: lload 1
// bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c1: athrow
// c2: goto ca
// c5: aload 9
// c7: invokevirtual su/catlean/fg.a ()I
// ca: ireturn
}

private final float A(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 117730448427045L;
return zf.v(var3).method_6032() + zf.v(var3).method_6067();
}

static {
long var20 = a ^ 99089770490855L;
long var22 = var20 ^ 42236917439763L;
long var24 = var20 ^ 140141932553436L;
long var26 = var20 ^ 24608718115677L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "½Kn¥µFzßc\u0013´¶t¾Î%_g\u0087£c,Ò~CÿÃJmø\u0081ä2!\u0093fÊ¶`\u008e\u008d¥\u0005\u0015Ç\u0098\f\u0006\u0010¶\u008f.`Ôn\u0090\u008eùÑ\u001bÃ1îef(DoN\"\fDC¢\u009e¿¿k¬úú<¸\u0083\u000b\u009dÄ¦7AÌXA1£Zc¸2\u0017`÷*\u0018\u001aU\u0018î\u000e\u001aÍ\u001b\u0085c\\Ts£\u0003$Úüï\u0016=\nñ\u009cüü\u0095(Ë\\I_LNÌHµé/È\u000f\u00ad\u0082¨õ\\\u0093h¾\u0011ùBRÏ£ïf}VH²\u0011(\u0099vG\u0091\u0003 ýÏ\u0003û6\u0015>Ð\u001b@\u0006öãùö\u0001\u00ad²ôIZ\u0090ú\u0081¥@_Ê`àÇT(5\u008ak\\©\\\u001b\u009d°õÖâ8ô]~\u000f\u0083\u0094<æÆÀ \u0011øV\u0006!\u00ad ×4¡\u0089ò;\u0084ò\u0095(\n\u008eùïúÌdª4g\u008e.Â\u0082\u0019\u008c\fÑÐ9#µbb8\u0093ª×\u0090¼Ì¯\u0002\u0002D/A8áô";
int var17 = "½Kn¥µFzßc\u0013´¶t¾Î%_g\u0087£c,Ò~CÿÃJmø\u0081ä2!\u0093fÊ¶`\u008e\u008d¥\u0005\u0015Ç\u0098\f\u0006\u0010¶\u008f.`Ôn\u0090\u008eùÑ\u001bÃ1îef(DoN\"\fDC¢\u009e¿¿k¬úú<¸\u0083\u000b\u009dÄ¦7AÌXA1£Zc¸2\u0017`÷*\u0018\u001aU\u0018î\u000e\u001aÍ\u001b\u0085c\\Ts£\u0003$Úüï\u0016=\nñ\u009cüü\u0095(Ë\\I_LNÌHµé/È\u000f\u00ad\u0082¨õ\\\u0093h¾\u0011ùBRÏ£ïf}VH²\u0011(\u0099vG\u0091\u0003 ýÏ\u0003û6\u0015>Ð\u001b@\u0006öãùö\u0001\u00ad²ôIZ\u0090ú\u0081¥@_Ê`àÇT(5\u008ak\\©\\\u001b\u009d°õÖâ8ô]~\u000f\u0083\u0094<æÆÀ \u0011øV\u0006!\u00ad ×4¡\u0089ò;\u0084ò\u0095(\n\u008eùïúÌdª4g\u008e.Â\u0082\u0019\u008c\fÑÐ9#µbb8\u0093ª×\u0090¼Ì¯\u0002\u0002D/A8áô"
.length();
char var14 = '0';
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
c = new String[10];
g = new HashMap(13);
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
String var4 = "\bë-tÃ\u0081|t]Å¿[\u0098\u0093\u0005Jq=ö+¹êþ\u001b";
int var5 = "\bë-tÃ\u0081|t]Å¿[\u0098\u0093\u0005Jq=ö+¹êþ\u001b".length();
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
f = new Integer[5];
KProperty[] var28 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(qr.class, b<"m">(21061, 6773177545368083365L ^ var20), b<"m">(22487, 8701812300730801718L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(qr.class, b<"m">(10879, 7922923824461407124L ^ var20), b<"m">(31117, 6377057199922589795L ^ var20), 0))
};
C = var28;
T = new qr(var24);
N = yp.k(
T, b<"m">(16235, 583606512891950722L ^ var20), 16.0F, var22, RangesKt.rangeTo(0.0F, 36.0F), null, null, c<"i">(28277, 7889526288456451218L ^ var20), null
);
J = yp.t(T, b<"m">(24248, 8561781708943759188L ^ var20), false, var26, null, null, c<"i">(31708, 1067314624977113401L ^ var20), null);
I = new bg();
return;
}
break;
default:
var35[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "\u0086P\u008e´Ò6bd\u0003Ö\u0080(>2+È";
var5 = "\u0086P\u008e´Ò6bd\u0003Ö\u0080(>2+È".length();
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

var15 = "Úÿ¸²7\u0016Øa¬>*Ì@\u0000¹\u0005 ÉXÓù\u0083½M\u0007?$ÑPr\u0012Ïú¹\u0013f8¤\u001a{\u0082r\\F\u0004I÷\u008f\u0000";
var17 = "Úÿ¸²7\u0016Øa¬>*Ì@\u0000¹\u0005 ÉXÓù\u0083½M\u0007?$ÑPr\u0012Ïú¹\u0013f8¤\u001a{\u0082r\\F\u0004I÷\u008f\u0000".length();
var14 = 16;
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23655;
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
throw new RuntimeException("su/catlean/qr", var10);
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
throw new RuntimeException("su/catlean/qr" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 32619;
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
throw new RuntimeException("su/catlean/qr", var14);
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
throw new RuntimeException("su/catlean/qr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
