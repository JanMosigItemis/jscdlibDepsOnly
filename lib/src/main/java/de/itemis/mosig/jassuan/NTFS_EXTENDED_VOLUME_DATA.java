// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class NTFS_EXTENDED_VOLUME_DATA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("ByteCount"),
        C_SHORT.withName("MajorVersion"),
        C_SHORT.withName("MinorVersion")
    );
    public static MemoryLayout $LAYOUT() {
        return NTFS_EXTENDED_VOLUME_DATA.$struct$LAYOUT;
    }
    static final VarHandle ByteCount$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ByteCount"));
    public static VarHandle ByteCount$VH() {
        return NTFS_EXTENDED_VOLUME_DATA.ByteCount$VH;
    }
    public static int ByteCount$get(MemorySegment seg) {
        return (int)NTFS_EXTENDED_VOLUME_DATA.ByteCount$VH.get(seg);
    }
    public static void ByteCount$set( MemorySegment seg, int x) {
        NTFS_EXTENDED_VOLUME_DATA.ByteCount$VH.set(seg, x);
    }
    public static int ByteCount$get(MemorySegment seg, long index) {
        return (int)NTFS_EXTENDED_VOLUME_DATA.ByteCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ByteCount$set(MemorySegment seg, long index, int x) {
        NTFS_EXTENDED_VOLUME_DATA.ByteCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorVersion$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("MajorVersion"));
    public static VarHandle MajorVersion$VH() {
        return NTFS_EXTENDED_VOLUME_DATA.MajorVersion$VH;
    }
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)NTFS_EXTENDED_VOLUME_DATA.MajorVersion$VH.get(seg);
    }
    public static void MajorVersion$set( MemorySegment seg, short x) {
        NTFS_EXTENDED_VOLUME_DATA.MajorVersion$VH.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)NTFS_EXTENDED_VOLUME_DATA.MajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        NTFS_EXTENDED_VOLUME_DATA.MajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorVersion$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("MinorVersion"));
    public static VarHandle MinorVersion$VH() {
        return NTFS_EXTENDED_VOLUME_DATA.MinorVersion$VH;
    }
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)NTFS_EXTENDED_VOLUME_DATA.MinorVersion$VH.get(seg);
    }
    public static void MinorVersion$set( MemorySegment seg, short x) {
        NTFS_EXTENDED_VOLUME_DATA.MinorVersion$VH.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)NTFS_EXTENDED_VOLUME_DATA.MinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        NTFS_EXTENDED_VOLUME_DATA.MinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
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

