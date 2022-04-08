package com.iwill.guice.optionalInjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     * 可选注入意味着在存在时注入依赖项。 方法和场注入可以是可选的，并且如果不存在依赖性，则应该具有一些默认值。
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
