// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$257 {

    static final MemoryLayout GUID_ALLOW_AWAYMODE$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ALLOW_AWAYMODE$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_ALLOW_AWAYMODE", constants$257.GUID_ALLOW_AWAYMODE$LAYOUT);
    static final MemoryLayout GUID_ALLOW_STANDBY_STATES$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ALLOW_STANDBY_STATES$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_ALLOW_STANDBY_STATES", constants$257.GUID_ALLOW_STANDBY_STATES$LAYOUT);
    static final MemoryLayout GUID_ALLOW_RTC_WAKE$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ALLOW_RTC_WAKE$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_ALLOW_RTC_WAKE", constants$257.GUID_ALLOW_RTC_WAKE$LAYOUT);
    static final MemoryLayout GUID_ALLOW_SYSTEM_REQUIRED$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ALLOW_SYSTEM_REQUIRED$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_ALLOW_SYSTEM_REQUIRED", constants$257.GUID_ALLOW_SYSTEM_REQUIRED$LAYOUT);
    static final MemoryLayout GUID_SYSTEM_BUTTON_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SYSTEM_BUTTON_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_SYSTEM_BUTTON_SUBGROUP", constants$257.GUID_SYSTEM_BUTTON_SUBGROUP$LAYOUT);
    static final MemoryLayout GUID_POWERBUTTON_ACTION$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_POWERBUTTON_ACTION$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_POWERBUTTON_ACTION", constants$257.GUID_POWERBUTTON_ACTION$LAYOUT);
}

