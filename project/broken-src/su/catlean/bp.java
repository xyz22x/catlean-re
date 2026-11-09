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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class bp implements wl {
@NotNull
public static final fc e;
@NotNull
private String z;
@NotNull
private lj R;
private boolean i;
@NotNull
private String Y;
private static String[] x;
private static final long a = yz.a(-2978877010743915273L, -6167606304803040657L, MethodHandles.lookup().lookupClass()).a(154075658118742L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public bp(@NotNull String id, int a, short a, char a, @NotNull lj bind, boolean enabled, @NotNull String message) {
long var8 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(id, a<"n">(488, 664861109479569865L ^ var8));
Intrinsics.checkNotNullParameter(bind, a<"n">(1949, 3156253557632106423L ^ var8));
Intrinsics.checkNotNullParameter(message, a<"n">(18597, 6708120691914289283L ^ var8));
super();
this.z = id;
this.R = bind;
this.i = enabled;
this.Y = message;
}

@NotNull
@Override
public String W() {
return this.z;
}

@Override
public void j(@NotNull String <set-?>, long a) {
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(31971, 4356044770932457355L ^ ax));
this.z = <set-?>;
}

@NotNull
@Override
public lj X() {
return this.R;
}

@Override
public void r(@NotNull lj <set-?>, long a) {
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(322, 3307649319366658499L ^ ax));
this.R = <set-?>;
}

@Override
public boolean I() {
return this.i;
}

@Override
public void K(boolean <set-?>) {
this.i = <set-?>;
}

@NotNull
public final String p() {
return this.Y;
}

public final void i(long a, @NotNull String <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(31971, 4356043607715122905L ^ ax));
this.Y = <set-?>;
}

@NotNull
public final String D() {
return this.z;
}

@NotNull
public final lj h() {
return this.R;
}

public final boolean x() {
return this.i;
}

@NotNull
public final String k() {
return this.Y;
}

@NotNull
public final bp b(long a, @NotNull String id, @NotNull lj bind, boolean enabled, @NotNull String message) {
ax = a ^ ax;
long var10001 = ax ^ 68001172426167L;
int var7 = (int)((ax ^ 68001172426167L) >>> 32);
int var8 = (int)((ax ^ 68001172426167L) << 32 >>> 48);
int var9 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(id, a<"n">(32653, 5496891868857006535L ^ ax));
Intrinsics.checkNotNullParameter(bind, a<"n">(16470, 3335705982435837456L ^ ax));
Intrinsics.checkNotNullParameter(message, a<"n">(4881, 6084325280966677850L ^ ax));
return new bp(id, var7, (short)var8, (char)var9, bind, enabled, message);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static bp v(bp var0, String var1, lj var2, long var3, boolean var5, String var6, int var7, Object var8) {
var3 = a ^ var3;
long var9 = var3 ^ 75536311461715L;
boolean var11 = vm.a<"Å">(824357180414766507L, var3);

int var10000;
label65: {
label64: {
try {
var10000 = var7 & 1;
if (var11) {
break label65;
}

if (var10000 == 0) {
break label64;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 822912928360289021L, var3);
}

var1 = var0.z;
}

var10000 = var7 & 2;
}

boolean var10001;
label56: {
label55: {
label54: {
try {
var10001 = var11;
if (var3 < 0L) {
break label56;
}

if (var11) {
break label55;
}

if (var10000 == 0) {
break label54;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 822912928360289021L, var3);
}

var2 = var0.R;
}

var10000 = var7 & 4;
}

try {
var10001 = var11;
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 822912928360289021L, var3);
}
}

label43: {
label42: {
try {
if (var10001) {
break label43;
}

if (var10000 == 0) {
break label42;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 822912928360289021L, var3);
}

var5 = var0.i;
}

var10000 = var7 & b<"s">(8825, 1174790293520124406L ^ var3);
}

if (var10000 != 0) {
var6 = var0.Y;
}

return var0.b(var9, var1, var2, var5, var6);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 118360178292881L;
String var3 = this.Y;
boolean var4 = this.i;
lj var5 = this.R;
String var6 = this.z;
return a<"n">(12677, 4194911635682583063L ^ var1)
+ var6
+ a<"n">(27501, 1458304918855137531L ^ var1)
+ var5
+ a<"n">(5181, 5009456734497818542L ^ var1)
+ var4
+ a<"n">(7059, 8857781398066972681L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 58233459225797L;
int var3 = this.z.hashCode();
var3 = var3 * b<"s">(12017, 139551280270329980L ^ var1) + this.R.hashCode();
var3 = var3 * b<"s">(18067, 1284476884353196057L ^ var1) + Boolean.hashCode(this.i);
return var3 * b<"s">(18067, 1284476884353196057L ^ var1) + this.Y.hashCode();
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
// 000: getstatic su/catlean/bp.a J
// 003: ldc2_w 53242606465649
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 4642451303478182259
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: istore 4
// 013: aload 0
// 014: iload 4
// 016: ifeq 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 4674359737339058504
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 4674359737339058504
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: iload 4
// 039: ifeq 05c
// 03c: instanceof su/catlean/bp
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 4674359737339058504
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 4674359737339058504
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/bp
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/bp.z Ljava/lang/String;
// 065: aload 5
// 067: getfield su/catlean/bp.z Ljava/lang/String;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: iload 4
// 06f: ifeq 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w 4674359737339058504
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 4674359737339058504
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/bp.R Lsu/catlean/lj;
// 092: aload 5
// 094: getfield su/catlean/bp.R Lsu/catlean/lj;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: iload 4
// 09c: ifeq 0bf
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 4674359737339058504
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 4674359737339058504
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/bp.i Z
// 0bf: iload 4
// 0c1: ifeq 0f1
// 0c4: aload 5
// 0c6: getfield su/catlean/bp.i Z
// 0c9: if_icmpeq 0e5
// 0cc: goto 0d9
// 0cf: ldc2_w 4674359737339058504
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: ireturn
// 0db: ldc2_w 4674359737339058504
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: aload 0
// 0e6: getfield su/catlean/bp.Y Ljava/lang/String;
// 0e9: aload 5
// 0eb: getfield su/catlean/bp.Y Ljava/lang/String;
// 0ee: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f1: iload 4
// 0f3: ifeq 113
// 0f6: ifne 112
// 0f9: goto 106
// 0fc: ldc2_w 4674359737339058504
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 0
// 107: ireturn
// 108: ldc2_w 4674359737339058504
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: bipush 1
// 113: ireturn
}

@JvmStatic
public static final void s(bp self, CompositeEncoder output, SerialDescriptor serialDesc) {
output.encodeStringElement(serialDesc, 0, self.W());
output.encodeSerializableElement(serialDesc, 1, ss.B, self.X());
output.encodeBooleanElement(serialDesc, 2, self.I());
output.encodeStringElement(serialDesc, 3, self.Y);
}

public bp(int seen0, String id, lj bind, long a, boolean enabled, String message, SerializationConstructorMarker serializationConstructorMarker) {
ax = a ^ ax;
if (b<"s">(24060, 699121319277252498L ^ ax) != (b<"s">(116, 318155665014854169L ^ ax) & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, b<"s">(116, 318155665014854169L ^ ax), p2.N.getDescriptor());
}

super();
this.z = id;
this.R = bind;
this.i = enabled;
this.Y = message;
}

static {
long var20 = a ^ 80011171236132L;
vm.a<"Å">(null, -324973282500130088L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[12];
int var16 = 0;
String var15 = "sB<éÞ«»ÞMlZ[K'Èî\u0010w\u0000\u0097½!¨GÉo\u0004?@Õ@[4 \u009fµ?Y\u0094+{Uk®\u0017¥\u009e-²Éb\u001b\u0014à¼:BpÄ´ÛCCMfì\u00188Óº\u0082\u0013ðª\u009bÇ\u0093Rrq6¶Ù'\u009dð\u0085ß;ÌÐ\u0010éG\u000e\u001b µ\u0013¾\u008cB¬©æqI^\u0010o5Äh<\f\u0016ÑX\u0084ukòó\t.\u0010à\f¬Î\u0098\\²ù'Ç$\u0007@\u009ftç\u0010Ù\u0082\u0092Dt¯\u008f>Ê1+hËÇÚs\u0010\u000b\u0091\u000fÈ\u0082:\u009a/ÂÈ´çÇ\u0083°\u001a\u0010\u0099\"¢<§]ÂMDÄ'\u009a0ÿ-3";
int var17 = "sB<éÞ«»ÞMlZ[K'Èî\u0010w\u0000\u0097½!¨GÉo\u0004?@Õ@[4 \u009fµ?Y\u0094+{Uk®\u0017¥\u009e-²Éb\u001b\u0014à¼:BpÄ´ÛCCMfì\u00188Óº\u0082\u0013ðª\u009bÇ\u0093Rrq6¶Ù'\u009dð\u0085ß;ÌÐ\u0010éG\u000e\u001b µ\u0013¾\u008cB¬©æqI^\u0010o5Äh<\f\u0016ÑX\u0084ukòó\t.\u0010à\f¬Î\u0098\\²ù'Ç$\u0007@\u009ftç\u0010Ù\u0082\u0092Dt¯\u008f>Ê1+hËÇÚs\u0010\u000b\u0091\u000fÈ\u0082:\u009a/ÂÈ´çÇ\u0083°\u001a\u0010\u0099\"¢<§]ÂMDÄ'\u009a0ÿ-3"
.length();
char var14 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[12];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "ãî\u0093v0^WÌQ=uÃ²ä\u007f¿íîGEGÛ@^";
int var5 = "ãî\u0093v0^WÌQ=uÃ²ä\u007f¿íîGEGÛ@^".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
f = var6;
g = new Integer[5];
e = new fc(null);
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u001dHá\u0088Ý\u008cüÐCp³Þb-\u008d{";
var5 = "\u001dHá\u0088Ý\u008cüÐCp³Þb-\u008d{".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "¶¾lïL\u0086P|»°1\u0093\u008e÷\u0084¨J¨v\u0097¥¡÷(Ñm\u001a59z°z\u0010ù!Ýs\u001c\u0081*6bï´0\u008a{\u008cÖ";
var17 = "¶¾lïL\u0086P|»°1\u0093\u008e÷\u0084¨J¨v\u0097¥¡÷(Ñm\u001a59z°z\u0010ù!Ýs\u001c\u0081*6bï´0\u008a{\u008cÖ".length();
var14 = ' ';
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void H(String[] var0) {
x = var0;
}

public static String[] F() {
return x;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22740;
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
throw new RuntimeException("su/catlean/bp", var10);
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
throw new RuntimeException("su/catlean/bp" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 8606;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/bp", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/bp" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
