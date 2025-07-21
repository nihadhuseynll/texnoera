package encapsulation;

class Address {
    String city;
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public void printAddress() {
        System.out.println("Address: " + city + ", " + street);
    }
}
