package com.iwill.guice.aop;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)
public interface SpellChecker {

    void checkSpelling();

}
