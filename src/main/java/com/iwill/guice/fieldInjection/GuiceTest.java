package com.iwill.guice.fieldInjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     *字段注入用于将值对象设置为对象字段的依赖项
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
