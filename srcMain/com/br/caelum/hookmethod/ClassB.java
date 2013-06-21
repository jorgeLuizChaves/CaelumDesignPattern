package com.br.caelum.hookmethod;

public class ClassB extends SuperClass{

	@Override
	public String getClassName() {
		return this.getClass().getSimpleName();
	}

}
