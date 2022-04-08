package com.iwill.guice.constructorInjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     *注入是将依赖注入对象的过程。 构造函数注入很常见。 在此过程中，依赖项作为参数注入构造函数
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
