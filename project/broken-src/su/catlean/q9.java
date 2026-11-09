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
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class q9 extends _g {
@NotNull
public static final q9 w;
private static boolean C;
private static boolean Y;
private static int K;
private static final long a = yz.a(-1412228687822135172L, -5815952478061240875L, MethodHandles.lookup().lookupClass()).a(253099714829001L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private q9(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 109730238844385L;
super(b<"q">(3782, 7974933995059828240L ^ var1), jt.d(), null, 4, null, var3);
}

@Flow
public final void q(@NotNull ReceivePacket e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/q9.a J
// 03: ldc2_w 78880460013521
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -2123078450267895572
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 1
// 12: ldc "e"
// 14: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 17: istore 4
// 19: aload 1
// 1a: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 1d: instanceof net/minecraft/class_2720
// 20: iload 4
// 22: ifeq 4b
// 25: ifeq 52
// 28: goto 35
// 2b: ldc2_w -2160744491917867779
// 2e: lload 2
// 2f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: athrow
// 35: bipush 1
// 36: putstatic su/catlean/q9.C Z
// 39: bipush 0
// 3a: putstatic su/catlean/q9.Y Z
// 3d: bipush 0
// 3e: goto 4b
// 41: ldc2_w -2160744491917867779
// 44: lload 2
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: putstatic su/catlean/q9.K I
// 4e: aload 1
// 4f: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 52: ldc2_w -2145199445168423765
// 55: lload 2
// 56: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b: ifnull 79
// 5e: iinc 4 1
// 61: iload 4
// 63: ldc2_w -2144607120668468733
// 66: lload 2
// 67: invokedynamic Å (IJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: goto 79
// 6f: ldc2_w -2160744491917867779
// 72: lload 2
// 73: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: athrow
// 79: return
}

@Flow
public final void b(@NotNull PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q9.a J
// 003: ldc2_w 120002776911400
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 135025162946137
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 69804730299832
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 19131035333132
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 69468414575101
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w 6012417637665044757
// 029: lload 2
// 02a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: aload 1
// 030: ldc "e"
// 032: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 035: istore 12
// 037: iload 12
// 039: ifeq 0ca
// 03c: lload 4
// 03e: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 041: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 044: dup
// 045: ifnull 0c9
// 048: goto 055
// 04b: ldc2_w 6051242287562044676
// 04e: lload 2
// 04f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: athrow
// 055: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 058: dup
// 059: iload 12
// 05b: ifeq 09b
// 05e: goto 06b
// 061: ldc2_w 6051242287562044676
// 064: lload 2
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: ifnull 0c9
// 06e: goto 07b
// 071: ldc2_w 6051242287562044676
// 074: lload 2
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: checkcast java/lang/CharSequence
// 07e: sipush 22118
// 081: ldc2_w 6854990084321624347
// 084: lload 2
// 085: lxor
// 086: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/q9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: checkcast java/lang/CharSequence
// 08e: goto 09b
// 091: ldc2_w 6051242287562044676
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: bipush 0
// 09c: bipush 2
// 09d: aconst_null
// 09e: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 0a1: iload 12
// 0a3: ifeq 0c6
// 0a6: bipush 1
// 0a7: if_icmpne 0c5
// 0aa: goto 0b7
// 0ad: ldc2_w 6051242287562044676
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: bipush 1
// 0b8: goto 0cb
// 0bb: ldc2_w 6051242287562044676
// 0be: lload 2
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: bipush 0
// 0c6: goto 0cb
// 0c9: pop
// 0ca: bipush 0
// 0cb: ifeq 0e1
// 0ce: aload 0
// 0cf: lload 8
// 0d1: invokevirtual su/catlean/q9.d (J)V
// 0d4: goto 0e1
// 0d7: ldc2_w 6051242287562044676
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: getstatic su/catlean/q9.C Z
// 0e4: iload 12
// 0e6: ifeq 0fc
// 0e9: ifeq 212
// 0ec: goto 0f9
// 0ef: ldc2_w 6051242287562044676
// 0f2: lload 2
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: getstatic su/catlean/q9.K I
// 0fc: istore 13
// 0fe: iload 13
// 100: bipush 1
// 101: iadd
// 102: putstatic su/catlean/q9.K I
// 105: getstatic su/catlean/q9.K I
// 108: i2d
// 109: sipush 29993
// 10c: ldc2_w 6273884692392708172
// 10f: lload 2
// 110: lxor
// 111: invokedynamic v (IJ)I bsm=su/catlean/q9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: i2d
// 117: invokestatic java/lang/Math.random ()D
// 11a: sipush 16207
// 11d: ldc2_w 8426740287632785960
// 120: lload 2
// 121: lxor
// 122: invokedynamic v (IJ)I bsm=su/catlean/q9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: i2d
// 128: dmul
// 129: dadd
// 12a: dcmpl
// 12b: iload 12
// 12d: ifeq 1b8
// 130: ifle 192
// 133: goto 140
// 136: ldc2_w 6051242287562044676
// 139: lload 2
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: getstatic su/catlean/q9.Y Z
// 143: iload 12
// 145: ifeq 1b8
// 148: goto 155
// 14b: ldc2_w 6051242287562044676
// 14e: lload 2
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: ifne 192
// 158: goto 165
// 15b: ldc2_w 6051242287562044676
// 15e: lload 2
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: new net/minecraft/class_2856
// 168: dup
// 169: lload 10
// 16b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16e: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
// 171: getstatic net/minecraft/class_2856$class_2857.field_13016 Lnet/minecraft/class_2856$class_2857;
// 174: invokespecial net/minecraft/class_2856.<init> (Ljava/util/UUID;Lnet/minecraft/class_2856$class_2857;)V
// 177: checkcast net/minecraft/class_2596
// 17a: lload 6
// 17c: dup2_x1
// 17d: pop2
// 17e: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 181: bipush 1
// 182: putstatic su/catlean/q9.Y Z
// 185: goto 192
// 188: ldc2_w 6051242287562044676
// 18b: lload 2
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: getstatic su/catlean/q9.K I
// 195: i2d
// 196: sipush 3476
// 199: ldc2_w 3403544181770154224
// 19c: lload 2
// 19d: lxor
// 19e: invokedynamic v (IJ)I bsm=su/catlean/q9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: i2d
// 1a4: invokestatic java/lang/Math.random ()D
// 1a7: sipush 5582
// 1aa: ldc2_w 8371000659057764520
// 1ad: lload 2
// 1ae: lxor
// 1af: invokedynamic v (IJ)I bsm=su/catlean/q9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b4: i2d
// 1b5: dmul
// 1b6: dadd
// 1b7: dcmpl
// 1b8: iload 12
// 1ba: ifeq 1d0
// 1bd: ifle 212
// 1c0: goto 1cd
// 1c3: ldc2_w 6051242287562044676
// 1c6: lload 2
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: getstatic su/catlean/q9.Y Z
// 1d0: iload 12
// 1d2: ifeq 20f
// 1d5: ifeq 212
// 1d8: goto 1e5
// 1db: ldc2_w 6051242287562044676
// 1de: lload 2
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: new net/minecraft/class_2856
// 1e8: dup
// 1e9: lload 10
// 1eb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ee: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
// 1f1: getstatic net/minecraft/class_2856$class_2857.field_13017 Lnet/minecraft/class_2856$class_2857;
// 1f4: invokespecial net/minecraft/class_2856.<init> (Ljava/util/UUID;Lnet/minecraft/class_2856$class_2857;)V
// 1f7: checkcast net/minecraft/class_2596
// 1fa: lload 6
// 1fc: dup2_x1
// 1fd: pop2
// 1fe: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 201: bipush 0
// 202: goto 20f
// 205: ldc2_w 6051242287562044676
// 208: lload 2
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: putstatic su/catlean/q9.C Z
// 212: iload 12
// 214: ifne 231
// 217: bipush 3
// 218: anewarray 230
// 21b: ldc2_w 6031925575009917320
// 21e: lload 2
// 21f: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 224: goto 231
// 227: ldc2_w 6051242287562044676
// 22a: lload 2
// 22b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: athrow
// 231: return
}

static {
long var20 = a ^ 2726936875091L;
long var22 = var20 ^ 70931666079083L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[2];
int var16 = 0;
String var15 = "D\u0096HÔ\"&þÛ³Y\u0082\u0087fe*ý{Ð»\u000b\u000eÑ\f^è\u0091Ök=öç\u0018(¡\u0086TùØs½¿¡?§ù!=Ó¹n\u0093n\u0093\u0010ÌÛ!\u0012ó\u0090§å\u0082ë4¸úI×lÀZ\u001b";
int var17 = "D\u0096HÔ\"&þÛ³Y\u0082\u0087fe*ý{Ð»\u000b\u000eÑ\f^è\u0091Ök=öç\u0018(¡\u0086TùØs½¿¡?§ù!=Ó¹n\u0093n\u0093\u0010ÌÛ!\u0012ó\u0090§å\u0082ë4¸úI×lÀZ\u001b"
.length();
char var14 = ' ';
int var13 = -1;

while (true) {
byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
String var32 = b(var19).intern();
int var10001 = -1;
var18[var16++] = var32;
if ((var13 += var14) >= var17) {
b = var18;
c = new String[2];
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
String var4 = "ä½\tMtú\nØæÊ\u000b:.Ã¾ë";
int var5 = "ä½\tMtú\nØæÊ\u000b:.Ã¾ë".length();
byte var2 = 0;

label32:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var27 = var6;
var10001 = var3++;
long var35 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var38 = -1;

while (true) {
long var8 = var35;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var40 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var38) {
case 0:
var27[var10001] = var40;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
w = new q9(var22);
return;
}
break;
default:
var27[var10001] = var40;
if (var2 < var5) {
continue label32;
}

var4 = "\u00106\u0019Gì\u0004RQs¨jÿîþl\u0013";
var5 = "\u00106\u0019Gì\u0004RQs¨jÿîþl\u0013".length();
var2 = 0;
}

byte var31 = var2;
var2 += 8;
var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
var27 = var6;
var10001 = var3++;
var35 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var38 = 0;
}
}
}

var14 = var15.charAt(var13);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17903;
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
throw new RuntimeException("su/catlean/q9", var10);
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
throw new RuntimeException("su/catlean/q9" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 12276;
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
throw new RuntimeException("su/catlean/q9", var14);
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
throw new RuntimeException("su/catlean/q9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
