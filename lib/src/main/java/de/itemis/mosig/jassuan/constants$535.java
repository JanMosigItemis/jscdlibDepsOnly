// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$535 {

    static final FunctionDescriptor GetKerningPairsA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetKerningPairsA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetKerningPairsA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$535.GetKerningPairsA$FUNC, false
    );
    static final FunctionDescriptor GetKerningPairsW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetKerningPairsW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetKerningPairsW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$535.GetKerningPairsW$FUNC, false
    );
    static final FunctionDescriptor GetDCOrgEx$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetDCOrgEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetDCOrgEx",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$535.GetDCOrgEx$FUNC, false
    );
    static final FunctionDescriptor FixBrushOrgEx$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle FixBrushOrgEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FixBrushOrgEx",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$535.FixBrushOrgEx$FUNC, false
    );
    static final FunctionDescriptor UnrealizeObject$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle UnrealizeObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "UnrealizeObject",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$535.UnrealizeObject$FUNC, false
    );
    static final FunctionDescriptor GdiFlush$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle GdiFlush$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GdiFlush",
        "()I",
        constants$535.GdiFlush$FUNC, false
    );
}

