// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagOIFI {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("cb"),
        C_INT.withName("fMDIApp"),
        C_POINTER.withName("hwndFrame"),
        C_POINTER.withName("haccel"),
        C_INT.withName("cAccelEntries"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagOIFI");
    public static MemoryLayout $LAYOUT() {
        return tagOIFI.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return tagOIFI.cb$VH;
    }
    public static int cb$get(MemorySegment seg) {
        return (int)tagOIFI.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, int x) {
        tagOIFI.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)tagOIFI.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        tagOIFI.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fMDIApp$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fMDIApp"));
    public static VarHandle fMDIApp$VH() {
        return tagOIFI.fMDIApp$VH;
    }
    public static int fMDIApp$get(MemorySegment seg) {
        return (int)tagOIFI.fMDIApp$VH.get(seg);
    }
    public static void fMDIApp$set( MemorySegment seg, int x) {
        tagOIFI.fMDIApp$VH.set(seg, x);
    }
    public static int fMDIApp$get(MemorySegment seg, long index) {
        return (int)tagOIFI.fMDIApp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fMDIApp$set(MemorySegment seg, long index, int x) {
        tagOIFI.fMDIApp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndFrame$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndFrame")));
    public static VarHandle hwndFrame$VH() {
        return tagOIFI.hwndFrame$VH;
    }
    public static MemoryAddress hwndFrame$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOIFI.hwndFrame$VH.get(seg);
    }
    public static void hwndFrame$set( MemorySegment seg, MemoryAddress x) {
        tagOIFI.hwndFrame$VH.set(seg, x);
    }
    public static MemoryAddress hwndFrame$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOIFI.hwndFrame$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndFrame$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOIFI.hwndFrame$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle haccel$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("haccel")));
    public static VarHandle haccel$VH() {
        return tagOIFI.haccel$VH;
    }
    public static MemoryAddress haccel$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOIFI.haccel$VH.get(seg);
    }
    public static void haccel$set( MemorySegment seg, MemoryAddress x) {
        tagOIFI.haccel$VH.set(seg, x);
    }
    public static MemoryAddress haccel$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOIFI.haccel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void haccel$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOIFI.haccel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccelEntries$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cAccelEntries"));
    public static VarHandle cAccelEntries$VH() {
        return tagOIFI.cAccelEntries$VH;
    }
    public static int cAccelEntries$get(MemorySegment seg) {
        return (int)tagOIFI.cAccelEntries$VH.get(seg);
    }
    public static void cAccelEntries$set( MemorySegment seg, int x) {
        tagOIFI.cAccelEntries$VH.set(seg, x);
    }
    public static int cAccelEntries$get(MemorySegment seg, long index) {
        return (int)tagOIFI.cAccelEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccelEntries$set(MemorySegment seg, long index, int x) {
        tagOIFI.cAccelEntries$VH.set(seg.asSlice(index*sizeof()), x);
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

