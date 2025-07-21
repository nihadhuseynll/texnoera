package Testing;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student newStudent) {
        boolean alreadyExists = false;

        for (Student s : students) {
            if (s.getName().equals(newStudent.getName()) && s.getAge() == newStudent.getAge()) {
                alreadyExists = true;
                break;
            }
        }

        if (alreadyExists) {
            System.out.println("Bu student artıq mövcuddur: " + newStudent);
        } else {
            students.add(newStudent);
            System.out.println("Student əlavə olundu: " + newStudent);
        }
    }

    public void removeStudent(Student target) {
        Student toRemove = null;

        for (Student s : students) {
            if (s.getName().equals(target.getName()) && s.getAge() == target.getAge()) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student silindi: " + toRemove);
        } else {
            System.out.println("Student tapılmadı: " + target);
        }
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Listdə student yoxdur.");
        } else {
            System.out.println("School-da olan bütün studentlər:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
