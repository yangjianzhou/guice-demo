package com.iwill.guice.constructorBindings;

import com.google.inject.Inject;

import javax.inject.Named;

public class SpellCheckerImpl implements SpellChecker {

    private String dbUrl;

    @Inject
    public SpellCheckerImpl(@Named("JDBC") String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void checkSpelling() {
        System.out.println("inside checkSpelling : " + dbUrl );
    }

}
