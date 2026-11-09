package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class i2 {
private static final long a = yz.a(3592788078923359961L, -4735214856617635988L, MethodHandles.lookup().lookupClass()).a(221867716947086L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public static final boolean t(@NotNull os $this$saveDraft, @NotNull Function1 block, long a) {
ax = a ^ ax;
long var4 = ax ^ 124017107795251L;
Intrinsics.checkNotNullParameter($this$saveDraft, a<"m">(18253, 2800883291017970060L ^ ax));
Intrinsics.checkNotNullParameter(block, a<"m">(32503, 1610517791044089908L ^ ax));
List var10000 = o.G.z();
ov var6 = new ov(null, var4, null, null, null, null, null, null, (int)e, null);
block.invoke(var6);
return var10000.add(var6);
}

public static final void g(@NotNull os $this$setDraft, @NotNull Object draftId, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/i2.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 88317033781106
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w -1224560914435969785
// 012: lload 2
// 013: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 0
// 019: sipush 8936
// 01c: ldc2_w 6866157671723706623
// 01f: lload 2
// 020: lxor
// 021: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/i2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: aload 1
// 02a: sipush 29234
// 02d: ldc2_w 2318483060001699876
// 030: lload 2
// 031: lxor
// 032: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/i2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03a: getstatic su/catlean/o.G Lsu/catlean/o;
// 03d: invokevirtual su/catlean/o.z ()Ljava/util/List;
// 040: checkcast java/lang/Iterable
// 043: astore 7
// 045: astore 6
// 047: bipush 0
// 048: istore 8
// 04a: aload 7
// 04c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 051: astore 9
// 053: aload 9
// 055: invokeinterface java/util/Iterator.hasNext ()Z 1
// 05a: ifeq 08c
// 05d: aload 9
// 05f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 064: astore 10
// 066: aload 10
// 068: checkcast su/catlean/ov
// 06b: astore 11
// 06d: bipush 0
// 06e: istore 12
// 070: aload 11
// 072: invokevirtual su/catlean/ov.o ()Ljava/lang/Object;
// 075: aload 1
// 076: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 079: ifeq 053
// 07c: aload 10
// 07e: aload 6
// 080: lload 2
// 081: lconst_0
// 082: lcmp
// 083: iflt 076
// 086: ifnull 075
// 089: goto 08d
// 08c: aconst_null
// 08d: checkcast su/catlean/ov
// 090: aload 6
// 092: ifnull 125
// 095: dup
// 096: ifnull 116
// 099: goto 0a6
// 09c: ldc2_w -1206759969854332425
// 09f: lload 2
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: astore 9
// 0a8: bipush 0
// 0a9: istore 10
// 0ab: getstatic su/catlean/os.D Lsu/catlean/os;
// 0ae: astore 11
// 0b0: aload 11
// 0b2: astore 12
// 0b4: bipush 0
// 0b5: istore 13
// 0b7: aload 12
// 0b9: aload 9
// 0bb: invokevirtual su/catlean/ov.D ()Ljava/lang/String;
// 0be: invokevirtual su/catlean/os.h (Ljava/lang/String;)V
// 0c1: aload 12
// 0c3: aload 9
// 0c5: invokevirtual su/catlean/ov.W ()Ljava/lang/String;
// 0c8: invokevirtual su/catlean/os.W (Ljava/lang/String;)V
// 0cb: aload 12
// 0cd: aload 9
// 0cf: invokevirtual su/catlean/ov.j ()Lkotlin/Pair;
// 0d2: invokevirtual su/catlean/os.U (Lkotlin/Pair;)V
// 0d5: aload 12
// 0d7: aload 9
// 0d9: invokevirtual su/catlean/ov.V ()Lkotlin/Pair;
// 0dc: invokevirtual su/catlean/os.g (Lkotlin/Pair;)V
// 0df: aload 12
// 0e1: aload 9
// 0e3: invokevirtual su/catlean/ov.Z ()Lkotlin/Pair;
// 0e6: invokevirtual su/catlean/os.G (Lkotlin/Pair;)V
// 0e9: aload 12
// 0eb: aload 9
// 0ed: invokevirtual su/catlean/ov.R ()Lkotlin/Pair;
// 0f0: lload 4
// 0f2: invokevirtual su/catlean/os.Z (Lkotlin/Pair;J)V
// 0f5: nop
// 0f6: lload 2
// 0f7: lconst_0
// 0f8: lcmp
// 0f9: ifle 150
// 0fc: aload 6
// 0fe: ifnull 150
// 101: aload 11
// 103: nop
// 104: nop
// 105: dup
// 106: ifnonnull 14f
// 109: goto 116
// 10c: ldc2_w -1206759969854332425
// 10f: lload 2
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: pop
// 117: aload 1
// 118: goto 125
// 11b: ldc2_w -1206759969854332425
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: sipush 30731
// 128: ldc2_w 5029172252100522521
// 12b: lload 2
// 12c: lxor
// 12d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/i2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: swap
// 133: sipush 27410
// 136: ldc2_w 8179151986066645250
// 139: lload 2
// 13a: lxor
// 13b: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/i2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 145: getstatic java/lang/System.out Ljava/io/PrintStream;
// 148: swap
// 149: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
// 14c: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 14f: pop
// 150: lload 2
// 151: lconst_0
// 152: lcmp
// 153: ifle 16f
// 156: ldc2_w -1207877419795484243
// 159: lload 2
// 15a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: ifnull 17c
// 162: bipush 2
// 163: anewarray 7
// 166: ldc2_w -1158807433754686973
// 169: lload 2
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: goto 17c
// 172: ldc2_w -1206759969854332425
// 175: lload 2
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: return
}

static {
long var5 = a ^ 90147310448611L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[6];
int var12 = 0;
String var11 = "\u0090\u0092yuD\"û6jÜ\u0088x}¶\u0003;7m¯\u0080q\u0089&\u0092\f»÷\u0083§(2¯ï*\u0012~ë8o\u000fu]½»3ÁJ\u0004\u0010ñÞ\u001cx&\u0099ó¡M}\u0013ký\u001fÐ=\u0018 >Áê\nËÍ~N\u0001¿~Tf\u0083?³þ\u0015;N[VV\u0010\u009c¢qN¥oÄU$þ\u0019Páøvp";
int var13 = "\u0090\u0092yuD\"û6jÜ\u0088x}¶\u0003;7m¯\u0080q\u0089&\u0092\f»÷\u0083§(2¯ï*\u0012~ë8o\u000fu]½»3ÁJ\u0004\u0010ñÞ\u001cx&\u0099ó¡M}\u0013ký\u001fÐ=\u0018 >Áê\nËÍ~N\u0001¿~Tf\u0083?³þ\u0015;N[VV\u0010\u009c¢qN¥oÄU$þ\u0019Páøvp"
.length();
char var10 = '0';
int var17 = -1;

label37:
while (true) {
String var18 = var11.substring(++var17, var17 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var26;
if ((var17 += var10) >= var13) {
b = var14;
c = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -8643525047029816439L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var30;
return;
}

var10 = var11.charAt(var17);
break;
default:
var14[var12++] = var26;
if ((var17 += var10) < var13) {
var10 = var11.charAt(var17);
continue label37;
}

var11 = "\u001eÌF\u0083\u001dE\tÙ-\u0016(áØfßL\u0010evÙÉF\u000fC\u0088·BOå\u0085\u0013í5";
var13 = "\u001eÌF\u0083\u001dE\tÙ-\u0016(áØfßL\u0010evÙÉF\u000fC\u0088·BOå\u0085\u0013í5".length();
var10 = 16;
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25727;
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
throw new RuntimeException("su/catlean/i2", var10);
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
throw new RuntimeException("su/catlean/i2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
