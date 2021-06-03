// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _ICONINFOEXW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        C_INT.withName("fIcon"),
        C_LONG.withName("xHotspot"),
        C_LONG.withName("yHotspot"),
        C_POINTER.withName("hbmMask"),
        C_POINTER.withName("hbmColor"),
        C_SHORT.withName("wResID"),
        MemoryLayout.sequenceLayout(260, C_SHORT).withName("szModName"),
        MemoryLayout.sequenceLayout(260, C_SHORT).withName("szResName"),
        MemoryLayout.paddingLayout(48)
    ).withName("_ICONINFOEXW");
    public static MemoryLayout $LAYOUT() {
        return _ICONINFOEXW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _ICONINFOEXW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_ICONINFOEXW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _ICONINFOEXW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_ICONINFOEXW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _ICONINFOEXW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fIcon$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fIcon"));
    public static VarHandle fIcon$VH() {
        return _ICONINFOEXW.fIcon$VH;
    }
    public static int fIcon$get(MemorySegment seg) {
        return (int)_ICONINFOEXW.fIcon$VH.get(seg);
    }
    public static void fIcon$set( MemorySegment seg, int x) {
        _ICONINFOEXW.fIcon$VH.set(seg, x);
    }
    public static int fIcon$get(MemorySegment seg, long index) {
        return (int)_ICONINFOEXW.fIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fIcon$set(MemorySegment seg, long index, int x) {
        _ICONINFOEXW.fIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xHotspot$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("xHotspot"));
    public static VarHandle xHotspot$VH() {
        return _ICONINFOEXW.xHotspot$VH;
    }
    public static int xHotspot$get(MemorySegment seg) {
        return (int)_ICONINFOEXW.xHotspot$VH.get(seg);
    }
    public static void xHotspot$set( MemorySegment seg, int x) {
        _ICONINFOEXW.xHotspot$VH.set(seg, x);
    }
    public static int xHotspot$get(MemorySegment seg, long index) {
        return (int)_ICONINFOEXW.xHotspot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xHotspot$set(MemorySegment seg, long index, int x) {
        _ICONINFOEXW.xHotspot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yHotspot$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("yHotspot"));
    public static VarHandle yHotspot$VH() {
        return _ICONINFOEXW.yHotspot$VH;
    }
    public static int yHotspot$get(MemorySegment seg) {
        return (int)_ICONINFOEXW.yHotspot$VH.get(seg);
    }
    public static void yHotspot$set( MemorySegment seg, int x) {
        _ICONINFOEXW.yHotspot$VH.set(seg, x);
    }
    public static int yHotspot$get(MemorySegment seg, long index) {
        return (int)_ICONINFOEXW.yHotspot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yHotspot$set(MemorySegment seg, long index, int x) {
        _ICONINFOEXW.yHotspot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmMask$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hbmMask")));
    public static VarHandle hbmMask$VH() {
        return _ICONINFOEXW.hbmMask$VH;
    }
    public static MemoryAddress hbmMask$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ICONINFOEXW.hbmMask$VH.get(seg);
    }
    public static void hbmMask$set( MemorySegment seg, MemoryAddress x) {
        _ICONINFOEXW.hbmMask$VH.set(seg, x);
    }
    public static MemoryAddress hbmMask$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ICONINFOEXW.hbmMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmMask$set(MemorySegment seg, long index, MemoryAddress x) {
        _ICONINFOEXW.hbmMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmColor$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hbmColor")));
    public static VarHandle hbmColor$VH() {
        return _ICONINFOEXW.hbmColor$VH;
    }
    public static MemoryAddress hbmColor$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ICONINFOEXW.hbmColor$VH.get(seg);
    }
    public static void hbmColor$set( MemorySegment seg, MemoryAddress x) {
        _ICONINFOEXW.hbmColor$VH.set(seg, x);
    }
    public static MemoryAddress hbmColor$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ICONINFOEXW.hbmColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmColor$set(MemorySegment seg, long index, MemoryAddress x) {
        _ICONINFOEXW.hbmColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wResID$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wResID"));
    public static VarHandle wResID$VH() {
        return _ICONINFOEXW.wResID$VH;
    }
    public static short wResID$get(MemorySegment seg) {
        return (short)_ICONINFOEXW.wResID$VH.get(seg);
    }
    public static void wResID$set( MemorySegment seg, short x) {
        _ICONINFOEXW.wResID$VH.set(seg, x);
    }
    public static short wResID$get(MemorySegment seg, long index) {
        return (short)_ICONINFOEXW.wResID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wResID$set(MemorySegment seg, long index, short x) {
        _ICONINFOEXW.wResID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szModName$slice(MemorySegment seg) {
        return seg.asSlice(34, 520);
    }
    public static MemorySegment szResName$slice(MemorySegment seg) {
        return seg.asSlice(554, 520);
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

