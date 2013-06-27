package com.br.caelum.factorymethod;

public class ProductService extends AbstractService<Product> {

    private DAO<Product> dao;

    @Override
    public DAO<Product> getDAO() {
        if (dao == null) {
            return new ProductDAO();
        }
        return dao;
    }
}