// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PARTITION_INFORMATION_MBR {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_CHAR.withName("PartitionType"),
        C_CHAR.withName("BootIndicator"),
        C_CHAR.withName("RecognizedPartition"),
        MemoryLayout.paddingLayout(8),
        C_LONG.withName("HiddenSectors")
    ).withName("_PARTITION_INFORMATION_MBR");
    public static MemoryLayout $LAYOUT() {
        return _PARTITION_INFORMATION_MBR.$struct$LAYOUT;
    }
    static final VarHandle PartitionType$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("PartitionType"));
    public static VarHandle PartitionType$VH() {
        return _PARTITION_INFORMATION_MBR.PartitionType$VH;
    }
    public static byte PartitionType$get(MemorySegment seg) {
        return (byte)_PARTITION_INFORMATION_MBR.PartitionType$VH.get(seg);
    }
    public static void PartitionType$set( MemorySegment seg, byte x) {
        _PARTITION_INFORMATION_MBR.PartitionType$VH.set(seg, x);
    }
    public static byte PartitionType$get(MemorySegment seg, long index) {
        return (byte)_PARTITION_INFORMATION_MBR.PartitionType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionType$set(MemorySegment seg, long index, byte x) {
        _PARTITION_INFORMATION_MBR.PartitionType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BootIndicator$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("BootIndicator"));
    public static VarHandle BootIndicator$VH() {
        return _PARTITION_INFORMATION_MBR.BootIndicator$VH;
    }
    public static byte BootIndicator$get(MemorySegment seg) {
        return (byte)_PARTITION_INFORMATION_MBR.BootIndicator$VH.get(seg);
    }
    public static void BootIndicator$set( MemorySegment seg, byte x) {
        _PARTITION_INFORMATION_MBR.BootIndicator$VH.set(seg, x);
    }
    public static byte BootIndicator$get(MemorySegment seg, long index) {
        return (byte)_PARTITION_INFORMATION_MBR.BootIndicator$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BootIndicator$set(MemorySegment seg, long index, byte x) {
        _PARTITION_INFORMATION_MBR.BootIndicator$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RecognizedPartition$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("RecognizedPartition"));
    public static VarHandle RecognizedPartition$VH() {
        return _PARTITION_INFORMATION_MBR.RecognizedPartition$VH;
    }
    public static byte RecognizedPartition$get(MemorySegment seg) {
        return (byte)_PARTITION_INFORMATION_MBR.RecognizedPartition$VH.get(seg);
    }
    public static void RecognizedPartition$set( MemorySegment seg, byte x) {
        _PARTITION_INFORMATION_MBR.RecognizedPartition$VH.set(seg, x);
    }
    public static byte RecognizedPartition$get(MemorySegment seg, long index) {
        return (byte)_PARTITION_INFORMATION_MBR.RecognizedPartition$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RecognizedPartition$set(MemorySegment seg, long index, byte x) {
        _PARTITION_INFORMATION_MBR.RecognizedPartition$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HiddenSectors$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("HiddenSectors"));
    public static VarHandle HiddenSectors$VH() {
        return _PARTITION_INFORMATION_MBR.HiddenSectors$VH;
    }
    public static int HiddenSectors$get(MemorySegment seg) {
        return (int)_PARTITION_INFORMATION_MBR.HiddenSectors$VH.get(seg);
    }
    public static void HiddenSectors$set( MemorySegment seg, int x) {
        _PARTITION_INFORMATION_MBR.HiddenSectors$VH.set(seg, x);
    }
    public static int HiddenSectors$get(MemorySegment seg, long index) {
        return (int)_PARTITION_INFORMATION_MBR.HiddenSectors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HiddenSectors$set(MemorySegment seg, long index, int x) {
        _PARTITION_INFORMATION_MBR.HiddenSectors$VH.set(seg.asSlice(index*sizeof()), x);
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

