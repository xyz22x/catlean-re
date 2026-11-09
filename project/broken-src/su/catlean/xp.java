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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class xp extends f6 {
@NotNull
private s4 q;
@NotNull
private final fd p;
private static final long a = yz.a(6490301495294082611L, 5466949418607035862L, MethodHandles.lookup().lookupClass()).a(123498979073157L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;
private static final long f;

public xp(@NotNull s4 point, int a, short a, char a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 129472521025689L;
Intrinsics.checkNotNullParameter(point, a<"z">(23947, 9025107408032435033L ^ var5));
super();
this.q = point;
this.p = new fd(_s.OUT_QUINT, f, var7);
}

@NotNull
public final s4 s() {
return this.q;
}

public final void J(long a, @NotNull s4 <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"z">(23947, 8391059089925698991L ^ ax));
this.q = <set-?>;
}

@Override
public void o(long a, @NotNull class_332 context, float x, float y, float mouseX, float mouseY) {
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
// 002: ldc2_w 127744779498483
// 005: lxor
// 006: lstore 8
// 008: dup2
// 009: ldc2_w 122872324218116
// 00c: lxor
// 00d: dup2
// 00e: bipush 48
// 010: lushr
// 011: l2i
// 012: istore 10
// 014: dup2
// 015: bipush 16
// 017: lshl
// 018: bipush 48
// 01a: lushr
// 01b: l2i
// 01c: istore 11
// 01e: dup2
// 01f: bipush 32
// 021: lshl
// 022: bipush 32
// 024: lushr
// 025: l2i
// 026: istore 12
// 028: pop2
// 029: dup2
// 02a: ldc2_w 97956880838355
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 15727589290443
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 81101117301204
// 03b: lxor
// 03c: lstore 17
// 03e: dup2
// 03f: ldc2_w 81010294496925
// 042: lxor
// 043: dup2
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 19
// 04a: dup2
// 04b: bipush 16
// 04d: lshl
// 04e: bipush 32
// 050: lushr
// 051: l2i
// 052: istore 20
// 054: dup2
// 055: bipush 48
// 057: lshl
// 058: bipush 48
// 05a: lushr
// 05b: l2i
// 05c: istore 21
// 05e: pop2
// 05f: pop2
// 060: ldc2_w 9052858178404779403
// 063: lload 1
// 064: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: aload 3
// 06a: sipush 23516
// 06d: ldc2_w 2622786892767521461
// 070: lload 1
// 071: lxor
// 072: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/xp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07a: astore 22
// 07c: fload 4
// 07e: fload 6
// 080: fcmpg
// 081: aload 22
// 083: ifnonnull 0ab
// 086: ifgt 0d2
// 089: goto 096
// 08c: ldc2_w 9025479759870545584
// 08f: lload 1
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: fload 6
// 098: fload 4
// 09a: ldc 70.0
// 09c: fadd
// 09d: fcmpg
// 09e: goto 0ab
// 0a1: ldc2_w 9025479759870545584
// 0a4: lload 1
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: aload 22
// 0ad: ifnonnull 0cf
// 0b0: ifgt 0ce
// 0b3: goto 0c0
// 0b6: ldc2_w 9025479759870545584
// 0b9: lload 1
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: bipush 1
// 0c1: goto 0d3
// 0c4: ldc2_w 9025479759870545584
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: bipush 0
// 0cf: goto 0d3
// 0d2: bipush 0
// 0d3: lload 1
// 0d4: lconst_0
// 0d5: lcmp
// 0d6: iflt 0e1
// 0d9: ifeq 15d
// 0dc: fload 5
// 0de: fload 7
// 0e0: fcmpg
// 0e1: aload 22
// 0e3: lload 1
// 0e4: lconst_0
// 0e5: lcmp
// 0e6: ifle 120
// 0e9: ifnonnull 11e
// 0ec: goto 0f9
// 0ef: ldc2_w 9025479759870545584
// 0f2: lload 1
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: ifgt 145
// 0fc: goto 109
// 0ff: ldc2_w 9025479759870545584
// 102: lload 1
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: fload 7
// 10b: fload 5
// 10d: ldc 25.0
// 10f: fadd
// 110: fcmpg
// 111: goto 11e
// 114: ldc2_w 9025479759870545584
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: aload 22
// 120: ifnonnull 142
// 123: ifgt 141
// 126: goto 133
// 129: ldc2_w 9025479759870545584
// 12c: lload 1
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: bipush 1
// 134: goto 146
// 137: ldc2_w 9025479759870545584
// 13a: lload 1
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: bipush 0
// 142: goto 146
// 145: bipush 0
// 146: lload 1
// 147: lconst_0
// 148: lcmp
// 149: ifle 150
// 14c: ifeq 15d
// 14f: bipush 1
// 150: goto 15e
// 153: ldc2_w 9025479759870545584
// 156: lload 1
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: bipush 0
// 15e: istore 23
// 160: aload 0
// 161: getfield su/catlean/xp.p Lsu/catlean/fd;
// 164: iload 23
// 166: ifeq 177
// 169: fconst_1
// 16a: goto 178
// 16d: ldc2_w 9025479759870545584
// 170: lload 1
// 171: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: athrow
// 177: fconst_0
// 178: lload 13
// 17a: dup2_x1
// 17b: pop2
// 17c: invokevirtual su/catlean/fd.B (JF)V
// 17f: lload 1
// 180: lconst_0
// 181: lcmp
// 182: ifle 1a1
// 185: iload 23
// 187: ifeq 1a1
// 18a: getstatic su/catlean/i7.j Lsu/catlean/i7;
// 18d: aload 0
// 18e: checkcast su/catlean/f6
// 191: invokevirtual su/catlean/i7.f (Lsu/catlean/f6;)V
// 194: goto 1a1
// 197: ldc2_w 9025479759870545584
// 19a: lload 1
// 19b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: athrow
// 1a1: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1a4: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1a7: invokevirtual su/catlean/jh.i ()Ljava/awt/Color;
// 1aa: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1ad: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 1b0: aload 0
// 1b1: getfield su/catlean/xp.q Lsu/catlean/s4;
// 1b4: invokevirtual su/catlean/s4.g ()Z
// 1b7: ifeq 1c8
// 1ba: fconst_1
// 1bb: goto 1c9
// 1be: ldc2_w 9025479759870545584
// 1c1: lload 1
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: athrow
// 1c8: fconst_0
// 1c9: lload 8
// 1cb: dup2_x2
// 1cc: pop2
// 1cd: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 1d0: astore 24
// 1d2: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1d5: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1d8: invokevirtual su/catlean/jh.h ()Ljava/awt/Color;
// 1db: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1de: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 1e1: aload 0
// 1e2: getfield su/catlean/xp.q Lsu/catlean/s4;
// 1e5: invokevirtual su/catlean/s4.g ()Z
// 1e8: ifeq 1f9
// 1eb: fconst_1
// 1ec: goto 1fa
// 1ef: ldc2_w 9025479759870545584
// 1f2: lload 1
// 1f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f8: athrow
// 1f9: fconst_0
// 1fa: lload 8
// 1fc: dup2_x2
// 1fd: pop2
// 1fe: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 201: astore 25
// 203: aload 3
// 204: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 207: dup
// 208: sipush 18585
// 20b: ldc2_w 2643210503606041074
// 20e: lload 1
// 20f: lxor
// 210: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/xp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 215: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 218: fload 4
// 21a: ldc 4.0
// 21c: fadd
// 21d: iload 10
// 21f: i2c
// 220: swap
// 221: fload 5
// 223: ldc 70.0
// 225: ldc 25.0
// 227: fconst_2
// 228: ldc 2.5
// 22a: aload 0
// 22b: getfield su/catlean/xp.p Lsu/catlean/fd;
// 22e: invokevirtual su/catlean/fd.a ()F
// 231: fadd
// 232: fconst_1
// 233: fconst_1
// 234: aload 24
// 236: aload 25
// 238: fconst_0
// 239: iload 11
// 23b: i2s
// 23c: fconst_0
// 23d: iload 12
// 23f: fconst_0
// 240: getstatic su/catlean/xp.e J
// 243: l2i
// 244: aconst_null
// 245: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 248: lload 17
// 24a: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 24d: aload 3
// 24e: aload 0
// 24f: getfield su/catlean/xp.q Lsu/catlean/s4;
// 252: invokevirtual su/catlean/s4.e ()Ljava/lang/String;
// 255: fload 4
// 257: ldc 6.0
// 259: fadd
// 25a: lload 15
// 25c: dup2_x1
// 25d: pop2
// 25e: fload 5
// 260: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 263: dup
// 264: sipush 691
// 267: ldc2_w 4318775471472194526
// 26a: lload 1
// 26b: lxor
// 26c: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/xp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 271: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 274: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 277: lload 17
// 279: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 27c: aload 3
// 27d: aload 0
// 27e: getfield su/catlean/xp.q Lsu/catlean/s4;
// 281: invokevirtual su/catlean/s4.h ()Ljava/lang/String;
// 284: fload 4
// 286: ldc 6.0
// 288: fadd
// 289: lload 15
// 28b: dup2_x1
// 28c: pop2
// 28d: fload 5
// 28f: ldc 11.0
// 291: fadd
// 292: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 295: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 298: dup
// 299: sipush 22274
// 29c: ldc2_w 8487955565528147560
// 29f: lload 1
// 2a0: lxor
// 2a1: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/xp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2a9: iload 19
// 2ab: i2c
// 2ac: iload 20
// 2ae: ldc 0.7
// 2b0: iload 21
// 2b2: i2s
// 2b3: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 2b6: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 2b9: return
}

@Override
public boolean P(float x, float y, int button, long a) {
return false;
}

static {
long var10 = a ^ 14556419915057L;
Cipher var12;
Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var10 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var13 = 1; var13 < 8; var13++) {
var10003[var13] = (byte)(var10 << var13 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var19 = new String[6];
int var17 = 0;
String var16 = "»\u0014å\u007f\u001b*iL\b×\u008f«\u0095à æ\u0010\u0017÷gU_\u0087\u0092+Í^.I\u009eB\u0015!\u0010\u0015õÂ2\u0088BµÄÄ]úl¥Ë@B çç¸\t\u008dÎ\u0014#EJí*ð£\u0017ð´y\u000b¤ó#üoT1G±ý\u0087\u0085©";
int var18 = "»\u0014å\u007f\u001b*iL\b×\u008f«\u0095à æ\u0010\u0017÷gU_\u0087\u0092+Í^.I\u009eB\u0015!\u0010\u0015õÂ2\u0088BµÄÄ]úl¥Ë@B çç¸\t\u008dÎ\u0014#EJí*ð£\u0017ð´y\u000b¤ó#üoT1G±ý\u0087\u0085©"
.length();
char var15 = 16;
int var22 = -1;

label49:
while (true) {
String var23 = var16.substring(++var22, var22 + var15);
byte var10001 = -1;

while (true) {
byte[] var20 = var12.doFinal(var23.getBytes("ISO-8859-1"));
String var33 = a(var20).intern();
switch (var10001) {
case 0:
var19[var17++] = var33;
if ((var22 += var15) >= var18) {
b = var19;
c = new String[6];
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var10 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var10 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var7 = -2353540955472735220L;
byte[] var9 = var5.doFinal(
new byte[]{
(byte)(var7 >>> 56), (byte)(var7 >>> 48), (byte)(var7 >>> 40), (byte)(var7 >>> 32), (byte)(var7 >>> 24), (byte)(var7 >>> 16), (byte)(var7 >>> 8), (byte)var7
}
);
long var37 = (var9[0] & 255L) << 56
| (var9[1] & 255L) << 48
| (var9[2] & 255L) << 40
| (var9[3] & 255L) << 32
| (var9[4] & 255L) << 24
| (var9[5] & 255L) << 16
| (var9[6] & 255L) << 8
| var9[7] & 255L;
var10001 = -1;
e = var37;
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var10 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var10 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 138518590467711162L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var39 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
f = var39;
return;
}

var15 = var16.charAt(var22);
break;
default:
var19[var17++] = var33;
if ((var22 += var15) < var18) {
var15 = var16.charAt(var22);
continue label49;
}

var16 = "á«ÜY\u0013Ù\u0090$%Ðg[\u0088\u008e~\u009b\u0010<Ð\u0002¬Òá²³'Oµf¡¼\u0007ÿ";
var18 = "á«ÜY\u0013Ù\u0090$%Ðg[\u0088\u008e~\u009b\u0010<Ð\u0002¬Òá²³'Oµf¡¼\u0007ÿ".length();
var15 = 16;
var22 = -1;
}

var23 = var16.substring(++var22, var22 + var15);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19855;
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
throw new RuntimeException("su/catlean/xp", var10);
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
throw new RuntimeException("su/catlean/xp" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
