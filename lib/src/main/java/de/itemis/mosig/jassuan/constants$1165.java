// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1165 {

    static final MemoryLayout CLSID_SBS_HttpProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_HttpProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_HttpProtocol", constants$1165.CLSID_SBS_HttpProtocol$LAYOUT);
    static final MemoryLayout CLSID_SBS_FtpProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_FtpProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_FtpProtocol", constants$1165.CLSID_SBS_FtpProtocol$LAYOUT);
    static final MemoryLayout CLSID_SBS_GopherProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_GopherProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_GopherProtocol", constants$1165.CLSID_SBS_GopherProtocol$LAYOUT);
    static final MemoryLayout CLSID_SBS_HttpSProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_HttpSProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_HttpSProtocol", constants$1165.CLSID_SBS_HttpSProtocol$LAYOUT);
    static final MemoryLayout CLSID_SBS_FileProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_FileProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_FileProtocol", constants$1165.CLSID_SBS_FileProtocol$LAYOUT);
    static final MemoryLayout CLSID_SBS_MkProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_MkProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_MkProtocol", constants$1165.CLSID_SBS_MkProtocol$LAYOUT);
}

