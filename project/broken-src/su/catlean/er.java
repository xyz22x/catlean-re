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
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class er extends _g {
@NotNull
public static final er D;
static final KProperty[] a;
@NotNull
private static final cq I;
@NotNull
private static final cq b;
@NotNull
private static final cq T;
private static final long c = yz.a(-3423907817071014292L, 6768823869000227701L, MethodHandles.lookup().lookupClass()).a(230204006281530L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);

private er(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 21785166173908L;
super(b<"k">(25774, 4352352691646302038L ^ var1), jt.v(), null, 4, null, var3);
}

private final boolean e(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 56094009608169L;
return (Boolean)I.E(this, var3, a[0]);
}

private final boolean w(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 117367092673963L;
return (Boolean)b.E(this, var3, a[1]);
}

private final boolean q(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 65408388020919L;
return (Boolean)T.E(this, var3, a[2]);
}

@Flow
private final void X(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/er.c J
// 003: ldc2_w 116795257200410
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 117617197159284
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 89598520330498
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 32
// 029: lshl
// 02a: bipush 32
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 70676285828789
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 99399692239491
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 28575938942199
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 19259414505897
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 100225867897889
// 051: lxor
// 052: lstore 17
// 054: pop2
// 055: ldc2_w 1010053089609979053
// 058: lload 2
// 059: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: aload 1
// 05f: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 062: astore 21
// 064: astore 20
// 066: aload 21
// 068: astore 22
// 06a: bipush 0
// 06b: istore 23
// 06d: aload 20
// 06f: ifnull 217
// 072: aload 22
// 074: instanceof net/minecraft/class_2824
// 077: ifeq 215
// 07a: goto 087
// 07d: ldc2_w 1046242675209581234
// 080: lload 2
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 08a: aload 22
// 08c: checkcast net/minecraft/class_2824
// 08f: aload 20
// 091: ifnull 0cb
// 094: goto 0a1
// 097: ldc2_w 1046242675209581234
// 09a: lload 2
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: astore 19
// 0a3: iload 6
// 0a5: i2s
// 0a6: iload 7
// 0a8: i2s
// 0a9: iload 8
// 0ab: aload 19
// 0ad: invokevirtual su/catlean/u2.V (SSILnet/minecraft/class_2824;)Lnet/minecraft/class_2824$class_5907;
// 0b0: getstatic net/minecraft/class_2824$class_5907.field_29172 Lnet/minecraft/class_2824$class_5907;
// 0b3: if_acmpne 215
// 0b6: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 0b9: aload 22
// 0bb: checkcast net/minecraft/class_2824
// 0be: goto 0cb
// 0c1: ldc2_w 1046242675209581234
// 0c4: lload 2
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: lload 4
// 0cd: dup2_x1
// 0ce: pop2
// 0cf: invokevirtual su/catlean/u2.G (JLnet/minecraft/class_2824;)Lnet/minecraft/class_1297;
// 0d2: astore 24
// 0d4: nop
// 0d5: getstatic su/catlean/er.D Lsu/catlean/er;
// 0d8: lload 13
// 0da: invokespecial su/catlean/er.e (J)Z
// 0dd: aload 20
// 0df: ifnull 15a
// 0e2: ifeq 145
// 0e5: goto 0f2
// 0e8: ldc2_w 1046242675209581234
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: aload 24
// 0f4: instanceof net/minecraft/class_1657
// 0f7: aload 20
// 0f9: ifnull 15a
// 0fc: goto 109
// 0ff: ldc2_w 1046242675209581234
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: ifeq 145
// 10c: goto 119
// 10f: ldc2_w 1046242675209581234
// 112: lload 2
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: aload 24
// 11b: checkcast net/minecraft/class_1657
// 11e: lload 11
// 120: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 123: aload 20
// 125: ifnull 15a
// 128: goto 135
// 12b: ldc2_w 1046242675209581234
// 12e: lload 2
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: ifne 207
// 138: goto 145
// 13b: ldc2_w 1046242675209581234
// 13e: lload 2
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: getstatic su/catlean/er.D Lsu/catlean/er;
// 148: lload 9
// 14a: invokespecial su/catlean/er.w (J)Z
// 14d: goto 15a
// 150: ldc2_w 1046242675209581234
// 153: lload 2
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: aload 20
// 15c: ifnull 1ab
// 15f: ifeq 196
// 162: goto 16f
// 165: ldc2_w 1046242675209581234
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 24
// 171: instanceof net/minecraft/class_1646
// 174: aload 20
// 176: ifnull 1ab
// 179: goto 186
// 17c: ldc2_w 1046242675209581234
// 17f: lload 2
// 180: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 185: athrow
// 186: ifne 207
// 189: goto 196
// 18c: ldc2_w 1046242675209581234
// 18f: lload 2
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: getstatic su/catlean/er.D Lsu/catlean/er;
// 199: lload 15
// 19b: invokespecial su/catlean/er.q (J)Z
// 19e: goto 1ab
// 1a1: ldc2_w 1046242675209581234
// 1a4: lload 2
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: aload 20
// 1ad: ifnull 1d2
// 1b0: ifeq 215
// 1b3: goto 1c0
// 1b6: ldc2_w 1046242675209581234
// 1b9: lload 2
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: aload 24
// 1c2: instanceof net/minecraft/class_1590
// 1c5: goto 1d2
// 1c8: ldc2_w 1046242675209581234
// 1cb: lload 2
// 1cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d1: athrow
// 1d2: aload 20
// 1d4: ifnull 204
// 1d7: ifeq 215
// 1da: goto 1e7
// 1dd: ldc2_w 1046242675209581234
// 1e0: lload 2
// 1e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: athrow
// 1e7: aload 24
// 1e9: checkcast net/minecraft/class_1590
// 1ec: invokevirtual net/minecraft/class_1590.method_5968 ()Lnet/minecraft/class_1309;
// 1ef: lload 17
// 1f1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1f4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1f7: goto 204
// 1fa: ldc2_w 1046242675209581234
// 1fd: lload 2
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: ifne 215
// 207: aload 1
// 208: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 20b: goto 215
// 20e: astore 25
// 210: aload 25
// 212: invokevirtual java/lang/Exception.printStackTrace ()V
// 215: nop
// 216: nop
// 217: return
}

static {
long var20 = c ^ 30100406237468L;
long var22 = var20 ^ 50491990290330L;
long var24 = var20 ^ 45653222915857L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "Ì\u008eÄÎ Ñ\u008a\u0018\u0085\u009cÂ\u0003fIëÛ\u0081¾\u0081Óã\u0014*4\fkÍ8þ!\u0001X\u0010 GE#ª\u0082y;æ\u00832å\u000bn\u000eq\u0010zÃ\u0085\u007f\u0086*\u009dûÆÎ ß\u001c¾^)\u0018ì\u0005\u0005\u00823\u009akØ{h1°i4¹ò<I\u0087\u001f§Éq®\u0010\u001a\u0091ö¹dÌ\u008dª\u009fÇQ\u0016</\u0004\u0088 \u001d&\u0002¯läT\n\u0084 A\u0097\u0015Õ'\u009djÈ\rZ5\u0089vQæ]@,û\u0083â\u0000 \u009b\u0082}'©Â\u009c?ÿdÇæ\u0018\u0093ø½\u008bBly3\u001cm\u0099ÙØì\u0096ºhY) 6\u0007W\u001f,¥Ï[\u0097}º\u0019ïÒ\u00165\u0007ZpÐ¨ÎÀ\u0004¥\u0098 Ü0\u0001ââ";
int var17 = "Ì\u008eÄÎ Ñ\u008a\u0018\u0085\u009cÂ\u0003fIëÛ\u0081¾\u0081Óã\u0014*4\fkÍ8þ!\u0001X\u0010 GE#ª\u0082y;æ\u00832å\u000bn\u000eq\u0010zÃ\u0085\u007f\u0086*\u009dûÆÎ ß\u001c¾^)\u0018ì\u0005\u0005\u00823\u009akØ{h1°i4¹ò<I\u0087\u001f§Éq®\u0010\u001a\u0091ö¹dÌ\u008dª\u009fÇQ\u0016</\u0004\u0088 \u001d&\u0002¯läT\n\u0084 A\u0097\u0015Õ'\u009djÈ\rZ5\u0089vQæ]@,û\u0083â\u0000 \u009b\u0082}'©Â\u009c?ÿdÇæ\u0018\u0093ø½\u008bBly3\u001cm\u0099ÙØì\u0096ºhY) 6\u0007W\u001f,¥Ï[\u0097}º\u0019ïÒ\u00165\u0007ZpÐ¨ÎÀ\u0004¥\u0098 Ü0\u0001ââ"
.length();
char var14 = ' ';
int var28 = -1;

label47:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var28 += var14) >= var17) {
d = var18;
e = new String[10];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[2];
int var4 = 0;
String var5 = "o5\u0088ÏL³N\u007f¢\f¨G\u0080\u0082\t¯";
int var6 = "o5\u0088ÏL³N\u007f¢\f¨G\u0080\u0082\t¯".length();
byte var3 = 0;

do {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
var10001 = var4++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var1.doFinal(
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
byte var43 = -1;
var0[var10001] = var10004;
} while (var3 < var6);

KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(er.class, b<"k">(6883, 988498504747259487L ^ var20), b<"k">(14087, 4264968310542318516L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(er.class, b<"k">(15158, 6830590058888443780L ^ var20), b<"k">(26091, 7249903948705098075L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(er.class, b<"k">(4331, 6165741921684724828L ^ var20), b<"k">(14228, 53020477708417826L ^ var20), 0))
};
a = var26;
D = new er(var24);
I = yp.t(D, b<"k">(30580, 3104684887818304448L ^ var20), true, var22, null, null, (int)var0[0], null);
b = yp.t(D, b<"k">(18633, 3822160566234006652L ^ var20), true, var22, null, null, (int)var0[1], null);
T = yp.t(D, b<"k">(22293, 5794626786420022180L ^ var20), true, var22, null, null, (int)var0[1], null);
return;
}

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var38;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label47;
}

var15 = "ø\u008bn,ê\u0001ø·®ØÉFk\u0000\u000b\u0082\u00adÚÓ¾¨ûá!\u0010Úë\u0092õnF\u0080¿/¸Ø-÷½¤\u009c";
var17 = "ø\u008bn,ê\u0001ø·®ØÉFk\u0000\u000b\u0082\u00adÚÓ¾¨ûá!\u0010Úë\u0092õnF\u0080¿/¸Ø-÷½¤\u009c".length();
var14 = 24;
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
var10001 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26109;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/er", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/er" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
