// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$284 {

    static final FunctionDescriptor TpSetCallbackActivationContext$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle TpSetCallbackActivationContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TpSetCallbackActivationContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$284.TpSetCallbackActivationContext$FUNC, false
    );
    static final FunctionDescriptor TpSetCallbackNoActivationContext$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle TpSetCallbackNoActivationContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TpSetCallbackNoActivationContext",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$284.TpSetCallbackNoActivationContext$FUNC, false
    );
    static final FunctionDescriptor TpSetCallbackLongFunction$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle TpSetCallbackLongFunction$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TpSetCallbackLongFunction",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$284.TpSetCallbackLongFunction$FUNC, false
    );
    static final FunctionDescriptor TpSetCallbackRaceWithDll$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle TpSetCallbackRaceWithDll$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TpSetCallbackRaceWithDll",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$284.TpSetCallbackRaceWithDll$FUNC, false
    );
    static final FunctionDescriptor TpSetCallbackFinalizationCallback$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle TpSetCallbackFinalizationCallback$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TpSetCallbackFinalizationCallback",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$284.TpSetCallbackFinalizationCallback$FUNC, false
    );
    static final FunctionDescriptor TpSetCallbackPriority$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle TpSetCallbackPriority$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TpSetCallbackPriority",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$284.TpSetCallbackPriority$FUNC, false
    );
}

