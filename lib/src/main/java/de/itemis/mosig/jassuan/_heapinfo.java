// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _heapinfo {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("_pentry"),
        C_LONG_LONG.withName("_size"),
        C_INT.withName("_useflag"),
        MemoryLayout.paddingLayout(32)
    ).withName("_heapinfo");
    public static MemoryLayout $LAYOUT() {
        return _heapinfo.$struct$LAYOUT;
    }
    static final VarHandle _pentry$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_pentry")));
    public static VarHandle _pentry$VH() {
        return _heapinfo._pentry$VH;
    }
    public static MemoryAddress _pentry$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_heapinfo._pentry$VH.get(seg);
    }
    public static void _pentry$set( MemorySegment seg, MemoryAddress x) {
        _heapinfo._pentry$VH.set(seg, x);
    }
    public static MemoryAddress _pentry$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_heapinfo._pentry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pentry$set(MemorySegment seg, long index, MemoryAddress x) {
        _heapinfo._pentry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _size$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_size"));
    public static VarHandle _size$VH() {
        return _heapinfo._size$VH;
    }
    public static long _size$get(MemorySegment seg) {
        return (long)_heapinfo._size$VH.get(seg);
    }
    public static void _size$set( MemorySegment seg, long x) {
        _heapinfo._size$VH.set(seg, x);
    }
    public static long _size$get(MemorySegment seg, long index) {
        return (long)_heapinfo._size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _size$set(MemorySegment seg, long index, long x) {
        _heapinfo._size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _useflag$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_useflag"));
    public static VarHandle _useflag$VH() {
        return _heapinfo._useflag$VH;
    }
    public static int _useflag$get(MemorySegment seg) {
        return (int)_heapinfo._useflag$VH.get(seg);
    }
    public static void _useflag$set( MemorySegment seg, int x) {
        _heapinfo._useflag$VH.set(seg, x);
    }
    public static int _useflag$get(MemorySegment seg, long index) {
        return (int)_heapinfo._useflag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _useflag$set(MemorySegment seg, long index, int x) {
        _heapinfo._useflag$VH.set(seg.asSlice(index*sizeof()), x);
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

