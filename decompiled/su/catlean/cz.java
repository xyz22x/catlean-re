package su.catlean;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL32C;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class cz {
@NotNull
public static final cz H;
@NotNull
private static List u;
@NotNull
private static List Y;
@NotNull
private static List F;
@NotNull
private static List k;
@NotNull
private static List n;
@NotNull
private static List M;
@NotNull
private static List K;
@Nullable
private static class_6364 q;
@Nullable
private static class_6364 e;
private static boolean g;
private static boolean E;
private static final long a = yz.a(-6327522248767712995L, 7685745101805475913L, MethodHandles.lookup().lookupClass()).a(132900495710087L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map i;

private cz() {
}

@NotNull
public final List F() {
return u;
}

public final void C(@NotNull List <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(19741, 1445439906035068777L ^ ax));
u = <set-?>;
}

@NotNull
public final List a() {
return Y;
}

public final void X(@NotNull List <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(19741, 1445445323856829169L ^ ax));
Y = <set-?>;
}

@NotNull
public final List x() {
return F;
}

public final void w(char a, @NotNull List <set-?>, int a, short a) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(6222, 4304144775867229002L ^ var5));
F = <set-?>;
}

@NotNull
public final List O() {
return k;
}

public final void U(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(19741, 1445467673137714790L ^ ax));
k = <set-?>;
}

@NotNull
public final List h() {
return n;
}

public final void O(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(19741, 1445404856439953445L ^ ax));
n = <set-?>;
}

@NotNull
public final List V() {
return M;
}

public final void u(@NotNull List <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(19741, 1445455110135944419L ^ ax));
M = <set-?>;
}

@NotNull
public final List N() {
return K;
}

public final void N(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(19741, 1445499763498549847L ^ ax));
K = <set-?>;
}

@Flow(
priority = -10
)
private final void o(Render3DEvent var1) {
long var2 = a ^ 50331990364337L;
long var4 = var2 ^ 60358961825652L;
long var6 = var2 ^ 56087550190013L;
long var8 = var2 ^ 122051805383702L;
long var10001 = var2 ^ 13642411324438L;
int var10 = (int)((var2 ^ 13642411324438L) >>> 32);
int var11 = (int)((var2 ^ 13642411324438L) << 32 >>> 48);
int var12 = (int)(var10001 << 48 >>> 48);
long var13 = var2 ^ 77143191392849L;
nz.B.k(var1.getStack(), var13);
this.p(var8, var1.getStack());
this.U(var1.getStack(), var4);
this.Y(var10, var1.getStack(), (short)var11, (char)var12);
this.n(var6, var1.getStack());
u.clear();
Y.clear();
F.clear();
k.clear();
n.clear();
M.clear();
K.clear();
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void n(long var1, class_4587 var3) {
var1 = a ^ var1;
long var4 = var1 ^ 105378644063030L;
long var6 = var1 ^ 57508861559732L;
long var8 = var1 ^ 22051688200419L;
long var10 = var1 ^ 10284064319323L;
boolean var17 = vm.a<"Å">(8079367087143161954L, var1);

boolean var10000;
label61: {
label60: {
try {
var10000 = Y.isEmpty();
if (!var17) {
break label61;
}

if (!var10000) {
break label60;
}
} catch (NoWhenBranchMatchedException var27) {
throw vm.a<"Å">(var27, 8212722200671945262L, var1);
}

var10000 = false;
break label61;
}

var10000 = true;
}

if (var10000) {
this.z(var6);
VertexFormat var10002 = class_290.field_1576;
Intrinsics.checkNotNullExpressionValue(class_290.field_1576, a<"n">(1699, 9129067237783083279L ^ var1));
int var10003 = Y.size() * b<"v">(12442, 3371375617026287137L ^ var1);
Object var12 = null;
byte var13 = 4;
boolean var14 = false;
int var15 = var10003;
VertexFormat var16 = var10002;
g7 var18 = new g7(var4, var16, var15, var14, var13, (DefaultConstructorMarker)var12);
Iterable var19 = Y;
boolean var20 = false;
Iterator var21 = var19.iterator();

label49: {
label48:
while (true) {
if (var21.hasNext()) {
Object var22 = var21.next();
x9 var23 = (x9)var22;
boolean var24 = false;

try {
H.a(var8, var18, var23.k(), var23.Q(), var23.Q());
} catch (NoWhenBranchMatchedException var25) {
throw vm.a<"Å">(var25, 8212722200671945262L, var1);
}

do {
try {
var10000 = var17;
if (var1 < 0L) {
break label49;
}

if (!var17) {
break label48;
}

if (var17) {
continue label48;
}
} catch (NoWhenBranchMatchedException var26) {
throw vm.a<"Å">(var26, 8212722200671945262L, var1);
}
} while (var1 < 0L);
}

RenderPipeline var30 = b6.R.d();
class_6364 var31 = q;
Intrinsics.checkNotNull(q);
g7.R(var10, var18, var30, (class_276)var31, null, var3.method_23760().method_23761(), null, null, b<"v">(19824, 4626190254395759572L ^ var1), null);
break;
}

var10000 = true;
}

g = var10000;
}
}

private final void p(long param1, class_4587 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/cz.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 4212836867741
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 79224145368392
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 93844800555760
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 124783161673183
// 020: lxor
// 021: lstore 10
// 023: pop2
// 024: ldc2_w 2140601309578329545
// 027: lload 1
// 028: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: istore 17
// 02f: getstatic su/catlean/cz.u Ljava/util/List;
// 032: checkcast java/util/Collection
// 035: invokeinterface java/util/Collection.isEmpty ()Z 1
// 03a: iload 17
// 03c: ifeq 050
// 03f: ifne 053
// 042: goto 04f
// 045: ldc2_w 2040745634579115909
// 048: lload 1
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 1
// 050: goto 054
// 053: bipush 0
// 054: lload 1
// 055: lconst_0
// 056: lcmp
// 057: iflt 068
// 05a: ifne 092
// 05d: getstatic su/catlean/cz.k Ljava/util/List;
// 060: checkcast java/util/Collection
// 063: invokeinterface java/util/Collection.isEmpty ()Z 1
// 068: iload 17
// 06a: ifeq 08b
// 06d: goto 07a
// 070: ldc2_w 2040745634579115909
// 073: lload 1
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: ifne 08e
// 07d: goto 08a
// 080: ldc2_w 2040745634579115909
// 083: lload 1
// 084: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: athrow
// 08a: bipush 1
// 08b: goto 08f
// 08e: bipush 0
// 08f: ifeq 1f1
// 092: new su/catlean/g7
// 095: dup
// 096: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 099: dup
// 09a: sipush 1699
// 09d: ldc2_w 9128983685636813988
// 0a0: lload 1
// 0a1: lxor
// 0a2: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/cz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0aa: getstatic su/catlean/cz.u Ljava/util/List;
// 0ad: invokeinterface java/util/List.size ()I 1
// 0b2: sipush 30943
// 0b5: ldc2_w 164900081370252227
// 0b8: lload 1
// 0b9: lxor
// 0ba: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: imul
// 0c0: getstatic su/catlean/cz.k Ljava/util/List;
// 0c3: invokeinterface java/util/List.size ()I 1
// 0c8: iadd
// 0c9: bipush 0
// 0ca: bipush 4
// 0cb: aconst_null
// 0cc: astore 12
// 0ce: istore 13
// 0d0: istore 14
// 0d2: istore 15
// 0d4: astore 16
// 0d6: lload 4
// 0d8: aload 16
// 0da: iload 15
// 0dc: iload 14
// 0de: iload 13
// 0e0: aload 12
// 0e2: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 0e5: astore 18
// 0e7: getstatic su/catlean/cz.u Ljava/util/List;
// 0ea: checkcast java/lang/Iterable
// 0ed: astore 19
// 0ef: bipush 0
// 0f0: istore 20
// 0f2: aload 19
// 0f4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0f9: astore 21
// 0fb: aload 21
// 0fd: invokeinterface java/util/Iterator.hasNext ()Z 1
// 102: ifeq 157
// 105: aload 21
// 107: lload 1
// 108: lconst_0
// 109: lcmp
// 10a: iflt 16a
// 10d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 112: astore 22
// 114: aload 22
// 116: checkcast su/catlean/x9
// 119: astore 23
// 11b: bipush 0
// 11c: istore 24
// 11e: getstatic su/catlean/cz.H Lsu/catlean/cz;
// 121: lload 6
// 123: aload 18
// 125: aload 23
// 127: invokevirtual su/catlean/x9.k ()Lnet/minecraft/class_238;
// 12a: aload 23
// 12c: invokevirtual su/catlean/x9.Q ()Ljava/awt/Color;
// 12f: aload 23
// 131: invokevirtual su/catlean/x9.X ()Ljava/awt/Color;
// 134: invokevirtual su/catlean/cz.a (JLsu/catlean/g7;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;)V
// 137: nop
// 138: nop
// 139: nop
// 13a: iload 17
// 13c: ifeq 163
// 13f: iload 17
// 141: ifne 0fb
// 144: lload 1
// 145: lconst_0
// 146: lcmp
// 147: iflt 13a
// 14a: goto 157
// 14d: ldc2_w 2040745634579115909
// 150: lload 1
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: nop
// 158: getstatic su/catlean/cz.k Ljava/util/List;
// 15b: checkcast java/lang/Iterable
// 15e: astore 19
// 160: bipush 0
// 161: istore 20
// 163: aload 19
// 165: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 16a: astore 21
// 16c: aload 21
// 16e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 173: ifeq 1ca
// 176: aload 21
// 178: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 17d: astore 22
// 17f: aload 22
// 181: checkcast su/catlean/to
// 184: astore 23
// 186: bipush 0
// 187: istore 24
// 189: getstatic su/catlean/cz.H Lsu/catlean/cz;
// 18c: aload 23
// 18e: invokevirtual su/catlean/to.y ()Lnet/minecraft/class_238;
// 191: aload 18
// 193: aload 23
// 195: invokevirtual su/catlean/to.T ()Ljava/awt/Color;
// 198: aload 23
// 19a: invokevirtual su/catlean/to.s ()Lnet/minecraft/class_2350;
// 19d: lload 10
// 19f: dup2_x1
// 1a0: pop2
// 1a1: invokespecial su/catlean/cz.x (Lnet/minecraft/class_238;Lsu/catlean/g7;Ljava/awt/Color;JLnet/minecraft/class_2350;)V
// 1a4: nop
// 1a5: nop
// 1a6: nop
// 1a7: iload 17
// 1a9: lload 1
// 1aa: lconst_0
// 1ab: lcmp
// 1ac: ifle 1b4
// 1af: ifeq 1cb
// 1b2: iload 17
// 1b4: ifne 16c
// 1b7: lload 1
// 1b8: lconst_0
// 1b9: lcmp
// 1ba: ifle 1a7
// 1bd: goto 1ca
// 1c0: ldc2_w 2040745634579115909
// 1c3: lload 1
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: nop
// 1cb: lload 8
// 1cd: aload 18
// 1cf: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 1d2: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 1d5: aconst_null
// 1d6: aconst_null
// 1d7: aload 3
// 1d8: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 1db: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 1de: aconst_null
// 1df: aconst_null
// 1e0: sipush 28665
// 1e3: ldc2_w 331086792897451246
// 1e6: lload 1
// 1e7: lxor
// 1e8: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ed: aconst_null
// 1ee: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 1f1: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void Y(int var1, class_4587 var2, short var3, char var4) {
long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
long var7 = var5 ^ 66516164049390L;
long var9 = var5 ^ 59583201932016L;
int var11 = (int)((var5 ^ 30887141849518L) >>> 32);
long var12 = (var5 ^ 30887141849518L) << 32 >>> 32;
int var14 = (int)((var5 ^ 138228751309003L) >>> 56);
long var15 = (var5 ^ 138228751309003L) << 8 >>> 8;
byte var20 = vm.a<"Å">(-6547254617602814252L, var5);

boolean var10000;
label61: {
label60: {
try {
var10000 = K.isEmpty();
if (var20 != 0) {
break label61;
}

if (!var10000) {
break label60;
}
} catch (NoWhenBranchMatchedException var30) {
throw vm.a<"Å">(var30, -6606133871617386619L, var5);
}

var10000 = 0;
break label61;
}

var10000 = 1;
}

if (var10000) {
GL32C.glEnable(b<"v">(3102, 3183914156798512911L ^ var5));
GL32C.glHint(b<"v">(12934, 2939648967470789017L ^ var5), b<"v">(30603, 2320399949978760344L ^ var5));
VertexFormat var10002 = class_290.field_1576;
Intrinsics.checkNotNullExpressionValue(class_290.field_1576, a<"n">(32457, 8446055760842208455L ^ var5));
int var10003 = K.size();
boolean var17 = true;
int var18 = var10003;
VertexFormat var19 = var10002;
g7 var21 = new g7(var11, var12, var19, var18, var17);
Iterable var22 = K;
boolean var23 = false;
Iterator var24 = var22.iterator();

label49: {
label48:
while (true) {
if (var24.hasNext()) {
Object var25 = var24.next();
oj var26 = (oj)var25;
boolean var27 = false;

try {
v((byte)var14, H, var21, var26.D(), var26.E(), var15, var26.P(), var26.c(), false, b<"v">(22777, 9013989402540596196L ^ var5), null);
} catch (NoWhenBranchMatchedException var28) {
throw vm.a<"Å">(var28, -6606133871617386619L, var5);
}

do {
try {
var10000 = var20;
if (var3 > 0) {
break label49;
}

if (var20 != 0) {
break label48;
}

if (var20 == 0) {
continue label48;
}
} catch (NoWhenBranchMatchedException var29) {
throw vm.a<"Å">(var29, -6606133871617386619L, var5);
}
} while (var1 < 0);
}

RenderPipeline var32 = b6.R.V();
class_276 var33 = zf.F(var7).method_1522();
Intrinsics.checkNotNullExpressionValue(var33, a<"n">(11880, 1828252923292345447L ^ var5));
g7.R(var9, var21, var32, var33, null, var2.method_23760().method_23761(), null, null, b<"v">(8175, 6967631219268492535L ^ var5), null);
break;
}

var10000 = b<"v">(17519, 7825218328058808180L ^ var5);
}

GL32C.glDisable(var10000);
}
}

private final void U(class_4587 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/cz.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 124794646765621
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 7637344864908
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 46935286003531
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 77582928966663
// 020: lxor
// 021: dup2
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 10
// 028: dup2
// 029: bipush 16
// 02b: lshl
// 02c: bipush 48
// 02e: lushr
// 02f: l2i
// 030: istore 11
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 32
// 038: lushr
// 039: l2i
// 03a: istore 12
// 03c: pop2
// 03d: dup2
// 03e: ldc2_w 14010166264210
// 041: lxor
// 042: lstore 13
// 044: dup2
// 045: ldc2_w 42444149230284
// 048: lxor
// 049: dup2
// 04a: bipush 32
// 04c: lushr
// 04d: l2i
// 04e: istore 15
// 050: dup2
// 051: bipush 32
// 053: lshl
// 054: bipush 32
// 056: lushr
// 057: lstore 16
// 059: pop2
// 05a: dup2
// 05b: ldc2_w 34691782274924
// 05e: lxor
// 05f: lstore 18
// 061: dup2
// 062: ldc2_w 40459044625309
// 065: lxor
// 066: lstore 20
// 068: pop2
// 069: ldc2_w -7619738657023214154
// 06c: lload 2
// 06d: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: istore 31
// 074: getstatic su/catlean/cz.F Ljava/util/List;
// 077: checkcast java/util/Collection
// 07a: invokeinterface java/util/Collection.isEmpty ()Z 1
// 07f: iload 31
// 081: ifne 095
// 084: ifne 098
// 087: goto 094
// 08a: ldc2_w -7552406060993092377
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: bipush 1
// 095: goto 099
// 098: bipush 0
// 099: lload 2
// 09a: lconst_0
// 09b: lcmp
// 09c: iflt 0ad
// 09f: ifne 112
// 0a2: getstatic su/catlean/cz.n Ljava/util/List;
// 0a5: checkcast java/util/Collection
// 0a8: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0ad: iload 31
// 0af: ifne 0d0
// 0b2: goto 0bf
// 0b5: ldc2_w -7552406060993092377
// 0b8: lload 2
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: ifne 0d3
// 0c2: goto 0cf
// 0c5: ldc2_w -7552406060993092377
// 0c8: lload 2
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: bipush 1
// 0d0: goto 0d4
// 0d3: bipush 0
// 0d4: lload 2
// 0d5: lconst_0
// 0d6: lcmp
// 0d7: ifle 0e8
// 0da: ifne 112
// 0dd: getstatic su/catlean/cz.M Ljava/util/List;
// 0e0: checkcast java/util/Collection
// 0e3: invokeinterface java/util/Collection.isEmpty ()Z 1
// 0e8: iload 31
// 0ea: ifne 10b
// 0ed: goto 0fa
// 0f0: ldc2_w -7552406060993092377
// 0f3: lload 2
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: ifne 10e
// 0fd: goto 10a
// 100: ldc2_w -7552406060993092377
// 103: lload 2
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: bipush 1
// 10b: goto 10f
// 10e: bipush 0
// 10f: ifeq 403
// 112: lload 2
// 113: lconst_0
// 114: lcmp
// 115: iflt 179
// 118: getstatic su/catlean/ew.O Lsu/catlean/ew;
// 11b: iload 10
// 11d: i2c
// 11e: iload 11
// 120: i2s
// 121: iload 12
// 123: invokevirtual su/catlean/ew.P (CSI)Lsu/catlean/lg;
// 126: getstatic su/catlean/lg.NEW Lsu/catlean/lg;
// 129: if_acmpne 14c
// 12c: goto 139
// 12f: ldc2_w -7552406060993092377
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: aload 0
// 13a: lload 4
// 13c: invokespecial su/catlean/cz.X (J)V
// 13f: goto 14c
// 142: ldc2_w -7552406060993092377
// 145: lload 2
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: sipush 17519
// 14f: ldc2_w 7825277105406243862
// 152: lload 2
// 153: lxor
// 154: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: invokestatic org/lwjgl/opengl/GL32C.glEnable (I)V
// 15c: sipush 3774
// 15f: ldc2_w 7308689122234810050
// 162: lload 2
// 163: lxor
// 164: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: sipush 25546
// 16c: ldc2_w 7776601609779205054
// 16f: lload 2
// 170: lxor
// 171: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: invokestatic org/lwjgl/opengl/GL32C.glHint (II)V
// 179: new su/catlean/g7
// 17c: dup
// 17d: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 180: dup
// 181: sipush 1699
// 184: ldc2_w 9129064379274002374
// 187: lload 2
// 188: lxor
// 189: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/cz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 191: getstatic su/catlean/cz.M Ljava/util/List;
// 194: invokeinterface java/util/List.size ()I 1
// 199: getstatic su/catlean/cz.n Ljava/util/List;
// 19c: invokeinterface java/util/List.size ()I 1
// 1a1: bipush 4
// 1a2: imul
// 1a3: iadd
// 1a4: getstatic su/catlean/cz.F Ljava/util/List;
// 1a7: invokeinterface java/util/List.size ()I 1
// 1ac: sipush 28160
// 1af: ldc2_w 498358277978414715
// 1b2: lload 2
// 1b3: lxor
// 1b4: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: imul
// 1ba: iadd
// 1bb: bipush 1
// 1bc: istore 22
// 1be: istore 23
// 1c0: astore 24
// 1c2: iload 15
// 1c4: lload 16
// 1c6: aload 24
// 1c8: iload 23
// 1ca: iload 22
// 1cc: invokespecial su/catlean/g7.<init> (IJLcom/mojang/blaze3d/vertex/VertexFormat;IZ)V
// 1cf: astore 32
// 1d1: getstatic su/catlean/cz.F Ljava/util/List;
// 1d4: checkcast java/lang/Iterable
// 1d7: astore 33
// 1d9: bipush 0
// 1da: istore 34
// 1dc: aload 33
// 1de: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1e3: astore 35
// 1e5: aload 35
// 1e7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1ec: ifeq 240
// 1ef: aload 35
// 1f1: lload 2
// 1f2: lconst_0
// 1f3: lcmp
// 1f4: iflt 253
// 1f7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1fc: astore 36
// 1fe: aload 36
// 200: checkcast su/catlean/x9
// 203: astore 37
// 205: bipush 0
// 206: istore 38
// 208: getstatic su/catlean/cz.H Lsu/catlean/cz;
// 20b: aload 37
// 20d: invokevirtual su/catlean/x9.k ()Lnet/minecraft/class_238;
// 210: aload 32
// 212: aload 37
// 214: invokevirtual su/catlean/x9.Q ()Ljava/awt/Color;
// 217: aload 37
// 219: invokevirtual su/catlean/x9.X ()Ljava/awt/Color;
// 21c: lload 18
// 21e: invokespecial su/catlean/cz.Z (Lnet/minecraft/class_238;Lsu/catlean/g7;Ljava/awt/Color;Ljava/awt/Color;J)V
// 221: nop
// 222: nop
// 223: iload 31
// 225: ifne 24c
// 228: iload 31
// 22a: ifeq 1e5
// 22d: lload 2
// 22e: lconst_0
// 22f: lcmp
// 230: ifle 223
// 233: goto 240
// 236: ldc2_w -7552406060993092377
// 239: lload 2
// 23a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23f: athrow
// 240: nop
// 241: getstatic su/catlean/cz.n Ljava/util/List;
// 244: checkcast java/lang/Iterable
// 247: astore 33
// 249: bipush 0
// 24a: istore 34
// 24c: aload 33
// 24e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 253: astore 35
// 255: aload 35
// 257: invokeinterface java/util/Iterator.hasNext ()Z 1
// 25c: ifeq 2b2
// 25f: aload 35
// 261: lload 2
// 262: lconst_0
// 263: lcmp
// 264: iflt 2c5
// 267: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 26c: astore 36
// 26e: aload 36
// 270: checkcast su/catlean/to
// 273: astore 37
// 275: bipush 0
// 276: istore 38
// 278: getstatic su/catlean/cz.H Lsu/catlean/cz;
// 27b: aload 37
// 27d: invokevirtual su/catlean/to.y ()Lnet/minecraft/class_238;
// 280: lload 8
// 282: dup2_x1
// 283: pop2
// 284: aload 32
// 286: aload 37
// 288: invokevirtual su/catlean/to.T ()Ljava/awt/Color;
// 28b: aload 37
// 28d: invokevirtual su/catlean/to.s ()Lnet/minecraft/class_2350;
// 290: invokespecial su/catlean/cz.F (JLnet/minecraft/class_238;Lsu/catlean/g7;Ljava/awt/Color;Lnet/minecraft/class_2350;)V
// 293: nop
// 294: nop
// 295: iload 31
// 297: ifne 2be
// 29a: iload 31
// 29c: ifeq 255
// 29f: lload 2
// 2a0: lconst_0
// 2a1: lcmp
// 2a2: ifle 295
// 2a5: goto 2b2
// 2a8: ldc2_w -7552406060993092377
// 2ab: lload 2
// 2ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b1: athrow
// 2b2: nop
// 2b3: getstatic su/catlean/cz.M Ljava/util/List;
// 2b6: checkcast java/lang/Iterable
// 2b9: astore 33
// 2bb: bipush 0
// 2bc: istore 34
// 2be: aload 33
// 2c0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2c5: astore 35
// 2c7: aload 35
// 2c9: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2ce: ifeq 32c
// 2d1: aload 35
// 2d3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2d8: astore 36
// 2da: aload 36
// 2dc: checkcast su/catlean/oj
// 2df: astore 37
// 2e1: bipush 0
// 2e2: istore 38
// 2e4: getstatic su/catlean/cz.H Lsu/catlean/cz;
// 2e7: aload 32
// 2e9: aload 37
// 2eb: invokevirtual su/catlean/oj.D ()Lnet/minecraft/class_243;
// 2ee: aload 37
// 2f0: invokevirtual su/catlean/oj.E ()Lnet/minecraft/class_243;
// 2f3: aload 37
// 2f5: invokevirtual su/catlean/oj.P ()Ljava/awt/Color;
// 2f8: aload 37
// 2fa: invokevirtual su/catlean/oj.c ()Ljava/awt/Color;
// 2fd: aload 37
// 2ff: invokevirtual su/catlean/oj.H ()Z
// 302: lload 20
// 304: invokespecial su/catlean/cz.d (Lsu/catlean/g7;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZJ)V
// 307: nop
// 308: nop
// 309: lload 2
// 30a: lconst_0
// 30b: lcmp
// 30c: iflt 32d
// 30f: iload 31
// 311: ifne 32d
// 314: iload 31
// 316: ifeq 2c7
// 319: lload 2
// 31a: lconst_0
// 31b: lcmp
// 31c: ifle 309
// 31f: goto 32c
// 322: ldc2_w -7552406060993092377
// 325: lload 2
// 326: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32b: athrow
// 32c: nop
// 32d: aload 32
// 32f: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 332: invokevirtual su/catlean/b6.w ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 335: getstatic su/catlean/ew.O Lsu/catlean/ew;
// 338: iload 10
// 33a: i2c
// 33b: iload 11
// 33d: i2s
// 33e: iload 12
// 340: invokevirtual su/catlean/ew.P (CSI)Lsu/catlean/lg;
// 343: getstatic su/catlean/lg.OLD Lsu/catlean/lg;
// 346: if_acmpne 35e
// 349: lload 6
// 34b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 34e: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 351: goto 368
// 354: ldc2_w -7552406060993092377
// 357: lload 2
// 358: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35d: athrow
// 35e: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 361: dup
// 362: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 365: checkcast net/minecraft/class_276
// 368: astore 33
// 36a: aload 33
// 36c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 36f: aload 33
// 371: aconst_null
// 372: aload 1
// 373: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 376: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 379: aconst_null
// 37a: aconst_null
// 37b: sipush 19824
// 37e: ldc2_w 4626184595704511773
// 381: lload 2
// 382: lxor
// 383: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 388: aconst_null
// 389: astore 22
// 38b: istore 23
// 38d: astore 24
// 38f: astore 25
// 391: astore 26
// 393: astore 27
// 395: astore 28
// 397: astore 29
// 399: astore 30
// 39b: lload 13
// 39d: aload 30
// 39f: aload 29
// 3a1: aload 28
// 3a3: aload 27
// 3a5: aload 26
// 3a7: aload 25
// 3a9: aload 24
// 3ab: iload 23
// 3ad: aload 22
// 3af: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 3b2: lload 2
// 3b3: lconst_0
// 3b4: lcmp
// 3b5: ifle 3cd
// 3b8: sipush 17519
// 3bb: ldc2_w 7825277105406243862
// 3be: lload 2
// 3bf: lxor
// 3c0: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c5: iload 31
// 3c7: ifne 3fc
// 3ca: invokestatic org/lwjgl/opengl/GL32C.glDisable (I)V
// 3cd: getstatic su/catlean/ew.O Lsu/catlean/ew;
// 3d0: iload 10
// 3d2: i2c
// 3d3: iload 11
// 3d5: i2s
// 3d6: iload 12
// 3d8: invokevirtual su/catlean/ew.P (CSI)Lsu/catlean/lg;
// 3db: getstatic su/catlean/lg.NEW Lsu/catlean/lg;
// 3de: if_acmpne 3ff
// 3e1: goto 3ee
// 3e4: ldc2_w -7552406060993092377
// 3e7: lload 2
// 3e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ed: athrow
// 3ee: bipush 1
// 3ef: goto 3fc
// 3f2: ldc2_w -7552406060993092377
// 3f5: lload 2
// 3f6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fb: athrow
// 3fc: goto 400
// 3ff: bipush 0
// 400: putstatic su/catlean/cz.E Z
// 403: return
}

@Flow
private final void G(Render2DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/cz.a J
// 003: ldc2_w 118139666272145
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 17401901771172
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 91334279476951
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 66144983317027
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 98262955146697
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 119580411625105
// 029: lxor
// 02a: lstore 12
// 02c: pop2
// 02d: ldc2_w 7645447452390277613
// 030: lload 2
// 031: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: istore 14
// 038: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 03b: iload 14
// 03d: ifne 137
// 040: ifnull 134
// 043: goto 050
// 046: ldc2_w 7740319215106463932
// 049: lload 2
// 04a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: athrow
// 050: getstatic su/catlean/cz.g Z
// 053: iload 14
// 055: ifne 131
// 058: goto 065
// 05b: ldc2_w 7740319215106463932
// 05e: lload 2
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: ifeq 134
// 068: goto 075
// 06b: ldc2_w 7740319215106463932
// 06e: lload 2
// 06f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: athrow
// 075: new su/catlean/g7
// 078: dup
// 079: lload 4
// 07b: aconst_null
// 07c: bipush 0
// 07d: bipush 0
// 07e: sipush 31591
// 081: ldc2_w 4270241161299179347
// 084: lload 2
// 085: lxor
// 086: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: aconst_null
// 08c: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 08f: lload 12
// 091: invokevirtual su/catlean/g7.u (J)Lsu/catlean/g7;
// 094: lload 10
// 096: dup2_x1
// 097: pop2
// 098: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 09b: invokevirtual su/catlean/b6.z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 09e: lload 6
// 0a0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a3: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0a6: dup
// 0a7: sipush 30950
// 0aa: ldc2_w 1913517856643874265
// 0ad: lload 2
// 0ae: lxor
// 0af: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/cz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b7: getstatic su/catlean/u.I Lsu/catlean/u;
// 0ba: invokevirtual su/catlean/u.E ()Lnet/minecraft/class_11280;
// 0bd: new su/catlean/z_
// 0c0: dup
// 0c1: new net/minecraft/class_241
// 0c4: dup
// 0c5: fconst_1
// 0c6: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 0c9: dup
// 0ca: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0cd: getfield net/minecraft/class_6364.field_1482 I
// 0d0: i2f
// 0d1: fdiv
// 0d2: fconst_1
// 0d3: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 0d6: dup
// 0d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0da: getfield net/minecraft/class_6364.field_1481 I
// 0dd: i2f
// 0de: fdiv
// 0df: invokespecial net/minecraft/class_241.<init> (FF)V
// 0e2: lload 8
// 0e4: dup2_x1
// 0e5: pop2
// 0e6: invokespecial su/catlean/z_.<init> (JLnet/minecraft/class_241;)V
// 0e9: checkcast net/minecraft/class_11280$class_11281
// 0ec: invokevirtual net/minecraft/class_11280.method_71102 (Lnet/minecraft/class_11280$class_11281;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
// 0ef: aconst_null
// 0f0: aconst_null
// 0f1: sipush 14313
// 0f4: ldc2_w 6281473090452337364
// 0f7: lload 2
// 0f8: lxor
// 0f9: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/cz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 101: dup
// 102: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 105: invokevirtual net/minecraft/class_6364.method_71639 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 108: dup
// 109: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 10c: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 10f: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 112: sipush 17405
// 115: ldc2_w 2496636649090879454
// 118: lload 2
// 119: lxor
// 11a: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: aconst_null
// 120: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 123: bipush 0
// 124: goto 131
// 127: ldc2_w 7740319215106463932
// 12a: lload 2
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: putstatic su/catlean/cz.g Z
// 134: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 137: ifnull 21e
// 13a: getstatic su/catlean/cz.E Z
// 13d: iload 14
// 13f: ifne 21b
// 142: goto 14f
// 145: ldc2_w 7740319215106463932
// 148: lload 2
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: ifeq 21e
// 152: goto 15f
// 155: ldc2_w 7740319215106463932
// 158: lload 2
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: new su/catlean/g7
// 162: dup
// 163: lload 4
// 165: aconst_null
// 166: bipush 0
// 167: bipush 0
// 168: sipush 4544
// 16b: ldc2_w 8782597654683573740
// 16e: lload 2
// 16f: lxor
// 170: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: aconst_null
// 176: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 179: lload 12
// 17b: invokevirtual su/catlean/g7.u (J)Lsu/catlean/g7;
// 17e: lload 10
// 180: dup2_x1
// 181: pop2
// 182: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 185: invokevirtual su/catlean/b6.X ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 188: lload 6
// 18a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 18d: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 190: dup
// 191: sipush 30950
// 194: ldc2_w 1913517856643874265
// 197: lload 2
// 198: lxor
// 199: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/cz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1a1: getstatic su/catlean/u.I Lsu/catlean/u;
// 1a4: invokevirtual su/catlean/u.E ()Lnet/minecraft/class_11280;
// 1a7: new su/catlean/z_
// 1aa: dup
// 1ab: new net/minecraft/class_241
// 1ae: dup
// 1af: fconst_1
// 1b0: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 1b3: dup
// 1b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1b7: getfield net/minecraft/class_6364.field_1482 I
// 1ba: i2f
// 1bb: fdiv
// 1bc: fconst_1
// 1bd: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 1c0: dup
// 1c1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1c4: getfield net/minecraft/class_6364.field_1481 I
// 1c7: i2f
// 1c8: fdiv
// 1c9: invokespecial net/minecraft/class_241.<init> (FF)V
// 1cc: lload 8
// 1ce: dup2_x1
// 1cf: pop2
// 1d0: invokespecial su/catlean/z_.<init> (JLnet/minecraft/class_241;)V
// 1d3: checkcast net/minecraft/class_11280$class_11281
// 1d6: invokevirtual net/minecraft/class_11280.method_71102 (Lnet/minecraft/class_11280$class_11281;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
// 1d9: aconst_null
// 1da: aconst_null
// 1db: sipush 23613
// 1de: ldc2_w 1805240505599219972
// 1e1: lload 2
// 1e2: lxor
// 1e3: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/cz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 1eb: dup
// 1ec: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1ef: invokevirtual net/minecraft/class_6364.method_71639 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 1f2: dup
// 1f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1f6: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 1f9: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 1fc: sipush 4980
// 1ff: ldc2_w 2883178341414362945
// 202: lload 2
// 203: lxor
// 204: invokedynamic v (IJ)I bsm=su/catlean/cz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 209: aconst_null
// 20a: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 20d: bipush 0
// 20e: goto 21b
// 211: ldc2_w 7740319215106463932
// 214: lload 2
// 215: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21a: athrow
// 21b: putstatic su/catlean/cz.E Z
// 21e: return
}

private final void d(g7 param1, class_243 param2, class_243 param3, Color param4, Color param5, boolean param6, long param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/cz.a J
// 003: lload 7
// 005: lxor
// 006: lstore 7
// 008: lload 7
// 00a: dup2
// 00b: ldc2_w 8299075745054
// 00e: lxor
// 00f: lstore 9
// 011: dup2
// 012: ldc2_w 44024067558692
// 015: lxor
// 016: lstore 11
// 018: dup2
// 019: ldc2_w 110835613584330
// 01c: lxor
// 01d: lstore 13
// 01f: pop2
// 020: ldc2_w -1597861500194799068
// 023: lload 7
// 025: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02a: istore 15
// 02c: iload 6
// 02e: iload 15
// 030: ifne 067
// 033: ifne 06b
// 036: goto 044
// 039: ldc2_w -1683651584628384907
// 03c: lload 7
// 03e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: athrow
// 044: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 047: invokevirtual su/catlean/zi.K ()Lnet/minecraft/class_4604;
// 04a: aload 3
// 04b: getfield net/minecraft/class_243.field_1352 D
// 04e: aload 3
// 04f: getfield net/minecraft/class_243.field_1351 D
// 052: aload 3
// 053: getfield net/minecraft/class_243.field_1350 D
// 056: invokevirtual net/minecraft/class_4604.method_74404 (DDD)Z
// 059: goto 067
// 05c: ldc2_w -1683651584628384907
// 05f: lload 7
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: ifne 06b
// 06a: return
// 06b: lload 9
// 06d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 070: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 073: getfield net/minecraft/class_898.field_4686 Lnet/minecraft/class_4184;
// 076: dup
// 077: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 07a: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 07d: dup
// 07e: sipush 24485
// 081: ldc2_w 4839862691315341662
// 084: lload 7
// 086: lxor
// 087: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/cz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08f: astore 16
// 091: aload 2
// 092: getfield net/minecraft/class_243.field_1352 D
// 095: aload 16
// 097: invokevirtual net/minecraft/class_243.method_10216 ()D
// 09a: dsub
// 09b: d2f
// 09c: fstore 17
// 09e: aload 2
// 09f: getfield net/minecraft/class_243.field_1351 D
// 0a2: aload 16
// 0a4: invokevirtual net/minecraft/class_243.method_10214 ()D
// 0a7: dsub
// 0a8: d2f
// 0a9: fstore 18
// 0ab: aload 2
// 0ac: getfield net/minecraft/class_243.field_1350 D
// 0af: aload 16
// 0b1: invokevirtual net/minecraft/class_243.method_10215 ()D
// 0b4: dsub
// 0b5: d2f
// 0b6: fstore 19
// 0b8: aload 3
// 0b9: getfield net/minecraft/class_243.field_1352 D
// 0bc: aload 16
// 0be: invokevirtual net/minecraft/class_243.method_10216 ()D
// 0c1: dsub
// 0c2: d2f
// 0c3: fstore 20
// 0c5: aload 3
// 0c6: getfield net/minecraft/class_243.field_1351 D
// 0c9: aload 16
// 0cb: invokevirtual net/minecraft/class_243.method_10214 ()D
// 0ce: dsub
// 0cf: d2f
// 0d0: fstore 21
// 0d2: aload 3
// 0d3: getfield net/minecraft/class_243.field_1350 D
// 0d6: aload 16
// 0d8: invokevirtual net/minecraft/class_243.method_10215 ()D
// 0db: dsub
// 0dc: d2f
// 0dd: fstore 22
// 0df: aload 1
// 0e0: fload 17
// 0e2: lload 11
// 0e4: fload 18
// 0e6: fload 19
// 0e8: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0eb: aload 4
// 0ed: lload 13
// 0ef: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0f2: pop
// 0f3: aload 1
// 0f4: fload 20
// 0f6: lload 11
// 0f8: fload 21
// 0fa: fload 22
// 0fc: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0ff: aload 5
// 101: lload 13
// 103: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 106: pop
// 107: return
}

static void v(byte var0, cz var1, g7 var2, class_243 var3, class_243 var4, long var5, Color var7, Color var8, boolean var9, int var10, Object var11) {
long var12 = ((long)var0 << 56 | var5 << 8 >>> 8) ^ a;
long var14 = var12 ^ 77260635558971L;
boolean var16 = vm.a<"Å">(-2745187408464645616L, var12);

int var10000;
label37: {
label36: {
try {
var10000 = var10 & b<"v">(31970, 4780814452335280948L ^ var12);
if (var16) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NoWhenBranchMatchedException var18) {
throw vm.a<"Å">(var18, -2840060271094355135L, var12);
}

var8 = var7;
}

var10000 = var10 & b<"v">(27010, 3580195922388751954L ^ var12);
}

label28: {
label27: {
try {
if (var16) {
break label27;
}

if (var10000 == 0) {
break label28;
}
} catch (NoWhenBranchMatchedException var17) {
throw vm.a<"Å">(var17, -2840060271094355135L, var12);
}

var10000 = 0;
}

var9 = var10000;
}

var1.d(var2, var3, var4, var7, var8, (boolean)var9, var14);
}

private final void Z(class_238 var1, g7 var2, Color var3, Color var4, long var5) {
var5 = a ^ var5;
long var7 = var5 ^ 66851481993711L;
long var9 = var5 ^ 21214777637333L;
long var11 = var5 ^ 105057999667003L;
class_4184 var10000 = zf.F(var7).method_1561().field_4686;
Intrinsics.checkNotNull(var10000);
class_243 var21 = var10000.method_71156();
Intrinsics.checkNotNullExpressionValue(var21, a<"n">(24485, 4839854716276190639L ^ var5));
class_243 var13 = var21;
float var14 = (float)(var1.field_1323 - var13.method_10216());
float var15 = (float)(var1.field_1322 - var13.method_10214());
float var16 = (float)(var1.field_1321 - var13.method_10215());
float var17 = (float)(var1.field_1320 - var13.method_10216());
float var18 = (float)(var1.field_1325 - var13.method_10214());
float var19 = (float)(var1.field_1324 - var13.method_10215());
var2.G(var14, var9, var15, var16).n(var3, var11);
var2.G(var14, var9, var15, var19).n(var3, var11);
var2.G(var14, var9, var15, var19).n(var3, var11);
var2.G(var17, var9, var15, var19).n(var3, var11);
var2.G(var17, var9, var15, var19).n(var3, var11);
var2.G(var17, var9, var15, var16).n(var3, var11);
var2.G(var17, var9, var15, var16).n(var3, var11);
var2.G(var14, var9, var15, var16).n(var3, var11);
var2.G(var14, var9, var18, var16).n(var4, var11);
var2.G(var14, var9, var18, var19).n(var4, var11);
var2.G(var14, var9, var18, var19).n(var4, var11);
var2.G(var17, var9, var18, var19).n(var4, var11);
var2.G(var17, var9, var18, var19).n(var4, var11);
var2.G(var17, var9, var18, var16).n(var4, var11);
var2.G(var17, var9, var18, var16).n(var4, var11);
var2.G(var14, var9, var18, var16).n(var4, var11);
var2.G(var14, var9, var15, var16).n(var3, var11);
var2.G(var14, var9, var18, var16).n(var4, var11);
var2.G(var17, var9, var15, var16).n(var3, var11);
var2.G(var17, var9, var18, var16).n(var4, var11);
var2.G(var17, var9, var15, var19).n(var3, var11);
var2.G(var17, var9, var18, var19).n(var4, var11);
var2.G(var14, var9, var15, var19).n(var3, var11);
var2.G(var14, var9, var18, var19).n(var4, var11);
}

private final void F(long param1, class_238 param3, g7 param4, Color param5, class_2350 param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/cz.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 10924861757896
// 00b: lxor
// 00c: lstore 7
// 00e: dup2
// 00f: ldc2_w 42235720606194
// 012: lxor
// 013: lstore 9
// 015: dup2
// 016: ldc2_w 117295801657116
// 019: lxor
// 01a: lstore 11
// 01c: pop2
// 01d: ldc2_w -4249903753627767054
// 020: lload 1
// 021: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: lload 7
// 028: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 02b: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 02e: getfield net/minecraft/class_898.field_4686 Lnet/minecraft/class_4184;
// 031: dup
// 032: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 035: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 038: dup
// 039: sipush 7004
// 03c: ldc2_w 2511940791700500857
// 03f: lload 1
// 040: lxor
// 041: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/cz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 049: astore 14
// 04b: aload 3
// 04c: getfield net/minecraft/class_238.field_1323 D
// 04f: aload 14
// 051: invokevirtual net/minecraft/class_243.method_10216 ()D
// 054: dsub
// 055: d2f
// 056: fstore 15
// 058: istore 13
// 05a: aload 3
// 05b: getfield net/minecraft/class_238.field_1322 D
// 05e: aload 14
// 060: invokevirtual net/minecraft/class_243.method_10214 ()D
// 063: dsub
// 064: d2f
// 065: fstore 16
// 067: aload 3
// 068: getfield net/minecraft/class_238.field_1321 D
// 06b: aload 14
// 06d: invokevirtual net/minecraft/class_243.method_10215 ()D
// 070: dsub
// 071: d2f
// 072: fstore 17
// 074: aload 3
// 075: getfield net/minecraft/class_238.field_1320 D
// 078: aload 14
// 07a: invokevirtual net/minecraft/class_243.method_10216 ()D
// 07d: dsub
// 07e: d2f
// 07f: fstore 18
// 081: aload 3
// 082: getfield net/minecraft/class_238.field_1325 D
// 085: aload 14
// 087: invokevirtual net/minecraft/class_243.method_10214 ()D
// 08a: dsub
// 08b: d2f
// 08c: fstore 19
// 08e: aload 3
// 08f: getfield net/minecraft/class_238.field_1324 D
// 092: aload 14
// 094: invokevirtual net/minecraft/class_243.method_10215 ()D
// 097: dsub
// 098: d2f
// 099: fstore 20
// 09b: iload 13
// 09d: ifne 17a
// 0a0: aload 6
// 0a2: getstatic su/catlean/sb.N [I
// 0a5: swap
// 0a6: invokevirtual net/minecraft/class_2350.ordinal ()I
// 0a9: iaload
// 0aa: tableswitch 1081 1 6 48 231 401 571 741 911
// 0d0: ldc2_w -4290670755684501597
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: aload 4
// 0dc: fload 15
// 0de: lload 9
// 0e0: fload 19
// 0e2: fload 17
// 0e4: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0e7: aload 5
// 0e9: lload 11
// 0eb: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0ee: pop
// 0ef: aload 4
// 0f1: fload 18
// 0f3: lload 9
// 0f5: fload 19
// 0f7: fload 17
// 0f9: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0fc: aload 5
// 0fe: lload 11
// 100: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 103: pop
// 104: aload 4
// 106: fload 18
// 108: lload 9
// 10a: fload 19
// 10c: fload 17
// 10e: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 111: aload 5
// 113: lload 11
// 115: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 118: pop
// 119: aload 4
// 11b: fload 18
// 11d: lload 9
// 11f: fload 19
// 121: fload 20
// 123: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 126: aload 5
// 128: lload 11
// 12a: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 12d: pop
// 12e: aload 4
// 130: fload 18
// 132: lload 9
// 134: fload 19
// 136: fload 20
// 138: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 13b: aload 5
// 13d: lload 11
// 13f: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 142: pop
// 143: aload 4
// 145: fload 15
// 147: lload 9
// 149: fload 19
// 14b: fload 20
// 14d: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 150: aload 5
// 152: lload 11
// 154: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 157: pop
// 158: aload 4
// 15a: fload 15
// 15c: lload 9
// 15e: fload 19
// 160: fload 20
// 162: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 165: aload 5
// 167: lload 11
// 169: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 16c: pop
// 16d: goto 17a
// 170: ldc2_w -4290670755684501597
// 173: lload 1
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: aload 4
// 17c: fload 15
// 17e: lload 9
// 180: fload 19
// 182: fload 17
// 184: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 187: aload 5
// 189: lload 11
// 18b: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 18e: goto 4eb
// 191: aload 4
// 193: fload 15
// 195: lload 9
// 197: fload 16
// 199: fload 17
// 19b: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 19e: aload 5
// 1a0: lload 11
// 1a2: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1a5: pop
// 1a6: aload 4
// 1a8: fload 18
// 1aa: lload 9
// 1ac: fload 16
// 1ae: fload 17
// 1b0: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1b3: aload 5
// 1b5: lload 11
// 1b7: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1ba: pop
// 1bb: aload 4
// 1bd: fload 18
// 1bf: lload 9
// 1c1: fload 16
// 1c3: fload 17
// 1c5: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1c8: aload 5
// 1ca: lload 11
// 1cc: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1cf: pop
// 1d0: aload 4
// 1d2: fload 18
// 1d4: lload 9
// 1d6: fload 16
// 1d8: fload 20
// 1da: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1dd: aload 5
// 1df: lload 11
// 1e1: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1e4: pop
// 1e5: aload 4
// 1e7: fload 18
// 1e9: lload 9
// 1eb: fload 16
// 1ed: fload 20
// 1ef: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1f2: aload 5
// 1f4: lload 11
// 1f6: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1f9: pop
// 1fa: aload 4
// 1fc: fload 15
// 1fe: lload 9
// 200: fload 16
// 202: fload 20
// 204: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 207: aload 5
// 209: lload 11
// 20b: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 20e: pop
// 20f: aload 4
// 211: fload 15
// 213: lload 9
// 215: fload 16
// 217: fload 20
// 219: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 21c: aload 5
// 21e: lload 11
// 220: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 223: pop
// 224: aload 4
// 226: fload 15
// 228: lload 9
// 22a: fload 16
// 22c: fload 17
// 22e: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 231: aload 5
// 233: lload 11
// 235: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 238: goto 4eb
// 23b: aload 4
// 23d: fload 15
// 23f: lload 9
// 241: fload 16
// 243: fload 17
// 245: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 248: aload 5
// 24a: lload 11
// 24c: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 24f: pop
// 250: aload 4
// 252: fload 18
// 254: lload 9
// 256: fload 16
// 258: fload 17
// 25a: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 25d: aload 5
// 25f: lload 11
// 261: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 264: pop
// 265: aload 4
// 267: fload 18
// 269: lload 9
// 26b: fload 16
// 26d: fload 17
// 26f: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 272: aload 5
// 274: lload 11
// 276: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 279: pop
// 27a: aload 4
// 27c: fload 18
// 27e: lload 9
// 280: fload 19
// 282: fload 17
// 284: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 287: aload 5
// 289: lload 11
// 28b: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 28e: pop
// 28f: aload 4
// 291: fload 18
// 293: lload 9
// 295: fload 19
// 297: fload 17
// 299: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 29c: aload 5
// 29e: lload 11
// 2a0: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2a3: pop
// 2a4: aload 4
// 2a6: fload 15
// 2a8: lload 9
// 2aa: fload 19
// 2ac: fload 17
// 2ae: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 2b1: aload 5
// 2b3: lload 11
// 2b5: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2b8: pop
// 2b9: aload 4
// 2bb: fload 15
// 2bd: lload 9
// 2bf: fload 19
// 2c1: fload 17
// 2c3: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 2c6: aload 5
// 2c8: lload 11
// 2ca: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2cd: pop
// 2ce: aload 4
// 2d0: fload 15
// 2d2: lload 9
// 2d4: fload 16
// 2d6: fload 17
// 2d8: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 2db: aload 5
// 2dd: lload 11
// 2df: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2e2: goto 4eb
// 2e5: aload 4
// 2e7: fload 15
// 2e9: lload 9
// 2eb: fload 16
// 2ed: fload 20
// 2ef: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 2f2: aload 5
// 2f4: lload 11
// 2f6: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2f9: pop
// 2fa: aload 4
// 2fc: fload 18
// 2fe: lload 9
// 300: fload 16
// 302: fload 20
// 304: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 307: aload 5
// 309: lload 11
// 30b: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 30e: pop
// 30f: aload 4
// 311: fload 18
// 313: lload 9
// 315: fload 16
// 317: fload 20
// 319: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 31c: aload 5
// 31e: lload 11
// 320: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 323: pop
// 324: aload 4
// 326: fload 18
// 328: lload 9
// 32a: fload 19
// 32c: fload 20
// 32e: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 331: aload 5
// 333: lload 11
// 335: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 338: pop
// 339: aload 4
// 33b: fload 18
// 33d: lload 9
// 33f: fload 19
// 341: fload 20
// 343: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 346: aload 5
// 348: lload 11
// 34a: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 34d: pop
// 34e: aload 4
// 350: fload 15
// 352: lload 9
// 354: fload 19
// 356: fload 20
// 358: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 35b: aload 5
// 35d: lload 11
// 35f: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 362: pop
// 363: aload 4
// 365: fload 15
// 367: lload 9
// 369: fload 19
// 36b: fload 20
// 36d: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 370: aload 5
// 372: lload 11
// 374: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 377: pop
// 378: aload 4
// 37a: fload 15
// 37c: lload 9
// 37e: fload 16
// 380: fload 20
// 382: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 385: aload 5
// 387: lload 11
// 389: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 38c: goto 4eb
// 38f: aload 4
// 391: fload 15
// 393: lload 9
// 395: fload 16
// 397: fload 17
// 399: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 39c: aload 5
// 39e: lload 11
// 3a0: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3a3: pop
// 3a4: aload 4
// 3a6: fload 15
// 3a8: lload 9
// 3aa: fload 16
// 3ac: fload 20
// 3ae: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 3b1: aload 5
// 3b3: lload 11
// 3b5: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3b8: pop
// 3b9: aload 4
// 3bb: fload 15
// 3bd: lload 9
// 3bf: fload 16
// 3c1: fload 20
// 3c3: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 3c6: aload 5
// 3c8: lload 11
// 3ca: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3cd: pop
// 3ce: aload 4
// 3d0: fload 15
// 3d2: lload 9
// 3d4: fload 19
// 3d6: fload 20
// 3d8: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 3db: aload 5
// 3dd: lload 11
// 3df: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3e2: pop
// 3e3: aload 4
// 3e5: fload 15
// 3e7: lload 9
// 3e9: fload 19
// 3eb: fload 20
// 3ed: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 3f0: aload 5
// 3f2: lload 11
// 3f4: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3f7: pop
// 3f8: aload 4
// 3fa: fload 15
// 3fc: lload 9
// 3fe: fload 19
// 400: fload 17
// 402: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 405: aload 5
// 407: lload 11
// 409: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 40c: pop
// 40d: aload 4
// 40f: fload 15
// 411: lload 9
// 413: fload 19
// 415: fload 17
// 417: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 41a: aload 5
// 41c: lload 11
// 41e: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 421: pop
// 422: aload 4
// 424: fload 15
// 426: lload 9
// 428: fload 16
// 42a: fload 17
// 42c: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 42f: aload 5
// 431: lload 11
// 433: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 436: goto 4eb
// 439: aload 4
// 43b: fload 18
// 43d: lload 9
// 43f: fload 16
// 441: fload 17
// 443: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 446: aload 5
// 448: lload 11
// 44a: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 44d: pop
// 44e: aload 4
// 450: fload 18
// 452: lload 9
// 454: fload 16
// 456: fload 20
// 458: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 45b: aload 5
// 45d: lload 11
// 45f: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 462: pop
// 463: aload 4
// 465: fload 18
// 467: lload 9
// 469: fload 16
// 46b: fload 20
// 46d: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 470: aload 5
// 472: lload 11
// 474: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 477: pop
// 478: aload 4
// 47a: fload 18
// 47c: lload 9
// 47e: fload 19
// 480: fload 20
// 482: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 485: aload 5
// 487: lload 11
// 489: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 48c: pop
// 48d: aload 4
// 48f: fload 18
// 491: lload 9
// 493: fload 19
// 495: fload 20
// 497: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 49a: aload 5
// 49c: lload 11
// 49e: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 4a1: pop
// 4a2: aload 4
// 4a4: fload 18
// 4a6: lload 9
// 4a8: fload 19
// 4aa: fload 17
// 4ac: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 4af: aload 5
// 4b1: lload 11
// 4b3: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 4b6: pop
// 4b7: aload 4
// 4b9: fload 18
// 4bb: lload 9
// 4bd: fload 19
// 4bf: fload 17
// 4c1: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 4c4: aload 5
// 4c6: lload 11
// 4c8: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 4cb: pop
// 4cc: aload 4
// 4ce: fload 18
// 4d0: lload 9
// 4d2: fload 16
// 4d4: fload 17
// 4d6: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 4d9: aload 5
// 4db: lload 11
// 4dd: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 4e0: goto 4eb
// 4e3: new kotlin/NoWhenBranchMatchedException
// 4e6: dup
// 4e7: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 4ea: athrow
// 4eb: pop
// 4ec: return
}

private final void x(class_238 param1, g7 param2, Color param3, long param4, class_2350 param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/cz.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 13026794184766
// 00e: lxor
// 00f: lstore 7
// 011: dup2
// 012: ldc2_w 39992200927236
// 015: lxor
// 016: lstore 9
// 018: dup2
// 019: ldc2_w 115004785745642
// 01c: lxor
// 01d: lstore 11
// 01f: pop2
// 020: lload 7
// 022: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 025: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 028: getfield net/minecraft/class_898.field_4686 Lnet/minecraft/class_4184;
// 02b: dup
// 02c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 02f: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 032: dup
// 033: sipush 24485
// 036: ldc2_w 4839866759555239038
// 039: lload 4
// 03b: lxor
// 03c: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/cz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 044: astore 14
// 046: aload 1
// 047: getfield net/minecraft/class_238.field_1323 D
// 04a: aload 14
// 04c: invokevirtual net/minecraft/class_243.method_10216 ()D
// 04f: dsub
// 050: d2f
// 051: fstore 15
// 053: aload 1
// 054: getfield net/minecraft/class_238.field_1322 D
// 057: aload 14
// 059: invokevirtual net/minecraft/class_243.method_10214 ()D
// 05c: dsub
// 05d: d2f
// 05e: fstore 16
// 060: aload 1
// 061: getfield net/minecraft/class_238.field_1321 D
// 064: aload 14
// 066: invokevirtual net/minecraft/class_243.method_10215 ()D
// 069: dsub
// 06a: d2f
// 06b: fstore 17
// 06d: ldc2_w 8963470867830381593
// 070: lload 4
// 072: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: aload 1
// 078: getfield net/minecraft/class_238.field_1320 D
// 07b: aload 14
// 07d: invokevirtual net/minecraft/class_243.method_10216 ()D
// 080: dsub
// 081: d2f
// 082: fstore 18
// 084: aload 1
// 085: getfield net/minecraft/class_238.field_1325 D
// 088: aload 14
// 08a: invokevirtual net/minecraft/class_243.method_10214 ()D
// 08d: dsub
// 08e: d2f
// 08f: fstore 19
// 091: istore 13
// 093: aload 1
// 094: getfield net/minecraft/class_238.field_1324 D
// 097: aload 14
// 099: invokevirtual net/minecraft/class_243.method_10215 ()D
// 09c: dsub
// 09d: d2f
// 09e: fstore 20
// 0a0: iload 13
// 0a2: ifeq 126
// 0a5: aload 6
// 0a7: getstatic su/catlean/sb.N [I
// 0aa: swap
// 0ab: invokevirtual net/minecraft/class_2350.ordinal ()I
// 0ae: iaload
// 0af: tableswitch 530 1 6 48 140 218 296 374 452
// 0d4: ldc2_w 9043926896939961941
// 0d7: lload 4
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: aload 2
// 0e0: fload 15
// 0e2: lload 9
// 0e4: fload 19
// 0e6: fload 17
// 0e8: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0eb: aload 3
// 0ec: lload 11
// 0ee: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0f1: pop
// 0f2: aload 2
// 0f3: fload 18
// 0f5: lload 9
// 0f7: fload 19
// 0f9: fload 17
// 0fb: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0fe: aload 3
// 0ff: lload 11
// 101: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 104: pop
// 105: aload 2
// 106: fload 18
// 108: lload 9
// 10a: fload 19
// 10c: fload 20
// 10e: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 111: aload 3
// 112: lload 11
// 114: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 117: pop
// 118: goto 126
// 11b: ldc2_w 9043926896939961941
// 11e: lload 4
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: aload 2
// 127: fload 15
// 129: lload 9
// 12b: fload 19
// 12d: fload 20
// 12f: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 132: aload 3
// 133: lload 11
// 135: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 138: goto 2c9
// 13b: aload 2
// 13c: fload 15
// 13e: lload 9
// 140: fload 16
// 142: fload 17
// 144: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 147: aload 3
// 148: lload 11
// 14a: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 14d: pop
// 14e: aload 2
// 14f: fload 18
// 151: lload 9
// 153: fload 16
// 155: fload 17
// 157: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 15a: aload 3
// 15b: lload 11
// 15d: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 160: pop
// 161: aload 2
// 162: fload 18
// 164: lload 9
// 166: fload 16
// 168: fload 20
// 16a: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 16d: aload 3
// 16e: lload 11
// 170: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 173: pop
// 174: aload 2
// 175: fload 15
// 177: lload 9
// 179: fload 16
// 17b: fload 20
// 17d: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 180: aload 3
// 181: lload 11
// 183: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 186: goto 2c9
// 189: aload 2
// 18a: fload 15
// 18c: lload 9
// 18e: fload 16
// 190: fload 17
// 192: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 195: aload 3
// 196: lload 11
// 198: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 19b: pop
// 19c: aload 2
// 19d: fload 18
// 19f: lload 9
// 1a1: fload 16
// 1a3: fload 17
// 1a5: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1a8: aload 3
// 1a9: lload 11
// 1ab: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1ae: pop
// 1af: aload 2
// 1b0: fload 18
// 1b2: lload 9
// 1b4: fload 19
// 1b6: fload 17
// 1b8: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1bb: aload 3
// 1bc: lload 11
// 1be: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1c1: pop
// 1c2: aload 2
// 1c3: fload 15
// 1c5: lload 9
// 1c7: fload 19
// 1c9: fload 17
// 1cb: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1ce: aload 3
// 1cf: lload 11
// 1d1: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1d4: goto 2c9
// 1d7: aload 2
// 1d8: fload 15
// 1da: lload 9
// 1dc: fload 16
// 1de: fload 20
// 1e0: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1e3: aload 3
// 1e4: lload 11
// 1e6: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1e9: pop
// 1ea: aload 2
// 1eb: fload 18
// 1ed: lload 9
// 1ef: fload 16
// 1f1: fload 20
// 1f3: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1f6: aload 3
// 1f7: lload 11
// 1f9: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1fc: pop
// 1fd: aload 2
// 1fe: fload 18
// 200: lload 9
// 202: fload 19
// 204: fload 20
// 206: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 209: aload 3
// 20a: lload 11
// 20c: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 20f: pop
// 210: aload 2
// 211: fload 15
// 213: lload 9
// 215: fload 19
// 217: fload 20
// 219: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 21c: aload 3
// 21d: lload 11
// 21f: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 222: goto 2c9
// 225: aload 2
// 226: fload 15
// 228: lload 9
// 22a: fload 16
// 22c: fload 17
// 22e: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 231: aload 3
// 232: lload 11
// 234: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 237: pop
// 238: aload 2
// 239: fload 15
// 23b: lload 9
// 23d: fload 16
// 23f: fload 20
// 241: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 244: aload 3
// 245: lload 11
// 247: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 24a: pop
// 24b: aload 2
// 24c: fload 15
// 24e: lload 9
// 250: fload 19
// 252: fload 20
// 254: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 257: aload 3
// 258: lload 11
// 25a: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 25d: pop
// 25e: aload 2
// 25f: fload 15
// 261: lload 9
// 263: fload 19
// 265: fload 17
// 267: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 26a: aload 3
// 26b: lload 11
// 26d: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 270: goto 2c9
// 273: aload 2
// 274: fload 18
// 276: lload 9
// 278: fload 16
// 27a: fload 17
// 27c: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 27f: aload 3
// 280: lload 11
// 282: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 285: pop
// 286: aload 2
// 287: fload 18
// 289: lload 9
// 28b: fload 16
// 28d: fload 20
// 28f: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 292: aload 3
// 293: lload 11
// 295: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 298: pop
// 299: aload 2
// 29a: fload 18
// 29c: lload 9
// 29e: fload 19
// 2a0: fload 20
// 2a2: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 2a5: aload 3
// 2a6: lload 11
// 2a8: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2ab: pop
// 2ac: aload 2
// 2ad: fload 18
// 2af: lload 9
// 2b1: fload 19
// 2b3: fload 17
// 2b5: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 2b8: aload 3
// 2b9: lload 11
// 2bb: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2be: goto 2c9
// 2c1: new kotlin/NoWhenBranchMatchedException
// 2c4: dup
// 2c5: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 2c8: athrow
// 2c9: pop
// 2ca: return
}

public final void a(long a, @NotNull g7 polygon, @NotNull class_238 box, @NotNull Color c, @NotNull Color c1) {
ax = a ^ ax;
long var7 = ax ^ 55704089850025L;
long var9 = ax ^ 32091993688211L;
long var11 = ax ^ 90057753661053L;

try {
Intrinsics.checkNotNullParameter(polygon, a<"n">(17435, 7502806652567652190L ^ ax));
Intrinsics.checkNotNullParameter(box, a<"n">(26027, 7805299897558673129L ^ ax));
Intrinsics.checkNotNullParameter(cx, "c");
Intrinsics.checkNotNullParameter(c1, a<"n">(3667, 7311472730842483992L ^ ax));
if (!zi.v.K().method_23093(box)) {
return;
}
} catch (NoWhenBranchMatchedException var20) {
throw vm.a<"Å">(var20, 3248576270513561282L, ax);
}

class_4184 var10000 = zf.F(var7).method_1561().field_4686;
Intrinsics.checkNotNull(var10000);
class_243 var22 = var10000.method_71156();
Intrinsics.checkNotNullExpressionValue(var22, a<"n">(24485, 4839839475524607209L ^ ax));
class_243 var13 = var22;
float var14 = (float)(box.field_1323 - var13.method_10216());
float var15 = (float)(box.field_1322 - var13.method_10214());
float var16 = (float)(box.field_1321 - var13.method_10215());
float var17 = (float)(box.field_1320 - var13.method_10216());
float var18 = (float)(box.field_1325 - var13.method_10214());
float var19 = (float)(box.field_1324 - var13.method_10215());
polygon.G(var14, var9, var15, var16).n(cx, var11);
polygon.G(var14, var9, var18, var16).n(c1, var11);
polygon.G(var17, var9, var18, var16).n(c1, var11);
polygon.G(var17, var9, var15, var16).n(cx, var11);
polygon.G(var17, var9, var15, var16).n(cx, var11);
polygon.G(var17, var9, var18, var16).n(c1, var11);
polygon.G(var17, var9, var18, var19).n(c1, var11);
polygon.G(var17, var9, var15, var19).n(cx, var11);
polygon.G(var14, var9, var15, var19).n(cx, var11);
polygon.G(var17, var9, var15, var19).n(cx, var11);
polygon.G(var17, var9, var18, var19).n(c1, var11);
polygon.G(var14, var9, var18, var19).n(c1, var11);
polygon.G(var14, var9, var15, var16).n(cx, var11);
polygon.G(var14, var9, var15, var19).n(cx, var11);
polygon.G(var14, var9, var18, var19).n(c1, var11);
polygon.G(var14, var9, var18, var16).n(c1, var11);
polygon.G(var14, var9, var18, var16).n(c1, var11);
polygon.G(var14, var9, var18, var19).n(c1, var11);
polygon.G(var17, var9, var18, var19).n(c1, var11);
polygon.G(var17, var9, var18, var16).n(c1, var11);
polygon.G(var14, var9, var15, var16).n(cx, var11);
polygon.G(var14, var9, var15, var19).n(cx, var11);
polygon.G(var17, var9, var15, var19).n(cx, var11);
polygon.G(var17, var9, var15, var16).n(cx, var11);
}

private final void z(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/cz.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 20796268710910
// 00b: lxor
// 00c: lstore 3
// 00d: pop2
// 00e: ldc2_w 6315379769065256921
// 011: lload 1
// 012: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 017: istore 5
// 019: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 01c: iload 5
// 01e: ifeq 063
// 021: ifnonnull 05c
// 024: goto 031
// 027: ldc2_w 6215638924886287765
// 02a: lload 1
// 02b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
// 04c: putstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 04f: goto 05c
// 052: ldc2_w 6215638924886287765
// 055: lload 1
// 056: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: athrow
// 05c: lload 3
// 05d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 060: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 063: getfield net/minecraft/class_276.field_1482 I
// 066: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 069: dup
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 06d: getfield net/minecraft/class_6364.field_1482 I
// 070: lload 1
// 071: lconst_0
// 072: lcmp
// 073: ifle 0ac
// 076: iload 5
// 078: ifeq 0ac
// 07b: if_icmpne 0af
// 07e: goto 08b
// 081: ldc2_w 6215638924886287765
// 084: lload 1
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: lload 3
// 08c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08f: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 092: getfield net/minecraft/class_276.field_1481 I
// 095: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 098: dup
// 099: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 09c: getfield net/minecraft/class_6364.field_1481 I
// 09f: goto 0ac
// 0a2: ldc2_w 6215638924886287765
// 0a5: lload 1
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: if_icmpeq 0da
// 0af: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
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
// 0d0: ldc2_w 6215638924886287765
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
// 0dd: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
// 0e2: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 0e5: dup
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0e9: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 0ec: dup
// 0ed: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0f0: bipush 0
// 0f1: getstatic su/catlean/cz.q Lnet/minecraft/class_6364;
// 0f4: dup
// 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0f8: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 0fb: dup
// 0fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0ff: dconst_1
// 100: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 105: return
}

private final void X(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/cz.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 90986082111158
// 00b: lxor
// 00c: lstore 3
// 00d: pop2
// 00e: ldc2_w 5975428272714789521
// 011: lload 1
// 012: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 017: istore 5
// 019: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 01c: iload 5
// 01e: ifeq 063
// 021: ifnonnull 05c
// 024: goto 031
// 027: ldc2_w 5983632995630653661
// 02a: lload 1
// 02b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
// 04c: putstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 04f: goto 05c
// 052: ldc2_w 5983632995630653661
// 055: lload 1
// 056: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: athrow
// 05c: lload 3
// 05d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 060: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 063: getfield net/minecraft/class_276.field_1482 I
// 066: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
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
// 081: ldc2_w 5983632995630653661
// 084: lload 1
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: lload 3
// 08c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08f: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 092: getfield net/minecraft/class_276.field_1481 I
// 095: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 098: dup
// 099: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 09c: getfield net/minecraft/class_6364.field_1481 I
// 09f: goto 0ac
// 0a2: ldc2_w 5983632995630653661
// 0a5: lload 1
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: if_icmpeq 0da
// 0af: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
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
// 0d0: ldc2_w 5983632995630653661
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
// 0dd: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
// 0e2: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 0e5: dup
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0e9: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 0ec: dup
// 0ed: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0f0: bipush 0
// 0f1: getstatic su/catlean/cz.e Lnet/minecraft/class_6364;
// 0f4: dup
// 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0f8: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 0fb: dup
// 0fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0ff: dconst_1
// 100: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 105: return
}

static {
long var11 = a ^ 114148618066593L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[13];
int var18 = 0;
String var17 = "\u001a¤\u0013§¦©\u009er&'\u009aâ ¼B§Ê\u0004\u00adÉ9B¯48U\u008eBÙJ\u0089~\u0098§>iqI'D\u0016\u0084>^\u001f`KØ±+\u0000)>'øOÞÂ»þ\u0082éO,én<*äÀm9\u0010\u009f\u0090\u0016\u009d¯yH\u0090\u0010øÞÇ`:ûs\u009c\u00895xu¾ÜÜS Í\u001e\u007f\u0090\u0089\u0093]\u0087n\u0093Îµ\rÀÇ\u0091W\u0092g-\u0098\u0089GÞ\u0000Á³uý¯K\u0018\u0018^R\u001e3ç\u0096³ãä\u007fä±\b!\r\u0083Í\u008f\u0084\u0012÷À5¤\u0010¾\"ëN\u0015KN\u0016¸\u0011\u0083Ø\u001c9ª\u001a\u0010\u0093\u008dæù\u000f\u009fOÉ\u009d\u0003§Íx½\u0001\u000e\u0018ûì\u0082\u0090÷\u0014¡\u008aºI!>\u0091WkX\u0013ï?\u0094»\u0015\u0004r8|)±rÑ½}¸\u0099\u001f²¢³T?öKpß)ò=\\¦á843\u0098}\u0002È\u009b\u009cfÊCh\u0081#ÐÉNó(\u0090$à{\u001e\u0098¤×âÔK ´±ý\u0089¦5ÈØõ¢\u0086¯'\u009dàÆÁí ü+\u001cË¡¦\u0016s\u001cÀ\u0092k\u001e\u0010ù\u0011ïéSÑKã\u0019¬uAôÓì\u001f";
int var19 = "\u001a¤\u0013§¦©\u009er&'\u009aâ ¼B§Ê\u0004\u00adÉ9B¯48U\u008eBÙJ\u0089~\u0098§>iqI'D\u0016\u0084>^\u001f`KØ±+\u0000)>'øOÞÂ»þ\u0082éO,én<*äÀm9\u0010\u009f\u0090\u0016\u009d¯yH\u0090\u0010øÞÇ`:ûs\u009c\u00895xu¾ÜÜS Í\u001e\u007f\u0090\u0089\u0093]\u0087n\u0093Îµ\rÀÇ\u0091W\u0092g-\u0098\u0089GÞ\u0000Á³uý¯K\u0018\u0018^R\u001e3ç\u0096³ãä\u007fä±\b!\r\u0083Í\u008f\u0084\u0012÷À5¤\u0010¾\"ëN\u0015KN\u0016¸\u0011\u0083Ø\u001c9ª\u001a\u0010\u0093\u008dæù\u000f\u009fOÉ\u009d\u0003§Íx½\u0001\u000e\u0018ûì\u0082\u0090÷\u0014¡\u008aºI!>\u0091WkX\u0013ï?\u0094»\u0015\u0004r8|)±rÑ½}¸\u0099\u001f²¢³T?öKpß)ò=\\¦á843\u0098}\u0002È\u009b\u009cfÊCh\u0081#ÐÉNó(\u0090$à{\u001e\u0098¤×âÔK ´±ý\u0089¦5ÈØõ¢\u0086¯'\u009dàÆÁí ü+\u001cË¡¦\u0016s\u001cÀ\u0092k\u001e\u0010ù\u0011ïéSÑKã\u0019¬uAôÓì\u001f"
.length();
char var16 = 24;
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
c = new String[13];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[19];
int var3 = 0;
String var4 = "\u0011\u008b!O_ó*eÎ\u0098\u0011Y%B@\u001aÉY\u0005%§üZPÏº\"d\u0090î²6\f\u0088ÈiÇUt\u0095\u0007£6MDì\u009e\u0099z>biØ\u001eT\u0098¬ßþpzôF\u0095r\u008b\u0092D{·ZBÕÝ\"\u009d¯·aÈ\u008eð)\u007fË\u008e\u0011uðµr÷WC©4Òe¼`\u008e1¯©\u0014KsJ(¢\u009fr~æò\u0081!O\u009b¨uñY\u0088\u0017ú\u0093^Xæ4\u001f´wçä";
int var5 = "\u0011\u008b!O_ó*eÎ\u0098\u0011Y%B@\u001aÉY\u0005%§üZPÏº\"d\u0090î²6\f\u0088ÈiÇUt\u0095\u0007£6MDì\u009e\u0099z>biØ\u001eT\u0098¬ßþpzôF\u0095r\u008b\u0092D{·ZBÕÝ\"\u009d¯·aÈ\u008eð)\u007fË\u008e\u0011uðµr÷WC©4Òe¼`\u008e1¯©\u0014KsJ(¢\u009fr~æò\u0081!O\u009b¨uñY\u0088\u0017ú\u0093^Xæ4\u001f´wçä"
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
h = new Integer[19];
H = new cz();
u = new ArrayList();
Y = new ArrayList();
F = new ArrayList();
k = new ArrayList();
n = new ArrayList();
M = new ArrayList();
K = new ArrayList();
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "SÿlIÖ*\u008bÎA\u0003,\u001dÞ>ªr";
var5 = "SÿlIÖ*\u008bÎA\u0003,\u001dÞ>ªr".length();
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

var17 = "\u0080õµ\u0090Tî\u008a\u0010Ç\u0098Cê[{0:\u0018=É2ËY\u0091wõÐ¦\u0093¶n4ä¸\u0081\u0015µ®ÇÆÜ\u0011";
var19 = "\u0080õµ\u0090Tî\u008a\u0010Ç\u0098Cê[{0:\u0018=É2ËY\u0091wõÐ¦\u0093¶n4ä¸\u0081\u0015µ®ÇÆÜ\u0011".length();
var16 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28320;
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
throw new RuntimeException("su/catlean/cz", var10);
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
throw new RuntimeException("su/catlean/cz" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 10170;
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
throw new RuntimeException("su/catlean/cz", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/cz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
