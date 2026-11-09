package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mi {
@NotNull
public static final mi B;
private static final char y;
private static final long a = yz.a(-7902933317316973469L, 6459911424360205231L, MethodHandles.lookup().lookupClass()).a(204650246606868L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private mi() {
}

@NotNull
public final String X(@NotNull class_2561 t, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(t, "t");
StringBuilder var4 = new StringBuilder();
int[] var6 = new int[]{b<"j">(8541, 2517381089527918671L ^ ax)};
t.method_27658(mi::E, class_2583.field_24360);
var4.append((char)b<"j">(29378, 8379297124266779614L ^ ax)).append((char)b<"j">(16486, 7641384803259191664L ^ ax));
String var10000 = var4.toString();
Intrinsics.checkNotNullExpressionValue(var10000, a<"m">(8045, 2347432198326961804L ^ ax));
return var10000;
}

private final String B(int var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 78922821737543L;
long var6 = var2 ^ 30062596044376L;
_g[] var10000 = vm.a<"Å">(-1809572405454632734L, var2);
Character var9 = this.b(var1, var6);
_g[] var8 = var10000;

try {
if (var8 != null) {
return "§" + var9;
}

if (var9 == null) {
return this.H(var1, var4);
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -1838675186146096915L, var2);
}

return "§" + var9;
}

private final String H(int var1, long var2) {
var2 = a ^ var2;
Locale var7 = Locale.ROOT;
_g[] var10000 = vm.a<"Å">(-4465279081553122295L, var2);
String var8 = a<"m">(11436, 6718938507413325230L ^ var2);
Object[] var9 = new Object[]{var1 & b<"j">(7376, 621084274409422129L ^ var2)};
_g[] var4 = var10000;
String var15 = String.format(var7, var8, Arrays.copyOf(var9, var9.length));
Intrinsics.checkNotNullExpressionValue(var15, a<"m">(7086, 3183280181342384815L ^ var2));
String var5 = var15;
StringBuilder var6 = new StringBuilder(b<"j">(19981, 7608802925737111521L ^ var2));
var6.append((char)b<"j">(29378, 8379368356410938170L ^ var2)).append((char)b<"j">(3020, 3569231911102818863L ^ var2));
int var12 = 0;
int var13 = var5.length();

label33:
while (true) {
if (var12 < var13) {
if (var2 <= 0L) {
return var5;
}

char var14 = var5.charAt(var12);

do {
try {
var17 = var6.append((char)b<"j">(29378, 8379368356410938170L ^ var2)).append(var14);
if (var4 != null) {
break label33;
}

var12++;
if (var4 == null) {
continue label33;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -4426887243593683962L, var2);
}
} while (var2 < 0L);
}

var17 = var6;
break;
}

String var16 = var17.toString();
Intrinsics.checkNotNullExpressionValue(var16, a<"m">(24414, 176969678755133022L ^ var2));
return var16;
}

@Nullable
public final Character b(int rgb, long a) {
ax = a ^ ax;
_g[] var4 = vm.a<"Å">(7500596494086538774L, ax);

try {
int var10000 = rgb & b<"j">(7376, 621167219482269486L ^ ax);
if (var4 != null) {
return Character.valueOf((char)var10000);
} else {
switch (var10000) {
case 0:
return Character.valueOf((char)b<"j">(2627, 762301734720537017L ^ ax));
case 170:
return Character.valueOf((char)b<"j">(30168, 7846092106160504359L ^ ax));
case 43520:
return Character.valueOf((char)b<"j">(11770, 2406499357894321691L ^ ax));
case 43690:
return Character.valueOf((char)b<"j">(24026, 5639847510981858866L ^ ax));
case 5592405:
return Character.valueOf((char)b<"j">(19614, 4450770848796198770L ^ ax));
case 5592575:
return Character.valueOf((char)b<"j">(12321, 8491217490924977107L ^ ax));
case 5635925:
return Character.valueOf((char)b<"j">(32622, 2607621043909522570L ^ ax));
case 5636095:
return Character.valueOf((char)b<"j">(24188, 404639049498285462L ^ ax));
case 11141120:
return Character.valueOf((char)b<"j">(14437, 3153771033656832899L ^ ax));
case 11141290:
return Character.valueOf((char)b<"j">(9953, 1346798442486934786L ^ ax));
case 11184810:
return Character.valueOf((char)b<"j">(16638, 7661491884909447964L ^ ax));
case 16733525:
return Character.valueOf((char)b<"j">(24576, 3262539967710358510L ^ ax));
case 16733695:
return Character.valueOf((char)b<"j">(25530, 189405775575771203L ^ ax));
case 16755200:
return Character.valueOf((char)b<"j">(30204, 1967429773955956243L ^ ax));
case 16777045:
return Character.valueOf((char)b<"j">(17089, 4446044832212371769L ^ ax));
case 16777215:
return Character.valueOf((char)b<"j">(21814, 7008986196026023638L ^ ax));
default:
return null;
}
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 7534474972358067737L, ax);
}
}

private static final Optional E(int[] param0, StringBuilder param1, class_2583 param2, String param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/mi.a J
// 003: ldc2_w 67808010200822
// 006: lxor
// 007: lstore 4
// 009: lload 4
// 00b: dup2
// 00c: ldc2_w 39191377510750
// 00f: lxor
// 010: lstore 6
// 012: pop2
// 013: ldc2_w 6850327109079445776
// 016: lload 4
// 018: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: aload 2
// 01e: sipush 22002
// 021: ldc2_w 1327684227869008360
// 024: lload 4
// 026: lxor
// 027: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/mi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 02f: astore 8
// 031: aload 3
// 032: sipush 20152
// 035: ldc2_w 8456598199059708581
// 038: lload 4
// 03a: lxor
// 03b: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/mi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 043: aload 3
// 044: checkcast java/lang/CharSequence
// 047: invokeinterface java/lang/CharSequence.length ()I 1
// 04c: aload 8
// 04e: ifnonnull 063
// 051: ifne 066
// 054: goto 062
// 057: ldc2_w 6884295064122585375
// 05a: lload 4
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: bipush 1
// 063: goto 067
// 066: bipush 0
// 067: ifeq 079
// 06a: invokestatic java/util/Optional.empty ()Ljava/util/Optional;
// 06d: areturn
// 06e: ldc2_w 6884295064122585375
// 071: lload 4
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: aload 2
// 07a: invokevirtual net/minecraft/class_2583.method_10973 ()Lnet/minecraft/class_5251;
// 07d: dup
// 07e: ifnull 0a1
// 081: invokevirtual net/minecraft/class_5251.method_27716 ()I
// 084: sipush 10864
// 087: ldc2_w 8106400446499821197
// 08a: lload 4
// 08c: lxor
// 08d: invokedynamic j (IJ)I bsm=su/catlean/mi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: iand
// 093: goto 0a3
// 096: ldc2_w 6884295064122585375
// 099: lload 4
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: pop
// 0a2: bipush -1
// 0a3: istore 9
// 0a5: aload 8
// 0a7: ifnonnull 11f
// 0aa: iload 9
// 0ac: aload 0
// 0ad: bipush 0
// 0ae: iaload
// 0af: if_icmpeq 119
// 0b2: goto 0c0
// 0b5: ldc2_w 6884295064122585375
// 0b8: lload 4
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: iload 9
// 0c2: bipush -1
// 0c3: if_icmpne 105
// 0c6: goto 0d4
// 0c9: ldc2_w 6884295064122585375
// 0cc: lload 4
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: aload 1
// 0d5: sipush 8379
// 0d8: ldc2_w 7586089544201346112
// 0db: lload 4
// 0dd: lxor
// 0de: invokedynamic j (IJ)I bsm=su/catlean/mi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
// 0e6: sipush 17096
// 0e9: ldc2_w 6296002824302624299
// 0ec: lload 4
// 0ee: lxor
// 0ef: invokedynamic j (IJ)I bsm=su/catlean/mi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
// 0f7: goto 113
// 0fa: ldc2_w 6884295064122585375
// 0fd: lload 4
// 0ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: athrow
// 105: aload 1
// 106: getstatic su/catlean/mi.B Lsu/catlean/mi;
// 109: iload 9
// 10b: lload 6
// 10d: invokespecial su/catlean/mi.B (IJ)Ljava/lang/String;
// 110: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 113: pop
// 114: aload 0
// 115: bipush 0
// 116: iload 9
// 118: iastore
// 119: aload 1
// 11a: aload 3
// 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 11e: pop
// 11f: invokestatic java/util/Optional.empty ()Ljava/util/Optional;
// 122: areturn
}

static {
long var11 = a ^ 131993427793433L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[6];
int var18 = 0;
String var17 = ">¶B©\u009e\u0017§ç&Çú£±kPÏ\u0012}åy\u009b\u000f\r¦\u0018\u0019wN\u0018|Tï\u0096\u0006¹V%Í\u00020Ë\u001f©½\u0094\u0084=R\u008d\u0010=\u0007\t¾\u0003Î\\*ÕYâÙÕ\u009cAÈ\u0010\u0011\u0002{Ó%>\u0096òw¢¤8Ö\u0095z²";
int var19 = ">¶B©\u009e\u0017§ç&Çú£±kPÏ\u0012}åy\u009b\u000f\r¦\u0018\u0019wN\u0018|Tï\u0096\u0006¹V%Í\u00020Ë\u001f©½\u0094\u0084=R\u008d\u0010=\u0007\t¾\u0003Î\\*ÕYâÙÕ\u009cAÈ\u0010\u0011\u0002{Ó%>\u0096òw¢¤8Ö\u0095z²"
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
c = new String[6];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[26];
int var3 = 0;
String var4 = "Ì\r'\u008fMòd`Â¬\u0084\u001cH\u009eï÷I\u0097ÚÆ\u007f\u001a1«Z&\u0081(\"3x\"à<tY9\u0015¸Êrd\u0015üö\u0010\u0082æÿ\u00074NßXc3qsáLµ:\u009cð\u00adfC)×\u009düªuöÛ\u0089ì÷<Ýê(\u0001có~6\u00052jåéé£ï£Å\u0094\u0006£WUåêÃ^\u0099û_â3m\\§NX\tZá:¢Z}\u0096Ë\u0082ýÂC\u0011\u0006\u001fò\u0007æw\n\u0085ã\u0014Ä\u001a\u0083\u0007h\u008b\u008dt\u008eó\u000e_ì\u0080\u008a\u008aïzy\u008a\u001cÅØ\u0086!T7`4\rÌ2JÓÖS¸Êä]ÀíÕ\u00952-A\u0015_ÔCx";
int var5 = "Ì\r'\u008fMòd`Â¬\u0084\u001cH\u009eï÷I\u0097ÚÆ\u007f\u001a1«Z&\u0081(\"3x\"à<tY9\u0015¸Êrd\u0015üö\u0010\u0082æÿ\u00074NßXc3qsáLµ:\u009cð\u00adfC)×\u009düªuöÛ\u0089ì÷<Ýê(\u0001có~6\u00052jåéé£ï£Å\u0094\u0006£WUåêÃ^\u0099û_â3m\\§NX\tZá:¢Z}\u0096Ë\u0082ýÂC\u0011\u0006\u001fò\u0007æw\n\u0085ã\u0014Ä\u001a\u0083\u0007h\u008b\u008dt\u008eó\u000e_ì\u0080\u008a\u008aïzy\u008a\u001cÅØ\u0086!T7`4\rÌ2JÓÖS¸Êä]ÀíÕ\u00952-A\u0015_ÔCx"
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
f = new Integer[26];
y = (char)b<"j">(32743, var11 ^ 1692855237012583397L);
B = new mi();
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u0095Æ\u0085À\u0081D¢,¹/PQ²³\u001d\u008e";
var5 = "\u0095Æ\u0085À\u0081D¢,¹/PQ²³\u001d\u008e".length();
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

var17 = "G\u0094¿Zf\nÆìõÂUgLÑ ñ×95YÏ®á\u007f \u007fA\u0007\u001fhñP¸à\u009eÕä\u0018¬Xn\u000e?@Â\u000e\u0093ã\u0007õÄP?cNé/";
var19 = "G\u0094¿Zf\nÆìõÂUgLÑ ñ×95YÏ®á\u007f \u007fA\u0007\u001fhñP¸à\u009eÕä\u0018¬Xn\u000e?@Â\u000e\u0093ã\u0007õÄP?cNé/".length();
var16 = 24;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27203;
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
throw new RuntimeException("su/catlean/mi", var10);
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
throw new RuntimeException("su/catlean/mi" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25271;
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
throw new RuntimeException("su/catlean/mi", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
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
throw new RuntimeException("su/catlean/mi" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
