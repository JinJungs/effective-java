package me.whiteship.chapter01.item05.factoryMethod;

import me.whiteship.chapter01.item05.DefaultDictionary;
import me.whiteship.chapter01.item05.Dictionary;
import me.whiteship.chapter01.item05.singleton.SpellChecker;

public class DefaultDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }

}
