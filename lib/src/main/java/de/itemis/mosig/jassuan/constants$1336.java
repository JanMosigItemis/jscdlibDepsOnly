// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1336 {

    static final FunctionDescriptor NotifyServiceStatusChangeW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle NotifyServiceStatusChangeW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NotifyServiceStatusChangeW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1336.NotifyServiceStatusChangeW$FUNC, false
    );
    static final FunctionDescriptor IMCENUMPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle IMCENUMPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$1336.IMCENUMPROC$FUNC, false
    );
    static final FunctionDescriptor ImmInstallIMEA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ImmInstallIMEA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmInstallIMEA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1336.ImmInstallIMEA$FUNC, false
    );
    static final FunctionDescriptor ImmInstallIMEW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ImmInstallIMEW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmInstallIMEW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1336.ImmInstallIMEW$FUNC, false
    );
    static final FunctionDescriptor ImmGetDefaultIMEWnd$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle ImmGetDefaultIMEWnd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmGetDefaultIMEWnd",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1336.ImmGetDefaultIMEWnd$FUNC, false
    );
}

