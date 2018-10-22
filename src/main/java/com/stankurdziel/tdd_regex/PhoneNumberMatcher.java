package com.stankurdziel.tdd_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberMatcher {
    private final Matcher matcher;

    public PhoneNumberMatcher(String phoneNumber) {
        String countryCode = "(\\+\\d\\d?[ -]?)?";
        String areaCode = "\\(?(" + digits(3) + ")\\)?-?";
        String regex = countryCode + areaCode + digits(3) + "-" + digits(4);
        matcher = Pattern.compile(regex).matcher(phoneNumber);
    }

    private String digits(int num) {
        return "\\d{" + num + "}";
    }

    public boolean isValid() {
        return matcher.matches();
    }

    public String getAreaCode() {
        if (matcher.find()) return matcher.group(2);
        else return null;
    }
}
