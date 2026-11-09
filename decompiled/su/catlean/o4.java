package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class o4 extends o3 {
@NotNull
private final mx d;
@NotNull
private final File N;
public List J;
public o_ R;
private static final long a = yz.a(1404259593481068913L, 2990130902032560075L, MethodHandles.lookup().lookupClass()).a(177617342497807L);
private static final String[] c;
private static final String[] h;
private static final Map i = new HashMap(13);
private static final long m;

public o4(@NotNull Json json, @NotNull mx sharedSource, long a) {
ax = a ^ ax;
long var10001 = ax ^ 24081682798801L;
int var5 = (int)((ax ^ 24081682798801L) >>> 32);
int var6 = (int)((ax ^ 24081682798801L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(json, b<"l">(25293, 4694936139505973827L ^ ax));
Intrinsics.checkNotNullParameter(sharedSource, b<"l">(18542, 1018306007998140647L ^ ax));
super(var5, (short)var6, (char)var7, json);
this.d = sharedSource;
this.N = new File(mj.v(), b<"l">(14502, 3441522919587438637L ^ ax));
}

@NotNull
@Override
public File U() {
return this.N;
}

@NotNull
public final List Z(long param1, byte param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: bipush 8
// 03: lshl
// 04: iload 3
// 05: i2l
// 06: bipush 56
// 08: lshl
// 09: bipush 56
// 0b: lushr
// 0c: lor
// 0d: getstatic su/catlean/o4.a J
// 10: lxor
// 11: lstore 4
// 13: ldc2_w -4620883916760142597
// 16: lload 4
// 18: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: astore 6
// 1f: aload 6
// 21: ifnonnull 58
// 24: aload 0
// 25: getfield su/catlean/o4.J Ljava/util/List;
// 28: dup
// 29: ifnull 46
// 2c: goto 3a
// 2f: ldc2_w -4636219579035785652
// 32: lload 4
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: areturn
// 3b: ldc2_w -4636219579035785652
// 3e: lload 4
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: pop
// 47: sipush 23521
// 4a: ldc2_w 6242293795020695492
// 4d: lload 4
// 4f: lxor
// 50: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/o4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
// 58: aconst_null
// 59: areturn
}

public final void I(@NotNull List <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"l">(30343, 7410571354657902964L ^ ax));
this.J = <set-?>;
}

@NotNull
public final o_ k(long var1) {
var1 = a ^ var1;

try {
if (this.R != null) {
return this.R;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, -1187103526604949918L, var1);
}

Intrinsics.throwUninitializedPropertyAccessException(b<"l">(27763, 566169858078179445L ^ var1));
return null;
}

public final void W(long a, @NotNull o_ <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"l">(30857, 7330643387750197864L ^ ax));
this.R = <set-?>;
}

@Override
public void w(long param1) {
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
// 002: ldc2_w 396435401634
// 005: lxor
// 006: dup2
// 007: bipush 8
// 009: lushr
// 00a: lstore 3
// 00b: dup2
// 00c: bipush 56
// 00e: lshl
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 5
// 015: pop2
// 016: dup2
// 017: ldc2_w 131961657424154
// 01a: lxor
// 01b: lstore 6
// 01d: dup2
// 01e: ldc2_w 110163522662523
// 021: lxor
// 022: lstore 8
// 024: dup2
// 025: ldc2_w 21783406429546
// 028: lxor
// 029: lstore 10
// 02b: pop2
// 02c: ldc2_w -4979256665557882430
// 02f: lload 1
// 030: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: aload 0
// 036: invokevirtual su/catlean/o4.U ()Ljava/io/File;
// 039: invokevirtual java/io/File.mkdirs ()Z
// 03c: pop
// 03d: aload 0
// 03e: astore 30
// 040: astore 12
// 042: nop
// 043: aload 30
// 045: aload 0
// 046: checkcast su/catlean/o3
// 049: astore 13
// 04b: astore 31
// 04d: bipush 0
// 04e: istore 14
// 050: aload 13
// 052: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 055: invokevirtual java/io/File.exists ()Z
// 058: aload 12
// 05a: ifnonnull 094
// 05d: ifeq 097
// 060: goto 06d
// 063: ldc2_w -5003037230063459467
// 066: lload 1
// 067: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: athrow
// 06d: aload 13
// 06f: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 072: aload 12
// 074: ifnonnull 0b3
// 077: goto 084
// 07a: ldc2_w -5003037230063459467
// 07d: lload 1
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: invokevirtual java/io/File.isDirectory ()Z
// 087: goto 094
// 08a: ldc2_w -5003037230063459467
// 08d: lload 1
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: ifne 0ae
// 097: new java/util/ArrayList
// 09a: dup
// 09b: invokespecial java/util/ArrayList.<init> ()V
// 09e: checkcast java/util/List
// 0a1: goto 25f
// 0a4: ldc2_w -5003037230063459467
// 0a7: lload 1
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: aload 13
// 0b0: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 0b3: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
// 0b6: astore 15
// 0b8: aload 15
// 0ba: aload 12
// 0bc: ifnonnull 0d1
// 0bf: ifnull 254
// 0c2: goto 0cf
// 0c5: ldc2_w -5003037230063459467
// 0c8: lload 1
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: aload 15
// 0d1: astore 16
// 0d3: nop
// 0d4: bipush 0
// 0d5: istore 17
// 0d7: aload 16
// 0d9: astore 18
// 0db: new java/util/ArrayList
// 0de: dup
// 0df: invokespecial java/util/ArrayList.<init> ()V
// 0e2: checkcast java/util/Collection
// 0e5: astore 19
// 0e7: bipush 0
// 0e8: istore 20
// 0ea: bipush 0
// 0eb: istore 21
// 0ed: aload 18
// 0ef: arraylength
// 0f0: istore 22
// 0f2: iload 21
// 0f4: iload 22
// 0f6: if_icmpge 173
// 0f9: aload 18
// 0fb: iload 21
// 0fd: aaload
// 0fe: astore 23
// 100: aload 23
// 102: astore 24
// 104: bipush 0
// 105: istore 25
// 107: aload 24
// 109: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 10c: aload 12
// 10e: lload 1
// 10f: lconst_0
// 110: lcmp
// 111: iflt 119
// 114: ifnonnull 254
// 117: aload 12
// 119: lload 1
// 11a: lconst_0
// 11b: lcmp
// 11c: ifle 170
// 11f: ifnonnull 16e
// 122: goto 12f
// 125: ldc2_w -5003037230063459467
// 128: lload 1
// 129: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: athrow
// 12f: aload 24
// 131: invokestatic kotlin/io/FilesKt.getExtension (Ljava/io/File;)Ljava/lang/String;
// 134: sipush 17796
// 137: ldc2_w 5198707496035450009
// 13a: lload 1
// 13b: lxor
// 13c: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/o4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 144: ifeq 16b
// 147: goto 154
// 14a: ldc2_w -5003037230063459467
// 14d: lload 1
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: aload 19
// 156: aload 23
// 158: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 15d: pop
// 15e: goto 16b
// 161: ldc2_w -5003037230063459467
// 164: lload 1
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: iinc 21 1
// 16e: aload 12
// 170: ifnull 0f2
// 173: aload 19
// 175: checkcast java/util/List
// 178: nop
// 179: checkcast java/lang/Iterable
// 17c: astore 17
// 17e: nop
// 17f: bipush 0
// 180: istore 18
// 182: aload 17
// 184: astore 19
// 186: new java/util/ArrayList
// 189: dup
// 18a: aload 17
// 18c: getstatic su/catlean/o4.m J
// 18f: l2i
// 190: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 193: invokespecial java/util/ArrayList.<init> (I)V
// 196: checkcast java/util/Collection
// 199: astore 20
// 19b: bipush 0
// 19c: istore 21
// 19e: lload 1
// 19f: lconst_0
// 1a0: lcmp
// 1a1: ifle 254
// 1a4: aload 19
// 1a6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1ab: astore 22
// 1ad: aload 22
// 1af: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1b4: ifeq 22a
// 1b7: aload 22
// 1b9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1be: astore 23
// 1c0: aload 20
// 1c2: aload 23
// 1c4: checkcast java/io/File
// 1c7: astore 24
// 1c9: astore 26
// 1cb: bipush 0
// 1cc: istore 25
// 1ce: aload 13
// 1d0: invokestatic su/catlean/o3.S (Lsu/catlean/o3;)Lkotlinx/serialization/json/Json;
// 1d3: astore 27
// 1d5: aload 24
// 1d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1da: aload 24
// 1dc: aconst_null
// 1dd: bipush 1
// 1de: aconst_null
// 1df: invokestatic kotlin/io/FilesKt.readText$default (Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
// 1e2: astore 28
// 1e4: bipush 0
// 1e5: istore 29
// 1e7: aload 27
// 1e9: aload 27
// 1eb: invokevirtual kotlinx/serialization/json/Json.getSerializersModule ()Lkotlinx/serialization/modules/SerializersModule;
// 1ee: pop
// 1ef: getstatic su/catlean/o_.q Lsu/catlean/a9;
// 1f2: invokevirtual su/catlean/a9.U ()Lkotlinx/serialization/KSerializer;
// 1f5: checkcast kotlinx/serialization/DeserializationStrategy
// 1f8: aload 28
// 1fa: invokevirtual kotlinx/serialization/json/Json.decodeFromString (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
// 1fd: nop
// 1fe: aload 26
// 200: swap
// 201: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 206: pop
// 207: aload 12
// 209: lload 1
// 20a: lconst_0
// 20b: lcmp
// 20c: iflt 214
// 20f: ifnonnull 254
// 212: aload 12
// 214: ifnull 1ad
// 217: lload 1
// 218: lconst_0
// 219: lcmp
// 21a: ifle 207
// 21d: goto 22a
// 220: ldc2_w -5003037230063459467
// 223: lload 1
// 224: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: athrow
// 22a: aload 20
// 22c: checkcast java/util/List
// 22f: nop
// 230: checkcast java/util/Collection
// 233: invokestatic kotlin/collections/CollectionsKt.toMutableList (Ljava/util/Collection;)Ljava/util/List;
// 236: astore 17
// 238: aload 17
// 23a: aload 12
// 23c: ifnonnull 251
// 23f: ifnull 254
// 242: goto 24f
// 245: ldc2_w -5003037230063459467
// 248: lload 1
// 249: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24e: athrow
// 24f: aload 17
// 251: goto 25e
// 254: new java/util/ArrayList
// 257: dup
// 258: invokespecial java/util/ArrayList.<init> ()V
// 25b: checkcast java/util/List
// 25e: nop
// 25f: aload 31
// 261: swap
// 262: astore 13
// 264: goto 28c
// 267: astore 14
// 269: aload 30
// 26b: invokestatic su/catlean/zf.x ()Lorg/slf4j/Logger;
// 26e: sipush 22878
// 271: ldc2_w 6742223651841695818
// 274: lload 1
// 275: lxor
// 276: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/o4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
// 280: new java/util/ArrayList
// 283: dup
// 284: invokespecial java/util/ArrayList.<init> ()V
// 287: checkcast java/util/List
// 28a: astore 13
// 28c: aload 13
// 28e: lload 8
// 290: invokevirtual su/catlean/o4.I (Ljava/util/List;J)V
// 293: aload 0
// 294: aload 0
// 295: lload 3
// 296: iload 5
// 298: i2b
// 299: invokevirtual su/catlean/o4.Z (JB)Ljava/util/List;
// 29c: checkcast java/lang/Iterable
// 29f: astore 14
// 2a1: astore 30
// 2a3: bipush 0
// 2a4: istore 15
// 2a6: aload 14
// 2a8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2ad: astore 16
// 2af: aload 16
// 2b1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2b6: ifeq 2f3
// 2b9: aload 16
// 2bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2c0: astore 17
// 2c2: aload 17
// 2c4: checkcast su/catlean/o_
// 2c7: astore 18
// 2c9: bipush 0
// 2ca: istore 19
// 2cc: aload 18
// 2ce: invokevirtual su/catlean/o_.z ()Ljava/lang/String;
// 2d1: aload 0
// 2d2: getfield su/catlean/o4.d Lsu/catlean/mx;
// 2d5: lload 6
// 2d7: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 2da: invokevirtual su/catlean/sl.u ()Ljava/lang/String;
// 2dd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2e0: ifeq 2af
// 2e3: aload 17
// 2e5: lload 1
// 2e6: lconst_0
// 2e7: lcmp
// 2e8: ifle 2c0
// 2eb: aload 12
// 2ed: ifnonnull 2c4
// 2f0: goto 2f4
// 2f3: aconst_null
// 2f4: aload 30
// 2f6: swap
// 2f7: checkcast su/catlean/o_
// 2fa: aload 12
// 2fc: ifnonnull 321
// 2ff: dup
// 300: ifnonnull 348
// 303: goto 310
// 306: ldc2_w -5003037230063459467
// 309: lload 1
// 30a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30f: athrow
// 310: pop
// 311: invokestatic su/catlean/cd.C ()Lsu/catlean/o_;
// 314: goto 321
// 317: ldc2_w -5003037230063459467
// 31a: lload 1
// 31b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 320: athrow
// 321: astore 14
// 323: aload 14
// 325: astore 15
// 327: astore 30
// 329: bipush 0
// 32a: istore 16
// 32c: aload 0
// 32d: lload 3
// 32e: iload 5
// 330: i2b
// 331: invokevirtual su/catlean/o4.Z (JB)Ljava/util/List;
// 334: invokestatic su/catlean/cd.C ()Lsu/catlean/o_;
// 337: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
// 33a: checkcast java/util/Collection
// 33d: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
// 342: pop
// 343: nop
// 344: aload 30
// 346: aload 14
// 348: lload 10
// 34a: dup2_x1
// 34b: pop2
// 34c: invokevirtual su/catlean/o4.W (JLsu/catlean/o_;)V
// 34f: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@Override
public void h(int var1, int var2, byte var3) {
long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
long var6 = (var4 ^ 19920229037783L) >>> 8;
int var8 = (int)((var4 ^ 19920229037783L) << 56 >>> 56);
Iterable var10 = this.Z(var6, (byte)var8);
String var10000 = vm.a<"Å">(7463364205943846071L, var4);
boolean var11 = false;
Iterator var12 = var10.iterator();
String var9 = var10000;

label38:
while (var12.hasNext()) {
Object var13 = var12.next();
o_ var14 = (o_)var13;
boolean var15 = false;
File var16 = new File(this.U(), var14.z() + b<"l">(30037, 1459823514126422326L ^ var4));
boolean var18 = false;
var16.createNewFile();
File var24 = var16;
Json var22 = this.V();
o_ var17 = var14;
var18 = false;

try {
var22.getSerializersModule();
FilesKt.writeText$default(var24, var22.encodeToString(o_.q.U(), var17), null, 2, null);
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, 7486309037438123520L, var4);
}

do {
try {
var10000 = var9;
if (var2 >= 0) {
if (var9 != null) {
return;
}

var10000 = var9;
}

if (var10000 == null) {
continue label38;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, 7486309037438123520L, var4);
}
} while (var1 < 0);

return;
}
}

static {
long var5 = a ^ 84212303364222L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[10];
int var12 = 0;
String var11 = "tåÄ\u0096¦$qÑñ\u0001iß5{ÏKÛmz\u0002ìãÊì\u009ax\u0007K\u000e\u0099\u0014VXUP¯\"|\u0015úv\u0099\u00ad\u001c\u00064o\u0006ªûy\b$T.Ó9\u001a\u0099jV±\u0010Á\"r)§\u009eáu]ïÊÝ\u00065mÙq\u00001;fJ\u001e[>\u009b¤\u009e\u0086Q³¶»\u008d\u0018x \u008ef\u0093«\"±\u001a\u009b1¤µ\nX\u009a\u0088\u0094Ò/heÜ\u0010þ×tñ\u0094ÚÓ9U\u008eß:ÔB;^\u0010\u0099\u008cå×Ø¨=óê*à\u008a\u001aÆ\u0016º\u0010¥\u009cÑ|\u0090\u001d\u0082û\u0080Æ^¬D¡\u0001¢\u0010æ\u001e»ÏyAN.<4\u0019:ØC0\u0004\u0010Ùx!KÀ¹Ýßz:'FÜvë\u009e\u0010&äMë4\u001c³\u0092I6«Õ\u0006äh\u008f";
int var13 = "tåÄ\u0096¦$qÑñ\u0001iß5{ÏKÛmz\u0002ìãÊì\u009ax\u0007K\u000e\u0099\u0014VXUP¯\"|\u0015úv\u0099\u00ad\u001c\u00064o\u0006ªûy\b$T.Ó9\u001a\u0099jV±\u0010Á\"r)§\u009eáu]ïÊÝ\u00065mÙq\u00001;fJ\u001e[>\u009b¤\u009e\u0086Q³¶»\u008d\u0018x \u008ef\u0093«\"±\u001a\u009b1¤µ\nX\u009a\u0088\u0094Ò/heÜ\u0010þ×tñ\u0094ÚÓ9U\u008eß:ÔB;^\u0010\u0099\u008cå×Ø¨=óê*à\u008a\u001aÆ\u0016º\u0010¥\u009cÑ|\u0090\u001d\u0082û\u0080Æ^¬D¡\u0001¢\u0010æ\u001e»ÏyAN.<4\u0019:ØC0\u0004\u0010Ùx!KÀ¹Ýßz:'FÜvë\u009e\u0010&äMë4\u001c³\u0092I6«Õ\u0006äh\u008f"
.length();
char var10 = ' ';
int var17 = -1;

label37:
while (true) {
String var18 = var11.substring(++var17, var17 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = b(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var26;
if ((var17 += var10) >= var13) {
c = var14;
h = new String[10];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 1546447882464492332L;
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
m = var30;
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

var11 = "\u008da·UÕÓ>¾à=}:ßÚZ\u000b\u0010¸\u001c'\u0085\bM\u0093ÐtÉ¿\u009d¿n¶ù";
var13 = "\u008da·UÕÓ>¾à=}:ßÚZ\u000b\u0010¸\u001c'\u0085\bM\u0093ÐtÉ¿\u009d¿n¶ù".length();
var10 = 16;
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 516;
if (h[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/o4", var10);
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
h[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return h[var5];
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
throw new RuntimeException("su/catlean/o4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
