// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1323 {

    static final FunctionDescriptor PageSetupDlgA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle PageSetupDlgA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PageSetupDlgA",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1323.PageSetupDlgA$FUNC, false
    );
    static final FunctionDescriptor PageSetupDlgW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle PageSetupDlgW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PageSetupDlgW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1323.PageSetupDlgW$FUNC, false
    );
    static final FunctionDescriptor uaw_CharUpperW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle uaw_CharUpperW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "uaw_CharUpperW",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1323.uaw_CharUpperW$FUNC, false
    );
    static final FunctionDescriptor uaw_lstrcmpW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle uaw_lstrcmpW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "uaw_lstrcmpW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1323.uaw_lstrcmpW$FUNC, false
    );
    static final FunctionDescriptor uaw_lstrcmpiW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle uaw_lstrcmpiW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "uaw_lstrcmpiW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1323.uaw_lstrcmpiW$FUNC, false
    );
    static final FunctionDescriptor uaw_lstrlenW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle uaw_lstrlenW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "uaw_lstrlenW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1323.uaw_lstrlenW$FUNC, false
    );
}

