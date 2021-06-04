// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class DISPLAYCONFIG_TARGET_BASE_TYPE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_INT.withName("type"),
            C_INT.withName("size"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("adapterId"),
            C_INT.withName("id")
        ).withName("header"),
        C_INT.withName("baseOutputTechnology")
    ).withName("DISPLAYCONFIG_TARGET_BASE_TYPE");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_TARGET_BASE_TYPE.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    static final VarHandle baseOutputTechnology$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("baseOutputTechnology"));
    public static VarHandle baseOutputTechnology$VH() {
        return DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH;
    }
    public static int baseOutputTechnology$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH.get(seg);
    }
    public static void baseOutputTechnology$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH.set(seg, x);
    }
    public static int baseOutputTechnology$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void baseOutputTechnology$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH.set(seg.asSlice(index*sizeof()), x);
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

