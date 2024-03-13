package me.whiteship.chapter01.item05.staticutils;

import me.whiteship.chapter01.item05.DefaultDictionary;
import me.whiteship.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    // 자원을 직접 명시한다 == 매번 직접 생성한다.
    // Test 시 다른 Mock 객체를 사용하기 어려움.
    private static final Dictionary dictionary = new DefaultDictionary();

    private SpellChecker() {}

    public static boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }

}
