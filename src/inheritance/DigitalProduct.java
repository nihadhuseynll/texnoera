package inheritance;

class DigitalProduct extends Product {

    public DigitalProduct(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double getFinalPrice() {
        return basePrice * 1.10;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tip: Rəqəmsal məhsul");
        System.out.println("Yekun Qiymət: " + getFinalPrice() + " AZN");
    }
}
