package com.iwill.guice.ondemainInjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     *  方法和字段注入可用于使用injector.injectMembers()方法使用现有对象进行初始化
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        SpellChecker spellChecker = new SpellCheckerImpl();
        injector.injectMembers(spellChecker);
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
