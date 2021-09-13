package typeinfo.pets;

import java.util.Collections;
import java.util.*;

public class LiteralPetCreator extends PetCreator {

	// Collections unmodifiableList 传入一个list视图a，返回这个list的只读视图b,类型依然是list
	// 之后对b进行add、remove等改变其内容的操作会导致编译不通过
	public static final List<Class<? extends Pet>> ALL_TYPES = 
			Collections.unmodifiableList(Arrays.asList(
					Pet.class, Dog.class, Cat.class, Rodent.class,
					Mutt.class, Pug.class, EgyptianMau.class,
					Manx.class, Cymric.class, Rat.class,
					Mouse.class, Hamster.class));
	
	// 用于随机创建类型
	private static final List<Class<? extends Pet>> TYPES = 
			ALL_TYPES.subList(ALL_TYPES.indexOf(Mutt.class), ALL_TYPES.size());
	
	
	@Override
	public List<Class<? extends Pet>> types() {
		return TYPES;
	}
	
	public static void main(String[] args) {
		System.out.println(TYPES);
	}

}
