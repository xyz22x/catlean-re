package su.catlean;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.flow.FlowControlHandler;
import io.netty.handler.proxy.ProxyHandler;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_9130.class_9131;
import net.minecraft.class_9130.class_9133;

public final class g3 extends ChannelInitializer {
final c2 L;
private static final long a = yz.a(-2338562900836437302L, -2077347238200514781L, MethodHandles.lookup().lookupClass()).a(172626381861222L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

g3(c2 var1) {
this.L = var1;
}

protected void Q(long a, SocketChannel ch) {
ax = a ^ ax;
int var10000 = vm.a<"Å">(3847628656342034381L, ax);
Intrinsics.checkNotNullParameter(ch, a<"o">(23000, 3806394380355495654L ^ ax));
int var4 = var10000;
ChannelPipeline var11 = ch.pipeline();
ChannelHandler[] var5 = new ChannelHandler[]{new FlowControlHandler()};
ChannelPipeline var12 = var11.addLast(var5)
.addLast(a<"o">(23378, 496589644422145133L ^ ax), (ChannelHandler)(new ReadTimeoutHandler((int)e)))
.addLast(a<"o">(3161, 313006990708945765L ^ ax), (ChannelHandler)(new class_9131()))
.addLast(a<"o">(9506, 4295737680464779807L ^ ax), (ChannelHandler)(new class_9133()));
var5 = new ChannelHandler[1];

ChannelHandler[] var10001;
byte var10002;
ProxyHandler var10003;
label33: {
try {
var10001 = var5;
var10002 = 0;
if (this.L.W()) {
var10003 = new Socks4ProxyHandler(new InetSocketAddress(this.L.c(), this.L.X()), this.L.f());
break label33;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 3771298870169148151L, ax);
}

var10003 = new Socks5ProxyHandler(new InetSocketAddress(this.L.c(), this.L.X()), this.L.f(), this.L.G());
}

var10001[var10002] = var10003;
ChannelPipeline var13 = var12.addLast(var5);
var5 = new ChannelHandler[1];

try {
var5[0] = new sf();
var13.addLast(var5);
var10000 = var4;
if (ax > 0L) {
if (var4 != 0) {
return;
}

var10000 = 4;
}

vm.a<"Å">(new _g[var10000], 3862541474557738919L, ax);
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 3771298870169148151L, ax);
}
}

public void initChannel(Channel p0) {
long var2 = a ^ 14398432429040L;
long var4 = var2 ^ 63882084513613L;
this.Q(var4, (SocketChannel)p0);
}

static {
long var5 = a ^ 132803744690406L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[4];
int var12 = 0;
String var11 = "\u0083\u001aÈs.©\u007f\u0089°\u0006\u0004B@Ë\u0088\u0005D\u001b\u007fx\u0088²>V\u0082É\u00add¯Ë9<îª\u008a\u008d:é-¶\u0010GèË§\u0090Ú±b\u007fUÄÞ®»Ò\u0093";
int var13 = "\u0083\u001aÈs.©\u007f\u0089°\u0006\u0004B@Ë\u0088\u0005D\u001b\u007fx\u0088²>V\u0082É\u00add¯Ë9<îª\u008a\u008d:é-¶\u0010GèË§\u0090Ú±b\u007fUÄÞ®»Ò\u0093"
.length();
char var10 = '(';
int var17 = -1;

label37:
while (true) {
String var18 = var11.substring(++var17, var17 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var26;
if ((var17 += var10) >= var13) {
b = var14;
c = new String[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 5869618200879855804L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var30;
return;
}

var10 = var11.charAt(var17);
break;
default:
var14[var12++] = var26;
if ((var17 += var10) < var13) {
var10 = var11.charAt(var17);
continue label37;
}

var11 = "|\u0011ÂqSL×\u008eð¸ «Iß\u0085\u0083T£¡Ò¼;°\u0081ø¡\bkÓ}\u0001|Ä\u0099Ý¦õîV\u0002(\u0085Vº:áW\u0097\u0012Miý¡(Òê\u0016\u001fU\u0097ã\u00ad\u0093ïãxüI¼ÿ\u0090¢»ñ¡'Ò«\u0001yZ";
var13 = "|\u0011ÂqSL×\u008eð¸ «Iß\u0085\u0083T£¡Ò¼;°\u0081ø¡\bkÓ}\u0001|Ä\u0099Ý¦õîV\u0002(\u0085Vº:áW\u0097\u0012Miý¡(Òê\u0016\u001fU\u0097ã\u00ad\u0093ïãxüI¼ÿ\u0090¢»ñ¡'Ò«\u0001yZ"
.length();
var10 = '(';
var17 = -1;
}

var18 = var11.substring(++var17, var17 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2946;
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
throw new RuntimeException("su/catlean/g3", var10);
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
throw new RuntimeException("su/catlean/g3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
