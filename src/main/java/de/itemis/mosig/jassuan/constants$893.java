// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$893 {

    static final FunctionDescriptor CertRegisterSystemStore$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertRegisterSystemStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertRegisterSystemStore",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$893.CertRegisterSystemStore$FUNC, false
    );
    static final FunctionDescriptor CertRegisterPhysicalStore$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertRegisterPhysicalStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertRegisterPhysicalStore",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$893.CertRegisterPhysicalStore$FUNC, false
    );
    static final FunctionDescriptor CertUnregisterSystemStore$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertUnregisterSystemStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertUnregisterSystemStore",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$893.CertUnregisterSystemStore$FUNC, false
    );
    static final FunctionDescriptor CertUnregisterPhysicalStore$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CertUnregisterPhysicalStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertUnregisterPhysicalStore",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$893.CertUnregisterPhysicalStore$FUNC, false
    );
    static final FunctionDescriptor PFN_CERT_ENUM_SYSTEM_STORE_LOCATION$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFN_CERT_ENUM_SYSTEM_STORE_LOCATION$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$893.PFN_CERT_ENUM_SYSTEM_STORE_LOCATION$FUNC, false
    );
}

