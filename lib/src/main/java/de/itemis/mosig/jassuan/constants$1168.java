// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1168 {

    static final MemoryLayout CLSID_FileProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_FileProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_FileProtocol", constants$1168.CLSID_FileProtocol$LAYOUT);
    static final MemoryLayout CLSID_MkProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_MkProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_MkProtocol", constants$1168.CLSID_MkProtocol$LAYOUT);
    static final MemoryLayout CLSID_StdURLProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_StdURLProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_StdURLProtocol", constants$1168.CLSID_StdURLProtocol$LAYOUT);
    static final MemoryLayout CLSID_UrlMkBindCtx$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_UrlMkBindCtx$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_UrlMkBindCtx", constants$1168.CLSID_UrlMkBindCtx$LAYOUT);
    static final MemoryLayout CLSID_CdlProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CdlProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_CdlProtocol", constants$1168.CLSID_CdlProtocol$LAYOUT);
    static final MemoryLayout CLSID_ClassInstallFilter$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_ClassInstallFilter$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_ClassInstallFilter", constants$1168.CLSID_ClassInstallFilter$LAYOUT);
}

