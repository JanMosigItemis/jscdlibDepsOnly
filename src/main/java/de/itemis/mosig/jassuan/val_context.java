// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class val_context {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("valuelen"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("value_context"),
        C_POINTER.withName("val_buff_ptr")
    ).withName("val_context");
    public static MemoryLayout $LAYOUT() {
        return val_context.$struct$LAYOUT;
    }
    static final VarHandle valuelen$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("valuelen"));
    public static VarHandle valuelen$VH() {
        return val_context.valuelen$VH;
    }
    public static int valuelen$get(MemorySegment seg) {
        return (int)val_context.valuelen$VH.get(seg);
    }
    public static void valuelen$set( MemorySegment seg, int x) {
        val_context.valuelen$VH.set(seg, x);
    }
    public static int valuelen$get(MemorySegment seg, long index) {
        return (int)val_context.valuelen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void valuelen$set(MemorySegment seg, long index, int x) {
        val_context.valuelen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value_context$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("value_context")));
    public static VarHandle value_context$VH() {
        return val_context.value_context$VH;
    }
    public static MemoryAddress value_context$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)val_context.value_context$VH.get(seg);
    }
    public static void value_context$set( MemorySegment seg, MemoryAddress x) {
        val_context.value_context$VH.set(seg, x);
    }
    public static MemoryAddress value_context$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)val_context.value_context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_context$set(MemorySegment seg, long index, MemoryAddress x) {
        val_context.value_context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle val_buff_ptr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("val_buff_ptr")));
    public static VarHandle val_buff_ptr$VH() {
        return val_context.val_buff_ptr$VH;
    }
    public static MemoryAddress val_buff_ptr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)val_context.val_buff_ptr$VH.get(seg);
    }
    public static void val_buff_ptr$set( MemorySegment seg, MemoryAddress x) {
        val_context.val_buff_ptr$VH.set(seg, x);
    }
    public static MemoryAddress val_buff_ptr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)val_context.val_buff_ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void val_buff_ptr$set(MemorySegment seg, long index, MemoryAddress x) {
        val_context.val_buff_ptr$VH.set(seg.asSlice(index*sizeof()), x);
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

