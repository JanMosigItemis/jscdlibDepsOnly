// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$764 {

    static final FunctionDescriptor mixerGetLineControlsW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mixerGetLineControlsW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mixerGetLineControlsW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$764.mixerGetLineControlsW$FUNC, false
    );
    static final FunctionDescriptor mixerGetControlDetailsA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mixerGetControlDetailsA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mixerGetControlDetailsA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$764.mixerGetControlDetailsA$FUNC, false
    );
    static final FunctionDescriptor mixerGetControlDetailsW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mixerGetControlDetailsW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mixerGetControlDetailsW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$764.mixerGetControlDetailsW$FUNC, false
    );
    static final FunctionDescriptor mixerSetControlDetails$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mixerSetControlDetails$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mixerSetControlDetails",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$764.mixerSetControlDetails$FUNC, false
    );
    static final FunctionDescriptor TIMECALLBACK$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle TIMECALLBACK$MH = RuntimeHelper.downcallHandle(
        "(IIJJJ)V",
        constants$764.TIMECALLBACK$FUNC, false
    );
}

