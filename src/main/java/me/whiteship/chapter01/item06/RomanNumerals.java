package me.whiteship.chapter01.item06;

import java.util.regex.Pattern;

public class RomanNumerals {

    // 값비싼 객체를 재활용
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }

    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    public static void main(String[] args) {
        boolean result = false;
        long start = System.nanoTime();
        for (int j = 0; j < 100; j++) {
//            result = isRomanNumeralFast("MCMLXXVI");
             result = isRomanNumeralSlow("MCMLXXVI");
        }
        long end = System.nanoTime();

        System.out.println(end - start);
        System.out.println(result);
    }
}
