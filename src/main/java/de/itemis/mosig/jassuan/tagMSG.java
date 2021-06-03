// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMSG {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("hwnd"),
        C_INT.withName("message"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("wParam"),
        C_LONG_LONG.withName("lParam"),
        C_LONG.withName("time"),
        MemoryLayout.structLayout(
            C_LONG.withName("x"),
            C_LONG.withName("y")
        ).withName("pt"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagMSG");
    public static MemoryLayout $LAYOUT() {
        return tagMSG.$struct$LAYOUT;
    }
    static final VarHandle hwnd$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwnd")));
    public static VarHandle hwnd$VH() {
        return tagMSG.hwnd$VH;
    }
    public static MemoryAddress hwnd$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMSG.hwnd$VH.get(seg);
    }
    public static void hwnd$set( MemorySegment seg, MemoryAddress x) {
        tagMSG.hwnd$VH.set(seg, x);
    }
    public static MemoryAddress hwnd$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMSG.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMSG.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle message$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("message"));
    public static VarHandle message$VH() {
        return tagMSG.message$VH;
    }
    public static int message$get(MemorySegment seg) {
        return (int)tagMSG.message$VH.get(seg);
    }
    public static void message$set( MemorySegment seg, int x) {
        tagMSG.message$VH.set(seg, x);
    }
    public static int message$get(MemorySegment seg, long index) {
        return (int)tagMSG.message$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void message$set(MemorySegment seg, long index, int x) {
        tagMSG.message$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wParam$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("wParam"));
    public static VarHandle wParam$VH() {
        return tagMSG.wParam$VH;
    }
    public static long wParam$get(MemorySegment seg) {
        return (long)tagMSG.wParam$VH.get(seg);
    }
    public static void wParam$set( MemorySegment seg, long x) {
        tagMSG.wParam$VH.set(seg, x);
    }
    public static long wParam$get(MemorySegment seg, long index) {
        return (long)tagMSG.wParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wParam$set(MemorySegment seg, long index, long x) {
        tagMSG.wParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lParam$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lParam"));
    public static VarHandle lParam$VH() {
        return tagMSG.lParam$VH;
    }
    public static long lParam$get(MemorySegment seg) {
        return (long)tagMSG.lParam$VH.get(seg);
    }
    public static void lParam$set( MemorySegment seg, long x) {
        tagMSG.lParam$VH.set(seg, x);
    }
    public static long lParam$get(MemorySegment seg, long index) {
        return (long)tagMSG.lParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lParam$set(MemorySegment seg, long index, long x) {
        tagMSG.lParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return tagMSG.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)tagMSG.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        tagMSG.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)tagMSG.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        tagMSG.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pt$slice(MemorySegment seg) {
        return seg.asSlice(36, 8);
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

