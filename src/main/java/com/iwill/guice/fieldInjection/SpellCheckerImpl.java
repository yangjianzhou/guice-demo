package com.iwill.guice.fieldInjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerImpl implements SpellChecker {

    @Inject @Named("JDBC")
    private String dbUrl;

    public void checkSpelling() {
        System.out.println("inside checkSpelling ," + dbUrl);
    }

}
