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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

public final class eh extends _g {
@NotNull
public static final eh k;
@NotNull
private static final cl c;
private static final long a = yz.a(-120582353425786494L, -3124757141016495558L, MethodHandles.lookup().lookupClass()).a(210180638246449L);
private static final String[] b;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private eh(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 15342859207034L;
super(b<"u">(8444, 7977858845149874984L ^ var1), jt.v(), null, 4, null, var3);
}

private final String T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 74987159281128L;
return (String)c.E(this, var3, d[0]);
}

@Flow
private final void N(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/eh.a J
// 003: ldc2_w 122514256613368
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 108927450795431
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 50865503592155
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
// 032: ldc2_w 86506934754661
// 035: lxor
// 036: dup2
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 32
// 040: lshl
// 041: bipush 40
// 043: lushr
// 044: l2i
// 045: istore 10
// 047: dup2
// 048: bipush 56
// 04a: lshl
// 04b: bipush 56
// 04d: lushr
// 04e: l2i
// 04f: istore 11
// 051: pop2
// 052: dup2
// 053: ldc2_w 118330151591444
// 056: lxor
// 057: lstore 12
// 059: dup2
// 05a: ldc2_w 43863781418764
// 05d: lxor
// 05e: lstore 14
// 060: pop2
// 061: ldc2_w 7074259773333562514
// 064: lload 2
// 065: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: istore 16
// 06c: aload 1
// 06d: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 070: iload 16
// 072: ifeq 0aa
// 075: instanceof net/minecraft/class_7439
// 078: ifeq 406
// 07b: goto 088
// 07e: ldc2_w 7093519113526706579
// 081: lload 2
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: aload 1
// 089: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 08c: dup
// 08d: sipush 8812
// 090: ldc2_w 6200079375557802930
// 093: lload 2
// 094: lxor
// 095: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 09d: goto 0aa
// 0a0: ldc2_w 7093519113526706579
// 0a3: lload 2
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: checkcast net/minecraft/class_7439
// 0ad: astore 17
// 0af: aload 17
// 0b1: invokevirtual net/minecraft/class_7439.comp_763 ()Lnet/minecraft/class_2561;
// 0b4: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 0b9: dup
// 0ba: sipush 19343
// 0bd: ldc2_w 3978363460506669662
// 0c0: lload 2
// 0c1: lxor
// 0c2: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ca: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 0cd: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 0d0: dup
// 0d1: sipush 26414
// 0d4: ldc2_w 7271051449553747695
// 0d7: lload 2
// 0d8: lxor
// 0d9: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e1: astore 18
// 0e3: aload 0
// 0e4: lload 12
// 0e6: invokespecial su/catlean/eh.T (J)Ljava/lang/String;
// 0e9: checkcast java/lang/CharSequence
// 0ec: invokeinterface java/lang/CharSequence.length ()I 1
// 0f1: iload 16
// 0f3: ifeq 107
// 0f6: ifne 10a
// 0f9: goto 106
// 0fc: ldc2_w 7093519113526706579
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 1
// 107: goto 10b
// 10a: bipush 0
// 10b: ifeq 1a0
// 10e: aload 0
// 10f: checkcast su/catlean/_g
// 112: getstatic net/minecraft/class_124.field_1061 Lnet/minecraft/class_124;
// 115: iload 6
// 117: aload 0
// 118: checkcast su/catlean/_g
// 11b: sipush 18103
// 11e: ldc2_w 2751211863070105461
// 121: lload 2
// 122: lxor
// 123: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: bipush 0
// 129: anewarray 60
// 12c: iload 7
// 12e: i2c
// 12f: bipush 0
// 130: bipush 4
// 131: aconst_null
// 132: iload 8
// 134: i2s
// 135: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 138: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 13d: bipush 0
// 13e: bipush 2
// 13f: aconst_null
// 140: lload 4
// 142: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 145: iload 9
// 147: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 14a: sipush 9453
// 14d: ldc2_w 7469228308962753841
// 150: lload 2
// 151: lxor
// 152: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: iload 6
// 159: aload 0
// 15a: checkcast su/catlean/_g
// 15d: sipush 31571
// 160: ldc2_w 1517808894304313995
// 163: lload 2
// 164: lxor
// 165: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: bipush 0
// 16b: anewarray 60
// 16e: iload 7
// 170: i2c
// 171: bipush 0
// 172: bipush 4
// 173: aconst_null
// 174: iload 8
// 176: i2s
// 177: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 17a: iload 10
// 17c: iload 11
// 17e: i2b
// 17f: bipush 4
// 180: getstatic su/catlean/ys.ERROR Lsu/catlean/ys;
// 183: aconst_null
// 184: sipush 5443
// 187: ldc2_w 2323450172952585050
// 18a: lload 2
// 18b: lxor
// 18c: invokedynamic u (IJ)I bsm=su/catlean/eh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: aconst_null
// 192: invokestatic su/catlean/sg.J (ILsu/catlean/sg;Ljava/lang/String;Ljava/lang/String;IBILsu/catlean/ys;Lnet/minecraft/class_1799;ILjava/lang/Object;)V
// 195: return
// 196: ldc2_w 7093519113526706579
// 199: lload 2
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: aload 18
// 1a2: iload 16
// 1a4: ifeq 27a
// 1a7: checkcast java/lang/CharSequence
// 1aa: sipush 22924
// 1ad: ldc2_w 486572640277086302
// 1b0: lload 2
// 1b1: lxor
// 1b2: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: checkcast java/lang/CharSequence
// 1ba: bipush 0
// 1bb: bipush 2
// 1bc: aconst_null
// 1bd: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 1c0: ifne 24a
// 1c3: goto 1d0
// 1c6: ldc2_w 7093519113526706579
// 1c9: lload 2
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: aload 18
// 1d2: iload 16
// 1d4: ifeq 27a
// 1d7: goto 1e4
// 1da: ldc2_w 7093519113526706579
// 1dd: lload 2
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: checkcast java/lang/CharSequence
// 1e7: sipush 13721
// 1ea: ldc2_w 6265383209045961802
// 1ed: lload 2
// 1ee: lxor
// 1ef: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: checkcast java/lang/CharSequence
// 1f7: bipush 0
// 1f8: bipush 2
// 1f9: aconst_null
// 1fa: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 1fd: ifne 24a
// 200: goto 20d
// 203: ldc2_w 7093519113526706579
// 206: lload 2
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: aload 18
// 20f: checkcast java/lang/CharSequence
// 212: sipush 10936
// 215: ldc2_w 9190220731601990499
// 218: lload 2
// 219: lxor
// 21a: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: checkcast java/lang/CharSequence
// 222: bipush 0
// 223: bipush 2
// 224: aconst_null
// 225: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 228: iload 16
// 22a: ifeq 30e
// 22d: goto 23a
// 230: ldc2_w 7093519113526706579
// 233: lload 2
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: ifeq 2d4
// 23d: goto 24a
// 240: ldc2_w 7093519113526706579
// 243: lload 2
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: aload 0
// 24b: lload 12
// 24d: invokespecial su/catlean/eh.T (J)Ljava/lang/String;
// 250: aload 0
// 251: lload 12
// 253: invokespecial su/catlean/eh.T (J)Ljava/lang/String;
// 256: sipush 24497
// 259: ldc2_w 4737730333749364327
// 25c: lload 2
// 25d: lxor
// 25e: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 263: dup_x2
// 264: pop
// 265: ldc " "
// 267: swap
// 268: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
// 26d: goto 27a
// 270: ldc2_w 7093519113526706579
// 273: lload 2
// 274: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: athrow
// 27a: lload 14
// 27c: invokestatic su/catlean/_r.J (Ljava/lang/String;J)V
// 27f: iload 9
// 281: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 284: sipush 12539
// 287: ldc2_w 3332217360513116462
// 28a: lload 2
// 28b: lxor
// 28c: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: iload 6
// 293: aload 0
// 294: checkcast su/catlean/_g
// 297: sipush 16501
// 29a: ldc2_w 9013070679022524834
// 29d: lload 2
// 29e: lxor
// 29f: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a4: bipush 0
// 2a5: anewarray 60
// 2a8: iload 7
// 2aa: i2c
// 2ab: bipush 0
// 2ac: bipush 4
// 2ad: aconst_null
// 2ae: iload 8
// 2b0: i2s
// 2b1: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 2b4: iload 10
// 2b6: iload 11
// 2b8: i2b
// 2b9: bipush 4
// 2ba: getstatic su/catlean/ys.SUCCESS Lsu/catlean/ys;
// 2bd: aconst_null
// 2be: sipush 1463
// 2c1: ldc2_w 5436346475891143596
// 2c4: lload 2
// 2c5: lxor
// 2c6: invokedynamic u (IJ)I bsm=su/catlean/eh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cb: aconst_null
// 2cc: invokestatic su/catlean/sg.J (ILsu/catlean/sg;Ljava/lang/String;Ljava/lang/String;IBILsu/catlean/ys;Lnet/minecraft/class_1799;ILjava/lang/Object;)V
// 2cf: iload 16
// 2d1: ifne 406
// 2d4: aload 18
// 2d6: iload 16
// 2d8: ifeq 3b1
// 2db: goto 2e8
// 2de: ldc2_w 7093519113526706579
// 2e1: lload 2
// 2e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e7: athrow
// 2e8: checkcast java/lang/CharSequence
// 2eb: sipush 20666
// 2ee: ldc2_w 3491382367898028413
// 2f1: lload 2
// 2f2: lxor
// 2f3: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f8: checkcast java/lang/CharSequence
// 2fb: bipush 0
// 2fc: bipush 2
// 2fd: aconst_null
// 2fe: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 301: goto 30e
// 304: ldc2_w 7093519113526706579
// 307: lload 2
// 308: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30d: athrow
// 30e: ifne 38b
// 311: aload 18
// 313: iload 16
// 315: ifeq 3b1
// 318: goto 325
// 31b: ldc2_w 7093519113526706579
// 31e: lload 2
// 31f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 324: athrow
// 325: checkcast java/lang/CharSequence
// 328: sipush 18325
// 32b: ldc2_w 2892408542419377738
// 32e: lload 2
// 32f: lxor
// 330: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 335: checkcast java/lang/CharSequence
// 338: bipush 0
// 339: bipush 2
// 33a: aconst_null
// 33b: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 33e: ifne 38b
// 341: goto 34e
// 344: ldc2_w 7093519113526706579
// 347: lload 2
// 348: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34d: athrow
// 34e: aload 18
// 350: iload 16
// 352: ifeq 3b1
// 355: goto 362
// 358: ldc2_w 7093519113526706579
// 35b: lload 2
// 35c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 361: athrow
// 362: checkcast java/lang/CharSequence
// 365: sipush 4504
// 368: ldc2_w 6755189160292354124
// 36b: lload 2
// 36c: lxor
// 36d: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: checkcast java/lang/CharSequence
// 375: bipush 0
// 376: bipush 2
// 377: aconst_null
// 378: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 37b: ifeq 406
// 37e: goto 38b
// 381: ldc2_w 7093519113526706579
// 384: lload 2
// 385: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38a: athrow
// 38b: aload 0
// 38c: lload 12
// 38e: invokespecial su/catlean/eh.T (J)Ljava/lang/String;
// 391: sipush 16535
// 394: ldc2_w 2051589283573455191
// 397: lload 2
// 398: lxor
// 399: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39e: swap
// 39f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 3a4: goto 3b1
// 3a7: ldc2_w 7093519113526706579
// 3aa: lload 2
// 3ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b0: athrow
// 3b1: lload 14
// 3b3: invokestatic su/catlean/_r.J (Ljava/lang/String;J)V
// 3b6: iload 9
// 3b8: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 3bb: sipush 12539
// 3be: ldc2_w 3332217360513116462
// 3c1: lload 2
// 3c2: lxor
// 3c3: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c8: iload 6
// 3ca: aload 0
// 3cb: checkcast su/catlean/_g
// 3ce: sipush 18960
// 3d1: ldc2_w 6225033282018956234
// 3d4: lload 2
// 3d5: lxor
// 3d6: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/eh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3db: bipush 0
// 3dc: anewarray 60
// 3df: iload 7
// 3e1: i2c
// 3e2: bipush 0
// 3e3: bipush 4
// 3e4: aconst_null
// 3e5: iload 8
// 3e7: i2s
// 3e8: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 3eb: iload 10
// 3ed: iload 11
// 3ef: i2b
// 3f0: bipush 4
// 3f1: getstatic su/catlean/ys.SUCCESS Lsu/catlean/ys;
// 3f4: aconst_null
// 3f5: sipush 1463
// 3f8: ldc2_w 5436346475891143596
// 3fb: lload 2
// 3fc: lxor
// 3fd: invokedynamic u (IJ)I bsm=su/catlean/eh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 402: aconst_null
// 403: invokestatic su/catlean/sg.J (ILsu/catlean/sg;Ljava/lang/String;Ljava/lang/String;IBILsu/catlean/ys;Lnet/minecraft/class_1799;ILjava/lang/Object;)V
// 406: return
}

static {
long var20 = a ^ 16172648321292L;
long var22 = var20 ^ 37882692190383L;
long var24 = var20 ^ 64274134993988L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[22];
int var16 = 0;
String var15 = "öe-^ñôÃ9ßþÛ¼\u0010W~f \u0096ôÜdSÑ\u001e\u0010\u0097\u000fv¶¶L?\u0001\u0099ÔÎìBÖq¸8J'\u0012\u001b%ë\u008d\u0018ÿ\u001aG#S*ÇzÄÌÖ9\u0001\u0010\u0016âN\u008føbøio| &ýç3*âöåØ¥qëë\bÕ\u009ea¥\nÃ\u0096\u0081¢TêC\u001d%¬\u0084Q \u0010Oí\u009bmÞkZ\u0089 SØ6í*uê\u0018O¿(ê\u0019e\u0083\u008d\u0087\u0003ÈÕm'2A\u00174a;?ô|\u0006\u0010õBÜk\u000eP\u009fª\u00adÐú\u0081 M¦²\u0018\u00ad³áboÔPïÎë\u0092÷Åº\u000b\u0006?\u0099\u0005?<¼\u0013Á ó\u0010²R\u0010¾}ß\nô\"28;.¢\u0011Õ\u0006=ØX\u0006ÅE\u009a\u008diÔN6b@\u0014\u008bËà\u0093©/õ]ºWRþEì\u0011À\u001c÷ÑAR×/\f¿Ì\u001aÑÑ?\u009a_UïUòu\u0087u\\Ç~ãÈ8DR\u001f\u0093\u0004¹\u0098{ýÆ©\u008f×BÁ½qó ë\fHÑ'å¶þ¢ëÐ¸\u000b7&ë\u001d\u0080t~¿Ê\u0089äaØñ[boöI\u0018+:ÙUÆö\\ñ¼\u0080\u0003¨²¿\u009eg)·±Sh2u\u0084  ÿìW\u0004èÝ^\u00893ÖÞ\u0098ñw?î<\u008e\u0087>÷\u0007×\u001ebbDE}¸ÞN\u0093P0¹£Ù\u0082E~!ñ\fc\u00980\u00842e\u0085\u008b3Ûß^\u008dî\u000b®1.\\2 _gu´\u0087\u0011¶[ËØ|OIQëÂÊäFÆc\u00adÀ\u0082!;\u001d÷\u007fB_ØfGh»;ZìÉÍ²b\u0004F£D±o¿\u009aI9ì[gy`_Má.ÿE(8'ß<\u0091òª\u008bé\u001cDÔÊ\u008dY\u0011G\u000b\u001a5\u00127oò\u0011\u009a\"\u000be\u0010Æïdé§\r\u009e\u0091÷ø$ý.Ð£) þ\u0002°i¨¡/·\u0084Ç&\u0013:T\u0014\u001cNð¢\u001bìÀã\u0099ÏµT\u0014\u009aÀ\u007fç0R±1\u009dâdPê\u0002Vµ\u0091\u008eãQÍ.ÿôúÜ\u0095Ä\u0099\u0005Ð\u0091~F/ëØ°\u008a\u0088È Aò__,\u0090£I-Ùý\u0018\u0004µx÷ø\u009e4L\u000eã`È]j\u001aôð÷\u0091\u008a/\u009d\u0006Å ò\u0019¨\u008bbÅ\u0007@º!\u0095'ÎhEº\u000böÏ\u001e\u0086\u0093-¹\u0097\u009eÇýg.¡ÿ\u0010ã¾5\u0089¿\u0084ü\u009b+÷+\u001a\tÓ9Ö(\u0091y\u0099Ñ·Ðü\u0096j\rä\u007f\u0080úU\u0097¿¥\u0082Á\u000bðT¢\u0005\u0099î9±T\u008dt»\u0094uM\u001b\u0019N\f";
int var17 = "öe-^ñôÃ9ßþÛ¼\u0010W~f \u0096ôÜdSÑ\u001e\u0010\u0097\u000fv¶¶L?\u0001\u0099ÔÎìBÖq¸8J'\u0012\u001b%ë\u008d\u0018ÿ\u001aG#S*ÇzÄÌÖ9\u0001\u0010\u0016âN\u008føbøio| &ýç3*âöåØ¥qëë\bÕ\u009ea¥\nÃ\u0096\u0081¢TêC\u001d%¬\u0084Q \u0010Oí\u009bmÞkZ\u0089 SØ6í*uê\u0018O¿(ê\u0019e\u0083\u008d\u0087\u0003ÈÕm'2A\u00174a;?ô|\u0006\u0010õBÜk\u000eP\u009fª\u00adÐú\u0081 M¦²\u0018\u00ad³áboÔPïÎë\u0092÷Åº\u000b\u0006?\u0099\u0005?<¼\u0013Á ó\u0010²R\u0010¾}ß\nô\"28;.¢\u0011Õ\u0006=ØX\u0006ÅE\u009a\u008diÔN6b@\u0014\u008bËà\u0093©/õ]ºWRþEì\u0011À\u001c÷ÑAR×/\f¿Ì\u001aÑÑ?\u009a_UïUòu\u0087u\\Ç~ãÈ8DR\u001f\u0093\u0004¹\u0098{ýÆ©\u008f×BÁ½qó ë\fHÑ'å¶þ¢ëÐ¸\u000b7&ë\u001d\u0080t~¿Ê\u0089äaØñ[boöI\u0018+:ÙUÆö\\ñ¼\u0080\u0003¨²¿\u009eg)·±Sh2u\u0084  ÿìW\u0004èÝ^\u00893ÖÞ\u0098ñw?î<\u008e\u0087>÷\u0007×\u001ebbDE}¸ÞN\u0093P0¹£Ù\u0082E~!ñ\fc\u00980\u00842e\u0085\u008b3Ûß^\u008dî\u000b®1.\\2 _gu´\u0087\u0011¶[ËØ|OIQëÂÊäFÆc\u00adÀ\u0082!;\u001d÷\u007fB_ØfGh»;ZìÉÍ²b\u0004F£D±o¿\u009aI9ì[gy`_Má.ÿE(8'ß<\u0091òª\u008bé\u001cDÔÊ\u008dY\u0011G\u000b\u001a5\u00127oò\u0011\u009a\"\u000be\u0010Æïdé§\r\u009e\u0091÷ø$ý.Ð£) þ\u0002°i¨¡/·\u0084Ç&\u0013:T\u0014\u001cNð¢\u001bìÀã\u0099ÏµT\u0014\u009aÀ\u007fç0R±1\u009dâdPê\u0002Vµ\u0091\u008eãQÍ.ÿôúÜ\u0095Ä\u0099\u0005Ð\u0091~F/ëØ°\u008a\u0088È Aò__,\u0090£I-Ùý\u0018\u0004µx÷ø\u009e4L\u000eã`È]j\u001aôð÷\u0091\u008a/\u009d\u0006Å ò\u0019¨\u008bbÅ\u0007@º!\u0095'ÎhEº\u000böÏ\u001e\u0086\u0093-¹\u0097\u009eÇýg.¡ÿ\u0010ã¾5\u0089¿\u0084ü\u009b+÷+\u001a\tÓ9Ö(\u0091y\u0099Ñ·Ðü\u0096j\rä\u007f\u0080úU\u0097¿¥\u0082Á\u000bðT¢\u0005\u0099î9±T\u008dt»\u0094uM\u001b\u0019N\f"
.length();
char var14 = 16;
int var28 = -1;

label45:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var28 += var14) >= var17) {
b = var18;
e = new String[22];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "caî\u001d¢\u00111\u0004\u0097cM\u001fcöDQßz\u009c~»\u008c»2";
int var5 = "caî\u001d¢\u00111\u0004\u0097cM\u001fcöDQßz\u009c~»\u008c»2".length();
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
byte var43 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

g = var6;
h = new Integer[3];
KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(eh.class, b<"u">(27887, 3206111157023140829L ^ var20), b<"u">(20558, 4133151935191111527L ^ var20), 0))
};
d = var26;
k = new eh(var22);
c = yp.x(
k,
b<"u">(29969, 5853902166882480700L ^ var20),
b<"u">(24905, 5451603719671932542L ^ var20),
null,
null,
c<"u">(32477, 4188575274274281011L ^ var20),
var24,
null
);
return;
}

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var38;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label45;
}

var15 = "\f¢Rk\u000eA¤v´¤T6H\u0085¹ô0°¡/ÊµhfÔkT^Ú^³Ú\u0014\u009f-\bB~\u0006ÿòND\u001cäÝ´P¤b\u0097Ê\u0083<ÿ\u0083\n¡¤\u007f\u0085ø3ÍY";
var17 = "\f¢Rk\u000eA¤v´¤T6H\u0085¹ô0°¡/ÊµhfÔkT^Ú^³Ú\u0014\u009f-\bB~\u0006ÿòND\u001cäÝ´P¤b\u0097Ê\u0083<ÿ\u0083\n¡¤\u007f\u0085ø3ÍY".length();
var14 = 16;
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31349;
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
throw new RuntimeException("su/catlean/eh", var10);
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
throw new RuntimeException("su/catlean/eh" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21948;
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
throw new RuntimeException("su/catlean/eh", var14);
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
throw new RuntimeException("su/catlean/eh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
