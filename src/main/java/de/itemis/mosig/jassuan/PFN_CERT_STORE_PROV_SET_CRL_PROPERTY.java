// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_CERT_STORE_PROV_SET_CRL_PROPERTY {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFN_CERT_STORE_PROV_SET_CRL_PROPERTY fi) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_SET_CRL_PROPERTY.class, fi, constants$878.PFN_CERT_STORE_PROV_SET_CRL_PROPERTY$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFN_CERT_STORE_PROV_SET_CRL_PROPERTY fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_SET_CRL_PROPERTY.class, fi, constants$878.PFN_CERT_STORE_PROV_SET_CRL_PROPERTY$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFN_CERT_STORE_PROV_SET_CRL_PROPERTY ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                return (int)constants$878.PFN_CERT_STORE_PROV_SET_CRL_PROPERTY$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

