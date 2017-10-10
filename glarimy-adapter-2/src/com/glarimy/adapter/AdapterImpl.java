package com.glarimy.adapter;

import some.one.elses.Module;

public class AdapterImpl implements Adapter {
	private Module module = new Module();

	@Override
	public void serve() {
		module.perform();
	}
}
