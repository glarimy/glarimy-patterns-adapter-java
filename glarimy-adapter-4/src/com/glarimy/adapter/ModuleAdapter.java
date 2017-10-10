package com.glarimy.adapter;

import some.one.elses.Module;

public class ModuleAdapter implements Adapter {
	private Module target = new Module();

	@Override
	public void serve() {
		target.execute();
	}
}
