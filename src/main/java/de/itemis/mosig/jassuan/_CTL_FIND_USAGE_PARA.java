// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CTL_FIND_USAGE_PARA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
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
        C_POINTER.withName("pSigner")
    ).withName("_CTL_FIND_USAGE_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CTL_FIND_USAGE_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CTL_FIND_USAGE_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CTL_FIND_USAGE_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CTL_FIND_USAGE_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CTL_FIND_USAGE_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CTL_FIND_USAGE_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SubjectUsage$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment ListIdentifier$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    static final VarHandle pSigner$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pSigner")));
    public static VarHandle pSigner$VH() {
        return _CTL_FIND_USAGE_PARA.pSigner$VH;
    }
    public static MemoryAddress pSigner$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CTL_FIND_USAGE_PARA.pSigner$VH.get(seg);
    }
    public static void pSigner$set( MemorySegment seg, MemoryAddress x) {
        _CTL_FIND_USAGE_PARA.pSigner$VH.set(seg, x);
    }
    public static MemoryAddress pSigner$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CTL_FIND_USAGE_PARA.pSigner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSigner$set(MemorySegment seg, long index, MemoryAddress x) {
        _CTL_FIND_USAGE_PARA.pSigner$VH.set(seg.asSlice(index*sizeof()), x);
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

