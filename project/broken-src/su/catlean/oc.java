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

public final class oc extends o3 {
@NotNull
private final mx v;
@NotNull
private final File a;
public List s;
public y_ J;
private static String I;
private static final long c = yz.a(-173405399289624608L, 2318500442154879409L, MethodHandles.lookup().lookupClass()).a(109920486178251L);
private static final String[] d;
private static final String[] h;
private static final Map i = new HashMap(13);
private static final long[] m;
private static final Integer[] n;
private static final Map o;

public oc(@NotNull Json json, long a, @NotNull mx sharedSource) {
ax = c ^ ax;
long var10001 = ax ^ 56025027228860L;
int var5 = (int)((ax ^ 56025027228860L) >>> 32);
int var6 = (int)((ax ^ 56025027228860L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(json, b<"u">(14760, 6537536497470233620L ^ ax));
Intrinsics.checkNotNullParameter(sharedSource, b<"u">(22884, 414530745612287185L ^ ax));
super(var5, (short)var6, (char)var7, json);
this.v = sharedSource;
this.a = new File(mj.v(), b<"u">(8674, 8896086676631995485L ^ ax));
}

@NotNull
@Override
public File U() {
return this.a;
}

@NotNull
public final List F(long var1) {
var1 = c ^ var1;

try {
if (this.s != null) {
return this.s;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, 6157606737754931983L, var1);
}

Intrinsics.throwUninitializedPropertyAccessException(b<"u">(12192, 7922773202555136186L ^ var1));
return null;
}

public final void d(short a, int a, @NotNull List <set-?>, short a) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ c;
Intrinsics.checkNotNullParameter(<set-?>, b<"u">(21223, 450600083611320755L ^ var5));
this.s = <set-?>;
}

@NotNull
public final y_ i(long var1) {
var1 = c ^ var1;

try {
if (this.J != null) {
return this.J;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, 8253694630579627248L, var1);
}

Intrinsics.throwUninitializedPropertyAccessException(b<"u">(25121, 9082933622789800646L ^ var1));
return null;
}

public final void F(long a, @NotNull y_ <set-?>) {
ax = c ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"u">(21769, 8568483105321737407L ^ ax));
this.J = <set-?>;
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
// 002: ldc2_w 9832626491264
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 131961657424154
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 62475661977279
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 92269267164102
// 019: lxor
// 01a: dup2
// 01b: bipush 48
// 01d: lushr
// 01e: l2i
// 01f: istore 9
// 021: dup2
// 022: bipush 16
// 024: lshl
// 025: bipush 32
// 027: lushr
// 028: l2i
// 029: istore 10
// 02b: dup2
// 02c: bipush 48
// 02e: lshl
// 02f: bipush 48
// 031: lushr
// 032: l2i
// 033: istore 11
// 035: pop2
// 036: dup2
// 037: ldc2_w 91341289963808
// 03a: lxor
// 03b: lstore 12
// 03d: pop2
// 03e: ldc2_w -4979256665557882430
// 041: lload 1
// 042: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: aload 0
// 048: invokevirtual su/catlean/oc.U ()Ljava/io/File;
// 04b: invokevirtual java/io/File.mkdirs ()Z
// 04e: pop
// 04f: aload 0
// 050: astore 32
// 052: astore 14
// 054: nop
// 055: aload 32
// 057: aload 0
// 058: checkcast su/catlean/o3
// 05b: astore 15
// 05d: astore 33
// 05f: bipush 0
// 060: istore 16
// 062: aload 15
// 064: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 067: invokevirtual java/io/File.exists ()Z
// 06a: aload 14
// 06c: ifnonnull 0a6
// 06f: ifeq 0a9
// 072: goto 07f
// 075: ldc2_w -5031027144188056491
// 078: lload 1
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: aload 15
// 081: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 084: aload 14
// 086: ifnonnull 0c5
// 089: goto 096
// 08c: ldc2_w -5031027144188056491
// 08f: lload 1
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: invokevirtual java/io/File.isDirectory ()Z
// 099: goto 0a6
// 09c: ldc2_w -5031027144188056491
// 09f: lload 1
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: ifne 0c0
// 0a9: new java/util/ArrayList
// 0ac: dup
// 0ad: invokespecial java/util/ArrayList.<init> ()V
// 0b0: checkcast java/util/List
// 0b3: goto 27a
// 0b6: ldc2_w -5031027144188056491
// 0b9: lload 1
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: aload 15
// 0c2: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 0c5: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
// 0c8: astore 17
// 0ca: aload 17
// 0cc: aload 14
// 0ce: ifnonnull 0e3
// 0d1: ifnull 26f
// 0d4: goto 0e1
// 0d7: ldc2_w -5031027144188056491
// 0da: lload 1
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: aload 17
// 0e3: astore 18
// 0e5: nop
// 0e6: bipush 0
// 0e7: istore 19
// 0e9: aload 18
// 0eb: astore 20
// 0ed: new java/util/ArrayList
// 0f0: dup
// 0f1: invokespecial java/util/ArrayList.<init> ()V
// 0f4: checkcast java/util/Collection
// 0f7: astore 21
// 0f9: bipush 0
// 0fa: istore 22
// 0fc: bipush 0
// 0fd: istore 23
// 0ff: aload 20
// 101: arraylength
// 102: istore 24
// 104: iload 23
// 106: iload 24
// 108: if_icmpge 185
// 10b: aload 20
// 10d: iload 23
// 10f: aaload
// 110: astore 25
// 112: aload 25
// 114: astore 26
// 116: bipush 0
// 117: istore 27
// 119: aload 26
// 11b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 11e: aload 14
// 120: lload 1
// 121: lconst_0
// 122: lcmp
// 123: iflt 12b
// 126: ifnonnull 26f
// 129: aload 14
// 12b: lload 1
// 12c: lconst_0
// 12d: lcmp
// 12e: ifle 182
// 131: ifnonnull 180
// 134: goto 141
// 137: ldc2_w -5031027144188056491
// 13a: lload 1
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: aload 26
// 143: invokestatic kotlin/io/FilesKt.getExtension (Ljava/io/File;)Ljava/lang/String;
// 146: sipush 4257
// 149: ldc2_w 927455069891803364
// 14c: lload 1
// 14d: lxor
// 14e: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/oc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 156: ifeq 17d
// 159: goto 166
// 15c: ldc2_w -5031027144188056491
// 15f: lload 1
// 160: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: athrow
// 166: aload 21
// 168: aload 25
// 16a: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 16f: pop
// 170: goto 17d
// 173: ldc2_w -5031027144188056491
// 176: lload 1
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: iinc 23 1
// 180: aload 14
// 182: ifnull 104
// 185: aload 21
// 187: checkcast java/util/List
// 18a: nop
// 18b: checkcast java/lang/Iterable
// 18e: astore 19
// 190: nop
// 191: bipush 0
// 192: istore 20
// 194: aload 19
// 196: astore 21
// 198: new java/util/ArrayList
// 19b: dup
// 19c: aload 19
// 19e: sipush 11072
// 1a1: ldc2_w 678493795633757381
// 1a4: lload 1
// 1a5: lxor
// 1a6: invokedynamic e (IJ)I bsm=su/catlean/oc.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 1ae: invokespecial java/util/ArrayList.<init> (I)V
// 1b1: checkcast java/util/Collection
// 1b4: astore 22
// 1b6: bipush 0
// 1b7: istore 23
// 1b9: lload 1
// 1ba: lconst_0
// 1bb: lcmp
// 1bc: ifle 26f
// 1bf: aload 21
// 1c1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1c6: astore 24
// 1c8: aload 24
// 1ca: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1cf: ifeq 245
// 1d2: aload 24
// 1d4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d9: astore 25
// 1db: aload 22
// 1dd: aload 25
// 1df: checkcast java/io/File
// 1e2: astore 26
// 1e4: astore 28
// 1e6: bipush 0
// 1e7: istore 27
// 1e9: aload 15
// 1eb: invokestatic su/catlean/o3.S (Lsu/catlean/o3;)Lkotlinx/serialization/json/Json;
// 1ee: astore 29
// 1f0: aload 26
// 1f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1f5: aload 26
// 1f7: aconst_null
// 1f8: bipush 1
// 1f9: aconst_null
// 1fa: invokestatic kotlin/io/FilesKt.readText$default (Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
// 1fd: astore 30
// 1ff: bipush 0
// 200: istore 31
// 202: aload 29
// 204: aload 29
// 206: invokevirtual kotlinx/serialization/json/Json.getSerializersModule ()Lkotlinx/serialization/modules/SerializersModule;
// 209: pop
// 20a: getstatic su/catlean/y_.v Lsu/catlean/yn;
// 20d: invokevirtual su/catlean/yn.l ()Lkotlinx/serialization/KSerializer;
// 210: checkcast kotlinx/serialization/DeserializationStrategy
// 213: aload 30
// 215: invokevirtual kotlinx/serialization/json/Json.decodeFromString (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
// 218: nop
// 219: aload 28
// 21b: swap
// 21c: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 221: pop
// 222: aload 14
// 224: lload 1
// 225: lconst_0
// 226: lcmp
// 227: iflt 22f
// 22a: ifnonnull 26f
// 22d: aload 14
// 22f: ifnull 1c8
// 232: lload 1
// 233: lconst_0
// 234: lcmp
// 235: iflt 222
// 238: goto 245
// 23b: ldc2_w -5031027144188056491
// 23e: lload 1
// 23f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 244: athrow
// 245: aload 22
// 247: checkcast java/util/List
// 24a: nop
// 24b: checkcast java/util/Collection
// 24e: invokestatic kotlin/collections/CollectionsKt.toMutableList (Ljava/util/Collection;)Ljava/util/List;
// 251: astore 19
// 253: aload 19
// 255: aload 14
// 257: ifnonnull 26c
// 25a: ifnull 26f
// 25d: goto 26a
// 260: ldc2_w -5031027144188056491
// 263: lload 1
// 264: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: athrow
// 26a: aload 19
// 26c: goto 279
// 26f: new java/util/ArrayList
// 272: dup
// 273: invokespecial java/util/ArrayList.<init> ()V
// 276: checkcast java/util/List
// 279: nop
// 27a: aload 33
// 27c: swap
// 27d: astore 15
// 27f: goto 2a7
// 282: astore 16
// 284: aload 32
// 286: invokestatic su/catlean/zf.x ()Lorg/slf4j/Logger;
// 289: sipush 29756
// 28c: ldc2_w 1767695763362897018
// 28f: lload 1
// 290: lxor
// 291: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/oc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
// 29b: new java/util/ArrayList
// 29e: dup
// 29f: invokespecial java/util/ArrayList.<init> ()V
// 2a2: checkcast java/util/List
// 2a5: astore 15
// 2a7: iload 9
// 2a9: i2s
// 2aa: iload 10
// 2ac: aload 15
// 2ae: iload 11
// 2b0: i2s
// 2b1: invokevirtual su/catlean/oc.d (SILjava/util/List;S)V
// 2b4: aload 0
// 2b5: aload 0
// 2b6: lload 3
// 2b7: invokevirtual su/catlean/oc.F (J)Ljava/util/List;
// 2ba: checkcast java/lang/Iterable
// 2bd: astore 16
// 2bf: astore 32
// 2c1: bipush 0
// 2c2: istore 17
// 2c4: aload 16
// 2c6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2cb: astore 18
// 2cd: aload 18
// 2cf: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2d4: ifeq 311
// 2d7: aload 18
// 2d9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2de: astore 19
// 2e0: aload 19
// 2e2: checkcast su/catlean/y_
// 2e5: astore 20
// 2e7: bipush 0
// 2e8: istore 21
// 2ea: aload 20
// 2ec: invokevirtual su/catlean/y_.q ()Ljava/lang/String;
// 2ef: aload 0
// 2f0: getfield su/catlean/oc.v Lsu/catlean/mx;
// 2f3: lload 5
// 2f5: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 2f8: invokevirtual su/catlean/sl.v ()Ljava/lang/String;
// 2fb: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2fe: ifeq 2cd
// 301: aload 19
// 303: lload 1
// 304: lconst_0
// 305: lcmp
// 306: iflt 2de
// 309: aload 14
// 30b: ifnonnull 2e2
// 30e: goto 312
// 311: aconst_null
// 312: aload 32
// 314: swap
// 315: checkcast su/catlean/y_
// 318: aload 14
// 31a: ifnonnull 354
// 31d: dup
// 31e: ifnonnull 370
// 321: goto 32e
// 324: ldc2_w -5031027144188056491
// 327: lload 1
// 328: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32d: athrow
// 32e: pop
// 32f: new su/catlean/y_
// 332: dup
// 333: aload 0
// 334: getfield su/catlean/oc.v Lsu/catlean/mx;
// 337: lload 5
// 339: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 33c: invokevirtual su/catlean/sl.v ()Ljava/lang/String;
// 33f: aconst_null
// 340: bipush 2
// 341: aconst_null
// 342: lload 7
// 344: invokespecial su/catlean/y_.<init> (Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;J)V
// 347: goto 354
// 34a: ldc2_w -5031027144188056491
// 34d: lload 1
// 34e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 353: athrow
// 354: astore 16
// 356: aload 16
// 358: astore 17
// 35a: astore 32
// 35c: bipush 0
// 35d: istore 18
// 35f: aload 0
// 360: lload 3
// 361: invokevirtual su/catlean/oc.F (J)Ljava/util/List;
// 364: aload 17
// 366: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 36b: pop
// 36c: aload 32
// 36e: aload 16
// 370: lload 12
// 372: dup2_x1
// 373: pop2
// 374: invokevirtual su/catlean/oc.F (JLsu/catlean/y_;)V
// 377: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@Override
public void h(int var1, int var2, byte var3) {
long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
long var6 = var4 ^ 29356394894069L;
Iterable var9 = this.F(var6);
boolean var10 = false;
String var10000 = vm.a<"Å">(7463364205943846071L, var4);
Iterator var11 = var9.iterator();
String var8 = var10000;

label38:
while (var11.hasNext()) {
Object var12 = var11.next();
y_ var13 = (y_)var12;
boolean var14 = false;
File var15 = new File(this.U(), var13.q() + b<"u">(10565, 2931328700796198003L ^ var4));
boolean var17 = false;
var15.createNewFile();
File var23 = var15;
Json var21 = this.V();
y_ var16 = var13;
var17 = false;

try {
var21.getSerializersModule();
FilesKt.writeText$default(var23, var21.encodeToString(y_.v.l(), var16), null, 2, null);
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, 7447582922453446944L, var4);
}

do {
try {
var10000 = var8;
if (var1 >= 0) {
if (var8 != null) {
return;
}

var10000 = var8;
}

if (var10000 == null) {
continue label38;
}
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, 7447582922453446944L, var4);
}
} while (var1 <= 0);

return;
}
}

// $VF: Irreducible bytecode was duplicated to produce valid code
public final void a(@NotNull List modules, @NotNull String id, long a) {
ax = c ^ ax;
long var5 = ax ^ 67424876757123L;
long var7 = ax ^ 130206324991283L;
long var9 = ax ^ 137902395502375L;
long var11 = ax ^ 14783181105596L;
long var13 = ax ^ 52368277031776L;
Intrinsics.checkNotNullParameter(modules, b<"u">(12597, 4120173538542294649L ^ ax));
Intrinsics.checkNotNullParameter(id, b<"u">(3466, 8179363553897917134L ^ ax));
String var10000 = vm.a<"Å">(3883534247076341441L, ax);
Iterable var18 = this.F(var5);
boolean var19 = false;
Iterator var20 = var18.iterator();
String var15 = var10000;

label96:
while (true) {
if (!var20.hasNext()) {
var10000 = null;
break;
}

var10000 = (String)var20.next();

while (true) {
Object var21 = var10000;
var10000 = (String)var21;

while (true) {
y_ var22 = (y_)var10000;
boolean var23 = false;
if (!Intrinsics.areEqual(var22.q(), id)) {
continue label96;
}

var10000 = (String)var21;
if (ax < 0L) {
break;
}

if (var15 == null) {
break label96;
}
}
}
}

try {
var51 = (y_)var10000;
if (ax > 0L && (y_)var10000 == null) {
var51 = new y_(id, null, 2, null, var11);
}
} catch (NumberFormatException var42) {
throw vm.a<"Å">(var42, 3831726365610287958L, ax);
}

y_ var16 = var51;
Iterable var17 = modules;
boolean var44 = false;
var var45 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var17, d<"e">(20436, 8954205792953866067L ^ ax)));
boolean var46 = false;
Iterator var47 = var17.iterator();

label75:
while (true) {
if (var47.hasNext()) {
Object var48 = var47.next();
_g var24 = (_g)var48;
ArrayList var38 = var45;
boolean var25 = false;
Iterable var26 = var24.c();
String var27 = var24.U();
boolean var28 = false;
Iterable var29 = var26;
var var30 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var26, d<"e">(11072, 678437298491093958L ^ ax)));
boolean var31 = false;
if (ax <= 0L) {
break;
}

var10000 = var15;

label70:
while (true) {
if (var10000 != null) {
break label75;
}

Iterator var32 = var29.iterator();

while (true) {
if (var32.hasNext()) {
var10000 = (String)var32.next();
} else {
List var39 = var30;
var38.add(new sd(var27, var13, var39));
var10000 = var15;
if (ax >= 0L) {
break label70;
}
}

while (true) {
Object var33 = var10000;
a1 var34 = (a1)var33;
boolean var36 = false;
var30.add(new sh(var34.e(), var34.toString(), var7));
if (var15 != null) {
continue label75;
}

var10000 = var15;
if (ax < 0L) {
continue label70;
}

if (var15 == null) {
break;
}

List var49 = var30;
var38.add(new sd(var27, var13, var49));
var10000 = var15;
if (ax >= 0L) {
break label70;
}
}
}
}

if (var10000 == null) {
continue;
}
}

var16.s(var9, var45);
this.F(var5).removeIf(oc::o);
this.F(var5).add(var16);
if (ax > 0L) {
}
break;
}

try {
if (ax >= 0L && vm.a<"Å">(3838079807830240210L, ax) != null) {
vm.a<"Å">("FPiQQb", 3875694305422377245L, ax);
}
} catch (NumberFormatException var41) {
throw vm.a<"Å">(var41, 3831726365610287958L, ax);
}
}

private static final boolean h(String var0, y_ var1) {
long var2 = c ^ 40835155532906L;
Intrinsics.checkNotNullParameter(var1, b<"u">(19211, 3703422947193398507L ^ var2));
return Intrinsics.areEqual(var1.q(), var0);
}

private static final boolean o(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

public static void j(String var0) {
I = var0;
}

public static String X() {
return I;
}

static {
long var20 = c ^ 30678742887054L;
vm.a<"Å">("vbJRLc", 800701434209133185L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[13];
int var16 = 0;
String var15 = "þ\u00912\u0094aR|©9-\u0083´ô\u001e)\u009ecÉÄ`\u009c\u0088\u0091\u0093q«?ñ\u0011+\u00196\u0010ÏÿªíÅ½À9;mÂZAû¸%X?åÑr\u0001\u008e\u0081Cc\u0097kÉ®q}øðk\u008f\u0087\u0091B\u0092<ïE\u009dÁ\u0013àºÀë\u000e6\u0010\u007fþT½ÇÎ\u00061ò\u0089zGãqY¿\u0011cxk\\UÒRÝÙ!EÖ\tóö¾a\fM?È è7¬Ð\n\u009b\u000fïá¬w,\t\u0010\u0094ó¾ÆÚ¤Ï\u000fÍWÝxË\u0013U°\u00107\u009e\u0091·-Ï¥Ôt\u007fÂÍð<½à\u0010àäN·\rl\u000b$ölpDÓ\u0017\u001a\u001f\u0010\u0018\u009b\u0080\u009eeú;£\u001fÚ\u009dé?¡JE\u0010¼íØètUÊù®f*\u001d}\u0004àô\u0010ï:Ç*\u009d¿·Åf\u0081Fòä\u001f{v\u0010dë©Ñ\u0013\u0081AA×Å*-S¹Éd\u0010\u001c@\u0095Ì|\u0015>\u0097\u00adÞ®U2xèj";
int var17 = "þ\u00912\u0094aR|©9-\u0083´ô\u001e)\u009ecÉÄ`\u009c\u0088\u0091\u0093q«?ñ\u0011+\u00196\u0010ÏÿªíÅ½À9;mÂZAû¸%X?åÑr\u0001\u008e\u0081Cc\u0097kÉ®q}øðk\u008f\u0087\u0091B\u0092<ïE\u009dÁ\u0013àºÀë\u000e6\u0010\u007fþT½ÇÎ\u00061ò\u0089zGãqY¿\u0011cxk\\UÒRÝÙ!EÖ\tóö¾a\fM?È è7¬Ð\n\u009b\u000fïá¬w,\t\u0010\u0094ó¾ÆÚ¤Ï\u000fÍWÝxË\u0013U°\u00107\u009e\u0091·-Ï¥Ôt\u007fÂÍð<½à\u0010àäN·\rl\u000b$ölpDÓ\u0017\u001a\u001f\u0010\u0018\u009b\u0080\u009eeú;£\u001fÚ\u009dé?¡JE\u0010¼íØètUÊù®f*\u001d}\u0004àô\u0010ï:Ç*\u009d¿·Åf\u0081Fòä\u001f{v\u0010dë©Ñ\u0013\u0081AA×Å*-S¹Éd\u0010\u001c@\u0095Ì|\u0015>\u0097\u00adÞ®U2xèj"
.length();
char var14 = ' ';
int var23 = -1;

label45:
while (true) {
String var24 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var33;
if ((var23 += var14) >= var17) {
d = var18;
h = new String[13];
o = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "H\u0083oÁ4\u0014a\u001f~µ_aÕ×M\u000e";
int var5 = "H\u0083oÁ4\u0014a\u001f~µ_aÕ×M\u000e".length();
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
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

m = var6;
n = new Integer[2];
return;
}

var14 = var15.charAt(var23);
break;
default:
var18[var16++] = var33;
if ((var23 += var14) < var17) {
var14 = var15.charAt(var23);
continue label45;
}

var15 = "ì½¨\u001fR\u009b\u008dàk\u00adÀg\bz~*\u0010'¦Eò\u009a\u0003*:äT\u00822Àû#Ç";
var17 = "ì½¨\u001fR\u009b\u008dàk\u00adÀg\bz~*\u0010'¦Eò\u009a\u0003*:äT\u00822Àû#Ç".length();
var14 = 16;
var23 = -1;
}

var24 = var15.substring(++var23, var23 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4949;
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
throw new RuntimeException("su/catlean/oc", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
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
throw new RuntimeException("su/catlean/oc" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27796;
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
throw new RuntimeException("su/catlean/oc", var14);
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
throw new RuntimeException("su/catlean/oc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
