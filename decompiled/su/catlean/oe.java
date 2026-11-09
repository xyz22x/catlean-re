package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class oe extends o3 {
@NotNull
private final mx i;
@NotNull
private final File A;
public jn E;
public List r;
private static String[] V;
private static final long a = yz.a(-2121960723099750115L, 1228622568344113646L, MethodHandles.lookup().lookupClass()).a(146311957694098L);
private static final String[] c;
private static final String[] d;
private static final Map h = new HashMap(13);
private static final long[] m;
private static final Integer[] n;
private static final Map o;

public oe(char a, @NotNull Json json, int a, short a, @NotNull mx sharedSource) {
long var6 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var10001 = var6 ^ 75309697505251L;
int var8 = (int)((var6 ^ 75309697505251L) >>> 32);
int var9 = (int)((var6 ^ 75309697505251L) << 32 >>> 48);
int var10 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(json, b<"n">(24151, 3752514497001220329L ^ var6));
Intrinsics.checkNotNullParameter(sharedSource, b<"n">(32152, 2888416035141503790L ^ var6));
super(var8, (short)var9, (char)var10, json);
this.i = sharedSource;
this.A = new File(mj.v(), b<"n">(12081, 7193043355343460736L ^ var6));
}

@NotNull
@Override
public File U() {
return this.A;
}

@NotNull
public final jn n(long var1) {
var1 = a ^ var1;

try {
if (this.E != null) {
return this.E;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, 6935571002737522472L, var1);
}

Intrinsics.throwUninitializedPropertyAccessException(b<"n">(7861, 1276177270542834936L ^ var1));
return null;
}

public final void A(long a, @NotNull jn <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"n">(20679, 4954144263578893310L ^ ax));
this.E = <set-?>;
}

@NotNull
public final List K(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;

try {
if (this.r != null) {
return this.r;
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 5350016243378117975L, var4);
}

Intrinsics.throwUninitializedPropertyAccessException(b<"n">(886, 203079720869997376L ^ var4));
return null;
}

public final void H(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"n">(10415, 3769592400345057707L ^ ax));
this.r = <set-?>;
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
// 002: ldc2_w 93109896899108
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 35176628724501
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 6
// 01d: dup2
// 01e: bipush 48
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 7
// 027: pop2
// 028: dup2
// 029: ldc2_w 57321926096347
// 02c: lxor
// 02d: dup2
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 8
// 034: dup2
// 035: bipush 32
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 9
// 03e: dup2
// 03f: bipush 48
// 041: lshl
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 10
// 048: pop2
// 049: dup2
// 04a: ldc2_w 131961657424154
// 04d: lxor
// 04e: lstore 11
// 050: dup2
// 051: ldc2_w 38802389819421
// 054: lxor
// 055: lstore 13
// 057: pop2
// 058: ldc2_w -4979256665557882430
// 05b: lload 1
// 05c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: aload 0
// 062: invokevirtual su/catlean/oe.U ()Ljava/io/File;
// 065: invokevirtual java/io/File.mkdirs ()Z
// 068: pop
// 069: astore 15
// 06b: aload 0
// 06c: astore 33
// 06e: nop
// 06f: aload 33
// 071: aload 0
// 072: checkcast su/catlean/o3
// 075: astore 16
// 077: astore 34
// 079: bipush 0
// 07a: istore 17
// 07c: aload 16
// 07e: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 081: invokevirtual java/io/File.exists ()Z
// 084: aload 15
// 086: ifnonnull 0c0
// 089: ifeq 0c3
// 08c: goto 099
// 08f: ldc2_w -5038291470603735684
// 092: lload 1
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: aload 16
// 09b: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 09e: aload 15
// 0a0: ifnonnull 0df
// 0a3: goto 0b0
// 0a6: ldc2_w -5038291470603735684
// 0a9: lload 1
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: invokevirtual java/io/File.isDirectory ()Z
// 0b3: goto 0c0
// 0b6: ldc2_w -5038291470603735684
// 0b9: lload 1
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: ifne 0da
// 0c3: new java/util/ArrayList
// 0c6: dup
// 0c7: invokespecial java/util/ArrayList.<init> ()V
// 0ca: checkcast java/util/List
// 0cd: goto 294
// 0d0: ldc2_w -5038291470603735684
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: aload 16
// 0dc: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 0df: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
// 0e2: astore 18
// 0e4: aload 18
// 0e6: aload 15
// 0e8: ifnonnull 0fd
// 0eb: ifnull 289
// 0ee: goto 0fb
// 0f1: ldc2_w -5038291470603735684
// 0f4: lload 1
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: aload 18
// 0fd: astore 19
// 0ff: nop
// 100: bipush 0
// 101: istore 20
// 103: aload 19
// 105: astore 21
// 107: new java/util/ArrayList
// 10a: dup
// 10b: invokespecial java/util/ArrayList.<init> ()V
// 10e: checkcast java/util/Collection
// 111: astore 22
// 113: bipush 0
// 114: istore 23
// 116: bipush 0
// 117: istore 24
// 119: aload 21
// 11b: arraylength
// 11c: istore 25
// 11e: iload 24
// 120: iload 25
// 122: if_icmpge 19f
// 125: aload 21
// 127: iload 24
// 129: aaload
// 12a: astore 26
// 12c: aload 26
// 12e: astore 27
// 130: bipush 0
// 131: istore 28
// 133: aload 27
// 135: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 138: aload 15
// 13a: lload 1
// 13b: lconst_0
// 13c: lcmp
// 13d: ifle 145
// 140: ifnonnull 289
// 143: aload 15
// 145: lload 1
// 146: lconst_0
// 147: lcmp
// 148: iflt 19c
// 14b: ifnonnull 19a
// 14e: goto 15b
// 151: ldc2_w -5038291470603735684
// 154: lload 1
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: aload 27
// 15d: invokestatic kotlin/io/FilesKt.getExtension (Ljava/io/File;)Ljava/lang/String;
// 160: sipush 23232
// 163: ldc2_w 7032325590185083601
// 166: lload 1
// 167: lxor
// 168: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/oe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 170: ifeq 197
// 173: goto 180
// 176: ldc2_w -5038291470603735684
// 179: lload 1
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: aload 22
// 182: aload 26
// 184: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 189: pop
// 18a: goto 197
// 18d: ldc2_w -5038291470603735684
// 190: lload 1
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: iinc 24 1
// 19a: aload 15
// 19c: ifnull 11e
// 19f: aload 22
// 1a1: checkcast java/util/List
// 1a4: nop
// 1a5: checkcast java/lang/Iterable
// 1a8: astore 20
// 1aa: nop
// 1ab: bipush 0
// 1ac: istore 21
// 1ae: aload 20
// 1b0: astore 22
// 1b2: new java/util/ArrayList
// 1b5: dup
// 1b6: aload 20
// 1b8: sipush 32007
// 1bb: ldc2_w 363162311574767080
// 1be: lload 1
// 1bf: lxor
// 1c0: invokedynamic k (IJ)I bsm=su/catlean/oe.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 1c8: invokespecial java/util/ArrayList.<init> (I)V
// 1cb: checkcast java/util/Collection
// 1ce: astore 23
// 1d0: bipush 0
// 1d1: istore 24
// 1d3: lload 1
// 1d4: lconst_0
// 1d5: lcmp
// 1d6: iflt 289
// 1d9: aload 22
// 1db: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1e0: astore 25
// 1e2: aload 25
// 1e4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1e9: ifeq 25f
// 1ec: aload 25
// 1ee: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1f3: astore 26
// 1f5: aload 23
// 1f7: aload 26
// 1f9: checkcast java/io/File
// 1fc: astore 27
// 1fe: astore 29
// 200: bipush 0
// 201: istore 28
// 203: aload 16
// 205: invokestatic su/catlean/o3.S (Lsu/catlean/o3;)Lkotlinx/serialization/json/Json;
// 208: astore 30
// 20a: aload 27
// 20c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 20f: aload 27
// 211: aconst_null
// 212: bipush 1
// 213: aconst_null
// 214: invokestatic kotlin/io/FilesKt.readText$default (Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
// 217: astore 31
// 219: bipush 0
// 21a: istore 32
// 21c: aload 30
// 21e: aload 30
// 220: invokevirtual kotlinx/serialization/json/Json.getSerializersModule ()Lkotlinx/serialization/modules/SerializersModule;
// 223: pop
// 224: getstatic su/catlean/jn.U Lsu/catlean/g;
// 227: invokevirtual su/catlean/g.J ()Lkotlinx/serialization/KSerializer;
// 22a: checkcast kotlinx/serialization/DeserializationStrategy
// 22d: aload 31
// 22f: invokevirtual kotlinx/serialization/json/Json.decodeFromString (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
// 232: nop
// 233: aload 29
// 235: swap
// 236: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 23b: pop
// 23c: aload 15
// 23e: lload 1
// 23f: lconst_0
// 240: lcmp
// 241: ifle 249
// 244: ifnonnull 289
// 247: aload 15
// 249: ifnull 1e2
// 24c: lload 1
// 24d: lconst_0
// 24e: lcmp
// 24f: iflt 23c
// 252: goto 25f
// 255: ldc2_w -5038291470603735684
// 258: lload 1
// 259: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25e: athrow
// 25f: aload 23
// 261: checkcast java/util/List
// 264: nop
// 265: checkcast java/util/Collection
// 268: invokestatic kotlin/collections/CollectionsKt.toMutableList (Ljava/util/Collection;)Ljava/util/List;
// 26b: astore 20
// 26d: aload 20
// 26f: aload 15
// 271: ifnonnull 286
// 274: ifnull 289
// 277: goto 284
// 27a: ldc2_w -5038291470603735684
// 27d: lload 1
// 27e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: athrow
// 284: aload 20
// 286: goto 293
// 289: new java/util/ArrayList
// 28c: dup
// 28d: invokespecial java/util/ArrayList.<init> ()V
// 290: checkcast java/util/List
// 293: nop
// 294: aload 34
// 296: swap
// 297: astore 16
// 299: goto 2c1
// 29c: astore 17
// 29e: aload 33
// 2a0: invokestatic su/catlean/zf.x ()Lorg/slf4j/Logger;
// 2a3: sipush 1572
// 2a6: ldc2_w 4936640350941666871
// 2a9: lload 1
// 2aa: lxor
// 2ab: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/oe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
// 2b5: new java/util/ArrayList
// 2b8: dup
// 2b9: invokespecial java/util/ArrayList.<init> ()V
// 2bc: checkcast java/util/List
// 2bf: astore 16
// 2c1: lload 3
// 2c2: aload 16
// 2c4: invokevirtual su/catlean/oe.H (JLjava/util/List;)V
// 2c7: aload 0
// 2c8: aload 0
// 2c9: iload 5
// 2cb: iload 6
// 2cd: i2c
// 2ce: iload 7
// 2d0: invokevirtual su/catlean/oe.K (ICI)Ljava/util/List;
// 2d3: checkcast java/lang/Iterable
// 2d6: astore 17
// 2d8: astore 33
// 2da: bipush 0
// 2db: istore 18
// 2dd: aload 17
// 2df: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2e4: astore 19
// 2e6: aload 19
// 2e8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2ed: ifeq 32a
// 2f0: aload 19
// 2f2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2f7: astore 20
// 2f9: aload 20
// 2fb: checkcast su/catlean/jn
// 2fe: astore 21
// 300: bipush 0
// 301: istore 22
// 303: aload 21
// 305: invokevirtual su/catlean/jn.w ()Ljava/lang/String;
// 308: aload 0
// 309: getfield su/catlean/oe.i Lsu/catlean/mx;
// 30c: lload 11
// 30e: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 311: invokevirtual su/catlean/sl.a ()Ljava/lang/String;
// 314: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 317: ifeq 2e6
// 31a: aload 20
// 31c: lload 1
// 31d: lconst_0
// 31e: lcmp
// 31f: ifle 2f7
// 322: aload 15
// 324: ifnonnull 2fb
// 327: goto 32b
// 32a: aconst_null
// 32b: aload 33
// 32d: swap
// 32e: checkcast su/catlean/jn
// 331: aload 15
// 333: ifnonnull 373
// 336: dup
// 337: ifnonnull 395
// 33a: goto 347
// 33d: ldc2_w -5038291470603735684
// 340: lload 1
// 341: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 346: athrow
// 347: pop
// 348: new su/catlean/jn
// 34b: dup
// 34c: aload 0
// 34d: getfield su/catlean/oe.i Lsu/catlean/mx;
// 350: lload 11
// 352: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 355: invokevirtual su/catlean/sl.a ()Ljava/lang/String;
// 358: aconst_null
// 359: bipush 2
// 35a: iload 8
// 35c: iload 9
// 35e: i2s
// 35f: aconst_null
// 360: iload 10
// 362: i2s
// 363: invokespecial su/catlean/jn.<init> (Ljava/lang/String;Ljava/util/List;IISLkotlin/jvm/internal/DefaultConstructorMarker;S)V
// 366: goto 373
// 369: ldc2_w -5038291470603735684
// 36c: lload 1
// 36d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: athrow
// 373: astore 17
// 375: aload 17
// 377: astore 18
// 379: astore 33
// 37b: bipush 0
// 37c: istore 19
// 37e: aload 0
// 37f: iload 5
// 381: iload 6
// 383: i2c
// 384: iload 7
// 386: invokevirtual su/catlean/oe.K (ICI)Ljava/util/List;
// 389: aload 18
// 38b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 390: pop
// 391: aload 33
// 393: aload 17
// 395: lload 13
// 397: dup2_x1
// 398: pop2
// 399: invokevirtual su/catlean/oe.A (JLsu/catlean/jn;)V
// 39c: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@Override
public void h(int var1, int var2, byte var3) {
long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
long var10001 = var4 ^ 15103071977056L;
int var6 = (int)((var4 ^ 15103071977056L) >>> 32);
int var7 = (int)((var4 ^ 15103071977056L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
String var10000 = vm.a<"Å">(7463364205943846071L, var4);
Iterable var10 = this.K(var6, (char)var7, var8);
String var9 = var10000;
boolean var11 = false;

label38:
for (Object var13 : var10) {
jn var14 = (jn)var13;
boolean var15 = false;
File var16 = new File(this.U(), var14.w() + b<"n">(20741, 8782746056624395371L ^ var4));
boolean var18 = false;
var16.createNewFile();
File var24 = var16;
Json var22 = this.V();
jn var17 = var14;
var18 = false;

try {
var22.getSerializersModule();
FilesKt.writeText$default(var24, var22.encodeToString(jn.U.J(), var17), null, 2, null);
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, 7449365944779960329L, var4);
}

do {
try {
var10000 = var9;
if (var2 > 0) {
if (var9 != null) {
return;
}

var10000 = var9;
}

if (var10000 == null) {
continue label38;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, 7449365944779960329L, var4);
}
} while (var2 < 0);

return;
}
}

// $VF: Irreducible bytecode was duplicated to produce valid code
public final void V(@NotNull List widgets, long a, @NotNull String id) {
ax = a ^ ax;
long var10001 = ax ^ 114587915855431L;
int var5 = (int)((ax ^ 114587915855431L) >>> 32);
int var6 = (int)((ax ^ 114587915855431L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
var10001 = ax ^ 74680547045513L;
int var8 = (int)((ax ^ 74680547045513L) >>> 32);
int var9 = (int)((ax ^ 74680547045513L) << 32 >>> 48);
int var10 = (int)(var10001 << 48 >>> 48);
int var11 = (int)((ax ^ 135109890496986L) >>> 56);
long var12 = (ax ^ 135109890496986L) << 8 >>> 8;
long var14 = ax ^ 57202088783714L;
long var16 = ax ^ 120716819022129L;
String var10000 = vm.a<"Å">(4590390368077196432L, ax);
Intrinsics.checkNotNullParameter(widgets, b<"n">(18561, 6147238956321740229L ^ ax));
String var18 = var10000;
Intrinsics.checkNotNullParameter(id, b<"n">(7881, 7975412382528848777L ^ ax));
Iterable var21 = this.K(var5, (char)var6, var7);
boolean var22 = false;
Iterator var23 = var21.iterator();

label83:
while (true) {
if (!var23.hasNext()) {
var10000 = null;
break;
}

var10000 = (String)var23.next();

while (true) {
Object var24 = var10000;
var10000 = (String)var24;

while (true) {
jn var25 = (jn)var10000;
boolean var26 = false;
if (!Intrinsics.areEqual(var25.w(), id)) {
continue label83;
}

var10000 = (String)var24;
if (ax < 0L) {
break;
}

if (var18 == null) {
break label83;
}
}
}
}

try {
var53 = (jn)var10000;
if (ax > 0L && (jn)var10000 == null) {
var53 = new jn(id, null, 2, var8, (short)var9, null, (short)var10);
}
} catch (NumberFormatException var44) {
throw vm.a<"Å">(var44, 4559352908649867310L, ax);
}

jn var19 = var53;
Iterable var20 = widgets;
boolean var46 = false;
var var47 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var20, d<"k">(4271, 9085957141147921683L ^ ax)));
boolean var48 = false;
Iterator var49 = var20.iterator();

label62:
while (true) {
if (var49.hasNext()) {
Object var50 = var49.next();
gf var27 = (gf)var50;
ArrayList var41 = var47;
boolean var28 = false;
Iterable var29 = var27.c();
String var30 = var27.I();
boolean var31 = false;
Iterable var32 = var29;
var var33 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var29, d<"k">(4271, 9085957141147921683L ^ ax)));
boolean var34 = false;
var10000 = var18;

label57:
while (true) {
if (var10000 != null) {
return;
}

Iterator var35 = var32.iterator();

while (true) {
if (var35.hasNext()) {
var10000 = (String)var35.next();
} else {
List var42 = var33;
var41.add(new sd(var30, var16, var42));
var10000 = var18;
if (ax > 0L) {
break label57;
}
}

while (true) {
Object var36 = var10000;
a1 var37 = (a1)var36;
boolean var39 = false;
var33.add(new sh(var37.e(), var37.toString(), var14));
if (var18 != null) {
continue label62;
}

var10000 = var18;
if (ax <= 0L) {
continue label57;
}

if (var18 == null) {
break;
}

List var51 = var33;
var41.add(new sd(var30, var16, var51));
var10000 = var18;
if (ax > 0L) {
break label57;
}
}
}
}

if (var10000 == null) {
continue;
}
}

var19.L(var47, (byte)var11, var12);
this.K(var5, (char)var6, var7).removeIf(oe::Z);
this.K(var5, (char)var6, var7).add(var19);
if (ax >= 0L) {
}
break;
}
}

private static final boolean x(String var0, jn var1) {
long var2 = a ^ 135660907667900L;
Intrinsics.checkNotNullParameter(var1, b<"n">(28120, 5456164594512657495L ^ var2));
return Intrinsics.areEqual(var1.w(), var0);
}

private static final boolean Z(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

public static void Q(String[] var0) {
V = var0;
}

public static String[] X() {
return V;
}

static {
long var20 = a ^ 85593917996963L;
String[] var10000 = new String[2];
vm.a<"Å">(var10000, -1301942896624354949L, var20);
Cipher var11;
Cipher var24 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var24.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[13];
int var16 = 0;
String var15 = "y\u009av\u0083\u008bÂB¦ÜÎï\u001fu¶6\u001b\u0010O=O°\t÷=\u008cÃd\u0007¹ÃIñ\u0017 \u0099æo{!j\u0098>k¯õW¿¾\\ýa°K\u001c2h¬bëÎFd¹Ù¸\u0017\u0010>þà\u008e\u0088ûô\bÞ\n=ÛKÝêø\u0010Tè¤xÖÅF¢ù:4C\u0092/n\u000e\u0010\u0088/\u00192ë¨àX%\u009fù\u0019Îéh\u000e\u0010+`>L¸k<\u0091\u0087«×2ÿ?Û/\u0010öú\u008eÜ\u0004¥î6Ö\u0006Æ¯¸æ¡®\u0010\nE>ììÏ2\f\u0099{ß¤¹¹¬tX\u00ad\u0099Ô\u0084\u001eÆ\u000fc\u0016u}Ó³òauôî\u008cBï}Ë¢º9\u0095LGçØÞ\u0001ñ\u0096;¾wZ)\u001d7\u008f\u009eÓ%R.?e\u0092¢ÚÞÇ\u008a\u008a\u0000AG\u001emE@Ý@\u00140xO\u0014¹Å X)ª_Å/\u0002\u00048\u0095'÷\u00031\u0010Õr\u009fÑÂ¼|/u\\\u000fdÑ©\tÿ";
int var17 = "y\u009av\u0083\u008bÂB¦ÜÎï\u001fu¶6\u001b\u0010O=O°\t÷=\u008cÃd\u0007¹ÃIñ\u0017 \u0099æo{!j\u0098>k¯õW¿¾\\ýa°K\u001c2h¬bëÎFd¹Ù¸\u0017\u0010>þà\u008e\u0088ûô\bÞ\n=ÛKÝêø\u0010Tè¤xÖÅF¢ù:4C\u0092/n\u000e\u0010\u0088/\u00192ë¨àX%\u009fù\u0019Îéh\u000e\u0010+`>L¸k<\u0091\u0087«×2ÿ?Û/\u0010öú\u008eÜ\u0004¥î6Ö\u0006Æ¯¸æ¡®\u0010\nE>ììÏ2\f\u0099{ß¤¹¹¬tX\u00ad\u0099Ô\u0084\u001eÆ\u000fc\u0016u}Ó³òauôî\u008cBï}Ë¢º9\u0095LGçØÞ\u0001ñ\u0096;¾wZ)\u001d7\u008f\u009eÓ%R.?e\u0092¢ÚÞÇ\u008a\u008a\u0000AG\u001emE@Ý@\u00140xO\u0014¹Å X)ª_Å/\u0002\u00048\u0095'÷\u00031\u0010Õr\u009fÑÂ¼|/u\\\u000fdÑ©\tÿ"
.length();
char var14 = 16;
int var23 = -1;

label45:
while (true) {
String var25 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var34 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var34;
if ((var23 += var14) >= var17) {
c = var18;
d = new String[13];
o = new HashMap(13);
Cipher var0;
Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var27.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "\u0017\u0092\u009dÆýg\u0097\u008cð~\u0004¹ÅÏ\u0090g";
int var5 = "\u0017\u0092\u009dÆýg\u0097\u008cð~\u0004¹ÅÏ\u0090g".length();
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
byte var39 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

m = var6;
n = new Integer[2];
return;
}

var14 = var15.charAt(var23);
break;
default:
var18[var16++] = var34;
if ((var23 += var14) < var17) {
var14 = var15.charAt(var23);
continue label45;
}

var15 = "ö\u0098¿î\u0007`¶\u0095\u0015Ä¡¯îW&'\u0010\tÔ\u0099¾\u0094ýý\u0093¶«3Ù4Gé¾";
var17 = "ö\u0098¿î\u0007`¶\u0095\u0015Ä¡¯îW&'\u0010\tÔ\u0099¾\u0094ýý\u0093¶«3Ù4Gé¾".length();
var14 = 16;
var23 = -1;
}

var25 = var15.substring(++var23, var23 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25355;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/oe", var10);
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
throw new RuntimeException("su/catlean/oe" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 1023;
if (n[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = m[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])o.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
o.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/oe", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
n[var3] = var15;
}

return n[var3];
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
throw new RuntimeException("su/catlean/oe" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
