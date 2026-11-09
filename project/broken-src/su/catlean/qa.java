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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.StringDecomposerEvent;
import su.catlean.gofra.Flow;

public final class qa extends _g {
@NotNull
public static final qa d;
static final KProperty[] P;
@NotNull
private static final cl j;
@NotNull
private static final cw C;
private static final long a = yz.a(2878155593475320591L, -336301487634253425L, MethodHandles.lookup().lookupClass()).a(82147503996816L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);

private qa(int var1, byte var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ a;
long var6 = var4 ^ 72662292435668L;
super(b<"h">(27945, 2141124084379579986L ^ var4), jt.d(), null, 4, null, var6);
}

@NotNull
public final String r(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 117353789119071L;
return (String)j.E(this, var6, P[0]);
}

@NotNull
public final b9 h(int var1, long var2) {
long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
long var6 = var4 ^ 102399300628256L;
return (b9)C.E(this, var6, P[1]);
}

@Flow
private final void G(StringDecomposerEvent var1) {
long var2 = a ^ 102134121407627L;
long var10001 = var2 ^ 129491939148333L;
int var4 = (int)((var2 ^ 129491939148333L) >>> 48);
int var5 = (int)((var2 ^ 129491939148333L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);
var1.setString(this.M((char)var4, var5, (short)var6, var1.getString()));
}

@NotNull
public final String M(char a, int a, short a, @NotNull String text) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/qa.a J
// 01a: lxor
// 01b: lstore 5
// 01d: lload 5
// 01f: dup2
// 020: ldc2_w 97680536114351
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 58878698647896
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 89824298250861
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 131268522057879
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 22343620539849
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 3611544435158
// 046: lxor
// 047: dup2
// 048: bipush 48
// 04a: lushr
// 04b: l2i
// 04c: istore 17
// 04e: dup2
// 04f: bipush 16
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 18
// 058: dup2
// 059: bipush 32
// 05b: lshl
// 05c: bipush 32
// 05e: lushr
// 05f: l2i
// 060: istore 19
// 062: pop2
// 063: dup2
// 064: ldc2_w 58080302402729
// 067: lxor
// 068: dup2
// 069: bipush 32
// 06b: lushr
// 06c: l2i
// 06d: istore 20
// 06f: dup2
// 070: bipush 32
// 072: lshl
// 073: bipush 32
// 075: lushr
// 076: lstore 21
// 078: pop2
// 079: pop2
// 07a: aload 4
// 07c: sipush 17434
// 07f: ldc2_w 5393316690337266627
// 082: lload 5
// 084: lxor
// 085: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/qa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08d: aload 0
// 08e: lload 9
// 090: invokevirtual su/catlean/qa.S (J)Z
// 093: ifeq 0ad
// 096: aload 0
// 097: lload 13
// 099: invokevirtual su/catlean/qa.f (J)Z
// 09c: ifne 0bb
// 09f: goto 0ad
// 0a2: ldc2_w 7473605070924332453
// 0a5: lload 5
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: aload 4
// 0af: areturn
// 0b0: ldc2_w 7473605070924332453
// 0b3: lload 5
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aconst_null
// 0bc: astore 23
// 0be: aload 4
// 0c0: lload 15
// 0c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c5: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 0c8: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 0cb: dup
// 0cc: sipush 24411
// 0cf: ldc2_w 7055603900083462272
// 0d2: lload 5
// 0d4: lxor
// 0d5: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/qa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0dd: aload 0
// 0de: iload 17
// 0e0: i2s
// 0e1: iload 18
// 0e3: i2c
// 0e4: iload 19
// 0e6: invokevirtual su/catlean/qa.r (SCI)Ljava/lang/String;
// 0e9: bipush 0
// 0ea: bipush 4
// 0eb: aconst_null
// 0ec: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 0ef: astore 23
// 0f1: aload 0
// 0f2: iload 20
// 0f4: lload 21
// 0f6: invokevirtual su/catlean/qa.h (IJ)Lsu/catlean/b9;
// 0f9: getstatic su/catlean/b9.ONLY_SELF Lsu/catlean/b9;
// 0fc: if_acmpeq 1c9
// 0ff: lload 11
// 101: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 104: invokevirtual net/minecraft/class_634.method_2880 ()Ljava/util/Collection;
// 107: dup
// 108: sipush 12653
// 10b: ldc2_w 3619346085462183602
// 10e: lload 5
// 110: lxor
// 111: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/qa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 119: checkcast java/lang/Iterable
// 11c: astore 24
// 11e: bipush 0
// 11f: istore 25
// 121: aload 24
// 123: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 128: astore 26
// 12a: aload 26
// 12c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 131: ifeq 1c8
// 134: aload 26
// 136: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 13b: astore 27
// 13d: aload 27
// 13f: checkcast net/minecraft/class_640
// 142: astore 28
// 144: bipush 0
// 145: istore 29
// 147: iload 1
// 148: iflt 1c9
// 14b: getstatic su/catlean/qa.d Lsu/catlean/qa;
// 14e: iload 20
// 150: lload 21
// 152: invokevirtual su/catlean/qa.h (IJ)Lsu/catlean/b9;
// 155: getstatic su/catlean/b9.ALL Lsu/catlean/b9;
// 158: if_acmpeq 190
// 15b: getstatic su/catlean/c7.b Lsu/catlean/c7;
// 15e: aload 28
// 160: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
// 163: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 166: dup
// 167: sipush 7294
// 16a: ldc2_w 5036934438785950630
// 16d: lload 5
// 16f: lxor
// 170: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/qa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 178: lload 7
// 17a: dup2_x1
// 17b: pop2
// 17c: invokevirtual su/catlean/c7.Y (JLjava/lang/String;)Z
// 17f: ifeq 1c2
// 182: goto 190
// 185: ldc2_w 7473605070924332453
// 188: lload 5
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: aload 23
// 192: aload 28
// 194: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
// 197: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 19a: dup
// 19b: sipush 7294
// 19e: ldc2_w 5036934438785950630
// 1a1: lload 5
// 1a3: lxor
// 1a4: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/qa.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ac: getstatic su/catlean/qa.d Lsu/catlean/qa;
// 1af: iload 17
// 1b1: i2s
// 1b2: iload 18
// 1b4: i2c
// 1b5: iload 19
// 1b7: invokevirtual su/catlean/qa.r (SCI)Ljava/lang/String;
// 1ba: bipush 0
// 1bb: bipush 4
// 1bc: aconst_null
// 1bd: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 1c0: astore 23
// 1c2: nop
// 1c3: nop
// 1c4: iload 1
// 1c5: ifge 12a
// 1c8: nop
// 1c9: aload 23
// 1cb: areturn
}

static {
long var20 = a ^ 125678748250339L;
long var10001 = var20 ^ 19166999638766L;
int var22 = (int)((var20 ^ 19166999638766L) >>> 32);
int var23 = (int)((var20 ^ 19166999638766L) << 32 >>> 56);
int var24 = (int)(var10001 << 40 >>> 40);
long var25 = var20 ^ 89567463672031L;
long var27 = var20 ^ 10735428535726L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[12];
int var16 = 0;
String var15 = "¡\u0000{.ìÂ+W\u0018\\Î\u0084Ñ\u0089e\u001a\u0018ÿ±Ý\u0011>(\u0094\u008b0º\u0082T\u001a\u0007è1í\u0090(^W9µ1\u0018\u0010\tç`|à\u009a\u0013\u0091>Û1!\u0092\u0082ñ\u000bª\u0096¬l\u0096f\u009e\u0010Eí\u008bÊ#U.\u0013]Üª¡ÐGÕæ\u0010Ã\u00014\u009aUûà\u0007MIl6Ó#µ÷(4\u0099\u0092\u0015Oo\u0092¿k)\u001cl\u0007sJ&Ýï\u000bVECê{|~Îcc\u009b²×¯\u008e\u0092èv`sæ &?^\u0091é HÌW3½ÿÊÔUa\u0095G)OêÌ£^;ê\u0091÷¨\u0083\u0081\u00980¯\u0094.;\u0098É\u0010?\u0017ÑËÉupí$îÅÄ6òk=Æ\u0085\u009c£mÍåy²a6×\u001cb\u0017tËí°\u008aÆ\u0099\u0089Y\u00840d×\u0084Mý¥øþÜ\u00ad\u009dWG\u0087\u0011ï\u001c<ÿmÓÕ|¬qé\u0017\u00921þ±þá4Jú½\u0006Ì}¯è0CþíÿM\u0010R\u009dJòòñS\u0089\u0098?¹AaA\u0002&";
int var17 = "¡\u0000{.ìÂ+W\u0018\\Î\u0084Ñ\u0089e\u001a\u0018ÿ±Ý\u0011>(\u0094\u008b0º\u0082T\u001a\u0007è1í\u0090(^W9µ1\u0018\u0010\tç`|à\u009a\u0013\u0091>Û1!\u0092\u0082ñ\u000bª\u0096¬l\u0096f\u009e\u0010Eí\u008bÊ#U.\u0013]Üª¡ÐGÕæ\u0010Ã\u00014\u009aUûà\u0007MIl6Ó#µ÷(4\u0099\u0092\u0015Oo\u0092¿k)\u001cl\u0007sJ&Ýï\u000bVECê{|~Îcc\u009b²×¯\u008e\u0092èv`sæ &?^\u0091é HÌW3½ÿÊÔUa\u0095G)OêÌ£^;ê\u0091÷¨\u0083\u0081\u00980¯\u0094.;\u0098É\u0010?\u0017ÑËÉupí$îÅÄ6òk=Æ\u0085\u009c£mÍåy²a6×\u001cb\u0017tËí°\u008aÆ\u0099\u0089Y\u00840d×\u0084Mý¥øþÜ\u00ad\u009dWG\u0087\u0011ï\u001c<ÿmÓÕ|¬qé\u0017\u00921þ±þá4Jú½\u0006Ì}¯è0CþíÿM\u0010R\u009dJòòñS\u0089\u0098?¹AaA\u0002&"
.length();
char var14 = 16;
int var31 = -1;

label47:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
byte var35 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var42 = b(var19).intern();
switch (var35) {
case 0:
var18[var16++] = var42;
if ((var31 += var14) >= var17) {
b = var18;
c = new String[12];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[2];
int var4 = 0;
String var5 = ",\u0082\u0000\u0083\u00862\u0015°´V&\u0087\u008c\u0012±Ú";
int var6 = ",\u0082\u0000\u0083\u00862\u0015°´V&\u0087\u008c\u0012±Ú".length();
byte var3 = 0;

do {
byte var39 = var3;
var3 += 8;
byte[] var7 = var5.substring(var39, var3).getBytes("ISO-8859-1");
int var40 = var4++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var1.doFinal(
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
byte var47 = -1;
var0[var40] = var10004;
} while (var3 < var6);

KProperty[] var29 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(qa.class, b<"h">(5828, 7435107025347262068L ^ var20), b<"h">(9036, 876771218501108735L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(qa.class, b<"h">(20642, 8461468456897441823L ^ var20), b<"h">(23109, 4813965052739844857L ^ var20), 0))
};
P = var29;
d = new qa(var22, (byte)var23, var24);
j = yp.x(d, b<"h">(25088, 1267666089292612287L ^ var20), b<"h">(31209, 5068276673388796251L ^ var20), null, null, (int)var0[1], var25, null);
C = yp.L(d, b<"h">(15141, 8589488042117798801L ^ var20), b9.FRIENDS, null, null, (int)var0[0], null, var27);
return;
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var42;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label47;
}

var15 = "Ä.\u008d«Ç\u009b[£Ácc»ù.\"õtµës\u0002ê\u001e±>AÆ©\u0083Ø\u008dÄ\u0010\r\u00162\u0017lGöm\u009fË·Û\u0016@ÈP";
var17 = "Ä.\u008d«Ç\u009b[£Ácc»ù.\"õtµës\u0002ê\u001e±>AÆ©\u0083Ø\u008dÄ\u0010\r\u00162\u0017lGöm\u009fË·Û\u0016@ÈP".length();
var14 = ' ';
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
var35 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22908;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/qa", var10);
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
throw new RuntimeException("su/catlean/qa" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
