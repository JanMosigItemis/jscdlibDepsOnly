// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$672 {

    static final FunctionDescriptor LCMapStringW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle LCMapStringW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LCMapStringW",
        "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$672.LCMapStringW$FUNC, false
    );
    static final FunctionDescriptor LCMapStringA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle LCMapStringA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LCMapStringA",
        "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$672.LCMapStringA$FUNC, false
    );
    static final FunctionDescriptor GetNumberFormatA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetNumberFormatA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetNumberFormatA",
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$672.GetNumberFormatA$FUNC, false
    );
    static final FunctionDescriptor GetNumberFormatW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetNumberFormatW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetNumberFormatW",
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$672.GetNumberFormatW$FUNC, false
    );
    static final FunctionDescriptor GetCurrencyFormatA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetCurrencyFormatA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetCurrencyFormatA",
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$672.GetCurrencyFormatA$FUNC, false
    );
    static final FunctionDescriptor GetCurrencyFormatW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetCurrencyFormatW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetCurrencyFormatW",
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$672.GetCurrencyFormatW$FUNC, false
    );
}

