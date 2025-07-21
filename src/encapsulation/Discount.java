package encapsulation;

class Discount {
    private String code;
    private double percentage;

    public Discount(String code, double percentage) {
        this.code = code;
        setPercentage(percentage);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            System.out.println("Endirim 0 ilə 100 arasında olmalıdır!");
        }
    }
}