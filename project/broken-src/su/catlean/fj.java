package su.catlean;

import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fj {
private final char O;
private final char k;
@NotNull
private final Font L;
@NotNull
private final class_2960 P;
private final int n;
@NotNull
private final Char2ObjectArrayMap X;
private int i;
private int l;
private boolean C;
private static final long a = yz.a(-3566970759257700676L, 4329545133701635575L, MethodHandles.lookup().lookupClass()).a(258833237757873L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public fj(long a, char fromIncl, char toExcl, @NotNull Font font, @NotNull class_2960 bindToTexture, int pixelPadding) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(font, a<"y">(103, 6874975259594945696L ^ ax));
Intrinsics.checkNotNullParameter(bindToTexture, a<"y">(24956, 6938017996506142138L ^ ax));
super();
this.O = fromIncl;
this.k = toExcl;
this.L = font;
this.P = bindToTexture;
this.n = pixelPadding;
this.X = new Char2ObjectArrayMap();
}

@NotNull
public final Font E() {
return this.L;
}

@NotNull
public final class_2960 T() {
return this.P;
}

public final int V() {
return this.i;
}

public final void x(int <set-?>) {
this.i = <set-?>;
}

public final int x() {
return this.l;
}

public final void V(int <set-?>) {
this.l = <set-?>;
}

@Nullable
public final ze z(long a, char c) {
ax = a ^ ax;
long var4 = ax ^ 88116285175702L;

try {
if (!this.C) {
this.y(var4);
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -6189766425911631267L, ax);
}

return (ze)this.X.get(cx);
}

public final void q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 108290056626326L;
zf.F(var3).method_1531().method_4615(this.P);
this.X.clear();
this.i = -1;
this.l = -1;
this.C = false;
}

public final boolean U(char c, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/fj.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: aload 0
// 07: getfield su/catlean/fj.O C
// 0a: istore 4
// 0c: iload 1
// 0d: aload 0
// 0e: getfield su/catlean/fj.k C
// 11: if_icmpge 3f
// 14: iload 4
// 16: lload 2
// 17: lconst_0
// 18: lcmp
// 19: iflt 3c
// 1c: iload 1
// 1d: if_icmpgt 3b
// 20: goto 2d
// 23: ldc2_w 2188080909010425369
// 26: lload 2
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: bipush 1
// 2e: goto 40
// 31: ldc2_w 2188080909010425369
// 34: lload 2
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: bipush 0
// 3c: goto 40
// 3f: bipush 0
// 40: ireturn
}

private final Font Q(int var1, char var2, char var3, char var4) {
long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;

try {
if (this.L.canDisplay(var2)) {
return this.L;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 8067845116989941682L, var5);
}

return this.L;
}

private final void y(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 112689909838457L;
int var3 = (int)((var1 ^ 112689909838457L) >>> 32);
int var4 = (int)((var1 ^ 112689909838457L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 119070626491349L;
long var8 = var1 ^ 114927646591692L;

try {
if (this.C) {
return;
}
} catch (NumberFormatException var27) {
throw vm.a<"Å">(var27, 5803681368840935630L, var1);
}

int var10 = this.k - this.O - 1;
int var11 = (int)(Math.ceil(Math.sqrt(var10)) * 1.5);
this.X.clear();
int var12 = 0;
int var13 = 0;
int var14 = 0;
int var15 = 0;
int var16 = 0;
int var17 = 0;
int var18 = 0;
List var19 = new ArrayList();
AffineTransform var20 = new AffineTransform();
FontRenderContext var21 = new FontRenderContext(var20, true, false);

while (var12 <= var10) {
char var22 = (char)(this.O + var12);
Font var23 = this.Q(var3, var22, (char)var4, (char)var5);
Rectangle2D var24 = var23.getStringBounds(String.valueOf(var22), var21);
int var25 = (int)Math.ceil(var24.getWidth());
int var26 = (int)Math.ceil(var24.getHeight());
var12++;
var14 = (int)Math.max((double)var14, (double)(var16 + var25));
var15 = (int)Math.max((double)var15, (double)(var17 + var26));
int var10000 = var13;
int var33 = var11;
if (var1 >= 0L) {
if (var13 >= var11) {
var16 = 0;
var17 += var18 + this.n;
var13 = 0;
var18 = 0;
}

var18 = (int)Math.max((double)var18, (double)var26);
var19.add(new ze(var16, var17, var25, var26, var22, var6, this));
var10000 = var16;
var33 = var25 + this.n;
}

var16 = var10000 + var33;
var13++;
if (var1 <= 0L) {
break;
}
}

BufferedImage var29 = new BufferedImage((int)Math.max((double)(var14 + this.n), 1.0), (int)Math.max((double)(var15 + this.n), 1.0), 2);
this.i = var29.getWidth();
this.l = var29.getHeight();
Graphics2D var30 = var29.createGraphics();
var30.setColor(new Color(b<"e">(23261, 756074735804117744L ^ var1), b<"e">(9314, 5024992586265005134L ^ var1), b<"e">(9314, 5024992586265005134L ^ var1), 0));
var30.fillRect(0, 0, this.i, this.l);
var30.setColor(Color.WHITE);
var30.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
var30.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
var30.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
Iterator var31 = var19.iterator();

while (true) {
if (var31.hasNext()) {
ze var32 = (ze)var31.next();
var30.setFont(this.Q(var3, var32.z(), (char)var4, (char)var5));
var30.drawString(String.valueOf(var32.z()), var32.x(), var32.T() + var30.getFontMetrics().getAscent());
this.X.put(var32.z(), var32);
if (var1 <= 0L) {
break;
}

if (var1 >= 0L) {
continue;
}
}

jl.y.b(this.P, var8, var29);
this.C = true;
break;
}
}

static {
long var11 = a ^ 125310654996398L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[2];
int var18 = 0;
String var17 = "¿\u0083\u0098\u000bÈû\u007fÊjyÊÏ\u001dÆ¨ã1q\u0001×oè\u0007ï\u0010\u0004Ë¯7\rwtåÙÚcÑ¡\rÑ\u0089";
int var19 = "¿\u0083\u0098\u000bÈû\u007fÊjyÊÏ\u001dÆ¨ã1q\u0001×oè\u0007ï\u0010\u0004Ë¯7\rwtåÙÚcÑ¡\rÑ\u0089".length();
char var16 = 24;
int var15 = -1;

while (true) {
byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
String var27 = a(var21).intern();
int var10001 = -1;
var20[var18++] = var27;
if ((var15 += var16) >= var19) {
b = var20;
c = new String[2];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "ªfvði\u0085xÛ@¼\u008bEý\u00ad\u0016÷";
int var5 = "ªfvði\u0085xÛ@¼\u008bEý\u00ad\u0016÷".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var31 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
return;
}

var16 = var17.charAt(var15);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1130;
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
throw new RuntimeException("su/catlean/fj", var10);
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
throw new RuntimeException("su/catlean/fj" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31047;
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
throw new RuntimeException("su/catlean/fj", var14);
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
throw new RuntimeException("su/catlean/fj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
