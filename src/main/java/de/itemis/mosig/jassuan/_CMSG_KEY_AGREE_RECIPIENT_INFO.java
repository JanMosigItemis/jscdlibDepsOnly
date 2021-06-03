// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CMSG_KEY_AGREE_RECIPIENT_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwVersion"),
        C_LONG.withName("dwOriginatorChoice"),
        MemoryLayout.unionLayout(
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
            ).withName("OriginatorCertId"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    C_POINTER.withName("pszObjId"),
                    MemoryLayout.structLayout(
                        C_LONG.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        C_POINTER.withName("pbData")
                    ).withName("Parameters")
                ).withName("Algorithm"),
                MemoryLayout.structLayout(
                    C_LONG.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    C_POINTER.withName("pbData"),
                    C_LONG.withName("cUnusedBits"),
                    MemoryLayout.paddingLayout(32)
                ).withName("PublicKey")
            ).withName("OriginatorPublicKeyInfo")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("UserKeyingMaterial"),
        MemoryLayout.structLayout(
            C_POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                C_LONG.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                C_POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("KeyEncryptionAlgorithm"),
        C_LONG.withName("cRecipientEncryptedKeys"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("rgpRecipientEncryptedKeys")
    ).withName("_CMSG_KEY_AGREE_RECIPIENT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOriginatorChoice$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwOriginatorChoice"));
    public static VarHandle dwOriginatorChoice$VH() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH;
    }
    public static int dwOriginatorChoice$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH.get(seg);
    }
    public static void dwOriginatorChoice$set( MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH.set(seg, x);
    }
    public static int dwOriginatorChoice$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOriginatorChoice$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OriginatorCertId$slice(MemorySegment seg) {
        return seg.asSlice(8, 40);
    }
    public static MemorySegment OriginatorPublicKeyInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 48);
    }
    public static MemorySegment UserKeyingMaterial$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static MemorySegment KeyEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(72, 24);
    }
    static final VarHandle cRecipientEncryptedKeys$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cRecipientEncryptedKeys"));
    public static VarHandle cRecipientEncryptedKeys$VH() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH;
    }
    public static int cRecipientEncryptedKeys$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH.get(seg);
    }
    public static void cRecipientEncryptedKeys$set( MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH.set(seg, x);
    }
    public static int cRecipientEncryptedKeys$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRecipientEncryptedKeys$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpRecipientEncryptedKeys$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rgpRecipientEncryptedKeys")));
    public static VarHandle rgpRecipientEncryptedKeys$VH() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH;
    }
    public static MemoryAddress rgpRecipientEncryptedKeys$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH.get(seg);
    }
    public static void rgpRecipientEncryptedKeys$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH.set(seg, x);
    }
    public static MemoryAddress rgpRecipientEncryptedKeys$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpRecipientEncryptedKeys$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH.set(seg.asSlice(index*sizeof()), x);
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

