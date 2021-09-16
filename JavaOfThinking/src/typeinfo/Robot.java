package typeinfo;

import onjava.Null;

import java.util.List;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-16 10:47
 **/

public interface Robot {
    String name();
    String model();

    List<Operation> operations();

    static void test(Robot robot) {
        if (robot instanceof Null) {
            System.out.println("[Null Robot]");
        }
        System.out.println("Robot name: " + robot.name());
        System.out.println("Robot model：" + robot.model());
        for (Operation operation : robot.operations()) {
            System.out.println(operation.description.get());
            operation.command.run();
        }
    }
}
