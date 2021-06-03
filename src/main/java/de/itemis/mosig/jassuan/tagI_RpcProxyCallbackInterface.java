// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagI_RpcProxyCallbackInterface {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("IsValidMachineFn"),
        C_POINTER.withName("GetClientAddressFn"),
        C_POINTER.withName("GetConnectionTimeoutFn"),
        C_POINTER.withName("PerformCalloutFn"),
        C_POINTER.withName("FreeCalloutStateFn")
    ).withName("tagI_RpcProxyCallbackInterface");
    public static MemoryLayout $LAYOUT() {
        return tagI_RpcProxyCallbackInterface.$struct$LAYOUT;
    }
    static final VarHandle IsValidMachineFn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("IsValidMachineFn")));
    public static VarHandle IsValidMachineFn$VH() {
        return tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH;
    }
    public static MemoryAddress IsValidMachineFn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.get(seg);
    }
    public static void IsValidMachineFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.set(seg, x);
    }
    public static MemoryAddress IsValidMachineFn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsValidMachineFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyIsValidMachineFn IsValidMachineFn (MemorySegment segment) {
        return I_RpcProxyIsValidMachineFn.ofAddress(IsValidMachineFn$get(segment));
    }
    static final VarHandle GetClientAddressFn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetClientAddressFn")));
    public static VarHandle GetClientAddressFn$VH() {
        return tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH;
    }
    public static MemoryAddress GetClientAddressFn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.get(seg);
    }
    public static void GetClientAddressFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.set(seg, x);
    }
    public static MemoryAddress GetClientAddressFn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetClientAddressFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyGetClientAddressFn GetClientAddressFn (MemorySegment segment) {
        return I_RpcProxyGetClientAddressFn.ofAddress(GetClientAddressFn$get(segment));
    }
    static final VarHandle GetConnectionTimeoutFn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetConnectionTimeoutFn")));
    public static VarHandle GetConnectionTimeoutFn$VH() {
        return tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH;
    }
    public static MemoryAddress GetConnectionTimeoutFn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.get(seg);
    }
    public static void GetConnectionTimeoutFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.set(seg, x);
    }
    public static MemoryAddress GetConnectionTimeoutFn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetConnectionTimeoutFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn (MemorySegment segment) {
        return I_RpcProxyGetConnectionTimeoutFn.ofAddress(GetConnectionTimeoutFn$get(segment));
    }
    static final VarHandle PerformCalloutFn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("PerformCalloutFn")));
    public static VarHandle PerformCalloutFn$VH() {
        return tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH;
    }
    public static MemoryAddress PerformCalloutFn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.get(seg);
    }
    public static void PerformCalloutFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.set(seg, x);
    }
    public static MemoryAddress PerformCalloutFn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PerformCalloutFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcPerformCalloutFn PerformCalloutFn (MemorySegment segment) {
        return I_RpcPerformCalloutFn.ofAddress(PerformCalloutFn$get(segment));
    }
    static final VarHandle FreeCalloutStateFn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("FreeCalloutStateFn")));
    public static VarHandle FreeCalloutStateFn$VH() {
        return tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH;
    }
    public static MemoryAddress FreeCalloutStateFn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.get(seg);
    }
    public static void FreeCalloutStateFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.set(seg, x);
    }
    public static MemoryAddress FreeCalloutStateFn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeCalloutStateFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcFreeCalloutStateFn FreeCalloutStateFn (MemorySegment segment) {
        return I_RpcFreeCalloutStateFn.ofAddress(FreeCalloutStateFn$get(segment));
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

