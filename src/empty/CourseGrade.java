package empty;

public class CourseGrade {
    private Course course;
    private int grade;

    public CourseGrade(Course course, int grade) {
        this.course = course;
        setGrade(grade);
    }

    public Course getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }
}
