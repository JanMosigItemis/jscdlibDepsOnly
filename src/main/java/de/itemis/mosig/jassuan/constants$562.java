// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$562 {

    static final FunctionDescriptor PeekMessageW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PeekMessageW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PeekMessageW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;III)I",
        constants$562.PeekMessageW$FUNC, false
    );
    static final FunctionDescriptor RegisterHotKey$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle RegisterHotKey$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegisterHotKey",
        "(Ljdk/incubator/foreign/MemoryAddress;III)I",
        constants$562.RegisterHotKey$FUNC, false
    );
    static final FunctionDescriptor UnregisterHotKey$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle UnregisterHotKey$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "UnregisterHotKey",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$562.UnregisterHotKey$FUNC, false
    );
    static final FunctionDescriptor ExitWindowsEx$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle ExitWindowsEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ExitWindowsEx",
        "(II)I",
        constants$562.ExitWindowsEx$FUNC, false
    );
    static final FunctionDescriptor SwapMouseButton$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle SwapMouseButton$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SwapMouseButton",
        "(I)I",
        constants$562.SwapMouseButton$FUNC, false
    );
    static final FunctionDescriptor GetMessagePos$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle GetMessagePos$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMessagePos",
        "()I",
        constants$562.GetMessagePos$FUNC, false
    );
}

