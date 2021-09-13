package typeinfo.pets;

import java.util.Collections;
import java.util.*;

public class LiteralPetCreator extends PetCreator {

	// Collections unmodifiableList ����һ��list��ͼa���������list��ֻ����ͼb,������Ȼ��list
	// ֮���b����add��remove�ȸı������ݵĲ����ᵼ�±��벻ͨ��
	public static final List<Class<? extends Pet>> ALL_TYPES = 
			Collections.unmodifiableList(Arrays.asList(
					Pet.class, Dog.class, Cat.class, Rodent.class,
					Mutt.class, Pug.class, EgyptianMau.class,
					Manx.class, Cymric.class, Rat.class,
					Mouse.class, Hamster.class));
	
	// ���������������
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
