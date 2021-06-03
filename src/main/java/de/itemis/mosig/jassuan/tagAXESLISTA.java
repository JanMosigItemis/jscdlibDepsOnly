// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagAXESLISTA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("axlReserved"),
        C_LONG.withName("axlNumAxes"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
            C_LONG.withName("axMinValue"),
            C_LONG.withName("axMaxValue"),
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("axAxisName")
        ).withName("tagAXISINFOA")).withName("axlAxisInfo")
    ).withName("tagAXESLISTA");
    public static MemoryLayout $LAYOUT() {
        return tagAXESLISTA.$struct$LAYOUT;
    }
    static final VarHandle axlReserved$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("axlReserved"));
    public static VarHandle axlReserved$VH() {
        return tagAXESLISTA.axlReserved$VH;
    }
    public static int axlReserved$get(MemorySegment seg) {
        return (int)tagAXESLISTA.axlReserved$VH.get(seg);
    }
    public static void axlReserved$set( MemorySegment seg, int x) {
        tagAXESLISTA.axlReserved$VH.set(seg, x);
    }
    public static int axlReserved$get(MemorySegment seg, long index) {
        return (int)tagAXESLISTA.axlReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void axlReserved$set(MemorySegment seg, long index, int x) {
        tagAXESLISTA.axlReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle axlNumAxes$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("axlNumAxes"));
    public static VarHandle axlNumAxes$VH() {
        return tagAXESLISTA.axlNumAxes$VH;
    }
    public static int axlNumAxes$get(MemorySegment seg) {
        return (int)tagAXESLISTA.axlNumAxes$VH.get(seg);
    }
    public static void axlNumAxes$set( MemorySegment seg, int x) {
        tagAXESLISTA.axlNumAxes$VH.set(seg, x);
    }
    public static int axlNumAxes$get(MemorySegment seg, long index) {
        return (int)tagAXESLISTA.axlNumAxes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void axlNumAxes$set(MemorySegment seg, long index, int x) {
        tagAXESLISTA.axlNumAxes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment axlAxisInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 384);
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

