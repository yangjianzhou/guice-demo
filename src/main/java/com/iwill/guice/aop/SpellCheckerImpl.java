package com.iwill.guice.aop;

import com.google.inject.Singleton;

@Singleton
public class SpellCheckerImpl implements SpellChecker {

    @CallTracker
    public void checkSpelling() {
        System.out.println("inside checkSpelling");
    }

}
