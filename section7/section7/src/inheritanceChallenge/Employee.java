package inheritanceChallenge;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthday, long employeeId, String hireDate) {
        super(name, birthday);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
