// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PAPCFUNC {

    void apply(long x0);
    static MemoryAddress allocate(PAPCFUNC fi) {
        return RuntimeHelper.upcallStub(PAPCFUNC.class, fi, constants$277.PAPCFUNC$FUNC, "(J)V");
    }
    static MemoryAddress allocate(PAPCFUNC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PAPCFUNC.class, fi, constants$277.PAPCFUNC$FUNC, "(J)V", scope);
    }
    static PAPCFUNC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                constants$277.PAPCFUNC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

