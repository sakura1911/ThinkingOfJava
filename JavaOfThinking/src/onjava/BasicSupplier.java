package onjava;

import typeinfo.Person;

import java.util.function.Supplier;

/**
 * @program: ThinkingOfJava
 * @description:
 *  1. BasicSupplier在单独的包中，所以相关类必须有public权限，而不仅仅是包级访问权限
 *  2. 调用create()方法，并将生成的类型令牌传递给它
 *      BasicSupplier.create(MyType.class)
 *      new BasicSupplier<MyType>(MyType.class)
 * @author: Mr.Sakura
 * @create: 2021-09-16 17:57
 **/

public class BasicSupplier<T> implements Supplier<T> {

    private Class<T> type;

    public BasicSupplier(Class<T> type) {
        this.type = type;
    }

    @Override
    public T get() {
        try {
            return type.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Supplier<T> create(Class<T> type) {
        return new BasicSupplier<>(type);
    }

    public static void main(String[] args) {
        Supplier supplier = BasicSupplier.create(Person.class);
        BasicSupplier<Person> supplier1 = new BasicSupplier<Person>(Person.class);

    }
}
