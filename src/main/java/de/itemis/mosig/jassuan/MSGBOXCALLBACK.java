// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface MSGBOXCALLBACK {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(MSGBOXCALLBACK fi) {
        return RuntimeHelper.upcallStub(MSGBOXCALLBACK.class, fi, constants$621.MSGBOXCALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(MSGBOXCALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(MSGBOXCALLBACK.class, fi, constants$621.MSGBOXCALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static MSGBOXCALLBACK ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$622.MSGBOXCALLBACK$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

