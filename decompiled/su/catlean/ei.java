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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.InteractBlockEvent;
import su.catlean.gofra.Flow;

public final class ei extends _g {
@NotNull
public static final ei g;
@NotNull
private static final cq B;
private static final long a = yz.a(5133760146891310689L, -7466767469422143719L, MethodHandles.lookup().lookupClass()).a(183746564738781L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private ei(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 53072326833641L;
super(b<"y">(26908, 4345952043114394905L ^ var1), jt.v(), null, 4, null, var3);
}

private final boolean l(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 134706925903084L;
return (Boolean)B.E(this, var3, P[0]);
}

@Flow
private final void E(InteractBlockEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ei.a J
// 003: ldc2_w 82658379990239
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 45889878228187
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 117373508195509
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 124718333219895
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 115273305565714
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w -463592534042144792
// 029: lload 2
// 02a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: lload 6
// 031: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 034: aload 1
// 035: invokevirtual su/catlean/api/event/events/player/InteractBlockEvent.getHitResult ()Lnet/minecraft/class_3965;
// 038: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 03b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 03e: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 041: dup
// 042: sipush 24269
// 045: ldc2_w 2415154973997325956
// 048: lload 2
// 049: lxor
// 04a: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/ei.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 052: astore 13
// 054: astore 12
// 056: aload 0
// 057: lload 8
// 059: invokespecial su/catlean/ei.l (J)Z
// 05c: aload 12
// 05e: ifnonnull 088
// 061: ifne 187
// 064: goto 071
// 067: ldc2_w -463462215114349650
// 06a: lload 2
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 074: aload 13
// 076: lload 4
// 078: invokevirtual su/catlean/gw.D (Lnet/minecraft/class_2248;J)Z
// 07b: goto 088
// 07e: ldc2_w -463462215114349650
// 081: lload 2
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: aload 12
// 08a: ifnonnull 0af
// 08d: ifne 187
// 090: goto 09d
// 093: ldc2_w -463462215114349650
// 096: lload 2
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: aload 13
// 09f: instanceof net/minecraft/class_2354
// 0a2: goto 0af
// 0a5: ldc2_w -463462215114349650
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: aload 12
// 0b1: ifnonnull 0d6
// 0b4: ifne 187
// 0b7: goto 0c4
// 0ba: ldc2_w -463462215114349650
// 0bd: lload 2
// 0be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: athrow
// 0c4: aload 13
// 0c6: instanceof net/minecraft/class_2349
// 0c9: goto 0d6
// 0cc: ldc2_w -463462215114349650
// 0cf: lload 2
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: aload 12
// 0d8: ifnonnull 0fd
// 0db: ifne 187
// 0de: goto 0eb
// 0e1: ldc2_w -463462215114349650
// 0e4: lload 2
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: aload 13
// 0ed: instanceof net/minecraft/class_2533
// 0f0: goto 0fd
// 0f3: ldc2_w -463462215114349650
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: aload 12
// 0ff: ifnonnull 124
// 102: ifne 187
// 105: goto 112
// 108: ldc2_w -463462215114349650
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: aload 13
// 114: instanceof net/minecraft/class_2323
// 117: goto 124
// 11a: ldc2_w -463462215114349650
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: aload 12
// 126: ifnonnull 14b
// 129: ifne 187
// 12c: goto 139
// 12f: ldc2_w -463462215114349650
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: aload 13
// 13b: instanceof net/minecraft/class_4850
// 13e: goto 14b
// 141: ldc2_w -463462215114349650
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: aload 12
// 14d: ifnonnull 172
// 150: ifne 187
// 153: goto 160
// 156: ldc2_w -463462215114349650
// 159: lload 2
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: aload 13
// 162: instanceof net/minecraft/class_2449
// 165: goto 172
// 168: ldc2_w -463462215114349650
// 16b: lload 2
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: aload 12
// 174: ifnonnull 1a9
// 177: ifeq 198
// 17a: goto 187
// 17d: ldc2_w -463462215114349650
// 180: lload 2
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: aload 1
// 188: invokevirtual su/catlean/api/event/events/player/InteractBlockEvent.cancel ()V
// 18b: goto 198
// 18e: ldc2_w -463462215114349650
// 191: lload 2
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: lload 10
// 19a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19d: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 1a0: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1a3: getstatic net/minecraft/class_1802.field_8575 Lnet/minecraft/class_1792;
// 1a6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1a9: aload 12
// 1ab: ifnonnull 205
// 1ae: ifeq 1e7
// 1b1: goto 1be
// 1b4: ldc2_w -463462215114349650
// 1b7: lload 2
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: aload 1
// 1bf: aload 12
// 1c1: ifnonnull 23f
// 1c4: goto 1d1
// 1c7: ldc2_w -463462215114349650
// 1ca: lload 2
// 1cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: athrow
// 1d1: invokevirtual su/catlean/api/event/events/player/InteractBlockEvent.getHand ()Lnet/minecraft/class_1268;
// 1d4: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 1d7: if_acmpeq 231
// 1da: goto 1e7
// 1dd: ldc2_w -463462215114349650
// 1e0: lload 2
// 1e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: athrow
// 1e7: lload 10
// 1e9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ec: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 1ef: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1f2: getstatic net/minecraft/class_1802.field_8575 Lnet/minecraft/class_1792;
// 1f5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1f8: goto 205
// 1fb: ldc2_w -463462215114349650
// 1fe: lload 2
// 1ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: athrow
// 205: ifeq 242
// 208: aload 1
// 209: aload 12
// 20b: ifnonnull 23f
// 20e: goto 21b
// 211: ldc2_w -463462215114349650
// 214: lload 2
// 215: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21a: athrow
// 21b: invokevirtual su/catlean/api/event/events/player/InteractBlockEvent.getHand ()Lnet/minecraft/class_1268;
// 21e: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 221: if_acmpne 242
// 224: goto 231
// 227: ldc2_w -463462215114349650
// 22a: lload 2
// 22b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: athrow
// 231: aload 1
// 232: goto 23f
// 235: ldc2_w -463462215114349650
// 238: lload 2
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: invokevirtual su/catlean/api/event/events/player/InteractBlockEvent.cancel ()V
// 242: return
}

static {
long var16 = a ^ 134402172553499L;
long var18 = var16 ^ 103718150189675L;
long var20 = var16 ^ 117979962469419L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[5];
int var12 = 0;
String var11 = "oÇã¿\u001fS#ÆÚ\u009fÆþl+\u000eï\u0000ðøÈ\u0013Ü\u000f: B\u0096CÌ+\u00846\u0007V\u009d+,y\u0088`\u008c \u009e)ËKÄ\u0003Ã//g\u009b\u0018UÀ\u0091 r{$\u0099\u0002\u0099 \u008cÜfõ×ÎkvÎ\u0012lÛX>ÔVÖ¾*t X\u007f ù";
int var13 = "oÇã¿\u001fS#ÆÚ\u009fÆþl+\u000eï\u0000ðøÈ\u0013Ü\u000f: B\u0096CÌ+\u00846\u0007V\u009d+,y\u0088`\u008c \u009e)ËKÄ\u0003Ã//g\u009b\u0018UÀ\u0091 r{$\u0099\u0002\u0099 \u008cÜfõ×ÎkvÎ\u0012lÛX>ÔVÖ¾*t X\u007f ù"
.length();
char var10 = 24;
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
c = new String[5];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 8913857202902379315L;
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
Reflection.property1(new PropertyReference1Impl(ei.class, b<"y">(14720, 1753202299386573832L ^ var16), b<"y">(32590, 3340517712142103233L ^ var16), 0))
};
P = var22;
g = new ei(var20);
B = yp.t(g, b<"y">(20503, 5069227603386457497L ^ var16), false, var18, null, null, (int)var0, null);
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

var11 = "\u0089\u0017F9A\u000b\bJÿ¬\n\u0016\rej¼S\u009dªßÒÍúßEÕG³E¦\u001eç\u0018K\u0015I&qÕ>\u009d¥K\u0018\u0080HØJ-\u0007\u0004\u008b§èy\u0011?";
var13 = "\u0089\u0017F9A\u000b\bJÿ¬\n\u0016\rej¼S\u009dªßÒÍúßEÕG³E¦\u001eç\u0018K\u0015I&qÕ>\u009d¥K\u0018\u0080HØJ-\u0007\u0004\u008b§èy\u0011?".length();
var10 = ' ';
var24 = -1;
}

var25 = var11.substring(++var24, var24 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31029;
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
throw new RuntimeException("su/catlean/ei", var10);
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
throw new RuntimeException("su/catlean/ei" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
