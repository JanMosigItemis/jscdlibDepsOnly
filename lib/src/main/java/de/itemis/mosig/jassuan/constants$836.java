// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$836 {

    static final FunctionDescriptor SHInvokePrinterCommandA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SHInvokePrinterCommandA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHInvokePrinterCommandA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$836.SHInvokePrinterCommandA$FUNC, false
    );
    static final FunctionDescriptor SHInvokePrinterCommandW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SHInvokePrinterCommandW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHInvokePrinterCommandW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$836.SHInvokePrinterCommandW$FUNC, false
    );
    static final FunctionDescriptor SHLoadNonloadedIconOverlayIdentifiers$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle SHLoadNonloadedIconOverlayIdentifiers$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHLoadNonloadedIconOverlayIdentifiers",
        "()I",
        constants$836.SHLoadNonloadedIconOverlayIdentifiers$FUNC, false
    );
    static final FunctionDescriptor SHIsFileAvailableOffline$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SHIsFileAvailableOffline$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHIsFileAvailableOffline",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$836.SHIsFileAvailableOffline$FUNC, false
    );
    static final FunctionDescriptor SHSetLocalizedName$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SHSetLocalizedName$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHSetLocalizedName",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$836.SHSetLocalizedName$FUNC, false
    );
    static final FunctionDescriptor SHRemoveLocalizedName$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle SHRemoveLocalizedName$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHRemoveLocalizedName",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$836.SHRemoveLocalizedName$FUNC, false
    );
}

