package com.iwill.guice.scope;

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

    public double getSpellCheckerId() {
        return spellChecker.getId();
    }
}
