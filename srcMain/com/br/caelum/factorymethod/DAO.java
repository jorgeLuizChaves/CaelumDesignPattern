package com.br.caelum.factorymethod;

public interface DAO<T> {

    void save(T t);

    void delete(T t);

    T update(T t);

    T getById(T t);
}