// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagRPC_CALL_ATTRIBUTES_V2W {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("Version"),
        C_LONG.withName("Flags"),
        C_LONG.withName("ServerPrincipalNameBufferLength"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("ServerPrincipalName"),
        C_LONG.withName("ClientPrincipalNameBufferLength"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("ClientPrincipalName"),
        C_LONG.withName("AuthenticationLevel"),
        C_LONG.withName("AuthenticationService"),
        C_INT.withName("NullSession"),
        C_INT.withName("KernelMode"),
        C_LONG.withName("ProtocolSequence"),
        C_INT.withName("IsClientLocal"),
        C_POINTER.withName("ClientPID"),
        C_LONG.withName("CallStatus"),
        C_INT.withName("CallType"),
        C_POINTER.withName("CallLocalAddress"),
        C_SHORT.withName("OpNum"),
        MemoryLayout.paddingLayout(16),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("InterfaceUuid"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagRPC_CALL_ATTRIBUTES_V2W");
    public static MemoryLayout $LAYOUT() {
        return tagRPC_CALL_ATTRIBUTES_V2W.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerPrincipalNameBufferLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ServerPrincipalNameBufferLength"));
    public static VarHandle ServerPrincipalNameBufferLength$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalNameBufferLength$VH;
    }
    public static int ServerPrincipalNameBufferLength$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalNameBufferLength$VH.get(seg);
    }
    public static void ServerPrincipalNameBufferLength$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalNameBufferLength$VH.set(seg, x);
    }
    public static int ServerPrincipalNameBufferLength$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalNameBufferLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerPrincipalNameBufferLength$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalNameBufferLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerPrincipalName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ServerPrincipalName")));
    public static VarHandle ServerPrincipalName$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalName$VH;
    }
    public static MemoryAddress ServerPrincipalName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalName$VH.get(seg);
    }
    public static void ServerPrincipalName$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalName$VH.set(seg, x);
    }
    public static MemoryAddress ServerPrincipalName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerPrincipalName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ServerPrincipalName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClientPrincipalNameBufferLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ClientPrincipalNameBufferLength"));
    public static VarHandle ClientPrincipalNameBufferLength$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalNameBufferLength$VH;
    }
    public static int ClientPrincipalNameBufferLength$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalNameBufferLength$VH.get(seg);
    }
    public static void ClientPrincipalNameBufferLength$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalNameBufferLength$VH.set(seg, x);
    }
    public static int ClientPrincipalNameBufferLength$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalNameBufferLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientPrincipalNameBufferLength$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalNameBufferLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClientPrincipalName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ClientPrincipalName")));
    public static VarHandle ClientPrincipalName$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalName$VH;
    }
    public static MemoryAddress ClientPrincipalName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalName$VH.get(seg);
    }
    public static void ClientPrincipalName$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalName$VH.set(seg, x);
    }
    public static MemoryAddress ClientPrincipalName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientPrincipalName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ClientPrincipalName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthenticationLevel$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("AuthenticationLevel"));
    public static VarHandle AuthenticationLevel$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationLevel$VH;
    }
    public static int AuthenticationLevel$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationLevel$VH.get(seg);
    }
    public static void AuthenticationLevel$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationLevel$VH.set(seg, x);
    }
    public static int AuthenticationLevel$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthenticationLevel$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthenticationService$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("AuthenticationService"));
    public static VarHandle AuthenticationService$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationService$VH;
    }
    public static int AuthenticationService$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationService$VH.get(seg);
    }
    public static void AuthenticationService$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationService$VH.set(seg, x);
    }
    public static int AuthenticationService$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationService$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthenticationService$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.AuthenticationService$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NullSession$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NullSession"));
    public static VarHandle NullSession$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.NullSession$VH;
    }
    public static int NullSession$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.NullSession$VH.get(seg);
    }
    public static void NullSession$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.NullSession$VH.set(seg, x);
    }
    public static int NullSession$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.NullSession$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NullSession$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.NullSession$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle KernelMode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("KernelMode"));
    public static VarHandle KernelMode$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.KernelMode$VH;
    }
    public static int KernelMode$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.KernelMode$VH.get(seg);
    }
    public static void KernelMode$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.KernelMode$VH.set(seg, x);
    }
    public static int KernelMode$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.KernelMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void KernelMode$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.KernelMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtocolSequence$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ProtocolSequence"));
    public static VarHandle ProtocolSequence$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.ProtocolSequence$VH;
    }
    public static int ProtocolSequence$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.ProtocolSequence$VH.get(seg);
    }
    public static void ProtocolSequence$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ProtocolSequence$VH.set(seg, x);
    }
    public static int ProtocolSequence$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.ProtocolSequence$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolSequence$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ProtocolSequence$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IsClientLocal$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("IsClientLocal"));
    public static VarHandle IsClientLocal$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.IsClientLocal$VH;
    }
    public static int IsClientLocal$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.IsClientLocal$VH.get(seg);
    }
    public static void IsClientLocal$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.IsClientLocal$VH.set(seg, x);
    }
    public static int IsClientLocal$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.IsClientLocal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsClientLocal$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.IsClientLocal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClientPID$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ClientPID")));
    public static VarHandle ClientPID$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.ClientPID$VH;
    }
    public static MemoryAddress ClientPID$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V2W.ClientPID$VH.get(seg);
    }
    public static void ClientPID$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ClientPID$VH.set(seg, x);
    }
    public static MemoryAddress ClientPID$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V2W.ClientPID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientPID$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V2W.ClientPID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CallStatus$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("CallStatus"));
    public static VarHandle CallStatus$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.CallStatus$VH;
    }
    public static int CallStatus$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.CallStatus$VH.get(seg);
    }
    public static void CallStatus$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.CallStatus$VH.set(seg, x);
    }
    public static int CallStatus$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.CallStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CallStatus$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.CallStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CallType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("CallType"));
    public static VarHandle CallType$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.CallType$VH;
    }
    public static int CallType$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.CallType$VH.get(seg);
    }
    public static void CallType$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.CallType$VH.set(seg, x);
    }
    public static int CallType$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V2W.CallType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CallType$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V2W.CallType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CallLocalAddress$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("CallLocalAddress")));
    public static VarHandle CallLocalAddress$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.CallLocalAddress$VH;
    }
    public static MemoryAddress CallLocalAddress$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V2W.CallLocalAddress$VH.get(seg);
    }
    public static void CallLocalAddress$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V2W.CallLocalAddress$VH.set(seg, x);
    }
    public static MemoryAddress CallLocalAddress$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V2W.CallLocalAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CallLocalAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V2W.CallLocalAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OpNum$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("OpNum"));
    public static VarHandle OpNum$VH() {
        return tagRPC_CALL_ATTRIBUTES_V2W.OpNum$VH;
    }
    public static short OpNum$get(MemorySegment seg) {
        return (short)tagRPC_CALL_ATTRIBUTES_V2W.OpNum$VH.get(seg);
    }
    public static void OpNum$set( MemorySegment seg, short x) {
        tagRPC_CALL_ATTRIBUTES_V2W.OpNum$VH.set(seg, x);
    }
    public static short OpNum$get(MemorySegment seg, long index) {
        return (short)tagRPC_CALL_ATTRIBUTES_V2W.OpNum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OpNum$set(MemorySegment seg, long index, short x) {
        tagRPC_CALL_ATTRIBUTES_V2W.OpNum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment InterfaceUuid$slice(MemorySegment seg) {
        return seg.asSlice(92, 16);
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

