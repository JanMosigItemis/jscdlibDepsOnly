// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PTP_WAIT_CALLBACK {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
    static MemoryAddress allocate(PTP_WAIT_CALLBACK fi) {
        return RuntimeHelper.upcallStub(PTP_WAIT_CALLBACK.class, fi, constants$283.PTP_WAIT_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PTP_WAIT_CALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PTP_WAIT_CALLBACK.class, fi, constants$283.PTP_WAIT_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PTP_WAIT_CALLBACK ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
            try {
                constants$283.PTP_WAIT_CALLBACK$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

