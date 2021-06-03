// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _sockaddr_in6_pair {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("SourceAddress"),
        C_POINTER.withName("DestinationAddress")
    ).withName("_sockaddr_in6_pair");
    public static MemoryLayout $LAYOUT() {
        return _sockaddr_in6_pair.$struct$LAYOUT;
    }
    static final VarHandle SourceAddress$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SourceAddress")));
    public static VarHandle SourceAddress$VH() {
        return _sockaddr_in6_pair.SourceAddress$VH;
    }
    public static MemoryAddress SourceAddress$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_sockaddr_in6_pair.SourceAddress$VH.get(seg);
    }
    public static void SourceAddress$set( MemorySegment seg, MemoryAddress x) {
        _sockaddr_in6_pair.SourceAddress$VH.set(seg, x);
    }
    public static MemoryAddress SourceAddress$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_sockaddr_in6_pair.SourceAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _sockaddr_in6_pair.SourceAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DestinationAddress$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("DestinationAddress")));
    public static VarHandle DestinationAddress$VH() {
        return _sockaddr_in6_pair.DestinationAddress$VH;
    }
    public static MemoryAddress DestinationAddress$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_sockaddr_in6_pair.DestinationAddress$VH.get(seg);
    }
    public static void DestinationAddress$set( MemorySegment seg, MemoryAddress x) {
        _sockaddr_in6_pair.DestinationAddress$VH.set(seg, x);
    }
    public static MemoryAddress DestinationAddress$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_sockaddr_in6_pair.DestinationAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DestinationAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _sockaddr_in6_pair.DestinationAddress$VH.set(seg.asSlice(index*sizeof()), x);
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

