// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1182 {

    static final FunctionDescriptor IWinInetHttpInfo_QueryInfo_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IWinInetHttpInfo_QueryInfo_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IWinInetHttpInfo_QueryInfo_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1182.IWinInetHttpInfo_QueryInfo_Proxy$FUNC, false
    );
    static final FunctionDescriptor IWinInetHttpInfo_QueryInfo_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IWinInetHttpInfo_QueryInfo_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IWinInetHttpInfo_QueryInfo_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1182.IWinInetHttpInfo_QueryInfo_Stub$FUNC, false
    );
    static final MemoryLayout IID_IWinInetHttpTimeouts$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWinInetHttpTimeouts$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IWinInetHttpTimeouts", constants$1182.IID_IWinInetHttpTimeouts$LAYOUT);
    static final MemoryLayout IID_IWinInetCacheHints$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWinInetCacheHints$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IWinInetCacheHints", constants$1182.IID_IWinInetCacheHints$LAYOUT);
    static final MemoryLayout IID_IWinInetCacheHints2$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWinInetCacheHints2$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IWinInetCacheHints2", constants$1182.IID_IWinInetCacheHints2$LAYOUT);
    static final MemoryLayout SID_BindHost$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment SID_BindHost$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "SID_BindHost", constants$1182.SID_BindHost$LAYOUT);
}

