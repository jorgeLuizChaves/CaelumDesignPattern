package com.br.caelum.hookmethod;

public class ClassA extends SuperClass {

    @Override
    public String getClassName() {
        return this.getClass().getSimpleName();
    }
}