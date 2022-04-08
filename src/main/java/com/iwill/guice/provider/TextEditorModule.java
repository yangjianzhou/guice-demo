package com.iwill.guice.provider;

import com.google.inject.AbstractModule;

public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).toProvider(SpellCheckerProvider.class);
    }

}
