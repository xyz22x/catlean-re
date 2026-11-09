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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.CalcBlockBreakingDeltaEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class q7 extends _g {
@NotNull
public static final q7 T;
@NotNull
private static final cq e;
@NotNull
private static final cq E;
@NotNull
private static final cq i;
@NotNull
private static final cq N;
private static int h;
private static boolean U;
private static long S;
@NotNull
private static final List P;
private static final long a = yz.a(6547727397543396106L, -6245381199100599443L, MethodHandles.lookup().lookupClass()).a(167113169816925L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] j;
private static final Map k;

private q7(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 45563220508333L;
super(b<"p">(14793, 8308174372086147651L ^ var1), jt.I(), null, 4, null, var3);
}

private final boolean x(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 54140247592266L;
return (Boolean)e.E(this, var3, d[0]);
}

private final boolean j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 21640816868228L;
return (Boolean)E.E(this, var3, d[1]);
}

private final boolean C(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114187541927290L;
return (Boolean)i.E(this, var3, d[2]);
}

private final boolean z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 26158746129333L;
return (Boolean)N.E(this, var3, d[3]);
}

@Flow
public final void q(@NotNull PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q7.a J
// 003: ldc2_w 78942410024226
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 126805570770531
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 67556047310287
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 59584258679916
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 22686782247586
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 90051482183394
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 113115788809564
// 030: lxor
// 031: dup2
// 032: bipush 32
// 034: lushr
// 035: l2i
// 036: istore 14
// 038: dup2
// 039: bipush 32
// 03b: lshl
// 03c: bipush 32
// 03e: lushr
// 03f: l2i
// 040: istore 15
// 042: pop2
// 043: dup2
// 044: ldc2_w 92297516963909
// 047: lxor
// 048: lstore 16
// 04a: pop2
// 04b: ldc2_w -8473174267475715703
// 04e: lload 2
// 04f: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: aload 1
// 055: ldc "e"
// 057: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 05a: istore 18
// 05c: lload 4
// 05e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 061: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 064: iload 18
// 066: ifne 0a0
// 069: instanceof net/minecraft/class_3965
// 06c: ifne 087
// 06f: goto 07c
// 072: ldc2_w -8486455820986105239
// 075: lload 2
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: return
// 07d: ldc2_w -8486455820986105239
// 080: lload 2
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: lload 4
// 089: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08c: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 08f: dup
// 090: sipush 27003
// 093: ldc2_w 3230398081935597472
// 096: lload 2
// 097: lxor
// 098: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/q7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0a0: checkcast net/minecraft/class_3965
// 0a3: astore 19
// 0a5: aload 19
// 0a7: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 0aa: dup
// 0ab: sipush 8267
// 0ae: ldc2_w 1814202296511010459
// 0b1: lload 2
// 0b2: lxor
// 0b3: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/q7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0bb: astore 20
// 0bd: lload 12
// 0bf: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0c2: aload 20
// 0c4: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0c7: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 0ca: iload 18
// 0cc: ifne 0ea
// 0cf: ifeq 0e0
// 0d2: goto 0df
// 0d5: ldc2_w -8486455820986105239
// 0d8: lload 2
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: return
// 0e0: aload 0
// 0e1: iload 14
// 0e3: iload 15
// 0e5: aload 20
// 0e7: invokespecial su/catlean/q7.T (IILnet/minecraft/class_2338;)I
// 0ea: iload 18
// 0ec: ifne 1e1
// 0ef: bipush -1
// 0f0: if_icmpeq 1d1
// 0f3: goto 100
// 0f6: ldc2_w -8486455820986105239
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: lload 4
// 102: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 105: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 108: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
// 10b: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 10e: iload 18
// 110: ifne 1e1
// 113: goto 120
// 116: ldc2_w -8486455820986105239
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: ifeq 1d1
// 123: goto 130
// 126: ldc2_w -8486455820986105239
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: getstatic su/catlean/q7.P Ljava/util/List;
// 133: lload 16
// 135: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 138: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 13b: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 13e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 141: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 146: pop
// 147: iload 18
// 149: ifne 18e
// 14c: goto 159
// 14f: ldc2_w -8486455820986105239
// 152: lload 2
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: aload 0
// 15a: lload 8
// 15c: invokespecial su/catlean/q7.x (J)Z
// 15f: ifeq 193
// 162: goto 16f
// 165: ldc2_w -8486455820986105239
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 172: aload 0
// 173: iload 14
// 175: iload 15
// 177: aload 20
// 179: invokespecial su/catlean/q7.T (IILnet/minecraft/class_2338;)I
// 17c: lload 6
// 17e: invokevirtual su/catlean/gg.f (IJ)V
// 181: goto 18e
// 184: ldc2_w -8486455820986105239
// 187: lload 2
// 188: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18d: athrow
// 18e: iload 18
// 190: ifeq 1b5
// 193: lload 16
// 195: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 198: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 19b: aload 0
// 19c: iload 14
// 19e: iload 15
// 1a0: aload 20
// 1a2: invokespecial su/catlean/q7.T (IILnet/minecraft/class_2338;)I
// 1a5: invokevirtual net/minecraft/class_1661.method_61496 (I)V
// 1a8: goto 1b5
// 1ab: ldc2_w -8486455820986105239
// 1ae: lload 2
// 1af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b4: athrow
// 1b5: aload 0
// 1b6: iload 14
// 1b8: iload 15
// 1ba: aload 20
// 1bc: invokespecial su/catlean/q7.T (IILnet/minecraft/class_2338;)I
// 1bf: putstatic su/catlean/q7.h I
// 1c2: bipush 1
// 1c3: putstatic su/catlean/q7.U Z
// 1c6: invokestatic su/catlean/zf.A ()J
// 1c9: putstatic su/catlean/q7.S J
// 1cc: iload 18
// 1ce: ifeq 337
// 1d1: getstatic su/catlean/q7.U Z
// 1d4: goto 1e1
// 1d7: ldc2_w -8486455820986105239
// 1da: lload 2
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: athrow
// 1e1: iload 18
// 1e3: ifne 20e
// 1e6: ifeq 337
// 1e9: goto 1f6
// 1ec: ldc2_w -8486455820986105239
// 1ef: lload 2
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: getstatic su/catlean/q7.P Ljava/util/List;
// 1f9: checkcast java/util/Collection
// 1fc: invokeinterface java/util/Collection.isEmpty ()Z 1
// 201: goto 20e
// 204: ldc2_w -8486455820986105239
// 207: lload 2
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: iload 18
// 210: ifne 224
// 213: ifne 227
// 216: goto 223
// 219: ldc2_w -8486455820986105239
// 21c: lload 2
// 21d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 222: athrow
// 223: bipush 1
// 224: goto 228
// 227: bipush 0
// 228: ifeq 337
// 22b: invokestatic su/catlean/zf.A ()J
// 22e: getstatic su/catlean/q7.S J
// 231: sipush 13254
// 234: ldc2_w 3770813913961361739
// 237: lload 2
// 238: lxor
// 239: invokedynamic e (IJ)I bsm=su/catlean/q7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: i2l
// 23f: ladd
// 240: lcmp
// 241: iload 18
// 243: ifne 276
// 246: goto 253
// 249: ldc2_w -8486455820986105239
// 24c: lload 2
// 24d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: athrow
// 253: iflt 337
// 256: goto 263
// 259: ldc2_w -8486455820986105239
// 25c: lload 2
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: aload 0
// 264: lload 10
// 266: invokespecial su/catlean/q7.j (J)Z
// 269: goto 276
// 26c: ldc2_w -8486455820986105239
// 26f: lload 2
// 270: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 275: athrow
// 276: iload 18
// 278: ifne 2c6
// 27b: ifne 2b3
// 27e: goto 28b
// 281: ldc2_w -8486455820986105239
// 284: lload 2
// 285: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: athrow
// 28b: aload 0
// 28c: lload 8
// 28e: invokespecial su/catlean/q7.x (J)Z
// 291: iload 18
// 293: ifne 2c6
// 296: goto 2a3
// 299: ldc2_w -8486455820986105239
// 29c: lload 2
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: ifeq 337
// 2a6: goto 2b3
// 2a9: ldc2_w -8486455820986105239
// 2ac: lload 2
// 2ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b2: athrow
// 2b3: aload 0
// 2b4: lload 8
// 2b6: invokespecial su/catlean/q7.x (J)Z
// 2b9: goto 2c6
// 2bc: ldc2_w -8486455820986105239
// 2bf: lload 2
// 2c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: athrow
// 2c6: ifeq 2f2
// 2c9: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 2cc: getstatic su/catlean/q7.P Ljava/util/List;
// 2cf: bipush 0
// 2d0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 2d5: checkcast java/lang/Number
// 2d8: invokevirtual java/lang/Number.intValue ()I
// 2db: lload 6
// 2dd: invokevirtual su/catlean/gg.f (IJ)V
// 2e0: iload 18
// 2e2: ifeq 319
// 2e5: goto 2f2
// 2e8: ldc2_w -8486455820986105239
// 2eb: lload 2
// 2ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f1: athrow
// 2f2: lload 16
// 2f4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2f7: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 2fa: getstatic su/catlean/q7.P Ljava/util/List;
// 2fd: bipush 0
// 2fe: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 303: checkcast java/lang/Number
// 306: invokevirtual java/lang/Number.intValue ()I
// 309: invokevirtual net/minecraft/class_1661.method_61496 (I)V
// 30c: goto 319
// 30f: ldc2_w -8486455820986105239
// 312: lload 2
// 313: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 318: athrow
// 319: getstatic su/catlean/q7.P Ljava/util/List;
// 31c: bipush 0
// 31d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 322: checkcast java/lang/Number
// 325: invokevirtual java/lang/Number.intValue ()I
// 328: putstatic su/catlean/q7.h I
// 32b: getstatic su/catlean/q7.P Ljava/util/List;
// 32e: invokeinterface java/util/List.clear ()V 1
// 333: bipush 0
// 334: putstatic su/catlean/q7.U Z
// 337: ldc2_w -8467895131529571094
// 33a: lload 2
// 33b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 340: ifnull 36d
// 343: iload 18
// 345: ifeq 363
// 348: goto 355
// 34b: ldc2_w -8486455820986105239
// 34e: lload 2
// 34f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 354: athrow
// 355: bipush 0
// 356: goto 364
// 359: ldc2_w -8486455820986105239
// 35c: lload 2
// 35d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 362: athrow
// 363: bipush 1
// 364: ldc2_w -8448266668333893956
// 367: lload 2
// 368: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36d: return
}

@Flow
public final void Q(@NotNull CalcBlockBreakingDeltaEvent event) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q7.a J
// 003: ldc2_w 81001443064865
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 25437567794353
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 61944751029615
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 105008039772129
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 102899242074438
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w 6034132638713650891
// 029: lload 2
// 02a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: istore 12
// 031: aload 1
// 032: iload 12
// 034: ifeq 06b
// 037: sipush 24980
// 03a: ldc2_w 2141270561717030494
// 03d: lload 2
// 03e: lxor
// 03f: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/q7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 047: aload 0
// 048: lload 6
// 04a: invokespecial su/catlean/q7.x (J)Z
// 04d: ifeq 130
// 050: goto 05d
// 053: ldc2_w 5996827692192766826
// 056: lload 2
// 057: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: athrow
// 05d: aload 1
// 05e: goto 06b
// 061: ldc2_w 5996827692192766826
// 064: lload 2
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: invokevirtual su/catlean/api/event/events/player/CalcBlockBreakingDeltaEvent.getState ()Lnet/minecraft/class_2680;
// 06e: lload 8
// 070: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 073: checkcast net/minecraft/class_1922
// 076: aload 1
// 077: invokevirtual su/catlean/api/event/events/player/CalcBlockBreakingDeltaEvent.getBlockPos ()Lnet/minecraft/class_2338;
// 07a: invokevirtual net/minecraft/class_2680.method_26214 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)F
// 07d: fstore 13
// 07f: fload 13
// 081: fconst_0
// 082: iload 12
// 084: ifeq 0f6
// 087: fcmpg
// 088: ifge 0c9
// 08b: goto 098
// 08e: ldc2_w 5996827692192766826
// 091: lload 2
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: aload 1
// 099: fconst_0
// 09a: invokevirtual su/catlean/api/event/events/player/CalcBlockBreakingDeltaEvent.setDelta (F)V
// 09d: iload 12
// 09f: ifne 130
// 0a2: goto 0af
// 0a5: ldc2_w 5996827692192766826
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 4
// 0b0: anewarray 212
// 0b3: ldc2_w 5984957222632184115
// 0b6: lload 2
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: goto 0c9
// 0bf: ldc2_w 5996827692192766826
// 0c2: lload 2
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: aload 0
// 0ca: aload 1
// 0cb: invokevirtual su/catlean/api/event/events/player/CalcBlockBreakingDeltaEvent.getState ()Lnet/minecraft/class_2680;
// 0ce: lload 10
// 0d0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d3: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0d6: getstatic su/catlean/q7.h I
// 0d9: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0dc: dup
// 0dd: sipush 19690
// 0e0: ldc2_w 7853234883237847864
// 0e3: lload 2
// 0e4: lxor
// 0e5: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/q7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ed: lload 4
// 0ef: dup2_x1
// 0f0: pop2
// 0f1: invokespecial su/catlean/q7.V (Lnet/minecraft/class_2680;JLnet/minecraft/class_1799;)F
// 0f4: fload 13
// 0f6: fdiv
// 0f7: fstore 14
// 0f9: aload 1
// 0fa: lload 10
// 0fc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ff: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 102: getstatic su/catlean/q7.h I
// 105: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 108: aload 1
// 109: invokevirtual su/catlean/api/event/events/player/CalcBlockBreakingDeltaEvent.getState ()Lnet/minecraft/class_2680;
// 10c: invokevirtual net/minecraft/class_1799.method_7951 (Lnet/minecraft/class_2680;)Z
// 10f: ifeq 124
// 112: fload 14
// 114: ldc 30.0
// 116: fdiv
// 117: goto 129
// 11a: ldc2_w 5996827692192766826
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: fload 14
// 126: ldc 100.0
// 128: fdiv
// 129: invokevirtual su/catlean/api/event/events/player/CalcBlockBreakingDeltaEvent.setDelta (F)V
// 12c: aload 1
// 12d: invokevirtual su/catlean/api/event/events/player/CalcBlockBreakingDeltaEvent.cancel ()V
// 130: return
}

private final float V(class_2680 param1, long param2, class_1799 param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/q7.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 29276786491852
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w 4685069353094810738
// 12: lload 2
// 13: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 4
// 1a: aload 1
// 1b: invokevirtual net/minecraft/class_1799.method_7924 (Lnet/minecraft/class_2680;)F
// 1e: f2d
// 1f: dstore 8
// 21: istore 7
// 23: lload 5
// 25: aload 4
// 27: getstatic net/minecraft/class_1893.field_9131 Lnet/minecraft/class_5321;
// 2a: dup
// 2b: sipush 19821
// 2e: ldc2_w 3053981408862220316
// 31: lload 2
// 32: lxor
// 33: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/q7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3b: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 3e: istore 10
// 40: dload 8
// 42: dload 8
// 44: dconst_1
// 45: dcmpl
// 46: iload 7
// 48: ifeq 6d
// 4b: ifle 73
// 4e: goto 5b
// 51: ldc2_w 4719839927799843283
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: iload 10
// 5d: iload 10
// 5f: imul
// 60: goto 6d
// 63: ldc2_w 4719839927799843283
// 66: lload 2
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: i2d
// 6e: dconst_1
// 6f: dadd
// 70: goto 74
// 73: dconst_0
// 74: dadd
// 75: dconst_0
// 76: invokestatic java/lang/Math.max (DD)D
// 79: d2f
// 7a: freturn
}

private final int T(int param1, int param2, class_2338 param3) {
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
// 007: bipush 32
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/q7.a J
// 011: lxor
// 012: lstore 4
// 014: lload 4
// 016: dup2
// 017: ldc2_w 104931694543303
// 01a: lxor
// 01b: lstore 6
// 01d: dup2
// 01e: ldc2_w 111073615048994
// 021: lxor
// 022: lstore 8
// 024: dup2
// 025: ldc2_w 33328553287094
// 028: lxor
// 029: lstore 10
// 02b: dup2
// 02c: ldc2_w 5362603378878
// 02f: lxor
// 030: lstore 12
// 032: dup2
// 033: ldc2_w 31168153608977
// 036: lxor
// 037: lstore 14
// 039: dup2
// 03a: ldc2_w 52224746817288
// 03d: lxor
// 03e: lstore 16
// 040: pop2
// 041: ldc2_w -5675253181585677603
// 044: lload 4
// 046: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: bipush -1
// 04c: istore 19
// 04e: fconst_1
// 04f: fstore 20
// 051: bipush 0
// 052: istore 21
// 054: istore 18
// 056: iload 21
// 058: sipush 5697
// 05b: ldc2_w 4060005949769510811
// 05e: lload 4
// 060: lxor
// 061: invokedynamic e (IJ)I bsm=su/catlean/q7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: if_icmpge 2d2
// 069: lload 14
// 06b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 071: iload 21
// 073: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 076: dup
// 077: sipush 16206
// 07a: ldc2_w 9164998596115772098
// 07d: lload 4
// 07f: lxor
// 080: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/q7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 088: astore 22
// 08a: iload 18
// 08c: iload 1
// 08d: ifle 2cf
// 090: ifne 2cd
// 093: aload 22
// 095: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
// 098: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09b: iload 18
// 09d: ifne 2d4
// 0a0: goto 0ae
// 0a3: ldc2_w -5661514231005251267
// 0a6: lload 4
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: ifne 2ca
// 0b1: goto 0bf
// 0b4: ldc2_w -5661514231005251267
// 0b7: lload 4
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: lload 14
// 0c1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c4: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0c7: iload 21
// 0c9: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0cc: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 0cf: lload 14
// 0d1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d4: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0d7: iload 21
// 0d9: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0dc: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 0df: isub
// 0e0: iload 2
// 0e1: iflt 12a
// 0e4: iload 18
// 0e6: ifne 12a
// 0e9: goto 0f7
// 0ec: ldc2_w -5661514231005251267
// 0ef: lload 4
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: sipush 25173
// 0fa: ldc2_w 61440156831259534
// 0fd: lload 4
// 0ff: lxor
// 100: invokedynamic e (IJ)I bsm=su/catlean/q7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: if_icmpgt 144
// 108: goto 116
// 10b: ldc2_w -5661514231005251267
// 10e: lload 4
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: aload 0
// 117: lload 16
// 119: invokespecial su/catlean/q7.C (J)Z
// 11c: goto 12a
// 11f: ldc2_w -5661514231005251267
// 122: lload 4
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: iload 2
// 12b: ifle 133
// 12e: ifeq 144
// 131: iload 18
// 133: ifeq 2ca
// 136: goto 144
// 139: ldc2_w -5661514231005251267
// 13c: lload 4
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: lload 10
// 146: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 149: aload 3
// 14a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 14d: dup
// 14e: sipush 7094
// 151: ldc2_w 7928177761134745148
// 154: lload 4
// 156: lxor
// 157: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/q7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15f: astore 23
// 161: lload 8
// 163: aload 22
// 165: getstatic net/minecraft/class_1893.field_9131 Lnet/minecraft/class_5321;
// 168: dup
// 169: sipush 7860
// 16c: ldc2_w 644697419216556850
// 16f: lload 4
// 171: lxor
// 172: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/q7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 17a: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 17d: istore 24
// 17f: aload 22
// 181: aload 23
// 183: invokevirtual net/minecraft/class_1799.method_7924 (Lnet/minecraft/class_2680;)F
// 186: fstore 25
// 188: aload 23
// 18a: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 18d: instanceof net/minecraft/class_2189
// 190: iload 18
// 192: iload 2
// 193: ifle 1c1
// 196: ifne 1bf
// 199: ifeq 1b7
// 19c: goto 1aa
// 19f: ldc2_w -5661514231005251267
// 1a2: lload 4
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: bipush -1
// 1ab: ireturn
// 1ac: ldc2_w -5661514231005251267
// 1af: lload 4
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: aload 23
// 1b9: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1bc: instanceof net/minecraft/class_2336
// 1bf: iload 18
// 1c1: ifne 2a8
// 1c4: ifeq 291
// 1c7: goto 1d5
// 1ca: ldc2_w -5661514231005251267
// 1cd: lload 4
// 1cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d4: athrow
// 1d5: aload 0
// 1d6: lload 6
// 1d8: invokespecial su/catlean/q7.z (J)Z
// 1db: iload 18
// 1dd: iload 1
// 1de: iflt 2aa
// 1e1: ifne 2a8
// 1e4: goto 1f2
// 1e7: ldc2_w -5661514231005251267
// 1ea: lload 4
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: iload 1
// 1f3: iflt 29a
// 1f6: ifeq 291
// 1f9: goto 207
// 1fc: ldc2_w -5661514231005251267
// 1ff: lload 4
// 201: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 206: athrow
// 207: lload 12
// 209: aload 22
// 20b: getstatic net/minecraft/class_1893.field_9099 Lnet/minecraft/class_5321;
// 20e: dup
// 20f: sipush 7471
// 212: ldc2_w 5970625938725081269
// 215: lload 4
// 217: lxor
// 218: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/q7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 220: invokestatic su/catlean/lq.v (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)Z
// 223: iload 18
// 225: iload 1
// 226: iflt 268
// 229: ifne 262
// 22c: goto 23a
// 22f: ldc2_w -5661514231005251267
// 232: lload 4
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: ifeq 2ca
// 23d: goto 24b
// 240: ldc2_w -5661514231005251267
// 243: lload 4
// 245: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: athrow
// 24b: iload 24
// 24d: i2f
// 24e: fload 25
// 250: fadd
// 251: fload 20
// 253: fcmpl
// 254: goto 262
// 257: ldc2_w -5661514231005251267
// 25a: lload 4
// 25c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 261: athrow
// 262: iload 2
// 263: ifle 28a
// 266: iload 18
// 268: ifne 286
// 26b: ifle 2ca
// 26e: goto 27c
// 271: ldc2_w -5661514231005251267
// 274: lload 4
// 276: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: athrow
// 27c: iload 24
// 27e: i2f
// 27f: fload 25
// 281: fadd
// 282: fstore 20
// 284: iload 21
// 286: istore 19
// 288: iload 18
// 28a: iload 1
// 28b: iflt 29a
// 28e: ifeq 2ca
// 291: iload 24
// 293: i2f
// 294: fload 25
// 296: fadd
// 297: fload 20
// 299: fcmpl
// 29a: goto 2a8
// 29d: ldc2_w -5661514231005251267
// 2a0: lload 4
// 2a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a7: athrow
// 2a8: iload 18
// 2aa: ifne 2c8
// 2ad: ifle 2ca
// 2b0: goto 2be
// 2b3: ldc2_w -5661514231005251267
// 2b6: lload 4
// 2b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bd: athrow
// 2be: iload 24
// 2c0: i2f
// 2c1: fload 25
// 2c3: fadd
// 2c4: fstore 20
// 2c6: iload 21
// 2c8: istore 19
// 2ca: iinc 21 1
// 2cd: iload 18
// 2cf: ifeq 056
// 2d2: iload 19
// 2d4: ireturn
}

private static final boolean E() {
long var0 = a ^ 39327348798814L;
long var2 = var0 ^ 90407459075088L;
boolean var4 = vm.a<"Å">(-7343865841726256651L, var0);

try {
boolean var10000 = T.x(var2);
if (var4) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -7330055428925369835L, var0);
}

return false;
}

static {
long var20 = a ^ 85034676594000L;
long var22 = var20 ^ 104424998981002L;
long var24 = var20 ^ 75949434719012L;
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
String var15 = "4,\u009esSË½H9g\u0090ë\u009d\u0089\u000b\u008cT(¯÷\u0004\u000b\u000f¡NÓ\u000fMë/àCx®·Á\u0093ðþ|\u009e°AáW\u0012¹2áéfÿ\\ü\u000f®xJøôE\u0087Z\u0003K\u001dç\u0014eQ\u0013Fú»\u0083°\u001dÓÙÎõÞH¹\u0018´\u000fV1¼½õ\f©¹\u0098Z®;\u001b1\u0097\u0083åà¬{\u001c\u001e6N*he£_>\u0081¨ß<í\u007fèì§é«\u00ad©ÿ¡\u0019ôÍg\u001dÍN\u0085Î\u00949ÔxB\u0015¹Ö|èº\u0013 Ù\u0094\u00ad¹Â]Q-\u0095öF\u0094íÏ9¤\u0091§[\f'\u0000~^1GE¡YZ\u00adÜ\u0018«_<ºèMþ¨\u0000£Òlé>C¯².D:ÈvRc(\\\u000e¨nåé`\u008cñ\u0099¿\u0012GL¶±%\u00ad4TÈÖ+71L\rµó\u00074µ\u00ad1¢ôÐÍîü\u00186\u0098©\u0003\u0019#\u0082Âkù\u0095ôW\u0011ÙÄµx\u009bf©\u009eÆ¾\u0010\u0004¡fÿ§Ú\u0085-sö\u0016í»9«E\u0018\u0007>\u008b\u00ad\u001aÉö=ºi\u009b\u0091`7+\u007fóð¦\u0082ÈÇ\u0088ê B÷ÊC~w\b\u008fP\u0005?V¾ã&«b\u00155Áà#6Ý£øÜ¨\u0010Né\u0005 ³N\u0092\u009d\fÊ\u008b6¥R\u001fjç_gùd7\u0096\u0083õ:I¹d\u0087A\u0002R\u001b\u001cp(\u00016nù\u00024wfé÷å6\u0091XÊVYauê^ \u0092Ø0£*-\u0006\u0012\u000fTº\u0001\u0012EbX\u0084~ \u0000\u0080\u0081)¥U\u00067\u0085y÷\u0090\u00848Uk+kí]v\u008aðe#\u008d#ÏX´Åó r\u008f\u0015\u0011ÀÒ'é\u0082i`\t&bý\u0094c\u0003\u0001\u001c§»Êy0\\ò¦F\u000bÕ\u0089\u0010\u0001\u0003\u0012\u0015Ñí\u0097£³\u0013ûwë¸8p \bR®\u008f²êp\u009a¡m.(Ý¨= ÉÏU;ôíDÍ\u0015Qß~ÓAû\u001d àx\u0005U?Él<Ú$õã\u008ePë\u00049e(Õ\u0082úføBú\fëd\u001a\u0087á(`æsE×\u00ad\u009c~ýºË ö\u001d\u00183±\n\u0002UßæI³d\u0017En7àp\u00adAM¢Û\u0089È¯\u0016\u0018\u0081\u009eÎªä+Fv\u0093S\f\u0003j´\u0089-Ò\u0088ÔîNMUÜ\u0018øÍê\u0091\u0002ù\t\u000e\u0014s\u0005B,[\u0097mS30«9¤x'\u0010îkõ\u008emcÇ{«\u008d¢t\u0084à#}";
int var17 = "4,\u009esSË½H9g\u0090ë\u009d\u0089\u000b\u008cT(¯÷\u0004\u000b\u000f¡NÓ\u000fMë/àCx®·Á\u0093ðþ|\u009e°AáW\u0012¹2áéfÿ\\ü\u000f®xJøôE\u0087Z\u0003K\u001dç\u0014eQ\u0013Fú»\u0083°\u001dÓÙÎõÞH¹\u0018´\u000fV1¼½õ\f©¹\u0098Z®;\u001b1\u0097\u0083åà¬{\u001c\u001e6N*he£_>\u0081¨ß<í\u007fèì§é«\u00ad©ÿ¡\u0019ôÍg\u001dÍN\u0085Î\u00949ÔxB\u0015¹Ö|èº\u0013 Ù\u0094\u00ad¹Â]Q-\u0095öF\u0094íÏ9¤\u0091§[\f'\u0000~^1GE¡YZ\u00adÜ\u0018«_<ºèMþ¨\u0000£Òlé>C¯².D:ÈvRc(\\\u000e¨nåé`\u008cñ\u0099¿\u0012GL¶±%\u00ad4TÈÖ+71L\rµó\u00074µ\u00ad1¢ôÐÍîü\u00186\u0098©\u0003\u0019#\u0082Âkù\u0095ôW\u0011ÙÄµx\u009bf©\u009eÆ¾\u0010\u0004¡fÿ§Ú\u0085-sö\u0016í»9«E\u0018\u0007>\u008b\u00ad\u001aÉö=ºi\u009b\u0091`7+\u007fóð¦\u0082ÈÇ\u0088ê B÷ÊC~w\b\u008fP\u0005?V¾ã&«b\u00155Áà#6Ý£øÜ¨\u0010Né\u0005 ³N\u0092\u009d\fÊ\u008b6¥R\u001fjç_gùd7\u0096\u0083õ:I¹d\u0087A\u0002R\u001b\u001cp(\u00016nù\u00024wfé÷å6\u0091XÊVYauê^ \u0092Ø0£*-\u0006\u0012\u000fTº\u0001\u0012EbX\u0084~ \u0000\u0080\u0081)¥U\u00067\u0085y÷\u0090\u00848Uk+kí]v\u008aðe#\u008d#ÏX´Åó r\u008f\u0015\u0011ÀÒ'é\u0082i`\t&bý\u0094c\u0003\u0001\u001c§»Êy0\\ò¦F\u000bÕ\u0089\u0010\u0001\u0003\u0012\u0015Ñí\u0097£³\u0013ûwë¸8p \bR®\u008f²êp\u009a¡m.(Ý¨= ÉÏU;ôíDÍ\u0015Qß~ÓAû\u001d àx\u0005U?Él<Ú$õã\u008ePë\u00049e(Õ\u0082úføBú\fëd\u001a\u0087á(`æsE×\u00ad\u009c~ýºË ö\u001d\u00183±\n\u0002UßæI³d\u0017En7àp\u00adAM¢Û\u0089È¯\u0016\u0018\u0081\u009eÎªä+Fv\u0093S\f\u0003j´\u0089-Ò\u0088ÔîNMUÜ\u0018øÍê\u0091\u0002ù\t\u000e\u0014s\u0005B,[\u0097mS30«9¤x'\u0010îkõ\u008emcÇ{«\u008d¢t\u0084à#}"
.length();
char var14 = ' ';
int var29 = -1;

label54:
while (true) {
String var30 = var15.substring(++var29, var29 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
String var41 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var41;
if ((var29 += var14) >= var17) {
b = var18;
c = new String[22];
k = new HashMap(13);
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
String var4 = "Ë\u0002\u0095¦\u001e£H\u0097qOm\u0007À\\=I'<y+\"3¥ï";
int var5 = "Ë\u0002\u0095¦\u001e£H\u0097qOm\u0007À\\=I'<y+\"3¥ï".length();
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
g = var6;
j = new Integer[5];
KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(q7.class, b<"p">(31731, 659661124407610717L ^ var20), b<"p">(7050, 114795635198766373L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(q7.class, b<"p">(1522, 1129085878886183775L ^ var20), b<"p">(279, 1504963201613313968L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(q7.class, b<"p">(25823, 2927365482046935671L ^ var20), b<"p">(3530, 2055736947592379233L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(q7.class, b<"p">(24217, 6907117336803502136L ^ var20), b<"p">(7611, 961119857474480899L ^ var20), 0))
};
d = var26;
T = new q7(var24);
e = yp.t(T, b<"p">(24671, 4379117005038737146L ^ var20), false, var22, null, null, c<"e">(23927, 7530592789552144271L ^ var20), null);
E = yp.t(T, b<"p">(32374, 2921280973803047116L ^ var20), true, var22, null, q7::E, 4, null);
i = yp.t(T, b<"p">(18152, 4676338431480918092L ^ var20), true, var22, null, null, c<"e">(28968, 5274086230947836886L ^ var20), null);
N = yp.t(T, b<"p">(15824, 7944993234751589229L ^ var20), true, var22, null, null, c<"e">(28968, 5274086230947836886L ^ var20), null);
P = new ArrayList();
return;
}
break;
default:
var33[var10001] = var50;
if (var2 < var5) {
continue label36;
}

var4 = "§¹\u0096Âv\u0086W_Ï\u000f\u0018¶«\bE§";
var5 = "§¹\u0096Âv\u0086W_Ï\u000f\u0018¶«\bE§".length();
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

var15 = "lF\u001fÓ¬Òú&1%âÈÓ\u009b\u008e\u0004USG\u008a\u0095\u0013\u0080q@}¥|\u0099\u0018s\u0006 Íï\u0082\u009c\u0017r\u00adÜ/\u008cPÙ.¶\u0081\u0085Ý÷µnç\u0018'¿!o û\u001a¸\u000fº";
var17 = "lF\u001fÓ¬Òú&1%âÈÓ\u009b\u008e\u0004USG\u008a\u0095\u0013\u0080q@}¥|\u0099\u0018s\u0006 Íï\u0082\u009c\u0017r\u00adÜ/\u008cPÙ.¶\u0081\u0085Ý÷µnç\u0018'¿!o û\u001a¸\u000fº"
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15856;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/q7", var10);
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
throw new RuntimeException("su/catlean/q7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18852;
if (j[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])k.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/q7", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
j[var3] = var15;
}

return j[var3];
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
throw new RuntimeException("su/catlean/q7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
