// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$999 {

    static final FunctionDescriptor CoGetCurrentProcess$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle CoGetCurrentProcess$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoGetCurrentProcess",
        "()I",
        constants$999.CoGetCurrentProcess$FUNC, false
    );
    static final FunctionDescriptor CoGetCallerTID$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle CoGetCallerTID$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoGetCallerTID",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$999.CoGetCallerTID$FUNC, false
    );
    static final FunctionDescriptor CoGetDefaultContext$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoGetDefaultContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoGetDefaultContext",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$999.CoGetDefaultContext$FUNC, false
    );
    static final FunctionDescriptor CoGetClassObject$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoGetClassObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoGetClassObject",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$999.CoGetClassObject$FUNC, false
    );
    static final FunctionDescriptor CoAddRefServerProcess$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle CoAddRefServerProcess$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoAddRefServerProcess",
        "()I",
        constants$999.CoAddRefServerProcess$FUNC, false
    );
    static final FunctionDescriptor CoReleaseServerProcess$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle CoReleaseServerProcess$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoReleaseServerProcess",
        "()I",
        constants$999.CoReleaseServerProcess$FUNC, false
    );
}

