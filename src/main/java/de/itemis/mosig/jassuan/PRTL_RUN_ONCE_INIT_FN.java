// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PRTL_RUN_ONCE_INIT_FN {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PRTL_RUN_ONCE_INIT_FN fi) {
        return RuntimeHelper.upcallStub(PRTL_RUN_ONCE_INIT_FN.class, fi, constants$275.PRTL_RUN_ONCE_INIT_FN$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PRTL_RUN_ONCE_INIT_FN fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PRTL_RUN_ONCE_INIT_FN.class, fi, constants$275.PRTL_RUN_ONCE_INIT_FN$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PRTL_RUN_ONCE_INIT_FN ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                return (int)constants$276.PRTL_RUN_ONCE_INIT_FN$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

