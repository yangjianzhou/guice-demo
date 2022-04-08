package com.iwill.guice.constantBindings;

import com.google.inject.Inject;

import javax.inject.Named;

public class TextEditor {

    private String dbUrl ;

    @Inject
    public TextEditor(@Named("JDBC")String dbUrl) {
        this.dbUrl = dbUrl ;
    }

    public void makeConnection(){
        System.out.println(dbUrl);
    }
}
