// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$243 {

    static final FunctionDescriptor _mm_castpd_si128$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_DOUBLE
    );
    static final MethodHandle _mm_castpd_si128$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_castpd_si128",
        "(D)J",
        constants$243._mm_castpd_si128$FUNC, false
    );
    static final FunctionDescriptor _mm_castps_pd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_FLOAT
    );
    static final MethodHandle _mm_castps_pd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_castps_pd",
        "(F)D",
        constants$243._mm_castps_pd$FUNC, false
    );
    static final FunctionDescriptor _mm_castps_si128$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_FLOAT
    );
    static final MethodHandle _mm_castps_si128$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_castps_si128",
        "(F)J",
        constants$243._mm_castps_si128$FUNC, false
    );
    static final FunctionDescriptor _mm_castsi128_ps$FUNC = FunctionDescriptor.of(C_FLOAT,
        C_LONG_LONG
    );
    static final MethodHandle _mm_castsi128_ps$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_castsi128_ps",
        "(J)F",
        constants$243._mm_castsi128_ps$FUNC, false
    );
    static final FunctionDescriptor _mm_castsi128_pd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_LONG_LONG
    );
    static final MethodHandle _mm_castsi128_pd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_castsi128_pd",
        "(J)D",
        constants$243._mm_castsi128_pd$FUNC, false
    );
    static final FunctionDescriptor _mm_pause$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _mm_pause$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_pause",
        "()V",
        constants$243._mm_pause$FUNC, false
    );
}

