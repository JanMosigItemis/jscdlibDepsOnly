// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1197 {

    static final MemoryLayout IID_IGetBindHandle$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IGetBindHandle$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IGetBindHandle", constants$1197.IID_IGetBindHandle$LAYOUT);
    static final MemoryLayout IID_IBindCallbackRedirect$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IBindCallbackRedirect$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IBindCallbackRedirect", constants$1197.IID_IBindCallbackRedirect$LAYOUT);
    static final MemoryLayout IID_IPropertyStorage$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPropertyStorage$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IPropertyStorage", constants$1197.IID_IPropertyStorage$LAYOUT);
    static final MemoryLayout IID_IPropertySetStorage$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPropertySetStorage$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IPropertySetStorage", constants$1197.IID_IPropertySetStorage$LAYOUT);
    static final MemoryLayout IID_IEnumSTATPROPSTG$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumSTATPROPSTG$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IEnumSTATPROPSTG", constants$1197.IID_IEnumSTATPROPSTG$LAYOUT);
    static final FunctionDescriptor IEnumSTATPROPSTG_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IEnumSTATPROPSTG_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IEnumSTATPROPSTG_RemoteNext_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1197.IEnumSTATPROPSTG_RemoteNext_Proxy$FUNC, false
    );
}

