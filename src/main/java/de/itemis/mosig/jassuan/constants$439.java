// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$439 {

    static final FunctionDescriptor CopyFileW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle CopyFileW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CopyFileW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$439.CopyFileW$FUNC, false
    );
    static final FunctionDescriptor PCOPYFILE2_PROGRESS_ROUTINE$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PCOPYFILE2_PROGRESS_ROUTINE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$439.PCOPYFILE2_PROGRESS_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor CopyFile2$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CopyFile2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CopyFile2",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$439.CopyFile2$FUNC, false
    );
    static final FunctionDescriptor MoveFileA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle MoveFileA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "MoveFileA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$439.MoveFileA$FUNC, false
    );
    static final FunctionDescriptor MoveFileW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle MoveFileW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "MoveFileW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$439.MoveFileW$FUNC, false
    );
}

