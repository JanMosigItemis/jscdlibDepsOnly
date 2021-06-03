// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$853 {

    static final FunctionDescriptor BCryptGenRandom$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle BCryptGenRandom$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptGenRandom",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$853.BCryptGenRandom$FUNC, false
    );
    static final FunctionDescriptor BCryptDeriveKeyCapi$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle BCryptDeriveKeyCapi$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptDeriveKeyCapi",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$853.BCryptDeriveKeyCapi$FUNC, false
    );
    static final FunctionDescriptor BCryptDeriveKeyPBKDF2$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle BCryptDeriveKeyPBKDF2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptDeriveKeyPBKDF2",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;IJLjdk/incubator/foreign/MemoryAddress;II)I",
        constants$853.BCryptDeriveKeyPBKDF2$FUNC, false
    );
    static final FunctionDescriptor BCryptResolveProviders$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle BCryptResolveProviders$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptResolveProviders",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$853.BCryptResolveProviders$FUNC, false
    );
    static final FunctionDescriptor BCryptGetFipsAlgorithmMode$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle BCryptGetFipsAlgorithmMode$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptGetFipsAlgorithmMode",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$853.BCryptGetFipsAlgorithmMode$FUNC, false
    );
    static final FunctionDescriptor BCryptQueryProviderRegistration$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle BCryptQueryProviderRegistration$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptQueryProviderRegistration",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$853.BCryptQueryProviderRegistration$FUNC, false
    );
}

