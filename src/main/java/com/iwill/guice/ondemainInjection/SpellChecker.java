package com.iwill.guice.ondemainInjection;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
public interface SpellChecker {

    void checkSpelling();

}
