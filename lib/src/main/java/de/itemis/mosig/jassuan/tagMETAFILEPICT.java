// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMETAFILEPICT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("mm"),
        C_LONG.withName("xExt"),
        C_LONG.withName("yExt"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hMF")
    ).withName("tagMETAFILEPICT");
    public static MemoryLayout $LAYOUT() {
        return tagMETAFILEPICT.$struct$LAYOUT;
    }
    static final VarHandle mm$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("mm"));
    public static VarHandle mm$VH() {
        return tagMETAFILEPICT.mm$VH;
    }
    public static int mm$get(MemorySegment seg) {
        return (int)tagMETAFILEPICT.mm$VH.get(seg);
    }
    public static void mm$set( MemorySegment seg, int x) {
        tagMETAFILEPICT.mm$VH.set(seg, x);
    }
    public static int mm$get(MemorySegment seg, long index) {
        return (int)tagMETAFILEPICT.mm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mm$set(MemorySegment seg, long index, int x) {
        tagMETAFILEPICT.mm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xExt$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("xExt"));
    public static VarHandle xExt$VH() {
        return tagMETAFILEPICT.xExt$VH;
    }
    public static int xExt$get(MemorySegment seg) {
        return (int)tagMETAFILEPICT.xExt$VH.get(seg);
    }
    public static void xExt$set( MemorySegment seg, int x) {
        tagMETAFILEPICT.xExt$VH.set(seg, x);
    }
    public static int xExt$get(MemorySegment seg, long index) {
        return (int)tagMETAFILEPICT.xExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xExt$set(MemorySegment seg, long index, int x) {
        tagMETAFILEPICT.xExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yExt$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("yExt"));
    public static VarHandle yExt$VH() {
        return tagMETAFILEPICT.yExt$VH;
    }
    public static int yExt$get(MemorySegment seg) {
        return (int)tagMETAFILEPICT.yExt$VH.get(seg);
    }
    public static void yExt$set( MemorySegment seg, int x) {
        tagMETAFILEPICT.yExt$VH.set(seg, x);
    }
    public static int yExt$get(MemorySegment seg, long index) {
        return (int)tagMETAFILEPICT.yExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yExt$set(MemorySegment seg, long index, int x) {
        tagMETAFILEPICT.yExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hMF$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hMF")));
    public static VarHandle hMF$VH() {
        return tagMETAFILEPICT.hMF$VH;
    }
    public static MemoryAddress hMF$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMETAFILEPICT.hMF$VH.get(seg);
    }
    public static void hMF$set( MemorySegment seg, MemoryAddress x) {
        tagMETAFILEPICT.hMF$VH.set(seg, x);
    }
    public static MemoryAddress hMF$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMETAFILEPICT.hMF$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hMF$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMETAFILEPICT.hMF$VH.set(seg.asSlice(index*sizeof()), x);
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

