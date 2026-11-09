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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.gofra.Flow;

public final class _z extends _g {
@NotNull
public static final _z A;
static final KProperty[] O;
@NotNull
private static final cw I;
@NotNull
private static final cq f;
private static final long a = yz.a(1774116348382627778L, -2803694254164899801L, MethodHandles.lookup().lookupClass()).a(15775833429010L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;

private _z(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 124964005960563L;
super(b<"j">(30662, 1313988021832146105L ^ var4), jt.V(), null, 4, null, var6);
}

private final zh R(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 21472068223551L;
return (zh)I.E(this, var6, O[0]);
}

private final void e(zh var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 110017002887933L;
I.b(this, var4, O[0], var1);
}

private final boolean P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 93511415170012L;
return (Boolean)f.E(this, var3, O[1]);
}

private final void T(long var1, boolean var3) {
var1 = a ^ var1;
long var4 = var1 ^ 104427812744741L;
f.b(this, var4, O[1], var3);
}

@Flow(
priority = -20
)
public final void n(@NotNull MoveEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_z.a J
// 003: ldc2_w 15912762300121
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 102525677164770
// 00d: lxor
// 00e: dup2
// 00f: bipush 8
// 011: lushr
// 012: lstore 4
// 014: dup2
// 015: bipush 56
// 017: lshl
// 018: bipush 56
// 01a: lushr
// 01b: l2i
// 01c: istore 6
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 120091679604892
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 90424087786801
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 30460289849601
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 120309750232281
// 038: lxor
// 039: lstore 13
// 03b: pop2
// 03c: ldc2_w 2752108979722545150
// 03f: lload 2
// 040: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: aload 1
// 046: ldc "e"
// 048: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04b: astore 15
// 04d: aload 0
// 04e: aload 15
// 050: ifnonnull 076
// 053: lload 9
// 055: invokespecial su/catlean/_z.r (J)Z
// 058: ifeq 12e
// 05b: goto 068
// 05e: ldc2_w 2766826279189054731
// 061: lload 2
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: aload 0
// 069: goto 076
// 06c: ldc2_w 2766826279189054731
// 06f: lload 2
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: aload 15
// 078: ifnonnull 0c0
// 07b: lload 4
// 07d: iload 6
// 07f: i2b
// 080: invokespecial su/catlean/_z.R (JB)Lsu/catlean/zh;
// 083: getstatic su/catlean/zh.NCP Lsu/catlean/zh;
// 086: if_acmpne 126
// 089: goto 096
// 08c: ldc2_w 2766826279189054731
// 08f: lload 2
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: aload 1
// 097: bipush 1
// 098: invokevirtual su/catlean/api/event/events/player/MoveEvent.setCancelled (Z)V
// 09b: aload 1
// 09c: dconst_0
// 09d: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 0a0: aload 15
// 0a2: ifnonnull 107
// 0a5: goto 0b2
// 0a8: ldc2_w 2766826279189054731
// 0ab: lload 2
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: aload 0
// 0b3: goto 0c0
// 0b6: ldc2_w 2766826279189054731
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: lload 11
// 0c2: invokespecial su/catlean/_z.P (J)Z
// 0c5: ifeq 12e
// 0c8: new net/minecraft/class_2828$class_2829
// 0cb: dup
// 0cc: lload 13
// 0ce: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d1: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0d4: lload 13
// 0d6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d9: invokevirtual net/minecraft/class_746.method_23318 ()D
// 0dc: lload 13
// 0de: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e1: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0e4: bipush 1
// 0e5: lload 13
// 0e7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ea: getfield net/minecraft/class_746.field_5976 Z
// 0ed: invokespecial net/minecraft/class_2828$class_2829.<init> (DDDZZ)V
// 0f0: checkcast net/minecraft/class_2596
// 0f3: lload 7
// 0f5: dup2_x1
// 0f6: pop2
// 0f7: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 0fa: goto 107
// 0fd: ldc2_w 2766826279189054731
// 100: lload 2
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: aload 15
// 109: ifnull 12e
// 10c: bipush 2
// 10d: anewarray 158
// 110: ldc2_w 2779255468865825964
// 113: lload 2
// 114: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: goto 126
// 11c: ldc2_w 2766826279189054731
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 129: ldc 0.2
// 12b: invokevirtual su/catlean/tq.x (F)V
// 12e: return
}

private final boolean r(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_z.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 109017168416288
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 106865358024839
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w -2130351249279769696
// 18: lload 1
// 19: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: astore 7
// 20: lload 5
// 22: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 25: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 28: aload 7
// 2a: ifnonnull 52
// 2d: ifeq 49
// 30: goto 3d
// 33: ldc2_w -2144925577388277419
// 36: lload 1
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: bipush 0
// 3e: ireturn
// 3f: ldc2_w -2144925577388277419
// 42: lload 1
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: lload 5
// 4b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4e: invokevirtual net/minecraft/class_746.method_23318 ()D
// 51: d2i
// 52: istore 8
// 54: sipush 26485
// 57: ldc2_w 3336531222387866543
// 5a: lload 1
// 5b: lxor
// 5c: invokedynamic x (IJ)I bsm=su/catlean/_z.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: iload 8
// 63: if_icmpge ba
// 66: lload 3
// 67: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 6a: lload 5
// 6c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6f: invokevirtual net/minecraft/class_746.method_23317 ()D
// 72: iload 8
// 74: i2d
// 75: lload 5
// 77: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7a: invokevirtual net/minecraft/class_746.method_23321 ()D
// 7d: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 80: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 83: aload 7
// 85: lload 1
// 86: lconst_0
// 87: lcmp
// 88: ifle ca
// 8b: ifnonnull c8
// 8e: aload 7
// 90: ifnonnull b1
// 93: goto a0
// 96: ldc2_w -2144925577388277419
// 99: lload 1
// 9a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9f: athrow
// a0: ifne b2
// a3: goto b0
// a6: ldc2_w -2144925577388277419
// a9: lload 1
// aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af: athrow
// b0: bipush 0
// b1: ireturn
// b2: iinc 8 -1
// b5: aload 7
// b7: ifnull 54
// ba: lload 1
// bb: lconst_0
// bc: lcmp
// bd: iflt e1
// c0: getstatic su/catlean/dm.h Lsu/catlean/dm;
// c3: invokevirtual su/catlean/dm.o ()D
// c6: dconst_0
// c7: dcmpl
// c8: aload 7
// ca: ifnonnull de
// cd: ifle e1
// d0: goto dd
// d3: ldc2_w -2144925577388277419
// d6: lload 1
// d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// dc: athrow
// dd: bipush 1
// de: goto e2
// e1: bipush 0
// e2: ireturn
}

private static final boolean E() {
long var0 = a ^ 40499929002099L;
long var2 = (var0 ^ 131471029026376L) >>> 8;
int var4 = (int)((var0 ^ 131471029026376L) << 56 >>> 56);

try {
if (A.R(var2, (byte)var4) == zh.NCP) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -4553254147684736095L, var0);
}

return false;
}

static {
long var20 = a ^ 90825023861127L;
long var22 = var20 ^ 59492102211130L;
long var10001 = var20 ^ 2237130062381L;
int var24 = (int)((var20 ^ 2237130062381L) >>> 48);
int var25 = (int)((var20 ^ 2237130062381L) << 16 >>> 48);
int var26 = (int)(var10001 << 32 >>> 32);
long var27 = var20 ^ 131280694131854L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[7];
int var16 = 0;
String var15 = "â\u0080ÿÉã\u0003|¬¤\u0016\u0088\u0095vÓ³j°EÁÿ«\u001d5×3`\u0018\u008e\u0091Â\u001c\u0087LwM\"\u009c\u0097\u0012õ \u001b\u0099³Ò±B\u0092ºûB91Î\u0006ùñe\bb\u001a\u0097hñ0¦DhíÌ\u001eX± '\u0006þÔ4\u0098=ªZÿýVz\u0018\u0007¼»\u0085°Ð¦¡¿ÈDZøÜÕõ>ß\u0010Í\u000b\u0088ö J2¢0\u001eË\u0095[ï\f\u0093 É3t\u000e¥\u008fëµ&ØÐ«C\u000fktbà}>\u0015\u009aïëÇîÚ\u0002GÒø\u0086";
int var17 = "â\u0080ÿÉã\u0003|¬¤\u0016\u0088\u0095vÓ³j°EÁÿ«\u001d5×3`\u0018\u008e\u0091Â\u001c\u0087LwM\"\u009c\u0097\u0012õ \u001b\u0099³Ò±B\u0092ºûB91Î\u0006ùñe\bb\u001a\u0097hñ0¦DhíÌ\u001eX± '\u0006þÔ4\u0098=ªZÿýVz\u0018\u0007¼»\u0085°Ð¦¡¿ÈDZøÜÕõ>ß\u0010Í\u000b\u0088ö J2¢0\u001eË\u0095[ï\f\u0093 É3t\u000e¥\u008fëµ&ØÐ«C\u000fktbà}>\u0015\u009aïëÇîÚ\u0002GÒø\u0086"
.length();
char var14 = '(';
int var31 = -1;

label45:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
byte var35 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var42 = b(var19).intern();
switch (var35) {
case 0:
var18[var16++] = var42;
if ((var31 += var14) >= var17) {
b = var18;
c = new String[7];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "8²\u0091\u000e 2Û(\u008e\u009bYæ\u0017´jE";
int var5 = "8²\u0091\u000e 2Û(\u008e\u009bYæ\u0017´jE".length();
byte var2 = 0;

do {
byte var39 = var2;
var2 += 8;
byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
int var40 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var47 = -1;
var6[var40] = var10004;
} while (var2 < var5);

e = var6;
g = new Integer[2];
KProperty[] var29 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_z.class, b<"j">(17754, 8046208811506378080L ^ var20), b<"j">(489, 2492636486673359318L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_z.class, b<"j">(660, 7130189639271113389L ^ var20), b<"j">(506, 2237093498176102850L ^ var20), 0)
)
};
O = var29;
A = new _z((short)var24, (short)var25, var26);
I = yp.L(A, b<"j">(7998, 5935124984114216706L ^ var20), zh.TIMER, null, null, c<"x">(31418, 5792619023464695137L ^ var20), null, var27);
f = yp.t(A, b<"j">(20915, 6876843764181545352L ^ var20), true, var22, null, _z::E, 4, null);
return;
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var42;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label45;
}

var15 = "|:!bw\u0095Ç+Ä0sV|Ê9\u000608`Ó\u001fq1EmìXívá¼Âñá hi**÷\u0083Å\u0093\u001a4×ÀOj\n$Ùª®s·ò\u001a\u0080\u008e¾\\x¾\u00ad";
var17 = "|:!bw\u0095Ç+Ä0sV|Ê9\u000608`Ó\u001fq1EmìXívá¼Âñá hi**÷\u0083Å\u0093\u001a4×ÀOj\n$Ùª®s·ò\u001a\u0080\u008e¾\\x¾\u00ad".length();
var14 = 16;
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
var35 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8401;
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
throw new RuntimeException("su/catlean/_z", var10);
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
throw new RuntimeException("su/catlean/_z" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16179;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_z", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/_z" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
