// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1353 {

    static final FunctionDescriptor getservbyname$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle getservbyname$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "getservbyname",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1353.getservbyname$FUNC, false
    );
    static final FunctionDescriptor getprotobynumber$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle getprotobynumber$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "getprotobynumber",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1353.getprotobynumber$FUNC, false
    );
    static final FunctionDescriptor getprotobyname$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle getprotobyname$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "getprotobyname",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1353.getprotobyname$FUNC, false
    );
    static final FunctionDescriptor WSAStartup$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle WSAStartup$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WSAStartup",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1353.WSAStartup$FUNC, false
    );
    static final FunctionDescriptor WSACleanup$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle WSACleanup$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WSACleanup",
        "()I",
        constants$1353.WSACleanup$FUNC, false
    );
    static final FunctionDescriptor WSASetLastError$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle WSASetLastError$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WSASetLastError",
        "(I)V",
        constants$1353.WSASetLastError$FUNC, false
    );
}

