package su.catlean;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty0;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class fv extends f6 {
@NotNull
private Function0 E;
private float S;
@NotNull
private KMutableProperty0 Q;
private static final long a = yz.a(1856249456402936117L, 4789881039440383148L, MethodHandles.lookup().lookupClass()).a(123654274608908L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public fv(@NotNull Function0 clickAction, int a, short a, float width, @NotNull KMutableProperty0 hoverRef, short a) {
long var7 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(clickAction, a<"f">(2799, 5249470433687980036L ^ var7));
Intrinsics.checkNotNullParameter(hoverRef, a<"f">(17911, 5409132928735348510L ^ var7));
super();
this.E = clickAction;
this.S = width;
this.Q = hoverRef;
}

public final float k() {
return this.S;
}

public final void w(float <set-?>) {
this.S = <set-?>;
}

@Override
public void o(long a, @NotNull class_332 context, float x, float y, float mouseX, float mouseY) {
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
// 002: ldc2_w 122872324218116
// 005: lxor
// 006: dup2
// 007: bipush 48
// 009: lushr
// 00a: l2i
// 00b: istore 8
// 00d: dup2
// 00e: bipush 16
// 010: lshl
// 011: bipush 48
// 013: lushr
// 014: l2i
// 015: istore 9
// 017: dup2
// 018: bipush 32
// 01a: lshl
// 01b: bipush 32
// 01d: lushr
// 01e: l2i
// 01f: istore 10
// 021: pop2
// 022: dup2
// 023: ldc2_w 81101117301204
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 18592005668209
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 81010294496925
// 034: lxor
// 035: dup2
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 15
// 03c: dup2
// 03d: bipush 16
// 03f: lshl
// 040: bipush 32
// 042: lushr
// 043: l2i
// 044: istore 16
// 046: dup2
// 047: bipush 48
// 049: lshl
// 04a: bipush 48
// 04c: lushr
// 04d: l2i
// 04e: istore 17
// 050: pop2
// 051: pop2
// 052: ldc2_w 9041135080979609510
// 055: lload 1
// 056: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: aload 3
// 05c: sipush 29384
// 05f: ldc2_w 5553504921457379245
// 062: lload 1
// 063: lxor
// 064: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/fv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06c: astore 33
// 06e: fload 4
// 070: fload 6
// 072: fcmpg
// 073: aload 33
// 075: ifnull 0a2
// 078: ifgt 0c9
// 07b: goto 088
// 07e: ldc2_w 9037497088626959219
// 081: lload 1
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: fload 6
// 08a: fload 4
// 08c: aload 0
// 08d: getfield su/catlean/fv.S F
// 090: ldc 88.0
// 092: fsub
// 093: fadd
// 094: fcmpg
// 095: goto 0a2
// 098: ldc2_w 9037497088626959219
// 09b: lload 1
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: aload 33
// 0a4: ifnull 0c6
// 0a7: ifgt 0c5
// 0aa: goto 0b7
// 0ad: ldc2_w 9037497088626959219
// 0b0: lload 1
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: bipush 1
// 0b8: goto 0ca
// 0bb: ldc2_w 9037497088626959219
// 0be: lload 1
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: bipush 0
// 0c6: goto 0ca
// 0c9: bipush 0
// 0ca: lload 1
// 0cb: lconst_0
// 0cc: lcmp
// 0cd: iflt 0d8
// 0d0: ifeq 154
// 0d3: fload 5
// 0d5: fload 7
// 0d7: fcmpg
// 0d8: aload 33
// 0da: lload 1
// 0db: lconst_0
// 0dc: lcmp
// 0dd: iflt 117
// 0e0: ifnull 115
// 0e3: goto 0f0
// 0e6: ldc2_w 9037497088626959219
// 0e9: lload 1
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: ifgt 13c
// 0f3: goto 100
// 0f6: ldc2_w 9037497088626959219
// 0f9: lload 1
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: fload 7
// 102: fload 5
// 104: ldc 13.0
// 106: fadd
// 107: fcmpg
// 108: goto 115
// 10b: ldc2_w 9037497088626959219
// 10e: lload 1
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 33
// 117: ifnull 139
// 11a: ifgt 138
// 11d: goto 12a
// 120: ldc2_w 9037497088626959219
// 123: lload 1
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: bipush 1
// 12b: goto 13d
// 12e: ldc2_w 9037497088626959219
// 131: lload 1
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: bipush 0
// 139: goto 13d
// 13c: bipush 0
// 13d: lload 1
// 13e: lconst_0
// 13f: lcmp
// 140: iflt 147
// 143: ifeq 154
// 146: bipush 1
// 147: goto 155
// 14a: ldc2_w 9037497088626959219
// 14d: lload 1
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: bipush 0
// 155: istore 34
// 157: lload 1
// 158: lconst_0
// 159: lcmp
// 15a: ifle 179
// 15d: iload 34
// 15f: ifeq 179
// 162: aload 0
// 163: getfield su/catlean/fv.Q Lkotlin/reflect/KMutableProperty0;
// 166: aload 0
// 167: invokeinterface kotlin/reflect/KMutableProperty0.set (Ljava/lang/Object;)V 2
// 16c: goto 179
// 16f: ldc2_w 9037497088626959219
// 172: lload 1
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: aload 3
// 17a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 17d: dup
// 17e: sipush 8860
// 181: ldc2_w 4981242130947938303
// 184: lload 1
// 185: lxor
// 186: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/fv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 18e: fload 4
// 190: fload 5
// 192: aload 0
// 193: getfield su/catlean/fv.S F
// 196: ldc 88.0
// 198: fsub
// 199: ldc 13.0
// 19b: fconst_2
// 19c: iload 34
// 19e: ifeq 1af
// 1a1: fconst_2
// 1a2: goto 1b0
// 1a5: ldc2_w 9037497088626959219
// 1a8: lload 1
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: fconst_1
// 1b0: ldc 0.1
// 1b2: fconst_1
// 1b3: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1b6: getstatic java/awt/Color.RED Ljava/awt/Color;
// 1b9: dup
// 1ba: sipush 18980
// 1bd: ldc2_w 1743228922678607685
// 1c0: lload 1
// 1c1: lxor
// 1c2: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/fv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ca: iload 15
// 1cc: i2c
// 1cd: iload 16
// 1cf: ldc 0.5
// 1d1: iload 17
// 1d3: i2s
// 1d4: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1d7: getstatic java/awt/Color.RED Ljava/awt/Color;
// 1da: dup
// 1db: sipush 30646
// 1de: ldc2_w 5629870731373626064
// 1e1: lload 1
// 1e2: lxor
// 1e3: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/fv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1eb: fconst_0
// 1ec: fconst_0
// 1ed: fconst_0
// 1ee: getstatic su/catlean/fv.e J
// 1f1: l2i
// 1f2: aconst_null
// 1f3: astore 18
// 1f5: istore 19
// 1f7: fstore 20
// 1f9: fstore 21
// 1fb: fstore 22
// 1fd: astore 23
// 1ff: astore 24
// 201: fstore 25
// 203: fstore 26
// 205: fstore 27
// 207: fstore 28
// 209: fstore 29
// 20b: fstore 30
// 20d: fstore 31
// 20f: fstore 32
// 211: iload 8
// 213: i2c
// 214: fload 32
// 216: fload 31
// 218: fload 30
// 21a: fload 29
// 21c: fload 28
// 21e: fload 27
// 220: fload 26
// 222: fload 25
// 224: aload 24
// 226: aload 23
// 228: fload 22
// 22a: iload 9
// 22c: i2s
// 22d: fload 21
// 22f: iload 10
// 231: fload 20
// 233: iload 19
// 235: aload 18
// 237: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 23a: lload 11
// 23c: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 23f: aload 3
// 240: sipush 28074
// 243: ldc2_w 5593086169379559629
// 246: lload 1
// 247: lxor
// 248: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/fv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: fload 4
// 24f: aload 0
// 250: getfield su/catlean/fv.S F
// 253: ldc 88.0
// 255: fsub
// 256: fconst_2
// 257: fdiv
// 258: fadd
// 259: fload 5
// 25b: ldc 5.0
// 25d: fadd
// 25e: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 261: dup
// 262: sipush 29517
// 265: ldc2_w 7110276402889967145
// 268: lload 1
// 269: lxor
// 26a: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/fv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 272: lload 13
// 274: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 277: return
}

@Override
public boolean P(float x, float y, int button, long a) {
this.E.invoke();
return true;
}

static {
long var5 = a ^ 74146133127977L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[8];
int var12 = 0;
String var11 = "2¦Ös¹t<y\u001b®±<øú+\u0093öü\u0089\u0017ÿ%sY \u0097\u0014Ù\u000f\u0011F\u0013¿qGîÏta)|\u0005D¦$Óh2ª!Ýü\u0004¥BÇ\u0080\u0010\n1\u0014\u0087í+Ãq\u008c\u0081¬Á\u0004\u0087 Å\u0018\u0089AðË+òwubðLSË9è\u00ad\u001c\u007fW\u0095BL\u0090´\u0010ç\u00adßåã\u0003\u0016\u00adi¶èµÁ'\u009bs\u0010*Á\u0016`éJ2l\u0088\u0001\u000f\n\u0091\u0098Âî";
int var13 = "2¦Ös¹t<y\u001b®±<øú+\u0093öü\u0089\u0017ÿ%sY \u0097\u0014Ù\u000f\u0011F\u0013¿qGîÏta)|\u0005D¦$Óh2ª!Ýü\u0004¥BÇ\u0080\u0010\n1\u0014\u0087í+Ãq\u008c\u0081¬Á\u0004\u0087 Å\u0018\u0089AðË+òwubðLSË9è\u00ad\u001c\u007fW\u0095BL\u0090´\u0010ç\u00adßåã\u0003\u0016\u00adi¶èµÁ'\u009bs\u0010*Á\u0016`éJ2l\u0088\u0001\u000f\n\u0091\u0098Âî"
.length();
char var10 = 24;
int var17 = -1;

label37:
while (true) {
String var18 = var11.substring(++var17, var17 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var26;
if ((var17 += var10) >= var13) {
b = var14;
c = new String[8];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -2935421066349036756L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var30;
return;
}

var10 = var11.charAt(var17);
break;
default:
var14[var12++] = var26;
if ((var17 += var10) < var13) {
var10 = var11.charAt(var17);
continue label37;
}

var11 = "GÔ¥Úõ²«_\u0098Ô¨¥³\u0005¢Í\u0010TR >ôn\n\u0080¸2ÌÉìê\u008eÙ";
var13 = "GÔ¥Úõ²«_\u0098Ô¨¥³\u0005¢Í\u0010TR >ôn\n\u0080¸2ÌÉìê\u008eÙ".length();
var10 = 16;
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18820;
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
throw new RuntimeException("su/catlean/fv", var10);
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
throw new RuntimeException("su/catlean/fv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
