package com.iwill.guice.constructorBindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     * Guice提供了一种使用toConstructor（）方法与对象的特定构造函数创建绑定的方法。
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
