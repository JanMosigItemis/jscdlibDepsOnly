// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PRINTER_NOTIFY_OPTIONS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Version"),
        C_LONG.withName("Flags"),
        C_LONG.withName("Count"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pTypes")
    ).withName("_PRINTER_NOTIFY_OPTIONS");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_NOTIFY_OPTIONS.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _PRINTER_NOTIFY_OPTIONS.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _PRINTER_NOTIFY_OPTIONS.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_OPTIONS.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _PRINTER_NOTIFY_OPTIONS.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _PRINTER_NOTIFY_OPTIONS.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_OPTIONS.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _PRINTER_NOTIFY_OPTIONS.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        _PRINTER_NOTIFY_OPTIONS.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_OPTIONS.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTypes$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pTypes")));
    public static VarHandle pTypes$VH() {
        return _PRINTER_NOTIFY_OPTIONS.pTypes$VH;
    }
    public static MemoryAddress pTypes$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PRINTER_NOTIFY_OPTIONS.pTypes$VH.get(seg);
    }
    public static void pTypes$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_NOTIFY_OPTIONS.pTypes$VH.set(seg, x);
    }
    public static MemoryAddress pTypes$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PRINTER_NOTIFY_OPTIONS.pTypes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTypes$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_NOTIFY_OPTIONS.pTypes$VH.set(seg.asSlice(index*sizeof()), x);
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

