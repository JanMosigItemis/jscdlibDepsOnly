// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$796 {

    static final FunctionDescriptor DceErrorInqTextW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle DceErrorInqTextW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DceErrorInqTextW",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$796.DceErrorInqTextW$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtEpEltInqBegin$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcMgmtEpEltInqBegin$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtEpEltInqBegin",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$796.RpcMgmtEpEltInqBegin$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtEpEltInqDone$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcMgmtEpEltInqDone$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtEpEltInqDone",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$796.RpcMgmtEpEltInqDone$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtEpEltInqNextA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcMgmtEpEltInqNextA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtEpEltInqNextA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$796.RpcMgmtEpEltInqNextA$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtEpEltInqNextW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcMgmtEpEltInqNextW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtEpEltInqNextW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$796.RpcMgmtEpEltInqNextW$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtEpUnregister$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcMgmtEpUnregister$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtEpUnregister",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$796.RpcMgmtEpUnregister$FUNC, false
    );
}

