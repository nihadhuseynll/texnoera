package inheritance;

class Developer extends Employee {
    private int projectCount;

    public Developer(String name, double baseSalary, int projectCount) {
        super(name, baseSalary);
        this.projectCount = projectCount;
    }

    @Override
    public double getSalary() {
        return baseSalary + (projectCount * 100);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Layihə sayı: " + projectCount);
        System.out.println("Yekun maaş: " + getSalary() + " AZN");
    }
}
