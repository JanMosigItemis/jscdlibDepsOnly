// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1270 {

    static final FunctionDescriptor ReleaseStgMedium$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle ReleaseStgMedium$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ReleaseStgMedium",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1270.ReleaseStgMedium$FUNC, false
    );
    static final FunctionDescriptor CreateOleAdviseHolder$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle CreateOleAdviseHolder$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateOleAdviseHolder",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1270.CreateOleAdviseHolder$FUNC, false
    );
    static final FunctionDescriptor OleCreateDefaultHandler$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OleCreateDefaultHandler$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OleCreateDefaultHandler",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1270.OleCreateDefaultHandler$FUNC, false
    );
    static final FunctionDescriptor OleCreateEmbeddingHelper$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OleCreateEmbeddingHelper$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OleCreateEmbeddingHelper",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1270.OleCreateEmbeddingHelper$FUNC, false
    );
    static final FunctionDescriptor IsAccelerator$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IsAccelerator$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsAccelerator",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1270.IsAccelerator$FUNC, false
    );
    static final FunctionDescriptor OleGetIconOfFile$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle OleGetIconOfFile$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OleGetIconOfFile",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1270.OleGetIconOfFile$FUNC, false
    );
}

