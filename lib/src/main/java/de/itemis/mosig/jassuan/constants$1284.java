// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1284 {

    static final FunctionDescriptor SCardReconnect$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_LONG,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle SCardReconnect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardReconnect",
        "(JIIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1284.SCardReconnect$FUNC, false
    );
    static final FunctionDescriptor SCardDisconnect$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_LONG
    );
    static final MethodHandle SCardDisconnect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardDisconnect",
        "(JI)I",
        constants$1284.SCardDisconnect$FUNC, false
    );
    static final FunctionDescriptor SCardBeginTransaction$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG
    );
    static final MethodHandle SCardBeginTransaction$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardBeginTransaction",
        "(J)I",
        constants$1284.SCardBeginTransaction$FUNC, false
    );
    static final FunctionDescriptor SCardEndTransaction$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_LONG
    );
    static final MethodHandle SCardEndTransaction$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardEndTransaction",
        "(JI)I",
        constants$1284.SCardEndTransaction$FUNC, false
    );
    static final FunctionDescriptor SCardCancelTransaction$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG
    );
    static final MethodHandle SCardCancelTransaction$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardCancelTransaction",
        "(J)I",
        constants$1284.SCardCancelTransaction$FUNC, false
    );
    static final FunctionDescriptor SCardState$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SCardState$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardState",
        "(JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1284.SCardState$FUNC, false
    );
}

