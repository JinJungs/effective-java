package me.whiteship.chapter01.item05.dependencyinjection;

import me.whiteship.chapter01.item05.DefaultDictionary;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {
    void isValid() {
//        SpellChecker spellChecker = new SpellChecker(new DefaultDictionary()); // 테스트 시 MockDictionary를 생성하여 주입 가능.

        // Suppplier<Dictionary>
        SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);

        // DictionaryFactory
        SpellChecker spellChecker2 = new SpellChecker(DictionaryFactory::get);


    }
}