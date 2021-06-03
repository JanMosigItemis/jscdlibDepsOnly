// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _FILE_NOTIFY_INFORMATION {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("NextEntryOffset"),
        C_LONG.withName("Action"),
        C_LONG.withName("FileNameLength"),
        MemoryLayout.sequenceLayout(1, C_SHORT).withName("FileName"),
        MemoryLayout.paddingLayout(16)
    ).withName("_FILE_NOTIFY_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _FILE_NOTIFY_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle NextEntryOffset$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NextEntryOffset"));
    public static VarHandle NextEntryOffset$VH() {
        return _FILE_NOTIFY_INFORMATION.NextEntryOffset$VH;
    }
    public static int NextEntryOffset$get(MemorySegment seg) {
        return (int)_FILE_NOTIFY_INFORMATION.NextEntryOffset$VH.get(seg);
    }
    public static void NextEntryOffset$set( MemorySegment seg, int x) {
        _FILE_NOTIFY_INFORMATION.NextEntryOffset$VH.set(seg, x);
    }
    public static int NextEntryOffset$get(MemorySegment seg, long index) {
        return (int)_FILE_NOTIFY_INFORMATION.NextEntryOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextEntryOffset$set(MemorySegment seg, long index, int x) {
        _FILE_NOTIFY_INFORMATION.NextEntryOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Action$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Action"));
    public static VarHandle Action$VH() {
        return _FILE_NOTIFY_INFORMATION.Action$VH;
    }
    public static int Action$get(MemorySegment seg) {
        return (int)_FILE_NOTIFY_INFORMATION.Action$VH.get(seg);
    }
    public static void Action$set( MemorySegment seg, int x) {
        _FILE_NOTIFY_INFORMATION.Action$VH.set(seg, x);
    }
    public static int Action$get(MemorySegment seg, long index) {
        return (int)_FILE_NOTIFY_INFORMATION.Action$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Action$set(MemorySegment seg, long index, int x) {
        _FILE_NOTIFY_INFORMATION.Action$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileNameLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileNameLength"));
    public static VarHandle FileNameLength$VH() {
        return _FILE_NOTIFY_INFORMATION.FileNameLength$VH;
    }
    public static int FileNameLength$get(MemorySegment seg) {
        return (int)_FILE_NOTIFY_INFORMATION.FileNameLength$VH.get(seg);
    }
    public static void FileNameLength$set( MemorySegment seg, int x) {
        _FILE_NOTIFY_INFORMATION.FileNameLength$VH.set(seg, x);
    }
    public static int FileNameLength$get(MemorySegment seg, long index) {
        return (int)_FILE_NOTIFY_INFORMATION.FileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameLength$set(MemorySegment seg, long index, int x) {
        _FILE_NOTIFY_INFORMATION.FileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(12, 2);
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

