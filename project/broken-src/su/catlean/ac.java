package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

public final class ac extends a3 {
@NotNull
public static final ac P;
private static final long b = yz.a(-39453276538997297L, 1984806815644247958L, MethodHandles.lookup().lookupClass()).a(78635923953557L);
private static final String[] g;
private static final String[] h;
private static final Map i = new HashMap(13);

private ac(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 16879188498166L;
super(var3, b<"n">(5786, 8820687711153329814L ^ var1));
}

@Override
public void l(@NotNull LiteralArgumentBuilder builder, long a) {
long var4 = a ^ 131983109906692L;
long var6 = a ^ 61473902788714L;
Intrinsics.checkNotNullParameter(builder, b<"n">(2988, 905037341048816256L ^ a));
builder.then(this.c(var4, b<"n">(1920, 2577082276363226795L ^ a)).executes(ac::V));
builder.then(this.c(var4, b<"n">(22136, 7550560090439098194L ^ a)).executes(ac::Y));
builder.then(this.c(var4, b<"n">(957, 8545617742359775900L ^ a)).executes(ac::I));
int[] var10000 = vm.a<"Å">(-3718159434087536429L, a);
LiteralArgumentBuilder var10002 = this.c(var4, b<"n">(1979, 4619991137248562845L ^ a));
String var10004 = b<"n">(531, 4347464218898844467L ^ a);
StringArgumentType var10005 = StringArgumentType.word();
Intrinsics.checkNotNullExpressionValue(var10005, b<"n">(29758, 5809976791870455057L ^ a));
builder.then(var10002.then(this.j(var10004, (ArgumentType)var10005, var6).executes(ac::T)));
builder.then(this.c(var4, b<"n">(10606, 5250496695585988684L ^ a)).then(this.j(b<"n">(32367, 3776424001453111112L ^ a), n.I.H(), var6).executes(ac::o)));
builder.then(this.c(var4, b<"n">(3123, 48633694368122112L ^ a)).then(this.j(b<"n">(32367, 3776424001453111112L ^ a), n.I.H(), var6).executes(ac::B)));
int[] var8 = var10000;

try {
builder.executes(ac::n);
if (var8 != null) {
vm.a<"Å">(new _g[3], -3687380158444812562L, a);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -3686642148952809045L, a);
}
}

private static final int V(CommandContext param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ac.b J
// 003: ldc2_w 84655450791494
// 006: lxor
// 007: lstore 1
// 008: lload 1
// 009: dup2
// 00a: ldc2_w 48261372947757
// 00d: lxor
// 00e: lstore 3
// 00f: dup2
// 010: ldc2_w 3999588644618
// 013: lxor
// 014: dup2
// 015: bipush 32
// 017: lushr
// 018: l2i
// 019: istore 5
// 01b: dup2
// 01c: bipush 32
// 01e: lshl
// 01f: bipush 48
// 021: lushr
// 022: l2i
// 023: istore 6
// 025: dup2
// 026: bipush 48
// 028: lshl
// 029: bipush 48
// 02b: lushr
// 02c: l2i
// 02d: istore 7
// 02f: pop2
// 030: dup2
// 031: ldc2_w 121813035834967
// 034: lxor
// 035: lstore 8
// 037: dup2
// 038: ldc2_w 33921579190994
// 03b: lxor
// 03c: lstore 10
// 03e: pop2
// 03f: ldc2_w -7481020265642148709
// 042: lload 1
// 043: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: new java/lang/StringBuilder
// 04b: dup
// 04c: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 04f: iload 5
// 051: sipush 4726
// 054: ldc2_w 8136352403958664983
// 057: lload 1
// 058: lxor
// 059: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ac.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: bipush 0
// 05f: anewarray 199
// 062: iload 6
// 064: swap
// 065: iload 7
// 067: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 06a: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
// 06d: astore 13
// 06f: astore 12
// 071: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 074: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 077: lload 3
// 078: invokevirtual su/catlean/oc.F (J)Ljava/util/List;
// 07b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 080: astore 14
// 082: aload 14
// 084: invokeinterface java/util/Iterator.hasNext ()Z 1
// 089: ifeq 108
// 08c: aload 14
// 08e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 093: checkcast su/catlean/y_
// 096: astore 15
// 098: aload 12
// 09a: ifnonnull 126
// 09d: aload 13
// 09f: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
// 0a2: aload 12
// 0a4: ifnonnull 0e7
// 0a7: goto 0b4
// 0aa: ldc2_w -7449507413180795421
// 0ad: lload 1
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
// 0b7: aload 15
// 0b9: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 0bc: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 0bf: lload 10
// 0c1: invokevirtual su/catlean/oc.i (J)Lsu/catlean/y_;
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c7: ifeq 0ea
// 0ca: goto 0d7
// 0cd: ldc2_w -7449507413180795421
// 0d0: lload 1
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: getstatic net/minecraft/class_124.field_1060 Lnet/minecraft/class_124;
// 0da: goto 0e7
// 0dd: ldc2_w -7449507413180795421
// 0e0: lload 1
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: goto 0ec
// 0ea: ldc ""
// 0ec: invokedynamic makeConcatWithConstants (Ljava/lang/Object;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\n\u0001" ]
// 0f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 0f4: aload 15
// 0f6: invokevirtual su/catlean/y_.q ()Ljava/lang/String;
// 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 0fc: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
// 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
// 102: pop
// 103: aload 12
// 105: ifnull 082
// 108: getstatic su/catlean/ac.P Lsu/catlean/ac;
// 10b: aload 13
// 10d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
// 110: dup
// 111: sipush 4362
// 114: ldc2_w 8176617340615593057
// 117: lload 1
// 118: lxor
// 119: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ac.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 121: lload 8
// 123: invokevirtual su/catlean/ac.a (Ljava/lang/String;J)V
// 126: bipush 1
// 127: ireturn
}

private static final int Y(CommandContext param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ac.b J
// 03: ldc2_w 56919802187027
// 06: lxor
// 07: lstore 1
// 08: ldc2_w 827374316149747662
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 3
// 12: nop
// 13: invokestatic net/minecraft/class_156.method_668 ()Lnet/minecraft/class_156$class_158;
// 16: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 19: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 1c: invokevirtual su/catlean/oc.U ()Ljava/io/File;
// 1f: astore 4
// 21: aload 4
// 23: astore 5
// 25: astore 7
// 27: bipush 0
// 28: istore 6
// 2a: aload 3
// 2b: ifnonnull 5d
// 2e: aload 5
// 30: invokevirtual java/io/File.exists ()Z
// 33: ifne 56
// 36: goto 43
// 39: ldc2_w 849904075129333430
// 3c: lload 1
// 3d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: athrow
// 43: aload 5
// 45: invokevirtual java/io/File.createNewFile ()Z
// 48: pop
// 49: goto 56
// 4c: ldc2_w 849904075129333430
// 4f: lload 1
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: aload 7
// 58: aload 4
// 5a: invokevirtual net/minecraft/class_156$class_158.method_672 (Ljava/io/File;)V
// 5d: goto 67
// 60: astore 4
// 62: aload 4
// 64: invokevirtual java/lang/Exception.printStackTrace ()V
// 67: bipush 1
// 68: ireturn
}

private static final int I(CommandContext var0) {
long var1 = b ^ 4873399084170L;
long var3 = var1 ^ 75734562391022L;
long var5 = var1 ^ 10550238799169L;
int[] var10000 = vm.a<"Å">(-6709700282172012969L, var1);
Iterator var10001 = iq.a.L().iterator();
Intrinsics.checkNotNullExpressionValue(var10001, b<"n">(9522, 4459341419750720158L ^ var1));
Iterator var8 = var10001;
int[] var7 = var10000;

label49:
while (var8.hasNext()) {
var10000 = (int[])var8.next();
Intrinsics.checkNotNullExpressionValue(var10000, b<"n">(9943, 4329841334911664481L ^ var1));
_g var9 = (_g)var10000;

while (true) {
_g var15 = var9;
if (var7 == null) {
try {
if (var15.f(var5)) {
var9.d(var3);
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -6750261514041422033L, var1);
}

var15 = var9;
}

Iterator var10 = var15.c().iterator();

while (true) {
if (!var10.hasNext()) {
continue label49;
}

a1 var11 = (a1)var10.next();
var11.A();
if (var7 != null) {
break;
}

try {
if (var7 != null || var7 != null) {
return 1;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -6750261514041422033L, var1);
}
}
}
}

return 1;
}

private static final int T(CommandContext var0) {
long var1 = b ^ 74798542299647L;
long var10001 = var1 ^ 135191098282891L;
int var3 = (int)((var1 ^ 135191098282891L) >>> 48);
int var4 = (int)((var1 ^ 135191098282891L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
var10001 = var1 ^ 12482191476915L;
int var6 = (int)((var1 ^ 12482191476915L) >>> 32);
int var7 = (int)((var1 ^ 12482191476915L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
long var9 = var1 ^ 112359702225390L;
String var11 = (String)var0.getArgument(b<"n">(32367, 3776522697477053625L ^ var1), String.class);
Intrinsics.checkNotNull(var11);
io.p(var11, i0.MODULES, (char)var3, var4, (short)var5);
ac var10000 = P;
i4 var14 = i4.h;
String var10003 = b<"n">(20944, 3077405209636401935L ^ var1);
Object[] var12 = new Object[]{var11};
var10000.a(var14.E(var6, var10003, var7, var12, var8), var9);
return 1;
}

private static final int o(CommandContext var0) {
long var1 = b ^ 78245639561400L;
long var10001 = var1 ^ 9297053403636L;
int var3 = (int)((var1 ^ 9297053403636L) >>> 32);
int var4 = (int)((var1 ^ 9297053403636L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 111180985491625L;
var10001 = var1 ^ 39375024504732L;
int var8 = (int)((var1 ^ 39375024504732L) >>> 32);
int var9 = (int)((var1 ^ 39375024504732L) << 32 >>> 48);
int var10 = (int)(var10001 << 48 >>> 48);
String var11 = (String)var0.getArgument(b<"n">(32367, 3776519306684653054L ^ var1), String.class);
Intrinsics.checkNotNull(var11);
io.D(var11, i0.MODULES, var8, (short)var9, var10);
ac var10000 = P;
i4 var14 = i4.h;
String var10003 = b<"n">(12297, 4671259857392440218L ^ var1);
Object[] var12 = new Object[]{var11};
var10000.a(var14.E(var3, var10003, var4, var12, var5), var6);
return 1;
}

private static final int B(CommandContext var0) {
long var1 = b ^ 121802339360889L;
long var10001 = var1 ^ 36945463232821L;
int var3 = (int)((var1 ^ 36945463232821L) >>> 32);
int var4 = (int)((var1 ^ 36945463232821L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 84597929140328L;
var10001 = var1 ^ 33025876660720L;
int var8 = (int)((var1 ^ 33025876660720L) >>> 32);
int var9 = (int)((var1 ^ 33025876660720L) << 32 >>> 56);
int var10 = (int)(var10001 << 40 >>> 40);
String var11 = (String)var0.getArgument(b<"n">(32367, 3776494384710769983L ^ var1), String.class);
Intrinsics.checkNotNull(var11);
io.g(var8, (byte)var9, var11, i0.MODULES, var10);
ac var10000 = P;
i4 var14 = i4.h;
String var10003 = b<"n">(17538, 8059536645493450712L ^ var1);
Object[] var12 = new Object[]{var11};
var10000.a(var14.E(var3, var10003, var4, var12, var5), var6);
return 1;
}

private static final int n(CommandContext var0) {
long var1 = b ^ 13544659655923L;
long var3 = var1 ^ 51016427429090L;
P.a(class_124.field_1061 + b<"n">(2517, 4381681075538171404L ^ var1), var3);
return 1;
}

static {
long var9 = b ^ 124459526698068L;
long var11 = var9 ^ 81754259992733L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[19];
int var5 = 0;
String var4 = "É\fÚÄïëp\u0087nØ¸/¢m¦Ö¡Ï\u0010ø-¸\\À\u0081Ja8²Ûù©\u0010êý9\u0011SÄ\u001fjºäfs\u0099 \u001d\u001f\u0010S,\u0004[×Áª\u001b\u0015ÔJja\u0006W\u0095\u0010\u009fqXë÷\u0083ær \u0087ã>\u000bx»Y\u0010ß?ÖÓøh\u001cøn¸ø.h\\\u0085%\u0010Ü!zwwxSÂZ\u0004P\u001dOø\u0011i(2ô\u009b¹¬\u001eéò\u0091 ÞìlÏZz\u008fR6Kè5&V0\u009d\u0003#´øDÇ\u0013æ\u0081\nì\u0099{J@ \rÝ\u009eæ8Ìªd+XÀ(w>¨D<¶\u0001jñ\u0000¤Á3ê\u0099ù\u0098ý\u001e@÷!|«*c\u008e¯\u0085\fnñ\u0000`ñµ)\u008csàñ\u0005Ìãì\u0001\u0083r\u001d\u0016\u0096\u0010ÖÛ«Ï/úÊ7Ii\u001aîÖ¹Ñ\u000e\u0010ÝqþYEý:(n½þÓ±¦¹»(ùÔo/Y\u009c\u0082ôP¨¾[\fÙ-Ö.\u0014\u009c©±s°[î©×0ýðé\u0002ö\u0017¢j\u0097ìBF Â\u00ad\u009f\t\u009cEù\u0097¥«\u0010¶\u008c\u0089¨%¯v'Ð\u0080\u009b\u009dmnoî§\u001aevÞ\u0018gy\u009a\u0094+qtí\u0007Ýõÿ\u009e\u0015üò¢|\u0095\u0083W\\\u009b\u0098([ªjéÒ\u0011*Û\u008c1\tÎëS·\u008b¼%pd\u009dÐ®U1Õ\u0090¶Êº¦!\u009a\u00045[\\Å4²(\u0015\u001eÇ\u0017ü\u008fz°Æ£\u0082IµÞ\u0019Ñ¥oÌ©\u008c[¦\u0005Ê0\u0095\u0015ôóWS0ïrñ\u0096¹\u0084ª\u0010§+æ×0.\u008c\u0016U@ÅèF³j\u0004\u0010<u\u000f\u0089\u0093ÜþÖ=±¶÷°\u008a¶\f";
int var6 = "É\fÚÄïëp\u0087nØ¸/¢m¦Ö¡Ï\u0010ø-¸\\À\u0081Ja8²Ûù©\u0010êý9\u0011SÄ\u001fjºäfs\u0099 \u001d\u001f\u0010S,\u0004[×Áª\u001b\u0015ÔJja\u0006W\u0095\u0010\u009fqXë÷\u0083ær \u0087ã>\u000bx»Y\u0010ß?ÖÓøh\u001cøn¸ø.h\\\u0085%\u0010Ü!zwwxSÂZ\u0004P\u001dOø\u0011i(2ô\u009b¹¬\u001eéò\u0091 ÞìlÏZz\u008fR6Kè5&V0\u009d\u0003#´øDÇ\u0013æ\u0081\nì\u0099{J@ \rÝ\u009eæ8Ìªd+XÀ(w>¨D<¶\u0001jñ\u0000¤Á3ê\u0099ù\u0098ý\u001e@÷!|«*c\u008e¯\u0085\fnñ\u0000`ñµ)\u008csàñ\u0005Ìãì\u0001\u0083r\u001d\u0016\u0096\u0010ÖÛ«Ï/úÊ7Ii\u001aîÖ¹Ñ\u000e\u0010ÝqþYEý:(n½þÓ±¦¹»(ùÔo/Y\u009c\u0082ôP¨¾[\fÙ-Ö.\u0014\u009c©±s°[î©×0ýðé\u0002ö\u0017¢j\u0097ìBF Â\u00ad\u009f\t\u009cEù\u0097¥«\u0010¶\u008c\u0089¨%¯v'Ð\u0080\u009b\u009dmnoî§\u001aevÞ\u0018gy\u009a\u0094+qtí\u0007Ýõÿ\u009e\u0015üò¢|\u0095\u0083W\\\u009b\u0098([ªjéÒ\u0011*Û\u008c1\tÎëS·\u008b¼%pd\u009dÐ®U1Õ\u0090¶Êº¦!\u009a\u00045[\\Å4²(\u0015\u001eÇ\u0017ü\u008fz°Æ£\u0082IµÞ\u0019Ñ¥oÌ©\u008c[¦\u0005Ê0\u0095\u0015ôóWS0ïrñ\u0096¹\u0084ª\u0010§+æ×0.\u008c\u0016U@ÅèF³j\u0004\u0010<u\u000f\u0089\u0093ÜþÖ=±¶÷°\u008a¶\f"
.length();
char var3 = ' ';
int var14 = -1;

label27:
while (true) {
String var15 = var4.substring(++var14, var14 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
String var21 = b(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var21;
if ((var14 += var3) >= var6) {
g = var7;
h = new String[19];
P = new ac(var11);
return;
}

var3 = var4.charAt(var14);
break;
default:
var7[var5++] = var21;
if ((var14 += var3) < var6) {
var3 = var4.charAt(var14);
continue label27;
}

var4 = "j\u0091ìÐí\u001f\u0002\ro\u0016\u0091þ¬\u0086r\u009a[W\u001c´\u0084\u007f\u0000>w\u000b\u009füzv@\u000e\u0010\u0099±\n½Îká§ª\u0085ñÁTõ\rê";
var6 = "j\u0091ìÐí\u001f\u0002\ro\u0016\u0091þ¬\u0086r\u009a[W\u001c´\u0084\u007f\u0000>w\u000b\u009füzv@\u000e\u0010\u0099±\n½Îká§ª\u0085ñÁTõ\rê".length();
var3 = ' ';
var14 = -1;
}

var15 = var4.substring(++var14, var14 + var3);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1239;
if (h[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ac", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = g[var5].getBytes("ISO-8859-1");
h[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return h[var5];
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
throw new RuntimeException("su/catlean/ac" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
