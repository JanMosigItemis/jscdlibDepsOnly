// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$392 {

    static final FunctionDescriptor LocalAlloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_LONG_LONG
    );
    static final MethodHandle LocalAlloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LocalAlloc",
        "(IJ)Ljdk/incubator/foreign/MemoryAddress;",
        constants$392.LocalAlloc$FUNC, false
    );
    static final FunctionDescriptor LocalFree$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle LocalFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LocalFree",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$392.LocalFree$FUNC, false
    );
    static final FunctionDescriptor WinMain$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle WinMain$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WinMain",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$392.WinMain$FUNC, false
    );
    static final FunctionDescriptor wWinMain$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle wWinMain$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "wWinMain",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$392.wWinMain$FUNC, false
    );
    static final FunctionDescriptor GlobalFlags$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle GlobalFlags$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GlobalFlags",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$392.GlobalFlags$FUNC, false
    );
    static final FunctionDescriptor GlobalHandle$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle GlobalHandle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GlobalHandle",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$392.GlobalHandle$FUNC, false
    );
}

