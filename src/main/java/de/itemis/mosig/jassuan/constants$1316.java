// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1316 {

    static final FunctionDescriptor CloseSpoolFileHandle$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CloseSpoolFileHandle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CloseSpoolFileHandle",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1316.CloseSpoolFileHandle$FUNC, false
    );
    static final FunctionDescriptor OpenPrinter2A$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OpenPrinter2A$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenPrinter2A",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1316.OpenPrinter2A$FUNC, false
    );
    static final FunctionDescriptor OpenPrinter2W$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OpenPrinter2W$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenPrinter2W",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1316.OpenPrinter2W$FUNC, false
    );
    static final FunctionDescriptor UploadPrinterDriverPackageA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle UploadPrinterDriverPackageA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "UploadPrinterDriverPackageA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1316.UploadPrinterDriverPackageA$FUNC, false
    );
    static final FunctionDescriptor UploadPrinterDriverPackageW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle UploadPrinterDriverPackageW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "UploadPrinterDriverPackageW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1316.UploadPrinterDriverPackageW$FUNC, false
    );
    static final MemoryLayout IID_IPrintDialogCallback$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPrintDialogCallback$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IPrintDialogCallback", constants$1316.IID_IPrintDialogCallback$LAYOUT);
}

