package typeinfo;

import java.util.function.Supplier;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-16 11:01
 **/

public class Operation {

    public final Supplier<String> description;
    public final Runnable command;

    public Operation(Supplier<String> description, Runnable cmd) {
        this.description = description;
        this.command = cmd;
    }
}
