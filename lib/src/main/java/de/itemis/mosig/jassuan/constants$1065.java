// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1065 {

    static final FunctionDescriptor IEnumVARIANT_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumVARIANT_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumVARIANT_RemoteNext_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1065.IEnumVARIANT_RemoteNext_Proxy$FUNC, false
    );
    static final FunctionDescriptor IEnumVARIANT_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumVARIANT_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumVARIANT_RemoteNext_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1065.IEnumVARIANT_RemoteNext_Stub$FUNC, false
    );
    static final FunctionDescriptor IEnumVARIANT_Next_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumVARIANT_Next_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumVARIANT_Next_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1065.IEnumVARIANT_Next_Proxy$FUNC, false
    );
    static final FunctionDescriptor IEnumVARIANT_Next_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumVARIANT_Next_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumVARIANT_Next_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1065.IEnumVARIANT_Next_Stub$FUNC, false
    );
    static final MemoryLayout IID_ITypeComp$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ITypeComp$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_ITypeComp", constants$1065.IID_ITypeComp$LAYOUT);
    static final FunctionDescriptor ITypeComp_RemoteBind_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_SHORT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeComp_RemoteBind_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeComp_RemoteBind_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ISLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1065.ITypeComp_RemoteBind_Proxy$FUNC, false
    );
}

