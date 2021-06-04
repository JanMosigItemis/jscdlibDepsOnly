// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMONCONVSTRUCT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("cb"),
        C_INT.withName("fConnect"),
        C_LONG.withName("dwTime"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hTask"),
        C_POINTER.withName("hszSvc"),
        C_POINTER.withName("hszTopic"),
        C_POINTER.withName("hConvClient"),
        C_POINTER.withName("hConvServer")
    ).withName("tagMONCONVSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagMONCONVSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return tagMONCONVSTRUCT.cb$VH;
    }
    public static int cb$get(MemorySegment seg) {
        return (int)tagMONCONVSTRUCT.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, int x) {
        tagMONCONVSTRUCT.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)tagMONCONVSTRUCT.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        tagMONCONVSTRUCT.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fConnect$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fConnect"));
    public static VarHandle fConnect$VH() {
        return tagMONCONVSTRUCT.fConnect$VH;
    }
    public static int fConnect$get(MemorySegment seg) {
        return (int)tagMONCONVSTRUCT.fConnect$VH.get(seg);
    }
    public static void fConnect$set( MemorySegment seg, int x) {
        tagMONCONVSTRUCT.fConnect$VH.set(seg, x);
    }
    public static int fConnect$get(MemorySegment seg, long index) {
        return (int)tagMONCONVSTRUCT.fConnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fConnect$set(MemorySegment seg, long index, int x) {
        tagMONCONVSTRUCT.fConnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTime$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwTime"));
    public static VarHandle dwTime$VH() {
        return tagMONCONVSTRUCT.dwTime$VH;
    }
    public static int dwTime$get(MemorySegment seg) {
        return (int)tagMONCONVSTRUCT.dwTime$VH.get(seg);
    }
    public static void dwTime$set( MemorySegment seg, int x) {
        tagMONCONVSTRUCT.dwTime$VH.set(seg, x);
    }
    public static int dwTime$get(MemorySegment seg, long index) {
        return (int)tagMONCONVSTRUCT.dwTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTime$set(MemorySegment seg, long index, int x) {
        tagMONCONVSTRUCT.dwTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hTask$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hTask")));
    public static VarHandle hTask$VH() {
        return tagMONCONVSTRUCT.hTask$VH;
    }
    public static MemoryAddress hTask$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hTask$VH.get(seg);
    }
    public static void hTask$set( MemorySegment seg, MemoryAddress x) {
        tagMONCONVSTRUCT.hTask$VH.set(seg, x);
    }
    public static MemoryAddress hTask$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hTask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hTask$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONCONVSTRUCT.hTask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hszSvc$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hszSvc")));
    public static VarHandle hszSvc$VH() {
        return tagMONCONVSTRUCT.hszSvc$VH;
    }
    public static MemoryAddress hszSvc$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hszSvc$VH.get(seg);
    }
    public static void hszSvc$set( MemorySegment seg, MemoryAddress x) {
        tagMONCONVSTRUCT.hszSvc$VH.set(seg, x);
    }
    public static MemoryAddress hszSvc$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hszSvc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hszSvc$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONCONVSTRUCT.hszSvc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hszTopic$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hszTopic")));
    public static VarHandle hszTopic$VH() {
        return tagMONCONVSTRUCT.hszTopic$VH;
    }
    public static MemoryAddress hszTopic$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hszTopic$VH.get(seg);
    }
    public static void hszTopic$set( MemorySegment seg, MemoryAddress x) {
        tagMONCONVSTRUCT.hszTopic$VH.set(seg, x);
    }
    public static MemoryAddress hszTopic$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hszTopic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hszTopic$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONCONVSTRUCT.hszTopic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hConvClient$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hConvClient")));
    public static VarHandle hConvClient$VH() {
        return tagMONCONVSTRUCT.hConvClient$VH;
    }
    public static MemoryAddress hConvClient$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hConvClient$VH.get(seg);
    }
    public static void hConvClient$set( MemorySegment seg, MemoryAddress x) {
        tagMONCONVSTRUCT.hConvClient$VH.set(seg, x);
    }
    public static MemoryAddress hConvClient$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hConvClient$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hConvClient$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONCONVSTRUCT.hConvClient$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hConvServer$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hConvServer")));
    public static VarHandle hConvServer$VH() {
        return tagMONCONVSTRUCT.hConvServer$VH;
    }
    public static MemoryAddress hConvServer$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hConvServer$VH.get(seg);
    }
    public static void hConvServer$set( MemorySegment seg, MemoryAddress x) {
        tagMONCONVSTRUCT.hConvServer$VH.set(seg, x);
    }
    public static MemoryAddress hConvServer$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMONCONVSTRUCT.hConvServer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hConvServer$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONCONVSTRUCT.hConvServer$VH.set(seg.asSlice(index*sizeof()), x);
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

