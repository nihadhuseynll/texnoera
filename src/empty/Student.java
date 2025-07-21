package empty;

public class Student {
    private String name;
    private CourseGrade[] grades = new CourseGrade[3];
    private int courseCount = 0;

    public Student(String name) {
        this.name = name;
    }

    public boolean addCourseGrade(Course course, int grade) {
        if (courseCount >= 3) {
            System.out.println(name + " artıq 3 kurs götürüb.");
            return false;
        }
        grades[courseCount++] = new CourseGrade(course, grade);
        return true;
    }

    public double calculateAverage() {
        if (courseCount == 0) return 0;

        int total = 0;
        for (int i = 0; i < courseCount; i++) {
            total += grades[i].getGrade();
        }
        return (double) total / courseCount;
    }

    public String getName() {
        return name;
    }

    public CourseGrade[] getGrades() {
        return grades;
    }

    public int getCourseCount() {
        return courseCount;
    }
}
