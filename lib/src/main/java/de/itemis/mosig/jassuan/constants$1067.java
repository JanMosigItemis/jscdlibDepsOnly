// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1067 {

    static final FunctionDescriptor ITypeComp_BindType_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle ITypeComp_BindType_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeComp_BindType_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1067.ITypeComp_BindType_Stub$FUNC, false
    );
    static final MemoryLayout IID_ITypeInfo$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ITypeInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_ITypeInfo", constants$1067.IID_ITypeInfo$LAYOUT);
    static final FunctionDescriptor ITypeInfo_RemoteGetTypeAttr_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_RemoteGetTypeAttr_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_RemoteGetTypeAttr_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1067.ITypeInfo_RemoteGetTypeAttr_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_RemoteGetTypeAttr_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_RemoteGetTypeAttr_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_RemoteGetTypeAttr_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1067.ITypeInfo_RemoteGetTypeAttr_Stub$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_RemoteGetFuncDesc_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_RemoteGetFuncDesc_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_RemoteGetFuncDesc_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1067.ITypeInfo_RemoteGetFuncDesc_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_RemoteGetFuncDesc_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_RemoteGetFuncDesc_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_RemoteGetFuncDesc_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1067.ITypeInfo_RemoteGetFuncDesc_Stub$FUNC, false
    );
}

