package com.iwill.guice.aop;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     * AOP
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
    }
}
