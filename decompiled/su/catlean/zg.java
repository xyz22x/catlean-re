package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_310;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.MinecraftAccessor;

public final class zg implements ym {
@NotNull
public static final zg v;
@Nullable
private static Function0 Z;
private static int D;
private static boolean V;
@NotNull
private static final Map F;
private static final long a = yz.a(-4990807395987353533L, 5101663738302633781L, MethodHandles.lookup().lookupClass()).a(239882848715930L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private zg() {
}

@NotNull
public final List h(char var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 82464603893790L;
return yl.g.c().c(var6);
}

public final boolean B(@NotNull wl macro, long a) {
ax = a ^ ax;
long var10001 = ax ^ 127835402816588L;
int var4 = (int)((ax ^ 127835402816588L) >>> 48);
int var5 = (int)((ax ^ 127835402816588L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(macro, a<"b">(16634, 6585005960992548915L ^ ax));
return this.h((char)var4, var5, var6).add(macro);
}

public final boolean u(int a, byte a, int a, @NotNull wl macro) {
long var5 = ((long)axxx << 32 | (long)ax << 56 >>> 32 | (long)axx << 40 >>> 40) ^ a;
long var10001 = var5 ^ 115547240828018L;
int var7 = (int)((var5 ^ 115547240828018L) >>> 48);
int var8 = (int)((var5 ^ 115547240828018L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(macro, a<"b">(8687, 2297804857497536784L ^ var5));
return this.h((char)var7, var8, var9).remove(macro);
}

@Flow
private final void g(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zg.a J
// 003: ldc2_w 126642252491583
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 71883817864335
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 14303357977293
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 42305493219926
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w -1661752341916390930
// 022: lload 2
// 023: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: istore 10
// 02a: getstatic su/catlean/zg.Z Lkotlin/jvm/functions/Function0;
// 02d: ifnull 113
// 030: getstatic su/catlean/zg.D I
// 033: iload 10
// 035: ifeq 097
// 038: goto 045
// 03b: ldc2_w -1706557560644257709
// 03e: lload 2
// 03f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: athrow
// 045: tableswitch 206 0 1 33 90
// 05c: ldc2_w -1706557560644257709
// 05f: lload 2
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 069: bipush 1
// 06a: invokevirtual su/catlean/_6.h (Z)V
// 06d: lload 8
// 06f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 072: invokevirtual net/minecraft/class_746.method_5624 ()Z
// 075: putstatic su/catlean/zg.V Z
// 078: lload 8
// 07a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07d: bipush 0
// 07e: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 081: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 084: lload 6
// 086: invokevirtual su/catlean/dm.D (J)V
// 089: bipush 1
// 08a: goto 097
// 08d: ldc2_w -1706557560644257709
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: putstatic su/catlean/zg.D I
// 09a: iload 10
// 09c: ifne 113
// 09f: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 0a2: bipush 1
// 0a3: invokevirtual su/catlean/_6.h (Z)V
// 0a6: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 0a9: bipush 1
// 0aa: invokevirtual su/catlean/_n.m (Z)V
// 0ad: getstatic su/catlean/zg.Z Lkotlin/jvm/functions/Function0;
// 0b0: iload 10
// 0b2: ifeq 0e5
// 0b5: goto 0c2
// 0b8: ldc2_w -1706557560644257709
// 0bb: lload 2
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: dup
// 0c3: ifnull 0e9
// 0c6: goto 0d3
// 0c9: ldc2_w -1706557560644257709
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 0d8: goto 0e5
// 0db: ldc2_w -1706557560644257709
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: pop
// 0e6: goto 0ea
// 0e9: pop
// 0ea: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 0ed: bipush 0
// 0ee: invokevirtual su/catlean/_n.m (Z)V
// 0f1: getstatic su/catlean/_6.d Lsu/catlean/_6;
// 0f4: bipush 1
// 0f5: invokevirtual su/catlean/_6.h (Z)V
// 0f8: lload 8
// 0fa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fd: getstatic su/catlean/zg.V Z
// 100: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 103: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 106: lload 4
// 108: invokevirtual su/catlean/dm.F (J)V
// 10b: bipush 0
// 10c: putstatic su/catlean/zg.D I
// 10f: aconst_null
// 110: putstatic su/catlean/zg.Z Lkotlin/jvm/functions/Function0;
// 113: return
}

@Flow
private final void i(InputEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zg.a J
// 003: ldc2_w 134110776761398
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 13231202468729
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 66354250274877
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 40
// 029: lshl
// 02a: bipush 40
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 41327964599273
// 035: lxor
// 036: dup2
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 16
// 040: lshl
// 041: bipush 32
// 043: lushr
// 044: l2i
// 045: istore 10
// 047: dup2
// 048: bipush 48
// 04a: lshl
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 11
// 051: pop2
// 052: pop2
// 053: ldc2_w 6868425812964243850
// 056: lload 2
// 057: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: istore 13
// 05e: aload 1
// 05f: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 062: bipush -1
// 063: if_icmpeq 0e9
// 066: lload 4
// 068: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06b: iload 13
// 06d: ifne 0a2
// 070: goto 07d
// 073: ldc2_w 6870272187837058906
// 076: lload 2
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 080: ifnull 0e9
// 083: goto 090
// 086: ldc2_w 6870272187837058906
// 089: lload 2
// 08a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: athrow
// 090: lload 4
// 092: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 095: goto 0a2
// 098: ldc2_w 6870272187837058906
// 09b: lload 2
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: iload 13
// 0a4: ifne 0cc
// 0a7: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 0aa: ifnull 0e9
// 0ad: goto 0ba
// 0b0: ldc2_w 6870272187837058906
// 0b3: lload 2
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: lload 4
// 0bc: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0bf: goto 0cc
// 0c2: ldc2_w 6870272187837058906
// 0c5: lload 2
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0cf: ifnonnull 0e9
// 0d2: aload 1
// 0d3: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 0d6: getstatic su/catlean/api/event/events/client/InputEvent$Action.Hold Lsu/catlean/api/event/events/client/InputEvent$Action;
// 0d9: if_acmpne 0f4
// 0dc: goto 0e9
// 0df: ldc2_w 6870272187837058906
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: return
// 0ea: ldc2_w 6870272187837058906
// 0ed: lload 2
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: aload 0
// 0f5: iload 9
// 0f7: i2c
// 0f8: iload 10
// 0fa: iload 11
// 0fc: invokevirtual su/catlean/zg.h (CII)Ljava/util/List;
// 0ff: checkcast java/lang/Iterable
// 102: astore 14
// 104: nop
// 105: bipush 0
// 106: istore 15
// 108: aload 14
// 10a: astore 16
// 10c: new java/util/ArrayList
// 10f: dup
// 110: invokespecial java/util/ArrayList.<init> ()V
// 113: checkcast java/util/Collection
// 116: astore 17
// 118: bipush 0
// 119: istore 18
// 11b: aload 16
// 11d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 122: astore 19
// 124: aload 19
// 126: invokeinterface java/util/Iterator.hasNext ()Z 1
// 12b: ifeq 1b6
// 12e: aload 19
// 130: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 135: astore 20
// 137: aload 20
// 139: checkcast su/catlean/wl
// 13c: astore 21
// 13e: bipush 0
// 13f: istore 22
// 141: aload 21
// 143: invokeinterface su/catlean/wl.X ()Lsu/catlean/lj; 1
// 148: invokevirtual su/catlean/lj.X ()I
// 14b: iload 13
// 14d: ifne 1c3
// 150: iload 13
// 152: ifne 18a
// 155: goto 162
// 158: ldc2_w 6870272187837058906
// 15b: lload 2
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: aload 1
// 163: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 166: if_icmpne 1a3
// 169: goto 176
// 16c: ldc2_w 6870272187837058906
// 16f: lload 2
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: aload 21
// 178: invokeinterface su/catlean/wl.I ()Z 1
// 17d: goto 18a
// 180: ldc2_w 6870272187837058906
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: iload 13
// 18c: ifne 1a0
// 18f: ifeq 1a3
// 192: goto 19f
// 195: ldc2_w 6870272187837058906
// 198: lload 2
// 199: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: athrow
// 19f: bipush 1
// 1a0: goto 1a4
// 1a3: bipush 0
// 1a4: ifeq 124
// 1a7: aload 17
// 1a9: aload 20
// 1ab: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1b0: pop
// 1b1: iload 13
// 1b3: ifeq 124
// 1b6: aload 17
// 1b8: checkcast java/util/List
// 1bb: nop
// 1bc: checkcast java/lang/Iterable
// 1bf: astore 14
// 1c1: nop
// 1c2: bipush 0
// 1c3: istore 15
// 1c5: aload 14
// 1c7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1cc: astore 16
// 1ce: aload 16
// 1d0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1d5: ifeq 238
// 1d8: aload 16
// 1da: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1df: astore 17
// 1e1: aload 17
// 1e3: checkcast su/catlean/wl
// 1e6: astore 18
// 1e8: bipush 0
// 1e9: istore 19
// 1eb: getstatic su/catlean/zg.v Lsu/catlean/zg;
// 1ee: astore 20
// 1f0: bipush 0
// 1f1: istore 21
// 1f3: iload 13
// 1f5: ifne 239
// 1f8: aload 20
// 1fa: aload 18
// 1fc: aload 1
// 1fd: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 200: getstatic su/catlean/api/event/events/client/InputEvent$Action.Press Lsu/catlean/api/event/events/client/InputEvent$Action;
// 203: if_acmpne 221
// 206: goto 213
// 209: ldc2_w 6870272187837058906
// 20c: lload 2
// 20d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: athrow
// 213: bipush 1
// 214: goto 222
// 217: ldc2_w 6870272187837058906
// 21a: lload 2
// 21b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: athrow
// 221: bipush 0
// 222: istore 12
// 224: iload 6
// 226: i2b
// 227: iload 12
// 229: iload 7
// 22b: iload 8
// 22d: invokespecial su/catlean/zg.b (Lsu/catlean/wl;BZII)V
// 230: nop
// 231: nop
// 232: nop
// 233: iload 13
// 235: ifeq 1ce
// 238: nop
// 239: return
}

private final void b(wl param1, byte param2, boolean param3, int param4, int param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 56
// 004: lshl
// 005: iload 4
// 007: i2l
// 008: bipush 32
// 00a: lshl
// 00b: bipush 8
// 00d: lushr
// 00e: lor
// 00f: iload 5
// 011: i2l
// 012: bipush 40
// 014: lshl
// 015: bipush 40
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/zg.a J
// 01c: lxor
// 01d: lstore 6
// 01f: lload 6
// 021: dup2
// 022: ldc2_w 23612337823565
// 025: lxor
// 026: lstore 8
// 028: dup2
// 029: ldc2_w 100985830352383
// 02c: lxor
// 02d: lstore 10
// 02f: dup2
// 030: ldc2_w 119891568648833
// 033: lxor
// 034: lstore 12
// 036: pop2
// 037: ldc2_w -4221323537968929871
// 03a: lload 6
// 03c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 044: bipush 1
// 045: invokevirtual su/catlean/_n.m (Z)V
// 048: aload 1
// 049: astore 15
// 04b: istore 14
// 04d: aload 15
// 04f: instanceof su/catlean/bp
// 052: iload 14
// 054: ifne 0b3
// 057: ifeq 0a0
// 05a: goto 068
// 05d: ldc2_w -4223452453007223455
// 060: lload 6
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: iload 5
// 06a: ifle 173
// 06d: iload 3
// 06e: ifeq 16c
// 071: goto 07f
// 074: ldc2_w -4223452453007223455
// 077: lload 6
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: aload 0
// 080: lload 10
// 082: aload 1
// 083: checkcast su/catlean/bp
// 086: invokespecial su/catlean/zg.x (JLsu/catlean/bp;)V
// 089: iload 2
// 08a: iflt 173
// 08d: iload 14
// 08f: ifeq 16c
// 092: goto 0a0
// 095: ldc2_w -4223452453007223455
// 098: lload 6
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: aload 15
// 0a2: instanceof su/catlean/ft
// 0a5: goto 0b3
// 0a8: ldc2_w -4223452453007223455
// 0ab: lload 6
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: iload 2
// 0b4: iflt 12e
// 0b7: iload 14
// 0b9: ifne 12e
// 0bc: ifeq 11b
// 0bf: goto 0cd
// 0c2: ldc2_w -4223452453007223455
// 0c5: lload 6
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: iload 2
// 0ce: iflt 173
// 0d1: iload 3
// 0d2: ifeq 16c
// 0d5: goto 0e3
// 0d8: ldc2_w -4223452453007223455
// 0db: lload 6
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 0e6: lload 12
// 0e8: bipush 0
// 0e9: sipush 5705
// 0ec: ldc2_w 4831876142420064702
// 0ef: lload 6
// 0f1: lxor
// 0f2: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: bipush 0
// 0f8: aload 1
// 0f9: invokedynamic run (Lsu/catlean/wl;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/zg.s (Lsu/catlean/wl;)V, ()V ]
// 0fe: bipush 5
// 0ff: aconst_null
// 100: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 103: iload 4
// 105: ifle 173
// 108: iload 14
// 10a: ifeq 16c
// 10d: goto 11b
// 110: ldc2_w -4223452453007223455
// 113: lload 6
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: aload 15
// 11d: instanceof su/catlean/nh
// 120: goto 12e
// 123: ldc2_w -4223452453007223455
// 126: lload 6
// 128: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: athrow
// 12e: iload 4
// 130: iflt 148
// 133: ifeq 159
// 136: aload 0
// 137: aload 1
// 138: checkcast su/catlean/nh
// 13b: iload 3
// 13c: lload 8
// 13e: invokespecial su/catlean/zg.j (Lsu/catlean/nh;ZJ)V
// 141: iload 4
// 143: iflt 173
// 146: iload 14
// 148: ifeq 16c
// 14b: goto 159
// 14e: ldc2_w -4223452453007223455
// 151: lload 6
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: new kotlin/NoWhenBranchMatchedException
// 15c: dup
// 15d: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 160: athrow
// 161: ldc2_w -4223452453007223455
// 164: lload 6
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 16f: bipush 0
// 170: invokevirtual su/catlean/_n.m (Z)V
// 173: return
}

private final void x(long param1, bp param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/zg.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 82656606187677
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -6756762447364414683
// 12: lload 1
// 13: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: istore 6
// 1a: iload 6
// 1c: ifeq 61
// 1f: aload 3
// 20: invokevirtual su/catlean/bp.p ()Ljava/lang/String;
// 23: ldc "/"
// 25: bipush 0
// 26: bipush 2
// 27: aconst_null
// 28: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
// 2b: ifeq 6c
// 2e: goto 3b
// 31: ldc2_w -6729930739060968808
// 34: lload 1
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: lload 4
// 3d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 40: getfield net/minecraft/class_746.field_3944 Lnet/minecraft/class_634;
// 43: aload 3
// 44: invokevirtual su/catlean/bp.p ()Ljava/lang/String;
// 47: ldc "/"
// 49: ldc ""
// 4b: bipush 0
// 4c: bipush 4
// 4d: aconst_null
// 4e: invokestatic kotlin/text/StringsKt.replaceFirst$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 51: invokevirtual net/minecraft/class_634.method_45730 (Ljava/lang/String;)V
// 54: goto 61
// 57: ldc2_w -6729930739060968808
// 5a: lload 1
// 5b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: athrow
// 61: lload 1
// 62: lconst_0
// 63: lcmp
// 64: ifle 7b
// 67: iload 6
// 69: ifne 88
// 6c: lload 4
// 6e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 71: getfield net/minecraft/class_746.field_3944 Lnet/minecraft/class_634;
// 74: aload 3
// 75: invokevirtual su/catlean/bp.p ()Ljava/lang/String;
// 78: invokevirtual net/minecraft/class_634.method_45729 (Ljava/lang/String;)V
// 7b: goto 88
// 7e: ldc2_w -6729930739060968808
// 81: lload 1
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: return
}

private final void L(ft param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zg.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 123756288686638
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 93576097639085
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 131571584866860
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 126225079658655
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 87682793979511
// 027: lxor
// 028: lstore 12
// 02a: dup2
// 02b: ldc2_w 58813131926444
// 02e: lxor
// 02f: lstore 14
// 031: dup2
// 032: ldc2_w 129462859015307
// 035: lxor
// 036: lstore 16
// 038: dup2
// 039: ldc2_w 24807622652373
// 03c: lxor
// 03d: lstore 18
// 03f: dup2
// 040: ldc2_w 138381820130305
// 043: lxor
// 044: lstore 20
// 046: dup2
// 047: ldc2_w 114502670407044
// 04a: lxor
// 04b: dup2
// 04c: bipush 32
// 04e: lushr
// 04f: l2i
// 050: istore 22
// 052: dup2
// 053: bipush 32
// 055: lshl
// 056: bipush 32
// 058: lushr
// 059: lstore 23
// 05b: pop2
// 05c: dup2
// 05d: ldc2_w 139303834286912
// 060: lxor
// 061: lstore 25
// 063: dup2
// 064: ldc2_w 69563563616414
// 067: lxor
// 068: dup2
// 069: bipush 32
// 06b: lushr
// 06c: l2i
// 06d: istore 27
// 06f: dup2
// 070: bipush 32
// 072: lshl
// 073: bipush 48
// 075: lushr
// 076: l2i
// 077: istore 28
// 079: dup2
// 07a: bipush 48
// 07c: lshl
// 07d: bipush 48
// 07f: lushr
// 080: l2i
// 081: istore 29
// 083: pop2
// 084: dup2
// 085: ldc2_w 57170376299710
// 088: lxor
// 089: lstore 30
// 08b: dup2
// 08c: ldc2_w 48934626119393
// 08f: lxor
// 090: dup2
// 091: bipush 48
// 093: lushr
// 094: l2i
// 095: istore 32
// 097: dup2
// 098: bipush 16
// 09a: lshl
// 09b: bipush 16
// 09d: lushr
// 09e: lstore 33
// 0a0: pop2
// 0a1: dup2
// 0a2: ldc2_w 64147219311911
// 0a5: lxor
// 0a6: lstore 35
// 0a8: dup2
// 0a9: ldc2_w 105968986378606
// 0ac: lxor
// 0ad: lstore 37
// 0af: pop2
// 0b0: ldc2_w -682904536728481698
// 0b3: lload 2
// 0b4: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: aload 0
// 0ba: aload 1
// 0bb: invokevirtual su/catlean/ft.E ()Ljava/lang/String;
// 0be: lload 4
// 0c0: invokevirtual su/catlean/zg.e (Ljava/lang/String;J)Lnet/minecraft/class_1792;
// 0c3: astore 40
// 0c5: istore 39
// 0c7: aload 40
// 0c9: ifnull 3ff
// 0cc: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0cf: bipush 1
// 0d0: anewarray 52
// 0d3: astore 42
// 0d5: aload 42
// 0d7: bipush 0
// 0d8: aload 40
// 0da: aastore
// 0db: iload 27
// 0dd: aload 42
// 0df: iload 28
// 0e1: iload 29
// 0e3: i2c
// 0e4: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 0e7: astore 41
// 0e9: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0ec: bipush 1
// 0ed: anewarray 52
// 0f0: astore 43
// 0f2: aload 43
// 0f4: bipush 0
// 0f5: aload 40
// 0f7: aastore
// 0f8: aload 43
// 0fa: iload 32
// 0fc: i2c
// 0fd: lload 33
// 0ff: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 102: astore 42
// 104: aload 41
// 106: invokevirtual su/catlean/fg.R ()Z
// 109: iload 39
// 10b: lload 2
// 10c: lconst_0
// 10d: lcmp
// 10e: ifle 337
// 111: ifne 32f
// 114: ifeq 32a
// 117: goto 124
// 11a: ldc2_w -681093352634538354
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: aload 1
// 125: invokevirtual su/catlean/ft.h ()Z
// 128: lload 2
// 129: lconst_0
// 12a: lcmp
// 12b: iflt 1f6
// 12e: iload 39
// 130: ifne 1f6
// 133: goto 140
// 136: ldc2_w -681093352634538354
// 139: lload 2
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: lload 2
// 141: lconst_0
// 142: lcmp
// 143: ifle 1e9
// 146: ifeq 1d5
// 149: goto 156
// 14c: ldc2_w -681093352634538354
// 14f: lload 2
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: aload 41
// 158: lload 12
// 15a: invokevirtual su/catlean/fg.x (J)V
// 15d: iload 39
// 15f: lload 2
// 160: lconst_0
// 161: lcmp
// 162: iflt 1cc
// 165: ifne 1ca
// 168: goto 175
// 16b: ldc2_w -681093352634538354
// 16e: lload 2
// 16f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: athrow
// 175: aload 40
// 177: instanceof net/minecraft/class_1819
// 17a: ifne 329
// 17d: goto 18a
// 180: ldc2_w -681093352634538354
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 18d: new kotlin/ranges/IntRange
// 190: dup
// 191: bipush 1
// 192: bipush 2
// 193: invokespecial kotlin/ranges/IntRange.<init> (II)V
// 196: checkcast kotlin/ranges/ClosedRange
// 199: bipush 0
// 19a: lload 35
// 19c: bipush 2
// 19d: aconst_null
// 19e: invokestatic su/catlean/mf.f (Lkotlin/ranges/ClosedRange;ZJILjava/lang/Object;)I
// 1a1: lload 37
// 1a3: dup2_x1
// 1a4: pop2
// 1a5: bipush 0
// 1a6: bipush 0
// 1a7: invokedynamic run ()Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/zg.W ()V, ()V ]
// 1ac: sipush 24457
// 1af: ldc2_w 6590719962252968853
// 1b2: lload 2
// 1b3: lxor
// 1b4: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: aconst_null
// 1ba: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 1bd: goto 1ca
// 1c0: ldc2_w -681093352634538354
// 1c3: lload 2
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: iload 39
// 1cc: lload 2
// 1cd: lconst_0
// 1ce: lcmp
// 1cf: iflt 1e9
// 1d2: ifeq 329
// 1d5: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1d8: aload 41
// 1da: invokevirtual su/catlean/fg.a ()I
// 1dd: lload 14
// 1df: dup2_x1
// 1e0: pop2
// 1e1: invokevirtual su/catlean/gg.B (JI)V
// 1e4: aload 40
// 1e6: instanceof net/minecraft/class_1747
// 1e9: goto 1f6
// 1ec: ldc2_w -681093352634538354
// 1ef: lload 2
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: ifne 21e
// 1f9: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1fc: fconst_0
// 1fd: lload 20
// 1ff: fconst_0
// 200: sipush 12878
// 203: ldc2_w 2600587823063821911
// 206: lload 2
// 207: lxor
// 208: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: aconst_null
// 20e: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 211: goto 315
// 214: ldc2_w -681093352634538354
// 217: lload 2
// 218: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: athrow
// 21e: lload 6
// 220: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 223: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 226: lload 2
// 227: lconst_0
// 228: lcmp
// 229: iflt 256
// 22c: iload 39
// 22e: ifne 256
// 231: ifnull 2b1
// 234: goto 241
// 237: ldc2_w -681093352634538354
// 23a: lload 2
// 23b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 240: athrow
// 241: lload 6
// 243: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 246: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 249: goto 256
// 24c: ldc2_w -681093352634538354
// 24f: lload 2
// 250: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 255: athrow
// 256: instanceof net/minecraft/class_3965
// 259: lload 2
// 25a: lconst_0
// 25b: lcmp
// 25c: iflt 2a8
// 25f: iload 39
// 261: ifne 2a8
// 264: ifeq 2b1
// 267: goto 274
// 26a: ldc2_w -681093352634538354
// 26d: lload 2
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: lload 8
// 276: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 279: lload 6
// 27b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 27e: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 281: dup
// 282: sipush 6410
// 285: ldc2_w 84620883900491708
// 288: lload 2
// 289: lxor
// 28a: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 292: checkcast net/minecraft/class_3965
// 295: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 298: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 29b: goto 2a8
// 29e: ldc2_w -681093352634538354
// 2a1: lload 2
// 2a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a7: athrow
// 2a8: lload 2
// 2a9: lconst_0
// 2aa: lcmp
// 2ab: iflt 2d8
// 2ae: ifeq 2d6
// 2b1: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 2b4: fconst_0
// 2b5: lload 20
// 2b7: fconst_0
// 2b8: sipush 12878
// 2bb: ldc2_w 2600587823063821911
// 2be: lload 2
// 2bf: lxor
// 2c0: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: aconst_null
// 2c6: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 2c9: goto 315
// 2cc: ldc2_w -681093352634538354
// 2cf: lload 2
// 2d0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d5: athrow
// 2d6: iload 22
// 2d8: lload 23
// 2da: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 2dd: lload 16
// 2df: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e2: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 2e5: lload 6
// 2e7: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2ea: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 2ed: dup
// 2ee: sipush 9417
// 2f1: ldc2_w 2319693318700751480
// 2f4: lload 2
// 2f5: lxor
// 2f6: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 2fe: checkcast net/minecraft/class_3965
// 301: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
// 304: dup
// 305: sipush 26931
// 308: ldc2_w 4030167369925531532
// 30b: lload 2
// 30c: lxor
// 30d: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 312: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 315: pop
// 316: lload 16
// 318: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 31b: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 31e: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 321: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 324: lload 10
// 326: invokevirtual su/catlean/gg.d (J)V
// 329: return
// 32a: aload 42
// 32c: invokevirtual su/catlean/fg.R ()Z
// 32f: lload 2
// 330: lconst_0
// 331: lcmp
// 332: ifle 382
// 335: iload 39
// 337: ifne 382
// 33a: ifeq 3ff
// 33d: goto 34a
// 340: ldc2_w -681093352634538354
// 343: lload 2
// 344: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 349: athrow
// 34a: aload 1
// 34b: aload 42
// 34d: invokedynamic invoke (Lsu/catlean/ft;Lsu/catlean/fg;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/zg.r (Lsu/catlean/ft;Lsu/catlean/fg;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 352: iload 39
// 354: lload 2
// 355: lconst_0
// 356: lcmp
// 357: ifle 3d0
// 35a: ifne 3ce
// 35d: goto 36a
// 360: ldc2_w -681093352634538354
// 363: lload 2
// 364: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 369: athrow
// 36a: putstatic su/catlean/zg.Z Lkotlin/jvm/functions/Function0;
// 36d: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 370: lload 18
// 372: invokevirtual su/catlean/_n.f (J)Z
// 375: goto 382
// 378: ldc2_w -681093352634538354
// 37b: lload 2
// 37c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 381: athrow
// 382: lload 2
// 383: lconst_0
// 384: lcmp
// 385: iflt 393
// 388: ifeq 3be
// 38b: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 38e: lload 25
// 390: invokevirtual su/catlean/dm.Y (J)Z
// 393: ifeq 3be
// 396: goto 3a3
// 399: ldc2_w -681093352634538354
// 39c: lload 2
// 39d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a2: athrow
// 3a3: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 3a6: lload 30
// 3a8: invokevirtual su/catlean/_n.i (J)Lsu/catlean/su;
// 3ab: getstatic su/catlean/su.LEGIT Lsu/catlean/su;
// 3ae: if_acmpeq 3ff
// 3b1: goto 3be
// 3b4: ldc2_w -681093352634538354
// 3b7: lload 2
// 3b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bd: athrow
// 3be: getstatic su/catlean/zg.Z Lkotlin/jvm/functions/Function0;
// 3c1: goto 3ce
// 3c4: ldc2_w -681093352634538354
// 3c7: lload 2
// 3c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cd: athrow
// 3ce: iload 39
// 3d0: ifne 3f6
// 3d3: dup
// 3d4: ifnull 3fa
// 3d7: goto 3e4
// 3da: ldc2_w -681093352634538354
// 3dd: lload 2
// 3de: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e3: athrow
// 3e4: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 3e9: goto 3f6
// 3ec: ldc2_w -681093352634538354
// 3ef: lload 2
// 3f0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f5: athrow
// 3f6: pop
// 3f7: goto 3fb
// 3fa: pop
// 3fb: aconst_null
// 3fc: putstatic su/catlean/zg.Z Lkotlin/jvm/functions/Function0;
// 3ff: return
}

private final void j(nh param1, boolean param2, long param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 0000: getstatic su/catlean/zg.a J
// 0003: lload 3
// 0004: lxor
// 0005: lstore 3
// 0006: lload 3
// 0007: dup2
// 0008: ldc2_w 112023218623350
// 000b: lxor
// 000c: lstore 5
// 000e: dup2
// 000f: ldc2_w 18285587305113
// 0012: lxor
// 0013: dup2
// 0014: bipush 8
// 0016: lushr
// 0017: lstore 7
// 0019: dup2
// 001a: bipush 56
// 001c: lshl
// 001d: bipush 56
// 001f: lushr
// 0020: l2i
// 0021: istore 9
// 0023: pop2
// 0024: pop2
// 0025: ldc2_w 1738853183974620922
// 0028: lload 3
// 0029: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 002e: getstatic su/catlean/iq.a Lsu/catlean/iq;
// 0031: invokevirtual su/catlean/iq.L ()Ljava/util/ArrayList;
// 0034: checkcast java/lang/Iterable
// 0037: astore 13
// 0039: istore 10
// 003b: bipush 0
// 003c: istore 14
// 003e: aload 13
// 0040: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0045: astore 15
// 0047: aload 15
// 0049: invokeinterface java/util/Iterator.hasNext ()Z 1
// 004e: ifeq 0083
// 0051: aload 15
// 0053: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0058: astore 16
// 005a: aload 16
// 005c: checkcast su/catlean/_g
// 005f: astore 17
// 0061: bipush 0
// 0062: istore 18
// 0064: aload 17
// 0066: invokevirtual su/catlean/_g.U ()Ljava/lang/String;
// 0069: aload 1
// 006a: invokevirtual su/catlean/nh.f ()Ljava/lang/String;
// 006d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0070: ifeq 0047
// 0073: aload 16
// 0075: lload 3
// 0076: lconst_0
// 0077: lcmp
// 0078: iflt 0058
// 007b: iload 10
// 007d: ifne 005c
// 0080: goto 0084
// 0083: aconst_null
// 0084: checkcast su/catlean/_g
// 0087: dup
// 0088: ifnonnull 0097
// 008b: pop
// 008c: return
// 008d: ldc2_w 1740699562084943914
// 0090: lload 3
// 0091: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0096: athrow
// 0097: astore 11
// 0099: aload 11
// 009b: invokevirtual su/catlean/_g.c ()Ljava/util/List;
// 009e: checkcast java/lang/Iterable
// 00a1: astore 14
// 00a3: bipush 0
// 00a4: istore 15
// 00a6: aload 14
// 00a8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 00ad: astore 16
// 00af: aload 16
// 00b1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 00b6: ifeq 00eb
// 00b9: aload 16
// 00bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 00c0: astore 17
// 00c2: aload 17
// 00c4: checkcast su/catlean/a1
// 00c7: astore 18
// 00c9: bipush 0
// 00ca: istore 19
// 00cc: aload 18
// 00ce: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// 00d1: aload 1
// 00d2: invokevirtual su/catlean/nh.R ()Ljava/lang/String;
// 00d5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 00d8: ifeq 00af
// 00db: aload 17
// 00dd: lload 3
// 00de: lconst_0
// 00df: lcmp
// 00e0: ifle 00c0
// 00e3: iload 10
// 00e5: ifne 00c4
// 00e8: goto 00ec
// 00eb: aconst_null
// 00ec: checkcast su/catlean/a1
// 00ef: dup
// 00f0: ifnonnull 00ff
// 00f3: pop
// 00f4: return
// 00f5: ldc2_w 1740699562084943914
// 00f8: lload 3
// 00f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00fe: athrow
// 00ff: astore 12
// 0101: aload 12
// 0103: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0106: astore 13
// 0108: aload 13
// 010a: instanceof java/lang/Integer
// 010d: iload 10
// 010f: lload 3
// 0110: lconst_0
// 0111: lcmp
// 0112: ifle 0554
// 0115: ifne 0552
// 0118: ifeq 054d
// 011b: goto 0128
// 011e: ldc2_w 1740699562084943914
// 0121: lload 3
// 0122: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0127: athrow
// 0128: aload 12
// 012a: iload 10
// 012c: ifne 015e
// 012f: goto 013c
// 0132: ldc2_w 1740699562084943914
// 0135: lload 3
// 0136: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 013b: athrow
// 013c: instanceof su/catlean/a1
// 013f: ifeq 0161
// 0142: goto 014f
// 0145: ldc2_w 1740699562084943914
// 0148: lload 3
// 0149: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 014e: athrow
// 014f: aload 12
// 0151: goto 015e
// 0154: ldc2_w 1740699562084943914
// 0157: lload 3
// 0158: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 015d: athrow
// 015e: goto 0162
// 0161: aconst_null
// 0162: astore 14
// 0164: lload 3
// 0165: lconst_0
// 0166: lcmp
// 0167: iflt 016f
// 016a: aload 14
// 016c: ifnull 1367
// 016f: aload 1
// 0170: invokevirtual su/catlean/nh.s ()Z
// 0173: iload 10
// 0175: lload 3
// 0176: lconst_0
// 0177: lcmp
// 0178: ifle 036b
// 017b: ifne 0369
// 017e: goto 018b
// 0181: ldc2_w 1740699562084943914
// 0184: lload 3
// 0185: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018a: athrow
// 018b: ifeq 0368
// 018e: goto 019b
// 0191: ldc2_w 1740699562084943914
// 0194: lload 3
// 0195: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 019a: athrow
// 019b: iload 2
// 019c: lload 3
// 019d: lconst_0
// 019e: lcmp
// 019f: iflt 025e
// 01a2: iload 10
// 01a4: ifne 0255
// 01a7: goto 01b4
// 01aa: ldc2_w 1740699562084943914
// 01ad: lload 3
// 01ae: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01b3: athrow
// 01b4: ifeq 0261
// 01b7: goto 01c4
// 01ba: ldc2_w 1740699562084943914
// 01bd: lload 3
// 01be: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01c3: athrow
// 01c4: aload 14
// 01c6: aload 1
// 01c7: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 01ca: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 01cd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 01d0: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 01d3: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 01d6: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 01d9: new su/catlean/ww
// 01dc: dup
// 01dd: aload 1
// 01de: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 01e1: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 01e4: aload 1
// 01e5: invokevirtual su/catlean/nh.X ()Lsu/catlean/lj;
// 01e8: invokevirtual su/catlean/lj.X ()I
// 01eb: lload 5
// 01ed: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 01f0: lload 7
// 01f2: dup2_x1
// 01f3: pop2
// 01f4: aload 11
// 01f6: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 01f9: checkcast java/lang/CharSequence
// 01fc: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 01ff: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 0202: aload 12
// 0204: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 0207: aload 1
// 0208: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 020b: sipush 31374
// 020e: ldc2_w 4898442451325217430
// 0211: lload 3
// 0212: lxor
// 0213: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0218: dup_x2
// 0219: pop
// 021a: sipush 26260
// 021d: ldc2_w 2244342778412889738
// 0220: lload 3
// 0221: lxor
// 0222: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0227: swap
// 0228: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 022d: aconst_null
// 022e: bipush 0
// 022f: sipush 1531
// 0232: ldc2_w 4025865085231609665
// 0235: lload 3
// 0236: lxor
// 0237: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 023c: aconst_null
// 023d: iload 9
// 023f: i2b
// 0240: invokespecial su/catlean/ww.<init> (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 0243: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0248: goto 0255
// 024b: ldc2_w 1740699562084943914
// 024e: lload 3
// 024f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0254: athrow
// 0255: pop
// 0256: lload 3
// 0257: lconst_0
// 0258: lcmp
// 0259: ifle 0270
// 025c: iload 10
// 025e: ifeq 1367
// 0261: aload 14
// 0263: aload 1
// 0264: invokevirtual su/catlean/nh.V ()Ljava/lang/String;
// 0267: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 026a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 026d: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 0270: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 0273: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 0276: checkcast java/lang/Iterable
// 0279: astore 15
// 027b: bipush 0
// 027c: istore 16
// 027e: aload 15
// 0280: astore 17
// 0282: new java/util/ArrayList
// 0285: dup
// 0286: invokespecial java/util/ArrayList.<init> ()V
// 0289: checkcast java/util/Collection
// 028c: astore 18
// 028e: bipush 0
// 028f: istore 19
// 0291: aload 17
// 0293: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0298: astore 20
// 029a: aload 20
// 029c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 02a1: ifeq 02ff
// 02a4: aload 20
// 02a6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 02ab: astore 21
// 02ad: aload 21
// 02af: checkcast su/catlean/ww
// 02b2: astore 22
// 02b4: bipush 0
// 02b5: istore 23
// 02b7: lload 3
// 02b8: lconst_0
// 02b9: lcmp
// 02ba: ifle 0314
// 02bd: aload 22
// 02bf: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 02c2: aload 1
// 02c3: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 02c6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 02c9: iload 10
// 02cb: ifne 0312
// 02ce: iload 10
// 02d0: ifne 02f9
// 02d3: goto 02e0
// 02d6: ldc2_w 1740699562084943914
// 02d9: lload 3
// 02da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02df: athrow
// 02e0: ifeq 029a
// 02e3: goto 02f0
// 02e6: ldc2_w 1740699562084943914
// 02e9: lload 3
// 02ea: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02ef: athrow
// 02f0: aload 18
// 02f2: aload 21
// 02f4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 02f9: pop
// 02fa: iload 10
// 02fc: ifeq 029a
// 02ff: aload 18
// 0301: checkcast java/util/List
// 0304: nop
// 0305: checkcast java/lang/Iterable
// 0308: astore 15
// 030a: nop
// 030b: lload 3
// 030c: lconst_0
// 030d: lcmp
// 030e: ifle 0314
// 0311: bipush 0
// 0312: istore 16
// 0314: aload 15
// 0316: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 031b: astore 17
// 031d: aload 17
// 031f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0324: ifeq 0364
// 0327: aload 17
// 0329: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 032e: astore 18
// 0330: aload 18
// 0332: checkcast su/catlean/ww
// 0335: astore 19
// 0337: bipush 0
// 0338: istore 20
// 033a: aload 19
// 033c: bipush 1
// 033d: invokevirtual su/catlean/ww.W (Z)V
// 0340: nop
// 0341: iload 10
// 0343: lload 3
// 0344: lconst_0
// 0345: lcmp
// 0346: iflt 034e
// 0349: ifne 0365
// 034c: iload 10
// 034e: ifeq 031d
// 0351: lload 3
// 0352: lconst_0
// 0353: lcmp
// 0354: ifle 0341
// 0357: goto 0364
// 035a: ldc2_w 1740699562084943914
// 035d: lload 3
// 035e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0363: athrow
// 0364: nop
// 0365: goto 1367
// 0368: iload 2
// 0369: iload 10
// 036b: lload 3
// 036c: lconst_0
// 036d: lcmp
// 036e: ifle 039e
// 0371: ifne 039c
// 0374: ifeq 1367
// 0377: goto 0384
// 037a: ldc2_w 1740699562084943914
// 037d: lload 3
// 037e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0383: athrow
// 0384: aload 14
// 0386: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0389: checkcast java/lang/Number
// 038c: invokevirtual java/lang/Number.intValue ()I
// 038f: goto 039c
// 0392: ldc2_w 1740699562084943914
// 0395: lload 3
// 0396: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039b: athrow
// 039c: iload 10
// 039e: lload 3
// 039f: lconst_0
// 03a0: lcmp
// 03a1: ifle 03ae
// 03a4: ifne 0549
// 03a7: aload 1
// 03a8: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 03ab: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 03ae: if_icmpne 04c5
// 03b1: goto 03be
// 03b4: ldc2_w 1740699562084943914
// 03b7: lload 3
// 03b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03bd: athrow
// 03be: aload 14
// 03c0: aload 1
// 03c1: invokevirtual su/catlean/nh.V ()Ljava/lang/String;
// 03c4: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 03c7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 03ca: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 03cd: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 03d0: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 03d3: checkcast java/lang/Iterable
// 03d6: astore 15
// 03d8: bipush 0
// 03d9: istore 16
// 03db: aload 15
// 03dd: astore 17
// 03df: new java/util/ArrayList
// 03e2: dup
// 03e3: invokespecial java/util/ArrayList.<init> ()V
// 03e6: checkcast java/util/Collection
// 03e9: astore 18
// 03eb: bipush 0
// 03ec: istore 19
// 03ee: aload 17
// 03f0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 03f5: astore 20
// 03f7: aload 20
// 03f9: invokeinterface java/util/Iterator.hasNext ()Z 1
// 03fe: ifeq 045c
// 0401: aload 20
// 0403: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0408: astore 21
// 040a: aload 21
// 040c: checkcast su/catlean/ww
// 040f: astore 22
// 0411: bipush 0
// 0412: istore 23
// 0414: lload 3
// 0415: lconst_0
// 0416: lcmp
// 0417: iflt 0471
// 041a: aload 22
// 041c: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 041f: aload 1
// 0420: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 0423: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0426: iload 10
// 0428: ifne 046f
// 042b: iload 10
// 042d: ifne 0456
// 0430: goto 043d
// 0433: ldc2_w 1740699562084943914
// 0436: lload 3
// 0437: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043c: athrow
// 043d: ifeq 03f7
// 0440: goto 044d
// 0443: ldc2_w 1740699562084943914
// 0446: lload 3
// 0447: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044c: athrow
// 044d: aload 18
// 044f: aload 21
// 0451: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0456: pop
// 0457: iload 10
// 0459: ifeq 03f7
// 045c: aload 18
// 045e: checkcast java/util/List
// 0461: nop
// 0462: checkcast java/lang/Iterable
// 0465: astore 15
// 0467: nop
// 0468: lload 3
// 0469: lconst_0
// 046a: lcmp
// 046b: ifle 0471
// 046e: bipush 0
// 046f: istore 16
// 0471: aload 15
// 0473: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0478: astore 17
// 047a: aload 17
// 047c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0481: ifeq 04c1
// 0484: aload 17
// 0486: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 048b: astore 18
// 048d: aload 18
// 048f: checkcast su/catlean/ww
// 0492: astore 19
// 0494: bipush 0
// 0495: istore 20
// 0497: aload 19
// 0499: bipush 1
// 049a: invokevirtual su/catlean/ww.W (Z)V
// 049d: nop
// 049e: iload 10
// 04a0: lload 3
// 04a1: lconst_0
// 04a2: lcmp
// 04a3: ifle 04ab
// 04a6: ifne 04c2
// 04a9: iload 10
// 04ab: ifeq 047a
// 04ae: lload 3
// 04af: lconst_0
// 04b0: lcmp
// 04b1: iflt 049e
// 04b4: goto 04c1
// 04b7: ldc2_w 1740699562084943914
// 04ba: lload 3
// 04bb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c0: athrow
// 04c1: nop
// 04c2: goto 1367
// 04c5: aload 14
// 04c7: aload 1
// 04c8: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 04cb: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 04ce: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 04d1: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 04d4: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 04d7: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 04da: new su/catlean/ww
// 04dd: dup
// 04de: aload 1
// 04df: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 04e2: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 04e5: aload 1
// 04e6: invokevirtual su/catlean/nh.X ()Lsu/catlean/lj;
// 04e9: invokevirtual su/catlean/lj.X ()I
// 04ec: lload 5
// 04ee: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 04f1: lload 7
// 04f3: dup2_x1
// 04f4: pop2
// 04f5: aload 11
// 04f7: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 04fa: checkcast java/lang/CharSequence
// 04fd: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 0500: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 0503: aload 12
// 0505: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 0508: aload 1
// 0509: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 050c: sipush 26260
// 050f: ldc2_w 2244342778412889738
// 0512: lload 3
// 0513: lxor
// 0514: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0519: dup_x2
// 051a: pop
// 051b: sipush 26260
// 051e: ldc2_w 2244342778412889738
// 0521: lload 3
// 0522: lxor
// 0523: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0528: swap
// 0529: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 052e: aconst_null
// 052f: bipush 0
// 0530: sipush 19884
// 0533: ldc2_w 7464887090527731474
// 0536: lload 3
// 0537: lxor
// 0538: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053d: aconst_null
// 053e: iload 9
// 0540: i2b
// 0541: invokespecial su/catlean/ww.<init> (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 0544: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0549: pop
// 054a: goto 1367
// 054d: aload 13
// 054f: instanceof java/lang/Float
// 0552: iload 10
// 0554: lload 3
// 0555: lconst_0
// 0556: lcmp
// 0557: ifle 099c
// 055a: ifne 099a
// 055d: ifeq 0995
// 0560: goto 056d
// 0563: ldc2_w 1740699562084943914
// 0566: lload 3
// 0567: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056c: athrow
// 056d: aload 12
// 056f: iload 10
// 0571: ifne 05a3
// 0574: goto 0581
// 0577: ldc2_w 1740699562084943914
// 057a: lload 3
// 057b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0580: athrow
// 0581: instanceof su/catlean/a1
// 0584: ifeq 05a6
// 0587: goto 0594
// 058a: ldc2_w 1740699562084943914
// 058d: lload 3
// 058e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0593: athrow
// 0594: aload 12
// 0596: goto 05a3
// 0599: ldc2_w 1740699562084943914
// 059c: lload 3
// 059d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a2: athrow
// 05a3: goto 05a7
// 05a6: aconst_null
// 05a7: astore 14
// 05a9: lload 3
// 05aa: lconst_0
// 05ab: lcmp
// 05ac: iflt 05b4
// 05af: aload 14
// 05b1: ifnull 1367
// 05b4: aload 1
// 05b5: invokevirtual su/catlean/nh.s ()Z
// 05b8: iload 10
// 05ba: lload 3
// 05bb: lconst_0
// 05bc: lcmp
// 05bd: ifle 07b0
// 05c0: ifne 07ae
// 05c3: goto 05d0
// 05c6: ldc2_w 1740699562084943914
// 05c9: lload 3
// 05ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05cf: athrow
// 05d0: ifeq 07ad
// 05d3: goto 05e0
// 05d6: ldc2_w 1740699562084943914
// 05d9: lload 3
// 05da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05df: athrow
// 05e0: iload 2
// 05e1: lload 3
// 05e2: lconst_0
// 05e3: lcmp
// 05e4: ifle 06a3
// 05e7: iload 10
// 05e9: ifne 069a
// 05ec: goto 05f9
// 05ef: ldc2_w 1740699562084943914
// 05f2: lload 3
// 05f3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f8: athrow
// 05f9: ifeq 06a6
// 05fc: goto 0609
// 05ff: ldc2_w 1740699562084943914
// 0602: lload 3
// 0603: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0608: athrow
// 0609: aload 14
// 060b: aload 1
// 060c: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 060f: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
// 0612: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 0615: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 0618: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 061b: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 061e: new su/catlean/ww
// 0621: dup
// 0622: aload 1
// 0623: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 0626: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 0629: aload 1
// 062a: invokevirtual su/catlean/nh.X ()Lsu/catlean/lj;
// 062d: invokevirtual su/catlean/lj.X ()I
// 0630: lload 5
// 0632: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 0635: lload 7
// 0637: dup2_x1
// 0638: pop2
// 0639: aload 11
// 063b: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 063e: checkcast java/lang/CharSequence
// 0641: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 0644: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 0647: aload 12
// 0649: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 064c: aload 1
// 064d: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 0650: sipush 26260
// 0653: ldc2_w 2244342778412889738
// 0656: lload 3
// 0657: lxor
// 0658: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065d: dup_x2
// 065e: pop
// 065f: sipush 26260
// 0662: ldc2_w 2244342778412889738
// 0665: lload 3
// 0666: lxor
// 0667: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066c: swap
// 066d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 0672: aconst_null
// 0673: bipush 0
// 0674: sipush 19884
// 0677: ldc2_w 7464887090527731474
// 067a: lload 3
// 067b: lxor
// 067c: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0681: aconst_null
// 0682: iload 9
// 0684: i2b
// 0685: invokespecial su/catlean/ww.<init> (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 0688: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 068d: goto 069a
// 0690: ldc2_w 1740699562084943914
// 0693: lload 3
// 0694: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0699: athrow
// 069a: pop
// 069b: lload 3
// 069c: lconst_0
// 069d: lcmp
// 069e: iflt 06b5
// 06a1: iload 10
// 06a3: ifeq 1367
// 06a6: aload 14
// 06a8: aload 1
// 06a9: invokevirtual su/catlean/nh.V ()Ljava/lang/String;
// 06ac: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
// 06af: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 06b2: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 06b5: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 06b8: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 06bb: checkcast java/lang/Iterable
// 06be: astore 15
// 06c0: bipush 0
// 06c1: istore 16
// 06c3: aload 15
// 06c5: astore 17
// 06c7: new java/util/ArrayList
// 06ca: dup
// 06cb: invokespecial java/util/ArrayList.<init> ()V
// 06ce: checkcast java/util/Collection
// 06d1: astore 18
// 06d3: bipush 0
// 06d4: istore 19
// 06d6: aload 17
// 06d8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 06dd: astore 20
// 06df: aload 20
// 06e1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 06e6: ifeq 0744
// 06e9: aload 20
// 06eb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 06f0: astore 21
// 06f2: aload 21
// 06f4: checkcast su/catlean/ww
// 06f7: astore 22
// 06f9: bipush 0
// 06fa: istore 23
// 06fc: lload 3
// 06fd: lconst_0
// 06fe: lcmp
// 06ff: ifle 0759
// 0702: aload 22
// 0704: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 0707: aload 1
// 0708: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 070b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 070e: iload 10
// 0710: ifne 0757
// 0713: iload 10
// 0715: ifne 073e
// 0718: goto 0725
// 071b: ldc2_w 1740699562084943914
// 071e: lload 3
// 071f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0724: athrow
// 0725: ifeq 06df
// 0728: goto 0735
// 072b: ldc2_w 1740699562084943914
// 072e: lload 3
// 072f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0734: athrow
// 0735: aload 18
// 0737: aload 21
// 0739: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 073e: pop
// 073f: iload 10
// 0741: ifeq 06df
// 0744: aload 18
// 0746: checkcast java/util/List
// 0749: nop
// 074a: checkcast java/lang/Iterable
// 074d: astore 15
// 074f: nop
// 0750: lload 3
// 0751: lconst_0
// 0752: lcmp
// 0753: iflt 0759
// 0756: bipush 0
// 0757: istore 16
// 0759: aload 15
// 075b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0760: astore 17
// 0762: aload 17
// 0764: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0769: ifeq 07a9
// 076c: aload 17
// 076e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0773: astore 18
// 0775: aload 18
// 0777: checkcast su/catlean/ww
// 077a: astore 19
// 077c: bipush 0
// 077d: istore 20
// 077f: aload 19
// 0781: bipush 1
// 0782: invokevirtual su/catlean/ww.W (Z)V
// 0785: nop
// 0786: iload 10
// 0788: lload 3
// 0789: lconst_0
// 078a: lcmp
// 078b: iflt 0793
// 078e: ifne 07aa
// 0791: iload 10
// 0793: ifeq 0762
// 0796: lload 3
// 0797: lconst_0
// 0798: lcmp
// 0799: iflt 0786
// 079c: goto 07a9
// 079f: ldc2_w 1740699562084943914
// 07a2: lload 3
// 07a3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a8: athrow
// 07a9: nop
// 07aa: goto 1367
// 07ad: iload 2
// 07ae: iload 10
// 07b0: lload 3
// 07b1: lconst_0
// 07b2: lcmp
// 07b3: iflt 07eb
// 07b6: ifne 07e9
// 07b9: ifeq 1367
// 07bc: goto 07c9
// 07bf: ldc2_w 1740699562084943914
// 07c2: lload 3
// 07c3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c8: athrow
// 07c9: aload 14
// 07cb: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 07ce: checkcast java/lang/Number
// 07d1: invokevirtual java/lang/Number.floatValue ()F
// 07d4: aload 1
// 07d5: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 07d8: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
// 07db: fcmpg
// 07dc: goto 07e9
// 07df: ldc2_w 1740699562084943914
// 07e2: lload 3
// 07e3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e8: athrow
// 07e9: iload 10
// 07eb: ifne 07ff
// 07ee: ifne 0802
// 07f1: goto 07fe
// 07f4: ldc2_w 1740699562084943914
// 07f7: lload 3
// 07f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07fd: athrow
// 07fe: bipush 1
// 07ff: goto 0803
// 0802: bipush 0
// 0803: ifeq 090d
// 0806: aload 14
// 0808: aload 1
// 0809: invokevirtual su/catlean/nh.V ()Ljava/lang/String;
// 080c: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
// 080f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 0812: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 0815: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 0818: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 081b: checkcast java/lang/Iterable
// 081e: astore 15
// 0820: bipush 0
// 0821: istore 16
// 0823: aload 15
// 0825: astore 17
// 0827: new java/util/ArrayList
// 082a: dup
// 082b: invokespecial java/util/ArrayList.<init> ()V
// 082e: checkcast java/util/Collection
// 0831: astore 18
// 0833: bipush 0
// 0834: istore 19
// 0836: aload 17
// 0838: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 083d: astore 20
// 083f: aload 20
// 0841: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0846: ifeq 08a4
// 0849: aload 20
// 084b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0850: astore 21
// 0852: aload 21
// 0854: checkcast su/catlean/ww
// 0857: astore 22
// 0859: bipush 0
// 085a: istore 23
// 085c: lload 3
// 085d: lconst_0
// 085e: lcmp
// 085f: iflt 08b9
// 0862: aload 22
// 0864: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 0867: aload 1
// 0868: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 086b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 086e: iload 10
// 0870: ifne 08b7
// 0873: iload 10
// 0875: ifne 089e
// 0878: goto 0885
// 087b: ldc2_w 1740699562084943914
// 087e: lload 3
// 087f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0884: athrow
// 0885: ifeq 083f
// 0888: goto 0895
// 088b: ldc2_w 1740699562084943914
// 088e: lload 3
// 088f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0894: athrow
// 0895: aload 18
// 0897: aload 21
// 0899: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 089e: pop
// 089f: iload 10
// 08a1: ifeq 083f
// 08a4: aload 18
// 08a6: checkcast java/util/List
// 08a9: nop
// 08aa: checkcast java/lang/Iterable
// 08ad: astore 15
// 08af: nop
// 08b0: lload 3
// 08b1: lconst_0
// 08b2: lcmp
// 08b3: iflt 08b9
// 08b6: bipush 0
// 08b7: istore 16
// 08b9: aload 15
// 08bb: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 08c0: astore 17
// 08c2: aload 17
// 08c4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 08c9: ifeq 0909
// 08cc: aload 17
// 08ce: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 08d3: astore 18
// 08d5: aload 18
// 08d7: checkcast su/catlean/ww
// 08da: astore 19
// 08dc: bipush 0
// 08dd: istore 20
// 08df: aload 19
// 08e1: bipush 1
// 08e2: invokevirtual su/catlean/ww.W (Z)V
// 08e5: nop
// 08e6: iload 10
// 08e8: lload 3
// 08e9: lconst_0
// 08ea: lcmp
// 08eb: iflt 08f3
// 08ee: ifne 090a
// 08f1: iload 10
// 08f3: ifeq 08c2
// 08f6: lload 3
// 08f7: lconst_0
// 08f8: lcmp
// 08f9: ifle 08e6
// 08fc: goto 0909
// 08ff: ldc2_w 1740699562084943914
// 0902: lload 3
// 0903: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0908: athrow
// 0909: nop
// 090a: goto 1367
// 090d: aload 14
// 090f: aload 1
// 0910: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 0913: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
// 0916: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 0919: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 091c: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 091f: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 0922: new su/catlean/ww
// 0925: dup
// 0926: aload 1
// 0927: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 092a: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 092d: aload 1
// 092e: invokevirtual su/catlean/nh.X ()Lsu/catlean/lj;
// 0931: invokevirtual su/catlean/lj.X ()I
// 0934: lload 5
// 0936: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 0939: lload 7
// 093b: dup2_x1
// 093c: pop2
// 093d: aload 11
// 093f: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 0942: checkcast java/lang/CharSequence
// 0945: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 0948: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 094b: aload 12
// 094d: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 0950: aload 1
// 0951: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 0954: sipush 26260
// 0957: ldc2_w 2244342778412889738
// 095a: lload 3
// 095b: lxor
// 095c: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0961: dup_x2
// 0962: pop
// 0963: sipush 26260
// 0966: ldc2_w 2244342778412889738
// 0969: lload 3
// 096a: lxor
// 096b: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0970: swap
// 0971: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 0976: aconst_null
// 0977: bipush 0
// 0978: sipush 19884
// 097b: ldc2_w 7464887090527731474
// 097e: lload 3
// 097f: lxor
// 0980: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0985: aconst_null
// 0986: iload 9
// 0988: i2b
// 0989: invokespecial su/catlean/ww.<init> (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 098c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0991: pop
// 0992: goto 1367
// 0995: aload 13
// 0997: instanceof java/lang/Boolean
// 099a: iload 10
// 099c: lload 3
// 099d: lconst_0
// 099e: lcmp
// 099f: ifle 0de1
// 09a2: ifne 0ddf
// 09a5: ifeq 0dda
// 09a8: goto 09b5
// 09ab: ldc2_w 1740699562084943914
// 09ae: lload 3
// 09af: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b4: athrow
// 09b5: aload 12
// 09b7: iload 10
// 09b9: ifne 09eb
// 09bc: goto 09c9
// 09bf: ldc2_w 1740699562084943914
// 09c2: lload 3
// 09c3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c8: athrow
// 09c9: instanceof su/catlean/a1
// 09cc: ifeq 09ee
// 09cf: goto 09dc
// 09d2: ldc2_w 1740699562084943914
// 09d5: lload 3
// 09d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09db: athrow
// 09dc: aload 12
// 09de: goto 09eb
// 09e1: ldc2_w 1740699562084943914
// 09e4: lload 3
// 09e5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09ea: athrow
// 09eb: goto 09ef
// 09ee: aconst_null
// 09ef: astore 14
// 09f1: lload 3
// 09f2: lconst_0
// 09f3: lcmp
// 09f4: iflt 09fc
// 09f7: aload 14
// 09f9: ifnull 1367
// 09fc: aload 1
// 09fd: invokevirtual su/catlean/nh.s ()Z
// 0a00: iload 10
// 0a02: lload 3
// 0a03: lconst_0
// 0a04: lcmp
// 0a05: ifle 0bf8
// 0a08: ifne 0bf6
// 0a0b: goto 0a18
// 0a0e: ldc2_w 1740699562084943914
// 0a11: lload 3
// 0a12: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a17: athrow
// 0a18: ifeq 0bf5
// 0a1b: goto 0a28
// 0a1e: ldc2_w 1740699562084943914
// 0a21: lload 3
// 0a22: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a27: athrow
// 0a28: iload 2
// 0a29: lload 3
// 0a2a: lconst_0
// 0a2b: lcmp
// 0a2c: iflt 0aeb
// 0a2f: iload 10
// 0a31: ifne 0ae2
// 0a34: goto 0a41
// 0a37: ldc2_w 1740699562084943914
// 0a3a: lload 3
// 0a3b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a40: athrow
// 0a41: ifeq 0aee
// 0a44: goto 0a51
// 0a47: ldc2_w 1740699562084943914
// 0a4a: lload 3
// 0a4b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a50: athrow
// 0a51: aload 14
// 0a53: aload 1
// 0a54: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 0a57: invokestatic java/lang/Boolean.parseBoolean (Ljava/lang/String;)Z
// 0a5a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 0a5d: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 0a60: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 0a63: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 0a66: new su/catlean/ww
// 0a69: dup
// 0a6a: aload 1
// 0a6b: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 0a6e: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 0a71: aload 1
// 0a72: invokevirtual su/catlean/nh.X ()Lsu/catlean/lj;
// 0a75: invokevirtual su/catlean/lj.X ()I
// 0a78: lload 5
// 0a7a: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 0a7d: lload 7
// 0a7f: dup2_x1
// 0a80: pop2
// 0a81: aload 11
// 0a83: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 0a86: checkcast java/lang/CharSequence
// 0a89: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 0a8c: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 0a8f: aload 12
// 0a91: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 0a94: aload 1
// 0a95: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 0a98: sipush 26260
// 0a9b: ldc2_w 2244342778412889738
// 0a9e: lload 3
// 0a9f: lxor
// 0aa0: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa5: dup_x2
// 0aa6: pop
// 0aa7: sipush 26260
// 0aaa: ldc2_w 2244342778412889738
// 0aad: lload 3
// 0aae: lxor
// 0aaf: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab4: swap
// 0ab5: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 0aba: aconst_null
// 0abb: bipush 0
// 0abc: sipush 19884
// 0abf: ldc2_w 7464887090527731474
// 0ac2: lload 3
// 0ac3: lxor
// 0ac4: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac9: aconst_null
// 0aca: iload 9
// 0acc: i2b
// 0acd: invokespecial su/catlean/ww.<init> (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 0ad0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0ad5: goto 0ae2
// 0ad8: ldc2_w 1740699562084943914
// 0adb: lload 3
// 0adc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae1: athrow
// 0ae2: pop
// 0ae3: lload 3
// 0ae4: lconst_0
// 0ae5: lcmp
// 0ae6: iflt 0afd
// 0ae9: iload 10
// 0aeb: ifeq 1367
// 0aee: aload 14
// 0af0: aload 1
// 0af1: invokevirtual su/catlean/nh.V ()Ljava/lang/String;
// 0af4: invokestatic java/lang/Boolean.parseBoolean (Ljava/lang/String;)Z
// 0af7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 0afa: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 0afd: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 0b00: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 0b03: checkcast java/lang/Iterable
// 0b06: astore 15
// 0b08: bipush 0
// 0b09: istore 16
// 0b0b: aload 15
// 0b0d: astore 17
// 0b0f: new java/util/ArrayList
// 0b12: dup
// 0b13: invokespecial java/util/ArrayList.<init> ()V
// 0b16: checkcast java/util/Collection
// 0b19: astore 18
// 0b1b: bipush 0
// 0b1c: istore 19
// 0b1e: aload 17
// 0b20: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0b25: astore 20
// 0b27: aload 20
// 0b29: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0b2e: ifeq 0b8c
// 0b31: aload 20
// 0b33: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0b38: astore 21
// 0b3a: aload 21
// 0b3c: checkcast su/catlean/ww
// 0b3f: astore 22
// 0b41: bipush 0
// 0b42: istore 23
// 0b44: lload 3
// 0b45: lconst_0
// 0b46: lcmp
// 0b47: iflt 0ba1
// 0b4a: aload 22
// 0b4c: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 0b4f: aload 1
// 0b50: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 0b53: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b56: iload 10
// 0b58: ifne 0b9f
// 0b5b: iload 10
// 0b5d: ifne 0b86
// 0b60: goto 0b6d
// 0b63: ldc2_w 1740699562084943914
// 0b66: lload 3
// 0b67: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6c: athrow
// 0b6d: ifeq 0b27
// 0b70: goto 0b7d
// 0b73: ldc2_w 1740699562084943914
// 0b76: lload 3
// 0b77: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7c: athrow
// 0b7d: aload 18
// 0b7f: aload 21
// 0b81: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0b86: pop
// 0b87: iload 10
// 0b89: ifeq 0b27
// 0b8c: aload 18
// 0b8e: checkcast java/util/List
// 0b91: nop
// 0b92: checkcast java/lang/Iterable
// 0b95: astore 15
// 0b97: nop
// 0b98: lload 3
// 0b99: lconst_0
// 0b9a: lcmp
// 0b9b: iflt 0ba1
// 0b9e: bipush 0
// 0b9f: istore 16
// 0ba1: aload 15
// 0ba3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0ba8: astore 17
// 0baa: aload 17
// 0bac: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0bb1: ifeq 0bf1
// 0bb4: aload 17
// 0bb6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0bbb: astore 18
// 0bbd: aload 18
// 0bbf: checkcast su/catlean/ww
// 0bc2: astore 19
// 0bc4: bipush 0
// 0bc5: istore 20
// 0bc7: aload 19
// 0bc9: bipush 1
// 0bca: invokevirtual su/catlean/ww.W (Z)V
// 0bcd: nop
// 0bce: iload 10
// 0bd0: lload 3
// 0bd1: lconst_0
// 0bd2: lcmp
// 0bd3: iflt 0bdb
// 0bd6: ifne 0bf2
// 0bd9: iload 10
// 0bdb: ifeq 0baa
// 0bde: lload 3
// 0bdf: lconst_0
// 0be0: lcmp
// 0be1: iflt 0bce
// 0be4: goto 0bf1
// 0be7: ldc2_w 1740699562084943914
// 0bea: lload 3
// 0beb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf0: athrow
// 0bf1: nop
// 0bf2: goto 1367
// 0bf5: iload 2
// 0bf6: iload 10
// 0bf8: lload 3
// 0bf9: lconst_0
// 0bfa: lcmp
// 0bfb: iflt 0c2b
// 0bfe: ifne 0c29
// 0c01: ifeq 1367
// 0c04: goto 0c11
// 0c07: ldc2_w 1740699562084943914
// 0c0a: lload 3
// 0c0b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c10: athrow
// 0c11: aload 14
// 0c13: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0c16: checkcast java/lang/Boolean
// 0c19: invokevirtual java/lang/Boolean.booleanValue ()Z
// 0c1c: goto 0c29
// 0c1f: ldc2_w 1740699562084943914
// 0c22: lload 3
// 0c23: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c28: athrow
// 0c29: iload 10
// 0c2b: lload 3
// 0c2c: lconst_0
// 0c2d: lcmp
// 0c2e: ifle 0c3b
// 0c31: ifne 0dd6
// 0c34: aload 1
// 0c35: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 0c38: invokestatic java/lang/Boolean.parseBoolean (Ljava/lang/String;)Z
// 0c3b: if_icmpne 0d52
// 0c3e: goto 0c4b
// 0c41: ldc2_w 1740699562084943914
// 0c44: lload 3
// 0c45: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4a: athrow
// 0c4b: aload 14
// 0c4d: aload 1
// 0c4e: invokevirtual su/catlean/nh.V ()Ljava/lang/String;
// 0c51: invokestatic java/lang/Boolean.parseBoolean (Ljava/lang/String;)Z
// 0c54: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 0c57: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 0c5a: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 0c5d: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 0c60: checkcast java/lang/Iterable
// 0c63: astore 15
// 0c65: bipush 0
// 0c66: istore 16
// 0c68: aload 15
// 0c6a: astore 17
// 0c6c: new java/util/ArrayList
// 0c6f: dup
// 0c70: invokespecial java/util/ArrayList.<init> ()V
// 0c73: checkcast java/util/Collection
// 0c76: astore 18
// 0c78: bipush 0
// 0c79: istore 19
// 0c7b: aload 17
// 0c7d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0c82: astore 20
// 0c84: aload 20
// 0c86: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c8b: ifeq 0ce9
// 0c8e: aload 20
// 0c90: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c95: astore 21
// 0c97: aload 21
// 0c99: checkcast su/catlean/ww
// 0c9c: astore 22
// 0c9e: bipush 0
// 0c9f: istore 23
// 0ca1: lload 3
// 0ca2: lconst_0
// 0ca3: lcmp
// 0ca4: iflt 0cfe
// 0ca7: aload 22
// 0ca9: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 0cac: aload 1
// 0cad: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 0cb0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0cb3: iload 10
// 0cb5: ifne 0cfc
// 0cb8: iload 10
// 0cba: ifne 0ce3
// 0cbd: goto 0cca
// 0cc0: ldc2_w 1740699562084943914
// 0cc3: lload 3
// 0cc4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc9: athrow
// 0cca: ifeq 0c84
// 0ccd: goto 0cda
// 0cd0: ldc2_w 1740699562084943914
// 0cd3: lload 3
// 0cd4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd9: athrow
// 0cda: aload 18
// 0cdc: aload 21
// 0cde: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0ce3: pop
// 0ce4: iload 10
// 0ce6: ifeq 0c84
// 0ce9: aload 18
// 0ceb: checkcast java/util/List
// 0cee: nop
// 0cef: checkcast java/lang/Iterable
// 0cf2: astore 15
// 0cf4: nop
// 0cf5: lload 3
// 0cf6: lconst_0
// 0cf7: lcmp
// 0cf8: iflt 0cfe
// 0cfb: bipush 0
// 0cfc: istore 16
// 0cfe: aload 15
// 0d00: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0d05: astore 17
// 0d07: aload 17
// 0d09: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0d0e: ifeq 0d4e
// 0d11: aload 17
// 0d13: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0d18: astore 18
// 0d1a: aload 18
// 0d1c: checkcast su/catlean/ww
// 0d1f: astore 19
// 0d21: bipush 0
// 0d22: istore 20
// 0d24: aload 19
// 0d26: bipush 1
// 0d27: invokevirtual su/catlean/ww.W (Z)V
// 0d2a: nop
// 0d2b: iload 10
// 0d2d: lload 3
// 0d2e: lconst_0
// 0d2f: lcmp
// 0d30: iflt 0d38
// 0d33: ifne 0d4f
// 0d36: iload 10
// 0d38: ifeq 0d07
// 0d3b: lload 3
// 0d3c: lconst_0
// 0d3d: lcmp
// 0d3e: ifle 0d2b
// 0d41: goto 0d4e
// 0d44: ldc2_w 1740699562084943914
// 0d47: lload 3
// 0d48: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4d: athrow
// 0d4e: nop
// 0d4f: goto 1367
// 0d52: aload 14
// 0d54: aload 1
// 0d55: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 0d58: invokestatic java/lang/Boolean.parseBoolean (Ljava/lang/String;)Z
// 0d5b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 0d5e: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 0d61: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 0d64: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 0d67: new su/catlean/ww
// 0d6a: dup
// 0d6b: aload 1
// 0d6c: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 0d6f: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 0d72: aload 1
// 0d73: invokevirtual su/catlean/nh.X ()Lsu/catlean/lj;
// 0d76: invokevirtual su/catlean/lj.X ()I
// 0d79: lload 5
// 0d7b: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 0d7e: lload 7
// 0d80: dup2_x1
// 0d81: pop2
// 0d82: aload 11
// 0d84: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 0d87: checkcast java/lang/CharSequence
// 0d8a: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 0d8d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 0d90: aload 12
// 0d92: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 0d95: aload 1
// 0d96: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 0d99: sipush 26260
// 0d9c: ldc2_w 2244342778412889738
// 0d9f: lload 3
// 0da0: lxor
// 0da1: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da6: dup_x2
// 0da7: pop
// 0da8: sipush 26260
// 0dab: ldc2_w 2244342778412889738
// 0dae: lload 3
// 0daf: lxor
// 0db0: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db5: swap
// 0db6: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 0dbb: aconst_null
// 0dbc: bipush 0
// 0dbd: sipush 19884
// 0dc0: ldc2_w 7464887090527731474
// 0dc3: lload 3
// 0dc4: lxor
// 0dc5: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dca: aconst_null
// 0dcb: iload 9
// 0dcd: i2b
// 0dce: invokespecial su/catlean/ww.<init> (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 0dd1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0dd6: pop
// 0dd7: goto 1367
// 0dda: aload 13
// 0ddc: instanceof java/lang/Enum
// 0ddf: iload 10
// 0de1: ifne 0e18
// 0de4: ifeq 1366
// 0de7: goto 0df4
// 0dea: ldc2_w 1740699562084943914
// 0ded: lload 3
// 0dee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df3: athrow
// 0df4: aload 12
// 0df6: iload 10
// 0df8: ifne 0e1d
// 0dfb: goto 0e08
// 0dfe: ldc2_w 1740699562084943914
// 0e01: lload 3
// 0e02: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e07: athrow
// 0e08: instanceof su/catlean/a1
// 0e0b: goto 0e18
// 0e0e: ldc2_w 1740699562084943914
// 0e11: lload 3
// 0e12: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e17: athrow
// 0e18: ifeq 0e20
// 0e1b: aload 12
// 0e1d: goto 0e21
// 0e20: aconst_null
// 0e21: astore 14
// 0e23: aload 14
// 0e25: iload 10
// 0e27: ifne 0e4c
// 0e2a: ifnull 1367
// 0e2d: goto 0e3a
// 0e30: ldc2_w 1740699562084943914
// 0e33: lload 3
// 0e34: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e39: athrow
// 0e3a: aload 14
// 0e3c: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0e3f: goto 0e4c
// 0e42: ldc2_w 1740699562084943914
// 0e45: lload 3
// 0e46: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4b: athrow
// 0e4c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
// 0e4f: invokevirtual java/lang/Class.getEnumConstants ()[Ljava/lang/Object;
// 0e52: dup
// 0e53: sipush 22911
// 0e56: ldc2_w 4235691869597649257
// 0e59: lload 3
// 0e5a: lxor
// 0e5b: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e60: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e63: astore 17
// 0e65: bipush 0
// 0e66: istore 18
// 0e68: bipush 0
// 0e69: istore 19
// 0e6b: aload 17
// 0e6d: arraylength
// 0e6e: istore 20
// 0e70: iload 19
// 0e72: iload 20
// 0e74: if_icmpge 0ee9
// 0e77: aload 17
// 0e79: iload 19
// 0e7b: aaload
// 0e7c: astore 21
// 0e7e: aload 21
// 0e80: checkcast java/lang/Enum
// 0e83: astore 22
// 0e85: bipush 0
// 0e86: istore 23
// 0e88: iload 10
// 0e8a: lload 3
// 0e8b: lconst_0
// 0e8c: lcmp
// 0e8d: ifle 0ee6
// 0e90: ifne 0ee4
// 0e93: aload 22
// 0e95: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
// 0e98: lload 3
// 0e99: lconst_0
// 0e9a: lcmp
// 0e9b: iflt 0ef0
// 0e9e: iload 10
// 0ea0: ifne 0ef0
// 0ea3: goto 0eb0
// 0ea6: ldc2_w 1740699562084943914
// 0ea9: lload 3
// 0eaa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eaf: athrow
// 0eb0: aload 1
// 0eb1: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 0eb4: ldc " "
// 0eb6: ldc "_"
// 0eb8: bipush 0
// 0eb9: bipush 4
// 0eba: aconst_null
// 0ebb: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 0ebe: bipush 1
// 0ebf: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
// 0ec2: ifeq 0ee1
// 0ec5: goto 0ed2
// 0ec8: ldc2_w 1740699562084943914
// 0ecb: lload 3
// 0ecc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed1: athrow
// 0ed2: aload 21
// 0ed4: goto 0ef0
// 0ed7: ldc2_w 1740699562084943914
// 0eda: lload 3
// 0edb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee0: athrow
// 0ee1: iinc 19 1
// 0ee4: iload 10
// 0ee6: ifeq 0e70
// 0ee9: lload 3
// 0eea: lconst_0
// 0eeb: lcmp
// 0eec: iflt 1367
// 0eef: aconst_null
// 0ef0: checkcast java/lang/Enum
// 0ef3: dup
// 0ef4: ifnonnull 0f03
// 0ef7: pop
// 0ef8: return
// 0ef9: ldc2_w 1740699562084943914
// 0efc: lload 3
// 0efd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f02: athrow
// 0f03: astore 15
// 0f05: aload 14
// 0f07: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0f0a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
// 0f0d: invokevirtual java/lang/Class.getEnumConstants ()[Ljava/lang/Object;
// 0f10: dup
// 0f11: sipush 14290
// 0f14: ldc2_w 230571770570778565
// 0f17: lload 3
// 0f18: lxor
// 0f19: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f21: astore 18
// 0f23: bipush 0
// 0f24: istore 19
// 0f26: bipush 0
// 0f27: istore 20
// 0f29: aload 18
// 0f2b: arraylength
// 0f2c: istore 21
// 0f2e: iload 20
// 0f30: iload 21
// 0f32: if_icmpge 0fa7
// 0f35: aload 18
// 0f37: iload 20
// 0f39: aaload
// 0f3a: astore 22
// 0f3c: aload 22
// 0f3e: checkcast java/lang/Enum
// 0f41: astore 23
// 0f43: bipush 0
// 0f44: istore 24
// 0f46: iload 10
// 0f48: lload 3
// 0f49: lconst_0
// 0f4a: lcmp
// 0f4b: ifle 0fa4
// 0f4e: ifne 0fa2
// 0f51: aload 23
// 0f53: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
// 0f56: lload 3
// 0f57: lconst_0
// 0f58: lcmp
// 0f59: iflt 0fae
// 0f5c: iload 10
// 0f5e: ifne 0fae
// 0f61: goto 0f6e
// 0f64: ldc2_w 1740699562084943914
// 0f67: lload 3
// 0f68: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6d: athrow
// 0f6e: aload 1
// 0f6f: invokevirtual su/catlean/nh.V ()Ljava/lang/String;
// 0f72: ldc " "
// 0f74: ldc "_"
// 0f76: bipush 0
// 0f77: bipush 4
// 0f78: aconst_null
// 0f79: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 0f7c: bipush 1
// 0f7d: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
// 0f80: ifeq 0f9f
// 0f83: goto 0f90
// 0f86: ldc2_w 1740699562084943914
// 0f89: lload 3
// 0f8a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8f: athrow
// 0f90: aload 22
// 0f92: goto 0fae
// 0f95: ldc2_w 1740699562084943914
// 0f98: lload 3
// 0f99: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9e: athrow
// 0f9f: iinc 20 1
// 0fa2: iload 10
// 0fa4: ifeq 0f2e
// 0fa7: lload 3
// 0fa8: lconst_0
// 0fa9: lcmp
// 0faa: ifle 1367
// 0fad: aconst_null
// 0fae: checkcast java/lang/Enum
// 0fb1: dup
// 0fb2: ifnonnull 0fc1
// 0fb5: pop
// 0fb6: return
// 0fb7: ldc2_w 1740699562084943914
// 0fba: lload 3
// 0fbb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc0: athrow
// 0fc1: astore 16
// 0fc3: aload 1
// 0fc4: invokevirtual su/catlean/nh.s ()Z
// 0fc7: iload 10
// 0fc9: lload 3
// 0fca: lconst_0
// 0fcb: lcmp
// 0fcc: iflt 11a2
// 0fcf: ifne 11a0
// 0fd2: ifeq 119f
// 0fd5: goto 0fe2
// 0fd8: ldc2_w 1740699562084943914
// 0fdb: lload 3
// 0fdc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe1: athrow
// 0fe2: iload 2
// 0fe3: lload 3
// 0fe4: lconst_0
// 0fe5: lcmp
// 0fe6: iflt 109d
// 0fe9: iload 10
// 0feb: ifne 1094
// 0fee: goto 0ffb
// 0ff1: ldc2_w 1740699562084943914
// 0ff4: lload 3
// 0ff5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ffa: athrow
// 0ffb: ifeq 10a0
// 0ffe: goto 100b
// 1001: ldc2_w 1740699562084943914
// 1004: lload 3
// 1005: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100a: athrow
// 100b: aload 14
// 100d: aload 15
// 100f: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 1012: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 1015: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 1018: new su/catlean/ww
// 101b: dup
// 101c: aload 1
// 101d: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 1020: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 1023: aload 1
// 1024: invokevirtual su/catlean/nh.X ()Lsu/catlean/lj;
// 1027: invokevirtual su/catlean/lj.X ()I
// 102a: lload 5
// 102c: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 102f: lload 7
// 1031: dup2_x1
// 1032: pop2
// 1033: aload 11
// 1035: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 1038: checkcast java/lang/CharSequence
// 103b: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 103e: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 1041: aload 12
// 1043: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 1046: aload 1
// 1047: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 104a: sipush 26260
// 104d: ldc2_w 2244342778412889738
// 1050: lload 3
// 1051: lxor
// 1052: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1057: dup_x2
// 1058: pop
// 1059: sipush 26260
// 105c: ldc2_w 2244342778412889738
// 105f: lload 3
// 1060: lxor
// 1061: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1066: swap
// 1067: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 106c: aconst_null
// 106d: bipush 0
// 106e: sipush 19884
// 1071: ldc2_w 7464887090527731474
// 1074: lload 3
// 1075: lxor
// 1076: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107b: aconst_null
// 107c: iload 9
// 107e: i2b
// 107f: invokespecial su/catlean/ww.<init> (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 1082: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1087: goto 1094
// 108a: ldc2_w 1740699562084943914
// 108d: lload 3
// 108e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1093: athrow
// 1094: pop
// 1095: lload 3
// 1096: lconst_0
// 1097: lcmp
// 1098: ifle 10a7
// 109b: iload 10
// 109d: ifeq 1367
// 10a0: aload 14
// 10a2: aload 16
// 10a4: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 10a7: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 10aa: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 10ad: checkcast java/lang/Iterable
// 10b0: astore 17
// 10b2: bipush 0
// 10b3: istore 18
// 10b5: aload 17
// 10b7: astore 19
// 10b9: new java/util/ArrayList
// 10bc: dup
// 10bd: invokespecial java/util/ArrayList.<init> ()V
// 10c0: checkcast java/util/Collection
// 10c3: astore 20
// 10c5: bipush 0
// 10c6: istore 21
// 10c8: aload 19
// 10ca: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 10cf: astore 22
// 10d1: aload 22
// 10d3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 10d8: ifeq 1136
// 10db: aload 22
// 10dd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 10e2: astore 23
// 10e4: aload 23
// 10e6: checkcast su/catlean/ww
// 10e9: astore 24
// 10eb: bipush 0
// 10ec: istore 25
// 10ee: lload 3
// 10ef: lconst_0
// 10f0: lcmp
// 10f1: iflt 114b
// 10f4: aload 24
// 10f6: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 10f9: aload 1
// 10fa: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 10fd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1100: iload 10
// 1102: ifne 1149
// 1105: iload 10
// 1107: ifne 1130
// 110a: goto 1117
// 110d: ldc2_w 1740699562084943914
// 1110: lload 3
// 1111: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1116: athrow
// 1117: ifeq 10d1
// 111a: goto 1127
// 111d: ldc2_w 1740699562084943914
// 1120: lload 3
// 1121: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1126: athrow
// 1127: aload 20
// 1129: aload 23
// 112b: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1130: pop
// 1131: iload 10
// 1133: ifeq 10d1
// 1136: aload 20
// 1138: checkcast java/util/List
// 113b: nop
// 113c: checkcast java/lang/Iterable
// 113f: astore 17
// 1141: nop
// 1142: lload 3
// 1143: lconst_0
// 1144: lcmp
// 1145: ifle 114b
// 1148: bipush 0
// 1149: istore 18
// 114b: aload 17
// 114d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1152: astore 19
// 1154: aload 19
// 1156: invokeinterface java/util/Iterator.hasNext ()Z 1
// 115b: ifeq 119b
// 115e: aload 19
// 1160: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1165: astore 20
// 1167: aload 20
// 1169: checkcast su/catlean/ww
// 116c: astore 21
// 116e: bipush 0
// 116f: istore 22
// 1171: aload 21
// 1173: bipush 1
// 1174: invokevirtual su/catlean/ww.W (Z)V
// 1177: nop
// 1178: iload 10
// 117a: lload 3
// 117b: lconst_0
// 117c: lcmp
// 117d: ifle 1185
// 1180: ifne 119c
// 1183: iload 10
// 1185: ifeq 1154
// 1188: lload 3
// 1189: lconst_0
// 118a: lcmp
// 118b: iflt 1178
// 118e: goto 119b
// 1191: ldc2_w 1740699562084943914
// 1194: lload 3
// 1195: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119a: athrow
// 119b: nop
// 119c: goto 1367
// 119f: iload 2
// 11a0: iload 10
// 11a2: lload 3
// 11a3: lconst_0
// 11a4: lcmp
// 11a5: ifle 11d4
// 11a8: ifne 11d2
// 11ab: ifeq 1367
// 11ae: goto 11bb
// 11b1: ldc2_w 1740699562084943914
// 11b4: lload 3
// 11b5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11ba: athrow
// 11bb: aload 14
// 11bd: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 11c0: aload 15
// 11c2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 11c5: goto 11d2
// 11c8: ldc2_w 1740699562084943914
// 11cb: lload 3
// 11cc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d1: athrow
// 11d2: iload 10
// 11d4: ifne 1362
// 11d7: ifeq 12e6
// 11da: goto 11e7
// 11dd: ldc2_w 1740699562084943914
// 11e0: lload 3
// 11e1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e6: athrow
// 11e7: aload 14
// 11e9: aload 16
// 11eb: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 11ee: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 11f1: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 11f4: checkcast java/lang/Iterable
// 11f7: astore 17
// 11f9: bipush 0
// 11fa: istore 18
// 11fc: aload 17
// 11fe: astore 19
// 1200: new java/util/ArrayList
// 1203: dup
// 1204: invokespecial java/util/ArrayList.<init> ()V
// 1207: checkcast java/util/Collection
// 120a: astore 20
// 120c: bipush 0
// 120d: istore 21
// 120f: aload 19
// 1211: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1216: astore 22
// 1218: aload 22
// 121a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 121f: ifeq 127d
// 1222: aload 22
// 1224: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1229: astore 23
// 122b: aload 23
// 122d: checkcast su/catlean/ww
// 1230: astore 24
// 1232: bipush 0
// 1233: istore 25
// 1235: lload 3
// 1236: lconst_0
// 1237: lcmp
// 1238: ifle 1292
// 123b: aload 24
// 123d: invokevirtual su/catlean/ww.y ()Ljava/lang/String;
// 1240: aload 1
// 1241: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 1244: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1247: iload 10
// 1249: ifne 1290
// 124c: iload 10
// 124e: ifne 1277
// 1251: goto 125e
// 1254: ldc2_w 1740699562084943914
// 1257: lload 3
// 1258: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125d: athrow
// 125e: ifeq 1218
// 1261: goto 126e
// 1264: ldc2_w 1740699562084943914
// 1267: lload 3
// 1268: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126d: athrow
// 126e: aload 20
// 1270: aload 23
// 1272: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1277: pop
// 1278: iload 10
// 127a: ifeq 1218
// 127d: aload 20
// 127f: checkcast java/util/List
// 1282: nop
// 1283: checkcast java/lang/Iterable
// 1286: astore 17
// 1288: nop
// 1289: lload 3
// 128a: lconst_0
// 128b: lcmp
// 128c: ifle 1292
// 128f: bipush 0
// 1290: istore 18
// 1292: aload 17
// 1294: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1299: astore 19
// 129b: aload 19
// 129d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 12a2: ifeq 12e2
// 12a5: aload 19
// 12a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 12ac: astore 20
// 12ae: aload 20
// 12b0: checkcast su/catlean/ww
// 12b3: astore 21
// 12b5: bipush 0
// 12b6: istore 22
// 12b8: aload 21
// 12ba: bipush 1
// 12bb: invokevirtual su/catlean/ww.W (Z)V
// 12be: nop
// 12bf: iload 10
// 12c1: lload 3
// 12c2: lconst_0
// 12c3: lcmp
// 12c4: ifle 12cc
// 12c7: ifne 12e3
// 12ca: iload 10
// 12cc: ifeq 129b
// 12cf: lload 3
// 12d0: lconst_0
// 12d1: lcmp
// 12d2: ifle 12bf
// 12d5: goto 12e2
// 12d8: ldc2_w 1740699562084943914
// 12db: lload 3
// 12dc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e1: athrow
// 12e2: nop
// 12e3: goto 1367
// 12e6: aload 14
// 12e8: aload 15
// 12ea: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 12ed: getstatic su/catlean/pj.J Lsu/catlean/pj;
// 12f0: invokevirtual su/catlean/pj.K ()Ljava/util/List;
// 12f3: new su/catlean/ww
// 12f6: dup
// 12f7: aload 1
// 12f8: invokevirtual su/catlean/nh.W ()Ljava/lang/String;
// 12fb: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 12fe: aload 1
// 12ff: invokevirtual su/catlean/nh.X ()Lsu/catlean/lj;
// 1302: invokevirtual su/catlean/lj.X ()I
// 1305: lload 5
// 1307: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 130a: lload 7
// 130c: dup2_x1
// 130d: pop2
// 130e: aload 11
// 1310: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 1313: checkcast java/lang/CharSequence
// 1316: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 1319: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 131c: aload 12
// 131e: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 1321: aload 1
// 1322: invokevirtual su/catlean/nh.M ()Ljava/lang/String;
// 1325: sipush 26260
// 1328: ldc2_w 2244342778412889738
// 132b: lload 3
// 132c: lxor
// 132d: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1332: dup_x2
// 1333: pop
// 1334: sipush 26260
// 1337: ldc2_w 2244342778412889738
// 133a: lload 3
// 133b: lxor
// 133c: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1341: swap
// 1342: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 1347: aconst_null
// 1348: bipush 0
// 1349: sipush 19884
// 134c: ldc2_w 7464887090527731474
// 134f: lload 3
// 1350: lxor
// 1351: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1356: aconst_null
// 1357: iload 9
// 1359: i2b
// 135a: invokespecial su/catlean/ww.<init> (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lsu/catlean/fd;ZILkotlin/jvm/internal/DefaultConstructorMarker;B)V
// 135d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1362: pop
// 1363: goto 1367
// 1366: return
// 1367: return
}

@Nullable
public final class_1792 e(@NotNull String id, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zg.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: ldc2_w 1010229523630296859
// 009: lload 2
// 00a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: aload 1
// 010: sipush 11556
// 013: ldc2_w 8200851622551628728
// 016: lload 2
// 017: lxor
// 018: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: istore 4
// 022: getstatic su/catlean/zg.F Ljava/util/Map;
// 025: aload 1
// 026: iload 4
// 028: ifeq 051
// 02b: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
// 030: ifeq 05a
// 033: goto 040
// 036: ldc2_w 1055071129321103014
// 039: lload 2
// 03a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: athrow
// 040: getstatic su/catlean/zg.F Ljava/util/Map;
// 043: aload 1
// 044: goto 051
// 047: ldc2_w 1055071129321103014
// 04a: lload 2
// 04b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: athrow
// 051: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 056: checkcast net/minecraft/class_1792
// 059: areturn
// 05a: getstatic net/minecraft/class_7923.field_41175 Lnet/minecraft/class_7922;
// 05d: invokeinterface net/minecraft/class_7922.iterator ()Ljava/util/Iterator; 1
// 062: astore 5
// 064: aload 5
// 066: invokeinterface java/util/Iterator.hasNext ()Z 1
// 06b: ifeq 0ca
// 06e: aload 5
// 070: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 075: dup
// 076: sipush 402
// 079: ldc2_w 1073042770588600077
// 07c: lload 2
// 07d: lxor
// 07e: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 086: checkcast net/minecraft/class_2248
// 089: astore 6
// 08b: aload 6
// 08d: invokevirtual net/minecraft/class_2248.method_63499 ()Ljava/lang/String;
// 090: aload 1
// 091: sipush 16957
// 094: ldc2_w 4716395709150020779
// 097: lload 2
// 098: lxor
// 099: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: swap
// 09f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 0a4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0a7: ifeq 064
// 0aa: getstatic su/catlean/zg.F Ljava/util/Map;
// 0ad: aload 1
// 0ae: aload 6
// 0b0: invokevirtual net/minecraft/class_2248.method_8389 ()Lnet/minecraft/class_1792;
// 0b3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 0b8: pop
// 0b9: aload 6
// 0bb: invokevirtual net/minecraft/class_2248.method_8389 ()Lnet/minecraft/class_1792;
// 0be: lload 2
// 0bf: lconst_0
// 0c0: lcmp
// 0c1: ifle 075
// 0c4: iload 4
// 0c6: ifeq 086
// 0c9: areturn
// 0ca: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
// 0cd: invokeinterface net/minecraft/class_7922.iterator ()Ljava/util/Iterator; 1
// 0d2: astore 5
// 0d4: aload 5
// 0d6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0db: ifeq 123
// 0de: aload 5
// 0e0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0e5: checkcast net/minecraft/class_1792
// 0e8: astore 6
// 0ea: aload 6
// 0ec: invokevirtual net/minecraft/class_1792.method_7876 ()Ljava/lang/String;
// 0ef: aload 1
// 0f0: sipush 30549
// 0f3: ldc2_w 6005649652566421960
// 0f6: lload 2
// 0f7: lxor
// 0f8: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: swap
// 0fe: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 103: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 106: ifeq 0d4
// 109: getstatic su/catlean/zg.F Ljava/util/Map;
// 10c: aload 1
// 10d: aload 6
// 10f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 114: pop
// 115: aload 6
// 117: lload 2
// 118: lconst_0
// 119: lcmp
// 11a: ifle 0e8
// 11d: iload 4
// 11f: ifeq 0ec
// 122: areturn
// 123: aconst_null
// 124: areturn
}

private static final void s(wl var0) {
long var1 = a ^ 58802903654858L;
long var3 = var1 ^ 138203307234862L;
v.L((ft)var0, var3);
}

private static final void W() {
long var0 = a ^ 86841199251415L;
long var2 = var0 ^ 64918212530328L;
long var4 = var0 ^ 30440501632702L;
class_310 var10000 = zf.F(var2);
Intrinsics.checkNotNull(var10000, a<"b">(31138, 1390178091039948074L ^ var0));
((MinecraftAccessor)var10000).idoItemUse();
zf.v(var4).method_6104(class_1268.field_5808);
}

private static final Unit r(ft param0, fg param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zg.a J
// 003: ldc2_w 137875690655356
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 9432146284851
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 35549218787231
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 59016328474138
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 32
// 029: lushr
// 02a: lstore 9
// 02c: pop2
// 02d: dup2
// 02e: ldc2_w 135769103220903
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 46345115247026
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 44193570135829
// 03f: lxor
// 040: lstore 15
// 042: pop2
// 043: ldc2_w 5556184641607461824
// 046: lload 2
// 047: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: istore 17
// 04e: aload 0
// 04f: invokevirtual su/catlean/ft.h ()Z
// 052: iload 17
// 054: ifne 0b2
// 057: ifeq 0a1
// 05a: goto 067
// 05d: ldc2_w 5553528482558057744
// 060: lload 2
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: aload 1
// 068: invokevirtual su/catlean/fg.a ()I
// 06b: lload 15
// 06d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 070: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 073: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 076: lload 11
// 078: dup2_x1
// 079: pop2
// 07a: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 07d: bipush 0
// 07e: sipush 4849
// 081: ldc2_w 3175530114954818932
// 084: lload 2
// 085: lxor
// 086: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: aconst_null
// 08c: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 08f: iload 17
// 091: ifeq 1ef
// 094: goto 0a1
// 097: ldc2_w 5553528482558057744
// 09a: lload 2
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: aload 1
// 0a2: invokevirtual su/catlean/fg.a ()I
// 0a5: goto 0b2
// 0a8: ldc2_w 5553528482558057744
// 0ab: lload 2
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: lload 15
// 0b4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b7: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0ba: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 0bd: lload 11
// 0bf: dup2_x1
// 0c0: pop2
// 0c1: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 0c4: bipush 0
// 0c5: sipush 20969
// 0c8: ldc2_w 704627522600154728
// 0cb: lload 2
// 0cc: lxor
// 0cd: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: aconst_null
// 0d3: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 0d6: lload 4
// 0d8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0db: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 0de: iload 17
// 0e0: ifne 108
// 0e3: ifnull 157
// 0e6: goto 0f3
// 0e9: ldc2_w 5553528482558057744
// 0ec: lload 2
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: lload 4
// 0f5: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f8: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 0fb: goto 108
// 0fe: ldc2_w 5553528482558057744
// 101: lload 2
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: instanceof net/minecraft/class_3965
// 10b: iload 17
// 10d: ifne 154
// 110: ifeq 157
// 113: goto 120
// 116: ldc2_w 5553528482558057744
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: lload 13
// 122: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 125: lload 4
// 127: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 12a: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 12d: dup
// 12e: sipush 9417
// 131: ldc2_w 2319751036949291494
// 134: lload 2
// 135: lxor
// 136: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 13e: checkcast net/minecraft/class_3965
// 141: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 144: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 147: goto 154
// 14a: ldc2_w 5553528482558057744
// 14d: lload 2
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: ifeq 17c
// 157: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 15a: fconst_0
// 15b: lload 6
// 15d: fconst_0
// 15e: sipush 12878
// 161: ldc2_w 2600680727844050377
// 164: lload 2
// 165: lxor
// 166: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: aconst_null
// 16c: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 16f: goto 1bb
// 172: ldc2_w 5553528482558057744
// 175: lload 2
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: iload 8
// 17e: lload 9
// 180: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 183: lload 15
// 185: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 188: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 18b: lload 4
// 18d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 190: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 193: dup
// 194: sipush 9417
// 197: ldc2_w 2319751036949291494
// 19a: lload 2
// 19b: lxor
// 19c: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1a4: checkcast net/minecraft/class_3965
// 1a7: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
// 1aa: dup
// 1ab: sipush 25072
// 1ae: ldc2_w 6333265109385782485
// 1b1: lload 2
// 1b2: lxor
// 1b3: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/zg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1bb: pop
// 1bc: lload 15
// 1be: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c1: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1c4: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 1c7: aload 1
// 1c8: invokevirtual su/catlean/fg.a ()I
// 1cb: lload 15
// 1cd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d0: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1d3: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 1d6: lload 11
// 1d8: dup2_x1
// 1d9: pop2
// 1da: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 1dd: bipush 0
// 1de: sipush 20969
// 1e1: ldc2_w 704627522600154728
// 1e4: lload 2
// 1e5: lxor
// 1e6: invokedynamic t (IJ)I bsm=su/catlean/zg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1eb: aconst_null
// 1ec: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 1ef: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 1f2: areturn
}

static {
long var11 = a ^ 132680317961752L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[15];
int var18 = 0;
String var17 = "\u0099G\u0083H¯ÔJhW\u0091\u001e\u0087\u0018\u000bì+\u0098Krô2\u009f½\u0013ä]\u008d\u0087¶\nU\u0003\u0095Üç\u0089,ËÛ\u0098\u007f\u0005\u0010¶\u0004\u0093Ä\f6\u0012ä\tM\fÍ\u001f¾9\u009a N\n¬Á+¢\u008em\u001c\u001bF/#\u0098\u0016aF\u0018UñLhô\u0006\u0082\u001d\u008d\u0007Á¥½¢ååëA\u0097`\u0089¦ç\u0085×w¼~OT\u008d`\u0093b\u001fxÚ\u0089×\u001b\u009e¦\u000b\u0099lÊÆX¶ß \nÊYó£tÞHf\u0014Ê\u008a\u0015XT\bæ\u0097Ý~\u00897Ð}!kfÉ\u009ef+ú\u0010\\4m1zóá}\u000fg9·B\u009dË\u0094\u0018Ú¼CSeä\np4c}Uyd¾©\taÓFYÜ£\t(£üùq$f\u0091^1«ÙïsS\r²8¬,?ÉIT\u000bÆ¦f¢X\u0011=\u0098òr$\u0018Í£_\u0019(\u00ad\u0011ÙOS¬\fO\u0011Ä\u0094W \u0007\u0089Æ`Ü~\u009d(Ä-]\u001d*!;\u009a\u0000üÚ¨=\t?EgIÈ\u0010µ\u00adâ\u0083\u0006ZñîI\u009fÿ\u008e3 Àÿxá\u0082Uò\u009c$\u0085þE÷×\u0018c\u0006I¬ÀgðÐ\u0016 Ò7G\"\u00823øÂb\u0089i²¾©\u00898c{òÕ´o\u0087òfÈ\u0088y\u000b\u0018óK\u000fMì«ßZÞm\u001b[OL3òU\u0082Q\u0088w¾\u0001¯\fl\u0096\u0083òáe¾f·§)ä\u0006ìÏ\u0087á²CÍÅñ\u00adlê»\u0004u\u000fÿÛ\u0098`RfmaBÝ@{q\u008b(\u0005µQEIñ*ÚØX\u008f Ý~dW=¼\u009dMEvÐ\u0096ûl\u0017®×\u0096?ö\u009aèW\u0081²ó»\u0003 \u007f\u0095PÍÜþ\u0010[¹¥EôÉÅWdÍÌë\u0086Êß`ø\u001e%!ë\u000eà}X\u0010\u009cK]Î}»-©mÉã\tg&NI\u0088ìòÝ³g4T\u0012\u0082\u009a7XàµÜ÷TÚðUÒÊßï_\bÁ\u0080¤^r h}ß.çÆ\u009c±N,©[\u008beÀ;\u0006\u009c\\\u0088\u00ad\u0086ÑQ\u0015é\u0093_\u008d#I\u000e=\u0086\u0098\u009bÖ\u0000\u009cünm«\u0099Å«@V\u0087XVJÊ\u0082\u0010Áò¨:ë\u0000mD\u000f³î7TU\u0080+y\u0090²\u0096¡Àí3Fh©\u0088\u00ad\u0010¶Nzð\u0095\u0088\u009b#\u009di\u0084:è*ê¬E\u0013$\u0010\u008crö\u0017ÛeÖM\u0019\u0091;ýzgk ";
int var19 = "\u0099G\u0083H¯ÔJhW\u0091\u001e\u0087\u0018\u000bì+\u0098Krô2\u009f½\u0013ä]\u008d\u0087¶\nU\u0003\u0095Üç\u0089,ËÛ\u0098\u007f\u0005\u0010¶\u0004\u0093Ä\f6\u0012ä\tM\fÍ\u001f¾9\u009a N\n¬Á+¢\u008em\u001c\u001bF/#\u0098\u0016aF\u0018UñLhô\u0006\u0082\u001d\u008d\u0007Á¥½¢ååëA\u0097`\u0089¦ç\u0085×w¼~OT\u008d`\u0093b\u001fxÚ\u0089×\u001b\u009e¦\u000b\u0099lÊÆX¶ß \nÊYó£tÞHf\u0014Ê\u008a\u0015XT\bæ\u0097Ý~\u00897Ð}!kfÉ\u009ef+ú\u0010\\4m1zóá}\u000fg9·B\u009dË\u0094\u0018Ú¼CSeä\np4c}Uyd¾©\taÓFYÜ£\t(£üùq$f\u0091^1«ÙïsS\r²8¬,?ÉIT\u000bÆ¦f¢X\u0011=\u0098òr$\u0018Í£_\u0019(\u00ad\u0011ÙOS¬\fO\u0011Ä\u0094W \u0007\u0089Æ`Ü~\u009d(Ä-]\u001d*!;\u009a\u0000üÚ¨=\t?EgIÈ\u0010µ\u00adâ\u0083\u0006ZñîI\u009fÿ\u008e3 Àÿxá\u0082Uò\u009c$\u0085þE÷×\u0018c\u0006I¬ÀgðÐ\u0016 Ò7G\"\u00823øÂb\u0089i²¾©\u00898c{òÕ´o\u0087òfÈ\u0088y\u000b\u0018óK\u000fMì«ßZÞm\u001b[OL3òU\u0082Q\u0088w¾\u0001¯\fl\u0096\u0083òáe¾f·§)ä\u0006ìÏ\u0087á²CÍÅñ\u00adlê»\u0004u\u000fÿÛ\u0098`RfmaBÝ@{q\u008b(\u0005µQEIñ*ÚØX\u008f Ý~dW=¼\u009dMEvÐ\u0096ûl\u0017®×\u0096?ö\u009aèW\u0081²ó»\u0003 \u007f\u0095PÍÜþ\u0010[¹¥EôÉÅWdÍÌë\u0086Êß`ø\u001e%!ë\u000eà}X\u0010\u009cK]Î}»-©mÉã\tg&NI\u0088ìòÝ³g4T\u0012\u0082\u009a7XàµÜ÷TÚðUÒÊßï_\bÁ\u0080¤^r h}ß.çÆ\u009c±N,©[\u008beÀ;\u0006\u009c\\\u0088\u00ad\u0086ÑQ\u0015é\u0093_\u008d#I\u000e=\u0086\u0098\u009bÖ\u0000\u009cünm«\u0099Å«@V\u0087XVJÊ\u0082\u0010Áò¨:ë\u0000mD\u000f³î7TU\u0080+y\u0090²\u0096¡Àí3Fh©\u0088\u00ad\u0010¶Nzð\u0095\u0088\u009b#\u009di\u0084:è*ê¬E\u0013$\u0010\u008crö\u0017ÛeÖM\u0019\u0091;ýzgk "
.length();
char var16 = 128;
int var24 = -1;

label54:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var36;
if ((var24 += var16) >= var19) {
b = var20;
c = new String[15];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = "à±\u00adØ\u001d\u001aî\u0098ª\u0017ï°4ÆL\u001f¡<\u008d\u0094¦\f\u009fãvè¼>?Xí\u0005\u0015½@çÖ}r(";
int var5 = "à±\u00adØ\u001d\u001aî\u0098ª\u0017ï°4ÆL\u001f¡<\u008d\u0094¦\f\u009fãvè¼>?Xí\u0005\u0015½@çÖ}r(".length();
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
e = var6;
f = new Integer[7];
v = new zg();
F = new LinkedHashMap();
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "FÆsÃ\u0082+5\u0015«$§XßU\u0004K";
var5 = "FÆsÃ\u0082+5\u0015«$§XßU\u0004K".length();
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

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var36;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label54;
}

var17 = "\u0017kx\u008aæ\u0095Ùö\u0016\u0013\u0099)\u0001\u00918å¹=\u0084+`\u0090\u008dRòm\u0005MÛÐ+\u009b\u0010Ã\u0082E\u0080Ì»fm\u001aè~v4UãÍ";
var19 = "\u0017kx\u008aæ\u0095Ùö\u0016\u0013\u0099)\u0001\u00918å¹=\u0084+`\u0090\u008dRòm\u0005MÛÐ+\u009b\u0010Ã\u0082E\u0080Ì»fm\u001aè~v4UãÍ".length();
var16 = ' ';
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
var10001 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2386;
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
throw new RuntimeException("su/catlean/zg", var10);
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
throw new RuntimeException("su/catlean/zg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 11262;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/zg", var14);
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
throw new RuntimeException("su/catlean/zg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
