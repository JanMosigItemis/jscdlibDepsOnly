// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1075 {

    static final FunctionDescriptor ITypeInfo_CreateInstance_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_CreateInstance_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_CreateInstance_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1075.ITypeInfo_CreateInstance_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_CreateInstance_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_CreateInstance_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_CreateInstance_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1075.ITypeInfo_CreateInstance_Stub$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetContainingTypeLib_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetContainingTypeLib_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetContainingTypeLib_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1075.ITypeInfo_GetContainingTypeLib_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetContainingTypeLib_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetContainingTypeLib_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetContainingTypeLib_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1075.ITypeInfo_GetContainingTypeLib_Stub$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_ReleaseTypeAttr_Proxy$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_ReleaseTypeAttr_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_ReleaseTypeAttr_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1075.ITypeInfo_ReleaseTypeAttr_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_ReleaseTypeAttr_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_ReleaseTypeAttr_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_ReleaseTypeAttr_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1075.ITypeInfo_ReleaseTypeAttr_Stub$FUNC, false
    );
}

