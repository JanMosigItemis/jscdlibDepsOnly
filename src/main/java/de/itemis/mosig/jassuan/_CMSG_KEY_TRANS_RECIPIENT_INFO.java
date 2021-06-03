// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CMSG_KEY_TRANS_RECIPIENT_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwVersion"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            C_LONG.withName("dwIdChoice"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        C_LONG.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        C_POINTER.withName("pbData")
                    ).withName("Issuer"),
                    MemoryLayout.structLayout(
                        C_LONG.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        C_POINTER.withName("pbData")
                    ).withName("SerialNumber")
                ).withName("IssuerSerialNumber"),
                MemoryLayout.structLayout(
                    C_LONG.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    C_POINTER.withName("pbData")
                ).withName("KeyId"),
                MemoryLayout.structLayout(
                    C_LONG.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    C_POINTER.withName("pbData")
                ).withName("HashId")
            ).withName("$anon$0")
        ).withName("RecipientId"),
        MemoryLayout.structLayout(
            C_POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                C_LONG.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                C_POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("KeyEncryptionAlgorithm"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("EncryptedKey")
    ).withName("_CMSG_KEY_TRANS_RECIPIENT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_KEY_TRANS_RECIPIENT_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _CMSG_KEY_TRANS_RECIPIENT_INFO.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_CMSG_KEY_TRANS_RECIPIENT_INFO.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _CMSG_KEY_TRANS_RECIPIENT_INFO.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_TRANS_RECIPIENT_INFO.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_TRANS_RECIPIENT_INFO.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RecipientId$slice(MemorySegment seg) {
        return seg.asSlice(8, 40);
    }
    public static MemorySegment KeyEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(48, 24);
    }
    public static MemorySegment EncryptedKey$slice(MemorySegment seg) {
        return seg.asSlice(72, 16);
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

