package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class es extends _g {
@NotNull
public static final es y;
static final KProperty[] I;
@NotNull
private static final cl F;
@NotNull
private static final av d;
@NotNull
private static final av U;
@NotNull
private static final cq g;
@NotNull
private static final AtomicBoolean L;
private static final long a = yz.a(-8572507584014296308L, -7513811025867688681L, MethodHandles.lookup().lookupClass()).a(95022117766332L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map i;

private es(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 107940650123533L;
super(b<"t">(4811, 4123304082238406394L ^ var1), jt.d(), null, 4, null, var3);
}

private final String z(int var1, int var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 84053927410542L;
return (String)F.E(this, var6, I[0]);
}

private final lj p(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 92669255142021L;
return (lj)d.E(this, var3, I[1]);
}

private final lj Y(int var1, long var2) {
long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
long var6 = var4 ^ 60996966650991L;
return (lj)U.E(this, var6, I[2]);
}

private final boolean T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 27807446698427L;
return (Boolean)g.E(this, var3, I[3]);
}

@NotNull
public final AtomicBoolean W() {
return L;
}

@Flow
private final void k(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/es.a J
// 03: ldc2_w 53894319391277
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 82749369824893
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 107014130606907
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -5171136611723433312
// 1b: lload 2
// 1c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: istore 8
// 23: aload 1
// 24: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 27: instanceof net/minecraft/class_2797
// 2a: iload 8
// 2c: ifeq 52
// 2f: ifeq aa
// 32: goto 3f
// 35: ldc2_w -5180972747706747001
// 38: lload 2
// 39: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: athrow
// 3f: getstatic su/catlean/es.L Ljava/util/concurrent/atomic/AtomicBoolean;
// 42: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
// 45: goto 52
// 48: ldc2_w -5180972747706747001
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: ifeq 56
// 55: return
// 56: aload 1
// 57: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 5a: dup
// 5b: sipush 6496
// 5e: ldc2_w 5509113854734015928
// 61: lload 2
// 62: lxor
// 63: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 6b: checkcast net/minecraft/class_2797
// 6e: astore 9
// 70: getstatic su/catlean/es.L Ljava/util/concurrent/atomic/AtomicBoolean;
// 73: bipush 1
// 74: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 77: aload 0
// 78: checkcast su/catlean/_g
// 7b: aload 0
// 7c: aload 9
// 7e: getfield net/minecraft/class_2797.comp_945 Ljava/lang/String;
// 81: dup
// 82: sipush 30049
// 85: ldc2_w 6014325372067017105
// 88: lload 2
// 89: lxor
// 8a: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 92: lload 4
// 94: dup2_x1
// 95: pop2
// 96: invokevirtual su/catlean/es.O (JLjava/lang/String;)Ljava/lang/String;
// 99: bipush 1
// 9a: lload 6
// 9c: invokestatic su/catlean/o2.j (Lsu/catlean/_g;Ljava/lang/String;ZJ)V
// 9f: getstatic su/catlean/es.L Ljava/util/concurrent/atomic/AtomicBoolean;
// a2: bipush 0
// a3: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// a6: aload 1
// a7: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// aa: return
}

@Flow
private final void Y(InputEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/es.a J
// 003: ldc2_w 84957198387758
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 98733300419759
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 64862256616005
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 22876904214417
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 31974813035320
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 125924149076586
// 038: lxor
// 039: lstore 13
// 03b: pop2
// 03c: ldc2_w 8130582018893628734
// 03f: lload 2
// 040: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: istore 15
// 047: aload 1
// 048: iload 15
// 04a: ifne 071
// 04d: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 050: getstatic su/catlean/api/event/events/client/InputEvent$Action.Press Lsu/catlean/api/event/events/client/InputEvent$Action;
// 053: if_acmpne 143
// 056: goto 063
// 059: ldc2_w 8077769968161619844
// 05c: lload 2
// 05d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: athrow
// 063: aload 1
// 064: goto 071
// 067: ldc2_w 8077769968161619844
// 06a: lload 2
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 074: aload 0
// 075: iload 6
// 077: lload 7
// 079: invokespecial su/catlean/es.Y (IJ)Lsu/catlean/lj;
// 07c: invokevirtual su/catlean/lj.X ()I
// 07f: iload 15
// 081: ifne 0e8
// 084: if_icmpne 0db
// 087: goto 094
// 08a: ldc2_w 8077769968161619844
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: aload 0
// 095: checkcast su/catlean/_g
// 098: aload 0
// 099: lload 9
// 09b: invokespecial su/catlean/es.T (J)Z
// 09e: ifeq 0c8
// 0a1: goto 0ae
// 0a4: ldc2_w 8077769968161619844
// 0a7: lload 2
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: sipush 12502
// 0b1: ldc2_w 756348955041201193
// 0b4: lload 2
// 0b5: lxor
// 0b6: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: goto 0d5
// 0be: ldc2_w 8077769968161619844
// 0c1: lload 2
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: sipush 4326
// 0cb: ldc2_w 8895602711513685011
// 0ce: lload 2
// 0cf: lxor
// 0d0: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: bipush 1
// 0d6: lload 11
// 0d8: invokestatic su/catlean/o2.j (Lsu/catlean/_g;Ljava/lang/String;ZJ)V
// 0db: aload 1
// 0dc: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 0df: aload 0
// 0e0: lload 4
// 0e2: invokespecial su/catlean/es.p (J)Lsu/catlean/lj;
// 0e5: invokevirtual su/catlean/lj.X ()I
// 0e8: if_icmpne 143
// 0eb: aload 0
// 0ec: checkcast su/catlean/_g
// 0ef: lload 13
// 0f1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f4: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0f7: d2i
// 0f8: lload 13
// 0fa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fd: invokevirtual net/minecraft/class_746.method_23321 ()D
// 100: d2i
// 101: sipush 22532
// 104: ldc2_w 8993727119694992601
// 107: lload 2
// 108: lxor
// 109: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: dup_x2
// 10f: pop
// 110: sipush 21267
// 113: ldc2_w 564380405856837572
// 116: lload 2
// 117: lxor
// 118: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: swap
// 11e: sipush 9046
// 121: ldc2_w 4085573498492252058
// 124: lload 2
// 125: lxor
// 126: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 130: bipush 1
// 131: lload 11
// 133: invokestatic su/catlean/o2.j (Lsu/catlean/_g;Ljava/lang/String;ZJ)V
// 136: goto 143
// 139: ldc2_w 8077769968161619844
// 13c: lload 2
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: return
}

@Flow
private final void g(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/es.a J
// 003: ldc2_w 50753472046425
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 102727415344251
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 107698071767925
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 60525335834738
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 76173810317464
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 19702443216157
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 127514697177817
// 030: lxor
// 031: lstore 14
// 033: pop2
// 034: ldc2_w -2332088176071873975
// 037: lload 2
// 038: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: istore 16
// 03f: aload 1
// 040: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 043: iload 16
// 045: ifne 07d
// 048: instanceof net/minecraft/class_7439
// 04b: ifeq 307
// 04e: goto 05b
// 051: ldc2_w -2347110357767892749
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 05f: dup
// 060: sipush 4182
// 063: ldc2_w 9163776712268051406
// 066: lload 2
// 067: lxor
// 068: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 070: goto 07d
// 073: ldc2_w -2347110357767892749
// 076: lload 2
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: checkcast net/minecraft/class_7439
// 080: astore 17
// 082: aload 17
// 084: invokevirtual net/minecraft/class_7439.comp_763 ()Lnet/minecraft/class_2561;
// 087: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 08c: dup
// 08d: sipush 863
// 090: ldc2_w 8780099725113745600
// 093: lload 2
// 094: lxor
// 095: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 09d: astore 18
// 09f: aload 18
// 0a1: checkcast java/lang/CharSequence
// 0a4: sipush 27867
// 0a7: ldc2_w 4059260535611789127
// 0aa: lload 2
// 0ab: lxor
// 0ac: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: checkcast java/lang/CharSequence
// 0b4: bipush 0
// 0b5: bipush 2
// 0b6: aconst_null
// 0b7: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 0ba: iload 16
// 0bc: ifne 109
// 0bf: ifeq 307
// 0c2: goto 0cf
// 0c5: ldc2_w -2347110357767892749
// 0c8: lload 2
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: aload 18
// 0d1: iload 16
// 0d3: ifne 147
// 0d6: goto 0e3
// 0d9: ldc2_w -2347110357767892749
// 0dc: lload 2
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: checkcast java/lang/CharSequence
// 0e6: sipush 27313
// 0e9: ldc2_w 7321277458231855421
// 0ec: lload 2
// 0ed: lxor
// 0ee: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: checkcast java/lang/CharSequence
// 0f6: bipush 0
// 0f7: bipush 2
// 0f8: aconst_null
// 0f9: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 0fc: goto 109
// 0ff: ldc2_w -2347110357767892749
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: ifeq 307
// 10c: aload 0
// 10d: aload 18
// 10f: sipush 9374
// 112: ldc2_w 946499670225078047
// 115: lload 2
// 116: lxor
// 117: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: aconst_null
// 11d: bipush 2
// 11e: aconst_null
// 11f: invokestatic kotlin/text/StringsKt.substringAfter$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
// 122: sipush 10699
// 125: ldc2_w 5957105841350265433
// 128: lload 2
// 129: lxor
// 12a: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: aconst_null
// 130: bipush 2
// 131: aconst_null
// 132: invokestatic kotlin/text/StringsKt.substringBefore$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
// 135: lload 6
// 137: invokevirtual su/catlean/es.r (Ljava/lang/String;J)Ljava/lang/String;
// 13a: goto 147
// 13d: ldc2_w -2347110357767892749
// 140: lload 2
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: astore 19
// 149: aload 0
// 14a: aload 18
// 14c: lload 10
// 14e: invokevirtual su/catlean/es.K (Ljava/lang/String;J)Ljava/lang/String;
// 151: astore 20
// 153: aload 20
// 155: lload 12
// 157: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 15a: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 15d: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 160: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 163: iload 16
// 165: ifne 194
// 168: ifeq 179
// 16b: goto 178
// 16e: ldc2_w -2347110357767892749
// 171: lload 2
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: return
// 179: aload 19
// 17b: checkcast java/lang/CharSequence
// 17e: sipush 9769
// 181: ldc2_w 6739864571427669382
// 184: lload 2
// 185: lxor
// 186: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: checkcast java/lang/CharSequence
// 18e: bipush 0
// 18f: bipush 2
// 190: aconst_null
// 191: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 194: iload 16
// 196: ifne 237
// 199: ifeq 21c
// 19c: goto 1a9
// 19f: ldc2_w -2347110357767892749
// 1a2: lload 2
// 1a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a8: athrow
// 1a9: nop
// 1aa: aload 19
// 1ac: sipush 22532
// 1af: ldc2_w 8993759127217519534
// 1b2: lload 2
// 1b3: lxor
// 1b4: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: aconst_null
// 1ba: bipush 2
// 1bb: aconst_null
// 1bc: invokestatic kotlin/text/StringsKt.substringAfter$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
// 1bf: sipush 31452
// 1c2: ldc2_w 5465829592465971535
// 1c5: lload 2
// 1c6: lxor
// 1c7: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: aconst_null
// 1cd: bipush 2
// 1ce: aconst_null
// 1cf: invokestatic kotlin/text/StringsKt.substringBefore$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
// 1d2: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 1d5: istore 21
// 1d7: aload 19
// 1d9: sipush 21267
// 1dc: ldc2_w 564488795043672243
// 1df: lload 2
// 1e0: lxor
// 1e1: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: aconst_null
// 1e7: bipush 2
// 1e8: aconst_null
// 1e9: invokestatic kotlin/text/StringsKt.substringAfter$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
// 1ec: sipush 22068
// 1ef: ldc2_w 6051262467599414674
// 1f2: lload 2
// 1f3: lxor
// 1f4: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: aconst_null
// 1fa: bipush 2
// 1fb: aconst_null
// 1fc: invokestatic kotlin/text/StringsKt.substringBefore$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
// 1ff: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 202: istore 22
// 204: getstatic su/catlean/pf.E Lsu/catlean/pf;
// 207: new net/minecraft/class_2338
// 20a: dup
// 20b: iload 21
// 20d: bipush 0
// 20e: iload 22
// 210: invokespecial net/minecraft/class_2338.<init> (III)V
// 213: invokevirtual su/catlean/pf.W (Lnet/minecraft/class_2338;)V
// 216: goto 21b
// 219: astore 21
// 21b: return
// 21c: aload 19
// 21e: checkcast java/lang/CharSequence
// 221: sipush 1320
// 224: ldc2_w 7266477864975361677
// 227: lload 2
// 228: lxor
// 229: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: checkcast java/lang/CharSequence
// 231: bipush 0
// 232: bipush 2
// 233: aconst_null
// 234: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 237: iload 16
// 239: ifne 28c
// 23c: ifeq 271
// 23f: goto 24c
// 242: ldc2_w -2347110357767892749
// 245: lload 2
// 246: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: athrow
// 24c: aload 20
// 24e: sipush 5871
// 251: ldc2_w 5775982629747750245
// 254: lload 2
// 255: lxor
// 256: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: swap
// 25c: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 261: lload 14
// 263: invokestatic su/catlean/_r.J (Ljava/lang/String;J)V
// 266: return
// 267: ldc2_w -2347110357767892749
// 26a: lload 2
// 26b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 270: athrow
// 271: aload 19
// 273: checkcast java/lang/CharSequence
// 276: sipush 26328
// 279: ldc2_w 7526860079974810961
// 27c: lload 2
// 27d: lxor
// 27e: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 283: checkcast java/lang/CharSequence
// 286: bipush 0
// 287: bipush 2
// 288: aconst_null
// 289: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 28c: iload 16
// 28e: ifne 2f3
// 291: ifeq 2c6
// 294: goto 2a1
// 297: ldc2_w -2347110357767892749
// 29a: lload 2
// 29b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a0: athrow
// 2a1: aload 20
// 2a3: sipush 24332
// 2a6: ldc2_w 8713323386935753871
// 2a9: lload 2
// 2aa: lxor
// 2ab: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: swap
// 2b1: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 2b6: lload 14
// 2b8: invokestatic su/catlean/_r.J (Ljava/lang/String;J)V
// 2bb: return
// 2bc: ldc2_w -2347110357767892749
// 2bf: lload 2
// 2c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: athrow
// 2c6: aload 0
// 2c7: checkcast su/catlean/_g
// 2ca: aload 20
// 2cc: aload 19
// 2ce: sipush 9118
// 2d1: ldc2_w 9152116355317153822
// 2d4: lload 2
// 2d5: lxor
// 2d6: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2db: swap
// 2dc: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 2e1: bipush 0
// 2e2: bipush 2
// 2e3: aconst_null
// 2e4: lload 8
// 2e6: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 2e9: getstatic su/catlean/c7.b Lsu/catlean/c7;
// 2ec: lload 4
// 2ee: aload 20
// 2f0: invokevirtual su/catlean/c7.Y (JLjava/lang/String;)Z
// 2f3: ifeq 307
// 2f6: aload 1
// 2f7: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 2fa: goto 307
// 2fd: ldc2_w -2347110357767892749
// 300: lload 2
// 301: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: athrow
// 307: return
}

@NotNull
public final String O(long a, @NotNull String input) {
ax = a ^ ax;
long var4 = ax ^ 59344671560624L;
long var10001 = ax ^ 127834911832081L;
int var6 = (int)((ax ^ 127834911832081L) >>> 32);
int var7 = (int)((ax ^ 127834911832081L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
int var10000 = vm.a<"Å">(8466931062649340011L, ax);
Intrinsics.checkNotNullParameter(input, b<"t">(28745, 3182889768727951810L ^ ax));
int var9 = var10000;
byte[] var17 = input.getBytes(Charsets.UTF_8);
Intrinsics.checkNotNullExpressionValue(var17, b<"t">(18296, 1479480160093572803L ^ ax));
byte[] var10 = var17;
String var12 = this.z(var6, var7, (short)var8);
byte[] var18 = var12.getBytes(Charsets.UTF_8);
Intrinsics.checkNotNullExpressionValue(var18, b<"t">(31553, 4241366092871086846L ^ ax));
byte[] var11 = var18;
byte[] var16 = new byte[var10.length];
int var13 = 0;
int var14 = var10.length;

while (var13 < var14) {
var16[var13] = (byte)(var10[var13] ^ var11[var13 % var11.length]);
var13++;
var10000 = var9;

while (var10000 != 0) {
var10000 = 2;
if (ax >= 0L) {
vm.a<"Å">(new _g[2], 8464458629204246346L, ax);
return b<"t">(10086, 46560303089184458L ^ ax) + this.T(var4, var16) + b<"t">(10699, 5957051652998553723L ^ ax);
}
}
}

return b<"t">(10086, 46560303089184458L ^ ax) + this.T(var4, var16) + b<"t">(10699, 5957051652998553723L ^ ax);
}

// $VF: Irreducible bytecode was duplicated to produce valid code
@NotNull
public final String r(@NotNull String input, long a) {
ax = a ^ ax;
long var4 = ax ^ 81646555400995L;
long var10001 = ax ^ 72425302237805L;
int var6 = (int)((ax ^ 72425302237805L) >>> 32);
int var7 = (int)((ax ^ 72425302237805L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(input, b<"t">(1990, 1125539741428651062L ^ ax));
int var10000 = vm.a<"Å">(-5830451990470705782L, ax);
byte[] var10 = this.q(input, var4);
int var9 = var10000;
String var12 = this.z(var6, var7, (short)var8);
byte[] var19 = var12.getBytes(Charsets.UTF_8);
Intrinsics.checkNotNullExpressionValue(var19, b<"t">(31553, 4241386309435549826L ^ ax));
byte[] var11 = var19;
byte[] var18 = new byte[var10.length];
int var13 = 0;
int var14 = var10.length;

while (true) {
if (var13 < var14) {
var18[var13] = (byte)(var10[var13] ^ var11[var13 % var11.length]);
var13++;
if (var9 != 0) {
continue;
}
}

do {
try {
if (ax > 0L) {
String var20 = new String(var18, Charsets.UTF_8);
if (ax >= 0L && vm.a<"Å">(-5801235141370007060L, ax) != null) {
vm.a<"Å">(++var9, -5781630436671068325L, ax);
}

return var20;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -5822308981036113747L, ax);
}
} while (var9 != 0);
}
}

@NotNull
public final String T(long a, @NotNull byte[] bytes) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(bytes, b<"t">(32692, 7986119169587256987L ^ ax));
String var10000 = Base64.getEncoder().encodeToString(bytes);
Intrinsics.checkNotNullExpressionValue(var10000, b<"t">(25464, 6971036100515431018L ^ ax));
return StringsKt.replace$default(
StringsKt.replace$default(
StringsKt.replace$default(var10000, (char)c<"b">(17067, 2314159550092639152L ^ ax), (char)c<"b">(18435, 6031319534558834969L ^ ax), false, 4, null),
(char)c<"b">(15489, 8490916326258705816L ^ ax),
(char)c<"b">(13237, 6205662011046202020L ^ ax),
false,
4,
null
),
(char)c<"b">(4852, 3024953357691694050L ^ ax),
(char)c<"b">(28600, 4800303708453197479L ^ ax),
false,
4,
null
);
}

@NotNull
public final byte[] q(@NotNull String string, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(string, b<"t">(24931, 760366038933013176L ^ ax));
byte[] var10000 = Base64.getDecoder()
.decode(
StringsKt.replace$default(
StringsKt.replace$default(
StringsKt.replace$default(string, (char)c<"b">(19005, 4273569269232759234L ^ ax), (char)c<"b">(14718, 1746807281443242626L ^ ax), false, 4, null),
(char)c<"b">(19457, 3778517472278149115L ^ ax),
(char)c<"b">(28331, 6122812239530743123L ^ ax),
false,
4,
null
),
(char)c<"b">(29547, 5281366441604008080L ^ ax),
(char)c<"b">(22030, 6477339378694909439L ^ ax),
false,
4,
null
)
);
Intrinsics.checkNotNullExpressionValue(var10000, b<"t">(31902, 1874711614888353622L ^ ax));
return var10000;
}

@NotNull
public final String K(@NotNull String notSolved, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/es.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 21959935412490
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w -7135049283976425881
// 012: lload 2
// 013: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 1
// 019: sipush 16211
// 01c: ldc2_w 8813889784640511810
// 01f: lload 2
// 020: lxor
// 021: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: new java/util/concurrent/atomic/AtomicReference
// 02c: dup
// 02d: sipush 21218
// 030: ldc2_w 7329193712362025665
// 033: lload 2
// 034: lxor
// 035: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: invokespecial java/util/concurrent/atomic/AtomicReference.<init> (Ljava/lang/Object;)V
// 03d: astore 7
// 03f: istore 6
// 041: lload 4
// 043: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 046: invokevirtual net/minecraft/class_634.method_45732 ()Ljava/util/Collection;
// 049: dup
// 04a: sipush 16866
// 04d: ldc2_w 5777257350700458458
// 050: lload 2
// 051: lxor
// 052: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 05a: checkcast java/lang/Iterable
// 05d: astore 8
// 05f: bipush 0
// 060: istore 9
// 062: aload 8
// 064: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 069: astore 10
// 06b: aload 10
// 06d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 072: ifeq 102
// 075: aload 10
// 077: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 07c: astore 11
// 07e: aload 11
// 080: checkcast net/minecraft/class_640
// 083: astore 12
// 085: bipush 0
// 086: istore 13
// 088: iload 6
// 08a: lload 2
// 08b: lconst_0
// 08c: lcmp
// 08d: ifle 0ff
// 090: ifeq 0fd
// 093: aload 1
// 094: checkcast java/lang/CharSequence
// 097: aload 12
// 099: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
// 09c: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 09f: dup
// 0a0: sipush 13948
// 0a3: ldc2_w 1237854324876580437
// 0a6: lload 2
// 0a7: lxor
// 0a8: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b0: checkcast java/lang/CharSequence
// 0b3: iload 6
// 0b5: lload 2
// 0b6: lconst_0
// 0b7: lcmp
// 0b8: ifle 112
// 0bb: ifeq 10f
// 0be: goto 0cb
// 0c1: ldc2_w -7143231961720515776
// 0c4: lload 2
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: bipush 0
// 0cc: bipush 2
// 0cd: aconst_null
// 0ce: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 0d1: ifeq 0fb
// 0d4: goto 0e1
// 0d7: ldc2_w -7143231961720515776
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: aload 7
// 0e3: aload 12
// 0e5: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
// 0e8: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 0eb: invokevirtual java/util/concurrent/atomic/AtomicReference.set (Ljava/lang/Object;)V
// 0ee: goto 0fb
// 0f1: ldc2_w -7143231961720515776
// 0f4: lload 2
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: nop
// 0fc: nop
// 0fd: iload 6
// 0ff: ifne 06b
// 102: nop
// 103: aload 7
// 105: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
// 108: lload 2
// 109: lconst_0
// 10a: lcmp
// 10b: ifle 07c
// 10e: dup
// 10f: sipush 13764
// 112: ldc2_w 1572046291533633004
// 115: lload 2
// 116: lxor
// 117: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/es.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 11f: checkcast java/lang/String
// 122: areturn
}

static {
long var20 = a ^ 108478741258037L;
long var22 = var20 ^ 37073050226401L;
long var24 = var20 ^ 100025273819852L;
long var26 = var20 ^ 16121081972478L;
long var10001 = var20 ^ 47922878195181L;
int var28 = (int)((var20 ^ 47922878195181L) >>> 32);
int var29 = (int)((var20 ^ 47922878195181L) << 32 >>> 48);
int var30 = (int)(var10001 << 48 >>> 48);
long var31 = var20 ^ 73876825150729L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[49];
int var16 = 0;
String var15 = "!\u0007\u0004¢pÑ¤ì\bÒv\u009cr\u000bGóåj½\u0018e«¹\u0015\u00825ýV\u0085æÍÜ\u0093³RØDAAèÏÞ¦R·¹\u0090\u0010\u0018ð´\u0088¦s\u0091\u008d a\fª\u0094{\"¯çmvù\u009b?ÄÛ\u001c \u0005â\u001c¶7i\u0088\u0012\u008bíÀÒÇÄõ\u0006ú;\t¤_¼\u0007\u0080\u0098±\u00861%ç@Z\u0018m6®\u0006î!\n º¤)~t\u0084GÕ\fq\u008f\u0085.\u0013Ná\u0010#\u009e\u001cô\u0092\r9\u0097\u0080\u0089·\u0096mú¯Í\u0010Êó\u001dl7T¬»×\u0094Fß\u008b\u008aØ\u0092\u0010>\u0005{2½nsqÜÒÁå\u000e\u008daI\u0010m\u001d\u0004P0ª\n\u000f\u009aÃ\"\u0083©©ÏÌ\u0010é;7\u0092\u001bí©Ê\u008dï\u0017 ÅÿRÙ\u0018\u0006¿\u0013\u001di0\b~¿Nh/L\u0089ýê4í-Õ5(æÝ\u0010£6\u001f\u0016GMªûø\u0086¿J=°Îæ\u0010\u0081 Çr_ër\u0084àÌ»A^\u0098f\u00830ç8cz\u0086Ù'þ,»Ú~²Q\u0000\u008dÕ\u000fßÃçã\u0006ý;\u009fç7\u008e9[iRO8\u0011\u009fÃ\u008a³ÆÅèÁP\u0094\u0090¦8o¬¹\u0084Að§WK=ì£\u0001Bâ(ç½\u0097tf5ÞQ§ÊõE\u009e±gí5\u000e½C´T0\u001cïs\u000fd\u008cþn\u0019\u001dÆö-2OóÐ\u0010épéH«Õg\u0019~\u0088i:Ú\u008b`\u0017\u0010ªÙIÀL\u0015\u0013È>\u0090³\u0013\u0093ëGO\u0018Úg1\u0088íQE\u0013Î\u0019úÿRíà*\"8\u0098Õë3\r| %+\u0088<\u0088%úÕ\u009e|3\u0007=yX\n$o¡U,\u001fÕY,X\u0092\u00ad®aº\u009f Îaî\u0083ü³\u0093_\u0014þ\u009d<Æ0sí\u0017ïl\u009f<*;\u0099\u0010PýÂ\u009d\u0089?¼ \u0002T#êâ\u008bQ'¬\u0090²]»PV@£¶E\u0088í° .Úb\u0089#h\u0080\u0089\u0085!ÇI\u000e\u0094õ\";[Ïçt¡ \u009f\u0092Á7å0'8}\u000e\u0019´ÉùÑI°ëÞ§&9\u0014\u0085[ô\u008bW#\u0000J`a\u001d%j\u0003iO-\u0093Ñ=D\u0097\u0017ßðð\u0082p\u0098¶Ó\u0006d\u009b\u0094\r¬Ñp=\u008a×\u000fÞ\nQöÛ¯Ù\u0010\u0081xcSº\rê1\u001bO@~¬\u0090tjº\t2X\u008c\u000ehî\u001cvo\u0086Åÿ\u0080&Yöy\u009dg\u0084¯1\u0018<e&Fíõ\u009c\u0001¤¥\u0092'\u00adaé]\u0001²\u001fJ(\u0004õÞ \u009føâ¢ï»_1\u001b¯ñFÄ\u0098:\u008cë=\u0084¬\u0007C\u001d5\u000fËA?\u0094Áu\u001c\u0018\u0019ÏLìî~\u008fEÓ\u0004c¾\u0094\u0016)=q¸Ólõ\u008d-\u008f\u0010\u0097\\GXI\u0002N\u0094\u0002\t³Ágsw¦\u0010\u0012\u0089§À5Î\\\u0084;a\nTþ~6\u0018\u0010×\u0082\u0081jÛ\u0081|/\u009f`t\u0092\u009b\\rO\u0010XyÆÓ\u0086-\u008bhØ¢Uþ0ÛÝ¸\u0018ÌuËà·\u0000Åê\u0007\u0088\u0015\u0082Æã#ü£\u0090k^AúüT(óZøÛa,\u009c»\u0085Éi\u0013ZÀCüð\u0014\u009fs\u0084\\Ä\u008b\u0092¶{Àáâ\u0012\u0082\u0082dSýV\u009d¨¡\u0010\u008d)\u0086\u0002\u009cB,\u0098ùÒ\u0098`\u0086 \u0080\u0006\u0010*\u000fµ\u001a®ÅÀ»C\u0004 5@5\u0083ô 6,[ÔF\u0085D'¨¡\u0098h7\rì3ý.é¦±\rcr&¶cé\u001d\u0080½\u000b0ï\u0003\u000b©E,ÄT\u0005y©Ôºk\u0083ä¬³ÈøÚÄÜªm\u0005ú\u008a~¯p¢\u0012\u0001\u0089¶\u0086=ò\"4Ý£\"\u001aú\u00971\u0010Ð\fv9{Ê-ÓA·\u0091+)P\u000b\u0018\u0010\u0003¹\u0095²q'\u009dLÒ\u009b\u0093\u008fà\fí\u009f EÌmÉM¬Y*ôlMÂ©t\u00ad\nkCO\u0000\u0093+\u000f=\u009b?\u008e\u0016\nø\u0004\u009e\u0010w>\u000b\u008e±\u008e\u008c\u00810|üS\u0087éqk\u0010\u0084k\u009ffjx£\u00891õwa\u0094{90\u0018Pu1\u0086É\u00ad\u000e{äêg,ÂJ\r/8\rù\u0093ûóìÃ\u0090¸ÅÙ\u000eß·2Êù\b\u0013>®ñ°ßE ý§1_´\u001enèlñà÷\u0094ªyK\u0089\u0010`ë¤]{ðJÅ}Ág\u0011+FnË=c5Ký5Ý#9ÿï=Ø¢ò\u0092L<\u00adÛAU\u008dÇËè\u009a®]\u001c¨÷lSÈ\u0015\u008e:0À\u0017\u0098\u000eð\\\u000e\u0017m.ô'¹&\u001fõ¥K\u000fsïx*\u0081ýhåËzBÚX\u0018y\t«ätçÄn\u0080{ÛF\u0011\u0011¼ë\u0010\u0000ì¬\u0018GnGâ\u001d\u0004¶\u008dÇ\u001fÛh¨½\u0086\u008f\u009c^ÿÅÝW¤\u0090 \u0080ø\u0018§uÒ?\u0017³àñ±¢\u0080¡\r÷xïP«Äº\u001c\u0090î\u0000Ã\u0094/\u0012\u008f\u0010OÎ\u008b\u008d!\u009c´\u0091XfÄü\"Ò¡\u0006\u0010¿\u0013>\u000e¹\u008dëøûKL\bx?ô\n\u0018µgÎ¡k+¯uwV\u001f¾\u0097\u0003RÖÐ\u0001\u001fç\"¤]Í\u00100_\u0092\u0088u<g\u008aegcl)ã\f\u008b\u0018ñ\u0004²4&\u0001ìÎdð¼\u0084í\u0017S`\u008bT<úhÙ/X";
int var17 = "!\u0007\u0004¢pÑ¤ì\bÒv\u009cr\u000bGóåj½\u0018e«¹\u0015\u00825ýV\u0085æÍÜ\u0093³RØDAAèÏÞ¦R·¹\u0090\u0010\u0018ð´\u0088¦s\u0091\u008d a\fª\u0094{\"¯çmvù\u009b?ÄÛ\u001c \u0005â\u001c¶7i\u0088\u0012\u008bíÀÒÇÄõ\u0006ú;\t¤_¼\u0007\u0080\u0098±\u00861%ç@Z\u0018m6®\u0006î!\n º¤)~t\u0084GÕ\fq\u008f\u0085.\u0013Ná\u0010#\u009e\u001cô\u0092\r9\u0097\u0080\u0089·\u0096mú¯Í\u0010Êó\u001dl7T¬»×\u0094Fß\u008b\u008aØ\u0092\u0010>\u0005{2½nsqÜÒÁå\u000e\u008daI\u0010m\u001d\u0004P0ª\n\u000f\u009aÃ\"\u0083©©ÏÌ\u0010é;7\u0092\u001bí©Ê\u008dï\u0017 ÅÿRÙ\u0018\u0006¿\u0013\u001di0\b~¿Nh/L\u0089ýê4í-Õ5(æÝ\u0010£6\u001f\u0016GMªûø\u0086¿J=°Îæ\u0010\u0081 Çr_ër\u0084àÌ»A^\u0098f\u00830ç8cz\u0086Ù'þ,»Ú~²Q\u0000\u008dÕ\u000fßÃçã\u0006ý;\u009fç7\u008e9[iRO8\u0011\u009fÃ\u008a³ÆÅèÁP\u0094\u0090¦8o¬¹\u0084Að§WK=ì£\u0001Bâ(ç½\u0097tf5ÞQ§ÊõE\u009e±gí5\u000e½C´T0\u001cïs\u000fd\u008cþn\u0019\u001dÆö-2OóÐ\u0010épéH«Õg\u0019~\u0088i:Ú\u008b`\u0017\u0010ªÙIÀL\u0015\u0013È>\u0090³\u0013\u0093ëGO\u0018Úg1\u0088íQE\u0013Î\u0019úÿRíà*\"8\u0098Õë3\r| %+\u0088<\u0088%úÕ\u009e|3\u0007=yX\n$o¡U,\u001fÕY,X\u0092\u00ad®aº\u009f Îaî\u0083ü³\u0093_\u0014þ\u009d<Æ0sí\u0017ïl\u009f<*;\u0099\u0010PýÂ\u009d\u0089?¼ \u0002T#êâ\u008bQ'¬\u0090²]»PV@£¶E\u0088í° .Úb\u0089#h\u0080\u0089\u0085!ÇI\u000e\u0094õ\";[Ïçt¡ \u009f\u0092Á7å0'8}\u000e\u0019´ÉùÑI°ëÞ§&9\u0014\u0085[ô\u008bW#\u0000J`a\u001d%j\u0003iO-\u0093Ñ=D\u0097\u0017ßðð\u0082p\u0098¶Ó\u0006d\u009b\u0094\r¬Ñp=\u008a×\u000fÞ\nQöÛ¯Ù\u0010\u0081xcSº\rê1\u001bO@~¬\u0090tjº\t2X\u008c\u000ehî\u001cvo\u0086Åÿ\u0080&Yöy\u009dg\u0084¯1\u0018<e&Fíõ\u009c\u0001¤¥\u0092'\u00adaé]\u0001²\u001fJ(\u0004õÞ \u009føâ¢ï»_1\u001b¯ñFÄ\u0098:\u008cë=\u0084¬\u0007C\u001d5\u000fËA?\u0094Áu\u001c\u0018\u0019ÏLìî~\u008fEÓ\u0004c¾\u0094\u0016)=q¸Ólõ\u008d-\u008f\u0010\u0097\\GXI\u0002N\u0094\u0002\t³Ágsw¦\u0010\u0012\u0089§À5Î\\\u0084;a\nTþ~6\u0018\u0010×\u0082\u0081jÛ\u0081|/\u009f`t\u0092\u009b\\rO\u0010XyÆÓ\u0086-\u008bhØ¢Uþ0ÛÝ¸\u0018ÌuËà·\u0000Åê\u0007\u0088\u0015\u0082Æã#ü£\u0090k^AúüT(óZøÛa,\u009c»\u0085Éi\u0013ZÀCüð\u0014\u009fs\u0084\\Ä\u008b\u0092¶{Àáâ\u0012\u0082\u0082dSýV\u009d¨¡\u0010\u008d)\u0086\u0002\u009cB,\u0098ùÒ\u0098`\u0086 \u0080\u0006\u0010*\u000fµ\u001a®ÅÀ»C\u0004 5@5\u0083ô 6,[ÔF\u0085D'¨¡\u0098h7\rì3ý.é¦±\rcr&¶cé\u001d\u0080½\u000b0ï\u0003\u000b©E,ÄT\u0005y©Ôºk\u0083ä¬³ÈøÚÄÜªm\u0005ú\u008a~¯p¢\u0012\u0001\u0089¶\u0086=ò\"4Ý£\"\u001aú\u00971\u0010Ð\fv9{Ê-ÓA·\u0091+)P\u000b\u0018\u0010\u0003¹\u0095²q'\u009dLÒ\u009b\u0093\u008fà\fí\u009f EÌmÉM¬Y*ôlMÂ©t\u00ad\nkCO\u0000\u0093+\u000f=\u009b?\u008e\u0016\nø\u0004\u009e\u0010w>\u000b\u008e±\u008e\u008c\u00810|üS\u0087éqk\u0010\u0084k\u009ffjx£\u00891õwa\u0094{90\u0018Pu1\u0086É\u00ad\u000e{äêg,ÂJ\r/8\rù\u0093ûóìÃ\u0090¸ÅÙ\u000eß·2Êù\b\u0013>®ñ°ßE ý§1_´\u001enèlñà÷\u0094ªyK\u0089\u0010`ë¤]{ðJÅ}Ág\u0011+FnË=c5Ký5Ý#9ÿï=Ø¢ò\u0092L<\u00adÛAU\u008dÇËè\u009a®]\u001c¨÷lSÈ\u0015\u008e:0À\u0017\u0098\u000eð\\\u000e\u0017m.ô'¹&\u001fõ¥K\u000fsïx*\u0081ýhåËzBÚX\u0018y\t«ätçÄn\u0080{ÛF\u0011\u0011¼ë\u0010\u0000ì¬\u0018GnGâ\u001d\u0004¶\u008dÇ\u001fÛh¨½\u0086\u008f\u009c^ÿÅÝW¤\u0090 \u0080ø\u0018§uÒ?\u0017³àñ±¢\u0080¡\r÷xïP«Äº\u001c\u0090î\u0000Ã\u0094/\u0012\u008f\u0010OÎ\u008b\u008d!\u009c´\u0091XfÄü\"Ò¡\u0006\u0010¿\u0013>\u000e¹\u008dëøûKL\bx?ô\n\u0018µgÎ¡k+¯uwV\u001f¾\u0097\u0003RÖÐ\u0001\u001fç\"¤]Í\u00100_\u0092\u0088u<g\u008aegcl)ã\f\u008b\u0018ñ\u0004²4&\u0001ìÎdð¼\u0084í\u0017S`\u008bT<úhÙ/X"
.length();
char var14 = '0';
int var36 = -1;

label54:
while (true) {
String var37 = var15.substring(++var36, var36 + var14);
byte var41 = -1;

while (true) {
byte[] var19 = var11.doFinal(var37.getBytes("ISO-8859-1"));
String var49 = b(var19).intern();
switch (var41) {
case 0:
var18[var16++] = var49;
if ((var36 += var14) >= var17) {
b = var18;
c = new String[49];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[16];
int var3 = 0;
String var4 = "×\u008d#\u009a\u0016 &U\u0003ì\"@Õ*|[#\u0005W¢c®¤Úã\u007fç\u0092\b\u0091\u0099¸\u008dß}#: \u009a\u0017\u0099¥*Ö\u001d×Ü¶\u009d!vþ\u00ad£ò\u0000/\u000fà¹N\u0099¦\u0005\u0082¶\u001c½\bØ)ùDs\u0010Ç\u001f\u008a:$\u0099ò¼\u0087(Å\u0011gÃJß+:w,KÚÅ\b\u0006\u0002\u008a\u0099\u00887\u001a´ñUI\u00049";
int var5 = "×\u008d#\u009a\u0016 &U\u0003ì\"@Õ*|[#\u0005W¢c®¤Úã\u007fç\u0092\b\u0091\u0099¸\u008dß}#: \u009a\u0017\u0099¥*Ö\u001d×Ü¶\u009d!vþ\u00ad£ò\u0000/\u000fà¹N\u0099¦\u0005\u0082¶\u001c½\bØ)ùDs\u0010Ç\u001f\u008a:$\u0099ò¼\u0087(Å\u0011gÃJß+:w,KÚÅ\b\u0006\u0002\u008a\u0099\u00887\u001a´ñUI\u00049"
.length();
byte var2 = 0;

label36:
while (true) {
byte var45 = var2;
var2 += 8;
byte[] var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
long[] var40 = var6;
int var46 = var3++;
long var53 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var56 = -1;

while (true) {
long var8 = var53;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var58 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var56) {
case 0:
var40[var46] = var58;
if (var2 >= var5) {
f = var6;
h = new Integer[16];
KProperty[] var33 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(es.class, b<"t">(12419, 7574436192642787650L ^ var20), b<"t">(32239, 2046912359115990020L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(es.class, b<"t">(11755, 8811628373723739172L ^ var20), b<"t">(1949, 5053422642017787511L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(es.class, b<"t">(31456, 3582379696984597251L ^ var20), b<"t">(18522, 926553268695994770L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(es.class, b<"t">(20392, 6033301022599190081L ^ var20), b<"t">(18718, 4021228784432255194L ^ var20), 0))
};
I = var33;
y = new es(var22);
F = yp.x(
y,
b<"t">(19477, 3109441337271817704L ^ var20),
b<"t">(13142, 2212263074683546267L ^ var20),
null,
null,
c<"b">(14326, 7630411782147159614L ^ var20),
var31,
null
);
d = yp.J(
y,
b<"t">(10540, 2605600277256925415L ^ var20),
new lj(0, false, var26, false, c<"b">(19310, 8384756746372467369L ^ var20), null),
null,
var28,
null,
var29,
(char)var30,
c<"b">(10087, 6060062798399219370L ^ var20),
null
);
U = yp.J(
y,
b<"t">(19013, 5912985173578159036L ^ var20),
new lj(0, false, var26, false, c<"b">(30807, 153447650633578910L ^ var20), null),
null,
var28,
null,
var29,
(char)var30,
c<"b">(10087, 6060062798399219370L ^ var20),
null
);
g = yp.t(y, b<"t">(28453, 8659378660940887773L ^ var20), false, var24, null, null, c<"b">(10087, 6060062798399219370L ^ var20), null);
L = new AtomicBoolean(false);
return;
}
break;
default:
var40[var46] = var58;
if (var2 < var5) {
continue label36;
}

var4 = "V\u0092\u001aéö?EG»\u0004ý¦\fÈ\u0000\u008a";
var5 = "V\u0092\u001aéö?EG»\u0004ý¦\fÈ\u0000\u008a".length();
var2 = 0;
}

byte var47 = var2;
var2 += 8;
var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var40 = var6;
var46 = var3++;
var53 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var56 = 0;
}
}
}

var14 = var15.charAt(var36);
break;
default:
var18[var16++] = var49;
if ((var36 += var14) < var17) {
var14 = var15.charAt(var36);
continue label54;
}

var15 = "i\u0007ÉF\u008au\u008cqÍ\u008cyP6å?\u007fyl\u0094?\u0081æz+p?¥sÌxG\u008ap×\u009b\u00008}çCâìª§\u0000I»EÂ:\u0015¨¶±cz\u0010\u001cã¡\u0095H<\u008as®\u0085ð^pôý¯";
var17 = "i\u0007ÉF\u008au\u008cqÍ\u008cyP6å?\u007fyl\u0094?\u0081æz+p?¥sÌxG\u008ap×\u009b\u00008}çCâìª§\u0000I»EÂ:\u0015¨¶±cz\u0010\u001cã¡\u0095H<\u008as®\u0085ð^pôý¯"
.length();
var14 = '8';
var36 = -1;
}

var37 = var15.substring(++var36, var36 + var14);
var41 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15865;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/es", var10);
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
throw new RuntimeException("su/catlean/es" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26072;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/es", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/es" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
