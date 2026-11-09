package su.catlean;

import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class k4 extends _g {
@NotNull
public static final k4 A;
static final KProperty[] t;
@NotNull
private static final cw l;
@NotNull
private static final c8 K;
@NotNull
private static final ct N;
@NotNull
private static final ct c;
@NotNull
private static final CopyOnWriteArrayList F;
private static final long a = yz.a(6550658097735700130L, -3140550486208353437L, MethodHandles.lookup().lookupClass()).a(174716233842618L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private k4(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 28545929437629L;
super(b<"c">(25592, 4328651258134531300L ^ var4), jt.F(), null, 4, null, var6);
}

private final as g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 92064546683064L;
return (as)l.E(this, var3, t[0]);
}

private final int P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 100927173346411L;
return ((Number)K.E(this, var3, t[1])).intValue();
}

private final float h(short var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 73505396030907L;
return ((Number)N.E(this, var6, t[2])).floatValue();
}

private final float V(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 132814910861057L;
return ((Number)c.E(this, var3, t[3])).floatValue();
}

@Flow
private final void m(PlayerUpdateEvent var1) {
F.removeIf(k4::n);
}

@Flow
private final void r(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k4.a J
// 003: ldc2_w 138549526598736
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 70348927954044
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 80976303746633
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 115957414049809
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 74018442113871
// 03c: lxor
// 03d: dup2
// 03e: bipush 32
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: dup2
// 045: bipush 32
// 047: lshl
// 048: bipush 32
// 04a: lushr
// 04b: lstore 12
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 120368055263468
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 122514123854398
// 059: lxor
// 05a: lstore 16
// 05c: dup2
// 05d: ldc2_w 75153139157347
// 060: lxor
// 061: lstore 18
// 063: dup2
// 064: ldc2_w 114522617553732
// 067: lxor
// 068: lstore 20
// 06a: dup2
// 06b: ldc2_w 134955267951676
// 06e: lxor
// 06f: dup2
// 070: bipush 48
// 072: lushr
// 073: l2i
// 074: istore 22
// 076: dup2
// 077: bipush 16
// 079: lshl
// 07a: bipush 32
// 07c: lushr
// 07d: l2i
// 07e: istore 23
// 080: dup2
// 081: bipush 48
// 083: lshl
// 084: bipush 48
// 086: lushr
// 087: l2i
// 088: istore 24
// 08a: pop2
// 08b: pop2
// 08c: ldc2_w 8050762825900973766
// 08f: lload 2
// 090: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: astore 30
// 097: aload 0
// 098: lload 14
// 09a: invokespecial su/catlean/k4.g (J)Lsu/catlean/as;
// 09d: getstatic su/catlean/as.DEFAULT Lsu/catlean/as;
// 0a0: if_acmpne 2d8
// 0a3: getstatic su/catlean/k4.F Ljava/util/concurrent/CopyOnWriteArrayList;
// 0a6: checkcast java/util/Collection
// 0a9: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0ae: aload 30
// 0b0: ifnull 0d1
// 0b3: goto 0c0
// 0b6: ldc2_w 8047191962602653349
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: ifne 0d4
// 0c3: goto 0d0
// 0c6: ldc2_w 8047191962602653349
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: bipush 1
// 0d1: goto 0d5
// 0d4: bipush 0
// 0d5: ifeq 33b
// 0d8: aconst_null
// 0d9: astore 31
// 0db: new su/catlean/g7
// 0de: dup
// 0df: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 0e2: dup
// 0e3: sipush 27138
// 0e6: ldc2_w 6165009513401768507
// 0e9: lload 2
// 0ea: lxor
// 0eb: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f3: getstatic su/catlean/k4.F Ljava/util/concurrent/CopyOnWriteArrayList;
// 0f6: invokevirtual java/util/concurrent/CopyOnWriteArrayList.size ()I
// 0f9: sipush 24648
// 0fc: ldc2_w 442134038601555266
// 0ff: lload 2
// 100: lxor
// 101: invokedynamic i (IJ)I bsm=su/catlean/k4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: imul
// 107: bipush 0
// 108: bipush 4
// 109: aconst_null
// 10a: astore 25
// 10c: istore 26
// 10e: istore 27
// 110: istore 28
// 112: astore 29
// 114: lload 4
// 116: aload 29
// 118: iload 28
// 11a: iload 27
// 11c: iload 26
// 11e: aload 25
// 120: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 123: astore 31
// 125: getstatic su/catlean/k4.F Ljava/util/concurrent/CopyOnWriteArrayList;
// 128: checkcast java/lang/Iterable
// 12b: astore 32
// 12d: bipush 0
// 12e: istore 33
// 130: aload 32
// 132: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 137: astore 34
// 139: aload 34
// 13b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 140: ifeq 1b0
// 143: aload 34
// 145: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 14a: astore 35
// 14c: aload 35
// 14e: checkcast su/catlean/tk
// 151: astore 36
// 153: bipush 0
// 154: istore 37
// 156: getstatic su/catlean/nn.x Lsu/catlean/nn;
// 159: aload 1
// 15a: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 15d: lload 16
// 15f: dup2_x1
// 160: pop2
// 161: aload 36
// 163: invokevirtual su/catlean/tk.D ()Lnet/minecraft/class_591;
// 166: aload 36
// 168: invokevirtual su/catlean/tk.z ()Lnet/minecraft/class_10055;
// 16b: aload 36
// 16d: lload 18
// 16f: invokevirtual su/catlean/tk.C (J)Lnet/minecraft/class_243;
// 172: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 175: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 178: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 17b: aload 36
// 17d: lload 20
// 17f: invokevirtual su/catlean/tk.p (J)F
// 182: iload 22
// 184: i2c
// 185: swap
// 186: iload 23
// 188: swap
// 189: iload 24
// 18b: i2s
// 18c: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 18f: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 192: aload 31
// 194: invokevirtual su/catlean/nn.h (JLnet/minecraft/class_4587;Lnet/minecraft/class_591;Lnet/minecraft/class_10055;Lnet/minecraft/class_243;Ljava/awt/Color;Lsu/catlean/s8;Lsu/catlean/g7;)V
// 197: nop
// 198: nop
// 199: aload 30
// 19b: ifnull 227
// 19e: aload 30
// 1a0: ifnonnull 139
// 1a3: goto 1b0
// 1a6: ldc2_w 8047191962602653349
// 1a9: lload 2
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: nop
// 1b1: lload 9
// 1b3: aload 31
// 1b5: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 1b8: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 1bb: aconst_null
// 1bc: aconst_null
// 1bd: aload 1
// 1be: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 1c1: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 1c4: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 1c7: aconst_null
// 1c8: aconst_null
// 1c9: sipush 2377
// 1cc: ldc2_w 608200559610934347
// 1cf: lload 2
// 1d0: lxor
// 1d1: invokedynamic i (IJ)I bsm=su/catlean/k4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: aconst_null
// 1d7: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 1da: new su/catlean/g7
// 1dd: dup
// 1de: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 1e1: dup
// 1e2: sipush 31136
// 1e5: ldc2_w 4215411483870677392
// 1e8: lload 2
// 1e9: lxor
// 1ea: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1f2: getstatic su/catlean/k4.F Ljava/util/concurrent/CopyOnWriteArrayList;
// 1f5: invokevirtual java/util/concurrent/CopyOnWriteArrayList.size ()I
// 1f8: sipush 27484
// 1fb: ldc2_w 6359944450439075410
// 1fe: lload 2
// 1ff: lxor
// 200: invokedynamic i (IJ)I bsm=su/catlean/k4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: imul
// 206: bipush 1
// 207: istore 25
// 209: istore 26
// 20b: astore 27
// 20d: iload 11
// 20f: lload 12
// 211: aload 27
// 213: iload 26
// 215: iload 25
// 217: invokespecial su/catlean/g7.<init> (IJLcom/mojang/blaze3d/vertex/VertexFormat;IZ)V
// 21a: astore 31
// 21c: getstatic su/catlean/k4.F Ljava/util/concurrent/CopyOnWriteArrayList;
// 21f: checkcast java/lang/Iterable
// 222: astore 32
// 224: bipush 0
// 225: istore 33
// 227: aload 32
// 229: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 22e: astore 34
// 230: aload 34
// 232: invokeinterface java/util/Iterator.hasNext ()Z 1
// 237: ifeq 2a9
// 23a: aload 34
// 23c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 241: astore 35
// 243: aload 35
// 245: checkcast su/catlean/tk
// 248: astore 36
// 24a: bipush 0
// 24b: istore 37
// 24d: getstatic su/catlean/nn.x Lsu/catlean/nn;
// 250: aload 1
// 251: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 254: lload 16
// 256: dup2_x1
// 257: pop2
// 258: aload 36
// 25a: invokevirtual su/catlean/tk.D ()Lnet/minecraft/class_591;
// 25d: aload 36
// 25f: invokevirtual su/catlean/tk.z ()Lnet/minecraft/class_10055;
// 262: aload 36
// 264: lload 18
// 266: invokevirtual su/catlean/tk.C (J)Lnet/minecraft/class_243;
// 269: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 26c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 26f: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 272: aload 36
// 274: lload 20
// 276: invokevirtual su/catlean/tk.p (J)F
// 279: fconst_2
// 27a: fmul
// 27b: iload 22
// 27d: i2c
// 27e: swap
// 27f: iload 23
// 281: swap
// 282: iload 24
// 284: i2s
// 285: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 288: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 28b: aload 31
// 28d: invokevirtual su/catlean/nn.h (JLnet/minecraft/class_4587;Lnet/minecraft/class_591;Lnet/minecraft/class_10055;Lnet/minecraft/class_243;Ljava/awt/Color;Lsu/catlean/s8;Lsu/catlean/g7;)V
// 290: nop
// 291: nop
// 292: aload 30
// 294: ifnull 2d3
// 297: aload 30
// 299: ifnonnull 230
// 29c: goto 2a9
// 29f: ldc2_w 8047191962602653349
// 2a2: lload 2
// 2a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a8: athrow
// 2a9: nop
// 2aa: lload 9
// 2ac: aload 31
// 2ae: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 2b1: invokevirtual su/catlean/b6.w ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 2b4: aconst_null
// 2b5: aconst_null
// 2b6: aload 1
// 2b7: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 2ba: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 2bd: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 2c0: aconst_null
// 2c1: aconst_null
// 2c2: sipush 29971
// 2c5: ldc2_w 391686898154817555
// 2c8: lload 2
// 2c9: lxor
// 2ca: invokedynamic i (IJ)I bsm=su/catlean/k4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: aconst_null
// 2d0: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 2d3: aload 30
// 2d5: ifnonnull 33b
// 2d8: getstatic su/catlean/k4.F Ljava/util/concurrent/CopyOnWriteArrayList;
// 2db: checkcast java/lang/Iterable
// 2de: astore 31
// 2e0: bipush 0
// 2e1: istore 32
// 2e3: aload 31
// 2e5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2ea: astore 33
// 2ec: aload 33
// 2ee: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2f3: ifeq 33a
// 2f6: aload 33
// 2f8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2fd: astore 34
// 2ff: aload 34
// 301: checkcast su/catlean/tk
// 304: astore 35
// 306: bipush 0
// 307: istore 36
// 309: getstatic su/catlean/k4.A Lsu/catlean/k4;
// 30c: aload 1
// 30d: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 310: aload 35
// 312: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 315: iload 6
// 317: iload 7
// 319: i2s
// 31a: aload 35
// 31c: iload 8
// 31e: i2c
// 31f: invokespecial su/catlean/k4.V (Lnet/minecraft/class_4587;ISLsu/catlean/tk;C)V
// 322: nop
// 323: aload 30
// 325: ifnull 33b
// 328: aload 30
// 32a: ifnonnull 2ec
// 32d: goto 33a
// 330: ldc2_w 8047191962602653349
// 333: lload 2
// 334: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 339: athrow
// 33a: nop
// 33b: return
}

@Flow
public final void k(@NotNull ReceivePacket event) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k4.a J
// 003: ldc2_w 71372649480027
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 103159032879108
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 33236189845027
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 8
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 62372687530287
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 79962039943255
// 031: lxor
// 032: dup2
// 033: bipush 32
// 035: lushr
// 036: l2i
// 037: istore 11
// 039: dup2
// 03a: bipush 32
// 03c: lshl
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 12
// 043: dup2
// 044: bipush 48
// 046: lshl
// 047: bipush 48
// 049: lushr
// 04a: l2i
// 04b: istore 13
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 101034607130420
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 140050597259397
// 059: lxor
// 05a: lstore 16
// 05c: dup2
// 05d: ldc2_w 137950527788578
// 060: lxor
// 061: lstore 18
// 063: pop2
// 064: ldc2_w 4949791107560338893
// 067: lload 2
// 068: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: aload 1
// 06e: sipush 27898
// 071: ldc2_w 1003310342736213955
// 074: lload 2
// 075: lxor
// 076: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07e: astore 20
// 080: lload 4
// 082: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 085: aload 20
// 087: ifnull 0af
// 08a: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 08d: ifnull 131
// 090: goto 09d
// 093: ldc2_w 4946747478548770222
// 096: lload 2
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: lload 4
// 09f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a2: goto 0af
// 0a5: ldc2_w 4946747478548770222
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: aload 20
// 0b1: ifnull 0d9
// 0b4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 0b7: ifnull 131
// 0ba: goto 0c7
// 0bd: ldc2_w 4946747478548770222
// 0c0: lload 2
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: lload 4
// 0c9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0cc: goto 0d9
// 0cf: ldc2_w 4946747478548770222
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 20
// 0db: ifnull 106
// 0de: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 0e1: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 0e4: ifnull 131
// 0e7: goto 0f4
// 0ea: ldc2_w 4946747478548770222
// 0ed: lload 2
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: lload 4
// 0f6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f9: goto 106
// 0fc: ldc2_w 4946747478548770222
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 109: ifnull 131
// 10c: lload 18
// 10e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 111: getfield net/minecraft/class_746.field_6012 I
// 114: sipush 4226
// 117: ldc2_w 6432213830636013189
// 11a: lload 2
// 11b: lxor
// 11c: invokedynamic i (IJ)I bsm=su/catlean/k4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: if_icmpge 13c
// 124: goto 131
// 127: ldc2_w 4946747478548770222
// 12a: lload 2
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: return
// 132: ldc2_w 4946747478548770222
// 135: lload 2
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: aload 1
// 13d: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 140: astore 21
// 142: aload 21
// 144: instanceof net/minecraft/class_2663
// 147: aload 20
// 149: ifnull 171
// 14c: ifeq 3aa
// 14f: goto 15c
// 152: ldc2_w 4946747478548770222
// 155: lload 2
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: aload 21
// 15e: checkcast net/minecraft/class_2663
// 161: invokevirtual net/minecraft/class_2663.method_11470 ()B
// 164: goto 171
// 167: ldc2_w 4946747478548770222
// 16a: lload 2
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: sipush 14134
// 174: ldc2_w 2017432160312402229
// 177: lload 2
// 178: lxor
// 179: invokedynamic i (IJ)I bsm=su/catlean/k4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: if_icmpne 3aa
// 181: lload 4
// 183: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 186: aload 20
// 188: ifnull 1bd
// 18b: goto 198
// 18e: ldc2_w 4946747478548770222
// 191: lload 2
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 19b: ifnull 3aa
// 19e: goto 1ab
// 1a1: ldc2_w 4946747478548770222
// 1a4: lload 2
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: lload 4
// 1ad: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b0: goto 1bd
// 1b3: ldc2_w 4946747478548770222
// 1b6: lload 2
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 1c0: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 1c3: ifnull 3aa
// 1c6: aload 21
// 1c8: checkcast net/minecraft/class_2663
// 1cb: lload 16
// 1cd: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1d0: checkcast net/minecraft/class_1937
// 1d3: invokevirtual net/minecraft/class_2663.method_11469 (Lnet/minecraft/class_1937;)Lnet/minecraft/class_1297;
// 1d6: astore 24
// 1d8: aload 24
// 1da: aload 20
// 1dc: ifnull 201
// 1df: instanceof net/minecraft/class_1657
// 1e2: ifeq 207
// 1e5: goto 1f2
// 1e8: ldc2_w 4946747478548770222
// 1eb: lload 2
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: aload 24
// 1f4: goto 201
// 1f7: ldc2_w 4946747478548770222
// 1fa: lload 2
// 1fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 200: athrow
// 201: checkcast net/minecraft/class_1657
// 204: goto 208
// 207: aconst_null
// 208: dup
// 209: ifnonnull 218
// 20c: pop
// 20d: return
// 20e: ldc2_w 4946747478548770222
// 211: lload 2
// 212: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 217: athrow
// 218: astore 22
// 21a: aload 22
// 21c: lload 4
// 21e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 221: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 224: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 227: ifeq 235
// 22a: return
// 22b: ldc2_w 4946747478548770222
// 22e: lload 2
// 22f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 234: athrow
// 235: lload 4
// 237: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 23a: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 23d: aload 22
// 23f: checkcast net/minecraft/class_1297
// 242: invokevirtual net/minecraft/class_898.method_3953 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_897;
// 245: dup
// 246: sipush 21394
// 249: ldc2_w 6178568443332577446
// 24c: lload 2
// 24d: lxor
// 24e: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 256: checkcast net/minecraft/class_1007
// 259: invokevirtual net/minecraft/class_1007.method_4038 ()Lnet/minecraft/class_583;
// 25c: dup
// 25d: sipush 17214
// 260: ldc2_w 5699063571063855106
// 263: lload 2
// 264: lxor
// 265: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 26d: checkcast net/minecraft/class_591
// 270: astore 23
// 272: lload 4
// 274: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 277: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 27a: aload 22
// 27c: checkcast net/minecraft/class_1297
// 27f: invokevirtual net/minecraft/class_898.method_3953 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_897;
// 282: aload 22
// 284: checkcast net/minecraft/class_1297
// 287: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 28a: iload 11
// 28c: iload 12
// 28e: i2c
// 28f: iload 13
// 291: invokevirtual su/catlean/zi.n (ICI)F
// 294: invokevirtual net/minecraft/class_897.method_62425 (Lnet/minecraft/class_1297;F)Lnet/minecraft/class_10017;
// 297: astore 25
// 299: aload 25
// 29b: sipush 6053
// 29e: ldc2_w 3163987277630868626
// 2a1: lload 2
// 2a2: lxor
// 2a3: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 2ab: aload 25
// 2ad: checkcast net/minecraft/class_10055
// 2b0: astore 24
// 2b2: new net/minecraft/class_10055
// 2b5: dup
// 2b6: invokespecial net/minecraft/class_10055.<init> ()V
// 2b9: astore 25
// 2bb: aload 25
// 2bd: aload 24
// 2bf: getfield net/minecraft/class_10055.field_53536 F
// 2c2: putfield net/minecraft/class_10055.field_53536 F
// 2c5: aload 25
// 2c7: aload 24
// 2c9: getfield net/minecraft/class_10055.field_53537 F
// 2cc: putfield net/minecraft/class_10055.field_53537 F
// 2cf: aload 25
// 2d1: aload 24
// 2d3: getfield net/minecraft/class_10055.field_53538 F
// 2d6: putfield net/minecraft/class_10055.field_53538 F
// 2d9: aload 25
// 2db: aload 24
// 2dd: getfield net/minecraft/class_10055.field_53325 D
// 2e0: putfield net/minecraft/class_10055.field_53325 D
// 2e3: aload 25
// 2e5: aload 24
// 2e7: getfield net/minecraft/class_10055.field_53326 D
// 2ea: putfield net/minecraft/class_10055.field_53326 D
// 2ed: aload 25
// 2ef: aload 24
// 2f1: getfield net/minecraft/class_10055.field_53327 D
// 2f4: putfield net/minecraft/class_10055.field_53327 D
// 2f7: aload 25
// 2f9: aload 24
// 2fb: getfield net/minecraft/class_10055.field_53446 F
// 2fe: putfield net/minecraft/class_10055.field_53446 F
// 301: aload 25
// 303: aload 24
// 305: getfield net/minecraft/class_10055.field_53447 F
// 308: putfield net/minecraft/class_10055.field_53447 F
// 30b: aload 25
// 30d: aload 24
// 30f: getfield net/minecraft/class_10055.field_53448 F
// 312: putfield net/minecraft/class_10055.field_53448 F
// 315: aload 25
// 317: aload 24
// 319: getfield net/minecraft/class_10055.field_63604 F
// 31c: putfield net/minecraft/class_10055.field_63604 F
// 31f: aload 25
// 321: aload 24
// 323: getfield net/minecraft/class_10055.field_53521 F
// 326: putfield net/minecraft/class_10055.field_53521 F
// 329: aload 25
// 32b: aload 24
// 32d: getfield net/minecraft/class_10055.field_53328 F
// 330: putfield net/minecraft/class_10055.field_53328 F
// 333: aload 25
// 335: aload 24
// 337: getfield net/minecraft/class_10055.field_53451 F
// 33a: putfield net/minecraft/class_10055.field_53451 F
// 33d: aload 25
// 33f: aload 24
// 341: getfield net/minecraft/class_10055.field_53405 F
// 344: putfield net/minecraft/class_10055.field_53405 F
// 347: aload 25
// 349: aload 24
// 34b: getfield net/minecraft/class_10055.field_53450 F
// 34e: putfield net/minecraft/class_10055.field_53450 F
// 351: aload 23
// 353: aload 24
// 355: invokevirtual net/minecraft/class_591.method_62110 (Lnet/minecraft/class_10055;)V
// 358: aload 0
// 359: iload 6
// 35b: i2b
// 35c: lload 7
// 35e: aload 22
// 360: checkcast net/minecraft/class_1297
// 363: invokevirtual su/catlean/k4.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 366: astore 26
// 368: aload 22
// 36a: checkcast net/minecraft/class_742
// 36d: invokevirtual net/minecraft/class_742.method_52814 ()Lnet/minecraft/class_8685;
// 370: invokevirtual net/minecraft/class_8685.comp_1626 ()Lnet/minecraft/class_12079$class_12081;
// 373: invokeinterface net/minecraft/class_12079$class_12081.comp_3627 ()Lnet/minecraft/class_2960; 1
// 378: dup
// 379: sipush 5603
// 37c: ldc2_w 3764335180690853584
// 37f: lload 2
// 380: lxor
// 381: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/k4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 386: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 389: astore 27
// 38b: getstatic su/catlean/k4.F Ljava/util/concurrent/CopyOnWriteArrayList;
// 38e: new su/catlean/tk
// 391: dup
// 392: aload 23
// 394: aload 25
// 396: aload 26
// 398: aload 27
// 39a: aload 0
// 39b: lload 14
// 39d: invokespecial su/catlean/k4.P (J)I
// 3a0: i2f
// 3a1: lload 9
// 3a3: invokespecial su/catlean/tk.<init> (Lnet/minecraft/class_591;Lnet/minecraft/class_10055;Lnet/minecraft/class_243;Lnet/minecraft/class_2960;FJ)V
// 3a6: invokevirtual java/util/concurrent/CopyOnWriteArrayList.add (Ljava/lang/Object;)Z
// 3a9: pop
// 3aa: return
}

private final void V(class_4587 var1, int var2, short var3, tk var4, char var5) {
long var6 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
long var8 = var6 ^ 46689979737936L;
long var10 = var6 ^ 130515513178147L;
long var12 = var6 ^ 46640519075905L;
long var14 = var6 ^ 35429460585550L;
long var16 = (var6 ^ 56689342742026L) >>> 16;
int var18 = (int)((var6 ^ 56689342742026L) << 48 >>> 48);
long var19 = var6 ^ 36727337039643L;
long var21 = var6 ^ 14390627228988L;
long var10001 = var6 ^ 57118113536099L;
int var23 = (int)((var6 ^ 57118113536099L) >>> 48);
int var24 = (int)((var6 ^ 57118113536099L) << 16 >>> 32);
int var25 = (int)(var10001 << 48 >>> 48);
GpuTextureView var10000 = zf.F(var8).method_1531().method_4619(var4.V()).method_71659();
Intrinsics.checkNotNullExpressionValue(var10000, b<"c">(30652, 4447838546698130391L ^ var6));
GpuTextureView var31 = var10000;
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, b<"c">(10871, 6914403291925483038L ^ var6));
int var10003 = c<"i">(20619, 1493248242349701599L ^ var6);
Object var26 = null;
byte var27 = 4;
boolean var28 = false;
int var29 = var10003;
VertexFormat var30 = var10002;
g7 var32 = new g7(var10, var30, var29, var28, var27, (DefaultConstructorMarker)var26);
sp var33 = new sp(var32, jl.y.p(jh.f.t(), (char)var23, var24, var4.p(var19), (short)var25), var12);
var1.method_22903();
class_243 var34 = var4.C(var21);
class_4184 var42 = zf.F(var8).method_1561().field_4686;
Intrinsics.checkNotNull(var42);
class_243 var43 = var42.method_71156();
Intrinsics.checkNotNullExpressionValue(var43, b<"c">(25973, 1079656301281329425L ^ var6));
class_243 var35 = var43;
double var36 = var34.field_1352 - var35.method_10216();
double var38 = var34.field_1351 - var35.method_10214();
double var40 = var34.field_1350 - var35.method_10215();
var1.method_46416((float)var36, (float)var38, (float)var40);
var1.method_22905(var4.z().field_53453, var4.z().field_53453, var4.z().field_53453);
kf.G.g(var16, var4.z(), (short)var18, var1, var4.z().field_53446);
var1.method_22905(-1.0F, -1.0F, 1.0F);
var1.method_22905(0.9375F, 0.9375F, 0.9375F);
var1.method_46416(0.0F, -1.501F, 0.0F);
var4.D().method_62110(var4.z());
var4.D().method_62100(var1, var33, c<"i">(3379, 6848704821514839137L ^ var6), 0, jh.f.t().getRGB());
g7.R(
var14,
var32,
b6.R.J(),
null,
null,
new class_4587().method_23760().method_23761(),
null,
MapsKt.mapOf(TuplesKt.to(b<"c">(22878, 7484069440201588009L ^ var6), var31)),
c<"i">(8988, 2777383427954608710L ^ var6),
null
);
var1.method_22909();
}

private static final boolean Q(tk var0) {
long var1 = a ^ 72440387382162L;
long var3 = var1 ^ 134043932706967L;
long var5 = var1 ^ 16383454395442L;
long var10001 = var1 ^ 74735223282221L;
int var7 = (int)((var1 ^ 74735223282221L) >>> 48);
int var8 = (int)((var1 ^ 74735223282221L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
return var0.W(A.V(var3), A.h((short)var7, var8, (char)var9), var5);
}

private static final boolean n(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 21038908510515L;
long var22 = var20 ^ 27650896044985L;
long var24 = (var20 ^ 48248192540759L) >>> 16;
int var26 = (int)((var20 ^ 48248192540759L) << 48 >>> 48);
long var27 = var20 ^ 7189564334225L;
long var29 = var20 ^ 114709499483971L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[24];
int var16 = 0;
String var15 = "NFÔÜx\u0084\u0005ÙíV\\OÇ-ã\u007f«§FH;xI\u009e\u00adYVå\u009f·âáè>\u009eÎÈ_Kh©ß:ìàª]x\u0099wó\u0017ÿ\u000fß¡\u008a\u0002qÿ\u009d»èÆPrÎ¶dhlôAÕM\u001cO·\u0001\u000fÅ\u001e\u001a3ØÿÔ¸\u001c(\u0001õ\n4¤>zH7ê\u0094\u0016öÛG?eç\u0004g!°5Ê\u0088¡I»f6É\u0000~\u001d¸\u0081u¡ö\fõ\u001dn\u0011~~\u0017%\u0097ðF%\u0001Á*x\u0093\u0096Zûã~\u0010°8#ýT\u0088§aã§G\u008b{ô9R E2\u001fq\t\u001f\u0092\u0084$¸{ßD¨}q3\u001e\u00932sòYuk|qî\u008c\u0092f\rø\u00adª\u0087æßêÛ*v\"\u0012\u0096t¢Zº\u0094oÙ\u009dÊ\u001cÄjYøB6zÀ\u0091Ô±¦U\u0096\u000ekÞ$rv¨ØÒO&7;^TFµ\u000f`ÕVb4\u008bÃÉÐ\\M\u00101wå\u0017Y÷²SÔ\u0019è\u0004³¹]öe\u0002ºç\u0096=@t\u0006A\u0004ø¬nj0Á\u0097:ËD¹\u0082\u001e|¼×C±¹\u001e°^t\u0013hÂ\u0092ZÓ¯Þú3\u000f\u008d»Ié#\u0097·\"Ýó4º¬àÅÌcÛ\u0013Q#&ni\u0092K5H3È(tø³É\u0001ÊÞÚt.«\u001e\u0090Â-8ñDNïÖø¬\u0093n,$@h³O\u0097E\u009cÖ©U\u00ad¼\u0012°9µÀ`i\u0010Ì\u0084\u0006oR\u009f\u0016QHa\u0089³è§=¶«>ÿ\u0012Ën\u0014\u0015±\u0096a\u009c\u009a\u0004\u0010ÏY½J£!¡;\u001fÏª¿(\u008d\u0015n´R¡²NoY\u009eÝ©%ôëöê\u009c\u0097/\t¶U\u0016$è4ðÀE°/7íL\u0005à\u009a« h\u001f¾FCV÷úÌ\tåõ_4[\u009b\u0083'GÈ+ð¸£ùr\f\u0080]\u0012Y\t\u0018T>o\u007fg\nP\u0013÷0Ï\tT\u0089;ð¨\u0090@+À.-â\u0018¬°~\u001c'¶Î1`\u000b¤§æ<`r÷óºÇ¥\u0087{\u0015(V¿\u0004õÜ¦w¿ Þ\t\u0012«\u007fÒmg\u0010\u008c5å@ß\u009bnt\u0005\u00ad·\u001bEòÉ>}e`Å\"W \u0010\f\u000fmp¦«Z£ø\u007f\u001c\u0097¤Hå¥v\u0013\u009aaDy\u00958ëJÕc\u008d_\"(2Âíó/\u0011ÕÇ¬ý%S^^ÏÁ\u008d_Ï¾ñ\u0005ðDÑ\u00188ÑÚ`\u009a'\u0089ýn\u0099¸ï¹\u0011 ¤\u001a\u000b±°^xÅÏ¢æ¡\u0088\u000b=Û°0yÒH\u008aüÞ\u00182\u0091\u0093\u0002|T* NIIïÂÔ\u0016\u0092\u0093Ê]vï\u009b\u0087ó\u009a\u0094È¤Á\u0091wã\u008dXlNÔÉ\u0091Ñ\u0018>¦À=¯\u000eCª¿\u0082\u001cþRFM\u008a\u0094\u0010\u001fV\u0005\u0089\u0016*\u0010\u001e\u0012&\u0098¾\u0014ËÓ\u0092_\u001bç\u009bïÃÌ\u0010ë½ÐZ\r;%Fl9ðdt}2\u0081 3ª£9\u009f\u0086©\u009b<\u000bÒÖ^ÆcW¥\u009e|\u0082ñÏ,\\ä\bIAeskl\u0010Æð_¶Ü\u0083ÑÍMÖ¾\u0095ä\u001c\u0016\u0004\u0010Î»\u0089{\u0085Xa\u0085Ä¤#\u00175§`Ê\u0010dvuÕ\u0096D\u008b\u001fFÀUù\u001b$b\u0006 éâ\u0084Ü\u0019¡\u0013\u009e§\u0018[\u009aF\u001fÝõÞ\u008eÙ\u0086\u0083¹ÃÞ\u000eýW½\u007f\u0014R¡87³>\u0007(Ñ\\\u001d\u0000>Ã±!hFÆo3V\u008a±ÂK\bL»ªÜZ\u000f#²Q\u0090\u0096\u0081g2O#¥Z³\u0001ø³^\u008a%\u000f\b!¾-Ññ";
int var17 = "NFÔÜx\u0084\u0005ÙíV\\OÇ-ã\u007f«§FH;xI\u009e\u00adYVå\u009f·âáè>\u009eÎÈ_Kh©ß:ìàª]x\u0099wó\u0017ÿ\u000fß¡\u008a\u0002qÿ\u009d»èÆPrÎ¶dhlôAÕM\u001cO·\u0001\u000fÅ\u001e\u001a3ØÿÔ¸\u001c(\u0001õ\n4¤>zH7ê\u0094\u0016öÛG?eç\u0004g!°5Ê\u0088¡I»f6É\u0000~\u001d¸\u0081u¡ö\fõ\u001dn\u0011~~\u0017%\u0097ðF%\u0001Á*x\u0093\u0096Zûã~\u0010°8#ýT\u0088§aã§G\u008b{ô9R E2\u001fq\t\u001f\u0092\u0084$¸{ßD¨}q3\u001e\u00932sòYuk|qî\u008c\u0092f\rø\u00adª\u0087æßêÛ*v\"\u0012\u0096t¢Zº\u0094oÙ\u009dÊ\u001cÄjYøB6zÀ\u0091Ô±¦U\u0096\u000ekÞ$rv¨ØÒO&7;^TFµ\u000f`ÕVb4\u008bÃÉÐ\\M\u00101wå\u0017Y÷²SÔ\u0019è\u0004³¹]öe\u0002ºç\u0096=@t\u0006A\u0004ø¬nj0Á\u0097:ËD¹\u0082\u001e|¼×C±¹\u001e°^t\u0013hÂ\u0092ZÓ¯Þú3\u000f\u008d»Ié#\u0097·\"Ýó4º¬àÅÌcÛ\u0013Q#&ni\u0092K5H3È(tø³É\u0001ÊÞÚt.«\u001e\u0090Â-8ñDNïÖø¬\u0093n,$@h³O\u0097E\u009cÖ©U\u00ad¼\u0012°9µÀ`i\u0010Ì\u0084\u0006oR\u009f\u0016QHa\u0089³è§=¶«>ÿ\u0012Ën\u0014\u0015±\u0096a\u009c\u009a\u0004\u0010ÏY½J£!¡;\u001fÏª¿(\u008d\u0015n´R¡²NoY\u009eÝ©%ôëöê\u009c\u0097/\t¶U\u0016$è4ðÀE°/7íL\u0005à\u009a« h\u001f¾FCV÷úÌ\tåõ_4[\u009b\u0083'GÈ+ð¸£ùr\f\u0080]\u0012Y\t\u0018T>o\u007fg\nP\u0013÷0Ï\tT\u0089;ð¨\u0090@+À.-â\u0018¬°~\u001c'¶Î1`\u000b¤§æ<`r÷óºÇ¥\u0087{\u0015(V¿\u0004õÜ¦w¿ Þ\t\u0012«\u007fÒmg\u0010\u008c5å@ß\u009bnt\u0005\u00ad·\u001bEòÉ>}e`Å\"W \u0010\f\u000fmp¦«Z£ø\u007f\u001c\u0097¤Hå¥v\u0013\u009aaDy\u00958ëJÕc\u008d_\"(2Âíó/\u0011ÕÇ¬ý%S^^ÏÁ\u008d_Ï¾ñ\u0005ðDÑ\u00188ÑÚ`\u009a'\u0089ýn\u0099¸ï¹\u0011 ¤\u001a\u000b±°^xÅÏ¢æ¡\u0088\u000b=Û°0yÒH\u008aüÞ\u00182\u0091\u0093\u0002|T* NIIïÂÔ\u0016\u0092\u0093Ê]vï\u009b\u0087ó\u009a\u0094È¤Á\u0091wã\u008dXlNÔÉ\u0091Ñ\u0018>¦À=¯\u000eCª¿\u0082\u001cþRFM\u008a\u0094\u0010\u001fV\u0005\u0089\u0016*\u0010\u001e\u0012&\u0098¾\u0014ËÓ\u0092_\u001bç\u009bïÃÌ\u0010ë½ÐZ\r;%Fl9ðdt}2\u0081 3ª£9\u009f\u0086©\u009b<\u000bÒÖ^ÆcW¥\u009e|\u0082ñÏ,\\ä\bIAeskl\u0010Æð_¶Ü\u0083ÑÍMÖ¾\u0095ä\u001c\u0016\u0004\u0010Î»\u0089{\u0085Xa\u0085Ä¤#\u00175§`Ê\u0010dvuÕ\u0096D\u008b\u001fFÀUù\u001b$b\u0006 éâ\u0084Ü\u0019¡\u0013\u009e§\u0018[\u009aF\u001fÝõÞ\u008eÙ\u0086\u0083¹ÃÞ\u000eýW½\u007f\u0014R¡87³>\u0007(Ñ\\\u001d\u0000>Ã±!hFÆo3V\u008a±ÂK\bL»ªÜZ\u000f#²Q\u0090\u0096\u0081g2O#¥Z³\u0001ø³^\u008a%\u000f\b!¾-Ññ"
.length();
char var14 = 152;
int var34 = -1;

label54:
while (true) {
String var35 = var15.substring(++var34, var34 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
String var46 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var46;
if ((var34 += var14) >= var17) {
b = var18;
d = new String[24];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[14];
int var3 = 0;
String var4 = "Ý\u0014gAù\u0080ÏÁ$=\u0093\u0085Y\u000bú?ya\u001bÙl@\u001cF±\u009c0I¾«¹\u0006\u0094\u0093Ã\u008a<®§6\u0007$×\u0002Ã\u0089Fÿ&ÿz$\u0016È^ª2]ª8ìuïÎVÎ\u009dÛúW¡ç¸\u001eD\u008aõ\u0015ìëëÑ¤\u000fè \u0080zE@\u000b\u0005D°2J";
int var5 = "Ý\u0014gAù\u0080ÏÁ$=\u0093\u0085Y\u000bú?ya\u001bÙl@\u001cF±\u009c0I¾«¹\u0006\u0094\u0093Ã\u008a<®§6\u0007$×\u0002Ã\u0089Fÿ&ÿz$\u0016È^ª2]ª8ìuïÎVÎ\u009dÛúW¡ç¸\u001eD\u008aõ\u0015ìëëÑ¤\u000fè \u0080zE@\u000b\u0005D°2J"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var38 = var6;
var10001 = var3++;
long var50 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var53 = -1;

while (true) {
long var8 = var50;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var55 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var53) {
case 0:
var38[var10001] = var55;
if (var2 >= var5) {
f = var6;
g = new Integer[14];
KProperty[] var31 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(k4.class, b<"c">(22966, 1188383016519757030L ^ var20), b<"c">(16291, 3956344279637265129L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(k4.class, b<"c">(8116, 5809886886987868920L ^ var20), b<"c">(26096, 12170687271588009L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(k4.class, b<"c">(913, 5268074648720717535L ^ var20), b<"c">(18961, 7767364491909398343L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(k4.class, b<"c">(22053, 7851964608250372987L ^ var20), b<"c">(20556, 5766680062996800773L ^ var20), 0))
};
t = var31;
A = new k4(var24, (char)var26);
l = yp.L(A, b<"c">(24610, 5664609663297213807L ^ var20), as.DEFAULT, null, null, c<"i">(16514, 2102039595397904616L ^ var20), null, var29);
K = yp.L(
A,
b<"c">(18469, 4476348887379836279L ^ var20),
c<"i">(1526, 6826180225392459156L ^ var20),
new IntRange(0, c<"i">(5394, 2680877488576605557L ^ var20)),
var27,
null,
null,
c<"i">(2887, 8332515038813565739L ^ var20),
null
);
N = yp.k(
A, b<"c">(4893, 6133751082166462037L ^ var20), 0.1F, var22, RangesKt.rangeTo(-1.0F, 1.0F), null, null, c<"i">(4420, 9125510280568482084L ^ var20), null
);
c = yp.k(
A, b<"c">(13814, 3412408807095730361L ^ var20), 5.0F, var22, RangesKt.rangeTo(1.0F, 20.0F), null, null, c<"i">(4420, 9125510280568482084L ^ var20), null
);
F = new CopyOnWriteArrayList();
return;
}
break;
default:
var38[var10001] = var55;
if (var2 < var5) {
continue label36;
}

var4 = "\u0014\u0006~\u0015\nôK¤É\bÐ\u0089!½ªÖ";
var5 = "\u0014\u0006~\u0015\nôK¤É\bÐ\u0089!½ªÖ".length();
var2 = 0;
}

byte var44 = var2;
var2 += 8;
var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
var38 = var6;
var10001 = var3++;
var50 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var53 = 0;
}
}
}

var14 = var15.charAt(var34);
break;
default:
var18[var16++] = var46;
if ((var34 += var14) < var17) {
var14 = var15.charAt(var34);
continue label54;
}

var15 = "\u00957|\b¨'ñ3Z\u009aRáY\u0011ç\\UÎ¯\u0097Ã^¨\u0090\u0083Ô¤O_i\u000f\u0001\u0010\u0004}æ][c\u000bÈ½RãÑR\u0015ÌÝ";
var17 = "\u00957|\b¨'ñ3Z\u009aRáY\u0011ç\\UÎ¯\u0097Ã^¨\u0090\u0083Ô¤O_i\u000f\u0001\u0010\u0004}æ][c\u000bÈ½RãÑR\u0015ÌÝ".length();
var14 = ' ';
var34 = -1;
}

var35 = var15.substring(++var34, var34 + var14);
var10001 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24186;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/k4", var10);
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
throw new RuntimeException("su/catlean/k4" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21326;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/k4", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/k4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
