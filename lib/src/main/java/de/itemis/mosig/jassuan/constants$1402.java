// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1402 {

    static final FunctionDescriptor gpgrt_fname_set$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_fname_set$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_fname_set",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1402.gpgrt_fname_set$FUNC, false
    );
    static final FunctionDescriptor gpgrt_fname_get$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_fname_get$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_fname_get",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1402.gpgrt_fname_get$FUNC, false
    );
    static final FunctionDescriptor gpgrt_asprintf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_asprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_asprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$1402.gpgrt_asprintf$FUNC, true
    );
    static final FunctionDescriptor gpgrt_vasprintf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_vasprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_vasprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1402.gpgrt_vasprintf$FUNC, false
    );
    static final FunctionDescriptor gpgrt_bsprintf$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_bsprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_bsprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1402.gpgrt_bsprintf$FUNC, true
    );
    static final FunctionDescriptor gpgrt_vbsprintf$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_vbsprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_vbsprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1402.gpgrt_vbsprintf$FUNC, false
    );
}

