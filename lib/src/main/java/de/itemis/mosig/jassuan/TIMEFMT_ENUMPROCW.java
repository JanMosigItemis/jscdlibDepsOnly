// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface TIMEFMT_ENUMPROCW {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(TIMEFMT_ENUMPROCW fi) {
        return RuntimeHelper.upcallStub(TIMEFMT_ENUMPROCW.class, fi, constants$667.TIMEFMT_ENUMPROCW$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(TIMEFMT_ENUMPROCW fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(TIMEFMT_ENUMPROCW.class, fi, constants$667.TIMEFMT_ENUMPROCW$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static TIMEFMT_ENUMPROCW ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$668.TIMEFMT_ENUMPROCW$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

