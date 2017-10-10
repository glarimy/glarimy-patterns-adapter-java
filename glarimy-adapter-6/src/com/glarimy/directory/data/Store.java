package com.glarimy.directory.data;

public interface Store {
	public void create(Object pk, Object entity) throws StoreException;

	public Object read(Object pk) throws StoreException;
}
