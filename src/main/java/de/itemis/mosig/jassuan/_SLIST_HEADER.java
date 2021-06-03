// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _SLIST_HEADER {

    static final MemoryLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            C_LONG_LONG.withName("Alignment"),
            C_LONG_LONG.withName("Region")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.valueLayout(16, ByteOrder.nativeOrder()).withName("Depth"),
                MemoryLayout.valueLayout(9, ByteOrder.nativeOrder()).withName("Sequence"),
                MemoryLayout.valueLayout(39, ByteOrder.nativeOrder()).withName("NextEntry"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("HeaderType"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("Init"),
                MemoryLayout.valueLayout(59, ByteOrder.nativeOrder()).withName("Reserved"),
                MemoryLayout.valueLayout(3, ByteOrder.nativeOrder()).withName("Region")
            )
        ).withName("Header8"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.valueLayout(16, ByteOrder.nativeOrder()).withName("Depth"),
                MemoryLayout.valueLayout(48, ByteOrder.nativeOrder()).withName("Sequence"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("HeaderType"),
                MemoryLayout.valueLayout(3, ByteOrder.nativeOrder()).withName("Reserved"),
                MemoryLayout.valueLayout(60, ByteOrder.nativeOrder()).withName("NextEntry")
            )
        ).withName("HeaderX64")
    ).withName("_SLIST_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _SLIST_HEADER.$union$LAYOUT;
    }
    static final VarHandle Alignment$VH = $union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Alignment"));
    public static VarHandle Alignment$VH() {
        return _SLIST_HEADER.Alignment$VH;
    }
    public static long Alignment$get(MemorySegment seg) {
        return (long)_SLIST_HEADER.Alignment$VH.get(seg);
    }
    public static void Alignment$set( MemorySegment seg, long x) {
        _SLIST_HEADER.Alignment$VH.set(seg, x);
    }
    public static long Alignment$get(MemorySegment seg, long index) {
        return (long)_SLIST_HEADER.Alignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alignment$set(MemorySegment seg, long index, long x) {
        _SLIST_HEADER.Alignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Region$VH = $union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Region"));
    public static VarHandle Region$VH() {
        return _SLIST_HEADER.Region$VH;
    }
    public static long Region$get(MemorySegment seg) {
        return (long)_SLIST_HEADER.Region$VH.get(seg);
    }
    public static void Region$set( MemorySegment seg, long x) {
        _SLIST_HEADER.Region$VH.set(seg, x);
    }
    public static long Region$get(MemorySegment seg, long index) {
        return (long)_SLIST_HEADER.Region$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Region$set(MemorySegment seg, long index, long x) {
        _SLIST_HEADER.Region$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Header8 {

        static final MemoryLayout Header8$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.valueLayout(16, ByteOrder.nativeOrder()).withName("Depth"),
                MemoryLayout.valueLayout(9, ByteOrder.nativeOrder()).withName("Sequence"),
                MemoryLayout.valueLayout(39, ByteOrder.nativeOrder()).withName("NextEntry"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("HeaderType"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("Init"),
                MemoryLayout.valueLayout(59, ByteOrder.nativeOrder()).withName("Reserved"),
                MemoryLayout.valueLayout(3, ByteOrder.nativeOrder()).withName("Region")
            )
        );
        public static MemoryLayout $LAYOUT() {
            return Header8.Header8$struct$LAYOUT;
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

    public static MemorySegment Header8$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static class HeaderX64 {

        static final MemoryLayout HeaderX64$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.valueLayout(16, ByteOrder.nativeOrder()).withName("Depth"),
                MemoryLayout.valueLayout(48, ByteOrder.nativeOrder()).withName("Sequence"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("HeaderType"),
                MemoryLayout.valueLayout(3, ByteOrder.nativeOrder()).withName("Reserved"),
                MemoryLayout.valueLayout(60, ByteOrder.nativeOrder()).withName("NextEntry")
            )
        );
        public static MemoryLayout $LAYOUT() {
            return HeaderX64.HeaderX64$struct$LAYOUT;
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

    public static MemorySegment HeaderX64$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
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

