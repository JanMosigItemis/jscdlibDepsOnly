// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$207 {

    static final FunctionDescriptor _mm_add_sd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle _mm_add_sd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_add_sd",
        "(DD)D",
        constants$207._mm_add_sd$FUNC, false
    );
    static final FunctionDescriptor _mm_add_pd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle _mm_add_pd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_add_pd",
        "(DD)D",
        constants$207._mm_add_pd$FUNC, false
    );
    static final FunctionDescriptor _mm_sub_sd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle _mm_sub_sd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_sub_sd",
        "(DD)D",
        constants$207._mm_sub_sd$FUNC, false
    );
    static final FunctionDescriptor _mm_sub_pd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle _mm_sub_pd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_sub_pd",
        "(DD)D",
        constants$207._mm_sub_pd$FUNC, false
    );
    static final FunctionDescriptor _mm_mul_sd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle _mm_mul_sd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_mul_sd",
        "(DD)D",
        constants$207._mm_mul_sd$FUNC, false
    );
    static final FunctionDescriptor _mm_mul_pd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle _mm_mul_pd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_mul_pd",
        "(DD)D",
        constants$207._mm_mul_pd$FUNC, false
    );
}

