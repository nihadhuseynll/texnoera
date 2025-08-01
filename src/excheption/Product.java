package excheption;

public class Product {
    String name;
    double price;

    public Product(String name, double price){
        if (name == null || name.isEmpty()) {
            throw new InvalidProductException("Product name cannot be empty.");
        }
        if (price <= 0) {
            throw new InvalidProductException("Product price must be greater than zero.");
        }
        this.name = name;
        this.price = price;
    }
}
