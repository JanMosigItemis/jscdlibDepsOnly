// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$223 {

    static final FunctionDescriptor _mm_add_epi32$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _mm_add_epi32$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_add_epi32",
        "(JJ)J",
        constants$223._mm_add_epi32$FUNC, false
    );
    static final FunctionDescriptor _mm_add_si64$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _mm_add_si64$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_add_si64",
        "(JJ)J",
        constants$223._mm_add_si64$FUNC, false
    );
    static final FunctionDescriptor _mm_add_epi64$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _mm_add_epi64$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_add_epi64",
        "(JJ)J",
        constants$223._mm_add_epi64$FUNC, false
    );
    static final FunctionDescriptor _mm_adds_epi8$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _mm_adds_epi8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_adds_epi8",
        "(JJ)J",
        constants$223._mm_adds_epi8$FUNC, false
    );
    static final FunctionDescriptor _mm_adds_epi16$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _mm_adds_epi16$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_adds_epi16",
        "(JJ)J",
        constants$223._mm_adds_epi16$FUNC, false
    );
    static final FunctionDescriptor _mm_adds_epu8$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _mm_adds_epu8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_adds_epu8",
        "(JJ)J",
        constants$223._mm_adds_epu8$FUNC, false
    );
}

