// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagCOMPAREITEMSTRUCT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("CtlType"),
        C_INT.withName("CtlID"),
        C_POINTER.withName("hwndItem"),
        C_INT.withName("itemID1"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("itemData1"),
        C_INT.withName("itemID2"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("itemData2"),
        C_LONG.withName("dwLocaleId"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagCOMPAREITEMSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagCOMPAREITEMSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle CtlType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("CtlType"));
    public static VarHandle CtlType$VH() {
        return tagCOMPAREITEMSTRUCT.CtlType$VH;
    }
    public static int CtlType$get(MemorySegment seg) {
        return (int)tagCOMPAREITEMSTRUCT.CtlType$VH.get(seg);
    }
    public static void CtlType$set( MemorySegment seg, int x) {
        tagCOMPAREITEMSTRUCT.CtlType$VH.set(seg, x);
    }
    public static int CtlType$get(MemorySegment seg, long index) {
        return (int)tagCOMPAREITEMSTRUCT.CtlType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlType$set(MemorySegment seg, long index, int x) {
        tagCOMPAREITEMSTRUCT.CtlType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CtlID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("CtlID"));
    public static VarHandle CtlID$VH() {
        return tagCOMPAREITEMSTRUCT.CtlID$VH;
    }
    public static int CtlID$get(MemorySegment seg) {
        return (int)tagCOMPAREITEMSTRUCT.CtlID$VH.get(seg);
    }
    public static void CtlID$set( MemorySegment seg, int x) {
        tagCOMPAREITEMSTRUCT.CtlID$VH.set(seg, x);
    }
    public static int CtlID$get(MemorySegment seg, long index) {
        return (int)tagCOMPAREITEMSTRUCT.CtlID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlID$set(MemorySegment seg, long index, int x) {
        tagCOMPAREITEMSTRUCT.CtlID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndItem$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndItem")));
    public static VarHandle hwndItem$VH() {
        return tagCOMPAREITEMSTRUCT.hwndItem$VH;
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCOMPAREITEMSTRUCT.hwndItem$VH.get(seg);
    }
    public static void hwndItem$set( MemorySegment seg, MemoryAddress x) {
        tagCOMPAREITEMSTRUCT.hwndItem$VH.set(seg, x);
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCOMPAREITEMSTRUCT.hwndItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndItem$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCOMPAREITEMSTRUCT.hwndItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemID1$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("itemID1"));
    public static VarHandle itemID1$VH() {
        return tagCOMPAREITEMSTRUCT.itemID1$VH;
    }
    public static int itemID1$get(MemorySegment seg) {
        return (int)tagCOMPAREITEMSTRUCT.itemID1$VH.get(seg);
    }
    public static void itemID1$set( MemorySegment seg, int x) {
        tagCOMPAREITEMSTRUCT.itemID1$VH.set(seg, x);
    }
    public static int itemID1$get(MemorySegment seg, long index) {
        return (int)tagCOMPAREITEMSTRUCT.itemID1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemID1$set(MemorySegment seg, long index, int x) {
        tagCOMPAREITEMSTRUCT.itemID1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemData1$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("itemData1"));
    public static VarHandle itemData1$VH() {
        return tagCOMPAREITEMSTRUCT.itemData1$VH;
    }
    public static long itemData1$get(MemorySegment seg) {
        return (long)tagCOMPAREITEMSTRUCT.itemData1$VH.get(seg);
    }
    public static void itemData1$set( MemorySegment seg, long x) {
        tagCOMPAREITEMSTRUCT.itemData1$VH.set(seg, x);
    }
    public static long itemData1$get(MemorySegment seg, long index) {
        return (long)tagCOMPAREITEMSTRUCT.itemData1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemData1$set(MemorySegment seg, long index, long x) {
        tagCOMPAREITEMSTRUCT.itemData1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemID2$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("itemID2"));
    public static VarHandle itemID2$VH() {
        return tagCOMPAREITEMSTRUCT.itemID2$VH;
    }
    public static int itemID2$get(MemorySegment seg) {
        return (int)tagCOMPAREITEMSTRUCT.itemID2$VH.get(seg);
    }
    public static void itemID2$set( MemorySegment seg, int x) {
        tagCOMPAREITEMSTRUCT.itemID2$VH.set(seg, x);
    }
    public static int itemID2$get(MemorySegment seg, long index) {
        return (int)tagCOMPAREITEMSTRUCT.itemID2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemID2$set(MemorySegment seg, long index, int x) {
        tagCOMPAREITEMSTRUCT.itemID2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemData2$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("itemData2"));
    public static VarHandle itemData2$VH() {
        return tagCOMPAREITEMSTRUCT.itemData2$VH;
    }
    public static long itemData2$get(MemorySegment seg) {
        return (long)tagCOMPAREITEMSTRUCT.itemData2$VH.get(seg);
    }
    public static void itemData2$set( MemorySegment seg, long x) {
        tagCOMPAREITEMSTRUCT.itemData2$VH.set(seg, x);
    }
    public static long itemData2$get(MemorySegment seg, long index) {
        return (long)tagCOMPAREITEMSTRUCT.itemData2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemData2$set(MemorySegment seg, long index, long x) {
        tagCOMPAREITEMSTRUCT.itemData2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwLocaleId$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwLocaleId"));
    public static VarHandle dwLocaleId$VH() {
        return tagCOMPAREITEMSTRUCT.dwLocaleId$VH;
    }
    public static int dwLocaleId$get(MemorySegment seg) {
        return (int)tagCOMPAREITEMSTRUCT.dwLocaleId$VH.get(seg);
    }
    public static void dwLocaleId$set( MemorySegment seg, int x) {
        tagCOMPAREITEMSTRUCT.dwLocaleId$VH.set(seg, x);
    }
    public static int dwLocaleId$get(MemorySegment seg, long index) {
        return (int)tagCOMPAREITEMSTRUCT.dwLocaleId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLocaleId$set(MemorySegment seg, long index, int x) {
        tagCOMPAREITEMSTRUCT.dwLocaleId$VH.set(seg.asSlice(index*sizeof()), x);
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

