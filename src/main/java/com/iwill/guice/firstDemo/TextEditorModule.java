package com.iwill.guice.firstDemo;

import com.google.inject.AbstractModule;

public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
    }
}
