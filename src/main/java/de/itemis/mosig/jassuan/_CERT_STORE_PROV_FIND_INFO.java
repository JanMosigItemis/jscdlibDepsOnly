// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_STORE_PROV_FIND_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        C_LONG.withName("dwMsgAndCertEncodingType"),
        C_LONG.withName("dwFindFlags"),
        C_LONG.withName("dwFindType"),
        C_POINTER.withName("pvFindPara")
    ).withName("_CERT_STORE_PROV_FIND_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_STORE_PROV_FIND_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_STORE_PROV_FIND_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_STORE_PROV_FIND_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_STORE_PROV_FIND_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_STORE_PROV_FIND_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_STORE_PROV_FIND_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMsgAndCertEncodingType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwMsgAndCertEncodingType"));
    public static VarHandle dwMsgAndCertEncodingType$VH() {
        return _CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH;
    }
    public static int dwMsgAndCertEncodingType$get(MemorySegment seg) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH.get(seg);
    }
    public static void dwMsgAndCertEncodingType$set( MemorySegment seg, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH.set(seg, x);
    }
    public static int dwMsgAndCertEncodingType$get(MemorySegment seg, long index) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMsgAndCertEncodingType$set(MemorySegment seg, long index, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFindFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFindFlags"));
    public static VarHandle dwFindFlags$VH() {
        return _CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH;
    }
    public static int dwFindFlags$get(MemorySegment seg) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH.get(seg);
    }
    public static void dwFindFlags$set( MemorySegment seg, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH.set(seg, x);
    }
    public static int dwFindFlags$get(MemorySegment seg, long index) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFindFlags$set(MemorySegment seg, long index, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFindType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFindType"));
    public static VarHandle dwFindType$VH() {
        return _CERT_STORE_PROV_FIND_INFO.dwFindType$VH;
    }
    public static int dwFindType$get(MemorySegment seg) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwFindType$VH.get(seg);
    }
    public static void dwFindType$set( MemorySegment seg, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwFindType$VH.set(seg, x);
    }
    public static int dwFindType$get(MemorySegment seg, long index) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwFindType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFindType$set(MemorySegment seg, long index, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwFindType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvFindPara$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvFindPara")));
    public static VarHandle pvFindPara$VH() {
        return _CERT_STORE_PROV_FIND_INFO.pvFindPara$VH;
    }
    public static MemoryAddress pvFindPara$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_STORE_PROV_FIND_INFO.pvFindPara$VH.get(seg);
    }
    public static void pvFindPara$set( MemorySegment seg, MemoryAddress x) {
        _CERT_STORE_PROV_FIND_INFO.pvFindPara$VH.set(seg, x);
    }
    public static MemoryAddress pvFindPara$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_STORE_PROV_FIND_INFO.pvFindPara$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvFindPara$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_STORE_PROV_FIND_INFO.pvFindPara$VH.set(seg.asSlice(index*sizeof()), x);
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

