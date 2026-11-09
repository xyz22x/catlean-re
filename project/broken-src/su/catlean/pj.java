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
import kotlin.jvm.functions.Function1;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class pj extends gf {
@NotNull
public static final pj J;
@NotNull
private static final List E;
@NotNull
private static final fd G;
private static final long a = yz.a(1619890557309310833L, -330321123597920234L, MethodHandles.lookup().lookupClass()).a(84612379644631L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private pj(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var10001 = var4 ^ 46431451187230L;
int var6 = (int)((var4 ^ 46431451187230L) >>> 48);
int var7 = (int)((var4 ^ 46431451187230L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, b<"d">(12368, 1994377159127219634L ^ var4), (char)var8);
}

@NotNull
public final List K() {
return E;
}

@Override
public void h(long a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 73719739740194
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 4149061658461
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 50910300018319
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 81581919584095
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 130313712838322
// 021: lxor
// 022: dup2
// 023: bipush 8
// 025: lushr
// 026: lstore 12
// 028: dup2
// 029: bipush 56
// 02b: lshl
// 02c: bipush 56
// 02e: lushr
// 02f: l2i
// 030: istore 14
// 032: pop2
// 033: dup2
// 034: ldc2_w 99541060701969
// 037: lxor
// 038: dup2
// 039: bipush 48
// 03b: lushr
// 03c: l2i
// 03d: istore 15
// 03f: dup2
// 040: bipush 16
// 042: lshl
// 043: bipush 32
// 045: lushr
// 046: l2i
// 047: istore 16
// 049: dup2
// 04a: bipush 48
// 04c: lshl
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 17
// 053: pop2
// 054: dup2
// 055: ldc2_w 655743806298
// 058: lxor
// 059: lstore 18
// 05b: dup2
// 05c: ldc2_w 100479272291701
// 05f: lxor
// 060: lstore 20
// 062: dup2
// 063: ldc2_w 130512158954640
// 066: lxor
// 067: lstore 22
// 069: dup2
// 06a: ldc2_w 104104530525409
// 06d: lxor
// 06e: dup2
// 06f: bipush 48
// 071: lushr
// 072: l2i
// 073: istore 24
// 075: dup2
// 076: bipush 16
// 078: lshl
// 079: bipush 32
// 07b: lushr
// 07c: l2i
// 07d: istore 25
// 07f: dup2
// 080: bipush 48
// 082: lshl
// 083: bipush 48
// 085: lushr
// 086: l2i
// 087: istore 26
// 089: pop2
// 08a: dup2
// 08b: ldc2_w 76479611429891
// 08e: lxor
// 08f: lstore 27
// 091: dup2
// 092: ldc2_w 128377113661390
// 095: lxor
// 096: lstore 29
// 098: dup2
// 099: ldc2_w 20173347401993
// 09c: lxor
// 09d: lstore 31
// 09f: dup2
// 0a0: ldc2_w 99949442920536
// 0a3: lxor
// 0a4: lstore 33
// 0a6: dup2
// 0a7: ldc2_w 30591967126976
// 0aa: lxor
// 0ab: lstore 35
// 0ad: pop2
// 0ae: aload 3
// 0af: sipush 19810
// 0b2: ldc2_w 6066626946150248319
// 0b5: lload 1
// 0b6: lxor
// 0b7: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/pj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0bf: getstatic su/catlean/iq.a Lsu/catlean/iq;
// 0c2: invokevirtual su/catlean/iq.L ()Ljava/util/ArrayList;
// 0c5: checkcast java/lang/Iterable
// 0c8: astore 39
// 0ca: bipush 0
// 0cb: istore 40
// 0cd: ldc2_w -5990947769900206742
// 0d0: lload 1
// 0d1: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: aload 39
// 0d8: astore 41
// 0da: new java/util/ArrayList
// 0dd: dup
// 0de: invokespecial java/util/ArrayList.<init> ()V
// 0e1: checkcast java/util/Collection
// 0e4: astore 42
// 0e6: bipush 0
// 0e7: istore 43
// 0e9: istore 37
// 0eb: aload 41
// 0ed: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0f2: astore 44
// 0f4: aload 44
// 0f6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0fb: ifeq 150
// 0fe: aload 44
// 100: lload 1
// 101: lconst_0
// 102: lcmp
// 103: ifle 110
// 106: iload 37
// 108: ifne 161
// 10b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 110: astore 45
// 112: aload 45
// 114: checkcast su/catlean/_g
// 117: astore 46
// 119: bipush 0
// 11a: istore 47
// 11c: aload 46
// 11e: getstatic su/catlean/ew.O Lsu/catlean/ew;
// 121: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 124: iload 37
// 126: ifne 13a
// 129: ifne 13d
// 12c: goto 139
// 12f: ldc2_w -6049911807183655031
// 132: lload 1
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: bipush 1
// 13a: goto 13e
// 13d: bipush 0
// 13e: ifeq 0f4
// 141: aload 42
// 143: aload 45
// 145: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 14a: pop
// 14b: iload 37
// 14d: ifeq 0f4
// 150: aload 42
// 152: checkcast java/util/List
// 155: nop
// 156: lload 1
// 157: lconst_0
// 158: lcmp
// 159: iflt 110
// 15c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 161: astore 38
// 163: aload 38
// 165: invokeinterface java/util/Iterator.hasNext ()Z 1
// 16a: ifeq 4ac
// 16d: aload 38
// 16f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 174: checkcast su/catlean/_g
// 177: astore 39
// 179: getstatic su/catlean/pj.E Ljava/util/List;
// 17c: checkcast java/lang/Iterable
// 17f: astore 41
// 181: bipush 0
// 182: istore 42
// 184: aload 41
// 186: iload 37
// 188: ifne 1f2
// 18b: instanceof java/util/Collection
// 18e: lload 1
// 18f: lconst_0
// 190: lcmp
// 191: iflt 4c8
// 194: iload 37
// 196: ifne 4c4
// 199: goto 1a6
// 19c: ldc2_w -6049911807183655031
// 19f: lload 1
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: ifeq 1f0
// 1a9: goto 1b6
// 1ac: ldc2_w -6049911807183655031
// 1af: lload 1
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: aload 41
// 1b8: checkcast java/util/Collection
// 1bb: iload 37
// 1bd: ifne 1f2
// 1c0: goto 1cd
// 1c3: ldc2_w -6049911807183655031
// 1c6: lload 1
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: invokeinterface java/util/Collection.isEmpty ()Z 1
// 1d2: ifeq 1f0
// 1d5: goto 1e2
// 1d8: ldc2_w -6049911807183655031
// 1db: lload 1
// 1dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: athrow
// 1e2: bipush 1
// 1e3: goto 236
// 1e6: ldc2_w -6049911807183655031
// 1e9: lload 1
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: aload 41
// 1f2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1f7: astore 43
// 1f9: aload 43
// 1fb: invokeinterface java/util/Iterator.hasNext ()Z 1
// 200: ifeq 235
// 203: aload 43
// 205: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 20a: astore 44
// 20c: aload 44
// 20e: checkcast su/catlean/ww
// 211: astore 45
// 213: bipush 0
// 214: istore 46
// 216: aload 45
// 218: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 21b: aload 39
// 21d: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 220: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 223: ifeq 1f9
// 226: bipush 0
// 227: lload 1
// 228: lconst_0
// 229: lcmp
// 22a: iflt 223
// 22d: iload 37
// 22f: ifne 223
// 232: goto 236
// 235: bipush 1
// 236: istore 40
// 238: aload 39
// 23a: lload 27
// 23c: invokevirtual su/catlean/_g.m (J)Lsu/catlean/lj;
// 23f: invokevirtual su/catlean/lj.X ()I
// 242: iload 37
// 244: lload 1
// 245: lconst_0
// 246: lcmp
// 247: ifle 24e
// 24a: ifne 30a
// 24d: bipush -1
// 24e: if_icmpeq 308
// 251: goto 25e
// 254: ldc2_w -6049911807183655031
// 257: lload 1
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: aload 39
// 260: lload 18
// 262: invokevirtual su/catlean/_g.f (J)Z
// 265: iload 37
// 267: ifne 30a
// 26a: goto 277
// 26d: ldc2_w -6049911807183655031
// 270: lload 1
// 271: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 276: athrow
// 277: ifeq 308
// 27a: goto 287
// 27d: ldc2_w -6049911807183655031
// 280: lload 1
// 281: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 286: athrow
// 287: iload 40
// 289: iload 37
// 28b: lload 1
// 28c: lconst_0
// 28d: lcmp
// 28e: ifle 30c
// 291: ifne 30a
// 294: goto 2a1
// 297: ldc2_w -6049911807183655031
// 29a: lload 1
// 29b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a0: athrow
// 2a1: ifeq 308
// 2a4: goto 2b1
// 2a7: ldc2_w -6049911807183655031
// 2aa: lload 1
// 2ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: athrow
// 2b1: getstatic su/catlean/pj.E Ljava/util/List;
// 2b4: new su/catlean/ww
// 2b7: dup
// 2b8: aload 39
// 2ba: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 2bd: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 2c0: aload 39
// 2c2: lload 27
// 2c4: invokevirtual su/catlean/_g.m (J)Lsu/catlean/lj;
// 2c7: invokevirtual su/catlean/lj.X ()I
// 2ca: lload 6
// 2cc: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 2cf: lload 12
// 2d1: dup2_x1
// 2d2: pop2
// 2d3: aconst_null
// 2d4: aconst_null
// 2d5: bipush 0
// 2d6: sipush 25263
// 2d9: ldc2_w 7388658380627085730
// 2dc: lload 1
// 2dd: lxor
// 2de: invokedynamic x (IJ)I bsm=su/catlean/pj.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e3: aconst_null
// 2e4: iload 14
// 2e6: i2b
// 2e7: invokespecial su/catlean/ww.<init> (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 2ea: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 2ef: pop
// 2f0: iload 37
// 2f2: lload 1
// 2f3: lconst_0
// 2f4: lcmp
// 2f5: ifle 16a
// 2f8: ifeq 163
// 2fb: goto 308
// 2fe: ldc2_w -6049911807183655031
// 301: lload 1
// 302: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 307: athrow
// 308: iload 40
// 30a: iload 37
// 30c: lload 1
// 30d: lconst_0
// 30e: lcmp
// 30f: ifle 331
// 312: ifne 32f
// 315: ifne 163
// 318: goto 325
// 31b: ldc2_w -6049911807183655031
// 31e: lload 1
// 31f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 324: athrow
// 325: aload 39
// 327: lload 27
// 329: invokevirtual su/catlean/_g.m (J)Lsu/catlean/lj;
// 32c: invokevirtual su/catlean/lj.X ()I
// 32f: iload 37
// 331: lload 1
// 332: lconst_0
// 333: lcmp
// 334: ifle 33b
// 337: ifne 383
// 33a: bipush -1
// 33b: if_icmpeq 37a
// 33e: goto 34b
// 341: ldc2_w -6049911807183655031
// 344: lload 1
// 345: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34a: athrow
// 34b: lload 1
// 34c: lconst_0
// 34d: lcmp
// 34e: iflt 385
// 351: aload 39
// 353: lload 18
// 355: invokevirtual su/catlean/_g.f (J)Z
// 358: iload 37
// 35a: ifne 383
// 35d: goto 36a
// 360: ldc2_w -6049911807183655031
// 363: lload 1
// 364: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 369: athrow
// 36a: ifne 163
// 36d: goto 37a
// 370: ldc2_w -6049911807183655031
// 373: lload 1
// 374: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 379: athrow
// 37a: getstatic su/catlean/pj.E Ljava/util/List;
// 37d: checkcast java/lang/Iterable
// 380: astore 41
// 382: bipush 0
// 383: istore 42
// 385: aload 41
// 387: astore 43
// 389: new java/util/ArrayList
// 38c: dup
// 38d: invokespecial java/util/ArrayList.<init> ()V
// 390: checkcast java/util/Collection
// 393: astore 44
// 395: bipush 0
// 396: istore 45
// 398: aload 43
// 39a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 39f: astore 46
// 3a1: aload 46
// 3a3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3a8: ifeq 441
// 3ab: aload 46
// 3ad: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3b2: astore 47
// 3b4: aload 47
// 3b6: checkcast su/catlean/ww
// 3b9: astore 48
// 3bb: bipush 0
// 3bc: istore 49
// 3be: lload 1
// 3bf: lconst_0
// 3c0: lcmp
// 3c1: ifle 456
// 3c4: aload 48
// 3c6: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 3c9: aload 39
// 3cb: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 3ce: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3d1: iload 37
// 3d3: ifne 454
// 3d6: iload 37
// 3d8: lload 1
// 3d9: lconst_0
// 3da: lcmp
// 3db: iflt 417
// 3de: ifne 415
// 3e1: goto 3ee
// 3e4: ldc2_w -6049911807183655031
// 3e7: lload 1
// 3e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ed: athrow
// 3ee: ifeq 42e
// 3f1: goto 3fe
// 3f4: ldc2_w -6049911807183655031
// 3f7: lload 1
// 3f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fd: athrow
// 3fe: aload 48
// 400: invokevirtual su/catlean/ww.f ()Ljava/lang/String;
// 403: ldc ""
// 405: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 408: goto 415
// 40b: ldc2_w -6049911807183655031
// 40e: lload 1
// 40f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 414: athrow
// 415: iload 37
// 417: ifne 42b
// 41a: ifeq 42e
// 41d: goto 42a
// 420: ldc2_w -6049911807183655031
// 423: lload 1
// 424: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 429: athrow
// 42a: bipush 1
// 42b: goto 42f
// 42e: bipush 0
// 42f: ifeq 3a1
// 432: aload 44
// 434: aload 47
// 436: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 43b: pop
// 43c: iload 37
// 43e: ifeq 3a1
// 441: aload 44
// 443: checkcast java/util/List
// 446: nop
// 447: checkcast java/lang/Iterable
// 44a: astore 41
// 44c: nop
// 44d: lload 1
// 44e: lconst_0
// 44f: lcmp
// 450: ifle 456
// 453: bipush 0
// 454: istore 42
// 456: aload 41
// 458: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 45d: astore 43
// 45f: aload 43
// 461: invokeinterface java/util/Iterator.hasNext ()Z 1
// 466: ifeq 4a6
// 469: aload 43
// 46b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 470: astore 44
// 472: aload 44
// 474: checkcast su/catlean/ww
// 477: astore 45
// 479: bipush 0
// 47a: istore 46
// 47c: aload 45
// 47e: bipush 1
// 47f: invokevirtual su/catlean/ww.W (Z)V
// 482: nop
// 483: iload 37
// 485: lload 1
// 486: lconst_0
// 487: lcmp
// 488: ifle 4a9
// 48b: ifne 4a7
// 48e: iload 37
// 490: ifeq 45f
// 493: lload 1
// 494: lconst_0
// 495: lcmp
// 496: iflt 483
// 499: goto 4a6
// 49c: ldc2_w -6049911807183655031
// 49f: lload 1
// 4a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a5: athrow
// 4a6: nop
// 4a7: iload 37
// 4a9: ifeq 163
// 4ac: getstatic su/catlean/pj.E Ljava/util/List;
// 4af: lload 1
// 4b0: lconst_0
// 4b1: lcmp
// 4b2: ifle 174
// 4b5: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/pj.P (Lsu/catlean/ww;)Z, (Lsu/catlean/ww;)Ljava/lang/Boolean; ]
// 4ba: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/pj.R (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 4bf: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 4c4: pop
// 4c5: sipush 7535
// 4c8: ldc2_w 8168213387521884023
// 4cb: lload 1
// 4cc: lxor
// 4cd: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/pj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d2: astore 38
// 4d4: aload 0
// 4d5: lload 35
// 4d7: invokevirtual su/catlean/pj.p (J)F
// 4da: aload 0
// 4db: lload 20
// 4dd: invokevirtual su/catlean/pj.r (J)I
// 4e0: i2f
// 4e1: fconst_2
// 4e2: fdiv
// 4e3: fcmpl
// 4e4: iload 37
// 4e6: ifne 4fa
// 4e9: ifle 4fd
// 4ec: goto 4f9
// 4ef: ldc2_w -6049911807183655031
// 4f2: lload 1
// 4f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f8: athrow
// 4f9: bipush 1
// 4fa: goto 4fe
// 4fd: bipush 0
// 4fe: istore 39
// 500: getstatic su/catlean/pj.G Lsu/catlean/fd;
// 503: getstatic su/catlean/pj.E Ljava/util/List;
// 506: invokeinterface java/util/List.isEmpty ()Z 1
// 50b: iload 37
// 50d: lload 1
// 50e: lconst_0
// 50f: lcmp
// 510: iflt 546
// 513: ifne 53e
// 516: ifeq 582
// 519: goto 526
// 51c: ldc2_w -6049911807183655031
// 51f: lload 1
// 520: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 525: athrow
// 526: lload 4
// 528: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 52b: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 52e: instanceof net/minecraft/class_408
// 531: goto 53e
// 534: ldc2_w -6049911807183655031
// 537: lload 1
// 538: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53d: athrow
// 53e: lload 1
// 53f: lconst_0
// 540: lcmp
// 541: iflt 571
// 544: iload 37
// 546: ifne 571
// 549: ifne 582
// 54c: goto 559
// 54f: ldc2_w -6049911807183655031
// 552: lload 1
// 553: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 558: athrow
// 559: lload 4
// 55b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 55e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 561: instanceof su/catlean/rl
// 564: goto 571
// 567: ldc2_w -6049911807183655031
// 56a: lload 1
// 56b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 570: athrow
// 571: ifne 582
// 574: fconst_0
// 575: goto 583
// 578: ldc2_w -6049911807183655031
// 57b: lload 1
// 57c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 581: athrow
// 582: fconst_1
// 583: lload 10
// 585: dup2_x1
// 586: pop2
// 587: invokevirtual su/catlean/fd.B (JF)V
// 58a: aload 0
// 58b: aload 3
// 58c: aload 38
// 58e: getstatic su/catlean/pj.G Lsu/catlean/fd;
// 591: invokevirtual su/catlean/fd.a ()F
// 594: iload 39
// 596: lload 22
// 598: invokevirtual su/catlean/pj.q (Lnet/minecraft/class_332;Ljava/lang/String;FZJ)V
// 59b: ldc 17.0
// 59d: fstore 40
// 59f: lload 33
// 5a1: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 5a4: lload 31
// 5a6: aload 38
// 5a8: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 5ab: ldc 24.0
// 5ad: fadd
// 5ae: fstore 41
// 5b0: getstatic su/catlean/pj.E Ljava/util/List;
// 5b3: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 5b8: astore 42
// 5ba: aload 42
// 5bc: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5c1: ifeq 691
// 5c4: aload 42
// 5c6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5cb: checkcast su/catlean/ww
// 5ce: astore 43
// 5d0: lload 33
// 5d2: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 5d5: aload 43
// 5d7: invokevirtual su/catlean/ww.f ()Ljava/lang/String;
// 5da: checkcast java/lang/CharSequence
// 5dd: astore 45
// 5df: aload 45
// 5e1: invokeinterface java/lang/CharSequence.length ()I 1
// 5e6: iload 37
// 5e8: lload 1
// 5e9: lconst_0
// 5ea: lcmp
// 5eb: ifle 6d4
// 5ee: ifne 6d2
// 5f1: iload 37
// 5f3: ifne 614
// 5f6: goto 603
// 5f9: ldc2_w -6049911807183655031
// 5fc: lload 1
// 5fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 602: athrow
// 603: ifne 617
// 606: goto 613
// 609: ldc2_w -6049911807183655031
// 60c: lload 1
// 60d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 612: athrow
// 613: bipush 1
// 614: goto 618
// 617: bipush 0
// 618: ifeq 635
// 61b: astore 50
// 61d: bipush 0
// 61e: istore 46
// 620: aload 43
// 622: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 625: checkcast java/lang/CharSequence
// 628: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 62b: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 62e: nop
// 62f: aload 50
// 631: swap
// 632: goto 637
// 635: aload 45
// 637: checkcast java/lang/String
// 63a: lload 31
// 63c: dup2_x1
// 63d: pop2
// 63e: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 641: fstore 44
// 643: lload 33
// 645: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 648: aload 43
// 64a: invokevirtual su/catlean/ww.w ()Ljava/lang/String;
// 64d: lload 31
// 64f: dup2_x1
// 650: pop2
// 651: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 654: fstore 45
// 656: fload 44
// 658: fload 45
// 65a: fadd
// 65b: ldc 13.0
// 65d: fadd
// 65e: lload 1
// 65f: lconst_0
// 660: lcmp
// 661: ifle 68a
// 664: fload 41
// 666: iload 37
// 668: ifne 689
// 66b: fcmpl
// 66c: lload 1
// 66d: lconst_0
// 66e: lcmp
// 66f: iflt 5c1
// 672: ifle 5ba
// 675: goto 682
// 678: ldc2_w -6049911807183655031
// 67b: lload 1
// 67c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 681: athrow
// 682: fload 44
// 684: fload 45
// 686: fadd
// 687: ldc 13.0
// 689: fadd
// 68a: fstore 41
// 68c: iload 37
// 68e: ifeq 5ba
// 691: getstatic su/catlean/pj.E Ljava/util/List;
// 694: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 699: lload 1
// 69a: lconst_0
// 69b: lcmp
// 69c: ifle 5cb
// 69f: astore 42
// 6a1: aload 42
// 6a3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 6a8: ifeq 925
// 6ab: aload 42
// 6ad: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 6b2: checkcast su/catlean/ww
// 6b5: astore 43
// 6b7: iload 37
// 6b9: ifne 935
// 6bc: lload 33
// 6be: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 6c1: aload 43
// 6c3: invokevirtual su/catlean/ww.f ()Ljava/lang/String;
// 6c6: checkcast java/lang/CharSequence
// 6c9: astore 45
// 6cb: aload 45
// 6cd: invokeinterface java/lang/CharSequence.length ()I 1
// 6d2: iload 37
// 6d4: ifne 6e8
// 6d7: ifne 6eb
// 6da: goto 6e7
// 6dd: ldc2_w -6049911807183655031
// 6e0: lload 1
// 6e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e6: athrow
// 6e7: bipush 1
// 6e8: goto 6ec
// 6eb: bipush 0
// 6ec: ifeq 709
// 6ef: astore 50
// 6f1: bipush 0
// 6f2: istore 46
// 6f4: aload 43
// 6f6: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 6f9: checkcast java/lang/CharSequence
// 6fc: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 6ff: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 702: nop
// 703: aload 50
// 705: swap
// 706: goto 70b
// 709: aload 45
// 70b: checkcast java/lang/String
// 70e: lload 31
// 710: dup2_x1
// 711: pop2
// 712: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 715: fstore 44
// 717: lload 33
// 719: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 71c: aload 43
// 71e: invokevirtual su/catlean/ww.w ()Ljava/lang/String;
// 721: lload 31
// 723: dup2_x1
// 724: pop2
// 725: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 728: fstore 45
// 72a: iload 39
// 72c: ifeq 768
// 72f: aload 0
// 730: lload 35
// 732: invokevirtual su/catlean/pj.p (J)F
// 735: fconst_1
// 736: aload 43
// 738: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 73b: invokevirtual su/catlean/fd.a ()F
// 73e: fsub
// 73f: sipush 12810
// 742: ldc2_w 4135138079028697350
// 745: lload 1
// 746: lxor
// 747: invokedynamic x (IJ)I bsm=su/catlean/pj.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74c: i2f
// 74d: fmul
// 74e: fsub
// 74f: fload 44
// 751: fload 45
// 753: fadd
// 754: ldc 13.0
// 756: fadd
// 757: fload 41
// 759: fsub
// 75a: fsub
// 75b: goto 788
// 75e: ldc2_w -6049911807183655031
// 761: lload 1
// 762: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 767: athrow
// 768: aload 0
// 769: lload 35
// 76b: invokevirtual su/catlean/pj.p (J)F
// 76e: fconst_1
// 76f: aload 43
// 771: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 774: invokevirtual su/catlean/fd.a ()F
// 777: fsub
// 778: sipush 11359
// 77b: ldc2_w 8416756822275409744
// 77e: lload 1
// 77f: lxor
// 780: invokedynamic x (IJ)I bsm=su/catlean/pj.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 785: i2f
// 786: fmul
// 787: fsub
// 788: fstore 46
// 78a: aload 0
// 78b: checkcast su/catlean/gf
// 78e: aload 3
// 78f: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 792: dup
// 793: sipush 6585
// 796: ldc2_w 2530497298012470176
// 799: lload 1
// 79a: lxor
// 79b: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/pj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7a3: fload 46
// 7a5: aload 0
// 7a6: lload 8
// 7a8: invokevirtual su/catlean/pj.V (J)F
// 7ab: fload 40
// 7ad: fadd
// 7ae: iload 24
// 7b0: i2s
// 7b1: swap
// 7b2: iload 25
// 7b4: swap
// 7b5: fload 44
// 7b7: ldc 6.0
// 7b9: fadd
// 7ba: ldc 13.0
// 7bc: aload 43
// 7be: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 7c1: invokevirtual su/catlean/fd.a ()F
// 7c4: iload 26
// 7c6: i2s
// 7c7: swap
// 7c8: bipush 0
// 7c9: sipush 18956
// 7cc: ldc2_w 6365550753325850884
// 7cf: lload 1
// 7d0: lxor
// 7d1: invokedynamic x (IJ)I bsm=su/catlean/pj.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d6: aconst_null
// 7d7: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 7da: aload 0
// 7db: checkcast su/catlean/gf
// 7de: aload 3
// 7df: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 7e2: dup
// 7e3: sipush 25958
// 7e6: ldc2_w 8081389821267871609
// 7e9: lload 1
// 7ea: lxor
// 7eb: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/pj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7f3: fload 46
// 7f5: fload 44
// 7f7: ldc 7.0
// 7f9: fadd
// 7fa: aload 43
// 7fc: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 7ff: invokevirtual su/catlean/fd.a ()F
// 802: fmul
// 803: fadd
// 804: aload 0
// 805: lload 8
// 807: invokevirtual su/catlean/pj.V (J)F
// 80a: fload 40
// 80c: fadd
// 80d: iload 24
// 80f: i2s
// 810: swap
// 811: iload 25
// 813: swap
// 814: fload 45
// 816: ldc 8.0
// 818: fadd
// 819: ldc 13.0
// 81b: aload 43
// 81d: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 820: invokevirtual su/catlean/fd.a ()F
// 823: iload 26
// 825: i2s
// 826: swap
// 827: bipush 0
// 828: sipush 31890
// 82b: ldc2_w 3446984192986027932
// 82e: lload 1
// 82f: lxor
// 830: invokedynamic x (IJ)I bsm=su/catlean/pj.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 835: aconst_null
// 836: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 839: fload 40
// 83b: fstore 47
// 83d: aload 0
// 83e: aload 3
// 83f: aload 43
// 841: invokevirtual su/catlean/ww.f ()Ljava/lang/String;
// 844: checkcast java/lang/CharSequence
// 847: astore 48
// 849: aload 48
// 84b: invokeinterface java/lang/CharSequence.length ()I 1
// 850: iload 37
// 852: ifne 866
// 855: ifne 869
// 858: goto 865
// 85b: ldc2_w -6049911807183655031
// 85e: lload 1
// 85f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 864: athrow
// 865: bipush 1
// 866: goto 86a
// 869: bipush 0
// 86a: ifeq 88e
// 86d: astore 51
// 86f: astore 50
// 871: bipush 0
// 872: istore 49
// 874: aload 43
// 876: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 879: checkcast java/lang/CharSequence
// 87c: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 87f: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 882: nop
// 883: astore 52
// 885: aload 50
// 887: aload 51
// 889: aload 52
// 88b: goto 890
// 88e: aload 48
// 890: checkcast java/lang/String
// 893: fload 46
// 895: ldc 3.0
// 897: fadd
// 898: aload 0
// 899: lload 8
// 89b: invokevirtual su/catlean/pj.V (J)F
// 89e: fload 47
// 8a0: fadd
// 8a1: fconst_1
// 8a2: fadd
// 8a3: lload 29
// 8a5: dup2_x1
// 8a6: pop2
// 8a7: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 8aa: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 8ad: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 8b0: aload 43
// 8b2: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 8b5: invokevirtual su/catlean/fd.a ()F
// 8b8: iload 15
// 8ba: i2c
// 8bb: swap
// 8bc: iload 16
// 8be: swap
// 8bf: iload 17
// 8c1: i2s
// 8c2: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 8c5: invokevirtual su/catlean/pj.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 8c8: aload 0
// 8c9: aload 3
// 8ca: aload 43
// 8cc: invokevirtual su/catlean/ww.w ()Ljava/lang/String;
// 8cf: fload 46
// 8d1: fload 44
// 8d3: ldc 11.0
// 8d5: fadd
// 8d6: aload 43
// 8d8: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 8db: invokevirtual su/catlean/fd.a ()F
// 8de: fmul
// 8df: fadd
// 8e0: aload 0
// 8e1: lload 8
// 8e3: invokevirtual su/catlean/pj.V (J)F
// 8e6: fload 47
// 8e8: fadd
// 8e9: fconst_1
// 8ea: fadd
// 8eb: lload 29
// 8ed: dup2_x1
// 8ee: pop2
// 8ef: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 8f2: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 8f5: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 8f8: aload 43
// 8fa: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 8fd: invokevirtual su/catlean/fd.a ()F
// 900: iload 15
// 902: i2c
// 903: swap
// 904: iload 16
// 906: swap
// 907: iload 17
// 909: i2s
// 90a: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 90d: invokevirtual su/catlean/pj.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 910: fload 40
// 912: ldc 14.0
// 914: aload 43
// 916: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 919: invokevirtual su/catlean/fd.a ()F
// 91c: fmul
// 91d: fadd
// 91e: fstore 40
// 920: iload 37
// 922: ifeq 6a1
// 925: aload 0
// 926: fload 41
// 928: fload 40
// 92a: fconst_2
// 92b: fsub
// 92c: invokevirtual su/catlean/pj.X (FF)V
// 92f: lload 1
// 930: lconst_0
// 931: lcmp
// 932: ifle 935
// 935: return
}

private static final boolean P(ww param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/pj.a J
// 03: ldc2_w 41411592995948
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 73226780197432
// 0d: lxor
// 0e: lstore 3
// 0f: pop2
// 10: ldc2_w 5889500919979563720
// 13: lload 1
// 14: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: aload 0
// 1a: sipush 32252
// 1d: ldc2_w 5231071552470934149
// 20: lload 1
// 21: lxor
// 22: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/pj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2a: istore 5
// 2c: aload 0
// 2d: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 30: aload 0
// 31: invokevirtual su/catlean/ww.Y ()Z
// 34: ifeq 45
// 37: fconst_0
// 38: goto 46
// 3b: ldc2_w 5867466734194037486
// 3e: lload 1
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: fconst_1
// 46: lload 3
// 47: dup2_x1
// 48: pop2
// 49: invokevirtual su/catlean/fd.B (JF)V
// 4c: aload 0
// 4d: invokevirtual su/catlean/ww.Y ()Z
// 50: iload 5
// 52: ifeq 7b
// 55: ifeq 94
// 58: goto 65
// 5b: ldc2_w 5867466734194037486
// 5e: lload 1
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: aload 0
// 66: invokevirtual su/catlean/ww.l ()Lsu/catlean/fd;
// 69: invokevirtual su/catlean/fd.a ()F
// 6c: fconst_0
// 6d: fcmpg
// 6e: goto 7b
// 71: ldc2_w 5867466734194037486
// 74: lload 1
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: iload 5
// 7d: ifeq 91
// 80: ifgt 94
// 83: goto 90
// 86: ldc2_w 5867466734194037486
// 89: lload 1
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: bipush 1
// 91: goto 95
// 94: bipush 0
// 95: ireturn
}

private static final boolean R(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var27 = a ^ 22721176433672L;
long var29 = var27 ^ 32682211263404L;
long var10001 = var27 ^ 110222152611485L;
int var31 = (int)((var27 ^ 110222152611485L) >>> 48);
int var32 = (int)((var27 ^ 110222152611485L) << 16 >>> 48);
int var33 = (int)(var10001 << 32 >>> 32);
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[6];
int var23 = 0;
String var22 = "B à°òÜh\u00172£IOd¥su yÎ\u0083C\u0097\u0091\u009aq$Ê\u009c\u008a1wd\u0017ÈÍ\f!Jñ\u0092éÄ_ \u0085a4\u008d\u0093\u0018\u0016¹m´5S\u0010ÖÆÈÀ\u0092\u0017Tp5x-\u0090Ut3f\u008f\u0010äªÎÔåPSb\u000e'+Ì\u001a\u008aá6";
int var24 = "B à°òÜh\u00172£IOd¥su yÎ\u0083C\u0097\u0091\u009aq$Ê\u009c\u008a1wd\u0017ÈÍ\f!Jñ\u0092éÄ_ \u0085a4\u008d\u0093\u0018\u0016¹m´5S\u0010ÖÆÈÀ\u0092\u0017Tp5x-\u0090Ut3f\u008f\u0010äªÎÔåPSb\u000e'+Ì\u001a\u008aá6"
.length();
char var21 = 16;
int var36 = -1;

label64:
while (true) {
String var37 = var22.substring(++var36, var36 + var21);
byte var42 = -1;

while (true) {
byte[] var26 = var18.doFinal(var37.getBytes("ISO-8859-1"));
String var51 = b(var26).intern();
switch (var42) {
case 0:
var25[var23++] = var51;
if ((var36 += var21) >= var24) {
b = var25;
c = new String[6];
i = new HashMap(13);
Cipher var7;
var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var27 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var13 = new long[5];
int var10 = 0;
String var11 = "T×\u001cl\ni±ä9\u00188\u0082P\u0092½\u000fê½ñ\u000bÌÁ\u0010\u0016";
int var12 = "T×\u001cl\ni±ä9\u00188\u0082P\u0092½\u000fê½ñ\u000bÌÁ\u0010\u0016".length();
byte var9 = 0;

label46:
while (true) {
byte var46 = var9;
var9 += 8;
byte[] var14 = var11.substring(var46, var9).getBytes("ISO-8859-1");
long[] var40 = var13;
int var47 = var10++;
long var55 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var60 = -1;

while (true) {
long var15 = var55;
byte[] var17 = var7.doFinal(
new byte[]{
(byte)(var15 >>> 56),
(byte)(var15 >>> 48),
(byte)(var15 >>> 40),
(byte)(var15 >>> 32),
(byte)(var15 >>> 24),
(byte)(var15 >>> 16),
(byte)(var15 >>> 8),
(byte)var15
}
);
long var63 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var60) {
case 0:
var40[var47] = var63;
if (var9 >= var12) {
g = var13;
h = new Integer[5];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 5637558081721622106L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var58 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var49 = -1;
long var0 = var58;
J = new pj((short)var31, (short)var32, var33);
E = new ArrayList();
G = new fd(_s.OUT_BACK, var0, var29);
return;
}
break;
default:
var40[var47] = var63;
if (var9 < var12) {
continue label46;
}

var11 = "-\u0082³7\nµ¯¦w\u0082Y\u009aÓ\u001f\tW";
var12 = "-\u0082³7\nµ¯¦w\u0082Y\u009aÓ\u001f\tW".length();
var9 = 0;
}

byte var48 = var9;
var9 += 8;
var14 = var11.substring(var48, var9).getBytes("ISO-8859-1");
var40 = var13;
var47 = var10++;
var55 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var60 = 0;
}
}
}

var21 = var22.charAt(var36);
break;
default:
var25[var23++] = var51;
if ((var36 += var21) < var24) {
var21 = var22.charAt(var36);
continue label64;
}

var22 = "\u0089\u0017ó\u0094ç¡\u008aUZW¶æ`ÏæH÷\u0097þ}¿¾r\u000f\u007f²Ö·¦ø!\u007f \u0096\u001e¸1ùù\u0095p\u009dü\u0010\u0014W\u0019åñ\u008bÂ\u0088è\u009b³]á\u0084î{,Ò\u0088\u0095\u0083";
var24 = "\u0089\u0017ó\u0094ç¡\u008aUZW¶æ`ÏæH÷\u0097þ}¿¾r\u000f\u007f²Ö·¦ø!\u007f \u0096\u001e¸1ùù\u0095p\u009dü\u0010\u0014W\u0019åñ\u008bÂ\u0088è\u009b³]á\u0084î{,Ò\u0088\u0095\u0083"
.length();
var21 = ' ';
var36 = -1;
}

var37 = var22.substring(++var36, var36 + var21);
var42 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20342;
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
throw new RuntimeException("su/catlean/pj", var10);
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
throw new RuntimeException("su/catlean/pj" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18023;
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
throw new RuntimeException("su/catlean/pj", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/pj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
