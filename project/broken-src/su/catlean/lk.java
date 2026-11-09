package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum lk {
public static final lk OFF;
public static final lk ALWAYS;
public static final lk ONLY_SAFE;
private static final lk[] i;
private static final EnumEntries o;

@NotNull
public static EnumEntries R() {
return o;
}

private static final lk[] F() {
return new lk[]{OFF, ALWAYS, ONLY_SAFE};
}

static {
long var9 = yz.a(8221992601869048853L, -7586399405623357540L, MethodHandles.lookup().lookupClass()).a(233820741312798L) ^ 64121615448685L;
Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[3];
int var6 = 0;
String var5 = "ãm½0\u0006ÿkÊ\b\u009a¡O\u009f¶\u0012&>\u0010·\u000féÁ2 v¶\u0010KD\u008a\u0088\u008f\u0016Ã";
int var7 = "ãm½0\u0006ÿkÊ\b\u009a¡O\u009f¶\u0012&>\u0010·\u000féÁ2 v¶\u0010KD\u008a\u0088\u008f\u0016Ã".length();
char var4 = '\b';
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
OFF = new lk();
ALWAYS = new lk();
ONLY_SAFE = new lk();
i = F();
o = EnumEntriesKt.enumEntries(i);
return;
}

var4 = var5.charAt(var3);
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
}
