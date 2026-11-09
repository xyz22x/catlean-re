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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class ro extends ru {
@NotNull
private final a1 s;
@NotNull
private final fd k;
private static final long b = yz.a(4118071560996845179L, 1495304658521470147L, MethodHandles.lookup().lookupClass()).a(103115225670418L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map l;
private static final long m;

public ro(@NotNull a1 setting, long a) {
a = b ^ a;
long var4 = a ^ 91677227654272L;
long var6 = a ^ 41989885273836L;
Intrinsics.checkNotNullParameter(setting, a<"e">(32617, 4725541083488901685L ^ a));
super(var6, setting);
this.s = setting;
this.k = new fd(_s.OUT_QUINT, m, var4);
}

@NotNull
@Override
public a1 A() {
return this.s;
}

@Override
public void r(@NotNull class_332 context, int mouseX, int mouseY, long a, float factor) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 4
// 002: dup2
// 003: ldc2_w 49494862758009
// 006: lxor
// 007: lstore 7
// 009: dup2
// 00a: ldc2_w 20797107207379
// 00d: lxor
// 00e: dup2
// 00f: bipush 48
// 011: lushr
// 012: l2i
// 013: istore 9
// 015: dup2
// 016: bipush 16
// 018: lshl
// 019: bipush 48
// 01b: lushr
// 01c: l2i
// 01d: istore 10
// 01f: dup2
// 020: bipush 32
// 022: lshl
// 023: bipush 32
// 025: lushr
// 026: l2i
// 027: istore 11
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 39844814704388
// 02e: lxor
// 02f: lstore 12
// 031: dup2
// 032: ldc2_w 114903264084220
// 035: lxor
// 036: lstore 14
// 038: dup2
// 039: ldc2_w 136713714549074
// 03c: lxor
// 03d: lstore 16
// 03f: dup2
// 040: ldc2_w 126888773963804
// 043: lxor
// 044: lstore 18
// 046: pop2
// 047: aload 1
// 048: sipush 13619
// 04b: ldc2_w 360551213602271768
// 04e: lload 4
// 050: lxor
// 051: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/ro.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 059: aload 0
// 05a: ldc 14.0
// 05c: invokevirtual su/catlean/ro.m (F)V
// 05f: ldc2_w 6640577628623117237
// 062: lload 4
// 064: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: ldc ""
// 06b: astore 21
// 06d: fconst_0
// 06e: fstore 22
// 070: aload 0
// 071: invokevirtual su/catlean/ro.A ()Lsu/catlean/a1;
// 074: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 077: checkcast su/catlean/oi
// 07a: invokevirtual su/catlean/oi.o ()Ljava/lang/String;
// 07d: astore 23
// 07f: bipush 0
// 080: istore 24
// 082: astore 20
// 084: aload 23
// 086: invokevirtual java/lang/String.length ()I
// 089: istore 25
// 08b: iload 24
// 08d: iload 25
// 08f: if_icmpge 17f
// 092: aload 23
// 094: iload 24
// 096: invokevirtual java/lang/String.charAt (I)C
// 099: istore 26
// 09b: fload 22
// 09d: fconst_0
// 09e: fcmpg
// 09f: aload 20
// 0a1: ifnull 0b6
// 0a4: ifne 0b9
// 0a7: goto 0b5
// 0aa: ldc2_w 6656117372450338316
// 0ad: lload 4
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: bipush 1
// 0b6: goto 0ba
// 0b9: bipush 0
// 0ba: lload 4
// 0bc: lconst_0
// 0bd: lcmp
// 0be: iflt 0c6
// 0c1: ifeq 10b
// 0c4: iload 26
// 0c6: aload 20
// 0c8: ifnull 150
// 0cb: goto 0d9
// 0ce: ldc2_w 6656117372450338316
// 0d1: lload 4
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: sipush 19836
// 0dc: ldc2_w 1091498056399974597
// 0df: lload 4
// 0e1: lxor
// 0e2: invokedynamic n (IJ)I bsm=su/catlean/ro.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: if_icmpne 10b
// 0ea: goto 0f8
// 0ed: ldc2_w 6656117372450338316
// 0f0: lload 4
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: aload 20
// 0fa: ifnonnull 177
// 0fd: goto 10b
// 100: ldc2_w 6656117372450338316
// 103: lload 4
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: aload 21
// 10d: iload 26
// 10f: invokedynamic makeConcatWithConstants (Ljava/lang/String;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 114: astore 21
// 116: fload 22
// 118: lload 14
// 11a: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 11d: iload 26
// 11f: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
// 122: lload 16
// 124: dup2_x1
// 125: pop2
// 126: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 129: fadd
// 12a: fstore 22
// 12c: aload 20
// 12e: lload 4
// 130: lconst_0
// 131: lcmp
// 132: iflt 17c
// 135: ifnull 17a
// 138: fload 22
// 13a: aload 0
// 13b: invokevirtual su/catlean/ro.F ()F
// 13e: ldc 16.0
// 140: fsub
// 141: fcmpl
// 142: goto 150
// 145: ldc2_w 6656117372450338316
// 148: lload 4
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: iflt 177
// 153: aload 21
// 155: invokedynamic makeConcatWithConstants (Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\n" ]
// 15a: astore 21
// 15c: fconst_0
// 15d: fstore 22
// 15f: aload 0
// 160: aload 0
// 161: invokevirtual su/catlean/ro.d ()F
// 164: sipush 5104
// 167: ldc2_w 7144983311495278155
// 16a: lload 4
// 16c: lxor
// 16d: invokedynamic n (IJ)I bsm=su/catlean/ro.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: i2f
// 173: fadd
// 174: invokevirtual su/catlean/ro.m (F)V
// 177: iinc 24 1
// 17a: aload 20
// 17c: ifnonnull 08b
// 17f: aload 0
// 180: getfield su/catlean/ro.k Lsu/catlean/fd;
// 183: aload 0
// 184: invokevirtual su/catlean/ro.x ()F
// 187: fstore 23
// 189: aload 0
// 18a: invokevirtual su/catlean/ro.x ()F
// 18d: aload 0
// 18e: invokevirtual su/catlean/ro.F ()F
// 191: fadd
// 192: ldc 7.0
// 194: fsub
// 195: fstore 24
// 197: iload 2
// 198: i2f
// 199: fstore 25
// 19b: fload 23
// 19d: fload 25
// 19f: fcmpg
// 1a0: aload 20
// 1a2: lload 4
// 1a4: lconst_0
// 1a5: lcmp
// 1a6: iflt 1d2
// 1a9: ifnull 1d0
// 1ac: ifgt 1f9
// 1af: goto 1bd
// 1b2: ldc2_w 6656117372450338316
// 1b5: lload 4
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: fload 25
// 1bf: fload 24
// 1c1: fcmpg
// 1c2: goto 1d0
// 1c5: ldc2_w 6656117372450338316
// 1c8: lload 4
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: aload 20
// 1d2: ifnull 1f6
// 1d5: ifgt 1f5
// 1d8: goto 1e6
// 1db: ldc2_w 6656117372450338316
// 1de: lload 4
// 1e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e5: athrow
// 1e6: bipush 1
// 1e7: goto 1fa
// 1ea: ldc2_w 6656117372450338316
// 1ed: lload 4
// 1ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: athrow
// 1f5: bipush 0
// 1f6: goto 1fa
// 1f9: bipush 0
// 1fa: ifeq 285
// 1fd: aload 0
// 1fe: invokevirtual su/catlean/ro.R ()F
// 201: fstore 23
// 203: aload 0
// 204: invokevirtual su/catlean/ro.R ()F
// 207: aload 0
// 208: invokevirtual su/catlean/ro.d ()F
// 20b: fadd
// 20c: fconst_2
// 20d: fsub
// 20e: fstore 24
// 210: iload 3
// 211: i2f
// 212: fstore 25
// 214: fload 23
// 216: fload 25
// 218: fcmpg
// 219: aload 20
// 21b: lload 4
// 21d: lconst_0
// 21e: lcmp
// 21f: iflt 24b
// 222: ifnull 249
// 225: ifgt 272
// 228: goto 236
// 22b: ldc2_w 6656117372450338316
// 22e: lload 4
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: fload 25
// 238: fload 24
// 23a: fcmpg
// 23b: goto 249
// 23e: ldc2_w 6656117372450338316
// 241: lload 4
// 243: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 248: athrow
// 249: aload 20
// 24b: ifnull 26f
// 24e: ifgt 26e
// 251: goto 25f
// 254: ldc2_w 6656117372450338316
// 257: lload 4
// 259: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25e: athrow
// 25f: bipush 1
// 260: goto 273
// 263: ldc2_w 6656117372450338316
// 266: lload 4
// 268: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: athrow
// 26e: bipush 0
// 26f: goto 273
// 272: bipush 0
// 273: ifeq 285
// 276: fconst_1
// 277: goto 286
// 27a: ldc2_w 6656117372450338316
// 27d: lload 4
// 27f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: athrow
// 285: fconst_0
// 286: lload 12
// 288: dup2_x1
// 289: pop2
// 28a: invokevirtual su/catlean/fd.B (JF)V
// 28d: aload 0
// 28e: invokevirtual su/catlean/ro.x ()F
// 291: fstore 23
// 293: aload 0
// 294: invokevirtual su/catlean/ro.x ()F
// 297: aload 0
// 298: invokevirtual su/catlean/ro.F ()F
// 29b: fadd
// 29c: ldc 7.0
// 29e: fsub
// 29f: fstore 24
// 2a1: iload 2
// 2a2: i2f
// 2a3: fstore 25
// 2a5: fload 23
// 2a7: fload 25
// 2a9: fcmpg
// 2aa: aload 20
// 2ac: lload 4
// 2ae: lconst_0
// 2af: lcmp
// 2b0: iflt 2dc
// 2b3: ifnull 2da
// 2b6: ifgt 303
// 2b9: goto 2c7
// 2bc: ldc2_w 6656117372450338316
// 2bf: lload 4
// 2c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c6: athrow
// 2c7: fload 25
// 2c9: fload 24
// 2cb: fcmpg
// 2cc: goto 2da
// 2cf: ldc2_w 6656117372450338316
// 2d2: lload 4
// 2d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: athrow
// 2da: aload 20
// 2dc: ifnull 300
// 2df: ifgt 2ff
// 2e2: goto 2f0
// 2e5: ldc2_w 6656117372450338316
// 2e8: lload 4
// 2ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ef: athrow
// 2f0: bipush 1
// 2f1: goto 304
// 2f4: ldc2_w 6656117372450338316
// 2f7: lload 4
// 2f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fe: athrow
// 2ff: bipush 0
// 300: goto 304
// 303: bipush 0
// 304: ifeq 3dd
// 307: aload 0
// 308: invokevirtual su/catlean/ro.R ()F
// 30b: fstore 23
// 30d: aload 0
// 30e: invokevirtual su/catlean/ro.R ()F
// 311: aload 0
// 312: invokevirtual su/catlean/ro.d ()F
// 315: fadd
// 316: fconst_2
// 317: fsub
// 318: fstore 24
// 31a: iload 3
// 31b: i2f
// 31c: fstore 25
// 31e: fload 23
// 320: fload 25
// 322: fcmpg
// 323: aload 20
// 325: lload 4
// 327: lconst_0
// 328: lcmp
// 329: ifle 355
// 32c: ifnull 353
// 32f: ifgt 37c
// 332: goto 340
// 335: ldc2_w 6656117372450338316
// 338: lload 4
// 33a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33f: athrow
// 340: fload 25
// 342: fload 24
// 344: fcmpg
// 345: goto 353
// 348: ldc2_w 6656117372450338316
// 34b: lload 4
// 34d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 352: athrow
// 353: aload 20
// 355: ifnull 379
// 358: ifgt 378
// 35b: goto 369
// 35e: ldc2_w 6656117372450338316
// 361: lload 4
// 363: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 368: athrow
// 369: bipush 1
// 36a: goto 37d
// 36d: ldc2_w 6656117372450338316
// 370: lload 4
// 372: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 377: athrow
// 378: bipush 0
// 379: goto 37d
// 37c: bipush 0
// 37d: lload 4
// 37f: lconst_0
// 380: lcmp
// 381: ifle 38a
// 384: ifeq 3dd
// 387: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 38a: sipush 19327
// 38d: ldc2_w 7492558875410495169
// 390: lload 4
// 392: lxor
// 393: invokedynamic n (IJ)I bsm=su/catlean/ro.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 398: if_icmpeq 3dd
// 39b: goto 3a9
// 39e: ldc2_w 6656117372450338316
// 3a1: lload 4
// 3a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: athrow
// 3a9: lload 7
// 3ab: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3ae: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 3b1: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 3b4: sipush 8355
// 3b7: ldc2_w 407839356621823259
// 3ba: lload 4
// 3bc: lxor
// 3bd: invokedynamic n (IJ)I bsm=su/catlean/ro.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c2: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 3c5: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 3c8: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 3cb: bipush 0
// 3cc: invokevirtual su/catlean/fi.A (Z)V
// 3cf: goto 3dd
// 3d2: ldc2_w 6656117372450338316
// 3d5: lload 4
// 3d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3dc: athrow
// 3dd: aload 1
// 3de: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3e1: dup
// 3e2: sipush 30446
// 3e5: ldc2_w 9048650914348511687
// 3e8: lload 4
// 3ea: lxor
// 3eb: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/ro.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3f3: aload 0
// 3f4: invokevirtual su/catlean/ro.x ()F
// 3f7: iload 9
// 3f9: i2c
// 3fa: swap
// 3fb: aload 0
// 3fc: invokevirtual su/catlean/ro.R ()F
// 3ff: fconst_1
// 400: fsub
// 401: aload 0
// 402: invokevirtual su/catlean/ro.F ()F
// 405: ldc 7.0
// 407: fsub
// 408: aload 0
// 409: invokevirtual su/catlean/ro.d ()F
// 40c: fconst_1
// 40d: fsub
// 40e: ldc 3.0
// 410: ldc 2.5
// 412: aload 0
// 413: getfield su/catlean/ro.k Lsu/catlean/fd;
// 416: invokevirtual su/catlean/fd.a ()F
// 419: fconst_2
// 41a: fdiv
// 41b: fconst_1
// 41c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 41f: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 422: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 425: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 428: fconst_0
// 429: iload 10
// 42b: i2s
// 42c: fconst_0
// 42d: iload 11
// 42f: fconst_0
// 430: sipush 6209
// 433: ldc2_w 334259730470544891
// 436: lload 4
// 438: lxor
// 439: invokedynamic n (IJ)I bsm=su/catlean/ro.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43e: aconst_null
// 43f: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 442: lload 14
// 444: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 447: aload 1
// 448: aload 21
// 44a: aload 0
// 44b: invokevirtual su/catlean/ro.x ()F
// 44e: ldc 3.0
// 450: fadd
// 451: lload 18
// 453: dup2_x1
// 454: pop2
// 455: aload 0
// 456: invokevirtual su/catlean/ro.R ()F
// 459: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 45c: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 45f: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 462: return
}

@Override
public void W(long a, double mouseX, double mouseY, int button) {
}

@Override
public void U(double mouseX, double mouseY, int button) {
}

@Override
public void V(int key, short a, int a, char a) {
}

@Override
public void T(char char, long a) {
}

@Override
public boolean S(byte a, double mouseX, double mouseY, double verticalAmount, long a) {
return false;
}

@Override
public void L() {
}

static {
long var16 = b ^ 47077761500193L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[3];
int var23 = 0;
String var22 = "\u0095\u008b|}{½\u0088Hî@\u008e<ÜùíÅj'I7\u008dÓ¸G\"¿Ýj>\u0017pâ\u0010ë\u0013cáÂd\u0091ý<¸$ë¦þþ¯\u0010%o\u0014ýÕKä.X,Ð|d»|£";
int var24 = "\u0095\u008b|}{½\u0088Hî@\u008e<ÜùíÅj'I7\u008dÓ¸G\"¿Ýj>\u0017pâ\u0010ë\u0013cáÂd\u0091ý<¸$ë¦þþ¯\u0010%o\u0014ýÕKä.X,Ð|d»|£".length();
char var21 = ' ';
int var20 = -1;

while (true) {
byte[] var26 = var18.doFinal(var22.substring(++var20, var20 + var21).getBytes("ISO-8859-1"));
String var37 = b(var26).intern();
int var10001 = -1;
var25[var23++] = var37;
if ((var20 += var21) >= var24) {
d = var25;
e = new String[3];
l = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[5];
int var8 = 0;
String var9 = "\u00808È?\u000fmýzn\tWblX\u0018ñ=z\u0013b\u0084f\u0085´";
int var10 = "\u00808È?\u000fmýzn\tWblX\u0018ñ=z\u0013b\u0084f\u0085´".length();
byte var7 = 0;

label42:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var30 = var11;
var10001 = var8++;
long var40 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var45 = -1;

while (true) {
long var13 = var40;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var48 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var45) {
case 0:
var30[var10001] = var48;
if (var7 >= var10) {
g = var11;
h = new Integer[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -2404930731251096620L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var43 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var36 = -1;
m = var43;
return;
}
break;
default:
var30[var10001] = var48;
if (var7 < var10) {
continue label42;
}

var9 = "Îþ?ñg^ø\u001c-]\u0001À)I7è";
var10 = "Îþ?ñg^ø\u001c-]\u0001À)I7è".length();
var7 = 0;
}

byte var35 = var7;
var7 += 8;
var12 = var9.substring(var35, var7).getBytes("ISO-8859-1");
var30 = var11;
var10001 = var8++;
var40 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var45 = 0;
}
}
}

var21 = var22.charAt(var20);
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6681;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ro", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/ro" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24714;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ro", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/ro" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
