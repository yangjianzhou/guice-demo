package com.iwill.guice.optionalInjection;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
public interface SpellChecker {

    void checkSpelling();

}
