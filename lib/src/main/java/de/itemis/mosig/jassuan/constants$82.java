// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$82 {

    static final FunctionDescriptor _dup$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle _dup$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_dup",
        "(I)I",
        constants$82._dup$FUNC, false
    );
    static final FunctionDescriptor _dup2$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle _dup2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_dup2",
        "(II)I",
        constants$82._dup2$FUNC, false
    );
    static final FunctionDescriptor _eof$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle _eof$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_eof",
        "(I)I",
        constants$82._eof$FUNC, false
    );
    static final FunctionDescriptor _filelength$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT
    );
    static final MethodHandle _filelength$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_filelength",
        "(I)I",
        constants$82._filelength$FUNC, false
    );
    static final FunctionDescriptor _findfirst32$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _findfirst32$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_findfirst32",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$82._findfirst32$FUNC, false
    );
    static final FunctionDescriptor _findnext32$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _findnext32$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_findnext32",
        "(JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$82._findnext32$FUNC, false
    );
}

