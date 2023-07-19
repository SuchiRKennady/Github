package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid First name");
        n = sc.nextInt();
        while(n != 0 ){
            Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{3,}");

        }




    }
}
