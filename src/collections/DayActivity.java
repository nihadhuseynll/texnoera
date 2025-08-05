package collections;

public enum DayActivity {
    MONDAY("Study Java"),
    TUESDAY("Go to Gym"),
    WEDNESDAY("Read a book"),
    THURSDAY("Practice coding"),
    FRIDAY("Watch a movie"),
    SATURDAY("Go hiking"),
    SUNDAY("Rest and relax");

    private final String activity;

    DayActivity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public static DayActivity fromString(String day) {
        if (day == null) return null;
        try {
            return DayActivity.valueOf(day.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
