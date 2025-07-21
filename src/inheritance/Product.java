package inheritance;

class Product {
    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getFinalPrice() {
        return basePrice;
    }

    public void printInfo() {
        System.out.println("Məhsul: " + name);
        System.out.println("Əsas Qiymət: " + basePrice + " AZN");
    }
}
