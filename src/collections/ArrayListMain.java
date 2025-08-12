package collections;

import java.util.*;

public class ArrayListMain {


    public static void timeCalculate(String input, List<Integer> integerList) {

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            integerList.addFirst(i);
        }

        Long endTime = System.currentTimeMillis();

        System.out.println(input + " " + (endTime - startTime));
    }


    public static void main(String[] args) {

        Set<Course> selectedCourses = new HashSet<>();

        LinkedList<String> selectionHistory = new LinkedList<>();

        ArrayList<Course> waitlist = new ArrayList<>();

        Course math = new Course("Mathematics", 5, 2);
        Course physics = new Course("Physics", 4, 1);
        Course cs = new Course("Computer Science", 6, 3);

        registerCourse(selectedCourses, selectionHistory, waitlist, math);
        registerCourse(selectedCourses, selectionHistory, waitlist, physics);
        registerCourse(selectedCourses, selectionHistory, waitlist, math); // təkrar - HashSet qəbul etməyəcək
        registerCourse(selectedCourses, selectionHistory, waitlist, cs);
        registerCourse(selectedCourses, selectionHistory, waitlist, physics); // təkrar - gözləməyə gedəcək

        System.out.println("✅ Seçilmiş fənlər:");
        for (Course c : selectedCourses) {
            System.out.println(c);
        }

        System.out.println("\n📜 Seçim tarixçəsi:");
        for (String s : selectionHistory) {
            System.out.println(s);
        }

        System.out.println("\n⌛ Gözləmə siyahısı:");
        for (Course c : waitlist) {
            System.out.println(c);
        }
    }

    static void registerCourse(Set<Course> selectedCourses, LinkedList<String> history, ArrayList<Course> waitlist, Course course) {
        if (course.enrolled < course.capacity) {
            if (selectedCourses.add(course)) {
                course.enrolled++;
                history.add("Əlavə edildi: " + course.name);
                System.out.println(course.name + " uğurla əlavə edildi!");
            } else {
                System.out.println(course.name + " artıq seçilib!");
            }
        } else {
            waitlist.add(course);
            history.add("Gözləməyə əlavə edildi: " + course.name);
            System.out.println(course.name + " doludur, gözləmə siyahısına əlavə edildi.");
        }
    }
}