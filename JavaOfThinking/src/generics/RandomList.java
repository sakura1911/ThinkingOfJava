package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-16 17:41
 **/

public class RandomList<T> extends ArrayList<T> {
    private Random rand = new Random(47);

    public T select() {
        return get(rand.nextInt(size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        Arrays.stream("The quick brown fox jumped over the lazy brown dog".split(" ")).forEach(randomList :: add);
        IntStream.range(0, 11).forEach(i ->
                System.out.print(randomList.select() + " "));
    }
}
