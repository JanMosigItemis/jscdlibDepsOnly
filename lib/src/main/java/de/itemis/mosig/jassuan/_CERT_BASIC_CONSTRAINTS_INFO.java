// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_BASIC_CONSTRAINTS_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData"),
            C_LONG.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(32)
        ).withName("SubjectType"),
        C_INT.withName("fPathLenConstraint"),
        C_LONG.withName("dwPathLenConstraint"),
        C_LONG.withName("cSubtreesConstraint"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("rgSubtreesConstraint")
    ).withName("_CERT_BASIC_CONSTRAINTS_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_BASIC_CONSTRAINTS_INFO.$struct$LAYOUT;
    }
    public static MemorySegment SubjectType$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle fPathLenConstraint$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fPathLenConstraint"));
    public static VarHandle fPathLenConstraint$VH() {
        return _CERT_BASIC_CONSTRAINTS_INFO.fPathLenConstraint$VH;
    }
    public static int fPathLenConstraint$get(MemorySegment seg) {
        return (int)_CERT_BASIC_CONSTRAINTS_INFO.fPathLenConstraint$VH.get(seg);
    }
    public static void fPathLenConstraint$set( MemorySegment seg, int x) {
        _CERT_BASIC_CONSTRAINTS_INFO.fPathLenConstraint$VH.set(seg, x);
    }
    public static int fPathLenConstraint$get(MemorySegment seg, long index) {
        return (int)_CERT_BASIC_CONSTRAINTS_INFO.fPathLenConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fPathLenConstraint$set(MemorySegment seg, long index, int x) {
        _CERT_BASIC_CONSTRAINTS_INFO.fPathLenConstraint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPathLenConstraint$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwPathLenConstraint"));
    public static VarHandle dwPathLenConstraint$VH() {
        return _CERT_BASIC_CONSTRAINTS_INFO.dwPathLenConstraint$VH;
    }
    public static int dwPathLenConstraint$get(MemorySegment seg) {
        return (int)_CERT_BASIC_CONSTRAINTS_INFO.dwPathLenConstraint$VH.get(seg);
    }
    public static void dwPathLenConstraint$set( MemorySegment seg, int x) {
        _CERT_BASIC_CONSTRAINTS_INFO.dwPathLenConstraint$VH.set(seg, x);
    }
    public static int dwPathLenConstraint$get(MemorySegment seg, long index) {
        return (int)_CERT_BASIC_CONSTRAINTS_INFO.dwPathLenConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPathLenConstraint$set(MemorySegment seg, long index, int x) {
        _CERT_BASIC_CONSTRAINTS_INFO.dwPathLenConstraint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cSubtreesConstraint$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cSubtreesConstraint"));
    public static VarHandle cSubtreesConstraint$VH() {
        return _CERT_BASIC_CONSTRAINTS_INFO.cSubtreesConstraint$VH;
    }
    public static int cSubtreesConstraint$get(MemorySegment seg) {
        return (int)_CERT_BASIC_CONSTRAINTS_INFO.cSubtreesConstraint$VH.get(seg);
    }
    public static void cSubtreesConstraint$set( MemorySegment seg, int x) {
        _CERT_BASIC_CONSTRAINTS_INFO.cSubtreesConstraint$VH.set(seg, x);
    }
    public static int cSubtreesConstraint$get(MemorySegment seg, long index) {
        return (int)_CERT_BASIC_CONSTRAINTS_INFO.cSubtreesConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cSubtreesConstraint$set(MemorySegment seg, long index, int x) {
        _CERT_BASIC_CONSTRAINTS_INFO.cSubtreesConstraint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgSubtreesConstraint$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rgSubtreesConstraint")));
    public static VarHandle rgSubtreesConstraint$VH() {
        return _CERT_BASIC_CONSTRAINTS_INFO.rgSubtreesConstraint$VH;
    }
    public static MemoryAddress rgSubtreesConstraint$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_BASIC_CONSTRAINTS_INFO.rgSubtreesConstraint$VH.get(seg);
    }
    public static void rgSubtreesConstraint$set( MemorySegment seg, MemoryAddress x) {
        _CERT_BASIC_CONSTRAINTS_INFO.rgSubtreesConstraint$VH.set(seg, x);
    }
    public static MemoryAddress rgSubtreesConstraint$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_BASIC_CONSTRAINTS_INFO.rgSubtreesConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgSubtreesConstraint$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_BASIC_CONSTRAINTS_INFO.rgSubtreesConstraint$VH.set(seg.asSlice(index*sizeof()), x);
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

