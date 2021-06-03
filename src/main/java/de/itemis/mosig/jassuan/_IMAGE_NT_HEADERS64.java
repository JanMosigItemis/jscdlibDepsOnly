// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _IMAGE_NT_HEADERS64 {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Signature"),
        MemoryLayout.structLayout(
            C_SHORT.withName("Machine"),
            C_SHORT.withName("NumberOfSections"),
            C_LONG.withName("TimeDateStamp"),
            C_LONG.withName("PointerToSymbolTable"),
            C_LONG.withName("NumberOfSymbols"),
            C_SHORT.withName("SizeOfOptionalHeader"),
            C_SHORT.withName("Characteristics")
        ).withName("FileHeader"),
        MemoryLayout.structLayout(
            C_SHORT.withName("Magic"),
            C_CHAR.withName("MajorLinkerVersion"),
            C_CHAR.withName("MinorLinkerVersion"),
            C_LONG.withName("SizeOfCode"),
            C_LONG.withName("SizeOfInitializedData"),
            C_LONG.withName("SizeOfUninitializedData"),
            C_LONG.withName("AddressOfEntryPoint"),
            C_LONG.withName("BaseOfCode"),
            C_LONG_LONG.withName("ImageBase"),
            C_LONG.withName("SectionAlignment"),
            C_LONG.withName("FileAlignment"),
            C_SHORT.withName("MajorOperatingSystemVersion"),
            C_SHORT.withName("MinorOperatingSystemVersion"),
            C_SHORT.withName("MajorImageVersion"),
            C_SHORT.withName("MinorImageVersion"),
            C_SHORT.withName("MajorSubsystemVersion"),
            C_SHORT.withName("MinorSubsystemVersion"),
            C_LONG.withName("Win32VersionValue"),
            C_LONG.withName("SizeOfImage"),
            C_LONG.withName("SizeOfHeaders"),
            C_LONG.withName("CheckSum"),
            C_SHORT.withName("Subsystem"),
            C_SHORT.withName("DllCharacteristics"),
            C_LONG_LONG.withName("SizeOfStackReserve"),
            C_LONG_LONG.withName("SizeOfStackCommit"),
            C_LONG_LONG.withName("SizeOfHeapReserve"),
            C_LONG_LONG.withName("SizeOfHeapCommit"),
            C_LONG.withName("LoaderFlags"),
            C_LONG.withName("NumberOfRvaAndSizes"),
            MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
                C_LONG.withName("VirtualAddress"),
                C_LONG.withName("Size")
            ).withName("_IMAGE_DATA_DIRECTORY")).withName("DataDirectory")
        ).withName("OptionalHeader")
    ).withName("_IMAGE_NT_HEADERS64");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_NT_HEADERS64.$struct$LAYOUT;
    }
    static final VarHandle Signature$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Signature"));
    public static VarHandle Signature$VH() {
        return _IMAGE_NT_HEADERS64.Signature$VH;
    }
    public static int Signature$get(MemorySegment seg) {
        return (int)_IMAGE_NT_HEADERS64.Signature$VH.get(seg);
    }
    public static void Signature$set( MemorySegment seg, int x) {
        _IMAGE_NT_HEADERS64.Signature$VH.set(seg, x);
    }
    public static int Signature$get(MemorySegment seg, long index) {
        return (int)_IMAGE_NT_HEADERS64.Signature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, int x) {
        _IMAGE_NT_HEADERS64.Signature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileHeader$slice(MemorySegment seg) {
        return seg.asSlice(4, 20);
    }
    public static MemorySegment OptionalHeader$slice(MemorySegment seg) {
        return seg.asSlice(24, 240);
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

