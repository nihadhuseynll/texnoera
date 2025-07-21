package methods;

public class Student {
    public String name;
    public int mathScore;
    public int englishScore;

    public double average() {;
        return (mathScore + englishScore) / 2.0;
    }

    public boolean hasPassed() {
        return average() > 50;
    }
}
