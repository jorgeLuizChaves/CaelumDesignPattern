package com.br.caelum.templatemethod;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        GeradorXMLCompactadoTest.class,
        GeradorPropriedadesCriptografadoTest.class
})
public class RunTests {
}