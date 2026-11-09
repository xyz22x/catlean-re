package su.catlean

import java.awt.GridLayout
import java.awt.event.ActionEvent
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.DESKeySpec
import javax.crypto.spec.IvParameterSpec
import javax.swing.JFrame
import javax.swing.SwingUtilities
import javax.swing.Timer
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
import org.apache.commons.lang3.SystemUtils

@ExcludeCommon
public object PreLaunch : PreLaunchEntrypoint {
private final var G: JFrame?

public fun L() {
try {
if (G != null) {
G.setVisible(false);
}
} catch (var1: NumberFormatException) {
throw a(var1);
}
}

public open fun onPreLaunch() {
try {
if (!SystemUtils.IS_OS_WINDOWS) {
return;
}
} catch (var1: NumberFormatException) {
throw a(var1);
}

SwingUtilities.invokeLater(PreLaunch::u);
}

@JvmStatic
fun u() {
val var0: Long = a xor 113090094899193L;
val var2: JFrame = new JFrame(b);
var2.setDefaultCloseOperation(2);
var2.getContentPane().add(LoadingPanel.INSTANCE);
var2.pack();
var2.setVisible(true);
var2.setResizable(false);
var2.setLayout(new GridLayout());
var2.setLocationRelativeTo(null);
G = var2;
val var5: Timer = new Timer((int)c, PreLaunch::D);
var5.setRepeats(true);
var5.start();
}

@JvmStatic
fun {
val var5: Long = a xor 105715536919684L;
val var7: Cipher;
var var10000: Cipher = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
var var10002: SecretKeyFactory = SecretKeyFactory.getInstance("DES");
var var10003: ByteArray = new byte[]{(byte)(var5 ushr 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)((var5 shl var8 * 8) ushr 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
b = a(var7.doFinal("\u00818è\u000b&\u0005¶º".getBytes("ISO-8859-1"))).intern();
val var0: Cipher;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 ushr 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)((var5 shl var1 * 8) ushr 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
val var4: ByteArray = var0.doFinal(
new byte[]{
(byte)((int)(9130597714461373079L ushr 56)),
(byte)((int)(9130597714461373079L ushr 48)),
(byte)((int)(9130597714461373079L ushr 40)),
(byte)((int)(9130597714461373079L ushr 32)),
(byte)((int)(9130597714461373079L ushr 24)),
(byte)((int)(9130597714461373079L ushr 16)),
(byte)((int)(9130597714461373079L ushr 8)),
(byte)((int)9130597714461373079L)
}
);
c = (var4[0] and 255L) shl 56 or (var4[1] and 255L) shl 48 or (var4[2] and 255L) shl 40 or (var4[3] and 255L) shl 32 or (var4[4] and 255L) shl 24 or (
var4[5] and 255L
) shl 16 or (var4[6] and 255L) shl 8 or var4[7] and 255L;
INSTANCE = new PreLaunch();
}

@JvmStatic
fun a(var0: NumberFormatException): NumberFormatException {
return var0;
}

@JvmStatic
fun a(var0: ByteArray): java.lang.String {
var var1: Int = 0;
val var2: Int;
val var3: CharArray = new char[var2 = var0.length];

for (int var4 = 0; var4 < var2; var4++) {
val var5: Int;
if ((var5 = 255 and var0[var4]) < 192) {
var3[var1++] = (char)var5;
} else if (var5 < 224) {
var3[var1++] = (char)((char)((char)(var5 and 31) shl 6) or (char)(var0[++var4] and 63));
} else if (var4 < var2 - 2) {
var3[var1++] = (char)((char)((char)((char)(var5 and 15) shl 12) or (char)(var0[++var4] and 63) shl 6) or (char)(var0[++var4] and 63));
}
}

return new java.lang.String(var3, 0, var1);
}
}
