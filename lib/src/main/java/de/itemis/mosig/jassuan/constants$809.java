// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$809 {

    static final FunctionDescriptor RPC_SETFILTER_FUNC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle RPC_SETFILTER_FUNC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$809.RPC_SETFILTER_FUNC$FUNC, false
    );
    static final FunctionDescriptor I_RpcServerStartListening$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle I_RpcServerStartListening$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcServerStartListening",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$809.I_RpcServerStartListening$FUNC, false
    );
    static final FunctionDescriptor I_RpcServerStopListening$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle I_RpcServerStopListening$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcServerStopListening",
        "()I",
        constants$809.I_RpcServerStopListening$FUNC, false
    );
    static final FunctionDescriptor RPC_BLOCKING_FN$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RPC_BLOCKING_FN$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$809.RPC_BLOCKING_FN$FUNC, false
    );
    static final FunctionDescriptor I_RpcBindingSetAsync$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle I_RpcBindingSetAsync$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "I_RpcBindingSetAsync",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$809.I_RpcBindingSetAsync$FUNC, false
    );
}

