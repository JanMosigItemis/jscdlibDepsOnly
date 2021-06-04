// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _COMMCONFIG {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwSize"),
        C_SHORT.withName("wVersion"),
        C_SHORT.withName("wReserved"),
        MemoryLayout.structLayout(
            C_LONG.withName("DCBlength"),
            C_LONG.withName("BaudRate"),
            MemoryLayout.structLayout(
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fBinary"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fParity"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fOutxCtsFlow"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fOutxDsrFlow"),
                MemoryLayout.valueLayout(2, ByteOrder.nativeOrder()).withName("fDtrControl"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fDsrSensitivity"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fTXContinueOnXoff"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fOutX"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fInX"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fErrorChar"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fNull"),
                MemoryLayout.valueLayout(2, ByteOrder.nativeOrder()).withName("fRtsControl"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("fAbortOnError"),
                MemoryLayout.valueLayout(17, ByteOrder.nativeOrder()).withName("fDummy2")
            ),
            C_SHORT.withName("wReserved"),
            C_SHORT.withName("XonLim"),
            C_SHORT.withName("XoffLim"),
            C_CHAR.withName("ByteSize"),
            C_CHAR.withName("Parity"),
            C_CHAR.withName("StopBits"),
            C_CHAR.withName("XonChar"),
            C_CHAR.withName("XoffChar"),
            C_CHAR.withName("ErrorChar"),
            C_CHAR.withName("EofChar"),
            C_CHAR.withName("EvtChar"),
            C_SHORT.withName("wReserved1")
        ).withName("dcb"),
        C_LONG.withName("dwProviderSubType"),
        C_LONG.withName("dwProviderOffset"),
        C_LONG.withName("dwProviderSize"),
        MemoryLayout.sequenceLayout(1, C_SHORT).withName("wcProviderData"),
        MemoryLayout.paddingLayout(16)
    ).withName("_COMMCONFIG");
    public static MemoryLayout $LAYOUT() {
        return _COMMCONFIG.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _COMMCONFIG.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)_COMMCONFIG.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        _COMMCONFIG.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_COMMCONFIG.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _COMMCONFIG.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVersion$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wVersion"));
    public static VarHandle wVersion$VH() {
        return _COMMCONFIG.wVersion$VH;
    }
    public static short wVersion$get(MemorySegment seg) {
        return (short)_COMMCONFIG.wVersion$VH.get(seg);
    }
    public static void wVersion$set( MemorySegment seg, short x) {
        _COMMCONFIG.wVersion$VH.set(seg, x);
    }
    public static short wVersion$get(MemorySegment seg, long index) {
        return (short)_COMMCONFIG.wVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVersion$set(MemorySegment seg, long index, short x) {
        _COMMCONFIG.wVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wReserved"));
    public static VarHandle wReserved$VH() {
        return _COMMCONFIG.wReserved$VH;
    }
    public static short wReserved$get(MemorySegment seg) {
        return (short)_COMMCONFIG.wReserved$VH.get(seg);
    }
    public static void wReserved$set( MemorySegment seg, short x) {
        _COMMCONFIG.wReserved$VH.set(seg, x);
    }
    public static short wReserved$get(MemorySegment seg, long index) {
        return (short)_COMMCONFIG.wReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, short x) {
        _COMMCONFIG.wReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dcb$slice(MemorySegment seg) {
        return seg.asSlice(8, 28);
    }
    static final VarHandle dwProviderSubType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwProviderSubType"));
    public static VarHandle dwProviderSubType$VH() {
        return _COMMCONFIG.dwProviderSubType$VH;
    }
    public static int dwProviderSubType$get(MemorySegment seg) {
        return (int)_COMMCONFIG.dwProviderSubType$VH.get(seg);
    }
    public static void dwProviderSubType$set( MemorySegment seg, int x) {
        _COMMCONFIG.dwProviderSubType$VH.set(seg, x);
    }
    public static int dwProviderSubType$get(MemorySegment seg, long index) {
        return (int)_COMMCONFIG.dwProviderSubType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProviderSubType$set(MemorySegment seg, long index, int x) {
        _COMMCONFIG.dwProviderSubType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProviderOffset$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwProviderOffset"));
    public static VarHandle dwProviderOffset$VH() {
        return _COMMCONFIG.dwProviderOffset$VH;
    }
    public static int dwProviderOffset$get(MemorySegment seg) {
        return (int)_COMMCONFIG.dwProviderOffset$VH.get(seg);
    }
    public static void dwProviderOffset$set( MemorySegment seg, int x) {
        _COMMCONFIG.dwProviderOffset$VH.set(seg, x);
    }
    public static int dwProviderOffset$get(MemorySegment seg, long index) {
        return (int)_COMMCONFIG.dwProviderOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProviderOffset$set(MemorySegment seg, long index, int x) {
        _COMMCONFIG.dwProviderOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProviderSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwProviderSize"));
    public static VarHandle dwProviderSize$VH() {
        return _COMMCONFIG.dwProviderSize$VH;
    }
    public static int dwProviderSize$get(MemorySegment seg) {
        return (int)_COMMCONFIG.dwProviderSize$VH.get(seg);
    }
    public static void dwProviderSize$set( MemorySegment seg, int x) {
        _COMMCONFIG.dwProviderSize$VH.set(seg, x);
    }
    public static int dwProviderSize$get(MemorySegment seg, long index) {
        return (int)_COMMCONFIG.dwProviderSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProviderSize$set(MemorySegment seg, long index, int x) {
        _COMMCONFIG.dwProviderSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment wcProviderData$slice(MemorySegment seg) {
        return seg.asSlice(48, 2);
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

