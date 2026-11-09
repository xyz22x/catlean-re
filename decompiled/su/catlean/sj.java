package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum sj {
@NotNull
private final gi a;
public static final sj ARROWS_1;
public static final sj ARROWS_2;
public static final sj ARROWS_3;
public static final sj ARROWS_4;
public static final sj ARROWS_5;
public static final sj LINES;
private static final sj[] B;
private static final EnumEntries g;
private static int E;
private static final long b = yz.a(-8278140984827572398L, -6535161193327663952L, MethodHandles.lookup().lookupClass()).a(162052609500082L);
private static final long c;

private sj(gi var3) {
this.a = var3;
}

@NotNull
public final gi e() {
return this.a;
}

@NotNull
public static EnumEntries s() {
return g;
}

private static final sj[] R(long var0) {
var0 = b ^ var0;
sj[] var2 = new sj[(int)c];
var2[0] = ARROWS_1;
var2[1] = ARROWS_2;
var2[2] = ARROWS_3;
var2[3] = ARROWS_4;
var2[4] = ARROWS_5;
var2[5] = LINES;
return var2;
}

static {
long var14 = b ^ 106701321027087L;
long var16 = var14 ^ 129151041704196L;
if (vm.a<"Å">(7783209657240135147L, var14) == 0) {
vm.a<"Å">(60, 7786420089978829336L, var14);
}

Cipher var6;
Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var7 = 1; var7 < 8; var7++) {
var10003[var7] = (byte)(var14 << var7 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var5 = new String[6];
int var11 = 0;
String var10 = "À;°Cbèaï¦úm6~¥\u0010²\b<\u0016\u0007\u000e@Ô\u009b¥\u0010CNò7\u0018\u0016:ÎØ>ãZ$ox\u008f\u0010\u0017ç£^\u000e\u0019ª.\u0010ÓR½\u0093×mM";
int var12 = "À;°Cbèaï¦úm6~¥\u0010²\b<\u0016\u0007\u000e@Ô\u009b¥\u0010CNò7\u0018\u0016:ÎØ>ãZ$ox\u008f\u0010\u0017ç£^\u000e\u0019ª.\u0010ÓR½\u0093×mM".length();
char var9 = 16;
int var19 = -1;

label41:
while (true) {
String var20 = var10.substring(++var19, var19 + var9);
byte var10001 = -1;

while (true) {
byte[] var13 = var6.doFinal(var20.getBytes("ISO-8859-1"));
String var28 = a(var13).intern();
switch (var10001) {
case 0:
var5[var11++] = var28;
if ((var19 += var9) >= var12) {
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -7774018427977890346L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var32 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
c = var32;
ARROWS_1 = new sj(gi.TRIANGLE1);
ARROWS_2 = new sj(gi.TRIANGLE2);
ARROWS_3 = new sj(gi.TRIANGLE3);
ARROWS_4 = new sj(gi.TRIANGLE4);
ARROWS_5 = new sj(gi.TRIANGLE5);
LINES = new sj(gi.TRIANGLE1);
B = R(var16);
g = EnumEntriesKt.enumEntries(B);
return;
}

var9 = var10.charAt(var19);
break;
default:
var5[var11++] = var28;
if ((var19 += var9) < var12) {
var9 = var10.charAt(var19);
continue label41;
}

var10 = "\u008dmXå@\u008bGÈà\u0013V\bÕ°òY\u0010ozà\u001cÑ\u0085ó\u0099\u0086}¼2\u000f!\u0092È";
var12 = "\u008dmXå@\u008bGÈà\u0013V\bÕ°òY\u0010ozà\u001cÑ\u0085ó\u0099\u0086}¼2\u000f!\u0092È".length();
var9 = 16;
var19 = -1;
}

var20 = var10.substring(++var19, var19 + var9);
var10001 = 0;
}
}
}

public static void K(int var0) {
E = var0;
}

public static int N() {
return E;
}

public static int l() {
int var0 = N();

try {
return var0 == 0 ? 94 : 0;
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
}
