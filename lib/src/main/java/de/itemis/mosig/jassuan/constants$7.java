// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$7 {

    static final FunctionDescriptor _filbuf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _filbuf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_filbuf",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$7._filbuf$FUNC, false
    );
    static final FunctionDescriptor _flsbuf$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _flsbuf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_flsbuf",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$7._flsbuf$FUNC, false
    );
    static final FunctionDescriptor _fsopen$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _fsopen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_fsopen",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$7._fsopen$FUNC, false
    );
    static final FunctionDescriptor clearerr$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle clearerr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "clearerr",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$7.clearerr$FUNC, false
    );
    static final FunctionDescriptor fclose$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle fclose$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "fclose",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$7.fclose$FUNC, false
    );
    static final FunctionDescriptor _fcloseall$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle _fcloseall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_fcloseall",
        "()I",
        constants$7._fcloseall$FUNC, false
    );
}

