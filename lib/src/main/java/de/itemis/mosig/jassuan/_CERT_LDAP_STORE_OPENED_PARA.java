// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_LDAP_STORE_OPENED_PARA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pvLdapSessionHandle"),
        C_POINTER.withName("pwszLdapUrl")
    ).withName("_CERT_LDAP_STORE_OPENED_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_LDAP_STORE_OPENED_PARA.$struct$LAYOUT;
    }
    static final VarHandle pvLdapSessionHandle$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvLdapSessionHandle")));
    public static VarHandle pvLdapSessionHandle$VH() {
        return _CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH;
    }
    public static MemoryAddress pvLdapSessionHandle$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH.get(seg);
    }
    public static void pvLdapSessionHandle$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH.set(seg, x);
    }
    public static MemoryAddress pvLdapSessionHandle$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvLdapSessionHandle$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszLdapUrl$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pwszLdapUrl")));
    public static VarHandle pwszLdapUrl$VH() {
        return _CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH;
    }
    public static MemoryAddress pwszLdapUrl$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH.get(seg);
    }
    public static void pwszLdapUrl$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH.set(seg, x);
    }
    public static MemoryAddress pwszLdapUrl$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszLdapUrl$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH.set(seg.asSlice(index*sizeof()), x);
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

