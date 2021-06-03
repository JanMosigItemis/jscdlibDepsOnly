// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __BCRYPT_KEY_LENGTHS_STRUCT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwMinLength"),
        C_LONG.withName("dwMaxLength"),
        C_LONG.withName("dwIncrement")
    ).withName("__BCRYPT_KEY_LENGTHS_STRUCT");
    public static MemoryLayout $LAYOUT() {
        return __BCRYPT_KEY_LENGTHS_STRUCT.$struct$LAYOUT;
    }
    static final VarHandle dwMinLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwMinLength"));
    public static VarHandle dwMinLength$VH() {
        return __BCRYPT_KEY_LENGTHS_STRUCT.dwMinLength$VH;
    }
    public static int dwMinLength$get(MemorySegment seg) {
        return (int)__BCRYPT_KEY_LENGTHS_STRUCT.dwMinLength$VH.get(seg);
    }
    public static void dwMinLength$set( MemorySegment seg, int x) {
        __BCRYPT_KEY_LENGTHS_STRUCT.dwMinLength$VH.set(seg, x);
    }
    public static int dwMinLength$get(MemorySegment seg, long index) {
        return (int)__BCRYPT_KEY_LENGTHS_STRUCT.dwMinLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMinLength$set(MemorySegment seg, long index, int x) {
        __BCRYPT_KEY_LENGTHS_STRUCT.dwMinLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwMaxLength"));
    public static VarHandle dwMaxLength$VH() {
        return __BCRYPT_KEY_LENGTHS_STRUCT.dwMaxLength$VH;
    }
    public static int dwMaxLength$get(MemorySegment seg) {
        return (int)__BCRYPT_KEY_LENGTHS_STRUCT.dwMaxLength$VH.get(seg);
    }
    public static void dwMaxLength$set( MemorySegment seg, int x) {
        __BCRYPT_KEY_LENGTHS_STRUCT.dwMaxLength$VH.set(seg, x);
    }
    public static int dwMaxLength$get(MemorySegment seg, long index) {
        return (int)__BCRYPT_KEY_LENGTHS_STRUCT.dwMaxLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxLength$set(MemorySegment seg, long index, int x) {
        __BCRYPT_KEY_LENGTHS_STRUCT.dwMaxLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwIncrement$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwIncrement"));
    public static VarHandle dwIncrement$VH() {
        return __BCRYPT_KEY_LENGTHS_STRUCT.dwIncrement$VH;
    }
    public static int dwIncrement$get(MemorySegment seg) {
        return (int)__BCRYPT_KEY_LENGTHS_STRUCT.dwIncrement$VH.get(seg);
    }
    public static void dwIncrement$set( MemorySegment seg, int x) {
        __BCRYPT_KEY_LENGTHS_STRUCT.dwIncrement$VH.set(seg, x);
    }
    public static int dwIncrement$get(MemorySegment seg, long index) {
        return (int)__BCRYPT_KEY_LENGTHS_STRUCT.dwIncrement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwIncrement$set(MemorySegment seg, long index, int x) {
        __BCRYPT_KEY_LENGTHS_STRUCT.dwIncrement$VH.set(seg.asSlice(index*sizeof()), x);
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

