// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$31 {

    static final FunctionDescriptor flushall$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle flushall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "flushall",
        "()I",
        constants$31.flushall$FUNC, false
    );
    static final FunctionDescriptor fputchar$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle fputchar$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "fputchar",
        "(I)I",
        constants$31.fputchar$FUNC, false
    );
    static final FunctionDescriptor getw$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle getw$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "getw",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$31.getw$FUNC, false
    );
    static final FunctionDescriptor putw$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle putw$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "putw",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$31.putw$FUNC, false
    );
    static final FunctionDescriptor rmtmp$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle rmtmp$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "rmtmp",
        "()I",
        constants$31.rmtmp$FUNC, false
    );
    static final FunctionDescriptor __mingw_str_wide_utf8$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle __mingw_str_wide_utf8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__mingw_str_wide_utf8",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$31.__mingw_str_wide_utf8$FUNC, false
    );
}

