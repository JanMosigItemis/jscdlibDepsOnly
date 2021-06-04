// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _NCryptAlgorithmName {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pszName"),
        C_LONG.withName("dwClass"),
        C_LONG.withName("dwAlgOperations"),
        C_LONG.withName("dwFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_NCryptAlgorithmName");
    public static MemoryLayout $LAYOUT() {
        return _NCryptAlgorithmName.$struct$LAYOUT;
    }
    static final VarHandle pszName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszName")));
    public static VarHandle pszName$VH() {
        return _NCryptAlgorithmName.pszName$VH;
    }
    public static MemoryAddress pszName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NCryptAlgorithmName.pszName$VH.get(seg);
    }
    public static void pszName$set( MemorySegment seg, MemoryAddress x) {
        _NCryptAlgorithmName.pszName$VH.set(seg, x);
    }
    public static MemoryAddress pszName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NCryptAlgorithmName.pszName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszName$set(MemorySegment seg, long index, MemoryAddress x) {
        _NCryptAlgorithmName.pszName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwClass$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwClass"));
    public static VarHandle dwClass$VH() {
        return _NCryptAlgorithmName.dwClass$VH;
    }
    public static int dwClass$get(MemorySegment seg) {
        return (int)_NCryptAlgorithmName.dwClass$VH.get(seg);
    }
    public static void dwClass$set( MemorySegment seg, int x) {
        _NCryptAlgorithmName.dwClass$VH.set(seg, x);
    }
    public static int dwClass$get(MemorySegment seg, long index) {
        return (int)_NCryptAlgorithmName.dwClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwClass$set(MemorySegment seg, long index, int x) {
        _NCryptAlgorithmName.dwClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAlgOperations$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwAlgOperations"));
    public static VarHandle dwAlgOperations$VH() {
        return _NCryptAlgorithmName.dwAlgOperations$VH;
    }
    public static int dwAlgOperations$get(MemorySegment seg) {
        return (int)_NCryptAlgorithmName.dwAlgOperations$VH.get(seg);
    }
    public static void dwAlgOperations$set( MemorySegment seg, int x) {
        _NCryptAlgorithmName.dwAlgOperations$VH.set(seg, x);
    }
    public static int dwAlgOperations$get(MemorySegment seg, long index) {
        return (int)_NCryptAlgorithmName.dwAlgOperations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAlgOperations$set(MemorySegment seg, long index, int x) {
        _NCryptAlgorithmName.dwAlgOperations$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _NCryptAlgorithmName.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_NCryptAlgorithmName.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _NCryptAlgorithmName.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_NCryptAlgorithmName.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _NCryptAlgorithmName.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
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

