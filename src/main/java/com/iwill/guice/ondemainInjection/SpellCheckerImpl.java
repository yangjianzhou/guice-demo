package com.iwill.guice.ondemainInjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerImpl implements SpellChecker {

    private String dbUrl ="jdbc:mysql://localhost:5326/emp";

    @Inject(optional=true)
    public void setDbUrl(@Named("JDBC") String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void checkSpelling() {
        System.out.println("inside checkSpelling ," + dbUrl);
    }

}
