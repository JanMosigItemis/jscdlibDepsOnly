// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$340 {

    static final FunctionDescriptor CreateRemoteThreadEx$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateRemoteThreadEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateRemoteThreadEx",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$340.CreateRemoteThreadEx$FUNC, false
    );
    static final FunctionDescriptor SetThreadContext$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetThreadContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetThreadContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$340.SetThreadContext$FUNC, false
    );
    static final FunctionDescriptor GetProcessHandleCount$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetProcessHandleCount$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetProcessHandleCount",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$340.GetProcessHandleCount$FUNC, false
    );
    static final FunctionDescriptor CreateProcessAsUserW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateProcessAsUserW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateProcessAsUserW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$340.CreateProcessAsUserW$FUNC, false
    );
    static final FunctionDescriptor GetProcessIdOfThread$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle GetProcessIdOfThread$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetProcessIdOfThread",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$340.GetProcessIdOfThread$FUNC, false
    );
    static final FunctionDescriptor InitializeProcThreadAttributeList$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle InitializeProcThreadAttributeList$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InitializeProcThreadAttributeList",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$340.InitializeProcThreadAttributeList$FUNC, false
    );
}

