// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$671 {

    static final FunctionDescriptor IsDBCSLeadByteEx$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_CHAR
    );
    static final MethodHandle IsDBCSLeadByteEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsDBCSLeadByteEx",
        "(IB)I",
        constants$671.IsDBCSLeadByteEx$FUNC, false
    );
    static final FunctionDescriptor IsNLSDefinedString$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle IsNLSDefinedString$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsNLSDefinedString",
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$671.IsNLSDefinedString$FUNC, false
    );
    static final FunctionDescriptor GetLocaleInfoW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetLocaleInfoW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetLocaleInfoW",
        "(IILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$671.GetLocaleInfoW$FUNC, false
    );
    static final FunctionDescriptor GetLocaleInfoA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetLocaleInfoA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetLocaleInfoA",
        "(IILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$671.GetLocaleInfoA$FUNC, false
    );
    static final FunctionDescriptor GetOEMCP$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle GetOEMCP$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetOEMCP",
        "()I",
        constants$671.GetOEMCP$FUNC, false
    );
    static final FunctionDescriptor CompareStringA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle CompareStringA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CompareStringA",
        "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$671.CompareStringA$FUNC, false
    );
}

