package com.iwill.guice.bindingAnnotartions;

import com.google.inject.Inject;

public class TextEditor {

    private SpellChecker spellChecker ;

    @Inject
    public TextEditor(@WinWord SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();;
    }
}
