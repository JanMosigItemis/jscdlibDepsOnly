// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$755 {

    static final FunctionDescriptor midiStreamOut$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle midiStreamOut$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiStreamOut",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$755.midiStreamOut$FUNC, false
    );
    static final FunctionDescriptor midiStreamPause$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle midiStreamPause$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiStreamPause",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$755.midiStreamPause$FUNC, false
    );
    static final FunctionDescriptor midiStreamRestart$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle midiStreamRestart$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiStreamRestart",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$755.midiStreamRestart$FUNC, false
    );
    static final FunctionDescriptor midiStreamStop$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle midiStreamStop$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiStreamStop",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$755.midiStreamStop$FUNC, false
    );
    static final FunctionDescriptor midiConnect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle midiConnect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiConnect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$755.midiConnect$FUNC, false
    );
    static final FunctionDescriptor midiDisconnect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle midiDisconnect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiDisconnect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$755.midiDisconnect$FUNC, false
    );
}

