// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _assuan_peercred {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG_LONG.withName("pid")
    ).withName("_assuan_peercred");
    public static MemoryLayout $LAYOUT() {
        return _assuan_peercred.$struct$LAYOUT;
    }
    static final VarHandle pid$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pid"));
    public static VarHandle pid$VH() {
        return _assuan_peercred.pid$VH;
    }
    public static long pid$get(MemorySegment seg) {
        return (long)_assuan_peercred.pid$VH.get(seg);
    }
    public static void pid$set( MemorySegment seg, long x) {
        _assuan_peercred.pid$VH.set(seg, x);
    }
    public static long pid$get(MemorySegment seg, long index) {
        return (long)_assuan_peercred.pid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pid$set(MemorySegment seg, long index, long x) {
        _assuan_peercred.pid$VH.set(seg.asSlice(index*sizeof()), x);
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

