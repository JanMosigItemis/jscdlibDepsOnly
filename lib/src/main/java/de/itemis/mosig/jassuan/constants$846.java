// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$846 {

    static final FunctionDescriptor CryptSetProviderA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptSetProviderA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptSetProviderA",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$846.CryptSetProviderA$FUNC, false
    );
    static final FunctionDescriptor CryptSetProviderW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptSetProviderW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptSetProviderW",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$846.CryptSetProviderW$FUNC, false
    );
    static final FunctionDescriptor CryptSetProviderExA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptSetProviderExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptSetProviderExA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$846.CryptSetProviderExA$FUNC, false
    );
    static final FunctionDescriptor CryptSetProviderExW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptSetProviderExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptSetProviderExW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$846.CryptSetProviderExW$FUNC, false
    );
    static final FunctionDescriptor CryptGetDefaultProviderA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptGetDefaultProviderA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptGetDefaultProviderA",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$846.CryptGetDefaultProviderA$FUNC, false
    );
    static final FunctionDescriptor CryptGetDefaultProviderW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptGetDefaultProviderW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptGetDefaultProviderW",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$846.CryptGetDefaultProviderW$FUNC, false
    );
}

