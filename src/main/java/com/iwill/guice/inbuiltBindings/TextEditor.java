package com.iwill.guice.inbuiltBindings;

import com.google.inject.Inject;

import java.util.logging.Logger;

public class TextEditor {

    private Logger logger ;

    @Inject
    public TextEditor(Logger logger) {
        this.logger = logger;
    }

    public void makeSpellCheck(){
        logger.info("In TextEditor.makeSpellCheck() method");
    }
}
