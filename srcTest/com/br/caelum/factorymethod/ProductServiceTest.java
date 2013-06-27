package com.br.caelum.factorymethod;

import org.junit.Before;
import org.junit.Test;

public class ProductServiceTest {

    private AbstractService<Product> service;

    @Before
    public void setup() {
        service = new ProductService();
    }

    @Test
    public void testSave() {
        Product product = new Product();
        product.setId(1);
        product.setName("xbox one");

        service.save(product);
    }

    @Test
    public void testDelete() {
        Product product = new Product();
        product.setId(1);

        service.delete(product);
    }

    @Test
    public void testUpdate() {
        Product product = new Product();
        product.setId(1);

        service.update(product);
    }


}