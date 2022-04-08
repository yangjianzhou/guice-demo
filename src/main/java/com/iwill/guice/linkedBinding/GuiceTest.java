package com.iwill.guice.linkedBinding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     * @BindingAnnotation - 将注释标记为绑定注释。
     * @Target - 标记注释的适用性。
     * @Retention - 将注释的可用性标记为运行时。
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
