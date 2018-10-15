package com.stankurdziel.tdd_regex;

public class PhoneNumberMatcher {

    private final String phoneNumber;

    public PhoneNumberMatcher(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String digits(int num) {
        return "\\d{" + num + "}";
    }

    public boolean isValid() {
        String areaCode = "\\(?" + digits(3) + "\\)?-?";
        return phoneNumber.matches(areaCode + digits(3) + "-" + digits(4));
    }
}
