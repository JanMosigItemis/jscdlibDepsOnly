// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC {

    int apply(long x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6, int x7, jdk.incubator.foreign.MemoryAddress x8, jdk.incubator.foreign.MemoryAddress x9);
    static MemoryAddress allocate(PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC fi) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC.class, fi, constants$897.PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC$FUNC, "(JILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC.class, fi, constants$897.PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC$FUNC, "(JILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC ofAddress(MemoryAddress addr) {
        return (long x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5, jdk.incubator.foreign.MemoryAddress x6, int x7, jdk.incubator.foreign.MemoryAddress x8, jdk.incubator.foreign.MemoryAddress x9) -> {
            try {
                return (int)constants$897.PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

