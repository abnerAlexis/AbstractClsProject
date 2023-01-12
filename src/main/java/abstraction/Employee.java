package abstraction;

public class Employee extends Person{
    private int employeeId;

    public Employee(int employeeId, String name, String lastname, int age) {
        super(name, lastname, age);
        this.employeeId = employeeId;
    }

    @Override
    public void office() {
        if (employeeId == 0) {
            System.out.println("Employee logged out.");
        }
        System.out.println("Employee logged in.");
    }
}
