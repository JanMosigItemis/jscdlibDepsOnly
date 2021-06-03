// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _IMAGE_SEPARATE_DEBUG_HEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("Signature"),
        C_SHORT.withName("Flags"),
        C_SHORT.withName("Machine"),
        C_SHORT.withName("Characteristics"),
        C_LONG.withName("TimeDateStamp"),
        C_LONG.withName("CheckSum"),
        C_LONG.withName("ImageBase"),
        C_LONG.withName("SizeOfImage"),
        C_LONG.withName("NumberOfSections"),
        C_LONG.withName("ExportedNamesSize"),
        C_LONG.withName("DebugDirectorySize"),
        C_LONG.withName("SectionAlignment"),
        MemoryLayout.sequenceLayout(2, C_LONG).withName("Reserved")
    ).withName("_IMAGE_SEPARATE_DEBUG_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.$struct$LAYOUT;
    }
    static final VarHandle Signature$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Signature"));
    public static VarHandle Signature$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.Signature$VH;
    }
    public static short Signature$get(MemorySegment seg) {
        return (short)_IMAGE_SEPARATE_DEBUG_HEADER.Signature$VH.get(seg);
    }
    public static void Signature$set( MemorySegment seg, short x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.Signature$VH.set(seg, x);
    }
    public static short Signature$get(MemorySegment seg, long index) {
        return (short)_IMAGE_SEPARATE_DEBUG_HEADER.Signature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, short x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.Signature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.Flags$VH;
    }
    public static short Flags$get(MemorySegment seg) {
        return (short)_IMAGE_SEPARATE_DEBUG_HEADER.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, short x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.Flags$VH.set(seg, x);
    }
    public static short Flags$get(MemorySegment seg, long index) {
        return (short)_IMAGE_SEPARATE_DEBUG_HEADER.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, short x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Machine$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Machine"));
    public static VarHandle Machine$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.Machine$VH;
    }
    public static short Machine$get(MemorySegment seg) {
        return (short)_IMAGE_SEPARATE_DEBUG_HEADER.Machine$VH.get(seg);
    }
    public static void Machine$set( MemorySegment seg, short x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.Machine$VH.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)_IMAGE_SEPARATE_DEBUG_HEADER.Machine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.Machine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Characteristics$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Characteristics"));
    public static VarHandle Characteristics$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.Characteristics$VH;
    }
    public static short Characteristics$get(MemorySegment seg) {
        return (short)_IMAGE_SEPARATE_DEBUG_HEADER.Characteristics$VH.get(seg);
    }
    public static void Characteristics$set( MemorySegment seg, short x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.Characteristics$VH.set(seg, x);
    }
    public static short Characteristics$get(MemorySegment seg, long index) {
        return (short)_IMAGE_SEPARATE_DEBUG_HEADER.Characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, short x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.Characteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.TimeDateStamp$VH;
    }
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.TimeDateStamp$VH.get(seg);
    }
    public static void TimeDateStamp$set( MemorySegment seg, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CheckSum$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("CheckSum"));
    public static VarHandle CheckSum$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.CheckSum$VH;
    }
    public static int CheckSum$get(MemorySegment seg) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.CheckSum$VH.get(seg);
    }
    public static void CheckSum$set( MemorySegment seg, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.CheckSum$VH.set(seg, x);
    }
    public static int CheckSum$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.CheckSum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CheckSum$set(MemorySegment seg, long index, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.CheckSum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImageBase$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ImageBase"));
    public static VarHandle ImageBase$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.ImageBase$VH;
    }
    public static int ImageBase$get(MemorySegment seg) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.ImageBase$VH.get(seg);
    }
    public static void ImageBase$set( MemorySegment seg, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.ImageBase$VH.set(seg, x);
    }
    public static int ImageBase$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.ImageBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageBase$set(MemorySegment seg, long index, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.ImageBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfImage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SizeOfImage"));
    public static VarHandle SizeOfImage$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.SizeOfImage$VH;
    }
    public static int SizeOfImage$get(MemorySegment seg) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.SizeOfImage$VH.get(seg);
    }
    public static void SizeOfImage$set( MemorySegment seg, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.SizeOfImage$VH.set(seg, x);
    }
    public static int SizeOfImage$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.SizeOfImage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfImage$set(MemorySegment seg, long index, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.SizeOfImage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfSections$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumberOfSections"));
    public static VarHandle NumberOfSections$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.NumberOfSections$VH;
    }
    public static int NumberOfSections$get(MemorySegment seg) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.NumberOfSections$VH.get(seg);
    }
    public static void NumberOfSections$set( MemorySegment seg, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.NumberOfSections$VH.set(seg, x);
    }
    public static int NumberOfSections$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.NumberOfSections$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfSections$set(MemorySegment seg, long index, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.NumberOfSections$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExportedNamesSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ExportedNamesSize"));
    public static VarHandle ExportedNamesSize$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.ExportedNamesSize$VH;
    }
    public static int ExportedNamesSize$get(MemorySegment seg) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.ExportedNamesSize$VH.get(seg);
    }
    public static void ExportedNamesSize$set( MemorySegment seg, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.ExportedNamesSize$VH.set(seg, x);
    }
    public static int ExportedNamesSize$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.ExportedNamesSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExportedNamesSize$set(MemorySegment seg, long index, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.ExportedNamesSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DebugDirectorySize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DebugDirectorySize"));
    public static VarHandle DebugDirectorySize$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.DebugDirectorySize$VH;
    }
    public static int DebugDirectorySize$get(MemorySegment seg) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.DebugDirectorySize$VH.get(seg);
    }
    public static void DebugDirectorySize$set( MemorySegment seg, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.DebugDirectorySize$VH.set(seg, x);
    }
    public static int DebugDirectorySize$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.DebugDirectorySize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DebugDirectorySize$set(MemorySegment seg, long index, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.DebugDirectorySize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SectionAlignment$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SectionAlignment"));
    public static VarHandle SectionAlignment$VH() {
        return _IMAGE_SEPARATE_DEBUG_HEADER.SectionAlignment$VH;
    }
    public static int SectionAlignment$get(MemorySegment seg) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.SectionAlignment$VH.get(seg);
    }
    public static void SectionAlignment$set( MemorySegment seg, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.SectionAlignment$VH.set(seg, x);
    }
    public static int SectionAlignment$get(MemorySegment seg, long index) {
        return (int)_IMAGE_SEPARATE_DEBUG_HEADER.SectionAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SectionAlignment$set(MemorySegment seg, long index, int x) {
        _IMAGE_SEPARATE_DEBUG_HEADER.SectionAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
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

