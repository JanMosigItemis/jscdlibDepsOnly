// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$563 {

    static final FunctionDescriptor GetMessageTime$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle GetMessageTime$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMessageTime",
        "()I",
        constants$563.GetMessageTime$FUNC, false
    );
    static final FunctionDescriptor GetMessageExtraInfo$FUNC = FunctionDescriptor.of(C_LONG_LONG);
    static final MethodHandle GetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMessageExtraInfo",
        "()J",
        constants$563.GetMessageExtraInfo$FUNC, false
    );
    static final FunctionDescriptor IsWow64Message$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle IsWow64Message$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsWow64Message",
        "()I",
        constants$563.IsWow64Message$FUNC, false
    );
    static final FunctionDescriptor SetMessageExtraInfo$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle SetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetMessageExtraInfo",
        "(J)J",
        constants$563.SetMessageExtraInfo$FUNC, false
    );
    static final FunctionDescriptor SendMessageA$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle SendMessageA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SendMessageA",
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J",
        constants$563.SendMessageA$FUNC, false
    );
    static final FunctionDescriptor SendMessageW$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle SendMessageW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SendMessageW",
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J",
        constants$563.SendMessageW$FUNC, false
    );
}

