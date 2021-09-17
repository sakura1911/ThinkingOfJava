package generics;

import onjava.BasicSupplier;

import java.util.stream.Stream;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-17 10:49
 **/

public class BasicSupplierDemo {

    public static void main(String[] args) {
        Stream.generate(
                BasicSupplier.create(CountedObject.class))
                             .limit(5)
                             .forEach(System.out::println);
    }
}
