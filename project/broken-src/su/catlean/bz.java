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
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bz {
@NotNull
private final class_1792 t;
private final boolean D;
private final boolean Y;
@NotNull
private final String m;
private static final long a = yz.a(-3736976923122249786L, 8312295258252565815L, MethodHandles.lookup().lookupClass()).a(222137449833498L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public bz(long a, @NotNull class_1792 item, boolean another, boolean enchanted, @NotNull String name, int a) {
long var8 = (axx << 32 | (long)ax << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(item, a<"h">(18339, 6690546496392044652L ^ var8));
Intrinsics.checkNotNullParameter(name, a<"h">(9829, 8578555242961289644L ^ var8));
super();
this.t = item;
this.D = another;
this.Y = enchanted;
this.m = name;
}

public bz(class_1792 var1, boolean var2, boolean var3, String var4, int var5, DefaultConstructorMarker var6, long var7) {
var7 = a ^ var7;
long var9 = (var7 ^ 104082470944402L) >>> 32;
int var11 = (int)((var7 ^ 104082470944402L) << 32 >>> 32);
if ((var5 & 2) != 0) {
var2 = false;
}

if ((var5 & 4) != 0) {
var3 = false;
}

if ((var5 & b<"j">(9488, 7673402536331362089L ^ var7)) != 0) {
var4 = "";
}

this(var9, var1, var2, var3, var4, var11);
}

@NotNull
public final class_1792 i() {
return this.t;
}

public final boolean G() {
return this.D;
}

public final boolean x() {
return this.Y;
}

@NotNull
public final String E() {
return this.m;
}

@NotNull
public final class_1792 F() {
return this.t;
}

public final boolean a() {
return this.D;
}

public final boolean N() {
return this.Y;
}

@NotNull
public final String w() {
return this.m;
}

@NotNull
public final bz A(@NotNull class_1792 item, boolean another, boolean enchanted, @NotNull String name, long a) {
ax = a ^ ax;
long var7 = (ax ^ 119881169332843L) >>> 32;
int var9 = (int)((ax ^ 119881169332843L) << 32 >>> 32);
Intrinsics.checkNotNullParameter(item, a<"h">(17914, 5215030601636465973L ^ ax));
Intrinsics.checkNotNullParameter(name, a<"h">(11231, 6648055143601185559L ^ ax));
return new bz(var7, item, another, enchanted, name, var9);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static bz R(bz var0, class_1792 var1, boolean var2, boolean var3, String var4, int var5, Object var6, long var7) {
var7 = a ^ var7;
long var9 = var7 ^ 56841473772548L;
_g[] var11 = vm.a<"Å">(-7430724463738608902L, var7);

int var10000;
label79: {
label78: {
try {
var10000 = var5 & 1;
if (var11 != null) {
break label79;
}

if (var10000 == 0) {
break label78;
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, -7438492710693760657L, var7);
}

var1 = var0.t;
}

var10000 = var5 & 2;
}

_g[] var10001;
label70: {
label69: {
label68: {
try {
var10001 = var11;
if (var7 <= 0L) {
break label70;
}

if (var11 != null) {
break label69;
}

if (var10000 == 0) {
break label68;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -7438492710693760657L, var7);
}

var2 = var0.D;
}

var10000 = var5 & 4;
}

try {
var10001 = var11;
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -7438492710693760657L, var7);
}
}

label57: {
label56: {
try {
if (var10001 != null) {
break label57;
}

if (var10000 == 0) {
break label56;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -7438492710693760657L, var7);
}

var3 = var0.Y;
}

var10000 = var5 & b<"j">(27807, 5248683165981436727L ^ var7);
}

if (var10000 != 0) {
var4 = var0.m;
}

try {
bz var18 = var0.A(var1, var2, var3, var4, var9);
var10001 = vm.a<"Å">(-7430224299516721549L, var7);
if (var7 > 0L) {
if (var10001 == null) {
return var18;
}

var10001 = new _g[5];
}

vm.a<"Å">(var10001, -7470048661362843048L, var7);
return var18;
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -7438492710693760657L, var7);
}
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 94691770617998L;
String var3 = this.m;
boolean var4 = this.Y;
boolean var5 = this.D;
class_1792 var6 = this.t;
return a<"h">(12634, 127206327055006890L ^ var1)
+ var6
+ a<"h">(22612, 8871622488002778531L ^ var1)
+ var5
+ a<"h">(29270, 4849683677125771171L ^ var1)
+ var4
+ a<"h">(19038, 1560216870149867437L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 73406361737486L;
_g[] var10000 = vm.a<"Å">(2103922158938859304L, var1);
int var4 = this.t.hashCode();
var4 = var4 * b<"j">(7992, 3385614479600491843L ^ var1) + Boolean.hashCode(this.D);
var4 = var4 * b<"j">(8448, 8494937281748050808L ^ var1) + Boolean.hashCode(this.Y);
var4 = var4 * b<"j">(8448, 8494937281748050808L ^ var1) + this.m.hashCode();
_g[] var3 = var10000;

try {
if (var3 != null) {
vm.a<"Å">(new _g[5], 2109599494084171643L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 2096226874368038077L, var1);
}
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
// 000: getstatic su/catlean/bz.a J
// 003: ldc2_w 14644910266378
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 2033073540339508780
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 2022965807015040441
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 2022965807015040441
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/bz
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 2022965807015040441
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 2022965807015040441
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/bz
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/bz.t Lnet/minecraft/class_1792;
// 065: aload 5
// 067: getfield su/catlean/bz.t Lnet/minecraft/class_1792;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnonnull 092
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w 2022965807015040441
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 2022965807015040441
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/bz.D Z
// 092: aload 5
// 094: getfield su/catlean/bz.D Z
// 097: aload 4
// 099: ifnonnull 0d3
// 09c: if_icmpeq 0b8
// 09f: goto 0ac
// 0a2: ldc2_w 2022965807015040441
// 0a5: lload 2
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: bipush 0
// 0ad: ireturn
// 0ae: ldc2_w 2022965807015040441
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: getfield su/catlean/bz.Y Z
// 0bc: aload 4
// 0be: ifnonnull 0ee
// 0c1: aload 5
// 0c3: getfield su/catlean/bz.Y Z
// 0c6: goto 0d3
// 0c9: ldc2_w 2022965807015040441
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: if_icmpeq 0e2
// 0d6: bipush 0
// 0d7: ireturn
// 0d8: ldc2_w 2022965807015040441
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: aload 0
// 0e3: getfield su/catlean/bz.m Ljava/lang/String;
// 0e6: aload 5
// 0e8: getfield su/catlean/bz.m Ljava/lang/String;
// 0eb: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ee: aload 4
// 0f0: ifnonnull 110
// 0f3: ifne 10f
// 0f6: goto 103
// 0f9: ldc2_w 2022965807015040441
// 0fc: lload 2
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: bipush 0
// 104: ireturn
// 105: ldc2_w 2022965807015040441
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: bipush 1
// 110: ireturn
}

static {
long var11 = a ^ 67298655242357L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[8];
int var18 = 0;
String var17 = "2«\u001euT±E·p¤\u0098\u009c¦n\u0089\u0089iJ\u008fTÇOùÅê¹6kÙð\u000eÜpG5ù:'NV\u0010ÕîZÎG°ô×ÔÀK\u0081v¸8\u009d\u0010@iå¤\u009f\u008e¸\u001d\u0090\u0095ûE\u0000*æ\u001f\u0010ùDùO0\u0084\u0085CÊ\u0092\u0016P\u00822I»\u0010¡\u0001m \u0092`Ù«¢ÅÃ¾÷\u009fÑØ ÛGp§\u0082U+ØÕ\u00adÆÒÍo=éRû¶\u008ck\u009c\u0018¥rÔ\u0015¦)á|ù";
int var19 = "2«\u001euT±E·p¤\u0098\u009c¦n\u0089\u0089iJ\u008fTÇOùÅê¹6kÙð\u000eÜpG5ù:'NV\u0010ÕîZÎG°ô×ÔÀK\u0081v¸8\u009d\u0010@iå¤\u009f\u008e¸\u001d\u0090\u0095ûE\u0000*æ\u001f\u0010ùDùO0\u0084\u0085CÊ\u0092\u0016P\u00822I»\u0010¡\u0001m \u0092`Ù«¢ÅÃ¾÷\u009fÑØ ÛGp§\u0082U+ØÕ\u00adÆÒÍo=éRû¶\u008ck\u009c\u0018¥rÔ\u0015¦)á|ù"
.length();
char var16 = '(';
int var24 = -1;

label54:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var36;
if ((var24 += var16) >= var19) {
b = var20;
c = new String[8];
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
String var4 = "\u0003mH\u0018¶'½Á¾\u001a´\u0084\u001fE$â";
int var5 = "\u0003mH\u0018¶'½Á¾\u001a´\u0084\u001fE$â".length();
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
e = var6;
f = new Integer[4];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "D\u0002\u0000Ô\u001c»\u0001Áõ\u001bå»ó\u009cZå";
var5 = "D\u0002\u0000Ô\u001c»\u0001Áõ\u001bå»ó\u009cZå".length();
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

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var36;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label54;
}

var17 = "\u001f \u0001\u001a\u008aè\tiB\u0000÷>.\u0092\u009dy\u0018}¼°c;áû\u007f\u0090µÌ×ô\u009f:¢\u001d\u008aPwë\u0015\u00912";
var19 = "\u001f \u0001\u001a\u008aè\tiB\u0000÷>.\u0092\u009dy\u0018}¼°c;áû\u007f\u0090µÌ×ô\u009f:¢\u001d\u008aPwë\u0015\u00912".length();
var16 = 16;
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22545;
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
throw new RuntimeException("su/catlean/bz", var10);
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
throw new RuntimeException("su/catlean/bz" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7705;
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
throw new RuntimeException("su/catlean/bz", var14);
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
throw new RuntimeException("su/catlean/bz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
