// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_NCRYPT_FREE {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFN_NCRYPT_FREE fi) {
        return RuntimeHelper.upcallStub(PFN_NCRYPT_FREE.class, fi, constants$857.PFN_NCRYPT_FREE$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFN_NCRYPT_FREE fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_NCRYPT_FREE.class, fi, constants$857.PFN_NCRYPT_FREE$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFN_NCRYPT_FREE ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$857.PFN_NCRYPT_FREE$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

