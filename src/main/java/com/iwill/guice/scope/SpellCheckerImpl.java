package com.iwill.guice.scope;

import com.google.inject.Singleton;

@Singleton
public class SpellCheckerImpl implements SpellChecker {

    private double id ;

    public SpellCheckerImpl() {
        id = Math.random();
    }

    public void checkSpelling() {
        System.out.println("inside checkSpelling ," + id);
    }

    public double getId() {
        return id ;
    }
}
