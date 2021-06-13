package de.itemis.mosig.jassuan.jscdlib.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringSegmentTest {

    private static final Logger LOG = LoggerFactory.getLogger(StringSegmentTest.class);

    private StringSegment underTest;

    @BeforeEach
    public void setUp() {
        underTest = new StringSegment();
    }

    @AfterEach
    public void tearDown() {
        if (underTest.isAlive()) {
            try {
                underTest.close();
            } catch (Exception e) {
                LOG.warn("Possible ressource leak. Could not close segment handle.", e);
            }
        }
    }

    @Test
    public void initial_value_is_empty_string() {
        try (var cut = new StringSegment()) {
            assertThat(cut.getValue()).isEqualTo("");
        }
    }

    @Test
    public void wrap_wraps_provided_segment() {
        var expectedVal = "expectedVal";
        underTest.setValue(expectedVal);
        try (var wrappingSeg = new StringSegment(underTest)) {
            assertThat(wrappingSeg.getSegment()).isSameAs(underTest);
        }
    }

    @Test
    public void wrap_wraps_provided_addr() {
        var expectedVal = "expectedVal";
        underTest.setValue(expectedVal);
        try (var wrappingSeg = new StringSegment(underTest.address())) {
            assertThat(wrappingSeg.getValue()).isEqualTo(expectedVal);
            assertThat(wrappingSeg.address()).isEqualTo(underTest.address());
        }
    }

    @Test
    public void getValue_getsValue_setValue_setsValue() {
        var expectedVal = "expectedVal";
        underTest.setValue(expectedVal);
        assertThat(underTest.getValue()).isEqualTo(expectedVal);
    }

    @Test
    public void setValue_does_not_accept_null() {
        assertThatThrownBy(() -> underTest.setValue(null)).isInstanceOf(NullPointerException.class).hasMessage("newValue");
    }

    @Test
    public void setValue_returns_old_value() {
        var oldValue = "oldValue";
        var newValue = "newValue";
        underTest.setValue(oldValue);
        assertThat(underTest.setValue(newValue)).isEqualTo(oldValue);
    }
}