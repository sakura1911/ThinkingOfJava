package generics;

import java.util.ArrayList;

/**
 * @program: ThinkingOfJava
 * @description:
 *      ArrayList<String>和ArrayList<Integer>应该是不同的类型
 *      但下面的程序认为它们是相同的类型
 * @author: Mr.Sakura
 * @create: 2021-09-17 11:55
 **/

public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
