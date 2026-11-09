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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class ua extends _g {
@NotNull
public static final ua c;
static final KProperty[] D;
@NotNull
private static final c8 k;
private static int m;
private static final long a = yz.a(-4643199976723717207L, 38002085032241359L, MethodHandles.lookup().lookupClass()).a(108338135319869L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private ua(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 134893615556769L;
super(b<"l">(8835, 5103152211918465089L ^ var1), jt.Q(), null, 4, null, var3);
}

private final int a(int var1, int var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 3965669544959L;
return ((Number)k.E(this, var6, D[0])).intValue();
}

@Flow
private final void t(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ua.a J
// 003: ldc2_w 35935779415109
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 132468059907153
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 5290623907367
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 8
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 63065478099006
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 94961437374835
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 102819315854554
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 114144740573795
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 36699875991183
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 113810907903526
// 04d: lxor
// 04e: lstore 19
// 050: pop2
// 051: aload 1
// 052: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 055: astore 22
// 057: ldc2_w 7330642960763921898
// 05a: lload 2
// 05b: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: aload 22
// 062: astore 23
// 064: bipush 0
// 065: istore 24
// 067: astore 21
// 069: aload 23
// 06b: instanceof net/minecraft/class_2824
// 06e: aload 21
// 070: ifnull 0b1
// 073: ifeq 2d4
// 076: goto 083
// 079: ldc2_w 7270768504304150513
// 07c: lload 2
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 086: aload 23
// 088: checkcast net/minecraft/class_2824
// 08b: aload 21
// 08d: ifnull 0c9
// 090: goto 09d
// 093: ldc2_w 7270768504304150513
// 096: lload 2
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: lload 9
// 09f: dup2_x1
// 0a0: pop2
// 0a1: invokevirtual su/catlean/u2.E (JLnet/minecraft/class_2824;)Z
// 0a4: goto 0b1
// 0a7: ldc2_w 7270768504304150513
// 0aa: lload 2
// 0ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: athrow
// 0b1: ifeq 2d4
// 0b4: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 0b7: aload 23
// 0b9: checkcast net/minecraft/class_2824
// 0bc: goto 0c9
// 0bf: ldc2_w 7270768504304150513
// 0c2: lload 2
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: lload 11
// 0cb: dup2_x1
// 0cc: pop2
// 0cd: invokevirtual su/catlean/u2.G (JLnet/minecraft/class_2824;)Lnet/minecraft/class_1297;
// 0d0: astore 25
// 0d2: aload 21
// 0d4: ifnull 2d6
// 0d7: aload 25
// 0d9: ifnull 2d5
// 0dc: goto 0e9
// 0df: ldc2_w 7270768504304150513
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: aload 25
// 0eb: instanceof net/minecraft/class_1511
// 0ee: aload 21
// 0f0: ifnull 118
// 0f3: goto 100
// 0f6: ldc2_w 7270768504304150513
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: ifeq 113
// 103: goto 110
// 106: ldc2_w 7270768504304150513
// 109: lload 2
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: goto 2d5
// 113: aload 25
// 115: instanceof net/minecraft/class_1657
// 118: aload 21
// 11a: ifnull 142
// 11d: ifeq 146
// 120: goto 12d
// 123: ldc2_w 7270768504304150513
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: aload 25
// 12f: checkcast net/minecraft/class_1657
// 132: invokevirtual net/minecraft/class_1657.method_6039 ()Z
// 135: goto 142
// 138: ldc2_w 7270768504304150513
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: ifeq 146
// 145: return
// 146: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 149: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/ua.j (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 14e: lload 4
// 150: dup2_x1
// 151: pop2
// 152: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 155: astore 26
// 157: aload 26
// 159: invokevirtual su/catlean/fg.R ()Z
// 15c: aload 21
// 15e: ifnull 189
// 161: ifeq 2d4
// 164: goto 171
// 167: ldc2_w 7270768504304150513
// 16a: lload 2
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: lload 19
// 173: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 176: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 179: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 17c: goto 189
// 17f: ldc2_w 7270768504304150513
// 182: lload 2
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: aload 21
// 18b: ifnull 1c6
// 18e: aload 26
// 190: invokevirtual su/catlean/fg.a ()I
// 193: if_icmpeq 1c9
// 196: goto 1a3
// 199: ldc2_w 7270768504304150513
// 19c: lload 2
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 26
// 1a5: lload 13
// 1a7: invokevirtual su/catlean/fg.x (J)V
// 1aa: getstatic su/catlean/ua.c Lsu/catlean/ua;
// 1ad: pop
// 1ae: lload 19
// 1b0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b3: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1b6: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 1b9: goto 1c6
// 1bc: ldc2_w 7270768504304150513
// 1bf: lload 2
// 1c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: athrow
// 1c6: putstatic su/catlean/ua.m I
// 1c9: getstatic su/catlean/ua.c Lsu/catlean/ua;
// 1cc: lload 17
// 1ce: invokespecial su/catlean/ua.V (J)Lnet/minecraft/class_243;
// 1d1: astore 27
// 1d3: getstatic su/catlean/ua.c Lsu/catlean/ua;
// 1d6: lload 19
// 1d8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1db: iload 6
// 1dd: i2b
// 1de: swap
// 1df: lload 7
// 1e1: dup2_x1
// 1e2: pop2
// 1e3: checkcast net/minecraft/class_1297
// 1e6: invokevirtual su/catlean/ua.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1e9: aload 27
// 1eb: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 1ee: dstore 28
// 1f0: aload 21
// 1f2: ifnull 2a2
// 1f5: getstatic su/catlean/ua.c Lsu/catlean/ua;
// 1f8: lload 19
// 1fa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1fd: iload 6
// 1ff: i2b
// 200: swap
// 201: lload 7
// 203: dup2_x1
// 204: pop2
// 205: checkcast net/minecraft/class_1297
// 208: invokevirtual su/catlean/ua.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 20b: aload 27
// 20d: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 210: ldc2_w 10.0
// 213: dcmpl
// 214: ifle 279
// 217: goto 224
// 21a: ldc2_w 7270768504304150513
// 21d: lload 2
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: dload 28
// 226: ldc2_w 10.0
// 229: ddiv
// 22a: invokestatic java/lang/Math.abs (D)D
// 22d: invokestatic java/lang/Math.ceil (D)D
// 230: d2i
// 231: istore 30
// 233: bipush 0
// 234: istore 31
// 236: iload 31
// 238: iload 30
// 23a: if_icmpge 279
// 23d: iload 31
// 23f: istore 32
// 241: bipush 0
// 242: istore 33
// 244: new net/minecraft/class_2828$class_5911
// 247: dup
// 248: bipush 0
// 249: lload 19
// 24b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 24e: getfield net/minecraft/class_746.field_5976 Z
// 251: invokespecial net/minecraft/class_2828$class_5911.<init> (ZZ)V
// 254: checkcast net/minecraft/class_2596
// 257: lload 15
// 259: dup2_x1
// 25a: pop2
// 25b: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 25e: nop
// 25f: iinc 31 1
// 262: aload 21
// 264: ifnull 2a2
// 267: aload 21
// 269: ifnonnull 236
// 26c: goto 279
// 26f: ldc2_w 7270768504304150513
// 272: lload 2
// 273: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 278: athrow
// 279: new net/minecraft/class_2828$class_2829
// 27c: dup
// 27d: aload 27
// 27f: getfield net/minecraft/class_243.field_1352 D
// 282: aload 27
// 284: getfield net/minecraft/class_243.field_1351 D
// 287: aload 27
// 289: getfield net/minecraft/class_243.field_1350 D
// 28c: bipush 0
// 28d: lload 19
// 28f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 292: getfield net/minecraft/class_746.field_5976 Z
// 295: invokespecial net/minecraft/class_2828$class_2829.<init> (DDDZZ)V
// 298: checkcast net/minecraft/class_2596
// 29b: lload 15
// 29d: dup2_x1
// 29e: pop2
// 29f: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 2a2: new net/minecraft/class_2828$class_2829
// 2a5: dup
// 2a6: lload 19
// 2a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2ab: invokevirtual net/minecraft/class_746.method_23317 ()D
// 2ae: lload 19
// 2b0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2b3: invokevirtual net/minecraft/class_746.method_23318 ()D
// 2b6: lload 19
// 2b8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2bb: invokevirtual net/minecraft/class_746.method_23321 ()D
// 2be: bipush 0
// 2bf: lload 19
// 2c1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c4: getfield net/minecraft/class_746.field_5976 Z
// 2c7: invokespecial net/minecraft/class_2828$class_2829.<init> (DDDZZ)V
// 2ca: checkcast net/minecraft/class_2596
// 2cd: lload 15
// 2cf: dup2_x1
// 2d0: pop2
// 2d1: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 2d4: nop
// 2d5: nop
// 2d6: return
}

@Flow
private final void S(AfterSendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ua.a J
// 03: ldc2_w 139780561541105
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 95166909337624
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 55351591047345
// 14: lxor
// 15: dup2
// 16: bipush 48
// 18: lushr
// 19: l2i
// 1a: istore 6
// 1c: dup2
// 1d: bipush 16
// 1f: lshl
// 20: bipush 48
// 22: lushr
// 23: l2i
// 24: istore 7
// 26: dup2
// 27: bipush 32
// 29: lshl
// 2a: bipush 32
// 2c: lushr
// 2d: l2i
// 2e: istore 8
// 30: pop2
// 31: pop2
// 32: ldc2_w 1589756792268084830
// 35: lload 2
// 36: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: aload 1
// 3c: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 3f: astore 10
// 41: aload 10
// 43: astore 11
// 45: astore 9
// 47: bipush 0
// 48: istore 12
// 4a: aload 9
// 4c: ifnull d2
// 4f: aload 11
// 51: instanceof net/minecraft/class_2824
// 54: ifeq d0
// 57: goto 64
// 5a: ldc2_w 1680593496300311621
// 5d: lload 2
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 67: iload 6
// 69: i2s
// 6a: iload 7
// 6c: i2s
// 6d: iload 8
// 6f: aload 11
// 71: checkcast net/minecraft/class_2824
// 74: invokevirtual su/catlean/u2.V (SSILnet/minecraft/class_2824;)Lnet/minecraft/class_2824$class_5907;
// 77: getstatic net/minecraft/class_2824$class_5907.field_29172 Lnet/minecraft/class_2824$class_5907;
// 7a: if_acmpne d0
// 7d: goto 8a
// 80: ldc2_w 1680593496300311621
// 83: lload 2
// 84: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: athrow
// 8a: getstatic su/catlean/ua.m I
// 8d: aload 9
// 8f: ifnull cd
// 92: goto 9f
// 95: ldc2_w 1680593496300311621
// 98: lload 2
// 99: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e: athrow
// 9f: bipush -1
// a0: if_icmpeq d0
// a3: goto b0
// a6: ldc2_w 1680593496300311621
// a9: lload 2
// aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af: athrow
// b0: getstatic su/catlean/gg.P Lsu/catlean/gg;
// b3: getstatic su/catlean/ua.m I
// b6: lload 4
// b8: invokevirtual su/catlean/gg.f (IJ)V
// bb: getstatic su/catlean/ua.c Lsu/catlean/ua;
// be: pop
// bf: bipush -1
// c0: goto cd
// c3: ldc2_w 1680593496300311621
// c6: lload 2
// c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cc: athrow
// cd: putstatic su/catlean/ua.m I
// d0: nop
// d1: nop
// d2: return
}

private final class_243 V(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ua.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 105515832043940
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 3
// 012: dup2
// 013: bipush 8
// 015: lshl
// 016: bipush 8
// 018: lushr
// 019: lstore 4
// 01b: pop2
// 01c: dup2
// 01d: ldc2_w 28723965825018
// 020: lxor
// 021: lstore 6
// 023: dup2
// 024: ldc2_w 62455695205437
// 027: lxor
// 028: dup2
// 029: bipush 32
// 02b: lushr
// 02c: l2i
// 02d: istore 8
// 02f: dup2
// 030: bipush 32
// 032: lshl
// 033: bipush 48
// 035: lushr
// 036: l2i
// 037: istore 9
// 039: dup2
// 03a: bipush 48
// 03c: lshl
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 10
// 043: pop2
// 044: dup2
// 045: ldc2_w 66770279950757
// 048: lxor
// 049: lstore 11
// 04b: pop2
// 04c: aload 0
// 04d: lload 11
// 04f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 052: iload 3
// 053: i2b
// 054: swap
// 055: lload 4
// 057: dup2_x1
// 058: pop2
// 059: checkcast net/minecraft/class_1297
// 05c: invokevirtual su/catlean/ua.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 05f: astore 14
// 061: ldc2_w -5027996483519972759
// 064: lload 1
// 065: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: bipush 2
// 06b: istore 15
// 06d: astore 13
// 06f: aload 0
// 070: iload 8
// 072: iload 9
// 074: iload 10
// 076: invokespecial su/catlean/ua.a (III)I
// 079: bipush 2
// 07a: idiv
// 07b: istore 16
// 07d: iload 15
// 07f: iload 16
// 081: if_icmpgt 182
// 084: getstatic su/catlean/la.l Lsu/catlean/la;
// 087: aload 0
// 088: lload 11
// 08a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 08d: iload 3
// 08e: i2b
// 08f: swap
// 090: lload 4
// 092: dup2_x1
// 093: pop2
// 094: checkcast net/minecraft/class_1297
// 097: invokevirtual su/catlean/ua.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 09a: aload 0
// 09b: lload 11
// 09d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a0: iload 3
// 0a1: i2b
// 0a2: swap
// 0a3: lload 4
// 0a5: dup2_x1
// 0a6: pop2
// 0a7: checkcast net/minecraft/class_1297
// 0aa: invokevirtual su/catlean/ua.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0ad: dconst_0
// 0ae: iload 15
// 0b0: i2d
// 0b1: ldc2_w 1.8
// 0b4: dmul
// 0b5: dconst_0
// 0b6: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0b9: dup
// 0ba: sipush 26302
// 0bd: ldc2_w 5948947625723178696
// 0c0: lload 1
// 0c1: lxor
// 0c2: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/ua.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ca: bipush 0
// 0cb: aconst_null
// 0cc: bipush 0
// 0cd: sipush 3537
// 0d0: ldc2_w 3490800924052196287
// 0d3: lload 1
// 0d4: lxor
// 0d5: invokedynamic r (IJ)I bsm=su/catlean/ua.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: aconst_null
// 0db: lload 6
// 0dd: invokestatic su/catlean/la.R (Lsu/catlean/la;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZLjava/util/List;ZILjava/lang/Object;J)Lnet/minecraft/class_3965;
// 0e0: ifnonnull 141
// 0e3: goto 0f0
// 0e6: ldc2_w -4943353330651334542
// 0e9: lload 1
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: aload 0
// 0f1: lload 11
// 0f3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f6: iload 3
// 0f7: i2b
// 0f8: swap
// 0f9: lload 4
// 0fb: dup2_x1
// 0fc: pop2
// 0fd: checkcast net/minecraft/class_1297
// 100: invokevirtual su/catlean/ua.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 103: dconst_0
// 104: iload 15
// 106: bipush 1
// 107: isub
// 108: i2d
// 109: ldc2_w 1.8
// 10c: dmul
// 10d: dconst_0
// 10e: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 111: dup
// 112: sipush 24631
// 115: ldc2_w 513269812633774148
// 118: lload 1
// 119: lxor
// 11a: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/ua.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 122: lload 1
// 123: lconst_0
// 124: lcmp
// 125: iflt 184
// 128: astore 14
// 12a: aload 13
// 12c: ifnull 182
// 12f: aload 13
// 131: ifnonnull 153
// 134: goto 141
// 137: ldc2_w -4943353330651334542
// 13a: lload 1
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: aload 13
// 143: ifnonnull 182
// 146: goto 153
// 149: ldc2_w -4943353330651334542
// 14c: lload 1
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: iload 15
// 155: iload 16
// 157: if_icmpeq 182
// 15a: goto 167
// 15d: ldc2_w -4943353330651334542
// 160: lload 1
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: iinc 15 1
// 16a: aload 13
// 16c: ifnonnull 084
// 16f: lload 1
// 170: lconst_0
// 171: lcmp
// 172: ifle 12a
// 175: goto 182
// 178: ldc2_w -4943353330651334542
// 17b: lload 1
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: aload 14
// 184: areturn
}

private static final boolean j(class_1799 var0) {
long var1 = a ^ 70959726014215L;
Intrinsics.checkNotNullParameter(var0, b<"l">(28925, 5825566863532436555L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_49814);
}

static {
long var20 = a ^ 18839870619029L;
long var22 = var20 ^ 138795973605165L;
long var24 = var20 ^ 82155559601645L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[7];
int var16 = 0;
String var15 = "Äa\u00007m}¤l\u0018¥Þ¤n»'\u0018\u0010Û7»n>\u0005F\u0099éï!c\u008dûÏ¤\u0010\rmY× ¶\u0091rJêÃ\u00879\u0087Èd\u0018\u0095\u0001Äâ%)ÝC\u0004\u009eÞ\u000b\u008a$\u0084\u0094À¡\u0089ÌXEÔk ØÙ$tö5D\nÆ\u0014¡í\u0093t;\u0019\bG\u008dg\u001eýsu1\u0007\u0092\u008b\u001dµG@";
int var17 = "Äa\u00007m}¤l\u0018¥Þ¤n»'\u0018\u0010Û7»n>\u0005F\u0099éï!c\u008dûÏ¤\u0010\rmY× ¶\u0091rJêÃ\u00879\u0087Èd\u0018\u0095\u0001Äâ%)ÝC\u0004\u009eÞ\u000b\u008a$\u0084\u0094À¡\u0089ÌXEÔk ØÙ$tö5D\nÆ\u0014¡í\u0093t;\u0019\bG\u008dg\u001eýsu1\u0007\u0092\u008b\u001dµG@"
.length();
char var14 = 16;
int var29 = -1;

label54:
while (true) {
String var30 = var15.substring(++var29, var29 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
String var41 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var41;
if ((var29 += var14) >= var17) {
b = var18;
d = new String[7];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "\u008d\u0017\u0006\u009c`<ÈH\r>¡nÿ\u0094~Ä";
int var5 = "\u008d\u0017\u0006\u009c`<ÈH\r>¡nÿ\u0094~Ä".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var33 = var6;
var10001 = var3++;
long var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var48 = -1;

while (true) {
long var8 = var45;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var50 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var48) {
case 0:
var33[var10001] = var50;
if (var2 >= var5) {
f = var6;
g = new Integer[4];
KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ua.class, b<"l">(7644, 2246344242779116539L ^ var20), b<"l">(12166, 5869584370050785700L ^ var20), 0))
};
D = var26;
c = new ua(var24);
k = yp.L(
c,
b<"l">(17596, 7802048731671235226L ^ var20),
c<"r">(16661, 3701197530060079403L ^ var20),
new IntRange(0, c<"r">(29140, 7632279056763056616L ^ var20)),
var22,
null,
null,
c<"r">(1002, 6767784133933269973L ^ var20),
null
);
m = -1;
return;
}
break;
default:
var33[var10001] = var50;
if (var2 < var5) {
continue label36;
}

var4 = "\u001aÔV\u000eÃ\u008f$\u008d_èl)ñh&4";
var5 = "\u001aÔV\u000eÃ\u008f$\u008d_èl)ñh&4".length();
var2 = 0;
}

byte var39 = var2;
var2 += 8;
var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
var33 = var6;
var10001 = var3++;
var45 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var48 = 0;
}
}
}

var14 = var15.charAt(var29);
break;
default:
var18[var16++] = var41;
if ((var29 += var14) < var17) {
var14 = var15.charAt(var29);
continue label54;
}

var15 = "ÓI\u0090Ð¡öS\u000e7\u009e¥4\u0013\u0087²\u0087\u009fè±D¿~\u000fê×]¸RþSÕ\n\u0018HµAj#\u009c;)¤\u0002Îëõ\u0010¥`\u001e#\"k¡\u0005¿²";
var17 = "ÓI\u0090Ð¡öS\u000e7\u009e¥4\u0013\u0087²\u0087\u009fè±D¿~\u000fê×]¸RþSÕ\n\u0018HµAj#\u009c;)¤\u0002Îëõ\u0010¥`\u001e#\"k¡\u0005¿²".length();
var14 = ' ';
var29 = -1;
}

var30 = var15.substring(++var29, var29 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29375;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ua", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/ua" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 15527;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ua", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ua" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
