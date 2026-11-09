package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import net.minecraft.class_276;
import net.minecraft.class_290;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryUtil;

public final class g7 {
@NotNull
private final VertexFormat O;
private final boolean m;
private ByteBuffer b;
private final int x;
private ByteBuffer M;
private long j;
private long A;
private final ByteBuffer T;
private long k;
@NotNull
private final int[] L;
private int v;
private int w;
private int U;
private final boolean B;
private final boolean h;
@NotNull
private final Vector3f d;
private static String[] t;
private static final long a = yz.a(4593026781476974556L, 1292558664199173954L, MethodHandles.lookup().lookupClass()).a(178441875227259L);
private static final String[] c;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] i;
private static final Map l;
private static final long[] n;
private static final Long[] o;
private static final Map p;

public g7(int a, long a, @NotNull VertexFormat format, int objectsCount, boolean lines) {
long var7 = ((long)axx << 32 | ax << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(format, a<"s">(25389, 8191206824388698949L ^ var7));
_g[] var10000 = vm.a<"Å">(-8131811715319373529L, var7);
super();
this.O = format;
this.m = lines;
_g[] var9 = var10000;

int var10001;
label22: {
label21: {
try {
this.b = BufferUtils.createByteBuffer(this.O.getVertexSize() * objectsCount * 4);
var11 = this;
var10001 = this.m;
if (var9 != null) {
break label22;
}

if (this.m) {
break label21;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -8096665713163997668L, var7);
}

var10001 = b<"r">(15395, 6242128073261756018L ^ var7);
break label22;
}

var10001 = 2;
}

var11.x = var10001;
this.M = BufferUtils.createByteBuffer(objectsCount * this.x * 4);
this.j = MemoryUtil.memAddress0(this.b);
this.A = MemoryUtil.memAddress0(this.M);
this.T = MemoryUtil.memAlloc(b<"r">(11104, 6985394795481708848L ^ var7));
this.k = this.j;
this.L = new int[4];
this.B = Intrinsics.areEqual(this.O, class_290.field_1592);
this.h = Intrinsics.areEqual(this.O, class_290.field_1585);
this.d = new Vector3f();
}

public g7(long var1, VertexFormat var3, int var4, boolean var5, int var6, DefaultConstructorMarker var7) {
var1 = a ^ var1;
int var8 = (int)((var1 ^ 74991063436375L) >>> 32);
long var9 = (var1 ^ 74991063436375L) << 32 >>> 32;
if ((var6 & 1) != 0) {
VertexFormat var10000 = class_290.field_1592;
Intrinsics.checkNotNullExpressionValue(class_290.field_1592, a<"s">(27497, 538229400808993832L ^ var1));
var3 = var10000;
}

if ((var6 & 2) != 0) {
var4 = 1;
}

if ((var6 & 4) != 0) {
var5 = false;
}

this(var8, var9, var3, var4, var5);
}

public final boolean A() {
return this.m;
}

@NotNull
public final g7 u(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 44841182356248L;
return this.G(-1.0F, var3, -1.0F, 0.0F).G(-1.0F, var3, 1.0F, 0.0F).G(1.0F, var3, 1.0F, 0.0F).G(1.0F, var3, -1.0F, 0.0F);
}

@NotNull
public final g7 T(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 114790030281856L;
long var8 = var4 ^ 79030676370618L;
long var10 = var4 ^ 12262281376340L;
long var12 = var4 ^ 99133567637359L;
float var14 = zf.F(var6).method_22683().method_4486();
float var15 = zf.F(var6).method_22683().method_4502();
g7 var10000 = this.G(0.0F, var8, var15, 0.0F).j(0.0F, var12, 0.0F);
Color var10001 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"s">(10574, 2491310894055077507L ^ var4));
var10000 = var10000.n(var10001, var10).G(0.0F, var8, 0.0F, 0.0F).j(0.0F, var12, 1.0F);
var10001 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"s">(22233, 4046159700459964677L ^ var4));
var10000 = var10000.n(var10001, var10).G(var14, var8, 0.0F, 0.0F).j(1.0F, var12, 1.0F);
var10001 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"s">(22233, 4046159700459964677L ^ var4));
var10000 = var10000.n(var10001, var10).G(var14, var8, var15, 0.0F).j(1.0F, var12, 0.0F);
var10001 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"s">(22233, 4046159700459964677L ^ var4));
return var10000.n(var10001, var10);
}

@NotNull
public final g7 o(@NotNull Matrix4f matrix, long a, float x, float y, float z, float u, float v, @NotNull Color color) {
ax = a ^ ax;
long var10 = ax ^ 115016219901394L;
Intrinsics.checkNotNullParameter(matrix, a<"s">(17486, 6429209154431766951L ^ ax));
Intrinsics.checkNotNullParameter(color, a<"s">(30711, 213107434892747265L ^ ax));
matrix.transformPosition(xx, y, z, this.d);
this.c(this.d.x, this.d.y, this.d.z, u, vx, color, var10);
return this;
}

@NotNull
public final g7 c(float x, float y, float z, float u, float v, @NotNull Color color, long a) {
ax = a ^ ax;
long var9 = ax ^ 59668531466954L;
long var11 = ax ^ 95994475545893L;
Intrinsics.checkNotNullParameter(color, a<"s">(31777, 3881353189118592885L ^ ax));
this.F(var11, b<"r">(24619, 40750348503484747L ^ ax));
this.T.putFloat(0, xx);
this.T.putFloat(4, y);
this.T.putFloat(b<"r">(18967, 3208267836183946080L ^ ax), z);
this.T.putFloat(b<"r">(18579, 6590412752752157170L ^ ax), u);
this.T.putFloat(b<"r">(27672, 7599707658548348266L ^ ax), vx);
this.T.put(b<"r">(27524, 7971894069183841008L ^ ax), (byte)color.getRed());
this.T.put(b<"r">(23340, 6910231750176387666L ^ ax), (byte)color.getGreen());
this.T.put(b<"r">(6555, 2898681032860889323L ^ ax), (byte)color.getBlue());
this.T
.put(
b<"r">(5694, 5079975028279836509L ^ ax), (byte)RangesKt.coerceIn((int)(color.getAlpha() * jl.y.t()), new IntRange(0, b<"r">(2595, 6636844741374010177L ^ ax)))
);
MemoryUtil.memCopy(MemoryUtil.memAddress(this.T), this.k, c<"u">(29469, 893193862364032932L ^ ax));
this.k = this.k + b<"r">(11104, 6985454729168863771L ^ ax);
this.a(var9);
return this;
}

@NotNull
public final g7 G(float x, long a, float y, float z) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/g7.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 123369033421211
// 0b: lxor
// 0c: lstore 6
// 0e: dup2
// 0f: ldc2_w 18961381656180
// 12: lxor
// 13: lstore 8
// 15: pop2
// 16: aload 0
// 17: lload 8
// 19: sipush 17988
// 1c: ldc2_w 5725695263110311017
// 1f: lload 2
// 20: lxor
// 21: invokedynamic r (IJ)I bsm=su/catlean/g7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokespecial su/catlean/g7.F (JI)V
// 29: aload 0
// 2a: getfield su/catlean/g7.k J
// 2d: fload 1
// 2e: invokestatic org/lwjgl/system/MemoryUtil.memPutFloat (JF)V
// 31: ldc2_w 8600766681399400797
// 34: lload 2
// 35: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: aload 0
// 3b: getfield su/catlean/g7.k J
// 3e: bipush 4
// 3f: i2l
// 40: ladd
// 41: fload 4
// 43: invokestatic org/lwjgl/system/MemoryUtil.memPutFloat (JF)V
// 46: astore 10
// 48: aload 0
// 49: getfield su/catlean/g7.k J
// 4c: sipush 11914
// 4f: ldc2_w 7516056037437949092
// 52: lload 2
// 53: lxor
// 54: invokedynamic r (IJ)I bsm=su/catlean/g7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59: i2l
// 5a: ladd
// 5b: fload 5
// 5d: invokestatic org/lwjgl/system/MemoryUtil.memPutFloat (JF)V
// 60: aload 0
// 61: aload 0
// 62: getfield su/catlean/g7.k J
// 65: sipush 18579
// 68: ldc2_w 6590348501803704995
// 6b: lload 2
// 6c: lxor
// 6d: invokedynamic r (IJ)I bsm=su/catlean/g7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: i2l
// 73: ladd
// 74: putfield su/catlean/g7.k J
// 77: aload 0
// 78: aload 10
// 7a: ifnonnull a5
// 7d: getfield su/catlean/g7.B Z
// 80: ifeq a4
// 83: goto 90
// 86: ldc2_w 8635883735181596262
// 89: lload 2
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: aload 0
// 91: lload 6
// 93: invokespecial su/catlean/g7.a (J)Lsu/catlean/g7;
// 96: pop
// 97: goto a4
// 9a: ldc2_w 8635883735181596262
// 9d: lload 2
// 9e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a3: athrow
// a4: aload 0
// a5: areturn
}

public static g7 j(g7 var0, float var1, float var2, float var3, int var4, long var5, Object var7) {
var5 = a ^ var5;
long var8 = var5 ^ 44302668378849L;
if ((var4 & 4) != 0) {
var3 = 0.0F;
}

return var0.G(var1, var8, var2, var3);
}

@NotNull
public final g7 O(@NotNull Matrix4f matrix, float x, long a, float y, float z) {
ax = a ^ ax;
long var7 = ax ^ 1169490321634L;
Intrinsics.checkNotNullParameter(matrix, a<"s">(27345, 5475863373937238336L ^ ax));
matrix.transformPosition(xx, y, z, this.d);
return this.G(this.d.x, var7, this.d.y, this.d.z);
}

@NotNull
public final g7 b(long a, @NotNull Matrix3x2f matrix, float x, float y, float z) {
ax = a ^ ax;
long var7 = ax ^ 37754479119340L;
Intrinsics.checkNotNullParameter(matrix, a<"s">(27345, 5475831788163484238L ^ ax));
this.f(matrix).transformPosition(xx, y, z, this.d);
return this.G(this.d.x, var7, this.d.y, this.d.z);
}

@NotNull
public final g7 j(float u, long a, float v) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/g7.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 120935560016462
// 0b: lxor
// 0c: lstore 5
// 0e: dup2
// 0f: ldc2_w 14256541705633
// 12: lxor
// 13: lstore 7
// 15: pop2
// 16: aload 0
// 17: lload 7
// 19: sipush 18967
// 1c: ldc2_w 3208345382497616868
// 1f: lload 2
// 20: lxor
// 21: invokedynamic r (IJ)I bsm=su/catlean/g7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokespecial su/catlean/g7.F (JI)V
// 29: ldc2_w -3131951777262191992
// 2c: lload 2
// 2d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: aload 0
// 33: getfield su/catlean/g7.k J
// 36: fload 1
// 37: invokestatic org/lwjgl/system/MemoryUtil.memPutFloat (JF)V
// 3a: aload 0
// 3b: getfield su/catlean/g7.k J
// 3e: bipush 4
// 3f: i2l
// 40: ladd
// 41: fload 4
// 43: invokestatic org/lwjgl/system/MemoryUtil.memPutFloat (JF)V
// 46: aload 0
// 47: aload 0
// 48: getfield su/catlean/g7.k J
// 4b: sipush 18967
// 4e: ldc2_w 3208345382497616868
// 51: lload 2
// 52: lxor
// 53: invokedynamic r (IJ)I bsm=su/catlean/g7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58: i2l
// 59: ladd
// 5a: putfield su/catlean/g7.k J
// 5d: astore 9
// 5f: aload 0
// 60: aload 9
// 62: ifnonnull 8d
// 65: getfield su/catlean/g7.h Z
// 68: ifeq 8c
// 6b: goto 78
// 6e: ldc2_w -3166647050475194957
// 71: lload 2
// 72: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77: athrow
// 78: aload 0
// 79: lload 5
// 7b: invokespecial su/catlean/g7.a (J)Lsu/catlean/g7;
// 7e: pop
// 7f: goto 8c
// 82: ldc2_w -3166647050475194957
// 85: lload 2
// 86: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b: athrow
// 8c: aload 0
// 8d: areturn
}

@NotNull
public final g7 n(@NotNull Color c, long a) {
ax = a ^ ax;
long var10001 = ax ^ 44394268905899L;
int var4 = (int)((ax ^ 44394268905899L) >>> 32);
int var5 = (int)((ax ^ 44394268905899L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(cx, "c");
return this.b(cx.getRed(), cx.getGreen(), cx.getBlue(), var4, (char)var5, cx.getAlpha(), var6);
}

@NotNull
public final g7 Y(float r, short a, float g, float b, int a, float a, int a) {
long var8 = ((long)axxxx << 48 | (long)ax << 32 >>> 16 | (long)axxx << 48 >>> 48) ^ a;
long var10001 = var8 ^ 88744123566574L;
int var10 = (int)((var8 ^ 88744123566574L) >>> 32);
int var11 = (int)((var8 ^ 88744123566574L) << 32 >>> 48);
int var12 = (int)(var10001 << 48 >>> 48);
return this.b(
(int)(r * b<"r">(6439, 9152859720855514540L ^ var8)),
(int)(gx * b<"r">(6439, 9152859720855514540L ^ var8)),
(int)(bx * b<"r">(6439, 9152859720855514540L ^ var8)),
var10,
(char)var11,
(int)(axx * b<"r">(6439, 9152859720855514540L ^ var8)),
var12
);
}

@NotNull
public final g7 b(int r, int g, int b, int a, char a, int a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 4
// 02: i2l
// 03: bipush 32
// 05: lshl
// 06: iload 5
// 08: i2l
// 09: bipush 48
// 0b: lshl
// 0c: bipush 32
// 0e: lushr
// 0f: lor
// 10: iload 7
// 12: i2l
// 13: bipush 48
// 15: lshl
// 16: bipush 48
// 18: lushr
// 19: lor
// 1a: getstatic su/catlean/g7.a J
// 1d: lxor
// 1e: lstore 8
// 20: lload 8
// 22: dup2
// 23: ldc2_w 48434679502266
// 26: lxor
// 27: lstore 10
// 29: dup2
// 2a: ldc2_w 84695930831445
// 2d: lxor
// 2e: lstore 12
// 30: pop2
// 31: aload 0
// 32: lload 12
// 34: bipush 4
// 35: invokespecial su/catlean/g7.F (JI)V
// 38: aload 0
// 39: getfield su/catlean/g7.k J
// 3c: iload 1
// 3d: i2b
// 3e: invokestatic org/lwjgl/system/MemoryUtil.memPutByte (JB)V
// 41: ldc2_w 8321899510106660220
// 44: lload 8
// 46: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: aload 0
// 4c: getfield su/catlean/g7.k J
// 4f: lconst_1
// 50: ladd
// 51: iload 2
// 52: i2b
// 53: invokestatic org/lwjgl/system/MemoryUtil.memPutByte (JB)V
// 56: aload 0
// 57: getfield su/catlean/g7.k J
// 5a: bipush 2
// 5b: i2l
// 5c: ladd
// 5d: iload 3
// 5e: i2b
// 5f: invokestatic org/lwjgl/system/MemoryUtil.memPutByte (JB)V
// 62: astore 14
// 64: aload 0
// 65: getfield su/catlean/g7.k J
// 68: bipush 3
// 69: i2l
// 6a: ladd
// 6b: iload 6
// 6d: i2f
// 6e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 71: invokevirtual su/catlean/jl.t ()F
// 74: fmul
// 75: f2i
// 76: sipush 6439
// 79: ldc2_w 9152745203176109862
// 7c: lload 8
// 7e: lxor
// 7f: invokedynamic r (IJ)I bsm=su/catlean/g7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: invokestatic kotlin/ranges/RangesKt.coerceAtMost (II)I
// 87: i2b
// 88: invokestatic org/lwjgl/system/MemoryUtil.memPutByte (JB)V
// 8b: aload 0
// 8c: aload 0
// 8d: getfield su/catlean/g7.k J
// 90: bipush 4
// 91: i2l
// 92: ladd
// 93: putfield su/catlean/g7.k J
// 96: aload 0
// 97: aload 14
// 99: ifnonnull c6
// 9c: getfield su/catlean/g7.B Z
// 9f: ifne c5
// a2: goto b0
// a5: ldc2_w 8356867511226372679
// a8: lload 8
// aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af: athrow
// b0: aload 0
// b1: lload 10
// b3: invokespecial su/catlean/g7.a (J)Lsu/catlean/g7;
// b6: pop
// b7: goto c5
// ba: ldc2_w 8356867511226372679
// bd: lload 8
// bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c4: athrow
// c5: aload 0
// c6: areturn
}

private final void F(long var1, int var3) {
var1 = a ^ var1;
int var4 = (int)(this.k - this.j);
if (var4 + var3 > this.b.capacity()) {
ByteBuffer var5 = this.b;
int var6 = Math.max(var5.capacity() * 2, var4 + var3);
ByteBuffer var7 = BufferUtils.createByteBuffer(var6);
MemoryUtil.memCopy(MemoryUtil.memAddress0(var5), MemoryUtil.memAddress0(var7), var4);
this.b = var7;
this.j = MemoryUtil.memAddress0(this.b);
this.k = this.j + var4;
}
}

private final void w(long var1, int var3) {
var1 = a ^ var1;
int var4 = this.U * 4;
if (var4 + var3 > this.M.capacity()) {
ByteBuffer var5 = this.M;
int var6 = Math.max(var5.capacity() * 2, var4 + var3);
ByteBuffer var7 = BufferUtils.createByteBuffer(var6);
MemoryUtil.memCopy(MemoryUtil.memAddress0(var5), MemoryUtil.memAddress0(var7), var4);
this.M = var7;
this.A = MemoryUtil.memAddress0(this.M);
}
}

private final g7 a(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/g7.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 112523815067422
// 00b: lxor
// 00c: lstore 3
// 00d: pop2
// 00e: ldc2_w -5358360993969316958
// 011: lload 1
// 012: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 017: aload 0
// 018: getfield su/catlean/g7.w I
// 01b: istore 7
// 01d: astore 5
// 01f: aload 0
// 020: iload 7
// 022: bipush 1
// 023: iadd
// 024: putfield su/catlean/g7.w I
// 027: iload 7
// 029: istore 6
// 02b: aload 0
// 02c: getfield su/catlean/g7.L [I
// 02f: aload 0
// 030: getfield su/catlean/g7.v I
// 033: iload 6
// 035: iastore
// 036: aload 0
// 037: getfield su/catlean/g7.v I
// 03a: istore 7
// 03c: aload 0
// 03d: iload 7
// 03f: bipush 1
// 040: iadd
// 041: putfield su/catlean/g7.v I
// 044: aload 0
// 045: getfield su/catlean/g7.v I
// 048: aload 0
// 049: getfield su/catlean/g7.m Z
// 04c: aload 5
// 04e: ifnonnull 062
// 051: ifeq 065
// 054: goto 061
// 057: ldc2_w -5393172523206093671
// 05a: lload 1
// 05b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: athrow
// 061: bipush 2
// 062: goto 066
// 065: bipush 4
// 066: if_icmpne 16f
// 069: aload 0
// 06a: getfield su/catlean/g7.m Z
// 06d: aload 5
// 06f: ifnonnull 090
// 072: goto 07f
// 075: ldc2_w -5393172523206093671
// 078: lload 1
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: ifeq 093
// 082: goto 08f
// 085: ldc2_w -5393172523206093671
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: bipush 2
// 090: goto 0a0
// 093: sipush 7243
// 096: ldc2_w 2233316004365677725
// 099: lload 1
// 09a: lxor
// 09b: invokedynamic r (IJ)I bsm=su/catlean/g7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: istore 7
// 0a2: aload 0
// 0a3: iload 7
// 0a5: bipush 4
// 0a6: imul
// 0a7: lload 3
// 0a8: dup2_x1
// 0a9: pop2
// 0aa: invokespecial su/catlean/g7.w (JI)V
// 0ad: aload 0
// 0ae: getfield su/catlean/g7.A J
// 0b1: aload 0
// 0b2: getfield su/catlean/g7.U I
// 0b5: i2l
// 0b6: bipush 4
// 0b7: i2l
// 0b8: lmul
// 0b9: ladd
// 0ba: lstore 8
// 0bc: lload 8
// 0be: aload 0
// 0bf: getfield su/catlean/g7.L [I
// 0c2: bipush 0
// 0c3: iaload
// 0c4: invokestatic org/lwjgl/system/MemoryUtil.memPutInt (JI)V
// 0c7: lload 8
// 0c9: bipush 4
// 0ca: i2l
// 0cb: ladd
// 0cc: aload 0
// 0cd: getfield su/catlean/g7.L [I
// 0d0: bipush 1
// 0d1: iaload
// 0d2: invokestatic org/lwjgl/system/MemoryUtil.memPutInt (JI)V
// 0d5: aload 0
// 0d6: aload 5
// 0d8: ifnonnull 16b
// 0db: getfield su/catlean/g7.m Z
// 0de: ifne 15f
// 0e1: goto 0ee
// 0e4: ldc2_w -5393172523206093671
// 0e7: lload 1
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: lload 8
// 0f0: sipush 6172
// 0f3: ldc2_w 2176156330914694413
// 0f6: lload 1
// 0f7: lxor
// 0f8: invokedynamic u (IJ)J bsm=su/catlean/g7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: ladd
// 0fe: aload 0
// 0ff: getfield su/catlean/g7.L [I
// 102: bipush 2
// 103: iaload
// 104: invokestatic org/lwjgl/system/MemoryUtil.memPutInt (JI)V
// 107: lload 8
// 109: sipush 26885
// 10c: ldc2_w 9205750073513620502
// 10f: lload 1
// 110: lxor
// 111: invokedynamic u (IJ)J bsm=su/catlean/g7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: ladd
// 117: aload 0
// 118: getfield su/catlean/g7.L [I
// 11b: bipush 2
// 11c: iaload
// 11d: invokestatic org/lwjgl/system/MemoryUtil.memPutInt (JI)V
// 120: lload 8
// 122: sipush 26886
// 125: ldc2_w 2295280013716796436
// 128: lload 1
// 129: lxor
// 12a: invokedynamic u (IJ)J bsm=su/catlean/g7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: ladd
// 130: aload 0
// 131: getfield su/catlean/g7.L [I
// 134: bipush 3
// 135: iaload
// 136: invokestatic org/lwjgl/system/MemoryUtil.memPutInt (JI)V
// 139: lload 8
// 13b: sipush 17638
// 13e: ldc2_w 3789214085429729782
// 141: lload 1
// 142: lxor
// 143: invokedynamic u (IJ)J bsm=su/catlean/g7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: ladd
// 149: aload 0
// 14a: getfield su/catlean/g7.L [I
// 14d: bipush 0
// 14e: iaload
// 14f: invokestatic org/lwjgl/system/MemoryUtil.memPutInt (JI)V
// 152: goto 15f
// 155: ldc2_w -5393172523206093671
// 158: lload 1
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: aload 0
// 160: aload 0
// 161: getfield su/catlean/g7.U I
// 164: iload 7
// 166: iadd
// 167: putfield su/catlean/g7.U I
// 16a: aload 0
// 16b: bipush 0
// 16c: putfield su/catlean/g7.v I
// 16f: aload 0
// 170: areturn
}

@NotNull
public final Matrix4f f(@NotNull Matrix3x2f m) {
Intrinsics.checkNotNullParameter(mx, "m");
Matrix4f var2 = new Matrix4f();
boolean var4 = false;
var2.m00(mx.m00());
var2.m01(mx.m01());
var2.m10(mx.m10());
var2.m11(mx.m11());
var2.m30(mx.m20());
var2.m31(mx.m21());
return var2;
}

public final void e(
long a,
@NotNull RenderPipeline pipeline,
@NotNull class_276 fb,
@Nullable GpuBufferSlice ubo,
@Nullable Matrix4f matrix3D,
@Nullable Matrix3x2f matrix2D,
@NotNull Map samplers
) {
ax = a ^ ax;
long var10001 = ax ^ 102227748173265L;
int var9 = (int)((ax ^ 102227748173265L) >>> 48);
int var10 = (int)((ax ^ 102227748173265L) << 16 >>> 32);
int var11 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(pipeline, a<"s">(18285, 450809480711807249L ^ ax));
Intrinsics.checkNotNullParameter(fb, a<"s">(1490, 6274257710473470889L ^ ax));
Intrinsics.checkNotNullParameter(samplers, a<"s">(21503, 4760407712686650752L ^ ax));
this.H((char)var9, pipeline, fb.method_71639(), fb.method_71640(), ubo, var10, matrix3D, matrix2D, (short)var11, samplers);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static void R(
long var0, g7 var2, RenderPipeline var3, class_276 var4, GpuBufferSlice var5, Matrix4f var6, Matrix3x2f var7, Map var8, int var9, Object var10
) {
var0 = a ^ var0;
long var11 = var0 ^ 55874779191418L;
long var13 = var0 ^ 44581331729974L;
_g[] var15 = vm.a<"Å">(4933740069263288953L, var0);

int var10000;
label89: {
label88: {
try {
var10000 = var9 & 2;
if (var15 != null) {
break label89;
}

if (var10000 == 0) {
break label88;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, 4971119982676911426L, var0);
}

class_276 var23 = zf.F(var11).method_1522();
Intrinsics.checkNotNullExpressionValue(var23, a<"s">(15328, 6565611771207168203L ^ var0));
var4 = var23;
}

var10000 = var9 & 4;
}

_g[] var10001;
label80: {
label79: {
label78: {
try {
var10001 = var15;
if (var0 < 0L) {
break label80;
}

if (var15 != null) {
break label79;
}

if (var10000 == 0) {
break label78;
}
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, 4971119982676911426L, var0);
}

var5 = null;
}

var10000 = var9 & b<"r">(18967, 3208371769906270997L ^ var0);
}

try {
var10001 = var15;
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 4971119982676911426L, var0);
}
}

label67: {
label66: {
label65: {
try {
if (var0 <= 0L) {
break label67;
}

if (var10001 != null) {
break label66;
}

if (var10000 == 0) {
break label65;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, 4971119982676911426L, var0);
}

var6 = null;
}

var10000 = var9 & b<"r">(27328, 9179849206173610952L ^ var0);
}

try {
var10001 = var15;
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 4971119982676911426L, var0);
}
}

label54: {
label53: {
try {
if (var10001 != null) {
break label54;
}

if (var10000 == 0) {
break label53;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 4971119982676911426L, var0);
}

var7 = null;
}

var10000 = var9 & b<"r">(11285, 7403776598002103574L ^ var0);
}

if (var10000 != 0) {
var8 = MapsKt.emptyMap();
}

var2.e(var13, var3, var4, var5, var6, var7, var8);
}

public final void H(
char a,
@NotNull RenderPipeline pipeline,
@Nullable GpuTextureView color,
@Nullable GpuTextureView depth,
@Nullable GpuBufferSlice ubo,
int a,
@Nullable Matrix4f matrix3D,
@Nullable Matrix3x2f matrix2D,
short a,
@NotNull Map samplers
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 6
// 007: i2l
// 008: bipush 32
// 00a: lshl
// 00b: bipush 16
// 00d: lushr
// 00e: lor
// 00f: iload 9
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/g7.a J
// 01c: lxor
// 01d: lstore 11
// 01f: lload 11
// 021: dup2
// 022: ldc2_w 77667952022429
// 025: lxor
// 026: lstore 13
// 028: dup2
// 029: ldc2_w 109559281345170
// 02c: lxor
// 02d: dup2
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 15
// 034: dup2
// 035: bipush 32
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 16
// 03e: dup2
// 03f: bipush 48
// 041: lshl
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 17
// 048: pop2
// 049: pop2
// 04a: ldc2_w 1125721793817076126
// 04d: lload 11
// 04f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: aload 2
// 055: sipush 15674
// 058: ldc2_w 2028098752574750205
// 05b: lload 11
// 05d: lxor
// 05e: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 066: aload 10
// 068: sipush 15111
// 06b: ldc2_w 6401905459474004946
// 06e: lload 11
// 070: lxor
// 071: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 079: astore 18
// 07b: aload 0
// 07c: aload 18
// 07e: ifnonnull 0a2
// 081: getfield su/catlean/g7.w I
// 084: ifne 0a1
// 087: goto 095
// 08a: ldc2_w 1088608024796393125
// 08d: lload 11
// 08f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: athrow
// 095: return
// 096: ldc2_w 1088608024796393125
// 099: lload 11
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: aload 0
// 0a2: getfield su/catlean/g7.O Lcom/mojang/blaze3d/vertex/VertexFormat;
// 0a5: aload 0
// 0a6: getfield su/catlean/g7.M Ljava/nio/ByteBuffer;
// 0a9: invokevirtual com/mojang/blaze3d/vertex/VertexFormat.uploadImmediateIndexBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/GpuBuffer;
// 0ac: dup
// 0ad: sipush 26999
// 0b0: ldc2_w 7435285835200211364
// 0b3: lload 11
// 0b5: lxor
// 0b6: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0be: astore 19
// 0c0: aload 0
// 0c1: getfield su/catlean/g7.O Lcom/mojang/blaze3d/vertex/VertexFormat;
// 0c4: aload 0
// 0c5: getfield su/catlean/g7.b Ljava/nio/ByteBuffer;
// 0c8: invokevirtual com/mojang/blaze3d/vertex/VertexFormat.uploadImmediateVertexBuffer (Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/buffers/GpuBuffer;
// 0cb: dup
// 0cc: sipush 1849
// 0cf: ldc2_w 3441933284262660086
// 0d2: lload 11
// 0d4: lxor
// 0d5: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0dd: astore 20
// 0df: aload 7
// 0e1: aload 18
// 0e3: ifnonnull 128
// 0e6: ifnull 11e
// 0e9: goto 0f7
// 0ec: ldc2_w 1088608024796393125
// 0ef: lload 11
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: aload 8
// 0f9: ifnonnull 11e
// 0fc: goto 10a
// 0ff: ldc2_w 1088608024796393125
// 102: lload 11
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 10d: invokevirtual su/catlean/zi.s ()Lorg/joml/Matrix4f;
// 110: goto 149
// 113: ldc2_w 1088608024796393125
// 116: lload 11
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: new org/joml/Matrix4f
// 121: dup
// 122: invokespecial org/joml/Matrix4f.<init> ()V
// 125: invokevirtual org/joml/Matrix4f.identity ()Lorg/joml/Matrix4f;
// 128: fconst_0
// 129: lload 13
// 12b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 12e: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 131: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 134: i2f
// 135: lload 13
// 137: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 13a: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 13d: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 140: i2f
// 141: fconst_0
// 142: ldc -100.0
// 144: ldc 100.0
// 146: invokevirtual org/joml/Matrix4f.setOrtho (FFFFFF)Lorg/joml/Matrix4f;
// 149: astore 21
// 14b: getstatic su/catlean/wt.N Lsu/catlean/wt;
// 14e: invokevirtual su/catlean/wt.z ()Lnet/minecraft/class_11280;
// 151: aload 21
// 153: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 156: aload 21
// 158: aload 18
// 15a: iload 9
// 15c: ifle 187
// 15f: ifnonnull 185
// 162: aload 7
// 164: dup
// 165: ifnonnull 1ba
// 168: goto 176
// 16b: ldc2_w 1088608024796393125
// 16e: lload 11
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: pop
// 177: goto 185
// 17a: ldc2_w 1088608024796393125
// 17d: lload 11
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: aload 18
// 187: ifnonnull 1b9
// 18a: aload 8
// 18c: dup
// 18d: ifnull 1b8
// 190: goto 19e
// 193: ldc2_w 1088608024796393125
// 196: lload 11
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: astore 25
// 1a0: astore 35
// 1a2: astore 34
// 1a4: bipush 0
// 1a5: istore 26
// 1a7: aload 0
// 1a8: aload 25
// 1aa: invokevirtual su/catlean/g7.f (Lorg/joml/Matrix3x2f;)Lorg/joml/Matrix4f;
// 1ad: astore 36
// 1af: aload 34
// 1b1: aload 35
// 1b3: aload 36
// 1b5: goto 1ba
// 1b8: pop
// 1b9: aconst_null
// 1ba: astore 37
// 1bc: astore 38
// 1be: new su/catlean/zd
// 1c1: dup
// 1c2: aload 38
// 1c4: iload 15
// 1c6: iload 16
// 1c8: iload 17
// 1ca: aload 37
// 1cc: invokespecial su/catlean/zd.<init> (Lorg/joml/Matrix4f;IIILorg/joml/Matrix4f;)V
// 1cf: checkcast net/minecraft/class_11280$class_11281
// 1d2: invokevirtual net/minecraft/class_11280.method_71102 (Lnet/minecraft/class_11280$class_11281;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
// 1d5: astore 23
// 1d7: aload 23
// 1d9: sipush 27141
// 1dc: ldc2_w 2102249982883900114
// 1df: lload 11
// 1e1: lxor
// 1e2: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ea: aload 23
// 1ec: astore 22
// 1ee: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
// 1f1: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
// 1f6: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/g7.U ()Ljava/lang/String;, ()Ljava/lang/String; ]
// 1fb: aload 3
// 1fc: dup
// 1fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 200: invokestatic java/util/OptionalInt.empty ()Ljava/util/OptionalInt;
// 203: aload 4
// 205: invokestatic java/util/OptionalDouble.empty ()Ljava/util/OptionalDouble;
// 208: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.createRenderPass (Ljava/util/function/Supplier;Lcom/mojang/blaze3d/textures/GpuTextureView;Ljava/util/OptionalInt;Lcom/mojang/blaze3d/textures/GpuTextureView;Ljava/util/OptionalDouble;)Lcom/mojang/blaze3d/systems/RenderPass; 6
// 20d: dup
// 20e: sipush 7516
// 211: ldc2_w 7993101263913213337
// 214: lload 11
// 216: lxor
// 217: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 21f: astore 23
// 221: getstatic su/catlean/a8.k Lsu/catlean/a8;
// 224: invokevirtual su/catlean/a8.c ()Lsu/catlean/o7;
// 227: astore 24
// 229: aload 18
// 22b: ifnonnull 26a
// 22e: aload 24
// 230: dup
// 231: ifnull 269
// 234: goto 242
// 237: ldc2_w 1088608024796393125
// 23a: lload 11
// 23c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 241: athrow
// 242: astore 26
// 244: bipush 0
// 245: istore 27
// 247: aload 23
// 249: aload 26
// 24b: invokevirtual su/catlean/o7.R ()F
// 24e: f2i
// 24f: aload 26
// 251: invokevirtual su/catlean/o7.w ()F
// 254: f2i
// 255: aload 26
// 257: invokevirtual su/catlean/o7.t ()F
// 25a: f2i
// 25b: aload 26
// 25d: invokevirtual su/catlean/o7.O ()F
// 260: f2i
// 261: invokeinterface com/mojang/blaze3d/systems/RenderPass.enableScissor (IIII)V 5
// 266: goto 26b
// 269: pop
// 26a: nop
// 26b: aload 23
// 26d: checkcast su/catlean/mixins/accessors/RenderPassAccessor
// 270: aload 23
// 272: checkcast su/catlean/mixins/accessors/RenderPassAccessor
// 275: invokeinterface su/catlean/mixins/accessors/RenderPassAccessor.getEncoder ()Lnet/minecraft/class_10860; 1
// 27a: astore 26
// 27c: aload 26
// 27e: sipush 9113
// 281: ldc2_w 3802296795279680346
// 284: lload 11
// 286: lxor
// 287: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 28f: aload 26
// 291: checkcast su/catlean/mixins/accessors/GlCommandEncoderAccessor
// 294: invokeinterface su/catlean/mixins/accessors/GlCommandEncoderAccessor.getBackendCatlean ()Lnet/minecraft/class_10865; 1
// 299: astore 25
// 29b: aload 25
// 29d: sipush 2507
// 2a0: ldc2_w 139804631261890825
// 2a3: lload 11
// 2a5: lxor
// 2a6: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 2ae: aload 25
// 2b0: checkcast su/catlean/mixins/accessors/GlDeviceAccessor
// 2b3: aload 2
// 2b4: invokeinterface su/catlean/mixins/accessors/GlDeviceAccessor.compilePipelineCachedCatlean (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)Lnet/minecraft/class_10867; 2
// 2b9: invokeinterface su/catlean/mixins/accessors/RenderPassAccessor.setPipeline (Lnet/minecraft/class_10867;)V 2
// 2be: aload 23
// 2c0: sipush 30756
// 2c3: ldc2_w 3215087383699044576
// 2c6: lload 11
// 2c8: lxor
// 2c9: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ce: aload 22
// 2d0: invokeinterface com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V 3
// 2d5: aload 18
// 2d7: ifnonnull 30e
// 2da: aload 5
// 2dc: dup
// 2dd: ifnull 30d
// 2e0: goto 2ee
// 2e3: ldc2_w 1088608024796393125
// 2e6: lload 11
// 2e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: athrow
// 2ee: astore 26
// 2f0: bipush 0
// 2f1: istore 27
// 2f3: aload 23
// 2f5: sipush 31227
// 2f8: ldc2_w 9042487628610058547
// 2fb: lload 11
// 2fd: lxor
// 2fe: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 303: aload 26
// 305: invokeinterface com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V 3
// 30a: goto 30f
// 30d: pop
// 30e: nop
// 30f: invokestatic com/mojang/blaze3d/systems/RenderSystem.getSamplerCache ()Lnet/minecraft/class_12136;
// 312: getstatic com/mojang/blaze3d/textures/FilterMode.NEAREST Lcom/mojang/blaze3d/textures/FilterMode;
// 315: invokevirtual net/minecraft/class_12136.method_75294 (Lcom/mojang/blaze3d/textures/FilterMode;)Lnet/minecraft/class_12137;
// 318: dup
// 319: sipush 6199
// 31c: ldc2_w 157333326657575137
// 31f: lload 11
// 321: lxor
// 322: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/g7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 327: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 32a: astore 25
// 32c: aload 10
// 32e: astore 26
// 330: bipush 0
// 331: istore 27
// 333: aload 26
// 335: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 33a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 33f: astore 28
// 341: aload 28
// 343: invokeinterface java/util/Iterator.hasNext ()Z 1
// 348: ifeq 3a7
// 34b: aload 28
// 34d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 352: checkcast java/util/Map$Entry
// 355: astore 29
// 357: aload 29
// 359: astore 30
// 35b: bipush 0
// 35c: istore 31
// 35e: aload 30
// 360: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 365: checkcast java/lang/String
// 368: astore 32
// 36a: aload 30
// 36c: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 371: checkcast com/mojang/blaze3d/textures/GpuTextureView
// 374: astore 33
// 376: aload 23
// 378: aload 32
// 37a: aload 33
// 37c: aload 25
// 37e: invokeinterface com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lnet/minecraft/class_12137;)V 4
// 383: nop
// 384: nop
// 385: aload 18
// 387: iload 9
// 389: ifle 3ce
// 38c: ifnonnull 3cc
// 38f: aload 18
// 391: ifnull 341
// 394: iload 9
// 396: ifle 385
// 399: goto 3a7
// 39c: ldc2_w 1088608024796393125
// 39f: lload 11
// 3a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a6: athrow
// 3a7: nop
// 3a8: aload 23
// 3aa: bipush 0
// 3ab: aload 20
// 3ad: invokeinterface com/mojang/blaze3d/systems/RenderPass.setVertexBuffer (ILcom/mojang/blaze3d/buffers/GpuBuffer;)V 3
// 3b2: aload 23
// 3b4: aload 19
// 3b6: getstatic com/mojang/blaze3d/vertex/VertexFormat$class_5595.field_27373 Lcom/mojang/blaze3d/vertex/VertexFormat$class_5595;
// 3b9: invokeinterface com/mojang/blaze3d/systems/RenderPass.setIndexBuffer (Lcom/mojang/blaze3d/buffers/GpuBuffer;Lcom/mojang/blaze3d/vertex/VertexFormat$class_5595;)V 3
// 3be: aload 23
// 3c0: bipush 0
// 3c1: bipush 0
// 3c2: aload 0
// 3c3: getfield su/catlean/g7.U I
// 3c6: bipush 1
// 3c7: invokeinterface com/mojang/blaze3d/systems/RenderPass.drawIndexed (IIII)V 5
// 3cc: aload 18
// 3ce: ifnonnull 3f5
// 3d1: aload 24
// 3d3: dup
// 3d4: ifnull 3f4
// 3d7: goto 3e5
// 3da: ldc2_w 1088608024796393125
// 3dd: lload 11
// 3df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: athrow
// 3e5: astore 27
// 3e7: bipush 0
// 3e8: istore 28
// 3ea: aload 23
// 3ec: invokeinterface com/mojang/blaze3d/systems/RenderPass.disableScissor ()V 1
// 3f1: goto 3f6
// 3f4: pop
// 3f5: nop
// 3f6: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 3f9: bipush 1
// 3fa: invokevirtual su/catlean/api/event/GofraState.setStopSwapBuffers (Z)V
// 3fd: aload 23
// 3ff: invokeinterface com/mojang/blaze3d/systems/RenderPass.close ()V 1
// 404: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 407: bipush 0
// 408: invokevirtual su/catlean/api/event/GofraState.setStopSwapBuffers (Z)V
// 40b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 40e: bipush 1
// 40f: invokevirtual su/catlean/jl.h (Z)V
// 412: return
}

public static void L(
g7 var0,
long var1,
RenderPipeline var3,
GpuTextureView var4,
GpuTextureView var5,
GpuBufferSlice var6,
Matrix4f var7,
Matrix3x2f var8,
Map var9,
int var10,
Object var11
) {
var1 = a ^ var1;
long var10001 = var1 ^ 12920068952775L;
int var12 = (int)((var1 ^ 12920068952775L) >>> 48);
int var13 = (int)((var1 ^ 12920068952775L) << 16 >>> 32);
int var14 = (int)(var10001 << 48 >>> 48);
_g[] var15 = vm.a<"Å">(-3585870946560171971L, var1);

int var10000;
label41: {
label40: {
try {
var10000 = var10 & b<"r">(27328, 9179786415885433228L ^ var1);
if (var15 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, -3550894355153539322L, var1);
}

var7 = null;
}

var10000 = var10 & b<"r">(16213, 8073777765245578257L ^ var1);
}

label32: {
label31: {
try {
if (var15 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, -3550894355153539322L, var1);
}

var8 = null;
}

var10000 = var10 & b<"r">(6430, 956285536289737302L ^ var1);
}

if (var10000 != 0) {
var9 = MapsKt.emptyMap();
}

var0.H((char)var12, var3, var4, var5, var6, var13, var7, var8, (short)var14, var9);
}

private static final String U() {
long var0 = a ^ 14574380533793L;
return a<"s">(4648, 270485689953945465L ^ var0);
}

public g7(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 41318603034283L;
this(var3, null, 0, false, b<"r">(2544, 1206602483426466132L ^ var1), null);
}

public static void N(String[] var0) {
t = var0;
}

public static String[] v() {
return t;
}

static {
long var31 = a ^ 113226160942963L;
String[] var10000 = new String[5];
vm.a<"Å">(var10000, 4412414650340231858L, var31);
Cipher var22;
Cipher var37 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var37.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[24];
int var27 = 0;
String var26 = "²Tõ³\u008a\u00961íûÕ'òw\u0092ÄNðH\u001b×Á\u0017&Yúj\b\u0014\u0012\u0093\u0091\u001f\u001e\u008b7gû~\u001e\u001aO2\u0081\u001dnÓ\u0091|\u0082 ¨L\u00ad\u0094S©\u00166Õ?\u009fCkiEá§ÀÙ¯k\u0096âë\r\u009f\u001d§a\u0085\u0098å\u0088ÿ¿r\u0007\u007fü\u008d\u0091k+Yëg\u000f\u0080F_á(ûf\u0080>°\u008e7\u0096èi\u0014?\u0013\\\u0012¨ìæt~\u00adôûù!R'Ë«.6\u0000\u0093\u0083\u0014è\u0019mÚ4ñ½ ¼Î$\tLú\u0012õ\u008d\u0015Áq'sZUã²Õ\"Û#ë\u000eèØ:\u000e\\ù\u0005\u000b?©}\u0017A»Ã\u0097º ìÚc\u008b\u008f\u0085®4\u00149§@\u009a¯\u008bÿ0þÝ½\u008a¡Ma\u0015\u0001ô\u00adx\bø\u008c&În@\u009ayÚ\u001a\u0007±9\u008b<\u0088ñC\u0014{\u009aDd(ñ\u001c£\u009bVûµ¬\u0083°y\u0014óR\u0004uº\u007f8\u0010\u0089ö*æ\u0081\fÿÖ7ä¾jvðAÍ×\fûùÊ\u009d:\u008bPìðD\u009c\u0001`u\u0011\u0019ÿjñn¸¹¡¨2£(ÓI£¼}\u0097KLõ\u008c¶\u0018\n\u008dÀö'ñ\u001c9SfüV0#ÛDÚ\rA\u0012TÄ\u0086Ú»Ê»Í\u0010¿\u0001§»\u0093.óf\u0083»áoGªc\u009d\u0010ê'¡\u0090G\u009e\f\u001e¶^\u000b\u0090¹¡\u0017\"\u0018râ\u0092\u0080íå¨ýóÃ3\u00041\u009eC\u000fEÍ\u0086«Ì\u0006\u0098¬ êô¯HÃD²¿G¥g»%4Y\u0085²\u0015ÆPÔþß¶é2¦BóÓ\u0007 (·\u0001\u001e<Ár\u0000\")/\u0000G½û\t#\u0096.Ú³\r«\u008a±K\u008cªk·¦Áy¦å8±,È\u0083\u0000\u0018øU\u001fN,lë×\u000foøÒ³\u009d!XÄ\u001b\u009a\u009d\u008d\u001fÂ\u0080\u0018½®\u0098Þ\nx\u000f>Åy{\u0080øãÿ\u0018d\u009d1\u001a\u0011\u000f^F\u0010Ðñ\u001dWo´èÍ11Ê¶.³pÝ \u000fv-\u0093w\u008aGè¿÷\u001a\u009acÌ\u0010\u0097ã\u0085o\u0092És q\u009aK\u008fî¢^;¡\u0010Âß\u0083z¹\u009e/ ,¦vë¤\\H\u0090HY\u0005\u008b)Lx\u0096M&S¿ôK\u0013Ö¯a»Ò\u0099<w\u008ey\u0086¯8ÐÉ|\"Þgh\u0088\u0094Ë\"{nx*^û«-kgná\u0084D¯óÆ\u000e\ff\u001cu\"®V`\u0081ú\u0099\u001d,\u0098LJ0\u0004;^ß®]\u0013E³ãi\bªgó Õú\u008cQ¯Zw¼£å¯\u001e\u001e(\u0005¼XºkhS\u007f\r\u0081P7Z©T\u0006\u0095Ý\u0010àa¡\u0013§Y}º¥8zÕ\u0095\u001eëI\u0010\u008d$á?M(òÌsU<Ü\u0019\u0089Ô\u00158\u0084XøîS\"\u008eÏ°¨>|Q\u0018óêPå\u0014«\u0099:\u001dÍ)\u0003b\u0080±.[Nì½-N£Ü¸\u009fÙë~!¨\u007f=\u008d\u0004y8\u008f;\u001c\u008dI\u001095çÀÔ@¯ða\u0015á9Y£Jø\u0010¾f¢\u0002QÍ¿\u008b¥a\r\u000b+¿]î(ÚùyÅ´ZO(I[\u0096R\u0087®|\u0090\u0089:\u0095±Mr\u00196\u001eb6&MøÌ\u008c\u001f@\bV\u001d¢¤|($~Jü\u0092\u001d\u0003Î7Ædfüf\u007f¹ÅÝ{\u0086ìv\u0083ñü©;\u0080CÈ»;u¢öxÆ¬÷Ø";
int var28 = "²Tõ³\u008a\u00961íûÕ'òw\u0092ÄNðH\u001b×Á\u0017&Yúj\b\u0014\u0012\u0093\u0091\u001f\u001e\u008b7gû~\u001e\u001aO2\u0081\u001dnÓ\u0091|\u0082 ¨L\u00ad\u0094S©\u00166Õ?\u009fCkiEá§ÀÙ¯k\u0096âë\r\u009f\u001d§a\u0085\u0098å\u0088ÿ¿r\u0007\u007fü\u008d\u0091k+Yëg\u000f\u0080F_á(ûf\u0080>°\u008e7\u0096èi\u0014?\u0013\\\u0012¨ìæt~\u00adôûù!R'Ë«.6\u0000\u0093\u0083\u0014è\u0019mÚ4ñ½ ¼Î$\tLú\u0012õ\u008d\u0015Áq'sZUã²Õ\"Û#ë\u000eèØ:\u000e\\ù\u0005\u000b?©}\u0017A»Ã\u0097º ìÚc\u008b\u008f\u0085®4\u00149§@\u009a¯\u008bÿ0þÝ½\u008a¡Ma\u0015\u0001ô\u00adx\bø\u008c&În@\u009ayÚ\u001a\u0007±9\u008b<\u0088ñC\u0014{\u009aDd(ñ\u001c£\u009bVûµ¬\u0083°y\u0014óR\u0004uº\u007f8\u0010\u0089ö*æ\u0081\fÿÖ7ä¾jvðAÍ×\fûùÊ\u009d:\u008bPìðD\u009c\u0001`u\u0011\u0019ÿjñn¸¹¡¨2£(ÓI£¼}\u0097KLõ\u008c¶\u0018\n\u008dÀö'ñ\u001c9SfüV0#ÛDÚ\rA\u0012TÄ\u0086Ú»Ê»Í\u0010¿\u0001§»\u0093.óf\u0083»áoGªc\u009d\u0010ê'¡\u0090G\u009e\f\u001e¶^\u000b\u0090¹¡\u0017\"\u0018râ\u0092\u0080íå¨ýóÃ3\u00041\u009eC\u000fEÍ\u0086«Ì\u0006\u0098¬ êô¯HÃD²¿G¥g»%4Y\u0085²\u0015ÆPÔþß¶é2¦BóÓ\u0007 (·\u0001\u001e<Ár\u0000\")/\u0000G½û\t#\u0096.Ú³\r«\u008a±K\u008cªk·¦Áy¦å8±,È\u0083\u0000\u0018øU\u001fN,lë×\u000foøÒ³\u009d!XÄ\u001b\u009a\u009d\u008d\u001fÂ\u0080\u0018½®\u0098Þ\nx\u000f>Åy{\u0080øãÿ\u0018d\u009d1\u001a\u0011\u000f^F\u0010Ðñ\u001dWo´èÍ11Ê¶.³pÝ \u000fv-\u0093w\u008aGè¿÷\u001a\u009acÌ\u0010\u0097ã\u0085o\u0092És q\u009aK\u008fî¢^;¡\u0010Âß\u0083z¹\u009e/ ,¦vë¤\\H\u0090HY\u0005\u008b)Lx\u0096M&S¿ôK\u0013Ö¯a»Ò\u0099<w\u008ey\u0086¯8ÐÉ|\"Þgh\u0088\u0094Ë\"{nx*^û«-kgná\u0084D¯óÆ\u000e\ff\u001cu\"®V`\u0081ú\u0099\u001d,\u0098LJ0\u0004;^ß®]\u0013E³ãi\bªgó Õú\u008cQ¯Zw¼£å¯\u001e\u001e(\u0005¼XºkhS\u007f\r\u0081P7Z©T\u0006\u0095Ý\u0010àa¡\u0013§Y}º¥8zÕ\u0095\u001eëI\u0010\u008d$á?M(òÌsU<Ü\u0019\u0089Ô\u00158\u0084XøîS\"\u008eÏ°¨>|Q\u0018óêPå\u0014«\u0099:\u001dÍ)\u0003b\u0080±.[Nì½-N£Ü¸\u009fÙë~!¨\u007f=\u008d\u0004y8\u008f;\u001c\u008dI\u001095çÀÔ@¯ða\u0015á9Y£Jø\u0010¾f¢\u0002QÍ¿\u008b¥a\r\u000b+¿]î(ÚùyÅ´ZO(I[\u0096R\u0087®|\u0090\u0089:\u0095±Mr\u00196\u001eb6&MøÌ\u008c\u001f@\bV\u001d¢¤|($~Jü\u0092\u001d\u0003Î7Ædfüf\u007f¹ÅÝ{\u0086ìv\u0083ñü©;\u0080CÈ»;u¢öxÆ¬÷Ø"
.length();
char var25 = 144;
int var36 = -1;

label81:
while (true) {
String var38 = var26.substring(++var36, var36 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var38.getBytes("ISO-8859-1"));
String var54 = a(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var54;
if ((var36 += var25) >= var28) {
c = var29;
e = new String[24];
l = new HashMap(13);
Cipher var11;
Cipher var40 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var40.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[20];
int var14 = 0;
String var15 = "\u0010¬9ö\u0002«ÞE¢\u009f×÷©/÷\b}¥ºa°(\u0089øè|Ø\u0095¯°\u008f\u000blö0ë±§YSVu]\u0092\u009efÚM¬\u0081\"íÎ\u0017Ç*\u0090Æ \u009cJ\u0082E*\u008aOA\u001c£\u0002Pyé\u0089mpÒ\u00adÑ£ÿ\b\u0017HûØ\u0084äø\u0007\u0085ía\rêùº¹ëTþõ\r:ã@\u008fÿO:\u0090\u0014g\u0081§è\u0092!¯\u0087\u0001\u008aØ´@ÒüF\u0080K¶@Ë{rôÏ¯\u009d£\n\u007fª,";
int var16 = "\u0010¬9ö\u0002«ÞE¢\u009f×÷©/÷\b}¥ºa°(\u0089øè|Ø\u0095¯°\u008f\u000blö0ë±§YSVu]\u0092\u009efÚM¬\u0081\"íÎ\u0017Ç*\u0090Æ \u009cJ\u0082E*\u008aOA\u001c£\u0002Pyé\u0089mpÒ\u00adÑ£ÿ\b\u0017HûØ\u0084äø\u0007\u0085ía\rêùº¹ëTþõ\r:ã@\u008fÿO:\u0090\u0014g\u0081§è\u0092!¯\u0087\u0001\u008aØ´@ÒüF\u0080K¶@Ë{rôÏ¯\u009d£\n\u007fª,"
.length();
byte var13 = 0;

label63:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var41 = var17;
var10001 = var14++;
long var58 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var64 = -1;

while (true) {
long var19 = var58;
byte[] var21 = var11.doFinal(
new byte[]{
(byte)(var19 >>> 56),
(byte)(var19 >>> 48),
(byte)(var19 >>> 40),
(byte)(var19 >>> 32),
(byte)(var19 >>> 24),
(byte)(var19 >>> 16),
(byte)(var19 >>> 8),
(byte)var19
}
);
long var69 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var64) {
case 0:
var41[var10001] = var69;
if (var13 >= var16) {
g = var17;
i = new Integer[20];
p = new HashMap(13);
Cipher var0;
Cipher var42 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
}

var42.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "²0e5\u0018âí¨£ý\u0081Y\u008fë\f/W\u0016¿Ç_Údc";
int var5 = "²0e5\u0018âí¨£ý\u0081Y\u008fë\f/W\u0016¿Ç_Údc".length();
byte var2 = 0;

label47:
while (true) {
int var50 = var2;
var2 += 8;
byte[] var7 = var4.substring(var50, var2).getBytes("ISO-8859-1");
long[] var43 = var6;
var50 = var3++;
long var61 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var67 = -1;

while (true) {
long var8 = var61;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
var69 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var67) {
case 0:
var43[var50] = var69;
if (var2 >= var5) {
n = var6;
o = new Long[5];
return;
}
break;
default:
var43[var50] = var69;
if (var2 < var5) {
continue label47;
}

var4 = "4þÕ;\u009bC/Þ\u0016\u0016Ô\tåõ\u0018Ó";
var5 = "4þÕ;\u009bC/Þ\u0016\u0016Ô\tåõ\u0018Ó".length();
var2 = 0;
}

byte var52 = var2;
var2 += 8;
var7 = var4.substring(var52, var2).getBytes("ISO-8859-1");
var43 = var6;
var50 = var3++;
var61 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var67 = 0;
}
}
}
break;
default:
var41[var10001] = var69;
if (var13 < var16) {
continue label63;
}

var15 = "Q5.\u009bF\u009ch#Ô\u0099S:\u0007ÃD\u0015";
var16 = "Q5.\u009bF\u009ch#Ô\u0099S:\u0007ÃD\u0015".length();
var13 = 0;
}

byte var49 = var13;
var13 += 8;
var18 = var15.substring(var49, var13).getBytes("ISO-8859-1");
var41 = var17;
var10001 = var14++;
var58 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var64 = 0;
}
}
}

var25 = var26.charAt(var36);
break;
default:
var29[var27++] = var54;
if ((var36 += var25) < var28) {
var25 = var26.charAt(var36);
continue label81;
}

var26 = "µM~b\u008d\u008cm(%\u0093×¶]÷NØ 4\u0080*èºâ\\\u0011f\u0019ÿ\u001dÓ\u001eÃU¿®T\u0093ÖùôÝ¯\u0086J\u001f\t\u009f\u0093F";
var28 = "µM~b\u008d\u008cm(%\u0093×¶]÷NØ 4\u0080*èºâ\\\u0011f\u0019ÿ\u001dÓ\u001eÃU¿®T\u0093ÖùôÝ¯\u0086J\u001f\t\u009f\u0093F".length();
var25 = 16;
var36 = -1;
}

var38 = var26.substring(++var36, var36 + var25);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19990;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/g7", var10);
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
e[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/g7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7221;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/g7", var14);
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
throw new RuntimeException("su/catlean/g7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27131;
if (o[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = n[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])p.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
p.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/g7", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
o[var3] = var15;
}

return o[var3];
}

private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = c(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
throw new RuntimeException("su/catlean/g7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
