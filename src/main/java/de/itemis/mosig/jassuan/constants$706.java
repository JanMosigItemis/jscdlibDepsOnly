// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$706 {

    static final FunctionDescriptor GetFileVersionInfoExA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetFileVersionInfoExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileVersionInfoExA",
        "(ILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$706.GetFileVersionInfoExA$FUNC, false
    );
    static final FunctionDescriptor GetFileVersionInfoExW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetFileVersionInfoExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileVersionInfoExW",
        "(ILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$706.GetFileVersionInfoExW$FUNC, false
    );
    static final FunctionDescriptor VerLanguageNameA$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle VerLanguageNameA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VerLanguageNameA",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$706.VerLanguageNameA$FUNC, false
    );
    static final FunctionDescriptor VerLanguageNameW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle VerLanguageNameW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VerLanguageNameW",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$706.VerLanguageNameW$FUNC, false
    );
    static final FunctionDescriptor VerQueryValueA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle VerQueryValueA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VerQueryValueA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$706.VerQueryValueA$FUNC, false
    );
    static final FunctionDescriptor VerQueryValueW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle VerQueryValueW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VerQueryValueW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$706.VerQueryValueW$FUNC, false
    );
}

