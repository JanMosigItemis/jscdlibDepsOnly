// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class threadlocaleinfostruct {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("refcount"),
        C_INT.withName("lc_codepage"),
        C_INT.withName("lc_collate_cp"),
        MemoryLayout.sequenceLayout(6, C_LONG).withName("lc_handle"),
        MemoryLayout.sequenceLayout(6, MemoryLayout.structLayout(
            C_SHORT.withName("wLanguage"),
            C_SHORT.withName("wCountry"),
            C_SHORT.withName("wCodePage")
        ).withName("tagLC_ID")).withName("lc_id"),
        MemoryLayout.sequenceLayout(6, MemoryLayout.structLayout(
            C_POINTER.withName("locale"),
            C_POINTER.withName("wlocale"),
            C_POINTER.withName("refcount"),
            C_POINTER.withName("wrefcount")
        )).withName("lc_category"),
        C_INT.withName("lc_clike"),
        C_INT.withName("mb_cur_max"),
        C_POINTER.withName("lconv_intl_refcount"),
        C_POINTER.withName("lconv_num_refcount"),
        C_POINTER.withName("lconv_mon_refcount"),
        C_POINTER.withName("lconv"),
        C_POINTER.withName("ctype1_refcount"),
        C_POINTER.withName("ctype1"),
        C_POINTER.withName("pctype"),
        C_POINTER.withName("pclmap"),
        C_POINTER.withName("pcumap"),
        C_POINTER.withName("lc_time_curr")
    ).withName("threadlocaleinfostruct");
    public static MemoryLayout $LAYOUT() {
        return threadlocaleinfostruct.$struct$LAYOUT;
    }
    static final VarHandle refcount$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("refcount"));
    public static VarHandle refcount$VH() {
        return threadlocaleinfostruct.refcount$VH;
    }
    public static int refcount$get(MemorySegment seg) {
        return (int)threadlocaleinfostruct.refcount$VH.get(seg);
    }
    public static void refcount$set( MemorySegment seg, int x) {
        threadlocaleinfostruct.refcount$VH.set(seg, x);
    }
    public static int refcount$get(MemorySegment seg, long index) {
        return (int)threadlocaleinfostruct.refcount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void refcount$set(MemorySegment seg, long index, int x) {
        threadlocaleinfostruct.refcount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lc_codepage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("lc_codepage"));
    public static VarHandle lc_codepage$VH() {
        return threadlocaleinfostruct.lc_codepage$VH;
    }
    public static int lc_codepage$get(MemorySegment seg) {
        return (int)threadlocaleinfostruct.lc_codepage$VH.get(seg);
    }
    public static void lc_codepage$set( MemorySegment seg, int x) {
        threadlocaleinfostruct.lc_codepage$VH.set(seg, x);
    }
    public static int lc_codepage$get(MemorySegment seg, long index) {
        return (int)threadlocaleinfostruct.lc_codepage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lc_codepage$set(MemorySegment seg, long index, int x) {
        threadlocaleinfostruct.lc_codepage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lc_collate_cp$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("lc_collate_cp"));
    public static VarHandle lc_collate_cp$VH() {
        return threadlocaleinfostruct.lc_collate_cp$VH;
    }
    public static int lc_collate_cp$get(MemorySegment seg) {
        return (int)threadlocaleinfostruct.lc_collate_cp$VH.get(seg);
    }
    public static void lc_collate_cp$set( MemorySegment seg, int x) {
        threadlocaleinfostruct.lc_collate_cp$VH.set(seg, x);
    }
    public static int lc_collate_cp$get(MemorySegment seg, long index) {
        return (int)threadlocaleinfostruct.lc_collate_cp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lc_collate_cp$set(MemorySegment seg, long index, int x) {
        threadlocaleinfostruct.lc_collate_cp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lc_handle$slice(MemorySegment seg) {
        return seg.asSlice(12, 24);
    }
    public static MemorySegment lc_id$slice(MemorySegment seg) {
        return seg.asSlice(36, 36);
    }
    public static MemorySegment lc_category$slice(MemorySegment seg) {
        return seg.asSlice(72, 192);
    }
    static final VarHandle lc_clike$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("lc_clike"));
    public static VarHandle lc_clike$VH() {
        return threadlocaleinfostruct.lc_clike$VH;
    }
    public static int lc_clike$get(MemorySegment seg) {
        return (int)threadlocaleinfostruct.lc_clike$VH.get(seg);
    }
    public static void lc_clike$set( MemorySegment seg, int x) {
        threadlocaleinfostruct.lc_clike$VH.set(seg, x);
    }
    public static int lc_clike$get(MemorySegment seg, long index) {
        return (int)threadlocaleinfostruct.lc_clike$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lc_clike$set(MemorySegment seg, long index, int x) {
        threadlocaleinfostruct.lc_clike$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mb_cur_max$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("mb_cur_max"));
    public static VarHandle mb_cur_max$VH() {
        return threadlocaleinfostruct.mb_cur_max$VH;
    }
    public static int mb_cur_max$get(MemorySegment seg) {
        return (int)threadlocaleinfostruct.mb_cur_max$VH.get(seg);
    }
    public static void mb_cur_max$set( MemorySegment seg, int x) {
        threadlocaleinfostruct.mb_cur_max$VH.set(seg, x);
    }
    public static int mb_cur_max$get(MemorySegment seg, long index) {
        return (int)threadlocaleinfostruct.mb_cur_max$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mb_cur_max$set(MemorySegment seg, long index, int x) {
        threadlocaleinfostruct.mb_cur_max$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lconv_intl_refcount$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lconv_intl_refcount")));
    public static VarHandle lconv_intl_refcount$VH() {
        return threadlocaleinfostruct.lconv_intl_refcount$VH;
    }
    public static MemoryAddress lconv_intl_refcount$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lconv_intl_refcount$VH.get(seg);
    }
    public static void lconv_intl_refcount$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.lconv_intl_refcount$VH.set(seg, x);
    }
    public static MemoryAddress lconv_intl_refcount$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lconv_intl_refcount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lconv_intl_refcount$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.lconv_intl_refcount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lconv_num_refcount$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lconv_num_refcount")));
    public static VarHandle lconv_num_refcount$VH() {
        return threadlocaleinfostruct.lconv_num_refcount$VH;
    }
    public static MemoryAddress lconv_num_refcount$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lconv_num_refcount$VH.get(seg);
    }
    public static void lconv_num_refcount$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.lconv_num_refcount$VH.set(seg, x);
    }
    public static MemoryAddress lconv_num_refcount$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lconv_num_refcount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lconv_num_refcount$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.lconv_num_refcount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lconv_mon_refcount$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lconv_mon_refcount")));
    public static VarHandle lconv_mon_refcount$VH() {
        return threadlocaleinfostruct.lconv_mon_refcount$VH;
    }
    public static MemoryAddress lconv_mon_refcount$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lconv_mon_refcount$VH.get(seg);
    }
    public static void lconv_mon_refcount$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.lconv_mon_refcount$VH.set(seg, x);
    }
    public static MemoryAddress lconv_mon_refcount$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lconv_mon_refcount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lconv_mon_refcount$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.lconv_mon_refcount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lconv$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lconv")));
    public static VarHandle lconv$VH() {
        return threadlocaleinfostruct.lconv$VH;
    }
    public static MemoryAddress lconv$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lconv$VH.get(seg);
    }
    public static void lconv$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.lconv$VH.set(seg, x);
    }
    public static MemoryAddress lconv$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lconv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lconv$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.lconv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ctype1_refcount$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ctype1_refcount")));
    public static VarHandle ctype1_refcount$VH() {
        return threadlocaleinfostruct.ctype1_refcount$VH;
    }
    public static MemoryAddress ctype1_refcount$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.ctype1_refcount$VH.get(seg);
    }
    public static void ctype1_refcount$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.ctype1_refcount$VH.set(seg, x);
    }
    public static MemoryAddress ctype1_refcount$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.ctype1_refcount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ctype1_refcount$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.ctype1_refcount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ctype1$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ctype1")));
    public static VarHandle ctype1$VH() {
        return threadlocaleinfostruct.ctype1$VH;
    }
    public static MemoryAddress ctype1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.ctype1$VH.get(seg);
    }
    public static void ctype1$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.ctype1$VH.set(seg, x);
    }
    public static MemoryAddress ctype1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.ctype1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ctype1$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.ctype1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pctype$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pctype")));
    public static VarHandle pctype$VH() {
        return threadlocaleinfostruct.pctype$VH;
    }
    public static MemoryAddress pctype$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.pctype$VH.get(seg);
    }
    public static void pctype$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.pctype$VH.set(seg, x);
    }
    public static MemoryAddress pctype$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.pctype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pctype$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.pctype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pclmap$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pclmap")));
    public static VarHandle pclmap$VH() {
        return threadlocaleinfostruct.pclmap$VH;
    }
    public static MemoryAddress pclmap$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.pclmap$VH.get(seg);
    }
    public static void pclmap$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.pclmap$VH.set(seg, x);
    }
    public static MemoryAddress pclmap$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.pclmap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pclmap$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.pclmap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pcumap$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pcumap")));
    public static VarHandle pcumap$VH() {
        return threadlocaleinfostruct.pcumap$VH;
    }
    public static MemoryAddress pcumap$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.pcumap$VH.get(seg);
    }
    public static void pcumap$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.pcumap$VH.set(seg, x);
    }
    public static MemoryAddress pcumap$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.pcumap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pcumap$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.pcumap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lc_time_curr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lc_time_curr")));
    public static VarHandle lc_time_curr$VH() {
        return threadlocaleinfostruct.lc_time_curr$VH;
    }
    public static MemoryAddress lc_time_curr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lc_time_curr$VH.get(seg);
    }
    public static void lc_time_curr$set( MemorySegment seg, MemoryAddress x) {
        threadlocaleinfostruct.lc_time_curr$VH.set(seg, x);
    }
    public static MemoryAddress lc_time_curr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)threadlocaleinfostruct.lc_time_curr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lc_time_curr$set(MemorySegment seg, long index, MemoryAddress x) {
        threadlocaleinfostruct.lc_time_curr$VH.set(seg.asSlice(index*sizeof()), x);
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

