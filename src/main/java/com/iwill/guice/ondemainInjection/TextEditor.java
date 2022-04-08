package com.iwill.guice.ondemainInjection;

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
