// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$674 {

    static final FunctionDescriptor EnumDateFormatsA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle EnumDateFormatsA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumDateFormatsA",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$674.EnumDateFormatsA$FUNC, false
    );
    static final FunctionDescriptor EnumDateFormatsW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle EnumDateFormatsW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumDateFormatsW",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$674.EnumDateFormatsW$FUNC, false
    );
    static final FunctionDescriptor EnumDateFormatsExA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle EnumDateFormatsExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumDateFormatsExA",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$674.EnumDateFormatsExA$FUNC, false
    );
    static final FunctionDescriptor EnumDateFormatsExW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle EnumDateFormatsExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumDateFormatsExW",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$674.EnumDateFormatsExW$FUNC, false
    );
    static final FunctionDescriptor IsValidLanguageGroup$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle IsValidLanguageGroup$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsValidLanguageGroup",
        "(II)I",
        constants$674.IsValidLanguageGroup$FUNC, false
    );
    static final FunctionDescriptor GetNLSVersion$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetNLSVersion$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetNLSVersion",
        "(IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$674.GetNLSVersion$FUNC, false
    );
}

