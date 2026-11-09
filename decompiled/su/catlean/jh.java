package su.catlean;

import java.awt.Color;
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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class jh {
@NotNull
public static final jh f;
@NotNull
private static o_ H;
@NotNull
private static final fd o;
@NotNull
private static Color z;
@NotNull
private static Color O;
@NotNull
private static Color X;
@NotNull
private static Color F;
@NotNull
private static Color m;
@NotNull
private static Color V;
@NotNull
private static Color U;
@NotNull
private static Color J;
@NotNull
private static Color B;
@NotNull
private static Color Z;
@NotNull
private static Color y;
@NotNull
private static Color p;
@NotNull
private static Color K;
private static boolean b;
private static final long a = yz.a(4683321578115332826L, 3147421709212221365L, MethodHandles.lookup().lookupClass()).a(181501285391719L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private jh() {
}

@NotNull
public final Color l() {
return z;
}

public final void I(@NotNull Color <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667585266545485287L ^ ax));
z = <set-?>;
}

@NotNull
public final Color t() {
return O;
}

public final void t(@NotNull Color <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667514877008711676L ^ ax));
O = <set-?>;
}

@NotNull
public final Color H() {
return X;
}

public final void M(int a, int a, @NotNull Color <set-?>, int a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667576356378460558L ^ var5));
X = <set-?>;
}

@NotNull
public final Color g() {
return F;
}

public final void m(long a, short a, @NotNull Color <set-?>) {
long var5 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667604413493015967L ^ var5));
F = <set-?>;
}

@NotNull
public final Color T() {
return m;
}

public final void r(long a, @NotNull Color <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667612430522560133L ^ ax));
m = <set-?>;
}

@NotNull
public final Color F() {
return V;
}

public final void v(@NotNull Color <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667553753416335156L ^ ax));
V = <set-?>;
}

@NotNull
public final Color n() {
return U;
}

public final void W(@NotNull Color <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667584040308552234L ^ ax));
U = <set-?>;
}

@NotNull
public final Color r() {
return J;
}

public final void q(@NotNull Color <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(6197, 6008284147051715618L ^ ax));
J = <set-?>;
}

@NotNull
public final Color S() {
return B;
}

public final void l(long a, @NotNull Color <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667612004772942093L ^ ax));
B = <set-?>;
}

@NotNull
public final Color i() {
return Z;
}

public final void x(@NotNull Color <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667572322469978188L ^ ax));
Z = <set-?>;
}

@NotNull
public final Color j() {
return y;
}

public final void n(long a, @NotNull Color <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667531280069314776L ^ ax));
y = <set-?>;
}

@NotNull
public final Color Z() {
return p;
}

public final void c(long a, @NotNull Color <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667615921922814668L ^ ax));
p = <set-?>;
}

@NotNull
public final Color h() {
return K;
}

public final void s(long a, @NotNull Color <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"c">(16156, 5667622500112273382L ^ ax));
K = <set-?>;
}

public final void i(long a, @NotNull o_ newTheme) {
ax = a ^ ax;
long var4 = ax ^ 44548781318326L;
long var6 = ax ^ 10609431061024L;
long var8 = ax ^ 124330620419303L;
long var10 = ax ^ 108221848854096L;
Intrinsics.checkNotNullParameter(newTheme, a<"c">(18986, 5567264419521553913L ^ ax));
H = yl.g.y().k(var4);
yl.g.y().W(var10, newTheme);
yl.g.h().W(var6).H(newTheme.z(), var8);
o.P(0.0F);
}

public final void P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 63921900879941L;
long var5 = var1 ^ 112745917353932L;
long var7 = var1 ^ 25405823376741L;
o.B(var7, 1.0F);
o_ var10 = yl.g.y().k(var5);
float var11 = o.a();
O = jl.y.C(H.b(), var3, var10.b(), var11);
X = jl.y.C(H.V(), var3, var10.V(), var11);
F = jl.y.C(H.t(), var3, var10.t(), var11);
m = jl.y.C(H.X(), var3, var10.X(), var11);
V = jl.y.C(H.a(), var3, var10.a(), var11);
U = jl.y.C(H.I(), var3, var10.I(), var11);
J = jl.y.C(H.P(), var3, var10.P(), var11);
vm.a<"Å">(5627901857309353337L, var1);
B = jl.y.C(H.U(), var3, var10.U(), var11);

try {
Z = jl.y.C(H.F(), var3, var10.F(), var11);
y = jl.y.C(H.M(), var3, var10.M(), var11);
p = jl.y.C(H.Y(), var3, var10.Y(), var11);
K = jl.y.C(H.H(), var3, var10.H(), var11);
if (vm.a<"Å">(5620654305326944401L, var1) != null) {
vm.a<"Å">(new String[4], 5630264742546643639L, var1);
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 5621990737866866412L, var1);
}
}

@NotNull
public final Color Z(long a, int offset) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/jh.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 81021706965617
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 6642283305998579533
// 12: lload 1
// 13: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: invokestatic su/catlean/zf.A ()J
// 1b: l2d
// 1c: ldc2_w 14.0
// 1f: ddiv
// 20: iload 3
// 21: i2d
// 22: dadd
// 23: sipush 854
// 26: ldc2_w 3372297827563309950
// 29: lload 1
// 2a: lxor
// 2b: invokedynamic b (IJ)I bsm=su/catlean/jh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30: i2d
// 31: drem
// 32: d2i
// 33: istore 7
// 35: astore 6
// 37: iload 7
// 39: sipush 27436
// 3c: ldc2_w 9011402063515575042
// 3f: lload 1
// 40: lxor
// 41: invokedynamic b (IJ)I bsm=su/catlean/jh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: aload 6
// 48: ifnull 77
// 4b: if_icmplt 7b
// 4e: goto 5b
// 51: ldc2_w 6643127590162083032
// 54: lload 1
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: sipush 16522
// 5e: ldc2_w 3237849337479219371
// 61: lload 1
// 62: lxor
// 63: invokedynamic b (IJ)I bsm=su/catlean/jh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: iload 7
// 6a: goto 77
// 6d: ldc2_w 6643127590162083032
// 70: lload 1
// 71: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76: athrow
// 77: isub
// 78: goto 7d
// 7b: iload 7
// 7d: istore 7
// 7f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 82: getstatic su/catlean/jh.O Ljava/awt/Color;
// 85: lload 4
// 87: getstatic su/catlean/jh.X Ljava/awt/Color;
// 8a: iload 7
// 8c: i2f
// 8d: ldc 360.0
// 8f: fdiv
// 90: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 93: areturn
}

@NotNull
public final Map I(long a, @NotNull o_ theme) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(theme, a<"c">(11622, 5767836401570562094L ^ ax));
o_ var5 = theme;
boolean var6 = false;
Pair[] var7 = new Pair[b<"b">(4992, 6324461382252291194L ^ ax)];
var7[0] = TuplesKt.to(a<"c">(9475, 1962768005404313667L ^ ax), theme.b());
var7[1] = TuplesKt.to(a<"c">(9032, 98182945437208065L ^ ax), theme.V());
String[] var10000 = vm.a<"Å">(-6630032726672176994L, ax);
var7[2] = TuplesKt.to(a<"c">(15155, 53689015058519664L ^ ax), theme.t());
String[] var4 = var10000;

try {
var7[3] = TuplesKt.to(a<"c">(4629, 2942639505216438097L ^ ax), var5.X());
var7[4] = TuplesKt.to(a<"c">(25412, 1514638135780544003L ^ ax), var5.a());
var7[5] = TuplesKt.to(a<"c">(26836, 2404458464133907867L ^ ax), var5.I());
var7[b<"b">(9703, 5576793967581712921L ^ ax)] = TuplesKt.to(a<"c">(32448, 3807560425750958986L ^ ax), var5.P());
var7[b<"b">(26626, 1541650150289252346L ^ ax)] = TuplesKt.to(a<"c">(4940, 2110202620579282446L ^ ax), var5.U());
var7[b<"b">(16319, 7068499902016276550L ^ ax)] = TuplesKt.to(a<"c">(12915, 4730642153881689909L ^ ax), var5.F());
var7[b<"b">(26859, 7635182000549306135L ^ ax)] = TuplesKt.to(a<"c">(15263, 1950400206757156562L ^ ax), var5.M());
var7[b<"b">(32385, 6777936964769188222L ^ ax)] = TuplesKt.to(a<"c">(27104, 1720822241313948844L ^ ax), var5.Y());
var7[b<"b">(26508, 3170862480580579455L ^ ax)] = TuplesKt.to(a<"c">(2178, 1330931861746181577L ^ ax), var5.H());
Map var10 = MapsKt.mapOf(var7);
if (var4 == null) {
vm.a<"Å">(new _g[3], -6660398048643602004L, ax);
}

return var10;
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -6637632412559486197L, ax);
}
}

static {
long var27 = a ^ 99568535141262L;
long var29 = var27 ^ 1208025802139L;
long var31 = var27 ^ 33721431918274L;
vm.a<"Å">(true, 2635229369871675860L, var27);
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[17];
int var23 = 0;
String var22 = "\u0087â<^WE\u0083\u0005þ\u0016æE&\u0014<\u001a«5HÎ+Ë;\u0001¨\u0086tD\u0082_\u009aÖ\u0010\u0080Ó/z$cö\"GmÄT=\u009eêo ¯Í\u008d\u0004·\u0095]Í7Ê\u008f\u0013#m\u001c¡°.Ù±\u0011Í'ÀOèÔ\u0089<\u0085Åh\u0010¥ÌÈÞÑ\u0005\u008dW¯Ð\nü\u009c/\u0007´\u0010\u0096\b¸>\u009d\nhWÏm¾\u001añ\u0093¿o\u0010P\u0007M{\u0000ûlà\u0003c|¨¸|Ü \u00100\u0093\u008d}i\u00ad\u0083»}\u008fÄ6SZ*ß\u0010ªgÉ/´Ò\u0017¥[TXº\u00064=+ \u009c8qô_\u0097ÍE\u0096\b¡\u0080\u0012¦_\u0094Õ\n®´üeP\t;u¯¢\u0086\u0000õ6\u0010üsÄ³\u0002N\u0014\u0090ÚWP½SÃA-\u0018\u0092?×ÞÍ\u0097¢ÿcd\u0001h<8JRo[\u008aK\u0017&W\u0095\u0010´ \u00938\u0014²Ï× ½hÐe\u0018L^\u0010\u0019I[ ¾T2uLO\u0015Ç°\u0010ºV\u0018\u0002ò_Ù0§ß\u0099ÿ\u0086C\u0016Ä\u0098§@Ç@\u0087\u009dß\u008eë\u0000 \u00ad¬\u0011&·IÀë.o\u009d§ÁW\u008b6\u0090¸+?\u00076©\"O4óµè?¾*";
int var24 = "\u0087â<^WE\u0083\u0005þ\u0016æE&\u0014<\u001a«5HÎ+Ë;\u0001¨\u0086tD\u0082_\u009aÖ\u0010\u0080Ó/z$cö\"GmÄT=\u009eêo ¯Í\u008d\u0004·\u0095]Í7Ê\u008f\u0013#m\u001c¡°.Ù±\u0011Í'ÀOèÔ\u0089<\u0085Åh\u0010¥ÌÈÞÑ\u0005\u008dW¯Ð\nü\u009c/\u0007´\u0010\u0096\b¸>\u009d\nhWÏm¾\u001añ\u0093¿o\u0010P\u0007M{\u0000ûlà\u0003c|¨¸|Ü \u00100\u0093\u008d}i\u00ad\u0083»}\u008fÄ6SZ*ß\u0010ªgÉ/´Ò\u0017¥[TXº\u00064=+ \u009c8qô_\u0097ÍE\u0096\b¡\u0080\u0012¦_\u0094Õ\n®´üeP\t;u¯¢\u0086\u0000õ6\u0010üsÄ³\u0002N\u0014\u0090ÚWP½SÃA-\u0018\u0092?×ÞÍ\u0097¢ÿcd\u0001h<8JRo[\u008aK\u0017&W\u0095\u0010´ \u00938\u0014²Ï× ½hÐe\u0018L^\u0010\u0019I[ ¾T2uLO\u0015Ç°\u0010ºV\u0018\u0002ò_Ù0§ß\u0099ÿ\u0086C\u0016Ä\u0098§@Ç@\u0087\u009dß\u008eë\u0000 \u00ad¬\u0011&·IÀë.o\u009d§ÁW\u008b6\u0090¸+?\u00076©\"O4óµè?¾*"
.length();
char var21 = ' ';
int var35 = -1;

label64:
while (true) {
String var36 = var22.substring(++var35, var35 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var36.getBytes("ISO-8859-1"));
String var50 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var50;
if ((var35 += var21) >= var24) {
c = var25;
d = new String[17];
i = new HashMap(13);
Cipher var7;
var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var27 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var13 = new long[10];
int var10 = 0;
String var11 = "\u009e_5A9í½Ý-¼)eTÈióÌ\u001erþa\u0098×²Þ°Z²KP-¶\u009bê½¸l´{Ð²Ñ)\u007f\u0000\b\u0013\u00052<Øi\u0018k#å\u0081Uì½¡\u0019©Ó";
int var12 = "\u009e_5A9í½Ý-¼)eTÈióÌ\u001erþa\u0098×²Þ°Z²KP-¶\u009bê½¸l´{Ð²Ñ)\u007f\u0000\b\u0013\u00052<Øi\u0018k#å\u0081Uì½¡\u0019©Ó".length();
byte var9 = 0;

label46:
while (true) {
var10001 = var9;
var9 += 8;
byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
long[] var39 = var13;
var10001 = var10++;
long var54 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var59 = -1;

while (true) {
long var15 = var54;
byte[] var17 = var7.doFinal(
new byte[]{
(byte)(var15 >>> 56),
(byte)(var15 >>> 48),
(byte)(var15 >>> 40),
(byte)(var15 >>> 32),
(byte)(var15 >>> 24),
(byte)(var15 >>> 16),
(byte)(var15 >>> 8),
(byte)var15
}
);
long var62 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var59) {
case 0:
var39[var10001] = var62;
if (var9 >= var12) {
g = var13;
h = new Integer[10];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 1050226973682701719L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var57 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var48 = -1;
long var0 = var57;
f = new jh();
H = cd.C();
o = new fd(_s.OUT_EXPO, var0, var31);
Color var41 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"c">(29635, 4623798196830279986L ^ var27));
z = var41;
O = yl.g.y().k(var29).b();
X = yl.g.y().k(var29).V();
F = yl.g.y().k(var29).t();
m = yl.g.y().k(var29).X();
V = yl.g.y().k(var29).a();
U = yl.g.y().k(var29).I();
J = yl.g.y().k(var29).P();
B = yl.g.y().k(var29).U();
Z = yl.g.y().k(var29).F();
y = yl.g.y().k(var29).M();
p = yl.g.y().k(var29).Y();
K = yl.g.y().k(var29).H();
return;
}
break;
default:
var39[var10001] = var62;
if (var9 < var12) {
continue label46;
}

var11 = "ã\u009fí33ÁX\u009b\u0011[\u0087°\u0090BÏç";
var12 = "ã\u009fí33ÁX\u009b\u0011[\u0087°\u0090BÏç".length();
var9 = 0;
}

byte var47 = var9;
var9 += 8;
var14 = var11.substring(var47, var9).getBytes("ISO-8859-1");
var39 = var13;
var10001 = var10++;
var54 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var59 = 0;
}
}
}

var21 = var22.charAt(var35);
break;
default:
var25[var23++] = var50;
if ((var35 += var21) < var24) {
var21 = var22.charAt(var35);
continue label64;
}

var22 = "\n`½¶=¦\u0004¯\u0015/\u001d³\u00075û\u0094¶?\u0017øCJ<á~\u008d¨ò\u0015Óãß,\u008e«Ï´·ûæ\u0010B\u0018]\u008da^5\u009bØò\u0006Bi$\u0081\u0095";
var24 = "\n`½¶=¦\u0004¯\u0015/\u001d³\u00075û\u0094¶?\u0017øCJ<á~\u008d¨ò\u0015Óãß,\u008e«Ï´·ûæ\u0010B\u0018]\u008da^5\u009bØò\u0006Bi$\u0081\u0095".length();
var21 = '(';
var35 = -1;
}

var36 = var22.substring(++var35, var35 + var21);
var10001 = 0;
}
}
}

public static void c(boolean var0) {
b = var0;
}

public static boolean u() {
return b;
}

public static boolean Q() {
boolean var0 = u();

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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20466;
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
throw new RuntimeException("su/catlean/jh", var10);
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
throw new RuntimeException("su/catlean/jh" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21837;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/jh", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/jh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
