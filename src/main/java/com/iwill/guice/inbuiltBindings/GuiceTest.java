package com.iwill.guice.inbuiltBindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     * Guice为java.util.logging.Logger类提供内置绑定。 记录器的名称自动设置为注入Logger的类的名称
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
