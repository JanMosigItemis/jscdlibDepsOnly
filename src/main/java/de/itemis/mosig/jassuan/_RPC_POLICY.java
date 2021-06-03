// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _RPC_POLICY {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("Length"),
        C_LONG.withName("EndpointFlags"),
        C_LONG.withName("NICFlags")
    ).withName("_RPC_POLICY");
    public static MemoryLayout $LAYOUT() {
        return _RPC_POLICY.$struct$LAYOUT;
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _RPC_POLICY.Length$VH;
    }
    public static int Length$get(MemorySegment seg) {
        return (int)_RPC_POLICY.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, int x) {
        _RPC_POLICY.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_RPC_POLICY.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _RPC_POLICY.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EndpointFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("EndpointFlags"));
    public static VarHandle EndpointFlags$VH() {
        return _RPC_POLICY.EndpointFlags$VH;
    }
    public static int EndpointFlags$get(MemorySegment seg) {
        return (int)_RPC_POLICY.EndpointFlags$VH.get(seg);
    }
    public static void EndpointFlags$set( MemorySegment seg, int x) {
        _RPC_POLICY.EndpointFlags$VH.set(seg, x);
    }
    public static int EndpointFlags$get(MemorySegment seg, long index) {
        return (int)_RPC_POLICY.EndpointFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EndpointFlags$set(MemorySegment seg, long index, int x) {
        _RPC_POLICY.EndpointFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NICFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NICFlags"));
    public static VarHandle NICFlags$VH() {
        return _RPC_POLICY.NICFlags$VH;
    }
    public static int NICFlags$get(MemorySegment seg) {
        return (int)_RPC_POLICY.NICFlags$VH.get(seg);
    }
    public static void NICFlags$set( MemorySegment seg, int x) {
        _RPC_POLICY.NICFlags$VH.set(seg, x);
    }
    public static int NICFlags$get(MemorySegment seg, long index) {
        return (int)_RPC_POLICY.NICFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NICFlags$set(MemorySegment seg, long index, int x) {
        _RPC_POLICY.NICFlags$VH.set(seg.asSlice(index*sizeof()), x);
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

