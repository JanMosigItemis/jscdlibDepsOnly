// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagSTATPROPSETSTG {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("fmtid"),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("clsid"),
        C_LONG.withName("grfFlags"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwLowDateTime"),
            C_LONG.withName("dwHighDateTime")
        ).withName("mtime"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwLowDateTime"),
            C_LONG.withName("dwHighDateTime")
        ).withName("ctime"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwLowDateTime"),
            C_LONG.withName("dwHighDateTime")
        ).withName("atime"),
        C_LONG.withName("dwOSVersion")
    ).withName("tagSTATPROPSETSTG");
    public static MemoryLayout $LAYOUT() {
        return tagSTATPROPSETSTG.$struct$LAYOUT;
    }
    public static MemorySegment fmtid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment clsid$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    static final VarHandle grfFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("grfFlags"));
    public static VarHandle grfFlags$VH() {
        return tagSTATPROPSETSTG.grfFlags$VH;
    }
    public static int grfFlags$get(MemorySegment seg) {
        return (int)tagSTATPROPSETSTG.grfFlags$VH.get(seg);
    }
    public static void grfFlags$set( MemorySegment seg, int x) {
        tagSTATPROPSETSTG.grfFlags$VH.set(seg, x);
    }
    public static int grfFlags$get(MemorySegment seg, long index) {
        return (int)tagSTATPROPSETSTG.grfFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfFlags$set(MemorySegment seg, long index, int x) {
        tagSTATPROPSETSTG.grfFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment mtime$slice(MemorySegment seg) {
        return seg.asSlice(36, 8);
    }
    public static MemorySegment ctime$slice(MemorySegment seg) {
        return seg.asSlice(44, 8);
    }
    public static MemorySegment atime$slice(MemorySegment seg) {
        return seg.asSlice(52, 8);
    }
    static final VarHandle dwOSVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwOSVersion"));
    public static VarHandle dwOSVersion$VH() {
        return tagSTATPROPSETSTG.dwOSVersion$VH;
    }
    public static int dwOSVersion$get(MemorySegment seg) {
        return (int)tagSTATPROPSETSTG.dwOSVersion$VH.get(seg);
    }
    public static void dwOSVersion$set( MemorySegment seg, int x) {
        tagSTATPROPSETSTG.dwOSVersion$VH.set(seg, x);
    }
    public static int dwOSVersion$get(MemorySegment seg, long index) {
        return (int)tagSTATPROPSETSTG.dwOSVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOSVersion$set(MemorySegment seg, long index, int x) {
        tagSTATPROPSETSTG.dwOSVersion$VH.set(seg.asSlice(index*sizeof()), x);
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

