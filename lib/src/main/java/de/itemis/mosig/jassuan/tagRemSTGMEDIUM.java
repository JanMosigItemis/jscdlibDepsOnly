// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagRemSTGMEDIUM {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("tymed"),
        C_LONG.withName("dwHandleType"),
        C_LONG.withName("pData"),
        C_LONG.withName("pUnkForRelease"),
        C_LONG.withName("cbData"),
        MemoryLayout.sequenceLayout(1, C_CHAR).withName("data"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagRemSTGMEDIUM");
    public static MemoryLayout $LAYOUT() {
        return tagRemSTGMEDIUM.$struct$LAYOUT;
    }
    static final VarHandle tymed$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("tymed"));
    public static VarHandle tymed$VH() {
        return tagRemSTGMEDIUM.tymed$VH;
    }
    public static int tymed$get(MemorySegment seg) {
        return (int)tagRemSTGMEDIUM.tymed$VH.get(seg);
    }
    public static void tymed$set( MemorySegment seg, int x) {
        tagRemSTGMEDIUM.tymed$VH.set(seg, x);
    }
    public static int tymed$get(MemorySegment seg, long index) {
        return (int)tagRemSTGMEDIUM.tymed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tymed$set(MemorySegment seg, long index, int x) {
        tagRemSTGMEDIUM.tymed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwHandleType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwHandleType"));
    public static VarHandle dwHandleType$VH() {
        return tagRemSTGMEDIUM.dwHandleType$VH;
    }
    public static int dwHandleType$get(MemorySegment seg) {
        return (int)tagRemSTGMEDIUM.dwHandleType$VH.get(seg);
    }
    public static void dwHandleType$set( MemorySegment seg, int x) {
        tagRemSTGMEDIUM.dwHandleType$VH.set(seg, x);
    }
    public static int dwHandleType$get(MemorySegment seg, long index) {
        return (int)tagRemSTGMEDIUM.dwHandleType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwHandleType$set(MemorySegment seg, long index, int x) {
        tagRemSTGMEDIUM.dwHandleType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("pData"));
    public static VarHandle pData$VH() {
        return tagRemSTGMEDIUM.pData$VH;
    }
    public static int pData$get(MemorySegment seg) {
        return (int)tagRemSTGMEDIUM.pData$VH.get(seg);
    }
    public static void pData$set( MemorySegment seg, int x) {
        tagRemSTGMEDIUM.pData$VH.set(seg, x);
    }
    public static int pData$get(MemorySegment seg, long index) {
        return (int)tagRemSTGMEDIUM.pData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pData$set(MemorySegment seg, long index, int x) {
        tagRemSTGMEDIUM.pData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUnkForRelease$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("pUnkForRelease"));
    public static VarHandle pUnkForRelease$VH() {
        return tagRemSTGMEDIUM.pUnkForRelease$VH;
    }
    public static int pUnkForRelease$get(MemorySegment seg) {
        return (int)tagRemSTGMEDIUM.pUnkForRelease$VH.get(seg);
    }
    public static void pUnkForRelease$set( MemorySegment seg, int x) {
        tagRemSTGMEDIUM.pUnkForRelease$VH.set(seg, x);
    }
    public static int pUnkForRelease$get(MemorySegment seg, long index) {
        return (int)tagRemSTGMEDIUM.pUnkForRelease$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUnkForRelease$set(MemorySegment seg, long index, int x) {
        tagRemSTGMEDIUM.pUnkForRelease$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagRemSTGMEDIUM.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagRemSTGMEDIUM.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagRemSTGMEDIUM.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagRemSTGMEDIUM.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagRemSTGMEDIUM.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(20, 1);
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

