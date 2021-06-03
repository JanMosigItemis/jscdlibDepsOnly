// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _gpgrt_poll_s {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("stream"),
        MemoryLayout.structLayout(
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("want_read"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("want_write"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("want_oob"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("want_rdhup"),
            MemoryLayout.valueLayout(4, ByteOrder.nativeOrder()).withName("_reserv1"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("got_read"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("got_write"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("got_oob"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("got_rdhup"),
            MemoryLayout.valueLayout(4, ByteOrder.nativeOrder()).withName("_reserv2"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("got_err"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("got_hup"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("got_nval"),
            MemoryLayout.valueLayout(4, ByteOrder.nativeOrder()).withName("_reserv3"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("ignore"),
            MemoryLayout.valueLayout(8, ByteOrder.nativeOrder()).withName("user"),
            MemoryLayout.paddingLayout(32)
        )
    ).withName("_gpgrt_poll_s");
    public static MemoryLayout $LAYOUT() {
        return _gpgrt_poll_s.$struct$LAYOUT;
    }
    static final VarHandle stream$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("stream")));
    public static VarHandle stream$VH() {
        return _gpgrt_poll_s.stream$VH;
    }
    public static MemoryAddress stream$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_gpgrt_poll_s.stream$VH.get(seg);
    }
    public static void stream$set( MemorySegment seg, MemoryAddress x) {
        _gpgrt_poll_s.stream$VH.set(seg, x);
    }
    public static MemoryAddress stream$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_gpgrt_poll_s.stream$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stream$set(MemorySegment seg, long index, MemoryAddress x) {
        _gpgrt_poll_s.stream$VH.set(seg.asSlice(index*sizeof()), x);
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

