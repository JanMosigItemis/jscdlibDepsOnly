// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$64 {

    static final FunctionDescriptor strxfrm$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle strxfrm$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strxfrm",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$64.strxfrm$FUNC, false
    );
    static final FunctionDescriptor _strxfrm_l$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _strxfrm_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strxfrm_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)J",
        constants$64._strxfrm_l$FUNC, false
    );
    static final FunctionDescriptor strdup$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle strdup$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strdup",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$64.strdup$FUNC, false
    );
    static final FunctionDescriptor strcmpi$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle strcmpi$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strcmpi",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$64.strcmpi$FUNC, false
    );
    static final FunctionDescriptor stricmp$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle stricmp$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "stricmp",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$64.stricmp$FUNC, false
    );
    static final FunctionDescriptor strlwr$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle strlwr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strlwr",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$64.strlwr$FUNC, false
    );
}

