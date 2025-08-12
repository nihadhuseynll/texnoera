package collections;

import java.util.Objects;

class Course {
    String name;
    int credits;
    int capacity;
    int enrolled;

    public Course(String name, int credits, int capacity) {
        this.name = name;
        this.credits = credits;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    @Override
    public String toString() {
        return name + " (" + credits + " credits, capacity: " + capacity + ", enrolled: " + enrolled + ")";
    }
}
