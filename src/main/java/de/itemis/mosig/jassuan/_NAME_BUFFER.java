// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _NAME_BUFFER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, C_CHAR).withName("name"),
        C_CHAR.withName("name_num"),
        C_CHAR.withName("name_flags")
    ).withName("_NAME_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _NAME_BUFFER.$struct$LAYOUT;
    }
    public static MemorySegment name$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle name_num$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("name_num"));
    public static VarHandle name_num$VH() {
        return _NAME_BUFFER.name_num$VH;
    }
    public static byte name_num$get(MemorySegment seg) {
        return (byte)_NAME_BUFFER.name_num$VH.get(seg);
    }
    public static void name_num$set( MemorySegment seg, byte x) {
        _NAME_BUFFER.name_num$VH.set(seg, x);
    }
    public static byte name_num$get(MemorySegment seg, long index) {
        return (byte)_NAME_BUFFER.name_num$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name_num$set(MemorySegment seg, long index, byte x) {
        _NAME_BUFFER.name_num$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name_flags$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("name_flags"));
    public static VarHandle name_flags$VH() {
        return _NAME_BUFFER.name_flags$VH;
    }
    public static byte name_flags$get(MemorySegment seg) {
        return (byte)_NAME_BUFFER.name_flags$VH.get(seg);
    }
    public static void name_flags$set( MemorySegment seg, byte x) {
        _NAME_BUFFER.name_flags$VH.set(seg, x);
    }
    public static byte name_flags$get(MemorySegment seg, long index) {
        return (byte)_NAME_BUFFER.name_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name_flags$set(MemorySegment seg, long index, byte x) {
        _NAME_BUFFER.name_flags$VH.set(seg.asSlice(index*sizeof()), x);
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

