// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1019 {

    static final FunctionDescriptor IStorage_EnumElements_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle IStorage_EnumElements_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IStorage_EnumElements_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1019.IStorage_EnumElements_Stub$FUNC, false
    );
    static final MemoryLayout IID_IPersistFile$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPersistFile$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IPersistFile", constants$1019.IID_IPersistFile$LAYOUT);
    static final MemoryLayout IID_IPersistStorage$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPersistStorage$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IPersistStorage", constants$1019.IID_IPersistStorage$LAYOUT);
    static final MemoryLayout IID_ILockBytes$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ILockBytes$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_ILockBytes", constants$1019.IID_ILockBytes$LAYOUT);
    static final FunctionDescriptor ILockBytes_RemoteReadAt_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle ILockBytes_RemoteReadAt_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ILockBytes_RemoteReadAt_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1019.ILockBytes_RemoteReadAt_Proxy$FUNC, false
    );
    static final FunctionDescriptor ILockBytes_RemoteReadAt_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ILockBytes_RemoteReadAt_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ILockBytes_RemoteReadAt_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1019.ILockBytes_RemoteReadAt_Stub$FUNC, false
    );
}

