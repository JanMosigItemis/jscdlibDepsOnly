// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$998 {

    static final FunctionDescriptor CoGetObjectContext$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoGetObjectContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoGetObjectContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$998.CoGetObjectContext$FUNC, false
    );
    static final FunctionDescriptor CoRegisterClassObject$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CoRegisterClassObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoRegisterClassObject",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$998.CoRegisterClassObject$FUNC, false
    );
    static final FunctionDescriptor CoRevokeClassObject$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle CoRevokeClassObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoRevokeClassObject",
        "(I)I",
        constants$998.CoRevokeClassObject$FUNC, false
    );
    static final FunctionDescriptor CoResumeClassObjects$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle CoResumeClassObjects$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoResumeClassObjects",
        "()I",
        constants$998.CoResumeClassObjects$FUNC, false
    );
    static final FunctionDescriptor CoSuspendClassObjects$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle CoSuspendClassObjects$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoSuspendClassObjects",
        "()I",
        constants$998.CoSuspendClassObjects$FUNC, false
    );
    static final FunctionDescriptor CoGetMalloc$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CoGetMalloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoGetMalloc",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$998.CoGetMalloc$FUNC, false
    );
}

