// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagSERIALIZEDPROPERTYVALUE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwType"),
        MemoryLayout.sequenceLayout(1, C_CHAR).withName("rgb"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagSERIALIZEDPROPERTYVALUE");
    public static MemoryLayout $LAYOUT() {
        return tagSERIALIZEDPROPERTYVALUE.$struct$LAYOUT;
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return tagSERIALIZEDPROPERTYVALUE.dwType$VH;
    }
    public static int dwType$get(MemorySegment seg) {
        return (int)tagSERIALIZEDPROPERTYVALUE.dwType$VH.get(seg);
    }
    public static void dwType$set( MemorySegment seg, int x) {
        tagSERIALIZEDPROPERTYVALUE.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)tagSERIALIZEDPROPERTYVALUE.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        tagSERIALIZEDPROPERTYVALUE.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgb$slice(MemorySegment seg) {
        return seg.asSlice(4, 1);
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

