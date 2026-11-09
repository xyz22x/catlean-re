package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

enum cn {
@NotNull
private final Function0 N;
@NotNull
private final Function0 Z;
public static final cn FIREWORK;
public static final cn FRIEND;
public static final cn PEARL;
public static final cn XP;
public static final cn NONE;
private static final cn[] p;
private static final EnumEntries T;
private static final long a = yz.a(6600132333390343143L, -8488503337729565593L, MethodHandles.lookup().lookupClass()).a(128603587947717L);

private cn(Function0 var3, Function0 var4) {
this.N = var3;
this.Z = var4;
}

cn(Function0 var3, Function0 var4, long var5, int var7, DefaultConstructorMarker var8) {
var5 = a ^ var5;
if ((var7 & 2) != 0) {
var4 = cn::a;
}

this(var3, var4);
}

@NotNull
public final Function0 b() {
return this.N;
}

@NotNull
public final Function0 I() {
return this.Z;
}

@NotNull
public static EnumEntries Z() {
return T;
}

private static final Unit a() {
return Unit.INSTANCE;
}

private static final Unit R() {
long var0 = a ^ 108325993465867L;
long var10001 = var0 ^ 5594905191204L;
int var2 = (int)((var0 ^ 5594905191204L) >>> 32);
int var3 = (int)((var0 ^ 5594905191204L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);
q5.Z(var2, q5.E, (short)var3, var4);
return Unit.INSTANCE;
}

private static final Unit p() {
long var0 = a ^ 16195693038981L;
long var10001 = var0 ^ 66809622305950L;
int var2 = (int)((var0 ^ 66809622305950L) >>> 32);
int var3 = (int)((var0 ^ 66809622305950L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);
q5.a(var2, (char)var3, var4, q5.E);
return Unit.INSTANCE;
}

private static final Unit A() {
long var0 = a ^ 49518891935974L;
long var10001 = var0 ^ 123972177184403L;
int var2 = (int)((var0 ^ 123972177184403L) >>> 32);
int var3 = (int)((var0 ^ 123972177184403L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);
long var5 = var0 ^ 11824978638420L;
int var8 = vm.a<"Å">(7055816463354122905L, var0);
q5 var10000 = q5.E;
if (var8 != 0) {
q5 var7 = q5.E;

try {
if (q5.q(var2, (char)var3, var4, var7)) {
return Unit.INSTANCE;
}

var10000 = q5.E;
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 6971501159314684316L, var0);
}
}

q5.g(var10000, var5);
return Unit.INSTANCE;
}

private static final Unit c() {
long var0 = a ^ 53639518175631L;
long var10001 = var0 ^ 119854989225978L;
int var2 = (int)((var0 ^ 119854989225978L) >>> 32);
int var3 = (int)((var0 ^ 119854989225978L) << 32 >>> 48);
int var4 = (int)(var10001 << 48 >>> 48);
long var5 = var0 ^ 25290247855933L;
int var8 = vm.a<"Å">(-8610224490941989904L, var0);
q5 var10000 = q5.E;
if (var8 != 0) {
q5 var7 = q5.E;

try {
if (!q5.q(var2, (char)var3, var4, var7)) {
return Unit.INSTANCE;
}

var10000 = q5.E;
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -8514439240510664459L, var0);
}
}

q5.g(var10000, var5);
return Unit.INSTANCE;
}

private static final Unit d() {
long var0 = a ^ 67987294254988L;
long var2 = var0 ^ 104942484752174L;
q5.B(q5.E, var2);
return Unit.INSTANCE;
}

private static final Unit f() {
return Unit.INSTANCE;
}

private static final cn[] B() {
return new cn[]{FIREWORK, FRIEND, PEARL, XP, NONE};
}

static {
long var9 = a ^ 54689810113001L;
long var11 = var9 ^ 151330888774L;
Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[5];
int var6 = 0;
String var5 = "ÿw×j~\u00155Ã\u000fe\"\u0001ç¹\u009bg\bÚÂ´Ù@DÃ\u0001\bO§\u000bø\u0090º\u0015¼";
int var7 = "ÿw×j~\u00155Ã\u000fe\"\u0001ç¹\u009bg\bÚÂ´Ù@DÃ\u0001\bO§\u000bø\u0090º\u0015¼".length();
char var4 = 16;
int var14 = -1;

label28:
while (true) {
String var15 = var5.substring(++var14, var14 + var4);
byte var10001 = -1;

while (true) {
byte[] var8 = var1.doFinal(var15.getBytes("ISO-8859-1"));
String var21 = a(var8).intern();
switch (var10001) {
case 0:
var0[var6++] = var21;
if ((var14 += var4) >= var7) {
FIREWORK = new cn(cn::R, null, var11, 2, null);
FRIEND = new cn(cn::p, null, var11, 2, null);
PEARL = new cn(cn::A, cn::c);
XP = new cn(cn::d, null, var11, 2, null);
NONE = new cn(cn::f, null, var11, 2, null);
p = B();
T = EnumEntriesKt.enumEntries(p);
return;
}

var4 = var5.charAt(var14);
break;
default:
var0[var6++] = var21;
if ((var14 += var4) < var7) {
var4 = var5.charAt(var14);
continue label28;
}

var5 = "\u000eD\u008c\u001f\u009döÄb\b0hæ\u001e0y\u000e\u0081";
var7 = "\u000eD\u008c\u001f\u009döÄb\b0hæ\u001e0y\u000e\u0081".length();
var4 = '\b';
var14 = -1;
}

var15 = var5.substring(++var14, var14 + var4);
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
}
