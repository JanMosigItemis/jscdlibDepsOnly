// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1345 {

    static final FunctionDescriptor ImmIsUIMessageA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle ImmIsUIMessageA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmIsUIMessageA",
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)I",
        constants$1345.ImmIsUIMessageA$FUNC, false
    );
    static final FunctionDescriptor ImmIsUIMessageW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle ImmIsUIMessageW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmIsUIMessageW",
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)I",
        constants$1345.ImmIsUIMessageW$FUNC, false
    );
    static final FunctionDescriptor ImmGetVirtualKey$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle ImmGetVirtualKey$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmGetVirtualKey",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1345.ImmGetVirtualKey$FUNC, false
    );
    static final FunctionDescriptor ImmRegisterWordA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle ImmRegisterWordA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmRegisterWordA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1345.ImmRegisterWordA$FUNC, false
    );
    static final FunctionDescriptor ImmRegisterWordW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle ImmRegisterWordW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmRegisterWordW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1345.ImmRegisterWordW$FUNC, false
    );
    static final FunctionDescriptor ImmUnregisterWordA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle ImmUnregisterWordA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmUnregisterWordA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1345.ImmUnregisterWordA$FUNC, false
    );
}

