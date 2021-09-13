package typeinfo.pets;

import java.util.HashMap;

public class PetCount {
	
	static class Counter extends HashMap<String, Integer> {
		public void count(String type) {
			Integer quantity = get(type);
			if (quantity == null) {
				put(type, 1);
			} else {
				put(type, quantity + 1);
			}
		}
	}

	public static void countPets(PetCreator creator) {
		Counter counter = new Counter();
	}
	
}
