package model;

public class Employee {
    private String employeeName;
    private Role employeeRole;
    private String employeeBranch;
    int salary;

     public Employee(String employeeName, Role employeeRole, String employeeBranch,int salary){
         this.employeeName=employeeName;
         this.employeeRole=employeeRole;
         this.employeeBranch=employeeBranch;
         this.salary=salary;
     }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Role getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(Role employeeRole) {
        this.employeeRole = employeeRole;
    }

    public String getEmployeeBranch() {
        return employeeBranch;
    }

    public void setEmployeeBranch(String employeeBranch) {
        this.employeeBranch = employeeBranch;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeRole=" + employeeRole +
                ", employeeBranch='" + employeeBranch + '\'' +
                ", salary=" + salary +
                '}';
    }
}
