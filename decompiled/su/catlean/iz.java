package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
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
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class iz {
@NotNull
private final List h;
private static int U;
private static final long a = yz.a(-5929392097109375847L, -8985781271031890826L, MethodHandles.lookup().lookupClass()).a(117868564433088L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public iz(long a, int a, @NotNull List items) {
long var5 = (axx << 32 | (long)ax << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(items, a<"b">(8384, 6037771023692895896L ^ var5));
super();
this.h = items;
}

@NotNull
public final List i() {
return this.h;
}

// $VF: Irreducible bytecode was duplicated to produce valid code
@NotNull
public final class_243 f(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 62787266431608L;
long var5 = var1 ^ 9272401041478L;
int var7 = vm.a<"Å">(5663891678801763953L, var1);

try {
if (this.h.isEmpty()) {
class_243 var20 = class_243.field_1353;
Intrinsics.checkNotNullExpressionValue(class_243.field_1353, a<"b">(4625, 8004709476834128530L ^ var1));
return var20;
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 5661777315832619373L, var1);
}

double var8 = 0.0;
double var10 = 0.0;
double var12 = 0.0;
Iterator var14 = this.h.iterator();

label26:
while (true) {
Object var10000;
if (var14.hasNext()) {
var10000 = var14.next();
} else {
var10000 = this.h;
if (var1 >= 0L) {
int var19 = this.h.size();
return new class_243(var8 / var19, var10 / var19 + 0.7, var12 / var19);
}
}

do {
class_1542 var15 = (class_1542)var10000;
var8 += jl.y.b(var5, var15.field_6014, p4.K(var3, (class_1297)var15).field_1352);
var10 += jl.y.b(var5, var15.field_6036, p4.K(var3, (class_1297)var15).field_1351);
var12 += jl.y.b(var5, var15.field_5969, p4.K(var3, (class_1297)var15).field_1350);
if (var7 == 0) {
continue label26;
}

var10000 = this.h;
} while (var1 < 0L);

int var18 = this.h.size();
return new class_243(var8 / var18, var10 / var18 + 0.7, var12 / var18);
}
}

@NotNull
public final List r(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/iz.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: aload 0
// 007: getfield su/catlean/iz.h Ljava/util/List;
// 00a: checkcast java/lang/Iterable
// 00d: astore 4
// 00f: ldc2_w -2855285711035904709
// 012: lload 1
// 013: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: bipush 0
// 019: istore 5
// 01b: istore 3
// 01c: new su/catlean/zt
// 01f: dup
// 020: aload 4
// 022: invokespecial su/catlean/zt.<init> (Ljava/lang/Iterable;)V
// 025: checkcast kotlin/collections/Grouping
// 028: astore 4
// 02a: bipush 0
// 02b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 02e: astore 5
// 030: bipush 0
// 031: istore 6
// 033: aload 4
// 035: astore 7
// 037: bipush 0
// 038: istore 8
// 03a: aload 7
// 03c: astore 9
// 03e: new java/util/LinkedHashMap
// 041: dup
// 042: invokespecial java/util/LinkedHashMap.<init> ()V
// 045: checkcast java/util/Map
// 048: astore 10
// 04a: nop
// 04b: bipush 0
// 04c: istore 11
// 04e: aload 9
// 050: invokeinterface kotlin/collections/Grouping.sourceIterator ()Ljava/util/Iterator; 1
// 055: astore 12
// 057: aload 12
// 059: invokeinterface java/util/Iterator.hasNext ()Z 1
// 05e: ifeq 135
// 061: aload 12
// 063: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 068: astore 13
// 06a: aload 9
// 06c: aload 13
// 06e: invokeinterface kotlin/collections/Grouping.keyOf (Ljava/lang/Object;)Ljava/lang/Object; 2
// 073: astore 14
// 075: aload 10
// 077: aload 14
// 079: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 07e: astore 15
// 080: aload 10
// 082: iload 3
// 083: ifeq 139
// 086: aload 14
// 088: aload 15
// 08a: aload 13
// 08c: aload 15
// 08e: ifnonnull 0cc
// 091: goto 09e
// 094: ldc2_w -2874839078188419099
// 097: lload 1
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: aload 10
// 0a0: aload 14
// 0a2: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
// 0a7: iload 3
// 0a8: ifeq 0c9
// 0ab: goto 0b8
// 0ae: ldc2_w -2874839078188419099
// 0b1: lload 1
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: ifne 0cc
// 0bb: goto 0c8
// 0be: ldc2_w -2874839078188419099
// 0c1: lload 1
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: bipush 1
// 0c9: goto 0cd
// 0cc: bipush 0
// 0cd: istore 16
// 0cf: astore 17
// 0d1: astore 18
// 0d3: astore 19
// 0d5: astore 20
// 0d7: bipush 0
// 0d8: istore 21
// 0da: iload 16
// 0dc: ifeq 0ee
// 0df: aload 5
// 0e1: goto 0f0
// 0e4: ldc2_w -2874839078188419099
// 0e7: lload 1
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: aload 18
// 0f0: aload 17
// 0f2: checkcast net/minecraft/class_1542
// 0f5: astore 22
// 0f7: checkcast java/lang/Number
// 0fa: invokevirtual java/lang/Number.intValue ()I
// 0fd: istore 23
// 0ff: bipush 0
// 100: istore 24
// 102: iload 23
// 104: aload 22
// 106: invokevirtual net/minecraft/class_1542.method_6983 ()Lnet/minecraft/class_1799;
// 109: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 10c: iadd
// 10d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 110: astore 23
// 112: aload 20
// 114: aload 19
// 116: aload 23
// 118: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 11d: pop
// 11e: iload 3
// 11f: ifne 057
// 122: bipush 3
// 123: anewarray 138
// 126: lload 1
// 127: lconst_0
// 128: lcmp
// 129: iflt 07e
// 12c: ldc2_w -2879872805899414987
// 12f: lload 1
// 130: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: aload 10
// 137: nop
// 138: nop
// 139: astore 4
// 13b: nop
// 13c: bipush 0
// 13d: istore 5
// 13f: aload 4
// 141: astore 6
// 143: new java/util/ArrayList
// 146: dup
// 147: aload 4
// 149: invokeinterface java/util/Map.size ()I 1
// 14e: invokespecial java/util/ArrayList.<init> (I)V
// 151: checkcast java/util/Collection
// 154: astore 7
// 156: bipush 0
// 157: istore 8
// 159: aload 6
// 15b: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 160: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 165: astore 9
// 167: aload 9
// 169: invokeinterface java/util/Iterator.hasNext ()Z 1
// 16e: ifeq 1cb
// 171: aload 9
// 173: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 178: checkcast java/util/Map$Entry
// 17b: astore 10
// 17d: aload 7
// 17f: aload 10
// 181: astore 11
// 183: iload 3
// 184: ifeq 1d3
// 187: astore 25
// 189: bipush 0
// 18a: istore 12
// 18c: aload 11
// 18e: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 193: checkcast java/lang/String
// 196: astore 13
// 198: aload 11
// 19a: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 19f: checkcast java/lang/Number
// 1a2: invokevirtual java/lang/Number.intValue ()I
// 1a5: istore 14
// 1a7: aload 13
// 1a9: iload 14
// 1ab: sipush 20454
// 1ae: ldc2_w 3407155042794338796
// 1b1: lload 1
// 1b2: lxor
// 1b3: invokedynamic b (IJ)Ljava/lang/String; bsm=su/catlean/iz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: swap
// 1b9: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 1be: aload 25
// 1c0: swap
// 1c1: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1c6: pop
// 1c7: iload 3
// 1c8: ifne 167
// 1cb: aload 7
// 1cd: lload 1
// 1ce: lconst_0
// 1cf: lcmp
// 1d0: iflt 178
// 1d3: checkcast java/util/List
// 1d6: nop
// 1d7: areturn
}

@NotNull
public final List y() {
return this.h;
}

@NotNull
public final iz w(@NotNull List items, long a) {
ax = a ^ ax;
long var4 = (ax ^ 69755574906569L) >>> 32;
int var6 = (int)((ax ^ 69755574906569L) << 32 >>> 32);
Intrinsics.checkNotNullParameter(items, a<"b">(26191, 6410765195118887767L ^ ax));
return new iz(var4, var6, items);
}

public static iz R(iz var0, List var1, long var2, int var4, Object var5) {
var2 = a ^ var2;
long var6 = var2 ^ 82649988593900L;
if ((var4 & 1) != 0) {
var1 = var0.h;
}

return var0.w(var1, var6);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 8544951258179L;
List var10000 = this.h;
return a<"b">(21229, 5850901759214914566L ^ var1) + var10000 + ")";
}

@Override
public int hashCode() {
return this.h.hashCode();
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
// 00: getstatic su/catlean/iz.a J
// 03: ldc2_w 79348984980676
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -2865219019948307112
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: aload 0
// 14: iload 4
// 16: ifeq 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -2848021356399298682
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -2848021356399298682
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: iload 4
// 39: ifeq 5c
// 3c: instanceof su/catlean/iz
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -2848021356399298682
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -2848021356399298682
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/iz
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/iz.h Ljava/util/List;
// 65: aload 5
// 67: getfield su/catlean/iz.h Ljava/util/List;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: iload 4
// 6f: ifeq 8f
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -2848021356399298682
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -2848021356399298682
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: bipush 1
// 8f: ireturn
}

public static void C(int var0) {
U = var0;
}

public static int j() {
return U;
}

public static int l() {
int var0 = j();

try {
return var0 == 0 ? 72 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var9 = a ^ 139494718555152L;
vm.a<"Å">(0, 4041239543827956428L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[5];
int var5 = 0;
String var4 = "\u001f\u007f\u008däýûxÇöÏ\u00103E\u0091Ç\u0082\u0010\u0013ãâ\u0015\u0015È>{²´ë\u0018\u009cS~j\u0010±S\u000e}Ê`ë]P\rTø£\u008cÿË";
int var6 = "\u001f\u007f\u008däýûxÇöÏ\u00103E\u0091Ç\u0082\u0010\u0013ãâ\u0015\u0015È>{²´ë\u0018\u009cS~j\u0010±S\u000e}Ê`ë]P\rTø£\u008cÿË".length();
char var3 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var4.substring(++var12, var12 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var19;
if ((var12 += var3) >= var6) {
b = var7;
c = new String[5];
return;
}

var3 = var4.charAt(var12);
break;
default:
var7[var5++] = var19;
if ((var12 += var3) < var6) {
var3 = var4.charAt(var12);
continue label27;
}

var4 = "\u0083Uú\u009b®ë\r5\u009b&¯\u0087\u0003ôÃÌ(G\u0083tS\u008c§ñRËüt\u0004¡ÇG\u0083\u00023\n\u008d[\b\u009cúaCÚ@Gâ¼zD\u008b%Íê¥\u0082@";
var6 = "\u0083Uú\u009b®ë\r5\u009b&¯\u0087\u0003ôÃÌ(G\u0083tS\u008c§ñRËüt\u0004¡ÇG\u0083\u00023\n\u008d[\b\u009cúaCÚ@Gâ¼zD\u008b%Íê¥\u0082@".length();
var3 = 16;
var12 = -1;
}

var13 = var4.substring(++var12, var12 + var3);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28452;
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
throw new RuntimeException("su/catlean/iz", var10);
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
throw new RuntimeException("su/catlean/iz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
