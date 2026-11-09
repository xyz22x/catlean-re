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
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import org.jetbrains.annotations.NotNull;

public final class zm {
private static final long a = yz.a(6788125218847003900L, -7433906626263918650L, MethodHandles.lookup().lookupClass()).a(8335460878030L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@NotNull
public static final class_5250 F(@NotNull class_5250 $this$applyFormatting, @NotNull String addition, @NotNull class_124 formatting, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter($this$applyFormatting, a<"g">(6301, 8291889312372872035L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619622382762212798L ^ ax));
Intrinsics.checkNotNullParameter(formatting, a<"g">(16223, 3482245934731883683L ^ ax));
class_5250 var10000 = $this$applyFormatting.method_10852((class_2561)class_2561.method_43470(addition).method_27692(formatting));
Intrinsics.checkNotNullExpressionValue(var10000, a<"g">(10842, 2869827753165611425L ^ ax));
return var10000;
}

@NotNull
public static final class_5250 M(long a, @NotNull class_5250 $this$black, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 41490996341612L;
Intrinsics.checkNotNullParameter($this$black, a<"g">(6301, 8291904522911669779L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619562813523833038L ^ ax));
return F($this$black, addition, class_124.field_1074, var4);
}

@NotNull
public static final class_5250 D(@NotNull class_5250 $this$green, long a, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 129846313787854L;
Intrinsics.checkNotNullParameter($this$green, a<"g">(6301, 8291848878612501681L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619652579735943788L ^ ax));
return F($this$green, addition, class_124.field_1060, var4);
}

@NotNull
public static final class_5250 F(@NotNull class_5250 $this$white, @NotNull String addition, long a) {
ax = a ^ ax;
long var4 = ax ^ 105667386943312L;
Intrinsics.checkNotNullParameter($this$white, a<"g">(6301, 8291837876376949295L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619637192341863666L ^ ax));
return F($this$white, addition, class_124.field_1068, var4);
}

@NotNull
public static final class_5250 E(long a, @NotNull class_5250 $this$gray, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 46966097954565L;
Intrinsics.checkNotNullParameter($this$gray, a<"g">(6301, 8291914372252840570L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619577086867004583L ^ ax));
return F($this$gray, addition, class_124.field_1080, var4);
}

@NotNull
public static final class_5250 q(@NotNull class_5250 $this$aqua, long a, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 100108947252895L;
Intrinsics.checkNotNullParameter($this$aqua, a<"g">(6301, 8291898269206746080L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619631601684675901L ^ ax));
return F($this$aqua, addition, class_124.field_1075, var4);
}

@NotNull
public static final class_5250 X(@NotNull class_5250 $this$darkBlue, long a, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 97855401807266L;
Intrinsics.checkNotNullParameter($this$darkBlue, a<"g">(6301, 8291899290640791773L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619627971603256832L ^ ax));
return F($this$darkBlue, addition, class_124.field_1058, var4);
}

@NotNull
public static final class_5250 k(long a, @NotNull class_5250 $this$darkGreen, @NotNull String addition, byte a) {
long var5 = (ax << 8 | (long)axx << 56 >>> 56) ^ a;
long var7 = var5 ^ 86996962706251L;
Intrinsics.checkNotNullParameter($this$darkGreen, a<"g">(6301, 8291876337473091124L ^ var5));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619609691465914601L ^ var5));
return F($this$darkGreen, addition, class_124.field_1077, var7);
}

@NotNull
public static final class_5250 a(@NotNull class_5250 $this$darkAqua, @NotNull String addition, long a) {
ax = a ^ ax;
long var4 = ax ^ 2226638140815L;
Intrinsics.checkNotNullParameter($this$darkAqua, a<"g">(6301, 8291941107222855920L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619533719375556141L ^ ax));
return F($this$darkAqua, addition, class_124.field_1062, var4);
}

@NotNull
public static final class_5250 S(int a, int a, @NotNull class_5250 $this$darkRed, short a, @NotNull String addition) {
long var5 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 30339962505376L;
Intrinsics.checkNotNullParameter($this$darkRed, a<"g">(6301, 8291968175092006367L ^ var5));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619560769965003522L ^ var5));
return F($this$darkRed, addition, class_124.field_1079, var7);
}

@NotNull
public static final class_5250 v(@NotNull class_5250 $this$darkPurple, char a, int a, char a, @NotNull String addition) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 11807139666909L;
Intrinsics.checkNotNullParameter($this$darkPurple, a<"g">(27722, 6368274723861469810L ^ var5));
Intrinsics.checkNotNullParameter(addition, a<"g">(19, 4720806136028460586L ^ var5));
return F($this$darkPurple, addition, class_124.field_1064, var7);
}

@NotNull
public static final class_5250 o(long a, @NotNull class_5250 $this$gold, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 131216201978104L;
Intrinsics.checkNotNullParameter($this$gold, a<"g">(6301, 8291850188236547463L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619653915266485082L ^ ax));
return F($this$gold, addition, class_124.field_1065, var4);
}

@NotNull
public static final class_5250 T(int a, @NotNull class_5250 $this$darkGray, short a, @NotNull String addition, int a) {
long var5 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 98213616010965L;
Intrinsics.checkNotNullParameter($this$darkGray, a<"g">(6301, 8291900783011705770L ^ var5));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619629743130140023L ^ var5));
return F($this$darkGray, addition, class_124.field_1063, var7);
}

@NotNull
public static final class_5250 m(@NotNull class_5250 $this$blue, long a, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 119230712645466L;
Intrinsics.checkNotNullParameter($this$blue, a<"g">(6301, 8291842661158351397L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619641684967169272L ^ ax));
return F($this$blue, addition, class_124.field_1078, var4);
}

@NotNull
public static final class_5250 z(@NotNull class_5250 $this$red, long a, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 72649259395124L;
Intrinsics.checkNotNullParameter($this$red, a<"g">(6301, 8291870826866629963L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619604172067877782L ^ ax));
return F($this$red, addition, class_124.field_1061, var4);
}

@NotNull
public static final class_5250 i(int a, @NotNull class_5250 $this$lightPurple, @NotNull String addition, byte a, int a) {
long var5 = ((long)ax << 32 | (long)axxx << 56 >>> 32 | (long)axx << 40 >>> 40) ^ a;
long var7 = var5 ^ 20662224714256L;
Intrinsics.checkNotNullParameter($this$lightPurple, a<"g">(6301, 8291958477691260783L ^ var5));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619551085520511410L ^ var5));
return F($this$lightPurple, addition, class_124.field_1076, var7);
}

@NotNull
public static final class_5250 J(@NotNull class_5250 $this$yellow, int a, int a, @NotNull String addition) {
long var4 = ((long)axx << 32 | (long)ax << 32 >>> 32) ^ a;
long var6 = var4 ^ 92288012842693L;
Intrinsics.checkNotNullParameter($this$yellow, a<"g">(6301, 8291889323125179322L ^ var4));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619622406360722791L ^ var4));
return F($this$yellow, addition, class_124.field_1054, var6);
}

@NotNull
public static final class_5250 Q(@NotNull class_5250 $this$obf, @NotNull String addition, long a) {
ax = a ^ ax;
long var4 = ax ^ 103585716015721L;
Intrinsics.checkNotNullParameter($this$obf, a<"g">(6301, 8291892941309175574L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619626003193825739L ^ ax));
return F($this$obf, addition, class_124.field_1051, var4);
}

@NotNull
public static final class_5250 y(char a, @NotNull class_5250 $this$bold, int a, @NotNull String addition, int a) {
long var5 = ((long)ax << 48 | (long)axxx << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 134519332247545L;
Intrinsics.checkNotNullParameter($this$bold, a<"g">(6301, 8291862347522269830L ^ var5));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619666048584223835L ^ var5));
return F($this$bold, addition, class_124.field_1067, var7);
}

@NotNull
public static final class_5250 Z(@NotNull class_5250 $this$strikethrough, int a, short a, @NotNull String addition, short a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 65547971130087L;
Intrinsics.checkNotNullParameter($this$strikethrough, a<"g">(6301, 8291932971373103000L ^ var5));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619595939324160325L ^ var5));
return F($this$strikethrough, addition, class_124.field_1055, var7);
}

@NotNull
public static final class_5250 s(@NotNull class_5250 $this$underline, long a, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 59794122880386L;
Intrinsics.checkNotNullParameter($this$underline, a<"g">(6301, 8291919553038369021L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619582246223621664L ^ ax));
return F($this$underline, addition, class_124.field_1073, var4);
}

@NotNull
public static final class_5250 t(long a, @NotNull class_5250 $this$italic, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 60789490307102L;
Intrinsics.checkNotNullParameter($this$italic, a<"g">(6301, 8291920550536291681L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619583518615391164L ^ ax));
return F($this$italic, addition, class_124.field_1056, var4);
}

@NotNull
public static final class_5250 R(long a, @NotNull class_5250 $this$reset, @NotNull String addition) {
ax = a ^ ax;
long var4 = ax ^ 74240738005904L;
Intrinsics.checkNotNullParameter($this$reset, a<"g">(6301, 8291871295362229999L ^ ax));
Intrinsics.checkNotNullParameter(addition, a<"g">(30273, 619604632089987122L ^ ax));
return F($this$reset, addition, class_124.field_1070, var4);
}

@NotNull
public static final class_5250 B(long var0) {
var0 = a ^ var0;
class_5250 var10000 = class_2561.method_43473();
Intrinsics.checkNotNullExpressionValue(var10000, a<"g">(25805, 6590722283598214677L ^ var0));
return var10000;
}

@NotNull
public static final class_2561 G(long a, @NotNull String $this$text) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter($this$text, a<"g">(6301, 8291942303054863198L ^ ax));
class_2561 var10000 = class_2561.method_30163($this$text);
Intrinsics.checkNotNullExpressionValue(var10000, a<"g">(1319, 1543628995099526887L ^ ax));
return var10000;
}

static {
long var0 = a ^ 25100464840929L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[8];
int var7 = 0;
String var6 = "úÁ;ª\u0080¶\u0081\u000e3\u0084Â\u0005U2\u00adö \u001dí\u00063\u0089J\u001b345\u000f\u0018\u0001»õ\u0095Ê¼5ÏÆÀ\u0019Â^Ã¾\u0095ò\u0004r[\u0018\u0013\u0003w\u008dONÔÌ\u0003K6\u001f\u0011;3UÊ`/q©:\u0080ß ©\u009bxk\u0007±{çMjn\u001cÜ\u0090¬-@?µ'§0¢XÕ,¬\u0090Ì\\\u0017D(\u0097\u008d\u0014j<ZÓo\u008e§f\u0000)Ö(\ts¾ÒU©¶«bÉ\u0013\u0096\u009a[a&:\u0017eÆJ\u000eíøï \u000eaºÚ\u009ehiúiED½\u0083\u0013Õª\u008c\u0015\u008aPÎÀ\u0006=g|Ý¨ïsM\b";
int var8 = "úÁ;ª\u0080¶\u0081\u000e3\u0084Â\u0005U2\u00adö \u001dí\u00063\u0089J\u001b345\u000f\u0018\u0001»õ\u0095Ê¼5ÏÆÀ\u0019Â^Ã¾\u0095ò\u0004r[\u0018\u0013\u0003w\u008dONÔÌ\u0003K6\u001f\u0011;3UÊ`/q©:\u0080ß ©\u009bxk\u0007±{çMjn\u001cÜ\u0090¬-@?µ'§0¢XÕ,¬\u0090Ì\\\u0017D(\u0097\u008d\u0014j<ZÓo\u008e§f\u0000)Ö(\ts¾ÒU©¶«bÉ\u0013\u0096\u009a[a&:\u0017eÆJ\u000eíøï \u000eaºÚ\u009ehiúiED½\u0083\u0013Õª\u008c\u0015\u008aPÎÀ\u0006=g|Ý¨ïsM\b"
.length();
char var5 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[8];
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "V;\u00913me\u007fç¶à\u008cuü\u001cË\n\u0012!\" ÈßÛ\u008axlxq´\u0085)\u001b\u0010û\u009aQ\u0084>®dÄ\u0005\u0089\u000e_\nYü9";
var8 = "V;\u00913me\u007fç¶à\u008cuü\u001cË\n\u0012!\" ÈßÛ\u008axlxq´\u0085)\u001b\u0010û\u009aQ\u0084>®dÄ\u0005\u0089\u000e_\nYü9".length();
var5 = ' ';
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25447;
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
throw new RuntimeException("su/catlean/zm", var10);
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
throw new RuntimeException("su/catlean/zm" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
