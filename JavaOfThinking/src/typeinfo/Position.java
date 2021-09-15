package typeinfo;

import java.util.Optional;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-15 17:36
 **/

class EmptyTitleException extends RuntimeException {

}

public class Position {

    private String title;
    private Person person;

    public Position(String jobTitle) {
        this(jobTitle, null);
    }

    public Position(String jobTitle, Person employee) {
        setTitle(jobTitle);
        setPerson(employee);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = Optional.ofNullable(title)
                .orElseThrow(EmptyTitleException::new);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = Optional.ofNullable(person)
                .orElse(new Person());
    }

    @Override
    public String toString() {
        return "Position: "+title + ", Employee: " + person;
    }

    public static void main(String[] args) {
        System.out.println(new Position("CEO"));
        System.out.println(new Position("Programmer",
                new Person("Arthur", "Fonzarelli")));
        try {
            new Position(null);
        } catch (Exception e) {
            System.out.println("caught" + e);
        }
    }
}
