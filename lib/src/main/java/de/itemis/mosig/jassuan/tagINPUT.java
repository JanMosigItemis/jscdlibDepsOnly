// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagINPUT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("type"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("dx"),
                C_LONG.withName("dy"),
                C_LONG.withName("mouseData"),
                C_LONG.withName("dwFlags"),
                C_LONG.withName("time"),
                MemoryLayout.paddingLayout(32),
                C_LONG_LONG.withName("dwExtraInfo")
            ).withName("mi"),
            MemoryLayout.structLayout(
                C_SHORT.withName("wVk"),
                C_SHORT.withName("wScan"),
                C_LONG.withName("dwFlags"),
                C_LONG.withName("time"),
                MemoryLayout.paddingLayout(32),
                C_LONG_LONG.withName("dwExtraInfo")
            ).withName("ki"),
            MemoryLayout.structLayout(
                C_LONG.withName("uMsg"),
                C_SHORT.withName("wParamL"),
                C_SHORT.withName("wParamH")
            ).withName("hi")
        ).withName("$anon$0")
    ).withName("tagINPUT");
    public static MemoryLayout $LAYOUT() {
        return tagINPUT.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return tagINPUT.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)tagINPUT.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        tagINPUT.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)tagINPUT.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        tagINPUT.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment mi$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    public static MemorySegment ki$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static MemorySegment hi$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
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

