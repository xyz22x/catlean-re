package su.catlean;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.ScreenEvent;
import su.catlean.gofra.Flow;

public final class i4 {
@NotNull
public static final i4 h;
@NotNull
private static of l;
private static String D;
private static final long a = yz.a(-3900286695721691597L, -7215433332401329112L, MethodHandles.lookup().lookupClass()).a(226001175792180L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

private i4() {
}

@Flow
private final void w(ScreenEvent var1) {
long var2 = a ^ 80024007182031L;
long var4 = var2 ^ 28968058167906L;
String var6 = vm.a<"Å">(-139720241072347492L, var2);
if (!Intrinsics.areEqual(zf.F(var4).field_1690.field_1883, l.i())) {
Iterable var7 = of.b();
boolean var8 = false;
Iterator var9 = var7.iterator();

Object var10000;
label34:
while (true) {
if (!var9.hasNext()) {
var10000 = null;
break;
}

Object var10 = var9.next();
var10000 = var10;

while (true) {
of var11 = (of)var10000;
boolean var12 = false;
if (!Intrinsics.areEqual(var11.i(), zf.F(var4).field_1690.field_1883)) {
break;
}

var10000 = var10;
if (var6 != null) {
break label34;
}
}
}

try {
var10000 = (of)var10000;
if ((of)var10000 == null) {
var10000 = of.EN;
}
} catch (IllegalFormatException var13) {
throw vm.a<"Å">(var13, -89904009803065226L, var2);
}

l = (of)var10000;
}
}

@NotNull
public final String E(int a, @NotNull String key, int a, @NotNull Object[] args, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: iload 5
// 10: i2l
// 11: bipush 48
// 13: lshl
// 14: bipush 48
// 16: lushr
// 17: lor
// 18: getstatic su/catlean/i4.a J
// 1b: lxor
// 1c: lstore 6
// 1e: aload 2
// 1f: sipush 5112
// 22: ldc2_w 848264887277421663
// 25: lload 6
// 27: lxor
// 28: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/i4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 30: aload 4
// 32: sipush 746
// 35: ldc2_w 1598966376070518094
// 38: lload 6
// 3a: lxor
// 3b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/i4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 43: getstatic su/catlean/i4.l Lsu/catlean/of;
// 46: invokevirtual su/catlean/of.A ()Ljava/util/Map;
// 49: aload 2
// 4a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 4f: checkcast java/lang/String
// 52: dup
// 53: ifnonnull a1
// 56: pop
// 57: getstatic su/catlean/of.EN Lsu/catlean/of;
// 5a: invokevirtual su/catlean/of.A ()Ljava/util/Map;
// 5d: aload 2
// 5e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 63: checkcast java/lang/String
// 66: dup
// 67: ifnonnull a1
// 6a: goto 78
// 6d: ldc2_w -7585806830522306545
// 70: lload 6
// 72: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77: athrow
// 78: pop
// 79: aload 2
// 7a: bipush 0
// 7b: anewarray 74
// 7e: invokestatic net/minecraft/class_1074.method_4662 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
// 81: dup
// 82: sipush 9393
// 85: ldc2_w 2271235055471244052
// 88: lload 6
// 8a: lxor
// 8b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/i4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 93: goto a1
// 96: ldc2_w -7585806830522306545
// 99: lload 6
// 9b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: athrow
// a1: astore 8
// a3: nop
// a4: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
// a7: pop
// a8: aload 4
// aa: aload 4
// ac: arraylength
// ad: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
// b0: astore 10
// b2: aload 8
// b4: aload 10
// b6: aload 10
// b8: arraylength
// b9: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
// bc: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
// bf: dup
// c0: sipush 8976
// c3: ldc2_w 4810383614563628208
// c6: lload 6
// c8: lxor
// c9: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/i4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ce: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// d1: astore 9
// d3: goto f0
// d6: astore 10
// d8: aload 8
// da: sipush 27473
// dd: ldc2_w 6860313068725239027
// e0: lload 6
// e2: lxor
// e3: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/i4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e8: swap
// e9: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// ee: astore 9
// f0: aload 9
// f2: areturn
}

public final void y(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
String var10000 = vm.a<"Å">(-1949608635299627934L, var4);
i4 var7 = this;
String var6 = var10000;

try {
i4 var22 = var7;
boolean var9 = false;
Iterator var10 = of.b().iterator();

label105:
while (true) {
boolean var26 = var10.hasNext();

label102:
while (var26) {
var10000 = (String)var10.next();

label100:
while (true) {
of var11 = (of)var10000;
ClassLoader var28 = CatLean.class.getClassLoader();
String var10001 = var11.name().toLowerCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var10001, a<"i">(8677, 7960072563247072451L ^ var4));
InputStream var12 = var28.getResourceAsStream(a<"i">(14714, 2115924888512715867L ^ var4) + var10001 + a<"i">(20857, 281292456743810141L ^ var4));

label98:
while (true) {
label122: {
var29 = Json.Default;
Intrinsics.checkNotNull(var12);
Charset var14 = Charsets.UTF_8;
Reader var15 = new InputStreamReader(var12, var14);
int var16 = (int)e;
var32 = var15;
label68:
if (var6 != null) {
try {
if (var32 instanceof BufferedReader) {
var32 = var15;
break label68;
}
} catch (Throwable var18) {
throw vm.a<"Å">(var18, -1999988907985141112L, var4);
}

var33 = new BufferedReader(var15, var16);
break label122;
}

var33 = (BufferedReader)var32;
}

JsonElement var17 = var29.parseToJsonElement(TextStreamsKt.readText(var33));

label82: {
try {
var30 = var17;
if (var6 == null) {
break label82;
}

var26 = var17 instanceof JsonObject;
if (var2 <= 0) {
continue label102;
}

if (!var26) {
continue label105;
}
} catch (Throwable var19) {
throw vm.a<"Å">(var19, -1999988907985141112L, var4);
}

var30 = var17;
}

Iterator var13 = ((Map)var30).entrySet().iterator();

label96:
while (true) {
if (!var13.hasNext()) {
continue label105;
}

Entry var23 = (Entry)var13.next();
String var24 = (String)var23.getKey();
JsonElement var25 = (JsonElement)var23.getValue();
var11.A().put(var24, JsonElementKt.getJsonPrimitive(var25).getContent());

do {
var10000 = var6;
if (var3 > 0) {
continue label100;
}

if (var6 == null) {
continue label98;
}

try {
var10000 = var6;
if (var1 < 0) {
return;
}

if (var1 >= 0) {
if (var6 == null) {
return;
}

var10000 = var6;
}

if (var10000 != null) {
continue label96;
}
} catch (Throwable var20) {
throw vm.a<"Å">(var20, -1999988907985141112L, var4);
}
} while (var2 <= 0);

vm.a<"Å">(new _g[2], -1949295708270367025L, var4);
break label102;
}
}
}
}

Result.constructor-impl(Unit.INSTANCE);
break;
}
} catch (Throwable var21) {
Object var8 = Result.constructor-impl(ResultKt.createFailure(var21));
}
}

static {
long var14 = a ^ 77971358918022L;
vm.a<"Å">("m8Gwib", -2520510899366162812L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[8];
int var10 = 0;
String var9 = "ÁSC\u00056¤¢\u0001AUç\u000e¸È¸6øÅ!\u0084Ä8¡s)½9§oÛ|\u0093(¤~+\u001e\u0099oP#\u000b3½°JÂ\\u\u0089õ«°w\u0085¡.¸H5ÿô\u008b\u0087\u0088äµ¨iÄ\u0011Ok\u0018ÜW6\u0094.\u0005\u0019=ª,\u0016\u0082§Õ:\u0086o»KÌ\u001c#Rè\u0010Uß\t\u0095ÁËeî\u0088§õ\u0099Î7ÒR\u0010+1\u0086 }~\u009d\u0017Ô\u0091ÏL\u009f±.\u0014  ¸?ÈßIlÔ@\u000b\u00adßjOÇa\rWÍ+\u0010OgTt\u0003Ë\u0016Y\u0015\u008cþ";
int var11 = "ÁSC\u00056¤¢\u0001AUç\u000e¸È¸6øÅ!\u0084Ä8¡s)½9§oÛ|\u0093(¤~+\u001e\u0099oP#\u000b3½°JÂ\\u\u0089õ«°w\u0085¡.¸H5ÿô\u008b\u0087\u0088äµ¨iÄ\u0011Ok\u0018ÜW6\u0094.\u0005\u0019=ª,\u0016\u0082§Õ:\u0086o»KÌ\u001c#Rè\u0010Uß\t\u0095ÁËeî\u0088§õ\u0099Î7ÒR\u0010+1\u0086 }~\u009d\u0017Ô\u0091ÏL\u009f±.\u0014  ¸?ÈßIlÔ@\u000b\u00adßjOÇa\rWÍ+\u0010OgTt\u0003Ë\u0016Y\u0015\u008cþ"
.length();
char var8 = ' ';
int var17 = -1;

label37:
while (true) {
String var18 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var26;
if ((var17 += var8) >= var11) {
b = var12;
c = new String[8];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 4426565070679040393L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var30;
h = new i4();
l = of.EN;
return;
}

var8 = var9.charAt(var17);
break;
default:
var12[var10++] = var26;
if ((var17 += var8) < var11) {
var8 = var9.charAt(var17);
continue label37;
}

var9 = "\u0083\u0013Ä\u0000Eô\bÝ+gÔ7\b§Oc%ÀdQ\"\u0087\u00ad.J\u008fiþ\u0015Ò\u008cyÿ\u0085}\u009bÛý?\nÝp\u009d+±\t¨×\u0010Ñmî\u008eÙ\"Í\u0089È\u0002\u0091\u0093\u008aæ\u0011¦";
var11 = "\u0083\u0013Ä\u0000Eô\bÝ+gÔ7\b§Oc%ÀdQ\"\u0087\u00ad.J\u008fiþ\u0015Ò\u008cyÿ\u0085}\u009bÛý?\nÝp\u009d+±\t¨×\u0010Ñmî\u008eÙ\"Í\u0089È\u0002\u0091\u0093\u008aæ\u0011¦"
.length();
var8 = '0';
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
var10001 = 0;
}
}
}

public static void m(String var0) {
D = var0;
}

public static String w() {
return D;
}

private static Throwable a(Throwable var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 242;
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
throw new RuntimeException("su/catlean/i4", var10);
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
throw new RuntimeException("su/catlean/i4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
