// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$804 {

    static final FunctionDescriptor I_RpcBindingInqLocalClientPID$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle I_RpcBindingInqLocalClientPID$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcBindingInqLocalClientPID",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$804.I_RpcBindingInqLocalClientPID$FUNC, false
    );
    static final FunctionDescriptor I_RpcBindingHandleToAsyncHandle$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle I_RpcBindingHandleToAsyncHandle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcBindingHandleToAsyncHandle",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$804.I_RpcBindingHandleToAsyncHandle$FUNC, false
    );
    static final FunctionDescriptor I_RpcNsBindingSetEntryNameW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle I_RpcNsBindingSetEntryNameW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcNsBindingSetEntryNameW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$804.I_RpcNsBindingSetEntryNameW$FUNC, false
    );
    static final FunctionDescriptor I_RpcNsBindingSetEntryNameA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle I_RpcNsBindingSetEntryNameA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcNsBindingSetEntryNameA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$804.I_RpcNsBindingSetEntryNameA$FUNC, false
    );
    static final FunctionDescriptor I_RpcServerUseProtseqEp2A$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle I_RpcServerUseProtseqEp2A$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcServerUseProtseqEp2A",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$804.I_RpcServerUseProtseqEp2A$FUNC, false
    );
    static final FunctionDescriptor I_RpcServerUseProtseqEp2W$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle I_RpcServerUseProtseqEp2W$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcServerUseProtseqEp2W",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$804.I_RpcServerUseProtseqEp2W$FUNC, false
    );
}

