package Testing;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent(new Student("Nihad", 20));
        school.addStudent(new Student("Aylin", 21));
        school.addStudent(new Student("Nihad", 20));

        school.printAllStudents();

        school.removeStudent(new Student("Aylin", 21));
        school.printAllStudents();
    }
}
