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

public final class sp implements class_4588 {
@NotNull
private final g7 a;
@NotNull
private final Color D;
@NotNull
private final float[] h;
@NotNull
private final float[] k;
@NotNull
private final float[] x;
@NotNull
private final float[] g;
@NotNull
private final float[] J;
private int A;
private static final long b = yz.a(-7434242412849004936L, 781587174107891465L, MethodHandles.lookup().lookupClass()).a(204322601711376L);
private static final String c;

public sp(@NotNull g7 polygon, @NotNull Color c, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(polygon, c);
Intrinsics.checkNotNullParameter(cx, "c");
super();
this.a = polygon;
this.D = cx;
this.h = new float[4];
this.k = new float[4];
this.x = new float[4];
this.g = new float[4];
this.J = new float[4];
}

@NotNull
public final g7 E() {
return this.a;
}

@NotNull
public final Color v() {
return this.D;
}

@NotNull
public class_4588 method_22912(float x, float y, float z) {
this.h[this.A] = xx;
this.k[this.A] = y;
this.x[this.A] = z;
return this;
}

@NotNull
public sp S(int red, int green, int blue, int alpha) {
return this;
}

@NotNull
public sp U(int argb) {
return this;
}

@NotNull
public class_4588 method_22913(float u, float v) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sp.b J
// 003: ldc2_w 57249687493987
// 006: lxor
// 007: lstore 3
// 008: lload 3
// 009: dup2
// 00a: ldc2_w 46733975672444
// 00d: lxor
// 00e: lstore 5
// 010: dup2
// 011: ldc2_w 112454349361298
// 014: lxor
// 015: lstore 7
// 017: dup2
// 018: ldc2_w 60784733681065
// 01b: lxor
// 01c: lstore 9
// 01e: pop2
// 01f: ldc2_w -5601319438456759227
// 022: lload 3
// 023: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: aload 0
// 029: getfield su/catlean/sp.g [F
// 02c: aload 0
// 02d: getfield su/catlean/sp.A I
// 030: fload 1
// 031: fastore
// 032: astore 11
// 034: aload 0
// 035: getfield su/catlean/sp.J [F
// 038: aload 0
// 039: getfield su/catlean/sp.A I
// 03c: fload 2
// 03d: fastore
// 03e: aload 0
// 03f: getfield su/catlean/sp.A I
// 042: istore 12
// 044: aload 0
// 045: iload 12
// 047: bipush 1
// 048: iadd
// 049: putfield su/catlean/sp.A I
// 04c: aload 0
// 04d: aload 11
// 04f: ifnonnull 155
// 052: getfield su/catlean/sp.A I
// 055: bipush 4
// 056: if_icmpne 151
// 059: goto 066
// 05c: ldc2_w -5479909759328709513
// 05f: lload 3
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: aload 0
// 067: getfield su/catlean/sp.a Lsu/catlean/g7;
// 06a: aload 0
// 06b: getfield su/catlean/sp.h [F
// 06e: bipush 0
// 06f: faload
// 070: aload 0
// 071: getfield su/catlean/sp.k [F
// 074: bipush 0
// 075: faload
// 076: lload 5
// 078: dup2_x1
// 079: pop2
// 07a: aload 0
// 07b: getfield su/catlean/sp.x [F
// 07e: bipush 0
// 07f: faload
// 080: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 083: aload 0
// 084: getfield su/catlean/sp.g [F
// 087: bipush 0
// 088: faload
// 089: aload 0
// 08a: getfield su/catlean/sp.J [F
// 08d: bipush 0
// 08e: faload
// 08f: lload 9
// 091: dup2_x1
// 092: pop2
// 093: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 096: aload 0
// 097: getfield su/catlean/sp.D Ljava/awt/Color;
// 09a: lload 7
// 09c: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 09f: aload 0
// 0a0: getfield su/catlean/sp.h [F
// 0a3: bipush 1
// 0a4: faload
// 0a5: aload 0
// 0a6: getfield su/catlean/sp.k [F
// 0a9: bipush 1
// 0aa: faload
// 0ab: lload 5
// 0ad: dup2_x1
// 0ae: pop2
// 0af: aload 0
// 0b0: getfield su/catlean/sp.x [F
// 0b3: bipush 1
// 0b4: faload
// 0b5: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0b8: aload 0
// 0b9: getfield su/catlean/sp.g [F
// 0bc: bipush 1
// 0bd: faload
// 0be: aload 0
// 0bf: getfield su/catlean/sp.J [F
// 0c2: bipush 1
// 0c3: faload
// 0c4: lload 9
// 0c6: dup2_x1
// 0c7: pop2
// 0c8: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 0cb: aload 0
// 0cc: getfield su/catlean/sp.D Ljava/awt/Color;
// 0cf: lload 7
// 0d1: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 0d4: aload 0
// 0d5: getfield su/catlean/sp.h [F
// 0d8: bipush 2
// 0d9: faload
// 0da: aload 0
// 0db: getfield su/catlean/sp.k [F
// 0de: bipush 2
// 0df: faload
// 0e0: lload 5
// 0e2: dup2_x1
// 0e3: pop2
// 0e4: aload 0
// 0e5: getfield su/catlean/sp.x [F
// 0e8: bipush 2
// 0e9: faload
// 0ea: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 0ed: aload 0
// 0ee: getfield su/catlean/sp.g [F
// 0f1: bipush 2
// 0f2: faload
// 0f3: aload 0
// 0f4: getfield su/catlean/sp.J [F
// 0f7: bipush 2
// 0f8: faload
// 0f9: lload 9
// 0fb: dup2_x1
// 0fc: pop2
// 0fd: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 100: aload 0
// 101: getfield su/catlean/sp.D Ljava/awt/Color;
// 104: lload 7
// 106: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 109: aload 0
// 10a: getfield su/catlean/sp.h [F
// 10d: bipush 3
// 10e: faload
// 10f: aload 0
// 110: getfield su/catlean/sp.k [F
// 113: bipush 3
// 114: faload
// 115: lload 5
// 117: dup2_x1
// 118: pop2
// 119: aload 0
// 11a: getfield su/catlean/sp.x [F
// 11d: bipush 3
// 11e: faload
// 11f: invokevirtual su/catlean/g7.G (FJFF)Lsu/catlean/g7;
// 122: aload 0
// 123: getfield su/catlean/sp.g [F
// 126: bipush 3
// 127: faload
// 128: aload 0
// 129: getfield su/catlean/sp.J [F
// 12c: bipush 3
// 12d: faload
// 12e: lload 9
// 130: dup2_x1
// 131: pop2
// 132: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 135: aload 0
// 136: getfield su/catlean/sp.D Ljava/awt/Color;
// 139: lload 7
// 13b: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 13e: pop
// 13f: aload 0
// 140: bipush 0
// 141: putfield su/catlean/sp.A I
// 144: goto 151
// 147: ldc2_w -5479909759328709513
// 14a: lload 3
// 14b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 150: athrow
// 151: aload 0
// 152: checkcast net/minecraft/class_4588
// 155: areturn
}

@NotNull
public sp L(int u, int v) {
return this;
}

@NotNull
public sp q(int u, int v) {
return this;
}

@NotNull
public sp A(float x, float y, float z) {
return this;
}

@NotNull
public sp Q(float width) {
return this;
}

public class_4588 method_1336(int i, int j, int k, int l) {
return this.S(i, j, kx, l);
}

public class_4588 method_39415(int i) {
return this.U(i);
}

public class_4588 method_60796(int i, int j) {
return this.L(i, j);
}

public class_4588 method_22921(int i, int j) {
return this.q(i, j);
}

public class_4588 method_22914(float f, float g, float h) {
return this.A(f, gx, hx);
}

public class_4588 method_75298(float f) {
return this.Q(f);
}

static {
long var0 = b ^ 25267156858201L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("J\u000bÈ½æC÷\u0010".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
byte var10001 = -1;
c = var5;
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
