// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$165 {

    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle realloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "realloc",
        "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$165.realloc$FUNC, false
    );
    static final FunctionDescriptor _recalloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _recalloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_recalloc",
        "(Ljdk/incubator/foreign/MemoryAddress;JJ)Ljdk/incubator/foreign/MemoryAddress;",
        constants$165._recalloc$FUNC, false
    );
    static final FunctionDescriptor _aligned_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle _aligned_free$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_aligned_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$165._aligned_free$FUNC, false
    );
    static final FunctionDescriptor _aligned_malloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _aligned_malloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_aligned_malloc",
        "(JJ)Ljdk/incubator/foreign/MemoryAddress;",
        constants$165._aligned_malloc$FUNC, false
    );
    static final FunctionDescriptor _aligned_offset_malloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _aligned_offset_malloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_aligned_offset_malloc",
        "(JJJ)Ljdk/incubator/foreign/MemoryAddress;",
        constants$165._aligned_offset_malloc$FUNC, false
    );
    static final FunctionDescriptor _aligned_realloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _aligned_realloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_aligned_realloc",
        "(Ljdk/incubator/foreign/MemoryAddress;JJ)Ljdk/incubator/foreign/MemoryAddress;",
        constants$165._aligned_realloc$FUNC, false
    );
}

