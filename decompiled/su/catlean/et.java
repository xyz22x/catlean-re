package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.gofra.Flow;

public final class et extends _g {
@NotNull
public static final et P;
static final KProperty[] g;
@NotNull
private static final a6 c;
@NotNull
private static final a6 m;
@NotNull
private static final a6 k;
@NotNull
private static final cq I;
@NotNull
private static final Map j;
private static boolean d;
private static boolean C;
private static int a;
private static boolean E;
private static final long b = yz.a(7468643730345306145L, -6706891590298238627L, MethodHandles.lookup().lookupClass()).a(49911007672534L);
private static final String[] e;
private static final String[] f;
private static final Map h = new HashMap(13);

private et(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 25520027361753L;
super(b<"l">(1993, 4228281837237265750L ^ var1), jt.v(), null, 4, null, var3);
}

private final id P(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 70998262922142L;
return (id)c.E(this, var3, g[0]);
}

private final id C(short var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
long var6 = var4 ^ 129467196616568L;
return (id)m.E(this, var6, g[1]);
}

private final id q(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 134396334240287L;
return (id)k.E(this, var3, g[2]);
}

private final boolean p(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 32360748769912L;
return (Boolean)I.E(this, var3, g[3]);
}

@Flow
private final void q(TickEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/et.b J
// 003: ldc2_w 39216081662255
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 84902129155819
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 104204230828223
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 83893008200796
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 120475318071501
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w 7159743761889959999
// 029: lload 2
// 02a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: astore 12
// 031: aload 0
// 032: lload 8
// 034: invokevirtual su/catlean/et.S (J)Z
// 037: aload 12
// 039: ifnonnull 050
// 03c: ifne 04d
// 03f: goto 04c
// 042: ldc2_w 7130059058118825346
// 045: lload 2
// 046: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: athrow
// 04c: return
// 04d: getstatic su/catlean/et.d Z
// 050: aload 12
// 052: ifnonnull 10a
// 055: ifeq 107
// 058: goto 065
// 05b: ldc2_w 7130059058118825346
// 05e: lload 2
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: getstatic su/catlean/et.j Ljava/util/Map;
// 068: getstatic su/catlean/et.a I
// 06b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 06e: new su/catlean/bb
// 071: dup
// 072: lload 10
// 074: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 077: invokevirtual net/minecraft/class_746.method_36454 ()F
// 07a: lload 10
// 07c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07f: invokevirtual net/minecraft/class_746.method_36455 ()F
// 082: lload 4
// 084: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 087: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 08a: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 08d: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 090: lload 4
// 092: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 095: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 098: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
// 09b: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 09e: lload 4
// 0a0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a3: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0a6: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
// 0a9: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0ac: lload 4
// 0ae: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0b4: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
// 0b7: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0ba: lload 4
// 0bc: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0bf: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0c2: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 0c5: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0c8: lload 4
// 0ca: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0cd: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0d0: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 0d3: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0d6: lload 4
// 0d8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0db: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0de: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
// 0e1: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0e4: lload 4
// 0e6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0e9: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0ec: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
// 0ef: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0f2: invokespecial su/catlean/bb.<init> (FFZZZZZZZZ)V
// 0f5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 0fa: pop
// 0fb: getstatic su/catlean/et.a I
// 0fe: istore 13
// 100: iload 13
// 102: bipush 1
// 103: iadd
// 104: putstatic su/catlean/et.a I
// 107: getstatic su/catlean/et.C Z
// 10a: aload 12
// 10c: ifnonnull 122
// 10f: ifeq 275
// 112: goto 11f
// 115: ldc2_w 7130059058118825346
// 118: lload 2
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: getstatic su/catlean/et.a I
// 122: aload 12
// 124: ifnonnull 15e
// 127: getstatic su/catlean/et.j Ljava/util/Map;
// 12a: invokeinterface java/util/Map.size ()I 1
// 12f: if_icmplt 15b
// 132: goto 13f
// 135: ldc2_w 7130059058118825346
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: bipush 1
// 140: putstatic su/catlean/et.E Z
// 143: getstatic su/catlean/et.j Ljava/util/Map;
// 146: invokeinterface java/util/Map.size ()I 1
// 14b: putstatic su/catlean/et.a I
// 14e: goto 15b
// 151: ldc2_w 7130059058118825346
// 154: lload 2
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: getstatic su/catlean/et.a I
// 15e: aload 12
// 160: ifnonnull 185
// 163: ifge 188
// 166: goto 173
// 169: ldc2_w 7130059058118825346
// 16c: lload 2
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: bipush 0
// 174: putstatic su/catlean/et.E Z
// 177: bipush 0
// 178: goto 185
// 17b: ldc2_w 7130059058118825346
// 17e: lload 2
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: putstatic su/catlean/et.a I
// 188: getstatic su/catlean/et.j Ljava/util/Map;
// 18b: getstatic su/catlean/et.a I
// 18e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 191: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 196: checkcast su/catlean/bb
// 199: astore 13
// 19b: aload 12
// 19d: ifnonnull 26f
// 1a0: aload 13
// 1a2: ifnonnull 1c3
// 1a5: goto 1b2
// 1a8: ldc2_w 7130059058118825346
// 1ab: lload 2
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: aload 0
// 1b3: lload 6
// 1b5: invokespecial su/catlean/et.R (J)V
// 1b8: return
// 1b9: ldc2_w 7130059058118825346
// 1bc: lload 2
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: lload 10
// 1c5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c8: aload 13
// 1ca: invokevirtual su/catlean/bb.A ()F
// 1cd: bipush 0
// 1ce: aload 13
// 1d0: invokevirtual su/catlean/bb.i ()F
// 1d3: bipush 0
// 1d4: invokevirtual net/minecraft/class_746.method_64578 (FZFZ)V
// 1d7: lload 4
// 1d9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1dc: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1df: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 1e2: aload 13
// 1e4: invokevirtual su/catlean/bb.P ()Z
// 1e7: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 1ea: lload 4
// 1ec: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1ef: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1f2: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
// 1f5: aload 13
// 1f7: invokevirtual su/catlean/bb.C ()Z
// 1fa: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 1fd: lload 4
// 1ff: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 202: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 205: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
// 208: aload 13
// 20a: invokevirtual su/catlean/bb.N ()Z
// 20d: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 210: lload 4
// 212: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 215: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 218: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
// 21b: aload 13
// 21d: invokevirtual su/catlean/bb.F ()Z
// 220: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 223: lload 4
// 225: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 228: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 22b: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 22e: aload 13
// 230: invokevirtual su/catlean/bb.T ()Z
// 233: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 236: lload 4
// 238: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 23b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 23e: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 241: aload 13
// 243: invokevirtual su/catlean/bb.R ()Z
// 246: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 249: lload 4
// 24b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 24e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 251: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
// 254: aload 13
// 256: invokevirtual su/catlean/bb.t ()Z
// 259: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 25c: lload 4
// 25e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 261: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 264: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
// 267: aload 13
// 269: invokevirtual su/catlean/bb.B ()Z
// 26c: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 26f: aload 0
// 270: lload 6
// 272: invokespecial su/catlean/et.R (J)V
// 275: return
}

private final void R(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/et.b J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 91867307076961
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w 5867812689746989581
// 11: lload 1
// 12: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: astore 5
// 19: aload 0
// 1a: lload 3
// 1b: invokespecial su/catlean/et.p (J)Z
// 1e: aload 5
// 20: ifnonnull 93
// 23: ifeq 83
// 26: goto 33
// 29: ldc2_w 5818971118091478960
// 2c: lload 1
// 2d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: athrow
// 33: getstatic su/catlean/et.E Z
// 36: aload 5
// 38: ifnonnull 6c
// 3b: goto 48
// 3e: ldc2_w 5818971118091478960
// 41: lload 1
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: ifeq 69
// 4b: goto 58
// 4e: ldc2_w 5818971118091478960
// 51: lload 1
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: getstatic su/catlean/et.a I
// 5b: istore 6
// 5d: iload 6
// 5f: bipush -1
// 60: iadd
// 61: putstatic su/catlean/et.a I
// 64: iload 6
// 66: goto 77
// 69: getstatic su/catlean/et.a I
// 6c: istore 6
// 6e: iload 6
// 70: bipush 1
// 71: iadd
// 72: putstatic su/catlean/et.a I
// 75: iload 6
// 77: lload 1
// 78: lconst_0
// 79: lcmp
// 7a: ifle 86
// 7d: pop
// 7e: aload 5
// 80: ifnull c9
// 83: getstatic su/catlean/et.a I
// 86: goto 93
// 89: ldc2_w 5818971118091478960
// 8c: lload 1
// 8d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92: athrow
// 93: istore 6
// 95: iload 6
// 97: bipush 1
// 98: iadd
// 99: putstatic su/catlean/et.a I
// 9c: getstatic su/catlean/et.E Z
// 9f: aload 5
// a1: ifnonnull c6
// a4: ifeq c9
// a7: goto b4
// aa: ldc2_w 5818971118091478960
// ad: lload 1
// ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: athrow
// b4: bipush 0
// b5: putstatic su/catlean/et.a I
// b8: bipush 0
// b9: goto c6
// bc: ldc2_w 5818971118091478960
// bf: lload 1
// c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c5: athrow
// c6: putstatic su/catlean/et.E Z
// c9: return
}

private static final Unit E() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/et.b J
// 03: ldc2_w 82312649539350
// 06: lxor
// 07: lstore 0
// 08: ldc2_w -1340405339049906682
// 0b: lload 0
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: getstatic su/catlean/et.P Lsu/catlean/et;
// 14: pop
// 15: astore 2
// 16: getstatic su/catlean/et.d Z
// 19: aload 2
// 1a: ifnonnull 2e
// 1d: ifne 31
// 20: goto 2d
// 23: ldc2_w -1384180026116990021
// 26: lload 0
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: bipush 1
// 2e: goto 32
// 31: bipush 0
// 32: putstatic su/catlean/et.d Z
// 35: getstatic su/catlean/et.d Z
// 38: aload 2
// 39: ifnonnull 5e
// 3c: ifeq 61
// 3f: goto 4c
// 42: ldc2_w -1384180026116990021
// 45: lload 0
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: getstatic su/catlean/et.P Lsu/catlean/et;
// 4f: pop
// 50: bipush 0
// 51: goto 5e
// 54: ldc2_w -1384180026116990021
// 57: lload 0
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: putstatic su/catlean/et.a I
// 61: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 64: areturn
}

private static final boolean A() {
long var0 = b ^ 17770550588188L;
String var2 = vm.a<"Å">(7021031036263997964L, var0);

try {
if (var2 != null) {
return C;
}

if (!C) {
return true;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, 6971639761421047729L, var0);
}

return false;
}

private static final Unit K() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/et.b J
// 03: ldc2_w 42625353469045
// 06: lxor
// 07: lstore 0
// 08: ldc2_w -2448128151657276059
// 0b: lload 0
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: getstatic su/catlean/et.P Lsu/catlean/et;
// 14: pop
// 15: astore 2
// 16: getstatic su/catlean/et.C Z
// 19: aload 2
// 1a: ifnonnull 2e
// 1d: ifne 31
// 20: goto 2d
// 23: ldc2_w -2330318683455739688
// 26: lload 0
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: bipush 1
// 2e: goto 32
// 31: bipush 0
// 32: putstatic su/catlean/et.C Z
// 35: getstatic su/catlean/et.C Z
// 38: aload 2
// 39: ifnonnull 5e
// 3c: ifeq 61
// 3f: goto 4c
// 42: ldc2_w -2330318683455739688
// 45: lload 0
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: getstatic su/catlean/et.P Lsu/catlean/et;
// 4f: pop
// 50: bipush 0
// 51: goto 5e
// 54: ldc2_w -2330318683455739688
// 57: lload 0
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: putstatic su/catlean/et.a I
// 61: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 64: areturn
}

private static final boolean a() {
long var0 = b ^ 15890803847115L;
String var2 = vm.a<"Å">(9059176317923049179L, var0);

try {
if (var2 != null) {
return d;
}

if (!d) {
return true;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, 8941654302746774374L, var0);
}

return false;
}

private static final Unit g() {
j.clear();
d = false;
C = false;
a = 0;
E = false;
return Unit.INSTANCE;
}

static {
long var20 = b ^ 61125639767691L;
long var22 = var20 ^ 138802566681300L;
long var24 = var20 ^ 1749143369611L;
long var26 = var20 ^ 19085136835674L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[13];
int var16 = 0;
String var15 = "ÂÇ¯®üÛ#¤\u0015Ü\u0010\u0083Lw\u008c_ 49\u0003ÿ×½[\tö7\"5Ö\u0082õÖ%\u00022ª\u000e²ùo\u001c\u009bÉ\u0088(q\bà ||-\t\u0085ðZÈ¡I\u001c¨mha¢{eç×wÝÅ÷\u0019o)\bb£TK B8PàT\u000b\u0090í\u0091g\u001f¯¿Ï7ÕfS¼û²7r¹\u0018 \u0095xí\u000b\u007fG\u0010\u008f°\u0084\u0011\u0006ôh\u0089W@åH\u00950¬ÿ8\tS\u00adä*O3M\u001fC ÑEª^\u0087´y%ZÅ6S\u0095\u008cZÅG`\u0016\u0081\u0093b×\u0096\u0017W\u0085&k÷Eà\u0099\u000b?u\u0091\u009e\u0094¶®±öWß($\u0096Ý\\\u009fl6ëzÝ\u0088\u0013\u008a¯\u0098\u0081ÓCÔ°Ò\u0015Âî\n\u008e¶{pÈ,?H\u001a\u009b§\u001eo\\\u0012\u0010£\u001dÊ\u00896®ÀH\u0080\t\u0012B2ägò@Aì¡\u0089\u0019_VÛ¾%`=ÒA~\u0012¾\u001a\u0013Ñ00£\u001c\u0011á¡BèÍ\u009c\u001eÂA\u0017ÞÄö\u0007©Í\\{\u000f ±Î±o©e\u000f.pÉ±©\u007fù\u008bQ¤[?\u0018Ù/-M,kT\u0004a\u0011^ImÕ\u0011,¥\u0086\u008bÅ\u0097u\u008c¾86I2\u0014UH-ßO\\ÚÒð\u0000æþ\u008c\u001at\u0091×\u0088)q\u0088î|nâ\u008b\u0096A¬ß\u0016°\u001c\u0098PDa¨Y{\u000eÿà=_\u0015>zökÿ\t";
int var17 = "ÂÇ¯®üÛ#¤\u0015Ü\u0010\u0083Lw\u008c_ 49\u0003ÿ×½[\tö7\"5Ö\u0082õÖ%\u00022ª\u000e²ùo\u001c\u009bÉ\u0088(q\bà ||-\t\u0085ðZÈ¡I\u001c¨mha¢{eç×wÝÅ÷\u0019o)\bb£TK B8PàT\u000b\u0090í\u0091g\u001f¯¿Ï7ÕfS¼û²7r¹\u0018 \u0095xí\u000b\u007fG\u0010\u008f°\u0084\u0011\u0006ôh\u0089W@åH\u00950¬ÿ8\tS\u00adä*O3M\u001fC ÑEª^\u0087´y%ZÅ6S\u0095\u008cZÅG`\u0016\u0081\u0093b×\u0096\u0017W\u0085&k÷Eà\u0099\u000b?u\u0091\u009e\u0094¶®±öWß($\u0096Ý\\\u009fl6ëzÝ\u0088\u0013\u008a¯\u0098\u0081ÓCÔ°Ò\u0015Âî\n\u008e¶{pÈ,?H\u001a\u009b§\u001eo\\\u0012\u0010£\u001dÊ\u00896®ÀH\u0080\t\u0012B2ägò@Aì¡\u0089\u0019_VÛ¾%`=ÒA~\u0012¾\u001a\u0013Ñ00£\u001c\u0011á¡BèÍ\u009c\u001eÂA\u0017ÞÄö\u0007©Í\\{\u000f ±Î±o©e\u000f.pÉ±©\u007fù\u008bQ¤[?\u0018Ù/-M,kT\u0004a\u0011^ImÕ\u0011,¥\u0086\u008bÅ\u0097u\u008c¾86I2\u0014UH-ßO\\ÚÒð\u0000æþ\u008c\u001at\u0091×\u0088)q\u0088î|nâ\u008b\u0096A¬ß\u0016°\u001c\u0098PDa¨Y{\u000eÿà=_\u0015>zökÿ\t"
.length();
char var14 = 16;
int var30 = -1;

label47:
while (true) {
String var31 = var15.substring(++var30, var30 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
String var40 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var40;
if ((var30 += var14) >= var17) {
e = var18;
f = new String[13];
Cipher var1;
var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[2];
int var4 = 0;
String var5 = "9\"\u0088\u0005\u009cV©\u00adÉé1\"Ó«\u000b\u0003";
int var6 = "9\"\u0088\u0005\u009cV©\u00adÉé1\"Ó«\u000b\u0003".length();
byte var3 = 0;

do {
var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
var10001 = var4++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var45 = -1;
var0[var10001] = var10004;
} while (var3 < var6);

KProperty[] var28 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(et.class, b<"l">(31207, 6811523541828845174L ^ var20), b<"l">(23353, 2927895679552494761L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(et.class, b<"l">(30831, 8109322662447759347L ^ var20), b<"l">(21586, 7739857450797241280L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(et.class, b<"l">(31620, 3538009082913864732L ^ var20), b<"l">(539, 6736721594221839750L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(et.class, b<"l">(30364, 5226772255402012935L ^ var20), b<"l">(32335, 4103526893962377681L ^ var20), 0))
};
g = var28;
P = new et(var24);
c = yp.y(P, b<"l">(9679, 2531852410420290133L ^ var20), et::E, var26, null, et::A, 4, null);
m = yp.y(P, b<"l">(8517, 2870838451557689041L ^ var20), et::K, var26, null, et::a, 4, null);
k = yp.y(P, b<"l">(16345, 8548883440907614278L ^ var20), et::g, var26, null, null, (int)var0[0], null);
I = yp.t(P, b<"l">(28084, 3479025062777236007L ^ var20), false, var22, null, null, (int)var0[1], null);
j = new LinkedHashMap();
return;
}

var14 = var15.charAt(var30);
break;
default:
var18[var16++] = var40;
if ((var30 += var14) < var17) {
var14 = var15.charAt(var30);
continue label47;
}

var15 = "äñ²\u0092\u0085Í\u009cÛ~ºí\u0007\u0095÷?æ\u0089\r_¦Ðj\u001f\rÌñ\u0007ûÞ ñ;\u0018Í½\r\u0010|í\u009fpí\u001da·É|§{õêý\u0006\u0019¾\u0087©";
var17 = "äñ²\u0092\u0085Í\u009cÛ~ºí\u0007\u0095÷?æ\u0089\r_¦Ðj\u001f\rÌñ\u0007ûÞ ñ;\u0018Í½\r\u0010|í\u009fpí\u001da·É|§{õêý\u0006\u0019¾\u0087©".length();
var14 = ' ';
var30 = -1;
}

var31 = var15.substring(++var30, var30 + var14);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21406;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/et", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = e[var5].getBytes("ISO-8859-1");
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/et" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
