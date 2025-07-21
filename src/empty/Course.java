package empty;

public class Course {
    private String name;
    private String teacher;
    private static int totalCourses = 0;

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
        totalCourses++;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }
}
