package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_10444;
import net.minecraft.class_11659;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_811;
import net.minecraft.class_1011.class_1012;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4d;
import org.lwjgl.system.MemoryUtil;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.render.FlipFrameEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.RenderScreenEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.NativeImageAccessor;

public final class jl {
@NotNull
public static final jl y;
@NotNull
private static final CopyOnWriteArrayList E;
private static boolean d;
@NotNull
private static final Matrix4f r;
@NotNull
private static final Matrix4f V;
@NotNull
private static int[] M;
private static int w;
private static float X;
private static _g[] v;
private static final long a = yz.a(-9195116701774200179L, -3824621880647670146L, MethodHandles.lookup().lookupClass()).a(20721331819440L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private jl() {
}

public final boolean V() {
return d;
}

public final void h(boolean <set-?>) {
d = <set-?>;
}

@NotNull
public final Matrix4f b() {
return r;
}

@NotNull
public final Matrix4f m() {
return V;
}

@NotNull
public final int[] u() {
return M;
}

public final void p(@NotNull int[] <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"u">(31528, 7794673325750588666L ^ ax));
M = <set-?>;
}

public final float t() {
return X;
}

public final void m(float <set-?>) {
X = <set-?>;
}

@Flow
private final void C(TickEvent var1) {
long var2 = a ^ 30812656593507L;
long var4 = var2 ^ 32550830443343L;
long var6 = var2 ^ 68266025662056L;
_g[] var10000 = vm.a<"Å">(6290689994637883724L, var2);
int var9 = zf.F(var4).method_22683().method_4495();
_g[] var8 = var10000;
if (var9 != w) {
Iterable var10 = b8.b();
boolean var11 = false;

for (Object var13 : var10) {
c6 var14 = (c6)var13;
boolean var15 = false;

try {
var14.close();
var14.F(var6);
if (var8 != null || var8 != null) {
break;
}
} catch (IllegalArgumentException var16) {
throw vm.a<"Å">(var16, 6265130041185779681L, var2);
}
}

w = var9;
}
}

@Flow(
priority = 20
)
private final void u(Render2DEvent var1) {
long var2 = a ^ 71672542602841L;
long var4 = var2 ^ 103257683097578L;
dv.D.n(var4);
_g[] var10000 = vm.a<"Å">(1979147394704274806L, var2);
Iterable var7 = E;
boolean var8 = false;
Iterator var9 = var7.iterator();
_g[] var6 = var10000;

while (true) {
if (var9.hasNext()) {
Object var10 = var9.next();
Function0 var11 = (Function0)var10;
boolean var12 = false;

try {
var11.invoke();
if (var6 != null) {
break;
}

if (var6 == null) {
continue;
}
} catch (IllegalArgumentException var13) {
throw vm.a<"Å">(var13, 1929910902531027931L, var2);
}
}

E.clear();
break;
}
}

@Flow(
priority = -20
)
private final void U(RenderScreenEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/jl.a J
// 03: ldc2_w 13158949910938
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -4272769489461499211
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: getstatic su/catlean/jl.d Z
// 16: aload 4
// 18: ifnonnull 4a
// 1b: ifeq 4d
// 1e: goto 2b
// 21: ldc2_w -4248265101532320744
// 24: lload 2
// 25: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: athrow
// 2b: sipush 17770
// 2e: ldc2_w 8051368906331934495
// 31: lload 2
// 32: lxor
// 33: invokedynamic y (IJ)I bsm=su/catlean/jl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: bipush 0
// 39: invokestatic com/mojang/blaze3d/opengl/GlStateManager._glBindFramebuffer (II)V
// 3c: bipush 0
// 3d: goto 4a
// 40: ldc2_w -4248265101532320744
// 43: lload 2
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: putstatic su/catlean/jl.d Z
// 4d: return
}

@Flow
private final void k(RenderScreenEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/jl.a J
// 03: ldc2_w 30623706240338
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 28891556951166
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 13978561069988
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -1694476179506198915
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: lload 4
// 25: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 28: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 2b: instanceof su/catlean/fi
// 2e: ifeq 72
// 31: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 34: aload 8
// 36: ifnonnull 69
// 39: goto 46
// 3c: ldc2_w -1602382856790540080
// 3f: lload 2
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: invokevirtual su/catlean/fi.F ()Lsu/catlean/dj;
// 49: ifnonnull 72
// 4c: goto 59
// 4f: ldc2_w -1602382856790540080
// 52: lload 2
// 53: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58: athrow
// 59: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 5c: goto 69
// 5f: ldc2_w -1602382856790540080
// 62: lload 2
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: aload 1
// 6a: invokevirtual su/catlean/api/event/events/render/RenderScreenEvent.getContext ()Lnet/minecraft/class_332;
// 6d: lload 6
// 6f: invokevirtual su/catlean/fi.v (Lnet/minecraft/class_332;J)V
// 72: return
}

@Flow
private final void i(FlipFrameEvent var1) {
z5.B.R().method_71100();
ba.A.n().method_71100();
jb.p.v().method_71100();
wt.N.z().method_71100();
cf.O.P().method_71100();
xc.I.V().method_71100();
j5.r.W().method_71100();
o9.R.Z().method_71100();
u.I.E().method_71100();
}

public final void q(@NotNull g7 polygon, float x, float y, float w, float h, long a, @NotNull Color[] colors) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/jl.a J
// 003: lload 6
// 005: lxor
// 006: lstore 6
// 008: lload 6
// 00a: dup2
// 00b: ldc2_w 28341076931746
// 00e: lxor
// 00f: lstore 9
// 011: dup2
// 012: ldc2_w 76780912890825
// 015: lxor
// 016: lstore 11
// 018: pop2
// 019: ldc2_w 1618026080123615349
// 01c: lload 6
// 01e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 023: aload 1
// 024: sipush 31150
// 027: ldc2_w 5628738034949459764
// 02a: lload 6
// 02c: lxor
// 02d: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/jl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 035: astore 13
// 037: aload 8
// 039: sipush 21277
// 03c: ldc2_w 8816570234539517371
// 03f: lload 6
// 041: lxor
// 042: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/jl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04a: aload 1
// 04b: fload 2
// 04c: fload 3
// 04d: fload 5
// 04f: fadd
// 050: fconst_0
// 051: bipush 4
// 052: lload 11
// 054: aconst_null
// 055: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 058: aload 8
// 05a: bipush 0
// 05b: aaload
// 05c: lload 9
// 05e: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 061: fload 2
// 062: fload 4
// 064: fadd
// 065: fload 3
// 066: fload 5
// 068: fadd
// 069: fconst_0
// 06a: bipush 4
// 06b: lload 11
// 06d: aconst_null
// 06e: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 071: aload 8
// 073: aload 13
// 075: ifnonnull 09f
// 078: arraylength
// 079: bipush 1
// 07a: if_icmple 09d
// 07d: goto 08b
// 080: ldc2_w 1714553735317487320
// 083: lload 6
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: aload 8
// 08d: bipush 1
// 08e: aaload
// 08f: goto 0a1
// 092: ldc2_w 1714553735317487320
// 095: lload 6
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: aload 8
// 09f: bipush 0
// 0a0: aaload
// 0a1: lload 9
// 0a3: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0a6: fload 2
// 0a7: fload 4
// 0a9: fadd
// 0aa: fload 3
// 0ab: fconst_0
// 0ac: bipush 4
// 0ad: lload 11
// 0af: aconst_null
// 0b0: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 0b3: aload 8
// 0b5: aload 13
// 0b7: ifnonnull 0e1
// 0ba: arraylength
// 0bb: bipush 1
// 0bc: if_icmple 0df
// 0bf: goto 0cd
// 0c2: ldc2_w 1714553735317487320
// 0c5: lload 6
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: aload 8
// 0cf: bipush 2
// 0d0: aaload
// 0d1: goto 0e3
// 0d4: ldc2_w 1714553735317487320
// 0d7: lload 6
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: aload 8
// 0e1: bipush 0
// 0e2: aaload
// 0e3: lload 9
// 0e5: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0e8: fload 2
// 0e9: fload 3
// 0ea: fconst_0
// 0eb: bipush 4
// 0ec: lload 11
// 0ee: aconst_null
// 0ef: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 0f2: aload 8
// 0f4: aload 13
// 0f6: ifnonnull 120
// 0f9: arraylength
// 0fa: bipush 1
// 0fb: if_icmple 11e
// 0fe: goto 10c
// 101: ldc2_w 1714553735317487320
// 104: lload 6
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: aload 8
// 10e: bipush 3
// 10f: aaload
// 110: goto 122
// 113: ldc2_w 1714553735317487320
// 116: lload 6
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: aload 8
// 120: bipush 0
// 121: aaload
// 122: lload 9
// 124: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 127: pop
// 128: return
}

public final void P(@NotNull Matrix3x2fStack matrices, float x, float y, float w, float h, @NotNull Color[] colors, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/jl.a J
// 003: lload 7
// 005: lxor
// 006: lstore 7
// 008: lload 7
// 00a: dup2
// 00b: ldc2_w 24881693598635
// 00e: lxor
// 00f: lstore 9
// 011: dup2
// 012: ldc2_w 45227279680012
// 015: lxor
// 016: lstore 11
// 018: dup2
// 019: ldc2_w 70558429968326
// 01c: lxor
// 01d: lstore 13
// 01f: dup2
// 020: ldc2_w 128849340523879
// 023: lxor
// 024: lstore 15
// 026: pop2
// 027: ldc2_w 2367295544347840219
// 02a: lload 7
// 02c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 031: aload 1
// 032: sipush 9993
// 035: ldc2_w 3579372016943785776
// 038: lload 7
// 03a: lxor
// 03b: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/jl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 043: aload 6
// 045: sipush 28628
// 048: ldc2_w 6585302474317606871
// 04b: lload 7
// 04d: lxor
// 04e: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/jl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 056: astore 22
// 058: new su/catlean/g7
// 05b: dup
// 05c: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 05f: dup
// 060: sipush 20505
// 063: ldc2_w 8210348355821834295
// 066: lload 7
// 068: lxor
// 069: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/jl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 071: bipush 0
// 072: bipush 0
// 073: sipush 30831
// 076: ldc2_w 4011477412606711418
// 079: lload 7
// 07b: lxor
// 07c: invokedynamic y (IJ)I bsm=su/catlean/jl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: aconst_null
// 082: astore 17
// 084: istore 18
// 086: istore 19
// 088: istore 20
// 08a: astore 21
// 08c: lload 9
// 08e: aload 21
// 090: iload 20
// 092: iload 19
// 094: iload 18
// 096: aload 17
// 098: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 09b: fload 2
// 09c: fload 3
// 09d: fload 5
// 09f: fadd
// 0a0: fconst_0
// 0a1: bipush 4
// 0a2: lload 15
// 0a4: aconst_null
// 0a5: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 0a8: aload 6
// 0aa: bipush 0
// 0ab: aaload
// 0ac: lload 11
// 0ae: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0b1: fload 2
// 0b2: fload 4
// 0b4: fadd
// 0b5: fload 3
// 0b6: fload 5
// 0b8: fadd
// 0b9: fconst_0
// 0ba: bipush 4
// 0bb: lload 15
// 0bd: aconst_null
// 0be: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 0c1: aload 6
// 0c3: aload 22
// 0c5: ifnonnull 0e1
// 0c8: arraylength
// 0c9: bipush 1
// 0ca: if_icmple 0df
// 0cd: aload 6
// 0cf: bipush 1
// 0d0: aaload
// 0d1: goto 0e3
// 0d4: ldc2_w 2406436697312643190
// 0d7: lload 7
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: aload 6
// 0e1: bipush 0
// 0e2: aaload
// 0e3: lload 11
// 0e5: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0e8: fload 2
// 0e9: fload 4
// 0eb: fadd
// 0ec: fload 3
// 0ed: fconst_0
// 0ee: bipush 4
// 0ef: lload 15
// 0f1: aconst_null
// 0f2: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 0f5: aload 6
// 0f7: aload 22
// 0f9: ifnonnull 123
// 0fc: arraylength
// 0fd: bipush 1
// 0fe: if_icmple 121
// 101: goto 10f
// 104: ldc2_w 2406436697312643190
// 107: lload 7
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: aload 6
// 111: bipush 2
// 112: aaload
// 113: goto 125
// 116: ldc2_w 2406436697312643190
// 119: lload 7
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: aload 6
// 123: bipush 0
// 124: aaload
// 125: lload 11
// 127: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 12a: fload 2
// 12b: fload 3
// 12c: fconst_0
// 12d: bipush 4
// 12e: lload 15
// 130: aconst_null
// 131: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 134: aload 6
// 136: aload 22
// 138: ifnonnull 162
// 13b: arraylength
// 13c: bipush 1
// 13d: if_icmple 160
// 140: goto 14e
// 143: ldc2_w 2406436697312643190
// 146: lload 7
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: aload 6
// 150: bipush 3
// 151: aaload
// 152: goto 164
// 155: ldc2_w 2406436697312643190
// 158: lload 7
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: aload 6
// 162: bipush 0
// 163: aaload
// 164: lload 11
// 166: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 169: lload 13
// 16b: dup2_x1
// 16c: pop2
// 16d: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 170: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 173: aconst_null
// 174: aconst_null
// 175: aconst_null
// 176: new org/joml/Matrix3x2f
// 179: dup
// 17a: aload 1
// 17b: checkcast org/joml/Matrix3x2fc
// 17e: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
// 181: aconst_null
// 182: sipush 29700
// 185: ldc2_w 926253197872929304
// 188: lload 7
// 18a: lxor
// 18b: invokedynamic y (IJ)I bsm=su/catlean/jl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: aconst_null
// 191: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 194: return
}

public final void Y(@Nullable Matrix3x2fStack matrices, float x, float y, float width, float height, long a, @NotNull Color c) {
ax = a ^ ax;
long var9 = ax ^ 76224818822008L;
long var11 = ax ^ 48778361458354L;
int var13 = (int)((ax ^ 7123914425836L) >>> 32);
long var14 = (ax ^ 7123914425836L) << 32 >>> 32;
long var16 = ax ^ 27767532215315L;
Intrinsics.checkNotNullParameter(cx, "c");
VertexFormat var10000 = class_290.field_1576;
Intrinsics.checkNotNullExpressionValue(class_290.field_1576, a<"u">(6676, 5714630924513895276L ^ ax));
VertexFormat var18 = var10000;
g7.R(
var11,
g7.j(
g7.j(
g7.j(
g7.j(
g7.j(
g7.j(
g7.j(g7.j(new g7(var13, var14, var18, 4, true), x, yx, 0.0F, 4, var16, null).n(cx, var9), x, yx + height, 0.0F, 4, var16, null).n(cx, var9),
x,
yx + height,
0.0F,
4,
var16,
null
)
.n(cx, var9),
x + width,
yx + height,
0.0F,
4,
var16,
null
)
.n(cx, var9),
x + width,
yx + height,
0.0F,
4,
var16,
null
)
.n(cx, var9),
x + width,
yx,
0.0F,
4,
var16,
null
)
.n(cx, var9),
x + width,
yx,
0.0F,
4,
var16,
null
)
.n(cx, var9),
x,
yx,
0.0F,
4,
var16,
null
)
.n(cx, var9),
b6.R.w(),
null,
null,
null,
new Matrix3x2f((Matrix3x2fc)matrices),
null,
b<"y">(22086, 4007002595066773805L ^ ax),
null
);
}

public final void j(long a, @NotNull class_332 context, @NotNull o7 r1) {
ax = a ^ ax;
long var5 = ax ^ 62581087897527L;
Intrinsics.checkNotNullParameter(context, a<"u">(767, 2489605466204409130L ^ ax));
Intrinsics.checkNotNullParameter(r1, a<"u">(25208, 5364131099923082629L ^ ax));
Vector2f var7 = new Vector2f();
Vector2f var8 = new Vector2f();
context.method_51448().transformPosition(r1.R(), r1.w(), var7);
context.method_51448().transformPosition(r1.t(), r1.O(), var8);
context.method_44379((int)var7.x, (int)var7.y, (int)var8.x, (int)var8.y);
a8.k.I(var5, new o7(var7.x, var7.y, var8.x, var8.y));
}

public final void W(long a, @NotNull class_332 context) {
ax = a ^ ax;
long var10001 = ax ^ 54673236196363L;
int var4 = (int)((ax ^ 54673236196363L) >>> 32);
int var5 = (int)((ax ^ 54673236196363L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(context, a<"u">(12985, 3312639027547118397L ^ ax));
context.method_44380();
a8.k.y(var4, (char)var5, (short)var6);
}

private final void O(long var1, g7 var3, float var4, float var5, float var6, float var7, Color var8) {
var1 = a ^ var1;
long var9 = var1 ^ 38005549578521L;
long var11 = var1 ^ 121320222294007L;
var3.G(var4, var9, var5, 0.0F).n(var8, var11);
var3.G(var4, var9, var7, 0.0F).n(var8, var11);
var3.G(var6, var9, var7, 0.0F).n(var8, var11);
var3.G(var6, var9, var5, 0.0F).n(var8, var11);
}

public final void s(
@NotNull Matrix3x2f matrices,
@NotNull class_2960 id,
float x,
float y,
float width,
float height,
@NotNull Color color1,
@NotNull Color color2,
@NotNull Color color3,
@NotNull Color color4,
float uStart,
float vStart,
float uEnd,
float vEnd,
boolean altBlend,
long a
) {
ax = a ^ ax;
long var18 = ax ^ 70197628914598L;
long var20 = ax ^ 108967377802453L;
long var22 = ax ^ 101814391944562L;
long var24 = ax ^ 58926473003192L;
long var26 = ax ^ 600665313817L;
long var28 = ax ^ 14945938001993L;
Intrinsics.checkNotNullParameter(matrices, a<"u">(31290, 9114384936725777760L ^ ax));
Intrinsics.checkNotNullParameter(id, a<"u">(5591, 3924592605001736879L ^ ax));
Intrinsics.checkNotNullParameter(color1, a<"u">(28310, 8923792601537059304L ^ ax));
Intrinsics.checkNotNullParameter(color2, a<"u">(15895, 5292792733580970312L ^ ax));
Intrinsics.checkNotNullParameter(color3, a<"u">(29607, 654732053224228076L ^ ax));
Intrinsics.checkNotNullParameter(color4, a<"u">(9461, 8737270848844551072L ^ ax));
GpuTextureView var10000 = zf.F(var18).method_1531().method_4619(id).method_71659();
Intrinsics.checkNotNullExpressionValue(var10000, a<"u">(4708, 6619696273180091701L ^ ax));
GpuTextureView var39 = var10000;
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, a<"u">(3238, 6115330523883699157L ^ ax));
int var10005 = b<"y">(26960, 1738100815095377955L ^ ax);
Object var30 = null;
int var31 = var10005;
boolean var32 = false;
byte var33 = 0;
VertexFormat var34 = var10002;
g7 var40 = new g7(var20, var34, var33, var32, var31, (DefaultConstructorMarker)var30);

RenderPipeline var10001;
label17: {
try {
g7.j(var40, x + 0, yx + height, 0.0F, 4, var26, null).j(uStart, var28, vEnd).n(color1, var22);
g7.j(var40, x + width, yx + height, 0.0F, 4, var26, null).j(uEnd, var28, vEnd).n(color2, var22);
g7.j(var40, x + width, yx + 0, 0.0F, 4, var26, null).j(uEnd, var28, vStart).n(color3, var22);
g7.j(var40, x + 0, yx + 0, 0.0F, 4, var26, null).j(uStart, var28, vStart).n(color4, var22);
var47 = var40;
if (altBlend) {
var10001 = b6.R.S();
break label17;
}
} catch (IllegalArgumentException var41) {
throw vm.a<"Å">(var41, -7630482230324592888L, ax);
}

var10001 = b6.R.O();
}

class_276 var48 = zf.F(var18).method_1522();
Intrinsics.checkNotNullExpressionValue(var48, a<"u">(10858, 7564099160067661073L ^ ax));
Map var10006 = MapsKt.mapOf(TuplesKt.to(a<"u">(7549, 7033565301878417973L ^ ax), var39));
int var10007 = b<"y">(13540, 4461898433025109378L ^ ax);
var30 = null;
var31 = var10007;
Map var45 = var10006;
var34 = null;
Object var35 = null;
class_276 var36 = var48;
RenderPipeline var37 = var10001;
g7 var38 = var47;
g7.R(var24, var38, var37, var36, (GpuBufferSlice)var35, var34, matrices, var45, var31, var30);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static void W(
jl var0,
Matrix3x2f var1,
class_2960 var2,
float var3,
float var4,
float var5,
float var6,
Color var7,
Color var8,
int var9,
Color var10,
Color var11,
float var12,
char var13,
float var14,
float var15,
short var16,
float var17,
boolean var18,
int var19,
Object var20
) {
long var21 = ((long)var9 << 32 | (long)var13 << 48 >>> 32 | (long)var16 << 48 >>> 48) ^ a;
long var23 = var21 ^ 96039281853879L;
_g[] var25 = vm.a<"Å">(3347982597461295223L, var21);

int var10000;
label205: {
label204: {
try {
var10000 = var19 & b<"y">(23733, 315966364291939350L ^ var21);
if (var25 != null) {
break label205;
}

if (var10000 == 0) {
break label204;
}
} catch (IllegalArgumentException var41) {
throw vm.a<"Å">(var41, 3443388683122755290L, var21);
}

Color var42 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"u">(8403, 1623064333389983314L ^ var21));
var7 = var42;
}

var10000 = var19 & b<"y">(2597, 1979143127093373575L ^ var21);
}

_g[] var10001;
label196: {
label195: {
label194: {
try {
var10001 = var25;
if (var13 < 0) {
break label196;
}

if (var25 != null) {
break label195;
}

if (var10000 == 0) {
break label194;
}
} catch (IllegalArgumentException var40) {
throw vm.a<"Å">(var40, 3443388683122755290L, var21);
}

var8 = var7;
}

var10000 = var19 & b<"y">(4408, 6836217558944117126L ^ var21);
}

try {
var10001 = var25;
} catch (IllegalArgumentException var32) {
throw vm.a<"Å">(var32, 3443388683122755290L, var21);
}
}

label183: {
label182: {
label181: {
try {
if (var9 < 0) {
break label183;
}

if (var10001 != null) {
break label182;
}

if (var10000 == 0) {
break label181;
}
} catch (IllegalArgumentException var39) {
throw vm.a<"Å">(var39, 3443388683122755290L, var21);
}

var10 = var8;
}

var10000 = var19 & b<"y">(30957, 1676702200102951003L ^ var21);
}

try {
var10001 = var25;
} catch (IllegalArgumentException var31) {
throw vm.a<"Å">(var31, 3443388683122755290L, var21);
}
}

label170: {
label169: {
label168: {
try {
if (var13 < 0) {
break label170;
}

if (var10001 != null) {
break label169;
}

if (var10000 == 0) {
break label168;
}
} catch (IllegalArgumentException var38) {
throw vm.a<"Å">(var38, 3443388683122755290L, var21);
}

var11 = var10;
}

var10000 = var19 & b<"y">(3554, 4181706324723985736L ^ var21);
}

try {
var10001 = var25;
} catch (IllegalArgumentException var30) {
throw vm.a<"Å">(var30, 3443388683122755290L, var21);
}
}

label157: {
label156: {
label155: {
try {
if (var13 <= 0) {
break label157;
}

if (var10001 != null) {
break label156;
}

if (var10000 == 0) {
break label155;
}
} catch (IllegalArgumentException var37) {
throw vm.a<"Å">(var37, 3443388683122755290L, var21);
}

var12 = 0.0F;
}

var10000 = var19 & b<"y">(28013, 8982387050243296714L ^ var21);
}

try {
var10001 = var25;
} catch (IllegalArgumentException var29) {
throw vm.a<"Å">(var29, 3443388683122755290L, var21);
}
}

label144: {
label143: {
label142: {
try {
if (var16 <= 0) {
break label144;
}

if (var10001 != null) {
break label143;
}

if (var10000 == 0) {
break label142;
}
} catch (IllegalArgumentException var36) {
throw vm.a<"Å">(var36, 3443388683122755290L, var21);
}

var14 = 0.0F;
}

var10000 = var19 & b<"y">(23570, 4484422915936566442L ^ var21);
}

try {
var10001 = var25;
} catch (IllegalArgumentException var28) {
throw vm.a<"Å">(var28, 3443388683122755290L, var21);
}
}

label131: {
label130: {
label129: {
try {
if (var13 < 0) {
break label131;
}

if (var10001 != null) {
break label130;
}

if (var10000 == 0) {
break label129;
}
} catch (IllegalArgumentException var35) {
throw vm.a<"Å">(var35, 3443388683122755290L, var21);
}

var15 = 1.0F;
}

var10000 = var19 & b<"y">(17975, 2227909318681667205L ^ var21);
}

try {
var10001 = var25;
} catch (IllegalArgumentException var27) {
throw vm.a<"Å">(var27, 3443388683122755290L, var21);
}
}

label118: {
label117: {
label116: {
try {
if (var9 <= 0) {
break label118;
}

if (var10001 != null) {
break label117;
}

if (var10000 == 0) {
break label116;
}
} catch (IllegalArgumentException var34) {
throw vm.a<"Å">(var34, 3443388683122755290L, var21);
}

var17 = 1.0F;
}

var10000 = var19 & b<"y">(24363, 1676193812807171974L ^ var21);
}

try {
var10001 = var25;
} catch (IllegalArgumentException var26) {
throw vm.a<"Å">(var26, 3443388683122755290L, var21);
}
}

label105: {
label104: {
try {
if (var10001 != null) {
break label104;
}

if (var10000 == 0) {
break label105;
}
} catch (IllegalArgumentException var33) {
throw vm.a<"Å">(var33, 3443388683122755290L, var21);
}

var10000 = 0;
}

var18 = var10000;
}

var0.s(var1, var2, var3, var4, var5, var6, var7, var8, var10, var11, var12, var14, var15, var17, (boolean)var18, var23);
}

public final void j(
@NotNull g7 polygon,
float x,
float y,
float width,
float height,
@NotNull Color color1,
@NotNull Color color2,
@NotNull Color color3,
@NotNull Color color4,
long a,
float uStart,
float vStart,
float uEnd,
float vEnd
) {
ax = a ^ ax;
long var16 = ax ^ 104657526358364L;
long var18 = ax ^ 3561106040375L;
long var20 = ax ^ 15535556781159L;
Intrinsics.checkNotNullParameter(polygon, a<"u">(31150, 5628669963219286730L ^ ax));
Intrinsics.checkNotNullParameter(color1, a<"u">(305, 9196820542922998379L ^ ax));
Intrinsics.checkNotNullParameter(color2, a<"u">(27319, 5412743305168628184L ^ ax));
Intrinsics.checkNotNullParameter(color3, a<"u">(26767, 6219224609832315877L ^ ax));
Intrinsics.checkNotNullParameter(color4, a<"u">(27387, 6488163499459488141L ^ ax));
g7.j(polygon, x + 0, yx + height, 0.0F, 4, var18, null).j(uStart, var20, vEnd).n(color1, var16);
g7.j(polygon, x + width, yx + height, 0.0F, 4, var18, null).j(uEnd, var20, vEnd).n(color2, var16);
g7.j(polygon, x + width, yx + 0, 0.0F, 4, var18, null).j(uEnd, var20, vStart).n(color3, var16);
g7.j(polygon, x + 0, yx + 0, 0.0F, 4, var18, null).j(uStart, var20, vStart).n(color4, var16);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static void R(
jl var0,
g7 var1,
float var2,
float var3,
float var4,
float var5,
Color var6,
Color var7,
Color var8,
Color var9,
float var10,
float var11,
float var12,
long var13,
float var15,
int var16,
Object var17
) {
var13 = a ^ var13;
long var18 = var13 ^ 87030724620126L;
_g[] var20 = vm.a<"Å">(-1102968877069820240L, var13);

int var10000;
label161: {
label160: {
try {
var10000 = var16 & b<"y">(2441, 2237666179874633715L ^ var13);
if (var20 != null) {
break label161;
}

if (var10000 == 0) {
break label160;
}
} catch (IllegalArgumentException var32) {
throw vm.a<"Å">(var32, -1076848451136907235L, var13);
}

Color var34 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"u">(7819, 5382335038219783884L ^ var13));
var6 = var34;
}

var10000 = var16 & b<"y">(2475, 7823208138556913625L ^ var13);
}

_g[] var10001;
label152: {
label151: {
label150: {
try {
var10001 = var20;
if (var13 <= 0L) {
break label152;
}

if (var20 != null) {
break label151;
}

if (var10000 == 0) {
break label150;
}
} catch (IllegalArgumentException var31) {
throw vm.a<"Å">(var31, -1076848451136907235L, var13);
}

var7 = var6;
}

var10000 = var16 & b<"y">(1453, 5304291394854403022L ^ var13);
}

try {
var10001 = var20;
} catch (IllegalArgumentException var25) {
throw vm.a<"Å">(var25, -1076848451136907235L, var13);
}
}

label139: {
label138: {
label137: {
try {
if (var13 < 0L) {
break label139;
}

if (var10001 != null) {
break label138;
}

if (var10000 == 0) {
break label137;
}
} catch (IllegalArgumentException var30) {
throw vm.a<"Å">(var30, -1076848451136907235L, var13);
}

var8 = var7;
}

var10000 = var16 & b<"y">(16873, 5959117307730132870L ^ var13);
}

try {
var10001 = var20;
} catch (IllegalArgumentException var24) {
throw vm.a<"Å">(var24, -1076848451136907235L, var13);
}
}

label126: {
label125: {
label124: {
try {
if (var13 < 0L) {
break label126;
}

if (var10001 != null) {
break label125;
}

if (var10000 == 0) {
break label124;
}
} catch (IllegalArgumentException var29) {
throw vm.a<"Å">(var29, -1076848451136907235L, var13);
}

var9 = var8;
}

var10000 = var16 & b<"y">(13952, 6935917363247155433L ^ var13);
}

try {
var10001 = var20;
} catch (IllegalArgumentException var23) {
throw vm.a<"Å">(var23, -1076848451136907235L, var13);
}
}

label113: {
label112: {
label111: {
try {
if (var13 < 0L) {
break label113;
}

if (var10001 != null) {
break label112;
}

if (var10000 == 0) {
break label111;
}
} catch (IllegalArgumentException var28) {
throw vm.a<"Å">(var28, -1076848451136907235L, var13);
}

var10 = 0.0F;
}

var10000 = var16 & b<"y">(30700, 5819236590232750481L ^ var13);
}

try {
var10001 = var20;
} catch (IllegalArgumentException var22) {
throw vm.a<"Å">(var22, -1076848451136907235L, var13);
}
}

label100: {
label99: {
label98: {
try {
if (var13 < 0L) {
break label100;
}

if (var10001 != null) {
break label99;
}

if (var10000 == 0) {
break label98;
}
} catch (IllegalArgumentException var27) {
throw vm.a<"Å">(var27, -1076848451136907235L, var13);
}

var11 = 0.0F;
}

var10000 = var16 & b<"y">(11242, 796358854778885526L ^ var13);
}

try {
var10001 = var20;
} catch (IllegalArgumentException var21) {
throw vm.a<"Å">(var21, -1076848451136907235L, var13);
}
}

label87: {
label86: {
try {
if (var10001 != null) {
break label87;
}

if (var10000 == 0) {
break label86;
}
} catch (IllegalArgumentException var26) {
throw vm.a<"Å">(var26, -1076848451136907235L, var13);
}

var12 = 1.0F;
}

var10000 = var16 & b<"y">(7881, 570764744805687473L ^ var13);
}

if (var10000 != 0) {
var15 = 1.0F;
}

var0.j(var1, var2, var3, var4, var5, var6, var7, var8, var9, var18, var10, var11, var12, var15);
}

public final void D(
@NotNull Matrix4f matrices,
@NotNull class_2960 id,
float x,
float y,
float width,
float height,
@NotNull Color color1,
@NotNull Color color2,
@NotNull Color color3,
@NotNull Color color4,
boolean altBlend,
float uStart,
float vStart,
float uEnd,
long a,
float vEnd
) {
ax = a ^ ax;
long var18 = ax ^ 81866690003324L;
long var20 = ax ^ 24978651012623L;
long var22 = ax ^ 45306417545128L;
long var24 = ax ^ 70621496838754L;
long var26 = ax ^ 128809830914243L;
long var28 = ax ^ 132194346801811L;
Intrinsics.checkNotNullParameter(matrices, a<"u">(9993, 3579372093499021972L ^ ax));
Intrinsics.checkNotNullParameter(id, a<"u">(23209, 6300272345558247207L ^ ax));
Intrinsics.checkNotNullParameter(color1, a<"u">(305, 9196875547457764511L ^ ax));
Intrinsics.checkNotNullParameter(color2, a<"u">(27319, 5412653028206565164L ^ ax));
Intrinsics.checkNotNullParameter(color3, a<"u">(26767, 6219305948959134993L ^ ax));
Intrinsics.checkNotNullParameter(color4, a<"u">(27387, 6488244815031097209L ^ ax));
float var39 = height / 2.0F;
float var40 = width / 2.0F;
GpuTextureView var10000 = zf.F(var18).method_1531().method_4619(id).method_71659();
Intrinsics.checkNotNullExpressionValue(var10000, a<"u">(15083, 7169752286584276831L ^ ax));
GpuTextureView var41 = var10000;
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, a<"u">(22455, 7240279838387071521L ^ ax));
int var10005 = b<"y">(30831, 4011477348434176990L ^ ax);
Object var30 = null;
int var31 = var10005;
boolean var32 = false;
byte var33 = 0;
VertexFormat var34 = var10002;
g7 var42 = new g7(var20, var34, var33, var32, var31, (DefaultConstructorMarker)var30);

RenderPipeline var10001;
label17: {
try {
g7.j(var42, x - var39, yx + var39, 0.0F, 4, var26, null).j(uStart, var28, vEnd).n(color1, var22);
g7.j(var42, x + var40, yx + var39, 0.0F, 4, var26, null).j(uEnd, var28, vEnd).n(color2, var22);
g7.j(var42, x + var40, yx - var39, 0.0F, 4, var26, null).j(uEnd, var28, vStart).n(color3, var22);
g7.j(var42, x - var40, yx - var39, 0.0F, 4, var26, null).j(uStart, var28, vStart).n(color4, var22);
var49 = var42;
if (altBlend) {
var10001 = b6.R.S();
break label17;
}
} catch (IllegalArgumentException var43) {
throw vm.a<"Å">(var43, -2539641530347145774L, ax);
}

var10001 = b6.R.O();
}

class_276 var50 = zf.F(var18).method_1522();
Intrinsics.checkNotNullExpressionValue(var50, a<"u">(23067, 4950858501852096438L ^ ax));
Matrix3x2f var51 = (Matrix3x2f)(new Matrix3x2fStack());
Map var10006 = MapsKt.mapOf(TuplesKt.to(a<"u">(8718, 7712243459239255995L ^ ax), var41));
var30 = null;
byte var46 = 4;
Map var47 = var10006;
Matrix3x2f var48 = var51;
Object var35 = null;
class_276 var36 = var50;
RenderPipeline var37 = var10001;
g7 var38 = var49;
g7.R(var24, var38, var37, var36, (GpuBufferSlice)var35, matrices, var48, var47, var46, var30);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static void n(
jl var0,
Matrix4f var1,
class_2960 var2,
float var3,
float var4,
float var5,
long var6,
float var8,
Color var9,
Color var10,
Color var11,
Color var12,
boolean var13,
float var14,
float var15,
float var16,
float var17,
int var18,
Object var19
) {
var6 = a ^ var6;
long var20 = var6 ^ 90989169007172L;
_g[] var22 = vm.a<"Å">(4278169351745951070L, var6);

int var10000;
label185: {
label184: {
try {
var10000 = var18 & b<"y">(23733, 316089317259651391L ^ var6);
if (var22 != null) {
break label185;
}

if (var10000 == 0) {
break label184;
}
} catch (IllegalArgumentException var36) {
throw vm.a<"Å">(var36, 4242443589993944051L, var6);
}

Color var38 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"u">(8403, 1623046690603400059L ^ var6));
var9 = var38;
}

var10000 = var18 & b<"y">(2597, 1979090164644282286L ^ var6);
}

_g[] var10001;
label176: {
label175: {
label174: {
try {
var10001 = var22;
if (var6 <= 0L) {
break label176;
}

if (var22 != null) {
break label175;
}

if (var10000 == 0) {
break label174;
}
} catch (IllegalArgumentException var35) {
throw vm.a<"Å">(var35, 4242443589993944051L, var6);
}

var10 = var9;
}

var10000 = var18 & b<"y">(4408, 6836305434916152495L ^ var6);
}

try {
var10001 = var22;
} catch (IllegalArgumentException var28) {
throw vm.a<"Å">(var28, 4242443589993944051L, var6);
}
}

label163: {
label162: {
label161: {
try {
if (var6 < 0L) {
break label163;
}

if (var10001 != null) {
break label162;
}

if (var10000 == 0) {
break label161;
}
} catch (IllegalArgumentException var34) {
throw vm.a<"Å">(var34, 4242443589993944051L, var6);
}

var11 = var10;
}

var10000 = var18 & b<"y">(30957, 1676649613732973938L ^ var6);
}

try {
var10001 = var22;
} catch (IllegalArgumentException var27) {
throw vm.a<"Å">(var27, 4242443589993944051L, var6);
}
}

label150: {
label149: {
label148: {
try {
if (var6 < 0L) {
break label150;
}

if (var10001 != null) {
break label149;
}

if (var10000 == 0) {
break label148;
}
} catch (IllegalArgumentException var33) {
throw vm.a<"Å">(var33, 4242443589993944051L, var6);
}

var12 = var11;
}

var10000 = var18 & b<"y">(3554, 4181618143542933601L ^ var6);
}

try {
var10001 = var22;
} catch (IllegalArgumentException var26) {
throw vm.a<"Å">(var26, 4242443589993944051L, var6);
}
}

label137: {
label136: {
label135: {
try {
if (var6 < 0L) {
break label137;
}

if (var10001 != null) {
break label136;
}

if (var10000 == 0) {
break label135;
}
} catch (IllegalArgumentException var32) {
throw vm.a<"Å">(var32, 4242443589993944051L, var6);
}

var13 = false;
}

var10000 = var18 & b<"y">(28013, 8982334188993321187L ^ var6);
}

try {
var10001 = var22;
} catch (IllegalArgumentException var25) {
throw vm.a<"Å">(var25, 4242443589993944051L, var6);
}
}

label124: {
label123: {
label122: {
try {
if (var6 < 0L) {
break label124;
}

if (var10001 != null) {
break label123;
}

if (var10000 == 0) {
break label122;
}
} catch (IllegalArgumentException var31) {
throw vm.a<"Å">(var31, 4242443589993944051L, var6);
}

var14 = 0.0F;
}

var10000 = var18 & b<"y">(23570, 4484370084484884867L ^ var6);
}

try {
var10001 = var22;
} catch (IllegalArgumentException var24) {
throw vm.a<"Å">(var24, 4242443589993944051L, var6);
}
}

label111: {
label110: {
label109: {
try {
if (var6 < 0L) {
break label111;
}

if (var10001 != null) {
break label110;
}

if (var10000 == 0) {
break label109;
}
} catch (IllegalArgumentException var30) {
throw vm.a<"Å">(var30, 4242443589993944051L, var6);
}

var15 = 0.0F;
}

var10000 = var18 & b<"y">(29626, 3189156858183157254L ^ var6);
}

try {
var10001 = var22;
} catch (IllegalArgumentException var23) {
throw vm.a<"Å">(var23, 4242443589993944051L, var6);
}
}

label98: {
label97: {
try {
if (var10001 != null) {
break label98;
}

if (var10000 == 0) {
break label97;
}
} catch (IllegalArgumentException var29) {
throw vm.a<"Å">(var29, 4242443589993944051L, var6);
}

var16 = 1.0F;
}

var10000 = var18 & b<"y">(10627, 879973472431627267L ^ var6);
}

if (var10000 != 0) {
var17 = 1.0F;
}

var0.D(var1, var2, var3, var4, var5, var8, var9, var10, var11, var12, var13, var14, var15, var16, var20, var17);
}

public final void h(@NotNull Matrix3x2fStack matrices, float x, float y, float x1, long a, float y1, @NotNull Color color, int a, @NotNull Color color2) {
long var11 = (axx << 32 | (long)ax << 32 >>> 32) ^ a;
long var13 = var11 ^ 16869218681789L;
long var15 = var11 ^ 53690727342618L;
long var17 = var11 ^ 98795948660688L;
long var19 = var11 ^ 119599813117297L;
Intrinsics.checkNotNullParameter(matrices, a<"u">(9993, 3579343642019743526L ^ var11));
Intrinsics.checkNotNullParameter(color, a<"u">(20066, 6587514800623595081L ^ var11));
Intrinsics.checkNotNullParameter(color2, a<"u">(27319, 5412625951125572254L ^ var11));
VertexFormat var10002 = class_290.field_1576;
Intrinsics.checkNotNullExpressionValue(class_290.field_1576, a<"u">(6676, 5714512724354431502L ^ var11));
Object var21 = null;
byte var22 = 2;
boolean var23 = true;
byte var24 = 0;
VertexFormat var25 = var10002;
g7.R(
var17,
g7.j(
g7.j(new g7(var13, var25, var24, var23, var22, (DefaultConstructorMarker)var21), x, yx, 0.0F, 4, var19, null).n(color, var15), x1, y1, 0.0F, 4, var19, null
)
.n(color2, var15),
b6.R.w(),
null,
null,
null,
new Matrix3x2f((Matrix3x2fc)matrices),
null,
b<"y">(22086, 4007022960182466639L ^ var11),
null
);
}

public static void a(
long var0, jl var2, Matrix3x2fStack var3, float var4, float var5, int var6, float var7, float var8, Color var9, Color var10, int var11, Object var12
) {
long var13 = (var0 << 32 | (long)var6 << 32 >>> 32) ^ a;
long var15 = (var13 ^ 120944539417446L) >>> 32;
int var17 = (int)((var13 ^ 120944539417446L) << 32 >>> 32);
if ((var11 & b<"y">(23733, 316060466504668591L ^ var13)) != 0) {
var10 = var9;
}

var2.h(var3, var4, var5, var7, var15, var8, var9, var17, var10);
}

private final int q(int var1, int var2, float var3) {
return MathKt.roundToInt(var1 + (var2 - var1) * var3);
}

public final double a(double oldValue, double newValue, float interpolationValue) {
return oldValue + (newValue - oldValue) * interpolationValue;
}

public final double W(double oldValue, double newValue, double interpolationValue) {
return oldValue + (newValue - oldValue) * interpolationValue;
}

public final float B(float oldValue, float newValue, float interpolationValue) {
return oldValue + (newValue - oldValue) * interpolationValue;
}

@NotNull
public final class_243 i(@NotNull class_243 pos, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/jl.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 26760698123203
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 34983346878374
// 012: lxor
// 013: lstore 6
// 015: pop2
// 016: ldc2_w 1135189629502677440
// 019: lload 2
// 01a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01f: aload 1
// 020: sipush 3986
// 023: ldc2_w 8325593256584339591
// 026: lload 2
// 027: lxor
// 028: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/jl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 030: astore 8
// 032: aload 8
// 034: ifnonnull 07a
// 037: lload 4
// 039: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 03c: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 03f: getfield net/minecraft/class_898.field_4686 Lnet/minecraft/class_4184;
// 042: dup
// 043: ifnull 079
// 046: goto 053
// 049: ldc2_w 1044328618555729773
// 04c: lload 2
// 04d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: athrow
// 053: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 056: dup
// 057: aload 8
// 059: ifnonnull 07e
// 05c: goto 069
// 05f: ldc2_w 1044328618555729773
// 062: lload 2
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: ifnonnull 08e
// 06c: goto 079
// 06f: ldc2_w 1044328618555729773
// 072: lload 2
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: pop
// 07a: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 07d: dup
// 07e: sipush 14543
// 081: ldc2_w 4384252929078941653
// 084: lload 2
// 085: lxor
// 086: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/jl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08e: astore 9
// 090: lload 4
// 092: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 095: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 098: invokevirtual net/minecraft/class_1041.method_4507 ()I
// 09b: aload 0
// 09c: lload 6
// 09e: invokespecial su/catlean/jl.Y (J)Z
// 0a1: aload 8
// 0a3: ifnonnull 0b7
// 0a6: ifeq 0ba
// 0a9: goto 0b6
// 0ac: ldc2_w 1044328618555729773
// 0af: lload 2
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: bipush 2
// 0b7: goto 0bb
// 0ba: bipush 1
// 0bb: imul
// 0bc: istore 10
// 0be: new org/joml/Vector3f
// 0c1: dup
// 0c2: invokespecial org/joml/Vector3f.<init> ()V
// 0c5: astore 11
// 0c7: aload 1
// 0c8: getfield net/minecraft/class_243.field_1352 D
// 0cb: aload 9
// 0cd: getfield net/minecraft/class_243.field_1352 D
// 0d0: dsub
// 0d1: dstore 12
// 0d3: aload 1
// 0d4: getfield net/minecraft/class_243.field_1351 D
// 0d7: aload 9
// 0d9: getfield net/minecraft/class_243.field_1351 D
// 0dc: dsub
// 0dd: dstore 14
// 0df: aload 1
// 0e0: getfield net/minecraft/class_243.field_1350 D
// 0e3: aload 9
// 0e5: getfield net/minecraft/class_243.field_1350 D
// 0e8: dsub
// 0e9: dstore 16
// 0eb: new org/joml/Vector4f
// 0ee: dup
// 0ef: dload 12
// 0f1: d2f
// 0f2: dload 14
// 0f4: d2f
// 0f5: dload 16
// 0f7: d2f
// 0f8: fconst_1
// 0f9: invokespecial org/joml/Vector4f.<init> (FFFF)V
// 0fc: getstatic su/catlean/jl.V Lorg/joml/Matrix4f;
// 0ff: checkcast org/joml/Matrix4fc
// 102: invokevirtual org/joml/Vector4f.mul (Lorg/joml/Matrix4fc;)Lorg/joml/Vector4f;
// 105: astore 18
// 107: new org/joml/Matrix4f
// 10a: dup
// 10b: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 10e: invokevirtual su/catlean/zi.s ()Lorg/joml/Matrix4f;
// 111: checkcast org/joml/Matrix4fc
// 114: invokespecial org/joml/Matrix4f.<init> (Lorg/joml/Matrix4fc;)V
// 117: astore 19
// 119: new org/joml/Matrix4f
// 11c: dup
// 11d: getstatic su/catlean/jl.r Lorg/joml/Matrix4f;
// 120: checkcast org/joml/Matrix4fc
// 123: invokespecial org/joml/Matrix4f.<init> (Lorg/joml/Matrix4fc;)V
// 126: astore 20
// 128: aload 19
// 12a: aload 20
// 12c: checkcast org/joml/Matrix4fc
// 12f: invokevirtual org/joml/Matrix4f.mul (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
// 132: aload 18
// 134: invokevirtual org/joml/Vector4f.x ()F
// 137: aload 18
// 139: invokevirtual org/joml/Vector4f.y ()F
// 13c: aload 18
// 13e: invokevirtual org/joml/Vector4f.z ()F
// 141: getstatic su/catlean/jl.M [I
// 144: aload 11
// 146: invokevirtual org/joml/Matrix4f.project (FFF[ILorg/joml/Vector3f;)Lorg/joml/Vector3f;
// 149: pop
// 14a: new net/minecraft/class_243
// 14d: dup
// 14e: aload 11
// 150: getfield org/joml/Vector3f.x F
// 153: f2d
// 154: lload 4
// 156: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 159: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 15c: invokevirtual net/minecraft/class_1041.method_4495 ()I
// 15f: i2d
// 160: ddiv
// 161: iload 10
// 163: i2f
// 164: aload 11
// 166: getfield org/joml/Vector3f.y F
// 169: fsub
// 16a: f2d
// 16b: lload 4
// 16d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 170: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 173: invokevirtual net/minecraft/class_1041.method_4495 ()I
// 176: i2d
// 177: ddiv
// 178: aload 11
// 17a: getfield org/joml/Vector3f.z F
// 17d: f2d
// 17e: invokespecial net/minecraft/class_243.<init> (DDD)V
// 181: areturn
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void z(long a, @NotNull class_4587 matrices, @NotNull class_1799 stack) {
ax = a ^ ax;
long var5 = ax ^ 18145436690997L;
long var7 = ax ^ 55191803386548L;
_g[] var10000 = vm.a<"Å">(3906600146013509686L, ax);
Intrinsics.checkNotNullParameter(matrices, a<"u">(9993, 3579272094803849693L ^ ax));
_g[] var9 = var10000;

label31: {
label36: {
try {
Intrinsics.checkNotNullParameter(stack, a<"u">(14405, 3417258737426722463L ^ ax));
if (var9 != null) {
break label36;
}

if (stack.method_7960()) {
return;
}
} catch (Throwable var13) {
throw vm.a<"Å">(var13, 4001513750331973275L, ax);
}

matrices.method_22903();
matrices.method_46416(8.0F, 8.0F, 150.0F);

try {
matrices.method_22905(16.0F, -16.0F, 16.0F);
} catch (Throwable var12) {
break label31;
}
}

try {
class_10444 var10 = new class_10444();
zf.F(var5).method_65386().method_65598(var10, stack, class_811.field_4317, (class_1937)zf.z(var7), null, 0);
var10.method_65604(matrices, (class_11659)zf.F(var5).field_1773.method_72910(), b<"y">(15637, 842563703567238642L ^ ax), class_4608.field_21444, 0);
} catch (Throwable var11) {
}
}

matrices.method_22909();
}

public final void b(@NotNull class_2960 i, long a, @NotNull BufferedImage bi) {
ax = a ^ ax;
long var5 = ax ^ 4625263590026L;
long var7 = ax ^ 69605941582585L;
long var10001 = ax ^ 117864164784116L;
int var9 = (int)((ax ^ 117864164784116L) >>> 32);
int var10 = (int)((ax ^ 117864164784116L) << 32 >>> 48);
int var11 = (int)(var10001 << 48 >>> 48);

try {
Intrinsics.checkNotNullParameter(i, "i");
Intrinsics.checkNotNullParameter(bi, a<"u">(4563, 2697503449940252585L ^ ax));
if (RenderSystem.isOnRenderThread()) {
zf.F(var5).method_1531().method_4616(i, (class_1044)this.o(bi, var7));
return;
}
} catch (IllegalArgumentException var12) {
throw vm.a<"Å">(var12, -6397592818912637404L, ax);
}

this.d(var9, (short)var10, jl::f, (char)var11);
}

public final boolean d(int a, short a, @NotNull Function0 function, char a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(function, a<"u">(28391, 7385731648841016095L ^ var5));
return E.add(function);
}

@NotNull
public final class_1043 o(@NotNull BufferedImage bi, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(bi, a<"u">(14652, 3696608601102571969L ^ ax));
int var4 = bi.getWidth();
int var5 = bi.getHeight();
class_1011 var6 = new class_1011(class_1012.field_4997, var4, var5, false);
long var7 = ((NativeImageAccessor)var6).getPixels();
IntBuffer var9 = MemoryUtil.memIntBuffer(var7, var6.method_4307() * var6.method_4323());
Object var10 = null;
WritableRaster var11 = bi.getRaster();
ColorModel var12 = bi.getColorModel();
int var13 = var11.getNumBands();
int var14 = var11.getDataBuffer().getDataType();

Object var10000;
label58: {
label57: {
label56: {
label55: {
try {
switch (var14) {
case 0:
var10000 = new byte[var13];
break label58;
case 1:
break label57;
case 2:
default:
throw new IllegalArgumentException(a<"u">(29732, 509386530461029608L ^ ax) + var14);
case 3:
break label56;
case 4:
break label55;
case 5:
}
} catch (IllegalArgumentException var22) {
throw vm.a<"Å">(var22, -9103168781898258248L, ax);
}

var10000 = new double[var13];
break label58;
}

var10000 = new float[var13];
break label58;
}

var10000 = new int[var13];
break label58;
}

var10000 = new short[var13];
}

var10 = var10000;
int var15 = 0;

while (var15 < var5) {
int var16 = 0;

while (true) {
if (var16 < var4) {
var11.getDataElements(var16, var15, var10);
int var17 = var12.getAlpha(var10);
int var18 = var12.getRed(var10);
int var19 = var12.getGreen(var10);
int var20 = var12.getBlue(var10);
int var21 = var17 << b<"y">(6677, 901945007292142807L ^ ax)
| var20 << b<"y">(2084, 1405422893460473554L ^ ax)
| var19 << b<"y">(16213, 380956114264486290L ^ ax)
| var18;
var9.put(var21);
var16++;
if (ax < 0L) {
break;
}

if (ax > 0L) {
continue;
}
}

var15++;
break;
}

if (ax <= 0L) {
break;
}
}

Supplier var25 = jl::e;
class_1043 var26 = new class_1043(var25, var6);
var26.method_4524();
return var26;
}

@Nullable
public final Vector4d t(short a, int a, @NotNull class_1297 ent, float offset, int a) {
long var6 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var8 = (var6 ^ 10969104086586L) >>> 8;
int var10 = (int)((var6 ^ 10969104086586L) << 56 >>> 56);
long var11 = var6 ^ 24460228998550L;
Intrinsics.checkNotNullParameter(ent, a<"u">(17536, 6527042597519563239L ^ var6));
return this.S(
this.a(ent.field_6014, ent.method_23317(), this.K(var11)),
this.a(ent.field_6036, ent.method_23318(), this.K(var11)) + ent.method_18381(ent.method_18376()) + offset,
var8,
this.a(ent.field_5969, ent.method_23321(), this.K(var11)),
(byte)var10
);
}

public static Vector4d i(long var0, jl var2, class_1297 var3, float var4, int var5, Object var6) {
var0 = a ^ var0;
long var10001 = var0 ^ 45104453747386L;
int var7 = (int)((var0 ^ 45104453747386L) >>> 48);
int var8 = (int)((var0 ^ 45104453747386L) << 16 >>> 32);
int var9 = (int)(var10001 << 48 >>> 48);
if ((var5 & 2) != 0) {
var4 = 0.4F;
}

return var2.t((short)var7, var8, var3, var4, var9);
}

@Nullable
public final Vector4d t(long a, @NotNull class_243 pos) {
ax = a ^ ax;
long var4 = (ax ^ 44010186601569L) >>> 8;
int var6 = (int)((ax ^ 44010186601569L) << 56 >>> 56);
Intrinsics.checkNotNullParameter(pos, a<"u">(21045, 5311499625526856983L ^ ax));
return this.S(pos.field_1352, pos.field_1351, var4, pos.field_1350, (byte)var6);
}

@Nullable
public final Vector4d S(double x, double y, long a, double z, byte a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 5
// 02: bipush 8
// 04: lshl
// 05: iload 9
// 07: i2l
// 08: bipush 56
// 0a: lshl
// 0b: bipush 56
// 0d: lushr
// 0e: lor
// 0f: getstatic su/catlean/jl.a J
// 12: lxor
// 13: lstore 10
// 15: lload 10
// 17: dup2
// 18: ldc2_w 94831402140794
// 1b: lxor
// 1c: lstore 12
// 1e: pop2
// 1f: ldc2_w -585948958672872993
// 22: lload 10
// 24: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: aconst_null
// 2a: astore 15
// 2c: astore 14
// 2e: aload 0
// 2f: new net/minecraft/class_243
// 32: dup
// 33: dload 1
// 34: dload 3
// 35: dload 7
// 37: invokespecial net/minecraft/class_243.<init> (DDD)V
// 3a: lload 12
// 3c: invokevirtual su/catlean/jl.i (Lnet/minecraft/class_243;J)Lnet/minecraft/class_243;
// 3f: astore 16
// 41: aload 16
// 43: getfield net/minecraft/class_243.field_1350 D
// 46: dconst_0
// 47: dcmpl
// 48: aload 14
// 4a: ifnonnull 73
// 4d: ifle 97
// 50: goto 5e
// 53: ldc2_w -693139643537547406
// 56: lload 10
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: aload 16
// 60: getfield net/minecraft/class_243.field_1350 D
// 63: dconst_1
// 64: dcmpg
// 65: goto 73
// 68: ldc2_w -693139643537547406
// 6b: lload 10
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: ifge 97
// 76: new org/joml/Vector4d
// 79: dup
// 7a: aload 16
// 7c: getfield net/minecraft/class_243.field_1352 D
// 7f: aload 16
// 81: getfield net/minecraft/class_243.field_1351 D
// 84: aload 16
// 86: getfield net/minecraft/class_243.field_1352 D
// 89: aload 16
// 8b: getfield net/minecraft/class_243.field_1350 D
// 8e: invokestatic java/lang/Math.max (DD)D
// 91: dconst_0
// 92: invokespecial org/joml/Vector4d.<init> (DDDD)V
// 95: astore 15
// 97: aload 15
// 99: areturn
}

@NotNull
public final Color p(@NotNull Color $this$withAlpha, char a, int a, float alpha, short a) {
long var6 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter($this$withAlpha, a<"u">(16051, 8809214358239707446L ^ var6));
return new Color($this$withAlpha.getRed(), $this$withAlpha.getGreen(), $this$withAlpha.getBlue(), (int)(255.0F * Math.clamp(alpha, 0.0F, 1.0F)));
}

@NotNull
public final Color C(@NotNull Color $this$mix, long a, @NotNull Color end, float value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter($this$mix, a<"u">(16051, 8809217112280247384L ^ ax));
Intrinsics.checkNotNullParameter(end, a<"u">(30264, 595406341939225833L ^ ax));
float var6 = Math.clamp(value, 0.0F, 1.0F);
return new Color(
this.q($this$mix.getRed(), end.getRed(), var6),
this.q($this$mix.getGreen(), end.getGreen(), var6),
this.q($this$mix.getBlue(), end.getBlue(), var6),
this.q($this$mix.getAlpha(), end.getAlpha(), var6)
);
}

public final float y(@NotNull Color $this$glRed, char a, short a, int a) {
long var5 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter($this$glRed, a<"u">(16012, 2743523194087085394L ^ var5));
return $this$glRed.getRed() / 255.0F;
}

public final float M(long a, @NotNull Color $this$glGreen) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter($this$glGreen, a<"u">(16051, 8809217966621105644L ^ ax));
return $this$glGreen.getGreen() / 255.0F;
}

public final float r(@NotNull Color $this$glBlue, long a, int a) {
long var5 = (axx << 32 | (long)ax << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter($this$glBlue, a<"u">(16051, 8809277732926522952L ^ var5));
return $this$glBlue.getBlue() / 255.0F;
}

public final float G(long a, @NotNull Color $this$glAlpha) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter($this$glAlpha, a<"u">(16051, 8809315459465758017L ^ ax));
return $this$glAlpha.getAlpha() / 255.0F;
}

public final float K(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 85635303336048L;
return zf.F(var3).method_61966().method_60637(true);
}

public final float T(float oldValue, float newValue, long a) {
ax = a ^ ax;
long var5 = ax ^ 39852224653919L;
return this.B(oldValue, newValue, this.K(var5));
}

public final double b(long a, double oldValue, double newValue) {
ax = a ^ ax;
long var7 = ax ^ 111887318442712L;
return this.a(oldValue, newValue, this.K(var7));
}

@NotNull
public final class_243[] L(long a, @NotNull class_1297 ent) {
ax = a ^ ax;
long var4 = ax ^ 119445293864069L;
Intrinsics.checkNotNullParameter(ent, a<"u">(30464, 5084466647000124404L ^ ax));
class_238 var6 = zi.v.S(ent, var4);
class_243[] var7 = new class_243[b<"y">(17993, 3357590210550830232L ^ ax)];
var7[0] = new class_243(var6.field_1323, var6.field_1322, var6.field_1321);
var7[1] = new class_243(var6.field_1323, var6.field_1325, var6.field_1321);
var7[2] = new class_243(var6.field_1320, var6.field_1322, var6.field_1321);
var7[3] = new class_243(var6.field_1320, var6.field_1325, var6.field_1321);
var7[4] = new class_243(var6.field_1323, var6.field_1322, var6.field_1324);
var7[5] = new class_243(var6.field_1323, var6.field_1325, var6.field_1324);
var7[b<"y">(30831, 4011532764288658091L ^ ax)] = new class_243(var6.field_1320, var6.field_1322, var6.field_1324);
var7[b<"y">(25239, 7655531764313665605L ^ ax)] = new class_243(var6.field_1320, var6.field_1325, var6.field_1324);
return var7;
}

public final void P(@NotNull g7 polygon, float posX, long a, float posY, float endPosX, float endPosY, @NotNull Color color) {
ax = a ^ ax;
long var9 = ax ^ 66504412789263L;
Intrinsics.checkNotNullParameter(polygon, a<"u">(23594, 2073565596155160451L ^ ax));
Intrinsics.checkNotNullParameter(color, a<"u">(20292, 8082995580676551932L ^ ax));
Color var11 = Color.BLACK;
float var10003 = posX - 1.0F;
float var10005 = posX + 0.5F;
float var10006 = endPosY + 0.5F;
Intrinsics.checkNotNull(var11);
this.O(var9, polygon, var10003, posY, var10005, var10006, var11);
this.O(var9, polygon, posX - 1.0F, posY - 0.5F, endPosX + 0.5F, posY + 1.0F, var11);
this.O(var9, polygon, endPosX - 1.0F, posY, endPosX + 0.5F, endPosY + 0.5F, var11);
this.O(var9, polygon, posX - 1.0F, endPosY - 1.0F, endPosX + 0.5F, endPosY + 0.5F, var11);
this.O(var9, polygon, posX - 0.5F, posY, posX, endPosY, color);
this.O(var9, polygon, posX, endPosY - 0.5F, endPosX, endPosY, color);
this.O(var9, polygon, posX - 0.5F, posY, endPosX, posY + 0.5F, color);
this.O(var9, polygon, endPosX - 0.5F, posY, endPosX, endPosY, color);
}

@NotNull
public final Color q(int speed, int index, long a, char a, float saturation, float brightness) {
long var8 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
int var10 = (int)((zf.A() / speed + index) % b<"y">(14038, 8203555188871718319L ^ var8));
float var11 = var10 / 360.0F;
Color var12 = new Color(Color.HSBtoRGB(var11, saturation, brightness));
return new Color(var12.getRed(), var12.getGreen(), var12.getBlue(), b<"y">(4485, 6427966836364329702L ^ var8));
}

@NotNull
public final Color N(int speed, int index, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/jl.a J
// 03: lload 3
// 04: lxor
// 05: lstore 3
// 06: bipush 0
// 07: istore 6
// 09: ldc2_w -4406743120763933479
// 0c: lload 3
// 0d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12: invokestatic su/catlean/zf.A ()J
// 15: iload 1
// 16: i2l
// 17: ldiv
// 18: iload 2
// 19: i2l
// 1a: ladd
// 1b: sipush 15657
// 1e: ldc2_w 116149968378933563
// 21: lload 3
// 22: lxor
// 23: invokedynamic y (IJ)I bsm=su/catlean/jl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: i2l
// 29: lrem
// 2a: l2i
// 2b: istore 6
// 2d: sipush 14038
// 30: ldc2_w 8203519213830191817
// 33: lload 3
// 34: lxor
// 35: invokedynamic y (IJ)I bsm=su/catlean/jl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: istore 7
// 3c: astore 5
// 3e: iload 7
// 40: istore 8
// 42: bipush 0
// 43: istore 9
// 45: iload 6
// 47: iload 8
// 49: irem
// 4a: istore 6
// 4c: iload 7
// 4e: i2d
// 4f: ldc2_w 360.0
// 52: ddiv
// 53: d2f
// 54: f2d
// 55: ldc2_w 0.5
// 58: dcmpg
// 59: aload 5
// 5b: ifnonnull 86
// 5e: ifge 84
// 61: goto 6e
// 64: ldc2_w -4366475311718126988
// 67: lload 3
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: iload 6
// 70: i2d
// 71: ldc2_w 360.0
// 74: ddiv
// 75: d2f
// 76: fneg
// 77: goto 8c
// 7a: ldc2_w -4366475311718126988
// 7d: lload 3
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: iload 6
// 86: i2d
// 87: ldc2_w 360.0
// 8a: ddiv
// 8b: d2f
// 8c: ldc 0.5
// 8e: fconst_1
// 8f: invokestatic java/awt/Color.getHSBColor (FFF)Ljava/awt/Color;
// 92: dup
// 93: sipush 25091
// 96: ldc2_w 7299555933545283647
// 99: lload 3
// 9a: lxor
// 9b: invokedynamic u (IJ)Ljava/lang/String; bsm=su/catlean/jl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a3: areturn
}

private final boolean Y(long var1) {
var1 = a ^ var1;
String var10000 = RenderSystem.getDevice().getVendor();
Intrinsics.checkNotNullExpressionValue(var10000, a<"u">(30285, 1465893766506746550L ^ var1));
return StringsKt.contains$default(var10000, a<"u">(24804, 5099271497719284782L ^ var1), false, 2, null);
}

private static final Unit f(class_2960 var0, BufferedImage var1) {
long var2 = a ^ 37935547833666L;
long var4 = var2 ^ 38605230095470L;
long var6 = var2 ^ 26830549277725L;
zf.F(var4).method_1531().method_4616(var0, (class_1044)y.o(var1, var6));
return Unit.INSTANCE;
}

private static final String e(BufferedImage var0) {
long var1 = a ^ 73331487135642L;
return a<"u">(29763, 2202909384324578845L ^ var1) + var0.hashCode();
}

static {
long var20 = a ^ 70019816432172L;
vm.a<"Å">(null, 2257768033377332706L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[51];
int var16 = 0;
String var15 = "¸ç£\u0096\u001civ\u00115¾¾+d\n;i\u0010\u00837eo\u0005ÿ5p\u009eæCôj\u0081¬\u0018\u0010ÄW©áÁV\u0087\u0095\u007fR+\u0086Ð\u0088\u000fé \u0097Ì\u008e¶\u001eößn¦ã\u0011\u0018wÄðìMcfõï+\u0088L`\u008cûÉJsMr\u0018½§hq¶\u0001IÕ\u0097ì\u0097\u000eó:¢\u009eì\u00adGÒ\u0089\u0017PV\u0010î\u001aO\u0011Ëú°B¤ö\u008b\bë\u008bq\u0083\u0010Ë\u009d\u0017ùZHI-}÷\u008czß¡bÎ\u0010åÄ\u009eØqZVÃ\u000b\u009b«\u0083ïüòÈ\u0010°t/þJ~Ê-\u0098PBG%\u0089XÞ\u0010ÿ\u009e{\"\u0092,\u008d\u0093Oïî\u0003à}\r@\u0010T\u0005¡Ó\u0003Ûaº\u0003Ãg×jÇÕ¦\u0010\u008b\u0090B°ë¼*B`÷lyÕÀõ·\u0010¬\u0088k02à8;È6×¶V\u009cãÛ\u0010Í\b\u007f\u0087¦>Ý2\u0084%DäúD\\\u001a DÖ\u0011á\u0019\u00adày¬\u001e¿ÔúWAë\u0017¯Ó\"gÆm¶hh»³¨\u0012ë30ÿÁ\u0010XÐÕ@@ \u0097\b?û[è\u0094\u001fËú\u0081Èµf\u0088P¾ü_è,6\u0093·äÿÃr¶\u0019NÖh \u0011£p3² \u0011\u008c=\u009b \u009a00VíktØÆT\u0099rÏ\u008d\u009b¹èçÁ¶ÍO`\u0092Qú\u009a\u0010§ÄÀW\u009e»Y\u0083.\u0003Z\u0081°ÉM6(\u0005Ú¨]Ä ZgÁ$øù\u0098\u0081¬ë\u001a\u00107ß\u0001]pl 7\u0003Å¶\u008e\u0002ÙA9Ýj\u0002c«\u001b\u0010³\u001b £á¡ÛÊ==ú\u0010çÞ\u0085:\u0010Ï\u0004Üí»\u0091÷Ç·%\u0019ë\u0095V\u0090?\u0010)i³sÆ\nâ\u000e\u0094:\u000e\u0089c©ü\u000f\u0018Zù4Ë¥\u001as~|0æK\u00ad;\nx,Sä÷ÜÌ\u001cu\u0010´\u0083ôn)\u008d:ô\u0098k\u000b²xD\u0007\u001a\u00109O\u000bò\u000e·nF\u0095 h¾Axa\u0006 ±\u001c?p¢\u0013\u0004\t\u0018ø¿Í\u0016#¥1u\u0015MHQ·«ãqâW@+wæN\u0010\u0097£ÉÄôdY½Èlá,Tµ\u0002×\u0018«p½\u008dus(#ZSí\u0097\u000eµ\u0096¦\u0006\u0088u\u009d]V}8\u0010Ùp±I<ÓøjËG¬½ÊCí\u001c\u0010\u0094¯'\\z2j\u009aâ\u0017üØ\u0091óXP(mI\u0080vÚ\u0010B*¹Zã±\u008e«ÊJèaÀ\u001bêNA\u00adU \u001bÄY\u0013áwè¯ñØð\f\fÅ\u0010\u001f{\u0005uÒP1#i\u001fË\u0018UX\u0007ò\u0010X4\u00004W\u009e\u0094\u009eg°I\u0091>\u009a0·\u0010h:WÐÕ¤öÏp×}]\u008báðÙ0Zig\\>AçK\u0091\u0091\u009c\u0014Ic^\nß°ÉBhå\u0087:êpÒ«ýÏ3zÜ*\u0095Ýñc,{\u0013#Ú«*ì\u0001¿\u0010\u0082×\be³\u0088ìfÉìj\u0081\u0095ä\u001c\u0002\u0010qA\u0090¨\u0002\u0007\u0099{\u0010ÖZÒoad¡8`;\u0092u\u001f¯\u00998\u001bR\bú!7WLvè\\$ùTò\u00155ß7E\u008e\u007fg1§.\u0088PÁ\fÇà5|Î À\u0095\u008bíò³ªü%®(È\u0010Õ\u0019Ï~ä¼\tZñÚ+&ðÜ)Ý\u0010RR!Kû\u008fs³J¶fWÒÚOÑ\u0010\u0097 \u009c\u001a±H2%\u0012ü\u0094£\u008fgDø0X\u001f¸-pG¤Òy\u009fuK\u0011¿Ñ4\u0093ZÓ\u0005\u0095pÛiüþ\u001dõ 08Ð~\u0080\u0000N\u001b\u009d|¼¯Çg\u001dt(ÉÏ\u0010uDèÒ\u0010\u0085é¿\u0007-£¦®ú»â\u0010cSá(·âò\u0080ü4^¶ºf\rø\u0018j$U¸[\u001bDx6\"\u009c\u0096¹\u009b\u0085É\u009d}»¦\u001eW[A(xØSÂö ¤GK\u001e\u0004{\u000e\u001f\u001e\u0080ù\u0092#\u0081&ÿnG\u0095D#\u009e}Ç\u0015r×\u000bóÔ\u0092EãÜ\u0010r¢ÈìuÒ\u007fi&âZWÒÝ\u0015\u0010\u0010<ê5¨n\u001fù°Ð\u0098ï\u001fÕñË\u008c(-h\u001boÖÇ£\u0084/,7¡è+Ç\u008aÀê+í\u008dÛ¹T,ÁøÈþm[ì¼øTkÀ\u0019ó\u0001";
int var17 = "¸ç£\u0096\u001civ\u00115¾¾+d\n;i\u0010\u00837eo\u0005ÿ5p\u009eæCôj\u0081¬\u0018\u0010ÄW©áÁV\u0087\u0095\u007fR+\u0086Ð\u0088\u000fé \u0097Ì\u008e¶\u001eößn¦ã\u0011\u0018wÄðìMcfõï+\u0088L`\u008cûÉJsMr\u0018½§hq¶\u0001IÕ\u0097ì\u0097\u000eó:¢\u009eì\u00adGÒ\u0089\u0017PV\u0010î\u001aO\u0011Ëú°B¤ö\u008b\bë\u008bq\u0083\u0010Ë\u009d\u0017ùZHI-}÷\u008czß¡bÎ\u0010åÄ\u009eØqZVÃ\u000b\u009b«\u0083ïüòÈ\u0010°t/þJ~Ê-\u0098PBG%\u0089XÞ\u0010ÿ\u009e{\"\u0092,\u008d\u0093Oïî\u0003à}\r@\u0010T\u0005¡Ó\u0003Ûaº\u0003Ãg×jÇÕ¦\u0010\u008b\u0090B°ë¼*B`÷lyÕÀõ·\u0010¬\u0088k02à8;È6×¶V\u009cãÛ\u0010Í\b\u007f\u0087¦>Ý2\u0084%DäúD\\\u001a DÖ\u0011á\u0019\u00adày¬\u001e¿ÔúWAë\u0017¯Ó\"gÆm¶hh»³¨\u0012ë30ÿÁ\u0010XÐÕ@@ \u0097\b?û[è\u0094\u001fËú\u0081Èµf\u0088P¾ü_è,6\u0093·äÿÃr¶\u0019NÖh \u0011£p3² \u0011\u008c=\u009b \u009a00VíktØÆT\u0099rÏ\u008d\u009b¹èçÁ¶ÍO`\u0092Qú\u009a\u0010§ÄÀW\u009e»Y\u0083.\u0003Z\u0081°ÉM6(\u0005Ú¨]Ä ZgÁ$øù\u0098\u0081¬ë\u001a\u00107ß\u0001]pl 7\u0003Å¶\u008e\u0002ÙA9Ýj\u0002c«\u001b\u0010³\u001b £á¡ÛÊ==ú\u0010çÞ\u0085:\u0010Ï\u0004Üí»\u0091÷Ç·%\u0019ë\u0095V\u0090?\u0010)i³sÆ\nâ\u000e\u0094:\u000e\u0089c©ü\u000f\u0018Zù4Ë¥\u001as~|0æK\u00ad;\nx,Sä÷ÜÌ\u001cu\u0010´\u0083ôn)\u008d:ô\u0098k\u000b²xD\u0007\u001a\u00109O\u000bò\u000e·nF\u0095 h¾Axa\u0006 ±\u001c?p¢\u0013\u0004\t\u0018ø¿Í\u0016#¥1u\u0015MHQ·«ãqâW@+wæN\u0010\u0097£ÉÄôdY½Èlá,Tµ\u0002×\u0018«p½\u008dus(#ZSí\u0097\u000eµ\u0096¦\u0006\u0088u\u009d]V}8\u0010Ùp±I<ÓøjËG¬½ÊCí\u001c\u0010\u0094¯'\\z2j\u009aâ\u0017üØ\u0091óXP(mI\u0080vÚ\u0010B*¹Zã±\u008e«ÊJèaÀ\u001bêNA\u00adU \u001bÄY\u0013áwè¯ñØð\f\fÅ\u0010\u001f{\u0005uÒP1#i\u001fË\u0018UX\u0007ò\u0010X4\u00004W\u009e\u0094\u009eg°I\u0091>\u009a0·\u0010h:WÐÕ¤öÏp×}]\u008báðÙ0Zig\\>AçK\u0091\u0091\u009c\u0014Ic^\nß°ÉBhå\u0087:êpÒ«ýÏ3zÜ*\u0095Ýñc,{\u0013#Ú«*ì\u0001¿\u0010\u0082×\be³\u0088ìfÉìj\u0081\u0095ä\u001c\u0002\u0010qA\u0090¨\u0002\u0007\u0099{\u0010ÖZÒoad¡8`;\u0092u\u001f¯\u00998\u001bR\bú!7WLvè\\$ùTò\u00155ß7E\u008e\u007fg1§.\u0088PÁ\fÇà5|Î À\u0095\u008bíò³ªü%®(È\u0010Õ\u0019Ï~ä¼\tZñÚ+&ðÜ)Ý\u0010RR!Kû\u008fs³J¶fWÒÚOÑ\u0010\u0097 \u009c\u001a±H2%\u0012ü\u0094£\u008fgDø0X\u001f¸-pG¤Òy\u009fuK\u0011¿Ñ4\u0093ZÓ\u0005\u0095pÛiüþ\u001dõ 08Ð~\u0080\u0000N\u001b\u009d|¼¯Çg\u001dt(ÉÏ\u0010uDèÒ\u0010\u0085é¿\u0007-£¦®ú»â\u0010cSá(·âò\u0080ü4^¶ºf\rø\u0018j$U¸[\u001bDx6\"\u009c\u0096¹\u009b\u0085É\u009d}»¦\u001eW[A(xØSÂö ¤GK\u001e\u0004{\u000e\u001f\u001e\u0080ù\u0092#\u0081&ÿnG\u0095D#\u009e}Ç\u0015r×\u000bóÔ\u0092EãÜ\u0010r¢ÈìuÒ\u007fi&âZWÒÝ\u0015\u0010\u0010<ê5¨n\u001fù°Ð\u0098ï\u001fÕñË\u008c(-h\u001boÖÇ£\u0084/,7¡è+Ç\u008aÀê+í\u008dÛ¹T,ÁøÈþm[ì¼øTkÀ\u0019ó\u0001"
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
c = new String[51];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[34];
int var3 = 0;
String var4 = "©v1\u001fr[;\u0093¶Å(\u0088O\u0091Þ¼\u0099õi+Ö\u000eT`\u001b>G,ÿü\u008f\u000eW\n3\u0090XÒê\u0014Ì\u0003_\u0017 \u0087È,\u008fé]\\\u0097s\u009a\u008e)Ê²\u0097¨ºVM\u000f\u009e\u008bÁx\u007fþLà;a²j\u0091\b>Ê\u0093ÀOuÛ(ô5\u0013ß1\f!&lp\u0093³LÅÎñ0Ät_\u0002Ùo©4^}\u009eºy!\u008c\u001fg\rÞñÔXðøwNfVu ØBP JgË%6\u0014v\u001b\u0012®þV\fª¢\u000fT¶Þ\u0098\u0005Ow_\u0006Jcn£½\u0000\u0095Ñ3ûï9°Â§é5Øé-\u009e2\u008dµÝ\u0080ÓÐ}7¶m\u000f\u001dÄ¼\b\u008e\u0019\u0097f³g\u001c\u008eñæ\u000fÐ\u0091\u0086?\u0086-è\u0006<wÁiJ^ÅÙ\u0012\u0084ÕXÖ\u0003G\u0005Ë\u0082\u0003\u0082þ\u001eD°\u0095\u0004\u009a\u0004Ó½\u001f\u0096ïËÞ¢\u000f";
int var5 = "©v1\u001fr[;\u0093¶Å(\u0088O\u0091Þ¼\u0099õi+Ö\u000eT`\u001b>G,ÿü\u008f\u000eW\n3\u0090XÒê\u0014Ì\u0003_\u0017 \u0087È,\u008fé]\\\u0097s\u009a\u008e)Ê²\u0097¨ºVM\u000f\u009e\u008bÁx\u007fþLà;a²j\u0091\b>Ê\u0093ÀOuÛ(ô5\u0013ß1\f!&lp\u0093³LÅÎñ0Ät_\u0002Ùo©4^}\u009eºy!\u008c\u001fg\rÞñÔXðøwNfVu ØBP JgË%6\u0014v\u001b\u0012®þV\fª¢\u000fT¶Þ\u0098\u0005Ow_\u0006Jcn£½\u0000\u0095Ñ3ûï9°Â§é5Øé-\u009e2\u008dµÝ\u0080ÓÐ}7¶m\u000f\u001dÄ¼\b\u008e\u0019\u0097f³g\u001c\u008eñæ\u000fÐ\u0091\u0086?\u0086-è\u0006<wÁiJ^ÅÙ\u0012\u0084ÕXÖ\u0003G\u0005Ë\u0082\u0003\u0082þ\u001eD°\u0095\u0004\u009a\u0004Ó½\u001f\u0096ïËÞ¢\u000f"
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
f = var6;
g = new Integer[34];
y = new jl();
E = new CopyOnWriteArrayList();
r = new Matrix4f();
V = new Matrix4f();
M = new int[4];
w = -1;
X = 1.0F;
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "z¥Ä×£u2ú±Ò´Ñ1hö.";
var5 = "z¥Ä×£u2ú±Ò´Ñ1hö.".length();
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

var15 = "°\n:È5,\f©Ã\u0001}*Ùïâ2h+ÔTÙ^Å\u0091\u000fvuc\u009dó\b\u0086\u0010À-ì¶×S^Ð¨H]Ç+VÒl";
var17 = "°\n:È5,\f©Ã\u0001}*Ùïâ2h+ÔTÙ^Å\u0091\u000fvuc\u009dó\b\u0086\u0010À-ì¶×S^Ð¨H]Ç+VÒl".length();
var14 = ' ';
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void u(_g[] var0) {
v = var0;
}

public static _g[] n() {
return v;
}

private static Throwable a(Throwable var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25009;
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
throw new RuntimeException("su/catlean/jl", var10);
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
throw new RuntimeException("su/catlean/jl" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 20360;
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
throw new RuntimeException("su/catlean/jl", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/jl" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
