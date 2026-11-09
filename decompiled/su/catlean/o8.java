package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class o8 {
@NotNull
public static final o8 g;
@NotNull
private static final ArrayDeque P;
@NotNull
private static final ArrayDeque h;
private static boolean G;
private static int[] C;
private static final long a = yz.a(-865246061451225110L, 1525567542605440342L, MethodHandles.lookup().lookupClass()).a(69302585697283L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map i;

private o8() {
}

@Flow(
priority = 10
)
private final void o(PlayerUpdateEvent var1) {
long var2 = a ^ 127438983453844L;
long var4 = var2 ^ 129369905740777L;
this.K(o8::l, var4);
}

@Flow(
priority = -10
)
private final void I(PlayerUpdateEvent var1) {
long var2 = a ^ 136553121000989L;
long var4 = var2 ^ 134686757439840L;
this.K(o8::m, var4);
}

@Flow
private final void L(PostTasksProcessEvent var1) {
long var2 = a ^ 9961674257407L;
long var4 = var2 ^ 16774365860994L;
this.K(o8::D, var4);
}

public final void X(int delay, byte priority, boolean tick, @NotNull Runnable runnable, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/o8.a J
// 03: lload 5
// 05: lxor
// 06: lstore 5
// 08: lload 5
// 0a: dup2
// 0b: ldc2_w 37738753478917
// 0e: lxor
// 0f: lstore 7
// 11: pop2
// 12: aload 4
// 14: sipush 7314
// 17: ldc2_w 5358563664378909538
// 1a: lload 5
// 1c: lxor
// 1d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/o8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 25: ldc2_w 8774364705171810716
// 28: lload 5
// 2a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: new su/catlean/f
// 32: dup
// 33: lload 7
// 35: aload 4
// 37: iload 1
// 38: iload 2
// 39: iload 3
// 3a: lconst_0
// 3b: sipush 14015
// 3e: ldc2_w 1252885619969133788
// 41: lload 5
// 43: lxor
// 44: invokedynamic e (IJ)I bsm=su/catlean/o8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: aconst_null
// 4a: invokespecial su/catlean/f.<init> (JLjava/lang/Runnable;IBZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 4d: astore 10
// 4f: astore 9
// 51: aload 9
// 53: ifnull 80
// 56: getstatic su/catlean/o8.G Z
// 59: ifeq 8c
// 5c: goto 6a
// 5f: ldc2_w 8780250399159925536
// 62: lload 5
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: getstatic su/catlean/o8.h Ljava/util/ArrayDeque;
// 6d: aload 10
// 6f: invokevirtual java/util/ArrayDeque.addLast (Ljava/lang/Object;)V
// 72: goto 80
// 75: ldc2_w 8780250399159925536
// 78: lload 5
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: lload 5
// 82: lconst_0
// 83: lcmp
// 84: ifle a2
// 87: aload 9
// 89: ifnonnull a2
// 8c: getstatic su/catlean/o8.P Ljava/util/ArrayDeque;
// 8f: aload 10
// 91: invokevirtual java/util/ArrayDeque.addLast (Ljava/lang/Object;)V
// 94: goto a2
// 97: ldc2_w 8780250399159925536
// 9a: lload 5
// 9c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1: athrow
// a2: lload 5
// a4: lconst_0
// a5: lcmp
// a6: ifle c4
// a9: ldc2_w 8764001481571591950
// ac: lload 5
// ae: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: ifnull d2
// b6: bipush 3
// b7: anewarray 11
// ba: ldc2_w 8744876836285228629
// bd: lload 5
// bf: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c4: goto d2
// c7: ldc2_w 8780250399159925536
// ca: lload 5
// cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d1: athrow
// d2: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static void p(o8 var0, long var1, int var3, byte var4, boolean var5, Runnable var6, int var7, Object var8) {
var1 = a ^ var1;
long var9 = var1 ^ 75833439739460L;
String[] var11 = vm.a<"Å">(-382568509721466136L, var1);

int var10000;
label61: {
label60: {
try {
var10000 = var7 & 1;
if (var11 == null) {
break label61;
}

if (var10000 == 0) {
break label60;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -383458022907168684L, var1);
}

var3 = 0;
}

var10000 = var7 & 2;
}

String[] var10001;
label52: {
label51: {
label50: {
try {
var10001 = var11;
if (var1 <= 0L) {
break label52;
}

if (var11 == null) {
break label51;
}

if (var10000 == 0) {
break label50;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -383458022907168684L, var1);
}

var4 = b<"e">(4189, 3147827194414967113L ^ var1);
}

var10000 = var7 & 4;
}

try {
var10001 = var11;
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -383458022907168684L, var1);
}
}

label39: {
label38: {
try {
if (var10001 == null) {
break label38;
}

if (var10000 == 0) {
break label39;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -383458022907168684L, var1);
}

var10000 = 1;
}

var5 = var10000;
}

var0.X(var3, (byte)var4, (boolean)var5, var6, var9);
}

private final void K(Function1 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/o8.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 81548477628209
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 7383550611754366511
// 012: lload 2
// 013: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: bipush 1
// 019: putstatic su/catlean/o8.G Z
// 01c: astore 6
// 01e: nop
// 01f: getstatic su/catlean/o8.P Ljava/util/ArrayDeque;
// 022: invokevirtual java/util/ArrayDeque.iterator ()Ljava/util/Iterator;
// 025: dup
// 026: sipush 14956
// 029: ldc2_w 3253346034675870254
// 02c: lload 2
// 02d: lxor
// 02e: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/o8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 036: astore 7
// 038: aload 7
// 03a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 03f: ifeq 0af
// 042: aload 7
// 044: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 049: checkcast su/catlean/f
// 04c: astore 8
// 04e: lload 2
// 04f: lconst_0
// 050: lcmp
// 051: iflt 0b9
// 054: aload 1
// 055: aload 8
// 057: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 05a: aload 8
// 05c: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 061: checkcast java/lang/Boolean
// 064: invokevirtual java/lang/Boolean.booleanValue ()Z
// 067: aload 6
// 069: ifnull 0b6
// 06c: aload 6
// 06e: lload 2
// 06f: lconst_0
// 070: lcmp
// 071: iflt 09d
// 074: ifnull 09b
// 077: goto 084
// 07a: ldc2_w 7379954118152529043
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: ifeq 038
// 087: goto 094
// 08a: ldc2_w 7379954118152529043
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: aload 8
// 096: lload 4
// 098: invokevirtual su/catlean/f.W (J)Z
// 09b: aload 6
// 09d: ifnull 03f
// 0a0: ifeq 038
// 0a3: aload 7
// 0a5: invokeinterface java/util/Iterator.remove ()V 1
// 0aa: aload 6
// 0ac: ifnonnull 038
// 0af: lload 2
// 0b0: lconst_0
// 0b1: lcmp
// 0b2: iflt 042
// 0b5: bipush 0
// 0b6: putstatic su/catlean/o8.G Z
// 0b9: goto 0c5
// 0bc: astore 7
// 0be: bipush 0
// 0bf: putstatic su/catlean/o8.G Z
// 0c2: aload 7
// 0c4: athrow
// 0c5: getstatic su/catlean/o8.h Ljava/util/ArrayDeque;
// 0c8: checkcast java/util/Collection
// 0cb: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0d0: ifne 0ec
// 0d3: bipush 1
// 0d4: lload 2
// 0d5: lconst_0
// 0d6: lcmp
// 0d7: ifle 0ed
// 0da: aload 6
// 0dc: ifnull 0ed
// 0df: goto 0ed
// 0e2: ldc2_w 7379954118152529043
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: bipush 0
// 0ed: ifeq 114
// 0f0: getstatic su/catlean/o8.P Ljava/util/ArrayDeque;
// 0f3: getstatic su/catlean/o8.h Ljava/util/ArrayDeque;
// 0f6: invokevirtual java/util/ArrayDeque.removeFirst ()Ljava/lang/Object;
// 0f9: invokevirtual java/util/ArrayDeque.addLast (Ljava/lang/Object;)V
// 0fc: aload 6
// 0fe: ifnonnull 0c5
// 101: lload 2
// 102: lconst_0
// 103: lcmp
// 104: iflt 114
// 107: goto 114
// 10a: ldc2_w 7379954118152529043
// 10d: lload 2
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: return
}

private static final boolean l(f param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/o8.a J
// 03: ldc2_w 21389549929461
// 06: lxor
// 07: lstore 1
// 08: ldc2_w -2319375619052925033
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 0
// 12: sipush 25333
// 15: ldc2_w 4293314732039539469
// 18: lload 1
// 19: lxor
// 1a: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/o8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 22: astore 3
// 23: aload 0
// 24: invokevirtual su/catlean/f.p ()Z
// 27: aload 3
// 28: ifnull 4c
// 2b: ifeq 7e
// 2e: goto 3b
// 31: ldc2_w -2318626843404329685
// 34: lload 1
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: aload 0
// 3c: invokevirtual su/catlean/f.B ()B
// 3f: goto 4c
// 42: ldc2_w -2318626843404329685
// 45: lload 1
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: aload 3
// 4d: ifnull 7b
// 50: sipush 4189
// 53: ldc2_w 3147857783399910454
// 56: lload 1
// 57: lxor
// 58: invokedynamic e (IJ)I bsm=su/catlean/o8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: if_icmpne 7e
// 60: goto 6d
// 63: ldc2_w -2318626843404329685
// 66: lload 1
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: bipush 1
// 6e: goto 7b
// 71: ldc2_w -2318626843404329685
// 74: lload 1
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: goto 7f
// 7e: bipush 0
// 7f: ireturn
}

private static final boolean m(f param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/o8.a J
// 03: ldc2_w 57236420847370
// 06: lxor
// 07: lstore 1
// 08: ldc2_w 4265132408718289768
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 0
// 12: sipush 30535
// 15: ldc2_w 8292719969787345473
// 18: lload 1
// 19: lxor
// 1a: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/o8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 22: astore 3
// 23: aload 0
// 24: invokevirtual su/catlean/f.p ()Z
// 27: aload 3
// 28: ifnull 4c
// 2b: ifeq 7e
// 2e: goto 3b
// 31: ldc2_w 4264260487048198612
// 34: lload 1
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: aload 0
// 3c: invokevirtual su/catlean/f.B ()B
// 3f: goto 4c
// 42: ldc2_w 4264260487048198612
// 45: lload 1
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: aload 3
// 4d: ifnull 7b
// 50: sipush 13401
// 53: ldc2_w 842675774916578511
// 56: lload 1
// 57: lxor
// 58: invokedynamic e (IJ)I bsm=su/catlean/o8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: if_icmpeq 7e
// 60: goto 6d
// 63: ldc2_w 4264260487048198612
// 66: lload 1
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: bipush 1
// 6e: goto 7b
// 71: ldc2_w 4264260487048198612
// 74: lload 1
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: goto 7f
// 7e: bipush 0
// 7f: ireturn
}

private static final boolean D(f var0) {
long var1 = a ^ 127272504644208L;
String[] var10000 = vm.a<"Å">(-8193581964342764014L, var1);
Intrinsics.checkNotNullParameter(var0, a<"y">(25333, 4293209952899586696L ^ var1));
String[] var3 = var10000;

try {
boolean var5 = var0.p();
if (var3 == null) {
return var5;
}

if (!var5) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -8189807332006802258L, var1);
}

return false;
}

static {
long var20 = a ^ 52695086021881L;
int[] var10000 = new int[5];
vm.a<"Å">(var10000, 6966259914585671197L, var20);
Cipher var11;
Cipher var24 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var24.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[4];
int var16 = 0;
String var15 = "ölÂÂW\rµP\u0004\u0090/6íp$Ç?\u0091UÏiNÒ(\u0018\u0001p\u007f\u008fN1Jõ\u0003K\u0089¹\t·M\n×4¯Ùâ\u0007ý×";
int var17 = "ölÂÂW\rµP\u0004\u0090/6íp$Ç?\u0091UÏiNÒ(\u0018\u0001p\u007f\u008fN1Jõ\u0003K\u0089¹\t·M\n×4¯Ùâ\u0007ý×".length();
char var14 = 24;
int var23 = -1;

label45:
while (true) {
String var25 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var34 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var34;
if ((var23 += var14) >= var17) {
b = var18;
c = new String[4];
i = new HashMap(13);
Cipher var0;
Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var27.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "íw\u008cQwkÞ\u0001N\u008d\u001aå\u001c<Ä\u0006û>{\flæ_Ò";
int var5 = "íw\u008cQwkÞ\u0001N\u008d\u001aå\u001c<Ä\u0006û>{\flæ_Ò".length();
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

e = var6;
f = new Integer[3];
g = new o8();
P = new ArrayDeque();
h = new ArrayDeque();
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

var15 = "j\u0081Ã\n¯\u0087&·«v\u0016\u0093b\u0093è÷\u0010\u0097\u0004$Ú\u0012y\nµ\u0017eJçX\u0081ü£";
var17 = "j\u0081Ã\n¯\u0087&·«v\u0016\u0093b\u0093è÷\u0010\u0097\u0004$Ú\u0012y\nµ\u0017eJçX\u0081ü£".length();
var14 = 16;
var23 = -1;
}

var25 = var15.substring(++var23, var23 + var14);
var10001 = 0;
}
}
}

public static void X(int[] var0) {
C = var0;
}

public static int[] K() {
return C;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14142;
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
throw new RuntimeException("su/catlean/o8", var10);
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
throw new RuntimeException("su/catlean/o8" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17068;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
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
throw new RuntimeException("su/catlean/o8", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/o8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
