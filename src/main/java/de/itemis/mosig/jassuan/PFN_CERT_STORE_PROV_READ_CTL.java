// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_CERT_STORE_PROV_READ_CTL {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFN_CERT_STORE_PROV_READ_CTL fi) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_READ_CTL.class, fi, constants$878.PFN_CERT_STORE_PROV_READ_CTL$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFN_CERT_STORE_PROV_READ_CTL fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_READ_CTL.class, fi, constants$878.PFN_CERT_STORE_PROV_READ_CTL$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFN_CERT_STORE_PROV_READ_CTL ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$878.PFN_CERT_STORE_PROV_READ_CTL$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

