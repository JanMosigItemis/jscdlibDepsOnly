// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$826 {

    static final FunctionDescriptor RpcFreeAuthorizationContext$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcFreeAuthorizationContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcFreeAuthorizationContext",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$826.RpcFreeAuthorizationContext$FUNC, false
    );
    static final FunctionDescriptor RpcSsContextLockExclusive$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcSsContextLockExclusive$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcSsContextLockExclusive",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$826.RpcSsContextLockExclusive$FUNC, false
    );
    static final FunctionDescriptor RpcSsContextLockShared$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcSsContextLockShared$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcSsContextLockShared",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$826.RpcSsContextLockShared$FUNC, false
    );
    static final FunctionDescriptor RpcServerInqCallAttributesW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcServerInqCallAttributesW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcServerInqCallAttributesW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$826.RpcServerInqCallAttributesW$FUNC, false
    );
    static final FunctionDescriptor RpcServerInqCallAttributesA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcServerInqCallAttributesA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcServerInqCallAttributesA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$826.RpcServerInqCallAttributesA$FUNC, false
    );
    static final FunctionDescriptor I_RpcAsyncSetHandle$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle I_RpcAsyncSetHandle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcAsyncSetHandle",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$826.I_RpcAsyncSetHandle$FUNC, false
    );
}

