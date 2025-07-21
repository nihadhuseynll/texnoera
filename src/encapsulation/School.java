package encapsulation;

class School {
    String name;
    Student[] students;
    int count = 0;

    public School(String name) {
        this.name = name;
        this.students = new Student[3];
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Cannot add more students.");
        }
    }

    public void printAllStudents() {
        System.out.println("School: " + name);
        for (int i = 0; i < count; i++) {
            students[i].printStudentInfo();
        }
    }
}
