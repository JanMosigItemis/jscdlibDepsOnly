// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFLS_CALLBACK_FUNCTION {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFLS_CALLBACK_FUNCTION fi) {
        return RuntimeHelper.upcallStub(PFLS_CALLBACK_FUNCTION.class, fi, constants$279.PFLS_CALLBACK_FUNCTION$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFLS_CALLBACK_FUNCTION fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFLS_CALLBACK_FUNCTION.class, fi, constants$279.PFLS_CALLBACK_FUNCTION$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFLS_CALLBACK_FUNCTION ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$279.PFLS_CALLBACK_FUNCTION$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

