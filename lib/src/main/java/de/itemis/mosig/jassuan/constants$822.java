// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$822 {

    static final FunctionDescriptor RpcNsBindingImportNext$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcNsBindingImportNext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNsBindingImportNext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$822.RpcNsBindingImportNext$FUNC, false
    );
    static final FunctionDescriptor RpcNsBindingImportDone$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcNsBindingImportDone$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNsBindingImportDone",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$822.RpcNsBindingImportDone$FUNC, false
    );
    static final FunctionDescriptor RpcNsBindingSelect$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcNsBindingSelect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNsBindingSelect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$822.RpcNsBindingSelect$FUNC, false
    );
    static final FunctionDescriptor RPCNOTIFICATION_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle RPCNOTIFICATION_ROUTINE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$822.RPCNOTIFICATION_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor PFN_RPCNOTIFICATION_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_INT
    );
}

