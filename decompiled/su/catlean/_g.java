package su.catlean;

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
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.gofra.Gofra;
import su.catlean.interfaces.IEntity;

public abstract class _g implements jk, ap {
@NotNull
private final String H;
@NotNull
private final fu Z;
@NotNull
private final List R;
@NotNull
private final List s;
@NotNull
private final List M;
@NotNull
private final String r;
@NotNull
private final cq p;
@NotNull
private final av q;
private static _g[] v;
private static final long bb = yz.a(-3043674970192207614L, 1371597856073184348L, MethodHandles.lookup().lookupClass()).a(107184716577853L);
private static final String[] cb;
private static final String[] db;
private static final Map eb = new HashMap(13);
private static final long[] ib;
private static final Integer[] jb;
private static final Map kb;

public _g(@NotNull String id, long a, @NotNull fu category, @NotNull List aliases) {
a = bb ^ a;
long var6 = a ^ 119437514563623L;
long var8 = a ^ 62608796779541L;
long var10001 = a ^ 32769231775494L;
int var10 = (int)((a ^ 32769231775494L) >>> 32);
int var11 = (int)((a ^ 32769231775494L) << 32 >>> 48);
int var12 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(id, a<"f">(26850, 7874318847389266284L ^ a));
Intrinsics.checkNotNullParameter(category, a<"f">(18336, 8451860733007617576L ^ a));
Intrinsics.checkNotNullParameter(aliases, a<"f">(21723, 8078078660199664971L ^ a));
super();
this.H = id;
this.Z = category;
this.R = aliases;
this.s = new ArrayList();
this.M = new ArrayList();
StringBuilder var13 = new StringBuilder();
StringBuilder var14 = var13;
boolean var15 = false;
CharSequence var10000 = this.H;
String[] var16 = new String[]{"-"};
Iterable var31 = StringsKt.split$default(var10000, var16, false, 0, d<"v">(13164, 5690313289011426838L ^ a), null);
boolean var17 = false;
Iterator var18 = var31.iterator();

while (true) {
if (var18.hasNext()) {
Object var19 = var18.next();
String var20 = (String)var19;
boolean var21 = false;
if (a <= 0L) {
break;
}

StringBuilder var33 = var14;
String var22 = var20;

label35: {
try {
var36 = var22.length();
if (a <= 0L) {
break label35;
}

if (var36 > 0) {
var36 = 1;
break label35;
}
} catch (NumberFormatException var29) {
throw vm.a<"Å">(var29, -6476640538427572586L, a);
}

var36 = 0;
}

String var39;
if (var36 != 0) {
StringBuilder var37 = new StringBuilder();
char var23 = var20.charAt(0);
StringBuilder var24 = var37;
byte var26 = 0;
String var34 = String.valueOf(var23);
Intrinsics.checkNotNull(var34, a<"f">(8281, 7262973738327128533L ^ a));
String var35 = var34.toUpperCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var35, a<"f">(30683, 4532062152693673567L ^ a));
CharSequence var27 = var35;
var33 = var14;
StringBuilder var38 = var24.append((Object)var27);
var26 = 1;
String var10002 = var20.substring(var26);
Intrinsics.checkNotNullExpressionValue(var10002, a<"f">(835, 2528192225764317890L ^ a));
var39 = var38.append(var10002).toString();
} else {
var39 = var20;
}

var33.append(var39);
var14.append((char)d<"v">(20167, 5186816363139468220L ^ a));
StringsKt.trim(var14);
if (a > 0L) {
continue;
}
}

this.r = var13.toString();
this.p = yp.t(this, a<"f">(21926, 8722913648553184294L ^ a), false, var6, null, null, d<"v">(9649, 8007387023069438159L ^ a), null);
this.q = yp.J(
this,
a<"f">(4776, 575135541123451695L ^ a),
new lj(0, false, var8, false, d<"v">(819, 4089533100683970127L ^ a), null),
null,
var10,
null,
var11,
(char)var12,
d<"v">(8562, 5200149805851763723L ^ a),
null
);
break;
}
}

@NotNull
public final String U() {
return this.H;
}

@NotNull
public final fu N() {
return this.Z;
}

@NotNull
public final List y() {
return this.R;
}

@NotNull
@Override
public List c() {
return this.s;
}

@NotNull
@Override
public List u() {
return this.M;
}

@NotNull
public final String k() {
return this.r;
}

public boolean f(long var1) {
var1 = bb ^ var1;
long var3 = var1 ^ 128914247344321L;
return (Boolean)this.p.E(this, var3, Q[0]);
}

public void D(boolean <set-?>, long a) {
a = bb ^ a;
long var4 = a ^ 118458727976576L;
this.p.b(this, var4, Q[0], <set-?>);
}

@NotNull
public lj m(long var1) {
var1 = bb ^ var1;
long var3 = var1 ^ 52953970470808L;
return (lj)this.q.E(this, var3, Q[1]);
}

public void N(@NotNull lj <set-?>, long a) {
a = bb ^ a;
long var4 = a ^ 72853237704863L;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(17006, 6702514856746684029L ^ a));
this.q.b(this, var4, Q[1], <set-?>);
}

public final boolean S(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_g.bb J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 117379517128771
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: lload 3
// 0f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 12: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 15: ifnull 3d
// 18: lload 3
// 19: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 1f: ifnull 3d
// 22: goto 2f
// 25: ldc2_w -152707972514290327
// 28: lload 1
// 29: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: athrow
// 2f: bipush 1
// 30: goto 3e
// 33: ldc2_w -152707972514290327
// 36: lload 1
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: bipush 0
// 3e: ireturn
}

@Override
public void J(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 67469537118988
// 05: lxor
// 06: dup2
// 07: bipush 56
// 09: lushr
// 0a: l2i
// 0b: istore 3
// 0c: dup2
// 0d: bipush 8
// 0f: lshl
// 10: bipush 8
// 12: lushr
// 13: lstore 4
// 15: pop2
// 16: dup2
// 17: ldc2_w 65469789313429
// 1a: lxor
// 1b: lstore 6
// 1d: dup2
// 1e: ldc2_w 130783482560314
// 21: lxor
// 22: lstore 8
// 24: pop2
// 25: ldc2_w -530648882990635844
// 28: lload 1
// 29: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: astore 10
// 30: aload 0
// 31: aload 10
// 33: ifnonnull 71
// 36: lload 8
// 38: invokevirtual su/catlean/_g.f (J)Z
// 3b: ifeq 63
// 3e: goto 4b
// 41: ldc2_w -441309543108615832
// 44: lload 1
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: aload 0
// 4c: lload 6
// 4e: invokevirtual su/catlean/_g.d (J)V
// 51: aload 10
// 53: ifnull 78
// 56: goto 63
// 59: ldc2_w -441309543108615832
// 5c: lload 1
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: aload 0
// 64: goto 71
// 67: ldc2_w -441309543108615832
// 6a: lload 1
// 6b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70: athrow
// 71: iload 3
// 72: i2b
// 73: lload 4
// 75: invokevirtual su/catlean/_g.o (BJ)V
// 78: return
}

@Override
public void o(byte var1, long var2) {
long var4 = (long)var1 << 56 | var2 << 8 >>> 8;
long var6 = var4 ^ 106488220257691L;
long var10001 = var4 ^ 39325524053189L;
int var8 = (int)((var4 ^ 39325524053189L) >>> 32);
int var9 = (int)((var4 ^ 39325524053189L) << 32 >>> 40);
int var10 = (int)(var10001 << 56 >>> 56);
long var11 = var4 ^ 23933300365065L;
long var13 = var4 ^ 81931170417796L;
this.D(true, var6);
Gofra.INSTANCE.unplug(this);
Gofra.INSTANCE.plug(this);
this.O(var11);
sg.J(
var8,
sg.H,
this.r,
o2.f(this, a<"f">(112, 8599995219845205255L ^ var4), new Object[0], true, var13),
var9,
(byte)var10,
1,
ys.ENABLED,
null,
d<"v">(31161, 5824726422589335603L ^ var4),
null
);
}

public final void F(@NotNull String message, long a) {
a = bb ^ a;
long var4 = a ^ 10100720735646L;
long var6 = a ^ 1651841063680L;
Intrinsics.checkNotNullParameter(message, a<"f">(23736, 4000527845647439966L ^ a));
this.d(var6);
o2.S(this, message, false, 2, null, var4);
}

@Override
public void d(long var1) {
long var3 = var1 ^ 112210832039682L;
long var10001 = var1 ^ 40765843988060L;
int var5 = (int)((var1 ^ 40765843988060L) >>> 32);
int var6 = (int)((var1 ^ 40765843988060L) << 32 >>> 40);
int var7 = (int)(var10001 << 56 >>> 56);
long var8 = var1 ^ 57994491392730L;
long var10 = var1 ^ 83922319646237L;
this.D(false, var3);
Gofra.INSTANCE.unplug(this);
this.b(var8);
sg.J(
var5,
sg.H,
this.r,
o2.f(this, a<"f">(6082, 1027342145644513318L ^ var1), new Object[0], true, var10),
var6,
(byte)var7,
1,
ys.DISABLED,
null,
d<"v">(2105, 4591448349418162991L ^ var1),
null
);
}

public void O(long var1) {
}

public void b(long var1) {
}

@NotNull
public final class_243 J(byte a, long a, @NotNull class_1297 $this$pos) {
long var5 = ((long)a << 56 | ax << 8 >>> 8) ^ bb;
Intrinsics.checkNotNullParameter($this$pos, a<"f">(22417, 2317743060261917053L ^ var5));
class_243 var10000 = ((IEntity)$this$pos).catLean$getPosition();
Intrinsics.checkNotNullExpressionValue(var10000, a<"f">(8148, 4989746937950542128L ^ var5));
return var10000;
}

static {
long var20 = bb ^ 115016563258759L;
vm.a<"Å">(null, 2185570875078087785L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[18];
int var16 = 0;
String var15 = "H<µ'Îð\u0097\u000b]¥aù\u009bnÍ² P«\u008a\u001e\u0005x\n\u0095ç\u001dºlÜ\u007f\bH\u0014kä\u00ad\u0097Õê\u001f\u0007\u0083§/*&ëR\u0018\u001e\u0019¢P(M8©\u0088)\u0004|m}qv¨fS\u0085À,`\u000e\u0010_{K\t«+É}VË5cÆÆ\u0091!(h,Dÿ>#ìy\u0006áZÙ)åÐ¸R\n:ZÝµý¯½-áJhÀ\u0012Næè¤©j·\u0011ð\u0010k\u0097\u0006ª\u0013ÒÙ´¾¬¯ÌXR4Ý\u0010Ç¡\u001c\u009fè¹h%2jMÎ9eb{\u0010 ·\u00066º_Ü'´ÉJÕ\u0018,]ó ÈÙ±\u0013ù|Ð-H>GC\u0018±Å\u0085\u001c±!YIqJpVÐü\u001fV\u008a¬Ô\u0010¶\u001d\u007f\u008fZ\u0019\u001a/ \u0019\u0017¤m\u000b\u0081!8Ð¿û\u0011jk\u0005<!-f2Ä\u0002øx\u0010\u009aÏÁÁ\u00198)smòÁ]±æVÂ\u0005Óð½\u0006#\u001a<\u008b°ýc\u0086<ôÉ3@ñ\nJ_ä8é\u0086xU½6û\u001a¥\u0087ÌI\u001e/l\u001a×TC\u009b)\u0015\u0087\u0005ÿ\u0096rùQx\u0084H\u0001\u0007Ï\u0090ü¡òSLª³µjj\u008a^Í\u001b¬ec¶\u0015æXÂåYi\u0082¢Anr\u0080J\u0002\u0088ý\u009aµ\\\u0004:\f\u001bÏ«\u0085\u009cF}ûÉ18?%\u0081PcvO¸CPÊfwG\u009a´«\u0005ï0\u001aò)\u0017E\u0085oÊJ+ÐP\u001dqÂ¿BñìÀSçØ-èû\u0089É\u0089\u0088¡ÞWç¬(q\u0010õ¬AÖ\u0007Yf\u000bR Ô\u001b0Ä¥ð\u0010¨óØa\u0080\u001cT4©\u0094üx\u0089ÿ\u001f\u008b\u0010\u0083Éðt\u0088Ó¼\u001dq\u0099YR!JK\u0085";
int var17 = "H<µ'Îð\u0097\u000b]¥aù\u009bnÍ² P«\u008a\u001e\u0005x\n\u0095ç\u001dºlÜ\u007f\bH\u0014kä\u00ad\u0097Õê\u001f\u0007\u0083§/*&ëR\u0018\u001e\u0019¢P(M8©\u0088)\u0004|m}qv¨fS\u0085À,`\u000e\u0010_{K\t«+É}VË5cÆÆ\u0091!(h,Dÿ>#ìy\u0006áZÙ)åÐ¸R\n:ZÝµý¯½-áJhÀ\u0012Næè¤©j·\u0011ð\u0010k\u0097\u0006ª\u0013ÒÙ´¾¬¯ÌXR4Ý\u0010Ç¡\u001c\u009fè¹h%2jMÎ9eb{\u0010 ·\u00066º_Ü'´ÉJÕ\u0018,]ó ÈÙ±\u0013ù|Ð-H>GC\u0018±Å\u0085\u001c±!YIqJpVÐü\u001fV\u008a¬Ô\u0010¶\u001d\u007f\u008fZ\u0019\u001a/ \u0019\u0017¤m\u000b\u0081!8Ð¿û\u0011jk\u0005<!-f2Ä\u0002øx\u0010\u009aÏÁÁ\u00198)smòÁ]±æVÂ\u0005Óð½\u0006#\u001a<\u008b°ýc\u0086<ôÉ3@ñ\nJ_ä8é\u0086xU½6û\u001a¥\u0087ÌI\u001e/l\u001a×TC\u009b)\u0015\u0087\u0005ÿ\u0096rùQx\u0084H\u0001\u0007Ï\u0090ü¡òSLª³µjj\u008a^Í\u001b¬ec¶\u0015æXÂåYi\u0082¢Anr\u0080J\u0002\u0088ý\u009aµ\\\u0004:\f\u001bÏ«\u0085\u009cF}ûÉ18?%\u0081PcvO¸CPÊfwG\u009a´«\u0005ï0\u001aò)\u0017E\u0085oÊJ+ÐP\u001dqÂ¿BñìÀSçØ-èû\u0089É\u0089\u0088¡ÞWç¬(q\u0010õ¬AÖ\u0007Yf\u000bR Ô\u001b0Ä¥ð\u0010¨óØa\u0080\u001cT4©\u0094üx\u0089ÿ\u001f\u008b\u0010\u0083Éðt\u0088Ó¼\u001dq\u0099YR!JK\u0085"
.length();
char var14 = 16;
int var25 = -1;

label54:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var37;
if ((var25 += var14) >= var17) {
cb = var18;
db = new String[18];
kb = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = "¸kb \u0084Ðé®¨\u0012-K\u008e!\u008eîûjq\u008c\u0082)¨i-3\n&\u0083µ\u001e\u009fNãàîãËÍ\"";
int var5 = "¸kb \u0084Ðé®¨\u0012-K\u008e!\u008eîûjq\u008c\u0082)¨i-3\n&\u0083µ\u001e\u009fNãàîãËÍ\"".length();
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
ib = var6;
jb = new Integer[7];
KProperty[] var22 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_g.class, a<"f">(15224, 561622115098434423L ^ var20), a<"f">(12178, 1872429915383664534L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_g.class, a<"f">(1161, 3947316920325645449L ^ var20), a<"f">(8099, 8941560251010465711L ^ var20), 0)
)
};
Q = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "¦à¿Ø\u0094¬\u0082FEB½3Aç÷\u0015";
var5 = "¦à¿Ø\u0094¬\u0082FEB½3Aç÷\u0015".length();
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

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var37;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "\u008f3\u0005m\u0010ô¬ï²%\u009e\u008e\u0084M\u0007\u009c\u0010\u000ep\u0012Õ¬T·µ\u0011\bY+üSk\u0012";
var17 = "\u008f3\u0005m\u0010ô¬ï²%\u009e\u008e\u0084M\u0007\u009c\u0010\u000ep\u0012Õ¬T·µ\u0011\bY+üSk\u0012".length();
var14 = 16;
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

public static void c(_g[] var0) {
v = var0;
}

public static _g[] X() {
return v;
}

private static NumberFormatException b(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16245;
if (db[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])eb.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
eb.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_g", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = cb[var5].getBytes("ISO-8859-1");
db[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return db[var5];
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
throw new RuntimeException("su/catlean/_g" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25485;
if (jb[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = ib[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])kb.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
kb.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_g", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
jb[var3] = var15;
}

return jb[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/_g" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
