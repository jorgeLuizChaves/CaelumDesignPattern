package com.br.caelum.composite;


import org.junit.Assert;
import org.junit.Test;

public class ElementoTest {

	@Test
	public void testWhenNextIsNull() {
		int expectedResult = 1;
		Elemento elemento = new Elemento(null);
		Assert.assertEquals(expectedResult, elemento.contar());
	}
	
	@Test
	public void testNext() {
		int expectedResult = 2;
		Elemento elemento = new Elemento(null);
		Elemento elemento2 = new Elemento(null);
		elemento.setProximo(elemento2);
		Assert.assertEquals(expectedResult, elemento.contar());
	}
	
}