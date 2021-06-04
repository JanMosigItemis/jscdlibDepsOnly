// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_CHAR.withName("AceType"),
            C_CHAR.withName("AceFlags"),
            C_SHORT.withName("AceSize")
        ).withName("Header"),
        C_LONG.withName("Mask"),
        C_LONG.withName("Flags"),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("ObjectType"),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("InheritedObjectType"),
        C_LONG.withName("SidStart")
    ).withName("_ACCESS_ALLOWED_CALLBACK_OBJECT_ACE");
    public static MemoryLayout $LAYOUT() {
        return _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.$struct$LAYOUT;
    }
    public static MemorySegment Header$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle Mask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Mask"));
    public static VarHandle Mask$VH() {
        return _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Mask$VH;
    }
    public static int Mask$get(MemorySegment seg) {
        return (int)_ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Mask$VH.get(seg);
    }
    public static void Mask$set( MemorySegment seg, int x) {
        _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Mask$VH.set(seg, x);
    }
    public static int Mask$get(MemorySegment seg, long index) {
        return (int)_ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Mask$set(MemorySegment seg, long index, int x) {
        _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ObjectType$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    public static MemorySegment InheritedObjectType$slice(MemorySegment seg) {
        return seg.asSlice(28, 16);
    }
    static final VarHandle SidStart$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SidStart"));
    public static VarHandle SidStart$VH() {
        return _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.SidStart$VH;
    }
    public static int SidStart$get(MemorySegment seg) {
        return (int)_ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.SidStart$VH.get(seg);
    }
    public static void SidStart$set( MemorySegment seg, int x) {
        _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.SidStart$VH.set(seg, x);
    }
    public static int SidStart$get(MemorySegment seg, long index) {
        return (int)_ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.SidStart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SidStart$set(MemorySegment seg, long index, int x) {
        _ACCESS_ALLOWED_CALLBACK_OBJECT_ACE.SidStart$VH.set(seg.asSlice(index*sizeof()), x);
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

