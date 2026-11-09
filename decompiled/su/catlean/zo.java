package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;

final class zo {
@NotNull
private final class_2338 d;
private float u;
private float B;
private static final long a = yz.a(-5474669734960199274L, -8774629665145894539L, MethodHandles.lookup().lookupClass()).a(146412538928237L);
private static final String b;

public zo(long a, @NotNull class_2338 pos, float progress, float prevProgress) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(pos, b);
super();
this.d = pos;
this.u = progress;
this.B = prevProgress;
}

public zo(long var1, class_2338 var3, float var4, float var5, int var6, DefaultConstructorMarker var7) {
var1 = a ^ var1;
long var8 = var1 ^ 116639749730339L;
if ((var6 & 2) != 0) {
var4 = 0.0F;
}

if ((var6 & 4) != 0) {
var5 = 0.0F;
}

this(var8, var3, var4, var5);
}

@NotNull
public final class_2338 g() {
return this.d;
}

public final float K() {
return this.u;
}

public final void w(float <set-?>) {
this.u = <set-?>;
}

public final float w() {
return this.B;
}

public final void U(float <set-?>) {
this.B = <set-?>;
}

public final boolean o(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/zo.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 16006240157178
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: aload 0
// 0f: aload 0
// 10: getfield su/catlean/zo.u F
// 13: putfield su/catlean/zo.B F
// 16: ldc2_w -3362763977366067105
// 19: lload 1
// 1a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: aload 0
// 20: aload 0
// 21: getfield su/catlean/zo.u F
// 24: ldc 0.025
// 26: fadd
// 27: putfield su/catlean/zo.u F
// 2a: astore 5
// 2c: lload 3
// 2d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 30: aload 0
// 31: getfield su/catlean/zo.d Lnet/minecraft/class_2338;
// 34: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 37: aload 5
// 39: ifnonnull 5e
// 3c: ifeq 58
// 3f: goto 4c
// 42: ldc2_w -3363798988963646476
// 45: lload 1
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: bipush 1
// 4d: ireturn
// 4e: ldc2_w -3363798988963646476
// 51: lload 1
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: aload 0
// 59: getfield su/catlean/zo.u F
// 5c: fconst_2
// 5d: fcmpl
// 5e: aload 5
// 60: ifnonnull 74
// 63: ifle 77
// 66: goto 73
// 69: ldc2_w -3363798988963646476
// 6c: lload 1
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: bipush 1
// 74: goto 78
// 77: bipush 0
// 78: lload 1
// 79: lconst_0
// 7a: lcmp
// 7b: iflt 96
// 7e: ldc2_w -3358663505792020494
// 81: lload 1
// 82: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: ifnull a3
// 8a: bipush 2
// 8b: newarray 10
// 8d: ldc2_w -3367252450618444341
// 90: lload 1
// 91: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 96: goto a3
// 99: ldc2_w -3363798988963646476
// 9c: lload 1
// 9d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a2: athrow
// a3: ireturn
}

static {
long var0 = a ^ 134727285253647L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal(".Q¼^+åq\u007f".getBytes("ISO-8859-1"));
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
