// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1401 {

    static final FunctionDescriptor gpgrt_set_nonblock$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle gpgrt_set_nonblock$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_set_nonblock",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1401.gpgrt_set_nonblock$FUNC, false
    );
    static final FunctionDescriptor gpgrt_get_nonblock$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle gpgrt_get_nonblock$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_get_nonblock",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1401.gpgrt_get_nonblock$FUNC, false
    );
    static final FunctionDescriptor gpgrt_poll$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle gpgrt_poll$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_poll",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$1401.gpgrt_poll$FUNC, false
    );
    static final FunctionDescriptor gpgrt_tmpfile$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle gpgrt_tmpfile$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_tmpfile",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$1401.gpgrt_tmpfile$FUNC, false
    );
    static final FunctionDescriptor gpgrt_opaque_set$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_opaque_set$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_opaque_set",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1401.gpgrt_opaque_set$FUNC, false
    );
    static final FunctionDescriptor gpgrt_opaque_get$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_opaque_get$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_opaque_get",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1401.gpgrt_opaque_get$FUNC, false
    );
}

