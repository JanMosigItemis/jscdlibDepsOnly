// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$591 {

    static final FunctionDescriptor IsCharLowerA$FUNC = FunctionDescriptor.of(C_INT,
        C_CHAR
    );
    static final MethodHandle IsCharLowerA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsCharLowerA",
        "(B)I",
        constants$591.IsCharLowerA$FUNC, false
    );
    static final FunctionDescriptor IsCharLowerW$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT
    );
    static final MethodHandle IsCharLowerW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsCharLowerW",
        "(S)I",
        constants$591.IsCharLowerW$FUNC, false
    );
    static final FunctionDescriptor SetFocus$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetFocus$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetFocus",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$591.SetFocus$FUNC, false
    );
    static final FunctionDescriptor GetActiveWindow$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle GetActiveWindow$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetActiveWindow",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$591.GetActiveWindow$FUNC, false
    );
    static final FunctionDescriptor GetFocus$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle GetFocus$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFocus",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$591.GetFocus$FUNC, false
    );
    static final FunctionDescriptor GetKBCodePage$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle GetKBCodePage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetKBCodePage",
        "()I",
        constants$591.GetKBCodePage$FUNC, false
    );
}

