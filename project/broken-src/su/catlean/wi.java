package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_1935;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import net.minecraft.class_9334;
import org.jetbrains.annotations.NotNull;

public final class wi {
@NotNull
public static final wi t;
private static final long a = yz.a(-1305285687398579513L, -289758182078537564L, MethodHandles.lookup().lookupClass()).a(151652320121607L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private wi() {
}

@NotNull
public final class_1799 H(int id, long a) {
ax = a ^ ax;
Object var5 = null;
String var10000 = vm.a<"Å">(-2278523567640763576L, ax);
Object var6 = null;
String var4 = var10000;

label55: {
label54: {
label53: {
label52: {
label51: {
label50: {
label49: {
label48: {
label47: {
label46: {
try {
var21 = id;
if (var4 == null) {
break label53;
}

switch (id) {
case -16711936:
break label49;
case -16711681:
break label52;
case -6684877:
break label47;
case -3407872:
break;
case -65281:
break label51;
case -39424:
break label48;
case -256:
break label50;
case -1:
break label46;
default:
break label55;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -2171677480222928402L, ax);
}

var21 = 2;
break label53;
}

class_1293[] var13 = new class_1293[]{new class_1293(class_1294.field_5919, b<"e">(30102, 8682407165786502122L ^ ax), 0), null};
long var10001 = 2365455358012034160L ^ ax;
var13[1] = new class_1293(class_1294.field_5912, b<"e">(525, 6757572739741336703L ^ ax), 0);
var5 = CollectionsKt.listOf(var13);
class_5250 var22 = class_2561.method_43470(a<"s">(29122, var10001));
Intrinsics.checkNotNullExpressionValue(var22, a<"s">(29241, 8064860336154611597L ^ ax));
var6 = (class_2561)var22;
break label54;
}

class_1293[] var17 = new class_1293[4];
var17[0] = new class_1293(class_1294.field_5899, b<"e">(35, 249256857608046170L ^ ax), 1);
long var33 = 2475899356950138727L ^ ax;
var17[1] = new class_1293(class_1294.field_5909, b<"e">(28151, 9095652356731317122L ^ ax), 3);
var17[2] = new class_1293(class_1294.field_5911, b<"e">(28151, 9095652356731317122L ^ ax), 2);
var17[3] = new class_1293(class_1294.field_5920, b<"e">(31029, 9206431216692936523L ^ ax), 4);
var5 = CollectionsKt.listOf(var17);
class_5250 var26 = class_2561.method_43470(a<"s">(29399, var33));
Intrinsics.checkNotNullExpressionValue(var26, a<"s">(29241, 8064860336154611597L ^ ax));
var6 = (class_2561)var26;
break label54;
}

class_1293[] var15 = new class_1293[5];
var15[0] = new class_1293(class_1294.field_5919, b<"e">(5874, 7928450835633295491L ^ ax), 0);
long var31 = 492953725971042012L ^ ax;
var15[1] = new class_1293(class_1294.field_5912, b<"e">(18560, 4796324471462825712L ^ ax), 0);
var15[2] = new class_1293(class_1294.field_5903, b<"e">(28151, 9095652356731317122L ^ ax), b<"e">(2930, 6870323072679726345L ^ ax));
var15[3] = new class_1293(class_1294.field_5909, b<"e">(18560, 4796324471462825712L ^ ax), 2);
var15[4] = new class_1293(class_1294.field_5920, b<"e">(16755, 5101891222748301065L ^ ax), 4);
var5 = CollectionsKt.listOf(var15);
class_5250 var24 = class_2561.method_43470(a<"s">(29545, var31));
Intrinsics.checkNotNullExpressionValue(var24, a<"s">(29241, 8064860336154611597L ^ ax));
var6 = (class_2561)var24;
break label54;
}

class_1293[] var19 = new class_1293[4];
var19[0] = new class_1293(class_1294.field_5914, b<"e">(18560, 4796324471462825712L ^ ax), 1);
long var35 = 9118044784610894886L ^ ax;
var19[1] = new class_1293(class_1294.field_5905, b<"e">(2451, 3342536449208897509L ^ ax), 0);
var19[2] = new class_1293(class_1294.field_5924, b<"e">(19140, 7971858064000060604L ^ ax), 1);
var19[3] = new class_1293(class_1294.field_5907, b<"e">(31649, 6250025462118923733L ^ ax), 0);
var5 = CollectionsKt.listOf(var19);
class_5250 var28 = class_2561.method_43470(a<"s">(6545, var35));
Intrinsics.checkNotNullExpressionValue(var28, a<"s">(29241, 8064860336154611597L ^ ax));
var6 = (class_2561)var28;
break label54;
}

class_1293[] var14 = new class_1293[5];
var14[0] = new class_1293(class_1294.field_5918, b<"e">(15537, 3204601174458563270L ^ ax), 0);
long var30 = 6084082100562840195L ^ ax;
var14[1] = new class_1293(class_1294.field_5917, b<"e">(18560, 4796324471462825712L ^ ax), 0);
var14[2] = new class_1293(class_1294.field_5905, b<"e">(2451, 3342536449208897509L ^ ax), 0);
var14[3] = new class_1293(class_1294.field_5904, b<"e">(2451, 3342536449208897509L ^ ax), 2);
var14[4] = new class_1293(class_1294.field_5910, b<"e">(10696, 396150227391147963L ^ ax), 2);
var5 = CollectionsKt.listOf(var14);
class_5250 var23 = class_2561.method_43470(a<"s">(14128, var30));
Intrinsics.checkNotNullExpressionValue(var23, a<"s">(29241, 8064860336154611597L ^ ax));
var6 = (class_2561)var23;
break label54;
}

class_1293[] var16 = new class_1293[]{new class_1293(class_1294.field_5914, b<"e">(9712, 3489684365502145435L ^ ax), 2), null};
long var32 = 6660188277053917739L ^ ax;
var16[1] = new class_1293(class_1294.field_5924, b<"e">(1792, 9172722794830381439L ^ ax), 2);
var5 = CollectionsKt.listOf(var16);
class_5250 var25 = class_2561.method_43470(a<"s">(30608, var32));
Intrinsics.checkNotNullExpressionValue(var25, a<"s">(29241, 8064860336154611597L ^ ax));
var6 = (class_2561)var25;
break label54;
}

class_1293[] var18 = new class_1293[]{new class_1293(class_1294.field_5913, b<"e">(18560, 4796324471462825712L ^ ax), 0), null};
long var34 = 2515039967205295597L ^ ax;
var18[1] = new class_1293(class_1294.field_5904, b<"e">(18560, 4796324471462825712L ^ ax), 2);
var5 = CollectionsKt.listOf(var18);
class_5250 var27 = class_2561.method_43470(a<"s">(30804, var34));
Intrinsics.checkNotNullExpressionValue(var27, a<"s">(29241, 8064860336154611597L ^ ax));
var6 = (class_2561)var27;
break label54;
}

class_1293[] var20 = new class_1293[var21];
var20[0] = new class_1293(class_1294.field_5907, b<"e">(16955, 6424283156625622097L ^ ax), 0);
long var36 = 6628157978688648437L ^ ax;
var20[1] = new class_1293(class_1294.field_5910, b<"e">(23235, 1598030335199190206L ^ ax), 3);
var5 = CollectionsKt.listOf(var20);
class_5250 var29 = class_2561.method_43470(a<"s">(2372, var36));
Intrinsics.checkNotNullExpressionValue(var29, a<"s">(28006, 3586134144787845328L ^ ax));
var6 = (class_2561)var29;
}

class_1799 var7 = new class_1799((class_1935)class_1802.field_8436);
var7.method_57379(class_9334.field_49651, new class_1844(Optional.empty(), Optional.empty(), (List)var5, Optional.empty()));
var7.method_57379(class_9334.field_49631, var6);
return var7;
}

class_1799 var8 = new class_1799((class_1935)class_1802.field_8436);
var8.method_57379(class_9334.field_49631, class_2561.method_43470(a<"s">(6979, 2123945972670424827L ^ ax)));
return var8;
}

static {
long var11 = a ^ 121706793940229L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[11];
int var18 = 0;
String var17 = "Ûµ£yc9E\u001e\u008ev\u0004a\u00adÿkþ\u0004¸[¯\u000b9\u0016$íUÌà\u001b~YmÿØ¸\u008bÓ®Ú\u0098ù=Îá¬\u0099\u0017yR\f3 ¨Áâ\u0092Í\u0094¥S\u001câ/X\u0092\u0014\u007fª\u0001=t\u0094b ôº\u0099\u008ahw¹F:\u000eÇ\u0088\f\u0013X6\u00051\n¹\u0095%3\t¾-Õ\u0012\u0097\"¼ý=JDa\u008d\u0015l\u0093|Û\u009aV_&\u000bÕßî2írCU\u0005Ä\u0097\u000e\u000b¾2}à{\u0089¶êÜ<7¾3\u0016\u0097í\u0092l;ªû\u0011§7±cÇÖq¯\u009c\u0093@ê\u008bSï,Ô\u0010_O\u0088Hqy'ý9úO¬\u000e§\u0090\u0003\u0093_D\u0087ÉÞf\u008e\u0085\u0087qÜ.FÏZUÞù«Vy%\u0084Z'Í\bjRFéoök\u0011p\u0082U\u0092Ö×1ÙÄZ{`®ez%VQ'½\u001c\u0015Z\u0082@WÈøK¯ô(Æö\u001a·¼\u0090ÍÏw\u008cÇË\u0093\u0007\u0080eZ®rîF¡\u001c¬Ð»j`BwÁb\u0010w-\u0014=\bÐÂ¬\u000eF\u007f«\u000fò·\u00ad9W\u0086ûþ\u000b®Â`\t)\u009dM\u000ex\f\u008dóPæÿ\u0011¥/<\u000fq\n\u001a¾_ `\u0000Óò|ç5Å¨¼j~´f\u0084ÍÑx\u008c\u0089/E\u0099ª^ñ>ñ]\u0004ã\u009bx¬Ô\u008bÅ¡Ì¸\u0094\nZ[?\u0003¼w\u0084M\u0084\u008bíx\u0094¿7?ÎÁõn»hFU$gEa\u0083´¸ \np\u008f²èÆEw§Î ï\u0001§={LÕ#\u0098ðoS).:\u0080°lù.È`V¹\u009câ\u0087_\u008bù¼\u008e\u0090ä\u0092\u000bÛjï\u001at¬ðÒÕlª5Ëýò©w(9\r@,5b¹ÿ?áW\u0018Ö\u0098Ä»Áèdä\u0090×(´õ[\u009bd+æ\u0093ªeW^Ì\u0004\u0015\u001f\u0019àºüH:\u0081û\u008f1ÿ~\u0006\rXÝ¿MjÆÆ\u001bÑ¬f Î)o\u008e]Úûì\u009a\u00ad\u0011\u001fÙË\u0084Våäµ«q\u0087¯`LL3\u0083\u008cûÙÌHdqê)\u0012i\u000e\u0007¬P\\üqÿÀP\u0019\u009a®U\u0093â\tO`f\u001e\u009fn\u0093«\u0012.É¿¿r\u001eÊQ®\u009cnÔû¾&8íÝ\u000ef)Â>©3%\u007f¢4êø\u0080$\u0004Ó\u009eÉT±§";
int var19 = "Ûµ£yc9E\u001e\u008ev\u0004a\u00adÿkþ\u0004¸[¯\u000b9\u0016$íUÌà\u001b~YmÿØ¸\u008bÓ®Ú\u0098ù=Îá¬\u0099\u0017yR\f3 ¨Áâ\u0092Í\u0094¥S\u001câ/X\u0092\u0014\u007fª\u0001=t\u0094b ôº\u0099\u008ahw¹F:\u000eÇ\u0088\f\u0013X6\u00051\n¹\u0095%3\t¾-Õ\u0012\u0097\"¼ý=JDa\u008d\u0015l\u0093|Û\u009aV_&\u000bÕßî2írCU\u0005Ä\u0097\u000e\u000b¾2}à{\u0089¶êÜ<7¾3\u0016\u0097í\u0092l;ªû\u0011§7±cÇÖq¯\u009c\u0093@ê\u008bSï,Ô\u0010_O\u0088Hqy'ý9úO¬\u000e§\u0090\u0003\u0093_D\u0087ÉÞf\u008e\u0085\u0087qÜ.FÏZUÞù«Vy%\u0084Z'Í\bjRFéoök\u0011p\u0082U\u0092Ö×1ÙÄZ{`®ez%VQ'½\u001c\u0015Z\u0082@WÈøK¯ô(Æö\u001a·¼\u0090ÍÏw\u008cÇË\u0093\u0007\u0080eZ®rîF¡\u001c¬Ð»j`BwÁb\u0010w-\u0014=\bÐÂ¬\u000eF\u007f«\u000fò·\u00ad9W\u0086ûþ\u000b®Â`\t)\u009dM\u000ex\f\u008dóPæÿ\u0011¥/<\u000fq\n\u001a¾_ `\u0000Óò|ç5Å¨¼j~´f\u0084ÍÑx\u008c\u0089/E\u0099ª^ñ>ñ]\u0004ã\u009bx¬Ô\u008bÅ¡Ì¸\u0094\nZ[?\u0003¼w\u0084M\u0084\u008bíx\u0094¿7?ÎÁõn»hFU$gEa\u0083´¸ \np\u008f²èÆEw§Î ï\u0001§={LÕ#\u0098ðoS).:\u0080°lù.È`V¹\u009câ\u0087_\u008bù¼\u008e\u0090ä\u0092\u000bÛjï\u001at¬ðÒÕlª5Ëýò©w(9\r@,5b¹ÿ?áW\u0018Ö\u0098Ä»Áèdä\u0090×(´õ[\u009bd+æ\u0093ªeW^Ì\u0004\u0015\u001f\u0019àºüH:\u0081û\u008f1ÿ~\u0006\rXÝ¿MjÆÆ\u001bÑ¬f Î)o\u008e]Úûì\u009a\u00ad\u0011\u001fÙË\u0084Våäµ«q\u0087¯`LL3\u0083\u008cûÙÌHdqê)\u0012i\u000e\u0007¬P\\üqÿÀP\u0019\u009a®U\u0093â\tO`f\u001e\u009fn\u0093«\u0012.É¿¿r\u001eÊQ®\u009cnÔû¾&8íÝ\u000ef)Â>©3%\u007f¢4êø\u0080$\u0004Ó\u009eÉT±§"
.length();
char var16 = 'X';
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
c = new String[11];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[18];
int var3 = 0;
String var4 = "øîã¦Q©\u001a.\u0098Ý\u001eqgô\u0095Æ\u0097j>ÈWë\r4\u0014YFz\u0018ºÍH/,ýOØ|ñÕk(Ö\u008e·Óµ\u0087ý\u000bQXæßAí±\u001dÃ&Y\u009a\u0090\u009eLÉ\u0010æc=~l\u008c\tuSõ?¸\u001a\u0019éã\u0010âÉµnYTÌFNô¬\u0084£¤¤\u0099Ð \u009em\u001fMÖð\u0091\u0093sÐ\u0014#h\u008a¥\u0003ªdÃW9tfV¦2";
int var5 = "øîã¦Q©\u001a.\u0098Ý\u001eqgô\u0095Æ\u0097j>ÈWë\r4\u0014YFz\u0018ºÍH/,ýOØ|ñÕk(Ö\u008e·Óµ\u0087ý\u000bQXæßAí±\u001dÃ&Y\u009a\u0090\u009eLÉ\u0010æc=~l\u008c\tuSõ?¸\u001a\u0019éã\u0010âÉµnYTÌFNô¬\u0084£¤¤\u0099Ð \u009em\u001fMÖð\u0091\u0093sÐ\u0014#h\u008a¥\u0003ªdÃW9tfV¦2"
.length();
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
e = var6;
f = new Integer[18];
t = new wi();
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "!æwé%©àÚ[M1|aÇw^";
var5 = "!æwé%©àÚ[M1|aÇw^".length();
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

var17 = "¹\u0090ÆÌÍý\u0002løç¼°;n#\u0098ï¢yõÔ7míðo\u0000ËOi®(\u0011LÉ[\u0093$ü;â3\u008d\u0092|MZ\fg\u0002dª\u0019e0\u001aU\t:R9bÈ_Hc\u009f=ÀçP0m¬\nÃóÞÇ\u0086\u008aõ£\u0099y\u008c\u0092\t\u0097QïÒÄ|\"\u001a¢¢\u0096\u001129k\u001eê+\u000e\tI²3.Ôý·R\u0019h\u0082ß[\u00143\u0004°|¥î£\u0084<e&\u008c¥ìj";
var19 = "¹\u0090ÆÌÍý\u0002løç¼°;n#\u0098ï¢yõÔ7míðo\u0000ËOi®(\u0011LÉ[\u0093$ü;â3\u008d\u0092|MZ\fg\u0002dª\u0019e0\u001aU\t:R9bÈ_Hc\u009f=ÀçP0m¬\nÃóÞÇ\u0086\u008aõ£\u0099y\u008c\u0092\t\u0097QïÒÄ|\"\u001a¢¢\u0096\u001129k\u001eê+\u000e\tI²3.Ôý·R\u0019h\u0082ß[\u00143\u0004°|¥î£\u0084<e&\u008c¥ìj"
.length();
var16 = '@';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 7471;
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
throw new RuntimeException("su/catlean/wi", var10);
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
throw new RuntimeException("su/catlean/wi" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9957;
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
throw new RuntimeException("su/catlean/wi", var14);
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
throw new RuntimeException("su/catlean/wi" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
