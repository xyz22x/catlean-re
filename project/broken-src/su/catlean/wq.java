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
import org.jetbrains.annotations.NotNull;

public final class wq {
@NotNull
public static final wq c;
private static final float N = 1.732051F;
private static final float W = 2.236068F;
private static float e;
private static float d;
private static float h;
private static float U;
private static _g[] s;
private static final long a = yz.a(-1196286083931712581L, 8979409605923220942L, MethodHandles.lookup().lookupClass()).a(21342500525128L);
private static final String[] b;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long i;

private wq() {
}

@NotNull
public final _w R(@NotNull _w from, @NotNull _w to, float gravity, float wind, long a, float maxStepIn, float distance) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wq.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 134716646354036
// 00e: lxor
// 00f: lstore 9
// 011: dup2
// 012: ldc2_w 55041281054072
// 015: lxor
// 016: lstore 11
// 018: pop2
// 019: aload 1
// 01a: sipush 3037
// 01d: ldc2_w 8534744889224028610
// 020: lload 5
// 022: lxor
// 023: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/wq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 02b: ldc2_w 6192207300070682785
// 02e: lload 5
// 030: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: aload 2
// 036: sipush 10374
// 039: ldc2_w 2853026782776738456
// 03c: lload 5
// 03e: lxor
// 03f: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/wq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 047: astore 13
// 049: fload 7
// 04b: fstore 14
// 04d: aload 2
// 04e: invokevirtual su/catlean/_w.q ()F
// 051: aload 1
// 052: invokevirtual su/catlean/_w.q ()F
// 055: fsub
// 056: invokestatic net/minecraft/class_3532.method_15393 (F)F
// 059: fstore 15
// 05b: aload 2
// 05c: invokevirtual su/catlean/_w.N ()F
// 05f: aload 1
// 060: invokevirtual su/catlean/_w.N ()F
// 063: fsub
// 064: fstore 16
// 066: fload 15
// 068: f2d
// 069: fload 16
// 06b: f2d
// 06c: invokestatic java/lang/Math.hypot (DD)D
// 06f: d2f
// 070: fstore 17
// 072: fload 17
// 074: ldc 1.5
// 076: fcmpg
// 077: aload 13
// 079: ifnull 0b1
// 07c: ifge 09a
// 07f: goto 08d
// 082: ldc2_w 6155192741507577825
// 085: lload 5
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: aload 1
// 08e: areturn
// 08f: ldc2_w 6155192741507577825
// 092: lload 5
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: getstatic su/catlean/wq.h F
// 09d: ldc 1.732051
// 09f: fdiv
// 0a0: putstatic su/catlean/wq.h F
// 0a3: getstatic su/catlean/wq.U F
// 0a6: ldc 1.732051
// 0a8: fdiv
// 0a9: putstatic su/catlean/wq.U F
// 0ac: fload 17
// 0ae: fload 8
// 0b0: fcmpl
// 0b1: lload 5
// 0b3: lconst_0
// 0b4: lcmp
// 0b5: iflt 150
// 0b8: aload 13
// 0ba: ifnull 150
// 0bd: iflt 138
// 0c0: goto 0ce
// 0c3: ldc2_w 6155192741507577825
// 0c6: lload 5
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: fload 4
// 0d0: fload 17
// 0d2: invokestatic java/lang/Math.min (FF)F
// 0d5: ldc 2.236068
// 0d7: fdiv
// 0d8: fstore 18
// 0da: getstatic su/catlean/wq.h F
// 0dd: ldc -1.0
// 0df: fconst_1
// 0e0: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 0e3: checkcast kotlin/ranges/ClosedRange
// 0e6: lload 9
// 0e8: bipush 0
// 0e9: bipush 2
// 0ea: aconst_null
// 0eb: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 0ee: fload 18
// 0f0: fmul
// 0f1: fadd
// 0f2: putstatic su/catlean/wq.h F
// 0f5: getstatic su/catlean/wq.U F
// 0f8: ldc -1.0
// 0fa: fconst_1
// 0fb: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 0fe: checkcast kotlin/ranges/ClosedRange
// 101: lload 9
// 103: bipush 0
// 104: bipush 2
// 105: aconst_null
// 106: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 109: fload 18
// 10b: fmul
// 10c: fadd
// 10d: putstatic su/catlean/wq.U F
// 110: lload 5
// 112: lconst_0
// 113: lcmp
// 114: ifle 1ac
// 117: aload 13
// 119: ifnonnull 17a
// 11c: bipush 2
// 11d: anewarray 36
// 120: ldc2_w 6166480289872175022
// 123: lload 5
// 125: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: goto 138
// 12d: ldc2_w 6155192741507577825
// 130: lload 5
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: fload 14
// 13a: ldc 3.0
// 13c: aload 13
// 13e: ifnull 177
// 141: fcmpg
// 142: goto 150
// 145: ldc2_w 6155192741507577825
// 148: lload 5
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: ifge 173
// 153: ldc 3.0
// 155: ldc 6.0
// 157: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 15a: checkcast kotlin/ranges/ClosedRange
// 15d: lload 9
// 15f: bipush 0
// 160: bipush 2
// 161: aconst_null
// 162: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 165: goto 178
// 168: ldc2_w 6155192741507577825
// 16b: lload 5
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: fload 14
// 175: ldc 2.236068
// 177: fdiv
// 178: fstore 14
// 17a: getstatic su/catlean/wq.e F
// 17d: getstatic su/catlean/wq.h F
// 180: fload 3
// 181: fload 15
// 183: fmul
// 184: fload 17
// 186: fdiv
// 187: fadd
// 188: fadd
// 189: putstatic su/catlean/wq.e F
// 18c: getstatic su/catlean/wq.d F
// 18f: getstatic su/catlean/wq.U F
// 192: fload 3
// 193: fload 16
// 195: fmul
// 196: fload 17
// 198: fdiv
// 199: fadd
// 19a: fadd
// 19b: putstatic su/catlean/wq.d F
// 19e: getstatic su/catlean/wq.e F
// 1a1: f2d
// 1a2: getstatic su/catlean/wq.d F
// 1a5: f2d
// 1a6: invokestatic java/lang/Math.hypot (DD)D
// 1a9: d2f
// 1aa: fstore 18
// 1ac: fload 18
// 1ae: lload 5
// 1b0: lconst_0
// 1b1: lcmp
// 1b2: iflt 1f6
// 1b5: fload 14
// 1b7: aload 13
// 1b9: ifnull 1f5
// 1bc: fcmpl
// 1bd: ifle 210
// 1c0: goto 1ce
// 1c3: ldc2_w 6155192741507577825
// 1c6: lload 5
// 1c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: athrow
// 1ce: fload 14
// 1d0: fconst_2
// 1d1: fdiv
// 1d2: fconst_0
// 1d3: fconst_1
// 1d4: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 1d7: checkcast kotlin/ranges/ClosedRange
// 1da: lload 9
// 1dc: bipush 0
// 1dd: bipush 2
// 1de: aconst_null
// 1df: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 1e2: fload 14
// 1e4: fmul
// 1e5: fconst_2
// 1e6: fdiv
// 1e7: goto 1f5
// 1ea: ldc2_w 6155192741507577825
// 1ed: lload 5
// 1ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: athrow
// 1f5: fadd
// 1f6: fstore 19
// 1f8: getstatic su/catlean/wq.e F
// 1fb: fload 18
// 1fd: fdiv
// 1fe: fload 19
// 200: fmul
// 201: putstatic su/catlean/wq.e F
// 204: getstatic su/catlean/wq.d F
// 207: fload 18
// 209: fdiv
// 20a: fload 19
// 20c: fmul
// 20d: putstatic su/catlean/wq.d F
// 210: new su/catlean/_w
// 213: dup
// 214: aload 1
// 215: invokevirtual su/catlean/_w.q ()F
// 218: getstatic su/catlean/wq.e F
// 21b: fadd
// 21c: invokestatic net/minecraft/class_3532.method_15393 (F)F
// 21f: aload 1
// 220: invokevirtual su/catlean/_w.N ()F
// 223: getstatic su/catlean/wq.d F
// 226: fadd
// 227: ldc -90.0
// 229: ldc 90.0
// 22b: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 22e: lload 11
// 230: dup2_x1
// 231: pop2
// 232: bipush 0
// 233: aconst_null
// 234: getstatic su/catlean/wq.i J
// 237: l2i
// 238: aconst_null
// 239: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 23c: areturn
}

static {
long var14 = a ^ 59425268682191L;
_g[] var10000 = new _g[4];
vm.a<"Å">(var10000, -5915086150742814455L, var14);
Cipher var5;
Cipher var17 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[2];
int var10 = 0;
String var9 = "¶Ì\u008d,àúR!u6Y?\u000f\u0084\u0017Ò\u0010Sx¯¡1IÈyo\u008c\u0080Ù.\u0095ý»";
int var11 = "¶Ì\u008d,àúR!u6Y?\u000f\u0084\u0017Ò\u0010Sx¯¡1IÈyo\u008c\u0080Ù.\u0095ý»".length();
char var8 = 16;
int var7 = -1;

while (true) {
byte[] var13 = var5.doFinal(var9.substring(++var7, var7 + var8).getBytes("ISO-8859-1"));
String var21 = a(var13).intern();
byte var10001 = -1;
var12[var10++] = var21;
if ((var7 += var8) >= var11) {
b = var12;
f = new String[2];
Cipher var0;
Cipher var18 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -2305366125163185393L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var24 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
i = var24;
c = new wq();
return;
}

var8 = var9.charAt(var7);
}
}

public static void x(_g[] var0) {
s = var0;
}

public static _g[] c() {
return s;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16043;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/wq", var10);
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
f[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/wq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
