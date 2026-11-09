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

public final class gk {
@NotNull
private final b2 k;
@NotNull
private final f4 b;
private static final long a = yz.a(3580333649670352958L, 177839796594874134L, MethodHandles.lookup().lookupClass()).a(122955636249980L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long f;

public gk(int a, short a, char a, @NotNull b2 opcode, @NotNull f4 data) {
long var6 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(opcode, a<"l">(30649, 6988436239411916085L ^ var6));
Intrinsics.checkNotNullParameter(data, a<"l">(91, 898340240997374674L ^ var6));
super();
this.k = opcode;
this.b = data;
}

@NotNull
public final b2 F() {
return this.k;
}

@NotNull
public final f4 b() {
return this.b;
}

@NotNull
public final b2 N() {
return this.k;
}

@NotNull
public final f4 k() {
return this.b;
}

@NotNull
public final gk m(@NotNull b2 opcode, @NotNull f4 data, long a) {
ax = a ^ ax;
long var10001 = ax ^ 137562187024371L;
int var5 = (int)((ax ^ 137562187024371L) >>> 32);
int var6 = (int)((ax ^ 137562187024371L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(opcode, a<"l">(31374, 2384717221308241751L ^ ax));
Intrinsics.checkNotNullParameter(data, a<"l">(19055, 1910177352908089265L ^ ax));
return new gk(var5, (short)var6, (char)var7, opcode, data);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 39474654936415L;
b2 var10000 = this.k;
f4 var10001 = this.b;
return a<"l">(16467, 8609242440170560977L ^ var1) + var10000 + a<"l">(1150, 539078131125000703L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 101561630604615L;
int var3 = this.k.hashCode();
return var3 * (int)f + this.b.hashCode();
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
// 00: getstatic su/catlean/gk.a J
// 03: ldc2_w 117554713104194
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -105443575030131537
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -97231815961856674
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -97231815961856674
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/gk
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -97231815961856674
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -97231815961856674
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/gk
// 5f: astore 5
// 61: aload 0
// 62: aload 4
// 64: ifnonnull 8c
// 67: getfield su/catlean/gk.k Lsu/catlean/b2;
// 6a: aload 5
// 6c: getfield su/catlean/gk.k Lsu/catlean/b2;
// 6f: if_acmpeq 8b
// 72: goto 7f
// 75: ldc2_w -97231815961856674
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w -97231815961856674
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: getfield su/catlean/gk.b Lsu/catlean/f4;
// 8f: aload 5
// 91: getfield su/catlean/gk.b Lsu/catlean/f4;
// 94: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 97: aload 4
// 99: ifnonnull b9
// 9c: ifne b8
// 9f: goto ac
// a2: ldc2_w -97231815961856674
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: bipush 0
// ad: ireturn
// ae: ldc2_w -97231815961856674
// b1: lload 2
// b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: athrow
// b8: bipush 1
// b9: ireturn
}

static {
long var5 = a ^ 10421038602459L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[6];
int var12 = 0;
String var11 = "Pp\u008cº±¾¤\u0081\u0002fÛñ \u0094FD0´\u008cA_ûÉuâ\u000eR/m\u008d\u009cM\u0010ßUnáèJú\u0091Ô\u009f\u0090bÃ\u0080O(\u0010¼©iE\u0090K\u008d\u0019¾õ\u0005\u0096å\u001dó¬\u0010Í\u0096ÄhÃ\u0088È¦\u009eùþÓjñi¡";
int var13 = "Pp\u008cº±¾¤\u0081\u0002fÛñ \u0094FD0´\u008cA_ûÉuâ\u000eR/m\u008d\u009cM\u0010ßUnáèJú\u0091Ô\u009f\u0090bÃ\u0080O(\u0010¼©iE\u0090K\u008d\u0019¾õ\u0005\u0096å\u001dó¬\u0010Í\u0096ÄhÃ\u0088È¦\u009eùþÓjñi¡"
.length();
char var10 = ' ';
int var17 = -1;

label37:
while (true) {
String var18 = var11.substring(++var17, var17 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var26;
if ((var17 += var10) >= var13) {
c = var14;
d = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 8308844662526256269L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
f = var30;
return;
}

var10 = var11.charAt(var17);
break;
default:
var14[var12++] = var26;
if ((var17 += var10) < var13) {
var10 = var11.charAt(var17);
continue label37;
}

var11 = "SqZ\n\u0005\u0018\u0095\u0001Ý>\u009d,2ç©z\u0010ðY\u0096L\u0090ÐUL1\u0019þ!\u0018FÍ¿";
var13 = "SqZ\n\u0005\u0018\u0095\u0001Ý>\u009d,2ç©z\u0010ðY\u0096L\u0090ÐUL1\u0019þ!\u0018FÍ¿".length();
var10 = 16;
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4216;
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
throw new RuntimeException("su/catlean/gk", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/gk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
