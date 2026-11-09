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
public final class d_ {
@NotNull
public static final c3 r;
private float H;
private float I;
private static final long a = yz.a(7129025222538082336L, 4935707233595164357L, MethodHandles.lookup().lookupClass()).a(101694394552199L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

public d_(float x, float y) {
this.H = x;
this.I = y;
}

public d_(int var1, float var2, float var3, int var4, DefaultConstructorMarker var5, int var6) {
long var7 = ((long)var1 << 32 | (long)var6 << 32 >>> 32) ^ a;
if ((var4 & 1) != 0) {
var2 = 0.5F;
}

if ((var4 & 2) != 0) {
var3 = 0.5F;
}

this(var2, var3);
}

public final float C() {
return this.H;
}

public final void y(float <set-?>) {
this.H = <set-?>;
}

public final float c() {
return this.I;
}

public final void J(float <set-?>) {
this.I = <set-?>;
}

public final float G() {
return this.H;
}

public final float P() {
return this.I;
}

@NotNull
public final d_ m(float x, float y) {
return new d_(x, y);
}

public static d_ D(d_ var0, float var1, float var2, int var3, long var4, Object var6) {
var4 = a ^ var4;
_g[] var7 = vm.a<"Å">(-4094112085556462181L, var4);

int var10000;
label25: {
label24: {
try {
var10000 = var3 & 1;
if (var7 != null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -4037947764366936939L, var4);
}

var1 = var0.H;
}

var10000 = var3 & 2;
}

if (var10000 != 0) {
var2 = var0.I;
}

return var0.m(var1, var2);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 126365811796436L;
float var10000 = this.H;
float var10001 = this.I;
return a<"s">(15628, 6803637108100067483L ^ var1) + var10000 + a<"s">(28940, 4413341727980174490L ^ var1) + var10001 + ")";
}

@Override
public int hashCode() {
long var1 = a ^ 890749828987L;
int var3 = Float.hashCode(this.H);
return var3 * (int)e + Float.hashCode(this.I);
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
// 00: getstatic su/catlean/d_.a J
// 03: ldc2_w 54733178359974
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 4023640159958273379
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 3967194295476782189
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 3967194295476782189
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/d_
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 3967194295476782189
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 3967194295476782189
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/d_
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/d_.H F
// 65: aload 5
// 67: getfield su/catlean/d_.H F
// 6a: invokestatic java/lang/Float.compare (FF)I
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifeq 8e
// 75: goto 82
// 78: ldc2_w 3967194295476782189
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 3967194295476782189
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/d_.I F
// 92: aload 5
// 94: getfield su/catlean/d_.I F
// 97: invokestatic java/lang/Float.compare (FF)I
// 9a: aload 4
// 9c: ifnonnull bc
// 9f: ifeq bb
// a2: goto af
// a5: ldc2_w 3967194295476782189
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 3967194295476782189
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: ireturn
}

@JvmStatic
public static final void I(long a, d_ self, CompositeEncoder output, SerialDescriptor serialDesc) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/d_.a J
// 03: lload 0
// 04: lxor
// 05: lstore 0
// 06: ldc2_w 6936310127944882935
// 09: lload 0
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 5
// 11: aload 3
// 12: aload 4
// 14: bipush 0
// 15: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 1a: aload 5
// 1c: ifnonnull 46
// 1f: ifeq 3d
// 22: goto 2f
// 25: ldc2_w 6960911456045880313
// 28: lload 0
// 29: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: athrow
// 2f: bipush 1
// 30: goto 60
// 33: ldc2_w 6960911456045880313
// 36: lload 0
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: aload 2
// 3e: getfield su/catlean/d_.H F
// 41: ldc 0.5
// 43: invokestatic java/lang/Float.compare (FF)I
// 46: aload 5
// 48: ifnonnull 5c
// 4b: ifeq 5f
// 4e: goto 5b
// 51: ldc2_w 6960911456045880313
// 54: lload 0
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: bipush 1
// 5c: goto 60
// 5f: bipush 0
// 60: lload 0
// 61: lconst_0
// 62: lcmp
// 63: ifle 8c
// 66: ifeq 83
// 69: aload 3
// 6a: aload 4
// 6c: bipush 0
// 6d: aload 2
// 6e: getfield su/catlean/d_.H F
// 71: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeFloatElement (Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V 4
// 76: goto 83
// 79: ldc2_w 6960911456045880313
// 7c: lload 0
// 7d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82: athrow
// 83: aload 3
// 84: aload 4
// 86: bipush 1
// 87: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.shouldEncodeElementDefault (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z 3
// 8c: aload 5
// 8e: lload 0
// 8f: lconst_0
// 90: lcmp
// 91: iflt c0
// 94: ifnonnull be
// 97: ifeq b5
// 9a: goto a7
// 9d: ldc2_w 6960911456045880313
// a0: lload 0
// a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: athrow
// a7: bipush 1
// a8: goto d8
// ab: ldc2_w 6960911456045880313
// ae: lload 0
// af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b4: athrow
// b5: aload 2
// b6: getfield su/catlean/d_.I F
// b9: ldc 0.5
// bb: invokestatic java/lang/Float.compare (FF)I
// be: aload 5
// c0: ifnonnull d4
// c3: ifeq d7
// c6: goto d3
// c9: ldc2_w 6960911456045880313
// cc: lload 0
// cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d2: athrow
// d3: bipush 1
// d4: goto d8
// d7: bipush 0
// d8: ifeq f5
// db: aload 3
// dc: aload 4
// de: bipush 1
// df: aload 2
// e0: getfield su/catlean/d_.I F
// e3: invokeinterface kotlinx/serialization/encoding/CompositeEncoder.encodeFloatElement (Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V 4
// e8: goto f5
// eb: ldc2_w 6960911456045880313
// ee: lload 0
// ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f4: athrow
// f5: return
}

public d_(int seen0, float x, short a, int a, float y, int a, SerializationConstructorMarker serializationConstructorMarker) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 3
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 4
// 07: i2l
// 08: bipush 32
// 0a: lshl
// 0b: bipush 16
// 0d: lushr
// 0e: lor
// 0f: iload 6
// 11: i2l
// 12: bipush 48
// 14: lshl
// 15: bipush 48
// 17: lushr
// 18: lor
// 19: getstatic su/catlean/d_.a J
// 1c: lxor
// 1d: lstore 8
// 1f: ldc2_w 5948394425362638905
// 22: lload 8
// 24: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: astore 10
// 2b: bipush 0
// 2c: iload 1
// 2d: iand
// 2e: ifeq 3c
// 31: iload 1
// 32: bipush 0
// 33: getstatic su/catlean/yc.k Lsu/catlean/yc;
// 36: invokevirtual su/catlean/yc.getDescriptor ()Lkotlinx/serialization/descriptors/SerialDescriptor;
// 39: invokestatic kotlinx/serialization/internal/PluginExceptionsKt.throwMissingFieldException (IILkotlinx/serialization/descriptors/SerialDescriptor;)V
// 3c: aload 0
// 3d: invokespecial java/lang/Object.<init> ()V
// 40: aload 10
// 42: iload 3
// 43: iflt 6a
// 46: ifnonnull 63
// 49: iload 1
// 4a: bipush 1
// 4b: iand
// 4c: ifne 6d
// 4f: aload 0
// 50: ldc 0.5
// 52: putfield su/catlean/d_.H F
// 55: goto 63
// 58: ldc2_w 5932481438681260343
// 5b: lload 8
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: iload 6
// 65: iflt 80
// 68: aload 10
// 6a: ifnull 80
// 6d: aload 0
// 6e: fload 2
// 6f: putfield su/catlean/d_.H F
// 72: goto 80
// 75: ldc2_w 5932481438681260343
// 78: lload 8
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: iload 3
// 81: iflt a9
// 84: iload 1
// 85: bipush 2
// 86: iand
// 87: ifne a3
// 8a: aload 0
// 8b: ldc 0.5
// 8d: putfield su/catlean/d_.I F
// 90: aload 10
// 92: ifnull b7
// 95: goto a3
// 98: ldc2_w 5932481438681260343
// 9b: lload 8
// 9d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a2: athrow
// a3: aload 0
// a4: fload 5
// a6: putfield su/catlean/d_.I F
// a9: goto b7
// ac: ldc2_w 5932481438681260343
// af: lload 8
// b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b6: athrow
// b7: return
}

public d_(long var1) {
var1 = a ^ var1;
int var3 = (int)((var1 ^ 138393852029368L) >>> 32);
int var4 = (int)((var1 ^ 138393852029368L) << 32 >>> 32);
this(var3, 0.0F, 0.0F, 3, null, var4);
}

static {
long var5 = a ^ 78616500035681L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[2];
int var12 = 0;
String var11 = "\u0081OR³Qm¤(\tË_+\u0001uÐú(o\u009a\u0013t/>yZJK\u009d\u0085}Ì@¯>L\u007fÅ\u0092ó\"\u009b'ÐÎ%\u0085vI\u0016RÜÎ\u0081\u0080\u009a]®";
int var13 = "\u0081OR³Qm¤(\tË_+\u0001uÐú(o\u009a\u0013t/>yZJK\u009d\u0085}Ì@¯>L\u007fÅ\u0092ó\"\u009b'ÐÎ%\u0085vI\u0016RÜÎ\u0081\u0080\u009a]®".length();
char var10 = 16;
int var9 = -1;

while (true) {
byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
String var20 = a(var15).intern();
byte var10001 = -1;
var14[var12++] = var20;
if ((var9 += var10) >= var13) {
b = var14;
c = new String[2];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 5779866279921614930L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var23 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var23;
r = new c3(null);
return;
}

var10 = var11.charAt(var9);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17021;
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
throw new RuntimeException("su/catlean/d_", var10);
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
throw new RuntimeException("su/catlean/d_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
