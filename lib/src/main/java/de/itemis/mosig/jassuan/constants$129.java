// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$129 {

    static final FunctionDescriptor EXCEPTION_ROUTINE$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle EXCEPTION_ROUTINE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$129.EXCEPTION_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor PEXCEPTION_ROUTINE$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PEXCEPTION_ROUTINE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$129.PEXCEPTION_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor __bsfd$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle __bsfd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__bsfd",
        "(I)I",
        constants$129.__bsfd$FUNC, false
    );
    static final FunctionDescriptor __bsrd$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle __bsrd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__bsrd",
        "(I)I",
        constants$129.__bsrd$FUNC, false
    );
}

