// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_X942_DH_PARAMETERS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("p"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("g"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("q"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("j"),
        C_POINTER.withName("pValidationParams")
    ).withName("_CERT_X942_DH_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _CERT_X942_DH_PARAMETERS.$struct$LAYOUT;
    }
    public static MemorySegment p$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment g$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment q$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static MemorySegment j$slice(MemorySegment seg) {
        return seg.asSlice(48, 16);
    }
    static final VarHandle pValidationParams$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pValidationParams")));
    public static VarHandle pValidationParams$VH() {
        return _CERT_X942_DH_PARAMETERS.pValidationParams$VH;
    }
    public static MemoryAddress pValidationParams$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_X942_DH_PARAMETERS.pValidationParams$VH.get(seg);
    }
    public static void pValidationParams$set( MemorySegment seg, MemoryAddress x) {
        _CERT_X942_DH_PARAMETERS.pValidationParams$VH.set(seg, x);
    }
    public static MemoryAddress pValidationParams$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_X942_DH_PARAMETERS.pValidationParams$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pValidationParams$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_X942_DH_PARAMETERS.pValidationParams$VH.set(seg.asSlice(index*sizeof()), x);
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

