package com.iwill.guice.firstDemo;

import com.google.inject.Inject;

public class TextEditor {

    private SpellChecker spellChecker ;

    @Inject
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();;
    }
}
