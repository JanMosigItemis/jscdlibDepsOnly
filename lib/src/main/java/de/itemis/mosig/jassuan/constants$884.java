// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$884 {

    static final FunctionDescriptor CertGetIssuerCertificateFromStore$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertGetIssuerCertificateFromStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetIssuerCertificateFromStore",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$884.CertGetIssuerCertificateFromStore$FUNC, false
    );
    static final FunctionDescriptor CertVerifySubjectCertificateContext$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertVerifySubjectCertificateContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertVerifySubjectCertificateContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$884.CertVerifySubjectCertificateContext$FUNC, false
    );
    static final FunctionDescriptor CertDuplicateCertificateContext$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertDuplicateCertificateContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertDuplicateCertificateContext",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$884.CertDuplicateCertificateContext$FUNC, false
    );
    static final FunctionDescriptor CertCreateCertificateContext$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertCreateCertificateContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertCreateCertificateContext",
        "(ILjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$884.CertCreateCertificateContext$FUNC, false
    );
    static final FunctionDescriptor CertFreeCertificateContext$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle CertFreeCertificateContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertFreeCertificateContext",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$884.CertFreeCertificateContext$FUNC, false
    );
    static final FunctionDescriptor CertSetCertificateContextProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CertSetCertificateContextProperty$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertSetCertificateContextProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$884.CertSetCertificateContextProperty$FUNC, false
    );
}

