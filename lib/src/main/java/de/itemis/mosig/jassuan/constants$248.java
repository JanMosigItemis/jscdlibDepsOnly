// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$248 {

    static final FunctionDescriptor __getcallerseflags$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle __getcallerseflags$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__getcallerseflags",
        "()I",
        constants$248.__getcallerseflags$FUNC, false
    );
    static final FunctionDescriptor __segmentlimit$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle __segmentlimit$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__segmentlimit",
        "(I)I",
        constants$248.__segmentlimit$FUNC, false
    );
    static final FunctionDescriptor __mulh$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle __mulh$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__mulh",
        "(JJ)J",
        constants$248.__mulh$FUNC, false
    );
    static final FunctionDescriptor __umulh$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle __umulh$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__umulh",
        "(JJ)J",
        constants$248.__umulh$FUNC, false
    );
    static final FunctionDescriptor __shiftleft128$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG,
        C_CHAR
    );
    static final MethodHandle __shiftleft128$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__shiftleft128",
        "(JJB)J",
        constants$248.__shiftleft128$FUNC, false
    );
    static final FunctionDescriptor __shiftright128$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG,
        C_CHAR
    );
    static final MethodHandle __shiftright128$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__shiftright128",
        "(JJB)J",
        constants$248.__shiftright128$FUNC, false
    );
}

