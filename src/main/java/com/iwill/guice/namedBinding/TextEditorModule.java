package com.iwill.guice.namedBinding;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice")).to(OpenOfficeSpellCheckerImpl.class);
    }
}
