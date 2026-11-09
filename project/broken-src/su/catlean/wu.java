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

public final class wu {
@NotNull
public static final wu H;
private static String[] v;
private static final long a = yz.a(4885336872334738754L, -2517205089667537492L, MethodHandles.lookup().lookupClass()).a(268589753063600L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private wu() {
}

public final void G(long a, boolean value) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wu.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 136408856546112
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 93326082799908
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 6
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 7
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 8
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 102149066191139
// 033: lxor
// 034: lstore 9
// 036: dup2
// 037: ldc2_w 101935156184422
// 03a: lxor
// 03b: lstore 11
// 03d: pop2
// 03e: ldc2_w -7527639001798133420
// 041: lload 1
// 042: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: astore 15
// 049: invokestatic net/fabricmc/loader/api/FabricLoader.getInstance ()Lnet/fabricmc/loader/api/FabricLoader;
// 04c: aload 15
// 04e: ifnull 0a4
// 051: sipush 26111
// 054: ldc2_w 8983930997707830360
// 057: lload 1
// 058: lxor
// 059: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/wu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: invokeinterface net/fabricmc/loader/api/FabricLoader.isModLoaded (Ljava/lang/String;)Z 2
// 063: ifeq 104
// 066: goto 073
// 069: ldc2_w -7524750861346537740
// 06c: lload 1
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: invokestatic com/viaversion/viaversion/api/Via.getManager ()Lcom/viaversion/viaversion/api/ViaManager;
// 076: invokeinterface com/viaversion/viaversion/api/ViaManager.getConnectionManager ()Lcom/viaversion/viaversion/api/connection/ConnectionManager; 1
// 07b: invokeinterface com/viaversion/viaversion/api/connection/ConnectionManager.getConnections ()Ljava/util/Set; 1
// 080: dup
// 081: sipush 13052
// 084: ldc2_w 3018756380325290840
// 087: lload 1
// 088: lxor
// 089: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/wu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 091: checkcast java/lang/Iterable
// 094: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/lang/Iterable;)Ljava/lang/Object;
// 097: goto 0a4
// 09a: ldc2_w -7524750861346537740
// 09d: lload 1
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: checkcast com/viaversion/viaversion/api/connection/UserConnection
// 0a7: dup
// 0a8: ifnull 0eb
// 0ab: invokeinterface com/viaversion/viaversion/api/connection/UserConnection.getProtocolInfo ()Lcom/viaversion/viaversion/api/connection/ProtocolInfo; 1
// 0b0: dup
// 0b1: ifnull 0eb
// 0b4: goto 0c1
// 0b7: ldc2_w -7524750861346537740
// 0ba: lload 1
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: invokeinterface com/viaversion/viaversion/api/connection/ProtocolInfo.getPipeline ()Lcom/viaversion/viaversion/api/protocol/ProtocolPipeline; 1
// 0c6: dup
// 0c7: ifnull 0eb
// 0ca: goto 0d7
// 0cd: ldc2_w -7524750861346537740
// 0d0: lload 1
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: ldc com/viaversion/viaversion/protocols/v1_21_5to1_21_6/Protocol1_21_5To1_21_6
// 0d9: invokeinterface com/viaversion/viaversion/api/protocol/ProtocolPipeline.contains (Ljava/lang/Class;)Z 2
// 0de: goto 0ed
// 0e1: ldc2_w -7524750861346537740
// 0e4: lload 1
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: pop
// 0ec: bipush 0
// 0ed: lload 1
// 0ee: lconst_0
// 0ef: lcmp
// 0f0: iflt 0f7
// 0f3: ifeq 104
// 0f6: bipush 1
// 0f7: goto 105
// 0fa: ldc2_w -7524750861346537740
// 0fd: lload 1
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: bipush 0
// 105: istore 16
// 107: aload 15
// 109: lload 1
// 10a: lconst_0
// 10b: lcmp
// 10c: ifle 16b
// 10f: ifnull 163
// 112: iload 16
// 114: ifne 188
// 117: goto 124
// 11a: ldc2_w -7524750861346537740
// 11d: lload 1
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: new net/minecraft/class_2851
// 127: dup
// 128: lload 11
// 12a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12d: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 130: dup
// 131: sipush 24935
// 134: ldc2_w 7817294414329606338
// 137: lload 1
// 138: lxor
// 139: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/wu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 141: iload 3
// 142: istore 13
// 144: astore 14
// 146: iload 6
// 148: aload 14
// 14a: iload 7
// 14c: iload 13
// 14e: iload 8
// 150: invokestatic su/catlean/zk.v (ILnet/minecraft/class_744;IZI)Lnet/minecraft/class_744;
// 153: getfield net/minecraft/class_744.field_54155 Lnet/minecraft/class_10185;
// 156: invokespecial net/minecraft/class_2851.<init> (Lnet/minecraft/class_10185;)V
// 159: checkcast net/minecraft/class_2596
// 15c: lload 9
// 15e: dup2_x1
// 15f: pop2
// 160: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 163: lload 1
// 164: lconst_0
// 165: lcmp
// 166: ifle 263
// 169: aload 15
// 16b: ifnonnull 24b
// 16e: bipush 5
// 16f: anewarray 237
// 172: ldc2_w -7552862297452602093
// 175: lload 1
// 176: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: goto 188
// 17e: ldc2_w -7524750861346537740
// 181: lload 1
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: aload 0
// 189: astore 17
// 18b: nop
// 18c: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
// 18f: pop
// 190: aload 17
// 192: checkcast su/catlean/wu
// 195: astore 18
// 197: bipush 0
// 198: istore 19
// 19a: getstatic com/viaversion/viaversion/protocols/v1_21_4to1_21_5/packet/ServerboundPackets1_21_5.PLAYER_COMMAND Lcom/viaversion/viaversion/protocols/v1_21_4to1_21_5/packet/ServerboundPackets1_21_5;
// 19d: checkcast com/viaversion/viaversion/api/protocol/packet/PacketType
// 1a0: invokestatic com/viaversion/viaversion/api/Via.getManager ()Lcom/viaversion/viaversion/api/ViaManager;
// 1a3: invokeinterface com/viaversion/viaversion/api/ViaManager.getConnectionManager ()Lcom/viaversion/viaversion/api/connection/ConnectionManager; 1
// 1a8: invokeinterface com/viaversion/viaversion/api/connection/ConnectionManager.getConnections ()Ljava/util/Set; 1
// 1ad: dup
// 1ae: sipush 4818
// 1b1: ldc2_w 5955337021400056692
// 1b4: lload 1
// 1b5: lxor
// 1b6: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/wu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1be: checkcast java/lang/Iterable
// 1c1: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/lang/Iterable;)Ljava/lang/Object;
// 1c4: checkcast com/viaversion/viaversion/api/connection/UserConnection
// 1c7: invokestatic com/viaversion/viaversion/api/protocol/packet/PacketWrapper.create (Lcom/viaversion/viaversion/api/protocol/packet/PacketType;Lcom/viaversion/viaversion/api/connection/UserConnection;)Lcom/viaversion/viaversion/api/protocol/packet/PacketWrapper;
// 1ca: astore 20
// 1cc: aload 20
// 1ce: getstatic com/viaversion/viaversion/api/type/Types.VAR_INT Lcom/viaversion/viaversion/api/type/types/VarIntType;
// 1d1: checkcast com/viaversion/viaversion/api/type/Type
// 1d4: lload 11
// 1d6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d9: invokevirtual net/minecraft/class_746.method_5628 ()I
// 1dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 1df: invokeinterface com/viaversion/viaversion/api/protocol/packet/PacketWrapper.write (Lcom/viaversion/viaversion/api/type/Type;Ljava/lang/Object;)V 3
// 1e4: aload 20
// 1e6: getstatic com/viaversion/viaversion/api/type/Types.VAR_INT Lcom/viaversion/viaversion/api/type/types/VarIntType;
// 1e9: checkcast com/viaversion/viaversion/api/type/Type
// 1ec: iload 3
// 1ed: aload 15
// 1ef: ifnull 203
// 1f2: ifeq 206
// 1f5: goto 202
// 1f8: ldc2_w -7524750861346537740
// 1fb: lload 1
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: bipush 0
// 203: goto 207
// 206: bipush 1
// 207: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 20a: invokeinterface com/viaversion/viaversion/api/protocol/packet/PacketWrapper.write (Lcom/viaversion/viaversion/api/type/Type;Ljava/lang/Object;)V 3
// 20f: aload 20
// 211: getstatic com/viaversion/viaversion/api/type/Types.VAR_INT Lcom/viaversion/viaversion/api/type/types/VarIntType;
// 214: checkcast com/viaversion/viaversion/api/type/Type
// 217: bipush 0
// 218: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 21b: invokeinterface com/viaversion/viaversion/api/protocol/packet/PacketWrapper.write (Lcom/viaversion/viaversion/api/type/Type;Ljava/lang/Object;)V 3
// 220: aload 20
// 222: ldc com/viaversion/viaversion/protocols/v1_21_5to1_21_6/Protocol1_21_5To1_21_6
// 224: invokeinterface com/viaversion/viaversion/api/protocol/packet/PacketWrapper.scheduleSendToServer (Ljava/lang/Class;)V 2
// 229: nop
// 22a: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 22d: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
// 230: astore 18
// 232: goto 245
// 235: astore 19
// 237: getstatic kotlin/Result.Companion Lkotlin/Result$Companion;
// 23a: pop
// 23b: aload 19
// 23d: invokestatic kotlin/ResultKt.createFailure (Ljava/lang/Throwable;)Ljava/lang/Object;
// 240: invokestatic kotlin/Result.constructor-impl (Ljava/lang/Object;)Ljava/lang/Object;
// 243: astore 18
// 245: aload 18
// 247: invokestatic kotlin/Result.box-impl (Ljava/lang/Object;)Lkotlin/Result;
// 24a: pop
// 24b: lload 11
// 24d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 250: iload 3
// 251: invokevirtual net/minecraft/class_746.method_5660 (Z)V
// 254: lload 4
// 256: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 259: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 25c: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 25f: iload 3
// 260: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 263: return
}

static {
long var9 = a ^ 94152249705421L;
String[] var10000 = new String[1];
vm.a<"Å">(var10000, -4661131255772791896L, var9);
Cipher var0;
Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[4];
int var5 = 0;
String var4 = "\u0084B0´\u0015·\u0098ú|äYÇ\u0018\u008eßü\u0010j\rñ \u0091&¶Â='?:¬\u0017yïdWLÃÍ\u0002\u0082 \u0010ííÓ5º\u0017ò\u0017Ï\u0014\u001eïÑi\u0004$\u0010\u001d0HÄ\u008c\u0001¥èmÃªí\u009dÁ";
int var6 = "\u0084B0´\u0015·\u0098ú|äYÇ\u0018\u008eßü\u0010j\rñ \u0091&¶Â='?:¬\u0017yïdWLÃÍ\u0002\u0082 \u0010ííÓ5º\u0017ò\u0017Ï\u0014\u001eïÑi\u0004$\u0010\u001d0HÄ\u008c\u0001¥èmÃªí\u009dÁ"
.length();
char var3 = '(';
int var12 = -1;

label27:
while (true) {
String var14 = var4.substring(++var12, var12 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
String var20 = a(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var20;
if ((var12 += var3) >= var6) {
b = var7;
c = new String[4];
H = new wu();
return;
}

var3 = var4.charAt(var12);
break;
default:
var7[var5++] = var20;
if ((var12 += var3) < var6) {
var3 = var4.charAt(var12);
continue label27;
}

var4 = "\u000e\tòÑÒª\u0013\u009d>Û\u0003°\u0093¨\u009fN¶[Õ$X¡»WV5;\u0001°X+xÖôQ\u0097\u0000 \u0000\u0082\u0010©¶O\u000fÂ\"Ü'&Ñ?I5µ\u0015v";
var6 = "\u000e\tòÑÒª\u0013\u009d>Û\u0003°\u0093¨\u009fN¶[Õ$X¡»WV5;\u0001°X+xÖôQ\u0097\u0000 \u0000\u0082\u0010©¶O\u000fÂ\"Ü'&Ñ?I5µ\u0015v".length();
var3 = '(';
var12 = -1;
}

var14 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
}
}

public static void v(String[] var0) {
v = var0;
}

public static String[] p() {
return v;
}

private static Throwable a(Throwable var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1967;
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
throw new RuntimeException("su/catlean/wu", var10);
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
throw new RuntimeException("su/catlean/wu" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
