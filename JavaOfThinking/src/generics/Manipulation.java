package generics;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-17 15:33
 **/

/**
 * 因为泛型擦除，编译器无法保证在方法maipulate()中一定能调用obj
 * 的f()方法这一需求，为了协助泛型类，给定了类的一个 边界，使用extends关键字指明泛型的边界
 * @param <T>
 */
class Manipulator<T extends HasF> {
    private T obj;

    Manipulator(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }

}

public class Manipulation<T> {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hf);
        manipulator.manipulate();
    }

}
