package su.catlean;

import java.awt.Color;
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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class k2 extends _g {
@NotNull
public static final k2 W;
static final KProperty[] G;
@NotNull
private static final ct n;
@NotNull
private static final cs w;
@NotNull
private static final cs d;
private static final long a = yz.a(8256421777120623764L, 220978328704308155L, MethodHandles.lookup().lookupClass()).a(47797196814303L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);

private k2(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 37698176647566L;
super(b<"s">(27668, 6153984240512302606L ^ var1), jt.z(), null, 4, null, var3);
}

private final float L(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 131690147377958L;
return ((Number)n.E(this, var6, G[0])).floatValue();
}

private final Color a(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 30162052100069L;
return (Color)w.E(this, var3, G[1]);
}

private final Color I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 9678074584494L;
return (Color)d.E(this, var3, G[2]);
}

@Flow
private final void E(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k2.a J
// 003: ldc2_w 66640518496382
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 26811081772440
// 00d: lxor
// 00e: dup2
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 8
// 018: lshl
// 019: bipush 8
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 31566408600434
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 133281497674558
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 108294167435841
// 031: lxor
// 032: dup2
// 033: bipush 32
// 035: lushr
// 036: l2i
// 037: istore 11
// 039: dup2
// 03a: bipush 32
// 03c: lshl
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 12
// 043: dup2
// 044: bipush 48
// 046: lshl
// 047: bipush 48
// 049: lushr
// 04a: l2i
// 04b: istore 13
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 72630057041036
// 052: lxor
// 053: dup2
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 14
// 05a: dup2
// 05b: bipush 16
// 05d: lshl
// 05e: bipush 32
// 060: lushr
// 061: l2i
// 062: istore 15
// 064: dup2
// 065: bipush 48
// 067: lshl
// 068: bipush 48
// 06a: lushr
// 06b: l2i
// 06c: istore 16
// 06e: pop2
// 06f: dup2
// 070: ldc2_w 15130544872254
// 073: lxor
// 074: lstore 17
// 076: dup2
// 077: ldc2_w 135441969827225
// 07a: lxor
// 07b: lstore 19
// 07d: pop2
// 07e: ldc2_w 2249374375207440337
// 081: lload 2
// 082: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: istore 21
// 089: lload 19
// 08b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 08e: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 091: iload 21
// 093: ifne 0e0
// 096: ifeq 0e3
// 099: goto 0a6
// 09c: ldc2_w 2258562705225577501
// 09f: lload 2
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: lload 9
// 0a8: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0ab: aload 0
// 0ac: lload 19
// 0ae: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b1: iload 4
// 0b3: i2b
// 0b4: swap
// 0b5: lload 5
// 0b7: dup2_x1
// 0b8: pop2
// 0b9: checkcast net/minecraft/class_1297
// 0bc: invokevirtual su/catlean/k2.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0bf: dconst_0
// 0c0: ldc2_w 0.21
// 0c3: dconst_0
// 0c4: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0c7: checkcast net/minecraft/class_2374
// 0ca: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0cd: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0d0: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 0d3: goto 0e0
// 0d6: ldc2_w 2258562705225577501
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: ifne 0e4
// 0e3: return
// 0e4: aload 0
// 0e5: iload 11
// 0e7: iload 12
// 0e9: i2s
// 0ea: iload 13
// 0ec: i2s
// 0ed: invokespecial su/catlean/k2.M (ISS)Ljava/util/Map;
// 0f0: astore 22
// 0f2: aload 22
// 0f4: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 0f9: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 0fe: astore 23
// 100: aload 23
// 102: invokeinterface java/util/Iterator.hasNext ()Z 1
// 107: ifeq 16c
// 10a: aload 23
// 10c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 111: checkcast java/util/Map$Entry
// 114: astore 24
// 116: lload 7
// 118: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 11b: aload 24
// 11d: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 122: checkcast net/minecraft/class_238
// 125: aload 24
// 127: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 12c: checkcast java/awt/Color
// 12f: aconst_null
// 130: bipush 4
// 131: aconst_null
// 132: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 135: pop
// 136: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 139: aload 24
// 13b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 140: lload 17
// 142: dup2_x1
// 143: pop2
// 144: checkcast net/minecraft/class_238
// 147: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 14a: aload 24
// 14c: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 151: checkcast java/awt/Color
// 154: iload 14
// 156: i2c
// 157: iload 15
// 159: fconst_1
// 15a: iload 16
// 15c: i2s
// 15d: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 160: aconst_null
// 161: bipush 4
// 162: aconst_null
// 163: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 166: pop
// 167: iload 21
// 169: ifeq 100
// 16c: return
}

private final Map M(int param1, short param2, short param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/k2.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 21028244896661
// 023: lxor
// 024: dup2
// 025: bipush 48
// 027: lushr
// 028: l2i
// 029: istore 6
// 02b: dup2
// 02c: bipush 16
// 02e: lshl
// 02f: bipush 48
// 031: lushr
// 032: l2i
// 033: istore 7
// 035: dup2
// 036: bipush 32
// 038: lshl
// 039: bipush 32
// 03b: lushr
// 03c: l2i
// 03d: istore 8
// 03f: pop2
// 040: dup2
// 041: ldc2_w 118922801567005
// 044: lxor
// 045: lstore 9
// 047: dup2
// 048: ldc2_w 140235564640086
// 04b: lxor
// 04c: lstore 11
// 04e: dup2
// 04f: ldc2_w 107231571654647
// 052: lxor
// 053: lstore 13
// 055: dup2
// 056: ldc2_w 109477736057168
// 059: lxor
// 05a: lstore 15
// 05c: pop2
// 05d: new java/util/LinkedHashMap
// 060: dup
// 061: invokespecial java/util/LinkedHashMap.<init> ()V
// 064: checkcast java/util/Map
// 067: astore 18
// 069: ldc2_w 6567078447815198191
// 06c: lload 4
// 06e: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: lload 13
// 075: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 078: lload 15
// 07a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07d: checkcast net/minecraft/class_1297
// 080: lload 15
// 082: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 085: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 088: aload 0
// 089: iload 6
// 08b: i2c
// 08c: iload 7
// 08e: i2c
// 08f: iload 8
// 091: invokespecial su/catlean/k2.L (CCI)F
// 094: f2d
// 095: dconst_0
// 096: aload 0
// 097: iload 6
// 099: i2c
// 09a: iload 7
// 09c: i2c
// 09d: iload 8
// 09f: invokespecial su/catlean/k2.L (CCI)F
// 0a2: f2d
// 0a3: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 0a6: lload 15
// 0a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ab: invokevirtual net/minecraft/class_746.method_23318 ()D
// 0ae: ldc2_w 0.21
// 0b1: dadd
// 0b2: invokevirtual net/minecraft/class_238.method_35575 (D)Lnet/minecraft/class_238;
// 0b5: lload 15
// 0b7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ba: invokevirtual net/minecraft/class_746.method_23318 ()D
// 0bd: ldc2_w 0.21
// 0c0: dadd
// 0c1: invokevirtual net/minecraft/class_238.method_35578 (D)Lnet/minecraft/class_238;
// 0c4: invokevirtual net/minecraft/class_638.method_20812 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/lang/Iterable;
// 0c7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0cc: astore 19
// 0ce: istore 17
// 0d0: aload 19
// 0d2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0d7: ifeq 173
// 0da: aload 19
// 0dc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0e1: dup
// 0e2: sipush 17295
// 0e5: ldc2_w 3153700821261966072
// 0e8: lload 4
// 0ea: lxor
// 0eb: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/k2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f3: checkcast net/minecraft/class_265
// 0f6: astore 20
// 0f8: aload 18
// 0fa: iload 17
// 0fc: ifeq 175
// 0ff: aload 20
// 101: invokevirtual net/minecraft/class_265.method_1107 ()Lnet/minecraft/class_238;
// 104: aload 20
// 106: invokevirtual net/minecraft/class_265.method_1107 ()Lnet/minecraft/class_238;
// 109: getfield net/minecraft/class_238.field_1322 D
// 10c: invokevirtual net/minecraft/class_238.method_35578 (D)Lnet/minecraft/class_238;
// 10f: dup
// 110: sipush 31045
// 113: ldc2_w 3700698922969129011
// 116: lload 4
// 118: lxor
// 119: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/k2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 121: lload 13
// 123: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 126: aload 20
// 128: invokevirtual net/minecraft/class_265.method_1107 ()Lnet/minecraft/class_238;
// 12b: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 12e: checkcast net/minecraft/class_2374
// 131: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 134: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 137: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 13a: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 13d: ifeq 162
// 140: goto 14e
// 143: ldc2_w 6598088389755678932
// 146: lload 4
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: aload 0
// 14f: lload 9
// 151: invokespecial su/catlean/k2.I (J)Ljava/awt/Color;
// 154: goto 168
// 157: ldc2_w 6598088389755678932
// 15a: lload 4
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: aload 0
// 163: lload 11
// 165: invokespecial su/catlean/k2.a (J)Ljava/awt/Color;
// 168: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 16d: pop
// 16e: iload 17
// 170: ifne 0d0
// 173: aload 18
// 175: areturn
}

static {
long var20 = a ^ 120377022361817L;
long var22 = var20 ^ 32256607102669L;
long var24 = var20 ^ 120977601454478L;
int var26 = (int)((var20 ^ 104981421744662L) >>> 48);
long var27 = (var20 ^ 104981421744662L) << 16 >>> 16;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[12];
int var16 = 0;
String var15 = "\u0085÷\u0095´l,Ý\n\u008dýmbJÝ±ÃaÇ#Ç\u0019W\u0019\u0004\u0010Dx\u0018\u000eI¤!fÆ\u0093\u009f°Û+öÅ\u0010Ü. v>oµï(CÍ¢`£-\u0001\u0018\u001d\u0080v1\u000fáÕ¼é\u0002Õ\u0002AM³s.dè¹°\u000e\r!\u0018+À\u009fO\u00035ß°\u001bÆê£[\u0017É\u0085\u001f\fÚN\u009c-\u000b¬\u0018\u0091f\u0001\u0086\u008c]a£\\®p\u0096ðÁï¥Ò`Ç4\u00878÷+0Ù¸@\u0090G)\u0016\u0002ýy;â½½û¨¡5oh\u0002'ûªS\u0006\\´zK¥´\u0090e·ëÛÌqÚõóRnaâi¤\u0010¼Þýáât\u009eÏ(·R\u001e\u0096\u0001C¶ \u000f\u00adm$\r\u0095ðæ¾\n\u008a\u0091\u0080\u001e´÷Á9\u0015\u001eh\f¢&\u0083\u0088\n\"Ü\u0006Õ_\u0010ýFC³äxÑ\u001aí\u009fGDEÁË\u0090";
int var17 = "\u0085÷\u0095´l,Ý\n\u008dýmbJÝ±ÃaÇ#Ç\u0019W\u0019\u0004\u0010Dx\u0018\u000eI¤!fÆ\u0093\u009f°Û+öÅ\u0010Ü. v>oµï(CÍ¢`£-\u0001\u0018\u001d\u0080v1\u000fáÕ¼é\u0002Õ\u0002AM³s.dè¹°\u000e\r!\u0018+À\u009fO\u00035ß°\u001bÆê£[\u0017É\u0085\u001f\fÚN\u009c-\u000b¬\u0018\u0091f\u0001\u0086\u008c]a£\\®p\u0096ðÁï¥Ò`Ç4\u00878÷+0Ù¸@\u0090G)\u0016\u0002ýy;â½½û¨¡5oh\u0002'ûªS\u0006\\´zK¥´\u0090e·ëÛÌqÚõóRnaâi¤\u0010¼Þýáât\u009eÏ(·R\u001e\u0096\u0001C¶ \u000f\u00adm$\r\u0095ðæ¾\n\u008a\u0091\u0080\u001e´÷Á9\u0015\u001eh\f¢&\u0083\u0088\n\"Ü\u0006Õ_\u0010ýFC³äxÑ\u001aí\u009fGDEÁË\u0090"
.length();
char var14 = 24;
int var32 = -1;

label55:
while (true) {
String var33 = var15.substring(++var32, var32 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var33.getBytes("ISO-8859-1"));
String var44 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var44;
if ((var32 += var14) >= var17) {
b = var18;
c = new String[12];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[9];
int var4 = 0;
String var5 = "AÓÇËp7sx\u0082\u0093#\u0087Í\u0004°ï\u009aPì\u0081¿Ï?ÑvÙ\u0015\u0096\u0005àaVÇÂQüÒÀ>¸\u0000ëZ¿u¹»\u0007>,IxÈ\rðR";
int var6 = "AÓÇËp7sx\u0082\u0093#\u0087Í\u0004°ï\u009aPì\u0081¿Ï?ÑvÙ\u0015\u0096\u0005àaVÇÂQüÒÀ>¸\u0000ëZ¿u¹»\u0007>,IxÈ\rðR".length();
byte var3 = 0;

label37:
while (true) {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
long[] var36 = var0;
var10001 = var4++;
long var48 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var51 = -1;

while (true) {
long var8 = var48;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var53 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var51) {
case 0:
var36[var10001] = var53;
if (var3 >= var6) {
KProperty[] var29 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(k2.class, b<"s">(9956, 1135171134304390143L ^ var20), b<"s">(24368, 3059513420122518052L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(k2.class, b<"s">(23136, 4391678937147504510L ^ var20), b<"s">(16056, 2825036497582494639L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(k2.class, b<"s">(24286, 6689134711041422273L ^ var20), b<"s">(2703, 4231747612725127061L ^ var20), 0))
};
G = var29;
W = new k2(var24);
n = yp.k(W, b<"s">(27114, 1431071277385073919L ^ var20), 1.0F, var22, RangesKt.rangeTo(0.01F, 3.0F), null, null, (int)var0[8], null);
w = yp.b(
W,
(short)var26,
b<"s">(25553, 6279138673062203079L ^ var20),
new Color((int)var0[2], (int)var0[0], (int)var0[0], (int)var0[3]),
null,
null,
(int)var0[4],
null,
var27
);
d = yp.b(
W,
(short)var26,
b<"s">(17229, 1405980404010118736L ^ var20),
new Color((int)var0[0], (int)var0[1], (int)var0[7], (int)var0[5]),
null,
null,
(int)var0[6],
null,
var27
);
return;
}
break;
default:
var36[var10001] = var53;
if (var3 < var6) {
continue label37;
}

var5 = ";\u0094ß(\u00adàáãhÚ¸èY¢2\u009c";
var6 = ";\u0094ß(\u00adàáãhÚ¸èY¢2\u009c".length();
var3 = 0;
}

byte var42 = var3;
var3 += 8;
var7 = var5.substring(var42, var3).getBytes("ISO-8859-1");
var36 = var0;
var10001 = var4++;
var48 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var51 = 0;
}
}
}

var14 = var15.charAt(var32);
break;
default:
var18[var16++] = var44;
if ((var32 += var14) < var17) {
var14 = var15.charAt(var32);
continue label55;
}

var15 = "Ç\u009c +Åfô$\u001b-`mN\u0085%\u000305ìçðÅÙ÷9\u0093Eä\u008229Ëg;ä£\u0012\u008fXÆD*\u008a\u008a\u0018P5\u000bä'uFý¿;\u0015å0?Ê\u0015S\rQZ";
var17 = "Ç\u009c +Åfô$\u001b-`mN\u0085%\u000305ìçðÅÙ÷9\u0093Eä\u008229Ëg;ä£\u0012\u008fXÆD*\u008a\u008a\u0018P5\u000bä'uFý¿;\u0015å0?Ê\u0015S\rQZ".length();
var14 = 16;
var32 = -1;
}

var33 = var15.substring(++var32, var32 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17229;
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
throw new RuntimeException("su/catlean/k2", var10);
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
throw new RuntimeException("su/catlean/k2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
