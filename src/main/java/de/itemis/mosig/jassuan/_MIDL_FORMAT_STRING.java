// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _MIDL_FORMAT_STRING {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("Pad"),
        MemoryLayout.sequenceLayout(C_CHAR).withName("Format")
    ).withName("_MIDL_FORMAT_STRING");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_FORMAT_STRING.$struct$LAYOUT;
    }
    static final VarHandle Pad$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Pad"));
    public static VarHandle Pad$VH() {
        return _MIDL_FORMAT_STRING.Pad$VH;
    }
    public static short Pad$get(MemorySegment seg) {
        return (short)_MIDL_FORMAT_STRING.Pad$VH.get(seg);
    }
    public static void Pad$set( MemorySegment seg, short x) {
        _MIDL_FORMAT_STRING.Pad$VH.set(seg, x);
    }
    public static short Pad$get(MemorySegment seg, long index) {
        return (short)_MIDL_FORMAT_STRING.Pad$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Pad$set(MemorySegment seg, long index, short x) {
        _MIDL_FORMAT_STRING.Pad$VH.set(seg.asSlice(index*sizeof()), x);
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

