// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$573 {

    static final FunctionDescriptor UpdateLayeredWindow$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle UpdateLayeredWindow$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "UpdateLayeredWindow",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$573.UpdateLayeredWindow$FUNC, false
    );
    static final FunctionDescriptor UpdateLayeredWindowIndirect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle UpdateLayeredWindowIndirect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "UpdateLayeredWindowIndirect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$573.UpdateLayeredWindowIndirect$FUNC, false
    );
    static final FunctionDescriptor GetLayeredWindowAttributes$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetLayeredWindowAttributes$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetLayeredWindowAttributes",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$573.GetLayeredWindowAttributes$FUNC, false
    );
    static final FunctionDescriptor PrintWindow$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PrintWindow$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PrintWindow",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$573.PrintWindow$FUNC, false
    );
    static final FunctionDescriptor SetLayeredWindowAttributes$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_CHAR,
        C_LONG
    );
    static final MethodHandle SetLayeredWindowAttributes$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetLayeredWindowAttributes",
        "(Ljdk/incubator/foreign/MemoryAddress;IBI)I",
        constants$573.SetLayeredWindowAttributes$FUNC, false
    );
    static final FunctionDescriptor ShowWindowAsync$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle ShowWindowAsync$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ShowWindowAsync",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$573.ShowWindowAsync$FUNC, false
    );
}

