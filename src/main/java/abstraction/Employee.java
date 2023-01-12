package abstraction;

public class Employee extends Person{
    private int employeeId;

    public Employee(int employeeId, String name, String lastname, int age) {
        super(name, lastname, age);
        this.employeeId = employeeId;
    }

    @Override
    public String office() {
        if (employeeId == 0) {
            return "Employee logged out.";
        }
        return "Employee logged in.";
    }
}
