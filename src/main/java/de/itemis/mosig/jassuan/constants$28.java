// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$28 {

    static final FunctionDescriptor vswprintf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle vswprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "vswprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$28.vswprintf$FUNC, false
    );
    static final FunctionDescriptor swprintf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle swprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "swprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$28.swprintf$FUNC, true
    );
    static final FunctionDescriptor _wtempnam$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _wtempnam$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wtempnam",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$28._wtempnam$FUNC, false
    );
    static final FunctionDescriptor _snwscanf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _snwscanf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_snwscanf",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$28._snwscanf$FUNC, true
    );
    static final FunctionDescriptor _wfdopen$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _wfdopen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wfdopen",
        "(ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$28._wfdopen$FUNC, false
    );
    static final FunctionDescriptor _wfopen$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _wfopen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wfopen",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$28._wfopen$FUNC, false
    );
}

