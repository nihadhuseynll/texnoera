package inheritance;

class PhysicalProduct extends Product {
    private double shippingCost;

    public PhysicalProduct(String name, double basePrice, double shippingCost) {
        super(name, basePrice);
        this.shippingCost = shippingCost;
    }

    @Override
    public double getFinalPrice() {
        return basePrice + shippingCost;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tip: Fiziki məhsul");
        System.out.println("Kargo: " + shippingCost + " AZN");
        System.out.println("Yekun Qiymət: " + getFinalPrice() + " AZN");
    }
}
