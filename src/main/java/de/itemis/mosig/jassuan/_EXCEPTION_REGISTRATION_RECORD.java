// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _EXCEPTION_REGISTRATION_RECORD {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            C_POINTER.withName("Next"),
            C_POINTER.withName("prev")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            C_POINTER.withName("Handler"),
            C_POINTER.withName("handler")
        ).withName("$anon$1")
    ).withName("_EXCEPTION_REGISTRATION_RECORD");
    public static MemoryLayout $LAYOUT() {
        return _EXCEPTION_REGISTRATION_RECORD.$struct$LAYOUT;
    }
    static final VarHandle Next$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Next")));
    public static VarHandle Next$VH() {
        return _EXCEPTION_REGISTRATION_RECORD.Next$VH;
    }
    public static MemoryAddress Next$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_EXCEPTION_REGISTRATION_RECORD.Next$VH.get(seg);
    }
    public static void Next$set( MemorySegment seg, MemoryAddress x) {
        _EXCEPTION_REGISTRATION_RECORD.Next$VH.set(seg, x);
    }
    public static MemoryAddress Next$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_EXCEPTION_REGISTRATION_RECORD.Next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Next$set(MemorySegment seg, long index, MemoryAddress x) {
        _EXCEPTION_REGISTRATION_RECORD.Next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle prev$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("prev")));
    public static VarHandle prev$VH() {
        return _EXCEPTION_REGISTRATION_RECORD.prev$VH;
    }
    public static MemoryAddress prev$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_EXCEPTION_REGISTRATION_RECORD.prev$VH.get(seg);
    }
    public static void prev$set( MemorySegment seg, MemoryAddress x) {
        _EXCEPTION_REGISTRATION_RECORD.prev$VH.set(seg, x);
    }
    public static MemoryAddress prev$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_EXCEPTION_REGISTRATION_RECORD.prev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prev$set(MemorySegment seg, long index, MemoryAddress x) {
        _EXCEPTION_REGISTRATION_RECORD.prev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Handler$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("Handler")));
    public static VarHandle Handler$VH() {
        return _EXCEPTION_REGISTRATION_RECORD.Handler$VH;
    }
    public static MemoryAddress Handler$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_EXCEPTION_REGISTRATION_RECORD.Handler$VH.get(seg);
    }
    public static void Handler$set( MemorySegment seg, MemoryAddress x) {
        _EXCEPTION_REGISTRATION_RECORD.Handler$VH.set(seg, x);
    }
    public static MemoryAddress Handler$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_EXCEPTION_REGISTRATION_RECORD.Handler$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Handler$set(MemorySegment seg, long index, MemoryAddress x) {
        _EXCEPTION_REGISTRATION_RECORD.Handler$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PEXCEPTION_ROUTINE Handler (MemorySegment segment) {
        return PEXCEPTION_ROUTINE.ofAddress(Handler$get(segment));
    }
    static final VarHandle handler$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("handler")));
    public static VarHandle handler$VH() {
        return _EXCEPTION_REGISTRATION_RECORD.handler$VH;
    }
    public static MemoryAddress handler$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_EXCEPTION_REGISTRATION_RECORD.handler$VH.get(seg);
    }
    public static void handler$set( MemorySegment seg, MemoryAddress x) {
        _EXCEPTION_REGISTRATION_RECORD.handler$VH.set(seg, x);
    }
    public static MemoryAddress handler$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_EXCEPTION_REGISTRATION_RECORD.handler$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void handler$set(MemorySegment seg, long index, MemoryAddress x) {
        _EXCEPTION_REGISTRATION_RECORD.handler$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PEXCEPTION_ROUTINE handler (MemorySegment segment) {
        return PEXCEPTION_ROUTINE.ofAddress(handler$get(segment));
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

