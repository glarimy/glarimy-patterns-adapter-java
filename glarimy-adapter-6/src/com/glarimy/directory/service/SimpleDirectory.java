package com.glarimy.directory.service;

import com.glarimy.directory.api.CommonFactory;
import com.glarimy.directory.api.Directory;
import com.glarimy.directory.api.DirectoryException;
import com.glarimy.directory.api.NameNotFoundException;
import com.glarimy.directory.data.Store;
import com.glarimy.directory.data.StoreException;

public class SimpleDirectory implements Directory {
	private Store store = null;

	public SimpleDirectory() throws DirectoryException {
		try {
			store = (Store) CommonFactory.get("store");
			store.create("Krishna", 9731423166L);
		} catch (Exception e) {
			throw new DirectoryException();
		}
	}

	public long find(String name) throws DirectoryException {
		Long phoneNumber;
		try {
			phoneNumber = (Long) store.read(name);
			if (phoneNumber == null)
				throw new NameNotFoundException();
			return phoneNumber;
		} catch (StoreException e) {
			throw new DirectoryException();
		}
	}
}