package com.iwill.guice.namedBinding;

public class OpenOfficeSpellCheckerImpl extends SpellCheckerImpl {

    @Override
    public void checkSpelling() {
        System.out.println("inside OpenOfficeSpellCheckerImpl.checkSpelling");
    }
}
