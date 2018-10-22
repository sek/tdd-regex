package com.stankurdziel.tdd_regex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PhoneNumberMatcherTest {

    @Test
    public void shouldMatch10DigitPhoneNumbers() {
        assertTrue(m("858-555-1212").isValid());
        assertTrue(m("(858)555-1212").isValid());
        assertFalse(m("858-555-333").isValid());
    }

    @Test
    public void shouldMatchCountryCode() {
        assertTrue(m("+1 858-555-1212").isValid());
        assertTrue(m("+01 858-555-1212").isValid());
        assertTrue(m("+1-858-555-1212").isValid());
        assertTrue(m("+1(858)555-1212").isValid());
        assertFalse(m("1(858)555-1212").isValid());
    }

    private static PhoneNumberMatcher m(String number) {
        return new PhoneNumberMatcher(number);
    }

    @Test
    public void shouldRetrieveAreaCode() {
        assertEquals("858", m("+1 858-555-1212").getAreaCode());
        assertEquals("619", m("+01 619-555-1212").getAreaCode());
        assertEquals("760", m("+1-760-555-1212").getAreaCode());
        assertEquals("123", m("+1(123)555-1212").getAreaCode());
    }
}
