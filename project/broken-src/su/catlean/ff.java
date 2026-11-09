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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;

public final class ff {
@NotNull
private final bj D;
@NotNull
private final Matrix3x2f w;
private final float W;
private final float c;
private final float y;
private final float p;
private final float z;
private static final long a = yz.a(6203625375047892917L, -197309145450888293L, MethodHandles.lookup().lookupClass()).a(67242680917235L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public ff(long a, @NotNull bj image, @NotNull Matrix3x2f m, float x, float y, float w, float h, float a) {
axx = a ^ axx;
Intrinsics.checkNotNullParameter(image, a<"b">(2831, 2271740987017569527L ^ axx));
Intrinsics.checkNotNullParameter(m, "m");
super();
this.D = image;
this.w = m;
this.W = x;
this.c = yx;
this.y = wx;
this.p = hx;
this.z = ax;
}

@NotNull
public final bj v() {
return this.D;
}

@NotNull
public final Matrix3x2f B() {
return this.w;
}

public final float l() {
return this.W;
}

public final float I() {
return this.c;
}

public final float E() {
return this.y;
}

public final float r() {
return this.p;
}

public final float m() {
return this.z;
}

@NotNull
public final bj i() {
return this.D;
}

@NotNull
public final Matrix3x2f z() {
return this.w;
}

public final float b() {
return this.W;
}

public final float L() {
return this.c;
}

public final float a() {
return this.y;
}

public final float X() {
return this.p;
}

public final float H() {
return this.z;
}

@NotNull
public final ff O(long a, @NotNull bj image, @NotNull Matrix3x2f m, float x, float y, float w, float h, float a) {
axx = a ^ axx;
long var10 = axx ^ 110088376226865L;
Intrinsics.checkNotNullParameter(image, a<"b">(29109, 4718439891100859600L ^ axx));
Intrinsics.checkNotNullParameter(m, "m");
return new ff(var10, image, m, x, yx, wx, hx, ax);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static ff a(ff var0, long var1, bj var3, Matrix3x2f var4, float var5, float var6, float var7, float var8, float var9, int var10, Object var11) {
var1 = a ^ var1;
long var12 = var1 ^ 88325118055879L;
String var14 = vm.a<"Å">(-2606420686872562961L, var1);

int var10000;
label137: {
label136: {
try {
var10000 = var10 & 1;
if (var14 == null) {
break label137;
}

if (var10000 == 0) {
break label136;
}
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, -2608035606273705904L, var1);
}

var3 = var0.D;
}

var10000 = var10 & 2;
}

String var10001;
label128: {
label127: {
label126: {
try {
var10001 = var14;
if (var1 < 0L) {
break label128;
}

if (var14 == null) {
break label127;
}

if (var10000 == 0) {
break label126;
}
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, -2608035606273705904L, var1);
}

var4 = var0.w;
}

var10000 = var10 & 4;
}

try {
var10001 = var14;
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -2608035606273705904L, var1);
}
}

label115: {
label114: {
label113: {
try {
if (var1 < 0L) {
break label115;
}

if (var10001 == null) {
break label114;
}

if (var10000 == 0) {
break label113;
}
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, -2608035606273705904L, var1);
}

var5 = var0.W;
}

var10000 = var10 & b<"s">(1277, 3277134607210242392L ^ var1);
}

try {
var10001 = var14;
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, -2608035606273705904L, var1);
}
}

label102: {
label101: {
label100: {
try {
if (var1 < 0L) {
break label102;
}

if (var10001 == null) {
break label101;
}

if (var10000 == 0) {
break label100;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, -2608035606273705904L, var1);
}

var6 = var0.c;
}

var10000 = var10 & b<"s">(2027, 177736819055780426L ^ var1);
}

try {
var10001 = var14;
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, -2608035606273705904L, var1);
}
}

label89: {
label88: {
label87: {
try {
if (var1 <= 0L) {
break label89;
}

if (var10001 == null) {
break label88;
}

if (var10000 == 0) {
break label87;
}
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, -2608035606273705904L, var1);
}

var7 = var0.y;
}

var10000 = var10 & b<"s">(17002, 7551043948254767054L ^ var1);
}

try {
var10001 = var14;
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -2608035606273705904L, var1);
}
}

label76: {
label75: {
try {
if (var10001 == null) {
break label76;
}

if (var10000 == 0) {
break label75;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, -2608035606273705904L, var1);
}

var8 = var0.p;
}

var10000 = var10 & b<"s">(22065, 2671731603843199895L ^ var1);
}

if (var10000 != 0) {
var9 = var0.z;
}

return var0.O(var12, var3, var4, var5, var6, var7, var8, var9);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 66690893375091L;
float var3 = this.z;
float var4 = this.p;
float var5 = this.y;
float var6 = this.c;
float var7 = this.W;
Matrix3x2f var8 = this.w;
bj var9 = this.D;
return a<"b">(4639, 7698323555593746114L ^ var1)
+ var9
+ a<"b">(13479, 538316044563927161L ^ var1)
+ var8
+ a<"b">(29645, 8195118531297613589L ^ var1)
+ var7
+ a<"b">(3642, 4050397924410223331L ^ var1)
+ var6
+ a<"b">(19695, 6484239267184060469L ^ var1)
+ var5
+ a<"b">(2243, 914018217316445202L ^ var1)
+ var4
+ a<"b">(3074, 7199129030913616094L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 128245168232620L;
int var4 = this.D.hashCode();
vm.a<"Å">(-1162385754504231195L, var1);
var4 = var4 * b<"s">(28265, 8949361532020834244L ^ var1) + this.w.hashCode();
var4 = var4 * b<"s">(10315, 8928428376486607329L ^ var1) + Float.hashCode(this.W);
var4 = var4 * b<"s">(10315, 8928428376486607329L ^ var1) + Float.hashCode(this.c);
var4 = var4 * b<"s">(10315, 8928428376486607329L ^ var1) + Float.hashCode(this.y);
var4 = var4 * b<"s">(10315, 8928428376486607329L ^ var1) + Float.hashCode(this.p);
var4 = var4 * b<"s">(10315, 8928428376486607329L ^ var1) + Float.hashCode(this.z);

try {
if (vm.a<"Å">(-1200786173793275452L, var1) != null) {
vm.a<"Å">("Ingev", -1233197465410377122L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -1169767060733293478L, var1);
}
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
// 000: getstatic su/catlean/ff.a J
// 003: ldc2_w 29928786318960
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -2233205097786898375
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -2226950209301839226
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -2226950209301839226
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnull 05c
// 03c: instanceof su/catlean/ff
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -2226950209301839226
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -2226950209301839226
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/ff
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/ff.D Lsu/catlean/bj;
// 065: aload 5
// 067: getfield su/catlean/ff.D Lsu/catlean/bj;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnull 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -2226950209301839226
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -2226950209301839226
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/ff.w Lorg/joml/Matrix3x2f;
// 092: aload 5
// 094: getfield su/catlean/ff.w Lorg/joml/Matrix3x2f;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: aload 4
// 09c: ifnull 0c7
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w -2226950209301839226
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w -2226950209301839226
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/ff.W F
// 0bf: aload 5
// 0c1: getfield su/catlean/ff.W F
// 0c4: invokestatic java/lang/Float.compare (FF)I
// 0c7: aload 4
// 0c9: ifnull 0f4
// 0cc: ifeq 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w -2226950209301839226
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w -2226950209301839226
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/ff.c F
// 0ec: aload 5
// 0ee: getfield su/catlean/ff.c F
// 0f1: invokestatic java/lang/Float.compare (FF)I
// 0f4: aload 4
// 0f6: ifnull 121
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w -2226950209301839226
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w -2226950209301839226
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/ff.y F
// 119: aload 5
// 11b: getfield su/catlean/ff.y F
// 11e: invokestatic java/lang/Float.compare (FF)I
// 121: aload 4
// 123: ifnull 14e
// 126: ifeq 142
// 129: goto 136
// 12c: ldc2_w -2226950209301839226
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w -2226950209301839226
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 0
// 143: getfield su/catlean/ff.p F
// 146: aload 5
// 148: getfield su/catlean/ff.p F
// 14b: invokestatic java/lang/Float.compare (FF)I
// 14e: aload 4
// 150: ifnull 17b
// 153: ifeq 16f
// 156: goto 163
// 159: ldc2_w -2226950209301839226
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: bipush 0
// 164: ireturn
// 165: ldc2_w -2226950209301839226
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 0
// 170: getfield su/catlean/ff.z F
// 173: aload 5
// 175: getfield su/catlean/ff.z F
// 178: invokestatic java/lang/Float.compare (FF)I
// 17b: aload 4
// 17d: ifnull 19d
// 180: ifeq 19c
// 183: goto 190
// 186: ldc2_w -2226950209301839226
// 189: lload 2
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: bipush 0
// 191: ireturn
// 192: ldc2_w -2226950209301839226
// 195: lload 2
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: bipush 1
// 19d: ireturn
}

static {
long var11 = a ^ 133373332127278L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[9];
int var18 = 0;
String var17 = "ðã\u0005K¤ú.r¡\u008b±\u0011!6Ù|\u0010Uæ¢ÿQº\u0094h,¿aÏ\u009f\u0094\u0088ç\u0010·L4&\u0007MKÍ\u0012\u008e\u0015ç..Gp\u0010\u0002Å^\u0095)0fåÈ\u001b\u0090.á\u001d*w(;´Å2K \u0086\u0093¹Æ`\u0017\u0097\u0084gëT\u0096²ÌBóî\u0006P\u009a\u0081\u008c:é\fClþ]\u0088§ÍCH\u0010t*5\u0087ÞPU\u009b£÷wO\u00964E\u0089\u0010Ão\u0098ë¾Ø|msÔÄ¸\u008fµ1\u0088";
int var19 = "ðã\u0005K¤ú.r¡\u008b±\u0011!6Ù|\u0010Uæ¢ÿQº\u0094h,¿aÏ\u009f\u0094\u0088ç\u0010·L4&\u0007MKÍ\u0012\u008e\u0015ç..Gp\u0010\u0002Å^\u0095)0fåÈ\u001b\u0090.á\u001d*w(;´Å2K \u0086\u0093¹Æ`\u0017\u0097\u0084gëT\u0096²ÌBóî\u0006P\u009a\u0081\u008c:é\fClþ]\u0088§ÍCH\u0010t*5\u0087ÞPU\u009b£÷wO\u00964E\u0089\u0010Ão\u0098ë¾Ø|msÔÄ¸\u008fµ1\u0088"
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
d = new String[9];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[6];
int var3 = 0;
String var4 = "×P£\u0086Ø½\u000eÀP¡\u0002HÙN\u009d¯\u008b\u001fBþd\u001aGE%\u0095}ä\u0010\u0003Å¬";
int var5 = "×P£\u0086Ø½\u000eÀP¡\u0002HÙN\u009d¯\u008b\u001fBþd\u001aGE%\u0095}ä\u0010\u0003Å¬".length();
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
g = new Integer[6];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u0088}½à%¥«lë±ê²\u001a\u0099\u009fÆ";
var5 = "\u0088}½à%¥«lë±ê²\u001a\u0099\u009fÆ".length();
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

var17 = "¿g¨\u0082a£rB\u0090Þç¢»ÇõÛ\u0010;F_ÊYEÄ\u0099\u0096,Àç\u0010Òè\u0017";
var19 = "¿g¨\u0082a£rB\u0090Þç¢»ÇõÛ\u0010;F_ÊYEÄ\u0099\u0096,Àç\u0010Òè\u0017".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13314;
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
throw new RuntimeException("su/catlean/ff", var10);
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
throw new RuntimeException("su/catlean/ff" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16299;
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
throw new RuntimeException("su/catlean/ff", var14);
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
throw new RuntimeException("su/catlean/ff" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
