// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagRemHGLOBAL {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("fNullHGlobal"),
        C_LONG.withName("cbData"),
        MemoryLayout.sequenceLayout(1, C_CHAR).withName("data"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagRemHGLOBAL");
    public static MemoryLayout $LAYOUT() {
        return tagRemHGLOBAL.$struct$LAYOUT;
    }
    static final VarHandle fNullHGlobal$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fNullHGlobal"));
    public static VarHandle fNullHGlobal$VH() {
        return tagRemHGLOBAL.fNullHGlobal$VH;
    }
    public static int fNullHGlobal$get(MemorySegment seg) {
        return (int)tagRemHGLOBAL.fNullHGlobal$VH.get(seg);
    }
    public static void fNullHGlobal$set( MemorySegment seg, int x) {
        tagRemHGLOBAL.fNullHGlobal$VH.set(seg, x);
    }
    public static int fNullHGlobal$get(MemorySegment seg, long index) {
        return (int)tagRemHGLOBAL.fNullHGlobal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fNullHGlobal$set(MemorySegment seg, long index, int x) {
        tagRemHGLOBAL.fNullHGlobal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagRemHGLOBAL.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagRemHGLOBAL.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagRemHGLOBAL.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagRemHGLOBAL.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagRemHGLOBAL.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(8, 1);
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

