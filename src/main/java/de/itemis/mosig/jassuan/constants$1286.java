// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1286 {

    static final FunctionDescriptor LPOCNCONNPROCA$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle LPOCNCONNPROCA$MH = RuntimeHelper.downcallHandle(
        "(JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$1286.LPOCNCONNPROCA$FUNC, false
    );
    static final FunctionDescriptor LPOCNCONNPROCW$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle LPOCNCONNPROCW$MH = RuntimeHelper.downcallHandle(
        "(JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$1286.LPOCNCONNPROCW$FUNC, false
    );
    static final FunctionDescriptor LPOCNCHKPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle LPOCNCHKPROC$MH = RuntimeHelper.downcallHandle(
        "(JJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1286.LPOCNCHKPROC$FUNC, false
    );
}

