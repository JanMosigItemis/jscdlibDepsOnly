// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PROPSHEETHEADERA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwSize"),
        C_LONG.withName("dwFlags"),
        C_POINTER.withName("hwndParent"),
        C_POINTER.withName("hInstance"),
        MemoryLayout.unionLayout(
            C_POINTER.withName("hIcon"),
            C_POINTER.withName("pszIcon")
        ).withName("$anon$0"),
        C_POINTER.withName("pszCaption"),
        C_INT.withName("nPages"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            C_INT.withName("nStartPage"),
            C_POINTER.withName("pStartPage")
        ).withName("$anon$1"),
        MemoryLayout.unionLayout(
            C_POINTER.withName("ppsp"),
            C_POINTER.withName("phpage")
        ).withName("$anon$2"),
        C_POINTER.withName("pfnCallback"),
        MemoryLayout.unionLayout(
            C_POINTER.withName("hbmWatermark"),
            C_POINTER.withName("pszbmWatermark")
        ).withName("$anon$3"),
        C_POINTER.withName("hplWatermark"),
        MemoryLayout.unionLayout(
            C_POINTER.withName("hbmHeader"),
            C_POINTER.withName("pszbmHeader")
        ).withName("$anon$4")
    ).withName("_PROPSHEETHEADERA");
    public static MemoryLayout $LAYOUT() {
        return _PROPSHEETHEADERA.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _PROPSHEETHEADERA.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)_PROPSHEETHEADERA.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        _PROPSHEETHEADERA.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_PROPSHEETHEADERA.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _PROPSHEETHEADERA.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _PROPSHEETHEADERA.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_PROPSHEETHEADERA.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _PROPSHEETHEADERA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_PROPSHEETHEADERA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _PROPSHEETHEADERA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndParent$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndParent")));
    public static VarHandle hwndParent$VH() {
        return _PROPSHEETHEADERA.hwndParent$VH;
    }
    public static MemoryAddress hwndParent$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hwndParent$VH.get(seg);
    }
    public static void hwndParent$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.hwndParent$VH.set(seg, x);
    }
    public static MemoryAddress hwndParent$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hwndParent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndParent$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.hwndParent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hInstance")));
    public static VarHandle hInstance$VH() {
        return _PROPSHEETHEADERA.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hIcon")));
    public static VarHandle hIcon$VH() {
        return _PROPSHEETHEADERA.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszIcon$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pszIcon")));
    public static VarHandle pszIcon$VH() {
        return _PROPSHEETHEADERA.pszIcon$VH;
    }
    public static MemoryAddress pszIcon$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pszIcon$VH.get(seg);
    }
    public static void pszIcon$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.pszIcon$VH.set(seg, x);
    }
    public static MemoryAddress pszIcon$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pszIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.pszIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszCaption$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszCaption")));
    public static VarHandle pszCaption$VH() {
        return _PROPSHEETHEADERA.pszCaption$VH;
    }
    public static MemoryAddress pszCaption$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pszCaption$VH.get(seg);
    }
    public static void pszCaption$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.pszCaption$VH.set(seg, x);
    }
    public static MemoryAddress pszCaption$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pszCaption$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszCaption$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.pszCaption$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nPages$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nPages"));
    public static VarHandle nPages$VH() {
        return _PROPSHEETHEADERA.nPages$VH;
    }
    public static int nPages$get(MemorySegment seg) {
        return (int)_PROPSHEETHEADERA.nPages$VH.get(seg);
    }
    public static void nPages$set( MemorySegment seg, int x) {
        _PROPSHEETHEADERA.nPages$VH.set(seg, x);
    }
    public static int nPages$get(MemorySegment seg, long index) {
        return (int)_PROPSHEETHEADERA.nPages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPages$set(MemorySegment seg, long index, int x) {
        _PROPSHEETHEADERA.nPages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nStartPage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("nStartPage"));
    public static VarHandle nStartPage$VH() {
        return _PROPSHEETHEADERA.nStartPage$VH;
    }
    public static int nStartPage$get(MemorySegment seg) {
        return (int)_PROPSHEETHEADERA.nStartPage$VH.get(seg);
    }
    public static void nStartPage$set( MemorySegment seg, int x) {
        _PROPSHEETHEADERA.nStartPage$VH.set(seg, x);
    }
    public static int nStartPage$get(MemorySegment seg, long index) {
        return (int)_PROPSHEETHEADERA.nStartPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nStartPage$set(MemorySegment seg, long index, int x) {
        _PROPSHEETHEADERA.nStartPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pStartPage$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("pStartPage")));
    public static VarHandle pStartPage$VH() {
        return _PROPSHEETHEADERA.pStartPage$VH;
    }
    public static MemoryAddress pStartPage$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pStartPage$VH.get(seg);
    }
    public static void pStartPage$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.pStartPage$VH.set(seg, x);
    }
    public static MemoryAddress pStartPage$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pStartPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pStartPage$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.pStartPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ppsp$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("ppsp")));
    public static VarHandle ppsp$VH() {
        return _PROPSHEETHEADERA.ppsp$VH;
    }
    public static MemoryAddress ppsp$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.ppsp$VH.get(seg);
    }
    public static void ppsp$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.ppsp$VH.set(seg, x);
    }
    public static MemoryAddress ppsp$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.ppsp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ppsp$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.ppsp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle phpage$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("phpage")));
    public static VarHandle phpage$VH() {
        return _PROPSHEETHEADERA.phpage$VH;
    }
    public static MemoryAddress phpage$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.phpage$VH.get(seg);
    }
    public static void phpage$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.phpage$VH.set(seg, x);
    }
    public static MemoryAddress phpage$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.phpage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void phpage$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.phpage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnCallback$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnCallback")));
    public static VarHandle pfnCallback$VH() {
        return _PROPSHEETHEADERA.pfnCallback$VH;
    }
    public static MemoryAddress pfnCallback$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pfnCallback$VH.get(seg);
    }
    public static void pfnCallback$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.pfnCallback$VH.set(seg, x);
    }
    public static MemoryAddress pfnCallback$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pfnCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.pfnCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFNPROPSHEETCALLBACK pfnCallback (MemorySegment segment) {
        return PFNPROPSHEETCALLBACK.ofAddress(pfnCallback$get(segment));
    }
    static final VarHandle hbmWatermark$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$3"), MemoryLayout.PathElement.groupElement("hbmWatermark")));
    public static VarHandle hbmWatermark$VH() {
        return _PROPSHEETHEADERA.hbmWatermark$VH;
    }
    public static MemoryAddress hbmWatermark$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hbmWatermark$VH.get(seg);
    }
    public static void hbmWatermark$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.hbmWatermark$VH.set(seg, x);
    }
    public static MemoryAddress hbmWatermark$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hbmWatermark$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmWatermark$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.hbmWatermark$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszbmWatermark$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$3"), MemoryLayout.PathElement.groupElement("pszbmWatermark")));
    public static VarHandle pszbmWatermark$VH() {
        return _PROPSHEETHEADERA.pszbmWatermark$VH;
    }
    public static MemoryAddress pszbmWatermark$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pszbmWatermark$VH.get(seg);
    }
    public static void pszbmWatermark$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.pszbmWatermark$VH.set(seg, x);
    }
    public static MemoryAddress pszbmWatermark$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pszbmWatermark$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszbmWatermark$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.pszbmWatermark$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hplWatermark$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hplWatermark")));
    public static VarHandle hplWatermark$VH() {
        return _PROPSHEETHEADERA.hplWatermark$VH;
    }
    public static MemoryAddress hplWatermark$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hplWatermark$VH.get(seg);
    }
    public static void hplWatermark$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.hplWatermark$VH.set(seg, x);
    }
    public static MemoryAddress hplWatermark$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hplWatermark$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hplWatermark$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.hplWatermark$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmHeader$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$4"), MemoryLayout.PathElement.groupElement("hbmHeader")));
    public static VarHandle hbmHeader$VH() {
        return _PROPSHEETHEADERA.hbmHeader$VH;
    }
    public static MemoryAddress hbmHeader$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hbmHeader$VH.get(seg);
    }
    public static void hbmHeader$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.hbmHeader$VH.set(seg, x);
    }
    public static MemoryAddress hbmHeader$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.hbmHeader$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmHeader$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.hbmHeader$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszbmHeader$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$4"), MemoryLayout.PathElement.groupElement("pszbmHeader")));
    public static VarHandle pszbmHeader$VH() {
        return _PROPSHEETHEADERA.pszbmHeader$VH;
    }
    public static MemoryAddress pszbmHeader$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pszbmHeader$VH.get(seg);
    }
    public static void pszbmHeader$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETHEADERA.pszbmHeader$VH.set(seg, x);
    }
    public static MemoryAddress pszbmHeader$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROPSHEETHEADERA.pszbmHeader$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszbmHeader$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETHEADERA.pszbmHeader$VH.set(seg.asSlice(index*sizeof()), x);
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

