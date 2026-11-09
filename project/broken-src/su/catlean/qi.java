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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class qi extends _g {
@NotNull
public static final qi k;
@NotNull
private static final c8 z;
private static final long a = yz.a(-8879681162057618261L, 4710923740657907029L, MethodHandles.lookup().lookupClass()).a(190366595724108L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private qi(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 51824385369021L;
super(b<"g">(16588, 2073886647064711188L ^ var1), jt.I(), null, 4, null, var3);
}

private final int T(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 47713818993373L;
return ((Number)z.E(this, var6, W[0])).intValue();
}

@Flow
public final void x(@NotNull PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qi.a J
// 003: ldc2_w 109160586544251
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 34763960991125
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 85652612750339
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 773761634175
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 117115874242323
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 9768603396770
// 043: lxor
// 044: dup2
// 045: bipush 32
// 047: lushr
// 048: l2i
// 049: istore 13
// 04b: dup2
// 04c: bipush 32
// 04e: lshl
// 04f: bipush 48
// 051: lushr
// 052: l2i
// 053: istore 14
// 055: dup2
// 056: bipush 48
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 15
// 05f: pop2
// 060: dup2
// 061: ldc2_w 117656326496620
// 064: lxor
// 065: lstore 16
// 067: pop2
// 068: ldc2_w 3720191211884340936
// 06b: lload 2
// 06c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: aload 1
// 072: ldc "e"
// 074: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 077: istore 18
// 079: lload 16
// 07b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07e: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 081: dup
// 082: sipush 28333
// 085: ldc2_w 6878463745572945683
// 088: lload 2
// 089: lxor
// 08a: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/qi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 092: astore 19
// 094: aload 19
// 096: lload 4
// 098: invokestatic su/catlean/xa.K (Lnet/minecraft/class_1799;J)Z
// 09b: iload 18
// 09d: ifeq 163
// 0a0: ifne 158
// 0a3: goto 0b0
// 0a6: ldc2_w 3719168957802296874
// 0a9: lload 2
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: aload 19
// 0b2: lload 11
// 0b4: invokestatic su/catlean/xa.N (Lnet/minecraft/class_1799;J)Z
// 0b7: iload 18
// 0b9: ifeq 163
// 0bc: goto 0c9
// 0bf: ldc2_w 3719168957802296874
// 0c2: lload 2
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: ifne 158
// 0cc: goto 0d9
// 0cf: ldc2_w 3719168957802296874
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 19
// 0db: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0de: instanceof net/minecraft/class_1743
// 0e1: iload 18
// 0e3: ifeq 163
// 0e6: goto 0f3
// 0e9: ldc2_w 3719168957802296874
// 0ec: lload 2
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: ifne 158
// 0f6: goto 103
// 0f9: ldc2_w 3719168957802296874
// 0fc: lload 2
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: aload 19
// 105: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 108: instanceof net/minecraft/class_1794
// 10b: iload 18
// 10d: ifeq 163
// 110: goto 11d
// 113: ldc2_w 3719168957802296874
// 116: lload 2
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: ifne 158
// 120: goto 12d
// 123: ldc2_w 3719168957802296874
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: aload 19
// 12f: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 132: instanceof net/minecraft/class_1821
// 135: iload 18
// 137: ifeq 163
// 13a: goto 147
// 13d: ldc2_w 3719168957802296874
// 140: lload 2
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: ifne 158
// 14a: goto 157
// 14d: ldc2_w 3719168957802296874
// 150: lload 2
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: return
// 158: aload 19
// 15a: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 15d: aload 19
// 15f: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 162: isub
// 163: i2f
// 164: fstore 20
// 166: fload 20
// 168: aload 19
// 16a: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 16d: i2f
// 16e: fdiv
// 16f: ldc 100.0
// 171: fmul
// 172: f2i
// 173: istore 21
// 175: iload 18
// 177: ifeq 1ca
// 17a: iload 21
// 17c: aload 0
// 17d: iload 13
// 17f: iload 14
// 181: i2c
// 182: iload 15
// 184: invokespecial su/catlean/qi.T (ICI)I
// 187: if_icmpgt 1f9
// 18a: goto 197
// 18d: ldc2_w 3719168957802296874
// 190: lload 2
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: lload 16
// 199: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 19f: lload 16
// 1a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a4: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1a7: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 1aa: bipush 1
// 1ab: iadd
// 1ac: sipush 1361
// 1af: ldc2_w 744010751759186826
// 1b2: lload 2
// 1b3: lxor
// 1b4: invokedynamic f (IJ)I bsm=su/catlean/qi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: irem
// 1ba: invokevirtual net/minecraft/class_1661.method_61496 (I)V
// 1bd: goto 1ca
// 1c0: ldc2_w 3719168957802296874
// 1c3: lload 2
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: aload 0
// 1cb: checkcast su/catlean/_g
// 1ce: iload 8
// 1d0: aload 0
// 1d1: checkcast su/catlean/_g
// 1d4: sipush 17313
// 1d7: ldc2_w 2939204947155751451
// 1da: lload 2
// 1db: lxor
// 1dc: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/qi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: bipush 0
// 1e2: anewarray 439
// 1e5: iload 9
// 1e7: i2c
// 1e8: bipush 0
// 1e9: bipush 4
// 1ea: aconst_null
// 1eb: iload 10
// 1ed: i2s
// 1ee: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 1f1: bipush 0
// 1f2: bipush 2
// 1f3: aconst_null
// 1f4: lload 6
// 1f6: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 1f9: iload 18
// 1fb: ifne 218
// 1fe: bipush 1
// 1ff: anewarray 46
// 202: ldc2_w 3685317190454098201
// 205: lload 2
// 206: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: goto 218
// 20e: ldc2_w 3719168957802296874
// 211: lload 2
// 212: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 217: athrow
// 218: return
}

static {
long var20 = a ^ 103730140530653L;
long var22 = var20 ^ 88238845408441L;
long var24 = var20 ^ 138694405339665L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[6];
int var16 = 0;
String var15 = "û¨D\u0018ñIÝ¹v×O\u001f&\u0094\u0017³RSR\u0094\u0086¾ÑjotHû\u008a\u0094\u0016â(²\u0019\u0013î_HÍR¼lpø{\\Ïí'{N}\u0019µÕ\u0083}÷\u001dSÉî¥$\u000béÌ*dû#' ªôæ`[¦í«sÿ\u009añqñH2s¬p\u0090\u0080ÊBZ¸\u009böé'¸ü  [§i\u0082\u009fsYâ¸¼xà¦`Q\u001c\u0090k\nb5ý²mXÐÔKÇ²ïO";
int var17 = "û¨D\u0018ñIÝ¹v×O\u001f&\u0094\u0017³RSR\u0094\u0086¾ÑjotHû\u008a\u0094\u0016â(²\u0019\u0013î_HÍR¼lpø{\\Ïí'{N}\u0019µÕ\u0083}÷\u001dSÉî¥$\u000béÌ*dû#' ªôæ`[¦í«sÿ\u009añqñH2s¬p\u0090\u0080ÊBZ¸\u009böé'¸ü  [§i\u0082\u009fsYâ¸¼xà¦`Q\u001c\u0090k\nb5ý²mXÐÔKÇ²ïO"
.length();
char var14 = ' ';
int var29 = -1;

label54:
while (true) {
String var30 = var15.substring(++var29, var29 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
String var41 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var41;
if ((var29 += var14) >= var17) {
b = var18;
c = new String[6];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "+8\u001døÓûSd\n\u00adþs\u0015SæÝ";
int var5 = "+8\u001døÓûSd\n\u00adþs\u0015SæÝ".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var33 = var6;
var10001 = var3++;
long var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var48 = -1;

while (true) {
long var8 = var45;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var50 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var48) {
case 0:
var33[var10001] = var50;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(qi.class, b<"g">(15976, 8963250644239625334L ^ var20), b<"g">(27527, 6373716836384536986L ^ var20), 0))
};
W = var26;
k = new qi(var22);
z = yp.L(
k,
b<"g">(14197, 1642436748805907818L ^ var20),
c<"f">(8584, 4795676340423531767L ^ var20),
new IntRange(1, c<"f">(28284, 8559710441616986880L ^ var20)),
var24,
null,
null,
c<"f">(30934, 515128134817498536L ^ var20),
null
);
return;
}
break;
default:
var33[var10001] = var50;
if (var2 < var5) {
continue label36;
}

var4 = "\u0002ù\u0019yYé¶¥2U6\u0007\u0004]»\u0081";
var5 = "\u0002ù\u0019yYé¶¥2U6\u0007\u0004]»\u0081".length();
var2 = 0;
}

byte var39 = var2;
var2 += 8;
var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
var33 = var6;
var10001 = var3++;
var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var48 = 0;
}
}
}

var14 = var15.charAt(var29);
break;
default:
var18[var16++] = var41;
if ((var29 += var14) < var17) {
var14 = var15.charAt(var29);
continue label54;
}

var15 = "ø\u001fâN}I\u001fJ\u0019^Aæd\b\u0016XZ-\u0090¥\u008d´é\u000fds>u\u0083ëË4\u0011ä]\u0019®V\u000e. \u001d÷\u0080E,ÿ¹2à\u001b;\u0014´·ÿøf\n\u009e÷\u009f\u0094:ÛÇ\u0095ËÈá\u0093\u000b=";
var17 = "ø\u001fâN}I\u001fJ\u0019^Aæd\b\u0016XZ-\u0090¥\u008d´é\u000fds>u\u0083ëË4\u0011ä]\u0019®V\u000e. \u001d÷\u0080E,ÿ¹2à\u001b;\u0014´·ÿøf\n\u009e÷\u009f\u0094:ÛÇ\u0095ËÈá\u0093\u000b="
.length();
var14 = '(';
var29 = -1;
}

var30 = var15.substring(++var29, var29 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25529;
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
throw new RuntimeException("su/catlean/qi", var10);
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
throw new RuntimeException("su/catlean/qi" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 19672;
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
throw new RuntimeException("su/catlean/qi", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/qi" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
