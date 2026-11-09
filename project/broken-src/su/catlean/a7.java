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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class a7 implements b4 {
@NotNull
public static final a7 h;
private static int y;
private static final long a = yz.a(-2519580931557730791L, -384122617207862177L, MethodHandles.lookup().lookupClass()).a(215894886613914L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private a7() {
}

public final boolean r(boolean onlyWeapon, long a, @NotNull a0 switchMode) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/a7.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 23391075074131
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 97356092661267
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 56022010728113
// 019: lxor
// 01a: lstore 9
// 01c: dup2
// 01d: ldc2_w 22831998406188
// 020: lxor
// 021: lstore 11
// 023: pop2
// 024: aload 4
// 026: sipush 10030
// 029: ldc2_w 5734815875403451008
// 02c: lload 2
// 02d: lxor
// 02e: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/a7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 036: ldc2_w 6694829808393794591
// 039: lload 2
// 03a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: lload 11
// 041: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 044: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 047: dup
// 048: sipush 1033
// 04b: ldc2_w 4851921589887969702
// 04e: lload 2
// 04f: lxor
// 050: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/a7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 058: astore 14
// 05a: istore 13
// 05c: iload 1
// 05d: iload 13
// 05f: ifne 190
// 062: ifeq 18f
// 065: goto 072
// 068: ldc2_w 6699279430427049456
// 06b: lload 2
// 06c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: athrow
// 072: lload 2
// 073: lconst_0
// 074: lcmp
// 075: ifle 13c
// 078: aload 4
// 07a: getstatic su/catlean/a0.NONE Lsu/catlean/a0;
// 07d: if_acmpne 13c
// 080: goto 08d
// 083: ldc2_w 6699279430427049456
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: aload 14
// 08f: lload 5
// 091: invokestatic su/catlean/xa.N (Lnet/minecraft/class_1799;J)Z
// 094: iload 13
// 096: ifne 135
// 099: goto 0a6
// 09c: ldc2_w 6699279430427049456
// 09f: lload 2
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: ifne 134
// 0a9: goto 0b6
// 0ac: ldc2_w 6699279430427049456
// 0af: lload 2
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: aload 14
// 0b8: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0bb: instanceof net/minecraft/class_1743
// 0be: iload 13
// 0c0: ifne 135
// 0c3: goto 0d0
// 0c6: ldc2_w 6699279430427049456
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: ifne 134
// 0d3: goto 0e0
// 0d6: ldc2_w 6699279430427049456
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: aload 14
// 0e2: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0e5: instanceof net/minecraft/class_1835
// 0e8: iload 13
// 0ea: ifne 135
// 0ed: goto 0fa
// 0f0: ldc2_w 6699279430427049456
// 0f3: lload 2
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: ifne 134
// 0fd: goto 10a
// 100: ldc2_w 6699279430427049456
// 103: lload 2
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: aload 14
// 10c: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 10f: instanceof net/minecraft/class_9362
// 112: iload 13
// 114: ifne 139
// 117: goto 124
// 11a: ldc2_w 6699279430427049456
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: ifeq 138
// 127: goto 134
// 12a: ldc2_w 6699279430427049456
// 12d: lload 2
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: bipush 1
// 135: goto 18e
// 138: bipush 0
// 139: goto 18e
// 13c: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 13f: lload 9
// 141: invokevirtual su/catlean/gg.R (J)Lsu/catlean/fg;
// 144: invokevirtual su/catlean/fg.R ()Z
// 147: iload 13
// 149: ifne 18a
// 14c: ifne 189
// 14f: goto 15c
// 152: ldc2_w 6699279430427049456
// 155: lload 2
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 15f: lload 7
// 161: invokevirtual su/catlean/gg.g (J)Lsu/catlean/fg;
// 164: invokevirtual su/catlean/fg.R ()Z
// 167: iload 13
// 169: ifne 18a
// 16c: goto 179
// 16f: ldc2_w 6699279430427049456
// 172: lload 2
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: ifeq 18d
// 17c: goto 189
// 17f: ldc2_w 6699279430427049456
// 182: lload 2
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: bipush 1
// 18a: goto 18e
// 18d: bipush 0
// 18e: ireturn
// 18f: bipush 1
// 190: ireturn
}

public final void B(char a, boolean silent, int a, char a) {
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
// 005: iload 3
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
// 018: getstatic su/catlean/a7.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 128311986793474
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 33853623893152
// 02b: lxor
// 02c: lstore 9
// 02e: dup2
// 02f: ldc2_w 3279851513537
// 032: lxor
// 033: lstore 11
// 035: pop2
// 036: ldc2_w 3385013693287187982
// 039: lload 5
// 03b: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 043: lload 9
// 045: invokevirtual su/catlean/gg.R (J)Lsu/catlean/fg;
// 048: astore 14
// 04a: istore 13
// 04c: aload 14
// 04e: iload 13
// 050: ifne 0b5
// 053: invokevirtual su/catlean/fg.R ()Z
// 056: ifeq 0ad
// 059: goto 067
// 05c: ldc2_w 3380429929242562529
// 05f: lload 5
// 061: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: athrow
// 067: iload 1
// 068: iflt 09e
// 06b: iload 2
// 06c: ifeq 097
// 06f: goto 07d
// 072: ldc2_w 3380429929242562529
// 075: lload 5
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: aload 14
// 07f: lload 11
// 081: invokevirtual su/catlean/fg.x (J)V
// 084: iload 13
// 086: ifeq 0ac
// 089: goto 097
// 08c: ldc2_w 3380429929242562529
// 08f: lload 5
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: aload 14
// 099: lload 11
// 09b: invokevirtual su/catlean/fg.x (J)V
// 09e: goto 0ac
// 0a1: ldc2_w 3380429929242562529
// 0a4: lload 5
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: return
// 0ad: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0b0: lload 7
// 0b2: invokevirtual su/catlean/gg.g (J)Lsu/catlean/fg;
// 0b5: astore 15
// 0b7: aload 15
// 0b9: invokevirtual su/catlean/fg.R ()Z
// 0bc: iload 4
// 0be: iflt 0d8
// 0c1: iload 13
// 0c3: ifne 0d8
// 0c6: ifeq 10e
// 0c9: goto 0d7
// 0cc: ldc2_w 3380429929242562529
// 0cf: lload 5
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: iload 2
// 0d8: iload 1
// 0d9: iflt 0e8
// 0dc: ifeq 0f9
// 0df: aload 15
// 0e1: lload 11
// 0e3: invokevirtual su/catlean/fg.x (J)V
// 0e6: iload 13
// 0e8: ifeq 10e
// 0eb: goto 0f9
// 0ee: ldc2_w 3380429929242562529
// 0f1: lload 5
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: aload 15
// 0fb: lload 11
// 0fd: invokevirtual su/catlean/fg.x (J)V
// 100: goto 10e
// 103: ldc2_w 3380429929242562529
// 106: lload 5
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: return
}

public static void y(a7 var0, long var1, boolean var3, int var4, Object var5) {
var1 = a ^ var1;
long var10001 = var1 ^ 1909666732361L;
int var6 = (int)((var1 ^ 1909666732361L) >>> 48);
int var7 = (int)((var1 ^ 1909666732361L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
boolean var9 = vm.a<"Å">(5911129147602381839L, var1);

label21: {
int var10000;
label20: {
try {
var10000 = var4 & 1;
if (!var9) {
break label20;
}

if (var10000 == 0) {
break label21;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 5946347768867091341L, var1);
}

var10000 = 0;
}

var3 = var10000;
}

var0.B((char)var6, (boolean)var3, var7, (char)var8);
}

@Override
public void Q(int param1, long param2) {
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
// 05: lload 2
// 06: bipush 32
// 08: lshl
// 09: bipush 32
// 0b: lushr
// 0c: lor
// 0d: lstore 4
// 0f: lload 4
// 11: dup2
// 12: ldc2_w 51486216026542
// 15: lxor
// 16: dup2
// 17: bipush 48
// 19: lushr
// 1a: l2i
// 1b: istore 6
// 1d: dup2
// 1e: bipush 16
// 20: lshl
// 21: bipush 32
// 23: lushr
// 24: l2i
// 25: istore 7
// 27: dup2
// 28: bipush 48
// 2a: lshl
// 2b: bipush 48
// 2d: lushr
// 2e: l2i
// 2f: istore 8
// 31: pop2
// 32: dup2
// 33: ldc2_w 104070571286828
// 36: lxor
// 37: dup2
// 38: bipush 8
// 3a: lushr
// 3b: lstore 9
// 3d: dup2
// 3e: bipush 56
// 40: lshl
// 41: bipush 56
// 43: lushr
// 44: l2i
// 45: istore 11
// 47: pop2
// 48: dup2
// 49: ldc2_w 16782221287606
// 4c: lxor
// 4d: lstore 12
// 4f: pop2
// 50: ldc2_w 8282018332447608040
// 53: lload 4
// 55: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: istore 14
// 5c: iload 14
// 5e: ifeq 9c
// 61: getstatic su/catlean/um.E Lsu/catlean/um;
// 64: lload 9
// 66: iload 11
// 68: i2b
// 69: invokevirtual su/catlean/um.D (JB)Lsu/catlean/a0;
// 6c: getstatic su/catlean/a0.SILENT Lsu/catlean/a0;
// 6f: if_acmpne a9
// 72: goto 80
// 75: ldc2_w 8242296113770419050
// 78: lload 4
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: lload 12
// 82: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 85: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 88: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 8b: putstatic su/catlean/a7.y I
// 8e: goto 9c
// 91: ldc2_w 8242296113770419050
// 94: lload 4
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: aload 0
// 9d: iload 6
// 9f: i2c
// a0: bipush 1
// a1: iload 7
// a3: iload 8
// a5: i2c
// a6: invokevirtual su/catlean/a7.B (CZIC)V
// a9: return
}

@Override
public void P(@NotNull _w rotation, short a, int a, int a) {
long var5 = (long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48;
long var7 = (var5 ^ 26629572807522L) >>> 8;
int var9 = (int)((var5 ^ 26629572807522L) << 56 >>> 56);
long var10 = var5 ^ 75397077659784L;

try {
Intrinsics.checkNotNullParameter(rotation, a<"z">(30554, 5085493859645480483L ^ var5));
if (um.E.D(var7, (byte)var9) == a0.SILENT) {
this.v(var10);
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -2869705301105641180L, var5);
}
}

@Override
public void n(long var1) {
long var3 = var1 ^ 102883187979937L;
this.v(var3);
}

public final void v(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/a7.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 134850973125343
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w -8283042558580690165
// 11: lload 1
// 12: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: istore 5
// 19: getstatic su/catlean/a7.y I
// 1c: iload 5
// 1e: ifeq 4a
// 21: bipush -1
// 22: if_icmpeq 4d
// 25: goto 32
// 28: ldc2_w -8250137378500072311
// 2b: lload 1
// 2c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: athrow
// 32: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 35: getstatic su/catlean/a7.y I
// 38: lload 3
// 39: invokevirtual su/catlean/gg.f (IJ)V
// 3c: bipush -1
// 3d: goto 4a
// 40: ldc2_w -8250137378500072311
// 43: lload 1
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: putstatic su/catlean/a7.y I
// 4d: return
}

static {
long var0 = a ^ 66520455920268L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[3];
int var7 = 0;
String var6 = " ê?/æ\u001c= I\u001d\u0013\u0005Pý\u008aUoÄ»\u0091s;çT>:\u0005ú£ æÕ\u0014z(\tí\"sK\u0018²\u0003ü]I{\u0006½\u007fmB\\µ¤Ã®éKÔ\u008dUDKr\u0018\u0018=²Ì\u009a|æÔ×I©ù\u0083Ôn|k\u0094Ì\u0002\rç\u008b\u0093";
int var8 = " ê?/æ\u001c= I\u001d\u0013\u0005Pý\u008aUoÄ»\u0091s;çT>:\u0005ú£ æÕ\u0014z(\tí\"sK\u0018²\u0003ü]I{\u0006½\u007fmB\\µ¤Ã®éKÔ\u008dUDKr\u0018\u0018=²Ì\u009a|æÔ×I©ù\u0083Ôn|k\u0094Ì\u0002\rç\u008b\u0093"
.length();
char var5 = '(';
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
b = var9;
c = new String[3];
h = new a7();
y = -1;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28908;
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
throw new RuntimeException("su/catlean/a7", var10);
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
throw new RuntimeException("su/catlean/a7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
