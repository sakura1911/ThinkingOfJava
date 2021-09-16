package generics;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-16 16:53
 **/

class Automobile {}

public class Holder1 {

    private Automobile a;
    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }

}
