// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$783 {

    static final FunctionDescriptor RpcServerUseAllProtseqsIf$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcServerUseAllProtseqsIf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcServerUseAllProtseqsIf",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$783.RpcServerUseAllProtseqsIf$FUNC, false
    );
    static final FunctionDescriptor RpcServerUseAllProtseqsIfEx$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcServerUseAllProtseqsIfEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcServerUseAllProtseqsIfEx",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$783.RpcServerUseAllProtseqsIfEx$FUNC, false
    );
    static final FunctionDescriptor RpcServerUseProtseqA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle RpcServerUseProtseqA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcServerUseProtseqA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$783.RpcServerUseProtseqA$FUNC, false
    );
    static final FunctionDescriptor RpcServerUseProtseqExA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcServerUseProtseqExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcServerUseProtseqExA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$783.RpcServerUseProtseqExA$FUNC, false
    );
    static final FunctionDescriptor RpcServerUseProtseqW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle RpcServerUseProtseqW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcServerUseProtseqW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$783.RpcServerUseProtseqW$FUNC, false
    );
    static final FunctionDescriptor RpcServerUseProtseqExW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcServerUseProtseqExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcServerUseProtseqExW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$783.RpcServerUseProtseqExW$FUNC, false
    );
}

