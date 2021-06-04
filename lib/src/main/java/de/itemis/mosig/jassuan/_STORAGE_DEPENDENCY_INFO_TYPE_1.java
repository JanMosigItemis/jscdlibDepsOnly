// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _STORAGE_DEPENDENCY_INFO_TYPE_1 {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("DependencyTypeFlags"),
        C_LONG.withName("ProviderSpecificFlags"),
        MemoryLayout.structLayout(
            C_LONG.withName("DeviceId"),
            MemoryLayout.structLayout(
                C_LONG.withName("Data1"),
                C_SHORT.withName("Data2"),
                C_SHORT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
            ).withName("VendorId")
        ).withName("VirtualStorageType")
    ).withName("_STORAGE_DEPENDENCY_INFO_TYPE_1");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DEPENDENCY_INFO_TYPE_1.$struct$LAYOUT;
    }
    static final VarHandle DependencyTypeFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DependencyTypeFlags"));
    public static VarHandle DependencyTypeFlags$VH() {
        return _STORAGE_DEPENDENCY_INFO_TYPE_1.DependencyTypeFlags$VH;
    }
    public static int DependencyTypeFlags$get(MemorySegment seg) {
        return (int)_STORAGE_DEPENDENCY_INFO_TYPE_1.DependencyTypeFlags$VH.get(seg);
    }
    public static void DependencyTypeFlags$set( MemorySegment seg, int x) {
        _STORAGE_DEPENDENCY_INFO_TYPE_1.DependencyTypeFlags$VH.set(seg, x);
    }
    public static int DependencyTypeFlags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEPENDENCY_INFO_TYPE_1.DependencyTypeFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DependencyTypeFlags$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEPENDENCY_INFO_TYPE_1.DependencyTypeFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProviderSpecificFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ProviderSpecificFlags"));
    public static VarHandle ProviderSpecificFlags$VH() {
        return _STORAGE_DEPENDENCY_INFO_TYPE_1.ProviderSpecificFlags$VH;
    }
    public static int ProviderSpecificFlags$get(MemorySegment seg) {
        return (int)_STORAGE_DEPENDENCY_INFO_TYPE_1.ProviderSpecificFlags$VH.get(seg);
    }
    public static void ProviderSpecificFlags$set( MemorySegment seg, int x) {
        _STORAGE_DEPENDENCY_INFO_TYPE_1.ProviderSpecificFlags$VH.set(seg, x);
    }
    public static int ProviderSpecificFlags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEPENDENCY_INFO_TYPE_1.ProviderSpecificFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProviderSpecificFlags$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEPENDENCY_INFO_TYPE_1.ProviderSpecificFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment VirtualStorageType$slice(MemorySegment seg) {
        return seg.asSlice(8, 20);
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

