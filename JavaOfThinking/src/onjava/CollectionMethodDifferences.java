package onjava;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-17 11:29
 **/

public class CollectionMethodDifferences {

    static Set<String> methodSet(Class<?> type) {
        return Arrays.stream(type.getMethods())
                    .map(Method::getName)
                    .collect(Collectors.toCollection(TreeSet::new));
    }

    static void interfaces(Class<?> type) {
        System.out.println("Interfaces in" + type.getSimpleName() + ": ");
        System.out.println(Arrays.stream(type.getInterfaces())
                                    .map(Class::getSimpleName)
                                    .collect(Collectors.toList()));
    }

    static Set<String> object = methodSet(Object.class);

    static {
        object.add("clone");
    }

    static void difference(Class<?> superset, Class<?> subset) {
        System.out.println(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds:");
        Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superset);
    }

    public static void main(String[] args) {
        System.out.println("Collection: " + methodSet(Collections.class));
        interfaces(Collection.class);

    }
}
