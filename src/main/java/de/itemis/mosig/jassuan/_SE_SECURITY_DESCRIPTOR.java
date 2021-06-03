// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _SE_SECURITY_DESCRIPTOR {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Size"),
        C_LONG.withName("Flags"),
        C_POINTER.withName("SecurityDescriptor")
    ).withName("_SE_SECURITY_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _SE_SECURITY_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SE_SECURITY_DESCRIPTOR.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SE_SECURITY_DESCRIPTOR.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SE_SECURITY_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SE_SECURITY_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SE_SECURITY_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _SE_SECURITY_DESCRIPTOR.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_SE_SECURITY_DESCRIPTOR.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _SE_SECURITY_DESCRIPTOR.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_SE_SECURITY_DESCRIPTOR.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _SE_SECURITY_DESCRIPTOR.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityDescriptor$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SecurityDescriptor")));
    public static VarHandle SecurityDescriptor$VH() {
        return _SE_SECURITY_DESCRIPTOR.SecurityDescriptor$VH;
    }
    public static MemoryAddress SecurityDescriptor$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SE_SECURITY_DESCRIPTOR.SecurityDescriptor$VH.get(seg);
    }
    public static void SecurityDescriptor$set( MemorySegment seg, MemoryAddress x) {
        _SE_SECURITY_DESCRIPTOR.SecurityDescriptor$VH.set(seg, x);
    }
    public static MemoryAddress SecurityDescriptor$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SE_SECURITY_DESCRIPTOR.SecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityDescriptor$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_SECURITY_DESCRIPTOR.SecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
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

