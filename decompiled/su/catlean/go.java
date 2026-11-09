package su.catlean;

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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

public final class go extends gf {
@NotNull
public static final go E;
private static final long a = yz.a(1298231476749915300L, -4847344134490140125L, MethodHandles.lookup().lookupClass()).a(188377721223637L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private go(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 85580342161018L;
int var3 = (int)((var1 ^ 85580342161018L) >>> 48);
int var4 = (int)((var1 ^ 85580342161018L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"e">(3550, 5378290796860552181L ^ var1), (char)var5);
}

@Override
public void h(long a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 104104530525409
// 005: lxor
// 006: dup2
// 007: bipush 48
// 009: lushr
// 00a: l2i
// 00b: istore 4
// 00d: dup2
// 00e: bipush 16
// 010: lshl
// 011: bipush 32
// 013: lushr
// 014: l2i
// 015: istore 5
// 017: dup2
// 018: bipush 48
// 01a: lshl
// 01b: bipush 48
// 01d: lushr
// 01e: l2i
// 01f: istore 6
// 021: pop2
// 022: dup2
// 023: ldc2_w 37430498539930
// 026: lxor
// 027: lstore 7
// 029: dup2
// 02a: ldc2_w 50910300018319
// 02d: lxor
// 02e: lstore 9
// 030: dup2
// 031: ldc2_w 139672553149144
// 034: lxor
// 035: lstore 11
// 037: dup2
// 038: ldc2_w 17946477735558
// 03b: lxor
// 03c: lstore 13
// 03e: dup2
// 03f: ldc2_w 99541060701969
// 042: lxor
// 043: dup2
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 15
// 04a: dup2
// 04b: bipush 16
// 04d: lshl
// 04e: bipush 32
// 050: lushr
// 051: l2i
// 052: istore 16
// 054: dup2
// 055: bipush 48
// 057: lshl
// 058: bipush 48
// 05a: lushr
// 05b: l2i
// 05c: istore 17
// 05e: pop2
// 05f: dup2
// 060: ldc2_w 30591967126976
// 063: lxor
// 064: lstore 18
// 066: dup2
// 067: ldc2_w 109580710346244
// 06a: lxor
// 06b: lstore 20
// 06d: dup2
// 06e: ldc2_w 118028023098805
// 071: lxor
// 072: lstore 22
// 074: pop2
// 075: aload 3
// 076: sipush 24463
// 079: ldc2_w 4767042590578272317
// 07c: lload 1
// 07d: lxor
// 07e: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/go.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 086: bipush 2
// 087: istore 25
// 089: aload 0
// 08a: checkcast su/catlean/gf
// 08d: aload 3
// 08e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 091: dup
// 092: sipush 19910
// 095: ldc2_w 1674786662771784304
// 098: lload 1
// 099: lxor
// 09a: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/go.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a2: aload 0
// 0a3: lload 18
// 0a5: invokevirtual su/catlean/go.p (J)F
// 0a8: aload 0
// 0a9: lload 9
// 0ab: invokevirtual su/catlean/go.V (J)F
// 0ae: iload 4
// 0b0: i2s
// 0b1: swap
// 0b2: iload 5
// 0b4: swap
// 0b5: ldc 81.0
// 0b7: ldc 22.0
// 0b9: iload 6
// 0bb: i2s
// 0bc: fconst_1
// 0bd: bipush 0
// 0be: sipush 11998
// 0c1: ldc2_w 1045046746466861661
// 0c4: lload 1
// 0c5: lxor
// 0c6: invokedynamic u (IJ)I bsm=su/catlean/go.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: aconst_null
// 0cc: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 0cf: aload 3
// 0d0: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0d3: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 0d6: pop
// 0d7: ldc2_w -5990705277528627281
// 0da: lload 1
// 0db: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: aload 3
// 0e1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0e4: aload 0
// 0e5: lload 18
// 0e7: invokevirtual su/catlean/go.p (J)F
// 0ea: aload 0
// 0eb: lload 9
// 0ed: invokevirtual su/catlean/go.V (J)F
// 0f0: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 0f3: pop
// 0f4: lload 20
// 0f6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f9: lload 11
// 0fb: dup2_x1
// 0fc: pop2
// 0fd: invokestatic su/catlean/s_.z (JLnet/minecraft/class_746;)Ljava/util/List;
// 100: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 105: astore 26
// 107: istore 24
// 109: aload 26
// 10b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 110: ifeq 28a
// 113: aload 26
// 115: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 11a: checkcast net/minecraft/class_1799
// 11d: astore 27
// 11f: iload 24
// 121: lload 1
// 122: lconst_0
// 123: lcmp
// 124: iflt 12c
// 127: ifeq 2a0
// 12a: iload 25
// 12c: lload 1
// 12d: lconst_0
// 12e: lcmp
// 12f: ifle 1a8
// 132: iload 24
// 134: ifeq 1a8
// 137: goto 144
// 13a: ldc2_w -6046613685001742222
// 13d: lload 1
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: sipush 20661
// 147: ldc2_w 7374047879554055223
// 14a: lload 1
// 14b: lxor
// 14c: invokedynamic u (IJ)I bsm=su/catlean/go.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: if_icmpge 1a3
// 154: goto 161
// 157: ldc2_w -6046613685001742222
// 15a: lload 1
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: lload 22
// 163: aload 0
// 164: checkcast su/catlean/gf
// 167: aload 3
// 168: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 16b: dup
// 16c: sipush 20460
// 16f: ldc2_w 4279308586391566431
// 172: lload 1
// 173: lxor
// 174: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/go.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 17c: iload 25
// 17e: i2f
// 17f: ldc 18.0
// 181: fadd
// 182: ldc 7.0
// 184: fconst_0
// 185: sipush 26158
// 188: ldc2_w 5329192006445009582
// 18b: lload 1
// 18c: lxor
// 18d: invokedynamic u (IJ)I bsm=su/catlean/go.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: aconst_null
// 193: invokestatic su/catlean/gf.u (JLsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FFFILjava/lang/Object;)V
// 196: goto 1a3
// 199: ldc2_w -6046613685001742222
// 19c: lload 1
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 27
// 1a5: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 1a8: ifne 1c1
// 1ab: aload 3
// 1ac: aload 27
// 1ae: iload 25
// 1b0: bipush 0
// 1b1: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 1b4: goto 1c1
// 1b7: ldc2_w -6046613685001742222
// 1ba: lload 1
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1c4: lload 13
// 1c6: iload 25
// 1c8: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 1cb: astore 28
// 1cd: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1d0: iload 25
// 1d2: bipush 2
// 1d3: imul
// 1d4: lload 13
// 1d6: dup2_x1
// 1d7: pop2
// 1d8: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 1db: astore 29
// 1dd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1e0: aload 28
// 1e2: iload 15
// 1e4: i2c
// 1e5: iload 16
// 1e7: ldc 0.4
// 1e9: iload 17
// 1eb: i2s
// 1ec: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1ef: astore 30
// 1f1: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1f4: aload 29
// 1f6: iload 15
// 1f8: i2c
// 1f9: iload 16
// 1fb: ldc 0.4
// 1fd: iload 17
// 1ff: i2s
// 200: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 203: astore 31
// 205: iload 25
// 207: i2f
// 208: ldc 15.0
// 20a: lload 7
// 20c: ldc 16.0
// 20e: ldc 4.0
// 210: ldc 1.5
// 212: aload 30
// 214: aload 30
// 216: aload 31
// 218: aload 31
// 21a: aload 3
// 21b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 21e: dup
// 21f: sipush 20460
// 222: ldc2_w 4279308586391566431
// 225: lload 1
// 226: lxor
// 227: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/go.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 22f: fconst_1
// 230: aload 29
// 232: invokestatic su/catlean/l7.p (FFJFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;)V
// 235: ldc 16.0
// 237: aload 27
// 239: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 23c: i2f
// 23d: ldc 16.0
// 23f: fmul
// 240: aload 27
// 242: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 245: i2f
// 246: fdiv
// 247: fsub
// 248: fconst_2
// 249: fadd
// 24a: fconst_0
// 24b: ldc 16.0
// 24d: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
// 250: fstore 32
// 252: iload 25
// 254: i2f
// 255: ldc 15.0
// 257: lload 7
// 259: fload 32
// 25b: ldc 4.0
// 25d: ldc 1.5
// 25f: aload 28
// 261: aload 28
// 263: aload 29
// 265: aload 29
// 267: aload 3
// 268: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 26b: dup
// 26c: sipush 20460
// 26f: ldc2_w 4279308586391566431
// 272: lload 1
// 273: lxor
// 274: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/go.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 27c: fconst_1
// 27d: aload 29
// 27f: invokestatic su/catlean/l7.p (FFJFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;)V
// 282: iinc 25 20
// 285: iload 24
// 287: ifne 109
// 28a: aload 3
// 28b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 28e: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 291: pop
// 292: aload 0
// 293: ldc 81.0
// 295: ldc 22.0
// 297: invokevirtual su/catlean/go.X (FF)V
// 29a: lload 1
// 29b: lconst_0
// 29c: lcmp
// 29d: iflt 2a0
// 2a0: return
}

@Override
public void H(@NotNull class_332 context, long a) {
long var4 = ax ^ 105984575582407L;
long var6 = ax ^ 118901760466898L;
long var8 = ax ^ 67510703577989L;
long var10 = ax ^ 90421913266139L;
long var10001 = ax ^ 27379191465548L;
int var12 = (int)((ax ^ 27379191465548L) >>> 48);
int var13 = (int)((ax ^ 27379191465548L) << 16 >>> 32);
int var14 = (int)(var10001 << 48 >>> 48);
long var15 = ax ^ 98664999447709L;
long var17 = ax ^ 37139592738649L;
boolean var10000 = vm.a<"Å">(-6519344395793793993L, ax);
Intrinsics.checkNotNullParameter(context, b<"e">(22398, 1158015548772706707L ^ ax));
boolean var19 = var10000;
byte var20 = 2;

for (class_1799 var22 : s_.z(var8, zf.v(var17))) {
Color var23 = jh.f.Z(var10, var20);
Color var24 = jh.f.Z(var10, var20 * 2);
Color var25 = jl.y.p(var23, (char)var12, var13, 0.4F, (short)var14);
Color var26 = jl.y.p(var24, (char)var12, var13, 0.4F, (short)var14);
float var28 = this.p(var15) + var20;
float var30 = this.V(var6) + 15.0F;
Matrix3x2fStack var10010 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10010, b<"e">(20460, 4279380696797999362L ^ ax));
l7.p(var28, var30, var4, 16.0F, 4.0F, 1.5F, var25, var25, var26, var26, var10010, 1.0F, var24);
float var27 = class_3532.method_15363(16.0F - var22.method_7919() * 16.0F / var22.method_7936() + 2.0F, 0.0F, 16.0F);
float var29 = this.p(var15) + var20;
float var31 = this.V(var6) + 15.0F;
var10010 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10010, b<"e">(20460, 4279380696797999362L ^ ax));
l7.p(var29, var31, var4, var27, 4.0F, 1.5F, var23, var23, var24, var24, var10010, 1.0F, var24);
var20 += 20;
if (var19) {
break;
}
}
}

static {
long var20 = a ^ 131444658977476L;
long var22 = var20 ^ 106611759717941L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[5];
int var16 = 0;
String var15 = "\u001c¨)k\t\u0084Æ\u0013\u0019\u001b\n=æ\u0092PÀ\u0018\u0082\u0012Yê\u009cÁñêÝ\u000eSa\u0016\u0091¶\u001aøF\u000bayb\u009b\u0005\u0010F¼p«Æá9\u0083\u0016N[\u0081'\u001f,¤";
int var17 = "\u001c¨)k\t\u0084Æ\u0013\u0019\u001b\n=æ\u0092PÀ\u0018\u0082\u0012Yê\u009cÁñêÝ\u000eSa\u0016\u0091¶\u001aøF\u000bayb\u009b\u0005\u0010F¼p«Æá9\u0083\u0016N[\u0081'\u001f,¤"
.length();
char var14 = 16;
int var25 = -1;

label45:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var35 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var35;
if ((var25 += var14) >= var17) {
b = var18;
c = new String[5];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "q\u0019Ð\u009el3¨\r«Ýf¾åí\u0084¡ë-0í\"\t\u0099Ô";
int var5 = "q\u0019Ð\u009el3¨\r«Ýf¾åí\u0084¡ë-0í\"\t\u0099Ô".length();
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
byte var40 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

g = var6;
h = new Integer[3];
E = new go(var22);
return;
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var35;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label45;
}

var15 = "§¬=4£ÝÐ'\u0011t!?x\u009b@{Î\u008fÆJÜ½FÒÃßÓö\u001aº\b· ×ò^\u008f\u000f\u00ad\u0015©O\u009bûÉ9\u009e\u001aZÃ\u0019ñ\u0087\u0087H0\u0010\u000f\u0089\u0095Acç(\u009c";
var17 = "§¬=4£ÝÐ'\u0011t!?x\u009b@{Î\u008fÆJÜ½FÒÃßÓö\u001aº\b· ×ò^\u008f\u000f\u00ad\u0015©O\u009bûÉ9\u009e\u001aZÃ\u0019ñ\u0087\u0087H0\u0010\u000f\u0089\u0095Acç(\u009c"
.length();
var14 = ' ';
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6873;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/go", var10);
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
throw new RuntimeException("su/catlean/go" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16873;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/go", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/go" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
