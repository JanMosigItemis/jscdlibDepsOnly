// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$775 {

    static final FunctionDescriptor RPC_OBJECT_INQ_FN$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RPC_OBJECT_INQ_FN$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$775.RPC_OBJECT_INQ_FN$FUNC, false
    );
    static final FunctionDescriptor RPC_IF_CALLBACK_FN$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RPC_IF_CALLBACK_FN$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$775.RPC_IF_CALLBACK_FN$FUNC, false
    );
    static final FunctionDescriptor RPC_SECURITY_CALLBACK_FN$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle RPC_SECURITY_CALLBACK_FN$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$775.RPC_SECURITY_CALLBACK_FN$FUNC, false
    );
    static final FunctionDescriptor RpcBindingCopy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcBindingCopy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcBindingCopy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$775.RpcBindingCopy$FUNC, false
    );
}

