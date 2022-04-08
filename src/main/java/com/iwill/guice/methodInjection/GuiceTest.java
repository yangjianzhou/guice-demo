package com.iwill.guice.methodInjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     *方法注入用于将值对象设置为对象的依赖项
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
