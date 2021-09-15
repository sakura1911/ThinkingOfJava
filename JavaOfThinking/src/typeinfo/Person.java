package typeinfo;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Optional;

/**
 * @program: ThinkingOfJava
 * @description: 数据传输对象
 *               所有字段都是public和final的，所有没有get、set方法
 *               Person是不可变的，只能通过构造器赋值，之后不能写，只能读
 *               如果想修改一个Person，只能用一个新的Person对象替换它
 *               empty 在对象创建时就被赋值，可以快速判断对象是否为空对象
 * @author: Mr.Sakura
 * @create: 2021-09-15 17:18
 **/

public class Person {

    public final Optional<String> first;
    public final Optional<String> last;
    public final Optional<String> address;

    public final Boolean empty;

    public Person(String first, String last, String address) {
        this.first = Optional.ofNullable(first);
        this.last = Optional.ofNullable(last);
        this.address = Optional.ofNullable(address);

        empty = !this.first.isPresent()
                && !this.last.isPresent()
                && !this.address.isPresent();
    }

    public Person(String first, String last) {
        this(first, last, null);
    }

    public Person(String last) {
        this(null, last, null);
    }

    public Person() {
        this(null, null, null);
    }

    @Override
    public String toString() {
        if (empty) {
            return "<Empty>";
        }
        return (first.orElse("") +
                " " + last.orElse("") +
                " " + address.orElse("")).trim();
    }

    public static void main(String[] args) {
        System.out.println(new Person());
        System.out.println(new Person("Smith"));
        System.out.println(new Person("Bob", "Smith"));
        System.out.println(new Person("Bob", "Smith",
                "11 Degree Lane, Frostbite Falls, MN"));
    }
}
