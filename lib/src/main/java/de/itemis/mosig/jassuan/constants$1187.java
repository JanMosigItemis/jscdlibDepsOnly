// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1187 {

    static final FunctionDescriptor HlinkNavigateMoniker$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle HlinkNavigateMoniker$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "HlinkNavigateMoniker",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1187.HlinkNavigateMoniker$FUNC, false
    );
    static final MemoryLayout IID_IInternet$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IInternet$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IInternet", constants$1187.IID_IInternet$LAYOUT);
    static final MemoryLayout IID_IInternetBindInfo$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IInternetBindInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IInternetBindInfo", constants$1187.IID_IInternetBindInfo$LAYOUT);
    static final MemoryLayout IID_IInternetBindInfoEx$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IInternetBindInfoEx$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IInternetBindInfoEx", constants$1187.IID_IInternetBindInfoEx$LAYOUT);
    static final MemoryLayout IID_IInternetProtocolRoot$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IInternetProtocolRoot$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IInternetProtocolRoot", constants$1187.IID_IInternetProtocolRoot$LAYOUT);
    static final MemoryLayout IID_IInternetProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IInternetProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IInternetProtocol", constants$1187.IID_IInternetProtocol$LAYOUT);
}

