// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$780 {

    static final FunctionDescriptor RpcMgmtSetCancelTimeout$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle RpcMgmtSetCancelTimeout$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtSetCancelTimeout",
        "(I)I",
        constants$780.RpcMgmtSetCancelTimeout$FUNC, false
    );
    static final FunctionDescriptor RpcNetworkInqProtseqsA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcNetworkInqProtseqsA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNetworkInqProtseqsA",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$780.RpcNetworkInqProtseqsA$FUNC, false
    );
    static final FunctionDescriptor RpcNetworkInqProtseqsW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcNetworkInqProtseqsW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNetworkInqProtseqsW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$780.RpcNetworkInqProtseqsW$FUNC, false
    );
    static final FunctionDescriptor RpcObjectInqType$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcObjectInqType$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcObjectInqType",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$780.RpcObjectInqType$FUNC, false
    );
    static final FunctionDescriptor RpcObjectSetInqFn$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcObjectSetInqFn$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcObjectSetInqFn",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$780.RpcObjectSetInqFn$FUNC, false
    );
    static final FunctionDescriptor RpcObjectSetType$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcObjectSetType$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcObjectSetType",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$780.RpcObjectSetType$FUNC, false
    );
}

