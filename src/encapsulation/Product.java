package encapsulation;

class Product {
    private String name;
    private double price;
    private Discount discount;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.discount = null; // başlanğıcda endirim yox
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getFinalPrice() {
        if (discount != null) {
            double discountAmount = (price * discount.getPercentage()) / 100;
            return price - discountAmount;
        } else {
            return price;
        }
    }

    public String getDiscountCodeOrNone() {
        return (discount != null) ? discount.getCode() : "NONE";
    }
}
