// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_SC_NOTIFY_CALLBACK {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFN_SC_NOTIFY_CALLBACK fi) {
        return RuntimeHelper.upcallStub(PFN_SC_NOTIFY_CALLBACK.class, fi, constants$1335.PFN_SC_NOTIFY_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFN_SC_NOTIFY_CALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_SC_NOTIFY_CALLBACK.class, fi, constants$1335.PFN_SC_NOTIFY_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFN_SC_NOTIFY_CALLBACK ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$1335.PFN_SC_NOTIFY_CALLBACK$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

