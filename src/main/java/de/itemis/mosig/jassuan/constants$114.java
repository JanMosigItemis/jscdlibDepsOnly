// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$114 {

    static final FunctionDescriptor isupper$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle isupper$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "isupper",
        "(I)I",
        constants$114.isupper$FUNC, false
    );
    static final FunctionDescriptor _isupper_l$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _isupper_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_isupper_l",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$114._isupper_l$FUNC, false
    );
    static final FunctionDescriptor islower$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle islower$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "islower",
        "(I)I",
        constants$114.islower$FUNC, false
    );
    static final FunctionDescriptor _islower_l$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _islower_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_islower_l",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$114._islower_l$FUNC, false
    );
    static final FunctionDescriptor isdigit$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle isdigit$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "isdigit",
        "(I)I",
        constants$114.isdigit$FUNC, false
    );
    static final FunctionDescriptor _isdigit_l$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _isdigit_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_isdigit_l",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$114._isdigit_l$FUNC, false
    );
}

