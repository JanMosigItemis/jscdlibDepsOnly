// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagDEC {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("wReserved"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_CHAR.withName("scale"),
                C_CHAR.withName("sign")
            ).withName("$anon$0"),
            C_SHORT.withName("signscale")
        ).withName("$anon$0"),
        C_LONG.withName("Hi32"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("Lo32"),
                C_LONG.withName("Mid32")
            ).withName("$anon$0"),
            C_LONG_LONG.withName("Lo64")
        ).withName("$anon$1")
    ).withName("tagDEC");
    public static MemoryLayout $LAYOUT() {
        return tagDEC.$struct$LAYOUT;
    }
    static final VarHandle wReserved$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wReserved"));
    public static VarHandle wReserved$VH() {
        return tagDEC.wReserved$VH;
    }
    public static short wReserved$get(MemorySegment seg) {
        return (short)tagDEC.wReserved$VH.get(seg);
    }
    public static void wReserved$set( MemorySegment seg, short x) {
        tagDEC.wReserved$VH.set(seg, x);
    }
    public static short wReserved$get(MemorySegment seg, long index) {
        return (short)tagDEC.wReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, short x) {
        tagDEC.wReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle scale$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("scale"));
    public static VarHandle scale$VH() {
        return tagDEC.scale$VH;
    }
    public static byte scale$get(MemorySegment seg) {
        return (byte)tagDEC.scale$VH.get(seg);
    }
    public static void scale$set( MemorySegment seg, byte x) {
        tagDEC.scale$VH.set(seg, x);
    }
    public static byte scale$get(MemorySegment seg, long index) {
        return (byte)tagDEC.scale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void scale$set(MemorySegment seg, long index, byte x) {
        tagDEC.scale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sign$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("sign"));
    public static VarHandle sign$VH() {
        return tagDEC.sign$VH;
    }
    public static byte sign$get(MemorySegment seg) {
        return (byte)tagDEC.sign$VH.get(seg);
    }
    public static void sign$set( MemorySegment seg, byte x) {
        tagDEC.sign$VH.set(seg, x);
    }
    public static byte sign$get(MemorySegment seg, long index) {
        return (byte)tagDEC.sign$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sign$set(MemorySegment seg, long index, byte x) {
        tagDEC.sign$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle signscale$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("signscale"));
    public static VarHandle signscale$VH() {
        return tagDEC.signscale$VH;
    }
    public static short signscale$get(MemorySegment seg) {
        return (short)tagDEC.signscale$VH.get(seg);
    }
    public static void signscale$set( MemorySegment seg, short x) {
        tagDEC.signscale$VH.set(seg, x);
    }
    public static short signscale$get(MemorySegment seg, long index) {
        return (short)tagDEC.signscale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signscale$set(MemorySegment seg, long index, short x) {
        tagDEC.signscale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Hi32$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Hi32"));
    public static VarHandle Hi32$VH() {
        return tagDEC.Hi32$VH;
    }
    public static int Hi32$get(MemorySegment seg) {
        return (int)tagDEC.Hi32$VH.get(seg);
    }
    public static void Hi32$set( MemorySegment seg, int x) {
        tagDEC.Hi32$VH.set(seg, x);
    }
    public static int Hi32$get(MemorySegment seg, long index) {
        return (int)tagDEC.Hi32$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Hi32$set(MemorySegment seg, long index, int x) {
        tagDEC.Hi32$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Lo32$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Lo32"));
    public static VarHandle Lo32$VH() {
        return tagDEC.Lo32$VH;
    }
    public static int Lo32$get(MemorySegment seg) {
        return (int)tagDEC.Lo32$VH.get(seg);
    }
    public static void Lo32$set( MemorySegment seg, int x) {
        tagDEC.Lo32$VH.set(seg, x);
    }
    public static int Lo32$get(MemorySegment seg, long index) {
        return (int)tagDEC.Lo32$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Lo32$set(MemorySegment seg, long index, int x) {
        tagDEC.Lo32$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Mid32$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Mid32"));
    public static VarHandle Mid32$VH() {
        return tagDEC.Mid32$VH;
    }
    public static int Mid32$get(MemorySegment seg) {
        return (int)tagDEC.Mid32$VH.get(seg);
    }
    public static void Mid32$set( MemorySegment seg, int x) {
        tagDEC.Mid32$VH.set(seg, x);
    }
    public static int Mid32$get(MemorySegment seg, long index) {
        return (int)tagDEC.Mid32$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Mid32$set(MemorySegment seg, long index, int x) {
        tagDEC.Mid32$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Lo64$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("Lo64"));
    public static VarHandle Lo64$VH() {
        return tagDEC.Lo64$VH;
    }
    public static long Lo64$get(MemorySegment seg) {
        return (long)tagDEC.Lo64$VH.get(seg);
    }
    public static void Lo64$set( MemorySegment seg, long x) {
        tagDEC.Lo64$VH.set(seg, x);
    }
    public static long Lo64$get(MemorySegment seg, long index) {
        return (long)tagDEC.Lo64$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Lo64$set(MemorySegment seg, long index, long x) {
        tagDEC.Lo64$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

