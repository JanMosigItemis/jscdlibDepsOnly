// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$388 {

    static final FunctionDescriptor Beep$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle Beep$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "Beep",
        "(II)I",
        constants$388.Beep$FUNC, false
    );
    static final FunctionDescriptor Wow64DisableWow64FsRedirection$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle Wow64DisableWow64FsRedirection$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "Wow64DisableWow64FsRedirection",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$388.Wow64DisableWow64FsRedirection$FUNC, false
    );
    static final FunctionDescriptor Wow64RevertWow64FsRedirection$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle Wow64RevertWow64FsRedirection$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "Wow64RevertWow64FsRedirection",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$388.Wow64RevertWow64FsRedirection$FUNC, false
    );
    static final FunctionDescriptor GetSystemWow64DirectoryA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetSystemWow64DirectoryA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSystemWow64DirectoryA",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$388.GetSystemWow64DirectoryA$FUNC, false
    );
    static final FunctionDescriptor GetSystemWow64DirectoryW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetSystemWow64DirectoryW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSystemWow64DirectoryW",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$388.GetSystemWow64DirectoryW$FUNC, false
    );
    static final FunctionDescriptor Wow64GetThreadContext$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Wow64GetThreadContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "Wow64GetThreadContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$388.Wow64GetThreadContext$FUNC, false
    );
}

