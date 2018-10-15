package com.stankurdziel.tdd_regex;

public class PhoneNumberMatcher {

    private final String phoneNumber;

    PhoneNumberMatcher(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    boolean isValid() {
        String threeDigits = "\\d\\d\\d";
        String fourDigits = "\\d\\d\\d\\d";
        String areaCode = "\\(?" + threeDigits + "\\)?-?";
        return phoneNumber.matches(areaCode + threeDigits + "-" + fourDigits);
    }
}
