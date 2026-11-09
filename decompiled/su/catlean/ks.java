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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ks extends _g {
@NotNull
public static final ks a;
@NotNull
private static final cq b;
private static final long c = yz.a(8157071812587192430L, -5657329890242028947L, MethodHandles.lookup().lookupClass()).a(142621713496982L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;
private static final long j;

private ks(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 105791977814080L;
super(b<"o">(7986, 8492926026940373028L ^ var1), jt.y(), null, 4, null, var3);
}

private final boolean g(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 5265493318673L;
return (Boolean)b.E(this, var3, U[0]);
}

private final void t(boolean var1, long var2) {
var2 = c ^ var2;
long var4 = var2 ^ 20532493660915L;
b.b(this, var4, U[0], var1);
}

@Flow
private final void F(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ks.c J
// 003: ldc2_w 109856119267188
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 82746905601297
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 115844440460974
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 43845572693857
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 81336665571464
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w -3292954064606249099
// 029: lload 2
// 02a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: istore 12
// 031: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 034: invokevirtual su/catlean/nf.p ()F
// 037: ldc 18.0
// 039: fcmpg
// 03a: iload 12
// 03c: ifne 0d2
// 03f: ifge 0cc
// 042: goto 04f
// 045: ldc2_w -3243571075056777455
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: lload 10
// 051: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 054: getfield net/minecraft/class_746.field_6012 I
// 057: iload 12
// 059: ifne 0d2
// 05c: goto 069
// 05f: ldc2_w -3243571075056777455
// 062: lload 2
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: sipush 30500
// 06c: ldc2_w 66380932075891424
// 06f: lload 2
// 070: lxor
// 071: invokedynamic c (IJ)I bsm=su/catlean/ks.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: if_icmple 0cc
// 079: goto 086
// 07c: ldc2_w -3243571075056777455
// 07f: lload 2
// 080: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: athrow
// 086: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 089: lload 4
// 08b: invokevirtual su/catlean/nf.w (J)Z
// 08e: iload 12
// 090: ifne 0d2
// 093: goto 0a0
// 096: ldc2_w -3243571075056777455
// 099: lload 2
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: ifne 0cc
// 0a3: goto 0b0
// 0a6: ldc2_w -3243571075056777455
// 0a9: lload 2
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 0b3: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 0b6: invokevirtual su/catlean/nf.p ()F
// 0b9: ldc 20.0
// 0bb: fdiv
// 0bc: invokevirtual su/catlean/tq.x (F)V
// 0bf: goto 0cc
// 0c2: ldc2_w -3243571075056777455
// 0c5: lload 2
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: aload 0
// 0cd: lload 8
// 0cf: invokespecial su/catlean/ks.g (J)Z
// 0d2: iload 12
// 0d4: ifne 0fc
// 0d7: ifeq 1c7
// 0da: goto 0e7
// 0dd: ldc2_w -3243571075056777455
// 0e0: lload 2
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: lload 10
// 0e9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ec: getfield net/minecraft/class_746.field_6012 I
// 0ef: goto 0fc
// 0f2: ldc2_w -3243571075056777455
// 0f5: lload 2
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: iload 12
// 0fe: ifne 135
// 101: sipush 28754
// 104: ldc2_w 669593825472687509
// 107: lload 2
// 108: lxor
// 109: invokedynamic c (IJ)I bsm=su/catlean/ks.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: if_icmple 1c7
// 111: goto 11e
// 114: ldc2_w -3243571075056777455
// 117: lload 2
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 121: invokevirtual su/catlean/nf.S ()J
// 124: getstatic su/catlean/ks.j J
// 127: lcmp
// 128: goto 135
// 12b: ldc2_w -3243571075056777455
// 12e: lload 2
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: iload 12
// 137: ifne 15f
// 13a: ifle 1c7
// 13d: goto 14a
// 140: ldc2_w -3243571075056777455
// 143: lload 2
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: lload 6
// 14c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 14f: invokevirtual net/minecraft/class_310.method_1542 ()Z
// 152: goto 15f
// 155: ldc2_w -3243571075056777455
// 158: lload 2
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: iload 12
// 161: ifne 189
// 164: ifne 1c7
// 167: goto 174
// 16a: ldc2_w -3243571075056777455
// 16d: lload 2
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: lload 10
// 176: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 179: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 17c: goto 189
// 17f: ldc2_w -3243571075056777455
// 182: lload 2
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: iload 12
// 18b: ifne 1b3
// 18e: ifne 1b6
// 191: goto 19e
// 194: ldc2_w -3243571075056777455
// 197: lload 2
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: lload 10
// 1a0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a3: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 1a6: goto 1b3
// 1a9: ldc2_w -3243571075056777455
// 1ac: lload 2
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: athrow
// 1b3: ifeq 1c7
// 1b6: aload 1
// 1b7: invokevirtual su/catlean/api/event/events/player/PlayerUpdateEvent.cancel ()V
// 1ba: goto 1c7
// 1bd: ldc2_w -3243571075056777455
// 1c0: lload 2
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: return
}

static {
long var25 = c ^ 63241617558986L;
long var27 = var25 ^ 22018660485003L;
long var29 = var25 ^ 132519040640339L;
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[4];
int var21 = 0;
String var20 = "\u0084·\u008c-É\u0003\u000euÅsÛ0R\u009e0¿8\u0003Y³Çý\u008cÙ Ñ\u008a±.Uc´|ÓQ\u000e«ü$y3Uð÷\u008d\u001c'Ð\u001e}-9óó/ÂÖ";
int var22 = "\u0084·\u008c-É\u0003\u000euÅsÛ0R\u009e0¿8\u0003Y³Çý\u008cÙ Ñ\u008a±.Uc´|ÓQ\u000e«ü$y3Uð÷\u008d\u001c'Ð\u001e}-9óó/ÂÖ".length();
char var19 = 24;
int var33 = -1;

label56:
while (true) {
String var34 = var20.substring(++var33, var33 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var34.getBytes("ISO-8859-1"));
String var45 = b(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var45;
if ((var33 += var19) >= var22) {
d = var23;
e = new String[4];
i = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[3];
int var8 = 0;
String var9 = "Ù\u0084\u009bG\u00ad®\u0006QS>Õ@æIEtÚó\nSµ¿d,";
int var10 = "Ù\u0084\u009bG\u00ad®\u0006QS>Õ@æIEtÚó\nSµ¿d,".length();
byte var7 = 0;

do {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
var10001 = var8++;
long var13 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
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
long var10004 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
byte var52 = -1;
var11[var10001] = var10004;
} while (var7 < var10);

g = var11;
h = new Integer[3];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 1245699876369207693L;
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
byte var43 = -1;
j = var50;
KProperty[] var31 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(ks.class, b<"o">(1938, 7996706257996638533L ^ var25), b<"o">(20732, 6562719289960447528L ^ var25), 0)
)
};
U = var31;
a = new ks(var29);
b = yp.t(a, b<"o">(28274, 3603816806307725479L ^ var25), true, var27, null, null, c<"c">(31915, 3634259283160921043L ^ var25), null);
return;
}

var19 = var20.charAt(var33);
break;
default:
var23[var21++] = var45;
if ((var33 += var19) < var22) {
var19 = var20.charAt(var33);
continue label56;
}

var20 = "5F-\u0080n\f*²wíqHÚS\rt4\u0004áMK2æ:\u009fâoö¤°\u0013\u0014(6¦B\u0094*h\u00957u\u00878i¿yZZK¯s\u0088\u0095.\u0086\u0080¸{\u0006\u0011ÕÇ\u0087øZÜÂD¹Ê,m";
var22 = "5F-\u0080n\f*²wíqHÚS\rt4\u0004áMK2æ:\u009fâoö¤°\u0013\u0014(6¦B\u0094*h\u00957u\u00878i¿yZZK¯s\u0088\u0095.\u0086\u0080¸{\u0006\u0011ÕÇ\u0087øZÜÂD¹Ê,m"
.length();
var19 = ' ';
var33 = -1;
}

var34 = var20.substring(++var33, var33 + var19);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28558;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ks", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/ks" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 3617;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ks", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/ks" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
