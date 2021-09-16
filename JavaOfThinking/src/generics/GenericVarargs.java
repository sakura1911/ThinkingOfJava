package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-16 17:52
 **/

public class GenericVarargs {

    // 注解保证不会对变长参数列表进行任何修改，只从中读取。
    @SafeVarargs
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = makeList("A");
        System.out.println(list);
        list = makeList("A", "B", "C");
        System.out.println(list);
        list = makeList("ABCDEFHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(list);
    }
}
