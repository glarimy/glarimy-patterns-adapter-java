package com.glarimy.adapter;

import java.io.FileReader;
import java.util.Properties;

public class AdapterFactory {
	public static Adapter getAdapter() throws Exception {
		Properties props = new Properties();
		props.load(new FileReader("adapter.properties"));
		String library = props.getProperty("library");
		if (library.equals("component"))
			return new ComponentAdapter();
		else if (library.equals("module"))
			return new ModuleAdapter();
		else
			throw new Exception("Adapter not found for the referenced library");
	}
}
