// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _BIN_RANGE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("StartValue"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("Length")
    ).withName("_BIN_RANGE");
    public static MemoryLayout $LAYOUT() {
        return _BIN_RANGE.$struct$LAYOUT;
    }
    public static MemorySegment StartValue$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment Length$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
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

