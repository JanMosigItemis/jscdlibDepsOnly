// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$544 {

    static final FunctionDescriptor WNDPROC$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle WNDPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J",
        constants$544.WNDPROC$FUNC, false
    );
    static final FunctionDescriptor DLGPROC$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle DLGPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J",
        constants$544.DLGPROC$FUNC, false
    );
    static final FunctionDescriptor TIMERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG
    );
    static final MethodHandle TIMERPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IJI)V",
        constants$544.TIMERPROC$FUNC, false
    );
    static final FunctionDescriptor GRAYSTRINGPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_INT
    );
}

