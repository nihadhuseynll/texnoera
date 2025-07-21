package encapsulation;

class Student {
    String name;
    int grade;
    Address address;

    public Student(String name, int grade, Address address) {
        this.name = name;
        this.grade = grade;
        this.address = address;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        address.printAddress();
        System.out.println();
    }
}
