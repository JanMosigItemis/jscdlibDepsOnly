// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$336 {

    static final FunctionDescriptor GetExitCodeProcess$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetExitCodeProcess$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetExitCodeProcess",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$336.GetExitCodeProcess$FUNC, false
    );
    static final FunctionDescriptor SwitchToThread$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle SwitchToThread$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SwitchToThread",
        "()I",
        constants$336.SwitchToThread$FUNC, false
    );
    static final FunctionDescriptor OpenThread$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_INT,
        C_LONG
    );
    static final MethodHandle OpenThread$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenThread",
        "(III)Ljdk/incubator/foreign/MemoryAddress;",
        constants$336.OpenThread$FUNC, false
    );
    static final FunctionDescriptor SetThreadPriorityBoost$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetThreadPriorityBoost$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetThreadPriorityBoost",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$336.SetThreadPriorityBoost$FUNC, false
    );
    static final FunctionDescriptor GetThreadPriorityBoost$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetThreadPriorityBoost$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetThreadPriorityBoost",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$336.GetThreadPriorityBoost$FUNC, false
    );
    static final FunctionDescriptor SetThreadToken$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetThreadToken$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetThreadToken",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$336.SetThreadToken$FUNC, false
    );
}

