package typeinfo;

public class WildcardClassRegerences {
	
	public static void main(String[] args) {
		Class<?> intClass = int.class;
		intClass = double.class;
	}
}
