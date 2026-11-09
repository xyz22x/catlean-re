package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class p1 implements co {
@NotNull
private final Json n;
@NotNull
private final File P;
public List f;
private static final long a = yz.a(-2350861240970411063L, -2344192374533439674L, MethodHandles.lookup().lookupClass()).a(56282340420796L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public p1(@NotNull Json json, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(json, a<"x">(11851, 6241080330773846971L ^ ax));
super();
this.n = json;
this.P = new File(mj.v(), a<"x">(1525, 4999363156474261505L ^ ax));
}

@NotNull
public final List c(long var1) {
var1 = a ^ var1;

try {
if (this.f != null) {
return this.f;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, -8755376569871411738L, var1);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"x">(11029, 3706911521456556202L ^ var1));
return null;
}

public final void d(int a, int a, int a, @NotNull List <set-?>) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"x">(7224, 9015932955491259804L ^ var5));
this.f = <set-?>;
}

@Override
public void w(long var1) {
long var10001 = var1 ^ 1817644076745L;
int var3 = (int)((var1 ^ 1817644076745L) >>> 32);
int var4 = (int)((var1 ^ 1817644076745L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);

p1 var10000;
label29: {
try {
var10000 = this;
if (this.P.createNewFile()) {
var18 = new ArrayList();
break label29;
}
} catch (Exception var14) {
throw vm.a<"Å">(var14, -5042753720605251172L, var1);
}

p1 var11 = var10000;

List var7;
try {
Json var8 = this.n;
String var9 = FilesKt.readText$default(this.P, null, 1, null);
boolean var10 = false;
var8.getSerializersModule();
m var15 = var8.decodeFromString(m.F.K(), var9);
List var16 = new ArrayList();
var10 = false;
var16.addAll(var15.h());
var16.addAll(var15.V());
var16.addAll(var15.F());
var10000 = var11;
var7 = var16;
} catch (Exception var13) {
var10000 = var11;
zf.x().warn(a<"x">(25940, 2726498418146835088L ^ var1));
var7 = new ArrayList();
}

var18 = var7;
}

List var6 = var18;
var10000.d(var3, var4, var5, var6);
}

@Override
public void h(int param1, int param2, byte param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 40
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 56
// 012: lshl
// 013: bipush 56
// 015: lushr
// 016: lor
// 017: lstore 4
// 019: lload 4
// 01b: dup2
// 01c: ldc2_w 63175324088741
// 01f: lxor
// 020: lstore 6
// 022: dup2
// 023: ldc2_w 23103317616887
// 026: lxor
// 027: lstore 8
// 029: pop2
// 02a: aload 0
// 02b: getfield su/catlean/p1.P Ljava/io/File;
// 02e: aload 0
// 02f: getfield su/catlean/p1.n Lkotlinx/serialization/json/Json;
// 032: astore 11
// 034: aload 0
// 035: lload 6
// 037: invokevirtual su/catlean/p1.c (J)Ljava/util/List;
// 03a: checkcast java/lang/Iterable
// 03d: astore 14
// 03f: astore 23
// 041: ldc2_w 7463364205943846071
// 044: lload 4
// 046: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: bipush 0
// 04c: istore 15
// 04e: astore 10
// 050: aload 14
// 052: astore 16
// 054: new java/util/ArrayList
// 057: dup
// 058: invokespecial java/util/ArrayList.<init> ()V
// 05b: checkcast java/util/Collection
// 05e: astore 17
// 060: bipush 0
// 061: istore 18
// 063: aload 16
// 065: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 06a: astore 19
// 06c: aload 19
// 06e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 073: ifeq 0bf
// 076: aload 19
// 078: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 07d: astore 20
// 07f: iload 2
// 080: ifle 0a8
// 083: aload 20
// 085: instanceof su/catlean/bp
// 088: aload 10
// 08a: ifnonnull 0a7
// 08d: ifeq 06c
// 090: goto 09e
// 093: ldc2_w 7453906496062207209
// 096: lload 4
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: aload 17
// 0a0: aload 20
// 0a2: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0a7: pop
// 0a8: aload 10
// 0aa: ifnull 06c
// 0ad: bipush 4
// 0ae: anewarray 368
// 0b1: iload 1
// 0b2: iflt 085
// 0b5: ldc2_w 7440958248469228926
// 0b8: lload 4
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: aload 17
// 0c1: checkcast java/util/List
// 0c4: nop
// 0c5: aload 23
// 0c7: swap
// 0c8: invokestatic kotlin/jvm/internal/TypeIntrinsics.asMutableList (Ljava/lang/Object;)Ljava/util/List;
// 0cb: astore 12
// 0cd: aload 0
// 0ce: lload 6
// 0d0: invokevirtual su/catlean/p1.c (J)Ljava/util/List;
// 0d3: checkcast java/lang/Iterable
// 0d6: astore 15
// 0d8: astore 23
// 0da: bipush 0
// 0db: istore 16
// 0dd: aload 15
// 0df: astore 17
// 0e1: new java/util/ArrayList
// 0e4: dup
// 0e5: invokespecial java/util/ArrayList.<init> ()V
// 0e8: checkcast java/util/Collection
// 0eb: astore 18
// 0ed: bipush 0
// 0ee: istore 19
// 0f0: aload 17
// 0f2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0f7: astore 20
// 0f9: aload 20
// 0fb: invokeinterface java/util/Iterator.hasNext ()Z 1
// 100: ifeq 13a
// 103: aload 20
// 105: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 10a: astore 21
// 10c: iload 3
// 10d: iflt 135
// 110: aload 21
// 112: instanceof su/catlean/ft
// 115: aload 10
// 117: ifnonnull 134
// 11a: ifeq 0f9
// 11d: goto 12b
// 120: ldc2_w 7453906496062207209
// 123: lload 4
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: aload 18
// 12d: aload 21
// 12f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 134: pop
// 135: aload 10
// 137: ifnull 0f9
// 13a: aload 18
// 13c: checkcast java/util/List
// 13f: nop
// 140: aload 23
// 142: swap
// 143: invokestatic kotlin/jvm/internal/TypeIntrinsics.asMutableList (Ljava/lang/Object;)Ljava/util/List;
// 146: astore 13
// 148: iload 3
// 149: iflt 10a
// 14c: aload 0
// 14d: lload 6
// 14f: invokevirtual su/catlean/p1.c (J)Ljava/util/List;
// 152: checkcast java/lang/Iterable
// 155: astore 16
// 157: astore 23
// 159: bipush 0
// 15a: istore 17
// 15c: aload 16
// 15e: astore 18
// 160: new java/util/ArrayList
// 163: dup
// 164: invokespecial java/util/ArrayList.<init> ()V
// 167: checkcast java/util/Collection
// 16a: astore 19
// 16c: bipush 0
// 16d: istore 20
// 16f: aload 18
// 171: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 176: astore 21
// 178: aload 21
// 17a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 17f: ifeq 1b9
// 182: aload 21
// 184: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 189: astore 22
// 18b: iload 1
// 18c: iflt 1b4
// 18f: aload 22
// 191: instanceof su/catlean/nh
// 194: aload 10
// 196: ifnonnull 1b3
// 199: ifeq 178
// 19c: goto 1aa
// 19f: ldc2_w 7453906496062207209
// 1a2: lload 4
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: aload 19
// 1ac: aload 22
// 1ae: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1b3: pop
// 1b4: aload 10
// 1b6: ifnull 178
// 1b9: aload 19
// 1bb: checkcast java/util/List
// 1be: nop
// 1bf: aload 23
// 1c1: swap
// 1c2: invokestatic kotlin/jvm/internal/TypeIntrinsics.asMutableList (Ljava/lang/Object;)Ljava/util/List;
// 1c5: astore 14
// 1c7: iload 2
// 1c8: iflt 189
// 1cb: new su/catlean/m
// 1ce: dup
// 1cf: aload 14
// 1d1: aload 12
// 1d3: aload 13
// 1d5: lload 8
// 1d7: invokespecial su/catlean/m.<init> (Ljava/util/List;Ljava/util/List;Ljava/util/List;J)V
// 1da: astore 12
// 1dc: nop
// 1dd: bipush 0
// 1de: istore 13
// 1e0: aload 11
// 1e2: aload 11
// 1e4: invokevirtual kotlinx/serialization/json/Json.getSerializersModule ()Lkotlinx/serialization/modules/SerializersModule;
// 1e7: pop
// 1e8: getstatic su/catlean/m.F Lsu/catlean/wh;
// 1eb: invokevirtual su/catlean/wh.K ()Lkotlinx/serialization/KSerializer;
// 1ee: checkcast kotlinx/serialization/SerializationStrategy
// 1f1: aload 12
// 1f3: invokevirtual kotlinx/serialization/json/Json.encodeToString (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
// 1f6: aconst_null
// 1f7: bipush 2
// 1f8: aconst_null
// 1f9: invokestatic kotlin/io/FilesKt.writeText$default (Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
// 1fc: return
}

static {
long var0 = a ^ 68737517295995L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[5];
int var7 = 0;
String var6 = "y \u001aR\u0016\u000fõ\u0096¾\u0089\u0015\u008diÆ±Î\u0010\bsO<x\u0012xgÙ\u000b<ü\u008d\u007f6eX\u0088Ï \u009fR\u0094\u0087\u0088\\\u0016[ý\u0004p\u0014\u0004,\u008cWâ\u001dG8ü`\u0014\u008e\u0097\u008bD«÷\u0089Þ\u0084\u0010ó[~ .´\u0086`1ù\u009bIô<¯\u0090,Ñq\u0099\u0082\u0093NJ\u0083\u0002ù ù ¶@ÓÀÜ\u0082ná\u0087vý\u0093\u0089Lzìa\u0098ØØ\b±";
int var8 = "y \u001aR\u0016\u000fõ\u0096¾\u0089\u0015\u008diÆ±Î\u0010\bsO<x\u0012xgÙ\u000b<ü\u008d\u007f6eX\u0088Ï \u009fR\u0094\u0087\u0088\\\u0016[ý\u0004p\u0014\u0004,\u008cWâ\u001dG8ü`\u0014\u008e\u0097\u008bD«÷\u0089Þ\u0084\u0010ó[~ .´\u0086`1ù\u009bIô<¯\u0090,Ñq\u0099\u0082\u0093NJ\u0083\u0002ù ù ¶@ÓÀÜ\u0082ná\u0087vý\u0093\u0089Lzìa\u0098ØØ\b±"
.length();
char var5 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[5];
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "èðRv\u009a\u0005 \u0096WC\u0098\u008e\u009a(´î ù\u009ePwE\u0087`ðÐ®MÌ!\u000f,\u000b\u0010OrKøEc;÷\u0001Ï\u0094\u0017äÑç";
var8 = "èðRv\u009a\u0005 \u0096WC\u0098\u008e\u009a(´î ù\u009ePwE\u0087`ðÐ®MÌ!\u000f,\u000b\u0010OrKøEc;÷\u0001Ï\u0094\u0017äÑç".length();
var5 = 16;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9431;
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
throw new RuntimeException("su/catlean/p1", var10);
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
throw new RuntimeException("su/catlean/p1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
