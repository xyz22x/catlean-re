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
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class eb extends _g {
@NotNull
public static final eb t;
static final KProperty[] j;
@NotNull
private static final cq C;
@NotNull
private static final cq c;
private static final long a = yz.a(-3001214006639270293L, -870175250357964846L, MethodHandles.lookup().lookupClass()).a(101105687219904L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);

private eb(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 48866330553273L;
super(b<"i">(29594, 1087808546457492736L ^ var1), jt.v(), null, 4, null, var3);
}

private final boolean w(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 104028470593610L;
return (Boolean)C.E(this, var3, j[0]);
}

private final boolean h(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 11789349111515L;
return (Boolean)c.E(this, var3, j[1]);
}

@Flow
private final void i(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/eb.a J
// 003: ldc2_w 32457646715866
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 96746144413957
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 4228805048212
// 014: lxor
// 015: lstore 6
// 017: pop2
// 018: ldc2_w 8829492595888010733
// 01b: lload 2
// 01c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 021: astore 8
// 023: aload 1
// 024: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 027: instanceof net/minecraft/class_2828
// 02a: aload 8
// 02c: ifnull 099
// 02f: ifeq 092
// 032: goto 03f
// 035: ldc2_w 8804619287978947887
// 038: lload 2
// 039: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: athrow
// 03f: aload 0
// 040: lload 6
// 042: invokespecial su/catlean/eb.w (J)Z
// 045: aload 8
// 047: ifnull 099
// 04a: goto 057
// 04d: ldc2_w 8804619287978947887
// 050: lload 2
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: ifeq 092
// 05a: goto 067
// 05d: ldc2_w 8804619287978947887
// 060: lload 2
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: aload 1
// 068: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 06b: dup
// 06c: sipush 11708
// 06f: ldc2_w 5844756139077649300
// 072: lload 2
// 073: lxor
// 074: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/eb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 07c: checkcast su/catlean/mixins/accessors/ServerboundMovePlayerPacketAccessor
// 07f: bipush 0
// 080: invokeinterface su/catlean/mixins/accessors/ServerboundMovePlayerPacketAccessor.setGround (Z)V 2
// 085: goto 092
// 088: ldc2_w 8804619287978947887
// 08b: lload 2
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: aload 1
// 093: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 096: instanceof net/minecraft/class_2848
// 099: aload 8
// 09b: ifnull 0c1
// 09e: ifeq 104
// 0a1: goto 0ae
// 0a4: ldc2_w 8804619287978947887
// 0a7: lload 2
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: aload 0
// 0af: lload 4
// 0b1: invokespecial su/catlean/eb.h (J)Z
// 0b4: goto 0c1
// 0b7: ldc2_w 8804619287978947887
// 0ba: lload 2
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: ifeq 104
// 0c4: aload 1
// 0c5: aload 8
// 0c7: ifnull 101
// 0ca: goto 0d7
// 0cd: ldc2_w 8804619287978947887
// 0d0: lload 2
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0da: checkcast net/minecraft/class_2848
// 0dd: invokevirtual net/minecraft/class_2848.method_12365 ()Lnet/minecraft/class_2848$class_2849;
// 0e0: getstatic net/minecraft/class_2848$class_2849.field_12981 Lnet/minecraft/class_2848$class_2849;
// 0e3: if_acmpne 104
// 0e6: goto 0f3
// 0e9: ldc2_w 8804619287978947887
// 0ec: lload 2
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: aload 1
// 0f4: goto 101
// 0f7: ldc2_w 8804619287978947887
// 0fa: lload 2
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 104: return
}

static {
long var20 = a ^ 65596006072990L;
long var22 = var20 ^ 126314475719746L;
long var24 = var20 ^ 60387841178110L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[8];
int var16 = 0;
String var15 = "\u0005&\u008fêqUçÞªª÷ÙHÛ©OÃ\u0089Üã\r.D@  &¸O3NuÈ\u0091qæ tv\u0010Jó\u00ad©mÊ&\u0081£\u0018\u0016s[\u0085æ\u0002¾\u0010\u001e\u0016Î¨geË¯\u009f\u009bþ\u0010a\\½· ¤\u008eÛ\fî¡¾Êº©\u0007å¡,`¡Z\u0012\u008fÍ\u0098á\u008d\u0085+»±e4\u007fK\u008aT~yÕ\u0006\u0099&nÊ©\u0090øn\tr\u0015\u0019!á«\u008e»\u0012\u0001ãëÍyï\u0007¢: øÅUÙöæý2EñoJ)í£\b\u0080EJ\u0096CÄú2\nBrþ\u0090Èúó\u001aMdz^\u0016Z\u0013II\u0089ÕqHU_\u0002\u008cPr7^\u008f\u0086ÚS\u0013Yj\u0014«lpÍ¹ýÐB\u0016>Y\u009bmÑøÐLÝ\u0005/$Q\u0019Þ\u000fSá¹÷\u0081ð»\u008c\u0018ú\u0086\u0082Õ\"´h¾ú4|¤ñ\u0090\u009aX|\u0084´ø¢-\u009a_ \u008f4i\u009fGÞo¼\u0014L\u0084\u009dYöo7B\u0006Ò·\u0007á\u009f51o\u008a!%ß\u0002Ù";
int var17 = "\u0005&\u008fêqUçÞªª÷ÙHÛ©OÃ\u0089Üã\r.D@  &¸O3NuÈ\u0091qæ tv\u0010Jó\u00ad©mÊ&\u0081£\u0018\u0016s[\u0085æ\u0002¾\u0010\u001e\u0016Î¨geË¯\u009f\u009bþ\u0010a\\½· ¤\u008eÛ\fî¡¾Êº©\u0007å¡,`¡Z\u0012\u008fÍ\u0098á\u008d\u0085+»±e4\u007fK\u008aT~yÕ\u0006\u0099&nÊ©\u0090øn\tr\u0015\u0019!á«\u008e»\u0012\u0001ãëÍyï\u0007¢: øÅUÙöæý2EñoJ)í£\b\u0080EJ\u0096CÄú2\nBrþ\u0090Èúó\u001aMdz^\u0016Z\u0013II\u0089ÕqHU_\u0002\u008cPr7^\u008f\u0086ÚS\u0013Yj\u0014«lpÍ¹ýÐB\u0016>Y\u009bmÑøÐLÝ\u0005/$Q\u0019Þ\u000fSá¹÷\u0081ð»\u008c\u0018ú\u0086\u0082Õ\"´h¾ú4|¤ñ\u0090\u009aX|\u0084´ø¢-\u009a_ \u008f4i\u009fGÞo¼\u0014L\u0084\u009dYöo7B\u0006Ò·\u0007á\u009f51o\u008a!%ß\u0002Ù"
.length();
char var14 = 24;
int var28 = -1;

label47:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var28 += var14) >= var17) {
b = var18;
d = new String[8];
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
String var5 = ">Õþ\u009c\u0087ªyÃ\u0087Q\u000eiéº\u0096\u001c";
int var6 = ">Õþ\u009c\u0087ªyÃ\u0087Q\u000eiéº\u0096\u001c".length();
byte var3 = 0;

do {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
var10001 = var4++;
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
byte var43 = -1;
var0[var10001] = var10004;
} while (var3 < var6);

KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(eb.class, b<"i">(21092, 6020192108156062988L ^ var20), b<"i">(4480, 4821972967274598127L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(eb.class, b<"i">(29647, 2547481922953522338L ^ var20), b<"i">(3597, 9175162990415761766L ^ var20), 0))
};
j = var26;
t = new eb(var24);
C = yp.t(t, b<"i">(739, 2765709621590875530L ^ var20), true, var22, null, null, (int)var0[0], null);
c = yp.t(t, b<"i">(17870, 908766841945954976L ^ var20), true, var22, null, null, (int)var0[1], null);
return;
}

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var38;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label47;
}

var15 = "\u0087º\u0015E°^öGs\u009dh\u008e\u009f/ó\u0091Ïhç¬tf\u0001a\u0006uò}ØÖQÐ\u0010ºÑ»\u008cv\u0099\u0004äíÂõ5V¸À\u0098";
var17 = "\u0087º\u0015E°^öGs\u009dh\u008e\u009f/ó\u0091Ïhç¬tf\u0001a\u0006uò}ØÖQÐ\u0010ºÑ»\u008cv\u0099\u0004äíÂõ5V¸À\u0098".length();
var14 = ' ';
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5631;
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
throw new RuntimeException("su/catlean/eb", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/eb" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
