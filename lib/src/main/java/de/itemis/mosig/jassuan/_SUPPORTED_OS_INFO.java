// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _SUPPORTED_OS_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("OsCount"),
        C_SHORT.withName("MitigationExist"),
        MemoryLayout.sequenceLayout(4, C_SHORT).withName("OsList")
    ).withName("_SUPPORTED_OS_INFO");
    public static MemoryLayout $LAYOUT() {
        return _SUPPORTED_OS_INFO.$struct$LAYOUT;
    }
    static final VarHandle OsCount$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("OsCount"));
    public static VarHandle OsCount$VH() {
        return _SUPPORTED_OS_INFO.OsCount$VH;
    }
    public static short OsCount$get(MemorySegment seg) {
        return (short)_SUPPORTED_OS_INFO.OsCount$VH.get(seg);
    }
    public static void OsCount$set( MemorySegment seg, short x) {
        _SUPPORTED_OS_INFO.OsCount$VH.set(seg, x);
    }
    public static short OsCount$get(MemorySegment seg, long index) {
        return (short)_SUPPORTED_OS_INFO.OsCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OsCount$set(MemorySegment seg, long index, short x) {
        _SUPPORTED_OS_INFO.OsCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MitigationExist$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("MitigationExist"));
    public static VarHandle MitigationExist$VH() {
        return _SUPPORTED_OS_INFO.MitigationExist$VH;
    }
    public static short MitigationExist$get(MemorySegment seg) {
        return (short)_SUPPORTED_OS_INFO.MitigationExist$VH.get(seg);
    }
    public static void MitigationExist$set( MemorySegment seg, short x) {
        _SUPPORTED_OS_INFO.MitigationExist$VH.set(seg, x);
    }
    public static short MitigationExist$get(MemorySegment seg, long index) {
        return (short)_SUPPORTED_OS_INFO.MitigationExist$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MitigationExist$set(MemorySegment seg, long index, short x) {
        _SUPPORTED_OS_INFO.MitigationExist$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OsList$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
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

