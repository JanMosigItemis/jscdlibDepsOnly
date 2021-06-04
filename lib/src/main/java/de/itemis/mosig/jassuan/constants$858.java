// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$858 {

    static final FunctionDescriptor NCryptEnumStorageProviders$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle NCryptEnumStorageProviders$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NCryptEnumStorageProviders",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$858.NCryptEnumStorageProviders$FUNC, false
    );
    static final FunctionDescriptor NCryptFreeBuffer$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle NCryptFreeBuffer$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NCryptFreeBuffer",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$858.NCryptFreeBuffer$FUNC, false
    );
    static final FunctionDescriptor NCryptOpenKey$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle NCryptOpenKey$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NCryptOpenKey",
        "(JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$858.NCryptOpenKey$FUNC, false
    );
    static final FunctionDescriptor NCryptCreatePersistedKey$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle NCryptCreatePersistedKey$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NCryptCreatePersistedKey",
        "(JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$858.NCryptCreatePersistedKey$FUNC, false
    );
    static final FunctionDescriptor NCryptGetProperty$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle NCryptGetProperty$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NCryptGetProperty",
        "(JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$858.NCryptGetProperty$FUNC, false
    );
    static final FunctionDescriptor NCryptSetProperty$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle NCryptSetProperty$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NCryptSetProperty",
        "(JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$858.NCryptSetProperty$FUNC, false
    );
}

