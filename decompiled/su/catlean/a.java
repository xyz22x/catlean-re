package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4588;
import org.jetbrains.annotations.NotNull;

public final class a implements class_4588 {
@NotNull
private final g7 t;
@NotNull
private final s8 T;
@NotNull
private final Color K;
@NotNull
private final float[] N;
@NotNull
private final float[] O;
@NotNull
private final float[] c;
private int U;
private static final long a = yz.a(6926736157159243436L, -9151925333158037746L, MethodHandles.lookup().lookupClass()).a(10325118395933L);
private static final String b;

public a(long a, @NotNull g7 polygon, @NotNull s8 m, @NotNull Color c) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(polygon, b);
Intrinsics.checkNotNullParameter(m, "m");
Intrinsics.checkNotNullParameter(cx, "c");
super();
this.t = polygon;
this.T = m;
this.K = cx;
this.N = new float[4];
this.O = new float[4];
this.c = new float[4];
}

@NotNull
public final g7 g() {
return this.t;
}

@NotNull
public final s8 e() {
return this.T;
}

@NotNull
public final Color t() {
return this.K;
}

@NotNull
public class_4588 method_22912(float x, float y, float z) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/a.a J
// 003: ldc2_w 42781861906844
// 006: lxor
// 007: lstore 4
// 009: lload 4
// 00b: dup2
// 00c: ldc2_w 107852749224821
// 00f: lxor
// 010: lstore 6
// 012: dup2
// 013: ldc2_w 51473694522779
// 016: lxor
// 017: lstore 8
// 019: pop2
// 01a: ldc2_w 6848976406457212003
// 01d: lload 4
// 01f: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 024: aload 0
// 025: getfield su/catlean/a.N [F
// 028: aload 0
// 029: getfield su/catlean/a.U I
// 02c: fload 1
// 02d: fastore
// 02e: aload 0
// 02f: getfield su/catlean/a.O [F
// 032: aload 0
// 033: getfield su/catlean/a.U I
// 036: fload 2
// 037: fastore
// 038: aload 0
// 039: getfield su/catlean/a.c [F
// 03c: aload 0
// 03d: getfield su/catlean/a.U I
// 040: fload 3
// 041: fastore
// 042: istore 10
// 044: aload 0
// 045: getfield su/catlean/a.U I
// 048: istore 11
// 04a: aload 0
// 04b: iload 11
// 04d: bipush 1
// 04e: iadd
// 04f: putfield su/catlean/a.U I
// 052: aload 0
// 053: iload 10
// 055: ifne 27c
// 058: getfield su/catlean/a.U I
// 05b: bipush 4
// 05c: if_icmpne 278
// 05f: goto 06d
// 062: ldc2_w 6906303475790151069
// 065: lload 4
// 067: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: athrow
// 06d: aload 0
// 06e: getfield su/catlean/a.T Lsu/catlean/s8;
// 071: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 074: iload 10
// 076: ifne 14d
// 079: goto 087
// 07c: ldc2_w 6906303475790151069
// 07f: lload 4
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: if_acmpne 133
// 08a: goto 098
// 08d: ldc2_w 6906303475790151069
// 090: lload 4
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: aload 0
// 099: getfield su/catlean/a.t Lsu/catlean/g7;
// 09c: aload 0
// 09d: getfield su/catlean/a.N [F
// 0a0: bipush 0
// 0a1: faload
// 0a2: aload 0
// 0a3: getfield su/catlean/a.O [F
// 0a6: bipush 0
// 0a7: faload
// 0a8: lload 6
// 0aa: dup2_x1
// 0ab: pop2
// 0ac: aload 0
// 0ad: getfield su/catlean/a.c [F
// 0b0: bipush 0
// 0b1: faload
// 0b2: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0b5: aload 0
// 0b6: getfield su/catlean/a.K Ljava/awt/Color;
// 0b9: lload 8
// 0bb: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0be: aload 0
// 0bf: getfield su/catlean/a.N [F
// 0c2: bipush 1
// 0c3: faload
// 0c4: aload 0
// 0c5: getfield su/catlean/a.O [F
// 0c8: bipush 1
// 0c9: faload
// 0ca: lload 6
// 0cc: dup2_x1
// 0cd: pop2
// 0ce: aload 0
// 0cf: getfield su/catlean/a.c [F
// 0d2: bipush 1
// 0d3: faload
// 0d4: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0d7: aload 0
// 0d8: getfield su/catlean/a.K Ljava/awt/Color;
// 0db: lload 8
// 0dd: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0e0: aload 0
// 0e1: getfield su/catlean/a.N [F
// 0e4: bipush 2
// 0e5: faload
// 0e6: aload 0
// 0e7: getfield su/catlean/a.O [F
// 0ea: bipush 2
// 0eb: faload
// 0ec: lload 6
// 0ee: dup2_x1
// 0ef: pop2
// 0f0: aload 0
// 0f1: getfield su/catlean/a.c [F
// 0f4: bipush 2
// 0f5: faload
// 0f6: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0f9: aload 0
// 0fa: getfield su/catlean/a.K Ljava/awt/Color;
// 0fd: lload 8
// 0ff: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 102: aload 0
// 103: getfield su/catlean/a.N [F
// 106: bipush 3
// 107: faload
// 108: aload 0
// 109: getfield su/catlean/a.O [F
// 10c: bipush 3
// 10d: faload
// 10e: lload 6
// 110: dup2_x1
// 111: pop2
// 112: aload 0
// 113: getfield su/catlean/a.c [F
// 116: bipush 3
// 117: faload
// 118: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 11b: aload 0
// 11c: getfield su/catlean/a.K Ljava/awt/Color;
// 11f: lload 8
// 121: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 124: pop
// 125: goto 133
// 128: ldc2_w 6906303475790151069
// 12b: lload 4
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: aload 0
// 134: iload 10
// 136: ifne 274
// 139: getfield su/catlean/a.T Lsu/catlean/s8;
// 13c: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 13f: goto 14d
// 142: ldc2_w 6906303475790151069
// 145: lload 4
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: if_acmpne 273
// 150: aload 0
// 151: getfield su/catlean/a.t Lsu/catlean/g7;
// 154: aload 0
// 155: getfield su/catlean/a.N [F
// 158: bipush 0
// 159: faload
// 15a: aload 0
// 15b: getfield su/catlean/a.O [F
// 15e: bipush 0
// 15f: faload
// 160: lload 6
// 162: dup2_x1
// 163: pop2
// 164: aload 0
// 165: getfield su/catlean/a.c [F
// 168: bipush 0
// 169: faload
// 16a: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 16d: aload 0
// 16e: getfield su/catlean/a.K Ljava/awt/Color;
// 171: lload 8
// 173: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 176: aload 0
// 177: getfield su/catlean/a.N [F
// 17a: bipush 1
// 17b: faload
// 17c: aload 0
// 17d: getfield su/catlean/a.O [F
// 180: bipush 1
// 181: faload
// 182: lload 6
// 184: dup2_x1
// 185: pop2
// 186: aload 0
// 187: getfield su/catlean/a.c [F
// 18a: bipush 1
// 18b: faload
// 18c: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 18f: aload 0
// 190: getfield su/catlean/a.K Ljava/awt/Color;
// 193: lload 8
// 195: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 198: aload 0
// 199: getfield su/catlean/a.N [F
// 19c: bipush 1
// 19d: faload
// 19e: aload 0
// 19f: getfield su/catlean/a.O [F
// 1a2: bipush 1
// 1a3: faload
// 1a4: lload 6
// 1a6: dup2_x1
// 1a7: pop2
// 1a8: aload 0
// 1a9: getfield su/catlean/a.c [F
// 1ac: bipush 1
// 1ad: faload
// 1ae: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1b1: aload 0
// 1b2: getfield su/catlean/a.K Ljava/awt/Color;
// 1b5: lload 8
// 1b7: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1ba: aload 0
// 1bb: getfield su/catlean/a.N [F
// 1be: bipush 2
// 1bf: faload
// 1c0: aload 0
// 1c1: getfield su/catlean/a.O [F
// 1c4: bipush 2
// 1c5: faload
// 1c6: lload 6
// 1c8: dup2_x1
// 1c9: pop2
// 1ca: aload 0
// 1cb: getfield su/catlean/a.c [F
// 1ce: bipush 2
// 1cf: faload
// 1d0: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1d3: aload 0
// 1d4: getfield su/catlean/a.K Ljava/awt/Color;
// 1d7: lload 8
// 1d9: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1dc: aload 0
// 1dd: getfield su/catlean/a.N [F
// 1e0: bipush 2
// 1e1: faload
// 1e2: aload 0
// 1e3: getfield su/catlean/a.O [F
// 1e6: bipush 2
// 1e7: faload
// 1e8: lload 6
// 1ea: dup2_x1
// 1eb: pop2
// 1ec: aload 0
// 1ed: getfield su/catlean/a.c [F
// 1f0: bipush 2
// 1f1: faload
// 1f2: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 1f5: aload 0
// 1f6: getfield su/catlean/a.K Ljava/awt/Color;
// 1f9: lload 8
// 1fb: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1fe: aload 0
// 1ff: getfield su/catlean/a.N [F
// 202: bipush 3
// 203: faload
// 204: aload 0
// 205: getfield su/catlean/a.O [F
// 208: bipush 3
// 209: faload
// 20a: lload 6
// 20c: dup2_x1
// 20d: pop2
// 20e: aload 0
// 20f: getfield su/catlean/a.c [F
// 212: bipush 3
// 213: faload
// 214: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 217: aload 0
// 218: getfield su/catlean/a.K Ljava/awt/Color;
// 21b: lload 8
// 21d: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 220: aload 0
// 221: getfield su/catlean/a.N [F
// 224: bipush 0
// 225: faload
// 226: aload 0
// 227: getfield su/catlean/a.O [F
// 22a: bipush 0
// 22b: faload
// 22c: lload 6
// 22e: dup2_x1
// 22f: pop2
// 230: aload 0
// 231: getfield su/catlean/a.c [F
// 234: bipush 0
// 235: faload
// 236: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 239: aload 0
// 23a: getfield su/catlean/a.K Ljava/awt/Color;
// 23d: lload 8
// 23f: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 242: aload 0
// 243: getfield su/catlean/a.N [F
// 246: bipush 0
// 247: faload
// 248: aload 0
// 249: getfield su/catlean/a.O [F
// 24c: bipush 0
// 24d: faload
// 24e: lload 6
// 250: dup2_x1
// 251: pop2
// 252: aload 0
// 253: getfield su/catlean/a.c [F
// 256: bipush 0
// 257: faload
// 258: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 25b: aload 0
// 25c: getfield su/catlean/a.K Ljava/awt/Color;
// 25f: lload 8
// 261: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 264: pop
// 265: goto 273
// 268: ldc2_w 6906303475790151069
// 26b: lload 4
// 26d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 272: athrow
// 273: aload 0
// 274: bipush 0
// 275: putfield su/catlean/a.U I
// 278: aload 0
// 279: checkcast net/minecraft/class_4588
// 27c: areturn
}

@NotNull
public a C(int red, int green, int blue, int alpha) {
return this;
}

@NotNull
public a q(int argb) {
return this;
}

@NotNull
public a S(float u, float v) {
return this;
}

@NotNull
public a R(int u, int v) {
return this;
}

@NotNull
public a P(int u, int v) {
return this;
}

@NotNull
public a b(float x, float y, float z) {
return this;
}

@NotNull
public a k(float width) {
return this;
}

public class_4588 method_1336(int i, int j, int k, int l) {
return this.C(i, j, k, l);
}

public class_4588 method_39415(int i) {
return this.q(i);
}

public class_4588 method_22913(float f, float g) {
return this.S(f, g);
}

public class_4588 method_60796(int i, int j) {
return this.R(i, j);
}

public class_4588 method_22921(int i, int j) {
return this.P(i, j);
}

public class_4588 method_22914(float f, float g, float h) {
return this.b(f, g, h);
}

public class_4588 method_75298(float f) {
return this.k(f);
}

static {
long var0 = a ^ 102293115833537L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("û)\u0096\\Ó!\u0002&".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
byte var10001 = -1;
b = var5;
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
}
