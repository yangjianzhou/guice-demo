package com.iwill.guice.provider;

import com.google.inject.Inject;

public class SpellCheckerImpl implements SpellChecker {

    private String dbUrl;
    private String user;
    private Integer timeout;

    @Inject
    public SpellCheckerImpl(String dbUrl,String user,Integer timeout) {
        this.dbUrl = dbUrl;
        this.user = user;
        this.timeout = timeout;
    }

    public void checkSpelling() {
        System.out.println("inside checkSpelling : " + dbUrl + " , " + user + " , " + timeout);
    }

}
