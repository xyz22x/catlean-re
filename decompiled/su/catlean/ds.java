package su.catlean;

import com.mojang.authlib.GameProfile;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_640;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ds {
@NotNull
private final GameProfile j;
private boolean s;
@NotNull
private final class_640 O;
@Nullable
private String C;
private static final long a = yz.a(-3279992337355112609L, -973474538662296766L, MethodHandles.lookup().lookupClass()).a(264759766636695L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public ds(@NotNull GameProfile profile, long a, boolean announced) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(profile, a<"n">(24687, 7458061729447799830L ^ ax));
super();
this.j = profile;
this.s = announced;
this.O = new class_640(this.j, false);
}

@NotNull
public final GameProfile V() {
return this.j;
}

public final boolean T() {
return this.s;
}

public final void g(boolean <set-?>) {
this.s = <set-?>;
}

@NotNull
public final class_640 o() {
return this.O;
}

@Nullable
public final String L(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ds.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 55077127270122
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w 2229353166595513817
// 11: lload 1
// 12: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: astore 5
// 19: aload 0
// 1a: getfield su/catlean/ds.C Ljava/lang/String;
// 1d: aload 5
// 1f: ifnull 57
// 22: ifnonnull 53
// 25: goto 32
// 28: ldc2_w 2288650476146035495
// 2b: lload 1
// 2c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: athrow
// 32: aload 0
// 33: getstatic su/catlean/s7.r Lsu/catlean/s7;
// 36: aload 0
// 37: getfield su/catlean/ds.O Lnet/minecraft/class_640;
// 3a: lload 3
// 3b: dup2_x1
// 3c: pop2
// 3d: invokevirtual su/catlean/s7.g (JLnet/minecraft/class_640;)Lnet/minecraft/class_5250;
// 40: invokevirtual net/minecraft/class_5250.getString ()Ljava/lang/String;
// 43: putfield su/catlean/ds.C Ljava/lang/String;
// 46: goto 53
// 49: ldc2_w 2288650476146035495
// 4c: lload 1
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: aload 0
// 54: getfield su/catlean/ds.C Ljava/lang/String;
// 57: areturn
}

private final String h(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ds.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 72251169523138
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 3
// 012: dup2
// 013: bipush 32
// 015: lshl
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 4
// 01c: dup2
// 01d: bipush 48
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 5
// 026: pop2
// 027: dup2
// 028: ldc2_w 24627378458106
// 02b: lxor
// 02c: lstore 6
// 02e: pop2
// 02f: ldc2_w -2752181980020499737
// 032: lload 1
// 033: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: aload 0
// 039: getfield su/catlean/ds.j Lcom/mojang/authlib/GameProfile;
// 03c: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 03f: astore 9
// 041: astore 8
// 043: getstatic su/catlean/s7.r Lsu/catlean/s7;
// 046: aload 9
// 048: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 04b: iload 3
// 04c: aload 9
// 04e: iload 4
// 050: iload 5
// 052: i2s
// 053: invokevirtual su/catlean/s7.q (ILjava/lang/String;IS)Lnet/minecraft/class_1657;
// 056: astore 10
// 058: aload 8
// 05a: ifnull 081
// 05d: aload 10
// 05f: ifnull 09b
// 062: goto 06f
// 065: ldc2_w -2811122968346604519
// 068: lload 1
// 069: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: athrow
// 06f: aload 0
// 070: bipush 0
// 071: putfield su/catlean/ds.s Z
// 074: goto 081
// 077: ldc2_w -2811122968346604519
// 07a: lload 1
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: getstatic net/minecraft/class_124.field_1054 Lnet/minecraft/class_124;
// 084: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
// 087: sipush 5360
// 08a: ldc2_w 8501697206033289251
// 08d: lload 1
// 08e: lxor
// 08f: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ds.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: swap
// 095: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 09a: areturn
// 09b: lload 6
// 09d: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 0a0: aload 9
// 0a2: invokevirtual net/minecraft/class_634.method_2874 (Ljava/lang/String;)Lnet/minecraft/class_640;
// 0a5: astore 11
// 0a7: aload 8
// 0a9: lload 1
// 0aa: lconst_0
// 0ab: lcmp
// 0ac: iflt 11a
// 0af: ifnull 101
// 0b2: lload 6
// 0b4: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 0b7: invokevirtual net/minecraft/class_634.method_2880 ()Ljava/util/Collection;
// 0ba: invokeinterface java/util/Collection.stream ()Ljava/util/stream/Stream; 1
// 0bf: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/ds.U (Lnet/minecraft/class_640;)Ljava/lang/String;, (Lnet/minecraft/class_640;)Ljava/lang/String; ]
// 0c4: invokedynamic apply (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/ds.t (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;, (Ljava/lang/Object;)Ljava/lang/String; ]
// 0c9: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
// 0ce: aload 9
// 0d0: invokedynamic invoke (Ljava/lang/String;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/ds.x (Ljava/lang/String;Ljava/lang/String;)Z, (Ljava/lang/String;)Ljava/lang/Boolean; ]
// 0d5: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/ds.s (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 0da: invokeinterface java/util/stream/Stream.noneMatch (Ljava/util/function/Predicate;)Z 2
// 0df: ifeq 11b
// 0e2: goto 0ef
// 0e5: ldc2_w -2811122968346604519
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: aload 0
// 0f0: bipush 1
// 0f1: putfield su/catlean/ds.s Z
// 0f4: goto 101
// 0f7: ldc2_w -2811122968346604519
// 0fa: lload 1
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: getstatic net/minecraft/class_124.field_1061 Lnet/minecraft/class_124;
// 104: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
// 107: sipush 26389
// 10a: ldc2_w 5586005584601998276
// 10d: lload 1
// 10e: lxor
// 10f: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ds.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: swap
// 115: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 11a: areturn
// 11b: aload 11
// 11d: lload 1
// 11e: lconst_0
// 11f: lcmp
// 120: ifle 13a
// 123: aload 8
// 125: ifnull 13a
// 128: ifnull 16c
// 12b: goto 138
// 12e: ldc2_w -2811122968346604519
// 131: lload 1
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: aload 11
// 13a: invokevirtual net/minecraft/class_640.method_2958 ()Lnet/minecraft/class_1934;
// 13d: getstatic net/minecraft/class_1934.field_9219 Lnet/minecraft/class_1934;
// 140: if_acmpne 16c
// 143: aload 0
// 144: bipush 0
// 145: putfield su/catlean/ds.s Z
// 148: getstatic net/minecraft/class_124.field_1054 Lnet/minecraft/class_124;
// 14b: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
// 14e: sipush 19407
// 151: ldc2_w 9081138258123247389
// 154: lload 1
// 155: lxor
// 156: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/ds.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: swap
// 15c: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 161: areturn
// 162: ldc2_w -2811122968346604519
// 165: lload 1
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: aload 0
// 16d: bipush 0
// 16e: putfield su/catlean/ds.s Z
// 171: ldc ""
// 173: areturn
}

@NotNull
public final String W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 66846207326957L;
long var5 = var1 ^ 58537418292691L;
return this.h(var3) + " " + this.L(var5);
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ds.a J
// 03: ldc2_w 100604162882805
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -1369015488208982487
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -1426818417579755305
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -1426818417579755305
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: ifnull 80
// 3a: aload 0
// 3b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
// 3e: aload 1
// 3f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
// 42: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 45: aload 4
// 47: ifnull 81
// 4a: goto 57
// 4d: ldc2_w -1426818417579755305
// 50: lload 2
// 51: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56: athrow
// 57: ifeq 80
// 5a: goto 67
// 5d: ldc2_w -1426818417579755305
// 60: lload 2
// 61: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66: athrow
// 67: aload 1
// 68: checkcast su/catlean/ds
// 6b: astore 5
// 6d: aload 0
// 6e: getfield su/catlean/ds.j Lcom/mojang/authlib/GameProfile;
// 71: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 74: aload 5
// 76: getfield su/catlean/ds.j Lcom/mojang/authlib/GameProfile;
// 79: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 7c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 7f: ireturn
// 80: bipush 0
// 81: ireturn
}

@Override
public int hashCode() {
return this.getClass().hashCode();
}

private static final String U(class_640 var0) {
return var0.method_2966().name();
}

private static final String t(Function1 var0, Object var1) {
return (String)var0.invoke(var1);
}

private static final boolean x(String var0, String var1) {
return var1.equals(var0);
}

private static final boolean s(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var0 = a ^ 116410610585899L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[4];
int var7 = 0;
String var6 = "!ãÔíb\u009ae«\u000b{ú8U°\u009eË\u00103\u007f\u0014E²ªá½ìÉdÃ0½Íþ";
int var8 = "!ãÔíb\u009ae«\u000b{ú8U°\u009eË\u00103\u007f\u0014E²ªá½ìÉdÃ0½Íþ".length();
char var5 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[4];
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "§9e;,\u009c\u0099è\u009a»¬ºZvi\u0080\u00103Î\u0002¼Î\u009bÉpø\u008dÅ÷¬5Ã2";
var8 = "§9e;,\u009c\u0099è\u009a»¬ºZvi\u0080\u00103Î\u0002¼Î\u009bÉpø\u008dÅ÷¬5Ã2".length();
var5 = 16;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24032;
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
throw new RuntimeException("su/catlean/ds", var10);
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
throw new RuntimeException("su/catlean/ds" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
