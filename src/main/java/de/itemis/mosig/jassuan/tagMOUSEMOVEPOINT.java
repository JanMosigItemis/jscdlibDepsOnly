// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMOUSEMOVEPOINT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("x"),
        C_INT.withName("y"),
        C_LONG.withName("time"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("dwExtraInfo")
    ).withName("tagMOUSEMOVEPOINT");
    public static MemoryLayout $LAYOUT() {
        return tagMOUSEMOVEPOINT.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagMOUSEMOVEPOINT.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)tagMOUSEMOVEPOINT.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        tagMOUSEMOVEPOINT.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagMOUSEMOVEPOINT.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagMOUSEMOVEPOINT.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagMOUSEMOVEPOINT.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)tagMOUSEMOVEPOINT.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        tagMOUSEMOVEPOINT.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagMOUSEMOVEPOINT.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagMOUSEMOVEPOINT.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return tagMOUSEMOVEPOINT.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)tagMOUSEMOVEPOINT.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        tagMOUSEMOVEPOINT.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)tagMOUSEMOVEPOINT.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        tagMOUSEMOVEPOINT.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtraInfo$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    public static VarHandle dwExtraInfo$VH() {
        return tagMOUSEMOVEPOINT.dwExtraInfo$VH;
    }
    public static long dwExtraInfo$get(MemorySegment seg) {
        return (long)tagMOUSEMOVEPOINT.dwExtraInfo$VH.get(seg);
    }
    public static void dwExtraInfo$set( MemorySegment seg, long x) {
        tagMOUSEMOVEPOINT.dwExtraInfo$VH.set(seg, x);
    }
    public static long dwExtraInfo$get(MemorySegment seg, long index) {
        return (long)tagMOUSEMOVEPOINT.dwExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtraInfo$set(MemorySegment seg, long index, long x) {
        tagMOUSEMOVEPOINT.dwExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
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

