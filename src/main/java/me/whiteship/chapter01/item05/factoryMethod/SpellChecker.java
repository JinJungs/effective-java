package me.whiteship.chapter01.item05.factoryMethod;

import me.whiteship.chapter01.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
