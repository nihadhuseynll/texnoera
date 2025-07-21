package inheritance;

public class Monitor {
    private String marka;
    private String color;

    public Monitor(String marka, String color) {
        this.marka = marka;
        this.color = color;
    }

    public void changeColor(String color) {
        this.color = color;
        System.out.println(color);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
