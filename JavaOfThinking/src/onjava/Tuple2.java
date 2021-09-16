package onjava;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-16 17:26
 **/

public class Tuple2<A, B> {

    // 使用 public final而不是private，确保了只读属性
    public final A a1;
    public final B a2;

    public Tuple2(A a, B b) {
        a1 = a;
        a2 = b;
    }

    public String rep() {
        return a1 + ", " + a2;
    }

    @Override
    public String toString() {
        return "(" + rep() + ")";
    }
}
