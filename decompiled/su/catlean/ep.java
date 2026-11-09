package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class ep extends _g {
@NotNull
public static final ep B;
static final KProperty[] O;
@NotNull
private static final cq k;
@NotNull
private static final ct f;
@NotNull
private static final cs L;
@Nullable
private static class_3965 l;
private static int T;
private static final long a = yz.a(-1836675845498752649L, -3731528914218140755L, MethodHandles.lookup().lookupClass()).a(52720611767574L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;

private ep(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 130324009702369L;
super(b<"a">(21158, 217585507987224210L ^ var4), jt.v(), null, 4, null, var6);
}

public final boolean j(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 41986419185009L;
String[] var8 = vm.a<"Å">(1839659887091561685L, var4);

try {
boolean var10000 = (Boolean)k.E(this, var6, O[0]);
if (var8 == null) {
vm.a<"Å">(new _g[1], 1752692932059665007L, var4);
}

return var10000;
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 1773537926085991069L, var4);
}
}

private final float z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 136896071864727L;
return ((Number)f.E(this, var3, O[1])).floatValue();
}

private final Color e(int var1, char var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 126383772723389L;
return (Color)L.E(this, var6, O[2]);
}

@Flow
private final void A(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ep.a J
// 003: ldc2_w 10278217697290
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 11437659037919
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 25410819476131
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 58378048640409
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 39757939032645
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 38104625774195
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 60884674895862
// 030: lxor
// 031: dup2
// 032: bipush 32
// 034: lushr
// 035: l2i
// 036: istore 14
// 038: dup2
// 039: bipush 32
// 03b: lshl
// 03c: bipush 32
// 03e: lushr
// 03f: lstore 15
// 041: pop2
// 042: dup2
// 043: ldc2_w 44897675612254
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 46799274842812
// 04d: lxor
// 04e: lstore 19
// 050: dup2
// 051: ldc2_w 122827793486207
// 054: lxor
// 055: dup2
// 056: bipush 8
// 058: lushr
// 059: lstore 21
// 05b: dup2
// 05c: bipush 56
// 05e: lshl
// 05f: bipush 56
// 061: lushr
// 062: l2i
// 063: istore 23
// 065: pop2
// 066: dup2
// 067: ldc2_w 47014862434041
// 06a: lxor
// 06b: lstore 24
// 06d: dup2
// 06e: ldc2_w 81310477237159
// 071: lxor
// 072: lstore 26
// 074: pop2
// 075: ldc2_w 9035550926977290294
// 078: lload 2
// 079: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: astore 28
// 080: getstatic su/catlean/ep.T I
// 083: aload 28
// 085: ifnull 09b
// 088: ifle 0a4
// 08b: goto 098
// 08e: ldc2_w 8971080303771106942
// 091: lload 2
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: getstatic su/catlean/ep.T I
// 09b: istore 29
// 09d: iload 29
// 09f: bipush -1
// 0a0: iadd
// 0a1: putstatic su/catlean/ep.T I
// 0a4: lload 4
// 0a6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a9: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 0ac: dup
// 0ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0b0: aload 0
// 0b1: lload 8
// 0b3: invokespecial su/catlean/ep.z (J)F
// 0b6: f2d
// 0b7: fconst_0
// 0b8: bipush 0
// 0b9: invokevirtual net/minecraft/class_1297.method_5745 (DFZ)Lnet/minecraft/class_239;
// 0bc: dup
// 0bd: sipush 28327
// 0c0: ldc2_w 270068798380684339
// 0c3: lload 2
// 0c4: lxor
// 0c5: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/ep.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0cd: astore 29
// 0cf: aload 29
// 0d1: aload 28
// 0d3: ifnull 0f8
// 0d6: instanceof net/minecraft/class_3965
// 0d9: ifeq 103
// 0dc: goto 0e9
// 0df: ldc2_w 8971080303771106942
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: aload 29
// 0eb: goto 0f8
// 0ee: ldc2_w 8971080303771106942
// 0f1: lload 2
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: checkcast net/minecraft/class_3965
// 0fb: putstatic su/catlean/ep.l Lnet/minecraft/class_3965;
// 0fe: aload 28
// 100: ifnonnull 10e
// 103: return
// 104: ldc2_w 8971080303771106942
// 107: lload 2
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: lload 17
// 110: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 113: getstatic su/catlean/ep.l Lnet/minecraft/class_3965;
// 116: dup
// 117: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 11a: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 11d: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 120: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 123: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 126: invokevirtual net/minecraft/class_2248.equals (Ljava/lang/Object;)Z
// 129: aload 28
// 12b: ifnull 14d
// 12e: ifne 13f
// 131: goto 13e
// 134: ldc2_w 8971080303771106942
// 137: lload 2
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: return
// 13f: lload 24
// 141: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 144: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 147: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 14a: instanceof net/minecraft/class_1747
// 14d: istore 30
// 14f: lload 24
// 151: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 154: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 157: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 15a: instanceof net/minecraft/class_1747
// 15d: istore 31
// 15f: lload 4
// 161: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 164: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 167: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
// 16a: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 16d: aload 28
// 16f: ifnull 184
// 172: ifeq 3ab
// 175: goto 182
// 178: ldc2_w 8971080303771106942
// 17b: lload 2
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: iload 30
// 184: aload 28
// 186: ifnull 1c0
// 189: ifne 1bd
// 18c: goto 199
// 18f: ldc2_w 8971080303771106942
// 192: lload 2
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: iload 31
// 19b: aload 28
// 19d: ifnull 1c0
// 1a0: goto 1ad
// 1a3: ldc2_w 8971080303771106942
// 1a6: lload 2
// 1a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: athrow
// 1ad: ifeq 3ab
// 1b0: goto 1bd
// 1b3: ldc2_w 8971080303771106942
// 1b6: lload 2
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: getstatic su/catlean/ep.T I
// 1c0: aload 28
// 1c2: ifnull 1eb
// 1c5: ifgt 3ab
// 1c8: goto 1d5
// 1cb: ldc2_w 8971080303771106942
// 1ce: lload 2
// 1cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d4: athrow
// 1d5: aload 0
// 1d6: lload 21
// 1d8: iload 23
// 1da: i2b
// 1db: invokevirtual su/catlean/ep.j (JB)Z
// 1de: goto 1eb
// 1e1: ldc2_w 8971080303771106942
// 1e4: lload 2
// 1e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ea: athrow
// 1eb: aload 28
// 1ed: ifnull 202
// 1f0: ifeq 2d6
// 1f3: goto 200
// 1f6: ldc2_w 8971080303771106942
// 1f9: lload 2
// 1fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ff: athrow
// 200: iload 30
// 202: ifeq 215
// 205: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 208: goto 218
// 20b: ldc2_w 8971080303771106942
// 20e: lload 2
// 20f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 214: athrow
// 215: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 218: fconst_0
// 219: lload 12
// 21b: fconst_0
// 21c: sipush 30447
// 21f: ldc2_w 402933065408571206
// 222: lload 2
// 223: lxor
// 224: invokedynamic p (IJ)I bsm=su/catlean/ep.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: aconst_null
// 22a: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 22d: pop
// 22e: new net/minecraft/class_2846
// 231: dup
// 232: getstatic net/minecraft/class_2846$class_2847.field_12969 Lnet/minecraft/class_2846$class_2847;
// 235: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
// 238: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 23b: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 23e: checkcast net/minecraft/class_2596
// 241: lload 19
// 243: dup2_x1
// 244: pop2
// 245: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 248: iload 14
// 24a: lload 15
// 24c: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 24f: lload 24
// 251: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 254: iload 30
// 256: ifeq 269
// 259: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 25c: goto 26c
// 25f: ldc2_w 8971080303771106942
// 262: lload 2
// 263: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 268: athrow
// 269: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 26c: getstatic su/catlean/ep.l Lnet/minecraft/class_3965;
// 26f: dup
// 270: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 273: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
// 276: pop
// 277: lload 24
// 279: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 27c: iload 30
// 27e: ifeq 291
// 281: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 284: goto 294
// 287: ldc2_w 8971080303771106942
// 28a: lload 2
// 28b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 290: athrow
// 291: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 294: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 297: new net/minecraft/class_2846
// 29a: dup
// 29b: getstatic net/minecraft/class_2846$class_2847.field_12969 Lnet/minecraft/class_2846$class_2847;
// 29e: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
// 2a1: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 2a4: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 2a7: checkcast net/minecraft/class_2596
// 2aa: lload 19
// 2ac: dup2_x1
// 2ad: pop2
// 2ae: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 2b1: lload 24
// 2b3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2b6: iload 30
// 2b8: ifeq 2cb
// 2bb: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 2be: goto 2ce
// 2c1: ldc2_w 8971080303771106942
// 2c4: lload 2
// 2c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ca: athrow
// 2cb: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 2ce: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 2d1: aload 28
// 2d3: ifnonnull 332
// 2d6: iload 14
// 2d8: lload 15
// 2da: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 2dd: lload 24
// 2df: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e2: iload 30
// 2e4: ifeq 304
// 2e7: goto 2f4
// 2ea: ldc2_w 8971080303771106942
// 2ed: lload 2
// 2ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f3: athrow
// 2f4: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 2f7: goto 307
// 2fa: ldc2_w 8971080303771106942
// 2fd: lload 2
// 2fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 303: athrow
// 304: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 307: getstatic su/catlean/ep.l Lnet/minecraft/class_3965;
// 30a: dup
// 30b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 30e: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
// 311: pop
// 312: lload 24
// 314: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 317: iload 30
// 319: ifeq 32c
// 31c: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 31f: goto 32f
// 322: ldc2_w 8971080303771106942
// 325: lload 2
// 326: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32b: athrow
// 32c: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 32f: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 332: getstatic su/catlean/ey.e Lsu/catlean/ey;
// 335: lload 26
// 337: invokevirtual su/catlean/ey.f (J)Z
// 33a: aload 28
// 33c: ifnull 364
// 33f: ifeq 3a7
// 342: goto 34f
// 345: ldc2_w 8971080303771106942
// 348: lload 2
// 349: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34e: athrow
// 34f: getstatic su/catlean/ey.e Lsu/catlean/ey;
// 352: lload 10
// 354: invokevirtual su/catlean/ey.F (J)Z
// 357: goto 364
// 35a: ldc2_w 8971080303771106942
// 35d: lload 2
// 35e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 363: athrow
// 364: aload 28
// 366: ifnull 3a4
// 369: ifne 3a3
// 36c: goto 379
// 36f: ldc2_w 8971080303771106942
// 372: lload 2
// 373: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 378: athrow
// 379: getstatic su/catlean/ey.e Lsu/catlean/ey;
// 37c: lload 6
// 37e: invokevirtual su/catlean/ey.a (J)Z
// 381: aload 28
// 383: ifnull 3a4
// 386: goto 393
// 389: ldc2_w 8971080303771106942
// 38c: lload 2
// 38d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 392: athrow
// 393: ifeq 3a7
// 396: goto 3a3
// 399: ldc2_w 8971080303771106942
// 39c: lload 2
// 39d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a2: athrow
// 3a3: bipush 0
// 3a4: goto 3a8
// 3a7: bipush 4
// 3a8: putstatic su/catlean/ep.T I
// 3ab: return
}

@Flow
private final void h(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ep.a J
// 003: ldc2_w 140331651969955
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 65561552147387
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 103547798973431
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 85294816761626
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 111169275388997
// 03c: lxor
// 03d: dup2
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: dup2
// 045: bipush 16
// 047: lshl
// 048: bipush 32
// 04a: lushr
// 04b: l2i
// 04c: istore 12
// 04e: dup2
// 04f: bipush 48
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 13
// 058: pop2
// 059: dup2
// 05a: ldc2_w 47106250507255
// 05d: lxor
// 05e: lstore 14
// 060: dup2
// 061: ldc2_w 101404579157328
// 064: lxor
// 065: lstore 16
// 067: pop2
// 068: ldc2_w -8733096183256765537
// 06b: lload 2
// 06c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: astore 18
// 073: aload 18
// 075: ifnull 171
// 078: getstatic su/catlean/ep.l Lnet/minecraft/class_3965;
// 07b: dup
// 07c: ifnull 170
// 07f: goto 08c
// 082: ldc2_w -8658494665554639401
// 085: lload 2
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: astore 19
// 08e: bipush 0
// 08f: istore 20
// 091: lload 16
// 093: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 096: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 099: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 09c: instanceof net/minecraft/class_1747
// 09f: istore 21
// 0a1: lload 16
// 0a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a6: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 0a9: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0ac: instanceof net/minecraft/class_1747
// 0af: istore 22
// 0b1: new net/minecraft/class_238
// 0b4: dup
// 0b5: aload 19
// 0b7: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 0ba: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 0bd: astore 23
// 0bf: lload 6
// 0c1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0c4: aload 19
// 0c6: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 0c9: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0cc: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0cf: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 0d2: invokevirtual net/minecraft/class_2248.equals (Ljava/lang/Object;)Z
// 0d5: aload 18
// 0d7: ifnull 0ec
// 0da: ifeq 125
// 0dd: goto 0ea
// 0e0: ldc2_w -8658494665554639401
// 0e3: lload 2
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: iload 21
// 0ec: aload 18
// 0ee: ifnull 16c
// 0f1: ifne 126
// 0f4: goto 101
// 0f7: ldc2_w -8658494665554639401
// 0fa: lload 2
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: iload 22
// 103: aload 18
// 105: ifnull 16c
// 108: goto 115
// 10b: ldc2_w -8658494665554639401
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: ifne 126
// 118: goto 125
// 11b: ldc2_w -8658494665554639401
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: return
// 126: lload 4
// 128: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 12b: aload 23
// 12d: getstatic su/catlean/ep.B Lsu/catlean/ep;
// 130: iload 8
// 132: iload 9
// 134: i2c
// 135: iload 10
// 137: i2c
// 138: invokespecial su/catlean/ep.e (ICC)Ljava/awt/Color;
// 13b: aconst_null
// 13c: bipush 4
// 13d: aconst_null
// 13e: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 141: pop
// 142: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 145: lload 14
// 147: aload 23
// 149: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 14c: getstatic su/catlean/ep.B Lsu/catlean/ep;
// 14f: iload 8
// 151: iload 9
// 153: i2c
// 154: iload 10
// 156: i2c
// 157: invokespecial su/catlean/ep.e (ICC)Ljava/awt/Color;
// 15a: iload 11
// 15c: i2c
// 15d: iload 12
// 15f: fconst_1
// 160: iload 13
// 162: i2s
// 163: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 166: aconst_null
// 167: bipush 4
// 168: aconst_null
// 169: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 16c: pop
// 16d: goto 172
// 170: pop
// 171: nop
// 172: return
}

static {
long var20 = a ^ 9552620376485L;
long var22 = var20 ^ 31552591801509L;
long var10001 = var20 ^ 104463234159261L;
int var24 = (int)((var20 ^ 104463234159261L) >>> 48);
int var25 = (int)((var20 ^ 104463234159261L) << 16 >>> 48);
int var26 = (int)(var10001 << 32 >>> 32);
long var27 = var20 ^ 49176512930539L;
int var29 = (int)((var20 ^ 104036435290238L) >>> 48);
long var30 = (var20 ^ 104036435290238L) << 16 >>> 16;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[11];
int var16 = 0;
String var15 = "æE\u00015/ßë!\u0093J'ÿÏ\u0017\\|\u0018Ær´ö\u0012Y\u0089\u008fe\u0090ÿ\u001cY/ÿ\u0089)\u000f,^\u007f¸\u0019\u0007\u0018n[÷,i3À\b\u000b.\u001eÔè\u00ad\u0095qZrsÕ~$F¾\u0010\tì\u0083\u0089ê¾êÇ¥E÷nÁÆAä\u0018Í#\u009c*\u0007\u0098Èù(\u0090\u008bD\u0081\f\u008c)\u0094\u0093\u001bÖ\u0000\u009fh\r\u0010P6y\u0004,E=J¿÷\u008dÝ\u0001V\b¿8I®\u009bj-Ç\u009b¾¤]\u008cs<)m\u008c6s`Rÿìð}SF\u008b=\u0098ö\u009a\u0086&\u008e\u0080Æ\u0083ÊF»q§½\u0089Ñþª ó/Æ\u009c¹.Ý¡ 8\u009cí°Í\u000eÉîÎ\u0097ó;¥£E\u0083\u009f\u001d\f\u001f\u0086á2g®uÜ\u0085wò\u0098O\u0010ËÆ{\u0089°\u0012ts¹Ø\u0099\u009aoüCN";
int var17 = "æE\u00015/ßë!\u0093J'ÿÏ\u0017\\|\u0018Ær´ö\u0012Y\u0089\u008fe\u0090ÿ\u001cY/ÿ\u0089)\u000f,^\u007f¸\u0019\u0007\u0018n[÷,i3À\b\u000b.\u001eÔè\u00ad\u0095qZrsÕ~$F¾\u0010\tì\u0083\u0089ê¾êÇ¥E÷nÁÆAä\u0018Í#\u009c*\u0007\u0098Èù(\u0090\u008bD\u0081\f\u008c)\u0094\u0093\u001bÖ\u0000\u009fh\r\u0010P6y\u0004,E=J¿÷\u008dÝ\u0001V\b¿8I®\u009bj-Ç\u009b¾¤]\u008cs<)m\u008c6s`Rÿìð}SF\u008b=\u0098ö\u009a\u0086&\u008e\u0080Æ\u0083ÊF»q§½\u0089Ñþª ó/Æ\u009c¹.Ý¡ 8\u009cí°Í\u000eÉîÎ\u0097ó;¥£E\u0083\u009f\u001d\f\u001f\u0086á2g®uÜ\u0085wò\u0098O\u0010ËÆ{\u0089°\u0012ts¹Ø\u0099\u009aoüCN"
.length();
char var14 = 16;
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
byte var40 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var48 = b(var19).intern();
switch (var40) {
case 0:
var18[var16++] = var48;
if ((var35 += var14) >= var17) {
b = var18;
c = new String[11];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[8];
int var3 = 0;
String var4 = "\u0086T\u0015gÔ¬Nß\u00897\u0081\u0016\u001e\u009c¨\u0019RäÏw\u001a§sw\u00138Þ\u0082\u001bZ\u009f¾ï·ù:âd$%\u0015ÿxÃ\u0017UaV";
int var5 = "\u0086T\u0015gÔ¬Nß\u00897\u0081\u0016\u001e\u009c¨\u0019RäÏw\u001a§sw\u00138Þ\u0082\u001bZ\u009f¾ï·ù:âd$%\u0015ÿxÃ\u0017UaV".length();
byte var2 = 0;

label36:
while (true) {
byte var44 = var2;
var2 += 8;
byte[] var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
int var45 = var3++;
long var52 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var55 = -1;

while (true) {
long var8 = var52;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var57 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var55) {
case 0:
var39[var45] = var57;
if (var2 >= var5) {
e = var6;
g = new Integer[8];
KProperty[] var32 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ep.class, b<"a">(10370, 316118922093620159L ^ var20), b<"a">(3694, 2552301164170366288L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ep.class, b<"a">(12479, 8430421546629657475L ^ var20), b<"a">(13756, 7006991630019196554L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ep.class, b<"a">(3017, 2158028060337490163L ^ var20), b<"a">(22317, 2873673935258358804L ^ var20), 0))
};
O = var32;
B = new ep((short)var24, (char)var25, var26);
k = yp.t(B, b<"a">(15895, 2737941923808017704L ^ var20), true, var27, null, null, c<"p">(20612, 1293170758567254144L ^ var20), null);
f = yp.k(
B, b<"a">(16942, 820951702102442265L ^ var20), 5.0F, var22, RangesKt.rangeTo(0.0F, 6.0F), null, null, c<"p">(21301, 8519687701324618551L ^ var20), null
);
L = yp.b(
B,
(short)var29,
b<"a">(3049, 1691075648704858321L ^ var20),
new Color(
c<"p">(3199, 2741749812088439934L ^ var20),
c<"p">(29816, 4021628891403025531L ^ var20),
c<"p">(32541, 5225989467824387869L ^ var20),
c<"p">(11687, 962141303992362400L ^ var20)
),
null,
null,
c<"p">(1139, 8880343427658845302L ^ var20),
null,
var30
);
return;
}
break;
default:
var39[var45] = var57;
if (var2 < var5) {
continue label36;
}

var4 = "W\u0086\u0086Æ\u000fÄ\u001aq%Sÿ<´\u000f0Ù";
var5 = "W\u0086\u0086Æ\u000fÄ\u001aq%Sÿ<´\u000f0Ù".length();
var2 = 0;
}

byte var46 = var2;
var2 += 8;
var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
var39 = var6;
var45 = var3++;
var52 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var55 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var48;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = ":ì¿\u0099ßØ³f7\\²/¾£á\u0015è\u009eÀ\u0091Y+âÈ \u0095\"ü\tQµ+ÚoKZÊÿ\u0085WKý\u008f2\u0015Á\u008c5Q×\n\"\u0017GÞÒ\u0015";
var17 = ":ì¿\u0099ßØ³f7\\²/¾£á\u0015è\u009eÀ\u0091Y+âÈ \u0095\"ü\tQµ+ÚoKZÊÿ\u0085WKý\u008f2\u0015Á\u008c5Q×\n\"\u0017GÞÒ\u0015".length();
var14 = 24;
var35 = -1;
}

var36 = var15.substring(++var35, var35 + var14);
var40 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9990;
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
throw new RuntimeException("su/catlean/ep", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/ep" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27708;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
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
throw new RuntimeException("su/catlean/ep", var14);
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
throw new RuntimeException("su/catlean/ep" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
