// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$113 {

    static final FunctionDescriptor __updatetlocinfo$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle __updatetlocinfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__updatetlocinfo",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$113.__updatetlocinfo$FUNC, false
    );
    static final FunctionDescriptor __updatetmbcinfo$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle __updatetmbcinfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__updatetmbcinfo",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$113.__updatetmbcinfo$FUNC, false
    );
    static final FunctionDescriptor _isctype$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle _isctype$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_isctype",
        "(II)I",
        constants$113._isctype$FUNC, false
    );
    static final FunctionDescriptor _isctype_l$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _isctype_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_isctype_l",
        "(IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$113._isctype_l$FUNC, false
    );
    static final FunctionDescriptor isalpha$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle isalpha$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "isalpha",
        "(I)I",
        constants$113.isalpha$FUNC, false
    );
    static final FunctionDescriptor _isalpha_l$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _isalpha_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_isalpha_l",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$113._isalpha_l$FUNC, false
    );
}

