package me.whiteship.chapter01.item05.dependencyinjection;

import me.whiteship.chapter01.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    // 이렇게 의존 객체 주입 패턴을 사용해야 Dictionary가 바뀌더라도 아래 모든 코드가 재사용이 가능하다.
    // 전제가 하나 더 있다면 Dictionary 가 인터페이스여야 한다.
    private final Dictionary dictionary;

    // 직접 Dictionary를 주입받는 대신에 어떤 Dictionary를 리턴할 것인지 결정하는 Factory를 주입받아 한번 더 감싼다
    // DictionaryFactory는 Supplier<Dictionary> 로 대체가능
    // Supplier : 매개변수는 없고 리턴값은 있는 함수형 인터페이스
    public SpellChecker(Supplier<? extends Dictionary> dictionaryFactory) {
        this.dictionary = dictionaryFactory.get();
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
