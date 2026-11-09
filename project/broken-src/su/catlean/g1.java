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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class g1 extends gf {
@NotNull
public static final g1 I;
static final KProperty[] U;
@NotNull
private static final cq H;
@NotNull
private static final cq R;
private static final long a = yz.a(2932481237323591918L, -8199712963885439176L, MethodHandles.lookup().lookupClass()).a(236653600314699L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private g1(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 64954857264638L;
int var3 = (int)((var1 ^ 64954857264638L) >>> 48);
int var4 = (int)((var1 ^ 64954857264638L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"l">(5407, 7570321794831986472L ^ var1), (char)var5);
}

private final boolean j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 10283319505877L;
return (Boolean)H.E(this, var3, U[0]);
}

private final void K(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 93567777973817L;
H.b(this, var4, U[0], var1);
}

private final boolean M(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 112232825923455L;
return (Boolean)R.E(this, var3, U[1]);
}

private final void R(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 127320103373772L;
R.b(this, var4, U[1], var1);
}

@Override
public void h(long a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 116853176505585
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 57814021407262
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 53664238460761
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 105037015370739
// 01a: lxor
// 01b: lstore 10
// 01d: dup2
// 01e: ldc2_w 109580710346244
// 021: lxor
// 022: lstore 12
// 024: pop2
// 025: aload 3
// 026: sipush 29797
// 029: ldc2_w 8656789545073523776
// 02c: lload 1
// 02d: lxor
// 02e: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/g1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 036: ldc2_w -5990705277528627281
// 039: lload 1
// 03a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 042: lload 6
// 044: invokevirtual su/catlean/nf.H (J)Z
// 047: istore 15
// 049: istore 14
// 04b: iload 15
// 04d: ifne 05f
// 050: ldc 0.125
// 052: goto 061
// 055: ldc2_w -6027214729114045493
// 058: lload 1
// 059: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: athrow
// 05f: ldc 8.0
// 061: fstore 16
// 063: aload 0
// 064: lload 10
// 066: invokespecial su/catlean/g1.j (J)Z
// 069: iload 14
// 06b: lload 1
// 06c: lconst_0
// 06d: lcmp
// 06e: ifle 099
// 071: ifeq 097
// 074: ifeq 0d4
// 077: goto 084
// 07a: ldc2_w -6027214729114045493
// 07d: lload 1
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: aload 0
// 085: lload 8
// 087: invokespecial su/catlean/g1.M (J)Z
// 08a: goto 097
// 08d: ldc2_w -6027214729114045493
// 090: lload 1
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: iload 14
// 099: ifeq 0d1
// 09c: ifeq 0d0
// 09f: goto 0ac
// 0a2: ldc2_w -6027214729114045493
// 0a5: lload 1
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: iload 15
// 0ae: iload 14
// 0b0: ifeq 0d1
// 0b3: goto 0c0
// 0b6: ldc2_w -6027214729114045493
// 0b9: lload 1
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: ifeq 0d4
// 0c3: goto 0d0
// 0c6: ldc2_w -6027214729114045493
// 0c9: lload 1
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: bipush 1
// 0d1: goto 0d5
// 0d4: bipush 0
// 0d5: istore 17
// 0d7: aconst_null
// 0d8: astore 18
// 0da: lload 12
// 0dc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0df: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0e2: d2i
// 0e3: lload 12
// 0e5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e8: invokevirtual net/minecraft/class_746.method_23318 ()D
// 0eb: d2i
// 0ec: lload 12
// 0ee: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f1: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0f4: d2i
// 0f5: sipush 1837
// 0f8: ldc2_w 6534631789202951943
// 0fb: lload 1
// 0fc: lxor
// 0fd: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/g1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: dup_x2
// 103: pop
// 104: sipush 17847
// 107: ldc2_w 8532233441951649180
// 10a: lload 1
// 10b: lxor
// 10c: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/g1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: swap
// 112: invokedynamic makeConcatWithConstants (ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 117: astore 18
// 119: aconst_null
// 11a: astore 19
// 11c: lload 12
// 11e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 121: invokevirtual net/minecraft/class_746.method_23317 ()D
// 124: fload 16
// 126: f2d
// 127: dmul
// 128: d2i
// 129: lload 12
// 12b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12e: invokevirtual net/minecraft/class_746.method_23321 ()D
// 131: fload 16
// 133: f2d
// 134: dmul
// 135: d2i
// 136: ldc "["
// 138: dup_x2
// 139: pop
// 13a: sipush 17847
// 13d: ldc2_w 8532233441951649180
// 140: lload 1
// 141: lxor
// 142: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/g1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: swap
// 148: ldc "]"
// 14a: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 14f: astore 19
// 151: lload 12
// 153: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 156: getfield net/minecraft/class_746.field_6012 I
// 159: sipush 17796
// 15c: ldc2_w 8893892160909735491
// 15f: lload 1
// 160: lxor
// 161: invokedynamic v (IJ)I bsm=su/catlean/g1.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: lload 1
// 167: lconst_0
// 168: lcmp
// 169: ifle 1b5
// 16c: iload 14
// 16e: ifeq 1b1
// 171: if_icmpge 1d8
// 174: goto 181
// 177: ldc2_w -6027214729114045493
// 17a: lload 1
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: sipush 2689
// 184: ldc2_w 3010005990145308997
// 187: lload 1
// 188: lxor
// 189: invokedynamic v (IJ)I bsm=su/catlean/g1.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: lload 12
// 190: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 193: getfield net/minecraft/class_746.field_6012 I
// 196: isub
// 197: sipush 22686
// 19a: ldc2_w 3726213899413515099
// 19d: lload 1
// 19e: lxor
// 19f: invokedynamic v (IJ)I bsm=su/catlean/g1.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: goto 1b1
// 1a7: ldc2_w -6027214729114045493
// 1aa: lload 1
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: idiv
// 1b2: sipush 24119
// 1b5: ldc2_w 8788231123591140890
// 1b8: lload 1
// 1b9: lxor
// 1ba: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/g1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: swap
// 1c0: sipush 21319
// 1c3: ldc2_w 6048005466953325417
// 1c6: lload 1
// 1c7: lxor
// 1c8: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/g1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 1d2: astore 18
// 1d4: ldc ""
// 1d6: astore 19
// 1d8: new java/lang/StringBuilder
// 1db: dup
// 1dc: invokespecial java/lang/StringBuilder.<init> ()V
// 1df: astore 21
// 1e1: aload 21
// 1e3: astore 22
// 1e5: bipush 0
// 1e6: istore 23
// 1e8: aload 22
// 1ea: aload 18
// 1ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 1ef: lload 1
// 1f0: lconst_0
// 1f1: lcmp
// 1f2: iflt 22a
// 1f5: pop
// 1f6: iload 14
// 1f8: ifeq 228
// 1fb: iload 17
// 1fd: ifeq 227
// 200: goto 20d
// 203: ldc2_w -6027214729114045493
// 206: lload 1
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: aload 22
// 20f: aload 19
// 211: invokedynamic makeConcatWithConstants (Ljava/lang/Object;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ " \u0001" ]
// 216: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 219: pop
// 21a: goto 227
// 21d: ldc2_w -6027214729114045493
// 220: lload 1
// 221: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 226: athrow
// 227: nop
// 228: aload 21
// 22a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
// 22d: astore 20
// 22f: aload 0
// 230: aload 3
// 231: lload 4
// 233: aload 20
// 235: invokevirtual su/catlean/g1.X (Lnet/minecraft/class_332;JLjava/lang/String;)V
// 238: return
}

static {
long var20 = a ^ 53700821519339L;
long var22 = var20 ^ 73606579508336L;
long var24 = var20 ^ 89523569874078L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[12];
int var16 = 0;
String var15 = "DW\nÃp^¡\u009c¾ÖÕ6/ù\bþN»à{û\\T\"\u008by\u0080qBOå¿\u00108[\u007föÉÊ<\u0085\u009c\tYÅ´(ò.\u0018:ï\u007fÄé\u0010HE[ÿ\u008bÕu(C(\u009a\u001d\\Eì±ãî >\u008eQLÀ\nòxuÎ£\u0017\nøîcI9½\u0088x\u001bèÏ\u0080<õ»ï\u0007c¬ {£li.Àª\u001e\b\u009aÕ\u0005^($+\u008cÌs3J;nwuè¸@>X@\u0087 \u008d\u001b\u0015Ç\u000fD\u001dÒr\"\nîÔ\"7\u0085Ç\\Ñüqsn¹U<DÐã!«º\u0010Ù£\u0013á?ºLÛ~\u0098½¯áðÛ#\u0010\u007f\u0095ò\u0003\u0019Ö&Ü&½(×+q\u008e° 9p\u0090°Sà=Û\u000bYw¾i¥¡\u001d2\u0002ÕÖ«´üÆ²ñ\u0012jk\u001cL'\u0010ÔØÜ¢\r±½=âÁ\u0087WÜQ\u0012$";
int var17 = "DW\nÃp^¡\u009c¾ÖÕ6/ù\bþN»à{û\\T\"\u008by\u0080qBOå¿\u00108[\u007föÉÊ<\u0085\u009c\tYÅ´(ò.\u0018:ï\u007fÄé\u0010HE[ÿ\u008bÕu(C(\u009a\u001d\\Eì±ãî >\u008eQLÀ\nòxuÎ£\u0017\nøîcI9½\u0088x\u001bèÏ\u0080<õ»ï\u0007c¬ {£li.Àª\u001e\b\u009aÕ\u0005^($+\u008cÌs3J;nwuè¸@>X@\u0087 \u008d\u001b\u0015Ç\u000fD\u001dÒr\"\nîÔ\"7\u0085Ç\\Ñüqsn¹U<DÐã!«º\u0010Ù£\u0013á?ºLÛ~\u0098½¯áðÛ#\u0010\u007f\u0095ò\u0003\u0019Ö&Ü&½(×+q\u008e° 9p\u0090°Sà=Û\u000bYw¾i¥¡\u001d2\u0002ÕÖ«´üÆ²ñ\u0012jk\u001cL'\u0010ÔØÜ¢\r±½=âÁ\u0087WÜQ\u0012$"
.length();
char var14 = ' ';
int var29 = -1;

label54:
while (true) {
String var30 = var15.substring(++var29, var29 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
String var41 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var41;
if ((var29 += var14) >= var17) {
b = var18;
c = new String[12];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "e\u0000ª*Æke%`ÓlT\"9\u0015\u0013)\u0085ùÉëü'v";
int var5 = "e\u0000ª*Æke%`ÓlT\"9\u0015\u0013)\u0085ùÉëü'v".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var33 = var6;
var10001 = var3++;
long var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var48 = -1;

while (true) {
long var8 = var45;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var50 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var48) {
case 0:
var33[var10001] = var50;
if (var2 >= var5) {
g = var6;
h = new Integer[5];
KProperty[] var26 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(g1.class, b<"l">(23150, 3857686521071512963L ^ var20), b<"l">(4538, 1658629356760196693L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(g1.class, b<"l">(21585, 3032755557176484791L ^ var20), b<"l">(6790, 5085829595387620707L ^ var20), 0)
)
};
U = var26;
I = new g1(var24);
H = yp.t(I, b<"l">(31135, 294510800926510718L ^ var20), true, var22, null, null, d<"v">(7643, 7635478390123041234L ^ var20), null);
R = yp.t(I, b<"l">(7289, 6623364054636718999L ^ var20), true, var22, null, null, d<"v">(27549, 7713490435363366802L ^ var20), null);
return;
}
break;
default:
var33[var10001] = var50;
if (var2 < var5) {
continue label36;
}

var4 = "/ÿ\n\u001e\u0097øRbô\u0095Ç0²\u0088\u0081ö";
var5 = "/ÿ\n\u001e\u0097øRbô\u0095Ç0²\u0088\u0081ö".length();
var2 = 0;
}

byte var39 = var2;
var2 += 8;
var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
var33 = var6;
var10001 = var3++;
var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var48 = 0;
}
}
}

var14 = var15.charAt(var29);
break;
default:
var18[var16++] = var41;
if ((var29 += var14) < var17) {
var14 = var15.charAt(var29);
continue label54;
}

var15 = "¡ë1L¹_\\ó§lÿ¾{6¨Ü¿>½Õ«hÆoY²Zò}ºu\u007fWÕyÚN¬n6\u0018ïã\u0006\u0003p±ù\u0003S\u0094Ý\u0082ÜY\f?Ô\u008e*ã¬pã\u0093";
var17 = "¡ë1L¹_\\ó§lÿ¾{6¨Ü¿>½Õ«hÆoY²Zò}ºu\u007fWÕyÚN¬n6\u0018ïã\u0006\u0003p±ù\u0003S\u0094Ý\u0082ÜY\f?Ô\u008e*ã¬pã\u0093".length();
var14 = '(';
var29 = -1;
}

var30 = var15.substring(++var29, var29 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25927;
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
throw new RuntimeException("su/catlean/g1", var10);
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
throw new RuntimeException("su/catlean/g1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7855;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/g1", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/g1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
