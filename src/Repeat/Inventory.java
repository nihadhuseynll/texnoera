package Repeat;

public class Inventory {
    int inventoryId;
    String inventoryName;
    Product[] products;
    int count = 0;

    public Inventory(int inventoryId, String inventoryName) {
        this.inventoryId = inventoryId;
        this.inventoryName = inventoryName;
        products = new Product[10];
    }

    public void addProduct(Product product) {
        products[count] = product;
        count++;
    }

    public void deleteProduct(Product product) {
        Product[] elements = new Product[products.length - 1];
        int check = 0;
        for (int i = 0; i < count; i++) {
            if (products[i].productID != product.productID) {
                elements[check] = products[i];
                check++;
            }
        }
        products = elements;
        count--;
    }

    public void getProducts() {
        System.out.println("we show the products in the inventory: ");
        if(count == 0){
            System.out.println("Nothing found");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(products[i]);
        }
    }

}
