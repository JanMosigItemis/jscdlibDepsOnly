// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagELEMDESC {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                C_POINTER.withName("lptdesc"),
                C_POINTER.withName("lpadesc"),
                C_LONG.withName("hreftype")
            ).withName("$anon$0"),
            C_SHORT.withName("vt"),
            MemoryLayout.paddingLayout(48)
        ).withName("tdesc"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG_LONG.withName("dwReserved"),
                C_SHORT.withName("wIDLFlags"),
                MemoryLayout.paddingLayout(48)
            ).withName("idldesc"),
            MemoryLayout.structLayout(
                C_POINTER.withName("pparamdescex"),
                C_SHORT.withName("wParamFlags"),
                MemoryLayout.paddingLayout(48)
            ).withName("paramdesc")
        ).withName("$anon$0")
    ).withName("tagELEMDESC");
    public static MemoryLayout $LAYOUT() {
        return tagELEMDESC.$struct$LAYOUT;
    }
    public static MemorySegment tdesc$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment idldesc$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment paramdesc$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
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

