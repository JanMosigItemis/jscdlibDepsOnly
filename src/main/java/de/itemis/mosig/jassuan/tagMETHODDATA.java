// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMETHODDATA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("szName"),
        C_POINTER.withName("ppdata"),
        C_LONG.withName("dispid"),
        C_INT.withName("iMeth"),
        C_INT.withName("cc"),
        C_INT.withName("cArgs"),
        C_SHORT.withName("wFlags"),
        C_SHORT.withName("vtReturn"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagMETHODDATA");
    public static MemoryLayout $LAYOUT() {
        return tagMETHODDATA.$struct$LAYOUT;
    }
    static final VarHandle szName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("szName")));
    public static VarHandle szName$VH() {
        return tagMETHODDATA.szName$VH;
    }
    public static MemoryAddress szName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMETHODDATA.szName$VH.get(seg);
    }
    public static void szName$set( MemorySegment seg, MemoryAddress x) {
        tagMETHODDATA.szName$VH.set(seg, x);
    }
    public static MemoryAddress szName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMETHODDATA.szName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMETHODDATA.szName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ppdata$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ppdata")));
    public static VarHandle ppdata$VH() {
        return tagMETHODDATA.ppdata$VH;
    }
    public static MemoryAddress ppdata$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMETHODDATA.ppdata$VH.get(seg);
    }
    public static void ppdata$set( MemorySegment seg, MemoryAddress x) {
        tagMETHODDATA.ppdata$VH.set(seg, x);
    }
    public static MemoryAddress ppdata$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMETHODDATA.ppdata$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ppdata$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMETHODDATA.ppdata$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dispid$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dispid"));
    public static VarHandle dispid$VH() {
        return tagMETHODDATA.dispid$VH;
    }
    public static int dispid$get(MemorySegment seg) {
        return (int)tagMETHODDATA.dispid$VH.get(seg);
    }
    public static void dispid$set( MemorySegment seg, int x) {
        tagMETHODDATA.dispid$VH.set(seg, x);
    }
    public static int dispid$get(MemorySegment seg, long index) {
        return (int)tagMETHODDATA.dispid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dispid$set(MemorySegment seg, long index, int x) {
        tagMETHODDATA.dispid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iMeth$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iMeth"));
    public static VarHandle iMeth$VH() {
        return tagMETHODDATA.iMeth$VH;
    }
    public static int iMeth$get(MemorySegment seg) {
        return (int)tagMETHODDATA.iMeth$VH.get(seg);
    }
    public static void iMeth$set( MemorySegment seg, int x) {
        tagMETHODDATA.iMeth$VH.set(seg, x);
    }
    public static int iMeth$get(MemorySegment seg, long index) {
        return (int)tagMETHODDATA.iMeth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMeth$set(MemorySegment seg, long index, int x) {
        tagMETHODDATA.iMeth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cc"));
    public static VarHandle cc$VH() {
        return tagMETHODDATA.cc$VH;
    }
    public static int cc$get(MemorySegment seg) {
        return (int)tagMETHODDATA.cc$VH.get(seg);
    }
    public static void cc$set( MemorySegment seg, int x) {
        tagMETHODDATA.cc$VH.set(seg, x);
    }
    public static int cc$get(MemorySegment seg, long index) {
        return (int)tagMETHODDATA.cc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cc$set(MemorySegment seg, long index, int x) {
        tagMETHODDATA.cc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cArgs$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cArgs"));
    public static VarHandle cArgs$VH() {
        return tagMETHODDATA.cArgs$VH;
    }
    public static int cArgs$get(MemorySegment seg) {
        return (int)tagMETHODDATA.cArgs$VH.get(seg);
    }
    public static void cArgs$set( MemorySegment seg, int x) {
        tagMETHODDATA.cArgs$VH.set(seg, x);
    }
    public static int cArgs$get(MemorySegment seg, long index) {
        return (int)tagMETHODDATA.cArgs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cArgs$set(MemorySegment seg, long index, int x) {
        tagMETHODDATA.cArgs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wFlags$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wFlags"));
    public static VarHandle wFlags$VH() {
        return tagMETHODDATA.wFlags$VH;
    }
    public static short wFlags$get(MemorySegment seg) {
        return (short)tagMETHODDATA.wFlags$VH.get(seg);
    }
    public static void wFlags$set( MemorySegment seg, short x) {
        tagMETHODDATA.wFlags$VH.set(seg, x);
    }
    public static short wFlags$get(MemorySegment seg, long index) {
        return (short)tagMETHODDATA.wFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFlags$set(MemorySegment seg, long index, short x) {
        tagMETHODDATA.wFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vtReturn$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("vtReturn"));
    public static VarHandle vtReturn$VH() {
        return tagMETHODDATA.vtReturn$VH;
    }
    public static short vtReturn$get(MemorySegment seg) {
        return (short)tagMETHODDATA.vtReturn$VH.get(seg);
    }
    public static void vtReturn$set( MemorySegment seg, short x) {
        tagMETHODDATA.vtReturn$VH.set(seg, x);
    }
    public static short vtReturn$get(MemorySegment seg, long index) {
        return (short)tagMETHODDATA.vtReturn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vtReturn$set(MemorySegment seg, long index, short x) {
        tagMETHODDATA.vtReturn$VH.set(seg.asSlice(index*sizeof()), x);
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

