// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1205 {

    static final FunctionDescriptor SafeArrayGetDim$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SafeArrayGetDim$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SafeArrayGetDim",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1205.SafeArrayGetDim$FUNC, false
    );
    static final FunctionDescriptor SafeArrayGetElemsize$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SafeArrayGetElemsize$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SafeArrayGetElemsize",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1205.SafeArrayGetElemsize$FUNC, false
    );
    static final FunctionDescriptor SafeArrayGetUBound$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle SafeArrayGetUBound$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SafeArrayGetUBound",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1205.SafeArrayGetUBound$FUNC, false
    );
    static final FunctionDescriptor SafeArrayGetLBound$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle SafeArrayGetLBound$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SafeArrayGetLBound",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1205.SafeArrayGetLBound$FUNC, false
    );
    static final FunctionDescriptor SafeArrayLock$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle SafeArrayLock$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SafeArrayLock",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1205.SafeArrayLock$FUNC, false
    );
    static final FunctionDescriptor SafeArrayUnlock$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle SafeArrayUnlock$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SafeArrayUnlock",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1205.SafeArrayUnlock$FUNC, false
    );
}

