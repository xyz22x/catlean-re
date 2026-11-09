package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class nm extends n9 {
private final Selector M;
private final SocketChannel F;
@Nullable
private b2 W;
@Nullable
private Integer e;
@Nullable
private ByteBuffer f;
private final ByteBuffer h;
private static final long b = yz.a(-651979460711318947L, 3281717415083968930L, MethodHandles.lookup().lookupClass()).a(95314683144214L);
private static final String[] i;
private static final String[] j;
private static final Map k = new HashMap(13);
private static final long m;

public nm(@NotNull String name, long a) {
a = b ^ a;
Intrinsics.checkNotNullParameter(name, b<"f">(28446, 4070149813632478835L ^ a));
super();
boolean var10000 = vm.a<"Å">(-1606936794379522032L, a);
this.M = Selector.open();
this.F = SocketChannel.open(UnixDomainSocketAddress.of(name));
this.h = ByteBuffer.allocate(4);
boolean var4 = var10000;

try {
this.F.configureBlocking(false);
this.F.register(this.M, 1);
ThreadsKt.thread$default(true, false, null, b<"f">(1603, 1412147378877122345L ^ a), 0, nm::q, (int)m, null);
if (!var4) {
vm.a<"Å">(new _g[3], -1607073002967473265L, a);
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -1639208898693828165L, a);
}
}

private final void P(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/nm.b J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 5914691694892604220
// 09: lload 1
// 0a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 0
// 10: astore 4
// 12: istore 3
// 13: nop
// 14: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
// 17: pop
// 18: aload 4
// 1a: checkcast su/catlean/nm
// 1d: astore 5
// 1f: bipush 0
// 20: istore 6
// 22: aload 5
// 24: getfield su/catlean/nm.M Ljava/nio/channels/Selector;
// 27: invokevirtual java/nio/channels/Selector.select ()I
// 2a: ifle 68
// 2d: aload 5
// 2f: getfield su/catlean/nm.M Ljava/nio/channels/Selector;
// 32: invokevirtual java/nio/channels/Selector.selectedKeys ()Ljava/util/Set;
// 35: aload 5
// 37: invokedynamic invoke (Lsu/catlean/nm;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/nm.k (Lsu/catlean/nm;Ljava/nio/channels/SelectionKey;)Z, (Ljava/nio/channels/SelectionKey;)Ljava/lang/Boolean; ]
// 3c: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/nm.z (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 41: invokeinterface java/util/Set.removeIf (Ljava/util/function/Predicate;)Z 2
// 46: pop
// 47: iload 3
// 48: lload 1
// 49: lconst_0
// 4a: lcmp
// 4b: iflt 52
// 4e: ifne 71
// 51: iload 3
// 52: ifeq 22
// 55: lload 1
// 56: lconst_0
// 57: lcmp
// 58: ifle 47
// 5b: goto 68
// 5e: ldc2_w 5978094776628562445
// 61: lload 1
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: nop
// 69: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 6c: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
// 6f: astore 5
// 71: goto 84
// 74: astore 6
// 76: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
// 79: pop
// 7a: aload 6
// 7c: invokestatic kotlin/ResultKt.createFailure (Ljava/lang/Throwable;)Ljava/lang/Object;
// 7f: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
// 82: astore 5
// 84: return
}

@Override
protected void P(long a, @NotNull ByteBuffer buffer) {
Intrinsics.checkNotNullParameter(buffer, b<"f">(25520, 6788748264161835259L ^ a));
nm var4 = this;

try {
nm var8 = var4;
boolean var6 = false;
var8 = (nm)Result.constructor-impl(var8.F.write(buffer));
} catch (Throwable var7) {
Object var5 = Result.constructor-impl(ResultKt.createFailure(var7));
}
}

@Override
public void Q() {
nm var1 = this;

try {
nm var5 = var1;
boolean var3 = false;
var5.F.close();
var5.M.close();
var5 = (nm)Result.constructor-impl(Unit.INSTANCE);
} catch (Throwable var4) {
Object var2 = Result.constructor-impl(ResultKt.createFailure(var4));
}
}

private final gk y(ReadableByteChannel param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/nm.b J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 99428935292475
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: dup2
// 01e: bipush 48
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 6
// 027: pop2
// 028: dup2
// 029: ldc2_w 132417311904855
// 02c: lxor
// 02d: dup2
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 7
// 034: dup2
// 035: bipush 16
// 037: lshl
// 038: bipush 32
// 03a: lushr
// 03b: l2i
// 03c: istore 8
// 03e: dup2
// 03f: bipush 48
// 041: lshl
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 9
// 048: pop2
// 049: pop2
// 04a: ldc2_w -1347335036985477906
// 04d: lload 2
// 04e: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: istore 12
// 055: aload 0
// 056: iload 12
// 058: ifeq 0d2
// 05b: getfield su/catlean/nm.W Lsu/catlean/b2;
// 05e: ifnonnull 0d1
// 061: goto 06e
// 064: ldc2_w -1315593550708345531
// 067: lload 2
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: aload 0
// 06f: lload 2
// 070: lconst_0
// 071: lcmp
// 072: ifle 0ca
// 075: aload 1
// 076: iload 12
// 078: ifeq 0c3
// 07b: goto 088
// 07e: ldc2_w -1315593550708345531
// 081: lload 2
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: iload 7
// 08a: i2c
// 08b: iload 8
// 08d: iload 9
// 08f: invokespecial su/catlean/nm.d (Ljava/nio/channels/ReadableByteChannel;CII)Z
// 092: ifne 0ae
// 095: goto 0a2
// 098: ldc2_w -1315593550708345531
// 09b: lload 2
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: aconst_null
// 0a3: areturn
// 0a4: ldc2_w -1315593550708345531
// 0a7: lload 2
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: aload 0
// 0af: invokestatic su/catlean/b2.w ()Lkotlin/enums/EnumEntries;
// 0b2: checkcast java/util/List
// 0b5: aload 0
// 0b6: getfield su/catlean/nm.h Ljava/nio/ByteBuffer;
// 0b9: bipush 0
// 0ba: invokevirtual java/nio/ByteBuffer.getInt (I)I
// 0bd: invokestatic su/catlean/jw.c (I)I
// 0c0: invokestatic kotlin/collections/CollectionsKt.getOrNull (Ljava/util/List;I)Ljava/lang/Object;
// 0c3: checkcast su/catlean/b2
// 0c6: putfield su/catlean/nm.W Lsu/catlean/b2;
// 0c9: aload 0
// 0ca: getfield su/catlean/nm.h Ljava/nio/ByteBuffer;
// 0cd: invokevirtual java/nio/ByteBuffer.clear ()Ljava/nio/ByteBuffer;
// 0d0: pop
// 0d1: aload 0
// 0d2: lload 2
// 0d3: lconst_0
// 0d4: lcmp
// 0d5: iflt 16c
// 0d8: iload 12
// 0da: ifeq 16c
// 0dd: getfield su/catlean/nm.e Ljava/lang/Integer;
// 0e0: ifnonnull 15c
// 0e3: goto 0f0
// 0e6: ldc2_w -1315593550708345531
// 0e9: lload 2
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: aload 0
// 0f1: iload 12
// 0f3: ifeq 155
// 0f6: goto 103
// 0f9: ldc2_w -1315593550708345531
// 0fc: lload 2
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: lload 2
// 104: lconst_0
// 105: lcmp
// 106: iflt 143
// 109: aload 1
// 10a: iload 7
// 10c: i2c
// 10d: iload 8
// 10f: iload 9
// 111: invokespecial su/catlean/nm.d (Ljava/nio/channels/ReadableByteChannel;CII)Z
// 114: ifne 130
// 117: goto 124
// 11a: ldc2_w -1315593550708345531
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: aconst_null
// 125: areturn
// 126: ldc2_w -1315593550708345531
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: aload 0
// 131: aload 0
// 132: getfield su/catlean/nm.h Ljava/nio/ByteBuffer;
// 135: bipush 0
// 136: invokevirtual java/nio/ByteBuffer.getInt (I)I
// 139: invokestatic su/catlean/jw.c (I)I
// 13c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 13f: putfield su/catlean/nm.e Ljava/lang/Integer;
// 142: aload 0
// 143: aload 0
// 144: getfield su/catlean/nm.e Ljava/lang/Integer;
// 147: dup
// 148: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 14b: invokevirtual java/lang/Integer.intValue ()I
// 14e: invokestatic java/nio/ByteBuffer.allocate (I)Ljava/nio/ByteBuffer;
// 151: putfield su/catlean/nm.f Ljava/nio/ByteBuffer;
// 154: aload 0
// 155: getfield su/catlean/nm.h Ljava/nio/ByteBuffer;
// 158: invokevirtual java/nio/ByteBuffer.clear ()Ljava/nio/ByteBuffer;
// 15b: pop
// 15c: aload 1
// 15d: aload 0
// 15e: getfield su/catlean/nm.f Ljava/nio/ByteBuffer;
// 161: dup
// 162: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 165: invokeinterface java/nio/channels/ReadableByteChannel.read (Ljava/nio/ByteBuffer;)I 2
// 16a: pop
// 16b: aload 0
// 16c: getfield su/catlean/nm.f Ljava/nio/ByteBuffer;
// 16f: dup
// 170: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 173: iload 12
// 175: lload 2
// 176: lconst_0
// 177: lcmp
// 178: iflt 1a3
// 17b: ifeq 1a1
// 17e: invokevirtual java/nio/ByteBuffer.hasRemaining ()Z
// 181: ifeq 19d
// 184: goto 191
// 187: ldc2_w -1315593550708345531
// 18a: lload 2
// 18b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: athrow
// 191: aconst_null
// 192: areturn
// 193: ldc2_w -1315593550708345531
// 196: lload 2
// 197: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: athrow
// 19d: aload 0
// 19e: getfield su/catlean/nm.f Ljava/nio/ByteBuffer;
// 1a1: iload 12
// 1a3: ifeq 1c7
// 1a6: dup
// 1a7: ifnull 1cb
// 1aa: goto 1b7
// 1ad: ldc2_w -1315593550708345531
// 1b0: lload 2
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
// 1ba: goto 1c7
// 1bd: ldc2_w -1315593550708345531
// 1c0: lload 2
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: pop
// 1c8: goto 1cc
// 1cb: pop
// 1cc: new su/catlean/gk
// 1cf: dup
// 1d0: aload 0
// 1d1: getfield su/catlean/nm.W Lsu/catlean/b2;
// 1d4: dup
// 1d5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1d8: invokestatic su/catlean/op.d ()Lkotlinx/serialization/json/Json;
// 1db: astore 14
// 1dd: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
// 1e0: aload 0
// 1e1: getfield su/catlean/nm.f Ljava/nio/ByteBuffer;
// 1e4: dup
// 1e5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1e8: invokevirtual java/nio/charset/Charset.decode (Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
// 1eb: invokevirtual java/nio/CharBuffer.toString ()Ljava/lang/String;
// 1ee: dup
// 1ef: sipush 28661
// 1f2: ldc2_w 7846788290628364898
// 1f5: lload 2
// 1f6: lxor
// 1f7: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/nm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ff: astore 15
// 201: bipush 0
// 202: istore 16
// 204: aload 14
// 206: aload 14
// 208: invokevirtual kotlinx/serialization/json/Json.getSerializersModule ()Lkotlinx/serialization/modules/SerializersModule;
// 20b: pop
// 20c: getstatic su/catlean/f4.i Lsu/catlean/f3;
// 20f: invokevirtual su/catlean/f3.v ()Lkotlinx/serialization/KSerializer;
// 212: checkcast kotlinx/serialization/DeserializationStrategy
// 215: aload 15
// 217: invokevirtual kotlinx/serialization/json/Json.decodeFromString (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
// 21a: checkcast su/catlean/f4
// 21d: astore 10
// 21f: astore 11
// 221: iload 4
// 223: iload 5
// 225: i2s
// 226: iload 6
// 228: i2c
// 229: aload 11
// 22b: aload 10
// 22d: invokespecial su/catlean/gk.<init> (ISCLsu/catlean/b2;Lsu/catlean/f4;)V
// 230: astore 13
// 232: aload 0
// 233: aconst_null
// 234: putfield su/catlean/nm.W Lsu/catlean/b2;
// 237: aload 0
// 238: aconst_null
// 239: putfield su/catlean/nm.e Ljava/lang/Integer;
// 23c: aload 0
// 23d: aconst_null
// 23e: putfield su/catlean/nm.f Ljava/nio/ByteBuffer;
// 241: aload 13
// 243: areturn
}

private final boolean d(ReadableByteChannel param1, char param2, int param3, int param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 2
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 4
// 10: i2l
// 11: bipush 48
// 13: lshl
// 14: bipush 48
// 16: lushr
// 17: lor
// 18: getstatic su/catlean/nm.b J
// 1b: lxor
// 1c: lstore 5
// 1e: ldc2_w 7644717831475327924
// 21: lload 5
// 23: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: aload 1
// 29: aload 0
// 2a: getfield su/catlean/nm.h Ljava/nio/ByteBuffer;
// 2d: invokeinterface java/nio/channels/ReadableByteChannel.read (Ljava/nio/ByteBuffer;)I 2
// 32: pop
// 33: istore 7
// 35: aload 0
// 36: getfield su/catlean/nm.h Ljava/nio/ByteBuffer;
// 39: invokevirtual java/nio/ByteBuffer.hasRemaining ()Z
// 3c: iload 7
// 3e: ifeq 68
// 41: ifeq 5f
// 44: goto 52
// 47: ldc2_w 7702317630666797599
// 4a: lload 5
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: bipush 0
// 53: ireturn
// 54: ldc2_w 7702317630666797599
// 57: lload 5
// 59: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: athrow
// 5f: aload 0
// 60: getfield su/catlean/nm.h Ljava/nio/ByteBuffer;
// 63: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
// 66: pop
// 67: bipush 1
// 68: ireturn
}

private static final Unit q(nm var0) {
long var1 = b ^ 105665812718406L;
long var3 = var1 ^ 132163486298213L;
var0.P(var3);
return Unit.INSTANCE;
}

private static final boolean k(nm var0, SelectionKey var1) {
long var2 = b ^ 95245202620986L;
long var4 = var2 ^ 9740319922384L;
long var6 = var2 ^ 45827021074001L;
boolean var8 = vm.a<"Å">(1157758936484874674L, var2);

label51: {
try {
boolean var10000 = var1.isReadable();
if (!var8) {
return var10000;
}

if (var10000) {
break label51;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 1216658890994092057L, var2);
}

return false;
}

SocketChannel var10001 = var0.F;
Intrinsics.checkNotNullExpressionValue(var0.F, b<"f">(28967, 6883300746374400494L ^ var2));
gk var9 = var0.y(var10001, var6);

gk var14;
label30: {
try {
var14 = var9;
if (!var8) {
break label30;
}

if (var9 == null) {
return false;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 1216658890994092057L, var2);
}

var14 = var9;
}

gk var10 = var14;
boolean var11 = false;
os.D.M(var4, var10);
return true;
}

private static final boolean z(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var5 = b ^ 21930880069382L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[5];
int var12 = 0;
String var11 = "\u0091\u007fí³»i\u0086Ü2\u0096\u0093\u0005¾\u0004\u00adåß×Ú¯\u0099!à½\u0010\u008d¨\u009f\"\bD\u009b\u0087:b\u009dä\u0083\u009c{\"\u0010c{H¹q6R5ª.ï\u000etÝ\u00adn";
int var13 = "\u0091\u007fí³»i\u0086Ü2\u0096\u0093\u0005¾\u0004\u00adåß×Ú¯\u0099!à½\u0010\u008d¨\u009f\"\bD\u009b\u0087:b\u009dä\u0083\u009c{\"\u0010c{H¹q6R5ª.ï\u000etÝ\u00adn"
.length();
char var10 = 24;
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
i = var14;
j = new String[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 5304555208912263279L;
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

var11 = "é8\u00addÊk£\u0003\u001a¨\u009f\u0005í@ÞúswBÁ¯\u0099\u0010ï\u0087T=\"sÃÊßØ\u008b1\u008f\"æ¹\u0095±B®\u009e1\u001b\u0081¤\u0010x,&W\u001eXö7\u001bW\u0095èDåGº";
var13 = "é8\u00addÊk£\u0003\u001a¨\u009f\u0005í@ÞúswBÁ¯\u0099\u0010ï\u0087T=\"sÃÊßØ\u008b1\u008f\"æ¹\u0095±B®\u009e1\u001b\u0081¤\u0010x,&W\u001eXö7\u001bW\u0095èDåGº"
.length();
var10 = '0';
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
var10001 = 0;
}
}
}

private static Throwable a(Throwable var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 10748;
if (j[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])k.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/nm", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = i[var5].getBytes("ISO-8859-1");
j[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return j[var5];
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
throw new RuntimeException("su/catlean/nm" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
