// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$154 {

    static final FunctionDescriptor abs$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle abs$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "abs",
        "(I)I",
        constants$154.abs$FUNC, false
    );
    static final FunctionDescriptor labs$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle labs$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "labs",
        "(I)I",
        constants$154.labs$FUNC, false
    );
    static final FunctionDescriptor _abs64$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _abs64$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_abs64",
        "(J)J",
        constants$154._abs64$FUNC, false
    );
    static final FunctionDescriptor atexit$x0$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$x0$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$154.atexit$x0$FUNC, false
    );
    static final FunctionDescriptor atexit$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle atexit$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "atexit",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$154.atexit$FUNC, false
    );
}

