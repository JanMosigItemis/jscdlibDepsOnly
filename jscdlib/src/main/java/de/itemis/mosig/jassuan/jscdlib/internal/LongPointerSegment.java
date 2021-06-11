package de.itemis.mosig.jassuan.jscdlib.internal;

import jdk.incubator.foreign.MemoryAddress;

public class LongPointerSegment extends PointerSegment<Long> {

    public LongPointerSegment() {
        super();
    }

    public LongPointerSegment(MemoryAddress addr) {
        super(addr);
    }

    @Override
    public Long dereference() {
        try (var longSeg = new LongSegment(getContainedAddress())) {
            return longSeg.getValue();
        }
    }
}
