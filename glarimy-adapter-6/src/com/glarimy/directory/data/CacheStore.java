package com.glarimy.directory.data;

import some.store.Cache;

public class CacheStore implements Store {
	private Cache cache = Cache.getInstance();

	@Override
	public void create(Object pk, Object entity) throws StoreException {
		try {
			cache.persist((String) pk, (Long) entity);
		} catch (Exception e) {
			throw new StoreException(e);
		}
	}

	@Override
	public Object read(Object pk) throws StoreException {
		try {
			return cache.fetch((String) pk);
		} catch (Exception e) {
			throw new StoreException(e);
		}
	}

}
