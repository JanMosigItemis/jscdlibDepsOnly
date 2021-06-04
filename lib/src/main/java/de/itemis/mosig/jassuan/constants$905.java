// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$905 {

    static final FunctionDescriptor CryptImportPublicKeyInfoEx2$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptImportPublicKeyInfoEx2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptImportPublicKeyInfoEx2",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$905.CryptImportPublicKeyInfoEx2$FUNC, false
    );
    static final FunctionDescriptor CryptAcquireCertificatePrivateKey$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptAcquireCertificatePrivateKey$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptAcquireCertificatePrivateKey",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$905.CryptAcquireCertificatePrivateKey$FUNC, false
    );
    static final FunctionDescriptor CryptFindCertificateKeyProvInfo$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CryptFindCertificateKeyProvInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptFindCertificateKeyProvInfo",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$905.CryptFindCertificateKeyProvInfo$FUNC, false
    );
    static final FunctionDescriptor CryptImportPKCS8$FUNC = FunctionDescriptor.of(C_INT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                C_POINTER.withName("pbData")
            ).withName("PrivateKey"),
            C_POINTER.withName("pResolvehCryptProvFunc"),
            C_POINTER.withName("pVoidResolveFunc"),
            C_POINTER.withName("pDecryptPrivateKeyFunc"),
            C_POINTER.withName("pVoidDecryptFunc")
        ).withName("_CRYPT_PKCS8_IMPORT_PARAMS"),
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptImportPKCS8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptImportPKCS8",
        "(Ljdk/incubator/foreign/MemorySegment;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$905.CryptImportPKCS8$FUNC, false
    );
    static final FunctionDescriptor CryptExportPKCS8$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptExportPKCS8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptExportPKCS8",
        "(JILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$905.CryptExportPKCS8$FUNC, false
    );
    static final FunctionDescriptor CryptExportPKCS8Ex$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptExportPKCS8Ex$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptExportPKCS8Ex",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$905.CryptExportPKCS8Ex$FUNC, false
    );
}

