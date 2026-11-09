package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;

public final class bq implements n5 {
public static final bq O;
private static final long a = yz.a(1431061559134902667L, 4073669698222776954L, MethodHandles.lookup().lookupClass()).a(157623333199920L);
private static final String b;

@Override
public final boolean b(class_1799 it) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/bq.a J
// 03: ldc2_w 97954125228597
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 49957463800879
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 97262075997865
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -5589518386797259818
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: aload 1
// 22: getstatic su/catlean/bq.b Ljava/lang/String;
// 25: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 28: astore 8
// 2a: aload 1
// 2b: lload 6
// 2d: invokestatic su/catlean/xa.N (Lnet/minecraft/class_1799;J)Z
// 30: aload 8
// 32: ifnonnull c0
// 35: ifne bf
// 38: goto 45
// 3b: ldc2_w -5559055620104927976
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: aload 1
// 46: lload 4
// 48: invokestatic su/catlean/xa.K (Lnet/minecraft/class_1799;J)Z
// 4b: aload 8
// 4d: ifnonnull c0
// 50: goto 5d
// 53: ldc2_w -5559055620104927976
// 56: lload 2
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: ifne bf
// 60: goto 6d
// 63: ldc2_w -5559055620104927976
// 66: lload 2
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: aload 1
// 6e: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 71: instanceof net/minecraft/class_1743
// 74: aload 8
// 76: ifnonnull c0
// 79: goto 86
// 7c: ldc2_w -5559055620104927976
// 7f: lload 2
// 80: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85: athrow
// 86: ifne bf
// 89: goto 96
// 8c: ldc2_w -5559055620104927976
// 8f: lload 2
// 90: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95: athrow
// 96: aload 1
// 97: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 9a: instanceof net/minecraft/class_1821
// 9d: aload 8
// 9f: ifnonnull c0
// a2: goto af
// a5: ldc2_w -5559055620104927976
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: ifeq c3
// b2: goto bf
// b5: ldc2_w -5559055620104927976
// b8: lload 2
// b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// be: athrow
// bf: bipush 1
// c0: goto c4
// c3: bipush 0
// c4: ireturn
}

static {
long var0 = a ^ 34232849440871L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var4 = var2.doFinal("\"|eï÷-\u0004\u0011".getBytes("ISO-8859-1"));
String var5 = a(var4).intern();
byte var10001 = -1;
b = var5;
O = new bq();
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
