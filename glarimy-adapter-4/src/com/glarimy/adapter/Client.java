package com.glarimy.adapter;

public class Client {

	public static void main(String[] args) throws Exception {
		Adapter adapter = (Adapter) ObjectFactory.get("adapter");
		adapter.serve();
	}

}
