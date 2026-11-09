package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
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

public final class od extends o3 {
@NotNull
private final mx A;
@NotNull
private final File B;
public mh v;
public List R;
private static final long a = yz.a(7294950749699296300L, -9011224739821243123L, MethodHandles.lookup().lookupClass()).a(113526740463639L);
private static final String[] c;
private static final String[] d;
private static final Map h = new HashMap(13);
private static final long i;

public od(@NotNull Json json, long a, @NotNull mx sharedSource) {
ax = a ^ ax;
long var10001 = ax ^ 25989931992274L;
int var5 = (int)((ax ^ 25989931992274L) >>> 32);
int var6 = (int)((ax ^ 25989931992274L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(json, b<"m">(24079, 4967813457087259496L ^ ax));
Intrinsics.checkNotNullParameter(sharedSource, b<"m">(23644, 6434847837270991161L ^ ax));
super(var5, (short)var6, (char)var7, json);
this.A = sharedSource;
this.B = new File(mj.v(), b<"m">(5629, 7090191004775065756L ^ ax));
}

@NotNull
@Override
public File U() {
return this.B;
}

@NotNull
public final mh H(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/od.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 305224229301229336
// 09: lload 1
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 3
// 10: aload 3
// 11: ifnonnull 45
// 14: aload 0
// 15: getfield su/catlean/od.v Lsu/catlean/mh;
// 18: dup
// 19: ifnull 34
// 1c: goto 29
// 1f: ldc2_w 295289444154371828
// 22: lload 1
// 23: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: athrow
// 29: areturn
// 2a: ldc2_w 295289444154371828
// 2d: lload 1
// 2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: athrow
// 34: pop
// 35: sipush 13827
// 38: ldc2_w 5823748663478470693
// 3b: lload 1
// 3c: lxor
// 3d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/od.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
// 45: aconst_null
// 46: areturn
}

public final void m(long a, @NotNull mh <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"m">(26757, 8852366646895449579L ^ ax));
this.v = <set-?>;
}

@NotNull
public final List s(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/od.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w -191634515149558157
// 09: lload 1
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 3
// 10: aload 3
// 11: ifnonnull 44
// 14: aload 0
// 15: getfield su/catlean/od.R Ljava/util/List;
// 18: dup
// 19: ifnull 34
// 1c: goto 29
// 1f: ldc2_w -183971853740042337
// 22: lload 1
// 23: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: athrow
// 29: areturn
// 2a: ldc2_w -183971853740042337
// 2d: lload 1
// 2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: athrow
// 34: pop
// 35: bipush 127
// 37: ldc2_w 5905243560313882419
// 3a: lload 1
// 3b: lxor
// 3c: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/od.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
// 44: aconst_null
// 45: areturn
}

public final void v(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"m">(21507, 3001033825287427130L ^ ax));
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
// 002: ldc2_w 87256153326366
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 479973136051
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 34621155594690
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 17248969305239
// 019: lxor
// 01a: lstore 9
// 01c: dup2
// 01d: ldc2_w 131961657424154
// 020: lxor
// 021: lstore 11
// 023: pop2
// 024: ldc2_w -4979256665557882430
// 027: lload 1
// 028: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: aload 0
// 02e: invokevirtual su/catlean/od.U ()Ljava/io/File;
// 031: invokevirtual java/io/File.mkdirs ()Z
// 034: pop
// 035: astore 13
// 037: aload 0
// 038: astore 31
// 03a: nop
// 03b: aload 31
// 03d: aload 0
// 03e: checkcast su/catlean/o3
// 041: astore 14
// 043: astore 32
// 045: bipush 0
// 046: istore 15
// 048: aload 14
// 04a: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 04d: invokevirtual java/io/File.exists ()Z
// 050: aload 13
// 052: ifnonnull 08c
// 055: ifeq 08f
// 058: goto 065
// 05b: ldc2_w -4989025699214602194
// 05e: lload 1
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: aload 14
// 067: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 06a: aload 13
// 06c: ifnonnull 0ab
// 06f: goto 07c
// 072: ldc2_w -4989025699214602194
// 075: lload 1
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: invokevirtual java/io/File.isDirectory ()Z
// 07f: goto 08c
// 082: ldc2_w -4989025699214602194
// 085: lload 1
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: ifne 0a6
// 08f: new java/util/ArrayList
// 092: dup
// 093: invokespecial java/util/ArrayList.<init> ()V
// 096: checkcast java/util/List
// 099: goto 257
// 09c: ldc2_w -4989025699214602194
// 09f: lload 1
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: aload 14
// 0a8: invokevirtual su/catlean/o3.U ()Ljava/io/File;
// 0ab: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
// 0ae: astore 16
// 0b0: aload 16
// 0b2: aload 13
// 0b4: ifnonnull 0c9
// 0b7: ifnull 24c
// 0ba: goto 0c7
// 0bd: ldc2_w -4989025699214602194
// 0c0: lload 1
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: aload 16
// 0c9: astore 17
// 0cb: nop
// 0cc: bipush 0
// 0cd: istore 18
// 0cf: aload 17
// 0d1: astore 19
// 0d3: new java/util/ArrayList
// 0d6: dup
// 0d7: invokespecial java/util/ArrayList.<init> ()V
// 0da: checkcast java/util/Collection
// 0dd: astore 20
// 0df: bipush 0
// 0e0: istore 21
// 0e2: bipush 0
// 0e3: istore 22
// 0e5: aload 19
// 0e7: arraylength
// 0e8: istore 23
// 0ea: iload 22
// 0ec: iload 23
// 0ee: if_icmpge 16b
// 0f1: aload 19
// 0f3: iload 22
// 0f5: aaload
// 0f6: astore 24
// 0f8: aload 24
// 0fa: astore 25
// 0fc: bipush 0
// 0fd: istore 26
// 0ff: aload 25
// 101: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 104: aload 13
// 106: lload 1
// 107: lconst_0
// 108: lcmp
// 109: ifle 111
// 10c: ifnonnull 24c
// 10f: aload 13
// 111: lload 1
// 112: lconst_0
// 113: lcmp
// 114: iflt 168
// 117: ifnonnull 166
// 11a: goto 127
// 11d: ldc2_w -4989025699214602194
// 120: lload 1
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: aload 25
// 129: invokestatic kotlin/io/FilesKt.getExtension (Ljava/io/File;)Ljava/lang/String;
// 12c: sipush 24892
// 12f: ldc2_w 740127775400600008
// 132: lload 1
// 133: lxor
// 134: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/od.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 13c: ifeq 163
// 13f: goto 14c
// 142: ldc2_w -4989025699214602194
// 145: lload 1
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: aload 20
// 14e: aload 24
// 150: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 155: pop
// 156: goto 163
// 159: ldc2_w -4989025699214602194
// 15c: lload 1
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: iinc 22 1
// 166: aload 13
// 168: ifnull 0ea
// 16b: aload 20
// 16d: checkcast java/util/List
// 170: nop
// 171: checkcast java/lang/Iterable
// 174: astore 18
// 176: nop
// 177: bipush 0
// 178: istore 19
// 17a: aload 18
// 17c: astore 20
// 17e: new java/util/ArrayList
// 181: dup
// 182: aload 18
// 184: getstatic su/catlean/od.i J
// 187: l2i
// 188: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 18b: invokespecial java/util/ArrayList.<init> (I)V
// 18e: checkcast java/util/Collection
// 191: astore 21
// 193: bipush 0
// 194: istore 22
// 196: lload 1
// 197: lconst_0
// 198: lcmp
// 199: ifle 24c
// 19c: aload 20
// 19e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1a3: astore 23
// 1a5: aload 23
// 1a7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1ac: ifeq 222
// 1af: aload 23
// 1b1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1b6: astore 24
// 1b8: aload 21
// 1ba: aload 24
// 1bc: checkcast java/io/File
// 1bf: astore 25
// 1c1: astore 27
// 1c3: bipush 0
// 1c4: istore 26
// 1c6: aload 14
// 1c8: invokestatic su/catlean/o3.S (Lsu/catlean/o3;)Lkotlinx/serialization/json/Json;
// 1cb: astore 28
// 1cd: aload 25
// 1cf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1d2: aload 25
// 1d4: aconst_null
// 1d5: bipush 1
// 1d6: aconst_null
// 1d7: invokestatic kotlin/io/FilesKt.readText$default (Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
// 1da: astore 29
// 1dc: bipush 0
// 1dd: istore 30
// 1df: aload 28
// 1e1: aload 28
// 1e3: invokevirtual kotlinx/serialization/json/Json.getSerializersModule ()Lkotlinx/serialization/modules/SerializersModule;
// 1e6: pop
// 1e7: getstatic su/catlean/mh.F Lsu/catlean/dq;
// 1ea: invokevirtual su/catlean/dq.v ()Lkotlinx/serialization/KSerializer;
// 1ed: checkcast kotlinx/serialization/DeserializationStrategy
// 1f0: aload 29
// 1f2: invokevirtual kotlinx/serialization/json/Json.decodeFromString (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
// 1f5: nop
// 1f6: aload 27
// 1f8: swap
// 1f9: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1fe: pop
// 1ff: aload 13
// 201: lload 1
// 202: lconst_0
// 203: lcmp
// 204: iflt 20c
// 207: ifnonnull 24c
// 20a: aload 13
// 20c: ifnull 1a5
// 20f: lload 1
// 210: lconst_0
// 211: lcmp
// 212: iflt 1ff
// 215: goto 222
// 218: ldc2_w -4989025699214602194
// 21b: lload 1
// 21c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: athrow
// 222: aload 21
// 224: checkcast java/util/List
// 227: nop
// 228: checkcast java/util/Collection
// 22b: invokestatic kotlin/collections/CollectionsKt.toMutableList (Ljava/util/Collection;)Ljava/util/List;
// 22e: astore 18
// 230: aload 18
// 232: aload 13
// 234: ifnonnull 249
// 237: ifnull 24c
// 23a: goto 247
// 23d: ldc2_w -4989025699214602194
// 240: lload 1
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: aload 18
// 249: goto 256
// 24c: new java/util/ArrayList
// 24f: dup
// 250: invokespecial java/util/ArrayList.<init> ()V
// 253: checkcast java/util/List
// 256: nop
// 257: aload 32
// 259: swap
// 25a: astore 14
// 25c: goto 284
// 25f: astore 15
// 261: aload 31
// 263: invokestatic su/catlean/zf.x ()Lorg/slf4j/Logger;
// 266: sipush 21969
// 269: ldc2_w 1265777627767772462
// 26c: lload 1
// 26d: lxor
// 26e: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/od.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
// 278: new java/util/ArrayList
// 27b: dup
// 27c: invokespecial java/util/ArrayList.<init> ()V
// 27f: checkcast java/util/List
// 282: astore 14
// 284: lload 7
// 286: aload 14
// 288: invokevirtual su/catlean/od.v (JLjava/util/List;)V
// 28b: aload 0
// 28c: aload 0
// 28d: lload 5
// 28f: invokevirtual su/catlean/od.s (J)Ljava/util/List;
// 292: checkcast java/lang/Iterable
// 295: astore 15
// 297: astore 31
// 299: bipush 0
// 29a: istore 16
// 29c: aload 15
// 29e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2a3: astore 17
// 2a5: aload 17
// 2a7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2ac: ifeq 2e9
// 2af: aload 17
// 2b1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2b6: astore 18
// 2b8: aload 18
// 2ba: checkcast su/catlean/mh
// 2bd: astore 19
// 2bf: bipush 0
// 2c0: istore 20
// 2c2: aload 19
// 2c4: invokevirtual su/catlean/mh.R ()Ljava/lang/String;
// 2c7: aload 0
// 2c8: getfield su/catlean/od.A Lsu/catlean/mx;
// 2cb: lload 11
// 2cd: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 2d0: invokevirtual su/catlean/sl.x ()Ljava/lang/String;
// 2d3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2d6: ifeq 2a5
// 2d9: aload 18
// 2db: lload 1
// 2dc: lconst_0
// 2dd: lcmp
// 2de: iflt 2b6
// 2e1: aload 13
// 2e3: ifnonnull 2ba
// 2e6: goto 2ea
// 2e9: aconst_null
// 2ea: aload 31
// 2ec: swap
// 2ed: checkcast su/catlean/mh
// 2f0: aload 13
// 2f2: ifnonnull 332
// 2f5: dup
// 2f6: ifnonnull 34f
// 2f9: goto 306
// 2fc: ldc2_w -4989025699214602194
// 2ff: lload 1
// 300: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 305: athrow
// 306: pop
// 307: new su/catlean/mh
// 30a: dup
// 30b: aload 0
// 30c: getfield su/catlean/od.A Lsu/catlean/mx;
// 30f: lload 11
// 311: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 314: invokevirtual su/catlean/sl.x ()Ljava/lang/String;
// 317: new java/util/LinkedHashMap
// 31a: dup
// 31b: invokespecial java/util/LinkedHashMap.<init> ()V
// 31e: checkcast java/util/Map
// 321: lload 3
// 322: invokespecial su/catlean/mh.<init> (Ljava/lang/String;Ljava/util/Map;J)V
// 325: goto 332
// 328: ldc2_w -4989025699214602194
// 32b: lload 1
// 32c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 331: athrow
// 332: astore 15
// 334: aload 15
// 336: astore 16
// 338: astore 31
// 33a: bipush 0
// 33b: istore 17
// 33d: aload 0
// 33e: lload 5
// 340: invokevirtual su/catlean/od.s (J)Ljava/util/List;
// 343: aload 16
// 345: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 34a: pop
// 34b: aload 31
// 34d: aload 15
// 34f: lload 9
// 351: dup2_x1
// 352: pop2
// 353: invokevirtual su/catlean/od.m (JLsu/catlean/mh;)V
// 356: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@Override
public void h(int var1, int var2, byte var3) {
long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
long var6 = var4 ^ 19986762959814L;
String var10000 = vm.a<"Å">(7463364205943846071L, var4);
Iterable var9 = this.s(var6);
String var8 = var10000;
boolean var10 = false;

label38:
for (Object var12 : var9) {
mh var13 = (mh)var12;
boolean var14 = false;
File var15 = new File(this.U(), var13.R() + b<"m">(10192, 8599713368336677456L ^ var4));
boolean var17 = false;
var15.createNewFile();
File var23 = var15;
Json var21 = this.V();
mh var16 = var13;
var17 = false;

try {
var21.getSerializersModule();
FilesKt.writeText$default(var23, var21.encodeToString(mh.F.v(), var16), null, 2, null);
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, 7473294555061423451L, var4);
}

do {
try {
var10000 = var8;
if (var2 > 0) {
if (var8 != null) {
return;
}

var10000 = var8;
}

if (var10000 == null) {
continue label38;
}
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, 7473294555061423451L, var4);
}
} while (var2 < 0);

return;
}
}

static {
long var5 = a ^ 54201803568559L;
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
String var11 = "ú·Í\u0015z7¥«Ó^«õ+\u0013\u0017l\u0010\u0000Êæw1>\u007f\u0016æ\u009c\bÒ*©h\b\u00187J8K\r»\u0000B&@#\u007f/á¨TÕ\u000eJK´¦e½X>ûük\u008d¼TY\u0091}\u009bZ\u00169y\u0016\u008dðþ?Î'åäÕ\u0084Å8 ÉÞ\u001fh¼ØHÓ«$Á\u0096Sÿ\u0091¾î\u000eWz]\u0007ü¶Ì\u00142\u0094\u007fT0\næ=xíQÔIdú/\u0096ùÑ_ôÊ3\u0015Å7¶oy\u009cB;t\u0010H8\u0099ä8\u0016)ÆÉì\u0092 ±}\u009e\u0002\u0010ÀtJïj]ò¾VK\u009eX\u0084oRÕ Fä\u001c{\u0086\u0017VrQ\u0001¨x\u0085¶\u0095Q\u0007}%ÌØ\u001b\u009e¾nÃ\u0087.ä¢}Q\u0010\u001c\u00adËbÇ'¸ªqá-x\u0093±¥\u0084";
int var13 = "ú·Í\u0015z7¥«Ó^«õ+\u0013\u0017l\u0010\u0000Êæw1>\u007f\u0016æ\u009c\bÒ*©h\b\u00187J8K\r»\u0000B&@#\u007f/á¨TÕ\u000eJK´¦e½X>ûük\u008d¼TY\u0091}\u009bZ\u00169y\u0016\u008dðþ?Î'åäÕ\u0084Å8 ÉÞ\u001fh¼ØHÓ«$Á\u0096Sÿ\u0091¾î\u000eWz]\u0007ü¶Ì\u00142\u0094\u007fT0\næ=xíQÔIdú/\u0096ùÑ_ôÊ3\u0015Å7¶oy\u009cB;t\u0010H8\u0099ä8\u0016)ÆÉì\u0092 ±}\u009e\u0002\u0010ÀtJïj]ò¾VK\u009eX\u0084oRÕ Fä\u001c{\u0086\u0017VrQ\u0001¨x\u0085¶\u0095Q\u0007}%ÌØ\u001b\u009e¾nÃ\u0087.ä¢}Q\u0010\u001c\u00adËbÇ'¸ªqá-x\u0093±¥\u0084"
.length();
char var10 = 16;
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
d = new String[10];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 1451443106278557857L;
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
i = var30;
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

var11 = "Z¨tØRÊðA\u0094Þ¦³²/Ño\u00109\u009b¡Ô\u0017ªcç\u009a+QM=¸4»";
var13 = "Z¨tØRÊðA\u0094Þ¦³²/Ño\u00109\u009b¡Ô\u0017ªcç\u009a+QM=¸4»".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31725;
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
throw new RuntimeException("su/catlean/od", var10);
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
throw new RuntimeException("su/catlean/od" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
