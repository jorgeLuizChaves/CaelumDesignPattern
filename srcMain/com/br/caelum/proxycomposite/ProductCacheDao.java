package com.br.caelum.proxycomposite;

import com.br.caelum.factorymethod.Dao;
import com.br.caelum.factorymethod.Product;

public class ProductCacheDao extends CacheDao<Product> {
	
	private Dao<Product> dao;

	@Override
	public void save(Product product) {
		dao.save(product);
		saveInCache(product);
	}

	@Override
	public void delete(Product product) {
		dao.delete(product);
		removeFromCache(product);
	}

	@Override
	public Product update(Product product) {
		removeFromCache(product);
		Product updatedProduct = dao.update(product);
		saveInCache(product);
		return updatedProduct;
	}

	@Override
	public Product getById(Product product) {
		if(isOnCache(product)){
			return cache.get(product);
		}
		Product resultProduct = dao.getById(product);
		saveInCache(resultProduct);
		return resultProduct;
	}
	
	private void saveInCache(Product product) {
		cache.put(product.getId(), product);
	}
}