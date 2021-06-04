// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _FILE_REMOTE_PROTOCOL_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("StructureVersion"),
        C_SHORT.withName("StructureSize"),
        C_LONG.withName("Protocol"),
        C_SHORT.withName("ProtocolMajorVersion"),
        C_SHORT.withName("ProtocolMinorVersion"),
        C_SHORT.withName("ProtocolRevision"),
        C_SHORT.withName("Reserved"),
        C_LONG.withName("Flags"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_LONG).withName("Reserved")
        ).withName("GenericReserved"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_LONG).withName("Reserved")
        ).withName("ProtocolSpecificReserved")
    ).withName("_FILE_REMOTE_PROTOCOL_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_REMOTE_PROTOCOL_INFO.$struct$LAYOUT;
    }
    static final VarHandle StructureVersion$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("StructureVersion"));
    public static VarHandle StructureVersion$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH;
    }
    public static short StructureVersion$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH.get(seg);
    }
    public static void StructureVersion$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH.set(seg, x);
    }
    public static short StructureVersion$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StructureVersion$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.StructureVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StructureSize$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("StructureSize"));
    public static VarHandle StructureSize$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH;
    }
    public static short StructureSize$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH.get(seg);
    }
    public static void StructureSize$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH.set(seg, x);
    }
    public static short StructureSize$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StructureSize$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.StructureSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Protocol$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Protocol"));
    public static VarHandle Protocol$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.Protocol$VH;
    }
    public static int Protocol$get(MemorySegment seg) {
        return (int)_FILE_REMOTE_PROTOCOL_INFO.Protocol$VH.get(seg);
    }
    public static void Protocol$set( MemorySegment seg, int x) {
        _FILE_REMOTE_PROTOCOL_INFO.Protocol$VH.set(seg, x);
    }
    public static int Protocol$get(MemorySegment seg, long index) {
        return (int)_FILE_REMOTE_PROTOCOL_INFO.Protocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Protocol$set(MemorySegment seg, long index, int x) {
        _FILE_REMOTE_PROTOCOL_INFO.Protocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtocolMajorVersion$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("ProtocolMajorVersion"));
    public static VarHandle ProtocolMajorVersion$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH;
    }
    public static short ProtocolMajorVersion$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH.get(seg);
    }
    public static void ProtocolMajorVersion$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH.set(seg, x);
    }
    public static short ProtocolMajorVersion$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolMajorVersion$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtocolMinorVersion$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("ProtocolMinorVersion"));
    public static VarHandle ProtocolMinorVersion$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH;
    }
    public static short ProtocolMinorVersion$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH.get(seg);
    }
    public static void ProtocolMinorVersion$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH.set(seg, x);
    }
    public static short ProtocolMinorVersion$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolMinorVersion$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolMinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtocolRevision$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("ProtocolRevision"));
    public static VarHandle ProtocolRevision$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH;
    }
    public static short ProtocolRevision$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH.get(seg);
    }
    public static void ProtocolRevision$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH.set(seg, x);
    }
    public static short ProtocolRevision$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolRevision$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.ProtocolRevision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_FILE_REMOTE_PROTOCOL_INFO.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _FILE_REMOTE_PROTOCOL_INFO.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _FILE_REMOTE_PROTOCOL_INFO.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_FILE_REMOTE_PROTOCOL_INFO.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _FILE_REMOTE_PROTOCOL_INFO.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_FILE_REMOTE_PROTOCOL_INFO.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _FILE_REMOTE_PROTOCOL_INFO.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class GenericReserved {

        static final MemoryLayout GenericReserved$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_LONG).withName("Reserved")
        );
        public static MemoryLayout $LAYOUT() {
            return GenericReserved.GenericReserved$struct$LAYOUT;
        }
        public static MemorySegment Reserved$slice(MemorySegment seg) {
            return seg.asSlice(0, 32);
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

    public static MemorySegment GenericReserved$slice(MemorySegment seg) {
        return seg.asSlice(20, 32);
    }
    public static class ProtocolSpecificReserved {

        static final MemoryLayout ProtocolSpecificReserved$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_LONG).withName("Reserved")
        );
        public static MemoryLayout $LAYOUT() {
            return ProtocolSpecificReserved.ProtocolSpecificReserved$struct$LAYOUT;
        }
        public static MemorySegment Reserved$slice(MemorySegment seg) {
            return seg.asSlice(0, 64);
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

    public static MemorySegment ProtocolSpecificReserved$slice(MemorySegment seg) {
        return seg.asSlice(52, 64);
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

