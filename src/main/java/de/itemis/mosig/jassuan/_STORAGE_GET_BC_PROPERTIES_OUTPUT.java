// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _STORAGE_GET_BC_PROPERTIES_OUTPUT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("MaximumRequestsPerPeriod"),
        C_LONG.withName("MinimumPeriod"),
        C_LONG_LONG.withName("MaximumRequestSize"),
        C_LONG.withName("EstimatedTimePerRequest"),
        C_LONG.withName("NumOutStandingRequests"),
        C_LONG_LONG.withName("RequestSize")
    ).withName("_STORAGE_GET_BC_PROPERTIES_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_GET_BC_PROPERTIES_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle MaximumRequestsPerPeriod$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("MaximumRequestsPerPeriod"));
    public static VarHandle MaximumRequestsPerPeriod$VH() {
        return _STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestsPerPeriod$VH;
    }
    public static int MaximumRequestsPerPeriod$get(MemorySegment seg) {
        return (int)_STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestsPerPeriod$VH.get(seg);
    }
    public static void MaximumRequestsPerPeriod$set( MemorySegment seg, int x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestsPerPeriod$VH.set(seg, x);
    }
    public static int MaximumRequestsPerPeriod$get(MemorySegment seg, long index) {
        return (int)_STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestsPerPeriod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumRequestsPerPeriod$set(MemorySegment seg, long index, int x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestsPerPeriod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinimumPeriod$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("MinimumPeriod"));
    public static VarHandle MinimumPeriod$VH() {
        return _STORAGE_GET_BC_PROPERTIES_OUTPUT.MinimumPeriod$VH;
    }
    public static int MinimumPeriod$get(MemorySegment seg) {
        return (int)_STORAGE_GET_BC_PROPERTIES_OUTPUT.MinimumPeriod$VH.get(seg);
    }
    public static void MinimumPeriod$set( MemorySegment seg, int x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.MinimumPeriod$VH.set(seg, x);
    }
    public static int MinimumPeriod$get(MemorySegment seg, long index) {
        return (int)_STORAGE_GET_BC_PROPERTIES_OUTPUT.MinimumPeriod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinimumPeriod$set(MemorySegment seg, long index, int x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.MinimumPeriod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaximumRequestSize$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("MaximumRequestSize"));
    public static VarHandle MaximumRequestSize$VH() {
        return _STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestSize$VH;
    }
    public static long MaximumRequestSize$get(MemorySegment seg) {
        return (long)_STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestSize$VH.get(seg);
    }
    public static void MaximumRequestSize$set( MemorySegment seg, long x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestSize$VH.set(seg, x);
    }
    public static long MaximumRequestSize$get(MemorySegment seg, long index) {
        return (long)_STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumRequestSize$set(MemorySegment seg, long index, long x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.MaximumRequestSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EstimatedTimePerRequest$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("EstimatedTimePerRequest"));
    public static VarHandle EstimatedTimePerRequest$VH() {
        return _STORAGE_GET_BC_PROPERTIES_OUTPUT.EstimatedTimePerRequest$VH;
    }
    public static int EstimatedTimePerRequest$get(MemorySegment seg) {
        return (int)_STORAGE_GET_BC_PROPERTIES_OUTPUT.EstimatedTimePerRequest$VH.get(seg);
    }
    public static void EstimatedTimePerRequest$set( MemorySegment seg, int x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.EstimatedTimePerRequest$VH.set(seg, x);
    }
    public static int EstimatedTimePerRequest$get(MemorySegment seg, long index) {
        return (int)_STORAGE_GET_BC_PROPERTIES_OUTPUT.EstimatedTimePerRequest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EstimatedTimePerRequest$set(MemorySegment seg, long index, int x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.EstimatedTimePerRequest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumOutStandingRequests$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumOutStandingRequests"));
    public static VarHandle NumOutStandingRequests$VH() {
        return _STORAGE_GET_BC_PROPERTIES_OUTPUT.NumOutStandingRequests$VH;
    }
    public static int NumOutStandingRequests$get(MemorySegment seg) {
        return (int)_STORAGE_GET_BC_PROPERTIES_OUTPUT.NumOutStandingRequests$VH.get(seg);
    }
    public static void NumOutStandingRequests$set( MemorySegment seg, int x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.NumOutStandingRequests$VH.set(seg, x);
    }
    public static int NumOutStandingRequests$get(MemorySegment seg, long index) {
        return (int)_STORAGE_GET_BC_PROPERTIES_OUTPUT.NumOutStandingRequests$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumOutStandingRequests$set(MemorySegment seg, long index, int x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.NumOutStandingRequests$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RequestSize$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("RequestSize"));
    public static VarHandle RequestSize$VH() {
        return _STORAGE_GET_BC_PROPERTIES_OUTPUT.RequestSize$VH;
    }
    public static long RequestSize$get(MemorySegment seg) {
        return (long)_STORAGE_GET_BC_PROPERTIES_OUTPUT.RequestSize$VH.get(seg);
    }
    public static void RequestSize$set( MemorySegment seg, long x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.RequestSize$VH.set(seg, x);
    }
    public static long RequestSize$get(MemorySegment seg, long index) {
        return (long)_STORAGE_GET_BC_PROPERTIES_OUTPUT.RequestSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestSize$set(MemorySegment seg, long index, long x) {
        _STORAGE_GET_BC_PROPERTIES_OUTPUT.RequestSize$VH.set(seg.asSlice(index*sizeof()), x);
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

