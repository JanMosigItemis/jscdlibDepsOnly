// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1354 {

    static final FunctionDescriptor WSAGetLastError$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle WSAGetLastError$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WSAGetLastError",
        "()I",
        constants$1354.WSAGetLastError$FUNC, false
    );
    static final FunctionDescriptor WSAIsBlocking$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle WSAIsBlocking$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WSAIsBlocking",
        "()I",
        constants$1354.WSAIsBlocking$FUNC, false
    );
    static final FunctionDescriptor WSAUnhookBlockingHook$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle WSAUnhookBlockingHook$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WSAUnhookBlockingHook",
        "()I",
        constants$1354.WSAUnhookBlockingHook$FUNC, false
    );
    static final FunctionDescriptor WSASetBlockingHook$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle WSASetBlockingHook$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WSASetBlockingHook",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1354.WSASetBlockingHook$FUNC, false
    );
    static final FunctionDescriptor WSACancelBlockingCall$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle WSACancelBlockingCall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WSACancelBlockingCall",
        "()I",
        constants$1354.WSACancelBlockingCall$FUNC, false
    );
    static final FunctionDescriptor WSAAsyncGetServByName$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle WSAAsyncGetServByName$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WSAAsyncGetServByName",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1354.WSAAsyncGetServByName$FUNC, false
    );
}

