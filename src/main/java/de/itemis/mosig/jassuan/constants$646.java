// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$646 {

    static final FunctionDescriptor ArrangeIconicWindows$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle ArrangeIconicWindows$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ArrangeIconicWindows",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$646.ArrangeIconicWindows$FUNC, false
    );
    static final FunctionDescriptor CreateMDIWindowA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle CreateMDIWindowA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateMDIWindowA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$646.CreateMDIWindowA$FUNC, false
    );
    static final FunctionDescriptor CreateMDIWindowW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle CreateMDIWindowW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateMDIWindowW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$646.CreateMDIWindowW$FUNC, false
    );
    static final FunctionDescriptor TileWindows$FUNC = FunctionDescriptor.of(C_SHORT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle TileWindows$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TileWindows",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)S",
        constants$646.TileWindows$FUNC, false
    );
    static final FunctionDescriptor CascadeWindows$FUNC = FunctionDescriptor.of(C_SHORT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle CascadeWindows$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CascadeWindows",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)S",
        constants$646.CascadeWindows$FUNC, false
    );
    static final FunctionDescriptor WinHelpA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG_LONG
    );
    static final MethodHandle WinHelpA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WinHelpA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IJ)I",
        constants$646.WinHelpA$FUNC, false
    );
}

