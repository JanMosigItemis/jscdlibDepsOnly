// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$895 {

    static final FunctionDescriptor CertEnumPhysicalStore$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertEnumPhysicalStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertEnumPhysicalStore",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$895.CertEnumPhysicalStore$FUNC, false
    );
    static final FunctionDescriptor CertGetEnhancedKeyUsage$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertGetEnhancedKeyUsage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetEnhancedKeyUsage",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$895.CertGetEnhancedKeyUsage$FUNC, false
    );
    static final FunctionDescriptor CertSetEnhancedKeyUsage$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertSetEnhancedKeyUsage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertSetEnhancedKeyUsage",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$895.CertSetEnhancedKeyUsage$FUNC, false
    );
    static final FunctionDescriptor CertAddEnhancedKeyUsageIdentifier$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertAddEnhancedKeyUsageIdentifier$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertAddEnhancedKeyUsageIdentifier",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$895.CertAddEnhancedKeyUsageIdentifier$FUNC, false
    );
    static final FunctionDescriptor CertRemoveEnhancedKeyUsageIdentifier$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertRemoveEnhancedKeyUsageIdentifier$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertRemoveEnhancedKeyUsageIdentifier",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$895.CertRemoveEnhancedKeyUsageIdentifier$FUNC, false
    );
    static final FunctionDescriptor CertGetValidUsages$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertGetValidUsages$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetValidUsages",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$895.CertGetValidUsages$FUNC, false
    );
}

