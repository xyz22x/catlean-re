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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1703;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class q3 extends _g {
@NotNull
public static final q3 h;
@NotNull
private static final av J;
@Nullable
private static class_437 f;
@Nullable
private static class_1703 e;
private static final long a = yz.a(-5424758096061454398L, -4694255686044831542L, MethodHandles.lookup().lookupClass()).a(152072564617518L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private q3(short var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 111519799231437L;
super(b<"o">(15287, 8259995435950368382L ^ var4), jt.I(), null, 4, null, var6);
}

private final lj V(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 137900614967419L;
return (lj)J.E(this, var6, B[0]);
}

private final void V(lj var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 64632425422710L;
J.b(this, var4, B[0], var1);
}

@Flow
private final void Q(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q3.a J
// 003: ldc2_w 100969442509571
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 15116119862746
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 112695715016572
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 32
// 029: lshl
// 02a: bipush 32
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 35079654978544
// 035: lxor
// 036: dup2
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 16
// 040: lshl
// 041: bipush 32
// 043: lushr
// 044: l2i
// 045: istore 10
// 047: dup2
// 048: bipush 48
// 04a: lshl
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 11
// 051: pop2
// 052: dup2
// 053: ldc2_w 49593840722940
// 056: lxor
// 057: lstore 12
// 059: pop2
// 05a: ldc2_w -5673852728804488609
// 05d: lload 2
// 05e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: astore 14
// 065: lload 12
// 067: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06a: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 06d: instanceof net/minecraft/class_1707
// 070: aload 14
// 072: ifnull 0c5
// 075: ifeq 0a8
// 078: goto 085
// 07b: ldc2_w -5674235169240312383
// 07e: lload 2
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: lload 4
// 087: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08a: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 08d: putstatic su/catlean/q3.f Lnet/minecraft/class_437;
// 090: lload 12
// 092: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 095: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 098: putstatic su/catlean/q3.e Lnet/minecraft/class_1703;
// 09b: goto 0a8
// 09e: ldc2_w -5674235169240312383
// 0a1: lload 2
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: aload 0
// 0a9: iload 6
// 0ab: i2c
// 0ac: iload 7
// 0ae: i2c
// 0af: iload 8
// 0b1: invokespecial su/catlean/q3.V (CCI)Lsu/catlean/lj;
// 0b4: invokevirtual su/catlean/lj.X ()I
// 0b7: iload 9
// 0b9: i2s
// 0ba: swap
// 0bb: iload 10
// 0bd: swap
// 0be: iload 11
// 0c0: i2c
// 0c1: swap
// 0c2: invokestatic su/catlean/bx.k (SICI)Z
// 0c5: ifeq 100
// 0c8: getstatic su/catlean/q3.f Lnet/minecraft/class_437;
// 0cb: ifnonnull 0e6
// 0ce: goto 0db
// 0d1: ldc2_w -5674235169240312383
// 0d4: lload 2
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: return
// 0dc: ldc2_w -5674235169240312383
// 0df: lload 2
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: lload 4
// 0e8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0eb: getstatic su/catlean/q3.f Lnet/minecraft/class_437;
// 0ee: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
// 0f1: lload 12
// 0f3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f6: getstatic su/catlean/q3.e Lnet/minecraft/class_1703;
// 0f9: dup
// 0fa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0fd: putfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 100: return
}

@Flow
private final void L(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/q3.a J
// 03: ldc2_w 27969464920847
// 06: lxor
// 07: lstore 2
// 08: aload 1
// 09: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0c: instanceof net/minecraft/class_2815
// 0f: ifeq 36
// 12: getstatic su/catlean/q3.f Lnet/minecraft/class_437;
// 15: ifnull 36
// 18: goto 25
// 1b: ldc2_w -2788480743500448307
// 1e: lload 2
// 1f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24: athrow
// 25: aload 1
// 26: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 29: goto 36
// 2c: ldc2_w -2788480743500448307
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: return
}

@Override
public void b(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 29291705890158
// 05: lxor
// 06: lstore 3
// 07: pop2
// 08: ldc2_w 1411134032729270408
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 5
// 13: aload 5
// 15: ifnull 5a
// 18: getstatic su/catlean/q3.e Lnet/minecraft/class_1703;
// 1b: ifnull 52
// 1e: goto 2b
// 21: ldc2_w 1411358145570649878
// 24: lload 1
// 25: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: athrow
// 2b: new net/minecraft/class_2815
// 2e: dup
// 2f: getstatic su/catlean/q3.e Lnet/minecraft/class_1703;
// 32: dup
// 33: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 36: getfield net/minecraft/class_1703.field_7763 I
// 39: invokespecial net/minecraft/class_2815.<init> (I)V
// 3c: checkcast net/minecraft/class_2596
// 3f: lload 3
// 40: dup2_x1
// 41: pop2
// 42: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 45: goto 52
// 48: ldc2_w 1411358145570649878
// 4b: lload 1
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: aconst_null
// 53: putstatic su/catlean/q3.f Lnet/minecraft/class_437;
// 56: aconst_null
// 57: putstatic su/catlean/q3.e Lnet/minecraft/class_1703;
// 5a: aload 5
// 5c: lload 1
// 5d: lconst_0
// 5e: lcmp
// 5f: iflt 69
// 62: ifnonnull 7f
// 65: bipush 5
// 66: anewarray 127
// 69: ldc2_w 1397120299992947038
// 6c: lload 1
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: goto 7f
// 75: ldc2_w 1411358145570649878
// 78: lload 1
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: return
}

static {
long var20 = a ^ 139081847285413L;
int var22 = (int)((var20 ^ 63938292004273L) >>> 48);
long var23 = (var20 ^ 63938292004273L) << 16 >>> 16;
long var25 = var20 ^ 100550563575765L;
long var10001 = var20 ^ 138881288852678L;
int var27 = (int)((var20 ^ 138881288852678L) >>> 32);
int var28 = (int)((var20 ^ 138881288852678L) << 32 >>> 48);
int var29 = (int)(var10001 << 48 >>> 48);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[4];
int var16 = 0;
String var15 = "$8\u000efSþeOC¸b¹¬³\u001f2 Ô\u0015Ö\u00850Ò\u008fõÛË\u001d;\u0004Í:É\u0084\u0016f,@`\u0093\u0091*<\u0010\bG_r\b";
int var17 = "$8\u000efSþeOC¸b¹¬³\u001f2 Ô\u0015Ö\u00850Ò\u008fõÛË\u001d;\u0004Í:É\u0084\u0016f,@`\u0093\u0091*<\u0010\bG_r\b".length();
char var14 = 16;
int var32 = -1;

label47:
while (true) {
String var33 = var15.substring(++var32, var32 + var14);
byte var36 = -1;

while (true) {
byte[] var19 = var11.doFinal(var33.getBytes("ISO-8859-1"));
String var43 = b(var19).intern();
switch (var36) {
case 0:
var18[var16++] = var43;
if ((var32 += var14) >= var17) {
b = var18;
c = new String[4];
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
String var5 = "qR\fî]:\u009b`bÏ¡\u0010\u0091\u0082ðÆ";
int var6 = "qR\fî]:\u009b`bÏ¡\u0010\u0091\u0082ðÆ".length();
byte var3 = 0;

do {
byte var40 = var3;
var3 += 8;
byte[] var7 = var5.substring(var40, var3).getBytes("ISO-8859-1");
int var41 = var4++;
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
byte var48 = -1;
var0[var41] = var10004;
} while (var3 < var6);

KProperty[] var30 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(q3.class, b<"o">(14283, 5487880285816122400L ^ var20), b<"o">(23150, 5490222123895947652L ^ var20), 0)
)
};
B = var30;
h = new q3((short)var22, var23);
J = yp.J(
h, b<"o">(16003, 1994717286229009770L ^ var20), new lj(-1, false, var25, false, (int)var0[0], null), null, var27, null, var28, (char)var29, (int)var0[1], null
);
return;
}

var14 = var15.charAt(var32);
break;
default:
var18[var16++] = var43;
if ((var32 += var14) < var17) {
var14 = var15.charAt(var32);
continue label47;
}

var15 = "Åýñg \u0083Jîºi Á!»\u0010\u0096l2lsp\"í\u001fÈZ\u0006\t_\nî\u00058)Ïóç\u0093Å\u001cG\u0015îÈbL¼\u0018å´FÑÚ·\u0089\u0096\u0083H\u0092K7tþ_{Ó\u0003µ½ú\u001dÕõ\u0096Á\u009d\u008buÝh\u0092õh¢\tp\u0095,Ò";
var17 = "Åýñg \u0083Jîºi Á!»\u0010\u0096l2lsp\"í\u001fÈZ\u0006\t_\nî\u00058)Ïóç\u0093Å\u001cG\u0015îÈbL¼\u0018å´FÑÚ·\u0089\u0096\u0083H\u0092K7tþ_{Ó\u0003µ½ú\u001dÕõ\u0096Á\u009d\u008buÝh\u0092õh¢\tp\u0095,Ò"
.length();
var14 = ' ';
var32 = -1;
}

var33 = var15.substring(++var32, var32 + var14);
var36 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20188;
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
throw new RuntimeException("su/catlean/q3", var10);
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
throw new RuntimeException("su/catlean/q3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
