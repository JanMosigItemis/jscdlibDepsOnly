// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagEMRSETWORLDTRANSFORM {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("iType"),
            C_LONG.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            C_FLOAT.withName("eM11"),
            C_FLOAT.withName("eM12"),
            C_FLOAT.withName("eM21"),
            C_FLOAT.withName("eM22"),
            C_FLOAT.withName("eDx"),
            C_FLOAT.withName("eDy")
        ).withName("xform")
    ).withName("tagEMRSETWORLDTRANSFORM");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSETWORLDTRANSFORM.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment xform$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
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

