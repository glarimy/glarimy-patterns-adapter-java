package com.glarimy;

import some.ones.Component;

public class AdapterImpl implements Adapter {
	private Component component = new Component();

	@Override
	public void serve() {
		component.execute();

	}
}
