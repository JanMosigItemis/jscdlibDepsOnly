// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$304 {

    static final FunctionDescriptor FindClose$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle FindClose$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindClose",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$304.FindClose$FUNC, false
    );
    static final FunctionDescriptor FindFirstFileExA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle FindFirstFileExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindFirstFileExA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$304.FindFirstFileExA$FUNC, false
    );
    static final FunctionDescriptor FindFirstFileExW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle FindFirstFileExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindFirstFileExW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$304.FindFirstFileExW$FUNC, false
    );
    static final FunctionDescriptor FindNextFileA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle FindNextFileA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindNextFileA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$304.FindNextFileA$FUNC, false
    );
    static final FunctionDescriptor FindNextFileW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle FindNextFileW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindNextFileW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$304.FindNextFileW$FUNC, false
    );
    static final FunctionDescriptor FlushFileBuffers$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle FlushFileBuffers$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FlushFileBuffers",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$304.FlushFileBuffers$FUNC, false
    );
}

