// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagEMRSETMITERLIMIT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("iType"),
            C_LONG.withName("nSize")
        ).withName("emr"),
        C_FLOAT.withName("eMiterLimit")
    ).withName("tagEMRSETMITERLIMIT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSETMITERLIMIT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle eMiterLimit$VH = $struct$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("eMiterLimit"));
    public static VarHandle eMiterLimit$VH() {
        return tagEMRSETMITERLIMIT.eMiterLimit$VH;
    }
    public static float eMiterLimit$get(MemorySegment seg) {
        return (float)tagEMRSETMITERLIMIT.eMiterLimit$VH.get(seg);
    }
    public static void eMiterLimit$set( MemorySegment seg, float x) {
        tagEMRSETMITERLIMIT.eMiterLimit$VH.set(seg, x);
    }
    public static float eMiterLimit$get(MemorySegment seg, long index) {
        return (float)tagEMRSETMITERLIMIT.eMiterLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eMiterLimit$set(MemorySegment seg, long index, float x) {
        tagEMRSETMITERLIMIT.eMiterLimit$VH.set(seg.asSlice(index*sizeof()), x);
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

