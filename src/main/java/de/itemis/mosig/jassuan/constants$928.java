// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$928 {

    static final FunctionDescriptor NDRSContextUnmarshall2$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle NDRSContextUnmarshall2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NDRSContextUnmarshall2",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$928.NDRSContextUnmarshall2$FUNC, false
    );
    static final FunctionDescriptor RpcSsDestroyClientContext$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle RpcSsDestroyClientContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcSsDestroyClientContext",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$928.RpcSsDestroyClientContext$FUNC, false
    );
    static final FunctionDescriptor EXPR_EVAL$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle EXPR_EVAL$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$928.EXPR_EVAL$FUNC, false
    );
    static final FunctionDescriptor GENERIC_BINDING_ROUTINE$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle GENERIC_BINDING_ROUTINE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$928.GENERIC_BINDING_ROUTINE$FUNC, false
    );
}

