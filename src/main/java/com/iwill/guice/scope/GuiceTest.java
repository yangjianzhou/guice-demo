package com.iwill.guice.scope;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTest {

    /**
     *  每当Guice提供一个值作为其默认行为时，它都会返回一个新实例。 它可以通过范围进行配置。 以下是Guice支持的范围 -
     *
     * @Singleton - 应用程序生命周期的单个实例。 @Singleton对象需要是线程安全的。
     *
     * @SessionScoped - Web应用程序特定会话的单个实例。 @SessionScoped对象需要是线程安全的。
     *
     * @RequestScoped - Web应用程序的特定请求的单个实例。 @RequestScoped对象不需要是线程安全的。
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        SpellChecker spellChecker = new SpellCheckerImpl();
        injector.injectMembers(spellChecker);
        TextEditor editor = injector.getInstance(TextEditor.class);
        System.out.println(editor.getSpellCheckerId());
        TextEditor editor1 = injector.getInstance(TextEditor.class);
        System.out.println(editor1.getSpellCheckerId());
    }
}
