// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$790 {

    static final FunctionDescriptor RpcBindingInqAuthClientExW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle RpcBindingInqAuthClientExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcBindingInqAuthClientExW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$790.RpcBindingInqAuthClientExW$FUNC, false
    );
    static final FunctionDescriptor RpcBindingInqAuthInfoA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcBindingInqAuthInfoA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcBindingInqAuthInfoA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$790.RpcBindingInqAuthInfoA$FUNC, false
    );
    static final FunctionDescriptor RpcBindingInqAuthInfoW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcBindingInqAuthInfoW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcBindingInqAuthInfoW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$790.RpcBindingInqAuthInfoW$FUNC, false
    );
    static final FunctionDescriptor RpcBindingSetAuthInfoA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle RpcBindingSetAuthInfoA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcBindingSetAuthInfoA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$790.RpcBindingSetAuthInfoA$FUNC, false
    );
    static final FunctionDescriptor RpcBindingSetAuthInfoExA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcBindingSetAuthInfoExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcBindingSetAuthInfoExA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$790.RpcBindingSetAuthInfoExA$FUNC, false
    );
    static final FunctionDescriptor RpcBindingSetAuthInfoW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle RpcBindingSetAuthInfoW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcBindingSetAuthInfoW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$790.RpcBindingSetAuthInfoW$FUNC, false
    );
}

