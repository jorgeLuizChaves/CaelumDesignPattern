package com.br.caelum.factorymethod;

public abstract class AbstractService<T> {
	
	public abstract DAO<T> getDAO();
	
	public final void save(T t){
		getDAO().save(t);
	}
	
	public final void delete(T t){
		getDAO().delete(t);
	}
	
	public final T update(T t){
		return getDAO().update(t);
	}
	
	public final T getById(T t){
		return getDAO().getById(t);
	}
}