// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$407 {

    static final FunctionDescriptor FileTimeToDosDateTime$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle FileTimeToDosDateTime$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FileTimeToDosDateTime",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$407.FileTimeToDosDateTime$FUNC, false
    );
    static final FunctionDescriptor DosDateTimeToFileTime$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle DosDateTimeToFileTime$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DosDateTimeToFileTime",
        "(SSLjdk/incubator/foreign/MemoryAddress;)I",
        constants$407.DosDateTimeToFileTime$FUNC, false
    );
    static final FunctionDescriptor SetSystemTimeAdjustment$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_INT
    );
    static final MethodHandle SetSystemTimeAdjustment$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetSystemTimeAdjustment",
        "(II)I",
        constants$407.SetSystemTimeAdjustment$FUNC, false
    );
    static final FunctionDescriptor GetThreadErrorMode$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle GetThreadErrorMode$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetThreadErrorMode",
        "()I",
        constants$407.GetThreadErrorMode$FUNC, false
    );
    static final FunctionDescriptor SetThreadErrorMode$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle SetThreadErrorMode$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetThreadErrorMode",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$407.SetThreadErrorMode$FUNC, false
    );
    static final FunctionDescriptor ClearCommBreak$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle ClearCommBreak$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ClearCommBreak",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$407.ClearCommBreak$FUNC, false
    );
}

