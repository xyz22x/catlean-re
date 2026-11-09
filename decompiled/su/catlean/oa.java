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
import net.minecraft.class_1511;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class oa {
@NotNull
public static final oa k;
@Nullable
private static class_1511 u;
private static final long a = yz.a(6708098567996275847L, 6427450408264301711L, MethodHandles.lookup().lookupClass()).a(107661336642689L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

private oa() {
}

@Nullable
public final class_1511 c() {
return u;
}

public final void u(@Nullable class_1511 <set-?>) {
u = <set-?>;
}

@Nullable
public final nw V(@NotNull ux $this$getCrystalToExplode, @NotNull gp configState, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/oa.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 131252024350905
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 52943991197549
// 012: lxor
// 013: dup2
// 014: bipush 56
// 016: lushr
// 017: l2i
// 018: istore 7
// 01a: dup2
// 01b: bipush 8
// 01d: lshl
// 01e: bipush 8
// 020: lushr
// 021: lstore 8
// 023: pop2
// 024: dup2
// 025: ldc2_w 128336879339340
// 028: lxor
// 029: dup2
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 10
// 030: dup2
// 031: bipush 16
// 033: lshl
// 034: bipush 48
// 036: lushr
// 037: l2i
// 038: istore 11
// 03a: dup2
// 03b: bipush 32
// 03d: lshl
// 03e: bipush 32
// 040: lushr
// 041: l2i
// 042: istore 12
// 044: pop2
// 045: dup2
// 046: ldc2_w 84565059951217
// 049: lxor
// 04a: lstore 13
// 04c: dup2
// 04d: ldc2_w 49131232145981
// 050: lxor
// 051: lstore 15
// 053: dup2
// 054: ldc2_w 18638055976301
// 057: lxor
// 058: lstore 17
// 05a: pop2
// 05b: ldc2_w -7063805959703860826
// 05e: lload 3
// 05f: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: aload 1
// 065: sipush 31777
// 068: ldc2_w 8912502779771553300
// 06b: lload 3
// 06c: lxor
// 06d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 075: istore 20
// 077: aload 2
// 078: iload 20
// 07a: ifeq 0e8
// 07d: sipush 22441
// 080: ldc2_w 127126578995277215
// 083: lload 3
// 084: lxor
// 085: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08d: getstatic su/catlean/oa.u Lnet/minecraft/class_1511;
// 090: ifnull 0e7
// 093: goto 0a0
// 096: ldc2_w -7141479005670928465
// 099: lload 3
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: getstatic su/catlean/oa.u Lnet/minecraft/class_1511;
// 0a3: astore 21
// 0a5: aconst_null
// 0a6: putstatic su/catlean/oa.u Lnet/minecraft/class_1511;
// 0a9: aload 0
// 0aa: aload 1
// 0ab: aload 1
// 0ac: aload 21
// 0ae: dup
// 0af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0b2: checkcast net/minecraft/class_1297
// 0b5: astore 19
// 0b7: iload 7
// 0b9: i2b
// 0ba: lload 8
// 0bc: aload 19
// 0be: invokevirtual su/catlean/ux.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0c1: aload 2
// 0c2: lload 17
// 0c4: bipush 1
// 0c5: aload 21
// 0c7: getfield net/minecraft/class_1511.field_6012 I
// 0ca: invokevirtual su/catlean/oa.u (Lsu/catlean/ux;Lnet/minecraft/class_243;Lsu/catlean/gp;JZI)Lsu/catlean/t_;
// 0cd: ifnull 0e7
// 0d0: new su/catlean/nw
// 0d3: dup
// 0d4: aload 21
// 0d6: lload 15
// 0d8: bipush 1
// 0d9: invokespecial su/catlean/nw.<init> (Lnet/minecraft/class_1511;JZ)V
// 0dc: areturn
// 0dd: ldc2_w -7141479005670928465
// 0e0: lload 3
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: aload 2
// 0e8: aload 0
// 0e9: aload 1
// 0ea: iload 10
// 0ec: i2s
// 0ed: aload 2
// 0ee: iload 11
// 0f0: i2c
// 0f1: iload 12
// 0f3: invokespecial su/catlean/oa.S (Lsu/catlean/ux;SLsu/catlean/gp;CI)Ljava/util/List;
// 0f6: lload 5
// 0f8: dup2_x2
// 0f9: pop2
// 0fa: invokestatic su/catlean/ot.W (JLsu/catlean/gp;Ljava/util/List;)Lsu/catlean/mm;
// 0fd: iload 20
// 0ff: ifeq 123
// 102: dup
// 103: ifnull 148
// 106: goto 113
// 109: ldc2_w -7141479005670928465
// 10c: lload 3
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: invokevirtual su/catlean/mm.t ()Ljava/lang/Object;
// 116: goto 123
// 119: ldc2_w -7141479005670928465
// 11c: lload 3
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: checkcast net/minecraft/class_1511
// 126: dup
// 127: ifnull 148
// 12a: astore 22
// 12c: bipush 0
// 12d: istore 23
// 12f: lload 3
// 130: lconst_0
// 131: lcmp
// 132: iflt 149
// 135: new su/catlean/nw
// 138: dup
// 139: aload 22
// 13b: bipush 0
// 13c: bipush 2
// 13d: aconst_null
// 13e: lload 13
// 140: invokespecial su/catlean/nw.<init> (Lnet/minecraft/class_1511;ZILkotlin/jvm/internal/DefaultConstructorMarker;J)V
// 143: iload 20
// 145: ifne 157
// 148: pop
// 149: aconst_null
// 14a: goto 157
// 14d: ldc2_w -7141479005670928465
// 150: lload 3
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: areturn
}

private final List S(ux param1, short param2, gp param3, char param4, int param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 4
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 16
// 00d: lushr
// 00e: lor
// 00f: iload 5
// 011: i2l
// 012: bipush 32
// 014: lshl
// 015: bipush 32
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/oa.a J
// 01c: lxor
// 01d: lstore 6
// 01f: lload 6
// 021: dup2
// 022: ldc2_w 8483005483473
// 025: lxor
// 026: dup2
// 027: bipush 56
// 029: lushr
// 02a: l2i
// 02b: istore 8
// 02d: dup2
// 02e: bipush 8
// 030: lshl
// 031: bipush 8
// 033: lushr
// 034: lstore 9
// 036: pop2
// 037: dup2
// 038: ldc2_w 27588241547462
// 03b: lxor
// 03c: lstore 11
// 03e: dup2
// 03f: ldc2_w 450939725455
// 042: lxor
// 043: lstore 13
// 045: dup2
// 046: ldc2_w 43303537617873
// 049: lxor
// 04a: lstore 15
// 04c: dup2
// 04d: ldc2_w 111026548361680
// 050: lxor
// 051: lstore 17
// 053: pop2
// 054: ldc2_w 1987577153486583080
// 057: lload 6
// 059: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: aload 3
// 05f: invokevirtual su/catlean/gp.I ()Ljava/util/List;
// 062: checkcast java/lang/Iterable
// 065: astore 20
// 067: istore 19
// 069: nop
// 06a: bipush 0
// 06b: istore 21
// 06d: aload 20
// 06f: astore 22
// 071: new java/util/ArrayList
// 074: dup
// 075: invokespecial java/util/ArrayList.<init> ()V
// 078: checkcast java/util/Collection
// 07b: astore 23
// 07d: bipush 0
// 07e: istore 24
// 080: aload 22
// 082: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 087: astore 25
// 089: aload 25
// 08b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 090: ifeq 0de
// 093: aload 25
// 095: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 09a: astore 26
// 09c: iload 5
// 09e: iflt 105
// 0a1: aload 26
// 0a3: instanceof net/minecraft/class_1511
// 0a6: iload 19
// 0a8: ifne 103
// 0ab: iload 19
// 0ad: ifne 0d8
// 0b0: goto 0be
// 0b3: ldc2_w 1898382964813564179
// 0b6: lload 6
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: ifeq 089
// 0c1: goto 0cf
// 0c4: ldc2_w 1898382964813564179
// 0c7: lload 6
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: aload 23
// 0d1: aload 26
// 0d3: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0d8: pop
// 0d9: iload 19
// 0db: ifeq 089
// 0de: aload 23
// 0e0: checkcast java/util/List
// 0e3: nop
// 0e4: checkcast java/lang/Iterable
// 0e7: astore 20
// 0e9: nop
// 0ea: bipush 0
// 0eb: istore 21
// 0ed: aload 20
// 0ef: astore 22
// 0f1: new java/util/ArrayList
// 0f4: dup
// 0f5: invokespecial java/util/ArrayList.<init> ()V
// 0f8: checkcast java/util/Collection
// 0fb: astore 23
// 0fd: iload 5
// 0ff: iflt 105
// 102: bipush 0
// 103: istore 24
// 105: aload 22
// 107: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 10c: astore 25
// 10e: aload 25
// 110: invokeinterface java/util/Iterator.hasNext ()Z 1
// 115: ifeq 230
// 118: aload 25
// 11a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 11f: astore 26
// 121: aload 26
// 123: checkcast net/minecraft/class_1511
// 126: astore 27
// 128: bipush 0
// 129: istore 28
// 12b: iload 4
// 12d: ifle 257
// 130: aload 27
// 132: invokevirtual net/minecraft/class_1511.method_31481 ()Z
// 135: iload 19
// 137: ifne 255
// 13a: iload 19
// 13c: iload 5
// 13e: iflt 180
// 141: ifne 17e
// 144: goto 152
// 147: ldc2_w 1898382964813564179
// 14a: lload 6
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: ifne 21d
// 155: goto 163
// 158: ldc2_w 1898382964813564179
// 15b: lload 6
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: getstatic su/catlean/yk.l Lsu/catlean/yk;
// 166: aload 27
// 168: invokevirtual net/minecraft/class_1511.method_5628 ()I
// 16b: lload 11
// 16d: invokevirtual su/catlean/yk.L (IJ)Z
// 170: goto 17e
// 173: ldc2_w 1898382964813564179
// 176: lload 6
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: iload 19
// 180: iload 4
// 182: iflt 1b4
// 185: ifne 1b2
// 188: ifne 21d
// 18b: goto 199
// 18e: ldc2_w 1898382964813564179
// 191: lload 6
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: getstatic su/catlean/yk.l Lsu/catlean/yk;
// 19c: aload 27
// 19e: invokevirtual net/minecraft/class_1511.method_5628 ()I
// 1a1: invokevirtual su/catlean/yk.d (I)Z
// 1a4: goto 1b2
// 1a7: ldc2_w 1898382964813564179
// 1aa: lload 6
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: iload 19
// 1b4: iload 2
// 1b5: iflt 205
// 1b8: ifne 203
// 1bb: ifne 21d
// 1be: goto 1cc
// 1c1: ldc2_w 1898382964813564179
// 1c4: lload 6
// 1c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cb: athrow
// 1cc: aload 1
// 1cd: lload 17
// 1cf: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d2: iload 8
// 1d4: i2b
// 1d5: swap
// 1d6: lload 9
// 1d8: dup2_x1
// 1d9: pop2
// 1da: checkcast net/minecraft/class_1297
// 1dd: invokevirtual su/catlean/ux.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1e0: aload 1
// 1e1: iload 8
// 1e3: i2b
// 1e4: lload 9
// 1e6: aload 27
// 1e8: checkcast net/minecraft/class_1297
// 1eb: invokevirtual su/catlean/ux.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1ee: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 1f1: ldc2_w 49.0
// 1f4: dcmpg
// 1f5: goto 203
// 1f8: ldc2_w 1898382964813564179
// 1fb: lload 6
// 1fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 202: athrow
// 203: iload 19
// 205: ifne 21a
// 208: ifgt 21d
// 20b: goto 219
// 20e: ldc2_w 1898382964813564179
// 211: lload 6
// 213: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: athrow
// 219: bipush 1
// 21a: goto 21e
// 21d: bipush 0
// 21e: ifeq 10e
// 221: aload 23
// 223: aload 26
// 225: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 22a: pop
// 22b: iload 19
// 22d: ifeq 10e
// 230: aload 23
// 232: checkcast java/util/List
// 235: nop
// 236: checkcast java/lang/Iterable
// 239: astore 20
// 23b: nop
// 23c: bipush 0
// 23d: istore 21
// 23f: aload 20
// 241: astore 22
// 243: new java/util/ArrayList
// 246: dup
// 247: invokespecial java/util/ArrayList.<init> ()V
// 24a: checkcast java/util/Collection
// 24d: astore 23
// 24f: iload 5
// 251: ifle 257
// 254: bipush 0
// 255: istore 24
// 257: aload 22
// 259: astore 25
// 25b: bipush 0
// 25c: istore 26
// 25e: aload 25
// 260: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 265: astore 27
// 267: aload 27
// 269: invokeinterface java/util/Iterator.hasNext ()Z 1
// 26e: ifeq 30d
// 271: aload 27
// 273: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 278: astore 28
// 27a: aload 28
// 27c: astore 29
// 27e: bipush 0
// 27f: istore 30
// 281: aload 29
// 283: checkcast net/minecraft/class_1511
// 286: astore 31
// 288: bipush 0
// 289: istore 32
// 28b: iload 19
// 28d: iload 4
// 28f: ifle 297
// 292: ifne 312
// 295: iload 19
// 297: ifne 2ee
// 29a: goto 2a8
// 29d: ldc2_w 1898382964813564179
// 2a0: lload 6
// 2a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a7: athrow
// 2a8: getstatic su/catlean/oa.k Lsu/catlean/oa;
// 2ab: aload 1
// 2ac: aload 1
// 2ad: iload 8
// 2af: i2b
// 2b0: lload 9
// 2b2: aload 31
// 2b4: checkcast net/minecraft/class_1297
// 2b7: invokevirtual su/catlean/ux.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 2ba: aload 3
// 2bb: lload 15
// 2bd: bipush 0
// 2be: aload 31
// 2c0: getfield net/minecraft/class_1511.field_6012 I
// 2c3: invokevirtual su/catlean/oa.u (Lsu/catlean/ux;Lnet/minecraft/class_243;Lsu/catlean/gp;JZI)Lsu/catlean/t_;
// 2c6: dup
// 2c7: ifnull 2ed
// 2ca: goto 2d8
// 2cd: ldc2_w 1898382964813564179
// 2d0: lload 6
// 2d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: athrow
// 2d8: astore 33
// 2da: bipush 0
// 2db: istore 34
// 2dd: new su/catlean/mm
// 2e0: dup
// 2e1: aload 31
// 2e3: lload 13
// 2e5: aload 33
// 2e7: invokespecial su/catlean/mm.<init> (Ljava/lang/Object;JLsu/catlean/t_;)V
// 2ea: goto 2ef
// 2ed: pop
// 2ee: aconst_null
// 2ef: nop
// 2f0: dup
// 2f1: ifnull 306
// 2f4: astore 35
// 2f6: bipush 0
// 2f7: istore 36
// 2f9: aload 23
// 2fb: aload 35
// 2fd: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 302: pop
// 303: goto 307
// 306: pop
// 307: nop
// 308: iload 19
// 30a: ifeq 267
// 30d: nop
// 30e: iload 2
// 30f: iflt 312
// 312: aload 23
// 314: checkcast java/util/List
// 317: nop
// 318: areturn
}

@Nullable
public final class_243 S(@NotNull class_243 vec, long a, @NotNull gp configState, @NotNull class_243 eyes) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/oa.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 52881836101664
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 122150143786171
// 012: lxor
// 013: lstore 8
// 015: dup2
// 016: ldc2_w 25003019515519
// 019: lxor
// 01a: lstore 10
// 01c: pop2
// 01d: aload 1
// 01e: sipush 23400
// 021: ldc2_w 2833632737679759432
// 024: lload 2
// 025: lxor
// 026: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 02e: ldc2_w 7222147233441811079
// 031: lload 2
// 032: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: aload 4
// 039: sipush 3016
// 03c: ldc2_w 8991483168629721324
// 03f: lload 2
// 040: lxor
// 041: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 049: istore 12
// 04b: aload 5
// 04d: iload 12
// 04f: ifne 0d9
// 052: sipush 27751
// 055: ldc2_w 4618960556433076032
// 058: lload 2
// 059: lxor
// 05a: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 062: aload 4
// 064: invokevirtual su/catlean/gp.r ()Z
// 067: ifne 0da
// 06a: goto 077
// 06d: ldc2_w 7347371521448146620
// 070: lload 2
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: new net/minecraft/class_243
// 07a: dup
// 07b: lload 10
// 07d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 080: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 083: getfield net/minecraft/class_243.field_1352 D
// 086: aload 1
// 087: getfield net/minecraft/class_243.field_1352 D
// 08a: dconst_1
// 08b: dsub
// 08c: aload 1
// 08d: getfield net/minecraft/class_243.field_1352 D
// 090: dconst_1
// 091: dadd
// 092: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 095: lload 10
// 097: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09a: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 09d: getfield net/minecraft/class_243.field_1351 D
// 0a0: aload 1
// 0a1: getfield net/minecraft/class_243.field_1351 D
// 0a4: aload 1
// 0a5: getfield net/minecraft/class_243.field_1351 D
// 0a8: ldc2_w 2.0
// 0ab: dadd
// 0ac: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 0af: lload 10
// 0b1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b4: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0b7: getfield net/minecraft/class_243.field_1350 D
// 0ba: aload 1
// 0bb: getfield net/minecraft/class_243.field_1350 D
// 0be: dconst_1
// 0bf: dsub
// 0c0: aload 1
// 0c1: getfield net/minecraft/class_243.field_1350 D
// 0c4: dconst_1
// 0c5: dadd
// 0c6: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 0c9: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0cc: goto 0d9
// 0cf: ldc2_w 7347371521448146620
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: areturn
// 0da: new java/util/ArrayList
// 0dd: dup
// 0de: invokespecial java/util/ArrayList.<init> ()V
// 0e1: astore 13
// 0e3: aload 1
// 0e4: ldc2_w -1.0
// 0e7: dconst_0
// 0e8: ldc2_w -1.0
// 0eb: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0ee: dup
// 0ef: sipush 13587
// 0f2: ldc2_w 1121834012828350000
// 0f5: lload 2
// 0f6: lxor
// 0f7: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ff: astore 14
// 101: bipush 0
// 102: istore 15
// 104: iload 15
// 106: bipush 3
// 107: if_icmpge 185
// 10a: bipush 0
// 10b: istore 16
// 10d: iload 16
// 10f: bipush 3
// 110: if_icmpge 177
// 113: bipush 0
// 114: iload 12
// 116: ifne 106
// 119: istore 17
// 11b: iload 17
// 11d: bipush 3
// 11e: if_icmpge 16f
// 121: aload 13
// 123: new net/minecraft/class_243
// 126: dup
// 127: aload 14
// 129: getfield net/minecraft/class_243.field_1352 D
// 12c: iload 15
// 12e: i2d
// 12f: dadd
// 130: aload 14
// 132: getfield net/minecraft/class_243.field_1351 D
// 135: iload 16
// 137: i2d
// 138: dadd
// 139: aload 14
// 13b: getfield net/minecraft/class_243.field_1350 D
// 13e: iload 17
// 140: i2d
// 141: dadd
// 142: invokespecial net/minecraft/class_243.<init> (DDD)V
// 145: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 148: pop
// 149: iinc 17 1
// 14c: iload 12
// 14e: lload 2
// 14f: lconst_0
// 150: lcmp
// 151: ifle 174
// 154: ifne 172
// 157: iload 12
// 159: ifeq 11b
// 15c: lload 2
// 15d: lconst_0
// 15e: lcmp
// 15f: iflt 14c
// 162: goto 16f
// 165: ldc2_w 7347371521448146620
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: iinc 16 1
// 172: iload 12
// 174: ifeq 10d
// 177: iinc 15 1
// 17a: iload 12
// 17c: lload 2
// 17d: lconst_0
// 17e: lcmp
// 17f: ifle 114
// 182: ifeq 104
// 185: aload 13
// 187: checkcast java/lang/Iterable
// 18a: astore 16
// 18c: bipush 0
// 18d: istore 17
// 18f: aload 16
// 191: astore 18
// 193: new java/util/ArrayList
// 196: dup
// 197: invokespecial java/util/ArrayList.<init> ()V
// 19a: checkcast java/util/Collection
// 19d: astore 19
// 19f: bipush 0
// 1a0: lload 2
// 1a1: lconst_0
// 1a2: lcmp
// 1a3: ifle 10b
// 1a6: istore 20
// 1a8: aload 18
// 1aa: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1af: astore 21
// 1b1: aload 21
// 1b3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1b8: ifeq 271
// 1bb: aload 21
// 1bd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1c2: astore 22
// 1c4: aload 22
// 1c6: checkcast net/minecraft/class_243
// 1c9: astore 23
// 1cb: bipush 0
// 1cc: istore 24
// 1ce: lload 2
// 1cf: lconst_0
// 1d0: lcmp
// 1d1: ifle 286
// 1d4: aload 4
// 1d6: invokevirtual su/catlean/gp.F ()Z
// 1d9: iload 12
// 1db: ifne 284
// 1de: iload 12
// 1e0: lload 2
// 1e1: lconst_0
// 1e2: lcmp
// 1e3: ifle 22e
// 1e6: ifne 22c
// 1e9: goto 1f6
// 1ec: ldc2_w 7347371521448146620
// 1ef: lload 2
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: ifeq 21e
// 1f9: goto 206
// 1fc: ldc2_w 7347371521448146620
// 1ff: lload 2
// 200: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: athrow
// 206: getstatic su/catlean/i1.C Lsu/catlean/i1;
// 209: aload 1
// 20a: lload 8
// 20c: aload 23
// 20e: invokevirtual su/catlean/i1.C (Lnet/minecraft/class_243;JLnet/minecraft/class_243;)Z
// 211: goto 246
// 214: ldc2_w 7347371521448146620
// 217: lload 2
// 218: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: athrow
// 21e: aload 5
// 220: aload 23
// 222: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 225: aload 4
// 227: invokevirtual su/catlean/gp.U ()F
// 22a: f2d
// 22b: dcmpg
// 22c: iload 12
// 22e: ifne 242
// 231: ifgt 245
// 234: goto 241
// 237: ldc2_w 7347371521448146620
// 23a: lload 2
// 23b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 240: athrow
// 241: bipush 1
// 242: goto 246
// 245: bipush 0
// 246: nop
// 247: lload 2
// 248: lconst_0
// 249: lcmp
// 24a: ifle 26e
// 24d: iload 12
// 24f: ifne 26b
// 252: ifeq 1b1
// 255: goto 262
// 258: ldc2_w 7347371521448146620
// 25b: lload 2
// 25c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 261: athrow
// 262: aload 19
// 264: aload 22
// 266: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 26b: pop
// 26c: iload 12
// 26e: ifeq 1b1
// 271: aload 19
// 273: checkcast java/util/List
// 276: nop
// 277: checkcast java/lang/Iterable
// 27a: astore 16
// 27c: nop
// 27d: lload 2
// 27e: lconst_0
// 27f: lcmp
// 280: iflt 286
// 283: bipush 0
// 284: istore 17
// 286: aload 16
// 288: new su/catlean/da
// 28b: dup
// 28c: aload 5
// 28e: invokespecial su/catlean/da.<init> (Lnet/minecraft/class_243;)V
// 291: checkcast java/util/Comparator
// 294: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 297: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 29c: astore 15
// 29e: aload 15
// 2a0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2a5: ifeq 2d9
// 2a8: aload 15
// 2aa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2af: checkcast net/minecraft/class_243
// 2b2: astore 16
// 2b4: getstatic su/catlean/la.l Lsu/catlean/la;
// 2b7: aload 5
// 2b9: aload 16
// 2bb: bipush 0
// 2bc: aconst_null
// 2bd: bipush 0
// 2be: getstatic su/catlean/oa.e J
// 2c1: l2i
// 2c2: aconst_null
// 2c3: lload 6
// 2c5: invokestatic su/catlean/la.R (Lsu/catlean/la;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZLjava/util/List;ZILjava/lang/Object;J)Lnet/minecraft/class_3965;
// 2c8: ifnonnull 29e
// 2cb: aload 16
// 2cd: lload 2
// 2ce: lconst_0
// 2cf: lcmp
// 2d0: iflt 2af
// 2d3: iload 12
// 2d5: ifne 2b2
// 2d8: areturn
// 2d9: aconst_null
// 2da: ldc2_w 7224261379493296848
// 2dd: lload 2
// 2de: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e3: ifnull 310
// 2e6: iload 12
// 2e8: ifeq 306
// 2eb: goto 2f8
// 2ee: ldc2_w 7347371521448146620
// 2f1: lload 2
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: bipush 0
// 2f9: goto 307
// 2fc: ldc2_w 7347371521448146620
// 2ff: lload 2
// 300: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 305: athrow
// 306: bipush 1
// 307: ldc2_w 7259222387763859943
// 30a: lload 2
// 30b: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 310: areturn
}

@Nullable
public final t_ u(@NotNull ux $this$canAttackCrystal, @NotNull class_243 pos, @NotNull gp configState, long a, boolean secondaryCrystal, int age) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/oa.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 48686511264847
// 00e: lxor
// 00f: dup2
// 010: bipush 56
// 012: lushr
// 013: l2i
// 014: istore 8
// 016: dup2
// 017: bipush 8
// 019: lshl
// 01a: bipush 8
// 01c: lushr
// 01d: lstore 9
// 01f: pop2
// 020: dup2
// 021: ldc2_w 124270854541655
// 024: lxor
// 025: dup2
// 026: bipush 48
// 028: lushr
// 029: l2i
// 02a: istore 11
// 02c: dup2
// 02d: bipush 16
// 02f: lshl
// 030: bipush 48
// 032: lushr
// 033: l2i
// 034: istore 12
// 036: dup2
// 037: bipush 32
// 039: lshl
// 03a: bipush 32
// 03c: lushr
// 03d: l2i
// 03e: istore 13
// 040: pop2
// 041: dup2
// 042: ldc2_w 118194968494987
// 045: lxor
// 046: dup2
// 047: bipush 48
// 049: lushr
// 04a: l2i
// 04b: istore 14
// 04d: dup2
// 04e: bipush 16
// 050: lshl
// 051: bipush 16
// 053: lushr
// 054: lstore 15
// 056: pop2
// 057: dup2
// 058: ldc2_w 18801221656958
// 05b: lxor
// 05c: lstore 17
// 05e: dup2
// 05f: ldc2_w 33898040942711
// 062: lxor
// 063: lstore 19
// 065: dup2
// 066: ldc2_w 133127118973237
// 069: lxor
// 06a: lstore 21
// 06c: dup2
// 06d: ldc2_w 20262800315867
// 070: lxor
// 071: dup2
// 072: bipush 48
// 074: lushr
// 075: l2i
// 076: istore 23
// 078: dup2
// 079: bipush 16
// 07b: lshl
// 07c: bipush 32
// 07e: lushr
// 07f: l2i
// 080: istore 24
// 082: dup2
// 083: bipush 48
// 085: lshl
// 086: bipush 48
// 088: lushr
// 089: l2i
// 08a: istore 25
// 08c: pop2
// 08d: dup2
// 08e: ldc2_w 109402269398703
// 091: lxor
// 092: lstore 26
// 094: dup2
// 095: ldc2_w 760768603121
// 098: lxor
// 099: lstore 28
// 09b: pop2
// 09c: aload 1
// 09d: sipush 32157
// 0a0: ldc2_w 8090095794523728703
// 0a3: lload 4
// 0a5: lxor
// 0a6: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0ae: aload 2
// 0af: sipush 17809
// 0b2: ldc2_w 507333612716544830
// 0b5: lload 4
// 0b7: lxor
// 0b8: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c0: aload 3
// 0c1: sipush 3016
// 0c4: ldc2_w 8991502909528808802
// 0c7: lload 4
// 0c9: lxor
// 0ca: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0d2: ldc2_w 8193224924229377801
// 0d5: lload 4
// 0d7: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: aload 2
// 0dd: dconst_0
// 0de: ldc2_w -0.1
// 0e1: dconst_0
// 0e2: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0e5: checkcast net/minecraft/class_2374
// 0e8: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0eb: dup
// 0ec: sipush 16124
// 0ef: ldc2_w 8150213137973618768
// 0f2: lload 4
// 0f4: lxor
// 0f5: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/oa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0fd: astore 32
// 0ff: istore 31
// 101: aload 1
// 102: lload 17
// 104: invokevirtual su/catlean/ux.N7 (J)Z
// 107: iload 31
// 109: ifne 17d
// 10c: ifeq 179
// 10f: goto 11d
// 112: ldc2_w 8104523799953924914
// 115: lload 4
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: iload 7
// 11f: aload 1
// 120: invokevirtual su/catlean/ux.Y ()I
// 123: bipush 4
// 124: irem
// 125: iload 31
// 127: lload 4
// 129: lconst_0
// 12a: lcmp
// 12b: ifle 161
// 12e: ifne 160
// 131: goto 13f
// 134: ldc2_w 8104523799953924914
// 137: lload 4
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: ifne 15f
// 142: goto 150
// 145: ldc2_w 8104523799953924914
// 148: lload 4
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: bipush 2
// 151: goto 169
// 154: ldc2_w 8104523799953924914
// 157: lload 4
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: bipush 0
// 160: bipush 1
// 161: bipush 0
// 162: lload 19
// 164: bipush 4
// 165: aconst_null
// 166: invokestatic su/catlean/mf.P (IIZJILjava/lang/Object;)I
// 169: if_icmpge 179
// 16c: aconst_null
// 16d: areturn
// 16e: ldc2_w 8104523799953924914
// 171: lload 4
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: aload 3
// 17a: invokevirtual su/catlean/gp.r ()Z
// 17d: iload 31
// 17f: lload 4
// 181: lconst_0
// 182: lcmp
// 183: ifle 1b2
// 186: ifne 1b0
// 189: ifne 419
// 18c: goto 19a
// 18f: ldc2_w 8104523799953924914
// 192: lload 4
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 19d: lload 26
// 19f: invokevirtual su/catlean/_a.f (J)Z
// 1a2: goto 1b0
// 1a5: ldc2_w 8104523799953924914
// 1a8: lload 4
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: iload 31
// 1b2: ifne 1dc
// 1b5: ifeq 1df
// 1b8: goto 1c6
// 1bb: ldc2_w 8104523799953924914
// 1be: lload 4
// 1c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: athrow
// 1c6: aload 32
// 1c8: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 1cb: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 1ce: goto 1dc
// 1d1: ldc2_w 8104523799953924914
// 1d4: lload 4
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: goto 1e4
// 1df: aload 32
// 1e1: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 1e4: istore 33
// 1e6: aload 2
// 1e7: astore 34
// 1e9: lload 28
// 1eb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ee: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 1f1: getfield net/minecraft/class_243.field_1351 D
// 1f4: iload 33
// 1f6: i2d
// 1f7: dcmpl
// 1f8: iload 31
// 1fa: lload 4
// 1fc: lconst_0
// 1fd: lcmp
// 1fe: iflt 395
// 201: ifne 38c
// 204: ifle 388
// 207: goto 215
// 20a: ldc2_w 8104523799953924914
// 20d: lload 4
// 20f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 214: athrow
// 215: invokestatic su/catlean/rb.N ()Ljava/util/List;
// 218: checkcast java/lang/Iterable
// 21b: astore 36
// 21d: bipush 0
// 21e: istore 37
// 220: aload 36
// 222: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 227: astore 38
// 229: aload 38
// 22b: iload 31
// 22d: ifne 260
// 230: invokeinterface java/util/Iterator.hasNext ()Z 1
// 235: ifne 259
// 238: goto 246
// 23b: ldc2_w 8104523799953924914
// 23e: lload 4
// 240: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 245: athrow
// 246: new java/util/NoSuchElementException
// 249: dup
// 24a: invokespecial java/util/NoSuchElementException.<init> ()V
// 24d: athrow
// 24e: ldc2_w 8104523799953924914
// 251: lload 4
// 253: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: athrow
// 259: aload 38
// 25b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 260: astore 39
// 262: aload 38
// 264: iload 31
// 266: ifne 291
// 269: invokeinterface java/util/Iterator.hasNext ()Z 1
// 26e: ifne 28f
// 271: goto 27f
// 274: ldc2_w 8104523799953924914
// 277: lload 4
// 279: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27e: athrow
// 27f: aload 39
// 281: goto 35a
// 284: ldc2_w 8104523799953924914
// 287: lload 4
// 289: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28e: athrow
// 28f: aload 39
// 291: checkcast net/minecraft/class_243
// 294: astore 40
// 296: bipush 0
// 297: istore 41
// 299: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 29c: new net/minecraft/class_243
// 29f: dup
// 2a0: aload 32
// 2a2: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 2a5: i2d
// 2a6: aload 40
// 2a8: getfield net/minecraft/class_243.field_1352 D
// 2ab: dadd
// 2ac: aload 32
// 2ae: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 2b1: i2d
// 2b2: aload 40
// 2b4: getfield net/minecraft/class_243.field_1351 D
// 2b7: dadd
// 2b8: dconst_1
// 2b9: dadd
// 2ba: aload 32
// 2bc: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 2bf: i2d
// 2c0: aload 40
// 2c2: getfield net/minecraft/class_243.field_1350 D
// 2c5: dadd
// 2c6: invokespecial net/minecraft/class_243.<init> (DDD)V
// 2c9: astore 30
// 2cb: iload 11
// 2cd: i2s
// 2ce: iload 12
// 2d0: i2c
// 2d1: iload 13
// 2d3: aload 30
// 2d5: invokevirtual su/catlean/dm.z (SCILnet/minecraft/class_243;)F
// 2d8: nop
// 2d9: fstore 40
// 2db: aload 38
// 2dd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2e2: astore 41
// 2e4: aload 41
// 2e6: checkcast net/minecraft/class_243
// 2e9: astore 42
// 2eb: bipush 0
// 2ec: istore 43
// 2ee: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2f1: new net/minecraft/class_243
// 2f4: dup
// 2f5: aload 32
// 2f7: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 2fa: i2d
// 2fb: aload 42
// 2fd: getfield net/minecraft/class_243.field_1352 D
// 300: dadd
// 301: aload 32
// 303: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 306: i2d
// 307: aload 42
// 309: getfield net/minecraft/class_243.field_1351 D
// 30c: dadd
// 30d: dconst_1
// 30e: dadd
// 30f: aload 32
// 311: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 314: i2d
// 315: aload 42
// 317: getfield net/minecraft/class_243.field_1350 D
// 31a: dadd
// 31b: invokespecial net/minecraft/class_243.<init> (DDD)V
// 31e: astore 30
// 320: iload 11
// 322: i2s
// 323: iload 12
// 325: i2c
// 326: iload 13
// 328: aload 30
// 32a: invokevirtual su/catlean/dm.z (SCILnet/minecraft/class_243;)F
// 32d: nop
// 32e: fstore 42
// 330: fload 40
// 332: fload 42
// 334: invokestatic java/lang/Float.compare (FF)I
// 337: ifle 342
// 33a: aload 41
// 33c: astore 39
// 33e: fload 42
// 340: fstore 40
// 342: aload 38
// 344: invokeinterface java/util/Iterator.hasNext ()Z 1
// 349: ifne 2db
// 34c: iload 31
// 34e: lload 4
// 350: lconst_0
// 351: lcmp
// 352: ifle 349
// 355: ifne 33e
// 358: aload 39
// 35a: checkcast net/minecraft/class_243
// 35d: astore 35
// 35f: new net/minecraft/class_243
// 362: dup
// 363: aload 32
// 365: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 368: i2d
// 369: aload 35
// 36b: getfield net/minecraft/class_243.field_1352 D
// 36e: dadd
// 36f: aload 32
// 371: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 374: i2d
// 375: dconst_1
// 376: dadd
// 377: aload 32
// 379: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 37c: i2d
// 37d: aload 35
// 37f: getfield net/minecraft/class_243.field_1350 D
// 382: dadd
// 383: invokespecial net/minecraft/class_243.<init> (DDD)V
// 386: astore 34
// 388: aload 3
// 389: invokevirtual su/catlean/gp.F ()Z
// 38c: lload 4
// 38e: lconst_0
// 38f: lcmp
// 390: ifle 402
// 393: iload 31
// 395: ifne 402
// 398: ifeq 3d9
// 39b: goto 3a9
// 39e: ldc2_w 8104523799953924914
// 3a1: lload 4
// 3a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: athrow
// 3a9: getstatic su/catlean/i1.C Lsu/catlean/i1;
// 3ac: aload 2
// 3ad: lload 21
// 3af: aload 34
// 3b1: invokevirtual su/catlean/i1.C (Lnet/minecraft/class_243;JLnet/minecraft/class_243;)Z
// 3b4: lload 4
// 3b6: lconst_0
// 3b7: lcmp
// 3b8: ifle 43a
// 3bb: ifne 437
// 3be: goto 3cc
// 3c1: ldc2_w 8104523799953924914
// 3c4: lload 4
// 3c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cb: athrow
// 3cc: aconst_null
// 3cd: areturn
// 3ce: ldc2_w 8104523799953924914
// 3d1: lload 4
// 3d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d8: athrow
// 3d9: aload 34
// 3db: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 3de: lload 28
// 3e0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3e3: iload 23
// 3e5: i2s
// 3e6: swap
// 3e7: iload 24
// 3e9: swap
// 3ea: iload 25
// 3ec: i2c
// 3ed: swap
// 3ee: checkcast net/minecraft/class_1297
// 3f1: invokevirtual su/catlean/gw.a (SICLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 3f4: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 3f7: aload 3
// 3f8: invokevirtual su/catlean/gp.M ()F
// 3fb: aload 3
// 3fc: invokevirtual su/catlean/gp.M ()F
// 3ff: fmul
// 400: f2d
// 401: dcmpl
// 402: lload 4
// 404: lconst_0
// 405: lcmp
// 406: iflt 43a
// 409: ifle 437
// 40c: aconst_null
// 40d: areturn
// 40e: ldc2_w 8104523799953924914
// 411: lload 4
// 413: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 418: athrow
// 419: aload 0
// 41a: aload 2
// 41b: aload 3
// 41c: iload 8
// 41e: i2b
// 41f: aconst_null
// 420: bipush 4
// 421: aconst_null
// 422: lload 9
// 424: invokestatic su/catlean/oa.E (Lsu/catlean/oa;Lnet/minecraft/class_243;Lsu/catlean/gp;BLnet/minecraft/class_243;ILjava/lang/Object;J)Lnet/minecraft/class_243;
// 427: ifnonnull 437
// 42a: aconst_null
// 42b: areturn
// 42c: ldc2_w 8104523799953924914
// 42f: lload 4
// 431: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 436: athrow
// 437: iload 14
// 439: i2s
// 43a: aload 1
// 43b: aload 32
// 43d: lload 15
// 43f: aload 3
// 440: iload 6
// 442: bipush 0
// 443: bipush 0
// 444: invokestatic su/catlean/ot.e (SLsu/catlean/ux;Lnet/minecraft/class_2338;JLsu/catlean/gp;ZZZ)Lsu/catlean/t_;
// 447: areturn
}

static {
long var5 = a ^ 117437952888936L;
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
String var11 = "C,`^=s#¿©\u0011\u0096Nt\u0089\u008e~æ²ÊQïò\u0013\\ \fÅÿi\u0098\\\u008e\bôáÓÉæ7\u0084.ßû¿h·P>g2\bõ|\u0002SÂº\u0010ò\u009d¢\u0086Í´?\t\u0082ÇÔ\u0099\u0094¡Q¬\u0010éZ\u008e¨ÂÞ¤\u008dRç\u000bs Zód\u0010íB\"'\u0012¾8ò¡àè×êï±þ\u0010TÀü`3Í£@gÞ\tdÐ¡¾\u0087 ó\u000ekÓ\u0017!Û\u0014\u0086wSãÍ½UÅä,·ë\u0098\u009a.Å=¡÷=,¤\u0018n";
int var13 = "C,`^=s#¿©\u0011\u0096Nt\u0089\u008e~æ²ÊQïò\u0013\\ \fÅÿi\u0098\\\u008e\bôáÓÉæ7\u0084.ßû¿h·P>g2\bõ|\u0002SÂº\u0010ò\u009d¢\u0086Í´?\t\u0082ÇÔ\u0099\u0094¡Q¬\u0010éZ\u008e¨ÂÞ¤\u008dRç\u000bs Zód\u0010íB\"'\u0012¾8ò¡àè×êï±þ\u0010TÀü`3Í£@gÞ\tdÐ¡¾\u0087 ó\u000ekÓ\u0017!Û\u0014\u0086wSãÍ½UÅä,·ë\u0098\u009a.Å=¡÷=,¤\u0018n"
.length();
char var10 = 24;
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
long var2 = 6218760317836418325L;
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
k = new oa();
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

var11 = "[\\FQ\u008f4\u009a\u0092äq&\u0082Bîrm(×7¨\u0096viµ\u00ad\u0080\u008eE\u0002zgÅ\u0010a9\u0007Ù\u0087¿®¸\u00009þ\u007f\u0015´Úz";
var13 = "[\\FQ\u008f4\u009a\u0092äq&\u0082Bîrm(×7¨\u0096viµ\u00ad\u0080\u008eE\u0002zgÅ\u0010a9\u0007Ù\u0087¿®¸\u00009þ\u007f\u0015´Úz".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26164;
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
throw new RuntimeException("su/catlean/oa", var10);
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
throw new RuntimeException("su/catlean/oa" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
