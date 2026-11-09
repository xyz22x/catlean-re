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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class r9 extends ru {
@NotNull
private final a1 t;
@NotNull
private final fd b;
private boolean G;
private static final long d = yz.a(-8625981493125454776L, -2139543488344178654L, MethodHandles.lookup().lookupClass()).a(244651480308755L);
private static final String[] e;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] k;
private static final Map l;
private static final long m;

public r9(short a, int a, int a, @NotNull a1 setting) {
long var5 = ((long)a << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ d;
long var7 = var5 ^ 87305916343120L;
long var9 = var5 ^ 64006597761340L;
Intrinsics.checkNotNullParameter(setting, a<"h">(30259, 7434204684704708012L ^ var5));
super(var9, setting);
this.t = setting;
this.b = new fd(_s.OUT_QUINT, m, var7);
}

@NotNull
@Override
public a1 A() {
return this.t;
}

@Override
public void r(@NotNull class_332 context, int mouseX, int mouseY, long a, float factor) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 4
// 002: dup2
// 003: ldc2_w 20797107207379
// 006: lxor
// 007: dup2
// 008: bipush 48
// 00a: lushr
// 00b: l2i
// 00c: istore 7
// 00e: dup2
// 00f: bipush 16
// 011: lshl
// 012: bipush 48
// 014: lushr
// 015: l2i
// 016: istore 8
// 018: dup2
// 019: bipush 32
// 01b: lshl
// 01c: bipush 32
// 01e: lushr
// 01f: l2i
// 020: istore 9
// 022: pop2
// 023: dup2
// 024: ldc2_w 39844814704388
// 027: lxor
// 028: lstore 10
// 02a: dup2
// 02b: ldc2_w 114903264084220
// 02e: lxor
// 02f: lstore 12
// 031: dup2
// 032: ldc2_w 126888773963804
// 035: lxor
// 036: lstore 14
// 038: dup2
// 039: ldc2_w 136713714549074
// 03c: lxor
// 03d: lstore 16
// 03f: dup2
// 040: ldc2_w 57758330175306
// 043: lxor
// 044: dup2
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 18
// 04b: dup2
// 04c: bipush 16
// 04e: lshl
// 04f: bipush 32
// 051: lushr
// 052: l2i
// 053: istore 19
// 055: dup2
// 056: bipush 48
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 20
// 05f: pop2
// 060: pop2
// 061: ldc2_w 6640577628623117237
// 064: lload 4
// 066: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: aload 1
// 06c: sipush 6935
// 06f: ldc2_w 7469092957036184879
// 072: lload 4
// 074: lxor
// 075: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/r9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07d: astore 21
// 07f: aload 0
// 080: ldc 14.0
// 082: invokevirtual su/catlean/r9.m (F)V
// 085: aload 0
// 086: getfield su/catlean/r9.b Lsu/catlean/fd;
// 089: aload 0
// 08a: getfield su/catlean/r9.G Z
// 08d: ifeq 09f
// 090: fconst_1
// 091: goto 0a0
// 094: ldc2_w 6686279896651520303
// 097: lload 4
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: fconst_0
// 0a0: lload 10
// 0a2: dup2_x1
// 0a3: pop2
// 0a4: invokevirtual su/catlean/fd.B (JF)V
// 0a7: aload 1
// 0a8: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0ab: dup
// 0ac: sipush 19088
// 0af: ldc2_w 4279553801369146537
// 0b2: lload 4
// 0b4: lxor
// 0b5: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/r9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0bd: aload 0
// 0be: invokevirtual su/catlean/r9.x ()F
// 0c1: iload 7
// 0c3: i2c
// 0c4: swap
// 0c5: aload 0
// 0c6: invokevirtual su/catlean/r9.R ()F
// 0c9: fconst_1
// 0ca: fsub
// 0cb: aload 0
// 0cc: invokevirtual su/catlean/r9.F ()F
// 0cf: ldc 7.0
// 0d1: fsub
// 0d2: aload 0
// 0d3: getfield su/catlean/r9.b Lsu/catlean/fd;
// 0d6: invokevirtual su/catlean/fd.a ()F
// 0d9: aload 0
// 0da: invokevirtual su/catlean/r9.d ()F
// 0dd: ldc 14.0
// 0df: fsub
// 0e0: fmul
// 0e1: ldc 14.0
// 0e3: fadd
// 0e4: fconst_1
// 0e5: fsub
// 0e6: ldc 3.0
// 0e8: ldc 2.5
// 0ea: fconst_0
// 0eb: fconst_1
// 0ec: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0ef: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 0f2: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0f5: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 0f8: fconst_0
// 0f9: iload 8
// 0fb: i2s
// 0fc: fconst_0
// 0fd: iload 9
// 0ff: fconst_0
// 100: sipush 23559
// 103: ldc2_w 1220124693219043250
// 106: lload 4
// 108: lxor
// 109: invokedynamic k (IJ)I bsm=su/catlean/r9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: aconst_null
// 10f: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 112: lload 12
// 114: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 117: aload 1
// 118: aload 0
// 119: invokevirtual su/catlean/r9.A ()Lsu/catlean/a1;
// 11c: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 11f: aload 0
// 120: invokevirtual su/catlean/r9.x ()F
// 123: fconst_2
// 124: fadd
// 125: lload 14
// 127: dup2_x1
// 128: pop2
// 129: aload 0
// 12a: invokevirtual su/catlean/r9.R ()F
// 12d: ldc 0.5
// 12f: fsub
// 130: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 133: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 136: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 139: fconst_1
// 13a: aload 0
// 13b: getfield su/catlean/r9.b Lsu/catlean/fd;
// 13e: invokevirtual su/catlean/fd.a ()F
// 141: fsub
// 142: iload 18
// 144: i2c
// 145: swap
// 146: iload 19
// 148: swap
// 149: iload 20
// 14b: i2s
// 14c: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 14f: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 152: aload 0
// 153: invokevirtual su/catlean/r9.A ()Lsu/catlean/a1;
// 156: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 159: checkcast su/catlean/dg
// 15c: invokevirtual su/catlean/dg.e ()Ljava/util/List;
// 15f: invokeinterface java/util/List.isEmpty ()Z 1
// 164: aload 21
// 166: ifnull 1a8
// 169: ifeq 196
// 16c: goto 17a
// 16f: ldc2_w 6686279896651520303
// 172: lload 4
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: sipush 28020
// 17d: ldc2_w 1561428576988459854
// 180: lload 4
// 182: lxor
// 183: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/r9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: goto 1ab
// 18b: ldc2_w 6686279896651520303
// 18e: lload 4
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: aload 0
// 197: invokevirtual su/catlean/r9.A ()Lsu/catlean/a1;
// 19a: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 19d: checkcast su/catlean/dg
// 1a0: invokevirtual su/catlean/dg.e ()Ljava/util/List;
// 1a3: invokeinterface java/util/List.size ()I 1
// 1a8: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 1ab: astore 22
// 1ad: lload 12
// 1af: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 1b2: lload 16
// 1b4: aload 22
// 1b6: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 1b9: fstore 23
// 1bb: lload 12
// 1bd: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 1c0: aload 1
// 1c1: aload 22
// 1c3: aload 0
// 1c4: invokevirtual su/catlean/r9.x ()F
// 1c7: aload 0
// 1c8: invokevirtual su/catlean/r9.F ()F
// 1cb: fadd
// 1cc: fload 23
// 1ce: fsub
// 1cf: ldc 11.0
// 1d1: fsub
// 1d2: lload 14
// 1d4: dup2_x1
// 1d5: pop2
// 1d6: aload 0
// 1d7: invokevirtual su/catlean/r9.R ()F
// 1da: ldc 0.5
// 1dc: fsub
// 1dd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1e0: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1e3: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 1e6: fconst_1
// 1e7: aload 0
// 1e8: getfield su/catlean/r9.b Lsu/catlean/fd;
// 1eb: invokevirtual su/catlean/fd.a ()F
// 1ee: fsub
// 1ef: iload 18
// 1f1: i2c
// 1f2: swap
// 1f3: iload 19
// 1f5: swap
// 1f6: iload 20
// 1f8: i2s
// 1f9: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1fc: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 1ff: return
}

@Override
public void W(long a, double mouseX, double mouseY, int button) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 58332333883759
// 005: lxor
// 006: lstore 8
// 008: pop2
// 009: ldc2_w 8591482653260427430
// 00c: lload 1
// 00d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 012: aload 0
// 013: invokevirtual su/catlean/r9.x ()F
// 016: fstore 11
// 018: astore 10
// 01a: dload 3
// 01b: aload 0
// 01c: invokevirtual su/catlean/r9.x ()F
// 01f: aload 0
// 020: invokevirtual su/catlean/r9.F ()F
// 023: fadd
// 024: ldc 7.0
// 026: fsub
// 027: f2d
// 028: dcmpg
// 029: aload 10
// 02b: ifnull 050
// 02e: ifgt 077
// 031: goto 03e
// 034: ldc2_w 8636059089287770684
// 037: lload 1
// 038: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: athrow
// 03e: fload 11
// 040: f2d
// 041: dload 3
// 042: dcmpg
// 043: goto 050
// 046: ldc2_w 8636059089287770684
// 049: lload 1
// 04a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: athrow
// 050: aload 10
// 052: ifnull 074
// 055: ifgt 073
// 058: goto 065
// 05b: ldc2_w 8636059089287770684
// 05e: lload 1
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: bipush 1
// 066: goto 078
// 069: ldc2_w 8636059089287770684
// 06c: lload 1
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: bipush 0
// 074: goto 078
// 077: bipush 0
// 078: ifeq 114
// 07b: aload 0
// 07c: invokevirtual su/catlean/r9.R ()F
// 07f: fstore 11
// 081: dload 5
// 083: aload 0
// 084: invokevirtual su/catlean/r9.R ()F
// 087: sipush 7563
// 08a: ldc2_w 8749167771893730604
// 08d: lload 1
// 08e: lxor
// 08f: invokedynamic k (IJ)I bsm=su/catlean/r9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: i2f
// 095: fadd
// 096: f2d
// 097: dcmpg
// 098: aload 10
// 09a: lload 1
// 09b: lconst_0
// 09c: lcmp
// 09d: iflt 0c8
// 0a0: ifnull 0c6
// 0a3: ifgt 0ed
// 0a6: goto 0b3
// 0a9: ldc2_w 8636059089287770684
// 0ac: lload 1
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: fload 11
// 0b5: f2d
// 0b6: dload 5
// 0b8: dcmpg
// 0b9: goto 0c6
// 0bc: ldc2_w 8636059089287770684
// 0bf: lload 1
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: aload 10
// 0c8: ifnull 0ea
// 0cb: ifgt 0e9
// 0ce: goto 0db
// 0d1: ldc2_w 8636059089287770684
// 0d4: lload 1
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: bipush 1
// 0dc: goto 0ee
// 0df: ldc2_w 8636059089287770684
// 0e2: lload 1
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: bipush 0
// 0ea: goto 0ee
// 0ed: bipush 0
// 0ee: ifeq 114
// 0f1: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 0f4: new su/catlean/dp
// 0f7: dup
// 0f8: aload 0
// 0f9: invokevirtual su/catlean/r9.A ()Lsu/catlean/a1;
// 0fc: lload 8
// 0fe: invokespecial su/catlean/dp.<init> (Lsu/catlean/a1;J)V
// 101: checkcast su/catlean/dj
// 104: invokevirtual su/catlean/fi.o (Lsu/catlean/dj;)V
// 107: goto 114
// 10a: ldc2_w 8636059089287770684
// 10d: lload 1
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: return
}

@Override
public void U(double mouseX, double mouseY, int button) {
}

@Override
public void V(int key, short a, int a, char a) {
}

@Override
public void T(char char, long a) {
}

@Override
public boolean S(byte a, double mouseX, double mouseY, double verticalAmount, long a) {
return false;
}

@Override
public void L() {
}

static {
long var16 = d ^ 136258922869335L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[4];
int var23 = 0;
String var22 = "³#ÂæAÇ\u0018Nð\u0007¸YzvPL\u0010\u0084%\u0081TÏ Ø ÖgÔ'ª\u0014Õ\u008d";
int var24 = "³#ÂæAÇ\u0018Nð\u0007¸YzvPL\u0010\u0084%\u0081TÏ Ø ÖgÔ'ª\u0014Õ\u008d".length();
char var21 = 16;
int var28 = -1;

label56:
while (true) {
String var29 = var22.substring(++var28, var28 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var29.getBytes("ISO-8859-1"));
String var40 = b(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var40;
if ((var28 += var21) >= var24) {
e = var25;
f = new String[4];
l = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[2];
int var8 = 0;
String var9 = "Kµ\u0080\u007fsòzñQD\u001d3ý¬;\u0084";
int var10 = "Kµ\u0080\u007fsòzñQD\u001d3ý¬;\u0084".length();
byte var7 = 0;

do {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
var10001 = var8++;
long var13 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var10004 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
byte var47 = -1;
var11[var10001] = var10004;
} while (var7 < var10);

h = var11;
k = new Integer[2];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -8972679258372053537L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var45 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var38 = -1;
m = var45;
return;
}

var21 = var22.charAt(var28);
break;
default:
var25[var23++] = var40;
if ((var28 += var21) < var24) {
var21 = var22.charAt(var28);
continue label56;
}

var22 = "#\u0004Íó\u0010R}Ä®\u0080\u001a¦ú°Ìv ¦\u0082\u0089%ç¶\"*º¢p®\u0085ejé÷±\u00807nÞå³\u0016Ã<ã¶T\rÆ";
var24 = "#\u0004Íó\u0010R}Ä®\u0080\u001a¦ú°Ìv ¦\u0082\u0089%ç¶\"*º¢p®\u0085ejé÷±\u00807nÞå³\u0016Ã<ã¶T\rÆ".length();
var21 = 16;
var28 = -1;
}

var29 = var22.substring(++var28, var28 + var21);
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17162;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/r9", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = e[var5].getBytes("ISO-8859-1");
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/r9" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26245;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/r9", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
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
throw new RuntimeException("su/catlean/r9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
