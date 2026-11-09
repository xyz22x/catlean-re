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
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public abstract class tt {
@NotNull
private class_243 h;
private static int Z;
private static final long ab = yz.a(4386737805445065083L, 5871222964246251912L, MethodHandles.lookup().lookupClass()).a(478852577411L);
private static final String[] cb;
private static final String[] db;
private static final Map eb = new HashMap(13);
private static final long ib;

public tt(char var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ ab;
super();
class_243 var10001 = class_243.field_1353;
Intrinsics.checkNotNullExpressionValue(class_243.field_1353, a<"j">(23378, 6522506140493403751L ^ var4));
this.h = var10001;
}

@NotNull
public abstract _w o(@NotNull class_1297 var1, long var2, @NotNull _w var4, boolean var5);

@NotNull
public class_243 B(long a, @NotNull class_1297 target) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 100744130797779
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 108103236449891
// 00c: lxor
// 00d: lstore 6
// 00f: pop2
// 010: ldc2_w 2600852393416544397
// 013: lload 1
// 014: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 019: aload 3
// 01a: sipush 7781
// 01d: ldc2_w 1525043099548092460
// 020: lload 1
// 021: lxor
// 022: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/tt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 027: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 02a: istore 8
// 02c: lload 6
// 02e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 031: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 034: iload 8
// 036: ifeq 08e
// 039: ifeq 069
// 03c: goto 049
// 03f: ldc2_w 2608369847447386263
// 042: lload 1
// 043: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: athrow
// 049: aload 3
// 04a: invokevirtual net/minecraft/class_1297.method_33571 ()Lnet/minecraft/class_243;
// 04d: dup
// 04e: sipush 22679
// 051: ldc2_w 7910430894694485725
// 054: lload 1
// 055: lxor
// 056: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/tt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 05e: areturn
// 05f: ldc2_w 2608369847447386263
// 062: lload 1
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: lload 6
// 06b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06e: lload 1
// 06f: lconst_0
// 070: lcmp
// 071: ifle 0b8
// 074: iload 8
// 076: ifeq 0b8
// 079: getfield net/minecraft/class_746.field_6012 I
// 07c: getstatic su/catlean/tt.ib J
// 07f: l2i
// 080: irem
// 081: goto 08e
// 084: ldc2_w 2608369847447386263
// 087: lload 1
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: ifne 0b7
// 091: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 094: ldc2_w -0.1
// 097: ldc2_w 0.1
// 09a: invokestatic java/lang/Math.random ()D
// 09d: invokevirtual su/catlean/jl.W (DDD)D
// 0a0: ldc2_w 0.1
// 0a3: dmul
// 0a4: dstore 9
// 0a6: aload 0
// 0a7: new net/minecraft/class_243
// 0aa: dup
// 0ab: dload 9
// 0ad: dload 9
// 0af: dload 9
// 0b1: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0b4: putfield su/catlean/tt.h Lnet/minecraft/class_243;
// 0b7: aload 3
// 0b8: lload 4
// 0ba: dup2_x1
// 0bb: pop2
// 0bc: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0bf: aload 0
// 0c0: getfield su/catlean/tt.h Lnet/minecraft/class_243;
// 0c3: getfield net/minecraft/class_243.field_1352 D
// 0c6: aload 3
// 0c7: invokevirtual net/minecraft/class_1297.method_17682 ()F
// 0ca: f2d
// 0cb: ldc2_w 2.0
// 0ce: ddiv
// 0cf: aload 0
// 0d0: getfield su/catlean/tt.h Lnet/minecraft/class_243;
// 0d3: getfield net/minecraft/class_243.field_1351 D
// 0d6: dadd
// 0d7: aload 0
// 0d8: getfield su/catlean/tt.h Lnet/minecraft/class_243;
// 0db: getfield net/minecraft/class_243.field_1350 D
// 0de: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0e1: dup
// 0e2: sipush 2479
// 0e5: ldc2_w 1327325681348091876
// 0e8: lload 1
// 0e9: lxor
// 0ea: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/tt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f2: iload 8
// 0f4: lload 1
// 0f5: lconst_0
// 0f6: lcmp
// 0f7: iflt 0fe
// 0fa: ifne 117
// 0fd: bipush 4
// 0fe: anewarray 360
// 101: ldc2_w 2606433157794377238
// 104: lload 1
// 105: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: goto 117
// 10d: ldc2_w 2608369847447386263
// 110: lload 1
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: areturn
}

public boolean p() {
return true;
}

public boolean i() {
return true;
}

public static void c(int var0) {
Z = var0;
}

public static int J() {
return Z;
}

public static int c() {
int var0 = J();

try {
return var0 == 0 ? 17 : 0;
} catch (NumberFormatException var1) {
throw b(var1);
}
}

static {
long var14 = ab ^ 30231372816313L;
vm.a<"Å">(67, 2783521997577576749L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[4];
int var10 = 0;
String var9 = "\u008b\u000e\u009c_\u000bÌ\u0012§Ë\u0094L\u0002¦2âù\u0010sÁÉR(@0P\u001aÿ\u0083\u0005Õ\u0086\u008dm";
int var11 = "\u008b\u000e\u009c_\u000bÌ\u0012§Ë\u0094L\u0002¦2âù\u0010sÁÉR(@0P\u001aÿ\u0083\u0005Õ\u0086\u008dm".length();
char var8 = 16;
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
cb = var12;
db = new String[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 4001945888579585279L;
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
ib = var30;
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

var9 = "·\u0095&Y\u0088\u0011A&2aÙ\u000eçiSì:2aòys«>»\u001c¦I\u000fêXm\tñø¦\u008e\u0095vÏ\u0018p£\u0013ÊÜ¬J ºZ2²y\u0018\u00ad\u0005Fs]\u00ad)\u0012^6Z\u0086i@~»\u008f\f\u0090br~Ý\u0086t8";
var11 = "·\u0095&Y\u0088\u0011A&2aÙ\u000eçiSì:2aòys«>»\u001c¦I\u000fêXm\tñø¦\u008e\u0095vÏ\u0018p£\u0013ÊÜ¬J ºZ2²y\u0018\u00ad\u0005Fs]\u00ad)\u0012^6Z\u0086i@~»\u008f\f\u0090br~Ý\u0086t8"
.length();
var8 = '0';
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13124;
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
throw new RuntimeException("su/catlean/tt", var10);
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
throw new RuntimeException("su/catlean/tt" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
