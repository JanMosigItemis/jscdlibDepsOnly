// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1338 {

    static final FunctionDescriptor ImmSimulateHotKey$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle ImmSimulateHotKey$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmSimulateHotKey",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1338.ImmSimulateHotKey$FUNC, false
    );
    static final FunctionDescriptor ImmCreateContext$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle ImmCreateContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmCreateContext",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$1338.ImmCreateContext$FUNC, false
    );
    static final FunctionDescriptor ImmDestroyContext$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle ImmDestroyContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmDestroyContext",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1338.ImmDestroyContext$FUNC, false
    );
    static final FunctionDescriptor ImmGetContext$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle ImmGetContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmGetContext",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1338.ImmGetContext$FUNC, false
    );
    static final FunctionDescriptor ImmReleaseContext$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ImmReleaseContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmReleaseContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1338.ImmReleaseContext$FUNC, false
    );
    static final FunctionDescriptor ImmAssociateContext$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ImmAssociateContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmAssociateContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1338.ImmAssociateContext$FUNC, false
    );
}

