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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.AddHandlersEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class jg {
@NotNull
public static final jg l;
@Nullable
private static c2 B;
@NotNull
private static i9 i;
private static int[] O;
private static final long a = yz.a(-4494532007215379709L, -5932098511889885743L, MethodHandles.lookup().lookupClass()).a(147149580336207L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long h;

private jg() {
}

@NotNull
public final List M(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 10931047130207L;
return yl.g.N().Z(var3).e();
}

@Nullable
public final c2 N() {
return B;
}

public final void d(@Nullable c2 <set-?>) {
B = <set-?>;
}

@Flow
private final void K(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/jg.a J
// 03: ldc2_w 15170932625242
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 5249707871115
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 77086519306109
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 110898459461758
// 1b: lxor
// 1c: dup2
// 1d: bipush 48
// 1f: lushr
// 20: l2i
// 21: istore 8
// 23: dup2
// 24: bipush 16
// 26: lshl
// 27: bipush 32
// 29: lushr
// 2a: l2i
// 2b: istore 9
// 2d: dup2
// 2e: bipush 48
// 30: lshl
// 31: bipush 48
// 33: lushr
// 34: l2i
// 35: istore 10
// 37: pop2
// 38: dup2
// 39: ldc2_w 120566351717794
// 3c: lxor
// 3d: lstore 11
// 3f: pop2
// 40: ldc2_w -2916391232232616782
// 43: lload 2
// 44: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: istore 13
// 4b: lload 4
// 4d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 50: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 53: instanceof su/catlean/s1
// 56: iload 13
// 58: ifne a5
// 5b: ifeq c3
// 5e: goto 6b
// 61: ldc2_w -2944033604060398641
// 64: lload 2
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: getstatic su/catlean/jg.i Lsu/catlean/i9;
// 6e: iload 13
// 70: ifne be
// 73: goto 80
// 76: ldc2_w -2944033604060398641
// 79: lload 2
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: iload 8
// 82: i2s
// 83: iload 9
// 85: iload 10
// 87: i2s
// 88: sipush 12397
// 8b: ldc2_w 7439601366916099962
// 8e: lload 2
// 8f: lxor
// 90: invokedynamic m (IJ)I bsm=su/catlean/jg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95: invokevirtual su/catlean/i9.g (SISI)Z
// 98: goto a5
// 9b: ldc2_w -2944033604060398641
// 9e: lload 2
// 9f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: athrow
// a5: ifeq c3
// a8: aload 0
// a9: lload 6
// ab: invokevirtual su/catlean/jg.o (J)V
// ae: getstatic su/catlean/jg.i Lsu/catlean/i9;
// b1: goto be
// b4: ldc2_w -2944033604060398641
// b7: lload 2
// b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bd: athrow
// be: lload 11
// c0: invokevirtual su/catlean/i9.X (J)V
// c3: return
}

@Flow
private final void N(AddHandlersEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/jg.a J
// 003: ldc2_w 79676773421766
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -3853130412469675986
// 00b: lload 2
// 00c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: istore 4
// 013: iload 4
// 015: ifeq 11b
// 018: getstatic su/catlean/jg.B Lsu/catlean/c2;
// 01b: dup
// 01c: ifnull 11a
// 01f: goto 02c
// 022: ldc2_w -3839049635031112109
// 025: lload 2
// 026: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02b: athrow
// 02c: astore 5
// 02e: bipush 0
// 02f: istore 6
// 031: getstatic su/catlean/jg.l Lsu/catlean/jg;
// 034: pop
// 035: getstatic su/catlean/jg.B Lsu/catlean/c2;
// 038: dup
// 039: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 03c: astore 7
// 03e: bipush 0
// 03f: istore 8
// 041: iload 4
// 043: ifeq 117
// 046: aload 1
// 047: invokevirtual su/catlean/api/event/events/network/AddHandlersEvent.getSide ()Lnet/minecraft/class_2598;
// 04a: getstatic net/minecraft/class_2598.field_11942 Lnet/minecraft/class_2598;
// 04d: if_acmpne 114
// 050: goto 05d
// 053: ldc2_w -3839049635031112109
// 056: lload 2
// 057: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: athrow
// 05d: aload 1
// 05e: iload 4
// 060: ifeq 097
// 063: goto 070
// 066: ldc2_w -3839049635031112109
// 069: lload 2
// 06a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: athrow
// 070: invokevirtual su/catlean/api/event/events/network/AddHandlersEvent.getLocal ()Z
// 073: ifne 114
// 076: goto 083
// 079: ldc2_w -3839049635031112109
// 07c: lload 2
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: aload 1
// 084: invokevirtual su/catlean/api/event/events/network/AddHandlersEvent.getPipeline ()Ljava/util/concurrent/atomic/AtomicReference;
// 087: invokevirtual java/util/concurrent/atomic/AtomicReference.get ()Ljava/lang/Object;
// 08a: goto 097
// 08d: ldc2_w -3839049635031112109
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: checkcast io/netty/channel/ChannelPipeline
// 09a: dup
// 09b: ifnull 113
// 09e: bipush 1
// 09f: anewarray 293
// 0a2: astore 9
// 0a4: aload 9
// 0a6: bipush 0
// 0a7: aload 7
// 0a9: invokevirtual su/catlean/c2.W ()Z
// 0ac: ifeq 0df
// 0af: new io/netty/handler/proxy/Socks4ProxyHandler
// 0b2: dup
// 0b3: new java/net/InetSocketAddress
// 0b6: dup
// 0b7: aload 7
// 0b9: invokevirtual su/catlean/c2.c ()Ljava/lang/String;
// 0bc: aload 7
// 0be: invokevirtual su/catlean/c2.X ()I
// 0c1: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
// 0c4: checkcast java/net/SocketAddress
// 0c7: aload 7
// 0c9: invokevirtual su/catlean/c2.f ()Ljava/lang/String;
// 0cc: invokespecial io/netty/handler/proxy/Socks4ProxyHandler.<init> (Ljava/net/SocketAddress;Ljava/lang/String;)V
// 0cf: checkcast io/netty/handler/proxy/ProxyHandler
// 0d2: goto 107
// 0d5: ldc2_w -3839049635031112109
// 0d8: lload 2
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: new io/netty/handler/proxy/Socks5ProxyHandler
// 0e2: dup
// 0e3: new java/net/InetSocketAddress
// 0e6: dup
// 0e7: aload 7
// 0e9: invokevirtual su/catlean/c2.c ()Ljava/lang/String;
// 0ec: aload 7
// 0ee: invokevirtual su/catlean/c2.X ()I
// 0f1: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
// 0f4: checkcast java/net/SocketAddress
// 0f7: aload 7
// 0f9: invokevirtual su/catlean/c2.f ()Ljava/lang/String;
// 0fc: aload 7
// 0fe: invokevirtual su/catlean/c2.G ()Ljava/lang/String;
// 101: invokespecial io/netty/handler/proxy/Socks5ProxyHandler.<init> (Ljava/net/SocketAddress;Ljava/lang/String;Ljava/lang/String;)V
// 104: checkcast io/netty/handler/proxy/ProxyHandler
// 107: aastore
// 108: aload 9
// 10a: invokeinterface io/netty/channel/ChannelPipeline.addFirst ([Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 2
// 10f: pop
// 110: goto 114
// 113: pop
// 114: nop
// 115: nop
// 116: nop
// 117: goto 11c
// 11a: pop
// 11b: nop
// 11c: return
}

public final boolean Q(long a, @NotNull c2 proxy) {
ax = a ^ ax;
long var4 = ax ^ 113103009072343L;
Intrinsics.checkNotNullParameter(proxy, a<"r">(15000, 7821032533589916361L ^ ax));
return this.M(var4).remove(proxy);
}

public final boolean B(long a, @NotNull c2 proxy) {
ax = a ^ ax;
long var4 = ax ^ 4634732852914L;
Intrinsics.checkNotNullParameter(proxy, a<"r">(6674, 4312449067982809124L ^ ax));
return this.M(var4).add(proxy);
}

public final void o(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 40523606246060L;
long var5 = var1 ^ 2172282320150L;
Iterable var7 = this.M(var5);
boolean var8 = false;
int var9 = 0;

for (Object var11 : var7) {
int var12 = var9++;

int var18;
label30: {
try {
if (var1 <= 0L) {
break;
}

var18 = var12;
if (var1 <= 0L) {
break label30;
}

if (var12 < 0) {
CollectionsKt.throwIndexOverflow();
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 7620622521048368426L, var1);
}

var18 = var12;
}

c2 var13 = (c2)var11;
int var14 = var18;
boolean var15 = false;
l.U(var3, var13, var14);
if (var1 < 0L) {
break;
}
}
}

private final void U(long var1, c2 var3, int var4) {
var1 = a ^ var1;
long var5 = System.currentTimeMillis();
var3.Z(b<"m">(30657, 2087649771426827525L ^ var1));
new Thread(jg::s).start();
}

private static final void s(int param0, c2 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/jg.a J
// 03: ldc2_w 116384279140002
// 06: lxor
// 07: lstore 4
// 09: ldc2_w -8178957255360162486
// 0c: lload 4
// 0e: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13: getstatic su/catlean/jg.h J
// 16: iload 0
// 17: i2l
// 18: lmul
// 19: invokestatic java/lang/Thread.sleep (J)V
// 1c: istore 6
// 1e: nop
// 1f: new io/netty/channel/nio/NioEventLoopGroup
// 22: dup
// 23: invokespecial io/netty/channel/nio/NioEventLoopGroup.<init> ()V
// 26: astore 7
// 28: new io/netty/bootstrap/Bootstrap
// 2b: dup
// 2c: invokespecial io/netty/bootstrap/Bootstrap.<init> ()V
// 2f: astore 8
// 31: aload 8
// 33: aload 7
// 35: checkcast io/netty/channel/EventLoopGroup
// 38: invokevirtual io/netty/bootstrap/Bootstrap.group (Lio/netty/channel/EventLoopGroup;)Lio/netty/bootstrap/AbstractBootstrap;
// 3b: checkcast io/netty/bootstrap/Bootstrap
// 3e: ldc io/netty/channel/socket/nio/NioSocketChannel
// 40: invokevirtual io/netty/bootstrap/Bootstrap.channel (Ljava/lang/Class;)Lio/netty/bootstrap/AbstractBootstrap;
// 43: checkcast io/netty/bootstrap/Bootstrap
// 46: new su/catlean/g3
// 49: dup
// 4a: aload 1
// 4b: invokespecial su/catlean/g3.<init> (Lsu/catlean/c2;)V
// 4e: checkcast io/netty/channel/ChannelHandler
// 51: invokevirtual io/netty/bootstrap/Bootstrap.handler (Lio/netty/channel/ChannelHandler;)Lio/netty/bootstrap/AbstractBootstrap;
// 54: pop
// 55: aload 8
// 57: sipush 5524
// 5a: ldc2_w 393678364627026714
// 5d: lload 4
// 5f: lxor
// 60: invokedynamic r (IJ)Ljava/lang/String; bsm=su/catlean/jg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: sipush 20407
// 68: ldc2_w 6362221605490149721
// 6b: lload 4
// 6d: lxor
// 6e: invokedynamic m (IJ)I bsm=su/catlean/jg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: invokevirtual io/netty/bootstrap/Bootstrap.connect (Ljava/lang/String;I)Lio/netty/channel/ChannelFuture;
// 76: invokeinterface io/netty/channel/ChannelFuture.sync ()Lio/netty/channel/ChannelFuture; 1
// 7b: astore 9
// 7d: aload 9
// 7f: invokeinterface io/netty/channel/ChannelFuture.await ()Lio/netty/channel/ChannelFuture; 1
// 84: pop
// 85: iload 6
// 87: ifne ba
// 8a: aload 9
// 8c: invokeinterface io/netty/channel/ChannelFuture.isSuccess ()Z 1
// 91: ifeq bf
// 94: goto a2
// 97: ldc2_w -8152406906682744265
// 9a: lload 4
// 9c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1: athrow
// a2: aload 1
// a3: invokestatic su/catlean/zf.A ()J
// a6: lload 2
// a7: lsub
// a8: l2i
// a9: invokevirtual su/catlean/c2.Z (I)V
// ac: goto ba
// af: ldc2_w -8152406906682744265
// b2: lload 4
// b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b9: athrow
// ba: iload 6
// bc: ifeq d2
// bf: aload 1
// c0: bipush -1
// c1: invokevirtual su/catlean/c2.Z (I)V
// c4: goto d2
// c7: ldc2_w -8152406906682744265
// ca: lload 4
// cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d1: athrow
// d2: aload 7
// d4: invokevirtual io/netty/channel/nio/NioEventLoopGroup.shutdownGracefully ()Lio/netty/util/concurrent/Future;
// d7: pop
// d8: goto e2
// db: astore 8
// dd: aload 1
// de: bipush -1
// df: invokevirtual su/catlean/c2.Z (I)V
// e2: return
}

static {
long var25 = a ^ 86984420964266L;
long var27 = var25 ^ 126697487857718L;
vm.a<"Å">(null, 3399582197306446707L, var25);
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[3];
int var21 = 0;
String var20 = "\u008dù< î\u000f=¥½\t@\u0017<\b©Ï \u0080ûð?Lo\u000fRr0õ°Ç\u0084å\u000f\u0093:ú`ñ Úp×mqIÈVü^\u0010Wd\u0011×\u008d\u0007°\u0001°óN¯èî½\u0083";
int var22 = "\u008dù< î\u000f=¥½\t@\u0017<\b©Ï \u0080ûð?Lo\u000fRr0õ°Ç\u0084å\u000f\u0093:ú`ñ Úp×mqIÈVü^\u0010Wd\u0011×\u008d\u0007°\u0001°óN¯èî½\u0083"
.length();
char var19 = 16;
int var18 = -1;

while (true) {
byte[] var24 = var16.doFinal(var20.substring(++var18, var18 + var19).getBytes("ISO-8859-1"));
String var36 = a(var24).intern();
int var10001 = -1;
var23[var21++] = var36;
if ((var18 += var19) >= var22) {
b = var23;
c = new String[3];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[3];
int var8 = 0;
String var9 = "û\u009e±\u008c¾ðãÇY\u0005\u0092:ñ«\u009b*°6=\\\r$ÿª";
int var10 = "û\u009e±\u008c¾ðãÇY\u0005\u0092:ñ«\u009b*°6=\\\r$ÿª".length();
byte var7 = 0;

do {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
var10001 = var8++;
long var13 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
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
long var10004 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
byte var42 = -1;
var11[var10001] = var10004;
} while (var7 < var10);

e = var11;
f = new Integer[3];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 1795551080340324117L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var40 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var35 = -1;
h = var40;
l = new jg();
i = new i9(var27);
return;
}

var19 = var20.charAt(var18);
}
}

public static void A(int[] var0) {
O = var0;
}

public static int[] O() {
return O;
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22965;
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
throw new RuntimeException("su/catlean/jg", var10);
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
throw new RuntimeException("su/catlean/jg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 2517;
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
throw new RuntimeException("su/catlean/jg", var14);
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
throw new RuntimeException("su/catlean/jg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
