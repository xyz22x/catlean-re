package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class fd {
@NotNull
private final _s n;
private final long Z;
private float I;
private long l;
private float s;
private float A;
private boolean b;
private static int J;
private static final long a = yz.a(4273794009832625751L, 2453618424043736318L, MethodHandles.lookup().lookupClass()).a(151979130651768L);
private static final String c;

public fd(@NotNull _s easing, long ms, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(easing, c);
super();
this.n = easing;
this.Z = ms;
this.l = zf.A();
}

public final float a() {
return this.I;
}

public final void A(float <set-?>) {
this.I = <set-?>;
}

public final boolean x() {
return this.b;
}

public final void N(boolean <set-?>) {
this.b = <set-?>;
}

public final void B(long a, float to) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/fd.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: ldc2_w 5248161787060629231
// 009: lload 1
// 00a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: istore 4
// 011: aload 0
// 012: getfield su/catlean/fd.A F
// 015: fload 3
// 016: fcmpg
// 017: iload 4
// 019: ifne 02d
// 01c: ifne 030
// 01f: goto 02c
// 022: ldc2_w 5242934177456635229
// 025: lload 1
// 026: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02b: athrow
// 02c: bipush 1
// 02d: goto 031
// 030: bipush 0
// 031: lload 1
// 032: lconst_0
// 033: lcmp
// 034: ifle 04b
// 037: ifne 05b
// 03a: aload 0
// 03b: fload 3
// 03c: putfield su/catlean/fd.A F
// 03f: aload 0
// 040: lload 1
// 041: lconst_0
// 042: lcmp
// 043: iflt 0bd
// 046: invokevirtual su/catlean/fd.j ()V
// 049: iload 4
// 04b: ifeq 0bc
// 04e: goto 05b
// 051: ldc2_w 5242934177456635229
// 054: lload 1
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 0
// 05c: invokestatic su/catlean/zf.A ()J
// 05f: aload 0
// 060: getfield su/catlean/fd.Z J
// 063: lsub
// 064: aload 0
// 065: getfield su/catlean/fd.l J
// 068: lcmp
// 069: iload 4
// 06b: ifne 08c
// 06e: goto 07b
// 071: ldc2_w 5242934177456635229
// 074: lload 1
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: ifle 08f
// 07e: goto 08b
// 081: ldc2_w 5242934177456635229
// 084: lload 1
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: bipush 1
// 08c: goto 090
// 08f: bipush 0
// 090: putfield su/catlean/fd.b Z
// 093: aload 0
// 094: iload 4
// 096: ifne 0da
// 099: getfield su/catlean/fd.b Z
// 09c: ifeq 0bc
// 09f: goto 0ac
// 0a2: ldc2_w 5242934177456635229
// 0a5: lload 1
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: aload 0
// 0ad: fload 3
// 0ae: putfield su/catlean/fd.I F
// 0b1: return
// 0b2: ldc2_w 5242934177456635229
// 0b5: lload 1
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: aload 0
// 0bd: getfield su/catlean/fd.n Lsu/catlean/_s;
// 0c0: invokevirtual su/catlean/_s.a ()Lkotlin/jvm/functions/Function1;
// 0c3: invokestatic su/catlean/zf.A ()J
// 0c6: aload 0
// 0c7: getfield su/catlean/fd.l J
// 0ca: lsub
// 0cb: l2d
// 0cc: aload 0
// 0cd: getfield su/catlean/fd.Z J
// 0d0: l2d
// 0d1: ddiv
// 0d2: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 0d5: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 0da: checkcast java/lang/Number
// 0dd: invokevirtual java/lang/Number.doubleValue ()D
// 0e0: dstore 5
// 0e2: aload 0
// 0e3: aload 0
// 0e4: getfield su/catlean/fd.I F
// 0e7: iload 4
// 0e9: ifne 126
// 0ec: aload 0
// 0ed: getfield su/catlean/fd.A F
// 0f0: fcmpl
// 0f1: ifle 122
// 0f4: goto 101
// 0f7: ldc2_w 5242934177456635229
// 0fa: lload 1
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: aload 0
// 102: getfield su/catlean/fd.s F
// 105: f2d
// 106: aload 0
// 107: getfield su/catlean/fd.s F
// 10a: aload 0
// 10b: getfield su/catlean/fd.A F
// 10e: fsub
// 10f: f2d
// 110: dload 5
// 112: dmul
// 113: dsub
// 114: d2f
// 115: goto 136
// 118: ldc2_w 5242934177456635229
// 11b: lload 1
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: aload 0
// 123: getfield su/catlean/fd.s F
// 126: f2d
// 127: aload 0
// 128: getfield su/catlean/fd.A F
// 12b: aload 0
// 12c: getfield su/catlean/fd.s F
// 12f: fsub
// 130: f2d
// 131: dload 5
// 133: dmul
// 134: dadd
// 135: d2f
// 136: putfield su/catlean/fd.I F
// 139: return
}

public final void P(float value) {
this.l = zf.A();
this.s = value;
this.b = false;
}

public final void j() {
this.P(this.I);
}

public static void S(int var0) {
J = var0;
}

public static int y() {
return J;
}

public static int p() {
int var0 = y();

try {
return var0 == 0 ? 67 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var3 = a ^ 75021589744156L;
if (vm.a<"Å">(-3380637662496525954L, var3) == 0) {
vm.a<"Å">(27, -3362528873721258350L, var3);
}

Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("bÎs\u0090c8¹M".getBytes("ISO-8859-1"));
String var5 = a(var2).intern();
byte var10001 = -1;
c = var5;
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
}
