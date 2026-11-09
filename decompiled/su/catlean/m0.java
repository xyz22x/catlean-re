package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;

public enum m0 {
@NotNull
private final class_1792 D;
@NotNull
private final class_1792 o;
@NotNull
private final class_1792 y;
public static final m0 SPEED;
public static final m0 STRENGTH;
public static final m0 FIRE_RESISTANCE;
public static final m0 INVISIBILITY;
private static int E;

private m0(class_1792 var3, class_1792 var4, class_1792 var5) {
this.D = var3;
this.o = var4;
this.y = var5;
}

@NotNull
public final class_1792 e() {
return this.D;
}

@NotNull
public final class_1792 D() {
return this.o;
}

@NotNull
public final class_1792 Q() {
return this.y;
}

@NotNull
public static EnumEntries q() {
return q;
}

static {
long var9 = yz.a(5425629107657822773L, -8076617250336727802L, MethodHandles.lookup().lookupClass()).a(129589830581030L) ^ 96006362818641L;
if (vm.a<"Å">(8624387327524465611L, var9) == 0) {
vm.a<"Å">(95, 8617926576472209343L, var9);
}

Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[15];
int var6 = 0;
String var5 = "Î\u0007~u;UE\u0090é?·}ð\u0081\u0083\u001a\b\u001et´®\u0082\u0083è9\u0010`QXâ\u0083\u008eJí2\u009a\u0004Å[¶ ·\u00105\u008aô§ÁãûJp«çvv2\u0002¾\u0010Æ\u0094Ç\u008a¢Ë2*\\º\u0019ÑIø$A\u0010¤ÉN\u0011Hò§\u00129\b7^¸mP´\u0018lôu\bC\u0019\u001aã`B\u0083{\u0095ªÁÂæwa\u0012¯>\u0017÷\u0010Ú\u0094J=\u001fêÁßåap\u0091ê3ØM\u0010Fq\u0006\u008f¸2åqÍm¢Ì;eµ¸\u0010Î\u0007~u;UE\u0090é?·}ð\u0081\u0083\u001a\bñ0·UA t}\u0010`QXâ\u0083\u008eJí2\u009a\u0004Å[¶ ·\u0010´ä!ï.Ç,DÉ\u009e\u008fÊ`\u0098l\u001e";
int var7 = "Î\u0007~u;UE\u0090é?·}ð\u0081\u0083\u001a\b\u001et´®\u0082\u0083è9\u0010`QXâ\u0083\u008eJí2\u009a\u0004Å[¶ ·\u00105\u008aô§ÁãûJp«çvv2\u0002¾\u0010Æ\u0094Ç\u008a¢Ë2*\\º\u0019ÑIø$A\u0010¤ÉN\u0011Hò§\u00129\b7^¸mP´\u0018lôu\bC\u0019\u001aã`B\u0083{\u0095ªÁÂæwa\u0012¯>\u0017÷\u0010Ú\u0094J=\u001fêÁßåap\u0091ê3ØM\u0010Fq\u0006\u008f¸2åqÍm¢Ì;eµ¸\u0010Î\u0007~u;UE\u0090é?·}ð\u0081\u0083\u001a\bñ0·UA t}\u0010`QXâ\u0083\u008eJí2\u009a\u0004Å[¶ ·\u0010´ä!ï.Ç,DÉ\u009e\u008fÊ`\u0098l\u001e"
.length();
char var4 = 16;
int var12 = -1;

label32:
while (true) {
String var13 = var5.substring(++var12, var12 + var4);
byte var10001 = -1;

while (true) {
byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var8).intern();
switch (var10001) {
case 0:
var0[var6++] = var19;
if ((var12 += var4) >= var7) {
String var22 = var0[1];
class_1792 var10004 = class_1802.field_8479;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8479, var0[13]);
class_1792 var10005 = class_1802.field_8162;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8162, var0[10]);
class_1792 var10006 = class_1802.field_8601;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8601, var0[2]);
SPEED = new m0(var10004, var10005, var10006);
String var23 = var0[4];
var10004 = class_1802.field_8183;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8183, var0[8]);
var10005 = class_1802.field_8162;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8162, var0[14]);
var10006 = class_1802.field_8601;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8601, var0[11]);
STRENGTH = new m0(var10004, var10005, var10006);
String var24 = var0[7];
var10004 = class_1802.field_8135;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8135, var0[5]);
var10005 = class_1802.field_8162;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8162, var0[14]);
var10006 = class_1802.field_8725;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8725, var0[9]);
FIRE_RESISTANCE = new m0(var10004, var10005, var10006);
String var25 = var0[3];
var10004 = class_1802.field_8071;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8071, var0[12]);
var10005 = class_1802.field_8711;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8711, var0[6]);
var10006 = class_1802.field_8725;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8725, var0[0]);
INVISIBILITY = new m0(var10004, var10005, var10006);
q = EnumEntriesKt.enumEntries(z);
return;
}

var4 = var5.charAt(var12);
break;
default:
var0[var6++] = var19;
if ((var12 += var4) < var7) {
var4 = var5.charAt(var12);
continue label32;
}

var5 = "´\u001a\u009f¡\u0012þÌ\u008a\bñ0·UA t}";
var7 = "´\u001a\u009f¡\u0012þÌ\u008a\bñ0·UA t}".length();
var4 = '\b';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
var10001 = 0;
}
}
}

public static void l(int var0) {
E = var0;
}

public static int B() {
return E;
}

public static int v() {
int var0 = B();

try {
return var0 == 0 ? 107 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
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
}
