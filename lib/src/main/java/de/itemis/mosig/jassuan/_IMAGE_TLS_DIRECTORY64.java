// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _IMAGE_TLS_DIRECTORY64 {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG_LONG.withName("StartAddressOfRawData"),
        C_LONG_LONG.withName("EndAddressOfRawData"),
        C_LONG_LONG.withName("AddressOfIndex"),
        C_LONG_LONG.withName("AddressOfCallBacks"),
        C_LONG.withName("SizeOfZeroFill"),
        C_LONG.withName("Characteristics")
    ).withName("_IMAGE_TLS_DIRECTORY64");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_TLS_DIRECTORY64.$struct$LAYOUT;
    }
    static final VarHandle StartAddressOfRawData$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("StartAddressOfRawData"));
    public static VarHandle StartAddressOfRawData$VH() {
        return _IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH;
    }
    public static long StartAddressOfRawData$get(MemorySegment seg) {
        return (long)_IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH.get(seg);
    }
    public static void StartAddressOfRawData$set( MemorySegment seg, long x) {
        _IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH.set(seg, x);
    }
    public static long StartAddressOfRawData$get(MemorySegment seg, long index) {
        return (long)_IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartAddressOfRawData$set(MemorySegment seg, long index, long x) {
        _IMAGE_TLS_DIRECTORY64.StartAddressOfRawData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EndAddressOfRawData$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("EndAddressOfRawData"));
    public static VarHandle EndAddressOfRawData$VH() {
        return _IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH;
    }
    public static long EndAddressOfRawData$get(MemorySegment seg) {
        return (long)_IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH.get(seg);
    }
    public static void EndAddressOfRawData$set( MemorySegment seg, long x) {
        _IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH.set(seg, x);
    }
    public static long EndAddressOfRawData$get(MemorySegment seg, long index) {
        return (long)_IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EndAddressOfRawData$set(MemorySegment seg, long index, long x) {
        _IMAGE_TLS_DIRECTORY64.EndAddressOfRawData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfIndex$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddressOfIndex"));
    public static VarHandle AddressOfIndex$VH() {
        return _IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH;
    }
    public static long AddressOfIndex$get(MemorySegment seg) {
        return (long)_IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH.get(seg);
    }
    public static void AddressOfIndex$set( MemorySegment seg, long x) {
        _IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH.set(seg, x);
    }
    public static long AddressOfIndex$get(MemorySegment seg, long index) {
        return (long)_IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfIndex$set(MemorySegment seg, long index, long x) {
        _IMAGE_TLS_DIRECTORY64.AddressOfIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfCallBacks$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddressOfCallBacks"));
    public static VarHandle AddressOfCallBacks$VH() {
        return _IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH;
    }
    public static long AddressOfCallBacks$get(MemorySegment seg) {
        return (long)_IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH.get(seg);
    }
    public static void AddressOfCallBacks$set( MemorySegment seg, long x) {
        _IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH.set(seg, x);
    }
    public static long AddressOfCallBacks$get(MemorySegment seg, long index) {
        return (long)_IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfCallBacks$set(MemorySegment seg, long index, long x) {
        _IMAGE_TLS_DIRECTORY64.AddressOfCallBacks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfZeroFill$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SizeOfZeroFill"));
    public static VarHandle SizeOfZeroFill$VH() {
        return _IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH;
    }
    public static int SizeOfZeroFill$get(MemorySegment seg) {
        return (int)_IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH.get(seg);
    }
    public static void SizeOfZeroFill$set( MemorySegment seg, int x) {
        _IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH.set(seg, x);
    }
    public static int SizeOfZeroFill$get(MemorySegment seg, long index) {
        return (int)_IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfZeroFill$set(MemorySegment seg, long index, int x) {
        _IMAGE_TLS_DIRECTORY64.SizeOfZeroFill$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Characteristics$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Characteristics"));
    public static VarHandle Characteristics$VH() {
        return _IMAGE_TLS_DIRECTORY64.Characteristics$VH;
    }
    public static int Characteristics$get(MemorySegment seg) {
        return (int)_IMAGE_TLS_DIRECTORY64.Characteristics$VH.get(seg);
    }
    public static void Characteristics$set( MemorySegment seg, int x) {
        _IMAGE_TLS_DIRECTORY64.Characteristics$VH.set(seg, x);
    }
    public static int Characteristics$get(MemorySegment seg, long index) {
        return (int)_IMAGE_TLS_DIRECTORY64.Characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, int x) {
        _IMAGE_TLS_DIRECTORY64.Characteristics$VH.set(seg.asSlice(index*sizeof()), x);
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

