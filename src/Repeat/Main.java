package Repeat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);

        Dog dog = new Dog("Saul", "Red");
        System.out.println(dog);

        Inventory inventory = new Inventory(1, "FrameInventory");

        Product pr1 = new Product(1, "Salt");
        Product pr2 = new Product(2, "Cola");

        inventory.addProduct(pr1);
        inventory.addProduct(pr2);

        inventory.getProducts();

        System.out.println("We remove the product from the inventory: ");
        inventory.deleteProduct(pr1);
//        inventory.deleteProduct(pr2);

        inventory.getProducts();
    }
}
