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

public final class mm {
private final Object Z;
@NotNull
private final t_ g;
private static final long a = yz.a(7318795761224930423L, -3191237882661130612L, MethodHandles.lookup().lookupClass()).a(247609998508931L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public mm(Object data, long a, @NotNull t_ damageData) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(damageData, a<"i">(14740, 3068506137957950040L ^ ax));
super();
this.Z = data;
this.g = damageData;
}

public final Object t() {
return this.Z;
}

@NotNull
public final t_ Y() {
return this.g;
}

public final Object f() {
return this.Z;
}

@NotNull
public final t_ e() {
return this.g;
}

@NotNull
public final mm r(long a, Object data, @NotNull t_ damageData) {
ax = a ^ ax;
long var5 = ax ^ 81695887902829L;
Intrinsics.checkNotNullParameter(damageData, a<"i">(13879, 665594455513365890L ^ ax));
return new mm(data, var5, damageData);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 122397466968385L;
Object var10000 = this.Z;
t_ var10001 = this.g;
return a<"i">(25765, 1542594534957629978L ^ var1) + var10000 + a<"i">(14332, 3354773452757799234L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/mm.a J
// 03: ldc2_w 110948077609469
// 06: lxor
// 07: lstore 1
// 08: ldc2_w -542966553870987440
// 0b: lload 1
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 3
// 12: aload 0
// 13: getfield su/catlean/mm.Z Ljava/lang/Object;
// 16: aload 3
// 17: ifnonnull 3c
// 1a: ifnonnull 38
// 1d: goto 2a
// 20: ldc2_w -539347811242964407
// 23: lload 1
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 0
// 2b: goto 3f
// 2e: ldc2_w -539347811242964407
// 31: lload 1
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: getfield su/catlean/mm.Z Ljava/lang/Object;
// 3c: invokevirtual java/lang/Object.hashCode ()I
// 3f: istore 4
// 41: iload 4
// 43: getstatic su/catlean/mm.e J
// 46: l2i
// 47: imul
// 48: aload 0
// 49: getfield su/catlean/mm.g Lsu/catlean/t_;
// 4c: invokevirtual su/catlean/t_.hashCode ()I
// 4f: iadd
// 50: istore 4
// 52: iload 4
// 54: ireturn
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
// 00: getstatic su/catlean/mm.a J
// 03: ldc2_w 132355413806365
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 6095307926274548656
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 6080922233152677545
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 6080922233152677545
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/mm
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 6080922233152677545
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 6080922233152677545
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/mm
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/mm.Z Ljava/lang/Object;
// 65: aload 5
// 67: getfield su/catlean/mm.Z Ljava/lang/Object;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 6080922233152677545
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 6080922233152677545
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/mm.g Lsu/catlean/t_;
// 92: aload 5
// 94: getfield su/catlean/mm.g Lsu/catlean/t_;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnonnull bc
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w 6080922233152677545
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 6080922233152677545
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

static {
long var5 = a ^ 91162057948991L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[4];
int var12 = 0;
String var11 = "®N÷\u0006G¶\u0006¬_\u007fÀ¥ÊÓ\u009e&.\u0004eÀ[Üi%(Ç\u008c\u0010\tW³Ö\u0088\u0086ª³\u0091ÚV\u00ad\u008azlÀµ¾î*?zùU\u0089ç©ðï+ÜÁiÜ~\u0097ª";
int var13 = "®N÷\u0006G¶\u0006¬_\u007fÀ¥ÊÓ\u009e&.\u0004eÀ[Üi%(Ç\u008c\u0010\tW³Ö\u0088\u0086ª³\u0091ÚV\u00ad\u008azlÀµ¾î*?zùU\u0089ç©ðï+ÜÁiÜ~\u0097ª".length();
char var10 = 24;
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
b = var14;
c = new String[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 6780088792869467639L;
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
e = var30;
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

var11 = "©3UÆ\u000bR\u0016Q([Ðl@C.Ùe²Þ\u001cÿ\u001c\u0011¦¢%þÃ\u007f\u000f\u0006\u009d \rs¹ÿ2äÚº6\u008b\u0095¬ç}]+\u007f\u0017~?\u001eÎçcï¸Ê9\u007fpê0";
var13 = "©3UÆ\u000bR\u0016Q([Ðl@C.Ùe²Þ\u001cÿ\u001c\u0011¦¢%þÃ\u007f\u000f\u0006\u009d \rs¹ÿ2äÚº6\u008b\u0095¬ç}]+\u007f\u0017~?\u001eÎçcï¸Ê9\u007fpê0"
.length();
var10 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16362;
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
throw new RuntimeException("su/catlean/mm", var10);
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
throw new RuntimeException("su/catlean/mm" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
