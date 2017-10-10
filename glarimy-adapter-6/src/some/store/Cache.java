package some.store;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	private Map<String, Long> entries;
	private static Cache instance;

	public static Cache getInstance() {
		if (instance == null)
			instance = new Cache();
		return instance;
	}

	private Cache() {
		entries = new HashMap<>();
		entries.put("Krishna", 9731423166L);
	}

	public long fetch(String name) {
		return entries.get(name);
	}
	
	public void persist(String name, long phoneNumber){
		entries.put(name, phoneNumber);
	}
}
