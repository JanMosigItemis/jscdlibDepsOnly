// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CMSG_STREAM_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbContent"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pfnStreamOutput"),
        C_POINTER.withName("pvArg")
    ).withName("_CMSG_STREAM_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_STREAM_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbContent$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbContent"));
    public static VarHandle cbContent$VH() {
        return _CMSG_STREAM_INFO.cbContent$VH;
    }
    public static int cbContent$get(MemorySegment seg) {
        return (int)_CMSG_STREAM_INFO.cbContent$VH.get(seg);
    }
    public static void cbContent$set( MemorySegment seg, int x) {
        _CMSG_STREAM_INFO.cbContent$VH.set(seg, x);
    }
    public static int cbContent$get(MemorySegment seg, long index) {
        return (int)_CMSG_STREAM_INFO.cbContent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbContent$set(MemorySegment seg, long index, int x) {
        _CMSG_STREAM_INFO.cbContent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnStreamOutput$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnStreamOutput")));
    public static VarHandle pfnStreamOutput$VH() {
        return _CMSG_STREAM_INFO.pfnStreamOutput$VH;
    }
    public static MemoryAddress pfnStreamOutput$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CMSG_STREAM_INFO.pfnStreamOutput$VH.get(seg);
    }
    public static void pfnStreamOutput$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_STREAM_INFO.pfnStreamOutput$VH.set(seg, x);
    }
    public static MemoryAddress pfnStreamOutput$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CMSG_STREAM_INFO.pfnStreamOutput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnStreamOutput$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_STREAM_INFO.pfnStreamOutput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_STREAM_OUTPUT pfnStreamOutput (MemorySegment segment) {
        return PFN_CMSG_STREAM_OUTPUT.ofAddress(pfnStreamOutput$get(segment));
    }
    static final VarHandle pvArg$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvArg")));
    public static VarHandle pvArg$VH() {
        return _CMSG_STREAM_INFO.pvArg$VH;
    }
    public static MemoryAddress pvArg$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CMSG_STREAM_INFO.pvArg$VH.get(seg);
    }
    public static void pvArg$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_STREAM_INFO.pvArg$VH.set(seg, x);
    }
    public static MemoryAddress pvArg$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CMSG_STREAM_INFO.pvArg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvArg$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_STREAM_INFO.pvArg$VH.set(seg.asSlice(index*sizeof()), x);
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

