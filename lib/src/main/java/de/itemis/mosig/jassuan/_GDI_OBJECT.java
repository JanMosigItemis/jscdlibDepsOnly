// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _GDI_OBJECT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("ObjectType"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            C_POINTER.withName("hBitmap"),
            C_POINTER.withName("hPalette"),
            C_POINTER.withName("hGeneric")
        ).withName("u")
    ).withName("_GDI_OBJECT");
    public static MemoryLayout $LAYOUT() {
        return _GDI_OBJECT.$struct$LAYOUT;
    }
    static final VarHandle ObjectType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ObjectType"));
    public static VarHandle ObjectType$VH() {
        return _GDI_OBJECT.ObjectType$VH;
    }
    public static int ObjectType$get(MemorySegment seg) {
        return (int)_GDI_OBJECT.ObjectType$VH.get(seg);
    }
    public static void ObjectType$set( MemorySegment seg, int x) {
        _GDI_OBJECT.ObjectType$VH.set(seg, x);
    }
    public static int ObjectType$get(MemorySegment seg, long index) {
        return (int)_GDI_OBJECT.ObjectType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ObjectType$set(MemorySegment seg, long index, int x) {
        _GDI_OBJECT.ObjectType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class __WIDL_objidl_generated_name_0000000C {

        static final MemoryLayout __WIDL_objidl_generated_name_0000000C$union$LAYOUT = MemoryLayout.unionLayout(
            C_POINTER.withName("hBitmap"),
            C_POINTER.withName("hPalette"),
            C_POINTER.withName("hGeneric")
        ).withName("__WIDL_objidl_generated_name_0000000C");
        public static MemoryLayout $LAYOUT() {
            return __WIDL_objidl_generated_name_0000000C.__WIDL_objidl_generated_name_0000000C$union$LAYOUT;
        }
        static final VarHandle hBitmap$VH = MemoryHandles.asAddressVarHandle(__WIDL_objidl_generated_name_0000000C$union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hBitmap")));
        public static VarHandle hBitmap$VH() {
            return __WIDL_objidl_generated_name_0000000C.hBitmap$VH;
        }
        public static MemoryAddress hBitmap$get(MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)__WIDL_objidl_generated_name_0000000C.hBitmap$VH.get(seg);
        }
        public static void hBitmap$set( MemorySegment seg, MemoryAddress x) {
            __WIDL_objidl_generated_name_0000000C.hBitmap$VH.set(seg, x);
        }
        public static MemoryAddress hBitmap$get(MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)__WIDL_objidl_generated_name_0000000C.hBitmap$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hBitmap$set(MemorySegment seg, long index, MemoryAddress x) {
            __WIDL_objidl_generated_name_0000000C.hBitmap$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle hPalette$VH = MemoryHandles.asAddressVarHandle(__WIDL_objidl_generated_name_0000000C$union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hPalette")));
        public static VarHandle hPalette$VH() {
            return __WIDL_objidl_generated_name_0000000C.hPalette$VH;
        }
        public static MemoryAddress hPalette$get(MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)__WIDL_objidl_generated_name_0000000C.hPalette$VH.get(seg);
        }
        public static void hPalette$set( MemorySegment seg, MemoryAddress x) {
            __WIDL_objidl_generated_name_0000000C.hPalette$VH.set(seg, x);
        }
        public static MemoryAddress hPalette$get(MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)__WIDL_objidl_generated_name_0000000C.hPalette$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hPalette$set(MemorySegment seg, long index, MemoryAddress x) {
            __WIDL_objidl_generated_name_0000000C.hPalette$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle hGeneric$VH = MemoryHandles.asAddressVarHandle(__WIDL_objidl_generated_name_0000000C$union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hGeneric")));
        public static VarHandle hGeneric$VH() {
            return __WIDL_objidl_generated_name_0000000C.hGeneric$VH;
        }
        public static MemoryAddress hGeneric$get(MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)__WIDL_objidl_generated_name_0000000C.hGeneric$VH.get(seg);
        }
        public static void hGeneric$set( MemorySegment seg, MemoryAddress x) {
            __WIDL_objidl_generated_name_0000000C.hGeneric$VH.set(seg, x);
        }
        public static MemoryAddress hGeneric$get(MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)__WIDL_objidl_generated_name_0000000C.hGeneric$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hGeneric$set(MemorySegment seg, long index, MemoryAddress x) {
            __WIDL_objidl_generated_name_0000000C.hGeneric$VH.set(seg.asSlice(index*sizeof()), x);
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

    public static MemorySegment u$slice(MemorySegment seg) {
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

