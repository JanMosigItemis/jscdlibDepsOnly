// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_BASIC_CONSTRAINTS2_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("fCA"),
        C_INT.withName("fPathLenConstraint"),
        C_LONG.withName("dwPathLenConstraint")
    ).withName("_CERT_BASIC_CONSTRAINTS2_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_BASIC_CONSTRAINTS2_INFO.$struct$LAYOUT;
    }
    static final VarHandle fCA$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fCA"));
    public static VarHandle fCA$VH() {
        return _CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH;
    }
    public static int fCA$get(MemorySegment seg) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH.get(seg);
    }
    public static void fCA$set( MemorySegment seg, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH.set(seg, x);
    }
    public static int fCA$get(MemorySegment seg, long index) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fCA$set(MemorySegment seg, long index, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fPathLenConstraint$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fPathLenConstraint"));
    public static VarHandle fPathLenConstraint$VH() {
        return _CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH;
    }
    public static int fPathLenConstraint$get(MemorySegment seg) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH.get(seg);
    }
    public static void fPathLenConstraint$set( MemorySegment seg, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH.set(seg, x);
    }
    public static int fPathLenConstraint$get(MemorySegment seg, long index) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fPathLenConstraint$set(MemorySegment seg, long index, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPathLenConstraint$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwPathLenConstraint"));
    public static VarHandle dwPathLenConstraint$VH() {
        return _CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH;
    }
    public static int dwPathLenConstraint$get(MemorySegment seg) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH.get(seg);
    }
    public static void dwPathLenConstraint$set( MemorySegment seg, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH.set(seg, x);
    }
    public static int dwPathLenConstraint$get(MemorySegment seg, long index) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPathLenConstraint$set(MemorySegment seg, long index, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH.set(seg.asSlice(index*sizeof()), x);
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

