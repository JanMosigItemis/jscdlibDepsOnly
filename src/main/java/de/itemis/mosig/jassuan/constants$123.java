// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$123 {

    static final FunctionDescriptor isleadbyte$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle isleadbyte$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "isleadbyte",
        "(I)I",
        constants$123.isleadbyte$FUNC, false
    );
    static final FunctionDescriptor _isleadbyte_l$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _isleadbyte_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_isleadbyte_l",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$123._isleadbyte_l$FUNC, false
    );
    static final FunctionDescriptor towupper$FUNC = FunctionDescriptor.of(C_SHORT,
        C_SHORT
    );
    static final MethodHandle towupper$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "towupper",
        "(S)S",
        constants$123.towupper$FUNC, false
    );
    static final FunctionDescriptor _towupper_l$FUNC = FunctionDescriptor.of(C_SHORT,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle _towupper_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_towupper_l",
        "(SLjdk/incubator/foreign/MemoryAddress;)S",
        constants$123._towupper_l$FUNC, false
    );
    static final FunctionDescriptor towlower$FUNC = FunctionDescriptor.of(C_SHORT,
        C_SHORT
    );
    static final MethodHandle towlower$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "towlower",
        "(S)S",
        constants$123.towlower$FUNC, false
    );
    static final FunctionDescriptor _towlower_l$FUNC = FunctionDescriptor.of(C_SHORT,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle _towlower_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_towlower_l",
        "(SLjdk/incubator/foreign/MemoryAddress;)S",
        constants$123._towlower_l$FUNC, false
    );
}

