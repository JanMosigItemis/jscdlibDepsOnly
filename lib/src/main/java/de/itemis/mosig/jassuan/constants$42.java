// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$42 {

    static final FunctionDescriptor _scprintf_p_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _scprintf_p_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_scprintf_p_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$42._scprintf_p_l$FUNC, true
    );
    static final FunctionDescriptor _vscprintf_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _vscprintf_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_vscprintf_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$42._vscprintf_l$FUNC, false
    );
    static final FunctionDescriptor _vscprintf_p_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _vscprintf_p_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_vscprintf_p_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$42._vscprintf_p_l$FUNC, false
    );
    static final FunctionDescriptor _printf_s_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _printf_s_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_printf_s_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$42._printf_s_l$FUNC, true
    );
    static final FunctionDescriptor _vprintf_s_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _vprintf_s_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_vprintf_s_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$42._vprintf_s_l$FUNC, false
    );
    static final FunctionDescriptor _fprintf_s_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _fprintf_s_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_fprintf_s_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$42._fprintf_s_l$FUNC, true
    );
}

