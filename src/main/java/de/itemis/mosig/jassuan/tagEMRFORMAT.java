// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagEMRFORMAT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dSignature"),
        C_LONG.withName("nVersion"),
        C_LONG.withName("cbData"),
        C_LONG.withName("offData")
    ).withName("tagEMRFORMAT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRFORMAT.$struct$LAYOUT;
    }
    static final VarHandle dSignature$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dSignature"));
    public static VarHandle dSignature$VH() {
        return tagEMRFORMAT.dSignature$VH;
    }
    public static int dSignature$get(MemorySegment seg) {
        return (int)tagEMRFORMAT.dSignature$VH.get(seg);
    }
    public static void dSignature$set( MemorySegment seg, int x) {
        tagEMRFORMAT.dSignature$VH.set(seg, x);
    }
    public static int dSignature$get(MemorySegment seg, long index) {
        return (int)tagEMRFORMAT.dSignature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dSignature$set(MemorySegment seg, long index, int x) {
        tagEMRFORMAT.dSignature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nVersion"));
    public static VarHandle nVersion$VH() {
        return tagEMRFORMAT.nVersion$VH;
    }
    public static int nVersion$get(MemorySegment seg) {
        return (int)tagEMRFORMAT.nVersion$VH.get(seg);
    }
    public static void nVersion$set( MemorySegment seg, int x) {
        tagEMRFORMAT.nVersion$VH.set(seg, x);
    }
    public static int nVersion$get(MemorySegment seg, long index) {
        return (int)tagEMRFORMAT.nVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nVersion$set(MemorySegment seg, long index, int x) {
        tagEMRFORMAT.nVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagEMRFORMAT.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagEMRFORMAT.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagEMRFORMAT.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagEMRFORMAT.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagEMRFORMAT.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("offData"));
    public static VarHandle offData$VH() {
        return tagEMRFORMAT.offData$VH;
    }
    public static int offData$get(MemorySegment seg) {
        return (int)tagEMRFORMAT.offData$VH.get(seg);
    }
    public static void offData$set( MemorySegment seg, int x) {
        tagEMRFORMAT.offData$VH.set(seg, x);
    }
    public static int offData$get(MemorySegment seg, long index) {
        return (int)tagEMRFORMAT.offData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offData$set(MemorySegment seg, long index, int x) {
        tagEMRFORMAT.offData$VH.set(seg.asSlice(index*sizeof()), x);
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

