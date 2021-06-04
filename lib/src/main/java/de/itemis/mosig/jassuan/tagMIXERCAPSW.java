// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMIXERCAPSW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("wMid"),
        C_SHORT.withName("wPid"),
        C_INT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, C_SHORT).withName("szPname"),
        C_LONG.withName("fdwSupport"),
        C_LONG.withName("cDestinations")
    ).withName("tagMIXERCAPSW");
    public static MemoryLayout $LAYOUT() {
        return tagMIXERCAPSW.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagMIXERCAPSW.wMid$VH;
    }
    public static short wMid$get(MemorySegment seg) {
        return (short)tagMIXERCAPSW.wMid$VH.get(seg);
    }
    public static void wMid$set( MemorySegment seg, short x) {
        tagMIXERCAPSW.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagMIXERCAPSW.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagMIXERCAPSW.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagMIXERCAPSW.wPid$VH;
    }
    public static short wPid$get(MemorySegment seg) {
        return (short)tagMIXERCAPSW.wPid$VH.get(seg);
    }
    public static void wPid$set( MemorySegment seg, short x) {
        tagMIXERCAPSW.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagMIXERCAPSW.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagMIXERCAPSW.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagMIXERCAPSW.vDriverVersion$VH;
    }
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagMIXERCAPSW.vDriverVersion$VH.get(seg);
    }
    public static void vDriverVersion$set( MemorySegment seg, int x) {
        tagMIXERCAPSW.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagMIXERCAPSW.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagMIXERCAPSW.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    static final VarHandle fdwSupport$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fdwSupport"));
    public static VarHandle fdwSupport$VH() {
        return tagMIXERCAPSW.fdwSupport$VH;
    }
    public static int fdwSupport$get(MemorySegment seg) {
        return (int)tagMIXERCAPSW.fdwSupport$VH.get(seg);
    }
    public static void fdwSupport$set( MemorySegment seg, int x) {
        tagMIXERCAPSW.fdwSupport$VH.set(seg, x);
    }
    public static int fdwSupport$get(MemorySegment seg, long index) {
        return (int)tagMIXERCAPSW.fdwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fdwSupport$set(MemorySegment seg, long index, int x) {
        tagMIXERCAPSW.fdwSupport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cDestinations$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cDestinations"));
    public static VarHandle cDestinations$VH() {
        return tagMIXERCAPSW.cDestinations$VH;
    }
    public static int cDestinations$get(MemorySegment seg) {
        return (int)tagMIXERCAPSW.cDestinations$VH.get(seg);
    }
    public static void cDestinations$set( MemorySegment seg, int x) {
        tagMIXERCAPSW.cDestinations$VH.set(seg, x);
    }
    public static int cDestinations$get(MemorySegment seg, long index) {
        return (int)tagMIXERCAPSW.cDestinations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cDestinations$set(MemorySegment seg, long index, int x) {
        tagMIXERCAPSW.cDestinations$VH.set(seg.asSlice(index*sizeof()), x);
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

