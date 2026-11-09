package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class o2 {
private static String Y;
private static final long a = yz.a(3056892224553483098L, -7781879240830200846L, MethodHandles.lookup().lookupClass()).a(119731494148497L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public static final void D(@NotNull _g $this$notify, @NotNull Object m, long a) {
ax = a ^ ax;
long var10001 = ax ^ 2682508437384L;
int var4 = (int)((ax ^ 2682508437384L) >>> 32);
int var5 = (int)((ax ^ 2682508437384L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter($this$notify, a<"a">(7042, 3353167477665503849L ^ ax));
Intrinsics.checkNotNullParameter(m, "m");
e($this$notify, m.toString(), var4, (char)var5, (short)var6, null, 0, null, b<"l">(17943, 157313754736215329L ^ ax), null);
}

public static final void O(long a, @NotNull _g $this$notify, @NotNull String message, @NotNull ys type, int timeout, @Nullable class_1799 item) {
ax = a ^ ax;
long var7 = ax ^ 27692145446570L;
Intrinsics.checkNotNullParameter($this$notify, a<"a">(7042, 3353200714052954556L ^ ax));
Intrinsics.checkNotNullParameter(message, a<"a">(25510, 1459058745898144159L ^ ax));
Intrinsics.checkNotNullParameter(type, a<"a">(8653, 9096606052154921975L ^ ax));
sg.H.A($this$notify.k(), var7, message, timeout, type, item);
}

public static final void F(@NotNull _g $this$message, long a, @NotNull Object m) {
ax = a ^ ax;
long var4 = ax ^ 111756297303781L;
Intrinsics.checkNotNullParameter($this$message, a<"a">(18643, 3873839835771293957L ^ ax));
Intrinsics.checkNotNullParameter(m, "m");
S($this$message, m.toString(), false, 2, null, var4);
}

public static final void j(@NotNull _g $this$message, @NotNull String message, boolean chat, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/o2.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 121676069391357
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 13125380326015
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 85815112943067
// 019: lxor
// 01a: lstore 9
// 01c: pop2
// 01d: ldc2_w 1690866554409594885
// 020: lload 3
// 021: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: aload 0
// 027: sipush 7042
// 02a: ldc2_w 3353158749402647555
// 02d: lload 3
// 02e: lxor
// 02f: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/o2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 034: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 037: astore 11
// 039: aload 1
// 03a: aload 11
// 03c: ifnonnull 0c3
// 03f: sipush 4329
// 042: ldc2_w 6625815170786412388
// 045: lload 3
// 046: lxor
// 047: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/o2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04f: iload 2
// 050: ifeq 074
// 053: goto 060
// 056: ldc2_w 1686819459700142721
// 059: lload 3
// 05a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: athrow
// 060: lload 7
// 062: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 065: aload 1
// 066: invokevirtual net/minecraft/class_634.method_45729 (Ljava/lang/String;)V
// 069: return
// 06a: ldc2_w 1686819459700142721
// 06d: lload 3
// 06e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: athrow
// 074: getstatic net/minecraft/class_124.field_1060 Lnet/minecraft/class_124;
// 077: getstatic net/minecraft/class_124.field_1080 Lnet/minecraft/class_124;
// 07a: getstatic net/minecraft/class_124.field_1065 Lnet/minecraft/class_124;
// 07d: aload 0
// 07e: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 081: checkcast java/lang/CharSequence
// 084: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 087: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 08a: getstatic net/minecraft/class_124.field_1080 Lnet/minecraft/class_124;
// 08d: aload 1
// 08e: astore 13
// 090: astore 14
// 092: astore 15
// 094: astore 16
// 096: astore 17
// 098: sipush 31453
// 09b: ldc2_w 4638383377154354514
// 09e: lload 3
// 09f: lxor
// 0a0: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/o2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: aload 17
// 0a7: ldc "["
// 0a9: aload 16
// 0ab: aload 15
// 0ad: aload 14
// 0af: sipush 4181
// 0b2: ldc2_w 7094161936940582875
// 0b5: lload 3
// 0b6: lxor
// 0b7: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/o2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: aload 13
// 0be: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
// 0c3: invokestatic net/minecraft/class_2561.method_30163 (Ljava/lang/String;)Lnet/minecraft/class_2561;
// 0c6: dup
// 0c7: sipush 28552
// 0ca: ldc2_w 3640847179892832268
// 0cd: lload 3
// 0ce: lxor
// 0cf: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/o2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d7: astore 12
// 0d9: lload 5
// 0db: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0de: aload 11
// 0e0: ifnonnull 125
// 0e3: invokevirtual net/minecraft/class_310.method_18854 ()Z
// 0e6: ifeq 113
// 0e9: goto 0f6
// 0ec: ldc2_w 1686819459700142721
// 0ef: lload 3
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: lload 9
// 0f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fb: aload 12
// 0fd: bipush 0
// 0fe: invokevirtual net/minecraft/class_746.method_7353 (Lnet/minecraft/class_2561;Z)V
// 101: aload 11
// 103: ifnull 12f
// 106: goto 113
// 109: ldc2_w 1686819459700142721
// 10c: lload 3
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: lload 5
// 115: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 118: goto 125
// 11b: ldc2_w 1686819459700142721
// 11e: lload 3
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: aload 12
// 127: invokedynamic run (Lnet/minecraft/class_2561;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/o2.t (Lnet/minecraft/class_2561;)V, ()V ]
// 12c: invokevirtual net/minecraft/class_310.method_40000 (Ljava/lang/Runnable;)V
// 12f: return
}

@NotNull
public static final String f(@NotNull _g $this$i18n, @NotNull String message, @NotNull Object[] args, boolean common, long a) {
ax = a ^ ax;
long var10001 = ax ^ 107884255452348L;
int var6 = (int)((ax ^ 107884255452348L) >>> 32);
int var7 = (int)((ax ^ 107884255452348L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
String var10000 = vm.a<"Å">(-880128666310355781L, ax);
Intrinsics.checkNotNullParameter($this$i18n, a<"a">(7042, 3353173557959043261L ^ ax));
Intrinsics.checkNotNullParameter(message, a<"a">(25510, 1459084845253152926L ^ ax));
String var9 = var10000;

label40: {
try {
Intrinsics.checkNotNullParameter(args, a<"a">(26502, 4129818475860317370L ^ ax));
var27 = i4.h;
if (common) {
var30 = a<"a">(19525, 3459945901244579703L ^ ax);
break label40;
}
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, -876296659806038465L, ax);
}

var30 = $this$i18n.N().q() + "." + $this$i18n.U();
}

String var22 = a<"a">(31677, 8005513938610047104L ^ ax) + var30 + "." + message;
i4 var21 = var27;
boolean var12 = false;
Object[] var13 = args;
Collection var14 = new ArrayList(args.length);
boolean var15 = false;
int var16 = 0;
int var17 = args.length;

label32:
while (true) {
if (var16 < var17) {
var10000 = (String)var13[var16];

do {
Object var18 = var10000;
var29 = var14;
if (var9 != null) {
break label32;
}

boolean var20 = false;
Intrinsics.checkNotNull(var18, a<"a">(881, 5348772410019950671L ^ ax));
var14.add(var18);
var16++;
if (var9 == null) {
continue label32;
}

var10000 = new _g[4];
} while (ax < 0L);

vm.a<"Å">(var10000, -923861414539167472L, ax);
}

var29 = var14;
break;
}

List var23 = (List)var29;
Collection var11 = var23;
var12 = false;
Object[] var10 = var11.toArray(new Object[0]);
return var21.E(var6, var22, var7, Arrays.copyOf(var10, var10.length), var8);
}

private static final void t(class_2561 var0) {
long var1 = a ^ 92778916455749L;
long var3 = var1 ^ 79757826095779L;
zf.v(var3).method_7353(var0, false);
}

public static void X(String var0) {
Y = var0;
}

public static String v() {
return Y;
}

static {
long var20 = a ^ 42644792788137L;
vm.a<"Å">(null, -3935019900893840921L, var20);
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
String var15 = "ç&\u0013º\u000f\u0018Ú\u001dùi5\u009dÓ\u0088ùg1\u0013\u0012MCD@\u0081ç.7\u0015\u0013Îtä\u0084\u0002\u001dðæö¾y\u0010§Î\u0093\u008cèÆb\u0012øÍu\u0080ë\u0098¹7\u0010SpËEv51gÚøéY\u0007\u001c;H\u0010\u0018t\u0019¡Þ\u009fß\u0094 ª~ ýÏ\u0095\u0005X\ne¿»\u000e|\fË¯JÇz\u0091Q§ú\u000f%4`\u0019Á\u009cC\u007f\u000eöõÁÙv&â\u001f\u008d\u001bûâ/\u0082\u009e\u0082Ã0¶wö¼¯<©zt>}k´Ò\u00897Ù\u001fêá¨Éjä\u008c«\u0083®*\u0014ah\u0096á\u001b06ã\b«>Ç\u0019é\u0010[ê´m\u001e¼xñ5Û°hû¦HF\u0010í\u001e\u0014,ûT¾L·I G#\u0000î- vâñ$Ô°¤øÕtXh\u0007m \u0011\u0003<\u008dyHE}Bló\u0092\"¡³\u001d´\u0010\u0084ï¯\u0013EÀwº}\u0003ÚeáÃi\u0083\u0010\u0091þcë«vZT\u009bÄõW\u009b\fm¢";
int var17 = "ç&\u0013º\u000f\u0018Ú\u001dùi5\u009dÓ\u0088ùg1\u0013\u0012MCD@\u0081ç.7\u0015\u0013Îtä\u0084\u0002\u001dðæö¾y\u0010§Î\u0093\u008cèÆb\u0012øÍu\u0080ë\u0098¹7\u0010SpËEv51gÚøéY\u0007\u001c;H\u0010\u0018t\u0019¡Þ\u009fß\u0094 ª~ ýÏ\u0095\u0005X\ne¿»\u000e|\fË¯JÇz\u0091Q§ú\u000f%4`\u0019Á\u009cC\u007f\u000eöõÁÙv&â\u001f\u008d\u001bûâ/\u0082\u009e\u0082Ã0¶wö¼¯<©zt>}k´Ò\u00897Ù\u001fêá¨Éjä\u008c«\u0083®*\u0014ah\u0096á\u001b06ã\b«>Ç\u0019é\u0010[ê´m\u001e¼xñ5Û°hû¦HF\u0010í\u001e\u0014,ûT¾L·I G#\u0000î- vâñ$Ô°¤øÕtXh\u0007m \u0011\u0003<\u008dyHE}Bló\u0092\"¡³\u001d´\u0010\u0084ï¯\u0013EÀwº}\u0003ÚeáÃi\u0083\u0010\u0091þcë«vZT\u009bÄõW\u009b\fm¢"
.length();
char var14 = '(';
int var23 = -1;

label45:
while (true) {
String var24 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var33;
if ((var23 += var14) >= var17) {
b = var18;
c = new String[12];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "Fs\u0087ÉÇ[AÌüL¨ÆR\u009bº\u001c";
int var5 = "Fs\u0087ÉÇ[AÌüL¨ÆR\u009bº\u001c".length();
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
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
return;
}

var14 = var15.charAt(var23);
break;
default:
var18[var16++] = var33;
if ((var23 += var14) < var17) {
var14 = var15.charAt(var23);
continue label45;
}

var15 = "SQ\u001f\u009f\u009d(É\u009fÕ¬£5\u0000yU\u0013\u0010\u0004ÒÞ\u0098\u0013Õ\u001cú¶É.K\u0001.Æ\u0097";
var17 = "SQ\u001f\u009f\u009d(É\u009fÕ¬£5\u0000yU\u0013\u0010\u0004ÒÞ\u0098\u0013Õ\u001cú¶É.K\u0001.Æ\u0097".length();
var14 = 16;
var23 = -1;
}

var24 = var15.substring(++var23, var23 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16688;
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
throw new RuntimeException("su/catlean/o2", var10);
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
throw new RuntimeException("su/catlean/o2" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17385;
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
throw new RuntimeException("su/catlean/o2", var14);
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
throw new RuntimeException("su/catlean/o2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
