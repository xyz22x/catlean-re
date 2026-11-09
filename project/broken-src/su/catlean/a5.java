package su.catlean;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
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
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

public final class a5 extends a3 {
@NotNull
public static final a5 t;
private static final long b = yz.a(-5802770135694742385L, -8426882597775477875L, MethodHandles.lookup().lookupClass()).a(110483891582363L);
private static final String[] g;
private static final String[] h;
private static final Map i = new HashMap(13);

private a5(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 70119702201576L;
super(var3, b<"b">(11725, 4423852227413409655L ^ var1));
}

@Override
public void l(@NotNull LiteralArgumentBuilder builder, long a) {
long var4 = a ^ 131983109906692L;
long var6 = a ^ 61473902788714L;
Intrinsics.checkNotNullParameter(builder, b<"b">(15348, 1264386450225721955L ^ a));
builder.then(this.c(var4, b<"b">(3894, 5723903325821355683L ^ a)).executes(a5::f));
builder.then(this.c(var4, b<"b">(31421, 3403825172219736876L ^ a)).then(this.j(b<"b">(4674, 5222394056069536733L ^ a), mp.u.G(), var6).executes(a5::T)));
builder.then(this.c(var4, b<"b">(20675, 458467496386861395L ^ a)).then(this.j(b<"b">(10214, 3842420460808466044L ^ a), s5.n.T(), var6).executes(a5::O)));
builder.then(this.c(var4, b<"b">(24709, 1041714556347951384L ^ a)).executes(a5::E));
builder.executes(a5::b);
}

private static final int f(CommandContext var0) {
long var1 = b ^ 138310861079727L;
long var10001 = var1 ^ 86827820313270L;
int var3 = (int)((var1 ^ 86827820313270L) >>> 32);
int var4 = (int)((var1 ^ 86827820313270L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 39113626960875L;
long var8 = var1 ^ 43960826173771L;
c7.b.K(var8);
t.a(i4.h.E(var3, b<"b">(26494, 7364527594680215314L ^ var1), var4, new Object[0], var5), var6);
return 1;
}

private static final int T(CommandContext var0) {
long var1 = b ^ 96093182154350L;
long var10001 = var1 ^ 110321656166519L;
int var3 = (int)((var1 ^ 110321656166519L) >>> 32);
int var4 = (int)((var1 ^ 110321656166519L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 10156382736682L;
var10001 = var1 ^ 97428954151863L;
int var8 = (int)((var1 ^ 97428954151863L) >>> 48);
int var9 = (int)((var1 ^ 97428954151863L) << 16 >>> 32);
int var10 = (int)(var10001 << 48 >>> 48);
String var11 = (String)var0.getArgument(b<"b">(10214, 3842415997748655433L ^ var1), String.class);
c7 var10000 = c7.b;
Intrinsics.checkNotNull(var11);
var10000.h((char)var8, var9, (short)var10, var11);
a5 var13 = t;
i4 var15 = i4.h;
String var10003 = b<"b">(26809, 4074041328287676952L ^ var1);
Object[] var12 = new Object[]{var11};
var13.a(var15.E(var3, var10003, var4, var12, var5), var6);
return 1;
}

private static final int O(CommandContext var0) {
long var1 = b ^ 60407425216095L;
long var3 = var1 ^ 51849311782030L;
long var10001 = var1 ^ 6337757151302L;
int var5 = (int)((var1 ^ 6337757151302L) >>> 32);
int var6 = (int)((var1 ^ 6337757151302L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
long var8 = var1 ^ 115076861667611L;
String var10 = (String)var0.getArgument(b<"b">(10214, 3842522007152741752L ^ var1), String.class);
c7 var10000 = c7.b;
Intrinsics.checkNotNull(var10);
var10000.j(var3, var10);
a5 var12 = t;
i4 var13 = i4.h;
String var10003 = b<"b">(24954, 4277814879403117536L ^ var1);
Object[] var11 = new Object[]{var10};
var12.a(var13.E(var5, var10003, var6, var11, var7), var8);
return 1;
}

private static final int E(CommandContext param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/a5.b J
// 003: ldc2_w 131301069768222
// 006: lxor
// 007: lstore 1
// 008: lload 1
// 009: dup2
// 00a: ldc2_w 115016455023866
// 00d: lxor
// 00e: lstore 3
// 00f: dup2
// 010: ldc2_w 75152352339975
// 013: lxor
// 014: dup2
// 015: bipush 32
// 017: lushr
// 018: l2i
// 019: istore 5
// 01b: dup2
// 01c: bipush 32
// 01e: lshl
// 01f: bipush 48
// 021: lushr
// 022: l2i
// 023: istore 6
// 025: dup2
// 026: bipush 48
// 028: lshl
// 029: bipush 48
// 02b: lushr
// 02c: l2i
// 02d: istore 7
// 02f: pop2
// 030: dup2
// 031: ldc2_w 45299858293082
// 034: lxor
// 035: lstore 8
// 037: pop2
// 038: ldc2_w 514347479180387222
// 03b: lload 1
// 03c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: astore 10
// 043: aload 10
// 045: ifnonnull 09a
// 048: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 04b: invokevirtual su/catlean/yl.g ()Lsu/catlean/dk;
// 04e: lload 3
// 04f: invokevirtual su/catlean/dk.P (J)Ljava/util/List;
// 052: invokeinterface java/util/List.isEmpty ()Z 1
// 057: ifeq 09f
// 05a: goto 067
// 05d: ldc2_w 535941237145060217
// 060: lload 1
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: getstatic su/catlean/a5.t Lsu/catlean/a5;
// 06a: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 06d: iload 5
// 06f: sipush 28190
// 072: ldc2_w 1327000224627780809
// 075: lload 1
// 076: lxor
// 077: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/a5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: bipush 0
// 07d: anewarray 374
// 080: iload 6
// 082: swap
// 083: iload 7
// 085: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 088: lload 8
// 08a: invokevirtual su/catlean/a5.a (Ljava/lang/String;J)V
// 08d: goto 09a
// 090: ldc2_w 535941237145060217
// 093: lload 1
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: aload 10
// 09c: ifnull 13e
// 09f: new java/lang/StringBuilder
// 0a2: dup
// 0a3: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 0a6: iload 5
// 0a8: sipush 22580
// 0ab: ldc2_w 5374668427799419623
// 0ae: lload 1
// 0af: lxor
// 0b0: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/a5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: bipush 0
// 0b6: anewarray 374
// 0b9: iload 6
// 0bb: swap
// 0bc: iload 7
// 0be: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 0c1: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
// 0c4: astore 11
// 0c6: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 0c9: invokevirtual su/catlean/yl.g ()Lsu/catlean/dk;
// 0cc: lload 3
// 0cd: invokevirtual su/catlean/dk.P (J)Ljava/util/List;
// 0d0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0d5: astore 12
// 0d7: aload 12
// 0d9: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0de: ifeq 11c
// 0e1: aload 12
// 0e3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0e8: checkcast java/lang/String
// 0eb: astore 13
// 0ed: aload 11
// 0ef: aload 13
// 0f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 0f4: sipush 11105
// 0f7: ldc2_w 4412076511546354104
// 0fa: lload 1
// 0fb: lxor
// 0fc: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/a5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 104: pop
// 105: aload 10
// 107: ifnonnull 13e
// 10a: aload 10
// 10c: ifnull 0d7
// 10f: goto 11c
// 112: ldc2_w 535941237145060217
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: getstatic su/catlean/a5.t Lsu/catlean/a5;
// 11f: aload 11
// 121: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
// 124: dup
// 125: sipush 31695
// 128: ldc2_w 2262630942742083865
// 12b: lload 1
// 12c: lxor
// 12d: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/a5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 135: bipush 2
// 136: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 139: lload 8
// 13b: invokevirtual su/catlean/a5.a (Ljava/lang/String;J)V
// 13e: bipush 1
// 13f: ireturn
}

private static final int b(CommandContext var0) {
long var1 = b ^ 131652495427565L;
long var3 = var1 ^ 46065207230633L;
t.a(class_124.field_1061 + b<"b">(26539, 1150489720601109638L ^ var1), var3);
return 1;
}

static {
long var9 = b ^ 119496610384123L;
long var11 = var9 ^ 113638874209836L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[16];
int var5 = 0;
String var4 = "\u0004\u0011%=\u00832Õî[-nÝ[D[\u0087\u0010c!´æü´\u0019³ú\u0081PC\u001d1X\u0088\u0018\u000e3\u0082X\u001d\u009fÍ\u0094\u0092\u009f¥3p²\u0001lqï\u0095èa=\u008a\u001b(E\u009d\u0095ï\u0088#c\"L|ú¡\u009awG\u0092°äÈº1joØ\u001eÀeø¼¹[Ûð[¢Ú\tb>k\u0010èÎ¯t\u001f-SÌ¿ÓÙcÿJKç(êzçuLøÈ\u0007\u009bÞÌLV\u0019¸]¾Q\u0012Fü\u0085Û\u0091©\u0006¡n³=\u0007\u000fU\u0002\u001f_\"+êc\u0010`L¼%á\u001cöÙ8~}\nÖoÅ;(\u000eíìs\u009f?\nìû|Vî8\u008eT@ç(\u0091nâö÷&ÿþlLw\u0099\u0014rÛ\u0003\n\u0003Ì¨¡\u008b\u0010Oñ\u000eoÎ&\u0015-c³\u008e\"¦Úh\u0016(ßöÛq½\u0087@ìv\u0095·ùÈçÏéüÀ$é;kÐÿû\u008f\u0087hÚ\u0015ñô`Æz0ZÐ\u0093,pþ\u0080q;¥xw\u001b\u0085hI=ïØLP\nÄ\u0085È\u0000\u001d\u009b\u0098ª\u0015ÏÅ\u0090\u0003\u000bcã(¤\u0091\f¹§oøJ\u0016\u008c½óÛª\u009bbâÐ^ª\u0016\u008eTw\u0002µX\b\u0016W9þ\u0001\u008eÏt\u001e'-Ì\u0080{\u0092eY»y`×Ls{¢\u0013ùÉ\u0092#ý\u009c\u0091Õ¾\rîF:ÔÝ\u0095¦Ó¡j\u00ad\fH5\u0010\u0013\u0087Ú\u008cF%ú_\u008eå×¾4B\u007f\u0095\u0010\u0082ÿìrª8z\u0085¢7\u009cL|Bî\u0084\u0010\u0005\u0097I\fñªm¯\u0096\u0019Ü\fa\u009cS\u001a";
int var6 = "\u0004\u0011%=\u00832Õî[-nÝ[D[\u0087\u0010c!´æü´\u0019³ú\u0081PC\u001d1X\u0088\u0018\u000e3\u0082X\u001d\u009fÍ\u0094\u0092\u009f¥3p²\u0001lqï\u0095èa=\u008a\u001b(E\u009d\u0095ï\u0088#c\"L|ú¡\u009awG\u0092°äÈº1joØ\u001eÀeø¼¹[Ûð[¢Ú\tb>k\u0010èÎ¯t\u001f-SÌ¿ÓÙcÿJKç(êzçuLøÈ\u0007\u009bÞÌLV\u0019¸]¾Q\u0012Fü\u0085Û\u0091©\u0006¡n³=\u0007\u000fU\u0002\u001f_\"+êc\u0010`L¼%á\u001cöÙ8~}\nÖoÅ;(\u000eíìs\u009f?\nìû|Vî8\u008eT@ç(\u0091nâö÷&ÿþlLw\u0099\u0014rÛ\u0003\n\u0003Ì¨¡\u008b\u0010Oñ\u000eoÎ&\u0015-c³\u008e\"¦Úh\u0016(ßöÛq½\u0087@ìv\u0095·ùÈçÏéüÀ$é;kÐÿû\u008f\u0087hÚ\u0015ñô`Æz0ZÐ\u0093,pþ\u0080q;¥xw\u001b\u0085hI=ïØLP\nÄ\u0085È\u0000\u001d\u009b\u0098ª\u0015ÏÅ\u0090\u0003\u000bcã(¤\u0091\f¹§oøJ\u0016\u008c½óÛª\u009bbâÐ^ª\u0016\u008eTw\u0002µX\b\u0016W9þ\u0001\u008eÏt\u001e'-Ì\u0080{\u0092eY»y`×Ls{¢\u0013ùÉ\u0092#ý\u009c\u0091Õ¾\rîF:ÔÝ\u0095¦Ó¡j\u00ad\fH5\u0010\u0013\u0087Ú\u008cF%ú_\u008eå×¾4B\u007f\u0095\u0010\u0082ÿìrª8z\u0085¢7\u009cL|Bî\u0084\u0010\u0005\u0097I\fñªm¯\u0096\u0019Ü\fa\u009cS\u001a"
.length();
char var3 = 16;
int var14 = -1;

label27:
while (true) {
String var15 = var4.substring(++var14, var14 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
String var21 = b(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var21;
if ((var14 += var3) >= var6) {
g = var7;
h = new String[16];
t = new a5(var11);
return;
}

var3 = var4.charAt(var14);
break;
default:
var7[var5++] = var21;
if ((var14 += var3) < var6) {
var3 = var4.charAt(var14);
continue label27;
}

var4 = "H@\u0081È³ý,x_Ð4óÖaÑî(\u001e\u0090gLÙH\u0083hÖX%¤\u0097\u0003±Í'2iÝ@sî÷ÜëfD>úWq\u008eÍ\u000eÓ\u000e\u00ad\u0006Ò";
var6 = "H@\u0081È³ý,x_Ð4óÖaÑî(\u001e\u0090gLÙH\u0083hÖX%¤\u0097\u0003±Í'2iÝ@sî÷ÜëfD>úWq\u008eÍ\u000eÓ\u000e\u00ad\u0006Ò".length();
var3 = 16;
var14 = -1;
}

var15 = var4.substring(++var14, var14 + var3);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1125;
if (h[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/a5", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = g[var5].getBytes("ISO-8859-1");
h[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return h[var5];
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
throw new RuntimeException("su/catlean/a5" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
