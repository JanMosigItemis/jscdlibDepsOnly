// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$554 {

    static final FunctionDescriptor GetKeyboardLayoutList$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetKeyboardLayoutList$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetKeyboardLayoutList",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$554.GetKeyboardLayoutList$FUNC, false
    );
    static final FunctionDescriptor GetKeyboardLayout$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG
    );
    static final MethodHandle GetKeyboardLayout$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetKeyboardLayout",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$554.GetKeyboardLayout$FUNC, false
    );
    static final FunctionDescriptor GetMouseMovePointsEx$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle GetMouseMovePointsEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMouseMovePointsEx",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$554.GetMouseMovePointsEx$FUNC, false
    );
    static final FunctionDescriptor CreateDesktopA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CreateDesktopA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateDesktopA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$554.CreateDesktopA$FUNC, false
    );
    static final FunctionDescriptor CreateDesktopW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CreateDesktopW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateDesktopW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$554.CreateDesktopW$FUNC, false
    );
    static final FunctionDescriptor CreateDesktopExA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CreateDesktopExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateDesktopExA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$554.CreateDesktopExA$FUNC, false
    );
}

