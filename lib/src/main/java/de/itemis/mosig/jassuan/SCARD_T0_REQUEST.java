// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class SCARD_T0_REQUEST {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("dwProtocol"),
            C_LONG.withName("cbPciLength")
        ).withName("ioRequest"),
        C_CHAR.withName("bSw1"),
        C_CHAR.withName("bSw2"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_CHAR.withName("bCla"),
                C_CHAR.withName("bIns"),
                C_CHAR.withName("bP1"),
                C_CHAR.withName("bP2"),
                C_CHAR.withName("bP3")
            ).withName("CmdBytes"),
            MemoryLayout.sequenceLayout(5, C_CHAR).withName("rgbHeader")
        ).withName("$anon$0"),
        MemoryLayout.paddingLayout(8)
    );
    public static MemoryLayout $LAYOUT() {
        return SCARD_T0_REQUEST.$struct$LAYOUT;
    }
    public static MemorySegment ioRequest$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle bSw1$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("bSw1"));
    public static VarHandle bSw1$VH() {
        return SCARD_T0_REQUEST.bSw1$VH;
    }
    public static byte bSw1$get(MemorySegment seg) {
        return (byte)SCARD_T0_REQUEST.bSw1$VH.get(seg);
    }
    public static void bSw1$set( MemorySegment seg, byte x) {
        SCARD_T0_REQUEST.bSw1$VH.set(seg, x);
    }
    public static byte bSw1$get(MemorySegment seg, long index) {
        return (byte)SCARD_T0_REQUEST.bSw1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bSw1$set(MemorySegment seg, long index, byte x) {
        SCARD_T0_REQUEST.bSw1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bSw2$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("bSw2"));
    public static VarHandle bSw2$VH() {
        return SCARD_T0_REQUEST.bSw2$VH;
    }
    public static byte bSw2$get(MemorySegment seg) {
        return (byte)SCARD_T0_REQUEST.bSw2$VH.get(seg);
    }
    public static void bSw2$set( MemorySegment seg, byte x) {
        SCARD_T0_REQUEST.bSw2$VH.set(seg, x);
    }
    public static byte bSw2$get(MemorySegment seg, long index) {
        return (byte)SCARD_T0_REQUEST.bSw2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bSw2$set(MemorySegment seg, long index, byte x) {
        SCARD_T0_REQUEST.bSw2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment CmdBytes$slice(MemorySegment seg) {
        return seg.asSlice(10, 5);
    }
    public static MemorySegment rgbHeader$slice(MemorySegment seg) {
        return seg.asSlice(10, 5);
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

