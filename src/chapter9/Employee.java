package chapter9;

public class Employee extends Person {
    private int employeeId;
    private String title;

    public Employee(){
        super("angie");
        System.out.println("In Employee default constructor:");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
