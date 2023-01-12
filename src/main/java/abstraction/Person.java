package abstraction;

public abstract class Person {
    private String name;
    private String lastname;
    private int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public abstract void office();

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + " " +
            ", lastname='" + lastname + " " +
            ", age=" + age +
            '}';
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void changeLastname(String newLastname) {
        this.lastname = newLastname;
    }

    public void changeAge(int newAge) {
        this.age = newAge;
    }
}
