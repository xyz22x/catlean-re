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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class lj {
@NotNull
public static final n0 K;
private int o;
private boolean Q;
private boolean C;
private static _g[] D;
private static final long a = yz.a(1958681444245326318L, 7049126197005911037L, MethodHandles.lookup().lookupClass()).a(4636725917268L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public lj(int key, boolean hold, boolean mouse) {
this.o = key;
this.Q = hold;
this.C = mouse;
}

public lj(int var1, boolean var2, long var3, boolean var5, int var6, DefaultConstructorMarker var7) {
var3 = a ^ var3;
if ((var6 & 1) != 0) {
var1 = -1;
}

if ((var6 & 2) != 0) {
var2 = false;
}

if ((var6 & 4) != 0) {
var5 = false;
}

this(var1, var2, var5);
}

public final int X() {
return this.o;
}

public final void D(int <set-?>) {
this.o = <set-?>;
}

public final boolean e() {
return this.Q;
}

public final void C(boolean <set-?>) {
this.Q = <set-?>;
}

public final boolean A() {
return this.C;
}

public final void m(boolean <set-?>) {
this.C = <set-?>;
}

public final int K() {
return this.o;
}

public final boolean x() {
return this.Q;
}

public final boolean Q() {
return this.C;
}

@NotNull
public final lj H(int key, boolean hold, boolean mouse) {
return new lj(key, hold, mouse);
}

public static lj t(lj param0, int param1, long param2, boolean param4, boolean param5, int param6, Object param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/lj.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w 3309840979125999451
// 09: lload 2
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 8
// 11: iload 6
// 13: bipush 1
// 14: iand
// 15: aload 8
// 17: ifnonnull 33
// 1a: ifeq 2f
// 1d: goto 2a
// 20: ldc2_w 3303446714971711582
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: aload 0
// 2b: getfield su/catlean/lj.o I
// 2e: istore 1
// 2f: iload 6
// 31: bipush 2
// 32: iand
// 33: aload 8
// 35: lload 2
// 36: lconst_0
// 37: lcmp
// 38: ifle 5a
// 3b: ifnonnull 58
// 3e: ifeq 54
// 41: goto 4e
// 44: ldc2_w 3303446714971711582
// 47: lload 2
// 48: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d: athrow
// 4e: aload 0
// 4f: getfield su/catlean/lj.Q Z
// 52: istore 4
// 54: iload 6
// 56: bipush 4
// 57: iand
// 58: aload 8
// 5a: ifnonnull 7e
// 5d: ifeq 80
// 60: goto 6d
// 63: ldc2_w 3303446714971711582
// 66: lload 2
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: aload 0
// 6e: getfield su/catlean/lj.C Z
// 71: goto 7e
// 74: ldc2_w 3303446714971711582
// 77: lload 2
// 78: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d: athrow
// 7e: istore 5
// 80: aload 0
// 81: iload 1
// 82: iload 4
// 84: iload 5
// 86: invokevirtual su/catlean/lj.H (IZZ)Lsu/catlean/lj;
// 89: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 37836914869121L;
boolean var3 = this.C;
boolean var4 = this.Q;
int var5 = this.o;
return a<"u">(12431, 3406157735280116862L ^ var1)
+ var5
+ a<"u">(27934, 3354244559173245421L ^ var1)
+ var4
+ a<"u">(30904, 2764951435285646408L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 32358024791400L;
int var3 = Integer.hashCode(this.o);
var3 = var3 * b<"z">(22786, 5647605171777237660L ^ var1) + Boolean.hashCode(this.Q);
return var3 * b<"z">(31947, 6516451625424443222L ^ var1) + Boolean.hashCode(this.C);
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
// 00: getstatic su/catlean/lj.a J
// 03: ldc2_w 121345742196618
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 7603402075950764849
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 7616269191850798132
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 7616269191850798132
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/lj
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 7616269191850798132
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 7616269191850798132
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/lj
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/lj.o I
// 65: aload 5
// 67: getfield su/catlean/lj.o I
// 6a: aload 4
// 6c: ifnonnull 94
// 6f: if_icmpeq 8b
// 72: goto 7f
// 75: ldc2_w 7616269191850798132
// 78: lload 2
// 79: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e: athrow
// 7f: bipush 0
// 80: ireturn
// 81: ldc2_w 7616269191850798132
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 0
// 8c: getfield su/catlean/lj.Q Z
// 8f: aload 5
// 91: getfield su/catlean/lj.Q Z
// 94: aload 4
// 96: ifnonnull d0
// 99: if_icmpeq b5
// 9c: goto a9
// 9f: ldc2_w 7616269191850798132
// a2: lload 2
// a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a8: athrow
// a9: bipush 0
// aa: ireturn
// ab: ldc2_w 7616269191850798132
// ae: lload 2
// af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b4: athrow
// b5: aload 0
// b6: getfield su/catlean/lj.C Z
// b9: aload 4
// bb: ifnonnull e0
// be: aload 5
// c0: getfield su/catlean/lj.C Z
// c3: goto d0
// c6: ldc2_w 7616269191850798132
// c9: lload 2
// ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cf: athrow
// d0: if_icmpeq df
// d3: bipush 0
// d4: ireturn
// d5: ldc2_w 7616269191850798132
// d8: lload 2
// d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// de: athrow
// df: bipush 1
// e0: ireturn
}

@JvmStatic
public static final void F(lj self, CompositeEncoder output, int a, byte a, SerialDescriptor serialDesc, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 56
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 5
// 010: i2l
// 011: bipush 40
// 013: lshl
// 014: bipush 40
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/lj.a J
// 01b: lxor
// 01c: lstore 6
// 01e: ldc2_w 8248335953711155394
// 021: lload 6
// 023: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: astore 8
// 02a: aload 1
// 02b: aload 4
// 02d: bipush 0
// 02e: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 033: aload 8
// 035: ifnonnull 05c
// 038: ifeq 058
// 03b: goto 049
// 03e: ldc2_w 8232897071557818311
// 041: lload 6
// 043: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: athrow
// 049: bipush 1
// 04a: goto 086
// 04d: ldc2_w 8232897071557818311
// 050: lload 6
// 052: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: athrow
// 058: aload 0
// 059: getfield su/catlean/lj.o I
// 05c: aload 8
// 05e: ifnonnull 082
// 061: bipush -1
// 062: if_icmpeq 085
// 065: goto 073
// 068: ldc2_w 8232897071557818311
// 06b: lload 6
// 06d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: athrow
// 073: bipush 1
// 074: goto 082
// 077: ldc2_w 8232897071557818311
// 07a: lload 6
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: goto 086
// 085: bipush 0
// 086: iload 3
// 087: iflt 0b1
// 08a: ifeq 0a8
// 08d: aload 1
// 08e: aload 4
// 090: bipush 0
// 091: aload 0
// 092: getfield su/catlean/lj.o I
// 095: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeIntElement (Lkotlinx/serialization/descriptors/SerialDescriptor;II)V 4
// 09a: goto 0a8
// 09d: ldc2_w 8232897071557818311
// 0a0: lload 6
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: aload 1
// 0a9: aload 4
// 0ab: bipush 1
// 0ac: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 0b1: aload 8
// 0b3: iload 2
// 0b4: ifle 0e1
// 0b7: ifnonnull 0df
// 0ba: ifeq 0da
// 0bd: goto 0cb
// 0c0: ldc2_w 8232897071557818311
// 0c3: lload 6
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: bipush 1
// 0cc: goto 0fa
// 0cf: ldc2_w 8232897071557818311
// 0d2: lload 6
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: aload 0
// 0db: getfield su/catlean/lj.Q Z
// 0de: nop
// 0df: aload 8
// 0e1: ifnonnull 0f6
// 0e4: ifeq 0f9
// 0e7: goto 0f5
// 0ea: ldc2_w 8232897071557818311
// 0ed: lload 6
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: bipush 1
// 0f6: goto 0fa
// 0f9: bipush 0
// 0fa: iload 3
// 0fb: ifle 125
// 0fe: ifeq 11c
// 101: aload 1
// 102: aload 4
// 104: bipush 1
// 105: aload 0
// 106: getfield su/catlean/lj.Q Z
// 109: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V 4
// 10e: goto 11c
// 111: ldc2_w 8232897071557818311
// 114: lload 6
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: aload 1
// 11d: aload 4
// 11f: bipush 2
// 120: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 125: aload 8
// 127: iload 5
// 129: ifle 156
// 12c: ifnonnull 154
// 12f: ifeq 14f
// 132: goto 140
// 135: ldc2_w 8232897071557818311
// 138: lload 6
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: bipush 1
// 141: goto 16f
// 144: ldc2_w 8232897071557818311
// 147: lload 6
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: aload 0
// 150: getfield su/catlean/lj.C Z
// 153: nop
// 154: aload 8
// 156: ifnonnull 16b
// 159: ifeq 16e
// 15c: goto 16a
// 15f: ldc2_w 8232897071557818311
// 162: lload 6
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: bipush 1
// 16b: goto 16f
// 16e: bipush 0
// 16f: ifeq 18d
// 172: aload 1
// 173: aload 4
// 175: bipush 2
// 176: aload 0
// 177: getfield su/catlean/lj.C Z
// 17a: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeBooleanElement (Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V 4
// 17f: goto 18d
// 182: ldc2_w 8232897071557818311
// 185: lload 6
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: return
}

public lj(int seen0, int key, boolean hold, long a, boolean mouse, SerializationConstructorMarker serializationConstructorMarker, byte a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 4
// 02: bipush 8
// 04: lshl
// 05: iload 8
// 07: i2l
// 08: bipush 56
// 0a: lshl
// 0b: bipush 56
// 0d: lushr
// 0e: lor
// 0f: getstatic su/catlean/lj.a J
// 12: lxor
// 13: lstore 9
// 15: ldc2_w -445421322034429084
// 18: lload 9
// 1a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: astore 11
// 21: bipush 0
// 22: iload 1
// 23: iand
// 24: ifeq 32
// 27: iload 1
// 28: bipush 0
// 29: getstatic su/catlean/ss.B Lsu/catlean/ss;
// 2c: invokevirtual su/catlean/ss.getDescriptor ()Lkotlinx/serialization/descriptors/SerialDescriptor;
// 2f: invokestatic kotlinx/serialization/internal/PluginExceptionsKt.throwMissingFieldException (IILkotlinx/serialization/descriptors/SerialDescriptor;)V
// 32: aload 0
// 33: invokespecial java/lang/Object.<init> ()V
// 36: aload 11
// 38: lload 4
// 3a: lconst_0
// 3b: lcmp
// 3c: ifle 64
// 3f: ifnonnull 5b
// 42: iload 1
// 43: bipush 1
// 44: iand
// 45: ifne 67
// 48: aload 0
// 49: bipush -1
// 4a: putfield su/catlean/lj.o I
// 4d: goto 5b
// 50: ldc2_w -439292040199062431
// 53: lload 9
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: lload 4
// 5d: lconst_0
// 5e: lcmp
// 5f: iflt 7a
// 62: aload 11
// 64: ifnull 7a
// 67: aload 0
// 68: iload 2
// 69: putfield su/catlean/lj.o I
// 6c: goto 7a
// 6f: ldc2_w -439292040199062431
// 72: lload 9
// 74: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79: athrow
// 7a: iload 8
// 7c: ifge a7
// 7f: iload 1
// 80: bipush 2
// 81: iand
// 82: ifne a2
// 85: aload 0
// 86: bipush 0
// 87: putfield su/catlean/lj.Q Z
// 8a: iload 8
// 8c: ifgt b5
// 8f: aload 11
// 91: ifnull b5
// 94: goto a2
// 97: ldc2_w -439292040199062431
// 9a: lload 9
// 9c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1: athrow
// a2: aload 0
// a3: iload 3
// a4: putfield su/catlean/lj.Q Z
// a7: goto b5
// aa: ldc2_w -439292040199062431
// ad: lload 9
// af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b4: athrow
// b5: lload 4
// b7: lconst_0
// b8: lcmp
// b9: ifle e0
// bc: iload 1
// bd: bipush 4
// be: iand
// bf: ifne da
// c2: aload 0
// c3: bipush 0
// c4: putfield su/catlean/lj.C Z
// c7: aload 11
// c9: ifnull ee
// cc: goto da
// cf: ldc2_w -439292040199062431
// d2: lload 9
// d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d9: athrow
// da: aload 0
// db: iload 6
// dd: putfield su/catlean/lj.C Z
// e0: goto ee
// e3: ldc2_w -439292040199062431
// e6: lload 9
// e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ed: athrow
// ee: return
}

public lj(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 97170269266985L;
this(0, false, var3, false, b<"z">(22453, 2538068239988447433L ^ var1), null);
}

static {
long var20 = a ^ 122685510858524L;
vm.a<"Å">(null, -7942016341100721451L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[3];
int var16 = 0;
String var15 = "Ð7\u008b\u0092\u001dèíeXLÒYï\u0015ÞØÕ\u0001PØ\u0092.<jµA\u009a¿\u00140jZ ¼ý°6e=Éib\u0095\u0014\u000f\u001d½\u008f½ru4¹@¬ùuê°\t7å4\u0018\u0090\u0010\u009d\u0004ýôíÄ\u0019h\u0018~lNÜ»\u0091f";
int var17 = "Ð7\u008b\u0092\u001dèíeXLÒYï\u0015ÞØÕ\u0001PØ\u0092.<jµA\u009a¿\u00140jZ ¼ý°6e=Éib\u0095\u0014\u000f\u001d½\u008f½ru4¹@¬ùuê°\t7å4\u0018\u0090\u0010\u009d\u0004ýôíÄ\u0019h\u0018~lNÜ»\u0091f"
.length();
char var14 = ' ';
int var13 = -1;

while (true) {
byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
String var27 = a(var19).intern();
int var10001 = -1;
var18[var16++] = var27;
if ((var13 += var14) >= var17) {
b = var18;
c = new String[3];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = " ~|öK\u009fDó\u0098eçª\u009b\u009dBn\u0000[:`©\u0095Cô";
int var5 = " ~|öK\u009fDó\u0098eçª\u009b\u009dBn\u0000[:`©\u0095Cô".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
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
byte var31 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[3];
K = new n0(null);
return;
}

var14 = var15.charAt(var13);
}
}

public static void P(_g[] var0) {
D = var0;
}

public static _g[] r() {
return D;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20529;
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
throw new RuntimeException("su/catlean/lj", var10);
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
throw new RuntimeException("su/catlean/lj" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18869;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/lj", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/lj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
