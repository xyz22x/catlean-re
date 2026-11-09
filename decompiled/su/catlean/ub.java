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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.gofra.Flow;

public final class ub extends _g {
@NotNull
public static final ub A;
static final KProperty[] n;
@NotNull
private static final cw I;
private static final long a = yz.a(-1713983999391940216L, -9117021530851835299L, MethodHandles.lookup().lookupClass()).a(253182023789073L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private ub(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 137084730725408L;
super(b<"i">(18464, 7807680395901044340L ^ var1), jt.V(), null, 4, null, var3);
}

private final ni M(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 119962640886565L;
return (ni)I.E(this, var3, n[0]);
}

@Flow
public final void u(@NotNull MoveEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ub.a J
// 003: ldc2_w 80241353109213
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 1374949913739
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 47182109959526
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 111191890610684
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 37270263478957
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w 7526143774259726169
// 029: lload 2
// 02a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: aload 1
// 030: ldc "e"
// 032: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 035: astore 12
// 037: lload 10
// 039: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 03c: getstatic net/minecraft/class_1294.field_5902 Lnet/minecraft/class_6880;
// 03f: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 042: aload 12
// 044: ifnull 076
// 047: ifeq 2ac
// 04a: goto 057
// 04d: ldc2_w 7525414109871844644
// 050: lload 2
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: lload 10
// 059: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05c: getstatic net/minecraft/class_1294.field_5902 Lnet/minecraft/class_6880;
// 05f: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 062: dup
// 063: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 066: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 069: goto 076
// 06c: ldc2_w 7525414109871844644
// 06f: lload 2
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: istore 13
// 078: aload 0
// 079: lload 8
// 07b: invokespecial su/catlean/ub.M (J)Lsu/catlean/ni;
// 07e: getstatic su/catlean/cx.x [I
// 081: swap
// 082: invokevirtual su/catlean/ni.ordinal ()I
// 085: iaload
// 086: aload 12
// 088: ifnull 0c9
// 08b: tableswitch 527 1 3 35 342 497
// 0a4: ldc2_w 7525414109871844644
// 0a7: lload 2
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: lload 4
// 0b0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b3: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0b6: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 0b9: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0bc: goto 0c9
// 0bf: ldc2_w 7525414109871844644
// 0c2: lload 2
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: aload 12
// 0cb: ifnull 133
// 0ce: ifeq 125
// 0d1: goto 0de
// 0d4: ldc2_w 7525414109871844644
// 0d7: lload 2
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: aload 1
// 0df: aload 1
// 0e0: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 0e3: ldc2_w 0.05
// 0e6: iload 13
// 0e8: bipush 1
// 0e9: iadd
// 0ea: i2d
// 0eb: dmul
// 0ec: aload 1
// 0ed: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 0f0: dsub
// 0f1: ldc2_w 0.2
// 0f4: dmul
// 0f5: dadd
// 0f6: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 0f9: aload 12
// 0fb: ifnonnull 1d8
// 0fe: goto 10b
// 101: ldc2_w 7525414109871844644
// 104: lload 2
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: bipush 4
// 10c: anewarray 262
// 10f: ldc2_w 7558635092897391320
// 112: lload 2
// 113: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: goto 125
// 11b: ldc2_w 7525414109871844644
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: lload 4
// 127: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 12a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 12d: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 130: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 133: aload 12
// 135: ifnull 180
// 138: ifeq 16b
// 13b: goto 148
// 13e: ldc2_w 7525414109871844644
// 141: lload 2
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: aload 1
// 149: ldc2_w -0.08
// 14c: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 14f: aload 1
// 150: dconst_0
// 151: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 154: aload 1
// 155: dconst_0
// 156: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 159: aload 12
// 15b: ifnonnull 1d8
// 15e: goto 16b
// 161: ldc2_w 7525414109871844644
// 164: lload 2
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 16e: lload 6
// 170: invokevirtual su/catlean/dm.Y (J)Z
// 173: goto 180
// 176: ldc2_w 7525414109871844644
// 179: lload 2
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: aload 12
// 182: ifnull 1aa
// 185: ifne 1ad
// 188: goto 195
// 18b: ldc2_w 7525414109871844644
// 18e: lload 2
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 198: invokevirtual su/catlean/dm.r ()F
// 19b: fconst_0
// 19c: fcmpl
// 19d: goto 1aa
// 1a0: ldc2_w 7525414109871844644
// 1a3: lload 2
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: ifle 1c6
// 1ad: aload 1
// 1ae: ldc2_w 0.004
// 1b1: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 1b4: aload 12
// 1b6: ifnonnull 1d8
// 1b9: goto 1c6
// 1bc: ldc2_w 7525414109871844644
// 1bf: lload 2
// 1c0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: athrow
// 1c6: aload 1
// 1c7: dconst_0
// 1c8: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 1cb: goto 1d8
// 1ce: ldc2_w 7525414109871844644
// 1d1: lload 2
// 1d2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: athrow
// 1d8: aload 1
// 1d9: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 1dc: aload 12
// 1de: ifnonnull 2ac
// 1e1: lload 4
// 1e3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e6: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1e9: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 1ec: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 1ef: aload 12
// 1f1: ifnull 245
// 1f4: goto 201
// 1f7: ldc2_w 7525414109871844644
// 1fa: lload 2
// 1fb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 200: athrow
// 201: ifeq 22a
// 204: goto 211
// 207: ldc2_w 7525414109871844644
// 20a: lload 2
// 20b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: athrow
// 211: aload 1
// 212: ldc2_w 0.1
// 215: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 218: aload 12
// 21a: ifnonnull 273
// 21d: goto 22a
// 220: ldc2_w 7525414109871844644
// 223: lload 2
// 224: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: athrow
// 22a: lload 4
// 22c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 22f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 232: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 235: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 238: goto 245
// 23b: ldc2_w 7525414109871844644
// 23e: lload 2
// 23f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 244: athrow
// 245: ifeq 261
// 248: aload 1
// 249: ldc2_w -0.1
// 24c: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 24f: aload 12
// 251: ifnonnull 273
// 254: goto 261
// 257: ldc2_w 7525414109871844644
// 25a: lload 2
// 25b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 260: athrow
// 261: aload 1
// 262: dconst_0
// 263: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 266: goto 273
// 269: ldc2_w 7525414109871844644
// 26c: lload 2
// 26d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 272: athrow
// 273: aload 1
// 274: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 277: aload 12
// 279: ifnonnull 2ac
// 27c: lload 10
// 27e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 281: getstatic net/minecraft/class_1294.field_5902 Lnet/minecraft/class_6880;
// 284: invokevirtual net/minecraft/class_746.method_6016 (Lnet/minecraft/class_6880;)Z
// 287: pop
// 288: aload 12
// 28a: ifnonnull 2ac
// 28d: goto 29a
// 290: ldc2_w 7525414109871844644
// 293: lload 2
// 294: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 299: athrow
// 29a: new kotlin/NoWhenBranchMatchedException
// 29d: dup
// 29e: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 2a1: athrow
// 2a2: ldc2_w 7525414109871844644
// 2a5: lload 2
// 2a6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ab: athrow
// 2ac: return
}

static {
long var16 = a ^ 49249352230711L;
long var18 = var16 ^ 124597835441102L;
long var20 = var16 ^ 3547854806094L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[4];
int var12 = 0;
String var11 = "u»ZÂ)y\r\bÙ\u0019\u001ffÓM ^8\u008dªÀÐÏ\u0099\u00987BTÜí¬\b?3t\"Úº²\u0088ÎÝy·æNt\u0087\u0083k}f`\u0084§\u008d=J?Q\u000eª£÷¤\u0097\u008b\u0006%~\u000fÈI\u0083";
int var13 = "u»ZÂ)y\r\bÙ\u0019\u001ffÓM ^8\u008dªÀÐÏ\u0099\u00987BTÜí¬\b?3t\"Úº²\u0088ÎÝy·æNt\u0087\u0083k}f`\u0084§\u008d=J?Q\u000eª£÷¤\u0097\u008b\u0006%~\u000fÈI\u0083"
.length();
char var10 = 16;
int var24 = -1;

label37:
while (true) {
String var25 = var11.substring(++var24, var24 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var25.getBytes("ISO-8859-1"));
String var33 = b(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var33;
if ((var24 += var10) >= var13) {
b = var14;
c = new String[4];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 5591109892153644926L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var37 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
var10001 = -1;
long var0 = var37;
KProperty[] var22 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ub.class, b<"i">(3620, 407228084960404642L ^ var16), b<"i">(24633, 1183511696607562430L ^ var16), 0))
};
n = var22;
A = new ub(var18);
I = yp.L(A, b<"i">(3252, 8412445264262604336L ^ var16), ni.NCP, null, null, (int)var0, null, var20);
return;
}

var10 = var11.charAt(var24);
break;
default:
var14[var12++] = var33;
if ((var24 += var10) < var13) {
var10 = var11.charAt(var24);
continue label37;
}

var11 = "\n\u00adMC\u009e\u008aëPÄj\u0086Í\u0086¾Èb(Å»`V>\u0011A5\u009e}'R\u008bé\u0085\u0004\u0091F7÷\u0090~#*\u0085\u0013\u0017±º½m\u0003\u0097\u008em=âõTF";
var13 = "\n\u00adMC\u009e\u008aëPÄj\u0086Í\u0086¾Èb(Å»`V>\u0011A5\u009e}'R\u008bé\u0085\u0004\u0091F7÷\u0090~#*\u0085\u0013\u0017±º½m\u0003\u0097\u008em=âõTF"
.length();
var10 = 16;
var24 = -1;
}

var25 = var11.substring(++var24, var24 + var10);
var10001 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19118;
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
throw new RuntimeException("su/catlean/ub", var10);
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
throw new RuntimeException("su/catlean/ub" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
