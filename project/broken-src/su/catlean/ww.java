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
import org.jetbrains.annotations.Nullable;

public final class ww {
@NotNull
private final String p;
@NotNull
private final String O;
@NotNull
private final String H;
@NotNull
private final fd i;
private boolean S;
private static boolean T;
private static final long a = yz.a(-3260252303748805447L, 557024287957997026L, MethodHandles.lookup().lookupClass()).a(35173398691507L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long h;

public ww(@NotNull String name, long a, @NotNull String bind, @NotNull String extra, @NotNull fd animation, boolean removing) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(name, a<"c">(2930, 8862797026066987976L ^ ax));
Intrinsics.checkNotNullParameter(bind, a<"c">(3133, 1642612185752403085L ^ ax));
Intrinsics.checkNotNullParameter(extra, a<"c">(4631, 4201208221030015653L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"c">(1730, 8484897240503776883L ^ ax));
super();
this.p = name;
this.O = bind;
this.H = extra;
this.i = animation;
this.S = removing;
}

@NotNull
public final String y() {
return this.p;
}

@NotNull
public final String w() {
return this.O;
}

@NotNull
public final String f() {
return this.H;
}

@NotNull
public final fd l() {
return this.i;
}

public final boolean Y() {
return this.S;
}

public final void W(boolean <set-?>) {
this.S = <set-?>;
}

@NotNull
public final String F() {
return this.p;
}

@NotNull
public final String x() {
return this.O;
}

@NotNull
public final String U() {
return this.H;
}

@NotNull
public final fd i() {
return this.i;
}

public final boolean M() {
return this.S;
}

@NotNull
public final ww u(@NotNull String name, @NotNull String bind, @NotNull String extra, @NotNull fd animation, long a, boolean removing) {
ax = a ^ ax;
long var8 = ax ^ 22226632984516L;
Intrinsics.checkNotNullParameter(name, a<"c">(19101, 5577767565389115192L ^ ax));
Intrinsics.checkNotNullParameter(bind, a<"c">(8524, 2697148592083879138L ^ ax));
Intrinsics.checkNotNullParameter(extra, a<"c">(30166, 2168519950144639094L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"c">(19021, 9080411106108452833L ^ ax));
return new ww(name, var8, bind, extra, animation, removing);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 84749844569139L;
boolean var3 = this.S;
fd var4 = this.i;
String var5 = this.H;
String var6 = this.O;
String var7 = this.p;
return a<"c">(1702, 1622520407001167773L ^ var1)
+ var7
+ a<"c">(27776, 4669613519918702008L ^ var1)
+ var6
+ a<"c">(24979, 8854379666422632618L ^ var1)
+ var5
+ a<"c">(11026, 1857505720715762220L ^ var1)
+ var4
+ a<"c">(9272, 6046360512174609668L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 128400374495933L;
int var3 = this.p.hashCode();
var3 = var3 * b<"j">(25722, 3213479931704286176L ^ var1) + this.O.hashCode();
var3 = var3 * b<"j">(25320, 6112127980716006773L ^ var1) + this.H.hashCode();
var3 = var3 * b<"j">(25320, 6112127980716006773L ^ var1) + this.i.hashCode();
return var3 * b<"j">(25320, 6112127980716006773L ^ var1) + Boolean.hashCode(this.S);
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
// 000: getstatic su/catlean/ww.a J
// 003: ldc2_w 69819741027131
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 7519879960499905320
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: istore 4
// 013: aload 0
// 014: iload 4
// 016: ifeq 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 7525679321445851922
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 7525679321445851922
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: iload 4
// 039: ifeq 05c
// 03c: instanceof su/catlean/ww
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 7525679321445851922
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 7525679321445851922
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/ww
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/ww.p Ljava/lang/String;
// 065: aload 5
// 067: getfield su/catlean/ww.p Ljava/lang/String;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: iload 4
// 06f: ifeq 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w 7525679321445851922
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 7525679321445851922
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/ww.O Ljava/lang/String;
// 092: aload 5
// 094: getfield su/catlean/ww.O Ljava/lang/String;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: iload 4
// 09c: ifeq 0c7
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 7525679321445851922
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 7525679321445851922
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/ww.H Ljava/lang/String;
// 0bf: aload 5
// 0c1: getfield su/catlean/ww.H Ljava/lang/String;
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c7: iload 4
// 0c9: ifeq 0f4
// 0cc: ifne 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 7525679321445851922
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 7525679321445851922
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/ww.i Lsu/catlean/fd;
// 0ec: aload 5
// 0ee: getfield su/catlean/ww.i Lsu/catlean/fd;
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f4: iload 4
// 0f6: ifeq 119
// 0f9: ifne 115
// 0fc: goto 109
// 0ff: ldc2_w 7525679321445851922
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 7525679321445851922
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/ww.S Z
// 119: iload 4
// 11b: ifeq 140
// 11e: aload 5
// 120: getfield su/catlean/ww.S Z
// 123: if_icmpeq 13f
// 126: goto 133
// 129: ldc2_w 7525679321445851922
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: bipush 0
// 134: ireturn
// 135: ldc2_w 7525679321445851922
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: bipush 1
// 140: ireturn
}

public static void k(boolean var0) {
T = var0;
}

public static boolean t() {
return T;
}

public static boolean u() {
boolean var0 = t();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var25 = a ^ 89947385050920L;
vm.a<"Å">(true, -1997693233933823778L, var25);
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[13];
int var21 = 0;
String var20 = "@Æ\u0084R<zÙê\u0097Á×\u009e\u001ay»X\u0018\u0088\u0019â ¡«Ô´\u008d\u0081E_þ±¿>iûø²é£$°\u0010¦õ\u008a¾ÆØo%®\u001c\u0011ï?k9£\u0018\u00952E±\u008bs§ü\u0097mr\f_\u0001ìòµµZñ_\u000eÄþ\u0018¹Ú®&´m\u008d\u001c´x¾FÌ¬`&h¾\u009c\u0090ôAÍÜ 10´P4\u001eûG\u0084Nÿ·æ\u0018ý×=÷Y«r?(\"À[\u001b\u0096Ê\u008a\u009a\u009b þ7`½\b(ºIè¦ªC/êýQÓW,Ö\u0091cö²ý\u008c\u0084v·Äßô\u0010´ÚÐ\u0095\u0017®5ý:ó^\u0099ç¯ìø\u0010\u007fÐ\u0019ÿ\u0005W\rÎAØD\u0000Îs¼µ\u0010Mÿ\u0098pëñ\bWl%n¤º%\b©\u00108ºi»ç\u009f\u009ahðãhhþ.\u008c®";
int var22 = "@Æ\u0084R<zÙê\u0097Á×\u009e\u001ay»X\u0018\u0088\u0019â ¡«Ô´\u008d\u0081E_þ±¿>iûø²é£$°\u0010¦õ\u008a¾ÆØo%®\u001c\u0011ï?k9£\u0018\u00952E±\u008bs§ü\u0097mr\f_\u0001ìòµµZñ_\u000eÄþ\u0018¹Ú®&´m\u008d\u001c´x¾FÌ¬`&h¾\u009c\u0090ôAÍÜ 10´P4\u001eûG\u0084Nÿ·æ\u0018ý×=÷Y«r?(\"À[\u001b\u0096Ê\u008a\u009a\u009b þ7`½\b(ºIè¦ªC/êýQÓW,Ö\u0091cö²ý\u008c\u0084v·Äßô\u0010´ÚÐ\u0095\u0017®5ý:ó^\u0099ç¯ìø\u0010\u007fÐ\u0019ÿ\u0005W\rÎAØD\u0000Îs¼µ\u0010Mÿ\u0098pëñ\bWl%n¤º%\b©\u00108ºi»ç\u009f\u009ahðãhhþ.\u008c®"
.length();
char var19 = 16;
int var29 = -1;

label64:
while (true) {
String var30 = var20.substring(++var29, var29 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = a(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var43;
if ((var29 += var19) >= var22) {
b = var23;
c = new String[13];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[6];
int var8 = 0;
String var9 = "Â\u000fJ\u001e\u0000)/f\u0005\u0000Í\u0000\u009eøµ1Øüx^\u0019,2¶\u001eÖp@Ã#\\`";
int var10 = "Â\u000fJ\u001e\u0000)/f\u0005\u0000Í\u0000\u009eøµ1Øüx^\u0019,2¶\u001eÖp@Ã#\\`".length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var33 = var11;
var10001 = var8++;
long var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var52 = -1;

while (true) {
long var13 = var47;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var55 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var52) {
case 0:
var33[var10001] = var55;
if (var7 >= var10) {
e = var11;
f = new Integer[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 2483559024111640800L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var50 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var41 = -1;
h = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "\u00adEòfJà\u009ayª8J\u0093· Q\u0013";
var10 = "\u00adEòfJà\u009ayª8J\u0093· Q\u0013".length();
var7 = 0;
}

byte var40 = var7;
var7 += 8;
var12 = var9.substring(var40, var7).getBytes("ISO-8859-1");
var33 = var11;
var10001 = var8++;
var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var52 = 0;
}
}
}

var19 = var20.charAt(var29);
break;
default:
var23[var21++] = var43;
if ((var29 += var19) < var22) {
var19 = var20.charAt(var29);
continue label64;
}

var20 = "\u000f\u0092\u0015@9~\u009eîæ£¢ÑÂï¿\u0087±\u009acdk¾\u0016½\r\u0019kzaò$F\u0010|H=\"Øè ÜÕÄP;&0\u0085i";
var22 = "\u000f\u0092\u0015@9~\u009eîæ£¢ÑÂï¿\u0087±\u009acdk¾\u0016½\r\u0019kzaò$F\u0010|H=\"Øè ÜÕÄP;&0\u0085i".length();
var19 = ' ';
var29 = -1;
}

var30 = var20.substring(++var29, var29 + var19);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32734;
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
throw new RuntimeException("su/catlean/ww", var10);
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
throw new RuntimeException("su/catlean/ww" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 22515;
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
throw new RuntimeException("su/catlean/ww", var14);
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
throw new RuntimeException("su/catlean/ww" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
