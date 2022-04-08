package com.iwill.guice.bindingAnnotartions;

import com.google.inject.AbstractModule;

public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).annotatedWith(WinWord.class).to(WinWordSpellCheckerImpl.class);
    }
}
