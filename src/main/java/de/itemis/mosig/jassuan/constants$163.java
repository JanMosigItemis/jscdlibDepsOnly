// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$163 {

    static final FunctionDescriptor strtol$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle strtol$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strtol",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$163.strtol$FUNC, false
    );
    static final FunctionDescriptor _strtol_l$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _strtol_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strtol_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$163._strtol_l$FUNC, false
    );
    static final FunctionDescriptor strtoul$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle strtoul$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strtoul",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$163.strtoul$FUNC, false
    );
    static final FunctionDescriptor _strtoul_l$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _strtoul_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strtoul_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$163._strtoul_l$FUNC, false
    );
    static final FunctionDescriptor _ultoa$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _ultoa$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_ultoa",
        "(ILjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$163._ultoa$FUNC, false
    );
    static final FunctionDescriptor wctomb$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_SHORT
    );
    static final MethodHandle wctomb$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "wctomb",
        "(Ljdk/incubator/foreign/MemoryAddress;S)I",
        constants$163.wctomb$FUNC, false
    );
}

