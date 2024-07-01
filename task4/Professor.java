package finalexam.task4;

public class Professor {
    private String name;
    private String department;
    private String employeeNumber;

    public Professor(String name, String department, String employeeNumber) {
        this.name = name;
        this.department = department;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Professor [name=" + name + ", department=" + department + ", employeeNumber=" + employeeNumber + "]";
    }
}
