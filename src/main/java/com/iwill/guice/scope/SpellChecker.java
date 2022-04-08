package com.iwill.guice.scope;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
public interface SpellChecker {

    double getId();

    void checkSpelling();

}
