// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$106 {

    static final FunctionDescriptor execve$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle execve$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "execve",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$106.execve$FUNC, false
    );
    static final FunctionDescriptor execvp$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle execvp$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "execvp",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$106.execvp$FUNC, false
    );
    static final FunctionDescriptor execvpe$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle execvpe$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "execvpe",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$106.execvpe$FUNC, false
    );
    static final FunctionDescriptor spawnv$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spawnv$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "spawnv",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$106.spawnv$FUNC, false
    );
    static final FunctionDescriptor spawnve$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spawnve$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "spawnve",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$106.spawnve$FUNC, false
    );
    static final FunctionDescriptor spawnvp$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spawnvp$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "spawnvp",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$106.spawnvp$FUNC, false
    );
}

