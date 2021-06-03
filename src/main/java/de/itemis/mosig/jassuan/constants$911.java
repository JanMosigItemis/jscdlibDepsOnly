// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$911 {

    static final FunctionDescriptor FindCertsByIssuer$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle FindCertsByIssuer$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindCertsByIssuer",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$911.FindCertsByIssuer$FUNC, false
    );
    static final FunctionDescriptor CryptQueryObject$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptQueryObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptQueryObject",
        "(ILjdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$911.CryptQueryObject$FUNC, false
    );
    static final FunctionDescriptor PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$911.PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$FUNC, false
    );
    static final FunctionDescriptor CryptMemAlloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptMemAlloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptMemAlloc",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$911.CryptMemAlloc$FUNC, false
    );
    static final FunctionDescriptor CryptMemRealloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptMemRealloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptMemRealloc",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$911.CryptMemRealloc$FUNC, false
    );
}

