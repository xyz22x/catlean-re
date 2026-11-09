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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.mixins.accessors.LocalPlayerAccessor;

public final class _w {
@NotNull
public static final ye W;
private float e;
private float r;
private boolean B;
@NotNull
private z3 V;
private static boolean w;
private static final long a = yz.a(-2844651197561317818L, 6619009265279355071L, MethodHandles.lookup().lookupClass()).a(77942568895954L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public _w(long a, float yaw, float pitch, boolean grim, @NotNull z3 moveFix) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(moveFix, a<"b">(14449, 5979634937853002010L ^ ax));
super();
this.e = yaw;
this.r = pitch;
this.B = grim;
this.V = moveFix;
}

public _w(float var1, long var2, float var4, boolean var5, z3 var6, int var7, DefaultConstructorMarker var8) {
var2 = a ^ var2;
long var9 = var2 ^ 68252415187438L;
if ((var7 & 4) != 0) {
var5 = false;
}

if ((var7 & b<"g">(20191, 7537785091283714446L ^ var2)) != 0) {
var6 = z3.NONE;
}

this(var9, var1, var4, var5, var6);
}

public final float q() {
return this.e;
}

public final void c(float <set-?>) {
this.e = <set-?>;
}

public final float N() {
return this.r;
}

public final void A(float <set-?>) {
this.r = <set-?>;
}

public final boolean R() {
return this.B;
}

public final void g(boolean <set-?>) {
this.B = <set-?>;
}

@NotNull
public final z3 n() {
return this.V;
}

public final void b(long a, @NotNull z3 <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"b">(6168, 8819174042140235780L ^ ax));
this.V = <set-?>;
}

@NotNull
public final _w s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 140437902774650L;
long var5 = var1 ^ 104589818388316L;
double var7 = Math.pow(((Number)zf.F(var3).field_1690.method_42495().method_41753()).doubleValue() * 0.6 + 0.2, 3) * 8.0 * 0.15F;
float var10000 = this.e;
class_746 var10001 = zf.v(var5);
Intrinsics.checkNotNull(var10001, a<"b">(15708, 7087160791424241697L ^ var1));
float var9 = class_3532.method_15393(var10000 - ((LocalPlayerAccessor)var10001).getLastYaw());
var10000 = this.r;
var10001 = zf.v(var5);
Intrinsics.checkNotNull(var10001, a<"b">(31016, 3550096427037807700L ^ var1));
float var10 = class_3532.method_15393(var10000 - ((LocalPlayerAccessor)var10001).getLastPitch());
double var11 = MathKt.roundToInt(var9 / var7) * var7;
double var13 = MathKt.roundToInt(var10 / var7) * var7;
var10001 = zf.v(var5);
Intrinsics.checkNotNull(var10001, a<"b">(31016, 3550096427037807700L ^ var1));
this.e = ((LocalPlayerAccessor)var10001).getLastYaw() + (float)var11;
var10001 = zf.v(var5);
Intrinsics.checkNotNull(var10001, a<"b">(31016, 3550096427037807700L ^ var1));
this.r = RangesKt.coerceIn(((LocalPlayerAccessor)var10001).getLastPitch() + (float)var13, -90.0F, 90.0F);
return this;
}

@NotNull
public final _w n(@NotNull z3 v) {
Intrinsics.checkNotNullParameter(v, "v");
this.V = v;
return this;
}

@NotNull
public final _w b(boolean v) {
this.B = v;
return this;
}

public final float r() {
return this.e;
}

public final float G() {
return this.r;
}

public final boolean f() {
return this.B;
}

@NotNull
public final z3 p() {
return this.V;
}

@NotNull
public final _w G(float yaw, float pitch, long a, short a, boolean grim, @NotNull z3 moveFix) {
long var8 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
long var10 = var8 ^ 121320114812262L;
Intrinsics.checkNotNullParameter(moveFix, a<"b">(18945, 3854725268786684004L ^ var8));
return new _w(var10, yaw, pitch, grim, moveFix);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static _w H(long var0, _w var2, float var3, float var4, boolean var5, z3 var6, int var7, Object var8) {
var0 = a ^ var0;
long var9 = (var0 ^ 116514477306676L) >>> 16;
int var11 = (int)((var0 ^ 116514477306676L) << 48 >>> 48);
_g[] var12 = vm.a<"Å">(6861740000058126017L, var0);

int var10000;
label65: {
label64: {
try {
var10000 = var7 & 1;
if (var12 != null) {
break label65;
}

if (var10000 == 0) {
break label64;
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 6906065106171677675L, var0);
}

var3 = var2.e;
}

var10000 = var7 & 2;
}

_g[] var10001;
label56: {
label55: {
label54: {
try {
var10001 = var12;
if (var0 <= 0L) {
break label56;
}

if (var12 != null) {
break label55;
}

if (var10000 == 0) {
break label54;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 6906065106171677675L, var0);
}

var4 = var2.r;
}

var10000 = var7 & 4;
}

try {
var10001 = var12;
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 6906065106171677675L, var0);
}
}

label43: {
label42: {
try {
if (var10001 != null) {
break label43;
}

if (var10000 == 0) {
break label42;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 6906065106171677675L, var0);
}

var5 = var2.B;
}

var10000 = var7 & b<"g">(17976, 1246078993710231738L ^ var0);
}

if (var10000 != 0) {
var6 = var2.V;
}

return var2.G(var3, var4, var9, (short)var11, var5, var6);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 26739439727375L;
z3 var3 = this.V;
boolean var4 = this.B;
float var5 = this.r;
float var6 = this.e;
return a<"b">(6351, 7048279859377155303L ^ var1)
+ var6
+ a<"b">(275, 4605035036709860665L ^ var1)
+ var5
+ a<"b">(27233, 3471297460346576455L ^ var1)
+ var4
+ a<"b">(21526, 8598814507501936697L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 135796301025733L;
int var3 = Float.hashCode(this.e);
var3 = var3 * b<"g">(18682, 3962182843220744099L ^ var1) + Float.hashCode(this.r);
var3 = var3 * b<"g">(6928, 2635882726709494859L ^ var1) + Boolean.hashCode(this.B);
return var3 * b<"g">(6928, 2635882726709494859L ^ var1) + this.V.hashCode();
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
// 00: getstatic su/catlean/_w.a J
// 03: ldc2_w 94220300527818
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 5759688752701423126
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 5692567334553410364
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 5692567334553410364
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/_w
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 5692567334553410364
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 5692567334553410364
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/_w
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/_w.e F
// 65: aload 5
// 67: getfield su/catlean/_w.e F
// 6a: invokestatic java/lang/Float.compare (FF)I
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifeq 8e
// 75: goto 82
// 78: ldc2_w 5692567334553410364
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 5692567334553410364
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/_w.r F
// 92: aload 5
// 94: getfield su/catlean/_w.r F
// 97: invokestatic java/lang/Float.compare (FF)I
// 9a: aload 4
// 9c: ifnonnull d1
// 9f: ifeq bb
// a2: goto af
// a5: ldc2_w 5692567334553410364
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 5692567334553410364
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: aload 4
// be: ifnonnull e6
// c1: getfield su/catlean/_w.B Z
// c4: goto d1
// c7: ldc2_w 5692567334553410364
// ca: lload 2
// cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d0: athrow
// d1: aload 5
// d3: getfield su/catlean/_w.B Z
// d6: if_icmpeq e5
// d9: bipush 0
// da: ireturn
// db: ldc2_w 5692567334553410364
// de: lload 2
// df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e4: athrow
// e5: aload 0
// e6: getfield su/catlean/_w.V Lsu/catlean/z3;
// e9: aload 5
// eb: getfield su/catlean/_w.V Lsu/catlean/z3;
// ee: if_acmpeq fd
// f1: bipush 0
// f2: ireturn
// f3: ldc2_w 5692567334553410364
// f6: lload 2
// f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// fc: athrow
// fd: bipush 1
// fe: ireturn
}

static {
long var20 = a ^ 28292539799969L;
vm.a<"Å">(true, -4750504390999757608L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[9];
int var16 = 0;
String var15 = "\u0098ü·!\u0019ht\u001aÏßÍ\u0019þ~\n¦ \u0016ý\u0097 >:\u0087øZ¥m¿=rakWWþ¹1\u000e\u0090`^\fø ©\u0093óS\u0088òkk|jb\u0080\u0014\u009b\u0082´\u0099æQ\u0083Bh\u001duLÇÄ\u001b1\u0005\\T\u009d\u009cB\u0094¾\u001f\u0003\"]ù\u009b«;PU\u0080Ã\u001fl\u008d.3{R,\u008cH+é¢ çv\u009fvtt7\u0089\u0016Å\u0005ÛP]ì\u009e__\u007fª4Ýg&\u0014àú|\u0086nN\u0012B]\u009e¸\u000b\u001c\u0000 \u0016þ{\u00066\u0095×°Ña\u009cp\u0096Q1\u007fã\u0003ë\u001b\u001e¦E\u0007\\e\u0013\u0001\u0017ä_ý\u0010D}\u001cy½\u0090Y\u0087©Uò>þ\u00adÈ\f\\¤Î\u0013 ïB\u0097\u0013Cò^«\u008e5Ø±·÷(V\u0081ãA9÷iKvs\u0096´fá\u009b[æ\u008c\u009a\\ÜS0ÑnÙ3\u00146·U1\u0018\u0003\u0099\u0014\u001bÜ\u0088\bÊÚ\u007f\u0086\u0017\u0003g\u0095¬®bißwÿØ¸\u0016\rà\n\u008bV±¡\u009d¯Z®.\u009ejM\u008bJGäó5ª\u0086/\u001d¾Hã\u0004ÑäekÂ·f\fh'@\u00adsK\f-\n¡¦\u008bò\u000e\u0089¤'\u008e£\u0018Z:ÆÀ6<\u0010\tß\u0088j;\u0019\u0089b\u0003È\u001bØ\u0016\u0000s¼¡\u0010\u008c\u00990öP\u0089\u009a\u000bê\u0080v>Çz`;\u0018Ñ\u0082T\u0098\u0094ü`ááÛ1\u007fª\nºéÊ\u001bqZJéWÜ";
int var17 = "\u0098ü·!\u0019ht\u001aÏßÍ\u0019þ~\n¦ \u0016ý\u0097 >:\u0087øZ¥m¿=rakWWþ¹1\u000e\u0090`^\fø ©\u0093óS\u0088òkk|jb\u0080\u0014\u009b\u0082´\u0099æQ\u0083Bh\u001duLÇÄ\u001b1\u0005\\T\u009d\u009cB\u0094¾\u001f\u0003\"]ù\u009b«;PU\u0080Ã\u001fl\u008d.3{R,\u008cH+é¢ çv\u009fvtt7\u0089\u0016Å\u0005ÛP]ì\u009e__\u007fª4Ýg&\u0014àú|\u0086nN\u0012B]\u009e¸\u000b\u001c\u0000 \u0016þ{\u00066\u0095×°Ña\u009cp\u0096Q1\u007fã\u0003ë\u001b\u001e¦E\u0007\\e\u0013\u0001\u0017ä_ý\u0010D}\u001cy½\u0090Y\u0087©Uò>þ\u00adÈ\f\\¤Î\u0013 ïB\u0097\u0013Cò^«\u008e5Ø±·÷(V\u0081ãA9÷iKvs\u0096´fá\u009b[æ\u008c\u009a\\ÜS0ÑnÙ3\u00146·U1\u0018\u0003\u0099\u0014\u001bÜ\u0088\bÊÚ\u007f\u0086\u0017\u0003g\u0095¬®bißwÿØ¸\u0016\rà\n\u008bV±¡\u009d¯Z®.\u009ejM\u008bJGäó5ª\u0086/\u001d¾Hã\u0004ÑäekÂ·f\fh'@\u00adsK\f-\n¡¦\u008bò\u000e\u0089¤'\u008e£\u0018Z:ÆÀ6<\u0010\tß\u0088j;\u0019\u0089b\u0003È\u001bØ\u0016\u0000s¼¡\u0010\u008c\u00990öP\u0089\u009a\u000bê\u0080v>Çz`;\u0018Ñ\u0082T\u0098\u0094ü`ááÛ1\u007fª\nºéÊ\u001bqZJéWÜ"
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
c = new String[9];
h = new HashMap(13);
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
String var4 = "\u00064÷;¶Q×\u001a\u0002b\u007fùhlì×";
int var5 = "\u00064÷;¶Q×\u001a\u0002b\u007fùhlì×".length();
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
g = new Integer[4];
W = new ye(null);
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "Eâ(Õ_\u008b\u0097\u008b¢\u0090©ü\u0011Á\u00ad\u0087";
var5 = "Eâ(Õ_\u008b\u0097\u008b¢\u0090©ü\u0011Á\u00ad\u0087".length();
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

var15 = "^{Ã\u0089ÆD\u009cQ¶\u008d¦Z5æÁ¯\u00106S\u0000\u0017Ô\u0012Éx\u001b\u001d×\u0017\u008c¿\u0095b";
var17 = "^{Ã\u0089ÆD\u009cQ¶\u008d¦Z5æÁ¯\u00106S\u0000\u0017Ô\u0012Éx\u001b\u001d×\u0017\u008c¿\u0095b".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void i(boolean var0) {
w = var0;
}

public static boolean i() {
return w;
}

public static boolean O() {
boolean var0 = i();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8524;
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
throw new RuntimeException("su/catlean/_w", var10);
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
throw new RuntimeException("su/catlean/_w" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 10480;
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
throw new RuntimeException("su/catlean/_w", var14);
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
throw new RuntimeException("su/catlean/_w" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
