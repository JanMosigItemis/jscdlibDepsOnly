// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_CREATE_CONTEXT_PARA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pfnFree"),
        C_POINTER.withName("pvFree"),
        C_POINTER.withName("pfnSort"),
        C_POINTER.withName("pvSort")
    ).withName("_CERT_CREATE_CONTEXT_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_CREATE_CONTEXT_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_CREATE_CONTEXT_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_CREATE_CONTEXT_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_CREATE_CONTEXT_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_CREATE_CONTEXT_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_CREATE_CONTEXT_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnFree$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnFree")));
    public static VarHandle pfnFree$VH() {
        return _CERT_CREATE_CONTEXT_PARA.pfnFree$VH;
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CREATE_CONTEXT_PARA.pfnFree$VH.get(seg);
    }
    public static void pfnFree$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CREATE_CONTEXT_PARA.pfnFree$VH.set(seg, x);
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CREATE_CONTEXT_PARA.pfnFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CREATE_CONTEXT_PARA.pfnFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_FREE pfnFree (MemorySegment segment) {
        return PFN_CRYPT_FREE.ofAddress(pfnFree$get(segment));
    }
    static final VarHandle pvFree$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvFree")));
    public static VarHandle pvFree$VH() {
        return _CERT_CREATE_CONTEXT_PARA.pvFree$VH;
    }
    public static MemoryAddress pvFree$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CREATE_CONTEXT_PARA.pvFree$VH.get(seg);
    }
    public static void pvFree$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CREATE_CONTEXT_PARA.pvFree$VH.set(seg, x);
    }
    public static MemoryAddress pvFree$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CREATE_CONTEXT_PARA.pvFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvFree$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CREATE_CONTEXT_PARA.pvFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnSort$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnSort")));
    public static VarHandle pfnSort$VH() {
        return _CERT_CREATE_CONTEXT_PARA.pfnSort$VH;
    }
    public static MemoryAddress pfnSort$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CREATE_CONTEXT_PARA.pfnSort$VH.get(seg);
    }
    public static void pfnSort$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CREATE_CONTEXT_PARA.pfnSort$VH.set(seg, x);
    }
    public static MemoryAddress pfnSort$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CREATE_CONTEXT_PARA.pfnSort$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnSort$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CREATE_CONTEXT_PARA.pfnSort$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CERT_CREATE_CONTEXT_SORT_FUNC pfnSort (MemorySegment segment) {
        return PFN_CERT_CREATE_CONTEXT_SORT_FUNC.ofAddress(pfnSort$get(segment));
    }
    static final VarHandle pvSort$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvSort")));
    public static VarHandle pvSort$VH() {
        return _CERT_CREATE_CONTEXT_PARA.pvSort$VH;
    }
    public static MemoryAddress pvSort$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CREATE_CONTEXT_PARA.pvSort$VH.get(seg);
    }
    public static void pvSort$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CREATE_CONTEXT_PARA.pvSort$VH.set(seg, x);
    }
    public static MemoryAddress pvSort$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CREATE_CONTEXT_PARA.pvSort$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvSort$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CREATE_CONTEXT_PARA.pvSort$VH.set(seg.asSlice(index*sizeof()), x);
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

