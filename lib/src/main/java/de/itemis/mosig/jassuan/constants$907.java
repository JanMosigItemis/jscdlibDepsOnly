// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$907 {

    static final FunctionDescriptor CertStrToNameW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertStrToNameW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertStrToNameW",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$907.CertStrToNameW$FUNC, false
    );
    static final FunctionDescriptor CertGetNameStringA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertGetNameStringA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetNameStringA",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$907.CertGetNameStringA$FUNC, false
    );
    static final FunctionDescriptor CertGetNameStringW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertGetNameStringW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetNameStringW",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$907.CertGetNameStringW$FUNC, false
    );
    static final FunctionDescriptor PFN_CRYPT_GET_SIGNER_CERTIFICATE$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFN_CRYPT_GET_SIGNER_CERTIFICATE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$907.PFN_CRYPT_GET_SIGNER_CERTIFICATE$FUNC, false
    );
    static final FunctionDescriptor CryptSignMessage$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptSignMessage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptSignMessage",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$907.CryptSignMessage$FUNC, false
    );
}

