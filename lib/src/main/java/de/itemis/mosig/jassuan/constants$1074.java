// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1074 {

    static final FunctionDescriptor ITypeInfo_GetDocumentation_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetDocumentation_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetDocumentation_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1074.ITypeInfo_GetDocumentation_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetDocumentation_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetDocumentation_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetDocumentation_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1074.ITypeInfo_GetDocumentation_Stub$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetDllEntry_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetDllEntry_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetDllEntry_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1074.ITypeInfo_GetDllEntry_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetDllEntry_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetDllEntry_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetDllEntry_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1074.ITypeInfo_GetDllEntry_Stub$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_AddressOfMember_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_INT,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_AddressOfMember_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_AddressOfMember_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1074.ITypeInfo_AddressOfMember_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_AddressOfMember_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_AddressOfMember_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_AddressOfMember_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1074.ITypeInfo_AddressOfMember_Stub$FUNC, false
    );
}

