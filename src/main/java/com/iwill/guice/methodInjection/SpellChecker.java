package com.iwill.guice.methodInjection;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
public interface SpellChecker {

    void checkSpelling();

}
