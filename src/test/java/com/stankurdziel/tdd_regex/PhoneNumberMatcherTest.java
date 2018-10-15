package com.stankurdziel.tdd_regex;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PhoneNumberMatcherTest {

    @Test
    public void shouldMatch10DigitPhoneNumbers() {
        assertTrue(new PhoneNumberMatcher("858-555-1212").isValid());
        assertTrue(new PhoneNumberMatcher("(858)555-1212").isValid());
    }
}
