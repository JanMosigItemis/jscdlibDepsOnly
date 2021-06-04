// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _RPC_SECURITY_QOS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Version"),
        C_LONG.withName("Capabilities"),
        C_LONG.withName("IdentityTracking"),
        C_LONG.withName("ImpersonationType")
    ).withName("_RPC_SECURITY_QOS");
    public static MemoryLayout $LAYOUT() {
        return _RPC_SECURITY_QOS.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _RPC_SECURITY_QOS.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _RPC_SECURITY_QOS.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Capabilities$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Capabilities"));
    public static VarHandle Capabilities$VH() {
        return _RPC_SECURITY_QOS.Capabilities$VH;
    }
    public static int Capabilities$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS.Capabilities$VH.get(seg);
    }
    public static void Capabilities$set( MemorySegment seg, int x) {
        _RPC_SECURITY_QOS.Capabilities$VH.set(seg, x);
    }
    public static int Capabilities$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS.Capabilities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Capabilities$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS.Capabilities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IdentityTracking$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("IdentityTracking"));
    public static VarHandle IdentityTracking$VH() {
        return _RPC_SECURITY_QOS.IdentityTracking$VH;
    }
    public static int IdentityTracking$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS.IdentityTracking$VH.get(seg);
    }
    public static void IdentityTracking$set( MemorySegment seg, int x) {
        _RPC_SECURITY_QOS.IdentityTracking$VH.set(seg, x);
    }
    public static int IdentityTracking$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS.IdentityTracking$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IdentityTracking$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS.IdentityTracking$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImpersonationType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ImpersonationType"));
    public static VarHandle ImpersonationType$VH() {
        return _RPC_SECURITY_QOS.ImpersonationType$VH;
    }
    public static int ImpersonationType$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS.ImpersonationType$VH.get(seg);
    }
    public static void ImpersonationType$set( MemorySegment seg, int x) {
        _RPC_SECURITY_QOS.ImpersonationType$VH.set(seg, x);
    }
    public static int ImpersonationType$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS.ImpersonationType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImpersonationType$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS.ImpersonationType$VH.set(seg.asSlice(index*sizeof()), x);
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

