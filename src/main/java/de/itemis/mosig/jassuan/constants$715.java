// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$715 {

    static final FunctionDescriptor RegQueryValueExA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RegQueryValueExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegQueryValueExA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$715.RegQueryValueExA$FUNC, false
    );
    static final FunctionDescriptor RegQueryValueExW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RegQueryValueExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegQueryValueExW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$715.RegQueryValueExW$FUNC, false
    );
    static final FunctionDescriptor RegReplaceKeyA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RegReplaceKeyA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegReplaceKeyA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$715.RegReplaceKeyA$FUNC, false
    );
    static final FunctionDescriptor RegReplaceKeyW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RegReplaceKeyW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegReplaceKeyW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$715.RegReplaceKeyW$FUNC, false
    );
    static final FunctionDescriptor RegRestoreKeyA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle RegRestoreKeyA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegRestoreKeyA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$715.RegRestoreKeyA$FUNC, false
    );
    static final FunctionDescriptor RegRestoreKeyW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle RegRestoreKeyW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegRestoreKeyW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$715.RegRestoreKeyW$FUNC, false
    );
}

