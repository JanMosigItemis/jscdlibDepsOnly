// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1379 {

    static final FunctionDescriptor gpgrt_abort$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gpgrt_abort$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_abort",
        "()V",
        constants$1379.gpgrt_abort$FUNC, false
    );
    static final FunctionDescriptor gpg_err_make$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle gpg_err_make$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpg_err_make",
        "(II)I",
        constants$1379.gpg_err_make$FUNC, false
    );
    static final FunctionDescriptor gpg_error$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle gpg_error$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpg_error",
        "(I)I",
        constants$1379.gpg_error$FUNC, false
    );
    static final FunctionDescriptor gpg_err_code$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle gpg_err_code$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpg_err_code",
        "(I)I",
        constants$1379.gpg_err_code$FUNC, false
    );
    static final FunctionDescriptor gpg_err_source$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle gpg_err_source$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpg_err_source",
        "(I)I",
        constants$1379.gpg_err_source$FUNC, false
    );
    static final FunctionDescriptor gpg_strerror$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle gpg_strerror$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpg_strerror",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1379.gpg_strerror$FUNC, false
    );
}

