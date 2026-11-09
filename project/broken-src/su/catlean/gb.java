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
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gb {
@NotNull
private final class_1792 m;
private final int h;
@NotNull
private final fd E;
private boolean J;
private static final long a = yz.a(-2730729274920635671L, 7139244234669377216L, MethodHandles.lookup().lookupClass()).a(265283085774707L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long i;

public gb(long a, @NotNull class_1792 instance, int endTick, @NotNull fd animation, boolean removing) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(instance, a<"h">(16642, 1173029385675023401L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"h">(16731, 7191528307382264949L ^ ax));
super();
this.m = instance;
this.h = endTick;
this.E = animation;
this.J = removing;
}

@NotNull
public final class_1792 m() {
return this.m;
}

public final int P() {
return this.h;
}

@NotNull
public final fd v() {
return this.E;
}

public final boolean q() {
return this.J;
}

public final void X(boolean <set-?>) {
this.J = <set-?>;
}

@NotNull
public final class_1792 F() {
return this.m;
}

public final int l() {
return this.h;
}

@NotNull
public final fd x() {
return this.E;
}

public final boolean G() {
return this.J;
}

@NotNull
public final gb Z(@NotNull class_1792 instance, int endTick, @NotNull fd animation, long a, boolean removing) {
ax = a ^ ax;
long var7 = ax ^ 136516733522074L;
Intrinsics.checkNotNullParameter(instance, a<"h">(30222, 85827182773934464L ^ ax));
Intrinsics.checkNotNullParameter(animation, a<"h">(5295, 8888921974869293859L ^ ax));
return new gb(var7, instance, endTick, animation, removing);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 131888228844768L;
boolean var3 = this.J;
fd var4 = this.E;
int var5 = this.h;
class_1792 var6 = this.m;
return a<"h">(24380, 7535814798012977779L ^ var1)
+ var6
+ a<"h">(26506, 140834861661301447L ^ var1)
+ var5
+ a<"h">(10713, 565241336544879765L ^ var1)
+ var4
+ a<"h">(31144, 2534182762727453921L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 138590777191467L;
int var3 = this.m.hashCode();
var3 = var3 * b<"v">(22775, 3170427858401449931L ^ var1) + Integer.hashCode(this.h);
var3 = var3 * b<"v">(13185, 8172147942253247678L ^ var1) + this.E.hashCode();
return var3 * b<"v">(13185, 8172147942253247678L ^ var1) + Boolean.hashCode(this.J);
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
// 000: getstatic su/catlean/gb.a J
// 003: ldc2_w 69649419381220
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -977301311016817698
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: istore 4
// 013: aload 0
// 014: iload 4
// 016: ifne 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -1005722368868158847
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -1005722368868158847
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: iload 4
// 039: ifne 05c
// 03c: instanceof su/catlean/gb
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -1005722368868158847
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -1005722368868158847
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/gb
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/gb.m Lnet/minecraft/class_1792;
// 065: aload 5
// 067: getfield su/catlean/gb.m Lnet/minecraft/class_1792;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: iload 4
// 06f: ifne 092
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -1005722368868158847
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -1005722368868158847
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/gb.h I
// 092: iload 4
// 094: ifne 0c4
// 097: aload 5
// 099: getfield su/catlean/gb.h I
// 09c: if_icmpeq 0b8
// 09f: goto 0ac
// 0a2: ldc2_w -1005722368868158847
// 0a5: lload 2
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: bipush 0
// 0ad: ireturn
// 0ae: ldc2_w -1005722368868158847
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: getfield su/catlean/gb.E Lsu/catlean/fd;
// 0bc: aload 5
// 0be: getfield su/catlean/gb.E Lsu/catlean/fd;
// 0c1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c4: iload 4
// 0c6: ifne 0e9
// 0c9: ifne 0e5
// 0cc: goto 0d9
// 0cf: ldc2_w -1005722368868158847
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: ireturn
// 0db: ldc2_w -1005722368868158847
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: aload 0
// 0e6: getfield su/catlean/gb.J Z
// 0e9: iload 4
// 0eb: ifne 110
// 0ee: aload 5
// 0f0: getfield su/catlean/gb.J Z
// 0f3: if_icmpeq 10f
// 0f6: goto 103
// 0f9: ldc2_w -1005722368868158847
// 0fc: lload 2
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: bipush 0
// 104: ireturn
// 105: ldc2_w -1005722368868158847
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: bipush 1
// 110: ireturn
}

static {
long var16 = a ^ 104925830174350L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[8];
int var23 = 0;
String var22 = "æ\u0013\u008fæu\\,¸G\t\u001a\u000bºHã/n¶Zz\u000bÈ\u0084Ã\u000e\f\u000fÏ£ï¿þ\u0018u«\u0015c¡j\u009bO·¾ÊÓZ!\u0099\b,\u00964Üæò\bÂ ¢YHw\u0085\u0095ñSÜla8\u0018\u0091o=âD\u0019Ç#µ4ï\u0084â\u0093\u0096âÊ\u0083¨ ~u§·\u00035±LxÓ\u0003*\u0092\\I*9>\u000f\u0083¬èh6i\u0083¹7Á\u000e\u0017a \u00044á\nÜëÊ\u0006\u0091\u0019\u0012+g\"OLN#\u000fy\tah\u001eù\u0081Gôk^\u001a\u0097 È_Û\u000fÒ#Ï\u0000ÁÍ\b\u0001\u000e\u007fïQ\"\u0003¤\u0083ÑÜü\u0000DS}¬\u00876Øþ";
int var24 = "æ\u0013\u008fæu\\,¸G\t\u001a\u000bºHã/n¶Zz\u000bÈ\u0084Ã\u000e\f\u000fÏ£ï¿þ\u0018u«\u0015c¡j\u009bO·¾ÊÓZ!\u0099\b,\u00964Üæò\bÂ ¢YHw\u0085\u0095ñSÜla8\u0018\u0091o=âD\u0019Ç#µ4ï\u0084â\u0093\u0096âÊ\u0083¨ ~u§·\u00035±LxÓ\u0003*\u0092\\I*9>\u000f\u0083¬èh6i\u0083¹7Á\u000e\u0017a \u00044á\nÜëÊ\u0006\u0091\u0019\u0012+g\"OLN#\u000fy\tah\u001eù\u0081Gôk^\u001a\u0097 È_Û\u000fÒ#Ï\u0000ÁÍ\b\u0001\u000e\u007fïQ\"\u0003¤\u0083ÑÜü\u0000DS}¬\u00876Øþ"
.length();
char var21 = ' ';
int var29 = -1;

label64:
while (true) {
String var30 = var22.substring(++var29, var29 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var43;
if ((var29 += var21) >= var24) {
b = var25;
c = new String[8];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[4];
int var8 = 0;
String var9 = "\u008a)li\u00991§TË\u008aX0\u0099ãá5";
int var10 = "\u008a)li\u00991§TË\u008aX0\u0099ãá5".length();
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
f = new Integer[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 335743230977470969L;
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
i = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "¡Ð98ð\u0098\"«aìjñ¨õ©Þ";
var10 = "¡Ð98ð\u0098\"«aìjñ¨õ©Þ".length();
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

var21 = var22.charAt(var29);
break;
default:
var25[var23++] = var43;
if ((var29 += var21) < var24) {
var21 = var22.charAt(var29);
continue label64;
}

var22 = "\u000bü\u0086J\u0012¡\u0006\fÑ\u0089Ã©ÌêÈ\u0012\u008cb+hñK®å5ê!ã\"µAÕlÈöÒ¡µ\u001f\f\u008fË_\u0015§X\u0002\u0000 ÆW/sÈÌôý\u0098µ\fYüçU\u008déG)É\u0017Î#$Ô\u0006úW\u001ep8\u009a";
var24 = "\u000bü\u0086J\u0012¡\u0006\fÑ\u0089Ã©ÌêÈ\u0012\u008cb+hñK®å5ê!ã\"µAÕlÈöÒ¡µ\u001f\f\u008fË_\u0015§X\u0002\u0000 ÆW/sÈÌôý\u0098µ\fYüçU\u008déG)É\u0017Î#$Ô\u0006úW\u001ep8\u009a"
.length();
var21 = '0';
var29 = -1;
}

var30 = var22.substring(++var29, var29 + var21);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21394;
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
throw new RuntimeException("su/catlean/gb", var10);
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
throw new RuntimeException("su/catlean/gb" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31023;
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
throw new RuntimeException("su/catlean/gb", var14);
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
throw new RuntimeException("su/catlean/gb" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
