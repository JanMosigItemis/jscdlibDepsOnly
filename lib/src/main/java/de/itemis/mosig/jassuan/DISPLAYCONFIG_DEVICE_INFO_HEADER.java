// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class DISPLAYCONFIG_DEVICE_INFO_HEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("type"),
        C_INT.withName("size"),
        MemoryLayout.structLayout(
            C_LONG.withName("LowPart"),
            C_LONG.withName("HighPart")
        ).withName("adapterId"),
        C_INT.withName("id")
    ).withName("DISPLAYCONFIG_DEVICE_INFO_HEADER");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_DEVICE_INFO_HEADER.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return DISPLAYCONFIG_DEVICE_INFO_HEADER.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_DEVICE_INFO_HEADER.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_DEVICE_INFO_HEADER.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_DEVICE_INFO_HEADER.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_DEVICE_INFO_HEADER.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("size"));
    public static VarHandle size$VH() {
        return DISPLAYCONFIG_DEVICE_INFO_HEADER.size$VH;
    }
    public static int size$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_DEVICE_INFO_HEADER.size$VH.get(seg);
    }
    public static void size$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_DEVICE_INFO_HEADER.size$VH.set(seg, x);
    }
    public static int size$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_DEVICE_INFO_HEADER.size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_DEVICE_INFO_HEADER.size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment adapterId$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle id$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("id"));
    public static VarHandle id$VH() {
        return DISPLAYCONFIG_DEVICE_INFO_HEADER.id$VH;
    }
    public static int id$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_DEVICE_INFO_HEADER.id$VH.get(seg);
    }
    public static void id$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_DEVICE_INFO_HEADER.id$VH.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_DEVICE_INFO_HEADER.id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_DEVICE_INFO_HEADER.id$VH.set(seg.asSlice(index*sizeof()), x);
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

