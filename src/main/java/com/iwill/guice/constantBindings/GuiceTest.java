package com.iwill.guice.constantBindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     * 使用值对象或常量创建绑定
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeConnection();
    }
}
