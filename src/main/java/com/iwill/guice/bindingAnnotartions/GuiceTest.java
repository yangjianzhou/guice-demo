package com.iwill.guice.bindingAnnotartions;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     * 在链接绑定中，Guice将类型映射到其实现。
     * 将SpellChecker接口与其实现SpellCheckerImpl进行了映射。
     * 还可以将具体类映射到它的子类。
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
