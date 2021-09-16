package generics;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-16 17:13
 **/

public class ObjectHolder {

    private Object a;
    public ObjectHolder(Object a) {
        this.a = a;
    }
    public void set(Object a) {
        this.a = a;
    }
    public Object get() {
        return a;
    }
    // ObjectHolder可以持有任何类型的对象
    // 下面的ObjectHolder分别持有了三种类型的对象
    public static void main(String[] args) {
        ObjectHolder h2 = new ObjectHolder(new Automobile());
        Automobile a = (Automobile)h2.get();
        h2.set("Not an Automobile");
        String s = (String)h2.get();
        h2.set(1);
        Integer x = (Integer)h2.get();
    }

}
