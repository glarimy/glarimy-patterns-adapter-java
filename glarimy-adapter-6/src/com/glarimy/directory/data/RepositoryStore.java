package com.glarimy.directory.data;

import some.other.store.Repository;

public class RepositoryStore implements Store {
	private Repository repo;

	public RepositoryStore() throws StoreException {
		try {
			repo = new Repository();
			repo.insert("Krishna", 9945500066L);
		} catch (Exception e) {
			throw new StoreException(e);
		}
	}

	@Override
	public void create(Object pk, Object entity) throws StoreException {
		try {
			repo.insert((String) pk, (Long) entity);
		} catch (Exception e) {
			throw new StoreException(e);
		}
	}

	@Override
	public Object read(Object pk) throws StoreException {
		try {
			return repo.select((String) pk);
		} catch (Exception e) {
			throw new StoreException(e);
		}
	}

}
