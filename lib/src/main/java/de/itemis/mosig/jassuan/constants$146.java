// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$146 {

    static final FunctionDescriptor _i64tow_s$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_INT
    );
    static final MethodHandle _i64tow_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_i64tow_s",
        "(JLjdk/incubator/foreign/MemoryAddress;JI)I",
        constants$146._i64tow_s$FUNC, false
    );
    static final FunctionDescriptor _ui64tow_s$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_INT
    );
    static final MethodHandle _ui64tow_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_ui64tow_s",
        "(JLjdk/incubator/foreign/MemoryAddress;JI)I",
        constants$146._ui64tow_s$FUNC, false
    );
    static final FunctionDescriptor _wmakepath_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _wmakepath_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wmakepath_s",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$146._wmakepath_s$FUNC, false
    );
    static final FunctionDescriptor _wputenv_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _wputenv_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wputenv_s",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$146._wputenv_s$FUNC, false
    );
    static final FunctionDescriptor _wsearchenv_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle _wsearchenv_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wsearchenv_s",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$146._wsearchenv_s$FUNC, false
    );
    static final FunctionDescriptor _wsplitpath_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle _wsplitpath_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wsplitpath_s",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;J)I",
        constants$146._wsplitpath_s$FUNC, false
    );
}

