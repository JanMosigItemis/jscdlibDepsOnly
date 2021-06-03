// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$185 {

    static final FunctionDescriptor _heapset$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle _heapset$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_heapset",
        "(I)I",
        constants$185._heapset$FUNC, false
    );
    static final FunctionDescriptor _heapwalk$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _heapwalk$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_heapwalk",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$185._heapwalk$FUNC, false
    );
    static final FunctionDescriptor _heapused$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _heapused$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_heapused",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$185._heapused$FUNC, false
    );
    static final FunctionDescriptor _get_heap_handle$FUNC = FunctionDescriptor.of(C_LONG_LONG);
    static final MethodHandle _get_heap_handle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_get_heap_handle",
        "()J",
        constants$185._get_heap_handle$FUNC, false
    );
    static final FunctionDescriptor _MarkAllocaS$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _MarkAllocaS$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_MarkAllocaS",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$185._MarkAllocaS$FUNC, false
    );
    static final FunctionDescriptor _freea$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle _freea$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_freea",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$185._freea$FUNC, false
    );
}

