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
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class os extends oq {
@NotNull
public static final os D;
@NotNull
private static final ReadWriteProperty x;
@NotNull
private static final ReadWriteProperty A;
@NotNull
private static final ReadWriteProperty M;
@NotNull
private static final ReadWriteProperty O;
@NotNull
private static final ReadWriteProperty o;
@NotNull
private static final ReadWriteProperty u;
@NotNull
private static final ReadWriteProperty i;
private static String[] s;
private static final long b = yz.a(4218366314374231825L, 1441945716120668429L, MethodHandles.lookup().lookupClass()).a(199741603584196L);
private static final long[] m;
private static final Integer[] n;
private static final Map p;

private os(int var1, int var2, byte var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ b;
long var6 = var4 ^ 137556631966225L;
super(var6);
}

@Nullable
public final Long B() {
return (Long)x.getValue(this, K[0]);
}

public final void S(@Nullable Long <set-?>) {
x.setValue(this, K[0], <set-?>);
}

@Nullable
public final String Y() {
return (String)A.getValue(this, K[1]);
}

public final void h(@Nullable String <set-?>) {
A.setValue(this, K[1], <set-?>);
}

@Nullable
public final String T() {
return (String)M.getValue(this, K[2]);
}

public final void W(@Nullable String <set-?>) {
M.setValue(this, K[2], <set-?>);
}

@Nullable
public final Pair P() {
return (Pair)O.getValue(this, K[3]);
}

public final void U(@Nullable Pair <set-?>) {
O.setValue(this, K[3], <set-?>);
}

@Nullable
public final Pair z() {
return (Pair)o.getValue(this, K[4]);
}

public final void g(@Nullable Pair <set-?>) {
o.setValue(this, K[4], <set-?>);
}

@Nullable
public final Pair n() {
return (Pair)u.getValue(this, K[5]);
}

public final void G(@Nullable Pair <set-?>) {
u.setValue(this, K[5], <set-?>);
}

@Nullable
public final Pair m(long var1) {
var1 = b ^ var1;
return (Pair)i.getValue(this, K[c<"o">(15244, 7349445738734289931L ^ var1)]);
}

public final void Z(@Nullable Pair <set-?>, long a) {
a = b ^ a;
i.setValue(this, K[c<"o">(24629, 3069711114647302765L ^ a)], <set-?>);
}

@NotNull
public final yq u(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/os.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 89451907807703
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 27990258849216
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 76516069278742
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 126572157585436
// 01f: lxor
// 020: dup2
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 9
// 027: dup2
// 028: bipush 16
// 02a: lshl
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 10
// 031: dup2
// 032: bipush 48
// 034: lshl
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 11
// 03b: pop2
// 03c: pop2
// 03d: ldc2_w -6018685405197904211
// 040: lload 1
// 041: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: new java/util/ArrayList
// 049: dup
// 04a: invokespecial java/util/ArrayList.<init> ()V
// 04d: checkcast java/util/List
// 050: astore 13
// 052: astore 12
// 054: aload 12
// 056: ifnull 09a
// 059: aload 0
// 05a: invokevirtual su/catlean/os.n ()Lkotlin/Pair;
// 05d: dup
// 05e: ifnull 099
// 061: goto 06e
// 064: ldc2_w -6031208127754847984
// 067: lload 1
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: astore 16
// 070: bipush 0
// 071: istore 17
// 073: aload 13
// 075: new su/catlean/ob
// 078: dup
// 079: aload 16
// 07b: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
// 07e: lload 5
// 080: dup2_x1
// 081: pop2
// 082: checkcast java/lang/String
// 085: aload 16
// 087: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
// 08a: checkcast java/lang/String
// 08d: invokespecial su/catlean/ob.<init> (JLjava/lang/String;Ljava/lang/String;)V
// 090: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 095: pop
// 096: goto 09b
// 099: pop
// 09a: nop
// 09b: aload 0
// 09c: lload 3
// 09d: invokevirtual su/catlean/os.m (J)Lkotlin/Pair;
// 0a0: dup
// 0a1: ifnull 0cf
// 0a4: astore 16
// 0a6: bipush 0
// 0a7: istore 17
// 0a9: aload 13
// 0ab: new su/catlean/ob
// 0ae: dup
// 0af: aload 16
// 0b1: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
// 0b4: lload 5
// 0b6: dup2_x1
// 0b7: pop2
// 0b8: checkcast java/lang/String
// 0bb: aload 16
// 0bd: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
// 0c0: checkcast java/lang/String
// 0c3: invokespecial su/catlean/ob.<init> (JLjava/lang/String;Ljava/lang/String;)V
// 0c6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0cb: pop
// 0cc: goto 0d1
// 0cf: pop
// 0d0: nop
// 0d1: aload 0
// 0d2: invokevirtual su/catlean/os.Y ()Ljava/lang/String;
// 0d5: astore 14
// 0d7: aload 0
// 0d8: invokevirtual su/catlean/os.T ()Ljava/lang/String;
// 0db: astore 15
// 0dd: aload 0
// 0de: invokevirtual su/catlean/os.P ()Lkotlin/Pair;
// 0e1: lload 1
// 0e2: lconst_0
// 0e3: lcmp
// 0e4: ifle 10d
// 0e7: aload 12
// 0e9: ifnull 10d
// 0ec: ifnonnull 110
// 0ef: goto 0fc
// 0f2: ldc2_w -6031208127754847984
// 0f5: lload 1
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: aload 0
// 0fd: invokevirtual su/catlean/os.z ()Lkotlin/Pair;
// 100: goto 10d
// 103: ldc2_w -6031208127754847984
// 106: lload 1
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: ifnull 17d
// 110: new su/catlean/an
// 113: dup
// 114: aload 0
// 115: invokevirtual su/catlean/os.P ()Lkotlin/Pair;
// 118: dup
// 119: ifnull 13c
// 11c: goto 129
// 11f: ldc2_w -6031208127754847984
// 122: lload 1
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
// 12c: checkcast java/lang/String
// 12f: goto 13e
// 132: ldc2_w -6031208127754847984
// 135: lload 1
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: pop
// 13d: aconst_null
// 13e: aload 0
// 13f: invokevirtual su/catlean/os.P ()Lkotlin/Pair;
// 142: dup
// 143: ifnull 14f
// 146: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
// 149: checkcast java/lang/String
// 14c: goto 151
// 14f: pop
// 150: aconst_null
// 151: aload 0
// 152: invokevirtual su/catlean/os.z ()Lkotlin/Pair;
// 155: dup
// 156: ifnull 162
// 159: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
// 15c: checkcast java/lang/String
// 15f: goto 164
// 162: pop
// 163: aconst_null
// 164: aload 0
// 165: invokevirtual su/catlean/os.z ()Lkotlin/Pair;
// 168: dup
// 169: ifnull 175
// 16c: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
// 16f: checkcast java/lang/String
// 172: goto 177
// 175: pop
// 176: aconst_null
// 177: invokespecial su/catlean/an.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
// 17a: goto 17e
// 17d: aconst_null
// 17e: astore 16
// 180: new su/catlean/pa
// 183: dup
// 184: aload 0
// 185: invokevirtual su/catlean/os.O ()J
// 188: iload 9
// 18a: i2s
// 18b: dup_x2
// 18c: pop
// 18d: iload 10
// 18f: dup_x2
// 190: pop
// 191: iload 11
// 193: i2c
// 194: aconst_null
// 195: bipush 2
// 196: aconst_null
// 197: invokespecial su/catlean/pa.<init> (SIJCLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 19a: astore 17
// 19c: new su/catlean/yq
// 19f: dup
// 1a0: aload 14
// 1a2: lload 7
// 1a4: aload 15
// 1a6: aload 17
// 1a8: aload 16
// 1aa: aload 13
// 1ac: invokespecial su/catlean/yq.<init> (Ljava/lang/String;JLjava/lang/String;Lsu/catlean/pa;Lsu/catlean/an;Ljava/util/List;)V
// 1af: aload 12
// 1b1: lload 1
// 1b2: lconst_0
// 1b3: lcmp
// 1b4: iflt 1be
// 1b7: ifnonnull 1d4
// 1ba: bipush 5
// 1bb: anewarray 24
// 1be: ldc2_w -6038767031962917364
// 1c1: lload 1
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: goto 1d4
// 1ca: ldc2_w -6031208127754847984
// 1cd: lload 1
// 1ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: athrow
// 1d4: areturn
}

private final ReadWriteProperty d(boolean var1, Object var2) {
Delegates var3 = Delegates.INSTANCE;
boolean var5 = false;
return new tj(var2, var1);
}

public final void j() {
su.catlean.o.G.Z(0);
su.catlean.o.G.B(true);
}

public final void U() {
su.catlean.o.G.B(false);
}

static {
long var20 = b ^ 120182687399445L;
long var10001 = var20 ^ 103113372945317L;
int var22 = (int)((var20 ^ 103113372945317L) >>> 32);
int var23 = (int)((var20 ^ 103113372945317L) << 32 >>> 48);
int var24 = (int)(var10001 << 48 >>> 48);
var10001 = var20 ^ 44264677680240L;
int var25 = (int)((var20 ^ 44264677680240L) >>> 32);
int var26 = (int)((var20 ^ 44264677680240L) << 32 >>> 40);
int var27 = (int)(var10001 << 56 >>> 56);
if (vm.a<"Å">(7156413194476380241L, var20) != null) {
vm.a<"Å">(new String[5], 7190996725658347916L, var20);
}

Cipher var12;
Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var13 = 1; var13 < 8; var13++) {
var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var11 = new String[14];
int var17 = 0;
String var16 = "\u0011¡\u0099ó$ë¼Ù\u0010êW½²\u0090õ\u000b9«%sØ7\u00158ñ µH¾u\u0091æ0~dõ\u0086\u001c¤ñ\u0011&½_D\u001f¾\u0012_ð\u0012ðÐdÞ¯¼Ö .óÙ_@aÓ¨Þ\u0005ø\u0003\u001ai\u001c\u008e»\u009a\u0001êvc\u000e\"ko\u0004\u0087*ª¶? ªÀ üâèý\f¿e<\u0018ØØ${¦U\u0094«E\u0001]PÜGÞhqÕ\u008a\u0007\b\u008fVåéªg\n\u008c ¿+ÇÜÀã\u0097´\u0090k³\u0017V0\u0012Ô.ßtäóiâ\u0011è¢\u000b«\u0084]µê \u0016E'\u009fg\u0093äübZ\\ò\u001dþ3¾\u0003¢¤¡\u0083f\u0097~?ùF@Vý²º\u0010ØÝ¥\u0092\u009cfÐÚ\u0090ôº=nü¾ü µH¾u\u0091æ0~\u0014I\u009dÉ\u000e\u0013» \u0087%À¯1é(ä}º|f3\u008d\u008d\u0091 Öa\u000f\f¥\u001f5J(%\u0088+w_äýP\u0007\u0086Æt\u0004?_SðlC\u0096\u0013ø*\bÐ;ùQ&\"ÙH";
int var18 = "\u0011¡\u0099ó$ë¼Ù\u0010êW½²\u0090õ\u000b9«%sØ7\u00158ñ µH¾u\u0091æ0~dõ\u0086\u001c¤ñ\u0011&½_D\u001f¾\u0012_ð\u0012ðÐdÞ¯¼Ö .óÙ_@aÓ¨Þ\u0005ø\u0003\u001ai\u001c\u008e»\u009a\u0001êvc\u000e\"ko\u0004\u0087*ª¶? ªÀ üâèý\f¿e<\u0018ØØ${¦U\u0094«E\u0001]PÜGÞhqÕ\u008a\u0007\b\u008fVåéªg\n\u008c ¿+ÇÜÀã\u0097´\u0090k³\u0017V0\u0012Ô.ßtäóiâ\u0011è¢\u000b«\u0084]µê \u0016E'\u009fg\u0093äübZ\\ò\u001dþ3¾\u0003¢¤¡\u0083f\u0097~?ùF@Vý²º\u0010ØÝ¥\u0092\u009cfÐÚ\u0090ôº=nü¾ü µH¾u\u0091æ0~\u0014I\u009dÉ\u000e\u0013» \u0087%À¯1é(ä}º|f3\u008d\u008d\u0091 Öa\u000f\f¥\u001f5J(%\u0088+w_äýP\u0007\u0086Æt\u0004?_SðlC\u0096\u0013ø*\bÐ;ùQ&\"ÙH"
.length();
char var15 = '\b';
int var30 = -1;

label49:
while (true) {
String var31 = var16.substring(++var30, var30 + var15);
byte var35 = -1;

while (true) {
byte[] var19 = var12.doFinal(var31.getBytes("ISO-8859-1"));
String var42 = b(var19).intern();
switch (var35) {
case 0:
var11[var17++] = var42;
if ((var30 += var15) >= var18) {
p = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "êüü\u0011z9î\u009eWIøðü\u008f\u0001\u008f$êB¯\u0006q 2";
int var5 = "êüü\u0011z9î\u009eWIøðü\u008f\u0001\u008f$êB¯\u0006q 2".length();
byte var2 = 0;

do {
byte var39 = var2;
var2 += 8;
byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
int var40 = var3++;
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
byte var47 = -1;
var6[var40] = var10004;
} while (var2 < var5);

m = var6;
n = new Integer[3];
KProperty[] var28 = new KProperty[c<"o">(17154, 6510818073679353427L ^ var20)];
var28[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, var11[0], var11[4], 0));
var28[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, var11[12], var11[10], 0));
var28[2] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, var11[13], var11[3], 0));
var28[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, var11[8], var11[6], 0));
var28[4] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, var11[1], var11[7], 0));
var28[5] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, var11[5], var11[9], 0));
var28[c<"o">(24629, 3069662445821556071L ^ var20)] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(os.class, var11[11], var11[2], 0));
K = var28;
D = new os(var25, var26, (byte)var27);
x = F(D, var22, true, null, 2, var23, null, (short)var24);
A = F(D, var22, false, null, 3, var23, null, (short)var24);
M = F(D, var22, false, null, 3, var23, null, (short)var24);
O = F(D, var22, false, null, 3, var23, null, (short)var24);
o = F(D, var22, false, null, 3, var23, null, (short)var24);
u = F(D, var22, false, null, 3, var23, null, (short)var24);
i = F(D, var22, false, null, 3, var23, null, (short)var24);
return;
}

var15 = var16.charAt(var30);
break;
default:
var11[var17++] = var42;
if ((var30 += var15) < var18) {
var15 = var16.charAt(var30);
continue label49;
}

var16 = "«\u0094¨Fñ\t7ò\bÆ@ØÐà\u0086\u0000°";
var18 = "«\u0094¨Fñ\t7ò\bÆ@ØÐà\u0086\u0000°".length();
var15 = '\b';
var30 = -1;
}

var31 = var16.substring(++var30, var30 + var15);
var35 = 0;
}
}
}

public static void d(String[] var0) {
s = var0;
}

public static String[] q() {
return s;
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

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 30678;
if (n[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = m[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])p.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
p.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/os", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
n[var3] = var15;
}

return n[var3];
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
throw new RuntimeException("su/catlean/os" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
