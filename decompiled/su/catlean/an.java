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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class an {
@NotNull
public static final or f;
@Nullable
private final String S;
@Nullable
private final String j;
@Nullable
private final String m;
@Nullable
private final String d;
private static final long a = yz.a(8149197362178782050L, 7180011240225930749L, MethodHandles.lookup().lookupClass()).a(280768235004888L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

public an(@Nullable String largeImage, @Nullable String largeText, @Nullable String smallImage, @Nullable String smallText) {
this.S = largeImage;
this.j = largeText;
this.m = smallImage;
this.d = smallText;
}

@Nullable
public final String y() {
return this.S;
}

@Nullable
public final String m() {
return this.j;
}

@Nullable
public final String G() {
return this.m;
}

@Nullable
public final String C() {
return this.d;
}

@Nullable
public final String E() {
return this.S;
}

@Nullable
public final String z() {
return this.j;
}

@Nullable
public final String U() {
return this.m;
}

@Nullable
public final String b() {
return this.d;
}

@NotNull
public final an G(@Nullable String largeImage, @Nullable String largeText, @Nullable String smallImage, @Nullable String smallText) {
return new an(largeImage, largeText, smallImage, smallText);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static an h(an var0, String var1, String var2, long var3, String var5, String var6, int var7, Object var8) {
var3 = a ^ var3;
_g[] var9 = vm.a<"Å">(-6194945343935950637L, var3);

int var10000;
label65: {
label64: {
try {
var10000 = var7 & 1;
if (var9 == null) {
break label65;
}

if (var10000 == 0) {
break label64;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -6192363433341286300L, var3);
}

var1 = var0.S;
}

var10000 = var7 & 2;
}

_g[] var10001;
label56: {
label55: {
label54: {
try {
var10001 = var9;
if (var3 <= 0L) {
break label56;
}

if (var9 == null) {
break label55;
}

if (var10000 == 0) {
break label54;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -6192363433341286300L, var3);
}

var2 = var0.j;
}

var10000 = var7 & 4;
}

try {
var10001 = var9;
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -6192363433341286300L, var3);
}
}

label43: {
label42: {
try {
if (var10001 == null) {
break label43;
}

if (var10000 == 0) {
break label42;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -6192363433341286300L, var3);
}

var5 = var0.m;
}

var10000 = var7 & b<"k">(26938, 2147256535287335483L ^ var3);
}

if (var10000 != 0) {
var6 = var0.d;
}

return var0.G(var1, var2, var5, var6);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 64448561980129L;
String var3 = this.d;
String var4 = this.m;
String var5 = this.j;
String var6 = this.S;
return a<"v">(3999, 7816117505982342110L ^ var1)
+ var6
+ a<"v">(7173, 5734709966242820165L ^ var1)
+ var5
+ a<"v">(14381, 5946170888806306926L ^ var1)
+ var4
+ a<"v">(9633, 3392804173393562083L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/an.a J
// 003: ldc2_w 79833367506667
// 006: lxor
// 007: lstore 1
// 008: ldc2_w 3684330692924819957
// 00b: lload 1
// 00c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 3
// 012: aload 0
// 013: getfield su/catlean/an.S Ljava/lang/String;
// 016: aload 3
// 017: ifnull 03c
// 01a: ifnonnull 038
// 01d: goto 02a
// 020: ldc2_w 3690193511861555522
// 023: lload 1
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 0
// 02b: goto 03f
// 02e: ldc2_w 3690193511861555522
// 031: lload 1
// 032: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: athrow
// 038: aload 0
// 039: getfield su/catlean/an.S Ljava/lang/String;
// 03c: invokevirtual java/lang/String.hashCode ()I
// 03f: istore 4
// 041: iload 4
// 043: sipush 7677
// 046: ldc2_w 9082642921094408158
// 049: lload 1
// 04a: lxor
// 04b: invokedynamic k (IJ)I bsm=su/catlean/an.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: imul
// 051: aload 0
// 052: getfield su/catlean/an.j Ljava/lang/String;
// 055: aload 3
// 056: ifnull 07b
// 059: ifnonnull 077
// 05c: goto 069
// 05f: ldc2_w 3690193511861555522
// 062: lload 1
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: bipush 0
// 06a: goto 07e
// 06d: ldc2_w 3690193511861555522
// 070: lload 1
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: aload 0
// 078: getfield su/catlean/an.j Ljava/lang/String;
// 07b: invokevirtual java/lang/String.hashCode ()I
// 07e: iadd
// 07f: istore 4
// 081: iload 4
// 083: sipush 23945
// 086: ldc2_w 6173211597624616875
// 089: lload 1
// 08a: lxor
// 08b: invokedynamic k (IJ)I bsm=su/catlean/an.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: imul
// 091: aload 0
// 092: getfield su/catlean/an.m Ljava/lang/String;
// 095: aload 3
// 096: ifnull 0bb
// 099: ifnonnull 0b7
// 09c: goto 0a9
// 09f: ldc2_w 3690193511861555522
// 0a2: lload 1
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: bipush 0
// 0aa: goto 0be
// 0ad: ldc2_w 3690193511861555522
// 0b0: lload 1
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: aload 0
// 0b8: getfield su/catlean/an.m Ljava/lang/String;
// 0bb: invokevirtual java/lang/String.hashCode ()I
// 0be: iadd
// 0bf: istore 4
// 0c1: iload 4
// 0c3: sipush 23945
// 0c6: ldc2_w 6173211597624616875
// 0c9: lload 1
// 0ca: lxor
// 0cb: invokedynamic k (IJ)I bsm=su/catlean/an.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: imul
// 0d1: aload 0
// 0d2: getfield su/catlean/an.d Ljava/lang/String;
// 0d5: aload 3
// 0d6: ifnull 0fb
// 0d9: ifnonnull 0f7
// 0dc: goto 0e9
// 0df: ldc2_w 3690193511861555522
// 0e2: lload 1
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: bipush 0
// 0ea: goto 0fe
// 0ed: ldc2_w 3690193511861555522
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: aload 0
// 0f8: getfield su/catlean/an.d Ljava/lang/String;
// 0fb: invokevirtual java/lang/String.hashCode ()I
// 0fe: iadd
// 0ff: istore 4
// 101: iload 4
// 103: ireturn
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
// 000: getstatic su/catlean/an.a J
// 003: ldc2_w 37045775675878
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 7794664516361656056
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 7798926515088641615
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 7798926515088641615
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnull 05c
// 03c: instanceof su/catlean/an
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 7798926515088641615
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 7798926515088641615
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/an
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/an.S Ljava/lang/String;
// 065: aload 5
// 067: getfield su/catlean/an.S Ljava/lang/String;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnull 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w 7798926515088641615
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 7798926515088641615
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/an.j Ljava/lang/String;
// 092: aload 5
// 094: getfield su/catlean/an.j Ljava/lang/String;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: aload 4
// 09c: ifnull 0c7
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 7798926515088641615
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 7798926515088641615
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/an.m Ljava/lang/String;
// 0bf: aload 5
// 0c1: getfield su/catlean/an.m Ljava/lang/String;
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c7: aload 4
// 0c9: ifnull 0f4
// 0cc: ifne 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 7798926515088641615
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 7798926515088641615
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/an.d Ljava/lang/String;
// 0ec: aload 5
// 0ee: getfield su/catlean/an.d Ljava/lang/String;
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f4: aload 4
// 0f6: ifnull 116
// 0f9: ifne 115
// 0fc: goto 109
// 0ff: ldc2_w 7798926515088641615
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 7798926515088641615
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: bipush 1
// 116: ireturn
}

@JvmStatic
public static final void G(an self, CompositeEncoder output, SerialDescriptor serialDesc) {
output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.S);
output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.j);
output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.m);
output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.d);
}

public an(
int seen0,
String largeImage,
short a,
String largeText,
String smallImage,
int a,
String smallText,
SerializationConstructorMarker serializationConstructorMarker,
char a
) {
long var10 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
if (b<"k">(13712, 4032093019296140949L ^ var10) != (b<"k">(8600, 4269841826240141980L ^ var10) & seen0)) {
PluginExceptionsKt.throwMissingFieldException(seen0, b<"k">(8600, 4269841826240141980L ^ var10), lf.H.getDescriptor());
}

super();
this.S = largeImage;
this.j = largeText;
this.m = smallImage;
this.d = smallText;
}

static {
long var11 = a ^ 100384199851021L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[4];
int var18 = 0;
String var17 = "#_Ï<¸¯\u0011\u0082è>«t>¢ng*ÏÐj;û\u0014`5¤et\u0085ûv\u007f\tw\u001cx§±\u008ahlp|M\u0001\u0016ü± \u0016©e(\u001e\u008b\u008b`åJ§ûcÖ|Îûxe^çÎ;«<\u0004õ8fcQ!";
int var19 = "#_Ï<¸¯\u0011\u0082è>«t>¢ng*ÏÐj;û\u0014`5¤et\u0085ûv\u007f\tw\u001cx§±\u008ahlp|M\u0001\u0016ü± \u0016©e(\u001e\u008b\u008b`åJ§ûcÖ|Îûxe^çÎ;«<\u0004õ8fcQ!"
.length();
char var16 = '0';
int var24 = -1;

label54:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var36;
if ((var24 += var16) >= var19) {
b = var20;
c = new String[4];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "²åã\t SÑø\u0014k\u000eHW\u0084pý9\b\u001a*\u008aÖ¤\t";
int var5 = "²åã\t SÑø\u0014k\u000eHW\u0084pý9\b\u001a*\u008aÖ¤\t".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
g = var6;
h = new Integer[5];
f = new or(null);
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "Ã/\u001a\u000eï(\u000e\u007f³ç,\u0094·»M\\";
var5 = "Ã/\u001a\u000eï(\u000e\u007f³ç,\u0094·»M\\".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var36;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label54;
}

var17 = "WáÙÙkÀÒÆ©MX>Ó>þSh\u001fBZÈémÛ G@DD>oð\u008e²5\u0089+àNõ¾0 EÅÐx\u008bíÅqÉ6¤ì?v";
var19 = "WáÙÙkÀÒÆ©MX>Ó>þSh\u001fBZÈémÛ G@DD>oð\u008e²5\u0089+àNõ¾0 EÅÐx\u008bíÅqÉ6¤ì?v".length();
var16 = 24;
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20997;
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
throw new RuntimeException("su/catlean/an", var10);
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
throw new RuntimeException("su/catlean/an" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18541;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/an", var14);
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
throw new RuntimeException("su/catlean/an" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
