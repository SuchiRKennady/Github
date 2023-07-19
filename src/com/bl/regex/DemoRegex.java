package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{1,}");
//        Matcher m = p.matcher("Kennady");
//        Pattern p = Pattern.compile("^[+][0-9]{2}\\s[0-9]{10}");
//        Pattern p = Pattern.compile("^[+91]{3}\\s[0-9]{10}");
        Pattern p = Pattern.compile("[a-z0-9]{3,}[@][a-z]{3,}[.][a-z]{2,3}");
        Matcher m = p.matcher("suchirk2000@gmail.com");
        boolean conditionCheck = m.matches();
        System.out.println(conditionCheck);
    }
}
