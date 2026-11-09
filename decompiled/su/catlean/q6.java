package su.catlean;

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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class q6 extends _g {
@NotNull
public static final q6 J;
static final KProperty[] W;
@NotNull
private static final c8 S;
@NotNull
private static final ConcurrentHashMap X;
private static final long a = yz.a(-7834023782175520828L, -6871868618268904381L, MethodHandles.lookup().lookupClass()).a(116772024737816L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private q6(short var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 46050909715343L;
super(b<"f">(32546, 8263420776687829833L ^ var4), jt.d(), null, 4, null, var6);
}

private final int r(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 25479911749370L;
return ((Number)S.E(this, var3, W[0])).intValue();
}

@Flow
private final void M(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/q6.a J
// 03: ldc2_w 119442600845078
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 3904594109239414967
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 1
// 14: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 17: aload 4
// 19: ifnull 7a
// 1c: instanceof net/minecraft/class_6373
// 1f: ifne 58
// 22: goto 2f
// 25: ldc2_w 3928213156624718308
// 28: lload 2
// 29: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: athrow
// 2f: aload 1
// 30: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 33: aload 4
// 35: ifnull 7a
// 38: goto 45
// 3b: ldc2_w 3928213156624718308
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: instanceof net/minecraft/class_2670
// 48: ifeq 7f
// 4b: goto 58
// 4e: ldc2_w 3928213156624718308
// 51: lload 2
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: getstatic su/catlean/q6.X Ljava/util/concurrent/ConcurrentHashMap;
// 5b: checkcast java/util/Map
// 5e: aload 1
// 5f: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 62: invokestatic su/catlean/zf.A ()J
// 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 68: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 6d: goto 7a
// 70: ldc2_w 3928213156624718308
// 73: lload 2
// 74: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79: athrow
// 7a: pop
// 7b: aload 1
// 7c: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 7f: return
}

@Flow
private final void h(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q6.a J
// 003: ldc2_w 21431498001204
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 89265706733020
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 55160907495191
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 75393170158026
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w 2453785028792173717
// 022: lload 2
// 023: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: getstatic su/catlean/q6.X Ljava/util/concurrent/ConcurrentHashMap;
// 02b: invokevirtual java/util/concurrent/ConcurrentHashMap.entrySet ()Ljava/util/Set;
// 02e: dup
// 02f: sipush 6406
// 032: ldc2_w 7173658222466756066
// 035: lload 2
// 036: lxor
// 037: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/q6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 03f: checkcast java/lang/Iterable
// 042: astore 12
// 044: astore 10
// 046: bipush 0
// 047: istore 13
// 049: aload 12
// 04b: astore 14
// 04d: new java/util/ArrayList
// 050: dup
// 051: aload 12
// 053: sipush 8756
// 056: ldc2_w 6747501559812963507
// 059: lload 2
// 05a: lxor
// 05b: invokedynamic y (IJ)I bsm=su/catlean/q6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 063: invokespecial java/util/ArrayList.<init> (I)V
// 066: checkcast java/util/Collection
// 069: astore 15
// 06b: bipush 0
// 06c: istore 16
// 06e: aload 14
// 070: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 075: astore 17
// 077: aload 17
// 079: invokeinterface java/util/Iterator.hasNext ()Z 1
// 07e: ifeq 0ca
// 081: aload 17
// 083: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 088: astore 18
// 08a: aload 15
// 08c: aload 18
// 08e: checkcast java/util/Map$Entry
// 091: astore 19
// 093: aload 10
// 095: ifnull 0cc
// 098: astore 22
// 09a: bipush 0
// 09b: istore 20
// 09d: aload 19
// 09f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0a2: aload 19
// 0a4: astore 21
// 0a6: new kotlin/Pair
// 0a9: dup
// 0aa: aload 21
// 0ac: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 0b1: aload 21
// 0b3: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 0b8: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
// 0bb: nop
// 0bc: aload 22
// 0be: swap
// 0bf: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0c4: pop
// 0c5: aload 10
// 0c7: ifnonnull 077
// 0ca: aload 15
// 0cc: checkcast java/util/List
// 0cf: nop
// 0d0: astore 11
// 0d2: aload 11
// 0d4: checkcast java/lang/Iterable
// 0d7: astore 12
// 0d9: bipush 0
// 0da: istore 13
// 0dc: aload 12
// 0de: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0e3: astore 14
// 0e5: aload 14
// 0e7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ec: ifeq 232
// 0ef: aload 14
// 0f1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0f6: astore 15
// 0f8: aload 15
// 0fa: checkcast kotlin/Pair
// 0fd: astore 16
// 0ff: bipush 0
// 100: istore 17
// 102: aload 16
// 104: invokevirtual kotlin/Pair.component1 ()Ljava/lang/Object;
// 107: dup
// 108: sipush 13311
// 10b: ldc2_w 6674986918574180127
// 10e: lload 2
// 10f: lxor
// 110: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/q6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 118: checkcast net/minecraft/class_2596
// 11b: astore 18
// 11d: aload 16
// 11f: invokevirtual kotlin/Pair.component2 ()Ljava/lang/Object;
// 122: dup
// 123: sipush 26302
// 126: ldc2_w 3849180687710917208
// 129: lload 2
// 12a: lxor
// 12b: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/q6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 133: checkcast java/lang/Long
// 136: astore 19
// 138: aload 10
// 13a: ifnull 233
// 13d: aload 10
// 13f: ifnull 22d
// 142: goto 14f
// 145: ldc2_w 2495467884025335238
// 148: lload 2
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: invokestatic su/catlean/zf.A ()J
// 152: aload 19
// 154: invokevirtual java/lang/Long.longValue ()J
// 157: lsub
// 158: getstatic su/catlean/q6.J Lsu/catlean/q6;
// 15b: lload 8
// 15d: invokespecial su/catlean/q6.r (J)I
// 160: i2l
// 161: lcmp
// 162: iflt 22b
// 165: goto 172
// 168: ldc2_w 2495467884025335238
// 16b: lload 2
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: nop
// 173: aload 18
// 175: astore 20
// 177: aload 20
// 179: instanceof net/minecraft/class_6373
// 17c: aload 10
// 17e: ifnull 1d7
// 181: ifeq 1b3
// 184: goto 191
// 187: ldc2_w 2495467884025335238
// 18a: lload 2
// 18b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: athrow
// 191: aload 18
// 193: checkcast net/minecraft/class_6373
// 196: lload 6
// 198: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 19b: checkcast net/minecraft/class_8705
// 19e: invokevirtual net/minecraft/class_6373.method_36949 (Lnet/minecraft/class_8705;)V
// 1a1: aload 10
// 1a3: ifnonnull 1f7
// 1a6: goto 1b3
// 1a9: ldc2_w 2495467884025335238
// 1ac: lload 2
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: athrow
// 1b3: aload 20
// 1b5: aload 10
// 1b7: ifnull 1ff
// 1ba: goto 1c7
// 1bd: ldc2_w 2495467884025335238
// 1c0: lload 2
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: instanceof net/minecraft/class_2670
// 1ca: goto 1d7
// 1cd: ldc2_w 2495467884025335238
// 1d0: lload 2
// 1d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: athrow
// 1d7: ifeq 1f7
// 1da: aload 18
// 1dc: checkcast net/minecraft/class_2670
// 1df: lload 6
// 1e1: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 1e4: checkcast net/minecraft/class_8705
// 1e7: invokevirtual net/minecraft/class_2670.method_11518 (Lnet/minecraft/class_8705;)V
// 1ea: goto 1f7
// 1ed: ldc2_w 2495467884025335238
// 1f0: lload 2
// 1f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f6: athrow
// 1f7: getstatic su/catlean/q6.X Ljava/util/concurrent/ConcurrentHashMap;
// 1fa: aload 18
// 1fc: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
// 1ff: pop
// 200: goto 22b
// 203: astore 21
// 205: getstatic su/catlean/q6.J Lsu/catlean/q6;
// 208: checkcast su/catlean/_g
// 20b: aload 21
// 20d: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
// 210: sipush 24431
// 213: ldc2_w 4776557966417210253
// 216: lload 2
// 217: lxor
// 218: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/q6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: swap
// 21e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 223: bipush 0
// 224: bipush 2
// 225: aconst_null
// 226: lload 4
// 228: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 22b: nop
// 22c: nop
// 22d: aload 10
// 22f: ifnonnull 0e5
// 232: nop
// 233: return
}

static {
long var20 = a ^ 120742130224340L;
long var10001 = var20 ^ 111081056184194L;
int var22 = (int)((var20 ^ 111081056184194L) >>> 48);
int var23 = (int)((var20 ^ 111081056184194L) << 16 >>> 32);
int var24 = (int)(var10001 << 48 >>> 48);
long var25 = var20 ^ 36631595364232L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[8];
int var16 = 0;
String var15 = "ö\u0094¨$¦i_ßö\u001dÙB\u001aNwùw\u0099÷êóèè8ÊIõ)LhðmÉîÂ`7\u0089÷¶\u0010¬vBÀ\u0092Ú\u0098iò\u0003³ÿqxÆY\u0018Ô÷gEdÁ¥ñ\u001a\u00adRÄ³j\u000b\u0001\u008bc¯\u0081áÁõ\u001f\u0010âs\u000f\u0082±pW¼Ésø«\u0016\b6u\u0018ïä\f\u00adR#@QÕ.g²èè\b&öþ/\r\u0015ãî]\u0018Ä\t=\u000b\u001cð\u0014¤d',]lXd\u0089iì\u0005_x\u001ae£";
int var17 = "ö\u0094¨$¦i_ßö\u001dÙB\u001aNwùw\u0099÷êóèè8ÊIõ)LhðmÉîÂ`7\u0089÷¶\u0010¬vBÀ\u0092Ú\u0098iò\u0003³ÿqxÆY\u0018Ô÷gEdÁ¥ñ\u001a\u00adRÄ³j\u000b\u0001\u008bc¯\u0081áÁõ\u001f\u0010âs\u000f\u0082±pW¼Ésø«\u0016\b6u\u0018ïä\f\u00adR#@QÕ.g²èè\b&öþ/\r\u0015ãî]\u0018Ä\t=\u000b\u001cð\u0014¤d',]lXd\u0089iì\u0005_x\u001ae£"
.length();
char var14 = '(';
int var30 = -1;

label54:
while (true) {
String var31 = var15.substring(++var30, var30 + var14);
byte var35 = -1;

while (true) {
byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
String var43 = b(var19).intern();
switch (var35) {
case 0:
var18[var16++] = var43;
if ((var30 += var14) >= var17) {
b = var18;
c = new String[8];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "H¶1\u0081Â\u001at.úm³²bH¶í";
int var5 = "H¶1\u0081Â\u001at.úm³²bH¶í".length();
byte var2 = 0;

label36:
while (true) {
byte var39 = var2;
var2 += 8;
byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
long[] var34 = var6;
int var40 = var3++;
long var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var50 = -1;

while (true) {
long var8 = var47;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var52 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var50) {
case 0:
var34[var40] = var52;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
KProperty[] var27 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(q6.class, b<"f">(23269, 7376013158630189536L ^ var20), b<"f">(22340, 4805927609251554375L ^ var20), 0))
};
W = var27;
J = new q6((short)var22, var23, var24);
S = yp.L(
J,
b<"f">(30196, 6987683002723026675L ^ var20),
c<"y">(19109, 5373156667527893955L ^ var20),
new IntRange(1, c<"y">(24003, 9112359951660385447L ^ var20)),
var25,
null,
null,
c<"y">(20848, 2576073105668442133L ^ var20),
null
);
X = new ConcurrentHashMap();
return;
}
break;
default:
var34[var40] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "\u009a\u0099t\u0098kÀÖáH\u008ewªKC\u0096\u000b";
var5 = "\u009a\u0099t\u0098kÀÖáH\u008ewªKC\u0096\u000b".length();
var2 = 0;
}

byte var41 = var2;
var2 += 8;
var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
var34 = var6;
var40 = var3++;
var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var50 = 0;
}
}
}

var14 = var15.charAt(var30);
break;
default:
var18[var16++] = var43;
if ((var30 += var14) < var17) {
var14 = var15.charAt(var30);
continue label54;
}

var15 = ":\\Ü½\u008bT ¿MEÊz\u0016xÔÆ\u0001c+çÖÁ)6\nU4{ã®êiøÈ¤\u0091}ÎÙ\u0091¸9ì\u0085=\u001cy\u0018\u0018\u0000ðçpt}hH\u00adù¬\u0091\u0007\u009b\u0003°\u0080!´\u0089àº%½";
var17 = ":\\Ü½\u008bT ¿MEÊz\u0016xÔÆ\u0001c+çÖÁ)6\nU4{ã®êiøÈ¤\u0091}ÎÙ\u0091¸9ì\u0085=\u001cy\u0018\u0018\u0000ðçpt}hH\u00adù¬\u0091\u0007\u009b\u0003°\u0080!´\u0089àº%½"
.length();
var14 = '0';
var30 = -1;
}

var31 = var15.substring(++var30, var30 + var14);
var35 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22328;
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
throw new RuntimeException("su/catlean/q6", var10);
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
throw new RuntimeException("su/catlean/q6" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 15706;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/q6", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/q6" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
