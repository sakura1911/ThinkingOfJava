package typeinfo;

class Building {}
class House extends Building {}

public class ClassCasts {

	/**
	 * cast() 方法可以接受参数对象，并将其类型转换为Class引用类型
	 * @param args
	 */
	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House) b; // ...或者这样做
	}
	
}
