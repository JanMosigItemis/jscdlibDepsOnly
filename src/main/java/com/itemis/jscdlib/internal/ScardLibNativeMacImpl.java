package com.itemis.jscdlib.internal;

import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

import com.itemis.jscdlib.ScardLibNative;
import com.itemis.jscdlib.internal.memory.NativeMethodHandle;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.SymbolLookup;

public class ScardLibNativeMacImpl extends NativeBase implements ScardLibNative {

    private final NativeMethodHandle<Long> establishCtx;
    private final NativeMethodHandle<Long> listReaders;
    private final NativeMethodHandle<Long> freeMem;
    private final NativeMethodHandle<Long> releaseCtx;

    public ScardLibNativeMacImpl() {
        // See
        // https://github.com/gpg/gnupg/blob/25ae80b8eb6e9011049d76440ad7d250c1d02f7c/scd/scdaemon.c#L208
        System.loadLibrary("/System/Library/Frameworks/PCSC.framework/PCSC");
        var lib = SymbolLookup.loaderLookup();
        establishCtx = NativeMethodHandle
            .ofLib(lib)
            .returnType(long.class)
            .func("SCardEstablishContext")
            .args(C_LONG, C_POINTER, C_POINTER, C_POINTER)
            .create(CLinker.getInstance());

        listReaders = NativeMethodHandle
            .ofLib(lib)
            .returnType(long.class)
            .func("SCardListReaders")
            .args(C_POINTER, C_POINTER, C_POINTER, C_POINTER)
            .create(CLinker.getInstance());

        freeMem = NativeMethodHandle
            .ofLib(lib)
            .returnType(long.class)
            .func("SCardFreeMemory")
            .args(C_POINTER, C_POINTER)
            .create(CLinker.getInstance());

        releaseCtx = NativeMethodHandle
            .ofLib(lib)
            .returnType(long.class)
            .func("SCardReleaseContext")
            .args(C_POINTER)
            .create(CLinker.getInstance());
    }

    @Override
    public long sCardEstablishContext(long dwScope, MemoryAddress pvReserved1, MemoryAddress pvReserved2, MemoryAddress phContext) {
        return callNativeFunction(() -> establishCtx.call(dwScope, pvReserved1, pvReserved2, phContext));
    }

    @Override
    public long sCardListReadersA(MemoryAddress hContext, MemoryAddress mszGroups, MemoryAddress mszReaders, MemoryAddress pcchReaders) {
        return callNativeFunction(() -> listReaders.call(hContext, mszGroups, mszReaders, pcchReaders));
    }

    @Override
    public long sCardFreeMemory(MemoryAddress hContext, MemoryAddress pvMem) {
        return callNativeFunction(() -> freeMem.call(hContext, pvMem));
    }

    @Override
    public long sCardReleaseContext(MemoryAddress hContext) {
        return callNativeFunction(() -> releaseCtx.call(hContext));
    }
}
