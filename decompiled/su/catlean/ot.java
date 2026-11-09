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
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ot {
private static final long a = yz.a(-3146236039537320697L, -5361529564068961534L, MethodHandles.lookup().lookupClass()).a(66330673313676L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

@Nullable
public static final mm W(long a, @NotNull gp configState, @NotNull List clearedList) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ot.a J
// 003: lload 0
// 004: lxor
// 005: lstore 0
// 006: lload 0
// 007: dup2
// 008: ldc2_w 15799116163078
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w -8783162572412522179
// 012: lload 0
// 013: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 2
// 019: sipush 15361
// 01c: ldc2_w 3833029144006189064
// 01f: lload 0
// 020: lxor
// 021: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ot.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: astore 6
// 02b: aload 3
// 02c: sipush 1202
// 02f: ldc2_w 5048284915500308671
// 032: lload 0
// 033: lxor
// 034: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ot.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03c: aload 3
// 03d: aload 6
// 03f: ifnonnull 067
// 042: invokeinterface java/util/List.isEmpty ()Z 1
// 047: ifeq 063
// 04a: goto 057
// 04d: ldc2_w -8746495974612243628
// 050: lload 0
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: aconst_null
// 058: areturn
// 059: ldc2_w -8746495974612243628
// 05c: lload 0
// 05d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: athrow
// 063: aload 3
// 064: checkcast java/lang/Iterable
// 067: astore 8
// 069: bipush 0
// 06a: istore 9
// 06c: aload 8
// 06e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 073: astore 10
// 075: aload 10
// 077: aload 6
// 079: ifnonnull 0aa
// 07c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 081: ifne 0a3
// 084: goto 091
// 087: ldc2_w -8746495974612243628
// 08a: lload 0
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: new java/util/NoSuchElementException
// 094: dup
// 095: invokespecial java/util/NoSuchElementException.<init> ()V
// 098: athrow
// 099: ldc2_w -8746495974612243628
// 09c: lload 0
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: aload 10
// 0a5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0aa: astore 11
// 0ac: aload 10
// 0ae: aload 6
// 0b0: ifnonnull 0d9
// 0b3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0b8: ifne 0d7
// 0bb: goto 0c8
// 0be: ldc2_w -8746495974612243628
// 0c1: lload 0
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: aload 11
// 0ca: goto 131
// 0cd: ldc2_w -8746495974612243628
// 0d0: lload 0
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: aload 11
// 0d9: checkcast su/catlean/mm
// 0dc: astore 12
// 0de: bipush 0
// 0df: istore 13
// 0e1: aload 12
// 0e3: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 0e6: invokevirtual su/catlean/t_.c ()F
// 0e9: fstore 12
// 0eb: aload 10
// 0ed: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0f2: astore 13
// 0f4: aload 13
// 0f6: checkcast su/catlean/mm
// 0f9: astore 14
// 0fb: bipush 0
// 0fc: istore 15
// 0fe: aload 14
// 100: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 103: invokevirtual su/catlean/t_.c ()F
// 106: fstore 14
// 108: fload 12
// 10a: fload 14
// 10c: invokestatic java/lang/Float.compare (FF)I
// 10f: ifge 11a
// 112: aload 13
// 114: astore 11
// 116: fload 14
// 118: fstore 12
// 11a: aload 10
// 11c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 121: ifne 0eb
// 124: aload 6
// 126: lload 0
// 127: lconst_0
// 128: lcmp
// 129: ifle 114
// 12c: ifnonnull 116
// 12f: aload 11
// 131: checkcast su/catlean/mm
// 134: astore 7
// 136: aload 2
// 137: invokevirtual su/catlean/gp.K ()Z
// 13a: aload 6
// 13c: ifnonnull 32e
// 13f: ifeq 30e
// 142: goto 14f
// 145: ldc2_w -8746495974612243628
// 148: lload 0
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: aload 3
// 150: invokeinterface java/util/List.size ()I 1
// 155: lload 0
// 156: lconst_0
// 157: lcmp
// 158: iflt 32e
// 15b: aload 6
// 15d: ifnonnull 32e
// 160: goto 16d
// 163: ldc2_w -8746495974612243628
// 166: lload 0
// 167: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: athrow
// 16d: bipush 1
// 16e: if_icmple 30e
// 171: goto 17e
// 174: ldc2_w -8746495974612243628
// 177: lload 0
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: aload 3
// 17f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 184: astore 8
// 186: aload 8
// 188: invokeinterface java/util/Iterator.hasNext ()Z 1
// 18d: ifeq 30e
// 190: aload 8
// 192: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 197: checkcast su/catlean/mm
// 19a: astore 9
// 19c: aload 9
// 19e: aload 6
// 1a0: ifnonnull 1de
// 1a3: aload 7
// 1a5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1a8: aload 6
// 1aa: ifnonnull 32e
// 1ad: goto 1ba
// 1b0: ldc2_w -8746495974612243628
// 1b3: lload 0
// 1b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: athrow
// 1ba: ifeq 1dc
// 1bd: goto 1ca
// 1c0: ldc2_w -8746495974612243628
// 1c3: lload 0
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: aload 6
// 1cc: ifnull 186
// 1cf: goto 1dc
// 1d2: ldc2_w -8746495974612243628
// 1d5: lload 0
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: aload 7
// 1de: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 1e1: invokevirtual su/catlean/t_.c ()F
// 1e4: aload 9
// 1e6: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 1e9: invokevirtual su/catlean/t_.c ()F
// 1ec: fsub
// 1ed: fstore 10
// 1ef: aload 7
// 1f1: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 1f4: invokevirtual su/catlean/t_.i ()F
// 1f7: aload 9
// 1f9: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 1fc: invokevirtual su/catlean/t_.i ()F
// 1ff: fsub
// 200: fstore 11
// 202: aload 7
// 204: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 207: invokevirtual su/catlean/t_.i ()F
// 20a: aload 9
// 20c: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 20f: invokevirtual su/catlean/t_.i ()F
// 212: fcmpl
// 213: aload 6
// 215: ifnonnull 229
// 218: ifle 22c
// 21b: goto 228
// 21e: ldc2_w -8746495974612243628
// 221: lload 0
// 222: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: athrow
// 228: bipush 1
// 229: goto 22d
// 22c: bipush 0
// 22d: istore 12
// 22f: iload 12
// 231: aload 6
// 233: lload 0
// 234: lconst_0
// 235: lcmp
// 236: iflt 255
// 239: ifnonnull 253
// 23c: ifeq 186
// 23f: goto 24c
// 242: ldc2_w -8746495974612243628
// 245: lload 0
// 246: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: athrow
// 24c: fload 11
// 24e: aload 2
// 24f: invokevirtual su/catlean/gp.h ()F
// 252: fcmpl
// 253: aload 6
// 255: lload 0
// 256: lconst_0
// 257: lcmp
// 258: iflt 277
// 25b: ifnonnull 275
// 25e: ifle 186
// 261: goto 26e
// 264: ldc2_w -8746495974612243628
// 267: lload 0
// 268: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: athrow
// 26e: fload 10
// 270: aload 2
// 271: invokevirtual su/catlean/gp.h ()F
// 274: fcmpg
// 275: aload 6
// 277: ifnonnull 2d4
// 27a: ifle 2ba
// 27d: goto 28a
// 280: ldc2_w -8746495974612243628
// 283: lload 0
// 284: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: athrow
// 28a: aload 9
// 28c: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 28f: invokevirtual su/catlean/t_.Y ()Z
// 292: lload 0
// 293: lconst_0
// 294: lcmp
// 295: ifle 2d4
// 298: aload 6
// 29a: ifnonnull 2d4
// 29d: goto 2aa
// 2a0: ldc2_w -8746495974612243628
// 2a3: lload 0
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: ifeq 186
// 2ad: goto 2ba
// 2b0: ldc2_w -8746495974612243628
// 2b3: lload 0
// 2b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: athrow
// 2ba: aload 7
// 2bc: aload 6
// 2be: ifnonnull 309
// 2c1: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 2c4: invokevirtual su/catlean/t_.Y ()Z
// 2c7: goto 2d4
// 2ca: ldc2_w -8746495974612243628
// 2cd: lload 0
// 2ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d3: athrow
// 2d4: ifeq 307
// 2d7: aload 9
// 2d9: aload 6
// 2db: ifnonnull 309
// 2de: goto 2eb
// 2e1: ldc2_w -8746495974612243628
// 2e4: lload 0
// 2e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ea: athrow
// 2eb: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 2ee: invokevirtual su/catlean/t_.Y ()Z
// 2f1: ifeq 186
// 2f4: lload 0
// 2f5: lconst_0
// 2f6: lcmp
// 2f7: iflt 19c
// 2fa: goto 307
// 2fd: ldc2_w -8746495974612243628
// 300: lload 0
// 301: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: athrow
// 307: aload 9
// 309: astore 7
// 30b: goto 30e
// 30e: aload 7
// 310: lload 0
// 311: lconst_0
// 312: lcmp
// 313: ifle 31e
// 316: aload 6
// 318: ifnonnull 60f
// 31b: invokevirtual su/catlean/mm.t ()Ljava/lang/Object;
// 31e: instanceof net/minecraft/class_3965
// 321: goto 32e
// 324: ldc2_w -8746495974612243628
// 327: lload 0
// 328: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32d: athrow
// 32e: ifeq 60d
// 331: aload 3
// 332: aload 6
// 334: ifnonnull 37d
// 337: goto 344
// 33a: ldc2_w -8746495974612243628
// 33d: lload 0
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: invokeinterface java/util/List.size ()I 1
// 349: bipush 1
// 34a: if_icmple 60d
// 34d: goto 35a
// 350: ldc2_w -8746495974612243628
// 353: lload 0
// 354: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 359: athrow
// 35a: aload 7
// 35c: invokevirtual su/catlean/mm.t ()Ljava/lang/Object;
// 35f: dup
// 360: sipush 9839
// 363: ldc2_w 6383638062623914596
// 366: lload 0
// 367: lxor
// 368: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ot.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 370: goto 37d
// 373: ldc2_w -8746495974612243628
// 376: lload 0
// 377: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37c: athrow
// 37d: checkcast net/minecraft/class_3965
// 380: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 383: dup
// 384: sipush 6405
// 387: ldc2_w 5467155178613884175
// 38a: lload 0
// 38b: lxor
// 38c: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ot.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 391: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 394: astore 8
// 396: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 399: bipush 0
// 39a: bipush 1
// 39b: aconst_null
// 39c: lload 4
// 39e: invokestatic su/catlean/ex.q (Lsu/catlean/ex;ZILjava/lang/Object;J)Ljava/util/List;
// 3a1: astore 9
// 3a3: aload 2
// 3a4: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 3a7: invokevirtual net/minecraft/class_1657.method_24515 ()Lnet/minecraft/class_2338;
// 3aa: dup
// 3ab: sipush 13246
// 3ae: ldc2_w 2690457411743346609
// 3b1: lload 0
// 3b2: lxor
// 3b3: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ot.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3bb: astore 10
// 3bd: aload 8
// 3bf: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 3c2: aload 6
// 3c4: ifnonnull 416
// 3c7: aload 10
// 3c9: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 3cc: if_icmpne 408
// 3cf: goto 3dc
// 3d2: ldc2_w -8746495974612243628
// 3d5: lload 0
// 3d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3db: athrow
// 3dc: aload 8
// 3de: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 3e1: aload 6
// 3e3: ifnonnull 416
// 3e6: goto 3f3
// 3e9: ldc2_w -8746495974612243628
// 3ec: lload 0
// 3ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f2: athrow
// 3f3: aload 10
// 3f5: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 3f8: if_icmpeq 419
// 3fb: goto 408
// 3fe: ldc2_w -8746495974612243628
// 401: lload 0
// 402: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 407: athrow
// 408: bipush 1
// 409: goto 416
// 40c: ldc2_w -8746495974612243628
// 40f: lload 0
// 410: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 415: athrow
// 416: goto 41a
// 419: bipush 0
// 41a: istore 11
// 41c: aload 9
// 41e: aload 8
// 420: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 425: aload 6
// 427: ifnonnull 43c
// 42a: ifeq 60d
// 42d: goto 43a
// 430: ldc2_w -8746495974612243628
// 433: lload 0
// 434: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 439: athrow
// 43a: iload 11
// 43c: ifeq 60d
// 43f: aload 3
// 440: checkcast java/lang/Iterable
// 443: astore 13
// 445: nop
// 446: bipush 0
// 447: istore 14
// 449: aload 13
// 44b: astore 15
// 44d: new java/util/ArrayList
// 450: dup
// 451: invokespecial java/util/ArrayList.<init> ()V
// 454: checkcast java/util/Collection
// 457: astore 16
// 459: bipush 0
// 45a: istore 17
// 45c: aload 15
// 45e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 463: astore 18
// 465: aload 18
// 467: invokeinterface java/util/Iterator.hasNext ()Z 1
// 46c: ifeq 508
// 46f: aload 18
// 471: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 476: astore 19
// 478: aload 19
// 47a: checkcast su/catlean/mm
// 47d: astore 20
// 47f: bipush 0
// 480: istore 21
// 482: lload 0
// 483: lconst_0
// 484: lcmp
// 485: iflt 51d
// 488: aload 20
// 48a: invokevirtual su/catlean/mm.t ()Ljava/lang/Object;
// 48d: instanceof net/minecraft/class_3965
// 490: aload 6
// 492: ifnonnull 51b
// 495: aload 6
// 497: lload 0
// 498: lconst_0
// 499: lcmp
// 49a: iflt 4de
// 49d: ifnonnull 4dc
// 4a0: goto 4ad
// 4a3: ldc2_w -8746495974612243628
// 4a6: lload 0
// 4a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ac: athrow
// 4ad: ifeq 4f5
// 4b0: goto 4bd
// 4b3: ldc2_w -8746495974612243628
// 4b6: lload 0
// 4b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bc: athrow
// 4bd: aload 9
// 4bf: aload 20
// 4c1: invokevirtual su/catlean/mm.t ()Ljava/lang/Object;
// 4c4: checkcast net/minecraft/class_3965
// 4c7: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 4ca: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 4cf: goto 4dc
// 4d2: ldc2_w -8746495974612243628
// 4d5: lload 0
// 4d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4db: athrow
// 4dc: aload 6
// 4de: ifnonnull 4f2
// 4e1: ifne 4f5
// 4e4: goto 4f1
// 4e7: ldc2_w -8746495974612243628
// 4ea: lload 0
// 4eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f0: athrow
// 4f1: bipush 1
// 4f2: goto 4f6
// 4f5: bipush 0
// 4f6: ifeq 465
// 4f9: aload 16
// 4fb: aload 19
// 4fd: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 502: pop
// 503: aload 6
// 505: ifnull 465
// 508: aload 16
// 50a: checkcast java/util/List
// 50d: nop
// 50e: checkcast java/lang/Iterable
// 511: astore 13
// 513: nop
// 514: lload 0
// 515: lconst_0
// 516: lcmp
// 517: ifle 51d
// 51a: bipush 0
// 51b: istore 14
// 51d: aload 13
// 51f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 524: astore 15
// 526: aload 15
// 528: invokeinterface java/util/Iterator.hasNext ()Z 1
// 52d: lload 0
// 52e: lconst_0
// 52f: lcmp
// 530: iflt 578
// 533: aload 6
// 535: ifnonnull 578
// 538: ifne 556
// 53b: goto 548
// 53e: ldc2_w -8746495974612243628
// 541: lload 0
// 542: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 547: athrow
// 548: aconst_null
// 549: goto 5e4
// 54c: ldc2_w -8746495974612243628
// 54f: lload 0
// 550: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 555: athrow
// 556: aload 15
// 558: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 55d: astore 16
// 55f: aload 15
// 561: aload 6
// 563: ifnonnull 58c
// 566: invokeinterface java/util/Iterator.hasNext ()Z 1
// 56b: goto 578
// 56e: ldc2_w -8746495974612243628
// 571: lload 0
// 572: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 577: athrow
// 578: ifne 58a
// 57b: aload 16
// 57d: goto 5e4
// 580: ldc2_w -8746495974612243628
// 583: lload 0
// 584: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 589: athrow
// 58a: aload 16
// 58c: checkcast su/catlean/mm
// 58f: astore 17
// 591: bipush 0
// 592: istore 18
// 594: aload 17
// 596: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 599: invokevirtual su/catlean/t_.c ()F
// 59c: fstore 17
// 59e: aload 15
// 5a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5a5: astore 18
// 5a7: aload 18
// 5a9: checkcast su/catlean/mm
// 5ac: astore 19
// 5ae: bipush 0
// 5af: istore 20
// 5b1: aload 19
// 5b3: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 5b6: invokevirtual su/catlean/t_.c ()F
// 5b9: fstore 19
// 5bb: fload 17
// 5bd: fload 19
// 5bf: invokestatic java/lang/Float.compare (FF)I
// 5c2: ifge 5cd
// 5c5: aload 18
// 5c7: astore 16
// 5c9: fload 19
// 5cb: fstore 17
// 5cd: aload 15
// 5cf: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5d4: ifne 59e
// 5d7: aload 6
// 5d9: lload 0
// 5da: lconst_0
// 5db: lcmp
// 5dc: iflt 5c7
// 5df: ifnonnull 5c9
// 5e2: aload 16
// 5e4: checkcast su/catlean/mm
// 5e7: astore 12
// 5e9: aload 12
// 5eb: aload 6
// 5ed: ifnonnull 60f
// 5f0: ifnull 60d
// 5f3: goto 600
// 5f6: ldc2_w -8746495974612243628
// 5f9: lload 0
// 5fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ff: athrow
// 600: aload 12
// 602: areturn
// 603: ldc2_w -8746495974612243628
// 606: lload 0
// 607: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60c: athrow
// 60d: aload 7
// 60f: areturn
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private static final boolean m(long var0, float var2, float var3, gp var4) {
var0 = a ^ var0;
long var5 = var0 ^ 119426117495027L;
String var7 = vm.a<"Å">(-5043271808485864156L, var0);

label138: {
try {
boolean var10000 = var4.u();
if (var7 != null) {
return var10000;
}

if (var10000) {
break label138;
}
} catch (NoSuchElementException var19) {
throw vm.a<"Å">(var19, -5005901143172753587L, var0);
}

return false;
}

float var8 = var4.t().method_6032() + var4.t().method_6067();
float var9 = zf.v(var5).method_6032() + zf.v(var5).method_6067();

int var21;
label112: {
label111: {
try {
float var24;
var21 = (var24 = var2 * var4.m() - var8) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
if (var7 != null) {
break label112;
}

if (var21 > 0) {
break label111;
}
} catch (NoSuchElementException var18) {
throw vm.a<"Å">(var18, -5005901143172753587L, var0);
}

var21 = 0;
break label112;
}

var21 = 1;
}

int var10 = var21;

label102: {
label101: {
try {
float var25;
var21 = (var25 = var3 - var9) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
if (var7 != null) {
break label102;
}

if (var21 < 0) {
break label101;
}
} catch (NoSuchElementException var17) {
throw vm.a<"Å">(var17, -5005901143172753587L, var0);
}

var21 = 0;
break label102;
}

var21 = 1;
}

int var11 = var21;

String var10001;
label89: {
label88: {
try {
float var26;
var21 = (var26 = var3 - var4.X()) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
var10001 = var7;
if (var0 <= 0L) {
break label89;
}

if (var7 != null) {
break label88;
}

if (var21 <= 0) {
return (boolean)0;
}
} catch (NoSuchElementException var16) {
throw vm.a<"Å">(var16, -5005901143172753587L, var0);
}

var21 = var10;
}

try {
var10001 = var7;
} catch (NoSuchElementException var13) {
throw vm.a<"Å">(var13, -5005901143172753587L, var0);
}
}

label79: {
label78: {
try {
if (var0 < 0L) {
break label79;
}

if (var10001 != null) {
break label78;
}

if (var21 == 0) {
return (boolean)0;
}
} catch (NoSuchElementException var15) {
throw vm.a<"Å">(var15, -5005901143172753587L, var0);
}

var21 = var11;
}

try {
var10001 = var7;
} catch (NoSuchElementException var12) {
throw vm.a<"Å">(var12, -5005901143172753587L, var0);
}
}

try {
if (var10001 != null) {
return (boolean)var21;
}

if (var21 != 0) {
return (boolean)1;
}
} catch (NoSuchElementException var14) {
throw vm.a<"Å">(var14, -5005901143172753587L, var0);
}

return (boolean)0;
}

private static final boolean C(float param0, long param1, gp param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ot.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 83549377790031
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 8
// 016: lshl
// 017: bipush 8
// 019: lushr
// 01a: lstore 5
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 123333434724744
// 021: lxor
// 022: dup2
// 023: bipush 32
// 025: lushr
// 026: l2i
// 027: istore 7
// 029: dup2
// 02a: bipush 32
// 02c: lshl
// 02d: bipush 48
// 02f: lushr
// 030: l2i
// 031: istore 8
// 033: dup2
// 034: bipush 48
// 036: lshl
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 46895400468201
// 042: lxor
// 043: lstore 10
// 045: dup2
// 046: ldc2_w 135044370857307
// 049: lxor
// 04a: lstore 12
// 04c: dup2
// 04d: ldc2_w 103955209559835
// 050: lxor
// 051: lstore 14
// 053: pop2
// 054: ldc2_w 5962756204772500889
// 057: lload 1
// 058: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: aload 3
// 05e: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 061: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 064: aload 3
// 065: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 068: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 06b: fadd
// 06c: fstore 17
// 06e: astore 16
// 070: fload 0
// 071: f2d
// 072: ldc2_w 0.6
// 075: dcmpg
// 076: aload 16
// 078: ifnonnull 0b8
// 07b: iflt 0b7
// 07e: goto 08b
// 081: ldc2_w 5925104615815823344
// 084: lload 1
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: aload 3
// 08c: invokevirtual su/catlean/gp.o ()Z
// 08f: aload 16
// 091: lload 1
// 092: lconst_0
// 093: lcmp
// 094: iflt 0c5
// 097: ifnonnull 0c3
// 09a: goto 0a7
// 09d: ldc2_w 5925104615815823344
// 0a0: lload 1
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: ifne 0b9
// 0aa: goto 0b7
// 0ad: ldc2_w 5925104615815823344
// 0b0: lload 1
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: bipush 0
// 0b8: ireturn
// 0b9: fload 0
// 0ba: aload 3
// 0bb: invokevirtual su/catlean/gp.m ()I
// 0be: i2f
// 0bf: fmul
// 0c0: fload 17
// 0c2: fcmpl
// 0c3: aload 16
// 0c5: lload 1
// 0c6: lconst_0
// 0c7: lcmp
// 0c8: iflt 0f1
// 0cb: ifnonnull 0ef
// 0ce: ifle 130
// 0d1: goto 0de
// 0d4: ldc2_w 5925104615815823344
// 0d7: lload 1
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: fload 0
// 0df: ldc 4.0
// 0e1: fcmpl
// 0e2: goto 0ef
// 0e5: ldc2_w 5925104615815823344
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: aload 16
// 0f1: ifnonnull 12f
// 0f4: ifgt 12e
// 0f7: goto 104
// 0fa: ldc2_w 5925104615815823344
// 0fd: lload 1
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: getstatic su/catlean/um.E Lsu/catlean/um;
// 107: lload 14
// 109: invokevirtual su/catlean/um.C (J)Z
// 10c: aload 16
// 10e: ifnonnull 12f
// 111: goto 11e
// 114: ldc2_w 5925104615815823344
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: ifne 130
// 121: goto 12e
// 124: ldc2_w 5925104615815823344
// 127: lload 1
// 128: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: athrow
// 12e: bipush 1
// 12f: ireturn
// 130: aload 3
// 131: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 134: lload 12
// 136: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 139: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 13e: astore 18
// 140: aload 18
// 142: invokeinterface java/util/Iterator.hasNext ()Z 1
// 147: ifeq 197
// 14a: aload 18
// 14c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 151: checkcast net/minecraft/class_1799
// 154: astore 19
// 156: aload 19
// 158: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 15b: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 15e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 161: aload 16
// 163: ifnonnull 187
// 166: ifne 140
// 169: aload 19
// 16b: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 16e: aload 19
// 170: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 173: isub
// 174: i2f
// 175: aload 19
// 177: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 17a: i2f
// 17b: fdiv
// 17c: getstatic su/catlean/ot.e J
// 17f: l2i
// 180: i2f
// 181: fmul
// 182: aload 3
// 183: invokevirtual su/catlean/gp.W ()F
// 186: fcmpg
// 187: ifge 140
// 18a: bipush 1
// 18b: aload 16
// 18d: lload 1
// 18e: lconst_0
// 18f: lcmp
// 190: ifle 163
// 193: ifnonnull 161
// 196: ireturn
// 197: aload 3
// 198: invokevirtual su/catlean/gp.C ()Z
// 19b: aload 16
// 19d: ifnonnull 214
// 1a0: ifeq 210
// 1a3: goto 1b0
// 1a6: ldc2_w 5925104615815823344
// 1a9: lload 1
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: lload 10
// 1b2: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1b5: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 1b8: aload 3
// 1b9: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 1bc: iload 4
// 1be: i2b
// 1bf: swap
// 1c0: lload 5
// 1c2: dup2_x1
// 1c3: pop2
// 1c4: checkcast net/minecraft/class_1297
// 1c7: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1ca: checkcast net/minecraft/class_2374
// 1cd: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 1d0: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 1d3: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1d6: getstatic net/minecraft/class_2246.field_10316 Lnet/minecraft/class_2248;
// 1d9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1dc: aload 16
// 1de: lload 1
// 1df: lconst_0
// 1e0: lcmp
// 1e1: iflt 216
// 1e4: ifnonnull 214
// 1e7: goto 1f4
// 1ea: ldc2_w 5925104615815823344
// 1ed: lload 1
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: ifeq 210
// 1f7: goto 204
// 1fa: ldc2_w 5925104615815823344
// 1fd: lload 1
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: bipush 1
// 205: ireturn
// 206: ldc2_w 5925104615815823344
// 209: lload 1
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: aload 3
// 211: invokevirtual su/catlean/gp.V ()Z
// 214: aload 16
// 216: ifnonnull 26e
// 219: ifeq 26a
// 21c: goto 229
// 21f: ldc2_w 5925104615815823344
// 222: lload 1
// 223: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 228: athrow
// 229: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 22c: iload 7
// 22e: iload 8
// 230: i2s
// 231: iload 9
// 233: invokevirtual su/catlean/ux.H (ISI)Z
// 236: aload 16
// 238: lload 1
// 239: lconst_0
// 23a: lcmp
// 23b: iflt 270
// 23e: ifnonnull 26e
// 241: goto 24e
// 244: ldc2_w 5925104615815823344
// 247: lload 1
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: ifeq 26a
// 251: goto 25e
// 254: ldc2_w 5925104615815823344
// 257: lload 1
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: bipush 1
// 25f: ireturn
// 260: ldc2_w 5925104615815823344
// 263: lload 1
// 264: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: athrow
// 26a: aload 3
// 26b: invokevirtual su/catlean/gp.H ()Z
// 26e: aload 16
// 270: ifnonnull 48c
// 273: ifeq 485
// 276: goto 283
// 279: ldc2_w 5925104615815823344
// 27c: lload 1
// 27d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 282: athrow
// 283: aload 3
// 284: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 287: getstatic net/minecraft/class_1802.field_8102 Lnet/minecraft/class_1792;
// 28a: invokevirtual net/minecraft/class_1657.method_24518 (Lnet/minecraft/class_1792;)Z
// 28d: aload 16
// 28f: lload 1
// 290: lconst_0
// 291: lcmp
// 292: ifle 48e
// 295: ifnonnull 48c
// 298: goto 2a5
// 29b: ldc2_w 5925104615815823344
// 29e: lload 1
// 29f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a4: athrow
// 2a5: ifeq 485
// 2a8: goto 2b5
// 2ab: ldc2_w 5925104615815823344
// 2ae: lload 1
// 2af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b4: athrow
// 2b5: aload 3
// 2b6: invokevirtual su/catlean/gp.I ()Ljava/util/List;
// 2b9: checkcast java/lang/Iterable
// 2bc: astore 18
// 2be: nop
// 2bf: bipush 0
// 2c0: istore 19
// 2c2: aload 18
// 2c4: astore 20
// 2c6: new java/util/ArrayList
// 2c9: dup
// 2ca: invokespecial java/util/ArrayList.<init> ()V
// 2cd: checkcast java/util/Collection
// 2d0: astore 21
// 2d2: bipush 0
// 2d3: istore 22
// 2d5: aload 20
// 2d7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2dc: astore 23
// 2de: aload 23
// 2e0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2e5: ifeq 332
// 2e8: aload 23
// 2ea: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2ef: astore 24
// 2f1: aload 24
// 2f3: instanceof net/minecraft/class_1667
// 2f6: lload 1
// 2f7: lconst_0
// 2f8: lcmp
// 2f9: iflt 364
// 2fc: aload 16
// 2fe: ifnonnull 364
// 301: aload 16
// 303: ifnonnull 32c
// 306: goto 313
// 309: ldc2_w 5925104615815823344
// 30c: lload 1
// 30d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 312: athrow
// 313: ifeq 2de
// 316: goto 323
// 319: ldc2_w 5925104615815823344
// 31c: lload 1
// 31d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 322: athrow
// 323: aload 21
// 325: aload 24
// 327: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 32c: pop
// 32d: aload 16
// 32f: ifnull 2de
// 332: aload 21
// 334: checkcast java/util/List
// 337: nop
// 338: checkcast java/lang/Iterable
// 33b: astore 18
// 33d: nop
// 33e: bipush 0
// 33f: lload 1
// 340: lconst_0
// 341: lcmp
// 342: ifle 357
// 345: istore 19
// 347: aload 18
// 349: lload 1
// 34a: lconst_0
// 34b: lcmp
// 34c: iflt 2ef
// 34f: aload 16
// 351: ifnonnull 3a3
// 354: instanceof java/util/Collection
// 357: goto 364
// 35a: ldc2_w 5925104615815823344
// 35d: lload 1
// 35e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 363: athrow
// 364: ifeq 3a1
// 367: aload 18
// 369: checkcast java/util/Collection
// 36c: aload 16
// 36e: ifnonnull 3a3
// 371: goto 37e
// 374: ldc2_w 5925104615815823344
// 377: lload 1
// 378: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37d: athrow
// 37e: invokeinterface java/util/Collection.isEmpty ()Z 1
// 383: ifeq 3a1
// 386: goto 393
// 389: ldc2_w 5925104615815823344
// 38c: lload 1
// 38d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 392: athrow
// 393: bipush 0
// 394: goto 470
// 397: ldc2_w 5925104615815823344
// 39a: lload 1
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: aload 18
// 3a3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 3a8: astore 20
// 3aa: aload 20
// 3ac: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3b1: ifeq 46f
// 3b4: aload 20
// 3b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3bb: astore 21
// 3bd: aload 21
// 3bf: checkcast net/minecraft/class_1667
// 3c2: astore 22
// 3c4: bipush 0
// 3c5: istore 23
// 3c7: aload 22
// 3c9: getfield net/minecraft/class_1667.field_6012 I
// 3cc: aload 16
// 3ce: ifnonnull 3fd
// 3d1: bipush 5
// 3d2: if_icmpge 45c
// 3d5: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 3d8: iload 4
// 3da: i2b
// 3db: lload 5
// 3dd: aload 22
// 3df: checkcast net/minecraft/class_1297
// 3e2: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 3e5: getfield net/minecraft/class_243.field_1351 D
// 3e8: aload 3
// 3e9: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 3ec: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 3ef: dcmpl
// 3f0: goto 3fd
// 3f3: ldc2_w 5925104615815823344
// 3f6: lload 1
// 3f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fc: athrow
// 3fd: aload 16
// 3ff: lload 1
// 400: lconst_0
// 401: lcmp
// 402: iflt 445
// 405: ifnonnull 443
// 408: ifle 45c
// 40b: goto 418
// 40e: ldc2_w 5925104615815823344
// 411: lload 1
// 412: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 417: athrow
// 418: aload 3
// 419: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 41c: invokevirtual net/minecraft/class_1657.method_33571 ()Lnet/minecraft/class_243;
// 41f: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 422: iload 4
// 424: i2b
// 425: lload 5
// 427: aload 22
// 429: checkcast net/minecraft/class_1297
// 42c: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 42f: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 432: ldc2_w 9.0
// 435: dcmpg
// 436: goto 443
// 439: ldc2_w 5925104615815823344
// 43c: lload 1
// 43d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 442: athrow
// 443: aload 16
// 445: ifnonnull 459
// 448: ifge 45c
// 44b: goto 458
// 44e: ldc2_w 5925104615815823344
// 451: lload 1
// 452: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 457: athrow
// 458: bipush 1
// 459: goto 45d
// 45c: bipush 0
// 45d: ifeq 3aa
// 460: bipush 1
// 461: aload 16
// 463: lload 1
// 464: lconst_0
// 465: lcmp
// 466: iflt 3ce
// 469: ifnonnull 3cc
// 46c: goto 470
// 46f: bipush 0
// 470: lload 1
// 471: lconst_0
// 472: lcmp
// 473: iflt 47a
// 476: ifeq 485
// 479: bipush 1
// 47a: ireturn
// 47b: ldc2_w 5925104615815823344
// 47e: lload 1
// 47f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 484: athrow
// 485: fload 17
// 487: aload 3
// 488: invokevirtual su/catlean/gp.v ()F
// 48b: fcmpg
// 48c: aload 16
// 48e: lload 1
// 48f: lconst_0
// 490: lcmp
// 491: iflt 4be
// 494: ifnonnull 4bc
// 497: ifgt 4d5
// 49a: goto 4a7
// 49d: ldc2_w 5925104615815823344
// 4a0: lload 1
// 4a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a6: athrow
// 4a7: getstatic su/catlean/um.E Lsu/catlean/um;
// 4aa: lload 14
// 4ac: invokevirtual su/catlean/um.C (J)Z
// 4af: goto 4bc
// 4b2: ldc2_w 5925104615815823344
// 4b5: lload 1
// 4b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bb: athrow
// 4bc: aload 16
// 4be: ifnonnull 4d2
// 4c1: ifne 4d5
// 4c4: goto 4d1
// 4c7: ldc2_w 5925104615815823344
// 4ca: lload 1
// 4cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d0: athrow
// 4d1: bipush 1
// 4d2: goto 4d6
// 4d5: bipush 0
// 4d6: ireturn
}

@Nullable
public static final t_ e(
short a, @NotNull ux $this$compareDamages, @NotNull class_2338 pos, long a, @NotNull gp configState, boolean ignoreMinDamage, boolean place, boolean basePlace
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 0
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: lload 3
// 006: bipush 16
// 008: lshl
// 009: bipush 16
// 00b: lushr
// 00c: lor
// 00d: getstatic su/catlean/ot.a J
// 010: lxor
// 011: lstore 9
// 013: lload 9
// 015: dup2
// 016: ldc2_w 126703694191892
// 019: lxor
// 01a: dup2
// 01b: bipush 32
// 01d: lushr
// 01e: l2i
// 01f: istore 11
// 021: dup2
// 022: bipush 32
// 024: lshl
// 025: bipush 48
// 027: lushr
// 028: l2i
// 029: istore 12
// 02b: dup2
// 02c: bipush 48
// 02e: lshl
// 02f: bipush 48
// 031: lushr
// 032: l2i
// 033: istore 13
// 035: pop2
// 036: dup2
// 037: ldc2_w 34464001891003
// 03a: lxor
// 03b: lstore 14
// 03d: dup2
// 03e: ldc2_w 8041370241161
// 041: lxor
// 042: lstore 16
// 044: dup2
// 045: ldc2_w 72173469376425
// 048: lxor
// 049: lstore 18
// 04b: dup2
// 04c: ldc2_w 102555018682893
// 04f: lxor
// 050: dup2
// 051: bipush 32
// 053: lushr
// 054: l2i
// 055: istore 20
// 057: dup2
// 058: bipush 32
// 05a: lshl
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 21
// 061: dup2
// 062: bipush 48
// 064: lshl
// 065: bipush 48
// 067: lushr
// 068: l2i
// 069: istore 22
// 06b: pop2
// 06c: dup2
// 06d: ldc2_w 106695884783079
// 070: lxor
// 071: lstore 23
// 073: dup2
// 074: ldc2_w 74216662212660
// 077: lxor
// 078: lstore 25
// 07a: dup2
// 07b: ldc2_w 88196318658240
// 07e: lxor
// 07f: lstore 27
// 081: dup2
// 082: ldc2_w 105875211002693
// 085: lxor
// 086: lstore 29
// 088: pop2
// 089: ldc2_w 8193384549085709970
// 08c: lload 9
// 08e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: aload 1
// 094: sipush 8024
// 097: ldc2_w 1892201955277747449
// 09a: lload 9
// 09c: lxor
// 09d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ot.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0a5: astore 31
// 0a7: aload 2
// 0a8: sipush 30104
// 0ab: ldc2_w 7709114065156333119
// 0ae: lload 9
// 0b0: lxor
// 0b1: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ot.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0b9: aload 5
// 0bb: sipush 23219
// 0be: ldc2_w 2445952105987666206
// 0c1: lload 9
// 0c3: lxor
// 0c4: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ot.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0cc: aload 2
// 0cd: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0d0: dconst_0
// 0d1: ldc2_w 0.5
// 0d4: dconst_0
// 0d5: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0d8: dup
// 0d9: sipush 13817
// 0dc: ldc2_w 7370119300189265498
// 0df: lload 9
// 0e1: lxor
// 0e2: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ot.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ea: astore 32
// 0ec: iload 7
// 0ee: ifeq 10a
// 0f1: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0f4: bipush 0
// 0f5: bipush 1
// 0f6: aconst_null
// 0f7: lload 18
// 0f9: invokestatic su/catlean/ex.q (Lsu/catlean/ex;ZILjava/lang/Object;J)Ljava/util/List;
// 0fc: goto 10d
// 0ff: ldc2_w 8156436439835319547
// 102: lload 9
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 10d: astore 33
// 10f: iload 8
// 111: ifeq 126
// 114: aload 2
// 115: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
// 118: goto 128
// 11b: ldc2_w 8156436439835319547
// 11e: lload 9
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: aload 33
// 128: astore 34
// 12a: getstatic su/catlean/la.l Lsu/catlean/la;
// 12d: aload 32
// 12f: aload 5
// 131: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 134: iload 7
// 136: aload 31
// 138: ifnonnull 160
// 13b: ifeq 163
// 13e: goto 14c
// 141: ldc2_w 8156436439835319547
// 144: lload 9
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: aload 1
// 14d: lload 27
// 14f: invokevirtual su/catlean/ux.NA (J)I
// 152: goto 160
// 155: ldc2_w 8156436439835319547
// 158: lload 9
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: goto 164
// 163: bipush 0
// 164: aload 5
// 166: invokevirtual su/catlean/gp.Q ()Z
// 169: lload 14
// 16b: dup2_x1
// 16c: pop2
// 16d: aload 34
// 16f: iload 8
// 171: invokevirtual su/catlean/la.K (Lnet/minecraft/class_243;Lnet/minecraft/class_1657;IJZLjava/util/List;Z)F
// 174: fstore 35
// 176: fload 35
// 178: lload 25
// 17a: aload 5
// 17c: invokestatic su/catlean/ot.C (FJLsu/catlean/gp;)Z
// 17f: aload 31
// 181: ifnonnull 1c2
// 184: ifne 1c1
// 187: goto 195
// 18a: ldc2_w 8156436439835319547
// 18d: lload 9
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: fload 35
// 197: aload 5
// 199: invokevirtual su/catlean/gp.a ()F
// 19c: fcmpl
// 19d: aload 31
// 19f: ifnonnull 1c2
// 1a2: goto 1b0
// 1a5: ldc2_w 8156436439835319547
// 1a8: lload 9
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: ifle 1c5
// 1b3: goto 1c1
// 1b6: ldc2_w 8156436439835319547
// 1b9: lload 9
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: bipush 1
// 1c2: goto 1c6
// 1c5: bipush 0
// 1c6: istore 36
// 1c8: iload 36
// 1ca: lload 3
// 1cb: lconst_0
// 1cc: lcmp
// 1cd: ifle 1e8
// 1d0: aload 31
// 1d2: ifnonnull 1e8
// 1d5: ifne 1f8
// 1d8: goto 1e6
// 1db: ldc2_w 8156436439835319547
// 1de: lload 9
// 1e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e5: athrow
// 1e6: iload 6
// 1e8: ifne 1f8
// 1eb: aconst_null
// 1ec: areturn
// 1ed: ldc2_w 8156436439835319547
// 1f0: lload 9
// 1f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: athrow
// 1f8: getstatic su/catlean/n8.W Lsu/catlean/n8;
// 1fb: getstatic su/catlean/la.l Lsu/catlean/la;
// 1fe: aload 32
// 200: lload 29
// 202: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 205: checkcast net/minecraft/class_1657
// 208: aload 1
// 209: iload 11
// 20b: iload 12
// 20d: i2s
// 20e: iload 7
// 210: iload 13
// 212: i2s
// 213: invokevirtual su/catlean/ux.I (ISZS)I
// 216: aload 5
// 218: invokevirtual su/catlean/gp.Q ()Z
// 21b: lload 14
// 21d: dup2_x1
// 21e: pop2
// 21f: aload 34
// 221: iload 8
// 223: invokevirtual su/catlean/la.K (Lnet/minecraft/class_243;Lnet/minecraft/class_1657;IJZLjava/util/List;Z)F
// 226: invokevirtual su/catlean/n8.K (F)F
// 229: fstore 37
// 22b: lload 16
// 22d: fload 35
// 22f: fload 37
// 231: aload 5
// 233: invokestatic su/catlean/ot.m (JFFLsu/catlean/gp;)Z
// 236: istore 38
// 238: aload 5
// 23a: aload 31
// 23c: ifnonnull 266
// 23f: invokevirtual su/catlean/gp.b ()Lsu/catlean/sv;
// 242: getstatic su/catlean/sv.NONE Lsu/catlean/sv;
// 245: if_acmpeq 482
// 248: goto 256
// 24b: ldc2_w 8156436439835319547
// 24e: lload 9
// 250: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 255: athrow
// 256: aload 5
// 258: goto 266
// 25b: ldc2_w 8156436439835319547
// 25e: lload 9
// 260: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 265: athrow
// 266: invokevirtual su/catlean/gp.I ()Ljava/util/List;
// 269: checkcast java/lang/Iterable
// 26c: astore 40
// 26e: bipush 0
// 26f: istore 41
// 271: aload 40
// 273: astore 42
// 275: new java/util/ArrayList
// 278: dup
// 279: invokespecial java/util/ArrayList.<init> ()V
// 27c: checkcast java/util/Collection
// 27f: astore 43
// 281: bipush 0
// 282: istore 44
// 284: aload 42
// 286: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 28b: astore 45
// 28d: aload 45
// 28f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 294: ifeq 2e3
// 297: aload 45
// 299: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 29e: astore 46
// 2a0: lload 3
// 2a1: lconst_0
// 2a2: lcmp
// 2a3: iflt 30b
// 2a6: aload 46
// 2a8: instanceof net/minecraft/class_1657
// 2ab: aload 31
// 2ad: ifnonnull 309
// 2b0: aload 31
// 2b2: ifnonnull 2dd
// 2b5: goto 2c3
// 2b8: ldc2_w 8156436439835319547
// 2bb: lload 9
// 2bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c2: athrow
// 2c3: ifeq 28d
// 2c6: goto 2d4
// 2c9: ldc2_w 8156436439835319547
// 2cc: lload 9
// 2ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d3: athrow
// 2d4: aload 43
// 2d6: aload 46
// 2d8: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 2dd: pop
// 2de: aload 31
// 2e0: ifnull 28d
// 2e3: aload 43
// 2e5: checkcast java/util/List
// 2e8: nop
// 2e9: checkcast java/lang/Iterable
// 2ec: astore 40
// 2ee: nop
// 2ef: bipush 0
// 2f0: istore 41
// 2f2: aload 40
// 2f4: astore 42
// 2f6: new java/util/ArrayList
// 2f9: dup
// 2fa: invokespecial java/util/ArrayList.<init> ()V
// 2fd: checkcast java/util/Collection
// 300: astore 43
// 302: lload 3
// 303: lconst_0
// 304: lcmp
// 305: ifle 30b
// 308: bipush 0
// 309: istore 44
// 30b: aload 42
// 30d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 312: astore 45
// 314: aload 45
// 316: invokeinterface java/util/Iterator.hasNext ()Z 1
// 31b: ifeq 3ab
// 31e: aload 45
// 320: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 325: astore 46
// 327: aload 46
// 329: checkcast net/minecraft/class_1657
// 32c: astore 47
// 32e: bipush 0
// 32f: istore 48
// 331: aload 47
// 333: invokevirtual net/minecraft/class_1657.method_5805 ()Z
// 336: aload 31
// 338: lload 3
// 339: lconst_0
// 33a: lcmp
// 33b: iflt 497
// 33e: ifnonnull 495
// 341: aload 31
// 343: iload 0
// 344: iflt 380
// 347: ifnonnull 37e
// 34a: goto 358
// 34d: ldc2_w 8156436439835319547
// 350: lload 9
// 352: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 357: athrow
// 358: ifeq 398
// 35b: goto 369
// 35e: ldc2_w 8156436439835319547
// 361: lload 9
// 363: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 368: athrow
// 369: aload 47
// 36b: lload 23
// 36d: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 370: goto 37e
// 373: ldc2_w 8156436439835319547
// 376: lload 9
// 378: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37d: athrow
// 37e: aload 31
// 380: ifnonnull 395
// 383: ifeq 398
// 386: goto 394
// 389: ldc2_w 8156436439835319547
// 38c: lload 9
// 38e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 393: athrow
// 394: bipush 1
// 395: goto 399
// 398: bipush 0
// 399: ifeq 314
// 39c: aload 43
// 39e: aload 46
// 3a0: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 3a5: pop
// 3a6: aload 31
// 3a8: ifnull 314
// 3ab: aload 43
// 3ad: checkcast java/util/List
// 3b0: nop
// 3b1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 3b6: lload 3
// 3b7: lconst_0
// 3b8: lcmp
// 3b9: iflt 325
// 3bc: astore 39
// 3be: aload 39
// 3c0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3c5: ifeq 482
// 3c8: aload 39
// 3ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3cf: checkcast net/minecraft/class_1657
// 3d2: astore 40
// 3d4: getstatic su/catlean/la.l Lsu/catlean/la;
// 3d7: aload 32
// 3d9: aload 40
// 3db: iload 7
// 3dd: aload 31
// 3df: ifnonnull 407
// 3e2: ifeq 40a
// 3e5: goto 3f3
// 3e8: ldc2_w 8156436439835319547
// 3eb: lload 9
// 3ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f2: athrow
// 3f3: aload 1
// 3f4: lload 27
// 3f6: invokevirtual su/catlean/ux.NA (J)I
// 3f9: goto 407
// 3fc: ldc2_w 8156436439835319547
// 3ff: lload 9
// 401: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 406: athrow
// 407: goto 40b
// 40a: bipush 0
// 40b: aload 5
// 40d: invokevirtual su/catlean/gp.Q ()Z
// 410: lload 14
// 412: dup2_x1
// 413: pop2
// 414: aload 34
// 416: iload 8
// 418: invokevirtual su/catlean/la.K (Lnet/minecraft/class_243;Lnet/minecraft/class_1657;IJZLjava/util/List;Z)F
// 41b: fstore 41
// 41d: aload 31
// 41f: iload 0
// 420: iflt 47f
// 423: ifnonnull 47d
// 426: aload 5
// 428: invokevirtual su/catlean/gp.b ()Lsu/catlean/sv;
// 42b: getstatic su/catlean/sv.ONLY_LETHAL Lsu/catlean/sv;
// 42e: if_acmpne 474
// 431: goto 43f
// 434: ldc2_w 8156436439835319547
// 437: lload 9
// 439: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43e: athrow
// 43f: fload 41
// 441: aload 40
// 443: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 446: aload 40
// 448: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 44b: fadd
// 44c: fcmpl
// 44d: iflt 3be
// 450: iload 0
// 451: iflt 3d4
// 454: goto 462
// 457: ldc2_w 8156436439835319547
// 45a: lload 9
// 45c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 461: athrow
// 462: aconst_null
// 463: aload 31
// 465: ifnonnull 4e0
// 468: areturn
// 469: ldc2_w 8156436439835319547
// 46c: lload 9
// 46e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 473: athrow
// 474: fload 37
// 476: fload 41
// 478: invokestatic java/lang/Math.max (FF)F
// 47b: fstore 37
// 47d: aload 31
// 47f: ifnull 3be
// 482: fload 35
// 484: iload 20
// 486: fload 37
// 488: iload 38
// 48a: aload 5
// 48c: iload 21
// 48e: i2s
// 48f: iload 22
// 491: i2c
// 492: invokestatic su/catlean/ot.q (FIFZLsu/catlean/gp;SC)Z
// 495: aload 31
// 497: iload 0
// 498: iflt 4c6
// 49b: ifnonnull 4c4
// 49e: ifne 4bc
// 4a1: goto 4af
// 4a4: ldc2_w 8156436439835319547
// 4a7: lload 9
// 4a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ae: athrow
// 4af: aconst_null
// 4b0: areturn
// 4b1: ldc2_w 8156436439835319547
// 4b4: lload 9
// 4b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bb: athrow
// 4bc: fload 37
// 4be: aload 5
// 4c0: invokevirtual su/catlean/gp.X ()F
// 4c3: fcmpl
// 4c4: aload 31
// 4c6: ifnonnull 4dc
// 4c9: ifle 4e1
// 4cc: goto 4da
// 4cf: ldc2_w 8156436439835319547
// 4d2: lload 9
// 4d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d9: athrow
// 4da: iload 38
// 4dc: ifne 4e1
// 4df: aconst_null
// 4e0: areturn
// 4e1: new su/catlean/t_
// 4e4: dup
// 4e5: fload 35
// 4e7: fload 37
// 4e9: iload 38
// 4eb: fload 35
// 4ed: aload 5
// 4ef: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 4f2: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 4f5: aload 5
// 4f7: invokevirtual su/catlean/gp.t ()Lnet/minecraft/class_1657;
// 4fa: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 4fd: fadd
// 4fe: fcmpl
// 4ff: iflt 511
// 502: bipush 1
// 503: goto 512
// 506: ldc2_w 8156436439835319547
// 509: lload 9
// 50b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 510: athrow
// 511: bipush 0
// 512: invokespecial su/catlean/t_.<init> (FFZZ)V
// 515: areturn
}

private static final boolean q(float param0, int param1, float param2, boolean param3, gp param4, short param5, char param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 5
// 07: i2l
// 08: bipush 48
// 0a: lshl
// 0b: bipush 32
// 0d: lushr
// 0e: lor
// 0f: iload 6
// 11: i2l
// 12: bipush 48
// 14: lshl
// 15: bipush 48
// 17: lushr
// 18: lor
// 19: getstatic su/catlean/ot.a J
// 1c: lxor
// 1d: lstore 7
// 1f: lload 7
// 21: dup2
// 22: ldc2_w 59973769773687
// 25: lxor
// 26: lstore 9
// 28: pop2
// 29: ldc2_w -8032476600358115424
// 2c: lload 7
// 2e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: astore 11
// 35: iload 3
// 36: aload 11
// 38: ifnonnull 6c
// 3b: ifeq 59
// 3e: goto 4c
// 41: ldc2_w -8069556099134095927
// 44: lload 7
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: bipush 1
// 4d: ireturn
// 4e: ldc2_w -8069556099134095927
// 51: lload 7
// 53: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58: athrow
// 59: fload 2
// 5a: lload 9
// 5c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5f: invokevirtual net/minecraft/class_746.method_6032 ()F
// 62: lload 9
// 64: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 67: invokevirtual net/minecraft/class_746.method_6067 ()F
// 6a: fadd
// 6b: fcmpl
// 6c: aload 11
// 6e: iload 6
// 70: ifle 9f
// 73: ifnonnull 9d
// 76: ifle 94
// 79: goto 87
// 7c: ldc2_w -8069556099134095927
// 7f: lload 7
// 81: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86: athrow
// 87: bipush 0
// 88: ireturn
// 89: ldc2_w -8069556099134095927
// 8c: lload 7
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: fload 0
// 95: fload 2
// 96: fdiv
// 97: aload 4
// 99: invokevirtual su/catlean/gp.E ()F
// 9c: fcmpl
// 9d: aload 11
// 9f: ifnonnull b4
// a2: iflt b7
// a5: goto b3
// a8: ldc2_w -8069556099134095927
// ab: lload 7
// ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b2: athrow
// b3: bipush 1
// b4: goto b8
// b7: bipush 0
// b8: ireturn
}

static {
long var5 = a ^ 114195791113657L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[9];
int var12 = 0;
String var11 = "\u009aÀÃjò\u001fmö¦¸\nÅcFª\u009dWYù61ÙË\\Æãï\u0018î;Ý¾¥\u0004²ß\u0013:ø_\u0080\u001cÐ#G\u001beód6\u0014\u0007Oê\u0006\u0005\u0098ÓßWä$¨ÿmb´ØWKÐÉ#\"1^é\u0081s\u008fo\u001a\u001d\u0002ñ\u000fÍ¡#ëeaÙú]Û¶\u0018@ß2\u009eâ P}`$o\u0097\\Òßäá¡þ)$Á\u0090{K\u0017\u001e\u001aàÛ©\u0094\u009a«ÚòÈºõ\u009c½Tñ\b'\u0081á-rµ\u0016)ÃP|·n8*I\u0000Iïê\u000fýõ\u000fÒP'\u0010\u0001m×>¨\u0081Ú\u009fÐÂ¤â4\u000b \u009d õg¾?*x¶¢!j~K»¤|\u0004Y]×\ruþ\u0006y?þt\u008d*ÖLí\u0010Üq¸¸´¡zÔ\u0003½\"®\u0090\u000bÊÂ0eç¾ð \u0018q\u000bX{h\u0084\tEù\u0001\u0089©©ßçN\u0099Gtek/Ü\u0005Ú\u007f3ÀUb\u0011 Ç@\u008cà\u000e\u0091à(\u0099Ô \u0014¸Ó\u0011\u000b\u000f}Ó \u0087%¯ák\u0002è\u001d]UðÈ·Z¾Ô\u0082È]Aq1d";
int var13 = "\u009aÀÃjò\u001fmö¦¸\nÅcFª\u009dWYù61ÙË\\Æãï\u0018î;Ý¾¥\u0004²ß\u0013:ø_\u0080\u001cÐ#G\u001beód6\u0014\u0007Oê\u0006\u0005\u0098ÓßWä$¨ÿmb´ØWKÐÉ#\"1^é\u0081s\u008fo\u001a\u001d\u0002ñ\u000fÍ¡#ëeaÙú]Û¶\u0018@ß2\u009eâ P}`$o\u0097\\Òßäá¡þ)$Á\u0090{K\u0017\u001e\u001aàÛ©\u0094\u009a«ÚòÈºõ\u009c½Tñ\b'\u0081á-rµ\u0016)ÃP|·n8*I\u0000Iïê\u000fýõ\u000fÒP'\u0010\u0001m×>¨\u0081Ú\u009fÐÂ¤â4\u000b \u009d õg¾?*x¶¢!j~K»¤|\u0004Y]×\ruþ\u0006y?þt\u008d*ÖLí\u0010Üq¸¸´¡zÔ\u0003½\"®\u0090\u000bÊÂ0eç¾ð \u0018q\u000bX{h\u0084\tEù\u0001\u0089©©ßçN\u0099Gtek/Ü\u0005Ú\u007f3ÀUb\u0011 Ç@\u008cà\u000e\u0091à(\u0099Ô \u0014¸Ó\u0011\u000b\u000f}Ó \u0087%¯ák\u0002è\u001d]UðÈ·Z¾Ô\u0082È]Aq1d"
.length();
char var10 = '(';
int var17 = -1;

label37:
while (true) {
String var18 = var11.substring(++var17, var17 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var26;
if ((var17 += var10) >= var13) {
b = var14;
c = new String[9];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 5421899311759104443L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var30;
return;
}

var10 = var11.charAt(var17);
break;
default:
var14[var12++] = var26;
if ((var17 += var10) < var13) {
var10 = var11.charAt(var17);
continue label37;
}

var11 = "\u0097&E°¤\u0089Ñ0]5ý¼\u0091ªôÙ]ý\u0098\u000f\u0098n/%ÝØM\u0094j\u0001zv ÷\u0094\u0096ÔPSÔP)\t \u0013í \u009fÒ\u000b\u0004dzM\u009b÷\u001cL\u0082TÂ\u0013\u0090\fi";
var13 = "\u0097&E°¤\u0089Ñ0]5ý¼\u0091ªôÙ]ý\u0098\u000f\u0098n/%ÝØM\u0094j\u0001zv ÷\u0094\u0096ÔPSÔP)\t \u0013í \u009fÒ\u000b\u0004dzM\u009b÷\u001cL\u0082TÂ\u0013\u0090\fi"
.length();
var10 = ' ';
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
var10001 = 0;
}
}
}

private static NoSuchElementException a(NoSuchElementException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23439;
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
throw new RuntimeException("su/catlean/ot", var10);
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
throw new RuntimeException("su/catlean/ot" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
