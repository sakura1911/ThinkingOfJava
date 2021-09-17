package generics;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-17 17:20
 **/

class GenericBase<T> {
    private T element;

    public T get() {
        return element;
    }

    public void set(T arg) {
        element = arg;
    }
}

public class ErasureAndInheritance {

}
