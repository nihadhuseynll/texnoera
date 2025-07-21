package inheritance;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bonus: " + bonus + " AZN");
        System.out.println("Yekun maaş: " + getSalary() + " AZN");
    }
}
