// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _TAPE_PREPARE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Operation"),
        C_CHAR.withName("Immediate"),
        MemoryLayout.paddingLayout(24)
    ).withName("_TAPE_PREPARE");
    public static MemoryLayout $LAYOUT() {
        return _TAPE_PREPARE.$struct$LAYOUT;
    }
    static final VarHandle Operation$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Operation"));
    public static VarHandle Operation$VH() {
        return _TAPE_PREPARE.Operation$VH;
    }
    public static int Operation$get(MemorySegment seg) {
        return (int)_TAPE_PREPARE.Operation$VH.get(seg);
    }
    public static void Operation$set( MemorySegment seg, int x) {
        _TAPE_PREPARE.Operation$VH.set(seg, x);
    }
    public static int Operation$get(MemorySegment seg, long index) {
        return (int)_TAPE_PREPARE.Operation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Operation$set(MemorySegment seg, long index, int x) {
        _TAPE_PREPARE.Operation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Immediate$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("Immediate"));
    public static VarHandle Immediate$VH() {
        return _TAPE_PREPARE.Immediate$VH;
    }
    public static byte Immediate$get(MemorySegment seg) {
        return (byte)_TAPE_PREPARE.Immediate$VH.get(seg);
    }
    public static void Immediate$set( MemorySegment seg, byte x) {
        _TAPE_PREPARE.Immediate$VH.set(seg, x);
    }
    public static byte Immediate$get(MemorySegment seg, long index) {
        return (byte)_TAPE_PREPARE.Immediate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Immediate$set(MemorySegment seg, long index, byte x) {
        _TAPE_PREPARE.Immediate$VH.set(seg.asSlice(index*sizeof()), x);
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

