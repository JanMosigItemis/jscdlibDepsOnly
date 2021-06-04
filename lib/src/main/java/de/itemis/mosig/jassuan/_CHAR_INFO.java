// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CHAR_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            C_SHORT.withName("UnicodeChar"),
            C_CHAR.withName("AsciiChar")
        ).withName("Char"),
        C_SHORT.withName("Attributes")
    ).withName("_CHAR_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CHAR_INFO.$struct$LAYOUT;
    }
    public static class Char {

        static final MemoryLayout Char$union$LAYOUT = MemoryLayout.unionLayout(
            C_SHORT.withName("UnicodeChar"),
            C_CHAR.withName("AsciiChar")
        );
        public static MemoryLayout $LAYOUT() {
            return Char.Char$union$LAYOUT;
        }
        static final VarHandle UnicodeChar$VH = Char$union$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("UnicodeChar"));
        public static VarHandle UnicodeChar$VH() {
            return Char.UnicodeChar$VH;
        }
        public static short UnicodeChar$get(MemorySegment seg) {
            return (short)Char.UnicodeChar$VH.get(seg);
        }
        public static void UnicodeChar$set( MemorySegment seg, short x) {
            Char.UnicodeChar$VH.set(seg, x);
        }
        public static short UnicodeChar$get(MemorySegment seg, long index) {
            return (short)Char.UnicodeChar$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void UnicodeChar$set(MemorySegment seg, long index, short x) {
            Char.UnicodeChar$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle AsciiChar$VH = Char$union$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("AsciiChar"));
        public static VarHandle AsciiChar$VH() {
            return Char.AsciiChar$VH;
        }
        public static byte AsciiChar$get(MemorySegment seg) {
            return (byte)Char.AsciiChar$VH.get(seg);
        }
        public static void AsciiChar$set( MemorySegment seg, byte x) {
            Char.AsciiChar$VH.set(seg, x);
        }
        public static byte AsciiChar$get(MemorySegment seg, long index) {
            return (byte)Char.AsciiChar$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AsciiChar$set(MemorySegment seg, long index, byte x) {
            Char.AsciiChar$VH.set(seg.asSlice(index*sizeof()), x);
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

    public static MemorySegment Char$slice(MemorySegment seg) {
        return seg.asSlice(0, 2);
    }
    static final VarHandle Attributes$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Attributes"));
    public static VarHandle Attributes$VH() {
        return _CHAR_INFO.Attributes$VH;
    }
    public static short Attributes$get(MemorySegment seg) {
        return (short)_CHAR_INFO.Attributes$VH.get(seg);
    }
    public static void Attributes$set( MemorySegment seg, short x) {
        _CHAR_INFO.Attributes$VH.set(seg, x);
    }
    public static short Attributes$get(MemorySegment seg, long index) {
        return (short)_CHAR_INFO.Attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, short x) {
        _CHAR_INFO.Attributes$VH.set(seg.asSlice(index*sizeof()), x);
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

