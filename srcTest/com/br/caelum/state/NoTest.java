package com.br.caelum.state;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.br.caleum.state.No;

public class NoTest {

	@Test
	public void testStateDesign() {
		No a = new No("A");
		No b = new No("B");
		No c = new No("C");
		No d = new No("D");
		No e = new No("E");
		No f = new No("F");
		No g = new No("G");
		No h = new No("H");

		a.addAdjacentes(b);
		c.addAdjacentes(d);
		b.addAdjacentes(c);
		d.addAdjacentes(b);
		a.addAdjacentes(e);
		f.addAdjacentes(c);
		f.addAdjacentes(h);
		e.addAdjacentes(f);
		f.addAdjacentes(g);
		a.addAdjacentes(h);

		List<No> nos = new ArrayList<No>();
		a.buscaProfundidade(nos);
		for(No no : nos){
			System.out.println(no);
		}
	}
}