package com.iwill.guice.provider;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     * 随着@provides方法变得更加复杂，可以使用Provider接口将这些方法移动到单独的类中
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
