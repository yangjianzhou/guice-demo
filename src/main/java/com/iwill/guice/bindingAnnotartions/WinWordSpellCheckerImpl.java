package com.iwill.guice.bindingAnnotartions;

public class WinWordSpellCheckerImpl extends SpellCheckerImpl {

    @Override
    public void checkSpelling() {
        System.out.println("inside WinWordSpellCheckerImpl.checkSpelling");
    }
}
