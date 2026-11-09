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

public final class yh {
private final float P;
private final float m;
private final float S;
@NotNull
private final Enum Z;
@NotNull
private final fd x;
private static final long a = yz.a(7097905613796251025L, 2601798964985699917L, MethodHandles.lookup().lookupClass()).a(247327208534087L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long h;

public yh(float x, float y, float w, @NotNull Enum value, @NotNull fd animation, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(value, a<"a">(12957, 3286739665926933501L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"a">(4513, 8091507401172740294L ^ ax));
super();
this.P = xx;
this.m = y;
this.S = w;
this.Z = value;
this.x = animation;
}

public final float F() {
return this.P;
}

public final float j() {
return this.m;
}

public final float I() {
return this.S;
}

@NotNull
public final Enum X() {
return this.Z;
}

@NotNull
public final fd i() {
return this.x;
}

public final float E() {
return this.P;
}

public final float L() {
return this.m;
}

public final float C() {
return this.S;
}

@NotNull
public final Enum p() {
return this.Z;
}

@NotNull
public final fd g() {
return this.x;
}

@NotNull
public final yh r(float x, long a, float y, float w, @NotNull Enum value, @NotNull fd animation) {
ax = a ^ ax;
long var8 = ax ^ 81573838301611L;
Intrinsics.checkNotNullParameter(value, a<"a">(5994, 2271989520462795737L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"a">(25944, 5967290290014200298L ^ ax));
return new yh(xx, y, w, value, animation, var8);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 45604973916123L;
fd var3 = this.x;
Enum var4 = this.Z;
float var5 = this.S;
float var6 = this.m;
float var7 = this.P;
return a<"a">(22908, 4037338205147732277L ^ var1)
+ var7
+ a<"a">(14644, 5635978659110287742L ^ var1)
+ var6
+ a<"a">(17713, 9108763156043859327L ^ var1)
+ var5
+ a<"a">(27302, 1507180046076160736L ^ var1)
+ var4
+ a<"a">(28393, 8702222714118811298L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 93402848033149L;
int var3 = Float.hashCode(this.P);
var3 = var3 * b<"s">(30826, 8051741849443870379L ^ var1) + Float.hashCode(this.m);
var3 = var3 * b<"s">(18250, 983990493855455625L ^ var1) + Float.hashCode(this.S);
var3 = var3 * b<"s">(18250, 983990493855455625L ^ var1) + this.Z.hashCode();
return var3 * b<"s">(18250, 983990493855455625L ^ var1) + this.x.hashCode();
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
// 000: getstatic su/catlean/yh.a J
// 003: ldc2_w 28406963995953
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 1176351425965840334
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 1199700923097575599
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 1199700923097575599
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnull 05c
// 03c: instanceof su/catlean/yh
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 1199700923097575599
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 1199700923097575599
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/yh
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/yh.P F
// 065: aload 5
// 067: getfield su/catlean/yh.P F
// 06a: invokestatic java/lang/Float.compare (FF)I
// 06d: aload 4
// 06f: ifnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w 1199700923097575599
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 1199700923097575599
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/yh.m F
// 092: aload 5
// 094: getfield su/catlean/yh.m F
// 097: invokestatic java/lang/Float.compare (FF)I
// 09a: aload 4
// 09c: ifnull 0c7
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 1199700923097575599
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 1199700923097575599
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/yh.S F
// 0bf: aload 5
// 0c1: getfield su/catlean/yh.S F
// 0c4: invokestatic java/lang/Float.compare (FF)I
// 0c7: aload 4
// 0c9: ifnull 0f4
// 0cc: ifeq 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 1199700923097575599
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 1199700923097575599
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/yh.Z Ljava/lang/Enum;
// 0ec: aload 5
// 0ee: getfield su/catlean/yh.Z Ljava/lang/Enum;
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f4: aload 4
// 0f6: ifnull 121
// 0f9: ifne 115
// 0fc: goto 109
// 0ff: ldc2_w 1199700923097575599
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 1199700923097575599
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/yh.x Lsu/catlean/fd;
// 119: aload 5
// 11b: getfield su/catlean/yh.x Lsu/catlean/fd;
// 11e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 121: aload 4
// 123: ifnull 143
// 126: ifne 142
// 129: goto 136
// 12c: ldc2_w 1199700923097575599
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w 1199700923097575599
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: bipush 1
// 143: ireturn
}

static {
long var16 = a ^ 46544965120404L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[9];
int var23 = 0;
String var22 = "^\u0087·ø±³!Ì\u0004¹ÆÔÂ\u0014\u0095\u001f\u0018°jù-®Q\u0097\u00029D`\u0086åúÒþ\u009aÖ6ìO\u0084'k õ\u0091\\Ò\u009fiò*Ú;%ÌÕÿX\u0099nºÜR3\\$É|å£¿þuOÓ\u0010a\u0006qó¤\u0095²òÈø\u001dØ\u000e\u000ejV\u0010\u0080êVæ\u008b\u008f..¬ ]³#©óK \u0004À¥iî^|ã\u0092}¹\u0007D\u000e\u0090ï6óä\u0006\u0090eÕÚ\fô\u009cE\u001e±á¡ Y³\u008f´!'¦ä@¬[u¸ Ûû\u00adîï O\u0007_÷),Ï·(\u0094ðÎ";
int var24 = "^\u0087·ø±³!Ì\u0004¹ÆÔÂ\u0014\u0095\u001f\u0018°jù-®Q\u0097\u00029D`\u0086åúÒþ\u009aÖ6ìO\u0084'k õ\u0091\\Ò\u009fiò*Ú;%ÌÕÿX\u0099nºÜR3\\$É|å£¿þuOÓ\u0010a\u0006qó¤\u0095²òÈø\u001dØ\u000e\u000ejV\u0010\u0080êVæ\u008b\u008f..¬ ]³#©óK \u0004À¥iî^|ã\u0092}¹\u0007D\u000e\u0090ï6óä\u0006\u0090eÕÚ\fô\u009cE\u001e±á¡ Y³\u008f´!'¦ä@¬[u¸ Ûû\u00adîï O\u0007_÷),Ï·(\u0094ðÎ"
.length();
char var21 = 16;
int var29 = -1;

label64:
while (true) {
String var30 = var22.substring(++var29, var29 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var43;
if ((var29 += var21) >= var24) {
b = var25;
c = new String[9];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[5];
int var8 = 0;
String var9 = "î 0\u0083\u0007¼\u0012\u0015ùÒq\u0092e\u0012ð\u0091½¤³Ç\u0013\u0019\u0082\u0003";
int var10 = "î 0\u0083\u0007¼\u0012\u0015ùÒq\u0092e\u0012ð\u0091½¤³Ç\u0013\u0019\u0082\u0003".length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var33 = var11;
var10001 = var8++;
long var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var52 = -1;

while (true) {
long var13 = var47;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var55 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var52) {
case 0:
var33[var10001] = var55;
if (var7 >= var10) {
e = var11;
f = new Integer[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -7968631829931066264L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var50 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var41 = -1;
h = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "\nª\u0090\u0004Èñ@\u0083\u0011!ò\u0082gh¶æ";
var10 = "\nª\u0090\u0004Èñ@\u0083\u0011!ò\u0082gh¶æ".length();
var7 = 0;
}

byte var40 = var7;
var7 += 8;
var12 = var9.substring(var40, var7).getBytes("ISO-8859-1");
var33 = var11;
var10001 = var8++;
var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var52 = 0;
}
}
}

var21 = var22.charAt(var29);
break;
default:
var25[var23++] = var43;
if ((var29 += var21) < var24) {
var21 = var22.charAt(var29);
continue label64;
}

var22 = "gÓkuJ¿¤r³ã¥\u00982º\nÀRûä\u0089ÛÛ;¯Zéº¸ð\u0082ñé c\u008dnó\u0082hc/wAìg\u009ck,õ\tz¬ë!%C\u0090½\u00878\u00000\u001c[\u0098";
var24 = "gÓkuJ¿¤r³ã¥\u00982º\nÀRûä\u0089ÛÛ;¯Zéº¸ð\u0082ñé c\u008dnó\u0082hc/wAìg\u009ck,õ\tz¬ë!%C\u0090½\u00878\u00000\u001c[\u0098".length();
var21 = ' ';
var29 = -1;
}

var30 = var22.substring(++var29, var29 + var21);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31727;
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
throw new RuntimeException("su/catlean/yh", var10);
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
throw new RuntimeException("su/catlean/yh" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13255;
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
throw new RuntimeException("su/catlean/yh", var14);
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
throw new RuntimeException("su/catlean/yh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
