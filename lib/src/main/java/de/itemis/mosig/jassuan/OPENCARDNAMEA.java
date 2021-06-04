// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class OPENCARDNAMEA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwStructSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hwndOwner"),
        C_LONG_LONG.withName("hSCardContext"),
        C_POINTER.withName("lpstrGroupNames"),
        C_LONG.withName("nMaxGroupNames"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpstrCardNames"),
        C_LONG.withName("nMaxCardNames"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("rgguidInterfaces"),
        C_LONG.withName("cguidInterfaces"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpstrRdr"),
        C_LONG.withName("nMaxRdr"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpstrCard"),
        C_LONG.withName("nMaxCard"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpstrTitle"),
        C_LONG.withName("dwFlags"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pvUserData"),
        C_LONG.withName("dwShareMode"),
        C_LONG.withName("dwPreferredProtocols"),
        C_LONG.withName("dwActiveProtocol"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpfnConnect"),
        C_POINTER.withName("lpfnCheck"),
        C_POINTER.withName("lpfnDisconnect"),
        C_LONG_LONG.withName("hCardHandle")
    );
    public static MemoryLayout $LAYOUT() {
        return OPENCARDNAMEA.$struct$LAYOUT;
    }
    static final VarHandle dwStructSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwStructSize"));
    public static VarHandle dwStructSize$VH() {
        return OPENCARDNAMEA.dwStructSize$VH;
    }
    public static int dwStructSize$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.dwStructSize$VH.get(seg);
    }
    public static void dwStructSize$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.dwStructSize$VH.set(seg, x);
    }
    public static int dwStructSize$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.dwStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStructSize$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.dwStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndOwner")));
    public static VarHandle hwndOwner$VH() {
        return OPENCARDNAMEA.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hSCardContext$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hSCardContext"));
    public static VarHandle hSCardContext$VH() {
        return OPENCARDNAMEA.hSCardContext$VH;
    }
    public static long hSCardContext$get(MemorySegment seg) {
        return (long)OPENCARDNAMEA.hSCardContext$VH.get(seg);
    }
    public static void hSCardContext$set( MemorySegment seg, long x) {
        OPENCARDNAMEA.hSCardContext$VH.set(seg, x);
    }
    public static long hSCardContext$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAMEA.hSCardContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hSCardContext$set(MemorySegment seg, long index, long x) {
        OPENCARDNAMEA.hSCardContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrGroupNames$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrGroupNames")));
    public static VarHandle lpstrGroupNames$VH() {
        return OPENCARDNAMEA.lpstrGroupNames$VH;
    }
    public static MemoryAddress lpstrGroupNames$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrGroupNames$VH.get(seg);
    }
    public static void lpstrGroupNames$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.lpstrGroupNames$VH.set(seg, x);
    }
    public static MemoryAddress lpstrGroupNames$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrGroupNames$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.lpstrGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxGroupNames$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxGroupNames"));
    public static VarHandle nMaxGroupNames$VH() {
        return OPENCARDNAMEA.nMaxGroupNames$VH;
    }
    public static int nMaxGroupNames$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.nMaxGroupNames$VH.get(seg);
    }
    public static void nMaxGroupNames$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.nMaxGroupNames$VH.set(seg, x);
    }
    public static int nMaxGroupNames$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.nMaxGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxGroupNames$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.nMaxGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCardNames$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrCardNames")));
    public static VarHandle lpstrCardNames$VH() {
        return OPENCARDNAMEA.lpstrCardNames$VH;
    }
    public static MemoryAddress lpstrCardNames$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrCardNames$VH.get(seg);
    }
    public static void lpstrCardNames$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.lpstrCardNames$VH.set(seg, x);
    }
    public static MemoryAddress lpstrCardNames$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCardNames$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.lpstrCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCardNames$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxCardNames"));
    public static VarHandle nMaxCardNames$VH() {
        return OPENCARDNAMEA.nMaxCardNames$VH;
    }
    public static int nMaxCardNames$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.nMaxCardNames$VH.get(seg);
    }
    public static void nMaxCardNames$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.nMaxCardNames$VH.set(seg, x);
    }
    public static int nMaxCardNames$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.nMaxCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCardNames$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.nMaxCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgguidInterfaces$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rgguidInterfaces")));
    public static VarHandle rgguidInterfaces$VH() {
        return OPENCARDNAMEA.rgguidInterfaces$VH;
    }
    public static MemoryAddress rgguidInterfaces$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.rgguidInterfaces$VH.get(seg);
    }
    public static void rgguidInterfaces$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.rgguidInterfaces$VH.set(seg, x);
    }
    public static MemoryAddress rgguidInterfaces$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.rgguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgguidInterfaces$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.rgguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cguidInterfaces$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cguidInterfaces"));
    public static VarHandle cguidInterfaces$VH() {
        return OPENCARDNAMEA.cguidInterfaces$VH;
    }
    public static int cguidInterfaces$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.cguidInterfaces$VH.get(seg);
    }
    public static void cguidInterfaces$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.cguidInterfaces$VH.set(seg, x);
    }
    public static int cguidInterfaces$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.cguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cguidInterfaces$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.cguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrRdr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrRdr")));
    public static VarHandle lpstrRdr$VH() {
        return OPENCARDNAMEA.lpstrRdr$VH;
    }
    public static MemoryAddress lpstrRdr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrRdr$VH.get(seg);
    }
    public static void lpstrRdr$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.lpstrRdr$VH.set(seg, x);
    }
    public static MemoryAddress lpstrRdr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrRdr$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.lpstrRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxRdr$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxRdr"));
    public static VarHandle nMaxRdr$VH() {
        return OPENCARDNAMEA.nMaxRdr$VH;
    }
    public static int nMaxRdr$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.nMaxRdr$VH.get(seg);
    }
    public static void nMaxRdr$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.nMaxRdr$VH.set(seg, x);
    }
    public static int nMaxRdr$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.nMaxRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxRdr$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.nMaxRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCard$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrCard")));
    public static VarHandle lpstrCard$VH() {
        return OPENCARDNAMEA.lpstrCard$VH;
    }
    public static MemoryAddress lpstrCard$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrCard$VH.get(seg);
    }
    public static void lpstrCard$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.lpstrCard$VH.set(seg, x);
    }
    public static MemoryAddress lpstrCard$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCard$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.lpstrCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCard$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxCard"));
    public static VarHandle nMaxCard$VH() {
        return OPENCARDNAMEA.nMaxCard$VH;
    }
    public static int nMaxCard$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.nMaxCard$VH.get(seg);
    }
    public static void nMaxCard$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.nMaxCard$VH.set(seg, x);
    }
    public static int nMaxCard$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.nMaxCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCard$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.nMaxCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrTitle$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrTitle")));
    public static VarHandle lpstrTitle$VH() {
        return OPENCARDNAMEA.lpstrTitle$VH;
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrTitle$VH.get(seg);
    }
    public static void lpstrTitle$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.lpstrTitle$VH.set(seg, x);
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpstrTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.lpstrTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return OPENCARDNAMEA.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvUserData$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvUserData")));
    public static VarHandle pvUserData$VH() {
        return OPENCARDNAMEA.pvUserData$VH;
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.pvUserData$VH.get(seg);
    }
    public static void pvUserData$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.pvUserData$VH.set(seg, x);
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.pvUserData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUserData$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.pvUserData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwShareMode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwShareMode"));
    public static VarHandle dwShareMode$VH() {
        return OPENCARDNAMEA.dwShareMode$VH;
    }
    public static int dwShareMode$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.dwShareMode$VH.get(seg);
    }
    public static void dwShareMode$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.dwShareMode$VH.set(seg, x);
    }
    public static int dwShareMode$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.dwShareMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwShareMode$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.dwShareMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPreferredProtocols$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwPreferredProtocols"));
    public static VarHandle dwPreferredProtocols$VH() {
        return OPENCARDNAMEA.dwPreferredProtocols$VH;
    }
    public static int dwPreferredProtocols$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.dwPreferredProtocols$VH.get(seg);
    }
    public static void dwPreferredProtocols$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.dwPreferredProtocols$VH.set(seg, x);
    }
    public static int dwPreferredProtocols$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.dwPreferredProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPreferredProtocols$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.dwPreferredProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwActiveProtocol$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwActiveProtocol"));
    public static VarHandle dwActiveProtocol$VH() {
        return OPENCARDNAMEA.dwActiveProtocol$VH;
    }
    public static int dwActiveProtocol$get(MemorySegment seg) {
        return (int)OPENCARDNAMEA.dwActiveProtocol$VH.get(seg);
    }
    public static void dwActiveProtocol$set( MemorySegment seg, int x) {
        OPENCARDNAMEA.dwActiveProtocol$VH.set(seg, x);
    }
    public static int dwActiveProtocol$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAMEA.dwActiveProtocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwActiveProtocol$set(MemorySegment seg, long index, int x) {
        OPENCARDNAMEA.dwActiveProtocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnConnect$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpfnConnect")));
    public static VarHandle lpfnConnect$VH() {
        return OPENCARDNAMEA.lpfnConnect$VH;
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpfnConnect$VH.get(seg);
    }
    public static void lpfnConnect$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.lpfnConnect$VH.set(seg, x);
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpfnConnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnConnect$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.lpfnConnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCONNPROCA lpfnConnect (MemorySegment segment) {
        return LPOCNCONNPROCA.ofAddress(lpfnConnect$get(segment));
    }
    static final VarHandle lpfnCheck$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpfnCheck")));
    public static VarHandle lpfnCheck$VH() {
        return OPENCARDNAMEA.lpfnCheck$VH;
    }
    public static MemoryAddress lpfnCheck$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpfnCheck$VH.get(seg);
    }
    public static void lpfnCheck$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.lpfnCheck$VH.set(seg, x);
    }
    public static MemoryAddress lpfnCheck$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpfnCheck$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnCheck$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.lpfnCheck$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCHKPROC lpfnCheck (MemorySegment segment) {
        return LPOCNCHKPROC.ofAddress(lpfnCheck$get(segment));
    }
    static final VarHandle lpfnDisconnect$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpfnDisconnect")));
    public static VarHandle lpfnDisconnect$VH() {
        return OPENCARDNAMEA.lpfnDisconnect$VH;
    }
    public static MemoryAddress lpfnDisconnect$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpfnDisconnect$VH.get(seg);
    }
    public static void lpfnDisconnect$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAMEA.lpfnDisconnect$VH.set(seg, x);
    }
    public static MemoryAddress lpfnDisconnect$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAMEA.lpfnDisconnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnDisconnect$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAMEA.lpfnDisconnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNDSCPROC lpfnDisconnect (MemorySegment segment) {
        return LPOCNDSCPROC.ofAddress(lpfnDisconnect$get(segment));
    }
    static final VarHandle hCardHandle$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hCardHandle"));
    public static VarHandle hCardHandle$VH() {
        return OPENCARDNAMEA.hCardHandle$VH;
    }
    public static long hCardHandle$get(MemorySegment seg) {
        return (long)OPENCARDNAMEA.hCardHandle$VH.get(seg);
    }
    public static void hCardHandle$set( MemorySegment seg, long x) {
        OPENCARDNAMEA.hCardHandle$VH.set(seg, x);
    }
    public static long hCardHandle$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAMEA.hCardHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCardHandle$set(MemorySegment seg, long index, long x) {
        OPENCARDNAMEA.hCardHandle$VH.set(seg.asSlice(index*sizeof()), x);
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

