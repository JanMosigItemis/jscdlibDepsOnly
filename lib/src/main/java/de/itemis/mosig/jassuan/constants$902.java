// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$902 {

    static final FunctionDescriptor CertGetIntendedKeyUsage$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertGetIntendedKeyUsage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetIntendedKeyUsage",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$902.CertGetIntendedKeyUsage$FUNC, false
    );
    static final FunctionDescriptor CryptInstallDefaultContext$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptInstallDefaultContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptInstallDefaultContext",
        "(JILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$902.CryptInstallDefaultContext$FUNC, false
    );
    static final FunctionDescriptor CryptUninstallDefaultContext$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CryptUninstallDefaultContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptUninstallDefaultContext",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$902.CryptUninstallDefaultContext$FUNC, false
    );
    static final FunctionDescriptor CryptExportPublicKeyInfo$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptExportPublicKeyInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptExportPublicKeyInfo",
        "(JIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$902.CryptExportPublicKeyInfo$FUNC, false
    );
    static final FunctionDescriptor CryptExportPublicKeyInfoEx$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptExportPublicKeyInfoEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptExportPublicKeyInfoEx",
        "(JIILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$902.CryptExportPublicKeyInfoEx$FUNC, false
    );
    static final FunctionDescriptor PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_EX2_FUNC$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
}

