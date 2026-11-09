package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public final class oo {
@NotNull
public static final oo k;
@NotNull
private static final List M;
private static _g[] g;
private static final long a = yz.a(3301654830408783113L, -36196659397426358L, MethodHandles.lookup().lookupClass()).a(19701932531467L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private oo() {
}

@NotNull
public final List v() {
return M;
}

@NotNull
public final String w(int a, @NotNull String id, @NotNull Number minValue, @NotNull String orElse, char a, short a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 5
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 32
// 00d: lushr
// 00e: lor
// 00f: iload 6
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/oo.a J
// 01c: lxor
// 01d: lstore 7
// 01f: aload 2
// 020: sipush 31357
// 023: ldc2_w 4339704088770262827
// 026: lload 7
// 028: lxor
// 029: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/oo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 031: ldc2_w 239189819414862279
// 034: lload 7
// 036: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03b: aload 3
// 03c: sipush 29520
// 03f: ldc2_w 6251961914546601476
// 042: lload 7
// 044: lxor
// 045: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/oo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04d: astore 9
// 04f: aload 4
// 051: sipush 25432
// 054: ldc2_w 1829000911207575055
// 057: lload 7
// 059: lxor
// 05a: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/oo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 062: getstatic su/catlean/oo.M Ljava/util/List;
// 065: checkcast java/lang/Iterable
// 068: astore 10
// 06a: bipush 0
// 06b: istore 11
// 06d: aload 10
// 06f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 074: astore 12
// 076: aload 12
// 078: invokeinterface java/util/Iterator.hasNext ()Z 1
// 07d: ifeq 0e8
// 080: aload 12
// 082: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 087: astore 13
// 089: aload 13
// 08b: checkcast su/catlean/s6
// 08e: astore 14
// 090: bipush 0
// 091: istore 15
// 093: aload 14
// 095: invokevirtual su/catlean/s6.P ()Ljava/lang/String;
// 098: aload 2
// 099: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09c: aload 9
// 09e: ifnonnull 0bb
// 0a1: ifeq 0d5
// 0a4: aload 3
// 0a5: aload 14
// 0a7: invokevirtual su/catlean/s6.V ()Ljava/lang/Number;
// 0aa: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ad: goto 0bb
// 0b0: ldc2_w 284548712018404713
// 0b3: lload 7
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 9
// 0bd: ifnonnull 0d2
// 0c0: ifeq 0d5
// 0c3: goto 0d1
// 0c6: ldc2_w 284548712018404713
// 0c9: lload 7
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: bipush 1
// 0d2: goto 0d6
// 0d5: bipush 0
// 0d6: ifeq 076
// 0d9: aload 13
// 0db: iload 6
// 0dd: iflt 087
// 0e0: aload 9
// 0e2: ifnonnull 08b
// 0e5: goto 0e9
// 0e8: aconst_null
// 0e9: checkcast su/catlean/s6
// 0ec: dup
// 0ed: ifnull 10a
// 0f0: invokevirtual su/catlean/s6.H ()Ljava/lang/String;
// 0f3: iload 5
// 0f5: iflt 11b
// 0f8: dup
// 0f9: ifnonnull 11b
// 0fc: goto 10a
// 0ff: ldc2_w 284548712018404713
// 102: lload 7
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: pop
// 10b: aload 4
// 10d: goto 11b
// 110: ldc2_w 284548712018404713
// 113: lload 7
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: aload 9
// 11d: iload 1
// 11e: iflt 128
// 121: ifnull 140
// 124: bipush 4
// 125: anewarray 308
// 128: ldc2_w 239134545422518636
// 12b: lload 7
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: goto 140
// 135: ldc2_w 284548712018404713
// 138: lload 7
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: areturn
}

static {
long var9 = a ^ 19243505632752L;
vm.a<"Å">(null, 7560267745504249561L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[3];
int var5 = 0;
String var4 = "c\u0080]±Dôf\u000f\u0010æÇx\u009fû\u008d\u001d\u0010º\u0010uÒ%°naeI\u0092Î\u001bú<+ uÄ¥Ý=Qr\b\u009c¥:\u0012*\u0098\u009c`\u009d\u0099§Däb-)\u0006xÊàòë1\u0017";
int var6 = "c\u0080]±Dôf\u000f\u0010æÇx\u009fû\u008d\u001d\u0010º\u0010uÒ%°naeI\u0092Î\u001bú<+ uÄ¥Ý=Qr\b\u009c¥:\u0012*\u0098\u009c`\u009d\u0099§Däb-)\u0006xÊàòë1\u0017"
.length();
char var3 = 16;
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var7[var5++] = var13;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[3];
k = new oo();
M = new ArrayList();
return;
}

var3 = var4.charAt(var2);
}
}

public static void R(_g[] var0) {
g = var0;
}

public static _g[] k() {
return g;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20256;
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
throw new RuntimeException("su/catlean/oo", var10);
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
throw new RuntimeException("su/catlean/oo" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
