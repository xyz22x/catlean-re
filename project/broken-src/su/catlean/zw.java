package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10017;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import org.joml.Quaternionfc;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.GameRendererAccessor;

public final class zw {
@NotNull
public static final zw l;
private static boolean G;
@Nullable
private static class_6364 v;
private static final long a = yz.a(-6917757038483336241L, -5311254499861508910L, MethodHandles.lookup().lookupClass()).a(169292131484378L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private zw() {
}

@Nullable
public final class_6364 v() {
return v;
}

public final void W(@Nullable class_6364 <set-?>) {
v = <set-?>;
}

public final void I(@NotNull class_4587 stack, long a, @NotNull class_1297 target) {
ax = a ^ ax;
long var5 = ax ^ 132384715496687L;
long var10001 = ax ^ 119899356579004L;
int var7 = (int)((ax ^ 119899356579004L) >>> 32);
int var8 = (int)((ax ^ 119899356579004L) << 32 >>> 48);
int var9 = (int)(var10001 << 48 >>> 48);
long var10 = ax ^ 90244818507686L;
Intrinsics.checkNotNullParameter(stack, a<"r">(3043, 4324918683145989612L ^ ax));
Intrinsics.checkNotNullParameter(target, a<"r">(25682, 338932000658850375L ^ ax));
class_4184 var10000 = zf.F(var5).field_1773.method_19418();
Intrinsics.checkNotNullExpressionValue(var10000, a<"r">(18990, 4853055889803127854L ^ ax));
class_4184 var13 = var10000;
this.K(var10);
double var14 = zi.v.n(var7, (char)var8, var9);
double var16 = class_3532.method_16436(var14, target.field_6038, target.method_23317()) - var13.method_71156().field_1352;
double var18 = class_3532.method_16436(var14, target.field_5971, target.method_23318()) - var13.method_71156().field_1351;
double var20 = class_3532.method_16436(var14, target.field_5989, target.method_23321()) - var13.method_71156().field_1350;
G = true;
int var27 = vm.a<"Å">(9431702312054932L, ax);
Object var28 = zf.F(var5).field_1690.method_42435().method_41753();
Intrinsics.checkNotNullExpressionValue(var28, a<"r">(15899, 3705981231720454154L ^ ax));
boolean var22 = (Boolean)var28;
zf.F(var5).field_1690.method_42435().method_41748(false);
RenderSystem.backupProjectionMatrix();
class_757 var29 = zf.F(var5).field_1773;
Intrinsics.checkNotNull(var29, a<"r">(1216, 8808400076697330376L ^ ax));
RenderSystem.setProjectionMatrix(((GameRendererAccessor)var29).getLevelProjectionMatrixBuffer().method_71123(zi.v.s()), RenderSystem.getProjectionType());
GofraState.INSTANCE.setModifyBuffer(true);
class_10017 var30 = zf.F(var5).method_1561().method_3953(target).method_62425(target, zi.v.n(var7, (char)var8, var9));
Intrinsics.checkNotNullExpressionValue(var30, a<"r">(13439, 1620536564818694776L ^ ax));
class_10017 var23 = var30;
class_757 var31 = zf.F(var5).field_1773;
Intrinsics.checkNotNull(var31, a<"r">(25293, 2235021715621840093L ^ ax));
class_12075 var32 = ((GameRendererAccessor)var31).getLevelRenderState().field_63082;
Intrinsics.checkNotNullExpressionValue(var32, a<"r">(23686, 5727171188192459407L ^ ax));
class_12075 var24 = var32;
zf.F(var5).method_1561().method_72976(var23, var24, var16, var18, var20, stack, (class_11659)zf.F(var5).field_1773.method_72910());
zf.F(var5).field_1773.method_72911().method_73002();
zf.F(var5).method_22940().method_23000().method_22993();
zf.F(var5).field_1773.method_72910().method_72953();
GofraState.INSTANCE.setModifyBuffer(false);
int var12 = var27;

try {
zf.F(var5).field_1690.method_42435().method_41748(var22);
RenderSystem.restoreProjectionMatrix();
G = false;
if (var12 == 0) {
vm.a<"Å">(new _g[3], 36543053928139452L, ax);
}
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, 24197562136279429L, ax);
}
}

public final void C(long param1, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: bipush 32
// 03: lshl
// 04: iload 3
// 05: i2l
// 06: bipush 32
// 08: lshl
// 09: bipush 32
// 0b: lushr
// 0c: lor
// 0d: getstatic su/catlean/zw.a J
// 10: lxor
// 11: lstore 4
// 13: lload 4
// 15: dup2
// 16: ldc2_w 75707709163054
// 19: lxor
// 1a: lstore 6
// 1c: dup2
// 1d: ldc2_w 70830402502152
// 20: lxor
// 21: lstore 8
// 23: dup2
// 24: ldc2_w 11756198207391
// 27: lxor
// 28: dup2
// 29: bipush 48
// 2b: lushr
// 2c: l2i
// 2d: istore 10
// 2f: dup2
// 30: bipush 16
// 32: lshl
// 33: bipush 32
// 35: lushr
// 36: l2i
// 37: istore 11
// 39: dup2
// 3a: bipush 48
// 3c: lshl
// 3d: bipush 48
// 3f: lushr
// 40: l2i
// 41: istore 12
// 43: pop2
// 44: pop2
// 45: ldc2_w 8962982700938792151
// 48: lload 4
// 4a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: istore 13
// 51: iload 13
// 53: ifeq f3
// 56: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 59: ifnull f7
// 5c: goto 6a
// 5f: ldc2_w 8941506595927508422
// 62: lload 4
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: bipush 1
// 6b: putstatic su/catlean/zw.G Z
// 6e: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 71: bipush 1
// 72: invokevirtual su/catlean/api/event/GofraState.setModifyBuffer (Z)V
// 75: getstatic su/catlean/kg.W Lsu/catlean/kg;
// 78: aconst_null
// 79: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 7c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 7f: lload 8
// 81: bipush 0
// 82: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 85: iload 10
// 87: i2c
// 88: iload 11
// 8a: ldc 0.4
// 8c: iload 12
// 8e: i2s
// 8f: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 92: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 95: dup
// 96: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 99: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 9c: dup
// 9d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// a0: bipush 0
// a1: bipush 0
// a2: fconst_0
// a3: fconst_0
// a4: fconst_0
// a5: ldc 4.0
// a7: bipush 0
// a8: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// ab: dup
// ac: sipush 5523
// af: ldc2_w 982106804230000596
// b2: lload 4
// b4: lxor
// b5: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/zw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// bd: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// c0: dup
// c1: sipush 21746
// c4: ldc2_w 2255694513906699965
// c7: lload 4
// c9: lxor
// ca: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/zw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// d2: bipush 0
// d3: lload 6
// d5: fconst_0
// d6: fconst_0
// d7: fconst_0
// d8: fconst_0
// d9: fconst_0
// da: fconst_0
// db: invokevirtual su/catlean/kg.d (Lsu/catlean/rw;Ljava/awt/Color;Lnet/minecraft/class_6364;Lnet/minecraft/class_6364;ZZFFFFILjava/awt/Color;Ljava/awt/Color;IJFFFFFF)V
// de: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// e1: bipush 0
// e2: invokevirtual su/catlean/api/event/GofraState.setModifyBuffer (Z)V
// e5: goto f3
// e8: ldc2_w 8941506595927508422
// eb: lload 4
// ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f2: athrow
// f3: bipush 0
// f4: putstatic su/catlean/zw.G Z
// f7: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void q(@NotNull class_4587 matrix, long a, @NotNull class_1297 target, char a, float alpha) {
long var7 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
long var9 = var7 ^ 110895279502641L;
long var11 = var7 ^ 61680173787714L;
long var13 = var7 ^ 8360081198053L;
long var10001 = var7 ^ 125004364901730L;
int var15 = (int)((var7 ^ 125004364901730L) >>> 32);
int var16 = (int)((var7 ^ 125004364901730L) << 32 >>> 48);
int var17 = (int)(var10001 << 48 >>> 48);
long var18 = var7 ^ 61046957386645L;
long var20 = var7 ^ 126252387237517L;
long var22 = var7 ^ 121582378581551L;
long var24 = var7 ^ 95194298117854L;
var10001 = var7 ^ 137850511936002L;
int var26 = (int)((var7 ^ 137850511936002L) >>> 48);
int var27 = (int)((var7 ^ 137850511936002L) << 16 >>> 32);
int var28 = (int)(var10001 << 48 >>> 48);
long var29 = var7 ^ 75309433748247L;
int var10000 = vm.a<"Å">(3026311926383827274L, var7);
Intrinsics.checkNotNullParameter(matrix, a<"r">(24804, 6736600770572627772L ^ var7));
Intrinsics.checkNotNullParameter(target, a<"r">(26097, 3924183194201008686L ^ var7));
class_4184 var78 = zf.F(var9).field_1773.method_19418();
Intrinsics.checkNotNullExpressionValue(var78, a<"r">(17130, 2271884579943451967L ^ var7));
class_4184 var41 = var78;
GpuTextureView var79 = zf.F(var9).method_1531().method_4619(n1.o()).method_71659();
Intrinsics.checkNotNullExpressionValue(var79, a<"r">(22227, 152897602152012057L ^ var7));
GpuTextureView var42 = var79;
double var43 = jl.y.W(target.field_6014, target.method_23317(), zi.v.n(var15, (char)var16, var17)) - var41.method_71156().field_1352;
double var45 = jl.y.W(target.field_6036, target.method_23318(), zi.v.n(var15, (char)var16, var17)) - var41.method_71156().field_1351;
double var47 = jl.y.W(target.field_5969, target.method_23321(), zi.v.n(var15, (char)var16, var17)) - var41.method_71156().field_1350;
double var49 = jl.y.W(target.field_6012 - 1.0, target.field_6012, zi.v.n(var15, (char)var16, var17));
VertexFormat var10003 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, a<"r">(13953, 4405351946196023637L ^ var7));
int var10004 = b<"l">(19123, 1958165467887754636L ^ var7);
Object var31 = null;
int var32 = 4;
boolean var33 = false;
int var34 = var10004;
VertexFormat var35 = var10003;
g7 var51 = new g7(var11, var35, var34, var33, var32, (DefaultConstructorMarker)var31);
int var40 = var10000;
boolean var52 = zf.v(var29).method_6057(target);
int var53 = 0;

while (true) {
if (var53 < 3) {
var10000 = var40;
if (axx > 0L) {
if (var40 == 0) {
break;
}

var10000 = 0;
}

int var54 = var10000;

label64: {
label63:
while (true) {
if (var54 < b<"l">(16677, 8470590394551260688L ^ var7)) {
double var55 = Math.toRadians(
((var54 / 1.5F + var49) * b<"l">(20552, 7701562082753267578L ^ var7) + var53 * b<"l">(14542, 7446239520383086584L ^ var7))
% b<"l">(11829, 4685577712596760838L ^ var7)
);
double var57 = Math.sin(Math.toRadians(var49 * 2.5F + var54 * (var53 + 1)) * 3.0F) / 1.8F;
float var59 = (float)var54 / b<"l">(23221, 2000827166886186376L ^ var7);
class_4587 var60 = new class_4587();
var60.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(var41.method_19329()));
var60.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(var41.method_19330() + 180.0F));
var60.method_22904(var43 + Math.cos(var55) * target.method_17681(), var45 + 1 + var57, var47 + Math.sin(var55) * target.method_17681());
var60.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-var41.method_19330()));
var60.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(var41.method_19329()));
Matrix4f var74 = var60.method_23760().method_23761();
Intrinsics.checkNotNullExpressionValue(var74, a<"r">(8915, 5209173114654452992L ^ var7));
Matrix4f var61 = var74;
Color var62 = jl.y.p(jh.f.Z(var18, (int)(b<"l">(24834, 8300818092314752574L ^ var7) * var59)), (char)var26, var27, var59 * alpha, (short)var28);
float var63 = (float)Math.max((double)(0.24F * var59), 0.2);
gi var64 = gi.FIREFLY;

try {
var51.O(var61, -var63, var20, var63, 0.0F).j(var64.o(), var24, var64.w()).n(var62, var13);
var51.O(var61, var63, var20, var63, 0.0F).j(var64.L(), var24, var64.w()).n(var62, var13);
var51.O(var61, var63, var20, -var63, 0.0F).j(var64.L(), var24, var64.v()).n(var62, var13);
var51.O(var61, -var63, var20, -var63, 0.0F).j(var64.o(), var24, var64.v()).n(var62, var13);
var54++;
} catch (NumberFormatException var65) {
throw vm.a<"Å">(var65, 2993744973303451739L, var7);
}

do {
try {
var10000 = var40;
if (axx <= 0L) {
break label64;
}

if (var40 == 0) {
break label63;
}

if (var40 != 0) {
continue label63;
}
} catch (NumberFormatException var67) {
throw vm.a<"Å">(var67, 2993744973303451739L, var7);
}
} while (ax <= 0);
}

var53++;
break;
}

var10000 = var40;
}

if (var10000 != 0) {
continue;
}
}

matrix.method_22903();
matrix.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-var41.method_19330() + 180.0F));
matrix.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(-var41.method_19329()));
if (axx >= 0L) {
}
break;
}

label40: {
try {
var76 = var51;
if (var52) {
var80 = b6.R.B();
break label40;
}
} catch (NumberFormatException var66) {
throw vm.a<"Å">(var66, 2993744973303451739L, var7);
}

var80 = b6.R.S();
}

Matrix4f var81 = matrix.method_23760().method_23761();
Map var10006 = MapsKt.mapOf(TuplesKt.to(a<"r">(14250, 1054804545536161914L ^ var7), var42));
int var10007 = b<"l">(19373, 2625840902639377562L ^ var7);
var31 = null;
var32 = var10007;
Map var70 = var10006;
Object var71 = null;
Matrix4f var72 = var81;
Object var36 = null;
Object var37 = null;
RenderPipeline var38 = var80;
g7 var39 = var76;
g7.R(var22, var39, var38, (class_276)var37, (GpuBufferSlice)var36, var72, (Matrix3x2f)var71, var70, var32, var31);
matrix.method_22909();
}

public static void Q(zw var0, class_4587 var1, class_1297 var2, float var3, int var4, char var5, int var6, short var7, Object var8) {
long var9 = ((long)var5 << 48 | (long)var6 << 32 >>> 16 | (long)var7 << 48 >>> 48) ^ a;
long var11 = (var9 ^ 76158855950356L) >>> 16;
int var13 = (int)((var9 ^ 76158855950356L) << 48 >>> 48);
if ((var4 & 4) != 0) {
var3 = 1.0F;
}

var0.q(var1, var11, var2, (char)var13, var3);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void X(@NotNull class_4587 matrix, int a, char a, @NotNull class_1297 target, char a, float alpha) {
long var7 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var9 = var7 ^ 31863885751040L;
long var11 = var7 ^ 70610251398259L;
long var13 = var7 ^ 140442368810452L;
long var10001 = var7 ^ 10522316077907L;
int var15 = (int)((var7 ^ 10522316077907L) >>> 32);
int var16 = (int)((var7 ^ 10522316077907L) << 32 >>> 48);
int var17 = (int)(var10001 << 48 >>> 48);
long var18 = var7 ^ 87568613850532L;
long var20 = var7 ^ 12036085639356L;
long var22 = var7 ^ 24967321675806L;
long var24 = var7 ^ 51355267397871L;
var10001 = var7 ^ 6042496883763L;
int var26 = (int)((var7 ^ 6042496883763L) >>> 48);
int var27 = (int)((var7 ^ 6042496883763L) << 16 >>> 32);
int var28 = (int)(var10001 << 48 >>> 48);
long var29 = var7 ^ 66380500135206L;
Intrinsics.checkNotNullParameter(matrix, a<"r">(29703, 5674939938276453887L ^ var7));
Intrinsics.checkNotNullParameter(target, a<"r">(26097, 3924051394235087903L ^ var7));
int var10000 = vm.a<"Å">(-4625506293232676997L, var7);
class_4184 var86 = zf.F(var9).field_1773.method_19418();
Intrinsics.checkNotNullExpressionValue(var86, a<"r">(17130, 2271822866328394510L ^ var7));
class_4184 var41 = var86;
int var40 = var10000;
GpuTextureView var80 = zf.F(var9).method_1531().method_4619(n1.o()).method_71659();
Intrinsics.checkNotNullExpressionValue(var80, a<"r">(10391, 261223814623031662L ^ var7));
GpuTextureView var42 = var80;
double var43 = jl.y.W(target.field_6014, target.method_23317(), zi.v.n(var15, (char)var16, var17)) - var41.method_71156().field_1352;
double var45 = jl.y.W(target.field_6036, target.method_23318(), zi.v.n(var15, (char)var16, var17)) - var41.method_71156().field_1351;
double var47 = jl.y.W(target.field_5969, target.method_23321(), zi.v.n(var15, (char)var16, var17)) - var41.method_71156().field_1350;
double var49 = jl.y.W(target.field_6012 - 1.0, target.field_6012, zi.v.n(var15, (char)var16, var17));
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, a<"r">(23253, 1583939710510564153L ^ var7));
int var10003 = b<"l">(19883, 4784586625732332708L ^ var7);
Object var31 = null;
int var32 = 4;
boolean var33 = false;
int var34 = var10003;
VertexFormat var35 = var10002;
g7 var51 = new g7(var11, var35, var34, var33, var32, (DefaultConstructorMarker)var31);
boolean var52 = zf.v(var29).method_6057(target);
int var53 = b<"l">(17350, 5156721460518240973L ^ var7);
int var54 = 0;

while (true) {
if (var54 < b<"l">(18189, 7431796430828226056L ^ var7)) {
var10000 = var40;
if (ax >= 0) {
if (var40 == 0) {
break;
}

var10000 = 0;
}

int var55 = var10000;

label76: {
label75:
while (true) {
if (var55 < var53) {
double var56 = (double)var55 / var53 * (Math.PI * 2);
double var58 = Math.cos(var56) * target.method_17681();
double var60 = Math.sin(var56) * target.method_17681();
double var62 = Math.sin(Math.toRadians((var49 - var54 / 2.0F) * 2.5F) * 3.0F) / 1.2F;
float var64 = (float)var55 / (var53 + 1);
class_4587 var65 = new class_4587();
var65.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(var41.method_19329()));
var65.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(var41.method_19330() + 180.0F));
var65.method_22904(var43 + var58, var45 + 1 + var62, var47 + var60);
var65.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-var41.method_19330()));
var65.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(var41.method_19329()));
Matrix4f var82 = var65.method_23760().method_23761();
Intrinsics.checkNotNullExpressionValue(var82, a<"r">(32561, 8026952425980798683L ^ var7));
Matrix4f var66 = var82;
Color var67 = jl.y.p(jh.f.Z(var18, (int)(b<"l">(20040, 330989982154968905L ^ var7) * var64)), (char)var26, var27, alpha / (var54 + 1), (short)var28);
float var68 = 0.12F;
gi var69 = gi.FIREFLY;

try {
var51.O(var66, -var68, var20, var68, 0.0F).j(var69.o(), var24, var69.w()).n(var67, var13);
var51.O(var66, var68, var20, var68, 0.0F).j(var69.L(), var24, var69.w()).n(var67, var13);
var51.O(var66, var68, var20, -var68, 0.0F).j(var69.L(), var24, var69.v()).n(var67, var13);
var51.O(var66, -var68, var20, -var68, 0.0F).j(var69.o(), var24, var69.v()).n(var67, var13);
var55++;
} catch (NumberFormatException var71) {
throw vm.a<"Å">(var71, -4631227569264949654L, var7);
}

do {
try {
var10000 = var40;
if (axxx <= 0) {
break label76;
}

if (var40 == 0) {
break label75;
}

if (var40 != 0) {
continue label75;
}
} catch (NumberFormatException var73) {
throw vm.a<"Å">(var73, -4631227569264949654L, var7);
}
} while (axx <= 0);
}

var54++;
break;
}

var10000 = var40;
}

if (var10000 != 0) {
continue;
}
}

matrix.method_22903();
matrix.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-var41.method_19330() + 180.0F));
matrix.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(-var41.method_19329()));
if (axx >= 0) {
}
break;
}

label52: {
try {
var84 = var51;
if (var52) {
var87 = b6.R.B();
break label52;
}
} catch (NumberFormatException var72) {
throw vm.a<"Å">(var72, -4631227569264949654L, var7);
}

var87 = b6.R.S();
}

Matrix4f var10004 = matrix.method_23760().method_23761();
Map var10006 = MapsKt.mapOf(TuplesKt.to(a<"r">(9781, 8674132778255122392L ^ var7), var42));
int var10007 = b<"l">(25296, 6415916483485131728L ^ var7);
var31 = null;
var32 = var10007;
Map var76 = var10006;
Object var77 = null;
Matrix4f var78 = var10004;
Object var36 = null;
Object var37 = null;
RenderPipeline var38 = var87;
g7 var39 = var84;

try {
g7.R(var22, var39, var38, (class_276)var37, (GpuBufferSlice)var36, var78, (Matrix3x2f)var77, var76, var32, var31);
matrix.method_22909();
if (ax >= 0 && vm.a<"Å">(-4676828161143692919L, var7) != null) {
vm.a<"Å">(++var40, -4704855356402646283L, var7);
}
} catch (NumberFormatException var70) {
throw vm.a<"Å">(var70, -4631227569264949654L, var7);
}
}

public static void R(zw var0, long var1, class_4587 var3, class_1297 var4, float var5, int var6, Object var7) {
var1 = a ^ var1;
long var10001 = var1 ^ 8713413409112L;
int var8 = (int)((var1 ^ 8713413409112L) >>> 32);
int var9 = (int)((var1 ^ 8713413409112L) << 32 >>> 48);
int var10 = (int)(var10001 << 48 >>> 48);
if ((var6 & 4) != 0) {
var5 = 1.0F;
}

var0.X(var3, var8, (char)var9, var4, (char)var10, var5);
}

private final void K(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zw.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 44328499614898
// 00b: lxor
// 00c: lstore 3
// 00d: pop2
// 00e: ldc2_w -4000091319393961783
// 011: lload 1
// 012: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 017: istore 5
// 019: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 01c: iload 5
// 01e: ifeq 063
// 021: ifnonnull 05c
// 024: goto 031
// 027: ldc2_w -4032789041352412712
// 02a: lload 1
// 02b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 030: athrow
// 031: new net/minecraft/class_6364
// 034: dup
// 035: lload 3
// 036: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 039: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 03c: getfield net/minecraft/class_276.field_1482 I
// 03f: lload 3
// 040: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 043: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 046: getfield net/minecraft/class_276.field_1481 I
// 049: invokespecial net/minecraft/class_6364.<init> (II)V
// 04c: putstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 04f: goto 05c
// 052: ldc2_w -4032789041352412712
// 055: lload 1
// 056: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: athrow
// 05c: lload 3
// 05d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 060: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 063: getfield net/minecraft/class_276.field_1482 I
// 066: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 069: dup
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 06d: getfield net/minecraft/class_6364.field_1482 I
// 070: lload 1
// 071: lconst_0
// 072: lcmp
// 073: iflt 0ac
// 076: iload 5
// 078: ifeq 0ac
// 07b: if_icmpne 0af
// 07e: goto 08b
// 081: ldc2_w -4032789041352412712
// 084: lload 1
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: lload 3
// 08c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08f: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 092: getfield net/minecraft/class_276.field_1481 I
// 095: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 098: dup
// 099: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 09c: getfield net/minecraft/class_6364.field_1481 I
// 09f: goto 0ac
// 0a2: ldc2_w -4032789041352412712
// 0a5: lload 1
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: if_icmpeq 0da
// 0af: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 0b2: dup
// 0b3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0b6: lload 3
// 0b7: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0ba: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0bd: getfield net/minecraft/class_276.field_1482 I
// 0c0: lload 3
// 0c1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c4: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0c7: getfield net/minecraft/class_276.field_1481 I
// 0ca: invokevirtual net/minecraft/class_6364.method_1234 (II)V
// 0cd: goto 0da
// 0d0: ldc2_w -4032789041352412712
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
// 0dd: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
// 0e2: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 0e5: dup
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0e9: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 0ec: dup
// 0ed: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0f0: bipush 0
// 0f1: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 0f4: dup
// 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0f8: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 0fb: dup
// 0fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0ff: dconst_1
// 100: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 105: return
}

@Flow
private final void x(FrameBufferEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/zw.a J
// 03: ldc2_w 81756662801410
// 06: lxor
// 07: lstore 2
// 08: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 0b: ifnull 3c
// 0e: getstatic su/catlean/zw.G Z
// 11: ifeq 3c
// 14: goto 21
// 17: ldc2_w 8794081215540904922
// 1a: lload 2
// 1b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: athrow
// 21: aload 1
// 22: getstatic su/catlean/zw.v Lnet/minecraft/class_6364;
// 25: checkcast net/minecraft/class_276
// 28: invokevirtual su/catlean/api/event/events/render/FrameBufferEvent.setFrameBuffer (Lnet/minecraft/class_276;)V
// 2b: aload 1
// 2c: invokevirtual su/catlean/api/event/events/render/FrameBufferEvent.cancel ()V
// 2f: goto 3c
// 32: ldc2_w 8794081215540904922
// 35: lload 2
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: return
}

static {
long var11 = a ^ 98819290004390L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[22];
int var18 = 0;
String var17 = "Â-\u0001\u0004=Ú®36\u0086¨\u000f\u008cÌ\u0005\u008b ýM\u0006\u00adpÓXëS2¨\u00951\bËS\u008bè3}r\u0000\u0004Òãè&þ\u0012\fC\u008b\u0010Ößßãé7Ê9vÈ\u0087;\u0012\u009b4²(Ä8òp\u009b!¬0µ]¸/ÕmV\u0082ãí\u001e\u009b@\u000bVcyIæ\u001ck&VFÄ\u000f\"\u0083ó1\u001aZ(\u001b\u00984Ó=¢×Ú\u007fßÆÇà-©À\u001bf\u008c\u0088h9Er0`7ÑIÅÏ\u0081\u0012\u000f¸OË¶5Ô\u0010;Áæä\u0089Ä©Kïf²Ókù¤¦\u0018·\u000fR\u0088É´ñª8\u001dq¯É\u009a\u0096Ã\u0095°\u001bò\u0015ôqT(»<~Ä\u0082\u008c\nö@\u007f\u0002M\u008f\u0094\u007fH\u0091©áá(\u001aXk8bÝ\u0096¶Lvb!\u0098ÎÜ\u0014Ñë\u0088\u0010¨À\u008b\u008f\rFö\u0091/ZÂû¶\u0018\u001eæ M£»ýY(Q¶v>L\u0082ÖäêÑJãö¨´GMË\u009aï6Å/Ð\u008ck\u0018\u0093\u0091\\\b\u0095\u0092e\u007fâ\u0015j/{=q'åð¿\t\u001fÝa\u0007\u00105}\u0082æÂ\\^Ðï(¤\u000b\u0081!2ª\u0088dß ®Õ\"wJ\u001aP\\bã%6p\u000e\u009fo\u0087\u0080a$(\u009cGÅ©i\r]Ö\u009bþ\u008fSÚ\u0084\u0014ò\u001bGôÄH\u0018ØèÀÓ:\u0015r\u0083eÉÓ\u0007.ôY$\u0097ïHÊ(Ô\u0013r\u001cA\u009bç'<wÇYá\u0001ÅÜÐù»×+ 2\r\u0085\u0096Íñýî¦\u0085çÊ_c\u009f¯Ì\u0096õ\u0005g\u0096w^\u0090ï\u0090Ø\u008c§íÂbÎ\u0099\u009e\u0089\r\u0007trb\u0001\u001a\u0091\u0012\u000f 3\u0014\u0095m\u0095oE9:\u000fY\u0083ÞÅ\u0011ð\u008d~Áü\u009eQ\u0088\bù\u0092ïÓpv¶!(\u0015Úc<3ÐÌùä\t]%M4ãú\u0015e¯NÓ>9ôy\u008f,\u0086¾\u0019¤5wH1¢\u0098\r¾Ó(ðvç¤!¢ÈÉË\u009ar\u0087i\u0002\u000b¯&ì\u0012\u008cC\u009d{½\u008b§:ø9¤þ´ãèÔ\u001b±äÌ´(%¶\u0095\u0014¾S\r#\u0001É\u0098e,\u0000\u008d\u0098%(\u0003\bç\u0084\u0007yøf78P+\u0088ó¸Vjë¯8¹\u000e\u0010ÿäw\u0089\u0080H.\u0099Tº,>âëÈ\u001e0\u001e\u008cå\u008f¦\u009dV.¦ïèÕñ4ò&æÇ¡ \u0091YN4º\u0099\u001e¦m\u0014\u009b\u0098r0\b8Å\u008b£[+Ú=[\\D\u0002è\u0010×·\u009ea\u008c\u001aÌiQ\u0099Á\u001c[U\f\u0005";
int var19 = "Â-\u0001\u0004=Ú®36\u0086¨\u000f\u008cÌ\u0005\u008b ýM\u0006\u00adpÓXëS2¨\u00951\bËS\u008bè3}r\u0000\u0004Òãè&þ\u0012\fC\u008b\u0010Ößßãé7Ê9vÈ\u0087;\u0012\u009b4²(Ä8òp\u009b!¬0µ]¸/ÕmV\u0082ãí\u001e\u009b@\u000bVcyIæ\u001ck&VFÄ\u000f\"\u0083ó1\u001aZ(\u001b\u00984Ó=¢×Ú\u007fßÆÇà-©À\u001bf\u008c\u0088h9Er0`7ÑIÅÏ\u0081\u0012\u000f¸OË¶5Ô\u0010;Áæä\u0089Ä©Kïf²Ókù¤¦\u0018·\u000fR\u0088É´ñª8\u001dq¯É\u009a\u0096Ã\u0095°\u001bò\u0015ôqT(»<~Ä\u0082\u008c\nö@\u007f\u0002M\u008f\u0094\u007fH\u0091©áá(\u001aXk8bÝ\u0096¶Lvb!\u0098ÎÜ\u0014Ñë\u0088\u0010¨À\u008b\u008f\rFö\u0091/ZÂû¶\u0018\u001eæ M£»ýY(Q¶v>L\u0082ÖäêÑJãö¨´GMË\u009aï6Å/Ð\u008ck\u0018\u0093\u0091\\\b\u0095\u0092e\u007fâ\u0015j/{=q'åð¿\t\u001fÝa\u0007\u00105}\u0082æÂ\\^Ðï(¤\u000b\u0081!2ª\u0088dß ®Õ\"wJ\u001aP\\bã%6p\u000e\u009fo\u0087\u0080a$(\u009cGÅ©i\r]Ö\u009bþ\u008fSÚ\u0084\u0014ò\u001bGôÄH\u0018ØèÀÓ:\u0015r\u0083eÉÓ\u0007.ôY$\u0097ïHÊ(Ô\u0013r\u001cA\u009bç'<wÇYá\u0001ÅÜÐù»×+ 2\r\u0085\u0096Íñýî¦\u0085çÊ_c\u009f¯Ì\u0096õ\u0005g\u0096w^\u0090ï\u0090Ø\u008c§íÂbÎ\u0099\u009e\u0089\r\u0007trb\u0001\u001a\u0091\u0012\u000f 3\u0014\u0095m\u0095oE9:\u000fY\u0083ÞÅ\u0011ð\u008d~Áü\u009eQ\u0088\bù\u0092ïÓpv¶!(\u0015Úc<3ÐÌùä\t]%M4ãú\u0015e¯NÓ>9ôy\u008f,\u0086¾\u0019¤5wH1¢\u0098\r¾Ó(ðvç¤!¢ÈÉË\u009ar\u0087i\u0002\u000b¯&ì\u0012\u008cC\u009d{½\u008b§:ø9¤þ´ãèÔ\u001b±äÌ´(%¶\u0095\u0014¾S\r#\u0001É\u0098e,\u0000\u008d\u0098%(\u0003\bç\u0084\u0007yøf78P+\u0088ó¸Vjë¯8¹\u000e\u0010ÿäw\u0089\u0080H.\u0099Tº,>âëÈ\u001e0\u001e\u008cå\u008f¦\u009dV.¦ïèÕñ4ò&æÇ¡ \u0091YN4º\u0099\u001e¦m\u0014\u009b\u0098r0\b8Å\u008b£[+Ú=[\\D\u0002è\u0010×·\u009ea\u008c\u001aÌiQ\u0099Á\u001c[U\f\u0005"
.length();
char var16 = 16;
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
c = new String[22];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[13];
int var3 = 0;
String var4 = "\u0080v\u0085¦º©\u000ei\u009dÍb¯o®Û\u0084£Ê\u0095~d|v'\u0085ÚØä\u0083\u0093»Kw7\u000fá¸\u0003x\u009d¢þ\t\fí\u0088*°ûr¢\u000eú\u0088\u008d=Z\u008e°h[<j\u0011E\u009c\u0081o\b\u009aî\u0093<¥{óñ¹<#ªe¤\u0015`:Á\u0018";
int var5 = "\u0080v\u0085¦º©\u000ei\u009dÍb¯o®Û\u0084£Ê\u0095~d|v'\u0085ÚØä\u0083\u0093»Kw7\u000fá¸\u0003x\u009d¢þ\t\fí\u0088*°ûr¢\u000eú\u0088\u008d=Z\u008e°h[<j\u0011E\u009c\u0081o\b\u009aî\u0093<¥{óñ¹<#ªe¤\u0015`:Á\u0018"
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
e = var6;
f = new Integer[13];
l = new zw();
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "/IG¦\u0081f7ÆjÇ\u0095º\u0002Íì1";
var5 = "/IG¦\u0081f7ÆjÇ\u0095º\u0002Íì1".length();
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

var17 = "\ry\u00adr¯jB.à\n\u0092C\u0090Ï)ySª¡U\u0001\u0006¤äPA\u0089\u009dc\u000e*\u0013H71¬\u0013\u000b%\u001aT7\u0003\u001bí\u0019HÇïÞµ/]\u0011ÄÍ¿\b\ru\u008f\u0011\u0007\u0005\u0003\u0086\u001e|\"gÕeix|'Éa\u001cËYP\\\u0096ÒUÑ\u001e_1³î\u0084\u0013\u0019¦@©\f\u0084\ng0Ù&ÓÔÓ$Zd\u0080\bBÓl\u0000¨íLF\u0092N\u000e=Ão\u0089\u0018¡j9Ý¸u½8æ\b\u0088ÕÁ\u0011\u001cÑy\u0087)*Ö¬\u001f\u0012";
var19 = "\ry\u00adr¯jB.à\n\u0092C\u0090Ï)ySª¡U\u0001\u0006¤äPA\u0089\u009dc\u000e*\u0013H71¬\u0013\u000b%\u001aT7\u0003\u001bí\u0019HÇïÞµ/]\u0011ÄÍ¿\b\ru\u008f\u0011\u0007\u0005\u0003\u0086\u001e|\"gÕeix|'Éa\u001cËYP\\\u0096ÒUÑ\u001e_1³î\u0084\u0013\u0019¦@©\f\u0084\ng0Ù&ÓÔÓ$Zd\u0080\bBÓl\u0000¨íLF\u0092N\u000e=Ão\u0089\u0018¡j9Ý¸u½8æ\b\u0088ÕÁ\u0011\u001cÑy\u0087)*Ö¬\u001f\u0012"
.length();
var16 = 128;
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26530;
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
throw new RuntimeException("su/catlean/zw", var10);
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
throw new RuntimeException("su/catlean/zw" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16206;
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
throw new RuntimeException("su/catlean/zw", var14);
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
throw new RuntimeException("su/catlean/zw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
