// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1315 {

    static final FunctionDescriptor GetPrinterDriver2W$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetPrinterDriver2W$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetPrinterDriver2W",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1315.GetPrinterDriver2W$FUNC, false
    );
    static final FunctionDescriptor GetPrinterDriverPackagePathA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetPrinterDriverPackagePathA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetPrinterDriverPackagePathA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1315.GetPrinterDriverPackagePathA$FUNC, false
    );
    static final FunctionDescriptor GetPrinterDriverPackagePathW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetPrinterDriverPackagePathW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetPrinterDriverPackagePathW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1315.GetPrinterDriverPackagePathW$FUNC, false
    );
    static final FunctionDescriptor GetSpoolFileHandleA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetSpoolFileHandleA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSpoolFileHandleA",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1315.GetSpoolFileHandleA$FUNC, false
    );
    static final FunctionDescriptor GetSpoolFileHandleW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetSpoolFileHandleW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSpoolFileHandleW",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1315.GetSpoolFileHandleW$FUNC, false
    );
    static final FunctionDescriptor CommitSpoolData$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CommitSpoolData$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CommitSpoolData",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1315.CommitSpoolData$FUNC, false
    );
}

