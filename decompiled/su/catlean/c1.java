package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_241;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c1 implements class_11281 {
@NotNull
private final class_241 R;
@NotNull
private final class_241 Q;
@NotNull
private final Color g;
private final float k;
private final float m;
private final float b;
private static final long a = yz.a(-6895901878429067327L, -4870533705573218913L, MethodHandles.lookup().lookupClass()).a(112284425128268L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map i;

public c1(@NotNull class_241 uViewOffset, @NotNull class_241 uHalfTexelSize, long a, @NotNull Color uColor, float uBorder, float alphaX, float alphaY) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(uViewOffset, a<"u">(17668, 6139205354416042393L ^ ax));
Intrinsics.checkNotNullParameter(uHalfTexelSize, a<"u">(19003, 4269192323467280043L ^ ax));
Intrinsics.checkNotNullParameter(uColor, a<"u">(13145, 8727023639654664133L ^ ax));
super();
this.R = uViewOffset;
this.Q = uHalfTexelSize;
this.g = uColor;
this.k = uBorder;
this.m = alphaX;
this.b = alphaY;
}

@NotNull
public final class_241 p() {
return this.R;
}

@NotNull
public final class_241 g() {
return this.Q;
}

@NotNull
public final Color C() {
return this.g;
}

public final float N() {
return this.k;
}

public final float T() {
return this.m;
}

public final float S() {
return this.b;
}

public void method_71104(@NotNull ByteBuffer buffer) {
long var2 = a ^ 116852271389874L;
long var4 = var2 ^ 87146537334505L;
long var6 = var2 ^ 26318230416964L;
long var10001 = var2 ^ 134308752058094L;
int var8 = (int)((var2 ^ 134308752058094L) >>> 48);
int var9 = (int)((var2 ^ 134308752058094L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
long var11 = (var2 ^ 107281294226912L) >>> 32;
int var13 = (int)((var2 ^ 107281294226912L) << 32 >>> 32);
Intrinsics.checkNotNullParameter(buffer, a<"u">(27775, 85502520888752254L ^ var2));
Std140Builder.intoBuffer(buffer)
.putVec2(this.R.field_1343, this.R.field_1342)
.putVec4(jl.y.y(this.g, (char)var8, (short)var9, var10), jl.y.M(var6, this.g), jl.y.r(this.g, var11, var13), jl.y.G(var4, this.g))
.putFloat(this.k)
.putVec2(this.Q.field_1343, this.Q.field_1342)
.putFloat(this.m)
.putFloat(this.b);
}

@NotNull
public final class_241 j() {
return this.R;
}

@NotNull
public final class_241 l() {
return this.Q;
}

@NotNull
public final Color f() {
return this.g;
}

public final float Y() {
return this.k;
}

public final float F() {
return this.m;
}

public final float P() {
return this.b;
}

@NotNull
public final c1 R(
@NotNull class_241 uViewOffset, @NotNull class_241 uHalfTexelSize, @NotNull Color uColor, int a, float uBorder, float alphaX, short a, float alphaY, short a
) {
long var10 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var12 = var10 ^ 54691674095885L;
Intrinsics.checkNotNullParameter(uViewOffset, a<"u">(3102, 2583995915192808912L ^ var10));
Intrinsics.checkNotNullParameter(uHalfTexelSize, a<"u">(4931, 4097845215846214284L ^ var10));
Intrinsics.checkNotNullParameter(uColor, a<"u">(20627, 2558954250545031507L ^ var10));
return new c1(uViewOffset, uHalfTexelSize, var12, uColor, uBorder, alphaX, alphaY);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static c1 y(
c1 var0, class_241 var1, class_241 var2, Color var3, float var4, float var5, short var6, int var7, float var8, short var9, int var10, Object var11
) {
long var12 = ((long)var6 << 48 | (long)var7 << 32 >>> 16 | (long)var9 << 48 >>> 48) ^ a;
long var10001 = var12 ^ 28373862019197L;
int var14 = (int)((var12 ^ 28373862019197L) >>> 32);
int var15 = (int)((var12 ^ 28373862019197L) << 32 >>> 48);
int var16 = (int)(var10001 << 48 >>> 48);
String[] var17 = vm.a<"Å">(4627491993512619014L, var12);

int var10000;
label113: {
label112: {
try {
var10000 = var10 & 1;
if (var17 != null) {
break label113;
}

if (var10000 == 0) {
break label112;
}
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, 4748955882653853782L, var12);
}

var1 = var0.R;
}

var10000 = var10 & 2;
}

label104: {
label103: {
label102: {
try {
var26 = var17;
if (var6 < 0) {
break label104;
}

if (var17 != null) {
break label103;
}

if (var10000 == 0) {
break label102;
}
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, 4748955882653853782L, var12);
}

var2 = var0.Q;
}

var10000 = var10 & 4;
}

try {
var26 = var17;
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, 4748955882653853782L, var12);
}
}

label91: {
label90: {
label89: {
try {
if (var7 <= 0) {
break label91;
}

if (var26 != null) {
break label90;
}

if (var10000 == 0) {
break label89;
}
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, 4748955882653853782L, var12);
}

var3 = var0.g;
}

var10000 = var10 & b<"m">(15469, 1733184231739480165L ^ var12);
}

try {
var26 = var17;
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, 4748955882653853782L, var12);
}
}

label78: {
label77: {
label76: {
try {
if (var6 < 0) {
break label78;
}

if (var26 != null) {
break label77;
}

if (var10000 == 0) {
break label76;
}
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, 4748955882653853782L, var12);
}

var4 = var0.k;
}

var10000 = var10 & b<"m">(11442, 5580388051152554169L ^ var12);
}

try {
var26 = var17;
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 4748955882653853782L, var12);
}
}

label65: {
label64: {
try {
if (var26 != null) {
break label65;
}

if (var10000 == 0) {
break label64;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, 4748955882653853782L, var12);
}

var5 = var0.m;
}

var10000 = var10 & b<"m">(18820, 4349789326892608910L ^ var12);
}

if (var10000 != 0) {
var8 = var0.b;
}

return var0.R(var1, var2, var3, var14, var4, var5, (short)var15, var8, (short)var16);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 137426437236819L;
float var3 = this.b;
float var4 = this.m;
float var5 = this.k;
Color var6 = this.g;
class_241 var7 = this.Q;
class_241 var8 = this.R;
return a<"u">(30508, 1032817980192364481L ^ var1)
+ var8
+ a<"u">(9609, 1901527906844591464L ^ var1)
+ var7
+ a<"u">(56, 5187986482563244244L ^ var1)
+ var6
+ a<"u">(29020, 3915784386619412914L ^ var1)
+ var5
+ a<"u">(29491, 1649508064810800090L ^ var1)
+ var4
+ a<"u">(18264, 6237434921040619440L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 131583673157769L;
int var3 = this.R.hashCode();
var3 = var3 * b<"m">(18449, 7669616000676309453L ^ var1) + this.Q.hashCode();
var3 = var3 * b<"m">(24062, 3177023008481983526L ^ var1) + this.g.hashCode();
var3 = var3 * b<"m">(24062, 3177023008481983526L ^ var1) + Float.hashCode(this.k);
var3 = var3 * b<"m">(24062, 3177023008481983526L ^ var1) + Float.hashCode(this.m);
return var3 * b<"m">(24062, 3177023008481983526L ^ var1) + Float.hashCode(this.b);
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/c1.a J
// 003: ldc2_w 21694235563686
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -2611507893210957828
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -2729878267580042324
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -2729878267580042324
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/c1
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -2729878267580042324
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -2729878267580042324
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/c1
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/c1.R Lnet/minecraft/class_241;
// 065: aload 5
// 067: getfield su/catlean/c1.R Lnet/minecraft/class_241;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -2729878267580042324
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -2729878267580042324
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/c1.Q Lnet/minecraft/class_241;
// 092: aload 5
// 094: getfield su/catlean/c1.Q Lnet/minecraft/class_241;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w -2729878267580042324
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w -2729878267580042324
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/c1.g Ljava/awt/Color;
// 0bf: aload 5
// 0c1: getfield su/catlean/c1.g Ljava/awt/Color;
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c7: aload 4
// 0c9: ifnonnull 0f4
// 0cc: ifne 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w -2729878267580042324
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w -2729878267580042324
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/c1.k F
// 0ec: aload 5
// 0ee: getfield su/catlean/c1.k F
// 0f1: invokestatic java/lang/Float.compare (FF)I
// 0f4: aload 4
// 0f6: ifnonnull 121
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w -2729878267580042324
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w -2729878267580042324
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/c1.m F
// 119: aload 5
// 11b: getfield su/catlean/c1.m F
// 11e: invokestatic java/lang/Float.compare (FF)I
// 121: aload 4
// 123: ifnonnull 14e
// 126: ifeq 142
// 129: goto 136
// 12c: ldc2_w -2729878267580042324
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w -2729878267580042324
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 0
// 143: getfield su/catlean/c1.b F
// 146: aload 5
// 148: getfield su/catlean/c1.b F
// 14b: invokestatic java/lang/Float.compare (FF)I
// 14e: aload 4
// 150: ifnonnull 170
// 153: ifeq 16f
// 156: goto 163
// 159: ldc2_w -2729878267580042324
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: bipush 0
// 164: ireturn
// 165: ldc2_w -2729878267580042324
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: bipush 1
// 170: ireturn
}

static {
long var11 = a ^ 125776754517350L;
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
String var17 = "\u0089¢\u0015\rp\u0019è\u0016K\u0094¼ç³7\rV\u0010\u0089AÁÊè=~\u0018qå\u0001\u009aµ\u009a\u0010\u0013ä\u0017âgÖ}\u0012¨MI.\r´}S\u0086\u0018\u0017\u0005Ó4Y\u0015!F#Ï¤Ò\u0088kÖoÄÄ¯¥h{\t\u0092 îá]\u001db\u008e\u0086á\u0094A¾©\u009aïäx¬Qæâ\u0090¶L\u0010\u009bj<\u0002\u0080¶\u000bÙ\u0018@\u008f¿\u0090\u009eûr\u0082p~¹ô\u0002\u008cE\u007f\u008c{\u008aW\u008b\u0096\u000eä8Ú\u0019¨\u007f\u0099(Ò4\u009e\u00876óí\u0081H=M\u0001\\7ïê¯\u0087\u0097\u0085ÿ^\u0000Lf!Y\b\u00884®\u001cÖ\u0000»(÷\u0004£¡¶¿\u0090)\u001e9É_\b \u0018\u00ad{v\u0094÷°\u0006Ë®M=©\u0014\u009féÌ\u00121qsH\u0011%Ï\u0018\u0011ÃÒ\u0002þKalä¼\u008e·ô\u0080SiwBw\u008b\u008aø\u0097\u007f\u0010[OâÀ,úBä3\u0095T\u008dó·\u009bo(¹¨À8À\u009aÞo\n\u000f¤H]ð¥\u001d}Ò1ÖÅ^\u0080§ÕqæÅ×oWÙ%[\u0002Ä\u001c}7è\u0018±\u0089\u0018,5Ò\u0013#\u008aør^Åµ\u0095\u0096úÖ\u008e-Ë¦x ";
int var19 = "\u0089¢\u0015\rp\u0019è\u0016K\u0094¼ç³7\rV\u0010\u0089AÁÊè=~\u0018qå\u0001\u009aµ\u009a\u0010\u0013ä\u0017âgÖ}\u0012¨MI.\r´}S\u0086\u0018\u0017\u0005Ó4Y\u0015!F#Ï¤Ò\u0088kÖoÄÄ¯¥h{\t\u0092 îá]\u001db\u008e\u0086á\u0094A¾©\u009aïäx¬Qæâ\u0090¶L\u0010\u009bj<\u0002\u0080¶\u000bÙ\u0018@\u008f¿\u0090\u009eûr\u0082p~¹ô\u0002\u008cE\u007f\u008c{\u008aW\u008b\u0096\u000eä8Ú\u0019¨\u007f\u0099(Ò4\u009e\u00876óí\u0081H=M\u0001\\7ïê¯\u0087\u0097\u0085ÿ^\u0000Lf!Y\b\u00884®\u001cÖ\u0000»(÷\u0004£¡¶¿\u0090)\u001e9É_\b \u0018\u00ad{v\u0094÷°\u0006Ë®M=©\u0014\u009féÌ\u00121qsH\u0011%Ï\u0018\u0011ÃÒ\u0002þKalä¼\u008e·ô\u0080SiwBw\u008b\u008aø\u0097\u007f\u0010[OâÀ,úBä3\u0095T\u008dó·\u009bo(¹¨À8À\u009aÞo\n\u000f¤H]ð¥\u001d}Ò1ÖÅ^\u0080§ÕqæÅ×oWÙ%[\u0002Ä\u001c}7è\u0018±\u0089\u0018,5Ò\u0013#\u008aør^Åµ\u0095\u0096úÖ\u008e-Ë¦x "
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
c = var20;
d = new String[13];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "e\u0094õsmõ²#\"¬0V\u001f¯³êîðàð1\u0000\r\u0010";
int var5 = "e\u0094õsmõ²#\"¬0V\u001f¯³êîðàð1\u0000\r\u0010".length();
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
h = new Integer[5];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "ê\tç}\u0003t)¥\u008d1Z®÷\u001a\u0095É";
var5 = "ê\tç}\u0003t)¥\u008d1Z®÷\u001a\u0095É".length();
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

var17 = "Â\u0012\u009däIÿÍ-\u001c\u008eô<\u0006$'\u009c\u0010ï-/¨\u0016RgZÙáõÁá\u001dæ\t";
var19 = "Â\u0012\u009däIÿÍ-\u001c\u008eô<\u0006$'\u009c\u0010ï-/¨\u0016RgZÙáõÁá\u001dæ\t".length();
var16 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1261;
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
throw new RuntimeException("su/catlean/c1", var10);
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
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/c1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9475;
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
throw new RuntimeException("su/catlean/c1", var14);
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
throw new RuntimeException("su/catlean/c1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
