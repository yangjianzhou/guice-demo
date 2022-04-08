package com.iwill.guice.methodInjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerImpl implements SpellChecker {

    private String dbUrl;

    @Inject
    public void setDbUrl(@Named("JDBC") String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void checkSpelling() {
        System.out.println("inside checkSpelling ," + dbUrl);
    }

}
