package com.glarimy.adapter;

import some.ones.Component;

public class ComponentAdapter implements Adapter {
	private Component target = new Component();

	@Override
	public void serve() {
		target.operate();
	}
}
