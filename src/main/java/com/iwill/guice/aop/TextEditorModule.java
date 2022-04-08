package com.iwill.guice.aop;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(CallTracker.class), new CallTrackerService());
    }
}
