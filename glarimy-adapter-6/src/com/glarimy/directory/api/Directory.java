package com.glarimy.directory.api;

public interface Directory {
	public long find(String name) throws NameNotFoundException, DirectoryException;
}
