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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.BasicProjectionMatrixEvent;
import su.catlean.gofra.Flow;

public final class kj extends _g {
@NotNull
public static final kj L;
@NotNull
private static final av W;
@NotNull
private static final ct z;
@NotNull
private static final av l;
@NotNull
private static final ct e;
@NotNull
private static final fd t;
private static final long a = yz.a(8312389092053637099L, 3566925015409492064L, MethodHandles.lookup().lookupClass()).a(124271329227642L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private kj(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 110104834356125L;
super(b<"i">(25795, 5588586428004935152L ^ var1), jt.y(), null, 4, null, var3);
}

private final lj a(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 117428019887252L;
return (lj)W.E(this, var3, w[0]);
}

private final float i(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 98153954160172L;
return ((Number)z.E(this, var6, w[1])).floatValue();
}

private final lj t(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 137872486320239L;
return (lj)l.E(this, var6, w[2]);
}

private final float w(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 109151229489582L;
return ((Number)e.E(this, var3, w[3])).floatValue();
}

@Flow
private final void V(BasicProjectionMatrixEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kj.a J
// 003: ldc2_w 110982413300440
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 98218740659891
// 00d: lxor
// 00e: dup2
// 00f: bipush 32
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 32
// 018: lshl
// 019: bipush 48
// 01b: lushr
// 01c: l2i
// 01d: istore 5
// 01f: dup2
// 020: bipush 48
// 022: lshl
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 6
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 133323165963233
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 78569547321202
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 123691908390044
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 137944050815216
// 043: lxor
// 044: dup2
// 045: bipush 8
// 047: lushr
// 048: lstore 13
// 04a: dup2
// 04b: bipush 56
// 04d: lshl
// 04e: bipush 56
// 050: lushr
// 051: l2i
// 052: istore 15
// 054: pop2
// 055: dup2
// 056: ldc2_w 117756583824843
// 059: lxor
// 05a: dup2
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 16
// 061: dup2
// 062: bipush 16
// 064: lshl
// 065: bipush 32
// 067: lushr
// 068: l2i
// 069: istore 17
// 06b: dup2
// 06c: bipush 48
// 06e: lshl
// 06f: bipush 48
// 071: lushr
// 072: l2i
// 073: istore 18
// 075: pop2
// 076: dup2
// 077: ldc2_w 86846165910088
// 07a: lxor
// 07b: lstore 19
// 07d: pop2
// 07e: ldc2_w 5750554657681523770
// 081: lload 2
// 082: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: astore 21
// 089: getstatic su/catlean/kj.t Lsu/catlean/fd;
// 08c: aload 0
// 08d: lload 19
// 08f: invokespecial su/catlean/kj.a (J)Lsu/catlean/lj;
// 092: invokevirtual su/catlean/lj.X ()I
// 095: iload 16
// 097: i2s
// 098: swap
// 099: iload 17
// 09b: swap
// 09c: iload 18
// 09e: i2c
// 09f: swap
// 0a0: invokestatic su/catlean/bx.k (SICI)Z
// 0a3: aload 21
// 0a5: ifnonnull 0fc
// 0a8: ifeq 0ce
// 0ab: goto 0b8
// 0ae: ldc2_w 5761218522470630236
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: lload 13
// 0bb: iload 15
// 0bd: i2b
// 0be: invokespecial su/catlean/kj.i (JB)F
// 0c1: goto 109
// 0c4: ldc2_w 5761218522470630236
// 0c7: lload 2
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: aload 0
// 0cf: aload 21
// 0d1: ifnonnull 100
// 0d4: iload 4
// 0d6: iload 5
// 0d8: i2c
// 0d9: iload 6
// 0db: invokespecial su/catlean/kj.t (ICI)Lsu/catlean/lj;
// 0de: invokevirtual su/catlean/lj.X ()I
// 0e1: iload 16
// 0e3: i2s
// 0e4: swap
// 0e5: iload 17
// 0e7: swap
// 0e8: iload 18
// 0ea: i2c
// 0eb: swap
// 0ec: invokestatic su/catlean/bx.k (SICI)Z
// 0ef: goto 0fc
// 0f2: ldc2_w 5761218522470630236
// 0f5: lload 2
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: ifeq 108
// 0ff: aload 0
// 100: lload 9
// 102: invokespecial su/catlean/kj.w (J)F
// 105: goto 109
// 108: fconst_1
// 109: lload 11
// 10b: dup2_x1
// 10c: pop2
// 10d: invokevirtual su/catlean/fd.B (JF)V
// 110: aload 21
// 112: ifnonnull 1e5
// 115: aload 0
// 116: iload 4
// 118: iload 5
// 11a: i2c
// 11b: iload 6
// 11d: invokespecial su/catlean/kj.t (ICI)Lsu/catlean/lj;
// 120: invokevirtual su/catlean/lj.X ()I
// 123: iload 16
// 125: i2s
// 126: swap
// 127: iload 17
// 129: swap
// 12a: iload 18
// 12c: i2c
// 12d: swap
// 12e: invokestatic su/catlean/bx.k (SICI)Z
// 131: ifne 1ac
// 134: goto 141
// 137: ldc2_w 5761218522470630236
// 13a: lload 2
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: aload 0
// 142: lload 19
// 144: invokespecial su/catlean/kj.a (J)Lsu/catlean/lj;
// 147: invokevirtual su/catlean/lj.X ()I
// 14a: iload 16
// 14c: i2s
// 14d: swap
// 14e: iload 17
// 150: swap
// 151: iload 18
// 153: i2c
// 154: swap
// 155: invokestatic su/catlean/bx.k (SICI)Z
// 158: aload 21
// 15a: ifnonnull 18f
// 15d: goto 16a
// 160: ldc2_w 5761218522470630236
// 163: lload 2
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: ifne 1ac
// 16d: goto 17a
// 170: ldc2_w 5761218522470630236
// 173: lload 2
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: getstatic su/catlean/kj.t Lsu/catlean/fd;
// 17d: invokevirtual su/catlean/fd.a ()F
// 180: fconst_1
// 181: fcmpg
// 182: goto 18f
// 185: ldc2_w 5761218522470630236
// 188: lload 2
// 189: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: athrow
// 18f: aload 21
// 191: ifnonnull 1a5
// 194: ifne 1a8
// 197: goto 1a4
// 19a: ldc2_w 5761218522470630236
// 19d: lload 2
// 19e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: athrow
// 1a4: bipush 1
// 1a5: goto 1a9
// 1a8: bipush 0
// 1a9: ifne 1e9
// 1ac: aload 1
// 1ad: aload 1
// 1ae: invokevirtual su/catlean/api/event/events/render/BasicProjectionMatrixEvent.getFov ()F
// 1b1: getstatic su/catlean/kj.t Lsu/catlean/fd;
// 1b4: invokevirtual su/catlean/fd.a ()F
// 1b7: fdiv
// 1b8: invokevirtual su/catlean/api/event/events/render/BasicProjectionMatrixEvent.setFov (F)V
// 1bb: aload 1
// 1bc: lload 7
// 1be: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1c1: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 1c4: invokevirtual net/minecraft/class_1041.method_4489 ()I
// 1c7: i2f
// 1c8: lload 7
// 1ca: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1cd: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 1d0: invokevirtual net/minecraft/class_1041.method_4506 ()I
// 1d3: i2f
// 1d4: fdiv
// 1d5: invokevirtual su/catlean/api/event/events/render/BasicProjectionMatrixEvent.setRatio (F)V
// 1d8: goto 1e5
// 1db: ldc2_w 5761218522470630236
// 1de: lload 2
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: aload 1
// 1e6: invokevirtual su/catlean/api/event/events/render/BasicProjectionMatrixEvent.cancel ()V
// 1e9: return
}

static {
long var27 = a ^ 75701708780262L;
long var29 = var27 ^ 1989103554978L;
long var31 = var27 ^ 86124030707210L;
long var33 = var27 ^ 68672855354706L;
long var35 = var27 ^ 46241704946806L;
long var10001 = var27 ^ 16711400640357L;
int var37 = (int)((var27 ^ 16711400640357L) >>> 32);
int var38 = (int)((var27 ^ 16711400640357L) << 32 >>> 48);
int var39 = (int)(var10001 << 48 >>> 48);
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[13];
int var23 = 0;
String var22 = "µnÓ¢(òiõºíìº*ê¿éi{a\u007fÔ\u0002S¹¹[W\u0094¾½-\\\u0010,½Í³\u0004Ï\u008fh#Ó\u009b\u008dÂ}Ûß\u0018¿±\b\u00906'6þ_xSÐô&ZuÇ°\u0088ºÃG\rZ ¶Ù\u000fÔ\u001f±ÎâqH»Ì=6ë\f>`\u000b4\u008a×º·ª6¸!Mbâ\u0087\u0010õ\u0014°Øòº¸e/3:º\u0092\u0080ØÈ {ð\u008b¯z\u0098\u001f\u008f\u009b;×¶øjçÙÀ\\\u0090eW\u0088\u0087¸ªTÍ©(¯5U Y\"ô·{¿ø-l\u0081\u00199\u001dÛÅ6Ä´ûÍãj&¯>ÍÛ\u0018\u008få<k\u0018´»\u001eU\u0013ÏÛ\u0007½)\u0000áS#\r\u009d~\u0089@ï\u000e¹µâ\u0018Uñ\u009cÊvR\\\u007fo3&¸\u0087²\u009a\u0017Õ\u0083ËY\u001eO¸)8öÒÀ\u000b\u0083ò-7\u0018\u009bã~\u008eÃ^µ\u001c5)Ò\u0090&$¿kÕÉº\u0085xp¢³\u000fB0Dg\u008aA\u0087>c'\u001fÂN\u009bí\\\u001aÚÓ2<\u0007 \u0085ýíåÏ!À\t\u0080\u0093Ñ7\\ÿÔ÷]\u0006*S\u0096\u0089à?\u0094\u0085\u0007\u001aÁ1-9";
int var24 = "µnÓ¢(òiõºíìº*ê¿éi{a\u007fÔ\u0002S¹¹[W\u0094¾½-\\\u0010,½Í³\u0004Ï\u008fh#Ó\u009b\u008dÂ}Ûß\u0018¿±\b\u00906'6þ_xSÐô&ZuÇ°\u0088ºÃG\rZ ¶Ù\u000fÔ\u001f±ÎâqH»Ì=6ë\f>`\u000b4\u008a×º·ª6¸!Mbâ\u0087\u0010õ\u0014°Øòº¸e/3:º\u0092\u0080ØÈ {ð\u008b¯z\u0098\u001f\u008f\u009b;×¶øjçÙÀ\\\u0090eW\u0088\u0087¸ªTÍ©(¯5U Y\"ô·{¿ø-l\u0081\u00199\u001dÛÅ6Ä´ûÍãj&¯>ÍÛ\u0018\u008få<k\u0018´»\u001eU\u0013ÏÛ\u0007½)\u0000áS#\r\u009d~\u0089@ï\u000e¹µâ\u0018Uñ\u009cÊvR\\\u007fo3&¸\u0087²\u009a\u0017Õ\u0083ËY\u001eO¸)8öÒÀ\u000b\u0083ò-7\u0018\u009bã~\u008eÃ^µ\u001c5)Ò\u0090&$¿kÕÉº\u0085xp¢³\u000fB0Dg\u008aA\u0087>c'\u001fÂN\u009bí\\\u001aÚÓ2<\u0007 \u0085ýíåÏ!À\t\u0080\u0093Ñ7\\ÿÔ÷]\u0006*S\u0096\u0089à?\u0094\u0085\u0007\u001aÁ1-9"
.length();
char var21 = ' ';
int var43 = -1;

label64:
while (true) {
String var44 = var22.substring(++var43, var43 + var21);
byte var49 = -1;

while (true) {
byte[] var26 = var18.doFinal(var44.getBytes("ISO-8859-1"));
String var58 = b(var26).intern();
switch (var49) {
case 0:
var25[var23++] = var58;
if ((var43 += var21) >= var24) {
b = var25;
c = new String[13];
Cipher var8;
var10000 = var8 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var9 = 1; var9 < 8; var9++) {
var10003[var9] = (byte)(var27 << var9 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var7 = new long[6];
int var11 = 0;
String var12 = "^V\u0087Èø5\u0017\u009bµú.!Tÿ#J\u007f±A\u009bMõÈS\u0089Ë\u0005V\b;f\u0016";
int var13 = "^V\u0087Èø5\u0017\u009bµú.!Tÿ#J\u007f±A\u009bMõÈS\u0089Ë\u0005V\b;f\u0016".length();
byte var10 = 0;

label46:
while (true) {
byte var53 = var10;
var10 += 8;
byte[] var14 = var12.substring(var53, var10).getBytes("ISO-8859-1");
long[] var47 = var7;
int var54 = var11++;
long var62 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var67 = -1;

while (true) {
long var15 = var62;
byte[] var17 = var8.doFinal(
new byte[]{
(byte)(var15 >>> 56),
(byte)(var15 >>> 48),
(byte)(var15 >>> 40),
(byte)(var15 >>> 32),
(byte)(var15 >>> 24),
(byte)(var15 >>> 16),
(byte)(var15 >>> 8),
(byte)var15
}
);
long var70 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var67) {
case 0:
var47[var54] = var70;
if (var10 >= var13) {
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -8372481784507597022L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var65 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var56 = -1;
long var0 = var65;
KProperty[] var40 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(kj.class, b<"i">(5730, 1414805009574967944L ^ var27), b<"i">(28324, 3781043653024432719L ^ var27), 0)),
Reflection.property1(new PropertyReference1Impl(kj.class, b<"i">(21728, 4634669626517780486L ^ var27), b<"i">(1483, 5676557730201872681L ^ var27), 0)),
Reflection.property1(new PropertyReference1Impl(kj.class, b<"i">(3561, 294715030499959050L ^ var27), b<"i">(22855, 2419241083274786222L ^ var27), 0)),
Reflection.property1(new PropertyReference1Impl(kj.class, b<"i">(24002, 2249657481526636839L ^ var27), b<"i">(28299, 3675697866337796707L ^ var27), 0))
};
w = var40;
L = new kj(var29);
W = yp.J(
L, b<"i">(3161, 1477727037969703093L ^ var27), new lj(0, false, var35, false, (int)var7[3], null), null, var37, null, var38, (char)var39, (int)var7[0], null
);
z = yp.k(L, b<"i">(31461, 7202240824032220673L ^ var27), 8.0F, var31, RangesKt.rangeTo(1.0F, 25.0F), null, null, (int)var7[1], null);
l = yp.J(
L, b<"i">(3479, 767422043818172791L ^ var27), new lj(0, false, var35, false, (int)var7[2], null), null, var37, null, var38, (char)var39, (int)var7[4], null
);
e = yp.k(L, b<"i">(23496, 6499051793365268271L ^ var27), 0.75F, var31, RangesKt.rangeTo(0.1F, 1.0F), null, null, (int)var7[5], null);
t = new fd(_s.OUT_QUINT, var0, var33);
return;
}
break;
default:
var47[var54] = var70;
if (var10 < var13) {
continue label46;
}

var12 = "\u0014\" 3@p\t'~á\u001c\u0094\u000e>°\u009b";
var13 = "\u0014\" 3@p\t'~á\u001c\u0094\u000e>°\u009b".length();
var10 = 0;
}

byte var55 = var10;
var10 += 8;
var14 = var12.substring(var55, var10).getBytes("ISO-8859-1");
var47 = var7;
var54 = var11++;
var62 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var67 = 0;
}
}
}

var21 = var22.charAt(var43);
break;
default:
var25[var23++] = var58;
if ((var43 += var21) < var24) {
var21 = var22.charAt(var43);
continue label64;
}

var22 = "{&Qu¤\u009dÎ\u0002ÉáADîA\u0016t\\¶ºõC|³|Ê\u0092ÎM^\u0012hi§Î²£ ã<Ï\u0003Mis~\u0018)UöF1\u0083[qî\u001b ¹§êê-÷&eèÞYyÌ¯·y\\¡4F\u00965¹@\u001f\u0085_e:¥â©";
var24 = "{&Qu¤\u009dÎ\u0002ÉáADîA\u0016t\\¶ºõC|³|Ê\u0092ÎM^\u0012hi§Î²£ ã<Ï\u0003Mis~\u0018)UöF1\u0083[qî\u001b ¹§êê-÷&eèÞYyÌ¯·y\\¡4F\u00965¹@\u001f\u0085_e:¥â©"
.length();
var21 = '8';
var43 = -1;
}

var44 = var22.substring(++var43, var43 + var21);
var49 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8822;
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
throw new RuntimeException("su/catlean/kj", var10);
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
throw new RuntimeException("su/catlean/kj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
