package me.whiteship.chapter01.item05.dependencyinjection;

import me.whiteship.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    // 이렇게 의존 객체 주입 패턴을 사용해야 Dictionary가 바뀌더라도 아래 모든 코드가 재사용이 가능하다.
    // 전제가 하나 더 있다면 Dictionary 가 인터페이스여야 한다.
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
