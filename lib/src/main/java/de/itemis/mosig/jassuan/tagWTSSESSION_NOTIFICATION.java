// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagWTSSESSION_NOTIFICATION {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        C_LONG.withName("dwSessionId")
    ).withName("tagWTSSESSION_NOTIFICATION");
    public static MemoryLayout $LAYOUT() {
        return tagWTSSESSION_NOTIFICATION.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagWTSSESSION_NOTIFICATION.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagWTSSESSION_NOTIFICATION.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagWTSSESSION_NOTIFICATION.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagWTSSESSION_NOTIFICATION.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagWTSSESSION_NOTIFICATION.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSessionId$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSessionId"));
    public static VarHandle dwSessionId$VH() {
        return tagWTSSESSION_NOTIFICATION.dwSessionId$VH;
    }
    public static int dwSessionId$get(MemorySegment seg) {
        return (int)tagWTSSESSION_NOTIFICATION.dwSessionId$VH.get(seg);
    }
    public static void dwSessionId$set( MemorySegment seg, int x) {
        tagWTSSESSION_NOTIFICATION.dwSessionId$VH.set(seg, x);
    }
    public static int dwSessionId$get(MemorySegment seg, long index) {
        return (int)tagWTSSESSION_NOTIFICATION.dwSessionId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSessionId$set(MemorySegment seg, long index, int x) {
        tagWTSSESSION_NOTIFICATION.dwSessionId$VH.set(seg.asSlice(index*sizeof()), x);
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

