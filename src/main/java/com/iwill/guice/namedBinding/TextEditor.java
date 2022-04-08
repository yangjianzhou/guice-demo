package com.iwill.guice.namedBinding;

import com.google.inject.Inject;

import javax.inject.Named;

public class TextEditor {

    private SpellChecker spellChecker ;

    @Inject
    public TextEditor(@Named("OpenOffice") SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();;
    }
}
