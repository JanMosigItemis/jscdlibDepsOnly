// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$378 {

    static final FunctionDescriptor GetOsSafeBootMode$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle GetOsSafeBootMode$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetOsSafeBootMode",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$378.GetOsSafeBootMode$FUNC, false
    );
    static final FunctionDescriptor GetSystemDirectoryA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetSystemDirectoryA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSystemDirectoryA",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$378.GetSystemDirectoryA$FUNC, false
    );
    static final FunctionDescriptor GetSystemDirectoryW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetSystemDirectoryW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSystemDirectoryW",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$378.GetSystemDirectoryW$FUNC, false
    );
    static final FunctionDescriptor GetLogicalProcessorInformation$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetLogicalProcessorInformation$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetLogicalProcessorInformation",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$378.GetLogicalProcessorInformation$FUNC, false
    );
    static final FunctionDescriptor EnumSystemFirmwareTables$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle EnumSystemFirmwareTables$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumSystemFirmwareTables",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$378.EnumSystemFirmwareTables$FUNC, false
    );
    static final FunctionDescriptor GetSystemFirmwareTable$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetSystemFirmwareTable$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSystemFirmwareTable",
        "(IILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$378.GetSystemFirmwareTable$FUNC, false
    );
}

