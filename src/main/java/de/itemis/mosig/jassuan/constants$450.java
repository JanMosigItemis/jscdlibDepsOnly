// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$450 {

    static final FunctionDescriptor ObjectOpenAuditAlarmA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle ObjectOpenAuditAlarmA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ObjectOpenAuditAlarmA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$450.ObjectOpenAuditAlarmA$FUNC, false
    );
    static final FunctionDescriptor ObjectPrivilegeAuditAlarmA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle ObjectPrivilegeAuditAlarmA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ObjectPrivilegeAuditAlarmA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$450.ObjectPrivilegeAuditAlarmA$FUNC, false
    );
    static final FunctionDescriptor ObjectCloseAuditAlarmA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle ObjectCloseAuditAlarmA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ObjectCloseAuditAlarmA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$450.ObjectCloseAuditAlarmA$FUNC, false
    );
    static final FunctionDescriptor ObjectDeleteAuditAlarmA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle ObjectDeleteAuditAlarmA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ObjectDeleteAuditAlarmA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$450.ObjectDeleteAuditAlarmA$FUNC, false
    );
    static final FunctionDescriptor PrivilegedServiceAuditAlarmA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PrivilegedServiceAuditAlarmA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PrivilegedServiceAuditAlarmA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$450.PrivilegedServiceAuditAlarmA$FUNC, false
    );
    static final FunctionDescriptor SetFileSecurityA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle SetFileSecurityA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetFileSecurityA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$450.SetFileSecurityA$FUNC, false
    );
}

