// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CTL_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwVersion"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            C_LONG.withName("cUsageIdentifier"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("rgpszUsageIdentifier")
        ).withName("SubjectUsage"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("ListIdentifier"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("SequenceNumber"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwLowDateTime"),
            C_LONG.withName("dwHighDateTime")
        ).withName("ThisUpdate"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwLowDateTime"),
            C_LONG.withName("dwHighDateTime")
        ).withName("NextUpdate"),
        MemoryLayout.structLayout(
            C_POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                C_LONG.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                C_POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("SubjectAlgorithm"),
        C_LONG.withName("cCTLEntry"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("rgCTLEntry"),
        C_LONG.withName("cExtension"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("rgExtension")
    ).withName("_CTL_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CTL_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _CTL_INFO.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_CTL_INFO.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _CTL_INFO.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_CTL_INFO.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _CTL_INFO.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SubjectUsage$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment ListIdentifier$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static MemorySegment SequenceNumber$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static MemorySegment ThisUpdate$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    public static MemorySegment NextUpdate$slice(MemorySegment seg) {
        return seg.asSlice(64, 8);
    }
    public static MemorySegment SubjectAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(72, 24);
    }
    static final VarHandle cCTLEntry$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cCTLEntry"));
    public static VarHandle cCTLEntry$VH() {
        return _CTL_INFO.cCTLEntry$VH;
    }
    public static int cCTLEntry$get(MemorySegment seg) {
        return (int)_CTL_INFO.cCTLEntry$VH.get(seg);
    }
    public static void cCTLEntry$set( MemorySegment seg, int x) {
        _CTL_INFO.cCTLEntry$VH.set(seg, x);
    }
    public static int cCTLEntry$get(MemorySegment seg, long index) {
        return (int)_CTL_INFO.cCTLEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCTLEntry$set(MemorySegment seg, long index, int x) {
        _CTL_INFO.cCTLEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCTLEntry$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rgCTLEntry")));
    public static VarHandle rgCTLEntry$VH() {
        return _CTL_INFO.rgCTLEntry$VH;
    }
    public static MemoryAddress rgCTLEntry$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CTL_INFO.rgCTLEntry$VH.get(seg);
    }
    public static void rgCTLEntry$set( MemorySegment seg, MemoryAddress x) {
        _CTL_INFO.rgCTLEntry$VH.set(seg, x);
    }
    public static MemoryAddress rgCTLEntry$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CTL_INFO.rgCTLEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCTLEntry$set(MemorySegment seg, long index, MemoryAddress x) {
        _CTL_INFO.rgCTLEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cExtension$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cExtension"));
    public static VarHandle cExtension$VH() {
        return _CTL_INFO.cExtension$VH;
    }
    public static int cExtension$get(MemorySegment seg) {
        return (int)_CTL_INFO.cExtension$VH.get(seg);
    }
    public static void cExtension$set( MemorySegment seg, int x) {
        _CTL_INFO.cExtension$VH.set(seg, x);
    }
    public static int cExtension$get(MemorySegment seg, long index) {
        return (int)_CTL_INFO.cExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cExtension$set(MemorySegment seg, long index, int x) {
        _CTL_INFO.cExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgExtension$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rgExtension")));
    public static VarHandle rgExtension$VH() {
        return _CTL_INFO.rgExtension$VH;
    }
    public static MemoryAddress rgExtension$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CTL_INFO.rgExtension$VH.get(seg);
    }
    public static void rgExtension$set( MemorySegment seg, MemoryAddress x) {
        _CTL_INFO.rgExtension$VH.set(seg, x);
    }
    public static MemoryAddress rgExtension$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CTL_INFO.rgExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgExtension$set(MemorySegment seg, long index, MemoryAddress x) {
        _CTL_INFO.rgExtension$VH.set(seg.asSlice(index*sizeof()), x);
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

