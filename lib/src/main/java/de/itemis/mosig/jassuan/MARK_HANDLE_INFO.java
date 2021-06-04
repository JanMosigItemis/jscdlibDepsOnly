// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class MARK_HANDLE_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("UsnSourceInfo"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("VolumeHandle"),
        C_LONG.withName("HandleInfo"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return MARK_HANDLE_INFO.$struct$LAYOUT;
    }
    static final VarHandle UsnSourceInfo$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("UsnSourceInfo"));
    public static VarHandle UsnSourceInfo$VH() {
        return MARK_HANDLE_INFO.UsnSourceInfo$VH;
    }
    public static int UsnSourceInfo$get(MemorySegment seg) {
        return (int)MARK_HANDLE_INFO.UsnSourceInfo$VH.get(seg);
    }
    public static void UsnSourceInfo$set( MemorySegment seg, int x) {
        MARK_HANDLE_INFO.UsnSourceInfo$VH.set(seg, x);
    }
    public static int UsnSourceInfo$get(MemorySegment seg, long index) {
        return (int)MARK_HANDLE_INFO.UsnSourceInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UsnSourceInfo$set(MemorySegment seg, long index, int x) {
        MARK_HANDLE_INFO.UsnSourceInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolumeHandle$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("VolumeHandle")));
    public static VarHandle VolumeHandle$VH() {
        return MARK_HANDLE_INFO.VolumeHandle$VH;
    }
    public static MemoryAddress VolumeHandle$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)MARK_HANDLE_INFO.VolumeHandle$VH.get(seg);
    }
    public static void VolumeHandle$set( MemorySegment seg, MemoryAddress x) {
        MARK_HANDLE_INFO.VolumeHandle$VH.set(seg, x);
    }
    public static MemoryAddress VolumeHandle$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)MARK_HANDLE_INFO.VolumeHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeHandle$set(MemorySegment seg, long index, MemoryAddress x) {
        MARK_HANDLE_INFO.VolumeHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HandleInfo$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("HandleInfo"));
    public static VarHandle HandleInfo$VH() {
        return MARK_HANDLE_INFO.HandleInfo$VH;
    }
    public static int HandleInfo$get(MemorySegment seg) {
        return (int)MARK_HANDLE_INFO.HandleInfo$VH.get(seg);
    }
    public static void HandleInfo$set( MemorySegment seg, int x) {
        MARK_HANDLE_INFO.HandleInfo$VH.set(seg, x);
    }
    public static int HandleInfo$get(MemorySegment seg, long index) {
        return (int)MARK_HANDLE_INFO.HandleInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HandleInfo$set(MemorySegment seg, long index, int x) {
        MARK_HANDLE_INFO.HandleInfo$VH.set(seg.asSlice(index*sizeof()), x);
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

