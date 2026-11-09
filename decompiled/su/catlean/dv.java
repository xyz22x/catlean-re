package su.catlean;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_241;
import org.jetbrains.annotations.NotNull;

public final class dv {
@NotNull
public static final dv D;
private static long e;
@NotNull
private static final GpuTextureView[] U;
@NotNull
private static class_241 P;
private static final long a = yz.a(-5349481545566593660L, 6262944254155458921L, MethodHandles.lookup().lookupClass()).a(181222225104456L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private dv() {
}

@NotNull
public final GpuTextureView R() {
return U[0];
}

private final GpuTextureView N(long var1, int var3) {
var1 = a ^ var1;
long var4 = var1 ^ 26238449719542L;
double var6 = 1 / Math.pow(2.0, var3);
int var8 = (int)(zf.F(var4).method_22683().method_4489() * var6);
int var9 = (int)(zf.F(var4).method_22683().method_4506() * var6);
GpuTextureView var10000 = RenderSystem.getDevice()
.createTextureView(
RenderSystem.getDevice()
.createTexture(a<"y">(11251, 4680879585030503931L ^ var1) + var3, b<"x">(10681, 5321337989614688756L ^ var1), TextureFormat.RGBA8, var8, var9, 1, 1)
);
Intrinsics.checkNotNullExpressionValue(var10000, a<"y">(14938, 540191786657606739L ^ var1));
return var10000;
}

public final void n(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dv.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 39931388227943
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 97723237725924
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 11579052599401
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 69276105646256
// 01f: lxor
// 020: lstore 9
// 022: pop2
// 023: ldc2_w 3271087722737222500
// 026: lload 1
// 027: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02c: astore 11
// 02e: invokestatic su/catlean/zf.A ()J
// 031: getstatic su/catlean/dv.e J
// 034: lsub
// 035: l2d
// 036: ldc2_w 1000.0
// 039: aload 0
// 03a: lload 9
// 03c: invokespecial su/catlean/dv.P (J)I
// 03f: i2d
// 040: ddiv
// 041: dcmpl
// 042: aload 11
// 044: ifnonnull 086
// 047: ifle 20c
// 04a: goto 057
// 04d: ldc2_w 3243359788571508153
// 050: lload 1
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: aload 0
// 058: getstatic su/catlean/dv.U [Lcom/mojang/blaze3d/textures/GpuTextureView;
// 05b: bipush 1
// 05c: aaload
// 05d: lload 5
// 05f: dup2_x1
// 060: pop2
// 061: lload 3
// 062: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 065: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 068: invokevirtual net/minecraft/class_276.method_71639 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 06b: dup
// 06c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 06f: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 072: invokevirtual su/catlean/b6.r ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 075: invokespecial su/catlean/dv.p (JLcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
// 078: bipush 1
// 079: goto 086
// 07c: ldc2_w 3243359788571508153
// 07f: lload 1
// 080: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: athrow
// 086: istore 12
// 088: iload 12
// 08a: bipush 3
// 08b: if_icmpge 0d0
// 08e: aload 0
// 08f: getstatic su/catlean/dv.U [Lcom/mojang/blaze3d/textures/GpuTextureView;
// 092: iload 12
// 094: bipush 1
// 095: iadd
// 096: aaload
// 097: lload 5
// 099: dup2_x1
// 09a: pop2
// 09b: getstatic su/catlean/dv.U [Lcom/mojang/blaze3d/textures/GpuTextureView;
// 09e: iload 12
// 0a0: aaload
// 0a1: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 0a4: invokevirtual su/catlean/b6.r ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 0a7: invokespecial su/catlean/dv.p (JLcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
// 0aa: iinc 12 1
// 0ad: lload 1
// 0ae: lconst_0
// 0af: lcmp
// 0b0: ifle 0d3
// 0b3: aload 11
// 0b5: ifnonnull 0d3
// 0b8: aload 11
// 0ba: ifnull 088
// 0bd: lload 1
// 0be: lconst_0
// 0bf: lcmp
// 0c0: ifle 0ad
// 0c3: goto 0d0
// 0c6: ldc2_w 3243359788571508153
// 0c9: lload 1
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: bipush 3
// 0d1: istore 12
// 0d3: bipush 0
// 0d4: lload 1
// 0d5: lconst_0
// 0d6: lcmp
// 0d7: ifle 13a
// 0da: iload 12
// 0dc: if_icmpge 128
// 0df: aload 0
// 0e0: getstatic su/catlean/dv.U [Lcom/mojang/blaze3d/textures/GpuTextureView;
// 0e3: iload 12
// 0e5: bipush 1
// 0e6: isub
// 0e7: aaload
// 0e8: lload 5
// 0ea: dup2_x1
// 0eb: pop2
// 0ec: getstatic su/catlean/dv.U [Lcom/mojang/blaze3d/textures/GpuTextureView;
// 0ef: iload 12
// 0f1: aaload
// 0f2: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 0f5: invokevirtual su/catlean/b6.I ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 0f8: invokespecial su/catlean/dv.p (JLcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V
// 0fb: iinc 12 -1
// 0fe: aload 11
// 100: ifnonnull 153
// 103: goto 110
// 106: ldc2_w 3243359788571508153
// 109: lload 1
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: aload 11
// 112: ifnull 0d3
// 115: lload 1
// 116: lconst_0
// 117: lcmp
// 118: iflt 0d3
// 11b: goto 128
// 11e: ldc2_w 3243359788571508153
// 121: lload 1
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: lload 3
// 129: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 12c: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 12f: getfield net/minecraft/class_276.field_1482 I
// 132: i2f
// 133: getstatic su/catlean/dv.P Lnet/minecraft/class_241;
// 136: getfield net/minecraft/class_241.field_1343 F
// 139: fcmpg
// 13a: aload 11
// 13c: ifnonnull 150
// 13f: ifne 153
// 142: goto 14f
// 145: ldc2_w 3243359788571508153
// 148: lload 1
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: bipush 1
// 150: goto 154
// 153: bipush 0
// 154: lload 1
// 155: lconst_0
// 156: lcmp
// 157: ifle 1c0
// 15a: ifeq 199
// 15d: lload 3
// 15e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 161: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 164: getfield net/minecraft/class_276.field_1481 I
// 167: i2f
// 168: getstatic su/catlean/dv.P Lnet/minecraft/class_241;
// 16b: getfield net/minecraft/class_241.field_1342 F
// 16e: fcmpg
// 16f: aload 11
// 171: ifnonnull 192
// 174: goto 181
// 177: ldc2_w 3243359788571508153
// 17a: lload 1
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: ifne 195
// 184: goto 191
// 187: ldc2_w 3243359788571508153
// 18a: lload 1
// 18b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: athrow
// 191: bipush 1
// 192: goto 196
// 195: bipush 0
// 196: ifne 206
// 199: new net/minecraft/class_241
// 19c: dup
// 19d: lload 3
// 19e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1a1: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 1a4: getfield net/minecraft/class_276.field_1482 I
// 1a7: i2f
// 1a8: lload 3
// 1a9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1ac: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 1af: getfield net/minecraft/class_276.field_1481 I
// 1b2: i2f
// 1b3: invokespecial net/minecraft/class_241.<init> (FF)V
// 1b6: putstatic su/catlean/dv.P Lnet/minecraft/class_241;
// 1b9: bipush 0
// 1ba: istore 12
// 1bc: getstatic su/catlean/dv.U [Lcom/mojang/blaze3d/textures/GpuTextureView;
// 1bf: arraylength
// 1c0: istore 13
// 1c2: iload 12
// 1c4: iload 13
// 1c6: if_icmpge 206
// 1c9: getstatic su/catlean/dv.U [Lcom/mojang/blaze3d/textures/GpuTextureView;
// 1cc: iload 12
// 1ce: aaload
// 1cf: invokevirtual com/mojang/blaze3d/textures/GpuTextureView.close ()V
// 1d2: getstatic su/catlean/dv.U [Lcom/mojang/blaze3d/textures/GpuTextureView;
// 1d5: iload 12
// 1d7: aload 0
// 1d8: lload 7
// 1da: iload 12
// 1dc: invokespecial su/catlean/dv.N (JI)Lcom/mojang/blaze3d/textures/GpuTextureView;
// 1df: aastore
// 1e0: iinc 12 1
// 1e3: aload 11
// 1e5: lload 1
// 1e6: lconst_0
// 1e7: lcmp
// 1e8: ifle 1f0
// 1eb: ifnonnull 20c
// 1ee: aload 11
// 1f0: ifnull 1c2
// 1f3: lload 1
// 1f4: lconst_0
// 1f5: lcmp
// 1f6: ifle 1e3
// 1f9: goto 206
// 1fc: ldc2_w 3243359788571508153
// 1ff: lload 1
// 200: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: athrow
// 206: invokestatic su/catlean/zf.A ()J
// 209: putstatic su/catlean/dv.e J
// 20c: return
}

private final void p(long var1, GpuTextureView var3, GpuTextureView var4, RenderPipeline var5) {
var1 = a ^ var1;
long var6 = var1 ^ 28006535043336L;
long var8 = var1 ^ 9729515996961L;
long var10 = var1 ^ 134598072340029L;
g7.L(
new g7(var6, null, 0, false, b<"x">(4813, 4117904350115970060L ^ var1), null).u(var10),
var8,
var5,
var3,
null,
ba.A.n().method_71102(new y1(0.5F / var3.getWidth(0), 0.5F / var3.getHeight(0), 5.0F)),
null,
null,
MapsKt.mapOf(TuplesKt.to(a<"y">(20466, 2473421947779139444L ^ var1), var4)),
b<"x">(23561, 4280727395066278607L ^ var1),
null
);
}

private final int P(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dv.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 5489108365702505004
// 09: lload 1
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 3
// 10: aload 3
// 11: ifnonnull 3c
// 14: invokestatic org/lwjgl/glfw/GLFW.glfwGetPrimaryMonitor ()J
// 17: invokestatic org/lwjgl/glfw/GLFW.glfwGetVideoMode (J)Lorg/lwjgl/glfw/GLFWVidMode;
// 1a: dup
// 1b: ifnull 3b
// 1e: goto 2b
// 21: ldc2_w 5497413557884640497
// 24: lload 1
// 25: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: athrow
// 2b: invokevirtual org/lwjgl/glfw/GLFWVidMode.refreshRate ()I
// 2e: goto 49
// 31: ldc2_w 5497413557884640497
// 34: lload 1
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: pop
// 3c: sipush 30241
// 3f: ldc2_w 7262696135797182128
// 42: lload 1
// 43: lxor
// 44: invokedynamic x (IJ)I bsm=su/catlean/dv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: ireturn
}

static {
long var20 = a ^ 56462929166591L;
long var22 = var20 ^ 63045196268864L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[3];
int var16 = 0;
String var15 = "etª\u0018\u0014Ü½¶òÕ=ýUB®³\u0091(\u0016\u0013NY\u0006)cº\u009a@pÀÛ=~_ÜßçýÎX(\u008d±\u001c\rZå}²òýsE\u000bx?\u00113'Ñ\u0005Îæ\u0018ÇÃÎ~\u0090\u0011{m\u0091y\u0004üÎÃ''$ z|X¿¥¿*éblR\t\u001fAà\u0084¬0A\u0099°;Õ¦{¹\u0081g\u008e¸\u0082t";
int var17 = "etª\u0018\u0014Ü½¶òÕ=ýUB®³\u0091(\u0016\u0013NY\u0006)cº\u009a@pÀÛ=~_ÜßçýÎX(\u008d±\u001c\rZå}²òýsE\u000bx?\u00113'Ñ\u0005Îæ\u0018ÇÃÎ~\u0090\u0011{m\u0091y\u0004üÎÃ''$ z|X¿¥¿*éblR\t\u001fAà\u0084¬0A\u0099°;Õ¦{¹\u0081g\u008e¸\u0082t"
.length();
char var14 = '(';
int var13 = -1;

while (true) {
byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
String var35 = a(var19).intern();
int var10001 = -1;
var18[var16++] = var35;
if ((var13 += var14) >= var17) {
b = var18;
c = new String[3];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[6];
int var3 = 0;
String var4 = "g°\u0014£z\u001d\u001e'\u001b?\u0006SP{\u008chó¿!á\u008c\n5Ç\npæ\u0004\u009d\u0003yj";
int var5 = "g°\u0014£z\u001d\u001e'\u001b?\u0006SP{\u008chó¿!á\u008c\n5Ç\npæ\u0004\u009d\u0003yj".length();
byte var2 = 0;

label42:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var38 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var41 = -1;

while (true) {
long var8 = var38;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var43 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var41) {
case 0:
var30[var10001] = var43;
if (var2 >= var5) {
f = var6;
g = new Integer[6];
D = new dv();
int var24 = 0;

GpuTextureView[] var25;
for (var25 = new GpuTextureView[b<"x">(25140, 4726414810083137221L ^ var20)]; var24 < b<"x">(16427, 4396120638003623129L ^ var20); var24++) {
var25[var24] = D.N(var22, var24);
}

U = var25;
P = new class_241(0.0F, 0.0F);
return;
}
break;
default:
var30[var10001] = var43;
if (var2 < var5) {
continue label42;
}

var4 = "\u0010\u0019S`ìàºÍ\u0082=ªù!ËÔ\n";
var5 = "\u0010\u0019S`ìàºÍ\u0082=ªù!ËÔ\n".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var38 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var41 = 0;
}
}
}

var14 = var15.charAt(var13);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5046;
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
throw new RuntimeException("su/catlean/dv", var10);
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
throw new RuntimeException("su/catlean/dv" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13814;
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
throw new RuntimeException("su/catlean/dv", var14);
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
throw new RuntimeException("su/catlean/dv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
