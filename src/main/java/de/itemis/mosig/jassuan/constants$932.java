// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$932 {

    static final FunctionDescriptor CS_TYPE_FROM_NETCS_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CS_TYPE_FROM_NETCS_ROUTINE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$932.CS_TYPE_FROM_NETCS_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor CS_TAG_GETTING_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CS_TAG_GETTING_ROUTINE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$932.CS_TAG_GETTING_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor RpcCsGetTags$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcCsGetTags$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcCsGetTags",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$932.RpcCsGetTags$FUNC, false
    );
    static final FunctionDescriptor STUB_THUNK$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
}

