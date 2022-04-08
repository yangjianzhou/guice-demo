package com.iwill.guice.namedBinding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     * 使用@Named注释进行映射绑定
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
