// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1175 {

    static final FunctionDescriptor IBinding_RemoteGetBindResult_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IBinding_RemoteGetBindResult_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IBinding_RemoteGetBindResult_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1175.IBinding_RemoteGetBindResult_Stub$FUNC, false
    );
    static final FunctionDescriptor IBinding_GetBindResult_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IBinding_GetBindResult_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IBinding_GetBindResult_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1175.IBinding_GetBindResult_Proxy$FUNC, false
    );
    static final FunctionDescriptor IBinding_GetBindResult_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle IBinding_GetBindResult_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IBinding_GetBindResult_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1175.IBinding_GetBindResult_Stub$FUNC, false
    );
    static final MemoryLayout IID_IBindStatusCallback$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IBindStatusCallback$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IBindStatusCallback", constants$1175.IID_IBindStatusCallback$LAYOUT);
    static final FunctionDescriptor IBindStatusCallback_RemoteGetBindInfo_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IBindStatusCallback_RemoteGetBindInfo_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IBindStatusCallback_RemoteGetBindInfo_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1175.IBindStatusCallback_RemoteGetBindInfo_Proxy$FUNC, false
    );
    static final FunctionDescriptor IBindStatusCallback_RemoteGetBindInfo_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IBindStatusCallback_RemoteGetBindInfo_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IBindStatusCallback_RemoteGetBindInfo_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1175.IBindStatusCallback_RemoteGetBindInfo_Stub$FUNC, false
    );
}

