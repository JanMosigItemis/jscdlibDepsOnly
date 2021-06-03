// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _SENDCMDOUTPARAMS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cBufferSize"),
        MemoryLayout.structLayout(
            C_CHAR.withName("bDriverError"),
            C_CHAR.withName("bIDEError"),
            MemoryLayout.sequenceLayout(2, C_CHAR).withName("bReserved"),
            MemoryLayout.sequenceLayout(2, C_LONG).withName("dwReserved")
        ).withName("DriverStatus"),
        MemoryLayout.sequenceLayout(1, C_CHAR).withName("bBuffer")
    ).withName("_SENDCMDOUTPARAMS");
    public static MemoryLayout $LAYOUT() {
        return _SENDCMDOUTPARAMS.$struct$LAYOUT;
    }
    static final VarHandle cBufferSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cBufferSize"));
    public static VarHandle cBufferSize$VH() {
        return _SENDCMDOUTPARAMS.cBufferSize$VH;
    }
    public static int cBufferSize$get(MemorySegment seg) {
        return (int)_SENDCMDOUTPARAMS.cBufferSize$VH.get(seg);
    }
    public static void cBufferSize$set( MemorySegment seg, int x) {
        _SENDCMDOUTPARAMS.cBufferSize$VH.set(seg, x);
    }
    public static int cBufferSize$get(MemorySegment seg, long index) {
        return (int)_SENDCMDOUTPARAMS.cBufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBufferSize$set(MemorySegment seg, long index, int x) {
        _SENDCMDOUTPARAMS.cBufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DriverStatus$slice(MemorySegment seg) {
        return seg.asSlice(4, 12);
    }
    public static MemorySegment bBuffer$slice(MemorySegment seg) {
        return seg.asSlice(16, 1);
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

