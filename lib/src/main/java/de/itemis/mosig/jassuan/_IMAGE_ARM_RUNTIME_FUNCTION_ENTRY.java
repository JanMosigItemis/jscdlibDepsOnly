// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("BeginAddress"),
        MemoryLayout.unionLayout(
            C_LONG.withName("UnwindData"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.valueLayout(2, ByteOrder.nativeOrder()).withName("Flag"),
                    MemoryLayout.valueLayout(11, ByteOrder.nativeOrder()).withName("FunctionLength"),
                    MemoryLayout.valueLayout(2, ByteOrder.nativeOrder()).withName("Ret"),
                    MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("H"),
                    MemoryLayout.valueLayout(3, ByteOrder.nativeOrder()).withName("Reg"),
                    MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("R"),
                    MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("L"),
                    MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("C"),
                    MemoryLayout.valueLayout(10, ByteOrder.nativeOrder()).withName("StackAdjust")
                )
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_IMAGE_ARM_RUNTIME_FUNCTION_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle BeginAddress$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("BeginAddress"));
    public static VarHandle BeginAddress$VH() {
        return _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH;
    }
    public static int BeginAddress$get(MemorySegment seg) {
        return (int)_IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.get(seg);
    }
    public static void BeginAddress$set( MemorySegment seg, int x) {
        _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.set(seg, x);
    }
    public static int BeginAddress$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BeginAddress$set(MemorySegment seg, long index, int x) {
        _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UnwindData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("UnwindData"));
    public static VarHandle UnwindData$VH() {
        return _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.UnwindData$VH;
    }
    public static int UnwindData$get(MemorySegment seg) {
        return (int)_IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.UnwindData$VH.get(seg);
    }
    public static void UnwindData$set( MemorySegment seg, int x) {
        _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.UnwindData$VH.set(seg, x);
    }
    public static int UnwindData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.UnwindData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnwindData$set(MemorySegment seg, long index, int x) {
        _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY.UnwindData$VH.set(seg.asSlice(index*sizeof()), x);
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

