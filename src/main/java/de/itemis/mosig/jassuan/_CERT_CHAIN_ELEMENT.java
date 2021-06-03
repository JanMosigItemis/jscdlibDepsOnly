// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_CHAIN_ELEMENT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pCertContext"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwErrorStatus"),
            C_LONG.withName("dwInfoStatus")
        ).withName("TrustStatus"),
        C_POINTER.withName("pRevocationInfo"),
        C_POINTER.withName("pIssuanceUsage"),
        C_POINTER.withName("pApplicationUsage"),
        C_POINTER.withName("pwszExtendedErrorInfo")
    ).withName("_CERT_CHAIN_ELEMENT");
    public static MemoryLayout $LAYOUT() {
        return _CERT_CHAIN_ELEMENT.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_CHAIN_ELEMENT.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_CHAIN_ELEMENT.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_CHAIN_ELEMENT.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_CHAIN_ELEMENT.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_CHAIN_ELEMENT.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCertContext$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pCertContext")));
    public static VarHandle pCertContext$VH() {
        return _CERT_CHAIN_ELEMENT.pCertContext$VH;
    }
    public static MemoryAddress pCertContext$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pCertContext$VH.get(seg);
    }
    public static void pCertContext$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pCertContext$VH.set(seg, x);
    }
    public static MemoryAddress pCertContext$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pCertContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCertContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pCertContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment TrustStatus$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle pRevocationInfo$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pRevocationInfo")));
    public static VarHandle pRevocationInfo$VH() {
        return _CERT_CHAIN_ELEMENT.pRevocationInfo$VH;
    }
    public static MemoryAddress pRevocationInfo$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pRevocationInfo$VH.get(seg);
    }
    public static void pRevocationInfo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pRevocationInfo$VH.set(seg, x);
    }
    public static MemoryAddress pRevocationInfo$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pRevocationInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pRevocationInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pRevocationInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pIssuanceUsage$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pIssuanceUsage")));
    public static VarHandle pIssuanceUsage$VH() {
        return _CERT_CHAIN_ELEMENT.pIssuanceUsage$VH;
    }
    public static MemoryAddress pIssuanceUsage$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pIssuanceUsage$VH.get(seg);
    }
    public static void pIssuanceUsage$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pIssuanceUsage$VH.set(seg, x);
    }
    public static MemoryAddress pIssuanceUsage$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pIssuanceUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pIssuanceUsage$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pIssuanceUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pApplicationUsage$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pApplicationUsage")));
    public static VarHandle pApplicationUsage$VH() {
        return _CERT_CHAIN_ELEMENT.pApplicationUsage$VH;
    }
    public static MemoryAddress pApplicationUsage$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pApplicationUsage$VH.get(seg);
    }
    public static void pApplicationUsage$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pApplicationUsage$VH.set(seg, x);
    }
    public static MemoryAddress pApplicationUsage$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pApplicationUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pApplicationUsage$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pApplicationUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszExtendedErrorInfo$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pwszExtendedErrorInfo")));
    public static VarHandle pwszExtendedErrorInfo$VH() {
        return _CERT_CHAIN_ELEMENT.pwszExtendedErrorInfo$VH;
    }
    public static MemoryAddress pwszExtendedErrorInfo$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pwszExtendedErrorInfo$VH.get(seg);
    }
    public static void pwszExtendedErrorInfo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pwszExtendedErrorInfo$VH.set(seg, x);
    }
    public static MemoryAddress pwszExtendedErrorInfo$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_CHAIN_ELEMENT.pwszExtendedErrorInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszExtendedErrorInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_CHAIN_ELEMENT.pwszExtendedErrorInfo$VH.set(seg.asSlice(index*sizeof()), x);
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

