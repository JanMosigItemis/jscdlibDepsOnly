// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagCUSTDATA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cCustData"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("prgCustData")
    ).withName("tagCUSTDATA");
    public static MemoryLayout $LAYOUT() {
        return tagCUSTDATA.$struct$LAYOUT;
    }
    static final VarHandle cCustData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cCustData"));
    public static VarHandle cCustData$VH() {
        return tagCUSTDATA.cCustData$VH;
    }
    public static int cCustData$get(MemorySegment seg) {
        return (int)tagCUSTDATA.cCustData$VH.get(seg);
    }
    public static void cCustData$set( MemorySegment seg, int x) {
        tagCUSTDATA.cCustData$VH.set(seg, x);
    }
    public static int cCustData$get(MemorySegment seg, long index) {
        return (int)tagCUSTDATA.cCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCustData$set(MemorySegment seg, long index, int x) {
        tagCUSTDATA.cCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle prgCustData$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("prgCustData")));
    public static VarHandle prgCustData$VH() {
        return tagCUSTDATA.prgCustData$VH;
    }
    public static MemoryAddress prgCustData$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCUSTDATA.prgCustData$VH.get(seg);
    }
    public static void prgCustData$set( MemorySegment seg, MemoryAddress x) {
        tagCUSTDATA.prgCustData$VH.set(seg, x);
    }
    public static MemoryAddress prgCustData$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCUSTDATA.prgCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prgCustData$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCUSTDATA.prgCustData$VH.set(seg.asSlice(index*sizeof()), x);
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

