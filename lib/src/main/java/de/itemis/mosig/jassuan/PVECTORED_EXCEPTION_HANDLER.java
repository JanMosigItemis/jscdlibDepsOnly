// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PVECTORED_EXCEPTION_HANDLER {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PVECTORED_EXCEPTION_HANDLER fi) {
        return RuntimeHelper.upcallStub(PVECTORED_EXCEPTION_HANDLER.class, fi, constants$277.PVECTORED_EXCEPTION_HANDLER$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PVECTORED_EXCEPTION_HANDLER fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PVECTORED_EXCEPTION_HANDLER.class, fi, constants$277.PVECTORED_EXCEPTION_HANDLER$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PVECTORED_EXCEPTION_HANDLER ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$277.PVECTORED_EXCEPTION_HANDLER$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

