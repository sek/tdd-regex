package com.stankurdziel.tdd_regex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PhoneNumberMatcherTest {

    @Test
    public void shouldMatch10DigitPhoneNumbers() {
        assertTrue(new PhoneNumberMatcher("858-555-1212").isValid());
        assertTrue(new PhoneNumberMatcher("(858)555-1212").isValid());
        assertFalse(new PhoneNumberMatcher("858-555-333").isValid());
    }

    @Test
    public void shouldMatchCountryCode() {
        assertTrue(new PhoneNumberMatcher("+1 858-555-1212").isValid());
        assertTrue(new PhoneNumberMatcher("+01 858-555-1212").isValid());
        assertTrue(new PhoneNumberMatcher("+1-858-555-1212").isValid());
        assertTrue(new PhoneNumberMatcher("+1(858)555-1212").isValid());
        assertFalse(new PhoneNumberMatcher("1(858)555-1212").isValid());
    }
}
