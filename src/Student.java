public class Student extends Person {
    private int studentId;
    private String department;

    public Student(String name,int age, int studentId, String department) {
        super(name, age);
        this.studentId = studentId;
        this.department = department;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Id: " + studentId);
        System.out.println("Department: " + department);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
