// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface RTL_VERIFIER_NTDLLHEAPFREE_CALLBACK {

    void apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
    static MemoryAddress allocate(RTL_VERIFIER_NTDLLHEAPFREE_CALLBACK fi) {
        return RuntimeHelper.upcallStub(RTL_VERIFIER_NTDLLHEAPFREE_CALLBACK.class, fi, constants$280.RTL_VERIFIER_NTDLLHEAPFREE_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)V");
    }
    static MemoryAddress allocate(RTL_VERIFIER_NTDLLHEAPFREE_CALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(RTL_VERIFIER_NTDLLHEAPFREE_CALLBACK.class, fi, constants$280.RTL_VERIFIER_NTDLLHEAPFREE_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)V", scope);
    }
    static RTL_VERIFIER_NTDLLHEAPFREE_CALLBACK ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
            try {
                constants$280.RTL_VERIFIER_NTDLLHEAPFREE_CALLBACK$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

