package com.br.caelum.factorymethod;

public class ProductService extends AbstractService<Product> {

    private Dao<Product> dao;

    @Override
    public Dao<Product> getDAO() {
        if (dao == null) {
            return new ProductDao();
        }
        return dao;
    }
}