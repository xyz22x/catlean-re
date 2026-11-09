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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class f4 {
@NotNull
public static final f3 i;
@Nullable
private final d1 F;
@Nullable
private final aw u;
@NotNull
private final y9 U;
@JvmField
@NotNull
private static final Lazy[] s;
private static final long a = yz.a(1204913502164840271L, 1802427190617290307L, MethodHandles.lookup().lookupClass()).a(130849180966726L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public f4(@Nullable d1 evt, @Nullable aw cmd, @NotNull y9 data, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(data, a<"f">(28967, 365035730241185624L ^ ax));
super();
this.F = evt;
this.u = cmd;
this.U = data;
}

@Nullable
public final d1 a() {
return this.F;
}

@Nullable
public final aw Z() {
return this.u;
}

@NotNull
public final y9 J() {
return this.U;
}

@Nullable
public final d1 B() {
return this.F;
}

@Nullable
public final aw d() {
return this.u;
}

@NotNull
public final y9 C() {
return this.U;
}

@NotNull
public final f4 n(@Nullable d1 evt, @Nullable aw cmd, @NotNull y9 data, long a) {
ax = a ^ ax;
long var6 = ax ^ 28784031271984L;
Intrinsics.checkNotNullParameter(data, a<"f">(10221, 8481797065491019464L ^ ax));
return new f4(evt, cmd, data, var6);
}

public static f4 K(f4 var0, long var1, d1 var3, aw var4, y9 var5, int var6, Object var7) {
var1 = a ^ var1;
long var8 = var1 ^ 52110690751935L;
String[] var10 = vm.a<"Å">(7719829021702406404L, var1);

int var10000;
label41: {
label40: {
try {
var10000 = var6 & 1;
if (var10 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 7757152955118675167L, var1);
}

var3 = var0.F;
}

var10000 = var6 & 2;
}

label32: {
label31: {
try {
if (var10 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 7757152955118675167L, var1);
}

var4 = var0.u;
}

var10000 = var6 & 4;
}

if (var10000 != 0) {
var5 = var0.U;
}

return var0.n(var3, var4, var5, var8);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 105905195283331L;
y9 var3 = this.U;
aw var4 = this.u;
d1 var5 = this.F;
return a<"f">(19461, 8803806760562168146L ^ var1)
+ var5
+ a<"f">(8949, 5262846521962299297L ^ var1)
+ var4
+ a<"f">(1852, 7621214304909449839L ^ var1)
+ var3
+ ")";
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
// 00: getstatic su/catlean/f4.a J
// 03: ldc2_w 20486809136767
// 06: lxor
// 07: lstore 1
// 08: ldc2_w -1983785215945978274
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 3
// 12: aload 0
// 13: getfield su/catlean/f4.F Lsu/catlean/d1;
// 16: aload 3
// 17: ifnonnull 3c
// 1a: ifnonnull 38
// 1d: goto 2a
// 20: ldc2_w -1946527281112093819
// 23: lload 1
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 0
// 2b: goto 3f
// 2e: ldc2_w -1946527281112093819
// 31: lload 1
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: getfield su/catlean/f4.F Lsu/catlean/d1;
// 3c: invokevirtual su/catlean/d1.hashCode ()I
// 3f: istore 4
// 41: iload 4
// 43: sipush 30549
// 46: ldc2_w 9129693976586501953
// 49: lload 1
// 4a: lxor
// 4b: invokedynamic t (IJ)I bsm=su/catlean/f4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: imul
// 51: aload 0
// 52: getfield su/catlean/f4.u Lsu/catlean/aw;
// 55: aload 3
// 56: ifnonnull 7b
// 59: ifnonnull 77
// 5c: goto 69
// 5f: ldc2_w -1946527281112093819
// 62: lload 1
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: bipush 0
// 6a: goto 7e
// 6d: ldc2_w -1946527281112093819
// 70: lload 1
// 71: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76: athrow
// 77: aload 0
// 78: getfield su/catlean/f4.u Lsu/catlean/aw;
// 7b: invokevirtual su/catlean/aw.hashCode ()I
// 7e: iadd
// 7f: istore 4
// 81: iload 4
// 83: sipush 30135
// 86: ldc2_w 7650726780582378912
// 89: lload 1
// 8a: lxor
// 8b: invokedynamic t (IJ)I bsm=su/catlean/f4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90: imul
// 91: aload 0
// 92: getfield su/catlean/f4.U Lsu/catlean/y9;
// 95: invokevirtual su/catlean/y9.hashCode ()I
// 98: iadd
// 99: istore 4
// 9b: iload 4
// 9d: ireturn
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
// 00: getstatic su/catlean/f4.a J
// 03: ldc2_w 93179291368649
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 3949212413993852136
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 3912165584887888179
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 3912165584887888179
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/f4
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 3912165584887888179
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 3912165584887888179
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/f4
// 5f: astore 5
// 61: aload 0
// 62: aload 4
// 64: ifnonnull 8c
// 67: getfield su/catlean/f4.F Lsu/catlean/d1;
// 6a: aload 5
// 6c: getfield su/catlean/f4.F Lsu/catlean/d1;
// 6f: if_acmpeq 8b
// 72: goto 7f
// 75: ldc2_w 3912165584887888179
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w 3912165584887888179
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: aload 4
// 8e: ifnonnull b6
// 91: getfield su/catlean/f4.u Lsu/catlean/aw;
// 94: aload 5
// 96: getfield su/catlean/f4.u Lsu/catlean/aw;
// 99: if_acmpeq b5
// 9c: goto a9
// 9f: ldc2_w 3912165584887888179
// a2: lload 2
// a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a8: athrow
// a9: bipush 0
// aa: ireturn
// ab: ldc2_w 3912165584887888179
// ae: lload 2
// af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b4: athrow
// b5: aload 0
// b6: getfield su/catlean/f4.U Lsu/catlean/y9;
// b9: aload 5
// bb: getfield su/catlean/f4.U Lsu/catlean/y9;
// be: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// c1: aload 4
// c3: ifnonnull e3
// c6: ifne e2
// c9: goto d6
// cc: ldc2_w 3912165584887888179
// cf: lload 2
// d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d5: athrow
// d6: bipush 0
// d7: ireturn
// d8: ldc2_w 3912165584887888179
// db: lload 2
// dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e1: athrow
// e2: bipush 1
// e3: ireturn
}

@JvmStatic
public static final void C(f4 self, CompositeEncoder output, SerialDescriptor serialDesc) {
Lazy[] var3 = s;
output.encodeNullableSerializableElement(serialDesc, 0, (SerializationStrategy<? super d1>)var3[0].getValue(), self.F);
output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy<? super aw>)var3[1].getValue(), self.u);
output.encodeSerializableElement(serialDesc, 2, zb.K, self.U);
}

public f4(int seen0, d1 evt, aw cmd, y9 data, long a, SerializationConstructorMarker serializationConstructorMarker) {
ax = a ^ ax;
if (b<"t">(12849, 7747010294171437351L ^ ax) != (b<"t">(19554, 8781395963188541303L ^ ax) & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, b<"t">(19554, 8781395963188541303L ^ ax), xr.N.getDescriptor());
}

super();
this.F = evt;
this.u = cmd;
this.U = data;
}

private static final KSerializer V() {
return d1.Companion.k();
}

private static final KSerializer P() {
return aw.Companion.b();
}

public static final Lazy[] w() {
return s;
}

static {
long var11 = a ^ 97818275681702L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[5];
int var18 = 0;
String var17 = "\u00ad\u0099:¾~¤º¾é\u0002/\u001a\u0003Åw\u0097\u008cM\u0096=\bJç¡ðT\u009b\u009ecÎ`&¬V«Ò\u000bf\u0005#\u0010¤\u0006\n\u00adO\u001eØF#Û¹\u0094j&\u000fÿ\u0010a\u0016¾Þ\u0017SÿyÂÆ4\u0014\u0089\u009a¾'";
int var19 = "\u00ad\u0099:¾~¤º¾é\u0002/\u001a\u0003Åw\u0097\u008cM\u0096=\bJç¡ðT\u009b\u009ecÎ`&¬V«Ò\u000bf\u0005#\u0010¤\u0006\n\u00adO\u001eØF#Û¹\u0094j&\u000fÿ\u0010a\u0016¾Þ\u0017SÿyÂÆ4\u0014\u0089\u009a¾'"
.length();
char var16 = '(';
int var25 = -1;

label54:
while (true) {
String var26 = var17.substring(++var25, var25 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var37;
if ((var25 += var16) >= var19) {
b = var20;
c = new String[5];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = ";'¹\u001cÞ\u0013\u009eÒò\u0015CöÊ\u000e\u0017Ä";
int var5 = ";'¹\u001cÞ\u0013\u009eÒò\u0015CöÊ\u000e\u0017Ä".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var29 = var6;
var10001 = var3++;
long var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var44 = -1;

while (true) {
long var8 = var41;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var46 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var44) {
case 0:
var29[var10001] = var46;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
i = new f3(null);
Lazy[] var22 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, f4::V), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, f4::P), null};
s = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "s\u00915é¹n³ \u009cdP\fâõÇô";
var5 = "s\u00915é¹n³ \u009cdP\fâõÇô".length();
var2 = 0;
}

byte var35 = var2;
var2 += 8;
var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
var29 = var6;
var10001 = var3++;
var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var44 = 0;
}
}
}

var16 = var17.charAt(var25);
break;
default:
var20[var18++] = var37;
if ((var25 += var16) < var19) {
var16 = var17.charAt(var25);
continue label54;
}

var17 = ".\b}mu\n>×\u000b\u0096«\u0013ÑiÚ>\u0010ÂyÓLØ%Î·æîB×OA´ª";
var19 = ".\b}mu\n>×\u000b\u0096«\u0013ÑiÚ>\u0010ÂyÓLØ%Î·æîB×OA´ª".length();
var16 = 16;
var25 = -1;
}

var26 = var17.substring(++var25, var25 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26045;
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
throw new RuntimeException("su/catlean/f4", var10);
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
throw new RuntimeException("su/catlean/f4" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 11520;
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
throw new RuntimeException("su/catlean/f4", var14);
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
throw new RuntimeException("su/catlean/f4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
