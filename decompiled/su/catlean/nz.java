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
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;

public final class nz {
@NotNull
public static final nz B;
@NotNull
private static final Map g;
private static final long a = yz.a(-6607130875288731993L, -4856352360410586874L, MethodHandles.lookup().lookupClass()).a(157949681415734L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private nz() {
}

@NotNull
public final Map B() {
return g;
}

public final void k(@NotNull class_4587 matrixStack, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/nz.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 44416054629292
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 4338045768674102406
// 012: lload 2
// 013: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 1
// 019: sipush 31758
// 01c: ldc2_w 1106406249755042399
// 01f: lload 2
// 020: lxor
// 021: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/nz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: getstatic su/catlean/nz.g Ljava/util/Map;
// 02c: astore 7
// 02e: bipush 0
// 02f: istore 8
// 031: aload 7
// 033: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 038: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 03d: astore 9
// 03f: istore 6
// 041: aload 9
// 043: invokeinterface java/util/Iterator.hasNext ()Z 1
// 048: ifeq 105
// 04b: aload 9
// 04d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 052: checkcast java/util/Map$Entry
// 055: astore 10
// 057: aload 10
// 059: astore 11
// 05b: bipush 0
// 05c: istore 12
// 05e: aload 11
// 060: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 065: checkcast su/catlean/pe
// 068: astore 13
// 06a: aload 11
// 06c: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 071: checkcast java/lang/Number
// 074: invokevirtual java/lang/Number.longValue ()J
// 077: lstore 14
// 079: iload 6
// 07b: lload 2
// 07c: lconst_0
// 07d: lcmp
// 07e: iflt 086
// 081: ifeq 10c
// 084: iload 6
// 086: lload 2
// 087: lconst_0
// 088: lcmp
// 089: iflt 0da
// 08c: ifeq 0d8
// 08f: goto 09c
// 092: ldc2_w 4343898479780478541
// 095: lload 2
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: lload 2
// 09d: lconst_0
// 09e: lcmp
// 09f: iflt 0f1
// 0a2: invokestatic su/catlean/zf.A ()J
// 0a5: lload 14
// 0a7: lsub
// 0a8: l2f
// 0a9: ldc 300.0
// 0ab: fcmpl
// 0ac: ifle 0e3
// 0af: goto 0bc
// 0b2: ldc2_w 4343898479780478541
// 0b5: lload 2
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: getstatic su/catlean/nz.B Lsu/catlean/nz;
// 0bf: pop
// 0c0: getstatic su/catlean/nz.g Ljava/util/Map;
// 0c3: aload 13
// 0c5: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
// 0ca: pop
// 0cb: goto 0d8
// 0ce: ldc2_w 4343898479780478541
// 0d1: lload 2
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: iload 6
// 0da: lload 2
// 0db: lconst_0
// 0dc: lcmp
// 0dd: iflt 102
// 0e0: ifne 0fe
// 0e3: aload 13
// 0e5: invokestatic su/catlean/zf.A ()J
// 0e8: lload 14
// 0ea: lsub
// 0eb: aload 1
// 0ec: lload 4
// 0ee: invokevirtual su/catlean/pe.J (JLnet/minecraft/class_4587;J)V
// 0f1: goto 0fe
// 0f4: ldc2_w 4343898479780478541
// 0f7: lload 2
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: nop
// 0ff: nop
// 100: iload 6
// 102: ifne 041
// 105: nop
// 106: lload 2
// 107: lconst_0
// 108: lcmp
// 109: ifle 10c
// 10c: return
}

public final void p(
@NotNull class_2338 pos, char a, short a, @NotNull Color lineColor, @NotNull Color fillColor, @NotNull og animationMode, @NotNull lr renderMode, int a
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 2
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 8
// 10: i2l
// 11: bipush 32
// 13: lshl
// 14: bipush 32
// 16: lushr
// 17: lor
// 18: getstatic su/catlean/nz.a J
// 1b: lxor
// 1c: lstore 9
// 1e: lload 9
// 20: dup2
// 21: ldc2_w 20507458525471
// 24: lxor
// 25: dup2
// 26: bipush 32
// 28: lushr
// 29: l2i
// 2a: istore 11
// 2c: dup2
// 2d: bipush 32
// 2f: lshl
// 30: bipush 48
// 32: lushr
// 33: l2i
// 34: istore 12
// 36: dup2
// 37: bipush 48
// 39: lshl
// 3a: bipush 48
// 3c: lushr
// 3d: l2i
// 3e: istore 13
// 40: pop2
// 41: pop2
// 42: aload 1
// 43: sipush 23910
// 46: ldc2_w 3381215174393594814
// 49: lload 9
// 4b: lxor
// 4c: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/nz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 54: ldc2_w -235881279989216244
// 57: lload 9
// 59: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: aload 4
// 60: sipush 2232
// 63: ldc2_w 1221319839452812902
// 66: lload 9
// 68: lxor
// 69: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/nz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 71: aload 5
// 73: sipush 24935
// 76: ldc2_w 6591705259045437374
// 79: lload 9
// 7b: lxor
// 7c: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/nz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 84: aload 6
// 86: sipush 15804
// 89: ldc2_w 7951496871287513958
// 8c: lload 9
// 8e: lxor
// 8f: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/nz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 97: istore 14
// 99: aload 7
// 9b: sipush 16471
// 9e: ldc2_w 3271966269775847051
// a1: lload 9
// a3: lxor
// a4: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/nz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// ac: aload 7
// ae: iload 14
// b0: ifeq f9
// b3: getstatic su/catlean/lr.NONE Lsu/catlean/lr;
// b6: if_acmpne d3
// b9: goto c7
// bc: ldc2_w -233467849710207289
// bf: lload 9
// c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c6: athrow
// c7: return
// c8: ldc2_w -233467849710207289
// cb: lload 9
// cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d2: athrow
// d3: getstatic su/catlean/nz.g Ljava/util/Map;
// d6: new su/catlean/pe
// d9: dup
// da: aload 1
// db: aload 4
// dd: aload 5
// df: aload 6
// e1: iload 11
// e3: aload 7
// e5: iload 12
// e7: i2c
// e8: iload 13
// ea: i2s
// eb: invokespecial su/catlean/pe.<init> (Lnet/minecraft/class_2338;Ljava/awt/Color;Ljava/awt/Color;Lsu/catlean/og;ILsu/catlean/lr;CS)V
// ee: invokestatic su/catlean/zf.A ()J
// f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// f4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// f9: pop
// fa: return
}

public final boolean c(@NotNull class_2338 pos, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(pos, a<"x">(15235, 8717435955663267052L ^ ax));
return g.keySet().stream().anyMatch(nz::K);
}

private static final boolean p(class_2338 var0, pe var1) {
return Intrinsics.areEqual(var1.i(), var0);
}

private static final boolean K(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var0 = a ^ 72630649767131L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[7];
int var7 = 0;
String var6 = "´Ã\u0003\u0095áº\u001d´RûsÕt\u0088«\u0094\u009cj\u0004#}kÚ[áÖM8/ÞË\u001b \u0093dvM:\u009e\u0095nKA°Ôf \u0019ÞÖ4cß\n\u001cÖkÁ[×tâ\u008c+Â\u00108+d3ßõó?ïAÄÊ\u0083Í\u0019Þ\u0018D\u0005ÇïÍl¿ª}V»\u0003·¶!Ñhdê±\f¸Ñ¯ Ó\u009cê`>íRÚ`eh&®[\u0016ô\fÄ´\u0090¶eY]¯\u001aU\u0085â0ñ\u0016";
int var8 = "´Ã\u0003\u0095áº\u001d´RûsÕt\u0088«\u0094\u009cj\u0004#}kÚ[áÖM8/ÞË\u001b \u0093dvM:\u009e\u0095nKA°Ôf \u0019ÞÖ4cß\n\u001cÖkÁ[×tâ\u008c+Â\u00108+d3ßõó?ïAÄÊ\u0083Í\u0019Þ\u0018D\u0005ÇïÍl¿ª}V»\u0003·¶!Ñhdê±\f¸Ñ¯ Ó\u009cê`>íRÚ`eh&®[\u0016ô\fÄ´\u0090¶eY]¯\u001aU\u0085â0ñ\u0016"
.length();
char var5 = ' ';
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
c = new String[7];
B = new nz();
g = new ConcurrentHashMap();
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

var6 = "8\u0098Á\u009b\u0005ÔÉBÛç8t\u0004Ô§Ë\u0018¨*\u0017'ÜpØ¾ÓY}\u001f\u0092\u0082\u0000K'>,æ\u000fp[\u0011";
var8 = "8\u0098Á\u009b\u0005ÔÉBÛç8t\u0004Ô§Ë\u0018¨*\u0017'ÜpØ¾ÓY}\u001f\u0092\u0082\u0000K'>,æ\u000fp[\u0011".length();
var5 = 16;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9188;
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
throw new RuntimeException("su/catlean/nz", var10);
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
throw new RuntimeException("su/catlean/nz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
