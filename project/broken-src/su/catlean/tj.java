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
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

public final class tj extends ObservableProperty {
final boolean V;
private static final long a = yz.a(6668080068571059943L, 7749815741287337053L, MethodHandles.lookup().lookupClass()).a(113621188021678L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public tj(Object var1, boolean var2) {
super(var1);
this.V = var2;
}

@Override
protected void afterChange(KProperty property, Object oldValue, Object newValue) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/tj.a J
// 03: ldc2_w 71523057240649
// 06: lxor
// 07: lstore 4
// 09: lload 4
// 0b: dup2
// 0c: ldc2_w 25920492398621
// 0f: lxor
// 10: dup2
// 11: bipush 32
// 13: lushr
// 14: l2i
// 15: istore 6
// 17: dup2
// 18: bipush 32
// 1a: lshl
// 1b: bipush 40
// 1d: lushr
// 1e: l2i
// 1f: istore 7
// 21: dup2
// 22: bipush 56
// 24: lshl
// 25: bipush 56
// 27: lushr
// 28: l2i
// 29: istore 8
// 2b: pop2
// 2c: dup2
// 2d: ldc2_w 97986804118985
// 30: lxor
// 31: lstore 9
// 33: dup2
// 34: ldc2_w 115590671706670
// 37: lxor
// 38: lstore 11
// 3a: pop2
// 3b: ldc2_w -4242335128441405452
// 3e: lload 4
// 40: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: aload 1
// 46: sipush 21830
// 49: ldc2_w 8182689123882975841
// 4c: lload 4
// 4e: lxor
// 4f: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/tj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 57: aload 2
// 58: aload 3
// 59: astore 14
// 5b: astore 15
// 5d: bipush 0
// 5e: istore 16
// 60: astore 13
// 62: aload 13
// 64: ifnull f6
// 67: aload 15
// 69: aload 14
// 6b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6e: ifne f5
// 71: goto 7f
// 74: ldc2_w -4238001027952575689
// 77: lload 4
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: aload 0
// 80: getfield su/catlean/tj.V Z
// 83: ifeq d5
// 86: goto 94
// 89: ldc2_w -4238001027952575689
// 8c: lload 4
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: getstatic su/catlean/os.D Lsu/catlean/os;
// 97: aload 14
// 99: sipush 27186
// 9c: ldc2_w 5726412575679216916
// 9f: lload 4
// a1: lxor
// a2: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/tj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// aa: aload 14
// ac: checkcast java/lang/Long
// af: invokevirtual java/lang/Long.longValue ()J
// b2: iload 6
// b4: dup_x2
// b5: pop
// b6: iload 7
// b8: dup_x2
// b9: pop
// ba: iload 8
// bc: i2b
// bd: dup_x2
// be: pop
// bf: invokevirtual su/catlean/os.w (IIBJ)V
// c2: aload 13
// c4: ifnonnull f5
// c7: goto d5
// ca: ldc2_w -4238001027952575689
// cd: lload 4
// cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d4: athrow
// d5: getstatic su/catlean/os.D Lsu/catlean/os;
// d8: getstatic su/catlean/os.D Lsu/catlean/os;
// db: lload 9
// dd: invokevirtual su/catlean/os.u (J)Lsu/catlean/yq;
// e0: lload 11
// e2: dup2_x1
// e3: pop2
// e4: invokevirtual su/catlean/os.A (JLsu/catlean/yq;)V
// e7: goto f5
// ea: ldc2_w -4238001027952575689
// ed: lload 4
// ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f4: athrow
// f5: nop
// f6: return
}

static {
long var0 = a ^ 25818277712831L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[2];
int var7 = 0;
String var6 = "sÍ\u0005ç¨B'\u008có$\u0012#\u001c\u000f+å®4ó.C¢ÛpX¨5\u0086½\u0013\u0099ÏÉ\u0001û\u000eßEP\u0086,ý=Ó[wÉu\nV<\u0017±Ø\u009d&\u008e¾\u009ax,<# ñënä,à®c\u0095-ê \u0004\u0092\u0082\u0007\u001b±\u000e3ç÷a±5\u008f_DÅo;üKø©\u0080Z~¦é¯l,ã\\ïÃ%º";
int var8 = "sÍ\u0005ç¨B'\u008có$\u0012#\u001c\u000f+å®4ó.C¢ÛpX¨5\u0086½\u0013\u0099ÏÉ\u0001û\u000eßEP\u0086,ý=Ó[wÉu\nV<\u0017±Ø\u009d&\u008e¾\u009ax,<# ñënä,à®c\u0095-ê \u0004\u0092\u0082\u0007\u001b±\u000e3ç÷a±5\u008f_DÅo;üKø©\u0080Z~¦é¯l,ã\\ïÃ%º"
.length();
char var5 = 24;
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
b = var9;
c = new String[2];
return;
}

var5 = var6.charAt(var4);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21352;
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
throw new RuntimeException("su/catlean/tj", var10);
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
throw new RuntimeException("su/catlean/tj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
