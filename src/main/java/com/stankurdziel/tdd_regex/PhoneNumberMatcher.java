package com.stankurdziel.tdd_regex;

public class PhoneNumberMatcher {

    private final String phoneNumber;

    PhoneNumberMatcher(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    boolean isValid() {
        return phoneNumber.matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d");
    }
}
