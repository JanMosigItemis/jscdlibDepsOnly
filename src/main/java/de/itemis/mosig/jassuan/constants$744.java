// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$744 {

    static final FunctionDescriptor SendDriverMessage$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle SendDriverMessage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SendDriverMessage",
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J",
        constants$744.SendDriverMessage$FUNC, false
    );
    static final FunctionDescriptor DrvGetModuleHandle$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle DrvGetModuleHandle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DrvGetModuleHandle",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$744.DrvGetModuleHandle$FUNC, false
    );
    static final FunctionDescriptor GetDriverModuleHandle$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetDriverModuleHandle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetDriverModuleHandle",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$744.GetDriverModuleHandle$FUNC, false
    );
    static final FunctionDescriptor DefDriverProc$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle DefDriverProc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DefDriverProc",
        "(JLjdk/incubator/foreign/MemoryAddress;IJJ)J",
        constants$744.DefDriverProc$FUNC, false
    );
    static final FunctionDescriptor DRVCALLBACK$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle DRVCALLBACK$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IJJJ)V",
        constants$744.DRVCALLBACK$FUNC, false
    );
}

