package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class s1 extends class_437 {
@NotNull
public static final s1 d;
@NotNull
private static Set G;
@Nullable
private static f6 L;
@Nullable
private static i8 T;
private static final long a = yz.a(841528641852823978L, 3006050852065778642L, MethodHandles.lookup().lookupClass()).a(229985054087224L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long f;

private s1(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
super(class_2561.method_30163(a<"j">(8435, 2968727802654088895L ^ var4)));
}

@NotNull
public final Set r() {
return G;
}

public final void s(@NotNull Set <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"j">(19403, 8936442160946783844L ^ ax));
G = <set-?>;
}

@Nullable
public final f6 E() {
return L;
}

public final void j(@Nullable f6 <set-?>) {
L = <set-?>;
}

@Nullable
public final i8 u() {
return T;
}

public final void a(@Nullable i8 <set-?>) {
T = <set-?>;
}

protected void method_25426() {
long var1 = a ^ 105657866734956L;
Iterable var4 = G;
int[] var10000 = vm.a<"Å">(2767205651690551928L, var1);
boolean var5 = false;
int[] var3 = var10000;

for (Object var7 : var4) {
i8 var8 = (i8)var7;
boolean var9 = false;

try {
var8.D();
if (var3 == null && var3 == null) {
continue;
}
break;
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 2810166546091595203L, var1);
}
}
}

public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/s1.a J
// 03: ldc2_w 22652926162405
// 06: lxor
// 07: lstore 5
// 09: lload 5
// 0b: dup2
// 0c: ldc2_w 105386315694720
// 0f: lxor
// 10: lstore 7
// 12: dup2
// 13: ldc2_w 127616886644673
// 16: lxor
// 17: lstore 9
// 19: dup2
// 1a: ldc2_w 78984872468462
// 1d: lxor
// 1e: lstore 11
// 20: pop2
// 21: ldc2_w -6994544993222835471
// 24: lload 5
// 26: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b: aload 1
// 2c: sipush 9936
// 2f: ldc2_w 7266858375395331170
// 32: lload 5
// 34: lxor
// 35: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/s1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 3d: astore 13
// 3f: aload 13
// 41: ifnonnull 83
// 44: lload 7
// 46: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 49: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 4c: ifnonnull 74
// 4f: goto 5d
// 52: ldc2_w -7028215662304989878
// 55: lload 5
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: aload 0
// 5e: aload 1
// 5f: iload 2
// 60: iload 3
// 61: fload 4
// 63: invokevirtual su/catlean/s1.method_25420 (Lnet/minecraft/class_332;IIF)V
// 66: goto 74
// 69: ldc2_w -7028215662304989878
// 6c: lload 5
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: getstatic su/catlean/tm.R Lsu/catlean/tm;
// 77: aload 1
// 78: iload 2
// 79: iload 3
// 7a: lload 11
// 7c: invokevirtual su/catlean/tm.N (Lnet/minecraft/class_332;IIJ)V
// 7f: aconst_null
// 80: putstatic su/catlean/s1.L Lsu/catlean/f6;
// 83: getstatic su/catlean/s1.G Ljava/util/Set;
// 86: checkcast java/lang/Iterable
// 89: astore 14
// 8b: bipush 0
// 8c: istore 15
// 8e: aload 14
// 90: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 95: astore 16
// 97: aload 16
// 99: invokeinterface java/util/Iterator.hasNext ()Z 1
// 9e: ifeq d7
// a1: aload 16
// a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// a8: astore 17
// aa: aload 17
// ac: checkcast su/catlean/i8
// af: astore 18
// b1: bipush 0
// b2: istore 19
// b4: aload 18
// b6: aload 1
// b7: iload 2
// b8: iload 3
// b9: lload 9
// bb: invokevirtual su/catlean/i8.p (Lnet/minecraft/class_332;IIJ)V
// be: nop
// bf: aload 13
// c1: ifnonnull d8
// c4: aload 13
// c6: ifnull 97
// c9: goto d7
// cc: ldc2_w -7028215662304989878
// cf: lload 5
// d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d6: athrow
// d7: nop
// d8: return
}

public boolean method_25421() {
return false;
}

public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/s1.a J
// 003: ldc2_w 64784669240858
// 006: lxor
// 007: lstore 3
// 008: lload 3
// 009: dup2
// 00a: ldc2_w 39160128593138
// 00d: lxor
// 00e: dup2
// 00f: bipush 48
// 011: lushr
// 012: l2i
// 013: istore 5
// 015: dup2
// 016: bipush 16
// 018: lshl
// 019: bipush 32
// 01b: lushr
// 01c: l2i
// 01d: istore 6
// 01f: dup2
// 020: bipush 48
// 022: lshl
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 7
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 134130010175347
// 02e: lxor
// 02f: lstore 8
// 031: pop2
// 032: aload 1
// 033: sipush 8415
// 036: ldc2_w 5398112429977555345
// 039: lload 3
// 03a: lxor
// 03b: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/s1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 043: ldc2_w 365156688104839438
// 046: lload 3
// 047: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: aload 1
// 04d: invokevirtual net/minecraft/class_11909.comp_4798 ()D
// 050: dstore 11
// 052: astore 10
// 054: aload 1
// 055: invokevirtual net/minecraft/class_11909.comp_4799 ()D
// 058: dstore 13
// 05a: aload 1
// 05b: invokevirtual net/minecraft/class_11909.method_74245 ()I
// 05e: istore 15
// 060: getstatic su/catlean/tm.R Lsu/catlean/tm;
// 063: lload 8
// 065: dload 11
// 067: dload 13
// 069: iload 15
// 06b: invokevirtual su/catlean/tm.H (JDDI)Z
// 06e: aload 10
// 070: ifnonnull 084
// 073: ifeq 085
// 076: goto 083
// 079: ldc2_w 399111064540083893
// 07c: lload 3
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: bipush 1
// 084: ireturn
// 085: getstatic su/catlean/s1.G Ljava/util/Set;
// 088: checkcast java/lang/Iterable
// 08b: astore 16
// 08d: bipush 0
// 08e: istore 17
// 090: aload 16
// 092: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 097: astore 18
// 099: aload 18
// 09b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0a0: ifeq 0e3
// 0a3: aload 18
// 0a5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0aa: astore 19
// 0ac: aload 19
// 0ae: checkcast su/catlean/i8
// 0b1: astore 20
// 0b3: bipush 0
// 0b4: istore 21
// 0b6: aload 20
// 0b8: dload 11
// 0ba: d2f
// 0bb: dload 13
// 0bd: d2f
// 0be: iload 5
// 0c0: i2s
// 0c1: iload 15
// 0c3: iload 6
// 0c5: iload 7
// 0c7: i2c
// 0c8: invokevirtual su/catlean/i8.c (FFSIIC)V
// 0cb: nop
// 0cc: aload 10
// 0ce: ifnonnull 0e4
// 0d1: aload 10
// 0d3: ifnull 099
// 0d6: goto 0e3
// 0d9: ldc2_w 399111064540083893
// 0dc: lload 3
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: nop
// 0e4: getstatic su/catlean/s1.L Lsu/catlean/f6;
// 0e7: aload 10
// 0e9: ifnonnull 0ff
// 0ec: ifnull 1e8
// 0ef: goto 0fc
// 0f2: ldc2_w 399111064540083893
// 0f5: lload 3
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: getstatic su/catlean/s1.L Lsu/catlean/f6;
// 0ff: instanceof su/catlean/fz
// 102: aload 10
// 104: ifnonnull 139
// 107: ifeq 1e8
// 10a: goto 117
// 10d: ldc2_w 399111064540083893
// 110: lload 3
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: getstatic su/catlean/s1.G Ljava/util/Set;
// 11a: checkcast java/lang/Iterable
// 11d: astore 16
// 11f: bipush 0
// 120: istore 17
// 122: aload 16
// 124: aload 10
// 126: ifnonnull 178
// 129: instanceof java/util/Collection
// 12c: goto 139
// 12f: ldc2_w 399111064540083893
// 132: lload 3
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: ifeq 176
// 13c: aload 16
// 13e: checkcast java/util/Collection
// 141: aload 10
// 143: ifnonnull 178
// 146: goto 153
// 149: ldc2_w 399111064540083893
// 14c: lload 3
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: invokeinterface java/util/Collection.isEmpty ()Z 1
// 158: ifeq 176
// 15b: goto 168
// 15e: ldc2_w 399111064540083893
// 161: lload 3
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: bipush 1
// 169: goto 1b6
// 16c: ldc2_w 399111064540083893
// 16f: lload 3
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: aload 16
// 178: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 17d: astore 18
// 17f: aload 18
// 181: invokeinterface java/util/Iterator.hasNext ()Z 1
// 186: ifeq 1b5
// 189: aload 18
// 18b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 190: astore 19
// 192: aload 19
// 194: checkcast su/catlean/i8
// 197: astore 20
// 199: bipush 0
// 19a: istore 21
// 19c: aload 20
// 19e: invokevirtual su/catlean/i8.W ()Lsu/catlean/cu;
// 1a1: ifnonnull 1a8
// 1a4: bipush 1
// 1a5: goto 1a9
// 1a8: bipush 0
// 1a9: ifne 17f
// 1ac: bipush 0
// 1ad: aload 10
// 1af: ifnonnull 19a
// 1b2: goto 1b6
// 1b5: bipush 1
// 1b6: ifeq 1e8
// 1b9: getstatic su/catlean/fz.I Lsu/catlean/b;
// 1bc: getstatic su/catlean/s1.L Lsu/catlean/f6;
// 1bf: dup
// 1c0: sipush 2896
// 1c3: ldc2_w 4098588455627749912
// 1c6: lload 3
// 1c7: lxor
// 1c8: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/s1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1d0: checkcast su/catlean/fz
// 1d3: invokevirtual su/catlean/b.A (Lsu/catlean/fz;)V
// 1d6: aload 10
// 1d8: ifnull 1f9
// 1db: goto 1e8
// 1de: ldc2_w 399111064540083893
// 1e1: lload 3
// 1e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: athrow
// 1e8: aconst_null
// 1e9: putstatic su/catlean/s1.L Lsu/catlean/f6;
// 1ec: goto 1f9
// 1ef: ldc2_w 399111064540083893
// 1f2: lload 3
// 1f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f8: athrow
// 1f9: aload 0
// 1fa: aload 1
// 1fb: iload 2
// 1fc: invokespecial net/minecraft/class_437.method_25402 (Lnet/minecraft/class_11909;Z)Z
// 1ff: ireturn
}

public boolean method_25406(@NotNull class_11909 click) {
long var2 = a ^ 61349731353297L;
long var4 = var2 ^ 26231727626260L;
Intrinsics.checkNotNullParameter(click, a<"j">(11084, 1882268375831541446L ^ var2));
double var7 = click.comp_4798();
int[] var10000 = vm.a<"Å">(-6207577438439115323L, var2);
double var9 = click.comp_4799();
int var11 = click.method_74245();
Iterable var12 = G;
boolean var13 = false;
Iterator var14 = var12.iterator();
int[] var6 = var10000;

while (true) {
if (var14.hasNext()) {
Object var15 = var14.next();
i8 var16 = (i8)var15;
boolean var17 = false;

try {
var16.z();
if (var6 != null) {
break;
}

if (var6 == null) {
continue;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -6250186759702488450L, var2);
}
}

tm.R.r(var4, var7, var9, var11);
break;
}

return super.method_25406(click);
}

public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
long var9 = a ^ 66046917211595L;
long var11 = var9 ^ 36193274981565L;
Iterable var14 = G;
int[] var10000 = vm.a<"Å">(-7007518656172965153L, var9);
boolean var15 = false;
int[] var13 = var10000;

for (Object var17 : var14) {
i8 var18 = (i8)var17;
boolean var19 = false;

try {
var18.a(mouseX, var11, mouseY, verticalAmount);
if (var13 == null && var13 == null) {
continue;
}
break;
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, -7036615360641143452L, var9);
}
}

return super.method_25401(mouseX, mouseY, horizontalAmount, verticalAmount);
}

public boolean method_25404(@NotNull class_11908 input) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/s1.a J
// 003: ldc2_w 110447005625651
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 51883490007638
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 2615853228453
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 69364492105362
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 105480743635639
// 022: lxor
// 023: dup2
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 10
// 02a: dup2
// 02b: bipush 16
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 11
// 034: dup2
// 035: bipush 48
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 12
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 67520918062204
// 043: lxor
// 044: dup2
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 13
// 04b: dup2
// 04c: bipush 16
// 04e: lshl
// 04f: bipush 32
// 051: lushr
// 052: l2i
// 053: istore 14
// 055: dup2
// 056: bipush 48
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 15
// 05f: pop2
// 060: pop2
// 061: ldc2_w 448128547113130535
// 064: lload 2
// 065: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: aload 1
// 06b: sipush 3425
// 06e: ldc2_w 5889803686655459082
// 071: lload 2
// 072: lxor
// 073: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/s1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07b: astore 16
// 07d: aload 1
// 07e: invokevirtual net/minecraft/class_11908.comp_4795 ()I
// 081: istore 17
// 083: aload 1
// 084: invokevirtual net/minecraft/class_11908.comp_4796 ()I
// 087: istore 18
// 089: aload 1
// 08a: invokevirtual net/minecraft/class_11908.comp_4797 ()I
// 08d: istore 19
// 08f: getstatic su/catlean/s1.G Ljava/util/Set;
// 092: checkcast java/lang/Iterable
// 095: astore 20
// 097: bipush 0
// 098: istore 21
// 09a: aload 20
// 09c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0a1: astore 22
// 0a3: aload 22
// 0a5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0aa: ifeq 0e5
// 0ad: aload 22
// 0af: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0b4: astore 23
// 0b6: aload 23
// 0b8: checkcast su/catlean/i8
// 0bb: astore 24
// 0bd: bipush 0
// 0be: istore 25
// 0c0: aload 24
// 0c2: iload 17
// 0c4: iload 18
// 0c6: lload 6
// 0c8: iload 19
// 0ca: invokevirtual su/catlean/i8.R (IIJI)V
// 0cd: nop
// 0ce: aload 16
// 0d0: ifnonnull 0e6
// 0d3: aload 16
// 0d5: ifnull 0a3
// 0d8: goto 0e5
// 0db: ldc2_w 477579466729452956
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: nop
// 0e6: iload 17
// 0e8: aload 16
// 0ea: ifnonnull 24a
// 0ed: lookupswitch 344 4 86 191 257 166 258 112 259 53
// 118: ldc2_w 477579466729452956
// 11b: lload 2
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: getstatic su/catlean/fz.I Lsu/catlean/b;
// 125: invokevirtual su/catlean/b.T ()Lsu/catlean/fz;
// 128: dup
// 129: ifnull 157
// 12c: goto 139
// 12f: ldc2_w 477579466729452956
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: astore 22
// 13b: aload 22
// 13d: astore 23
// 13f: bipush 0
// 140: istore 24
// 142: aload 23
// 144: aload 23
// 146: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 149: bipush 1
// 14a: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 14d: lload 8
// 14f: dup2_x1
// 150: pop2
// 151: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 154: goto 245
// 157: pop
// 158: aload 16
// 15a: ifnull 245
// 15d: getstatic su/catlean/fz.I Lsu/catlean/b;
// 160: invokevirtual su/catlean/b.T ()Lsu/catlean/fz;
// 163: dup
// 164: ifnull 18d
// 167: goto 174
// 16a: ldc2_w 477579466729452956
// 16d: lload 2
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: iload 10
// 176: i2c
// 177: iload 11
// 179: iload 12
// 17b: i2c
// 17c: invokevirtual su/catlean/fz.P (CIC)Lkotlin/Unit;
// 17f: pop
// 180: goto 245
// 183: ldc2_w 477579466729452956
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: pop
// 18e: aload 16
// 190: ifnull 245
// 193: getstatic su/catlean/fz.I Lsu/catlean/b;
// 196: aconst_null
// 197: invokevirtual su/catlean/b.A (Lsu/catlean/fz;)V
// 19a: aload 16
// 19c: ifnull 245
// 19f: goto 1ac
// 1a2: ldc2_w 477579466729452956
// 1a5: lload 2
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: iload 13
// 1ae: i2s
// 1af: iload 14
// 1b1: iload 15
// 1b3: i2c
// 1b4: getstatic su/catlean/s1.f J
// 1b7: l2i
// 1b8: invokestatic su/catlean/bx.k (SICI)Z
// 1bb: aload 16
// 1bd: ifnonnull 24a
// 1c0: goto 1cd
// 1c3: ldc2_w 477579466729452956
// 1c6: lload 2
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: ifeq 245
// 1d0: goto 1dd
// 1d3: ldc2_w 477579466729452956
// 1d6: lload 2
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: lload 4
// 1df: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e2: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 1e5: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 1e8: invokestatic org/lwjgl/glfw/GLFW.glfwGetClipboardString (J)Ljava/lang/String;
// 1eb: dup
// 1ec: ifnonnull 20c
// 1ef: goto 1fc
// 1f2: ldc2_w 477579466729452956
// 1f5: lload 2
// 1f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: athrow
// 1fc: pop
// 1fd: ldc ""
// 1ff: goto 20c
// 202: ldc2_w 477579466729452956
// 205: lload 2
// 206: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: athrow
// 20c: astore 21
// 20e: getstatic su/catlean/fz.I Lsu/catlean/b;
// 211: invokevirtual su/catlean/b.T ()Lsu/catlean/fz;
// 214: astore 22
// 216: aload 22
// 218: dup
// 219: aload 16
// 21b: ifnonnull 230
// 21e: ifnull 244
// 221: goto 22e
// 224: ldc2_w 477579466729452956
// 227: lload 2
// 228: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: athrow
// 22e: aload 22
// 230: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 233: aload 21
// 235: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 23a: lload 8
// 23c: dup2_x1
// 23d: pop2
// 23e: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 241: goto 245
// 244: pop
// 245: aload 0
// 246: aload 1
// 247: invokespecial net/minecraft/class_437.method_25404 (Lnet/minecraft/class_11908;)Z
// 24a: ireturn
}

public boolean method_25400(@NotNull class_11905 input) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/s1.a J
// 003: ldc2_w 8676920262067
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 101709655303698
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 17725759757535
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 62902161759053
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w -7586189202361595225
// 022: lload 2
// 023: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: aload 1
// 029: sipush 8392
// 02c: ldc2_w 5963645366640820782
// 02f: lload 2
// 030: lxor
// 031: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/s1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 039: astore 10
// 03b: aload 10
// 03d: ifnonnull 08e
// 040: aload 1
// 041: invokevirtual net/minecraft/class_11905.method_74226 ()Ljava/lang/String;
// 044: dup
// 045: sipush 5067
// 048: ldc2_w 4186580200807035179
// 04b: lload 2
// 04c: lxor
// 04d: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/s1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 055: invokevirtual java/lang/String.toCharArray ()[C
// 058: dup
// 059: sipush 27477
// 05c: ldc2_w 2692510411188668848
// 05f: lload 2
// 060: lxor
// 061: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/s1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 069: invokestatic kotlin/collections/ArraysKt.firstOrNull ([C)Ljava/lang/Character;
// 06c: dup
// 06d: ifnull 08d
// 070: goto 07d
// 073: ldc2_w -7628868616953567972
// 076: lload 2
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: invokevirtual java/lang/Character.charValue ()C
// 080: goto 094
// 083: ldc2_w -7628868616953567972
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: pop
// 08e: aload 0
// 08f: aload 1
// 090: invokespecial net/minecraft/class_437.method_25400 (Lnet/minecraft/class_11905;)Z
// 093: ireturn
// 094: istore 11
// 096: getstatic su/catlean/s1.G Ljava/util/Set;
// 099: checkcast java/lang/Iterable
// 09c: astore 12
// 09e: bipush 0
// 09f: istore 13
// 0a1: aload 12
// 0a3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0a8: astore 14
// 0aa: aload 14
// 0ac: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0b1: ifeq 0e8
// 0b4: aload 14
// 0b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0bb: astore 15
// 0bd: aload 15
// 0bf: checkcast su/catlean/i8
// 0c2: astore 16
// 0c4: bipush 0
// 0c5: istore 17
// 0c7: aload 16
// 0c9: iload 11
// 0cb: lload 8
// 0cd: invokevirtual su/catlean/i8.u (CJ)V
// 0d0: nop
// 0d1: aload 10
// 0d3: ifnonnull 0e9
// 0d6: aload 10
// 0d8: ifnull 0aa
// 0db: goto 0e8
// 0de: ldc2_w -7628868616953567972
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: nop
// 0e9: getstatic su/catlean/fz.I Lsu/catlean/b;
// 0ec: invokevirtual su/catlean/b.T ()Lsu/catlean/fz;
// 0ef: astore 12
// 0f1: aload 12
// 0f3: dup
// 0f4: aload 10
// 0f6: ifnonnull 10b
// 0f9: ifnull 11f
// 0fc: goto 109
// 0ff: ldc2_w -7628868616953567972
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: aload 12
// 10b: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 10e: iload 11
// 110: invokedynamic makeConcatWithConstants (Ljava/lang/String;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 115: lload 4
// 117: dup2_x1
// 118: pop2
// 119: invokevirtual su/catlean/fz.M (JLjava/lang/String;)V
// 11c: goto 120
// 11f: pop
// 120: getstatic su/catlean/tm.R Lsu/catlean/tm;
// 123: iload 11
// 125: lload 6
// 127: invokevirtual su/catlean/tm.D (CJ)V
// 12a: aload 0
// 12b: aload 1
// 12c: invokespecial net/minecraft/class_437.method_25400 (Lnet/minecraft/class_11905;)Z
// 12f: ireturn
}

protected void method_57734(@NotNull class_332 guiGraphics) {
long var2 = a ^ 56138445566250L;
Intrinsics.checkNotNullParameter(guiGraphics, a<"j">(4338, 8946837932288851586L ^ var2));
}

public void method_25420(@NotNull class_332 guiGraphics, int mouseY, int j, float deltaTicks) {
long var5 = a ^ 100454816295537L;
Intrinsics.checkNotNullParameter(guiGraphics, a<"j">(6582, 992383656513678486L ^ var5));
}

static {
long var14 = a ^ 98275170870866L;
long var10001 = var14 ^ 136532560276834L;
int var16 = (int)((var14 ^ 136532560276834L) >>> 48);
int var17 = (int)((var14 ^ 136532560276834L) << 16 >>> 48);
int var18 = (int)(var10001 << 32 >>> 32);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[12];
int var10 = 0;
String var9 = "\u001cÓ¤òÝ×\u001aM\u00824ªQ\u0089<\u009d\u009d¬\u0099÷§JÄNdå«¸v°\u009a@³qÇsLë³\u001a\u008b/2öL\u0005u\u0083A¦@\u0013\rggb\u001cÄ[È\u0013\r÷[\\\\s\u000fµ\b\u007f\u0090{\u0019\foì\u0091\u0098âÑj²0ý´\u008c\u0086&ø={t\u0080ÔqÞG\u009b{¬Å÷\u0085AÁð&\u009fÓn\t\u0010\u009eØF\u000b8·\u0092B\u0090ý ÷\u0007\u0086k:+\n\u008c+·ö\u0090\u001f?\u009c3JöðÎ\u0098Á¼\u0016½Ô\u0014ð)»\u001b`Ú\u001c>ü\f(ÐBKR\u009c\u0099ärÖ\u007f\u0014\u0014¯±#\\]\u001bÀ\u0080õ\\÷p\u008c\u0081\u009b@\u0012\u0014sá¤\u0085/4\u008c£OÚ(A\u001a£\u0092,9IX\u001dæ\u009b»U\u001aò\u0095L\u0080é^á\u009fzê¼P\u0092¸\u001dcI\"Kð3g\u0000Ï\u009aØ\u00181²I\u009aI\u0093èWN\u0084=\u008b#¥SæÑÚ.zOàfS(>Å;\u009a\f®\u001cä½B\u0015îr,Ó|¦dT¨ößÁñþ<ï\u0019w\u000ejtÿÅ\u008aT\u0097\u0016\u0092]\u0010¹Y¦P\u0011RzÜÖzs\u0014V\u0089\u008aÜ\u0010\u0087\u0015G\u0085cµO\u0090I¥e\u0097;*\u000f¢\u0010n\u0011ã\u000b|3¿\t¦Ñ¨\u008cÁtg¸\u0018%íè\u0001SOõL 7#\u001bÔË9ú\u007f¿¢\u009eA\f.Ø\u0010AD\u0092\u007fÚ¥'\u0092lPY¢Ü\u0088\fî";
int var11 = "\u001cÓ¤òÝ×\u001aM\u00824ªQ\u0089<\u009d\u009d¬\u0099÷§JÄNdå«¸v°\u009a@³qÇsLë³\u001a\u008b/2öL\u0005u\u0083A¦@\u0013\rggb\u001cÄ[È\u0013\r÷[\\\\s\u000fµ\b\u007f\u0090{\u0019\foì\u0091\u0098âÑj²0ý´\u008c\u0086&ø={t\u0080ÔqÞG\u009b{¬Å÷\u0085AÁð&\u009fÓn\t\u0010\u009eØF\u000b8·\u0092B\u0090ý ÷\u0007\u0086k:+\n\u008c+·ö\u0090\u001f?\u009c3JöðÎ\u0098Á¼\u0016½Ô\u0014ð)»\u001b`Ú\u001c>ü\f(ÐBKR\u009c\u0099ärÖ\u007f\u0014\u0014¯±#\\]\u001bÀ\u0080õ\\÷p\u008c\u0081\u009b@\u0012\u0014sá¤\u0085/4\u008c£OÚ(A\u001a£\u0092,9IX\u001dæ\u009b»U\u001aò\u0095L\u0080é^á\u009fzê¼P\u0092¸\u001dcI\"Kð3g\u0000Ï\u009aØ\u00181²I\u009aI\u0093èWN\u0084=\u008b#¥SæÑÚ.zOàfS(>Å;\u009a\f®\u001cä½B\u0015îr,Ó|¦dT¨ößÁñþ<ï\u0019w\u000ejtÿÅ\u008aT\u0097\u0016\u0092]\u0010¹Y¦P\u0011RzÜÖzs\u0014V\u0089\u008aÜ\u0010\u0087\u0015G\u0085cµO\u0090I¥e\u0097;*\u000f¢\u0010n\u0011ã\u000b|3¿\t¦Ñ¨\u008cÁtg¸\u0018%íè\u0001SOõL 7#\u001bÔË9ú\u007f¿¢\u009eA\f.Ø\u0010AD\u0092\u007fÚ¥'\u0092lPY¢Ü\u0088\fî"
.length();
char var8 = 160;
int var21 = -1;

label37:
while (true) {
String var22 = var9.substring(++var21, var21 + var8);
byte var25 = -1;

while (true) {
byte[] var13 = var5.doFinal(var22.getBytes("ISO-8859-1"));
String var31 = a(var13).intern();
switch (var25) {
case 0:
var12[var10++] = var31;
if ((var21 += var8) >= var11) {
b = var12;
c = new String[12];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -2729965165714332233L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var35 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var29 = -1;
f = var35;
d = new s1((char)var16, (short)var17, var18);
i8[] var19 = new i8[]{ir.r, ih.v, i7.j, il.r, ib.I};
G = SetsKt.setOf(var19);
return;
}

var8 = var9.charAt(var21);
break;
default:
var12[var10++] = var31;
if ((var21 += var8) < var11) {
var8 = var9.charAt(var21);
continue label37;
}

var9 = "Ð\u007fK¿\u0003\u0013@³ðÌ\u0082\u0081@À¼\u0091\u0010ÁÛ\u009e´_\u0017ú\u008f¾s\u009eÌe®ÃK";
var11 = "Ð\u007fK¿\u0003\u0013@³ðÌ\u0082\u0081@À¼\u0091\u0010ÁÛ\u009e´_\u0017ú\u008f¾s\u009eÌe®ÃK".length();
var8 = 16;
var21 = -1;
}

var22 = var9.substring(++var21, var21 + var8);
var25 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30078;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/s1", var10);
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
throw new RuntimeException("su/catlean/s1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
