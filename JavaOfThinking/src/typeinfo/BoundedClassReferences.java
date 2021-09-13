package typeinfo;

public class BoundedClassReferences {
	
	public static void main(String[] args) {
		Class<? extends Number> bouned = int.class;
		bouned = double.class;
		bouned = Number.class;
		// Or anything else derived from Number.
	}

}
