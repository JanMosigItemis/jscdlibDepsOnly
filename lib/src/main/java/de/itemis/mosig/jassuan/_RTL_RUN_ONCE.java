// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _RTL_RUN_ONCE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("Ptr")
    ).withName("_RTL_RUN_ONCE");
    public static MemoryLayout $LAYOUT() {
        return _RTL_RUN_ONCE.$struct$LAYOUT;
    }
    static final VarHandle Ptr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Ptr")));
    public static VarHandle Ptr$VH() {
        return _RTL_RUN_ONCE.Ptr$VH;
    }
    public static MemoryAddress Ptr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_RTL_RUN_ONCE.Ptr$VH.get(seg);
    }
    public static void Ptr$set( MemorySegment seg, MemoryAddress x) {
        _RTL_RUN_ONCE.Ptr$VH.set(seg, x);
    }
    public static MemoryAddress Ptr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_RTL_RUN_ONCE.Ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ptr$set(MemorySegment seg, long index, MemoryAddress x) {
        _RTL_RUN_ONCE.Ptr$VH.set(seg.asSlice(index*sizeof()), x);
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

