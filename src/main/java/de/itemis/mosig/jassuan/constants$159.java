// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$159 {

    static final FunctionDescriptor _strtoui64$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _strtoui64$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strtoui64",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)J",
        constants$159._strtoui64$FUNC, false
    );
    static final FunctionDescriptor _strtoui64_l$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _strtoui64_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strtoui64_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)J",
        constants$159._strtoui64_l$FUNC, false
    );
    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        C_LONG.withName("quot"),
        C_LONG.withName("rem")
    ).withName("_ldiv_t"),
        C_LONG,
        C_LONG
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ldiv",
        "(II)Ljdk/incubator/foreign/MemorySegment;",
        constants$159.ldiv$FUNC, false
    );
    static final FunctionDescriptor _ltoa$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _ltoa$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_ltoa",
        "(ILjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$159._ltoa$FUNC, false
    );
    static final FunctionDescriptor mblen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle mblen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mblen",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$159.mblen$FUNC, false
    );
    static final FunctionDescriptor _mblen_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _mblen_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mblen_l",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$159._mblen_l$FUNC, false
    );
}

