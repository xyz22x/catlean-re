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
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class wo {
@NotNull
private final class_1792 A;
private final int g;
private final int d;
private final int M;
private static final long a = yz.a(8455087992799926054L, -4395316051070275781L, MethodHandles.lookup().lookupClass()).a(60683251114727L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map i;

public wo(long a, @NotNull class_1792 item, int price, int lowestPrice, int id) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(item, a<"q">(25785, 8010323072718606853L ^ ax));
super();
this.A = item;
this.g = price;
this.d = lowestPrice;
this.M = id;
}

@NotNull
public final class_1792 S() {
return this.A;
}

public final int G() {
return this.g;
}

public final int W() {
return this.d;
}

public final int Y() {
return this.M;
}

@NotNull
public final class_1792 o() {
return this.A;
}

public final int g() {
return this.g;
}

public final int I() {
return this.d;
}

public final int s() {
return this.M;
}

@NotNull
public final wo h(@NotNull class_1792 item, int price, long a, int lowestPrice, int id) {
ax = a ^ ax;
long var7 = ax ^ 138496289448377L;
Intrinsics.checkNotNullParameter(item, a<"q">(3877, 1151173970470657394L ^ ax));
return new wo(var7, item, price, lowestPrice, id);
}

public static wo R(wo param0, class_1792 param1, int param2, int param3, char param4, int param5, int param6, int param7, Object param8, int param9) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 3
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 4
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 32
// 00d: lushr
// 00e: lor
// 00f: iload 9
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/wo.a J
// 01c: lxor
// 01d: lstore 10
// 01f: lload 10
// 021: dup2
// 022: ldc2_w 102890099106765
// 025: lxor
// 026: lstore 12
// 028: pop2
// 029: ldc2_w 2319282930472959921
// 02c: lload 10
// 02e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: astore 14
// 035: iload 7
// 037: bipush 1
// 038: iand
// 039: aload 14
// 03b: ifnonnull 058
// 03e: ifeq 054
// 041: goto 04f
// 044: ldc2_w 2374617335419004867
// 047: lload 10
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: aload 0
// 050: getfield su/catlean/wo.A Lnet/minecraft/class_1792;
// 053: astore 1
// 054: iload 7
// 056: bipush 2
// 057: iand
// 058: aload 14
// 05a: iload 9
// 05c: ifle 07e
// 05f: ifnonnull 07c
// 062: ifeq 078
// 065: goto 073
// 068: ldc2_w 2374617335419004867
// 06b: lload 10
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: aload 0
// 074: getfield su/catlean/wo.g I
// 077: istore 2
// 078: iload 7
// 07a: bipush 4
// 07b: iand
// 07c: aload 14
// 07e: iload 3
// 07f: iflt 0af
// 082: ifnonnull 0ad
// 085: ifeq 09c
// 088: goto 096
// 08b: ldc2_w 2374617335419004867
// 08e: lload 10
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: aload 0
// 097: getfield su/catlean/wo.d I
// 09a: istore 5
// 09c: iload 7
// 09e: sipush 1627
// 0a1: ldc2_w 4364895764398492115
// 0a4: lload 10
// 0a6: lxor
// 0a7: invokedynamic c (IJ)I bsm=su/catlean/wo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: iand
// 0ad: aload 14
// 0af: ifnonnull 0d5
// 0b2: ifeq 0d7
// 0b5: goto 0c3
// 0b8: ldc2_w 2374617335419004867
// 0bb: lload 10
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: aload 0
// 0c4: getfield su/catlean/wo.M I
// 0c7: goto 0d5
// 0ca: ldc2_w 2374617335419004867
// 0cd: lload 10
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: istore 6
// 0d7: aload 0
// 0d8: aload 1
// 0d9: iload 2
// 0da: lload 12
// 0dc: iload 5
// 0de: iload 6
// 0e0: invokevirtual su/catlean/wo.h (Lnet/minecraft/class_1792;IJII)Lsu/catlean/wo;
// 0e3: iload 4
// 0e5: iflt 101
// 0e8: ldc2_w 2371018731476369014
// 0eb: lload 10
// 0ed: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: ifnull 10f
// 0f5: ldc "cMDTFb"
// 0f7: ldc2_w 2371080981428557184
// 0fa: lload 10
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: goto 10f
// 104: ldc2_w 2374617335419004867
// 107: lload 10
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 41878050360152L;
int var3 = this.M;
int var4 = this.d;
int var5 = this.g;
class_1792 var6 = this.A;
return a<"q">(28167, 1006965365470770544L ^ var1)
+ var6
+ a<"q">(27925, 2826122162944652899L ^ var1)
+ var5
+ a<"q">(15728, 5201487566990697986L ^ var1)
+ var4
+ a<"q">(30550, 1314398928003083299L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 116214685084765L;
int var4 = this.A.hashCode();
String var10000 = vm.a<"Å">(-6299999658423863537L, var1);
var4 = var4 * b<"c">(20401, 510623684335208580L ^ var1) + Integer.hashCode(this.g);
var4 = var4 * b<"c">(9942, 4389459818068926946L ^ var1) + Integer.hashCode(this.d);
var4 = var4 * b<"c">(9942, 4389459818068926946L ^ var1) + Integer.hashCode(this.M);
String var3 = var10000;

try {
if (var3 != null) {
vm.a<"Å">(new _g[1], -6327572338369125870L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -6320223890030858371L, var1);
}
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
// 000: getstatic su/catlean/wo.a J
// 003: ldc2_w 91928577845970
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 3323337224777347456
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 3370161409634232818
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 3370161409634232818
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/wo
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 3370161409634232818
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 3370161409634232818
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/wo
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/wo.A Lnet/minecraft/class_1792;
// 065: aload 5
// 067: getfield su/catlean/wo.A Lnet/minecraft/class_1792;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnonnull 092
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w 3370161409634232818
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 3370161409634232818
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/wo.g I
// 092: aload 5
// 094: getfield su/catlean/wo.g I
// 097: aload 4
// 099: ifnonnull 0c1
// 09c: if_icmpeq 0b8
// 09f: goto 0ac
// 0a2: ldc2_w 3370161409634232818
// 0a5: lload 2
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: bipush 0
// 0ad: ireturn
// 0ae: ldc2_w 3370161409634232818
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: getfield su/catlean/wo.d I
// 0bc: aload 5
// 0be: getfield su/catlean/wo.d I
// 0c1: aload 4
// 0c3: ifnonnull 0fd
// 0c6: if_icmpeq 0e2
// 0c9: goto 0d6
// 0cc: ldc2_w 3370161409634232818
// 0cf: lload 2
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: bipush 0
// 0d7: ireturn
// 0d8: ldc2_w 3370161409634232818
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: aload 0
// 0e3: getfield su/catlean/wo.M I
// 0e6: aload 4
// 0e8: ifnonnull 10d
// 0eb: aload 5
// 0ed: getfield su/catlean/wo.M I
// 0f0: goto 0fd
// 0f3: ldc2_w 3370161409634232818
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: if_icmpeq 10c
// 100: bipush 0
// 101: ireturn
// 102: ldc2_w 3370161409634232818
// 105: lload 2
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: bipush 1
// 10d: ireturn
}

static {
long var11 = a ^ 126333328909003L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[6];
int var18 = 0;
String var17 = "\u0016\\T\u0085¶\u008ckJ\u009dK\u0097´\u009b½Õ\u0016\u008e\u0091Ð,±ò´òA\u0092®\u0084gÄ~Q\u0018]ç\u008bDh«¶\u001f°\u00978|\u009fæ\u009f;ùca\r&²\u009aô\u0010¤³\u0088 \u000fK\u001b¶\u001eÊ'\u0012q«M]\u0010Àð\u001eÒîz\u0002P\u009cù«Áay |";
int var19 = "\u0016\\T\u0085¶\u008ckJ\u009dK\u0097´\u009b½Õ\u0016\u008e\u0091Ð,±ò´òA\u0092®\u0084gÄ~Q\u0018]ç\u008bDh«¶\u001f°\u00978|\u009fæ\u009f;ùca\r&²\u009aô\u0010¤³\u0088 \u000fK\u001b¶\u001eÊ'\u0012q«M]\u0010Àð\u001eÒîz\u0002P\u009cù«Áay |"
.length();
char var16 = ' ';
int var23 = -1;

label45:
while (true) {
String var24 = var17.substring(++var23, var23 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var33;
if ((var23 += var16) >= var19) {
b = var20;
c = new String[6];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "`Æk¶\u000bÝ¼\u008fÌ\u0085\u009d\u0093\u00ad:q8\u0098\u0096\fCr+\u009f\u008c";
int var5 = "`Æk¶\u000bÝ¼\u008fÌ\u0085\u009d\u0093\u00ad:q8\u0098\u0096\fCr+\u009f\u008c".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
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
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

f = var6;
h = new Integer[3];
return;
}

var16 = var17.charAt(var23);
break;
default:
var20[var18++] = var33;
if ((var23 += var16) < var19) {
var16 = var17.charAt(var23);
continue label45;
}

var17 = "×@w\"»ª\u0091«³D\u000f°N(°E \u0000\u0089\u0002¡\"\u0001k¿\u0015\u0084ÃÚæÊX0äüèïà¾\u00ad\u008f\u0091/0\u00165A\u00954";
var19 = "×@w\"»ª\u0091«³D\u000f°N(°E \u0000\u0089\u0002¡\"\u0001k¿\u0015\u0084ÃÚæÊX0äüèïà¾\u00ad\u008f\u0091/0\u00165A\u00954".length();
var16 = 16;
var23 = -1;
}

var24 = var17.substring(++var23, var23 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5498;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/wo", var10);
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
throw new RuntimeException("su/catlean/wo" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28220;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/wo", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/wo" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
