// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1083 {

    static final FunctionDescriptor ITypeLib2_GetDocumentation2_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeLib2_GetDocumentation2_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeLib2_GetDocumentation2_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1083.ITypeLib2_GetDocumentation2_Stub$FUNC, false
    );
    static final MemoryLayout IID_ITypeChangeEvents$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ITypeChangeEvents$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_ITypeChangeEvents", constants$1083.IID_ITypeChangeEvents$LAYOUT);
    static final MemoryLayout IID_IErrorInfo$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IErrorInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IErrorInfo", constants$1083.IID_IErrorInfo$LAYOUT);
    static final MemoryLayout IID_ICreateErrorInfo$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ICreateErrorInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_ICreateErrorInfo", constants$1083.IID_ICreateErrorInfo$LAYOUT);
    static final MemoryLayout IID_ISupportErrorInfo$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ISupportErrorInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_ISupportErrorInfo", constants$1083.IID_ISupportErrorInfo$LAYOUT);
    static final MemoryLayout IID_ITypeFactory$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ITypeFactory$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_ITypeFactory", constants$1083.IID_ITypeFactory$LAYOUT);
}

