// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$571 {

    static final FunctionDescriptor RegisterDeviceNotificationW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle RegisterDeviceNotificationW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegisterDeviceNotificationW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$571.RegisterDeviceNotificationW$FUNC, false
    );
    static final FunctionDescriptor UnregisterDeviceNotification$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle UnregisterDeviceNotification$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "UnregisterDeviceNotification",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$571.UnregisterDeviceNotification$FUNC, false
    );
    static final FunctionDescriptor PREGISTERCLASSNAMEW$FUNC = FunctionDescriptor.of(C_CHAR,
        C_POINTER
    );
    static final MethodHandle PREGISTERCLASSNAMEW$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)B",
        constants$571.PREGISTERCLASSNAMEW$FUNC, false
    );
    static final FunctionDescriptor CreateWindowExA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateWindowExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateWindowExA",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$571.CreateWindowExA$FUNC, false
    );
    static final FunctionDescriptor CreateWindowExW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateWindowExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateWindowExW",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$571.CreateWindowExW$FUNC, false
    );
}

