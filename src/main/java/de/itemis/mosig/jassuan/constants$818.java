// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$818 {

    static final FunctionDescriptor RpcNsProfileEltAddW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcNsProfileEltAddW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNsProfileEltAddW",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$818.RpcNsProfileEltAddW$FUNC, false
    );
    static final FunctionDescriptor RpcNsProfileEltRemoveW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcNsProfileEltRemoveW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNsProfileEltRemoveW",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$818.RpcNsProfileEltRemoveW$FUNC, false
    );
    static final FunctionDescriptor RpcNsProfileEltInqBeginW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcNsProfileEltInqBeginW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNsProfileEltInqBeginW",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$818.RpcNsProfileEltInqBeginW$FUNC, false
    );
    static final FunctionDescriptor RpcNsProfileEltInqNextW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcNsProfileEltInqNextW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNsProfileEltInqNextW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$818.RpcNsProfileEltInqNextW$FUNC, false
    );
    static final FunctionDescriptor RpcNsProfileEltInqDone$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcNsProfileEltInqDone$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNsProfileEltInqDone",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$818.RpcNsProfileEltInqDone$FUNC, false
    );
    static final FunctionDescriptor RpcNsEntryObjectInqBeginA$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcNsEntryObjectInqBeginA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNsEntryObjectInqBeginA",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$818.RpcNsEntryObjectInqBeginA$FUNC, false
    );
}

