// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1140 {

    static final FunctionDescriptor IXMLHttpRequest_get_readyState_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLHttpRequest_get_readyState_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLHttpRequest_get_readyState_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1140.IXMLHttpRequest_get_readyState_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLHttpRequest_get_readyState_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLHttpRequest_get_readyState_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLHttpRequest_get_readyState_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1140.IXMLHttpRequest_get_readyState_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLHttpRequest_put_onreadystatechange_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLHttpRequest_put_onreadystatechange_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLHttpRequest_put_onreadystatechange_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1140.IXMLHttpRequest_put_onreadystatechange_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLHttpRequest_put_onreadystatechange_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLHttpRequest_put_onreadystatechange_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLHttpRequest_put_onreadystatechange_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1140.IXMLHttpRequest_put_onreadystatechange_Stub$FUNC, false
    );
    static final MemoryLayout CLSID_XMLHTTPRequest$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_XMLHTTPRequest$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_XMLHTTPRequest", constants$1140.CLSID_XMLHTTPRequest$LAYOUT);
    static final MemoryLayout IID_IXMLDSOControl$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IXMLDSOControl$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IXMLDSOControl", constants$1140.IID_IXMLDSOControl$LAYOUT);
}

