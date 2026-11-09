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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class gv extends gf {
@NotNull
public static final gv N;
private static final long a = yz.a(3143732170293056007L, -2361134978586770025L, MethodHandles.lookup().lookupClass()).a(120203402105923L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long g;

private gv(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 23245690492084L;
int var3 = (int)((var1 ^ 23245690492084L) >>> 48);
int var4 = (int)((var1 ^ 23245690492084L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"r">(27384, 839162776455131836L ^ var1), (char)var5);
}

@Override
public void h(long a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 116853176505585
// 005: lxor
// 006: lstore 4
// 008: pop2
// 009: ldc2_w -5990705277528627281
// 00c: lload 1
// 00d: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 012: aload 3
// 013: sipush 8706
// 016: ldc2_w 2289915037839313168
// 019: lload 1
// 01a: lxor
// 01b: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/gv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 020: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 023: istore 6
// 025: aload 0
// 026: aload 3
// 027: getstatic su/catlean/_h.G Lsu/catlean/_h;
// 02a: invokevirtual su/catlean/_h.q ()I
// 02d: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 030: invokevirtual su/catlean/ux.Nx ()J
// 033: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 036: invokevirtual su/catlean/ux.Ng ()J
// 039: iload 6
// 03b: ifeq 080
// 03e: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 041: invokevirtual su/catlean/ux.K ()Ljava/util/concurrent/atomic/AtomicReference;
// 044: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
// 047: checkcast su/catlean/mm
// 04a: dup
// 04b: ifnull 07f
// 04e: goto 05b
// 051: ldc2_w -6008404541806822470
// 054: lload 1
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 05e: dup
// 05f: ifnull 07f
// 062: goto 06f
// 065: ldc2_w -6008404541806822470
// 068: lload 1
// 069: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: athrow
// 06f: invokevirtual su/catlean/t_.c ()F
// 072: goto 081
// 075: ldc2_w -6008404541806822470
// 078: lload 1
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: pop
// 080: fconst_0
// 081: lload 1
// 082: lconst_0
// 083: lcmp
// 084: iflt 0bc
// 087: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 08a: invokevirtual su/catlean/ux.K ()Ljava/util/concurrent/atomic/AtomicReference;
// 08d: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
// 090: checkcast su/catlean/mm
// 093: dup
// 094: ifnull 0bb
// 097: invokevirtual su/catlean/mm.Y ()Lsu/catlean/t_;
// 09a: dup
// 09b: ifnull 0bb
// 09e: goto 0ab
// 0a1: ldc2_w -6008404541806822470
// 0a4: lload 1
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: invokevirtual su/catlean/t_.i ()F
// 0ae: goto 0bd
// 0b1: ldc2_w -6008404541806822470
// 0b4: lload 1
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: pop
// 0bc: fconst_0
// 0bd: fdiv
// 0be: getstatic su/catlean/gv.g J
// 0c1: l2i
// 0c2: i2f
// 0c3: fmul
// 0c4: f2i
// 0c5: i2f
// 0c6: ldc 10.0
// 0c8: fdiv
// 0c9: fstore 7
// 0cb: lstore 8
// 0cd: lstore 10
// 0cf: sipush 25969
// 0d2: ldc2_w 2527378601109917280
// 0d5: lload 1
// 0d6: lxor
// 0d7: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/gv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: lload 10
// 0de: sipush 4427
// 0e1: ldc2_w 8649979812293507677
// 0e4: lload 1
// 0e5: lxor
// 0e6: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/gv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: lload 8
// 0ed: sipush 4091
// 0f0: ldc2_w 3379043093847237864
// 0f3: lload 1
// 0f4: lxor
// 0f5: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/gv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: fload 7
// 0fc: sipush 6002
// 0ff: ldc2_w 8790585915355659365
// 102: lload 1
// 103: lxor
// 104: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/gv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: invokedynamic makeConcatWithConstants (ILjava/lang/String;JLjava/lang/String;JLjava/lang/String;FLjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" ]
// 10e: lload 4
// 110: dup2_x1
// 111: pop2
// 112: invokevirtual su/catlean/gv.X (Lnet/minecraft/class_332;JLjava/lang/String;)V
// 115: return
}

static {
long var14 = a ^ 67538741005062L;
long var16 = var14 ^ 126335463986489L;
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[6];
int var10 = 0;
String var9 = "ÌËX\u008c\u008bBYÿY\u000ef·\u001f\u0087G¥\u0010«H÷ñöê·\u00074\u0089¦]]$Vª\u0010°Ë;,\u0096Üàðí\u0089<InçÉÑ0ýB\u001fî¿y¨ à«ÃÙ\u0097;\u0092}\u0017$Ã°a4¸\u0088»\u001e_Ú¡\u00ad+èlJÉ\u0085\u0012\u0090Tv\u0015\u0000\u0004¦\náCs";
int var11 = "ÌËX\u008c\u008bBYÿY\u000ef·\u001f\u0087G¥\u0010«H÷ñöê·\u00074\u0089¦]]$Vª\u0010°Ë;,\u0096Üàðí\u0089<InçÉÑ0ýB\u001fî¿y¨ à«ÃÙ\u0097;\u0092}\u0017$Ã°a4¸\u0088»\u001e_Ú¡\u00ad+èlJÉ\u0085\u0012\u0090Tv\u0015\u0000\u0004¦\náCs"
.length();
char var8 = 16;
int var19 = -1;

label37:
while (true) {
String var20 = var9.substring(++var19, var19 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var20.getBytes("ISO-8859-1"));
String var28 = b(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var28;
if ((var19 += var8) >= var11) {
b = var12;
c = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 5558868133352255119L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var32 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
g = var32;
N = new gv(var16);
return;
}

var8 = var9.charAt(var19);
break;
default:
var12[var10++] = var28;
if ((var19 += var8) < var11) {
var8 = var9.charAt(var19);
continue label37;
}

var9 = "=·&ÑkÍ\u0018/ô]\u0007\u009dtÑsÈ\u0018)\u009e\u0007=v\u001dæËÌÐêó\u0016eÌ\u00976\u0019\u0085ëfz6É";
var11 = "=·&ÑkÍ\u0018/ô]\u0007\u009dtÑsÈ\u0018)\u009e\u0007=v\u001dæËÌÐêó\u0016eÌ\u00976\u0019\u0085ëfz6É".length();
var8 = 16;
var19 = -1;
}

var20 = var9.substring(++var19, var19 + var8);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String b(byte[] var0) {
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18040;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/gv", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/gv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
