// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$95 {

    static final FunctionDescriptor write$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle write$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "write",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$95.write$FUNC, false
    );
    static final FunctionDescriptor __p__acmdln$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle __p__acmdln$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__p__acmdln",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$95.__p__acmdln$FUNC, false
    );
    static final FunctionDescriptor __p__wcmdln$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle __p__wcmdln$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__p__wcmdln",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$95.__p__wcmdln$FUNC, false
    );
    static final FunctionDescriptor _PVFV$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _PVFV$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$95._PVFV$FUNC, false
    );
    static final FunctionDescriptor _PIFV$FUNC = FunctionDescriptor.of(C_INT);
}

