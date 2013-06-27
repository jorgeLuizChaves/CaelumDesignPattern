package com.br.caelum;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        com.br.caelum.state.RunTests.class,
        com.br.caelum.bridge.RunTests.class,
        com.br.caelum.strategy.RunTests.class,
        com.br.caelum.hookmethod.RunTests.class,
        com.br.caelum.nullobject.RunTests.class,
        com.br.caelum.factorymethod.RunTests.class,
        com.br.caelum.templatemethod.RunTests.class
})
public class RunAllTests {

}