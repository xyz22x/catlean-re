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
import su.catlean.api.IPasteable;
import su.catlean.gofra.Gofra;

public final class mr {
private static final long a = yz.a(-8602483457174832485L, -907383826857794503L, MethodHandles.lookup().lookupClass()).a(4216711779853L);
private static final String b;
private static final long[] c;
private static final Integer[] d;
private static final Map e;

public static final void t(long a, @NotNull IPasteable $this$bus) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter($this$bus, b);
_g[] var10000 = vm.a<"Å">(7761979437811099041L, ax);
Gofra var10001 = Gofra.INSTANCE;
Object[] var4 = new Object[a<"f">(12086, 5240559472560509307L ^ ax)];
var4[0] = $this$bus;
var4[1] = yl.g;
var4[2] = iq.a;
var4[3] = y0.c;
var4[4] = la.l;
var4[5] = w8.T;
var4[a<"f">(21922, 1935997396976233440L ^ ax)] = s7.r;
var4[a<"f">(3290, 6258831576435110542L ^ ax)] = nf.Z;
var4[a<"f">(6389, 1965490849334961852L ^ ax)] = _8.P;
var4[a<"f">(10369, 9030165511933695705L ^ ax)] = gg.P;
var4[a<"f">(13714, 6327177370549685213L ^ ax)] = pf.E;
var4[a<"f">(8502, 1180528765555089249L ^ ax)] = tq.I;
var4[a<"f">(18925, 6174828257181464490L ^ ax)] = sg.H;
var4[a<"f">(28889, 4439404969654668945L ^ ax)] = dm.h;
var4[a<"f">(22881, 3683969819621484351L ^ ax)] = dx.K;
var4[a<"f">(28344, 2136531727575372029L ^ ax)] = dh.S;
var4[a<"f">(13742, 400822445344852962L ^ ax)] = zg.v;
var4[a<"f">(83, 7328073275127610903L ^ ax)] = iu.W;
var4[a<"f">(6615, 9070483900744705934L ^ ax)] = jg.l;
var4[a<"f">(12545, 2670279416078864215L ^ ax)] = bo.S;
var4[a<"f">(30389, 3662904211788253435L ^ ax)] = wd.h;
var4[a<"f">(12116, 6182893364259950879L ^ ax)] = j2.X;
var4[a<"f">(22259, 6581794897443776672L ^ ax)] = gw.Y;
var4[a<"f">(18776, 2069185646594815749L ^ ax)] = nk.f;
var4[a<"f">(19661, 7309829293379875463L ^ ax)] = zw.l;
var4[a<"f">(30805, 4971121175628301846L ^ ax)] = d2.O;
var4[a<"f">(1296, 8163254483538656081L ^ ax)] = rq.G;
var4[a<"f">(21427, 5250011132318019055L ^ ax)] = lo.k;
var4[a<"f">(17793, 2463728953885162452L ^ ax)] = o8.g;
var4[a<"f">(32066, 2245680509819306754L ^ ax)] = wc.g;
var4[a<"f">(26536, 1406609064331663854L ^ ax)] = jl.y;
var4[a<"f">(4087, 3140064283512484269L ^ ax)] = zi.v;
var4[a<"f">(13329, 2575373650013325902L ^ ax)] = b6.R;
var4[a<"f">(3398, 8526790151725396765L ^ ax)] = i4.h;
var10001.plugAll(var4);
_g[] var3 = var10000;

try {
if (var3 == null) {
vm.a<"Å">(new _g[4], 7759582632539480466L, ax);
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 7750090556020686636L, ax);
}
}

static {
long var11 = a ^ 19059147357213L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var15 = var13.doFinal("kà$¾è©%Ò".getBytes("ISO-8859-1"));
String var22 = a(var15).intern();
int var10001 = -1;
b = var22;
e = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[29];
int var3 = 0;
String var4 = "$Äý±Ï8Ân¸£^ÔôÀ=kü°xûMiÉ/\u0097Z~\u0010L\bº\u0087\u0007*#>¨Us\u001e\u009aOÈ$C\u00ad[%Í9\u009d\u001a\u0084ôöj¹Üs¶Æ]ÓÀY\u0081³fíZ\u008d\u009a7|¢ÓÓ~s?\u009eéY¶Vy\u001c\u0018ÔùÏ\u0093ð\"{\u0093¾\u0002Õ&á¾ô\u0018\u001c7=FÃ@b$þÅ\u0083\u0003¶ç\u0012òJ\u001c°\u008a>t\u0006w\u0014\u0090\u001aùÃ9þ\u0091c@\tÏ;,#2VÙ6bu;ß\u0085\u0087\u0019\\8_~(ç(²[$\u000eRz\u0089$\u0094>±Õä\u0086'£É\u0083<\u0012\u0099¶\u0084ãÈëeH<áð&z\u0080¾ C^\u0007;aì\u0099(Ê¼~$\u0080pÙ\u009fß\u0015w";
int var5 = "$Äý±Ï8Ân¸£^ÔôÀ=kü°xûMiÉ/\u0097Z~\u0010L\bº\u0087\u0007*#>¨Us\u001e\u009aOÈ$C\u00ad[%Í9\u009d\u001a\u0084ôöj¹Üs¶Æ]ÓÀY\u0081³fíZ\u008d\u009a7|¢ÓÓ~s?\u009eéY¶Vy\u001c\u0018ÔùÏ\u0093ð\"{\u0093¾\u0002Õ&á¾ô\u0018\u001c7=FÃ@b$þÅ\u0083\u0003¶ç\u0012òJ\u001c°\u008a>t\u0006w\u0014\u0090\u001aùÃ9þ\u0091c@\tÏ;,#2VÙ6bu;ß\u0085\u0087\u0019\\8_~(ç(²[$\u000eRz\u0089$\u0094>±Õä\u0086'£É\u0083<\u0012\u0099¶\u0084ãÈëeH<áð&z\u0080¾ C^\u0007;aì\u0099(Ê¼~$\u0080pÙ\u009fß\u0015w"
.length();
byte var2 = 0;

label29:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var18 = var6;
var10001 = var3++;
long var24 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var27 = -1;

while (true) {
long var8 = var24;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var29 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var27) {
case 0:
var18[var10001] = var29;
if (var2 >= var5) {
c = var6;
d = new Integer[29];
return;
}
break;
default:
var18[var10001] = var29;
if (var2 < var5) {
continue label29;
}

var4 = "\u0002óJa]\u009c;äEÍ¡,ª\u001f\u0087{";
var5 = "\u0002óJa]\u009c;äEÍ¡,ª\u001f\u0087{".length();
var2 = 0;
}

byte var21 = var2;
var2 += 8;
var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
var18 = var6;
var10001 = var3++;
var24 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var27 = 0;
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

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21703;
if (d[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = c[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])e.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/mr", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
d[var3] = var15;
}

return d[var3];
}

private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/mr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
