// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagEMRRESTOREDC {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("iType"),
            C_LONG.withName("nSize")
        ).withName("emr"),
        C_LONG.withName("iRelative")
    ).withName("tagEMRRESTOREDC");
    public static MemoryLayout $LAYOUT() {
        return tagEMRRESTOREDC.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle iRelative$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iRelative"));
    public static VarHandle iRelative$VH() {
        return tagEMRRESTOREDC.iRelative$VH;
    }
    public static int iRelative$get(MemorySegment seg) {
        return (int)tagEMRRESTOREDC.iRelative$VH.get(seg);
    }
    public static void iRelative$set( MemorySegment seg, int x) {
        tagEMRRESTOREDC.iRelative$VH.set(seg, x);
    }
    public static int iRelative$get(MemorySegment seg, long index) {
        return (int)tagEMRRESTOREDC.iRelative$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iRelative$set(MemorySegment seg, long index, int x) {
        tagEMRRESTOREDC.iRelative$VH.set(seg.asSlice(index*sizeof()), x);
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

