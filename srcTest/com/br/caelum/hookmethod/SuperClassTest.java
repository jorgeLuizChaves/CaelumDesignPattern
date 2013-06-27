package com.br.caelum.hookmethod;


import org.junit.Assert;
import org.junit.Test;

public class SuperClassTest {

    @Test
    public void testClassAName() {
        SuperClass classA = new ClassA();
        Assert.assertEquals("ClassA", classA.writeYourClassName());

    }

    @Test
    public void testClassBName() {
        SuperClass classB = new ClassB();
        Assert.assertEquals("ClassB", classB.writeYourClassName());
    }

}
