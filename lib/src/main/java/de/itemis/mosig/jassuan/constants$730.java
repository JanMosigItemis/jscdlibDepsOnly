// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$730 {

    static final FunctionDescriptor PFNGETPROFILEPATHW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGETPROFILEPATHW$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$730.PFNGETPROFILEPATHW$FUNC, false
    );
    static final FunctionDescriptor PFNRECONCILEPROFILEA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle PFNRECONCILEPROFILEA$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$730.PFNRECONCILEPROFILEA$FUNC, false
    );
    static final FunctionDescriptor PFNRECONCILEPROFILEW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle PFNRECONCILEPROFILEW$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$730.PFNRECONCILEPROFILEW$FUNC, false
    );
    static final FunctionDescriptor PFNPROCESSPOLICIESA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
}

