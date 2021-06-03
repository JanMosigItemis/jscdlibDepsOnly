// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class joyinfoex_tag {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwSize"),
        C_LONG.withName("dwFlags"),
        C_LONG.withName("dwXpos"),
        C_LONG.withName("dwYpos"),
        C_LONG.withName("dwZpos"),
        C_LONG.withName("dwRpos"),
        C_LONG.withName("dwUpos"),
        C_LONG.withName("dwVpos"),
        C_LONG.withName("dwButtons"),
        C_LONG.withName("dwButtonNumber"),
        C_LONG.withName("dwPOV"),
        C_LONG.withName("dwReserved1"),
        C_LONG.withName("dwReserved2")
    ).withName("joyinfoex_tag");
    public static MemoryLayout $LAYOUT() {
        return joyinfoex_tag.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return joyinfoex_tag.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return joyinfoex_tag.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwXpos$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwXpos"));
    public static VarHandle dwXpos$VH() {
        return joyinfoex_tag.dwXpos$VH;
    }
    public static int dwXpos$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwXpos$VH.get(seg);
    }
    public static void dwXpos$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwXpos$VH.set(seg, x);
    }
    public static int dwXpos$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwXpos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwXpos$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwXpos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwYpos$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwYpos"));
    public static VarHandle dwYpos$VH() {
        return joyinfoex_tag.dwYpos$VH;
    }
    public static int dwYpos$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwYpos$VH.get(seg);
    }
    public static void dwYpos$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwYpos$VH.set(seg, x);
    }
    public static int dwYpos$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwYpos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwYpos$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwYpos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwZpos$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwZpos"));
    public static VarHandle dwZpos$VH() {
        return joyinfoex_tag.dwZpos$VH;
    }
    public static int dwZpos$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwZpos$VH.get(seg);
    }
    public static void dwZpos$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwZpos$VH.set(seg, x);
    }
    public static int dwZpos$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwZpos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwZpos$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwZpos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRpos$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwRpos"));
    public static VarHandle dwRpos$VH() {
        return joyinfoex_tag.dwRpos$VH;
    }
    public static int dwRpos$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwRpos$VH.get(seg);
    }
    public static void dwRpos$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwRpos$VH.set(seg, x);
    }
    public static int dwRpos$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwRpos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRpos$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwRpos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwUpos$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwUpos"));
    public static VarHandle dwUpos$VH() {
        return joyinfoex_tag.dwUpos$VH;
    }
    public static int dwUpos$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwUpos$VH.get(seg);
    }
    public static void dwUpos$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwUpos$VH.set(seg, x);
    }
    public static int dwUpos$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwUpos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwUpos$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwUpos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVpos$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwVpos"));
    public static VarHandle dwVpos$VH() {
        return joyinfoex_tag.dwVpos$VH;
    }
    public static int dwVpos$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwVpos$VH.get(seg);
    }
    public static void dwVpos$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwVpos$VH.set(seg, x);
    }
    public static int dwVpos$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwVpos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVpos$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwVpos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwButtons$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwButtons"));
    public static VarHandle dwButtons$VH() {
        return joyinfoex_tag.dwButtons$VH;
    }
    public static int dwButtons$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwButtons$VH.get(seg);
    }
    public static void dwButtons$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwButtons$VH.set(seg, x);
    }
    public static int dwButtons$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwButtons$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwButtons$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwButtons$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwButtonNumber$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwButtonNumber"));
    public static VarHandle dwButtonNumber$VH() {
        return joyinfoex_tag.dwButtonNumber$VH;
    }
    public static int dwButtonNumber$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwButtonNumber$VH.get(seg);
    }
    public static void dwButtonNumber$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwButtonNumber$VH.set(seg, x);
    }
    public static int dwButtonNumber$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwButtonNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwButtonNumber$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwButtonNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPOV$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwPOV"));
    public static VarHandle dwPOV$VH() {
        return joyinfoex_tag.dwPOV$VH;
    }
    public static int dwPOV$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwPOV$VH.get(seg);
    }
    public static void dwPOV$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwPOV$VH.set(seg, x);
    }
    public static int dwPOV$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwPOV$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPOV$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwPOV$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved1$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwReserved1"));
    public static VarHandle dwReserved1$VH() {
        return joyinfoex_tag.dwReserved1$VH;
    }
    public static int dwReserved1$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwReserved1$VH.get(seg);
    }
    public static void dwReserved1$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwReserved1$VH.set(seg, x);
    }
    public static int dwReserved1$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved1$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved2$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwReserved2"));
    public static VarHandle dwReserved2$VH() {
        return joyinfoex_tag.dwReserved2$VH;
    }
    public static int dwReserved2$get(MemorySegment seg) {
        return (int)joyinfoex_tag.dwReserved2$VH.get(seg);
    }
    public static void dwReserved2$set( MemorySegment seg, int x) {
        joyinfoex_tag.dwReserved2$VH.set(seg, x);
    }
    public static int dwReserved2$get(MemorySegment seg, long index) {
        return (int)joyinfoex_tag.dwReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved2$set(MemorySegment seg, long index, int x) {
        joyinfoex_tag.dwReserved2$VH.set(seg.asSlice(index*sizeof()), x);
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

