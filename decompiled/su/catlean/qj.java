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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class qj extends _g {
@NotNull
public static final qj E;
private static int a;
private static int F;
private static final long b = yz.a(9099944964559892237L, 7424291585205498834L, MethodHandles.lookup().lookupClass()).a(275873715428091L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private qj(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 129185534003892L;
super(b<"a">(22343, 1950798635781966957L ^ var4), jt.A(), null, 4, null, var6);
}

@Flow
private final void f(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qj.b J
// 003: ldc2_w 38049645625895
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 29520487726454
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 115682339384546
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 18711275523019
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 55863179759985
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 39691646595286
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 52376990533301
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 64307733279568
// 037: lxor
// 038: lstore 16
// 03a: pop2
// 03b: ldc2_w -2225716631018493368
// 03e: lload 2
// 03f: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: lload 16
// 046: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 049: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 04c: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 04f: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
// 052: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 055: istore 19
// 057: astore 18
// 059: aload 0
// 05a: lload 10
// 05c: invokespecial su/catlean/qj.Y (J)Lsu/catlean/fg;
// 05f: astore 20
// 061: aload 20
// 063: invokevirtual su/catlean/fg.R ()Z
// 066: aload 18
// 068: ifnull 07f
// 06b: ifne 07c
// 06e: goto 07b
// 071: ldc2_w -2189050818869857118
// 074: lload 2
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: return
// 07c: getstatic su/catlean/qj.a I
// 07f: aload 18
// 081: ifnull 0a2
// 084: ifle 0a0
// 087: goto 094
// 08a: ldc2_w -2189050818869857118
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: getstatic su/catlean/qj.a I
// 097: istore 21
// 099: iload 21
// 09b: bipush 1
// 09c: iadd
// 09d: putstatic su/catlean/qj.a I
// 0a0: iload 19
// 0a2: aload 18
// 0a4: ifnull 0ba
// 0a7: ifne 0f5
// 0aa: goto 0b7
// 0ad: ldc2_w -2189050818869857118
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: getstatic su/catlean/qj.a I
// 0ba: aload 18
// 0bc: ifnull 0ec
// 0bf: ifne 0f5
// 0c2: goto 0cf
// 0c5: ldc2_w -2189050818869857118
// 0c8: lload 2
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: bipush 2
// 0d0: bipush 4
// 0d1: bipush 0
// 0d2: lload 12
// 0d4: bipush 4
// 0d5: aconst_null
// 0d6: invokestatic su/catlean/mf.P (IIZJILjava/lang/Object;)I
// 0d9: putstatic su/catlean/qj.F I
// 0dc: getstatic su/catlean/qj.a I
// 0df: goto 0ec
// 0e2: ldc2_w -2189050818869857118
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: istore 21
// 0ee: iload 21
// 0f0: bipush 1
// 0f1: iadd
// 0f2: putstatic su/catlean/qj.a I
// 0f5: lload 4
// 0f7: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0fa: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0fd: ifnull 281
// 100: iload 19
// 102: aload 18
// 104: ifnull 284
// 107: goto 114
// 10a: ldc2_w -2189050818869857118
// 10d: lload 2
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: ifne 281
// 117: goto 124
// 11a: ldc2_w -2189050818869857118
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: lload 4
// 126: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 129: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 12c: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 12f: i2f
// 130: fconst_2
// 131: fdiv
// 132: ldc 80.0
// 134: fsub
// 135: fstore 21
// 137: lload 4
// 139: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 13c: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 13f: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 142: i2f
// 143: fconst_2
// 144: fdiv
// 145: fstore 22
// 147: aload 20
// 149: invokevirtual su/catlean/fg.a ()I
// 14c: sipush 15792
// 14f: ldc2_w 1937385838082907714
// 152: lload 2
// 153: lxor
// 154: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: irem
// 15a: istore 23
// 15c: sipush 24393
// 15f: aload 20
// 161: invokevirtual su/catlean/fg.a ()I
// 164: istore 25
// 166: ldc2_w 8804774964173651125
// 169: lload 2
// 16a: lxor
// 16b: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: istore 26
// 172: iload 25
// 174: iload 26
// 176: idiv
// 177: istore 27
// 179: iload 25
// 17b: iload 26
// 17d: ixor
// 17e: aload 18
// 180: ifnull 1c3
// 183: ifge 1bf
// 186: goto 193
// 189: ldc2_w -2189050818869857118
// 18c: lload 2
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: iload 27
// 195: iload 26
// 197: imul
// 198: iload 25
// 19a: aload 18
// 19c: ifnull 1c2
// 19f: goto 1ac
// 1a2: ldc2_w -2189050818869857118
// 1a5: lload 2
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: if_icmpeq 1bf
// 1af: goto 1bc
// 1b2: ldc2_w -2189050818869857118
// 1b5: lload 2
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: iinc 27 -1
// 1bf: iload 27
// 1c1: bipush 1
// 1c2: isub
// 1c3: istore 24
// 1c5: fload 21
// 1c7: iload 23
// 1c9: sipush 658
// 1cc: ldc2_w 5583868320068690277
// 1cf: lload 2
// 1d0: lxor
// 1d1: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: imul
// 1d7: i2f
// 1d8: fadd
// 1d9: fstore 25
// 1db: fload 22
// 1dd: iload 24
// 1df: sipush 14815
// 1e2: ldc2_w 3203105308440353323
// 1e5: lload 2
// 1e6: lxor
// 1e7: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: imul
// 1ed: i2f
// 1ee: fadd
// 1ef: fstore 26
// 1f1: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 1f4: invokevirtual su/catlean/w8.H ()F
// 1f7: f2d
// 1f8: fload 25
// 1fa: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 1fd: invokevirtual su/catlean/w8.H ()F
// 200: fsub
// 201: f2d
// 202: ldc2_w 0.6
// 205: dmul
// 206: dadd
// 207: dstore 27
// 209: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 20c: invokevirtual su/catlean/w8.u ()F
// 20f: f2d
// 210: fload 26
// 212: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 215: invokevirtual su/catlean/w8.u ()F
// 218: fsub
// 219: f2d
// 21a: ldc2_w 0.6
// 21d: dmul
// 21e: dadd
// 21f: dstore 29
// 221: lload 4
// 223: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 226: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 229: invokevirtual net/minecraft/class_1041.method_4495 ()I
// 22c: istore 31
// 22e: lload 4
// 230: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 233: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 236: sipush 29714
// 239: ldc2_w 6244699583095904231
// 23c: lload 2
// 23d: lxor
// 23e: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 243: dload 27
// 245: iload 31
// 247: i2d
// 248: dmul
// 249: dload 29
// 24b: iload 31
// 24d: i2d
// 24e: dmul
// 24f: invokestatic net/minecraft/class_3675.method_15984 (Lnet/minecraft/class_1041;IDD)V
// 252: lload 4
// 254: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 257: getfield net/minecraft/class_310.field_1729 Lnet/minecraft/class_312;
// 25a: dup
// 25b: sipush 7986
// 25e: ldc2_w 6951406254029798987
// 261: lload 2
// 262: lxor
// 263: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/qj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 268: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 26b: checkcast su/catlean/interfaces/IMouse
// 26e: dload 27
// 270: iload 31
// 272: i2d
// 273: dmul
// 274: d2i
// 275: dload 29
// 277: iload 31
// 279: i2d
// 27a: dmul
// 27b: d2i
// 27c: invokeinterface su/catlean/interfaces/IMouse.setPosition (II)V 3
// 281: getstatic su/catlean/qj.a I
// 284: getstatic su/catlean/qj.F I
// 287: if_icmplt 367
// 28a: lload 4
// 28c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 28f: aload 18
// 291: ifnull 2d1
// 294: goto 2a1
// 297: ldc2_w -2189050818869857118
// 29a: lload 2
// 29b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a0: athrow
// 2a1: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 2a4: ifnonnull 304
// 2a7: goto 2b4
// 2aa: ldc2_w -2189050818869857118
// 2ad: lload 2
// 2ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: athrow
// 2b4: lload 4
// 2b6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2b9: invokevirtual net/minecraft/class_310.method_1577 ()Lnet/minecraft/class_1156;
// 2bc: invokevirtual net/minecraft/class_1156.method_4912 ()V
// 2bf: lload 4
// 2c1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2c4: goto 2d1
// 2c7: ldc2_w -2189050818869857118
// 2ca: lload 2
// 2cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d0: athrow
// 2d1: new net/minecraft/class_490
// 2d4: dup
// 2d5: lload 16
// 2d7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2da: checkcast net/minecraft/class_1657
// 2dd: invokespecial net/minecraft/class_490.<init> (Lnet/minecraft/class_1657;)V
// 2e0: checkcast net/minecraft/class_437
// 2e3: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
// 2e6: getstatic su/catlean/qj.F I
// 2e9: bipush 2
// 2ea: bipush 4
// 2eb: bipush 0
// 2ec: lload 12
// 2ee: bipush 4
// 2ef: aconst_null
// 2f0: invokestatic su/catlean/mf.P (IIZJILjava/lang/Object;)I
// 2f3: iadd
// 2f4: putstatic su/catlean/qj.F I
// 2f7: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2fa: lload 8
// 2fc: invokevirtual su/catlean/dm.D (J)V
// 2ff: aload 18
// 301: ifnonnull 367
// 304: aload 20
// 306: invokevirtual su/catlean/fg.a ()I
// 309: lload 6
// 30b: sipush 14510
// 30e: ldc2_w 2137529323231632222
// 311: lload 2
// 312: lxor
// 313: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 318: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 31b: bipush 0
// 31c: sipush 28451
// 31f: ldc2_w 4944201252855745744
// 322: lload 2
// 323: lxor
// 324: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: aconst_null
// 32a: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 32d: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 330: bipush 2
// 331: bipush 4
// 332: bipush 0
// 333: lload 12
// 335: bipush 4
// 336: aconst_null
// 337: invokestatic su/catlean/mf.P (IIZJILjava/lang/Object;)I
// 33a: lload 14
// 33c: dup2_x1
// 33d: pop2
// 33e: bipush 0
// 33f: bipush 0
// 340: invokedynamic run ()Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/qj.e ()V, ()V ]
// 345: sipush 21752
// 348: ldc2_w 4422269342903678734
// 34b: lload 2
// 34c: lxor
// 34d: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 352: aconst_null
// 353: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 356: bipush 0
// 357: putstatic su/catlean/qj.a I
// 35a: goto 367
// 35d: ldc2_w -2189050818869857118
// 360: lload 2
// 361: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 366: athrow
// 367: return
}

private final fg Y(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qj.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 14861598199327
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 90744414499526
// 011: lxor
// 012: lstore 5
// 014: pop2
// 015: ldc2_w -3281508012437432031
// 018: lload 1
// 019: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e: new java/util/ArrayList
// 021: dup
// 022: invokespecial java/util/ArrayList.<init> ()V
// 025: checkcast java/util/List
// 028: astore 11
// 02a: astore 10
// 02c: sipush 15797
// 02f: ldc2_w 908987569583942957
// 032: lload 1
// 033: lxor
// 034: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039: istore 12
// 03b: bipush -1
// 03c: iload 12
// 03e: if_icmpge 121
// 041: lload 3
// 042: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 045: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 048: aload 10
// 04a: ifnull 169
// 04d: dup
// 04e: ifnull 084
// 051: goto 05e
// 054: ldc2_w -3244849314096429109
// 057: lload 1
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 061: dup
// 062: ifnull 084
// 065: goto 072
// 068: ldc2_w -3244849314096429109
// 06b: lload 1
// 06c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: athrow
// 072: iload 12
// 074: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 077: goto 086
// 07a: ldc2_w -3244849314096429109
// 07d: lload 1
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: pop
// 085: aconst_null
// 086: astore 13
// 088: aload 10
// 08a: ifnull 0b1
// 08d: aload 13
// 08f: dup
// 090: ifnull 0b0
// 093: goto 0a0
// 096: ldc2_w -3244849314096429109
// 099: lload 1
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0a3: goto 0b2
// 0a6: ldc2_w -3244849314096429109
// 0a9: lload 1
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: pop
// 0b1: aconst_null
// 0b2: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
// 0b5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b8: ifeq 119
// 0bb: aload 11
// 0bd: new su/catlean/fg
// 0c0: dup
// 0c1: iload 12
// 0c3: sipush 24393
// 0c6: ldc2_w 8804765365825802204
// 0c9: lload 1
// 0ca: lxor
// 0cb: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: if_icmpge 0fd
// 0d3: goto 0e0
// 0d6: ldc2_w -3244849314096429109
// 0d9: lload 1
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: iload 12
// 0e2: sipush 21174
// 0e5: ldc2_w 6253605911976411682
// 0e8: lload 1
// 0e9: lxor
// 0ea: invokedynamic e (IJ)I bsm=su/catlean/qj.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: iadd
// 0f0: goto 0ff
// 0f3: ldc2_w -3244849314096429109
// 0f6: lload 1
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: iload 12
// 0ff: bipush 1
// 100: aload 13
// 102: astore 7
// 104: istore 8
// 106: istore 9
// 108: lload 5
// 10a: iload 9
// 10c: iload 8
// 10e: aload 7
// 110: invokespecial su/catlean/fg.<init> (JIZLnet/minecraft/class_1799;)V
// 113: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 118: pop
// 119: iinc 12 -1
// 11c: aload 10
// 11e: ifnonnull 03b
// 121: aload 11
// 123: checkcast java/util/Collection
// 126: lload 1
// 127: lconst_0
// 128: lcmp
// 129: ifle 169
// 12c: invokeinterface java/util/Collection.isEmpty ()Z 1
// 131: aload 10
// 133: ifnull 147
// 136: ifne 14a
// 139: goto 146
// 13c: ldc2_w -3244849314096429109
// 13f: lload 1
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: bipush 1
// 147: goto 14b
// 14a: bipush 0
// 14b: ifeq 16d
// 14e: aload 11
// 150: checkcast java/util/Collection
// 153: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 156: checkcast kotlin/random/Random
// 159: invokestatic kotlin/collections/CollectionsKt.random (Ljava/util/Collection;Lkotlin/random/Random;)Ljava/lang/Object;
// 15c: goto 169
// 15f: ldc2_w -3244849314096429109
// 162: lload 1
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: checkcast su/catlean/fg
// 16c: areturn
// 16d: getstatic su/catlean/fg.O Lsu/catlean/d5;
// 170: invokevirtual su/catlean/d5.G ()Lsu/catlean/fg;
// 173: areturn
}

private static final void e() {
long var0 = b ^ 12327526806367L;
long var2 = var0 ^ 56574926687246L;
long var4 = var0 ^ 128415954269425L;
long var6 = var0 ^ 21792292766248L;
zf.v(var6).method_3137();
zf.v(var6).method_7346();
zf.F(var2).method_1507(null);
dm.h.F(var4);
}

static {
long var20 = b ^ 130949037004975L;
long var10001 = var20 ^ 38843117503170L;
int var22 = (int)((var20 ^ 38843117503170L) >>> 32);
int var23 = (int)((var20 ^ 38843117503170L) << 32 >>> 48);
int var24 = (int)(var10001 << 48 >>> 48);
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
String var15 = "\u001c\u0090ÁX½\u00adªóP£[HîªÂb°eæý·íFù\u0094\u0093}Ês0à~¥v|®Q\u0090 O¡\u0096XÛg\u0087\u0086«<Æ[\u0001ÏY©\u0097C\u009a\u0018Ø¾sÏ¼ºä©|\u001dÍUºôU\u000b\ta\u0018\u0012×\u0085\u001bñ\u0016ó½/¨(\u0012qH\u0003û^Ç~î+¬\u009f0_ü%¤®õ§J\u001a\b ÂÒ9Ûò\u0093Á\u0083ÄiX¿ØÜÂ\u0004Ø\u0002zD\u0095sã\u008c\u0016\u0097¾\u008c¿ZPÜ";
int var17 = "\u001c\u0090ÁX½\u00adªóP£[HîªÂb°eæý·íFù\u0094\u0093}Ês0à~¥v|®Q\u0090 O¡\u0096XÛg\u0087\u0086«<Æ[\u0001ÏY©\u0097C\u009a\u0018Ø¾sÏ¼ºä©|\u001dÍUºôU\u000b\ta\u0018\u0012×\u0085\u001bñ\u0016ó½/¨(\u0012qH\u0003û^Ç~î+¬\u009f0_ü%¤®õ§J\u001a\b ÂÒ9Ûò\u0093Á\u0083ÄiX¿ØÜÂ\u0004Ø\u0002zD\u0095sã\u008c\u0016\u0097¾\u008c¿ZPÜ"
.length();
char var14 = 'p';
int var13 = -1;

while (true) {
byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
String var34 = b(var19).intern();
byte var29 = -1;
var18[var16++] = var34;
if ((var13 += var14) >= var17) {
c = var18;
d = new String[2];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[10];
int var3 = 0;
String var4 = "K\f[Á²Ý7¡J\u0006ï\u001d\u0085%¦õÞCë\u0015¤\u0005\u009a\u008dC}+Ä¬\u00145µîÃ7\u001f¹\u0082øG&ê§\u009eªT\u0097\u009f¸\u009a\u0088ýG{\u0097¥\u001b\u0096!ÚnF8ß";
int var5 = "K\f[Á²Ý7¡J\u0006ï\u001d\u0085%¦õÞCë\u0015¤\u0005\u009a\u008dC}+Ä¬\u00145µîÃ7\u001f¹\u0082øG&ê§\u009eªT\u0097\u009f¸\u009a\u0088ýG{\u0097¥\u001b\u0096!ÚnF8ß"
.length();
byte var2 = 0;

label32:
while (true) {
byte var31 = var2;
var2 += 8;
byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
int var32 = var3++;
long var37 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var40 = -1;

while (true) {
long var8 = var37;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var42 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var40) {
case 0:
var28[var32] = var42;
if (var2 >= var5) {
f = var6;
g = new Integer[10];
E = new qj(var22, (short)var23, (char)var24);
return;
}
break;
default:
var28[var32] = var42;
if (var2 < var5) {
continue label32;
}

var4 = "c\b\f;\u001cOgF\\gl½ô\u0092Uç";
var5 = "c\b\f;\u001cOgF\\gl½ô\u0092Uç".length();
var2 = 0;
}

byte var33 = var2;
var2 += 8;
var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
var28 = var6;
var32 = var3++;
var37 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var40 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 326;
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
throw new RuntimeException("su/catlean/qj", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
throw new RuntimeException("su/catlean/qj" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 970;
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
throw new RuntimeException("su/catlean/qj", var14);
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
throw new RuntimeException("su/catlean/qj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
