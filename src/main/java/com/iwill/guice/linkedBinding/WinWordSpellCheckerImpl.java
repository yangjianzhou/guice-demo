package com.iwill.guice.linkedBinding;

public class WinWordSpellCheckerImpl extends SpellCheckerImpl{

    @Override
    public void checkSpelling() {
        System.out.println("inside WinWordSpellCheckerImpl.checkSpelling");
    }
}
