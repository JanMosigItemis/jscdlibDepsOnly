// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$834 {

    static final FunctionDescriptor SHQueryUserNotificationState$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle SHQueryUserNotificationState$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHQueryUserNotificationState",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$834.SHQueryUserNotificationState$FUNC, false
    );
    static final FunctionDescriptor SHGetPropertyStoreForWindow$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SHGetPropertyStoreForWindow$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHGetPropertyStoreForWindow",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$834.SHGetPropertyStoreForWindow$FUNC, false
    );
    static final FunctionDescriptor Shell_NotifyIconA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle Shell_NotifyIconA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "Shell_NotifyIconA",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$834.Shell_NotifyIconA$FUNC, false
    );
    static final FunctionDescriptor Shell_NotifyIconW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle Shell_NotifyIconW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "Shell_NotifyIconW",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$834.Shell_NotifyIconW$FUNC, false
    );
    static final FunctionDescriptor Shell_NotifyIconGetRect$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Shell_NotifyIconGetRect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "Shell_NotifyIconGetRect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$834.Shell_NotifyIconGetRect$FUNC, false
    );
    static final FunctionDescriptor SHGetFileInfoA$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle SHGetFileInfoA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHGetFileInfoA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)J",
        constants$834.SHGetFileInfoA$FUNC, false
    );
}

