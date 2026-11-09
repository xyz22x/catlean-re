package su.catlean;

import it.unimi.dsi.fastutil.chars.Char2IntArrayMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.awt.Color;
import java.awt.Font;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;

public final class y3 {
@NotNull
public static final y3 i;
private static final char S;
@NotNull
private static final Char2IntArrayMap C;
private static final long a = yz.a(-8434565965091478071L, 633131840613666972L, MethodHandles.lookup().lookupClass()).a(118144023414312L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private y3() {
}

@NotNull
public final Char2IntArrayMap e() {
return C;
}

public final int D(int x, int n) {
return n * (int)Math.floor((double)x / n);
}

@NotNull
public final String A(char a, int a, int a, @NotNull String text) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/y3.a J
// 01a: lxor
// 01b: lstore 5
// 01d: lload 5
// 01f: dup2
// 020: ldc2_w 126203863740344
// 023: lxor
// 024: dup2
// 025: bipush 48
// 027: lushr
// 028: l2i
// 029: istore 7
// 02b: dup2
// 02c: bipush 16
// 02e: lshl
// 02f: bipush 32
// 031: lushr
// 032: l2i
// 033: istore 8
// 035: dup2
// 036: bipush 48
// 038: lshl
// 039: bipush 48
// 03b: lushr
// 03c: l2i
// 03d: istore 9
// 03f: pop2
// 040: pop2
// 041: aload 4
// 043: sipush 9745
// 046: ldc2_w 5897082012921721003
// 049: lload 5
// 04b: lxor
// 04c: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 054: aload 4
// 056: invokevirtual java/lang/String.toCharArray ()[C
// 059: dup
// 05a: sipush 14389
// 05d: ldc2_w 8680235666935574149
// 060: lload 5
// 062: lxor
// 063: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 06b: astore 10
// 06d: new java/lang/StringBuilder
// 070: dup
// 071: aload 10
// 073: arraylength
// 074: invokespecial java/lang/StringBuilder.<init> (I)V
// 077: astore 11
// 079: bipush 0
// 07a: istore 12
// 07c: iload 12
// 07e: aload 10
// 080: arraylength
// 081: if_icmpge 12f
// 084: aload 10
// 086: iload 12
// 088: caload
// 089: istore 13
// 08b: iload 3
// 08c: iflt 12b
// 08f: iload 13
// 091: sipush 6068
// 094: ldc2_w 2622761447471246389
// 097: lload 5
// 099: lxor
// 09a: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: if_icmpne 120
// 0a2: iload 12
// 0a4: bipush 1
// 0a5: iadd
// 0a6: aload 10
// 0a8: arraylength
// 0a9: if_icmpge 12f
// 0ac: goto 0ba
// 0af: ldc2_w 4457441758934094680
// 0b2: lload 5
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: aload 10
// 0bc: iload 12
// 0be: bipush 1
// 0bf: iadd
// 0c0: caload
// 0c1: istore 14
// 0c3: iload 1
// 0c4: iflt 11c
// 0c7: iload 14
// 0c9: lookupswitch 80 2 88 27 120 27
// 0e4: iload 3
// 0e5: iflt 11c
// 0e8: aload 0
// 0e9: aload 10
// 0eb: iload 12
// 0ed: iload 7
// 0ef: i2s
// 0f0: iload 8
// 0f2: iload 9
// 0f4: invokespecial su/catlean/y3.U ([CISII)Z
// 0f7: ifeq 119
// 0fa: goto 108
// 0fd: ldc2_w 4457441758934094680
// 100: lload 5
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: iinc 12 14
// 10b: goto 07c
// 10e: ldc2_w 4457441758934094680
// 111: lload 5
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: iinc 12 2
// 11c: iload 1
// 11d: ifge 07c
// 120: aload 11
// 122: iload 13
// 124: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
// 127: pop
// 128: iinc 12 1
// 12b: iload 3
// 12c: ifge 07c
// 12f: aload 11
// 131: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
// 134: dup
// 135: sipush 3669
// 138: ldc2_w 2721883389180467434
// 13b: lload 5
// 13d: lxor
// 13e: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 146: areturn
}

@NotNull
public final class_2960 n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 603358048552L;
long var10001 = var1 ^ 13526064116084L;
int var5 = (int)((var1 ^ 13526064116084L) >>> 48);
int var6 = (int)((var1 ^ 13526064116084L) << 16 >>> 32);
int var7 = (int)(var10001 << 48 >>> 48);
return l6.J(a<"y">(7775, 471844887905103503L ^ var1), a<"y">(26639, 6983197658547001561L ^ var1) + this.H((short)var5, var6, var7), var3);
}

@NotNull
public final String H(short var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
Object var10000 = IntStream.range(0, b<"j">(4746, 4538732396000204480L ^ var4)).mapToObj(y3::t).collect(Collectors.joining());
Intrinsics.checkNotNullExpressionValue(var10000, a<"y">(19304, 5034096409759785481L ^ var4));
return (String)var10000;
}

@NotNull
public final int[] b(int i, long a) {
ax = a ^ ax;
int var4 = ix >> b<"j">(23793, 7028914271734276860L ^ ax) & b<"j">(30133, 1557276049564175265L ^ ax);
int var5 = ix >> b<"j">(18075, 1652654939044001958L ^ ax) & b<"j">(1331, 6834564071064271660L ^ ax);
int var6 = ix & b<"j">(1331, 6834564071064271660L ^ ax);
return new int[]{var4, var5, var6};
}

public final float K(int a, float n, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: lload 3
// 06: bipush 32
// 08: lshl
// 09: bipush 32
// 0b: lushr
// 0c: lor
// 0d: getstatic su/catlean/y3.a J
// 10: lxor
// 11: lstore 5
// 13: ldc2_w 2151921980995097817
// 16: lload 5
// 18: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: astore 7
// 1f: fload 2
// 20: invokestatic java/lang/Float.isNaN (F)Z
// 23: aload 7
// 25: ifnull 59
// 28: ifeq 48
// 2b: goto 39
// 2e: ldc2_w 2104649995240371121
// 31: lload 5
// 33: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: athrow
// 39: fconst_1
// 3a: goto 5d
// 3d: ldc2_w 2104649995240371121
// 40: lload 5
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: fload 2
// 49: ldc 100.0
// 4b: fmul
// 4c: invokestatic kotlin/math/MathKt.roundToInt (F)I
// 4f: i2f
// 50: ldc 100.0
// 52: fdiv
// 53: ldc 10.0
// 55: fmul
// 56: invokestatic kotlin/math/MathKt.roundToInt (F)I
// 59: i2f
// 5a: ldc 10.0
// 5c: fdiv
// 5d: freturn
}

@NotNull
public final fj V(char from, char to, long a, @NotNull Font font, @NotNull ObjectArrayList maps, int padding) {
ax = a ^ ax;
long var8 = ax ^ 71455825400908L;
long var10 = ax ^ 51664472824577L;
Intrinsics.checkNotNullParameter(font, a<"y">(32442, 2942907923613922027L ^ ax));
Intrinsics.checkNotNullParameter(maps, a<"y">(27612, 6136495475736455058L ^ ax));
fj var12 = new fj(var10, from, to, font, this.n(var8), padding);
maps.add(var12);
return var12;
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@Nullable
public final ze g(long a, char glyph, @NotNull ObjectArrayList maps, @NotNull Font font, @NotNull Font fallBack) {
ax = a ^ ax;
long var7 = ax ^ 105927138144800L;
long var9 = ax ^ 134971474964223L;
long var11 = ax ^ 131475407390308L;
Intrinsics.checkNotNullParameter(maps, a<"y">(27612, 6136500404634313122L ^ ax));
Intrinsics.checkNotNullParameter(font, a<"y">(32442, 2942895302738474203L ^ ax));
Intrinsics.checkNotNullParameter(fallBack, a<"y">(11392, 1119409907160524539L ^ ax));
byte var13 = 5;
int var14 = b<"j">(11813, 5014467788017764731L ^ ax);
ObjectListIterator var10000 = maps.iterator();
Intrinsics.checkNotNullExpressionValue(var10000, a<"y">(13604, 4156320245684453207L ^ ax));
ObjectListIterator var15 = var10000;

label46:
while (var15.hasNext()) {
Object var23 = var15.next();

do {
fj var16 = (fj)var23;
if (!var16.U(glyph, var7)) {
continue label46;
}

var23 = var16.z(var11, glyph);
} while (ax <= 0L);

return (ze)var23;
}

int var21 = this.D(glyph, var14);
boolean var24 = font.canDisplay(glyph);
if (ax < 0L) {
try {
return var24 ? this.V((char)var21, (char)(var21 + var14), var9, fallBack, maps, var13).z(var11, glyph) : null;
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 6990724989465530240L, ax);
}
} else {
if (var24) {
ze var22 = this.V((char)var21, (char)(var21 + var14), var9, font, maps, var13).z(var11, glyph);

try {
if (ax >= 0L && var22 != null) {
return var22;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, 6990724989465530240L, ax);
}
}

label29:
try {
var24 = fallBack.canDisplay(glyph);
break label29;
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 6990724989465530240L, ax);
}
}
}

@Nullable
public final ze y(
byte a, int a, char glyph, @NotNull Char2ObjectArrayMap allGlyphs, int a, @NotNull ObjectArrayList maps, @NotNull Font font, @NotNull Font fallBack
) {
long var9 = ((long)axxx << 56 | (long)ax << 32 >>> 8 | (long)axx << 40 >>> 40) ^ a;
long var11 = var9 ^ 120471503581885L;
Intrinsics.checkNotNullParameter(allGlyphs, a<"y">(25937, 6700538458678752604L ^ var9));
Intrinsics.checkNotNullParameter(maps, a<"y">(27612, 6136472592316169168L ^ var9));
Intrinsics.checkNotNullParameter(font, a<"y">(32442, 2942918162960379561L ^ var9));
Intrinsics.checkNotNullParameter(fallBack, a<"y">(11392, 1119402568950430857L ^ var9));
ze var10000 = (ze)allGlyphs.get(glyph);
if (var10000 != null) {
ze var14 = var10000;
boolean var15 = false;
return var14;
} else {
ze var13 = this.g(var11, glyph, maps, font, fallBack);
((Map)allGlyphs).put(glyph, var13);
return var13;
}
}

public final void e(
@NotNull Matrix3x2fStack stack,
@NotNull String s,
int a,
float x,
float y,
int a,
@NotNull Color color,
boolean gradient,
int offset,
float scaleMul,
@NotNull Char2ObjectArrayMap allGlyphs,
byte a,
@NotNull ObjectArrayList maps,
@NotNull Font font,
@NotNull Font fallBack,
@NotNull Object2ObjectOpenHashMap glyphPage
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 3
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 6
// 007: i2l
// 008: bipush 40
// 00a: lshl
// 00b: bipush 32
// 00d: lushr
// 00e: lor
// 00f: iload 12
// 011: i2l
// 012: bipush 56
// 014: lshl
// 015: bipush 56
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/y3.a J
// 01c: lxor
// 01d: lstore 17
// 01f: lload 17
// 021: dup2
// 022: ldc2_w 68372984405165
// 025: lxor
// 026: lstore 19
// 028: dup2
// 029: ldc2_w 57136396918157
// 02c: lxor
// 02d: dup2
// 02e: bipush 8
// 030: lushr
// 031: lstore 21
// 033: dup2
// 034: bipush 56
// 036: lshl
// 037: bipush 56
// 039: lushr
// 03a: l2i
// 03b: istore 23
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 120332517818889
// 042: lxor
// 043: lstore 24
// 045: dup2
// 046: ldc2_w 77240733847789
// 049: lxor
// 04a: lstore 26
// 04c: dup2
// 04d: ldc2_w 11875727502953
// 050: lxor
// 051: dup2
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 28
// 058: dup2
// 059: bipush 16
// 05b: lshl
// 05c: bipush 32
// 05e: lushr
// 05f: l2i
// 060: istore 29
// 062: dup2
// 063: bipush 48
// 065: lshl
// 066: bipush 48
// 068: lushr
// 069: l2i
// 06a: istore 30
// 06c: pop2
// 06d: dup2
// 06e: ldc2_w 48862785205634
// 071: lxor
// 072: dup2
// 073: bipush 32
// 075: lushr
// 076: l2i
// 077: istore 31
// 079: dup2
// 07a: bipush 32
// 07c: lshl
// 07d: bipush 32
// 07f: lushr
// 080: lstore 32
// 082: pop2
// 083: dup2
// 084: ldc2_w 13609218180930
// 087: lxor
// 088: lstore 34
// 08a: dup2
// 08b: ldc2_w 26848343057985
// 08e: lxor
// 08f: dup2
// 090: bipush 48
// 092: lushr
// 093: l2i
// 094: istore 36
// 096: dup2
// 097: bipush 16
// 099: lshl
// 09a: bipush 32
// 09c: lushr
// 09d: l2i
// 09e: istore 37
// 0a0: dup2
// 0a1: bipush 48
// 0a3: lshl
// 0a4: bipush 48
// 0a6: lushr
// 0a7: l2i
// 0a8: istore 38
// 0aa: pop2
// 0ab: dup2
// 0ac: ldc2_w 108772363486174
// 0af: lxor
// 0b0: lstore 39
// 0b2: dup2
// 0b3: ldc2_w 57589483378611
// 0b6: lxor
// 0b7: lstore 41
// 0b9: dup2
// 0ba: ldc2_w 86769029664043
// 0bd: lxor
// 0be: lstore 43
// 0c0: dup2
// 0c1: ldc2_w 41476368251452
// 0c4: lxor
// 0c5: dup2
// 0c6: bipush 48
// 0c8: lushr
// 0c9: l2i
// 0ca: istore 45
// 0cc: dup2
// 0cd: bipush 16
// 0cf: lshl
// 0d0: bipush 32
// 0d2: lushr
// 0d3: l2i
// 0d4: istore 46
// 0d6: dup2
// 0d7: bipush 48
// 0d9: lshl
// 0da: bipush 48
// 0dc: lushr
// 0dd: l2i
// 0de: istore 47
// 0e0: pop2
// 0e1: dup2
// 0e2: ldc2_w 1634801255698
// 0e5: lxor
// 0e6: lstore 48
// 0e8: dup2
// 0e9: ldc2_w 5457712387009
// 0ec: lxor
// 0ed: dup2
// 0ee: bipush 56
// 0f0: lushr
// 0f1: l2i
// 0f2: istore 50
// 0f4: dup2
// 0f5: bipush 8
// 0f7: lshl
// 0f8: bipush 32
// 0fa: lushr
// 0fb: l2i
// 0fc: istore 51
// 0fe: dup2
// 0ff: bipush 40
// 101: lshl
// 102: bipush 40
// 104: lushr
// 105: l2i
// 106: istore 52
// 108: pop2
// 109: pop2
// 10a: aload 1
// 10b: sipush 32754
// 10e: ldc2_w 7108700146855957731
// 111: lload 17
// 113: lxor
// 114: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 11c: aload 2
// 11d: ldc "s"
// 11f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 122: aload 7
// 124: sipush 22896
// 127: ldc2_w 8710885733336838758
// 12a: lload 17
// 12c: lxor
// 12d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 135: aload 11
// 137: sipush 25937
// 13a: ldc2_w 6700628954923191890
// 13d: lload 17
// 13f: lxor
// 140: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 148: ldc2_w 4652345510821104020
// 14b: lload 17
// 14d: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: aload 13
// 154: sipush 27612
// 157: ldc2_w 6136528314206765278
// 15a: lload 17
// 15c: lxor
// 15d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 165: astore 58
// 167: aload 14
// 169: sipush 32442
// 16c: ldc2_w 2942867921179465127
// 16f: lload 17
// 171: lxor
// 172: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 17a: aload 15
// 17c: sipush 11392
// 17f: ldc2_w 1119311663207810951
// 182: lload 17
// 184: lxor
// 185: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 18d: aload 16
// 18f: sipush 28479
// 192: ldc2_w 8579350016353944626
// 195: lload 17
// 197: lxor
// 198: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 1a0: getstatic su/catlean/qa.d Lsu/catlean/qa;
// 1a3: iload 28
// 1a5: i2c
// 1a6: iload 29
// 1a8: iload 30
// 1aa: i2s
// 1ab: aload 2
// 1ac: invokevirtual su/catlean/qa.M (CISLjava/lang/String;)Ljava/lang/String;
// 1af: astore 59
// 1b1: aload 7
// 1b3: invokevirtual java/awt/Color.getRed ()I
// 1b6: i2f
// 1b7: ldc 255.0
// 1b9: fdiv
// 1ba: fstore 60
// 1bc: aload 7
// 1be: invokevirtual java/awt/Color.getGreen ()I
// 1c1: i2f
// 1c2: ldc 255.0
// 1c4: fdiv
// 1c5: fstore 61
// 1c7: aload 7
// 1c9: invokevirtual java/awt/Color.getBlue ()I
// 1cc: i2f
// 1cd: ldc 255.0
// 1cf: fdiv
// 1d0: fstore 62
// 1d2: aload 7
// 1d4: invokevirtual java/awt/Color.getAlpha ()I
// 1d7: i2f
// 1d8: ldc 255.0
// 1da: fdiv
// 1db: fstore 63
// 1dd: aload 0
// 1de: fload 4
// 1e0: ldc 0.5
// 1e2: fadd
// 1e3: iload 31
// 1e5: swap
// 1e6: lload 32
// 1e8: invokevirtual su/catlean/y3.K (IFJ)F
// 1eb: fstore 64
// 1ed: aload 0
// 1ee: fload 5
// 1f0: ldc 1.5
// 1f2: fadd
// 1f3: iload 31
// 1f5: swap
// 1f6: lload 32
// 1f8: invokevirtual su/catlean/y3.K (IFJ)F
// 1fb: fstore 65
// 1fd: aload 1
// 1fe: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 201: pop
// 202: aload 1
// 203: fload 64
// 205: fload 65
// 207: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 20a: pop
// 20b: aload 1
// 20c: fconst_1
// 20d: fload 10
// 20f: fdiv
// 210: fconst_1
// 211: fload 10
// 213: fdiv
// 214: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 217: pop
// 218: new org/joml/Matrix3x2f
// 21b: dup
// 21c: aload 1
// 21d: checkcast org/joml/Matrix3x2fc
// 220: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
// 223: astore 66
// 225: aload 59
// 227: invokevirtual java/lang/String.toCharArray ()[C
// 22a: dup
// 22b: sipush 14389
// 22e: ldc2_w 8680131660533568289
// 231: lload 17
// 233: lxor
// 234: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 23c: astore 67
// 23e: fconst_0
// 23f: fstore 68
// 241: fconst_0
// 242: fstore 69
// 244: bipush 0
// 245: istore 70
// 247: bipush 0
// 248: istore 71
// 24a: bipush 0
// 24b: istore 72
// 24d: iload 72
// 24f: aload 67
// 251: arraylength
// 252: if_icmpge 5c9
// 255: aload 67
// 257: iload 72
// 259: caload
// 25a: istore 73
// 25c: iload 70
// 25e: aload 58
// 260: iload 3
// 261: ifle 3ff
// 264: ifnull 3fd
// 267: ifeq 3fb
// 26a: goto 278
// 26d: ldc2_w 4645570978957831932
// 270: lload 17
// 272: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: athrow
// 278: bipush 0
// 279: istore 70
// 27b: iload 73
// 27d: aload 58
// 27f: ifnull 332
// 282: lookupswitch 171 2 88 37 120 37
// 29c: ldc2_w 4645570978957831932
// 29f: lload 17
// 2a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a6: athrow
// 2a7: aload 0
// 2a8: iload 36
// 2aa: i2s
// 2ab: iload 37
// 2ad: aload 67
// 2af: iload 38
// 2b1: i2c
// 2b2: iload 72
// 2b4: invokespecial su/catlean/y3.B (SI[CCI)Lkotlin/Triple;
// 2b7: astore 74
// 2b9: aload 58
// 2bb: iload 3
// 2bc: iflt 31c
// 2bf: ifnull 31a
// 2c2: aload 74
// 2c4: ifnull 317
// 2c7: goto 2d5
// 2ca: ldc2_w 4645570978957831932
// 2cd: lload 17
// 2cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d4: athrow
// 2d5: aload 74
// 2d7: invokevirtual kotlin/Triple.component1 ()Ljava/lang/Object;
// 2da: checkcast java/lang/Number
// 2dd: invokevirtual java/lang/Number.intValue ()I
// 2e0: istore 75
// 2e2: aload 74
// 2e4: invokevirtual kotlin/Triple.component2 ()Ljava/lang/Object;
// 2e7: checkcast java/lang/Number
// 2ea: invokevirtual java/lang/Number.intValue ()I
// 2ed: istore 76
// 2ef: aload 74
// 2f1: invokevirtual kotlin/Triple.component3 ()Ljava/lang/Object;
// 2f4: checkcast java/lang/Number
// 2f7: invokevirtual java/lang/Number.intValue ()I
// 2fa: istore 77
// 2fc: iload 75
// 2fe: i2f
// 2ff: ldc 255.0
// 301: fdiv
// 302: fstore 60
// 304: iload 76
// 306: i2f
// 307: ldc 255.0
// 309: fdiv
// 30a: fstore 61
// 30c: iload 77
// 30e: i2f
// 30f: ldc 255.0
// 311: fdiv
// 312: fstore 62
// 314: iinc 72 12
// 317: iinc 72 1
// 31a: aload 58
// 31c: ifnonnull 24d
// 31f: bipush 4
// 320: anewarray 172
// 323: ldc2_w 4666738559739710206
// 326: lload 17
// 328: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32d: iload 73
// 32f: invokestatic java/lang/Character.toUpperCase (C)C
// 332: istore 74
// 334: getstatic su/catlean/y3.C Lit/unimi/dsi/fastutil/chars/Char2IntArrayMap;
// 337: iload 74
// 339: invokevirtual it/unimi/dsi/fastutil/chars/Char2IntArrayMap.containsKey (C)Z
// 33c: aload 58
// 33e: iload 6
// 340: iflt 3a5
// 343: ifnull 3a3
// 346: ifeq 393
// 349: goto 357
// 34c: ldc2_w 4645570978957831932
// 34f: lload 17
// 351: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 356: athrow
// 357: getstatic su/catlean/y3.C Lit/unimi/dsi/fastutil/chars/Char2IntArrayMap;
// 35a: iload 74
// 35c: invokevirtual it/unimi/dsi/fastutil/chars/Char2IntArrayMap.get (C)I
// 35f: istore 75
// 361: aload 0
// 362: iload 75
// 364: lload 26
// 366: invokevirtual su/catlean/y3.b (IJ)[I
// 369: astore 76
// 36b: aload 76
// 36d: bipush 0
// 36e: iaload
// 36f: i2f
// 370: ldc 255.0
// 372: fdiv
// 373: fstore 60
// 375: aload 76
// 377: bipush 1
// 378: iaload
// 379: i2f
// 37a: ldc 255.0
// 37c: fdiv
// 37d: fstore 61
// 37f: aload 76
// 381: bipush 2
// 382: iaload
// 383: i2f
// 384: ldc 255.0
// 386: fdiv
// 387: fstore 62
// 389: aload 58
// 38b: iload 6
// 38d: ifle 3f8
// 390: ifnonnull 3f3
// 393: iload 74
// 395: goto 3a3
// 398: ldc2_w 4645570978957831932
// 39b: lload 17
// 39d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a2: athrow
// 3a3: aload 58
// 3a5: ifnull 3ed
// 3a8: sipush 30961
// 3ab: ldc2_w 4576804737230339828
// 3ae: lload 17
// 3b0: lxor
// 3b1: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b6: if_icmpne 3f3
// 3b9: goto 3c7
// 3bc: ldc2_w 4645570978957831932
// 3bf: lload 17
// 3c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c6: athrow
// 3c7: aload 7
// 3c9: invokevirtual java/awt/Color.getRed ()I
// 3cc: i2f
// 3cd: ldc 255.0
// 3cf: fdiv
// 3d0: fstore 60
// 3d2: aload 7
// 3d4: invokevirtual java/awt/Color.getGreen ()I
// 3d7: i2f
// 3d8: ldc 255.0
// 3da: fdiv
// 3db: fstore 61
// 3dd: aload 7
// 3df: invokevirtual java/awt/Color.getBlue ()I
// 3e2: i2f
// 3e3: ldc 255.0
// 3e5: fdiv
// 3e6: fstore 62
// 3e8: aload 7
// 3ea: invokevirtual java/awt/Color.getAlpha ()I
// 3ed: i2f
// 3ee: ldc 255.0
// 3f0: fdiv
// 3f1: fstore 63
// 3f3: iinc 72 1
// 3f6: aload 58
// 3f8: ifnonnull 24d
// 3fb: iload 8
// 3fd: aload 58
// 3ff: iload 6
// 401: ifle 459
// 404: ifnull 457
// 407: ifeq 455
// 40a: goto 418
// 40d: ldc2_w 4645570978957831932
// 410: lload 17
// 412: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 417: athrow
// 418: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 41b: iload 72
// 41d: iload 9
// 41f: imul
// 420: lload 24
// 422: dup2_x1
// 423: pop2
// 424: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 427: astore 74
// 429: aload 74
// 42b: invokevirtual java/awt/Color.getRed ()I
// 42e: i2f
// 42f: ldc 255.0
// 431: fdiv
// 432: fstore 60
// 434: aload 74
// 436: invokevirtual java/awt/Color.getGreen ()I
// 439: i2f
// 43a: ldc 255.0
// 43c: fdiv
// 43d: fstore 61
// 43f: aload 74
// 441: invokevirtual java/awt/Color.getBlue ()I
// 444: i2f
// 445: ldc 255.0
// 447: fdiv
// 448: fstore 62
// 44a: aload 74
// 44c: invokevirtual java/awt/Color.getAlpha ()I
// 44f: i2f
// 450: ldc 255.0
// 452: fdiv
// 453: fstore 63
// 455: iload 73
// 457: aload 58
// 459: ifnull 484
// 45c: lookupswitch 130 2 10 54 167 39
// 478: ldc2_w 4645570978957831932
// 47b: lload 17
// 47d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 482: athrow
// 483: bipush 1
// 484: istore 70
// 486: iinc 72 1
// 489: aload 58
// 48b: iload 3
// 48c: ifle 4db
// 48f: ifnonnull 24d
// 492: fload 69
// 494: aload 0
// 495: aload 59
// 497: iload 71
// 499: iload 72
// 49b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
// 49e: dup
// 49f: sipush 11547
// 4a2: ldc2_w 8191196741812094476
// 4a5: lload 17
// 4a7: lxor
// 4a8: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4b0: aload 11
// 4b2: aload 13
// 4b4: lload 21
// 4b6: aload 14
// 4b8: iload 23
// 4ba: i2b
// 4bb: aload 15
// 4bd: fload 10
// 4bf: invokevirtual su/catlean/y3.l (Ljava/lang/String;Lit/unimi/dsi/fastutil/chars/Char2ObjectArrayMap;Lit/unimi/dsi/fastutil/objects/ObjectArrayList;JLjava/awt/Font;BLjava/awt/Font;F)F
// 4c2: fload 10
// 4c4: fmul
// 4c5: fadd
// 4c6: fstore 69
// 4c8: fconst_0
// 4c9: fstore 68
// 4cb: iload 72
// 4cd: bipush 1
// 4ce: iadd
// 4cf: iload 6
// 4d1: iflt 24f
// 4d4: istore 71
// 4d6: iinc 72 1
// 4d9: aload 58
// 4db: ifnonnull 24d
// 4de: aload 0
// 4df: iload 50
// 4e1: i2b
// 4e2: iload 51
// 4e4: iload 73
// 4e6: aload 11
// 4e8: iload 52
// 4ea: aload 13
// 4ec: aload 14
// 4ee: aload 15
// 4f0: invokevirtual su/catlean/y3.y (BICLit/unimi/dsi/fastutil/chars/Char2ObjectArrayMap;ILit/unimi/dsi/fastutil/objects/ObjectArrayList;Ljava/awt/Font;Ljava/awt/Font;)Lsu/catlean/ze;
// 4f3: astore 74
// 4f5: aload 58
// 4f7: iload 12
// 4f9: iflt 5c6
// 4fc: ifnull 5c4
// 4ff: aload 74
// 501: ifnull 5c1
// 504: goto 512
// 507: ldc2_w 4645570978957831932
// 50a: lload 17
// 50c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 511: athrow
// 512: aload 74
// 514: aload 58
// 516: ifnull 559
// 519: goto 527
// 51c: ldc2_w 4645570978957831932
// 51f: lload 17
// 521: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 526: athrow
// 527: invokevirtual su/catlean/ze.z ()C
// 52a: sipush 4746
// 52d: ldc2_w 4538775491774354612
// 530: lload 17
// 532: lxor
// 533: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 538: if_icmpeq 5b6
// 53b: goto 549
// 53e: ldc2_w 4645570978957831932
// 541: lload 17
// 543: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 548: athrow
// 549: aload 74
// 54b: goto 559
// 54e: ldc2_w 4645570978957831932
// 551: lload 17
// 553: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 558: athrow
// 559: invokevirtual su/catlean/ze.X ()Lsu/catlean/fj;
// 55c: invokevirtual su/catlean/fj.T ()Lnet/minecraft/class_2960;
// 55f: astore 75
// 561: new su/catlean/cc
// 564: dup
// 565: fload 68
// 567: fload 69
// 569: fload 60
// 56b: fload 61
// 56d: fload 62
// 56f: lload 43
// 571: fload 63
// 573: aload 74
// 575: invokevirtual su/catlean/ze.w ()I
// 578: aload 74
// 57a: invokevirtual su/catlean/ze.r ()I
// 57d: aload 74
// 57f: invokevirtual su/catlean/ze.X ()Lsu/catlean/fj;
// 582: invokevirtual su/catlean/fj.V ()I
// 585: aload 74
// 587: invokevirtual su/catlean/ze.X ()Lsu/catlean/fj;
// 58a: invokevirtual su/catlean/fj.x ()I
// 58d: aload 74
// 58f: invokevirtual su/catlean/ze.x ()I
// 592: aload 74
// 594: invokevirtual su/catlean/ze.T ()I
// 597: fconst_0
// 598: aload 66
// 59a: invokespecial su/catlean/cc.<init> (FFFFFJFIIIIIIFLorg/joml/Matrix3x2f;)V
// 59d: astore 76
// 59f: aload 16
// 5a1: aload 75
// 5a3: invokedynamic get ()Lit/unimi/dsi/fastutil/objects/Object2ObjectFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/y3.Z (Ljava/lang/Object;)Lit/unimi/dsi/fastutil/objects/ObjectList;, (Ljava/lang/Object;)Lit/unimi/dsi/fastutil/objects/ObjectList; ]
// 5a8: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.computeIfAbsent (Ljava/lang/Object;Lit/unimi/dsi/fastutil/objects/Object2ObjectFunction;)Ljava/lang/Object;
// 5ab: checkcast it/unimi/dsi/fastutil/objects/ObjectList
// 5ae: aload 76
// 5b0: invokeinterface it/unimi/dsi/fastutil/objects/ObjectList.add (Ljava/lang/Object;)Z 2
// 5b5: pop
// 5b6: fload 68
// 5b8: aload 74
// 5ba: invokevirtual su/catlean/ze.w ()I
// 5bd: i2f
// 5be: fadd
// 5bf: fstore 68
// 5c1: iinc 72 1
// 5c4: aload 58
// 5c6: ifnonnull 24d
// 5c9: iload 12
// 5cb: iflt 24d
// 5ce: aload 16
// 5d0: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.keySet ()Ljava/util/Set;
// 5d3: checkcast it/unimi/dsi/fastutil/objects/ObjectSet
// 5d6: invokeinterface it/unimi/dsi/fastutil/objects/ObjectSet.iterator ()Lit/unimi/dsi/fastutil/objects/ObjectIterator; 1
// 5db: dup
// 5dc: sipush 13211
// 5df: ldc2_w 6402497994999896215
// 5e2: lload 17
// 5e4: lxor
// 5e5: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5ed: astore 73
// 5ef: aload 73
// 5f1: invokeinterface it/unimi/dsi/fastutil/objects/ObjectIterator.hasNext ()Z 1
// 5f6: ifeq 882
// 5f9: aload 73
// 5fb: invokeinterface it/unimi/dsi/fastutil/objects/ObjectIterator.next ()Ljava/lang/Object; 1
// 600: checkcast net/minecraft/class_2960
// 603: astore 74
// 605: lload 19
// 607: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 60a: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 60d: aload 74
// 60f: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 612: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 615: dup
// 616: sipush 15352
// 619: ldc2_w 1073722355236081888
// 61c: lload 17
// 61e: lxor
// 61f: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 624: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 627: astore 75
// 629: aload 16
// 62b: aload 74
// 62d: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
// 630: dup
// 631: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 634: checkcast it/unimi/dsi/fastutil/objects/ObjectList
// 637: astore 76
// 639: new su/catlean/g7
// 63c: dup
// 63d: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 640: dup
// 641: sipush 16914
// 644: ldc2_w 8603302808078182690
// 647: lload 17
// 649: lxor
// 64a: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 652: aload 76
// 654: invokeinterface it/unimi/dsi/fastutil/objects/ObjectList.size ()I 1
// 659: bipush 0
// 65a: bipush 4
// 65b: aconst_null
// 65c: astore 53
// 65e: istore 54
// 660: istore 55
// 662: istore 56
// 664: astore 57
// 666: lload 39
// 668: aload 57
// 66a: iload 56
// 66c: iload 55
// 66e: iload 54
// 670: aload 53
// 672: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 675: astore 77
// 677: aload 58
// 679: ifnull 890
// 67c: aload 76
// 67e: invokeinterface it/unimi/dsi/fastutil/objects/ObjectList.iterator ()Lit/unimi/dsi/fastutil/objects/ObjectListIterator; 1
// 683: dup
// 684: sipush 13211
// 687: ldc2_w 6402497994999896215
// 68a: lload 17
// 68c: lxor
// 68d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 692: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 695: astore 78
// 697: aload 78
// 699: invokeinterface it/unimi/dsi/fastutil/objects/ObjectListIterator.hasNext ()Z 1
// 69e: ifeq 82d
// 6a1: aload 78
// 6a3: invokeinterface it/unimi/dsi/fastutil/objects/ObjectListIterator.next ()Ljava/lang/Object; 1
// 6a8: checkcast su/catlean/cc
// 6ab: astore 79
// 6ad: aload 79
// 6af: invokevirtual su/catlean/cc.J ()F
// 6b2: fstore 80
// 6b4: aload 79
// 6b6: invokevirtual su/catlean/cc.X ()F
// 6b9: fstore 81
// 6bb: aload 79
// 6bd: invokevirtual su/catlean/cc.q ()I
// 6c0: i2f
// 6c1: fstore 82
// 6c3: aload 79
// 6c5: invokevirtual su/catlean/cc.i ()I
// 6c8: i2f
// 6c9: fstore 83
// 6cb: aload 79
// 6cd: invokevirtual su/catlean/cc.G ()I
// 6d0: i2f
// 6d1: aload 79
// 6d3: invokevirtual su/catlean/cc.K ()I
// 6d6: i2f
// 6d7: fdiv
// 6d8: fstore 84
// 6da: aload 79
// 6dc: invokevirtual su/catlean/cc.g ()I
// 6df: i2f
// 6e0: aload 79
// 6e2: invokevirtual su/catlean/cc.U ()I
// 6e5: i2f
// 6e6: fdiv
// 6e7: fstore 85
// 6e9: aload 79
// 6eb: invokevirtual su/catlean/cc.G ()I
// 6ee: aload 79
// 6f0: invokevirtual su/catlean/cc.q ()I
// 6f3: iadd
// 6f4: i2f
// 6f5: aload 79
// 6f7: invokevirtual su/catlean/cc.K ()I
// 6fa: i2f
// 6fb: fdiv
// 6fc: fstore 86
// 6fe: aload 79
// 700: invokevirtual su/catlean/cc.g ()I
// 703: aload 79
// 705: invokevirtual su/catlean/cc.i ()I
// 708: iadd
// 709: i2f
// 70a: aload 79
// 70c: invokevirtual su/catlean/cc.U ()I
// 70f: i2f
// 710: fdiv
// 711: fstore 87
// 713: aload 77
// 715: fload 80
// 717: bipush 0
// 718: i2f
// 719: fadd
// 71a: fload 81
// 71c: fload 83
// 71e: fadd
// 71f: fconst_0
// 720: bipush 4
// 721: lload 48
// 723: aconst_null
// 724: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 727: fload 84
// 729: lload 34
// 72b: fload 87
// 72d: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 730: aload 79
// 732: invokevirtual su/catlean/cc.p ()F
// 735: aload 79
// 737: invokevirtual su/catlean/cc.L ()F
// 73a: iload 45
// 73c: i2s
// 73d: swap
// 73e: aload 79
// 740: invokevirtual su/catlean/cc.u ()F
// 743: aload 79
// 745: invokevirtual su/catlean/cc.s ()F
// 748: iload 46
// 74a: swap
// 74b: iload 47
// 74d: invokevirtual su/catlean/g7.Y (FSFFIFI)Lsu/catlean/g7;
// 750: pop
// 751: aload 77
// 753: fload 80
// 755: fload 82
// 757: fadd
// 758: fload 81
// 75a: fload 83
// 75c: fadd
// 75d: fconst_0
// 75e: bipush 4
// 75f: lload 48
// 761: aconst_null
// 762: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 765: fload 86
// 767: lload 34
// 769: fload 87
// 76b: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 76e: aload 79
// 770: invokevirtual su/catlean/cc.p ()F
// 773: aload 79
// 775: invokevirtual su/catlean/cc.L ()F
// 778: iload 45
// 77a: i2s
// 77b: swap
// 77c: aload 79
// 77e: invokevirtual su/catlean/cc.u ()F
// 781: aload 79
// 783: invokevirtual su/catlean/cc.s ()F
// 786: iload 46
// 788: swap
// 789: iload 47
// 78b: invokevirtual su/catlean/g7.Y (FSFFIFI)Lsu/catlean/g7;
// 78e: pop
// 78f: aload 77
// 791: fload 80
// 793: fload 82
// 795: fadd
// 796: fload 81
// 798: bipush 0
// 799: i2f
// 79a: fadd
// 79b: fconst_0
// 79c: bipush 4
// 79d: lload 48
// 79f: aconst_null
// 7a0: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 7a3: fload 86
// 7a5: lload 34
// 7a7: fload 85
// 7a9: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 7ac: aload 79
// 7ae: invokevirtual su/catlean/cc.p ()F
// 7b1: aload 79
// 7b3: invokevirtual su/catlean/cc.L ()F
// 7b6: iload 45
// 7b8: i2s
// 7b9: swap
// 7ba: aload 79
// 7bc: invokevirtual su/catlean/cc.u ()F
// 7bf: aload 79
// 7c1: invokevirtual su/catlean/cc.s ()F
// 7c4: iload 46
// 7c6: swap
// 7c7: iload 47
// 7c9: invokevirtual su/catlean/g7.Y (FSFFIFI)Lsu/catlean/g7;
// 7cc: pop
// 7cd: aload 77
// 7cf: fload 80
// 7d1: bipush 0
// 7d2: i2f
// 7d3: fadd
// 7d4: fload 81
// 7d6: bipush 0
// 7d7: i2f
// 7d8: fadd
// 7d9: fconst_0
// 7da: bipush 4
// 7db: lload 48
// 7dd: aconst_null
// 7de: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 7e1: fload 84
// 7e3: lload 34
// 7e5: fload 85
// 7e7: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 7ea: aload 79
// 7ec: invokevirtual su/catlean/cc.p ()F
// 7ef: aload 79
// 7f1: invokevirtual su/catlean/cc.L ()F
// 7f4: iload 45
// 7f6: i2s
// 7f7: swap
// 7f8: aload 79
// 7fa: invokevirtual su/catlean/cc.u ()F
// 7fd: aload 79
// 7ff: invokevirtual su/catlean/cc.s ()F
// 802: iload 46
// 804: swap
// 805: iload 47
// 807: invokevirtual su/catlean/g7.Y (FSFFIFI)Lsu/catlean/g7;
// 80a: pop
// 80b: aload 58
// 80d: iload 6
// 80f: iflt 87f
// 812: ifnull 87d
// 815: aload 58
// 817: ifnonnull 697
// 81a: iload 12
// 81c: iflt 80b
// 81f: goto 82d
// 822: ldc2_w 4645570978957831932
// 825: lload 17
// 827: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82c: athrow
// 82d: lload 41
// 82f: aload 77
// 831: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 834: invokevirtual su/catlean/b6.O ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 837: lload 19
// 839: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 83c: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 83f: dup
// 840: sipush 28250
// 843: ldc2_w 6714843557553685852
// 846: lload 17
// 848: lxor
// 849: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 851: aconst_null
// 852: aconst_null
// 853: aload 66
// 855: sipush 1521
// 858: ldc2_w 3031292752777227970
// 85b: lload 17
// 85d: lxor
// 85e: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 863: aload 75
// 865: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 868: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 86b: sipush 11120
// 86e: ldc2_w 4113195633737969023
// 871: lload 17
// 873: lxor
// 874: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 879: aconst_null
// 87a: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 87d: aload 58
// 87f: ifnonnull 5ef
// 882: aload 16
// 884: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.clear ()V
// 887: aload 1
// 888: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 88b: pop
// 88c: iload 3
// 88d: iflt 890
// 890: return
}

public final void c(
@NotNull Matrix3x2fStack stack,
@NotNull String s,
float x,
float y,
@NotNull Color color,
boolean gradient,
int offset,
float scaleMul,
long a,
@NotNull Char2ObjectArrayMap allGlyphs,
@NotNull ObjectArrayList maps,
@NotNull Font font,
@NotNull Font fallBack,
float z,
@NotNull Object2ObjectOpenHashMap batchedDraws
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/y3.a J
// 003: lload 9
// 005: lxor
// 006: lstore 9
// 008: lload 9
// 00a: dup2
// 00b: ldc2_w 123180193165369
// 00e: lxor
// 00f: dup2
// 010: bipush 8
// 012: lushr
// 013: lstore 17
// 015: dup2
// 016: bipush 56
// 018: lshl
// 019: bipush 56
// 01b: lushr
// 01c: l2i
// 01d: istore 19
// 01f: pop2
// 020: dup2
// 021: ldc2_w 51187922939837
// 024: lxor
// 025: lstore 20
// 027: dup2
// 028: ldc2_w 14385862713503
// 02b: lxor
// 02c: lstore 22
// 02e: dup2
// 02f: ldc2_w 6318023556441
// 032: lxor
// 033: lstore 24
// 035: dup2
// 036: ldc2_w 80479324242909
// 039: lxor
// 03a: dup2
// 03b: bipush 48
// 03d: lushr
// 03e: l2i
// 03f: istore 26
// 041: dup2
// 042: bipush 16
// 044: lshl
// 045: bipush 32
// 047: lushr
// 048: l2i
// 049: istore 27
// 04b: dup2
// 04c: bipush 48
// 04e: lshl
// 04f: bipush 48
// 051: lushr
// 052: l2i
// 053: istore 28
// 055: pop2
// 056: dup2
// 057: ldc2_w 122663292377142
// 05a: lxor
// 05b: dup2
// 05c: bipush 32
// 05e: lushr
// 05f: l2i
// 060: istore 29
// 062: dup2
// 063: bipush 32
// 065: lshl
// 066: bipush 32
// 068: lushr
// 069: lstore 30
// 06b: pop2
// 06c: dup2
// 06d: ldc2_w 78107135344245
// 070: lxor
// 071: dup2
// 072: bipush 56
// 074: lushr
// 075: l2i
// 076: istore 32
// 078: dup2
// 079: bipush 8
// 07b: lshl
// 07c: bipush 32
// 07e: lushr
// 07f: l2i
// 080: istore 33
// 082: dup2
// 083: bipush 40
// 085: lshl
// 086: bipush 40
// 088: lushr
// 089: l2i
// 08a: istore 34
// 08c: pop2
// 08d: dup2
// 08e: ldc2_w 100691632655349
// 091: lxor
// 092: dup2
// 093: bipush 48
// 095: lushr
// 096: l2i
// 097: istore 35
// 099: dup2
// 09a: bipush 16
// 09c: lshl
// 09d: bipush 32
// 09f: lushr
// 0a0: l2i
// 0a1: istore 36
// 0a3: dup2
// 0a4: bipush 48
// 0a6: lshl
// 0a7: bipush 48
// 0a9: lushr
// 0aa: l2i
// 0ab: istore 37
// 0ad: pop2
// 0ae: pop2
// 0af: aload 1
// 0b0: sipush 15126
// 0b3: ldc2_w 257758162183224754
// 0b6: lload 9
// 0b8: lxor
// 0b9: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c1: aload 2
// 0c2: ldc "s"
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c7: aload 5
// 0c9: sipush 30037
// 0cc: ldc2_w 8102916268498924522
// 0cf: lload 9
// 0d1: lxor
// 0d2: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0da: aload 11
// 0dc: sipush 25937
// 0df: ldc2_w 6700557413569307622
// 0e2: lload 9
// 0e4: lxor
// 0e5: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0ed: ldc2_w 3252778057557894176
// 0f0: lload 9
// 0f2: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: aload 12
// 0f9: sipush 27612
// 0fc: ldc2_w 6136453568974531946
// 0ff: lload 9
// 101: lxor
// 102: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 10a: aload 13
// 10c: sipush 32442
// 10f: ldc2_w 2942936567591155731
// 112: lload 9
// 114: lxor
// 115: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 11d: aload 14
// 11f: sipush 11392
// 122: ldc2_w 1119386374113880627
// 125: lload 9
// 127: lxor
// 128: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 130: astore 38
// 132: aload 16
// 134: sipush 23971
// 137: ldc2_w 7328909858772327179
// 13a: lload 9
// 13c: lxor
// 13d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 145: getstatic su/catlean/qa.d Lsu/catlean/qa;
// 148: iload 26
// 14a: i2c
// 14b: iload 27
// 14d: iload 28
// 14f: i2s
// 150: aload 2
// 151: invokevirtual su/catlean/qa.M (CISLjava/lang/String;)Ljava/lang/String;
// 154: astore 39
// 156: aload 5
// 158: invokevirtual java/awt/Color.getRed ()I
// 15b: i2f
// 15c: ldc 255.0
// 15e: fdiv
// 15f: fstore 40
// 161: aload 5
// 163: invokevirtual java/awt/Color.getGreen ()I
// 166: i2f
// 167: ldc 255.0
// 169: fdiv
// 16a: fstore 41
// 16c: aload 5
// 16e: invokevirtual java/awt/Color.getBlue ()I
// 171: i2f
// 172: ldc 255.0
// 174: fdiv
// 175: fstore 42
// 177: aload 5
// 179: invokevirtual java/awt/Color.getAlpha ()I
// 17c: i2f
// 17d: ldc 255.0
// 17f: fdiv
// 180: fstore 43
// 182: aload 0
// 183: fload 3
// 184: ldc 0.5
// 186: fadd
// 187: iload 29
// 189: swap
// 18a: lload 30
// 18c: invokevirtual su/catlean/y3.K (IFJ)F
// 18f: fstore 44
// 191: aload 0
// 192: fload 4
// 194: ldc 1.5
// 196: fadd
// 197: iload 29
// 199: swap
// 19a: lload 30
// 19c: invokevirtual su/catlean/y3.K (IFJ)F
// 19f: fstore 45
// 1a1: aload 1
// 1a2: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 1a5: pop
// 1a6: aload 1
// 1a7: fload 44
// 1a9: fload 45
// 1ab: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 1ae: pop
// 1af: aload 1
// 1b0: fconst_1
// 1b1: fload 8
// 1b3: fdiv
// 1b4: fconst_1
// 1b5: fload 8
// 1b7: fdiv
// 1b8: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 1bb: pop
// 1bc: new org/joml/Matrix3x2f
// 1bf: dup
// 1c0: aload 1
// 1c1: checkcast org/joml/Matrix3x2fc
// 1c4: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
// 1c7: astore 46
// 1c9: aload 39
// 1cb: invokevirtual java/lang/String.toCharArray ()[C
// 1ce: dup
// 1cf: sipush 14389
// 1d2: ldc2_w 8680202566064537237
// 1d5: lload 9
// 1d7: lxor
// 1d8: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e0: astore 47
// 1e2: fconst_0
// 1e3: fstore 48
// 1e5: fconst_0
// 1e6: fstore 49
// 1e8: bipush 0
// 1e9: istore 50
// 1eb: bipush 0
// 1ec: istore 51
// 1ee: aconst_null
// 1ef: astore 52
// 1f1: aconst_null
// 1f2: astore 53
// 1f4: bipush 0
// 1f5: istore 54
// 1f7: iload 54
// 1f9: aload 47
// 1fb: arraylength
// 1fc: if_icmpge 5ec
// 1ff: aload 47
// 201: iload 54
// 203: caload
// 204: istore 55
// 206: lload 9
// 208: lconst_0
// 209: lcmp
// 20a: iflt 5f8
// 20d: aload 38
// 20f: ifnull 5f8
// 212: iload 50
// 214: aload 38
// 216: lload 9
// 218: lconst_0
// 219: lcmp
// 21a: ifle 3c0
// 21d: ifnull 3be
// 220: goto 22e
// 223: ldc2_w 3300049796385555272
// 226: lload 9
// 228: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: athrow
// 22e: ifeq 3bc
// 231: goto 23f
// 234: ldc2_w 3300049796385555272
// 237: lload 9
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: bipush 0
// 240: istore 50
// 242: iload 55
// 244: aload 38
// 246: ifnull 2ef
// 249: lookupswitch 161 2 88 38 120 38
// 264: ldc2_w 3300049796385555272
// 267: lload 9
// 269: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: athrow
// 26f: aload 0
// 270: iload 35
// 272: i2s
// 273: iload 36
// 275: aload 47
// 277: iload 37
// 279: i2c
// 27a: iload 54
// 27c: invokespecial su/catlean/y3.B (SI[CCI)Lkotlin/Triple;
// 27f: astore 56
// 281: aload 38
// 283: lload 9
// 285: lconst_0
// 286: lcmp
// 287: iflt 2e7
// 28a: ifnull 2e5
// 28d: aload 56
// 28f: ifnull 2e2
// 292: goto 2a0
// 295: ldc2_w 3300049796385555272
// 298: lload 9
// 29a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29f: athrow
// 2a0: aload 56
// 2a2: invokevirtual kotlin/Triple.component1 ()Ljava/lang/Object;
// 2a5: checkcast java/lang/Number
// 2a8: invokevirtual java/lang/Number.intValue ()I
// 2ab: istore 57
// 2ad: aload 56
// 2af: invokevirtual kotlin/Triple.component2 ()Ljava/lang/Object;
// 2b2: checkcast java/lang/Number
// 2b5: invokevirtual java/lang/Number.intValue ()I
// 2b8: istore 58
// 2ba: aload 56
// 2bc: invokevirtual kotlin/Triple.component3 ()Ljava/lang/Object;
// 2bf: checkcast java/lang/Number
// 2c2: invokevirtual java/lang/Number.intValue ()I
// 2c5: istore 59
// 2c7: iload 57
// 2c9: i2f
// 2ca: ldc 255.0
// 2cc: fdiv
// 2cd: fstore 40
// 2cf: iload 58
// 2d1: i2f
// 2d2: ldc 255.0
// 2d4: fdiv
// 2d5: fstore 41
// 2d7: iload 59
// 2d9: i2f
// 2da: ldc 255.0
// 2dc: fdiv
// 2dd: fstore 42
// 2df: iinc 54 12
// 2e2: iinc 54 1
// 2e5: aload 38
// 2e7: ifnonnull 1f7
// 2ea: iload 55
// 2ec: invokestatic java/lang/Character.toUpperCase (C)C
// 2ef: istore 56
// 2f1: getstatic su/catlean/y3.C Lit/unimi/dsi/fastutil/chars/Char2IntArrayMap;
// 2f4: iload 56
// 2f6: invokevirtual it/unimi/dsi/fastutil/chars/Char2IntArrayMap.containsKey (C)Z
// 2f9: aload 38
// 2fb: lload 9
// 2fd: lconst_0
// 2fe: lcmp
// 2ff: ifle 366
// 302: ifnull 364
// 305: ifeq 354
// 308: goto 316
// 30b: ldc2_w 3300049796385555272
// 30e: lload 9
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: getstatic su/catlean/y3.C Lit/unimi/dsi/fastutil/chars/Char2IntArrayMap;
// 319: iload 56
// 31b: invokevirtual it/unimi/dsi/fastutil/chars/Char2IntArrayMap.get (C)I
// 31e: istore 57
// 320: aload 0
// 321: iload 57
// 323: lload 24
// 325: invokevirtual su/catlean/y3.b (IJ)[I
// 328: astore 58
// 32a: aload 58
// 32c: bipush 0
// 32d: iaload
// 32e: i2f
// 32f: ldc 255.0
// 331: fdiv
// 332: fstore 40
// 334: aload 58
// 336: bipush 1
// 337: iaload
// 338: i2f
// 339: ldc 255.0
// 33b: fdiv
// 33c: fstore 41
// 33e: aload 58
// 340: bipush 2
// 341: iaload
// 342: i2f
// 343: ldc 255.0
// 345: fdiv
// 346: fstore 42
// 348: aload 38
// 34a: lload 9
// 34c: lconst_0
// 34d: lcmp
// 34e: ifle 3b9
// 351: ifnonnull 3b4
// 354: iload 56
// 356: goto 364
// 359: ldc2_w 3300049796385555272
// 35c: lload 9
// 35e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 363: athrow
// 364: aload 38
// 366: ifnull 3ae
// 369: sipush 21437
// 36c: ldc2_w 4725346156388562946
// 36f: lload 9
// 371: lxor
// 372: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 377: if_icmpne 3b4
// 37a: goto 388
// 37d: ldc2_w 3300049796385555272
// 380: lload 9
// 382: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 387: athrow
// 388: aload 5
// 38a: invokevirtual java/awt/Color.getRed ()I
// 38d: i2f
// 38e: ldc 255.0
// 390: fdiv
// 391: fstore 40
// 393: aload 5
// 395: invokevirtual java/awt/Color.getGreen ()I
// 398: i2f
// 399: ldc 255.0
// 39b: fdiv
// 39c: fstore 41
// 39e: aload 5
// 3a0: invokevirtual java/awt/Color.getBlue ()I
// 3a3: i2f
// 3a4: ldc 255.0
// 3a6: fdiv
// 3a7: fstore 42
// 3a9: aload 5
// 3ab: invokevirtual java/awt/Color.getAlpha ()I
// 3ae: i2f
// 3af: ldc 255.0
// 3b1: fdiv
// 3b2: fstore 43
// 3b4: iinc 54 1
// 3b7: aload 38
// 3b9: ifnonnull 1f7
// 3bc: iload 6
// 3be: aload 38
// 3c0: lload 9
// 3c2: lconst_0
// 3c3: lcmp
// 3c4: iflt 41c
// 3c7: ifnull 41a
// 3ca: ifeq 418
// 3cd: goto 3db
// 3d0: ldc2_w 3300049796385555272
// 3d3: lload 9
// 3d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3da: athrow
// 3db: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3de: iload 54
// 3e0: iload 7
// 3e2: imul
// 3e3: lload 20
// 3e5: dup2_x1
// 3e6: pop2
// 3e7: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 3ea: astore 56
// 3ec: aload 56
// 3ee: invokevirtual java/awt/Color.getRed ()I
// 3f1: i2f
// 3f2: ldc 255.0
// 3f4: fdiv
// 3f5: fstore 40
// 3f7: aload 56
// 3f9: invokevirtual java/awt/Color.getGreen ()I
// 3fc: i2f
// 3fd: ldc 255.0
// 3ff: fdiv
// 400: fstore 41
// 402: aload 56
// 404: invokevirtual java/awt/Color.getBlue ()I
// 407: i2f
// 408: ldc 255.0
// 40a: fdiv
// 40b: fstore 42
// 40d: aload 56
// 40f: invokevirtual java/awt/Color.getAlpha ()I
// 412: i2f
// 413: ldc 255.0
// 415: fdiv
// 416: fstore 43
// 418: iload 55
// 41a: aload 38
// 41c: ifnull 444
// 41f: lookupswitch 132 2 10 54 167 36
// 438: ldc2_w 3300049796385555272
// 43b: lload 9
// 43d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 442: athrow
// 443: bipush 1
// 444: istore 50
// 446: iinc 54 1
// 449: aload 38
// 44b: lload 9
// 44d: lconst_0
// 44e: lcmp
// 44f: ifle 4a0
// 452: ifnonnull 1f7
// 455: fload 49
// 457: aload 0
// 458: aload 39
// 45a: iload 51
// 45c: iload 54
// 45e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
// 461: dup
// 462: sipush 10618
// 465: ldc2_w 2538086330359607232
// 468: lload 9
// 46a: lxor
// 46b: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 470: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 473: aload 11
// 475: aload 12
// 477: lload 17
// 479: aload 13
// 47b: iload 19
// 47d: i2b
// 47e: aload 14
// 480: fload 8
// 482: invokevirtual su/catlean/y3.l (Ljava/lang/String;Lit/unimi/dsi/fastutil/chars/Char2ObjectArrayMap;Lit/unimi/dsi/fastutil/objects/ObjectArrayList;JLjava/awt/Font;BLjava/awt/Font;F)F
// 485: fload 8
// 487: fmul
// 488: fadd
// 489: fstore 49
// 48b: fconst_0
// 48c: fstore 48
// 48e: iload 54
// 490: bipush 1
// 491: iadd
// 492: lload 9
// 494: lconst_0
// 495: lcmp
// 496: ifle 1f9
// 499: istore 51
// 49b: iinc 54 1
// 49e: aload 38
// 4a0: ifnonnull 1f7
// 4a3: aload 0
// 4a4: iload 32
// 4a6: i2b
// 4a7: iload 33
// 4a9: iload 55
// 4ab: aload 11
// 4ad: iload 34
// 4af: aload 12
// 4b1: aload 13
// 4b3: aload 14
// 4b5: invokevirtual su/catlean/y3.y (BICLit/unimi/dsi/fastutil/chars/Char2ObjectArrayMap;ILit/unimi/dsi/fastutil/objects/ObjectArrayList;Ljava/awt/Font;Ljava/awt/Font;)Lsu/catlean/ze;
// 4b8: astore 56
// 4ba: aload 38
// 4bc: lload 9
// 4be: lconst_0
// 4bf: lcmp
// 4c0: iflt 5e9
// 4c3: ifnull 5e7
// 4c6: aload 56
// 4c8: ifnull 5e4
// 4cb: goto 4d9
// 4ce: ldc2_w 3300049796385555272
// 4d1: lload 9
// 4d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d8: athrow
// 4d9: aload 56
// 4db: aload 38
// 4dd: ifnull 520
// 4e0: goto 4ee
// 4e3: ldc2_w 3300049796385555272
// 4e6: lload 9
// 4e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ed: athrow
// 4ee: invokevirtual su/catlean/ze.z ()C
// 4f1: sipush 4746
// 4f4: ldc2_w 4538708941206059264
// 4f7: lload 9
// 4f9: lxor
// 4fa: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ff: if_icmpeq 5d9
// 502: goto 510
// 505: ldc2_w 3300049796385555272
// 508: lload 9
// 50a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50f: athrow
// 510: aload 56
// 512: goto 520
// 515: ldc2_w 3300049796385555272
// 518: lload 9
// 51a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51f: athrow
// 520: invokevirtual su/catlean/ze.X ()Lsu/catlean/fj;
// 523: invokevirtual su/catlean/fj.T ()Lnet/minecraft/class_2960;
// 526: astore 57
// 528: new su/catlean/cc
// 52b: dup
// 52c: fload 48
// 52e: fload 49
// 530: fload 40
// 532: fload 41
// 534: fload 42
// 536: lload 22
// 538: fload 43
// 53a: aload 56
// 53c: invokevirtual su/catlean/ze.w ()I
// 53f: aload 56
// 541: invokevirtual su/catlean/ze.r ()I
// 544: aload 56
// 546: invokevirtual su/catlean/ze.X ()Lsu/catlean/fj;
// 549: invokevirtual su/catlean/fj.V ()I
// 54c: aload 56
// 54e: invokevirtual su/catlean/ze.X ()Lsu/catlean/fj;
// 551: invokevirtual su/catlean/fj.x ()I
// 554: aload 56
// 556: invokevirtual su/catlean/ze.x ()I
// 559: aload 56
// 55b: invokevirtual su/catlean/ze.T ()I
// 55e: fload 15
// 560: aload 46
// 562: invokespecial su/catlean/cc.<init> (FFFFFJFIIIIIIFLorg/joml/Matrix3x2f;)V
// 565: astore 58
// 567: aload 52
// 569: aload 57
// 56b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 56e: aload 38
// 570: ifnull 5d8
// 573: ifne 5cb
// 576: goto 584
// 579: ldc2_w 3300049796385555272
// 57c: lload 9
// 57e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 583: athrow
// 584: aload 57
// 586: astore 52
// 588: aload 16
// 58a: aload 57
// 58c: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
// 58f: checkcast it/unimi/dsi/fastutil/objects/ObjectList
// 592: astore 59
// 594: aload 59
// 596: aload 38
// 598: ifnull 5c9
// 59b: ifnonnull 5c7
// 59e: goto 5ac
// 5a1: ldc2_w 3300049796385555272
// 5a4: lload 9
// 5a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ab: athrow
// 5ac: new it/unimi/dsi/fastutil/objects/ObjectArrayList
// 5af: dup
// 5b0: invokespecial it/unimi/dsi/fastutil/objects/ObjectArrayList.<init> ()V
// 5b3: checkcast it/unimi/dsi/fastutil/objects/ObjectList
// 5b6: astore 59
// 5b8: aload 16
// 5ba: checkcast java/util/Map
// 5bd: aload 57
// 5bf: aload 59
// 5c1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 5c6: pop
// 5c7: aload 59
// 5c9: astore 53
// 5cb: aload 53
// 5cd: dup
// 5ce: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5d1: aload 58
// 5d3: invokeinterface it/unimi/dsi/fastutil/objects/ObjectList.add (Ljava/lang/Object;)Z 2
// 5d8: pop
// 5d9: fload 48
// 5db: aload 56
// 5dd: invokevirtual su/catlean/ze.w ()I
// 5e0: i2f
// 5e1: fadd
// 5e2: fstore 48
// 5e4: iinc 54 1
// 5e7: aload 38
// 5e9: ifnonnull 1f7
// 5ec: aload 1
// 5ed: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 5f0: pop
// 5f1: lload 9
// 5f3: lconst_0
// 5f4: lcmp
// 5f5: ifle 5f8
// 5f8: lload 9
// 5fa: lconst_0
// 5fb: lcmp
// 5fc: ifle 61a
// 5ff: ldc2_w 3243137889656451984
// 602: lload 9
// 604: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 609: ifnull 628
// 60c: bipush 2
// 60d: anewarray 10
// 610: ldc2_w 3260209337988665975
// 613: lload 9
// 615: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61a: goto 628
// 61d: ldc2_w 3300049796385555272
// 620: lload 9
// 622: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 627: athrow
// 628: return
}

public final float l(
@NotNull String text,
@NotNull Char2ObjectArrayMap allGlyphs,
@NotNull ObjectArrayList maps,
long a,
@NotNull Font font,
byte a,
@NotNull Font fallBack,
float scaleMul
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 4
// 002: bipush 8
// 004: lshl
// 005: iload 7
// 007: i2l
// 008: bipush 56
// 00a: lshl
// 00b: bipush 56
// 00d: lushr
// 00e: lor
// 00f: getstatic su/catlean/y3.a J
// 012: lxor
// 013: lstore 10
// 015: lload 10
// 017: dup2
// 018: ldc2_w 90640876773417
// 01b: lxor
// 01c: dup2
// 01d: bipush 48
// 01f: lushr
// 020: l2i
// 021: istore 12
// 023: dup2
// 024: bipush 16
// 026: lshl
// 027: bipush 32
// 029: lushr
// 02a: l2i
// 02b: istore 13
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 14
// 037: pop2
// 038: dup2
// 039: ldc2_w 87406739299115
// 03c: lxor
// 03d: dup2
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 15
// 044: dup2
// 045: bipush 16
// 047: lshl
// 048: bipush 32
// 04a: lushr
// 04b: l2i
// 04c: istore 16
// 04e: dup2
// 04f: bipush 48
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 17
// 058: pop2
// 059: dup2
// 05a: ldc2_w 71765785273987
// 05d: lxor
// 05e: dup2
// 05f: bipush 56
// 061: lushr
// 062: l2i
// 063: istore 18
// 065: dup2
// 066: bipush 8
// 068: lshl
// 069: bipush 32
// 06b: lushr
// 06c: l2i
// 06d: istore 19
// 06f: dup2
// 070: bipush 40
// 072: lshl
// 073: bipush 40
// 075: lushr
// 076: l2i
// 077: istore 20
// 079: pop2
// 07a: pop2
// 07b: aload 1
// 07c: sipush 28352
// 07f: ldc2_w 3822221238041325702
// 082: lload 10
// 084: lxor
// 085: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08d: ldc2_w 3878221758301568214
// 090: lload 10
// 092: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: aload 2
// 098: sipush 7733
// 09b: ldc2_w 1143839581810606189
// 09e: lload 10
// 0a0: lxor
// 0a1: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0a9: astore 21
// 0ab: aload 3
// 0ac: sipush 7835
// 0af: ldc2_w 9114564483256762579
// 0b2: lload 10
// 0b4: lxor
// 0b5: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0bd: aload 6
// 0bf: sipush 30878
// 0c2: ldc2_w 3965312056582448853
// 0c5: lload 10
// 0c7: lxor
// 0c8: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0d0: aload 8
// 0d2: sipush 16776
// 0d5: ldc2_w 4136499261164101593
// 0d8: lload 10
// 0da: lxor
// 0db: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0e3: getstatic su/catlean/qa.d Lsu/catlean/qa;
// 0e6: iload 15
// 0e8: i2c
// 0e9: iload 16
// 0eb: iload 17
// 0ed: i2s
// 0ee: aload 1
// 0ef: invokevirtual su/catlean/qa.M (CISLjava/lang/String;)Ljava/lang/String;
// 0f2: astore 22
// 0f4: aload 0
// 0f5: iload 12
// 0f7: i2c
// 0f8: iload 13
// 0fa: iload 14
// 0fc: aload 22
// 0fe: invokevirtual su/catlean/y3.A (CIILjava/lang/String;)Ljava/lang/String;
// 101: invokevirtual java/lang/String.toCharArray ()[C
// 104: dup
// 105: sipush 17493
// 108: ldc2_w 6937737639816796695
// 10b: lload 10
// 10d: lxor
// 10e: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 116: astore 23
// 118: aload 23
// 11a: arraylength
// 11b: aload 21
// 11d: ifnull 132
// 120: ifne 135
// 123: goto 131
// 126: ldc2_w 3835421475524074430
// 129: lload 10
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: bipush 1
// 132: goto 136
// 135: bipush 0
// 136: ifeq 154
// 139: bipush 1
// 13a: newarray 5
// 13c: astore 24
// 13e: aload 24
// 140: bipush 0
// 141: sipush 21140
// 144: ldc2_w 2845100283624137159
// 147: lload 10
// 149: lxor
// 14a: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: castore
// 150: aload 24
// 152: astore 23
// 154: fconst_0
// 155: fstore 24
// 157: fconst_0
// 158: fstore 25
// 15a: aload 23
// 15c: astore 26
// 15e: bipush 0
// 15f: istore 27
// 161: aload 26
// 163: arraylength
// 164: istore 28
// 166: iload 27
// 168: iload 28
// 16a: if_icmpge 28b
// 16d: aload 26
// 16f: iload 27
// 171: caload
// 172: istore 29
// 174: iload 29
// 176: aload 21
// 178: iload 7
// 17a: ifle 1b3
// 17d: ifnull 1b1
// 180: sipush 29017
// 183: ldc2_w 1339077482897080895
// 186: lload 10
// 188: lxor
// 189: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: if_icmpne 234
// 191: goto 19f
// 194: ldc2_w 3835421475524074430
// 197: lload 10
// 199: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: athrow
// 19f: fload 24
// 1a1: fconst_0
// 1a2: fcmpg
// 1a3: goto 1b1
// 1a6: ldc2_w 3835421475524074430
// 1a9: lload 10
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: aload 21
// 1b3: ifnull 1c8
// 1b6: ifne 1cb
// 1b9: goto 1c7
// 1bc: ldc2_w 3835421475524074430
// 1bf: lload 10
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: bipush 1
// 1c8: goto 1cc
// 1cb: bipush 0
// 1cc: ifeq 220
// 1cf: lload 4
// 1d1: lconst_0
// 1d2: lcmp
// 1d3: ifle 21a
// 1d6: aload 0
// 1d7: iload 18
// 1d9: i2b
// 1da: iload 19
// 1dc: sipush 4746
// 1df: ldc2_w 4538711366618636790
// 1e2: lload 10
// 1e4: lxor
// 1e5: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ea: aload 2
// 1eb: iload 20
// 1ed: aload 3
// 1ee: aload 6
// 1f0: aload 8
// 1f2: invokevirtual su/catlean/y3.y (BICLit/unimi/dsi/fastutil/chars/Char2ObjectArrayMap;ILit/unimi/dsi/fastutil/objects/ObjectArrayList;Ljava/awt/Font;Ljava/awt/Font;)Lsu/catlean/ze;
// 1f5: dup
// 1f6: ifnull 219
// 1f9: goto 207
// 1fc: ldc2_w 3835421475524074430
// 1ff: lload 10
// 201: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 206: athrow
// 207: invokevirtual su/catlean/ze.r ()I
// 20a: i2f
// 20b: goto 21e
// 20e: ldc2_w 3835421475524074430
// 211: lload 10
// 213: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: athrow
// 219: pop
// 21a: fconst_1
// 21b: fload 9
// 21d: fdiv
// 21e: fstore 24
// 220: fload 25
// 222: fload 24
// 224: fadd
// 225: fstore 25
// 227: fconst_0
// 228: fstore 24
// 22a: aload 21
// 22c: iload 7
// 22e: iflt 288
// 231: ifnonnull 283
// 234: aload 0
// 235: iload 18
// 237: i2b
// 238: iload 19
// 23a: iload 29
// 23c: aload 2
// 23d: iload 20
// 23f: aload 3
// 240: aload 6
// 242: aload 8
// 244: invokevirtual su/catlean/y3.y (BICLit/unimi/dsi/fastutil/chars/Char2ObjectArrayMap;ILit/unimi/dsi/fastutil/objects/ObjectArrayList;Ljava/awt/Font;Ljava/awt/Font;)Lsu/catlean/ze;
// 247: astore 30
// 249: aload 21
// 24b: ifnull 271
// 24e: aload 30
// 250: dup
// 251: ifnonnull 275
// 254: goto 262
// 257: ldc2_w 3835421475524074430
// 25a: lload 10
// 25c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 261: athrow
// 262: pop
// 263: goto 271
// 266: ldc2_w 3835421475524074430
// 269: lload 10
// 26b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 270: athrow
// 271: fconst_0
// 272: goto 27c
// 275: invokevirtual su/catlean/ze.r ()I
// 278: i2f
// 279: fload 9
// 27b: fdiv
// 27c: fload 24
// 27e: invokestatic java/lang/Math.max (FF)F
// 281: fstore 24
// 283: iinc 27 1
// 286: aload 21
// 288: ifnonnull 166
// 28b: fload 24
// 28d: fload 25
// 28f: fadd
// 290: freturn
}

public final void F(@NotNull Object2ObjectOpenHashMap batchedDraws, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/y3.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 15463090087507
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 91064557451552
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 65278531487457
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 4808421174605
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 23673536594114
// 027: lxor
// 028: dup2
// 029: bipush 48
// 02b: lushr
// 02c: l2i
// 02d: istore 12
// 02f: dup2
// 030: bipush 16
// 032: lshl
// 033: bipush 32
// 035: lushr
// 036: l2i
// 037: istore 13
// 039: dup2
// 03a: bipush 48
// 03c: lshl
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 14
// 043: pop2
// 044: dup2
// 045: ldc2_w 66381673594300
// 048: lxor
// 049: lstore 15
// 04b: pop2
// 04c: ldc2_w 4210377094169850730
// 04f: lload 2
// 050: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: aload 1
// 056: sipush 17792
// 059: ldc2_w 3141235003883295867
// 05c: lload 2
// 05d: lxor
// 05e: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 066: astore 22
// 068: aload 1
// 069: aload 22
// 06b: ifnull 08d
// 06e: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.isEmpty ()Z
// 071: ifeq 08c
// 074: goto 081
// 077: ldc2_w 4217148322221806594
// 07a: lload 2
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: return
// 082: ldc2_w 4217148322221806594
// 085: lload 2
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: aload 1
// 08d: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.object2ObjectEntrySet ()Lit/unimi/dsi/fastutil/objects/Object2ObjectMap$FastEntrySet;
// 090: invokeinterface it/unimi/dsi/fastutil/objects/Object2ObjectMap$FastEntrySet.iterator ()Lit/unimi/dsi/fastutil/objects/ObjectIterator; 1
// 095: dup
// 096: sipush 13211
// 099: ldc2_w 6402445480777867881
// 09c: lload 2
// 09d: lxor
// 09e: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a6: astore 23
// 0a8: aload 23
// 0aa: invokeinterface it/unimi/dsi/fastutil/objects/ObjectIterator.hasNext ()Z 1
// 0af: ifeq 359
// 0b2: aload 23
// 0b4: invokeinterface it/unimi/dsi/fastutil/objects/ObjectIterator.next ()Ljava/lang/Object; 1
// 0b9: checkcast it/unimi/dsi/fastutil/objects/Object2ObjectMap$Entry
// 0bc: astore 24
// 0be: aload 24
// 0c0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0c3: aload 24
// 0c5: checkcast java/util/Map$Entry
// 0c8: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 0cd: checkcast net/minecraft/class_2960
// 0d0: astore 25
// 0d2: aload 24
// 0d4: checkcast java/util/Map$Entry
// 0d7: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 0dc: checkcast it/unimi/dsi/fastutil/objects/ObjectList
// 0df: astore 26
// 0e1: lload 4
// 0e3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0e6: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 0e9: aload 25
// 0eb: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 0ee: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 0f1: dup
// 0f2: sipush 25519
// 0f5: ldc2_w 413879009715466841
// 0f8: lload 2
// 0f9: lxor
// 0fa: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 102: astore 27
// 104: new su/catlean/g7
// 107: dup
// 108: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 10b: dup
// 10c: sipush 7509
// 10f: ldc2_w 5958737643611868314
// 112: lload 2
// 113: lxor
// 114: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 11c: aload 26
// 11e: invokeinterface it/unimi/dsi/fastutil/objects/ObjectList.size ()I 1
// 123: bipush 0
// 124: bipush 4
// 125: aconst_null
// 126: astore 17
// 128: istore 18
// 12a: istore 19
// 12c: istore 20
// 12e: astore 21
// 130: lload 6
// 132: aload 21
// 134: iload 20
// 136: iload 19
// 138: iload 18
// 13a: aload 17
// 13c: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 13f: astore 28
// 141: aload 22
// 143: ifnull 363
// 146: aload 26
// 148: invokeinterface it/unimi/dsi/fastutil/objects/ObjectList.iterator ()Lit/unimi/dsi/fastutil/objects/ObjectListIterator; 1
// 14d: dup
// 14e: sipush 13211
// 151: ldc2_w 6402445480777867881
// 154: lload 2
// 155: lxor
// 156: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15e: astore 29
// 160: aload 29
// 162: invokeinterface it/unimi/dsi/fastutil/objects/ObjectListIterator.hasNext ()Z 1
// 167: ifeq 302
// 16a: aload 29
// 16c: invokeinterface it/unimi/dsi/fastutil/objects/ObjectListIterator.next ()Ljava/lang/Object; 1
// 171: checkcast su/catlean/cc
// 174: astore 30
// 176: aload 30
// 178: invokevirtual su/catlean/cc.o ()Lorg/joml/Matrix3x2f;
// 17b: astore 31
// 17d: aload 30
// 17f: invokevirtual su/catlean/cc.J ()F
// 182: fstore 32
// 184: aload 30
// 186: invokevirtual su/catlean/cc.X ()F
// 189: fstore 33
// 18b: aload 30
// 18d: invokevirtual su/catlean/cc.q ()I
// 190: i2f
// 191: fstore 34
// 193: aload 30
// 195: invokevirtual su/catlean/cc.i ()I
// 198: i2f
// 199: fstore 35
// 19b: aload 30
// 19d: invokevirtual su/catlean/cc.G ()I
// 1a0: i2f
// 1a1: aload 30
// 1a3: invokevirtual su/catlean/cc.K ()I
// 1a6: i2f
// 1a7: fdiv
// 1a8: fstore 36
// 1aa: aload 30
// 1ac: invokevirtual su/catlean/cc.g ()I
// 1af: i2f
// 1b0: aload 30
// 1b2: invokevirtual su/catlean/cc.U ()I
// 1b5: i2f
// 1b6: fdiv
// 1b7: fstore 37
// 1b9: aload 30
// 1bb: invokevirtual su/catlean/cc.G ()I
// 1be: aload 30
// 1c0: invokevirtual su/catlean/cc.q ()I
// 1c3: iadd
// 1c4: i2f
// 1c5: aload 30
// 1c7: invokevirtual su/catlean/cc.K ()I
// 1ca: i2f
// 1cb: fdiv
// 1cc: fstore 38
// 1ce: aload 30
// 1d0: invokevirtual su/catlean/cc.g ()I
// 1d3: aload 30
// 1d5: invokevirtual su/catlean/cc.i ()I
// 1d8: iadd
// 1d9: i2f
// 1da: aload 30
// 1dc: invokevirtual su/catlean/cc.U ()I
// 1df: i2f
// 1e0: fdiv
// 1e1: fstore 39
// 1e3: aload 28
// 1e5: lload 8
// 1e7: aload 31
// 1e9: fload 32
// 1eb: fload 33
// 1ed: fload 35
// 1ef: fadd
// 1f0: aload 30
// 1f2: invokevirtual su/catlean/cc.Z ()F
// 1f5: invokevirtual su/catlean/g7.b (JLorg/joml/Matrix3x2f;FFF)Lsu/catlean/g7;
// 1f8: fload 36
// 1fa: lload 15
// 1fc: fload 39
// 1fe: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 201: aload 30
// 203: invokevirtual su/catlean/cc.p ()F
// 206: aload 30
// 208: invokevirtual su/catlean/cc.L ()F
// 20b: iload 12
// 20d: i2s
// 20e: swap
// 20f: aload 30
// 211: invokevirtual su/catlean/cc.u ()F
// 214: aload 30
// 216: invokevirtual su/catlean/cc.s ()F
// 219: iload 13
// 21b: swap
// 21c: iload 14
// 21e: invokevirtual su/catlean/g7.Y (FSFFIFI)Lsu/catlean/g7;
// 221: pop
// 222: aload 28
// 224: lload 8
// 226: aload 31
// 228: fload 32
// 22a: fload 34
// 22c: fadd
// 22d: fload 33
// 22f: fload 35
// 231: fadd
// 232: aload 30
// 234: invokevirtual su/catlean/cc.Z ()F
// 237: invokevirtual su/catlean/g7.b (JLorg/joml/Matrix3x2f;FFF)Lsu/catlean/g7;
// 23a: fload 38
// 23c: lload 15
// 23e: fload 39
// 240: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 243: aload 30
// 245: invokevirtual su/catlean/cc.p ()F
// 248: aload 30
// 24a: invokevirtual su/catlean/cc.L ()F
// 24d: iload 12
// 24f: i2s
// 250: swap
// 251: aload 30
// 253: invokevirtual su/catlean/cc.u ()F
// 256: aload 30
// 258: invokevirtual su/catlean/cc.s ()F
// 25b: iload 13
// 25d: swap
// 25e: iload 14
// 260: invokevirtual su/catlean/g7.Y (FSFFIFI)Lsu/catlean/g7;
// 263: pop
// 264: aload 28
// 266: lload 8
// 268: aload 31
// 26a: fload 32
// 26c: fload 34
// 26e: fadd
// 26f: fload 33
// 271: aload 30
// 273: invokevirtual su/catlean/cc.Z ()F
// 276: invokevirtual su/catlean/g7.b (JLorg/joml/Matrix3x2f;FFF)Lsu/catlean/g7;
// 279: fload 38
// 27b: lload 15
// 27d: fload 37
// 27f: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 282: aload 30
// 284: invokevirtual su/catlean/cc.p ()F
// 287: aload 30
// 289: invokevirtual su/catlean/cc.L ()F
// 28c: iload 12
// 28e: i2s
// 28f: swap
// 290: aload 30
// 292: invokevirtual su/catlean/cc.u ()F
// 295: aload 30
// 297: invokevirtual su/catlean/cc.s ()F
// 29a: iload 13
// 29c: swap
// 29d: iload 14
// 29f: invokevirtual su/catlean/g7.Y (FSFFIFI)Lsu/catlean/g7;
// 2a2: pop
// 2a3: aload 28
// 2a5: lload 8
// 2a7: aload 31
// 2a9: fload 32
// 2ab: fload 33
// 2ad: aload 30
// 2af: invokevirtual su/catlean/cc.Z ()F
// 2b2: invokevirtual su/catlean/g7.b (JLorg/joml/Matrix3x2f;FFF)Lsu/catlean/g7;
// 2b5: fload 36
// 2b7: lload 15
// 2b9: fload 37
// 2bb: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 2be: aload 30
// 2c0: invokevirtual su/catlean/cc.p ()F
// 2c3: aload 30
// 2c5: invokevirtual su/catlean/cc.L ()F
// 2c8: iload 12
// 2ca: i2s
// 2cb: swap
// 2cc: aload 30
// 2ce: invokevirtual su/catlean/cc.u ()F
// 2d1: aload 30
// 2d3: invokevirtual su/catlean/cc.s ()F
// 2d6: iload 13
// 2d8: swap
// 2d9: iload 14
// 2db: invokevirtual su/catlean/g7.Y (FSFFIFI)Lsu/catlean/g7;
// 2de: pop
// 2df: aload 22
// 2e1: lload 2
// 2e2: lconst_0
// 2e3: lcmp
// 2e4: ifle 356
// 2e7: ifnull 354
// 2ea: aload 22
// 2ec: ifnonnull 160
// 2ef: lload 2
// 2f0: lconst_0
// 2f1: lcmp
// 2f2: iflt 2df
// 2f5: goto 302
// 2f8: ldc2_w 4217148322221806594
// 2fb: lload 2
// 2fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 301: athrow
// 302: lload 10
// 304: aload 28
// 306: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 309: invokevirtual su/catlean/b6.h ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 30c: lload 4
// 30e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 311: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 314: dup
// 315: sipush 22891
// 318: ldc2_w 5670535583218567316
// 31b: lload 2
// 31c: lxor
// 31d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 322: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 325: aconst_null
// 326: aconst_null
// 327: new org/joml/Matrix3x2f
// 32a: dup
// 32b: invokespecial org/joml/Matrix3x2f.<init> ()V
// 32e: sipush 2649
// 331: ldc2_w 3219355908901624757
// 334: lload 2
// 335: lxor
// 336: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/y3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33b: aload 27
// 33d: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 340: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 343: sipush 14376
// 346: ldc2_w 8302209671094944978
// 349: lload 2
// 34a: lxor
// 34b: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 350: aconst_null
// 351: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 354: aload 22
// 356: ifnonnull 0a8
// 359: aload 1
// 35a: invokevirtual it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap.clear ()V
// 35d: lload 2
// 35e: lconst_0
// 35f: lcmp
// 360: iflt 363
// 363: return
}

public final float p(
@NotNull String text,
@NotNull Char2ObjectArrayMap allGlyphs,
@NotNull ObjectArrayList maps,
char a,
@NotNull Font font,
long a,
@NotNull Font fallBack,
float scaleMul
) {
long var10 = ((long)axx << 48 | ax << 16 >>> 16) ^ a;
long var10001 = var10 ^ 15687156628694L;
int var12 = (int)((var10 ^ 15687156628694L) >>> 48);
int var13 = (int)((var10 ^ 15687156628694L) << 16 >>> 32);
int var14 = (int)(var10001 << 48 >>> 48);
var10001 = var10 ^ 21257898903508L;
int var15 = (int)((var10 ^ 21257898903508L) >>> 48);
int var16 = (int)((var10 ^ 21257898903508L) << 16 >>> 32);
int var17 = (int)(var10001 << 48 >>> 48);
var10001 = var10 ^ 32361706535548L;
int var18 = (int)((var10 ^ 32361706535548L) >>> 56);
int var19 = (int)((var10 ^ 32361706535548L) << 8 >>> 32);
int var20 = (int)(var10001 << 40 >>> 40);
Intrinsics.checkNotNullParameter(text, a<"y">(9745, 5897143583054210226L ^ var10));
Intrinsics.checkNotNullParameter(allGlyphs, a<"y">(25937, 6700638333168740335L ^ var10));
Intrinsics.checkNotNullParameter(maps, a<"y">(27612, 6136517766119450979L ^ var10));
Intrinsics.checkNotNullParameter(font, a<"y">(32442, 2942877301069380634L ^ var10));
Intrinsics.checkNotNullParameter(fallBack, a<"y">(11392, 1119287025345998394L ^ var10));
String var21 = qa.d.M((char)var15, var16, (short)var17, text);
char[] var10000 = this.A((char)var12, var13, var14, var21).toCharArray();
Intrinsics.checkNotNullExpressionValue(var10000, a<"y">(14389, 8680156504419875484L ^ var10));
char[] var22 = var10000;
float var23 = 0.0F;
float var24 = 0.0F;
int var25 = 0;
int var26 = var22.length;

while (var25 < var26) {
label50: {
char var27;
label41: {
var27 = var22[var25];
if (axx >= 0) {
if (var27 != b<"j">(272, 520033989662191243L ^ var10)) {
break label41;
}

var24 = Math.max(var23, var24);
var23 = 0.0F;
}

if (axx >= 0) {
break label50;
}
}

ze var28 = this.y((byte)var18, var19, var27, allGlyphs, var20, maps, font, fallBack);

label32: {
try {
label30: {
var30 = var23;
if (axx >= 0) {
var33 = var28;
if (var28 != null) {
break label30;
}
}

var34 = 0.0F;
break label32;
}
} catch (NumberFormatException var29) {
throw vm.a<"Å">(var29, -1601738125092944063L, var10);
}

var34 = var33.w() / scaleMul;
}

var23 = var30 + var34;
}

var25++;
if (axx < 0) {
break;
}
}

return Math.max(var23, var24);
}

private final int H(char param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/y3.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: iload 1
// 007: istore 4
// 009: sipush 867
// 00c: ldc2_w 132395288398386146
// 00f: lload 2
// 010: lxor
// 011: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 016: iload 4
// 018: if_icmpgt 052
// 01b: iload 4
// 01d: lload 2
// 01e: lconst_0
// 01f: lcmp
// 020: iflt 04f
// 023: sipush 15534
// 026: ldc2_w 5993997922352688178
// 029: lload 2
// 02a: lxor
// 02b: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 030: if_icmpge 04e
// 033: goto 040
// 036: ldc2_w 1654018280789866608
// 039: lload 2
// 03a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: athrow
// 040: bipush 1
// 041: goto 053
// 044: ldc2_w 1654018280789866608
// 047: lload 2
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: bipush 0
// 04f: goto 053
// 052: bipush 0
// 053: lload 2
// 054: lconst_0
// 055: lcmp
// 056: iflt 085
// 059: ifeq 078
// 05c: iload 1
// 05d: sipush 25143
// 060: ldc2_w 202504551409889936
// 063: lload 2
// 064: lxor
// 065: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: isub
// 06b: goto 17f
// 06e: ldc2_w 1654018280789866608
// 071: lload 2
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: sipush 25262
// 07b: ldc2_w 6106668235747897911
// 07e: lload 2
// 07f: lxor
// 080: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: iload 4
// 087: lload 2
// 088: lconst_0
// 089: lcmp
// 08a: ifle 0a5
// 08d: if_icmpgt 0c7
// 090: iload 4
// 092: lload 2
// 093: lconst_0
// 094: lcmp
// 095: iflt 0c4
// 098: sipush 24987
// 09b: ldc2_w 69525585826197773
// 09e: lload 2
// 09f: lxor
// 0a0: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: if_icmpge 0c3
// 0a8: goto 0b5
// 0ab: ldc2_w 1654018280789866608
// 0ae: lload 2
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: bipush 1
// 0b6: goto 0c8
// 0b9: ldc2_w 1654018280789866608
// 0bc: lload 2
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: bipush 0
// 0c4: goto 0c8
// 0c7: bipush 0
// 0c8: lload 2
// 0c9: lconst_0
// 0ca: lcmp
// 0cb: ifle 108
// 0ce: ifeq 0fb
// 0d1: iload 1
// 0d2: sipush 25262
// 0d5: ldc2_w 6106668235747897911
// 0d8: lload 2
// 0d9: lxor
// 0da: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: isub
// 0e0: sipush 272
// 0e3: ldc2_w 520081494940078522
// 0e6: lload 2
// 0e7: lxor
// 0e8: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: iadd
// 0ee: goto 17f
// 0f1: ldc2_w 1654018280789866608
// 0f4: lload 2
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: sipush 7433
// 0fe: ldc2_w 6990082626610318769
// 101: lload 2
// 102: lxor
// 103: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: iload 4
// 10a: lload 2
// 10b: lconst_0
// 10c: lcmp
// 10d: ifle 128
// 110: if_icmpgt 14a
// 113: iload 4
// 115: lload 2
// 116: lconst_0
// 117: lcmp
// 118: ifle 147
// 11b: sipush 7948
// 11e: ldc2_w 5771926820654927792
// 121: lload 2
// 122: lxor
// 123: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: if_icmpge 146
// 12b: goto 138
// 12e: ldc2_w 1654018280789866608
// 131: lload 2
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: bipush 1
// 139: goto 14b
// 13c: ldc2_w 1654018280789866608
// 13f: lload 2
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: bipush 0
// 147: goto 14b
// 14a: bipush 0
// 14b: lload 2
// 14c: lconst_0
// 14d: lcmp
// 14e: iflt 171
// 151: ifeq 17e
// 154: iload 1
// 155: sipush 22221
// 158: ldc2_w 5344615088180659834
// 15b: lload 2
// 15c: lxor
// 15d: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: isub
// 163: sipush 272
// 166: ldc2_w 520081494940078522
// 169: lload 2
// 16a: lxor
// 16b: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: iadd
// 171: goto 17f
// 174: ldc2_w 1654018280789866608
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: bipush -1
// 17f: ireturn
}

private final boolean U(char[] param1, int param2, short param3, int param4, int param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 3
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 4
// 007: i2l
// 008: bipush 32
// 00a: lshl
// 00b: bipush 16
// 00d: lushr
// 00e: lor
// 00f: iload 5
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/y3.a J
// 01c: lxor
// 01d: lstore 6
// 01f: lload 6
// 021: dup2
// 022: ldc2_w 54687924389008
// 025: lxor
// 026: lstore 8
// 028: pop2
// 029: iload 2
// 02a: sipush 12332
// 02d: ldc2_w 1666462759264111826
// 030: lload 6
// 032: lxor
// 033: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: iadd
// 039: aload 1
// 03a: arraylength
// 03b: if_icmplt 04b
// 03e: bipush 0
// 03f: ireturn
// 040: ldc2_w -4995891505912556497
// 043: lload 6
// 045: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04a: athrow
// 04b: aload 1
// 04c: iload 2
// 04d: caload
// 04e: iload 4
// 050: ifle 076
// 053: sipush 676
// 056: ldc2_w 3453385140488732273
// 059: lload 6
// 05b: lxor
// 05c: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: if_icmpeq 071
// 064: bipush 0
// 065: ireturn
// 066: ldc2_w -4995891505912556497
// 069: lload 6
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aload 1
// 072: iload 2
// 073: bipush 1
// 074: iadd
// 075: caload
// 076: istore 10
// 078: iload 10
// 07a: iload 4
// 07c: iflt 0c4
// 07f: sipush 6940
// 082: ldc2_w 2335672838999828454
// 085: lload 6
// 087: lxor
// 088: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: if_icmpeq 0c3
// 090: iload 10
// 092: iload 4
// 094: iflt 0c4
// 097: sipush 14477
// 09a: ldc2_w 5692929970442159150
// 09d: lload 6
// 09f: lxor
// 0a0: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: if_icmpeq 0c3
// 0a8: goto 0b6
// 0ab: ldc2_w -4995891505912556497
// 0ae: lload 6
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: bipush 0
// 0b7: ireturn
// 0b8: ldc2_w -4995891505912556497
// 0bb: lload 6
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: bipush 0
// 0c4: istore 11
// 0c6: sipush 26443
// 0c9: iload 2
// 0ca: bipush 2
// 0cb: iadd
// 0cc: istore 11
// 0ce: ldc2_w 2288777334271089567
// 0d1: lload 6
// 0d3: lxor
// 0d4: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: istore 12
// 0db: bipush 0
// 0dc: istore 13
// 0de: iload 13
// 0e0: iload 12
// 0e2: if_icmpge 148
// 0e5: iload 13
// 0e7: istore 14
// 0e9: bipush 0
// 0ea: istore 15
// 0ec: aload 1
// 0ed: iload 11
// 0ef: caload
// 0f0: iload 5
// 0f2: iflt 149
// 0f5: iload 3
// 0f6: iflt 125
// 0f9: sipush 676
// 0fc: ldc2_w 3453385140488732273
// 0ff: lload 6
// 101: lxor
// 102: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: if_icmpeq 117
// 10a: bipush 0
// 10b: ireturn
// 10c: ldc2_w -4995891505912556497
// 10f: lload 6
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: getstatic su/catlean/y3.i Lsu/catlean/y3;
// 11a: aload 1
// 11b: iload 11
// 11d: bipush 1
// 11e: iadd
// 11f: caload
// 120: lload 8
// 122: invokespecial su/catlean/y3.H (CJ)I
// 125: iload 5
// 127: ifle 13e
// 12a: ifge 13a
// 12d: bipush 0
// 12e: ireturn
// 12f: ldc2_w -4995891505912556497
// 132: lload 6
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: iload 11
// 13c: bipush 2
// 13d: iadd
// 13e: istore 11
// 140: nop
// 141: iinc 13 1
// 144: iload 3
// 145: ifge 0de
// 148: bipush 1
// 149: ireturn
}

private final Triple B(short param1, int param2, char[] param3, char param4, int param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/y3.a J
// 01b: lxor
// 01c: lstore 6
// 01e: lload 6
// 020: dup2
// 021: ldc2_w 64350826868941
// 024: lxor
// 025: lstore 8
// 027: pop2
// 028: ldc2_w 1017283242758653722
// 02b: lload 6
// 02d: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: astore 10
// 034: iload 5
// 036: bipush 1
// 037: isub
// 038: aload 10
// 03a: ifnull 062
// 03d: iflt 08b
// 040: goto 04e
// 043: ldc2_w 1078062487344210034
// 046: lload 6
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: aload 3
// 04f: iload 5
// 051: bipush 1
// 052: isub
// 053: caload
// 054: goto 062
// 057: ldc2_w 1078062487344210034
// 05a: lload 6
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: sipush 676
// 065: ldc2_w 3453390405206460972
// 068: lload 6
// 06a: lxor
// 06b: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: iload 4
// 072: iflt 0c3
// 075: aload 10
// 077: ifnull 0c3
// 07a: if_icmpeq 098
// 07d: goto 08b
// 080: ldc2_w 1078062487344210034
// 083: lload 6
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: aconst_null
// 08c: areturn
// 08d: ldc2_w 1078062487344210034
// 090: lload 6
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: iload 5
// 09a: sipush 11120
// 09d: ldc2_w 4113316486470558705
// 0a0: lload 6
// 0a2: lxor
// 0a3: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: iload 4
// 0aa: iflt 0b5
// 0ad: iadd
// 0ae: aload 10
// 0b0: ifnull 0d4
// 0b3: aload 3
// 0b4: arraylength
// 0b5: goto 0c3
// 0b8: ldc2_w 1078062487344210034
// 0bb: lload 6
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: if_icmplt 0d3
// 0c6: aconst_null
// 0c7: areturn
// 0c8: ldc2_w 1078062487344210034
// 0cb: lload 6
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: bipush 0
// 0d4: istore 11
// 0d6: sipush 25142
// 0d9: bipush 0
// 0da: istore 12
// 0dc: ldc2_w 4203050642759297706
// 0df: lload 6
// 0e1: lxor
// 0e2: iload 5
// 0e4: bipush 1
// 0e5: iadd
// 0e6: istore 12
// 0e8: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: istore 13
// 0ef: bipush 0
// 0f0: istore 14
// 0f2: iload 14
// 0f4: iload 13
// 0f6: if_icmpge 199
// 0f9: iload 14
// 0fb: istore 15
// 0fd: bipush 0
// 0fe: istore 16
// 100: aload 3
// 101: iload 12
// 103: caload
// 104: aload 10
// 106: ifnull 156
// 109: sipush 676
// 10c: ldc2_w 3453390405206460972
// 10f: lload 6
// 111: lxor
// 112: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: aload 10
// 119: ifnull 1f2
// 11c: goto 12a
// 11f: ldc2_w 1078062487344210034
// 122: lload 6
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: if_icmpeq 148
// 12d: goto 13b
// 130: ldc2_w 1078062487344210034
// 133: lload 6
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: aconst_null
// 13c: areturn
// 13d: ldc2_w 1078062487344210034
// 140: lload 6
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: getstatic su/catlean/y3.i Lsu/catlean/y3;
// 14b: aload 3
// 14c: iload 12
// 14e: bipush 1
// 14f: iadd
// 150: caload
// 151: lload 8
// 153: invokespecial su/catlean/y3.H (CJ)I
// 156: istore 17
// 158: iload 1
// 159: iflt 194
// 15c: iload 17
// 15e: aload 10
// 160: ifnull 18e
// 163: ifge 181
// 166: goto 174
// 169: ldc2_w 1078062487344210034
// 16c: lload 6
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: aconst_null
// 175: areturn
// 176: ldc2_w 1078062487344210034
// 179: lload 6
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: iload 11
// 183: bipush 4
// 184: ishl
// 185: iload 17
// 187: ior
// 188: istore 11
// 18a: iload 12
// 18c: bipush 2
// 18d: iadd
// 18e: istore 12
// 190: nop
// 191: iinc 14 1
// 194: aload 10
// 196: ifnonnull 0f2
// 199: iload 11
// 19b: sipush 28576
// 19e: ldc2_w 5546121988787054421
// 1a1: lload 6
// 1a3: lxor
// 1a4: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: ishr
// 1aa: sipush 1331
// 1ad: ldc2_w 6834601545101561216
// 1b0: lload 6
// 1b2: lxor
// 1b3: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: iand
// 1b9: istore 13
// 1bb: iload 11
// 1bd: sipush 12598
// 1c0: ldc2_w 513053881838008783
// 1c3: lload 6
// 1c5: lxor
// 1c6: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cb: ishr
// 1cc: sipush 1331
// 1cf: ldc2_w 6834601545101561216
// 1d2: lload 6
// 1d4: lxor
// 1d5: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: iand
// 1db: istore 14
// 1dd: iload 11
// 1df: sipush 1331
// 1e2: iload 4
// 1e4: iflt 1f2
// 1e7: ldc2_w 6834601545101561216
// 1ea: lload 6
// 1ec: lxor
// 1ed: invokedynamic j (IJ)I bsm=su/catlean/y3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: iand
// 1f3: istore 15
// 1f5: new kotlin/Triple
// 1f8: dup
// 1f9: iload 13
// 1fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 1fe: iload 14
// 200: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 203: iload 15
// 205: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 208: invokespecial kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
// 20b: areturn
}

private static final String t(int var0) {
long var1 = a ^ 17563089926991L;
return String.valueOf((char)new Random().nextInt(b<"j">(27203, 8722727466745298490L ^ var1), b<"j">(29206, 6365168498213742165L ^ var1)));
}

private static final ObjectList Z(Object var0) {
return (ObjectList)(new ObjectArrayList());
}

static {
long var20 = a ^ 70104833297527L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[35];
int var16 = 0;
String var15 = "\u0088\u0019\u0091ç\u0013¤\r\u0012\u0089\bL¸\u0019l¥a\u0010ª$hZË~¯b\f\u000f\u0086kt¯4O\u0018\u0017E:²*D\u0018»\u0014ow7`Àt)²=\u0013\u009fcÊ~:\u0018Ç \u009c³Cû\u0005Eù\f§ø\u001a\u0007«\u001c\u007f\u008d\u0014)y<Èü\u0018ñy\u0097F{¨ÒÐñç»I\u00ado~³\u008b\u0096ÈÅ(è\u0096\u0019(¨\u0017OûÄ\u0004D}Ð\u0013³\u0082ï*3QÖ\u0099ñ@\u0019\u007f,GiéÂ\u008cIBâ\t\u0017.Àü%\u0014\u0093ñ EÒ<\u0002¤ØÚêt\u009eá\u0083$à\u0098:<Ãìb\u001bã&\u008fÀ£\f½oÀ-\u0011\u0018jm\n=H>±r:\b×ø\u0005ëy8æÑmÙé\u0018Ôñ\u0010\u00809[¯\u001d-vÞ¸ÐùLð\u008bïh(÷æÙ%M¦¤\u0003\u0090sªNb±Ás=[\\\u0010yÖ²9\u0091\u0085Ë\nýâü\u000bÝ÷\u0095î`õIã \u0019¢Úp\u0017\\ÕÁ8ï«H{Sò\u000fC\\Tdb\u00902oð:rÐLc\u0087J\u0018 Õê\u0016i|¼ó\u0004ÌÏ\u009a¼' \u0090E\u0085b\u000e°Õ\\x\u0010í\u000f6YÐ\u0001M!\u008d/F\u0001¥s`¨\u0018\u001fgñA^Z\u0099£jÔëb\u0005n#+\"\u0093\u0003Rù<>\u0087\u0010$ ÷u\u0015Þ\u0098ñ\u009b\u008av=%·º¥\u0010£\u00855³\u009c\u0099*oû9¯q\u0090{CÕ8¦D\u0019ÿ8%½íP\u009cjta4mÛjP¡X¼5\u0083Ó3ë\u001dæû[\u00851\u0098¨æo!Kþ\u0000@\u0086Oöj¢T\u0005\u0084( òúñ÷\r(¼|ö\u0019,&Û\u009e\u0099â\u0005{¼\u0014\föSM\u0084 ½JS(w¡ö{U¢®Õ\nøtGzz¿® ª&\u00adO&Þ\u0085pç-kõ3#ã\u001ce¹XÞ\t\u0094õ\u0011WÅ¯þ4z¬{\u0010òp¥&\u001c÷¼¢ô×loW9ìË Á½\u009cµîLôÚ»Ýeë÷\u0007½3r+Ù C\u0083\u0083Jz\u009eÐeþõ¸>\u0010Õ®A¬\n\u0004Å-\u0019\u0095\u008b»\u0015Sm\u009d \u0081nÿi.\u0085ý¤q\tØðDü¹Qå(\u0084Eêø\u0019ÄP/H>\u001f0Î\u008b8.\u0004ÝÞ\u0011\u0007\u001d\u0084÷Ù\u009c3\u0003\u0091iKº\u0006oA\u0080\u008cè\u0090¸\u008d\u0011\u0016/)\u0088höS\u008e \u0015ù!«f\u0010\u00adó>rùNJ97Çù\u00adj¥\u0010Ã/hAI\u0002úÝ\"\u0094²ºhqQ\u0007(\u0095$\u0092£Ç[IvL\u0015éa\u0002b]]\u0085³BóÊH\u0015\u009c¹\u0099\u001bWÈ]'a¤\u0013(1\u007f\u0086\u0015°\u0010ôp\u0080u¶\u000fèÃ\u0088\u0007\u001dL\u008eÃxØ\u0010(£¾¿¬\b¥ÂáZ\u008au\nB\u009f\u0087\u0018Ì\"(âh\u001f\u0098\r7f¦Ð#õð\bÉÛÈ·\u0014ey\u0089 #ËJ'¸õß·ÍnþwWçdEB[çáôÊÊÄaÓz>\u00810÷z \u009c\u0012Z@Ný\u001e|\u0018\u0012½e\u0098níÊ#£4¿\u009a§\u0001ÒZµã\u000få\u000ecÖ 4f÷aÕJ±\u001f\u0088¡ûé]{Æ\u0018P\u008d?÷0¥ÿC0æ4J\u008d\u0098\u008d0 W\u0013³\u0010ªeÐî\u0003Ç\u008eG\u0090Öl\u0096¦@Ýû\u0014\u0098cøUFÎV´IOÉ";
int var17 = "\u0088\u0019\u0091ç\u0013¤\r\u0012\u0089\bL¸\u0019l¥a\u0010ª$hZË~¯b\f\u000f\u0086kt¯4O\u0018\u0017E:²*D\u0018»\u0014ow7`Àt)²=\u0013\u009fcÊ~:\u0018Ç \u009c³Cû\u0005Eù\f§ø\u001a\u0007«\u001c\u007f\u008d\u0014)y<Èü\u0018ñy\u0097F{¨ÒÐñç»I\u00ado~³\u008b\u0096ÈÅ(è\u0096\u0019(¨\u0017OûÄ\u0004D}Ð\u0013³\u0082ï*3QÖ\u0099ñ@\u0019\u007f,GiéÂ\u008cIBâ\t\u0017.Àü%\u0014\u0093ñ EÒ<\u0002¤ØÚêt\u009eá\u0083$à\u0098:<Ãìb\u001bã&\u008fÀ£\f½oÀ-\u0011\u0018jm\n=H>±r:\b×ø\u0005ëy8æÑmÙé\u0018Ôñ\u0010\u00809[¯\u001d-vÞ¸ÐùLð\u008bïh(÷æÙ%M¦¤\u0003\u0090sªNb±Ás=[\\\u0010yÖ²9\u0091\u0085Ë\nýâü\u000bÝ÷\u0095î`õIã \u0019¢Úp\u0017\\ÕÁ8ï«H{Sò\u000fC\\Tdb\u00902oð:rÐLc\u0087J\u0018 Õê\u0016i|¼ó\u0004ÌÏ\u009a¼' \u0090E\u0085b\u000e°Õ\\x\u0010í\u000f6YÐ\u0001M!\u008d/F\u0001¥s`¨\u0018\u001fgñA^Z\u0099£jÔëb\u0005n#+\"\u0093\u0003Rù<>\u0087\u0010$ ÷u\u0015Þ\u0098ñ\u009b\u008av=%·º¥\u0010£\u00855³\u009c\u0099*oû9¯q\u0090{CÕ8¦D\u0019ÿ8%½íP\u009cjta4mÛjP¡X¼5\u0083Ó3ë\u001dæû[\u00851\u0098¨æo!Kþ\u0000@\u0086Oöj¢T\u0005\u0084( òúñ÷\r(¼|ö\u0019,&Û\u009e\u0099â\u0005{¼\u0014\föSM\u0084 ½JS(w¡ö{U¢®Õ\nøtGzz¿® ª&\u00adO&Þ\u0085pç-kõ3#ã\u001ce¹XÞ\t\u0094õ\u0011WÅ¯þ4z¬{\u0010òp¥&\u001c÷¼¢ô×loW9ìË Á½\u009cµîLôÚ»Ýeë÷\u0007½3r+Ù C\u0083\u0083Jz\u009eÐeþõ¸>\u0010Õ®A¬\n\u0004Å-\u0019\u0095\u008b»\u0015Sm\u009d \u0081nÿi.\u0085ý¤q\tØðDü¹Qå(\u0084Eêø\u0019ÄP/H>\u001f0Î\u008b8.\u0004ÝÞ\u0011\u0007\u001d\u0084÷Ù\u009c3\u0003\u0091iKº\u0006oA\u0080\u008cè\u0090¸\u008d\u0011\u0016/)\u0088höS\u008e \u0015ù!«f\u0010\u00adó>rùNJ97Çù\u00adj¥\u0010Ã/hAI\u0002úÝ\"\u0094²ºhqQ\u0007(\u0095$\u0092£Ç[IvL\u0015éa\u0002b]]\u0085³BóÊH\u0015\u009c¹\u0099\u001bWÈ]'a¤\u0013(1\u007f\u0086\u0015°\u0010ôp\u0080u¶\u000fèÃ\u0088\u0007\u001dL\u008eÃxØ\u0010(£¾¿¬\b¥ÂáZ\u008au\nB\u009f\u0087\u0018Ì\"(âh\u001f\u0098\r7f¦Ð#õð\bÉÛÈ·\u0014ey\u0089 #ËJ'¸õß·ÍnþwWçdEB[çáôÊÊÄaÓz>\u00810÷z \u009c\u0012Z@Ný\u001e|\u0018\u0012½e\u0098níÊ#£4¿\u009a§\u0001ÒZµã\u000få\u000ecÖ 4f÷aÕJ±\u001f\u0088¡ûé]{Æ\u0018P\u008d?÷0¥ÿC0æ4J\u008d\u0098\u008d0 W\u0013³\u0010ªeÐî\u0003Ç\u008eG\u0090Öl\u0096¦@Ýû\u0014\u0098cøUFÎV´IOÉ"
.length();
char var14 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[35];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[73];
int var3 = 0;
String var4 = "P@ãæ¬\u009b\u001eéwòI=zÏº,Íø\u001a^--Õ\u0094U\u0088\f)\u0089Qg\u001cL\u00150\u0013µ¯\u009djÁÁ¥\u0015ó\u0090Ú\u0011\u0014\u0096Û\u0003\u007fÂ\u0090õ´åØºò@J\u00ad\u0099\u000bkF¹ðm\u0003ò!¨ªpÜ\u0090\"\u0096ô#Ç\u0097Í\u008eü\u008eÓUPí¬Í\u0003Ço\u000b\u0094\u00861ã\u0000`Ï\u0002o\u0090\u0098,0É|\u0013½i]ño\u001b.\u000e\u0083ë÷RDQLHK\u0098Â~! \u0017$´\u0006ÁG\u0005\u0006\u008bIA1\u0007\u0084çXz8\u0092\u0019'^þ\u0019ò .¸ª|¬ã\u0088\u0018®ëÆpÖÛ\u0001åh<\u0018å6\u0095&Þ\u0006h1Í¥ßî\u0092\u0085\u009bR'ù\u0004àñ\u0082\u001fÎ\nÅ¢u\u0011¢Á\u009dÆGºÈ*y\u0091ì»kY¬<þ®\rM+m\u000fÚ:øß\b¡aÉ\u0091\u0011´LÞzA\u0083(ß\u008a§×Ç/¤æ6¢\u0097Áº\u009c\u009f\u0011w\u0097x\u0090\u0016R¬\u000fÇå9Nõ\u000eº\u0011KXÈÀß\u0081\nÀù\u0090\u009eí¾¼Õ'×\u0014(D\u000bÂÞ\u0002L:;v\f9ÍÎ\u0001Ã\u0090\u0017É\u0096ò¸³u\t\u0000\u009aúÕbDò]|\u0000{´MÄ\u0080ú}&\u001e\u001fù.lß¨uÔ5\u0017Ïß\"ÞrÃèç*>\u000b\b\u0096µä³\u0014ZK¶ÍÐC\tÄ±<15$äQ¶\n\u0098½*Á±îe\u0088+\u0018Â\u00ad-ÜaÏS\u0082FÉ\u0084\u001cÑ\u0006î\u000bÿ{øé $o\u0098 \u00954<vÖHô\u001dø¶f\u0091G\u001f7ë©\u009aoËæ\u0093\u0002»ÜoX´\u0015\u009f\u0011á»3³`\u0019\u0090\u0013FÏõeñ\u007fh;E}ð\u0087\u0002¥\u00ad¤EEë;Ý\u0011^:§¨j«D>\u0087\u0092^W`\u000bÃ¹}ìî÷r\u0083/\u0095\u0094 hSå¨sW²?J\u0015{\u0003}!ê\u0004\u0091J\u008eçãoíÉÍ$p\u0088»¯¼ëb\u0002=ßSÎfÛÎo¤©U~(\u007f\u0094+¹\u008a\u0093Å\u0086ÅR";
int var5 = "P@ãæ¬\u009b\u001eéwòI=zÏº,Íø\u001a^--Õ\u0094U\u0088\f)\u0089Qg\u001cL\u00150\u0013µ¯\u009djÁÁ¥\u0015ó\u0090Ú\u0011\u0014\u0096Û\u0003\u007fÂ\u0090õ´åØºò@J\u00ad\u0099\u000bkF¹ðm\u0003ò!¨ªpÜ\u0090\"\u0096ô#Ç\u0097Í\u008eü\u008eÓUPí¬Í\u0003Ço\u000b\u0094\u00861ã\u0000`Ï\u0002o\u0090\u0098,0É|\u0013½i]ño\u001b.\u000e\u0083ë÷RDQLHK\u0098Â~! \u0017$´\u0006ÁG\u0005\u0006\u008bIA1\u0007\u0084çXz8\u0092\u0019'^þ\u0019ò .¸ª|¬ã\u0088\u0018®ëÆpÖÛ\u0001åh<\u0018å6\u0095&Þ\u0006h1Í¥ßî\u0092\u0085\u009bR'ù\u0004àñ\u0082\u001fÎ\nÅ¢u\u0011¢Á\u009dÆGºÈ*y\u0091ì»kY¬<þ®\rM+m\u000fÚ:øß\b¡aÉ\u0091\u0011´LÞzA\u0083(ß\u008a§×Ç/¤æ6¢\u0097Áº\u009c\u009f\u0011w\u0097x\u0090\u0016R¬\u000fÇå9Nõ\u000eº\u0011KXÈÀß\u0081\nÀù\u0090\u009eí¾¼Õ'×\u0014(D\u000bÂÞ\u0002L:;v\f9ÍÎ\u0001Ã\u0090\u0017É\u0096ò¸³u\t\u0000\u009aúÕbDò]|\u0000{´MÄ\u0080ú}&\u001e\u001fù.lß¨uÔ5\u0017Ïß\"ÞrÃèç*>\u000b\b\u0096µä³\u0014ZK¶ÍÐC\tÄ±<15$äQ¶\n\u0098½*Á±îe\u0088+\u0018Â\u00ad-ÜaÏS\u0082FÉ\u0084\u001cÑ\u0006î\u000bÿ{øé $o\u0098 \u00954<vÖHô\u001dø¶f\u0091G\u001f7ë©\u009aoËæ\u0093\u0002»ÜoX´\u0015\u009f\u0011á»3³`\u0019\u0090\u0013FÏõeñ\u007fh;E}ð\u0087\u0002¥\u00ad¤EEë;Ý\u0011^:§¨j«D>\u0087\u0092^W`\u000bÃ¹}ìî÷r\u0083/\u0095\u0094 hSå¨sW²?J\u0015{\u0003}!ê\u0004\u0091J\u008eçãoíÉÍ$p\u0088»¯¼ëb\u0002=ßSÎfÛÎo¤©U~(\u007f\u0094+¹\u008a\u0093Å\u0086ÅR"
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
e = var6;
f = new Integer[73];
S = (char)b<"j">(15029, var20 ^ 6974964047893223873L);
i = new y3();
C = new Char2IntArrayMap();
C.put((char)b<"j">(25143, 202442375002390848L ^ var20), 0);
C.put((char)b<"j">(19680, 5749699491522195337L ^ var20), b<"j">(21408, 5462255243932348553L ^ var20));
C.put((char)b<"j">(7727, 3048525079001365883L ^ var20), b<"j">(30510, 541936479778739308L ^ var20));
C.put((char)b<"j">(29054, 8199293677992251937L ^ var20), b<"j">(12470, 1544289848344564726L ^ var20));
C.put((char)b<"j">(24162, 1778673973955378433L ^ var20), b<"j">(25002, 8501589601241694940L ^ var20));
C.put((char)b<"j">(10046, 5676683512675583059L ^ var20), b<"j">(9311, 7705210523058030345L ^ var20));
C.put((char)b<"j">(11863, 2023866345903181058L ^ var20), b<"j">(11174, 2133481503253154011L ^ var20));
C.put((char)b<"j">(9067, 2160786568903180321L ^ var20), b<"j">(10053, 4999383505629135979L ^ var20));
C.put((char)b<"j">(19166, 5964461576307222937L ^ var20), b<"j">(7076, 6493983365537233140L ^ var20));
C.put((char)b<"j">(21822, 4138227465693050456L ^ var20), b<"j">(13276, 6805493237591789728L ^ var20));
C.put((char)b<"j">(22221, 5344554010883732906L ^ var20), b<"j">(2367, 7086918765737503348L ^ var20));
C.put((char)b<"j">(25262, 6106730404130357735L ^ var20), b<"j">(13580, 3128784557796841032L ^ var20));
C.put((char)b<"j">(25417, 1467024629790441492L ^ var20), b<"j">(27061, 3708123595902323453L ^ var20));
C.put((char)b<"j">(29434, 4311453581575491998L ^ var20), b<"j">(30615, 6744903231849305291L ^ var20));
C.put((char)b<"j">(16711, 664461786437886517L ^ var20), b<"j">(17931, 8421949701080753476L ^ var20));
C.put((char)b<"j">(25216, 7734089808218128864L ^ var20), b<"j">(20633, 850706755553473479L ^ var20));
C.put((char)b<"j">(7057, 3503022040092571836L ^ var20), b<"j">(3212, 8326140886392500132L ^ var20));
C.put((char)b<"j">(32524, 669498090082114658L ^ var20), b<"j">(17801, 6195292343193806502L ^ var20));
C.put((char)b<"j">(4496, 8353447011432723189L ^ var20), b<"j">(30684, 5658253475838923948L ^ var20));
C.put((char)b<"j">(17532, 2051337095551199022L ^ var20), b<"j">(3504, 8436814532497469173L ^ var20));
C.put((char)b<"j">(31057, 8317338246077946414L ^ var20), b<"j">(1129, 9027171827915319046L ^ var20));
C.put((char)b<"j">(20705, 4011615382369612747L ^ var20), b<"j">(24304, 4354735945764912539L ^ var20));
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "$Bó\u0095ÂÄY\u0015\u0084õæ\u000bOÐ×\u001a";
var5 = "$Bó\u0095ÂÄY\u0015\u0084õæ\u000bOÐ×\u001a".length();
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

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "#\u008eÉ\u00161ÊÌµ\u0090\u0083\u0098\u0006\u0096\u0094ñïo;:~8\u0006m¶nç3\u008e\u0092C|Ò\u008e\u001d\u0081\u0083V\u0082×D\u0018\"\u0092põÂ8i\u0013\u007f\u0090ìm%CLTÇàû\u009cSP\u0087æ";
var17 = "#\u008eÉ\u00161ÊÌµ\u0090\u0083\u0098\u0006\u0096\u0094ñïo;:~8\u0006m¶nç3\u008e\u0092C|Ò\u008e\u001d\u0081\u0083V\u0082×D\u0018\"\u0092põÂ8i\u0013\u007f\u0090ìm%CLTÇàû\u009cSP\u0087æ"
.length();
var14 = '(';
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27381;
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
throw new RuntimeException("su/catlean/y3", var10);
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
throw new RuntimeException("su/catlean/y3" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18391;
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
throw new RuntimeException("su/catlean/y3", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
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
throw new RuntimeException("su/catlean/y3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
