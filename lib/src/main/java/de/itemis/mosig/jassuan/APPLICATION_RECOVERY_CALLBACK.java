// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface APPLICATION_RECOVERY_CALLBACK {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(APPLICATION_RECOVERY_CALLBACK fi) {
        return RuntimeHelper.upcallStub(APPLICATION_RECOVERY_CALLBACK.class, fi, constants$472.APPLICATION_RECOVERY_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(APPLICATION_RECOVERY_CALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(APPLICATION_RECOVERY_CALLBACK.class, fi, constants$472.APPLICATION_RECOVERY_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static APPLICATION_RECOVERY_CALLBACK ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$472.APPLICATION_RECOVERY_CALLBACK$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

