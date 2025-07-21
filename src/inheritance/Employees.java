package inheritance;

public class Employees { //super class

    private String name;
    private String salary;
    private String department;

    public Employees(String name, String salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void employeesInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public void changeDepartment(String newDepartment){
        System.out.println("change department");
        this.department = newDepartment;
        System.out.println("New Department: " + newDepartment);

    }
}
