package com.iwill.guice.constructorBindings;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        try {
            bind(SpellChecker.class).toConstructor(SpellCheckerImpl.class.getConstructor(String.class));
        } catch (Exception exp) {
            System.out.println("Required constructor missing");
        }
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
    }

}
