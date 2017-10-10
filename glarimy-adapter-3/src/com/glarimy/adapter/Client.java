package com.glarimy.adapter;

public class Client {

	public static void main(String[] args) throws Exception{
		Adapter adapter = AdapterFactory.getAdapter();
		adapter.serve();
	}

}
