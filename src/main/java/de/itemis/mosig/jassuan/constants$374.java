// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$374 {

    static final FunctionDescriptor CreateWaitableTimerExW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle CreateWaitableTimerExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateWaitableTimerExW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$374.CreateWaitableTimerExW$FUNC, false
    );
    static final FunctionDescriptor SetWaitableTimerEx$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SetWaitableTimerEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetWaitableTimerEx",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$374.SetWaitableTimerEx$FUNC, false
    );
    static final FunctionDescriptor GetSystemTime$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle GetSystemTime$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSystemTime",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$374.GetSystemTime$FUNC, false
    );
    static final FunctionDescriptor GetSystemTimeAsFileTime$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle GetSystemTimeAsFileTime$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSystemTimeAsFileTime",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$374.GetSystemTimeAsFileTime$FUNC, false
    );
    static final FunctionDescriptor GetLocalTime$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle GetLocalTime$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetLocalTime",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$374.GetLocalTime$FUNC, false
    );
    static final FunctionDescriptor GetNativeSystemInfo$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle GetNativeSystemInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetNativeSystemInfo",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$374.GetNativeSystemInfo$FUNC, false
    );
}

