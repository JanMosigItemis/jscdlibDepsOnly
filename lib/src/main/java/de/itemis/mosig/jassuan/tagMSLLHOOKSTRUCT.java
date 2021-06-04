// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMSLLHOOKSTRUCT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("x"),
            C_LONG.withName("y")
        ).withName("pt"),
        C_LONG.withName("mouseData"),
        C_LONG.withName("flags"),
        C_LONG.withName("time"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("dwExtraInfo")
    ).withName("tagMSLLHOOKSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagMSLLHOOKSTRUCT.$struct$LAYOUT;
    }
    public static MemorySegment pt$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle mouseData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("mouseData"));
    public static VarHandle mouseData$VH() {
        return tagMSLLHOOKSTRUCT.mouseData$VH;
    }
    public static int mouseData$get(MemorySegment seg) {
        return (int)tagMSLLHOOKSTRUCT.mouseData$VH.get(seg);
    }
    public static void mouseData$set( MemorySegment seg, int x) {
        tagMSLLHOOKSTRUCT.mouseData$VH.set(seg, x);
    }
    public static int mouseData$get(MemorySegment seg, long index) {
        return (int)tagMSLLHOOKSTRUCT.mouseData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mouseData$set(MemorySegment seg, long index, int x) {
        tagMSLLHOOKSTRUCT.mouseData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return tagMSLLHOOKSTRUCT.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)tagMSLLHOOKSTRUCT.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        tagMSLLHOOKSTRUCT.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)tagMSLLHOOKSTRUCT.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        tagMSLLHOOKSTRUCT.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return tagMSLLHOOKSTRUCT.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)tagMSLLHOOKSTRUCT.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        tagMSLLHOOKSTRUCT.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)tagMSLLHOOKSTRUCT.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        tagMSLLHOOKSTRUCT.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtraInfo$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    public static VarHandle dwExtraInfo$VH() {
        return tagMSLLHOOKSTRUCT.dwExtraInfo$VH;
    }
    public static long dwExtraInfo$get(MemorySegment seg) {
        return (long)tagMSLLHOOKSTRUCT.dwExtraInfo$VH.get(seg);
    }
    public static void dwExtraInfo$set( MemorySegment seg, long x) {
        tagMSLLHOOKSTRUCT.dwExtraInfo$VH.set(seg, x);
    }
    public static long dwExtraInfo$get(MemorySegment seg, long index) {
        return (long)tagMSLLHOOKSTRUCT.dwExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtraInfo$set(MemorySegment seg, long index, long x) {
        tagMSLLHOOKSTRUCT.dwExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
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

