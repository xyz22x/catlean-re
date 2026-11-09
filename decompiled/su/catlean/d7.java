package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11909;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;

public final class d7 extends class_437 {
@NotNull
private final bj Y;
@NotNull
private final n7 q;
@NotNull
private final n7 e;
private static final long a = yz.a(3256825738675468887L, -3497458798806108626L, MethodHandles.lookup().lookupClass()).a(255241071892958L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public d7(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 48574764299947L;
int var3 = (int)((var1 ^ 48574764299947L) >>> 32);
int var4 = (int)((var1 ^ 48574764299947L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 25737399224030L;
long var8 = var1 ^ 17938430133175L;
super(class_2561.method_30163(a<"x">(17922, 1954989496001627718L ^ var1)));
this.Y = new bj(a<"x">(2690, 4706517248622381761L ^ var1), b<"z">(11885, 1567199079207354426L ^ var1), b<"z">(15241, 3562357085917369810L ^ var1), var6);
this.q = new n7(
0.0F,
0.0F,
100.0F,
25.0F,
i4.h.E(var3, a<"x">(8222, 5985555179602436180L ^ var1), var4, new Object[0], var5),
d7::e,
0,
var8,
null,
null,
0.0F,
0.0F,
b<"z">(19575, 3419479846473015855L ^ var1),
null
);
this.e = new n7(
0.0F,
0.0F,
100.0F,
25.0F,
i4.h.E(var3, a<"x">(30625, 3977616597909780451L ^ var1), var4, new Object[0], var5),
d7::C,
0,
var8,
null,
null,
0.0F,
0.0F,
b<"z">(23146, 8805891643699541040L ^ var1),
null
);
}

public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/d7.a J
// 003: ldc2_w 54840509726374
// 006: lxor
// 007: lstore 5
// 009: lload 5
// 00b: dup2
// 00c: ldc2_w 7908373573341
// 00f: lxor
// 010: lstore 7
// 012: dup2
// 013: ldc2_w 37422096355199
// 016: lxor
// 017: dup2
// 018: bipush 32
// 01a: lushr
// 01b: l2i
// 01c: istore 9
// 01e: dup2
// 01f: bipush 32
// 021: lshl
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 10
// 028: dup2
// 029: bipush 48
// 02b: lshl
// 02c: bipush 48
// 02e: lushr
// 02f: l2i
// 030: istore 11
// 032: pop2
// 033: dup2
// 034: ldc2_w 109914120560735
// 037: lxor
// 038: lstore 12
// 03a: dup2
// 03b: ldc2_w 26525686604093
// 03e: lxor
// 03f: lstore 14
// 041: dup2
// 042: ldc2_w 128748495010877
// 045: lxor
// 046: lstore 16
// 048: dup2
// 049: ldc2_w 64536248550323
// 04c: lxor
// 04d: dup2
// 04e: bipush 48
// 050: lushr
// 051: l2i
// 052: istore 18
// 054: dup2
// 055: bipush 16
// 057: lshl
// 058: bipush 32
// 05a: lushr
// 05b: l2i
// 05c: istore 19
// 05e: dup2
// 05f: bipush 48
// 061: lshl
// 062: bipush 48
// 064: lushr
// 065: l2i
// 066: istore 20
// 068: pop2
// 069: dup2
// 06a: ldc2_w 86320131841023
// 06d: lxor
// 06e: lstore 21
// 070: dup2
// 071: ldc2_w 119474772787494
// 074: lxor
// 075: lstore 23
// 077: pop2
// 078: ldc2_w 6985191604166955922
// 07b: lload 5
// 07d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: aload 1
// 083: sipush 4277
// 086: ldc2_w 424337049689712938
// 089: lload 5
// 08b: lxor
// 08c: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/d7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 094: astore 25
// 096: aload 0
// 097: getfield su/catlean/d7.field_22789 I
// 09a: i2f
// 09b: fconst_2
// 09c: fdiv
// 09d: fstore 26
// 09f: aload 0
// 0a0: getfield su/catlean/d7.field_22790 I
// 0a3: i2f
// 0a4: fconst_2
// 0a5: fdiv
// 0a6: fstore 27
// 0a8: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0ab: aload 1
// 0ac: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0af: dup
// 0b0: sipush 22633
// 0b3: ldc2_w 1771972397383295474
// 0b6: lload 5
// 0b8: lxor
// 0b9: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/d7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c1: fconst_0
// 0c2: fconst_0
// 0c3: aload 0
// 0c4: getfield su/catlean/d7.field_22789 I
// 0c7: i2f
// 0c8: aload 0
// 0c9: getfield su/catlean/d7.field_22790 I
// 0cc: i2f
// 0cd: bipush 1
// 0ce: anewarray 454
// 0d1: astore 28
// 0d3: aload 28
// 0d5: bipush 0
// 0d6: new java/awt/Color
// 0d9: dup
// 0da: sipush 7493
// 0dd: ldc2_w 1563423339488856775
// 0e0: lload 5
// 0e2: lxor
// 0e3: invokedynamic z (IJ)I bsm=su/catlean/d7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: invokespecial java/awt/Color.<init> (I)V
// 0eb: aastore
// 0ec: aload 28
// 0ee: lload 16
// 0f0: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 0f3: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 0f6: iload 9
// 0f8: sipush 19996
// 0fb: ldc2_w 8863628450934208398
// 0fe: lload 5
// 100: lxor
// 101: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/d7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: bipush 0
// 107: anewarray 84
// 10a: iload 10
// 10c: swap
// 10d: iload 11
// 10f: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 112: checkcast java/lang/CharSequence
// 115: bipush 1
// 116: anewarray 10
// 119: astore 29
// 11b: aload 29
// 11d: bipush 0
// 11e: sipush 17673
// 121: ldc2_w 3757240051774995604
// 124: lload 5
// 126: lxor
// 127: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/d7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: aastore
// 12d: aload 29
// 12f: bipush 0
// 130: bipush 0
// 131: sipush 24649
// 134: ldc2_w 2957081648875780032
// 137: lload 5
// 139: lxor
// 13a: invokedynamic z (IJ)I bsm=su/catlean/d7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: aconst_null
// 140: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
// 143: astore 28
// 145: fconst_0
// 146: fstore 29
// 148: aload 28
// 14a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 14f: astore 30
// 151: aload 30
// 153: invokeinterface java/util/Iterator.hasNext ()Z 1
// 158: ifeq 1af
// 15b: aload 30
// 15d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 162: checkcast java/lang/String
// 165: astore 31
// 167: lload 21
// 169: invokestatic su/catlean/b8.i (J)Lsu/catlean/c6;
// 16c: aload 1
// 16d: aload 31
// 16f: fload 26
// 171: fload 27
// 173: ldc 10.0
// 175: fsub
// 176: fload 29
// 178: fadd
// 179: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 17c: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 17f: dup
// 180: sipush 8978
// 183: ldc2_w 2097758891897641603
// 186: lload 5
// 188: lxor
// 189: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/d7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 191: iload 18
// 193: i2c
// 194: iload 19
// 196: ldc 0.5
// 198: iload 20
// 19a: i2s
// 19b: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 19e: lload 12
// 1a0: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 1a3: fload 29
// 1a5: ldc 23.0
// 1a7: fadd
// 1a8: fstore 29
// 1aa: aload 25
// 1ac: ifnonnull 151
// 1af: invokestatic java/lang/System.currentTimeMillis ()J
// 1b2: l2d
// 1b3: ldc2_w 3.0
// 1b6: ddiv
// 1b7: sipush 10925
// 1ba: ldc2_w 3854595881681911078
// 1bd: lload 5
// 1bf: lxor
// 1c0: invokedynamic z (IJ)I bsm=su/catlean/d7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: i2d
// 1c6: drem
// 1c7: d2i
// 1c8: istore 30
// 1ca: iload 30
// 1cc: sipush 14579
// 1cf: ldc2_w 9035589369011138425
// 1d2: lload 5
// 1d4: lxor
// 1d5: invokedynamic z (IJ)I bsm=su/catlean/d7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: aload 25
// 1dc: ifnull 20e
// 1df: if_icmplt 212
// 1e2: goto 1f0
// 1e5: ldc2_w 6936844450840773853
// 1e8: lload 5
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: sipush 17551
// 1f3: ldc2_w 5496371332169765639
// 1f6: lload 5
// 1f8: lxor
// 1f9: invokedynamic z (IJ)I bsm=su/catlean/d7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: iload 30
// 200: goto 20e
// 203: ldc2_w 6936844450840773853
// 206: lload 5
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: isub
// 20f: goto 214
// 212: iload 30
// 214: istore 30
// 216: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 219: getstatic java/awt/Color.RED Ljava/awt/Color;
// 21c: dup
// 21d: sipush 16463
// 220: ldc2_w 2607000740375378389
// 223: lload 5
// 225: lxor
// 226: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/d7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 22e: getstatic java/awt/Color.YELLOW Ljava/awt/Color;
// 231: dup
// 232: sipush 6569
// 235: ldc2_w 8836627133768458293
// 238: lload 5
// 23a: lxor
// 23b: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/d7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 240: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 243: iload 30
// 245: i2f
// 246: ldc 360.0
// 248: fdiv
// 249: lload 7
// 24b: dup2_x2
// 24c: pop2
// 24d: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 250: astore 31
// 252: aload 0
// 253: getfield su/catlean/d7.Y Lsu/catlean/bj;
// 256: aload 1
// 257: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 25a: dup
// 25b: sipush 22173
// 25e: ldc2_w 3170589353643585288
// 261: lload 5
// 263: lxor
// 264: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/d7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 26c: checkcast org/joml/Matrix3x2f
// 26f: fload 26
// 271: f2d
// 272: ldc2_w 16.0
// 275: dsub
// 276: fload 27
// 278: f2d
// 279: ldc2_w 60.0
// 27c: dsub
// 27d: fconst_0
// 27e: fconst_0
// 27f: aload 31
// 281: aconst_null
// 282: fconst_0
// 283: sipush 32398
// 286: ldc2_w 2042778382070032643
// 289: lload 5
// 28b: lxor
// 28c: invokedynamic z (IJ)I bsm=su/catlean/d7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: lload 14
// 293: aconst_null
// 294: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 297: aload 0
// 298: getfield su/catlean/d7.e Lsu/catlean/n7;
// 29b: fload 26
// 29d: ldc 110.0
// 29f: fsub
// 2a0: fload 27
// 2a2: ldc 40.0
// 2a4: fadd
// 2a5: iload 2
// 2a6: i2f
// 2a7: iload 3
// 2a8: i2f
// 2a9: lload 23
// 2ab: dup2_x1
// 2ac: pop2
// 2ad: aload 1
// 2ae: invokevirtual su/catlean/n7.k (FFFJFLnet/minecraft/class_332;)V
// 2b1: aload 0
// 2b2: getfield su/catlean/d7.q Lsu/catlean/n7;
// 2b5: fload 26
// 2b7: ldc 10.0
// 2b9: fadd
// 2ba: fload 27
// 2bc: ldc 40.0
// 2be: fadd
// 2bf: iload 2
// 2c0: i2f
// 2c1: iload 3
// 2c2: i2f
// 2c3: lload 23
// 2c5: dup2_x1
// 2c6: pop2
// 2c7: aload 1
// 2c8: invokevirtual su/catlean/n7.k (FFFJFLnet/minecraft/class_332;)V
// 2cb: return
}

public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
long var3 = a ^ 8753031455867L;
long var5 = var3 ^ 17646716526476L;
Intrinsics.checkNotNullParameter(click, a<"x">(16313, 4817419113726942448L ^ var3));
double var7 = click.comp_4798();
double var9 = click.comp_4799();
this.q.P((float)var7, (float)var9, var5);
this.e.P((float)var7, (float)var9, var5);
return super.method_25402(click, doubled);
}

public void method_25419() {
}

private static final Unit e() {
long var0 = a ^ 8822183909057L;
String var2 = a<"x">(22636, 437985818706348440L ^ var0);
class_156.method_668().method_673(URI.create(var2));
return Unit.INSTANCE;
}

private static final Unit C() {
long var0 = a ^ 107833916092623L;
long var2 = var0 ^ 123993558823657L;
zf.F(var2).close();
return Unit.INSTANCE;
}

static {
long var11 = a ^ 76377555746698L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[14];
int var18 = 0;
String var17 = "\b¬\u0090Þ×p\u0016^u=\u0000é_¢\nå\u000fm#Æh/=é\u0010ö¿ðV÷àKº\u0092\u000f\u0014Í:\u0015N\u009c\u0010!m|\u0015'\u007fbÊ\u0017\u0004\u00993\u0088è`\u008a\u0018 K\u007f\u000fq{É\u000fö*Ðµ\u0013ÂÆÃ\u0002Z|\u0001y)'\u0089(P&:ïÝ2ÕOe\u0089¸\u0014!ô¾6\u0095C¿\\e\b\u0018\u0097ÓØðvämdóë\u0002kü\u0096+V²(múÅ\u0016zX\u0013#Bfé\u0096\u009d\u0007\bÂ\u009c\u0001\u0006\u0099F,\u009d§\u0013Q\u008179Ý\u0000\u008a¶\u0013À»\u0010jÃQ0\u008co+3ß\u0090&\u000eêÇô¡j\u0018\"\u0082évl±²Fben\u0095,Pþç\u0080\u0001ÉJ\u00adC\u0017f°oà\u0088\u0098õ?)\u0096\u001a\u0010\u0018;Aî(>0\u008d\u009c\u000bzsB\u0002g/\u0018a\t\u00186Ý%R4¸ü|îfLÔÎP\u0089¦¯1ád²\u0010!\u00900\u0002ïuú\u008f3fmêà}gû\u0010 8\u0094q³ÄÎA\u0015\rÑS%Y»E\u0010\u009eÌàU×ð<)¦\u0081\u0080HñT\u0098ß";
int var19 = "\b¬\u0090Þ×p\u0016^u=\u0000é_¢\nå\u000fm#Æh/=é\u0010ö¿ðV÷àKº\u0092\u000f\u0014Í:\u0015N\u009c\u0010!m|\u0015'\u007fbÊ\u0017\u0004\u00993\u0088è`\u008a\u0018 K\u007f\u000fq{É\u000fö*Ðµ\u0013ÂÆÃ\u0002Z|\u0001y)'\u0089(P&:ïÝ2ÕOe\u0089¸\u0014!ô¾6\u0095C¿\\e\b\u0018\u0097ÓØðvämdóë\u0002kü\u0096+V²(múÅ\u0016zX\u0013#Bfé\u0096\u009d\u0007\bÂ\u009c\u0001\u0006\u0099F,\u009d§\u0013Q\u008179Ý\u0000\u008a¶\u0013À»\u0010jÃQ0\u008co+3ß\u0090&\u000eêÇô¡j\u0018\"\u0082évl±²Fben\u0095,Pþç\u0080\u0001ÉJ\u00adC\u0017f°oà\u0088\u0098õ?)\u0096\u001a\u0010\u0018;Aî(>0\u008d\u009c\u000bzsB\u0002g/\u0018a\t\u00186Ý%R4¸ü|îfLÔÎP\u0089¦¯1ád²\u0010!\u00900\u0002ïuú\u008f3fmêà}gû\u0010 8\u0094q³ÄÎA\u0015\rÑS%Y»E\u0010\u009eÌàU×ð<)¦\u0081\u0080HñT\u0098ß"
.length();
char var16 = 24;
int var24 = -1;

label54:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var36;
if ((var24 += var16) >= var19) {
b = var20;
c = new String[14];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[10];
int var3 = 0;
String var4 = "Jß\u0003!-¡Ù\u001bÊ\u0013\u0095\u009e\u0085'\u0011\u001f âkè\u0007©ô\u0088·öâ)\u0003\u00adQ½K \u0089Ñ'}\u0007¤}\u0084p\u0091\u009a3*Pé\u009ah\u0016WÄ\u0019OmHg}\r·Á\u0011";
int var5 = "Jß\u0003!-¡Ù\u001bÊ\u0013\u0095\u009e\u0085'\u0011\u001f âkè\u0007©ô\u0088·öâ)\u0003\u00adQ½K \u0089Ñ'}\u0007¤}\u0084p\u0091\u009a3*Pé\u009ah\u0016WÄ\u0019OmHg}\r·Á\u0011"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
f = var6;
g = new Integer[10];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "óho3»]¡°\u0096âw7{ôÿ\u0096";
var5 = "óho3»]¡°\u0096âw7{ôÿ\u0096".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var36;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label54;
}

var17 = "\rÿ\u0003Ð+\u0083Ñ^é\u009dù\u001d\u0099\u009fàe\u0018vÇG½÷ÁK\u008fêä.\u0019?B\u0097¬\u0088üî\u0087W\u0014\u0089\u009f";
var19 = "\rÿ\u0003Ð+\u0083Ñ^é\u009dù\u001d\u0099\u009fàe\u0018vÇG½÷ÁK\u008fêä.\u0019?B\u0097¬\u0088üî\u0087W\u0014\u0089\u009f".length();
var16 = 16;
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6239;
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
throw new RuntimeException("su/catlean/d7", var10);
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
throw new RuntimeException("su/catlean/d7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13891;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/d7", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/d7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
