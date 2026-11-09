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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class zu {
private final double b;
private final double t;
private final double J;
private final float k;
private final float B;
private static final long a = yz.a(7325655384240919583L, 2717649034411818806L, MethodHandles.lookup().lookupClass()).a(110498198596409L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public zu(double x, double y, double z, float yaw, float pitch) {
this.b = x;
this.t = y;
this.J = z;
this.k = yaw;
this.B = pitch;
}

public final double L() {
return this.b;
}

public final double P() {
return this.t;
}

public final double B() {
return this.J;
}

public final float s() {
return this.k;
}

public final float M() {
return this.B;
}

public final double x() {
return this.b;
}

public final double o() {
return this.t;
}

public final double U() {
return this.J;
}

public final float y() {
return this.k;
}

public final float w() {
return this.B;
}

@NotNull
public final zu W(double x, double y, double z, float yaw, float pitch) {
return new zu(x, y, z, yaw, pitch);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static zu Q(zu var0, double var1, double var3, double var5, float var7, float var8, int var9, Object var10, long var11) {
var11 = a ^ var11;
String[] var13 = vm.a<"Å">(-4318131635675773165L, var11);

int var10000;
label99: {
label98: {
try {
var10000 = var9 & 1;
if (var13 != null) {
break label99;
}

if (var10000 == 0) {
break label98;
}
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, -4309611781574449586L, var11);
}

var1 = var0.b;
}

var10000 = var9 & 2;
}

String[] var10001;
label90: {
label89: {
label88: {
try {
var10001 = var13;
if (var11 < 0L) {
break label90;
}

if (var13 != null) {
break label89;
}

if (var10000 == 0) {
break label88;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, -4309611781574449586L, var11);
}

var3 = var0.t;
}

var10000 = var9 & 4;
}

try {
var10001 = var13;
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, -4309611781574449586L, var11);
}
}

label77: {
label76: {
label75: {
try {
if (var11 < 0L) {
break label77;
}

if (var10001 != null) {
break label76;
}

if (var10000 == 0) {
break label75;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -4309611781574449586L, var11);
}

var5 = var0.J;
}

var10000 = var9 & b<"u">(11521, 3978500677568470564L ^ var11);
}

try {
var10001 = var13;
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -4309611781574449586L, var11);
}
}

label64: {
label63: {
try {
if (var10001 != null) {
break label64;
}

if (var10000 == 0) {
break label63;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, -4309611781574449586L, var11);
}

var7 = var0.k;
}

var10000 = var9 & b<"u">(25610, 9161178847726556973L ^ var11);
}

if (var10000 != 0) {
var8 = var0.B;
}

try {
zu var22 = var0.W(var1, var3, var5, var7, var8);
if (var11 > 0L && vm.a<"Å">(-4281087060761323001L, var11) != null) {
vm.a<"Å">(new String[2], -4284672939785630002L, var11);
}

return var22;
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -4309611781574449586L, var11);
}
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 93812257630534L;
float var3 = this.B;
float var4 = this.k;
double var5 = this.J;
double var7 = this.t;
double var9 = this.b;
return a<"e">(18962, 4144554962658382969L ^ var1)
+ var9
+ a<"e">(29411, 6167655080977820811L ^ var1)
+ var7
+ a<"e">(15598, 6108938565003125383L ^ var1)
+ var5
+ a<"e">(19758, 3351128909899256644L ^ var1)
+ var4
+ a<"e">(10741, 4915234526484903835L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 72286790943351L;
String[] var10000 = vm.a<"Å">(1486616145226667936L, var1);
int var4 = Double.hashCode(this.b);
String[] var3 = var10000;
var4 = var4 * b<"u">(23866, 958614991639232173L ^ var1) + Double.hashCode(this.t);
var4 = var4 * b<"u">(7199, 4376748897396522890L ^ var1) + Double.hashCode(this.J);
var4 = var4 * b<"u">(7199, 4376748897396522890L ^ var1) + Float.hashCode(this.k);
var4 = var4 * b<"u">(7199, 4376748897396522890L ^ var1) + Float.hashCode(this.B);

try {
if (var3 != null) {
vm.a<"Å">(new _g[2], 1464742031145377390L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 1477815426310829821L, var1);
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
// 000: getstatic su/catlean/zu.a J
// 003: ldc2_w 126860822046745
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -85648251531002418
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -77560016586040173
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -77560016586040173
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/zu
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -77560016586040173
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -77560016586040173
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/zu
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/zu.b D
// 065: aload 5
// 067: getfield su/catlean/zu.b D
// 06a: invokestatic java/lang/Double.compare (DD)I
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w -77560016586040173
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -77560016586040173
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/zu.t D
// 092: aload 5
// 094: getfield su/catlean/zu.t D
// 097: invokestatic java/lang/Double.compare (DD)I
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w -77560016586040173
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w -77560016586040173
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/zu.J D
// 0bf: aload 5
// 0c1: getfield su/catlean/zu.J D
// 0c4: invokestatic java/lang/Double.compare (DD)I
// 0c7: aload 4
// 0c9: ifnonnull 0f4
// 0cc: ifeq 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w -77560016586040173
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w -77560016586040173
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/zu.k F
// 0ec: aload 5
// 0ee: getfield su/catlean/zu.k F
// 0f1: invokestatic java/lang/Float.compare (FF)I
// 0f4: aload 4
// 0f6: ifnonnull 121
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w -77560016586040173
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w -77560016586040173
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/zu.B F
// 119: aload 5
// 11b: getfield su/catlean/zu.B F
// 11e: invokestatic java/lang/Float.compare (FF)I
// 121: aload 4
// 123: ifnonnull 143
// 126: ifeq 142
// 129: goto 136
// 12c: ldc2_w -77560016586040173
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w -77560016586040173
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: bipush 1
// 143: ireturn
}

static {
long var11 = a ^ 74651374611481L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[5];
int var18 = 0;
String var17 = "¿(\u001a\u009d\u009aeô\u000bæÆ>DóK=É \u0097\u0010Y÷^\u008a¥Ç !Â\r\u00ad\u0094-ï\u008bVí\tn\u001b\u008c¥ù,Añ¾³ .\u0010A®É\u009ddXÂo¬Ý$00ÅG\u0087";
int var19 = "¿(\u001a\u009d\u009aeô\u000bæÆ>DóK=É \u0097\u0010Y÷^\u008a¥Ç !Â\r\u00ad\u0094-ï\u008bVí\tn\u001b\u008c¥ù,Añ¾³ .\u0010A®É\u009ddXÂo¬Ý$00ÅG\u0087"
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
c = var20;
d = new String[5];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "A~ö¦ÅGî\u0019.-É=ÀH\\\u0089";
int var5 = "A~ö¦ÅGî\u0019.-É=ÀH\\\u0089".length();
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
g = new Integer[4];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "±Ô\u008dÑA|&d}ÓA,OMï\u009d";
var5 = "±Ô\u008dÑA|&d}ÓA,OMï\u009d".length();
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

var17 = "\u0092\u0012«Í\u009al1~\u009dM9Á\u0087Öç¿ \u000e\u0011ÎÃ1¡ú±\\µA^\u0094>|´ò\\ÅJè!\u0017\u0081n'\u007f«Ã\u0093úØ";
var19 = "\u0092\u0012«Í\u009al1~\u009dM9Á\u0087Öç¿ \u000e\u0011ÎÃ1¡ú±\\µA^\u0094>|´ò\\ÅJè!\u0017\u0081n'\u007f«Ã\u0093úØ".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8239;
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
throw new RuntimeException("su/catlean/zu", var10);
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
throw new RuntimeException("su/catlean/zu" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 30434;
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
throw new RuntimeException("su/catlean/zu", var14);
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
throw new RuntimeException("su/catlean/zu" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
