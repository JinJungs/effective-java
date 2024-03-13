package me.whiteship.chapter01.item06;

public class Strings {
    public static void main(String[] args) {
        String str1 = "justice";
        String str2 = new String("justice");    // 따라 하지 말것!
        String str3 = "justice";                        // 새로운 인스턴스를 만드는 대신 str1의 인스턴스를 사용한다.

        // 같은 가상머신 안에서 이와 똑같은 문자열 리터럴을 사용하는 모든 코드가 같은 객체를 재사용함이 보장된다.

        System.out.println(str1 == str2);       // false
        System.out.println(str1.equals(str2));  // true
        System.out.println(str1 == str3);       // true
    }
}
