// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _TOKEN_APPCONTAINER_INFORMATION {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("TokenAppContainer")
    ).withName("_TOKEN_APPCONTAINER_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_APPCONTAINER_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle TokenAppContainer$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("TokenAppContainer")));
    public static VarHandle TokenAppContainer$VH() {
        return _TOKEN_APPCONTAINER_INFORMATION.TokenAppContainer$VH;
    }
    public static MemoryAddress TokenAppContainer$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_TOKEN_APPCONTAINER_INFORMATION.TokenAppContainer$VH.get(seg);
    }
    public static void TokenAppContainer$set( MemorySegment seg, MemoryAddress x) {
        _TOKEN_APPCONTAINER_INFORMATION.TokenAppContainer$VH.set(seg, x);
    }
    public static MemoryAddress TokenAppContainer$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_TOKEN_APPCONTAINER_INFORMATION.TokenAppContainer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TokenAppContainer$set(MemorySegment seg, long index, MemoryAddress x) {
        _TOKEN_APPCONTAINER_INFORMATION.TokenAppContainer$VH.set(seg.asSlice(index*sizeof()), x);
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

