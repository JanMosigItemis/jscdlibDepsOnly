// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class addrinfoExW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("ai_flags"),
        C_INT.withName("ai_family"),
        C_INT.withName("ai_socktype"),
        C_INT.withName("ai_protocol"),
        C_LONG_LONG.withName("ai_addrlen"),
        C_POINTER.withName("ai_canonname"),
        C_POINTER.withName("ai_addr"),
        C_POINTER.withName("ai_blob"),
        C_LONG_LONG.withName("ai_bloblen"),
        C_POINTER.withName("ai_provider"),
        C_POINTER.withName("ai_next")
    ).withName("addrinfoExW");
    public static MemoryLayout $LAYOUT() {
        return addrinfoExW.$struct$LAYOUT;
    }
    static final VarHandle ai_flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ai_flags"));
    public static VarHandle ai_flags$VH() {
        return addrinfoExW.ai_flags$VH;
    }
    public static int ai_flags$get(MemorySegment seg) {
        return (int)addrinfoExW.ai_flags$VH.get(seg);
    }
    public static void ai_flags$set( MemorySegment seg, int x) {
        addrinfoExW.ai_flags$VH.set(seg, x);
    }
    public static int ai_flags$get(MemorySegment seg, long index) {
        return (int)addrinfoExW.ai_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_flags$set(MemorySegment seg, long index, int x) {
        addrinfoExW.ai_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_family$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ai_family"));
    public static VarHandle ai_family$VH() {
        return addrinfoExW.ai_family$VH;
    }
    public static int ai_family$get(MemorySegment seg) {
        return (int)addrinfoExW.ai_family$VH.get(seg);
    }
    public static void ai_family$set( MemorySegment seg, int x) {
        addrinfoExW.ai_family$VH.set(seg, x);
    }
    public static int ai_family$get(MemorySegment seg, long index) {
        return (int)addrinfoExW.ai_family$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_family$set(MemorySegment seg, long index, int x) {
        addrinfoExW.ai_family$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_socktype$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ai_socktype"));
    public static VarHandle ai_socktype$VH() {
        return addrinfoExW.ai_socktype$VH;
    }
    public static int ai_socktype$get(MemorySegment seg) {
        return (int)addrinfoExW.ai_socktype$VH.get(seg);
    }
    public static void ai_socktype$set( MemorySegment seg, int x) {
        addrinfoExW.ai_socktype$VH.set(seg, x);
    }
    public static int ai_socktype$get(MemorySegment seg, long index) {
        return (int)addrinfoExW.ai_socktype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_socktype$set(MemorySegment seg, long index, int x) {
        addrinfoExW.ai_socktype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_protocol$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ai_protocol"));
    public static VarHandle ai_protocol$VH() {
        return addrinfoExW.ai_protocol$VH;
    }
    public static int ai_protocol$get(MemorySegment seg) {
        return (int)addrinfoExW.ai_protocol$VH.get(seg);
    }
    public static void ai_protocol$set( MemorySegment seg, int x) {
        addrinfoExW.ai_protocol$VH.set(seg, x);
    }
    public static int ai_protocol$get(MemorySegment seg, long index) {
        return (int)addrinfoExW.ai_protocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_protocol$set(MemorySegment seg, long index, int x) {
        addrinfoExW.ai_protocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_addrlen$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ai_addrlen"));
    public static VarHandle ai_addrlen$VH() {
        return addrinfoExW.ai_addrlen$VH;
    }
    public static long ai_addrlen$get(MemorySegment seg) {
        return (long)addrinfoExW.ai_addrlen$VH.get(seg);
    }
    public static void ai_addrlen$set( MemorySegment seg, long x) {
        addrinfoExW.ai_addrlen$VH.set(seg, x);
    }
    public static long ai_addrlen$get(MemorySegment seg, long index) {
        return (long)addrinfoExW.ai_addrlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_addrlen$set(MemorySegment seg, long index, long x) {
        addrinfoExW.ai_addrlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_canonname$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ai_canonname")));
    public static VarHandle ai_canonname$VH() {
        return addrinfoExW.ai_canonname$VH;
    }
    public static MemoryAddress ai_canonname$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_canonname$VH.get(seg);
    }
    public static void ai_canonname$set( MemorySegment seg, MemoryAddress x) {
        addrinfoExW.ai_canonname$VH.set(seg, x);
    }
    public static MemoryAddress ai_canonname$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_canonname$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_canonname$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoExW.ai_canonname$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_addr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ai_addr")));
    public static VarHandle ai_addr$VH() {
        return addrinfoExW.ai_addr$VH;
    }
    public static MemoryAddress ai_addr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_addr$VH.get(seg);
    }
    public static void ai_addr$set( MemorySegment seg, MemoryAddress x) {
        addrinfoExW.ai_addr$VH.set(seg, x);
    }
    public static MemoryAddress ai_addr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_addr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_addr$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoExW.ai_addr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_blob$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ai_blob")));
    public static VarHandle ai_blob$VH() {
        return addrinfoExW.ai_blob$VH;
    }
    public static MemoryAddress ai_blob$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_blob$VH.get(seg);
    }
    public static void ai_blob$set( MemorySegment seg, MemoryAddress x) {
        addrinfoExW.ai_blob$VH.set(seg, x);
    }
    public static MemoryAddress ai_blob$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_blob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_blob$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoExW.ai_blob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_bloblen$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ai_bloblen"));
    public static VarHandle ai_bloblen$VH() {
        return addrinfoExW.ai_bloblen$VH;
    }
    public static long ai_bloblen$get(MemorySegment seg) {
        return (long)addrinfoExW.ai_bloblen$VH.get(seg);
    }
    public static void ai_bloblen$set( MemorySegment seg, long x) {
        addrinfoExW.ai_bloblen$VH.set(seg, x);
    }
    public static long ai_bloblen$get(MemorySegment seg, long index) {
        return (long)addrinfoExW.ai_bloblen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_bloblen$set(MemorySegment seg, long index, long x) {
        addrinfoExW.ai_bloblen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_provider$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ai_provider")));
    public static VarHandle ai_provider$VH() {
        return addrinfoExW.ai_provider$VH;
    }
    public static MemoryAddress ai_provider$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_provider$VH.get(seg);
    }
    public static void ai_provider$set( MemorySegment seg, MemoryAddress x) {
        addrinfoExW.ai_provider$VH.set(seg, x);
    }
    public static MemoryAddress ai_provider$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_provider$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_provider$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoExW.ai_provider$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_next$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ai_next")));
    public static VarHandle ai_next$VH() {
        return addrinfoExW.ai_next$VH;
    }
    public static MemoryAddress ai_next$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_next$VH.get(seg);
    }
    public static void ai_next$set( MemorySegment seg, MemoryAddress x) {
        addrinfoExW.ai_next$VH.set(seg, x);
    }
    public static MemoryAddress ai_next$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)addrinfoExW.ai_next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_next$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoExW.ai_next$VH.set(seg.asSlice(index*sizeof()), x);
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

