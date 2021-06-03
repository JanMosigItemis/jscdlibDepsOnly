// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PRINTER_NOTIFY_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Version"),
        C_LONG.withName("Flags"),
        C_LONG.withName("Count"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            C_SHORT.withName("Type"),
            C_SHORT.withName("Field"),
            C_LONG.withName("Reserved"),
            C_LONG.withName("Id"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(2, C_LONG).withName("adwData"),
                MemoryLayout.structLayout(
                    C_LONG.withName("cbBuf"),
                    MemoryLayout.paddingLayout(32),
                    C_POINTER.withName("pBuf")
                ).withName("Data")
            ).withName("NotifyData")
        ).withName("_PRINTER_NOTIFY_INFO_DATA")).withName("aData")
    ).withName("_PRINTER_NOTIFY_INFO");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_NOTIFY_INFO.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _PRINTER_NOTIFY_INFO.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_INFO.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _PRINTER_NOTIFY_INFO.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_INFO.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_INFO.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _PRINTER_NOTIFY_INFO.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_INFO.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _PRINTER_NOTIFY_INFO.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_INFO.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_INFO.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _PRINTER_NOTIFY_INFO.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_INFO.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        _PRINTER_NOTIFY_INFO.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_INFO.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_INFO.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment aData$slice(MemorySegment seg) {
        return seg.asSlice(16, 32);
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

