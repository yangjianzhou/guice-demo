package com.iwill.guice.firstDemo;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
