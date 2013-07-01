package com.br.caelum.proxycomposite;

import java.util.HashMap;
import java.util.Map;

import com.br.caelum.factorymethod.Dao;

public abstract class CacheDao<T> implements Dao<T>{

	protected Map<Integer, T> cache = new HashMap<Integer, T>();

	public boolean isOnCache(Object value) {
		return cache.containsValue(value);
	}

	public T removeFromCache(Object key) {
		return cache.remove(key);
	}
}