package com.glarimy.adapter;

import java.io.FileReader;
import java.util.Properties;

public class ObjectFactory {
	public static Object get(String key) throws Exception {
		Properties props = new Properties();
		props.load(new FileReader("factory.properties"));
		String adapter = props.getProperty(key);
		return Class.forName(adapter).newInstance();
	}
}
