// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$917 {

    static final FunctionDescriptor CertResyncCertificateChainEngine$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle CertResyncCertificateChainEngine$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertResyncCertificateChainEngine",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$917.CertResyncCertificateChainEngine$FUNC, false
    );
    static final FunctionDescriptor CertGetCertificateChain$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertGetCertificateChain$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetCertificateChain",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$917.CertGetCertificateChain$FUNC, false
    );
    static final FunctionDescriptor CertFreeCertificateChain$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle CertFreeCertificateChain$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertFreeCertificateChain",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$917.CertFreeCertificateChain$FUNC, false
    );
    static final FunctionDescriptor CertDuplicateCertificateChain$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertDuplicateCertificateChain$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertDuplicateCertificateChain",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$917.CertDuplicateCertificateChain$FUNC, false
    );
    static final FunctionDescriptor CertFindChainInStore$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertFindChainInStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertFindChainInStore",
        "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$917.CertFindChainInStore$FUNC, false
    );
    static final FunctionDescriptor PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
}

