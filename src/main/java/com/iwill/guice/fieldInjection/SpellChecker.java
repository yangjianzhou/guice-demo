package com.iwill.guice.fieldInjection;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
public interface SpellChecker {

    void checkSpelling();

}
