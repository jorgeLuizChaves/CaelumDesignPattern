package com.br.caelum.hookmethod;

public abstract class SuperClass {

    public final String writeYourClassName() {
        return getClassName();
    }

    public abstract String getClassName();
}
