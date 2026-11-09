package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.gofra.Flow;

public final class rq implements ym {
@NotNull
public static final rq G;
@NotNull
private static final String F;
@NotNull
private static final String O;
private static int S;
private static boolean j;
private static boolean Q;
@NotNull
private static final bg f;
@NotNull
private static final bg d;
@NotNull
private static CopyOnWriteArrayList B;
@NotNull
private static ConcurrentHashMap e;
private static int[] l;
private static final long a = yz.a(-4189204353788490942L, -434379992115234740L, MethodHandles.lookup().lookupClass()).a(276125987312247L);
private static final String[] b;
private static final String[] c;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map k;

private rq() {
}

@Flow
private final void X(TickEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/rq.a J
// 003: ldc2_w 7069174021152
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 6256557801526
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 73287199282288
// 014: lxor
// 015: lstore 6
// 017: pop2
// 018: ldc2_w 2055820804476527177
// 01b: lload 2
// 01c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 021: astore 8
// 023: getstatic su/catlean/rq.Q Z
// 026: aload 8
// 028: ifnonnull 102
// 02b: ifne 0e0
// 02e: goto 03b
// 031: ldc2_w 2019434765530608098
// 034: lload 2
// 035: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: athrow
// 03b: lload 4
// 03d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 040: invokevirtual net/minecraft/class_310.method_1548 ()Lnet/minecraft/class_320;
// 043: aload 8
// 045: ifnonnull 07a
// 048: goto 055
// 04b: ldc2_w 2019434765530608098
// 04e: lload 2
// 04f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: athrow
// 055: ifnull 0e0
// 058: goto 065
// 05b: ldc2_w 2019434765530608098
// 05e: lload 2
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: lload 4
// 067: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06a: invokevirtual net/minecraft/class_310.method_1548 ()Lnet/minecraft/class_320;
// 06d: goto 07a
// 070: ldc2_w 2019434765530608098
// 073: lload 2
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: invokevirtual net/minecraft/class_320.method_1676 ()Ljava/lang/String;
// 07d: aload 8
// 07f: ifnonnull 0be
// 082: ifnull 0e0
// 085: goto 092
// 088: ldc2_w 2019434765530608098
// 08b: lload 2
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: lload 4
// 094: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 097: invokevirtual net/minecraft/class_310.method_1548 ()Lnet/minecraft/class_320;
// 09a: invokevirtual net/minecraft/class_320.method_1676 ()Ljava/lang/String;
// 09d: dup
// 09e: sipush 6566
// 0a1: ldc2_w 1945437139372914910
// 0a4: lload 2
// 0a5: lxor
// 0a6: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/rq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ae: checkcast java/lang/CharSequence
// 0b1: goto 0be
// 0b4: ldc2_w 2019434765530608098
// 0b7: lload 2
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: invokeinterface java/lang/CharSequence.length ()I 1
// 0c3: aload 8
// 0c5: ifnonnull 0d9
// 0c8: ifle 0dc
// 0cb: goto 0d8
// 0ce: ldc2_w 2019434765530608098
// 0d1: lload 2
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: bipush 1
// 0d9: goto 0dd
// 0dc: bipush 0
// 0dd: ifne 117
// 0e0: getstatic su/catlean/rq.d Lsu/catlean/bg;
// 0e3: sipush 19872
// 0e6: ldc2_w 8599747150281675086
// 0e9: lload 2
// 0ea: lxor
// 0eb: invokedynamic n (IJ)I bsm=su/catlean/rq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: lload 6
// 0f2: invokevirtual su/catlean/bg.q (IJ)Z
// 0f5: goto 102
// 0f8: ldc2_w 2019434765530608098
// 0fb: lload 2
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: aload 8
// 104: ifnonnull 140
// 107: ifeq 13d
// 10a: goto 117
// 10d: ldc2_w 2019434765530608098
// 110: lload 2
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: bipush 1
// 118: putstatic su/catlean/rq.Q Z
// 11b: getstatic su/catlean/bo.S Lsu/catlean/bo;
// 11e: astore 9
// 120: bipush 0
// 121: istore 10
// 123: bipush 0
// 124: istore 11
// 126: aload 9
// 128: invokevirtual su/catlean/bo.Y ()Ljava/util/concurrent/ExecutorService;
// 12b: new su/catlean/rr
// 12e: dup
// 12f: iload 10
// 131: invokespecial su/catlean/rr.<init> (I)V
// 134: checkcast java/lang/Runnable
// 137: invokeinterface java/util/concurrent/ExecutorService.execute (Ljava/lang/Runnable;)V 2
// 13c: nop
// 13d: getstatic su/catlean/rq.j Z
// 140: aload 8
// 142: ifnonnull 21c
// 145: ifne 1fa
// 148: goto 155
// 14b: ldc2_w 2019434765530608098
// 14e: lload 2
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: lload 4
// 157: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 15a: invokevirtual net/minecraft/class_310.method_1548 ()Lnet/minecraft/class_320;
// 15d: aload 8
// 15f: ifnonnull 194
// 162: goto 16f
// 165: ldc2_w 2019434765530608098
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: ifnull 1fa
// 172: goto 17f
// 175: ldc2_w 2019434765530608098
// 178: lload 2
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: lload 4
// 181: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 184: invokevirtual net/minecraft/class_310.method_1548 ()Lnet/minecraft/class_320;
// 187: goto 194
// 18a: ldc2_w 2019434765530608098
// 18d: lload 2
// 18e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: athrow
// 194: invokevirtual net/minecraft/class_320.method_1676 ()Ljava/lang/String;
// 197: aload 8
// 199: ifnonnull 1d8
// 19c: ifnull 1fa
// 19f: goto 1ac
// 1a2: ldc2_w 2019434765530608098
// 1a5: lload 2
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: lload 4
// 1ae: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b1: invokevirtual net/minecraft/class_310.method_1548 ()Lnet/minecraft/class_320;
// 1b4: invokevirtual net/minecraft/class_320.method_1676 ()Ljava/lang/String;
// 1b7: dup
// 1b8: sipush 30394
// 1bb: ldc2_w 8630226720728274884
// 1be: lload 2
// 1bf: lxor
// 1c0: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/rq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1c8: checkcast java/lang/CharSequence
// 1cb: goto 1d8
// 1ce: ldc2_w 2019434765530608098
// 1d1: lload 2
// 1d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: athrow
// 1d8: invokeinterface java/lang/CharSequence.length ()I 1
// 1dd: aload 8
// 1df: ifnonnull 1f3
// 1e2: ifle 1f6
// 1e5: goto 1f2
// 1e8: ldc2_w 2019434765530608098
// 1eb: lload 2
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: bipush 1
// 1f3: goto 1f7
// 1f6: bipush 0
// 1f7: ifne 231
// 1fa: getstatic su/catlean/rq.f Lsu/catlean/bg;
// 1fd: sipush 2437
// 200: ldc2_w 3336050905622959459
// 203: lload 2
// 204: lxor
// 205: invokedynamic n (IJ)I bsm=su/catlean/rq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: lload 6
// 20c: invokevirtual su/catlean/bg.q (IJ)Z
// 20f: goto 21c
// 212: ldc2_w 2019434765530608098
// 215: lload 2
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: aload 8
// 21e: ifnonnull 232
// 221: ifeq 257
// 224: goto 231
// 227: ldc2_w 2019434765530608098
// 22a: lload 2
// 22b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: athrow
// 231: bipush 1
// 232: putstatic su/catlean/rq.j Z
// 235: getstatic su/catlean/bo.S Lsu/catlean/bo;
// 238: astore 9
// 23a: bipush 0
// 23b: istore 10
// 23d: bipush 0
// 23e: istore 11
// 240: aload 9
// 242: invokevirtual su/catlean/bo.Y ()Ljava/util/concurrent/ExecutorService;
// 245: new su/catlean/t2
// 248: dup
// 249: iload 10
// 24b: invokespecial su/catlean/t2.<init> (I)V
// 24e: checkcast java/lang/Runnable
// 251: invokeinterface java/util/concurrent/ExecutorService.execute (Ljava/lang/Runnable;)V 2
// 256: nop
// 257: return
}

public final void C(@NotNull String name, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(name, a<"f">(6052, 8451274540493767675L ^ ax));
String var4 = a<"f">(30772, 7456348078002138218L ^ ax) + name + a<"f">(7582, 4102727638088354249L ^ ax);
HttpRequest var5 = HttpRequest.newBuilder(URI.create(a<"f">(4819, 6377172023156246165L ^ ax)))
.header(a<"f">(15977, 5062289061891615278L ^ ax), a<"f">(5831, 3186677452161188499L ^ ax))
.POST(BodyPublishers.ofString(var4))
.build();

try {
HttpClient.newHttpClient().send(var5, BodyHandlers.ofString());
} catch (Throwable var7) {
}
}

@NotNull
public final List r(long var1) {
var1 = a ^ var1;
HttpRequest var3 = HttpRequest.newBuilder(URI.create(a<"f">(18654, 3441523292642106645L ^ var1))).GET().build();

List var4;
try {
HttpResponse var10 = HttpClient.newHttpClient().send(var3, BodyHandlers.ofString());
List var11;
if (var10.statusCode() == b<"n">(19323, 844913058784551715L ^ var1)) {
Json var5 = c9.p();
var11 = (List)var10.body();
Intrinsics.checkNotNullExpressionValue(var11, a<"f">(10734, 3216526010265091111L ^ var1));
String var6 = (String)var11;
boolean var7 = false;
var5.getSerializersModule();
var11 = var5.decodeFromString(new ArrayListSerializer<>(StringSerializer.INSTANCE), var6);
} else {
var11 = new ArrayList();
}

var4 = var11;
} catch (Exception var8) {
var4 = new ArrayList();
}

return var4;
}

public final boolean B(long a, @NotNull String string) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/rq.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 27420177322949
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 2867822099959601410
// 12: lload 1
// 13: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 3
// 19: sipush 32642
// 1c: ldc2_w 9020430445308929470
// 1f: lload 1
// 20: lxor
// 21: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/rq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 29: astore 6
// 2b: aload 3
// 2c: sipush 17121
// 2f: ldc2_w 5928538920880232667
// 32: lload 1
// 33: lxor
// 34: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/rq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 3e: astore 7
// 40: getstatic su/catlean/rq.e Ljava/util/concurrent/ConcurrentHashMap;
// 43: aload 7
// 45: invokevirtual java/util/concurrent/ConcurrentHashMap.contains (Ljava/lang/Object;)Z
// 48: aload 6
// 4a: ifnonnull 7c
// 4d: ifeq 7d
// 50: goto 5d
// 53: ldc2_w 2832001207779953321
// 56: lload 1
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: getstatic su/catlean/rq.e Ljava/util/concurrent/ConcurrentHashMap;
// 60: aload 7
// 62: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
// 65: dup
// 66: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 69: checkcast java/lang/Boolean
// 6c: invokevirtual java/lang/Boolean.booleanValue ()Z
// 6f: goto 7c
// 72: ldc2_w 2832001207779953321
// 75: lload 1
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: ireturn
// 7d: aload 0
// 7e: lload 4
// 80: aload 7
// 82: invokespecial su/catlean/rq.U (JLjava/lang/String;)Ljava/lang/String;
// 85: astore 8
// 87: getstatic su/catlean/rq.B Ljava/util/concurrent/CopyOnWriteArrayList;
// 8a: invokevirtual java/util/concurrent/CopyOnWriteArrayList.iterator ()Ljava/util/Iterator;
// 8d: invokestatic org/apache/commons/compress/utils/Lists.newArrayList (Ljava/util/Iterator;)Ljava/util/ArrayList;
// 90: aload 8
// 92: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
// 95: istore 9
// 97: getstatic su/catlean/rq.e Ljava/util/concurrent/ConcurrentHashMap;
// 9a: checkcast java/util/Map
// 9d: aload 7
// 9f: iload 9
// a1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// a4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// a9: pop
// aa: iload 9
// ac: ireturn
}

private final String U(long param1, String param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
//   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
//   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
//   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:299)
//
// Bytecode:
// 00: getstatic su/catlean/rq.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 25756641414144
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: aload 3
// 10: astore 8
// 12: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
// 15: aload 8
// 17: swap
// 18: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
// 1b: dup
// 1c: sipush 31244
// 1f: ldc2_w 6991631528092570287
// 22: lload 1
// 23: lxor
// 24: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/rq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c: astore 7
// 2e: sipush 21701
// 31: ldc2_w 2840070709461630059
// 34: lload 1
// 35: lxor
// 36: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/rq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: astore 9
// 3d: ldc2_w -3074115772635501672
// 40: lload 1
// 41: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
// 49: aload 9
// 4b: swap
// 4c: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
// 4f: dup
// 50: sipush 16018
// 53: ldc2_w 4303333552393016895
// 56: lload 1
// 57: lxor
// 58: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/rq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 60: astore 8
// 62: aload 7
// 64: arraylength
// 65: newarray 8
// 67: astore 9
// 69: bipush 0
// 6a: istore 10
// 6c: astore 6
// 6e: aload 7
// 70: arraylength
// 71: istore 11
// 73: iload 10
// 75: iload 11
// 77: if_icmpge 97
// 7a: aload 9
// 7c: iload 10
// 7e: aload 7
// 80: iload 10
// 82: baload
// 83: aload 8
// 85: iload 10
// 87: aload 8
// 89: arraylength
// 8a: irem
// 8b: baload
// 8c: ixor
// 8d: i2b
// 8e: bastore
// 8f: iinc 10 1
// 92: aload 6
// 94: ifnull 73
// 97: lload 1
// 98: lconst_0
// 99: lcmp
// 9a: ifle 92
// 9d: aload 0
// 9e: lload 4
// a0: aload 9
// a2: invokespecial su/catlean/rq.s (J[B)Ljava/lang/String;
// a5: areturn
}

private final String s(long var1, byte[] var3) {
var1 = a ^ var1;
String var10000 = Base64.getEncoder().encodeToString(var3);
Intrinsics.checkNotNullExpressionValue(var10000, a<"f">(691, 8827854662728288068L ^ var1));
return StringsKt.replace$default(
StringsKt.replace$default(
StringsKt.replace$default(var10000, (char)b<"n">(4038, 806257748557920170L ^ var1), (char)b<"n">(24240, 5666040733155174110L ^ var1), false, 4, null),
(char)b<"n">(31371, 8016910571858232036L ^ var1),
(char)b<"n">(30275, 314182214789074474L ^ var1),
false,
4,
null
),
(char)b<"n">(17811, 519726637535346174L ^ var1),
(char)b<"n">(23984, 3206892569649128913L ^ var1),
false,
4,
null
);
}

public static final String p(rq $this, int a, short a, short a, String input) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 63848086162077L;
return $this.U(var7, input);
}

public static final int j() {
return S;
}

public static final CopyOnWriteArrayList Z() {
return B;
}

static {
long var20 = a ^ 70605707851705L;
vm.a<"Å">(null, -7519231476710778821L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[18];
int var16 = 0;
String var15 = "mM©~¸Ïxßå¨a\u009c\u0004+Ôá ip¤ø\"  8\u008dk7f\u009aûÔýq\u009flùF£\u0082\u0018Wæ~Ø\u0085´\u0011k\u0010\n\u0089+á¦\u008eY\u001c(¡;\u0084ã\u0087\n\r(«ë¾èú\u0094=Ø:\u009fTy\\\u0094¤>\u0001ÜâÐÍ\u0000á¨\u0097\u0090Ã\u0089Öá'îC³òp3\u0080\u0016i\u0010Ü\u00ad\u0083R\u0097Æ^8\u0091\\\u007f\u0005\u0088:Hµ@\u000bâtÌ\u0096LK\u001d÷=\u0013 )Ø½úýa&\u0099É\u0015nÔ\b\r\rP\u008eC\u00108ç¹ «±¶wÊÜ.²ç÷hñ¬\u001d¹\"¡í` Â<fLþü·Û\n C\u008aø\\\u0081Ô¬?(\u0010À\u009d¶ì\u009d\u0083>¿å\u0095\u0089î\u001a3\u007f\u008f<\u0012©#¤%\u0018O\u008b;;ÂÃDf\u001eP\u0010ê£\u0093\u0091_¼(«@\u0014¶\u0096\u0018\u0010Äp5\u008f+\u0090Ô\u0093½\u0097½\u001c\rK\u0097ç \u009c\u0082à\u0001;ðó|È<(¥\u001fa§A-¨BÂs\n8ì¹Ó<÷U\u001d\u0084Z(Ë\u0092\\§9}UVXõîó+zg@\u0090Ö±~\u0002ÖÉÍ~$rì¿2\u0016àW\u009c¼\u0088Å\r_\t Ò\u0084\u0085ÝZ\u001dõ°¬£\u0085ÄF\u0001\u008d\u0007\nP©¡Ín2dKk«B\u009d9]3\u0018\u007fÂÌ0\r_¹quQPÛ/\u0010¡_m=\u0090|4ßU³ [ñ<\u0098\u0083ôk¸SæH¼é\u0019i ¨í¿·M\u0003S\u0082iâÜ\f\u0085K\u0013+0\u001fExm\u0080·Í\u0094³ö¶8¦CÁö1\u0097¨É\u001d\u0011M\u0019E&YëþÓËª\u0082ý~û%\u0086Cÿ\u0082,ÐO¯¬S` Û\u0080S20×Í\u0084%À×\u00110\u0005üd \rÙíS¯%¥HÃ\u0001?³\u000bGJ";
int var17 = "mM©~¸Ïxßå¨a\u009c\u0004+Ôá ip¤ø\"  8\u008dk7f\u009aûÔýq\u009flùF£\u0082\u0018Wæ~Ø\u0085´\u0011k\u0010\n\u0089+á¦\u008eY\u001c(¡;\u0084ã\u0087\n\r(«ë¾èú\u0094=Ø:\u009fTy\\\u0094¤>\u0001ÜâÐÍ\u0000á¨\u0097\u0090Ã\u0089Öá'îC³òp3\u0080\u0016i\u0010Ü\u00ad\u0083R\u0097Æ^8\u0091\\\u007f\u0005\u0088:Hµ@\u000bâtÌ\u0096LK\u001d÷=\u0013 )Ø½úýa&\u0099É\u0015nÔ\b\r\rP\u008eC\u00108ç¹ «±¶wÊÜ.²ç÷hñ¬\u001d¹\"¡í` Â<fLþü·Û\n C\u008aø\\\u0081Ô¬?(\u0010À\u009d¶ì\u009d\u0083>¿å\u0095\u0089î\u001a3\u007f\u008f<\u0012©#¤%\u0018O\u008b;;ÂÃDf\u001eP\u0010ê£\u0093\u0091_¼(«@\u0014¶\u0096\u0018\u0010Äp5\u008f+\u0090Ô\u0093½\u0097½\u001c\rK\u0097ç \u009c\u0082à\u0001;ðó|È<(¥\u001fa§A-¨BÂs\n8ì¹Ó<÷U\u001d\u0084Z(Ë\u0092\\§9}UVXõîó+zg@\u0090Ö±~\u0002ÖÉÍ~$rì¿2\u0016àW\u009c¼\u0088Å\r_\t Ò\u0084\u0085ÝZ\u001dõ°¬£\u0085ÄF\u0001\u008d\u0007\nP©¡Ín2dKk«B\u009d9]3\u0018\u007fÂÌ0\r_¹quQPÛ/\u0010¡_m=\u0090|4ßU³ [ñ<\u0098\u0083ôk¸SæH¼é\u0019i ¨í¿·M\u0003S\u0082iâÜ\f\u0085K\u0013+0\u001fExm\u0080·Í\u0094³ö¶8¦CÁö1\u0097¨É\u001d\u0011M\u0019E&YëþÓËª\u0082ý~û%\u0086Cÿ\u0082,ÐO¯¬S` Û\u0080S20×Í\u0084%À×\u00110\u0005üd \rÙíS¯%¥HÃ\u0001?³\u000bGJ"
.length();
char var14 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[18];
O = a<"f">(2167, 594366187501396627L ^ var20);
F = a<"f">(28962, 7853316942508973006L ^ var20);
k = new HashMap(13);
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
String var4 = "\u009a\tÐ\u0011z\u001bZ\u008a¬A\u0095\u008253t\u001fLv¬\u0000\u00846\u0097³C.G+\u0080\u0094MðÊC¼£±uýÌÜú=mù\"\u0000\u0013wA\u008dæïïR¬À¹´t\u009dlóÕ";
int var5 = "\u009a\tÐ\u0011z\u001bZ\u008a¬A\u0095\u008253t\u001fLv¬\u0000\u00846\u0097³C.G+\u0080\u0094MðÊC¼£±uýÌÜú=mù\"\u0000\u0013wA\u008dæïïR¬À¹´t\u009dlóÕ"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
h = var6;
i = new Integer[10];
G = new rq();
S = -1;
f = new bg();
d = new bg();
B = new CopyOnWriteArrayList();
e = new ConcurrentHashMap();
S = Random.Default.nextInt(0, b<"n">(13652, 6048596185211494953L ^ var20));
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = ";Õ9\u0013ü\u0007ü\u0087DYDëÿ\b5(";
var5 = ";Õ9\u0013ü\u0007ü\u0087DYDëÿ\b5(".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "É\u000bÌ\f\u0003PÊö\u0094¨\u0095'ÅÅ\u0088\u0093\u008eÛE\u0098àÁ\u0094`Ü+£r{½þ\u009f8«ê\rñUaG\u001bÄÁ(Üü9\u009d.$|ß\u009dL\fê¢6î:ø\nnØôË£ì'\u009eÍÛÑWIÁtïÝ\u009eh\u0019Î]÷îÊ\u0083ü";
var17 = "É\u000bÌ\f\u0003PÊö\u0094¨\u0095'ÅÅ\u0088\u0093\u008eÛE\u0098àÁ\u0094`Ü+£r{½þ\u009f8«ê\rñUaG\u001bÄÁ(Üü9\u009d.$|ß\u009dL\fê¢6î:ø\nnØôË£ì'\u009eÍÛÑWIÁtïÝ\u009eh\u0019Î]÷îÊ\u0083ü"
.length();
var14 = ' ';
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void O(int[] var0) {
l = var0;
}

public static int[] x() {
return l;
}

private static NumberFormatException a(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15372;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/rq", var10);
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
throw new RuntimeException("su/catlean/rq" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16792;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/rq", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/rq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
