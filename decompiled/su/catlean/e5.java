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
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class e5 extends _g {
@NotNull
public static final e5 X;
private static final long a = yz.a(2183204535370178327L, 4000594027204175459L, MethodHandles.lookup().lookupClass()).a(204200164338358L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private e5(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 3720653398498L;
super(b<"s">(20417, 733222725113243333L ^ var1), jt.v(), null, 4, null, var3);
}

@Flow
public final void X(@NotNull PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e5.a J
// 003: ldc2_w 72943534907288
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 83003774407635
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 130038901828858
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 116339220292434
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 118576997146101
// 031: lxor
// 032: lstore 11
// 034: pop2
// 035: ldc2_w -3514907107847168910
// 038: lload 2
// 039: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: aload 1
// 03f: ldc "e"
// 041: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 044: astore 13
// 046: lload 4
// 048: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 04b: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 04e: instanceof net/minecraft/class_3965
// 051: aload 13
// 053: ifnull 193
// 056: ifeq 176
// 059: goto 066
// 05c: ldc2_w -3466672233443524386
// 05f: lload 2
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: lload 4
// 068: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06b: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 06e: dup
// 06f: sipush 14517
// 072: ldc2_w 2803742301327486481
// 075: lload 2
// 076: lxor
// 077: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/e5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 07f: checkcast net/minecraft/class_3965
// 082: astore 14
// 084: lload 4
// 086: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 089: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 08c: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
// 08f: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 092: aload 13
// 094: ifnull 193
// 097: ifeq 176
// 09a: goto 0a7
// 09d: ldc2_w -3466672233443524386
// 0a0: lload 2
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: lload 4
// 0a9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0ac: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0af: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
// 0b2: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0b5: aload 13
// 0b7: ifnull 193
// 0ba: goto 0c7
// 0bd: ldc2_w -3466672233443524386
// 0c0: lload 2
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: ifeq 176
// 0ca: goto 0d7
// 0cd: ldc2_w -3466672233443524386
// 0d0: lload 2
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: lload 9
// 0d9: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0dc: aload 14
// 0de: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 0e1: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0e4: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 0e7: aload 13
// 0e9: ifnull 193
// 0ec: goto 0f9
// 0ef: ldc2_w -3466672233443524386
// 0f2: lload 2
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: ifne 176
// 0fc: goto 109
// 0ff: ldc2_w -3466672233443524386
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: iload 6
// 10b: lload 7
// 10d: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 110: aload 13
// 112: ifnull 15d
// 115: goto 122
// 118: ldc2_w -3466672233443524386
// 11b: lload 2
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: invokevirtual net/minecraft/class_636.method_2923 ()Z
// 125: ifeq 156
// 128: goto 135
// 12b: ldc2_w -3466672233443524386
// 12e: lload 2
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: iload 6
// 137: lload 7
// 139: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 13c: aload 14
// 13e: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 141: aload 14
// 143: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
// 146: invokevirtual net/minecraft/class_636.method_2902 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// 149: goto 16a
// 14c: ldc2_w -3466672233443524386
// 14f: lload 2
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: iload 6
// 158: lload 7
// 15a: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 15d: aload 14
// 15f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 162: aload 14
// 164: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
// 167: invokevirtual net/minecraft/class_636.method_2910 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// 16a: pop
// 16b: lload 11
// 16d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 170: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 173: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 176: lload 4
// 178: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 17b: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 17e: aload 13
// 180: ifnull 1bc
// 183: instanceof net/minecraft/class_3966
// 186: goto 193
// 189: ldc2_w -3466672233443524386
// 18c: lload 2
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: ifeq 272
// 196: lload 4
// 198: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 19b: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 19e: dup
// 19f: sipush 19826
// 1a2: ldc2_w 402185137944566740
// 1a5: lload 2
// 1a6: lxor
// 1a7: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/e5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1af: goto 1bc
// 1b2: ldc2_w -3466672233443524386
// 1b5: lload 2
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: checkcast net/minecraft/class_3966
// 1bf: astore 14
// 1c1: lload 4
// 1c3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1c6: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1c9: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
// 1cc: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 1cf: aload 13
// 1d1: ifnull 1ff
// 1d4: ifeq 272
// 1d7: goto 1e4
// 1da: ldc2_w -3466672233443524386
// 1dd: lload 2
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: lload 4
// 1e6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e9: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1ec: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
// 1ef: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 1f2: goto 1ff
// 1f5: ldc2_w -3466672233443524386
// 1f8: lload 2
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: aload 13
// 201: ifnull 240
// 204: ifeq 272
// 207: goto 214
// 20a: ldc2_w -3466672233443524386
// 20d: lload 2
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: lload 11
// 216: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 219: aload 13
// 21b: ifnull 26c
// 21e: goto 22b
// 221: ldc2_w -3466672233443524386
// 224: lload 2
// 225: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22a: athrow
// 22b: ldc 0.5
// 22d: invokevirtual net/minecraft/class_746.method_7261 (F)F
// 230: ldc 0.9
// 232: fcmpl
// 233: goto 240
// 236: ldc2_w -3466672233443524386
// 239: lload 2
// 23a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23f: athrow
// 240: ifle 272
// 243: iload 6
// 245: lload 7
// 247: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 24a: lload 11
// 24c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 24f: checkcast net/minecraft/class_1657
// 252: aload 14
// 254: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 257: invokevirtual net/minecraft/class_636.method_2918 (Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V
// 25a: lload 11
// 25c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 25f: goto 26c
// 262: ldc2_w -3466672233443524386
// 265: lload 2
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 26f: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 272: aload 13
// 274: ifnonnull 291
// 277: bipush 1
// 278: anewarray 124
// 27b: ldc2_w -3477376307352255104
// 27e: lload 2
// 27f: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: goto 291
// 287: ldc2_w -3466672233443524386
// 28a: lload 2
// 28b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 290: athrow
// 291: return
}

static {
long var9 = a ^ 67479086707050L;
long var11 = var9 ^ 34119488045137L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[3];
int var5 = 0;
String var4 = "¦¢¢\u008dKc¥\u008cf\u001aÃ°\u001ajÙó³~é\u0092yg¶T´Ó~S\u008e\u0000a\u001c\u007fñk\u001býI\u0081\u0007Su\u009a\u0001\u0089ä&\u0092\u009fb¯n\u0004Li 5\u008c°Î3\u000fÆê¾\u0013Éh\u0096\u008c0-h\u00966Ü\u0012\u0003×ÑÏ \u008ev6R\u008d\u008f±\u001eJ\u0012ªG\u008fÊùÕBú»g~\u0098&\u0085\u0018\u0019\u0086\u0003ÙH¢{ï\u001eB%6l«S\u001cÊ\u001f\u0097·Ê Û04lM¯$Ú\\q\u009cÞ~?\u0013\u00adL\u0001Ç»\rkÇ\u0087náðÌ\nL¼¥x¿Fç\u0098ó×Ü\u000bñ\u00034\u0095åIº®\u001c\u001a\u0007K 9çKÑÊüÆû B\u007f×á\u00837\u0010%ÆÃd@qåÉ\u0018VA\u0093½ñe\u007f\u000b§ÈDh\\ÞìÝ\u009b\u000e\u0084^Õ^\f2]²¯ØéåY\u0011¨\\H$À\u0088E°\u0095Ù¹âI\u0007º\u0097\u0087«*ÅÑ>]þ\u009eÉ/þÙÅèi*¨%FÓú×Z\u0087å";
int var6 = "¦¢¢\u008dKc¥\u008cf\u001aÃ°\u001ajÙó³~é\u0092yg¶T´Ó~S\u008e\u0000a\u001c\u007fñk\u001býI\u0081\u0007Su\u009a\u0001\u0089ä&\u0092\u009fb¯n\u0004Li 5\u008c°Î3\u000fÆê¾\u0013Éh\u0096\u008c0-h\u00966Ü\u0012\u0003×ÑÏ \u008ev6R\u008d\u008f±\u001eJ\u0012ªG\u008fÊùÕBú»g~\u0098&\u0085\u0018\u0019\u0086\u0003ÙH¢{ï\u001eB%6l«S\u001cÊ\u001f\u0097·Ê Û04lM¯$Ú\\q\u009cÞ~?\u0013\u00adL\u0001Ç»\rkÇ\u0087náðÌ\nL¼¥x¿Fç\u0098ó×Ü\u000bñ\u00034\u0095åIº®\u001c\u001a\u0007K 9çKÑÊüÆû B\u007f×á\u00837\u0010%ÆÃd@qåÉ\u0018VA\u0093½ñe\u007f\u000b§ÈDh\\ÞìÝ\u009b\u000e\u0084^Õ^\f2]²¯ØéåY\u0011¨\\H$À\u0088E°\u0095Ù¹âI\u0007º\u0097\u0087«*ÅÑ>]þ\u009eÉ/þÙÅèi*¨%FÓú×Z\u0087å"
.length();
char var3 = 128;
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var15 = b(var8).intern();
byte var10001 = -1;
var7[var5++] = var15;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[3];
X = new e5(var11);
return;
}

var3 = var4.charAt(var2);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6206;
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
throw new RuntimeException("su/catlean/e5", var10);
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
throw new RuntimeException("su/catlean/e5" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
