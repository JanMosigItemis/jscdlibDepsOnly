// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _OUTPUT_DEBUG_STRING_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("lpDebugStringData"),
        C_SHORT.withName("fUnicode"),
        C_SHORT.withName("nDebugStringLength"),
        MemoryLayout.paddingLayout(32)
    ).withName("_OUTPUT_DEBUG_STRING_INFO");
    public static MemoryLayout $LAYOUT() {
        return _OUTPUT_DEBUG_STRING_INFO.$struct$LAYOUT;
    }
    static final VarHandle lpDebugStringData$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpDebugStringData")));
    public static VarHandle lpDebugStringData$VH() {
        return _OUTPUT_DEBUG_STRING_INFO.lpDebugStringData$VH;
    }
    public static MemoryAddress lpDebugStringData$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_OUTPUT_DEBUG_STRING_INFO.lpDebugStringData$VH.get(seg);
    }
    public static void lpDebugStringData$set( MemorySegment seg, MemoryAddress x) {
        _OUTPUT_DEBUG_STRING_INFO.lpDebugStringData$VH.set(seg, x);
    }
    public static MemoryAddress lpDebugStringData$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_OUTPUT_DEBUG_STRING_INFO.lpDebugStringData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDebugStringData$set(MemorySegment seg, long index, MemoryAddress x) {
        _OUTPUT_DEBUG_STRING_INFO.lpDebugStringData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fUnicode$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("fUnicode"));
    public static VarHandle fUnicode$VH() {
        return _OUTPUT_DEBUG_STRING_INFO.fUnicode$VH;
    }
    public static short fUnicode$get(MemorySegment seg) {
        return (short)_OUTPUT_DEBUG_STRING_INFO.fUnicode$VH.get(seg);
    }
    public static void fUnicode$set( MemorySegment seg, short x) {
        _OUTPUT_DEBUG_STRING_INFO.fUnicode$VH.set(seg, x);
    }
    public static short fUnicode$get(MemorySegment seg, long index) {
        return (short)_OUTPUT_DEBUG_STRING_INFO.fUnicode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fUnicode$set(MemorySegment seg, long index, short x) {
        _OUTPUT_DEBUG_STRING_INFO.fUnicode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nDebugStringLength$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("nDebugStringLength"));
    public static VarHandle nDebugStringLength$VH() {
        return _OUTPUT_DEBUG_STRING_INFO.nDebugStringLength$VH;
    }
    public static short nDebugStringLength$get(MemorySegment seg) {
        return (short)_OUTPUT_DEBUG_STRING_INFO.nDebugStringLength$VH.get(seg);
    }
    public static void nDebugStringLength$set( MemorySegment seg, short x) {
        _OUTPUT_DEBUG_STRING_INFO.nDebugStringLength$VH.set(seg, x);
    }
    public static short nDebugStringLength$get(MemorySegment seg, long index) {
        return (short)_OUTPUT_DEBUG_STRING_INFO.nDebugStringLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nDebugStringLength$set(MemorySegment seg, long index, short x) {
        _OUTPUT_DEBUG_STRING_INFO.nDebugStringLength$VH.set(seg.asSlice(index*sizeof()), x);
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

