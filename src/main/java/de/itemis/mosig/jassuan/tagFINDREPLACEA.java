// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagFINDREPLACEA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hwndOwner"),
        C_POINTER.withName("hInstance"),
        C_LONG.withName("Flags"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpstrFindWhat"),
        C_POINTER.withName("lpstrReplaceWith"),
        C_SHORT.withName("wFindWhatLen"),
        C_SHORT.withName("wReplaceWithLen"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("lCustData"),
        C_POINTER.withName("lpfnHook"),
        C_POINTER.withName("lpTemplateName")
    ).withName("tagFINDREPLACEA");
    public static MemoryLayout $LAYOUT() {
        return tagFINDREPLACEA.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagFINDREPLACEA.lStructSize$VH;
    }
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagFINDREPLACEA.lStructSize$VH.get(seg);
    }
    public static void lStructSize$set( MemorySegment seg, int x) {
        tagFINDREPLACEA.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagFINDREPLACEA.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagFINDREPLACEA.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndOwner")));
    public static VarHandle hwndOwner$VH() {
        return tagFINDREPLACEA.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEA.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hInstance")));
    public static VarHandle hInstance$VH() {
        return tagFINDREPLACEA.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEA.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagFINDREPLACEA.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)tagFINDREPLACEA.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        tagFINDREPLACEA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagFINDREPLACEA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagFINDREPLACEA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrFindWhat$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrFindWhat")));
    public static VarHandle lpstrFindWhat$VH() {
        return tagFINDREPLACEA.lpstrFindWhat$VH;
    }
    public static MemoryAddress lpstrFindWhat$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.lpstrFindWhat$VH.get(seg);
    }
    public static void lpstrFindWhat$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEA.lpstrFindWhat$VH.set(seg, x);
    }
    public static MemoryAddress lpstrFindWhat$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.lpstrFindWhat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrFindWhat$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEA.lpstrFindWhat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrReplaceWith$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrReplaceWith")));
    public static VarHandle lpstrReplaceWith$VH() {
        return tagFINDREPLACEA.lpstrReplaceWith$VH;
    }
    public static MemoryAddress lpstrReplaceWith$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.lpstrReplaceWith$VH.get(seg);
    }
    public static void lpstrReplaceWith$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEA.lpstrReplaceWith$VH.set(seg, x);
    }
    public static MemoryAddress lpstrReplaceWith$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.lpstrReplaceWith$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrReplaceWith$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEA.lpstrReplaceWith$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wFindWhatLen$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wFindWhatLen"));
    public static VarHandle wFindWhatLen$VH() {
        return tagFINDREPLACEA.wFindWhatLen$VH;
    }
    public static short wFindWhatLen$get(MemorySegment seg) {
        return (short)tagFINDREPLACEA.wFindWhatLen$VH.get(seg);
    }
    public static void wFindWhatLen$set( MemorySegment seg, short x) {
        tagFINDREPLACEA.wFindWhatLen$VH.set(seg, x);
    }
    public static short wFindWhatLen$get(MemorySegment seg, long index) {
        return (short)tagFINDREPLACEA.wFindWhatLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFindWhatLen$set(MemorySegment seg, long index, short x) {
        tagFINDREPLACEA.wFindWhatLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReplaceWithLen$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wReplaceWithLen"));
    public static VarHandle wReplaceWithLen$VH() {
        return tagFINDREPLACEA.wReplaceWithLen$VH;
    }
    public static short wReplaceWithLen$get(MemorySegment seg) {
        return (short)tagFINDREPLACEA.wReplaceWithLen$VH.get(seg);
    }
    public static void wReplaceWithLen$set( MemorySegment seg, short x) {
        tagFINDREPLACEA.wReplaceWithLen$VH.set(seg, x);
    }
    public static short wReplaceWithLen$get(MemorySegment seg, long index) {
        return (short)tagFINDREPLACEA.wReplaceWithLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReplaceWithLen$set(MemorySegment seg, long index, short x) {
        tagFINDREPLACEA.wReplaceWithLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lCustData$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lCustData"));
    public static VarHandle lCustData$VH() {
        return tagFINDREPLACEA.lCustData$VH;
    }
    public static long lCustData$get(MemorySegment seg) {
        return (long)tagFINDREPLACEA.lCustData$VH.get(seg);
    }
    public static void lCustData$set( MemorySegment seg, long x) {
        tagFINDREPLACEA.lCustData$VH.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)tagFINDREPLACEA.lCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        tagFINDREPLACEA.lCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnHook$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpfnHook")));
    public static VarHandle lpfnHook$VH() {
        return tagFINDREPLACEA.lpfnHook$VH;
    }
    public static MemoryAddress lpfnHook$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.lpfnHook$VH.get(seg);
    }
    public static void lpfnHook$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEA.lpfnHook$VH.set(seg, x);
    }
    public static MemoryAddress lpfnHook$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.lpfnHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnHook$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEA.lpfnHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPFRHOOKPROC lpfnHook (MemorySegment segment) {
        return LPFRHOOKPROC.ofAddress(lpfnHook$get(segment));
    }
    static final VarHandle lpTemplateName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpTemplateName")));
    public static VarHandle lpTemplateName$VH() {
        return tagFINDREPLACEA.lpTemplateName$VH;
    }
    public static MemoryAddress lpTemplateName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.lpTemplateName$VH.get(seg);
    }
    public static void lpTemplateName$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEA.lpTemplateName$VH.set(seg, x);
    }
    public static MemoryAddress lpTemplateName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagFINDREPLACEA.lpTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTemplateName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEA.lpTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
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

