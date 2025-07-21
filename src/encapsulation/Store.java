package encapsulation;

class Store {
    private String name;
    private Product[] products;
    private int count;

    public Store(String name) {
        this.name = name;
        this.products = new Product[5];
        this.count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Məhsul əlavə etmək mümkün deyil! Limitə çatılıb.");
        }
    }

    public void printProducts() {
        System.out.println("Store: " + name);
        for (int i = 0; i < count; i++) {
            Product p = products[i];
            System.out.println();
            System.out.println("Product: " + p.getName());
            System.out.println("Original Price: " + p.getPrice());
            System.out.println("Discount Code: " + p.getDiscountCodeOrNone());
            System.out.println("Final Price: " + p.getFinalPrice());
        }
    }
}
