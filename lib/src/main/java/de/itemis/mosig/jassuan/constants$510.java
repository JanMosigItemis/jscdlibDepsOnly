// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$510 {

    static final FunctionDescriptor RectVisible$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RectVisible$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RectVisible",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$510.RectVisible$FUNC, false
    );
    static final FunctionDescriptor Rectangle$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle Rectangle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "Rectangle",
        "(Ljdk/incubator/foreign/MemoryAddress;IIII)I",
        constants$510.Rectangle$FUNC, false
    );
    static final FunctionDescriptor RestoreDC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle RestoreDC$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RestoreDC",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$510.RestoreDC$FUNC, false
    );
    static final FunctionDescriptor ResetDCA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ResetDCA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ResetDCA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$510.ResetDCA$FUNC, false
    );
    static final FunctionDescriptor ResetDCW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ResetDCW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ResetDCW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$510.ResetDCW$FUNC, false
    );
    static final FunctionDescriptor RealizePalette$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle RealizePalette$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RealizePalette",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$510.RealizePalette$FUNC, false
    );
}

